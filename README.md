# trip-searcher-api

### *flightSearch params*
https://tequila.kiwi.com/portal/docs/tequila_api/search_api

* ### apikey* - string(header)

* ### fly_from * - string(query)

Kiwi ID of the departure location. Usually it's the airport's IATA. It accepts multiple values separated by a comma. You can get the valid IDs using the Locations API. these IDs might be airport codes, city IDs, two letter country codes, metropolitan codes and radiuses as well as a subdivision, region, autonomous_territory, continent and specials (Points of interest, such as Times Square).

For example: 'LON' - checks every airport in London, 'LHR' - checks flights from London Heathrow, 'UK' - flights from the United Kingdom.

Some locations have the same code for airport and metropolis (city), e.g. DUS stands for metro code Duesseldorf, Moenchengladbach and Weeze as well as Duesseldorf airport. See the following examples:

'fly_from=city:DUS' will match all airports in "DUS", "MGL" and "NRN" (all in the city of Duesseldorf)
'fly_from=airport:DUS' will only match airport "DUS"
You can also search using a radius. It needs to be in form lat-lon-xkm. The number of decimal places for radius is limited to 6.  E.g.-23.24--47.86-500km for places around Sao Paulo.

Example : FRA

* ### fly_to - string(query)

Kiwi ID of the arrival location.  It accepts the same values in the same format as the 'fly_from' parameter

If you don’t include any value you’ll get aggregated results for destination airports relevant to the departure location.

Example : PRG

* ### date_from * - string(query)

departure date (dd/mm/yyyy). Use parameters date_from and date_to to define the range for the outbound flight departure.

For example, parameters 'date_from=01/04/2021' and 'date_to=03/04/2021' mean that the departure can be anytime between the specified dates, i.e. on 01/04, 02/04 or 03/04.

For the dates of the return flights, use the 'return_to' and 'return_from' or 'nights_in_dst_from' and 'nights_in_dst_to' parameters. If you are searching for a one-way flight, omit 'return_to' and 'return_from' or 'nights_in_dst_from' and 'nights_in_dst_to'.

Example : 01/04/2021

* ### date_to * - string (query)

departure date (dd/mm/yyyy). Use parameters date_from and date_to to define the range for the outbound flight departure.

Example : 03/04/2021

* ### return_from - string(query)

return date (dd/mm/yyyy). Use parameters return_from and return_to to define the range for the return flight departure.

Example : 04/04/2021

* ### return_to - string (query)

return date (dd/mm/yyyy). Use parameters return_from and return_to to define the range for the return flight departure.

Example : 06/04/2021

* ### nights_in_dst_from - integer (query)

the minimal length of stay in the destination given in the fly_to parameter.

Example : 2

* ### nights_in_dst_to - integer(query)

the maximal length of stay in the destination given in the fly_to parameter.

Either both parameters 'nights_in_dst_to' and 'nights_in_dst_from' have to be specified or none of them.

Example : 3

* ### max_fly_duration - integer(query)

max itinerary duration in hours, min value 0

Example : 20

* ### ret_from_diff_city - boolean(query)

Defines, whether or not to search for itineraries leaving from a different city than what is the customer's outbound destination. Set to true by default.

Example : true

* ### ret_to_diff_city - boolean(query)

Defines,whether or not to search for itineraries returning to a different city than the one from where the customer departed. Set to true by default.

Example : true

* ### one_for_city - integer(query)

It returns the cheapest flight to every city covered by the fly_to parameter. E.g. if you set it to 1 and your search is from PRG to LON/BUD/NYC, you'll get 3 results: the cheapest PRG-LON, the cheapest PRG-BUD, and the cheapest PRG-NYC. one_for_city and one_per_date query parameters work only on one-way requests.  In case you want to create Return Trip itinerary calendar, you need to request Outbound and Inbound segments separately.

Example : 0

* ### one_per_date - integer(query)

returns the cheapest flights for each date in the range defined by date_from and date_to. one_for_city and one_per_date query parameters work only on one-way requests.  In case you want to create Return Trip itinerary calendar, you need to request Outbound and Inbound segments separately.

Example : 0

* ### adults - integer (query)

Used to specify the number of adults. The default value is 1.  The sum of adults, children and infants cannot be greater than 9. Please note, that most of the ailines considers  children older than 12 as adults. The actual age thresholds will be listed in the check_flights response

Example : 2

* ### children - integer(query)

It specifies the number of children. The default value is 0. The sum of adults, children and the infants cannot be greater than 9. Please note, that most of the ailines considers  children older than 12 as adults. The actual age thresholds will be listed in the check_flights response.

Example : 2

* ### infants - integer(query)

Used to specify the number of infants.  The default value is 0.  The sum of adults, children and infants cannot be greater than 9.

* ### selected_cabins - string(query)

Specifies the preferred cabin class. Cabins can be: M (economy), W (economy premium), C (business), or F (first class). There can be only one selected cabin for one call. Cannot be used for ground (train, bus) content.

Example : C

* ### mix_with_cabins - string (query)

Allows the client to combine different cabin classes in their request. Cannot be used for ground (train, bus) content. If you use this param, you must use it together with selected_cabins. The results will then include itineraries combining the classes defined in selected_cabins and this param. mix_with_cabins class must be lower than the selected_cabins class. Itineraries consisting of more than one cabin class follow this rules:

The total time spent in higher class segments (GDS) of a single sector is at least 50% of the total sector's traveling time.

Any segment with traveling time longer than four hours (long-haul) is with the higher cabin class.

Example : M

* ### adult_hold_bag - string(query)

Number of adult hold bags separated by commas. The first number represents the number of bags for passenger 1, the second number is for passenger 2, etc. Can only contain up to two hold bags per passenger.

Example : 1,0

* ### adult_hand_bag - string(query)

Number of adult hand bags separated by commas. The first number represents the number of bags for passenger 1, the second number is for passenger 2 etc. Can only contain up to one hand bag per passenger.

Example : 1,1

* ### child_hold_bag - string(query)
Number of child hold bags separated by commas. The first number represents the number of bags for passenger 1, the second number is for passenger 2 etc. Can only contain up to two hold bags per passenger.

Example : 2,1

* ### child_hand_bag - string(query)
Number of child hand bags separated by commas. The first number represents the number of bags for passenger 1, the second number is for passenger 2 etc. Can only contain up to one hand bag per passenger.

Example : 1,1

* ### fly_days - string(query)
the list of week days for the flight, where 0 is Sunday, 1 is Monday, etc.

You can include more days than one, e.g. '&fly_days=0&fly_days=1&fly_days=2&...&fly_days=6'


* ### fly_days_type - string(query)
used to specify whether the fly_days day is for an arrival or a departure flight.

Available values : departure, arrival


* ### ret_fly_days - string(query)
the list of week days for the flight, where 0 is Sunday, 1 is Monday, etc.

URL encoded format for all days: '&ret_fly_days=0&ret_fly_days=1&ret_fly_days=2&...&ret_fly_days=6'


* ### ret_fly_days_type - string(query)
type of set ret_fly_days; It  is used to specify whether the flight is an arrival or a departure.

Available values : departure, arrival


* ### only_working_days - boolean(query)
search flights with departure only on working days.

Example : false


* ### only_weekends - boolean(query)
search flights with departure only on weekends.

Example : false


* ### partner_market - string(query)
The market of a particular country from which the request originates.
Use ISO 3166-1 alpha-2 to fill in the value.

Example : us


* ### curr - string(query)
use this parameter to change the currency in the response

Available values : AED, AFN, ALL, AMD, ANG, AOA, ARS, AUD, AWG, AZN, BAM, BBD, BDT, BGN, BHD, BIF, BMD, BND, BOB, BRL, BSD, BTC, BTN, BWP, BYN, BZD, CAD, CDF, CHF, CLF, CLP, CNY, COP, CRC, CUC, CUP, CVE, CZK, DJF, DKK, DOP, DZD, EEK, EGP, ERN, ETB, EUR, FJD, FKP, GBP, GEL, GGP, GHS, GIP, GMD, GNF, GTQ, GYD, HKD, HNL, HRK, HTG, HUF, IDR, ILS, IMP, INR, IQD, IRR, ISK, JEP, JMD, JOD, JPY, KES, KGS, KHR, KMF, KPW, KRW, KWD, KYD, KZT, LAK, LBP, LKR, LRD, LSL, LTL, LVL, LYD, MAD, MDL, MGA, MKD, MMK, MNT, MOP, MRO, MTL, MUR, MVR, MWK, MXN, MYR, MZN, NAD, NGN, NIO, NOK, NPR, NZD, OMR, PAB, PEN, PGK, PHP, PKR, PLN, PYG, QAR, QUN, RON, RSD, RUB, RWF, SAR, SBD, SCR, SDG, SEK, SGD, SHP, SLL, SOS, SRD, STD, SVC, SYP, SZL, THB, TJS, TMT, TND, TOP, TRY, TTD, TWD, TZS, UAH, UGX, USD, UYU, UZS, VEF, VND, VUV, WST, XAF, XCD, XOF, XPF, YER, ZAR, ZMK, ZMW, ZWL


* ### locale - string(query)
the language of city names in the response and also language of kiwi.com website to which deep_links lead

Available values : ae, ag, ar, at, au, be, bg, bh, br, by, ca, ca-fr, ch, cl, cn, co, ct, cz, da, de, dk, ec, ee, el, en, es, fi, fr, gb, gr, hk, hr, hu, id, ie, il, in, is, it, ja, jo, jp, ko, kr, kw, kz, lt, mx, my, nl, no, nz, om, pe, ph, pl, pt, qa, ro, rs, ru, sa, se, sg, sk, sr, sv, th, tr, tw, ua, uk, us, vn, za


* ### price_from - integer(query)
result filter, minimal price


* ### price_to - integer(query)
result filter, maximal price


* ### dtime_from - string(query)
result filter, min. departure time (use only time in whole hours, not minutes; 11:00 means 11AM, 23:00 means 11PM).


* ### dtime_to - string(query)
result filter, max departure time (use only time in whole hours, not minutes; 11:00 means 11AM, 23:00 means 11PM).


* ### atime_from - string(query)
result filter, min arrival time (use only time in whole hours, not minutes; 11:00 means 11AM, 23:00 means 11PM).


* ### atime_to - string(query)
result filter, max arrival time (use only time in whole hours, not minutes; 11:00 means 11AM, 23:00 means 11PM).


* ### ret_dtime_from - string(query)
result filter, min dep. time of the returning flight (use only time in whole hours, not minutes; 11:00 means 11AM, 23:00 means 11PM).


* ### ret_dtime_to - string(query)
result filter, max dep. time of the returning flight (use only time in whole hours, not minutes; 11:00 means 11AM, 23:00 means 11PM).


* ### ret_atime_from - string(query)
result filter, min arrival time of the returning flight (use only time in whole hours, not minutes; 11:00 means 11AM, 23:00 means 11PM).


* ### ret_atime_to - string(query)
result filter, min arrival time of the returning flight (use only time in whole hours, not minutes; 11:00 means 11AM, 23:00 means 11PM).


* ### stopover_from - string(query)
result filter, min length of stopover, 48:00 means 2 days (48 hours)


* ### stopover_to - string(query)
result filter, max length of stopover, 48:00 means 2 days (48 hours)


* ### max_stopovers - integer(query)
max number of stopovers per the entire itinerary (outbound + return).  Use 'max_stopovers=0' for direct flights only.

Example : 2


* ### max_sector_stopovers - integer(query)
max number of stopovers per itinerary's sector.

Example : 2


* ### conn_on_diff_airport - integer(query)
whether or not to search for connections requiring an airport change, can be set to 0 or 1. The param is disabled for all non-Affiliate solutions. Follow FAQ "Itineraries with connection on different airport" for more details


* ### ret_from_diff_airport - integer(query)
whether or not to search for flights leaving from a different airport than where the customer landed, can be set to 0 or 1, 1 is default


* ### ret_to_diff_airport - integer(query)
whether or not to search for flights returning to a different airport than the one from where the customer departed, can be set to 0 or 1, 1 is default


* ### select_airlines - string (query)
a list of airlines (IATA codes) separated commas that should / should not be included in the search.

The selection or omission of the airlines depends on the 'select_airlines_exclude' parameter.

Select a list of airlines and use the 'select_airlines_exclude' parameter to specify whether or not the selected airlines should be excluded/included in the search.


* ### select_airlines_exclude - boolean(query)
a switch for the selected_airlines parameter where 'False=select' and 'True=omit'.

If set to true, the search returns combinations without the airlines specified in the parent parameter selected_airlines.

If set to false, the search returns combinations operated only by the selected airlines.


* ### select_stop_airport - string(query)
a list of stopover airports (IATA codes) separated by commas that should / should not be included.

The selection or omission of the airport depends on the 'select_stop_airport_exclude' parameter.


* ### select_stop_airport_exclude - boolean(query)
A switch for the 'select_stop_airport' parameter where 'False=include' and 'True=omit'.

If set to true the search returns combinations where a stopover is through one of the given airports.

If is set to false the search returns combinations where none of stopovers is through any of the given airports.


* ### vehicle_type - string(query)
this parameter allows you to specify the vehicle type. The options are aircraft (default), bus, train.

Example : aircraft


* ### enable_vi - boolean(query)
if set to false, this param will exclude all virtually interlined content. If set to true, the default results will be returned (with both virtually interlined content and not-virtually interlined content). It cannot be used to request only virtually inerlined content. Default value is true.


* ### sort - string(query)
sorts the results by quality, price, date or duration. Price is the default value.

Available values : price, duration, quality, date


* ### limit - integer(query)
limit number of results; the default value is 200; max is 1000

Example : 500
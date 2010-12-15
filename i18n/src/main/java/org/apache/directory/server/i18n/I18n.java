/*
 *   Licensed to the Apache Software Foundation (ASF) under one
 *   or more contributor license agreements.  See the NOTICE file
 *   distributed with this work for additional information
 *   regarding copyright ownership.  The ASF licenses this file
 *   to you under the Apache License, Version 2.0 (the
 *   "License"); you may not use this file except in compliance
 *   with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 *
 */

package org.apache.directory.server.i18n;


import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;


/**
 * Provides i18n handling of error codes.
 * About formatting see also {@link MessageFormat}
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public enum I18n
{
    ERR_1("ERR_1"),
    ERR_2("ERR_2"),
    ERR_3("ERR_3"),
    ERR_4("ERR_4"),
    ERR_5("ERR_5"),
    ERR_6("ERR_6"),
    ERR_7("ERR_7"),
    ERR_8("ERR_8"),
    ERR_9("ERR_9"),
    ERR_10("ERR_10"),
    ERR_11("ERR_11"),
    ERR_12("ERR_12"),
    ERR_13("ERR_13"),
    ERR_14("ERR_14"),
    ERR_15("ERR_15"),
    ERR_16("ERR_16"),
    ERR_17("ERR_17"),
    ERR_18("ERR_18"),
    ERR_19("ERR_19"),
    ERR_20("ERR_20"),
    ERR_21("ERR_21"),
    ERR_22("ERR_22"),
    ERR_23("ERR_23"),
    ERR_24("ERR_24"),
    ERR_25("ERR_25"),
    ERR_26("ERR_26"),
    ERR_27("ERR_27"),
    ERR_28("ERR_28"),
    ERR_29("ERR_29"),
    ERR_30("ERR_30"),
    ERR_31("ERR_31"),
    ERR_32("ERR_32"),
    ERR_33("ERR_33"),
    ERR_34("ERR_34"),
    ERR_35("ERR_35"),
    ERR_36("ERR_36"),
    ERR_37("ERR_37"),
    ERR_38("ERR_38"),
    ERR_39("ERR_39"),
    ERR_40("ERR_40"),
    ERR_41("ERR_41"),
    ERR_42("ERR_42"),
    ERR_43("ERR_43"),
    ERR_44("ERR_44"),
    // ERR_45( "ERR_45" ),
    // ERR_46( "ERR_46" ),
    ERR_47("ERR_47"),
    ERR_48("ERR_48"),
    ERR_49("ERR_49"),
    ERR_50("ERR_50"),
    ERR_51("ERR_51"),
    ERR_52("ERR_52"),
    ERR_53("ERR_53"),
    ERR_54("ERR_54"),
    ERR_55("ERR_55"),
    ERR_56("ERR_56"),
    ERR_57("ERR_57"),
    ERR_58("ERR_58"),
    ERR_59("ERR_59"),
    ERR_60("ERR_60"),
    ERR_61("ERR_61"),
    ERR_62("ERR_62"),
    ERR_63("ERR_63"),
    ERR_64("ERR_64"),
    ERR_65("ERR_65"),
    ERR_66("ERR_66"),
    // ERR_67( "ERR_67" ),
    ERR_68("ERR_68"),
    ERR_69("ERR_69"),
    ERR_70("ERR_70"),
    ERR_71("ERR_71"),
    ERR_72("ERR_72"),
    ERR_73("ERR_73"),
    ERR_74("ERR_74"),
    ERR_75("ERR_75"),
    ERR_76("ERR_76"),
    ERR_77("ERR_77"),
    ERR_78("ERR_78"),
    ERR_79("ERR_79"),
    ERR_80("ERR_80"),
    ERR_81("ERR_81"),
    ERR_82("ERR_82"),
    ERR_83("ERR_83"),
    ERR_84("ERR_84"),
    ERR_85("ERR_85"),
    ERR_86("ERR_86"),
    ERR_87("ERR_87"),
    ERR_88("ERR_88"),
    ERR_89("ERR_89"),
    ERR_90("ERR_90"),
    ERR_91("ERR_91"),
    // ERR_92( "ERR_92" ),
    // ERR_93( "ERR_93" ),
    // ERR_94( "ERR_94" ),
    // ERR_95( "ERR_95" ),
    // ERR_96( "ERR_96" ),
    // ERR_97( "ERR_97" ),
    // ERR_98( "ERR_98" ),
    // ERR_99( "ERR_99" ),
    // ERR_100( "ERR_100" ),
    // ERR_101( "ERR_101" ),
    // ERR_102( "ERR_102" ),
    // ERR_103( "ERR_103" ),
    // ERR_104( "ERR_104" ),
    // ERR_105( "ERR_105" ),
    // ERR_106( "ERR_106" ),
    // ERR_107( "ERR_107" ),
    // ERR_108( "ERR_108" ),
    // ERR_109( "ERR_109" ),
    // ERR_110( "ERR_110" ),
    // ERR_111( "ERR_111" ),
    // ERR_112( "ERR_112" ),
    // ERR_113( "ERR_113" ),
    // ERR_114( "ERR_ 114" ),
    ERR_115("ERR_115"),
    ERR_116("ERR_116"),
    ERR_117("ERR_117"),
    ERR_118("ERR_118"),
    ERR_119("ERR_119"),
    ERR_120("ERR_120"),
    ERR_121("ERR_121"),
    ERR_122("ERR_122"),
    // ERR_123( "ERR_123" ),
    ERR_124("ERR_124"),
    ERR_125("ERR_125"),
    ERR_126("ERR_126"),
    ERR_127("ERR_127"),
    ERR_128("ERR_128"),
    // ERR_129( "ERR_129" ),
    // ERR_130( "ERR_130" ),
    ERR_131("ERR_131"),
    ERR_132("ERR_132"),
    ERR_133("ERR_133"),
    ERR_134("ERR_134"),
    ERR_135("ERR_135"),
    ERR_136("ERR_136"),
    ERR_137("ERR_137"),
    ERR_138("ERR_138"),
    ERR_139("ERR_139"),
    ERR_140("ERR_140"),
    ERR_141("ERR_141"),
    ERR_142("ERR_142"),
    ERR_143("ERR_143"),
    ERR_144("ERR_144"),
    ERR_145("ERR_145"),
    ERR_146("ERR_146"),
    ERR_147("ERR_147"),
    ERR_148("ERR_148"),
    ERR_149("ERR_149"),
    ERR_150("ERR_150"),
    ERR_151("ERR_151"),
    ERR_152("ERR_152"),
    ERR_153("ERR_153"),
    ERR_154("ERR_154"),
    ERR_155("ERR_155"),
    ERR_156("ERR_156"),
    ERR_157("ERR_157"),
    ERR_158("ERR_158"),
    ERR_159("ERR_159"),
    ERR_160("ERR_160"),
    ERR_161("ERR_161"),
    ERR_162("ERR_162"),
    ERR_163("ERR_163"),
    ERR_164("ERR_164"),
    ERR_165("ERR_165"),
    ERR_166("ERR_166"),
    ERR_167("ERR_167"),
    ERR_168("ERR_168"),
    ERR_169("ERR_169"),
    ERR_170("ERR_170"),
    ERR_171("ERR_171"),
    ERR_172("ERR_172"),
    ERR_173("ERR_173"),
    ERR_174("ERR_174"),
    ERR_175("ERR_175"),
    ERR_176("ERR_176"),
    ERR_177("ERR_177"),
    ERR_178("ERR_178"),
    ERR_179("ERR_179"),
    ERR_180("ERR_180"),
    ERR_181("ERR_181"),
    ERR_182("ERR_182"),
    ERR_183("ERR_183"),
    ERR_184("ERR_184"),
    ERR_185("ERR_185"),
    ERR_186("ERR_186"),
    ERR_187("ERR_187"),
    ERR_188("ERR_188"),
    ERR_189("ERR_189"),
    ERR_190("ERR_190"),
    ERR_191("ERR_191"),
    ERR_192("ERR_192"),
    ERR_193("ERR_193"),
    ERR_194("ERR_194"),
    ERR_195("ERR_195"),
    ERR_196("ERR_196"),
    ERR_197("ERR_197"),
    ERR_198("ERR_198"),
    ERR_199("ERR_199"),
    ERR_200("ERR_200"),
    ERR_201("ERR_201"),
    ERR_202("ERR_202"),
    ERR_203("ERR_203"),
    ERR_204("ERR_204"),
    ERR_205("ERR_205"),
    ERR_206("ERR_206"),
    ERR_207("ERR_207"),
    ERR_208("ERR_208"),
    ERR_209("ERR_209"),
    ERR_210("ERR_210"),
    ERR_211("ERR_211"),
    ERR_212("ERR_212"),
    ERR_213("ERR_213"),
    ERR_214("ERR_214"),
    ERR_215("ERR_215"),
    ERR_216("ERR_216"),
    ERR_217("ERR_217"),
    ERR_218("ERR_218"),
    ERR_219("ERR_219"),
    ERR_220("ERR_220"),
    ERR_221("ERR_221"),
    ERR_222("ERR_222"),
    ERR_223("ERR_223"),
    ERR_224("ERR_224"),
    ERR_225("ERR_225"),
    ERR_226("ERR_226"),
    ERR_227("ERR_227"),
    ERR_228("ERR_228"),
    ERR_229("ERR_229"),
    ERR_230("ERR_230"),
    ERR_231("ERR_231"),
    ERR_232("ERR_232"),
    ERR_233("ERR_233"),
    ERR_234("ERR_234"),
    ERR_235("ERR_235"),
    ERR_236("ERR_236"),
    ERR_237("ERR_237"),
    ERR_238("ERR_238"),
    ERR_239("ERR_239"),
    ERR_240("ERR_240"),
    ERR_241_CANNOT_STORE_COLLECTIVE_ATT_IN_ENTRY("ERR_241_CANNOT_STORE_COLLECTIVE_ATT_IN_ENTRY"),
    ERR_242("ERR_242"),
    ERR_243("ERR_243"),
    ERR_244("ERR_244"),
    ERR_245("ERR_245"),
    ERR_246("ERR_246"),
    ERR_247("ERR_247"),
    ERR_248("ERR_248"),
    ERR_249("ERR_249"),
    ERR_250_ENTRY_ALREADY_EXISTS("ERR_250_ENTRY_ALREADY_EXISTS"),
    ERR_251_PARENT_NOT_FOUND("ERR_251_PARENT_NOT_FOUND"),
    ERR_252("ERR_252"),
    ERR_253("ERR_253"),
    ERR_254_ADD_EXISTING_VALUE("ERR_254_ADD_EXISTING_VALUE"),
    ERR_255("ERR_255"),
    ERR_256_NO_SUCH_OBJECT("ERR_256_NO_SUCH_OBJECT"),
    ERR_257_COLLECTIVE_SUBENTRY_WITHOUT_COLLECTIVE_AT("ERR_257_COLLECTIVE_SUBENTRY_WITHOUT_COLLECTIVE_AT"),
    ERR_258("ERR_258"),
    ERR_259("ERR_259"),
    ERR_260("ERR_260"),
    ERR_261("ERR_261"),
    ERR_262("ERR_262"),
    ERR_263("ERR_263"),
    ERR_264("ERR_264"),
    ERR_265("ERR_265"),
    ERR_266("ERR_266"),
    ERR_267("ERR_267"),
    ERR_268("ERR_268"),
    ERR_269("ERR_269"),
    ERR_270("ERR_270"),
    ERR_271("ERR_271"),
    ERR_272_MODIFY_LEAVES_NO_STRUCTURAL_OBJECT_CLASS("ERR_272_MODIFY_LEAVES_NO_STRUCTURAL_OBJECT_CLASS"),
    ERR_273("ERR_273"),
    ERR_274("ERR_274"),
    ERR_275("ERR_275"),
    ERR_276("ERR_276"),
    ERR_277("ERR_277"),
    ERR_278("ERR_278"),
    ERR_279("ERR_279"),
    ERR_280("ERR_280"),
    ERR_281("ERR_281"),
    ERR_282("ERR_282"),
    ERR_283("ERR_283"),
    ERR_284("ERR_284"),
    ERR_285("ERR_285"),
    ERR_286("ERR_286"),
    ERR_287("ERR_287"),
    ERR_288("ERR_288"),
    ERR_289("ERR_289"),
    ERR_290("ERR_290"),
    ERR_291("ERR_291"),
    ERR_292("ERR_292"),
    ERR_293("ERR_293"),
    ERR_294("ERR_294"),
    ERR_295("ERR_295"),
    ERR_296("ERR_296"),
    ERR_297("ERR_297"),
    // ERR_298( "ERR_298" ),
    // ERR_299( "ERR_299" ),
    // ERR_300( "ERR_300" ),
    ERR_301("ERR_301"),
    ERR_302("ERR_302"),
    ERR_303("ERR_303"),
    ERR_304("ERR_304"),
    ERR_305("ERR_305"),
    ERR_306("ERR_306"),
    ERR_307("ERR_307"),
    ERR_308("ERR_308"),
    ERR_309("ERR_309"),
    ERR_310("ERR_310"),
    ERR_311("ERR_311"),
    ERR_312("ERR_312"),
    ERR_313("ERR_313"),
    ERR_314("ERR_314"),
    ERR_315("ERR_315"),
    ERR_316("ERR_316"),
    ERR_317("ERR_317"),
    // ERR_318( "ERR_318" ),
    ERR_319("ERR_319"),
    ERR_320("ERR_320"),
    ERR_321("ERR_321"),
    ERR_322("ERR_322"),
    ERR_323("ERR_323"),
    ERR_324("ERR_324"),
    ERR_325("ERR_325"),
    ERR_326_NEW_SUPERIROR_CANNOT_BE_NULL("ERR_326_NEW_SUPERIROR_CANNOT_BE_NULL"),
    ERR_327_MOVE_AND_RENAME_OPERATION("ERR_327_MOVE_AND_RENAME_OPERATION"),
    ERR_328("ERR_328"),
    ERR_329("ERR_329"),
    ERR_330("ERR_330"),
    ERR_331("ERR_331"),
    ERR_332("ERR_332"),
    ERR_333("ERR_333"),
    // ERR_334( "ERR_334" ),
    ERR_335("ERR_335"),
    ERR_336("ERR_336"),
    ERR_337("ERR_337"),
    ERR_338("ERR_338"),
    ERR_339("ERR_339"),
    // ERR_340( "ERR_340" ),
    ERR_341("ERR_341"),
    ERR_342("ERR_342"),
    ERR_343("ERR_343"),
    // ERR_344( "ERR_344" ),
    ERR_345("ERR_345"),
    ERR_346("ERR_346"),
    ERR_347("ERR_347"),
    ERR_348("ERR_348"),
    ERR_349("ERR_349"),
    ERR_350("ERR_350"),
    ERR_351("ERR_351"),
    ERR_352("ERR_352"),
    ERR_353("ERR_353"),
    ERR_354("ERR_354"),
    ERR_355("ERR_355"),
    // ERR_356( "ERR_356" ),
    ERR_357("ERR_357"),
    ERR_358("ERR_358"),
    ERR_359("ERR_359"),
    ERR_360("ERR_360"),
    ERR_361("ERR_361"),
    ERR_362("ERR_362"),
    ERR_363("ERR_363"),
    ERR_364("ERR_364"),
    ERR_365("ERR_365"),
    ERR_366("ERR_366"),
    ERR_367("ERR_367"),
    ERR_368("ERR_368"),
    ERR_369("ERR_369"),
    ERR_370("ERR_370"),
    ERR_371("ERR_371"),
    ERR_372("ERR_372"),
    ERR_373("ERR_373"),
    ERR_374("ERR_374"),
    ERR_375("ERR_375"),
    ERR_376("ERR_376"),
    ERR_377("ERR_377"),
    ERR_378("ERR_378"),
    ERR_379("ERR_379"),
    ERR_380("ERR_380"),
    ERR_381("ERR_381"),
    ERR_382("ERR_382"),
    ERR_383("ERR_383"),
    ERR_384("ERR_384"),
    ERR_385("ERR_385"),
    ERR_386("ERR_386"),
    ERR_387("ERR_387"),
    // ERR_388( "ERR_388" ),
    ERR_389("ERR_389"),
    ERR_390("ERR_390"),
    ERR_391("ERR_391"),
    // ERR_392( "ERR_392" ),
    ERR_393("ERR_393"),
    // ERR_394( "ERR_394" ),
    // ERR_395( "ERR_395" ),
    ERR_396("ERR_396"),
    ERR_397("ERR_397"),
    // ERR_398( "ERR_398" ),
    ERR_399("ERR_399"),
    ERR_400("ERR_400"),
    ERR_401("ERR_401"),
    ERR_402("ERR_402"),
    ERR_403("ERR_403"),
    // ERR_404( "ERR_404" ),
    ERR_405("ERR_405"),
    ERR_406("ERR_406"),
    ERR_407("ERR_407"),
    ERR_408("ERR_408"),
    ERR_409("ERR_409"),
    ERR_410("ERR_410"),
    ERR_411("ERR_411"),
    ERR_412("ERR_412"),
    ERR_413("ERR_413"),
    ERR_414("ERR_414"),
    ERR_415("ERR_415"),
    ERR_416("ERR_416"),
    ERR_417("ERR_417"),
    ERR_418("ERR_418"),
    ERR_419("ERR_419"),
    ERR_420("ERR_420"),
    ERR_421("ERR_421"),
    ERR_422("ERR_422"),
    ERR_423("ERR_423"),
    ERR_424("ERR_424"),
    ERR_425("ERR_425"),
    ERR_426("ERR_426"),
    ERR_427("ERR_427"),
    ERR_428("ERR_428"),
    ERR_429("ERR_429"),
    ERR_430("ERR_430"),
    ERR_431("ERR_431"),
    ERR_432("ERR_432"),
    ERR_433("ERR_433"),
    ERR_434("ERR_434"),
    ERR_435("ERR_435"),
    ERR_436("ERR_436"),
    ERR_437("ERR_437"),
    ERR_438("ERR_438"),
    ERR_439("ERR_439"),
    ERR_440("ERR_440"),
    ERR_441("ERR_441"),
    // ERR_442( "ERR_442" ),
    ERR_443("ERR_443"),
    ERR_444("ERR_444"),
    ERR_445("ERR_445"),
    ERR_446("ERR_446"),
    ERR_447("ERR_447"),
    ERR_448("ERR_448"),
    ERR_449("ERR_449"),
    ERR_450("ERR_450"),
    ERR_451("ERR_451"),
    ERR_452("ERR_452"),
    ERR_453("ERR_453"),
    ERR_454("ERR_454"),
    ERR_455("ERR_455"),
    ERR_456("ERR_456"),
    // ERR_457( "ERR_457" ),
    // ERR_458( "ERR_458" ),
    // ERR_459( "ERR_459" ),
    // ERR_460( "ERR_460" ),
    // ERR_461( "ERR_461" ),
    // ERR_462( "ERR_462" ),
    // ERR_463( "ERR_463" ),
    ERR_464("ERR_464"),
    ERR_465("ERR_465"),
    ERR_466("ERR_466"),
    ERR_467("ERR_467"),
    ERR_468("ERR_468"),
    // ERR_469( "ERR_469" ),
    // ERR_470( "ERR_470" ),
    // ERR_471( "ERR_471" ),
    ERR_472("ERR_472"),
    ERR_473("ERR_473"),
    ERR_474("ERR_474"),
    ERR_475("ERR_475"),
    ERR_476("ERR_476"),
    ERR_477("ERR_477"),
    ERR_478("ERR_478"),
    ERR_479("ERR_479"),
    ERR_480("ERR_480"),
    ERR_481("ERR_481"),
    ERR_482("ERR_482"),
    ERR_483("ERR_483"),
    ERR_484("ERR_484"),
    ERR_485("ERR_485"),
    // ERR_486( "ERR_486" ),
    ERR_487("ERR_487"),
    // ERR_488( "ERR_488" ),
    ERR_489("ERR_489"),
    ERR_490("ERR_490"),
    ERR_491("ERR_491"),
    ERR_492("ERR_492"),
    ERR_493("ERR_493"),
    ERR_494("ERR_494"),
    ERR_495("ERR_495"),
    // ERR_496( "ERR_496" ),
    ERR_497("ERR_497"),
    ERR_498("ERR_498"),
    ERR_499("ERR_499"),
    ERR_500("ERR_500"),
    ERR_501("ERR_501"),
    // ERR_502( "ERR_502" ),
    ERR_503("ERR_503"),
    ERR_504("ERR_504"),
    ERR_505("ERR_505"),
    ERR_506("ERR_506"),
    ERR_507("ERR_507"),
    ERR_508("ERR_508"),
    ERR_509("ERR_509"),
    ERR_510("ERR_510"),
    ERR_511("ERR_511"),
    ERR_512("ERR_512"),
    ERR_513("ERR_513"),
    ERR_514("ERR_514"),
    ERR_515("ERR_515"),
    ERR_516("ERR_516"),
    ERR_517("ERR_517"),
    ERR_518("ERR_518"),
    ERR_519("ERR_519"),
    // ERR_520("ERR_520"),
    // ERR_521("ERR_521"),
    ERR_522("ERR_522"),
    ERR_523("ERR_523"),
    ERR_524("ERR_524"),
    ERR_525("ERR_525"),
    ERR_526("ERR_526"),
    ERR_527("ERR_527"),
    ERR_528("ERR_528"),
    ERR_529("ERR_529"),
    // ERR_530( "ERR_530" ),
    ERR_531("ERR_531"),
    ERR_532("ERR_532"),
    ERR_533("ERR_533"),
    ERR_534("ERR_534"),
    ERR_535("ERR_535"),
    ERR_536("ERR_536"),
    ERR_537("ERR_537"),
    ERR_538("ERR_538"),
    ERR_539_BAD_BLOCK_ID("ERR_539_BAD_BLOCK_ID"),
    ERR_540("ERR_540"),
    ERR_541("ERR_541"),
    ERR_542("ERR_542"),
    ERR_543("ERR_543"),
    ERR_544("ERR_544"),
    ERR_545("ERR_545"),
    ERR_546("ERR_546"),
    ERR_547("ERR_547"),
    ERR_548("ERR_548"),
    ERR_549("ERR_549"),
    ERR_550("ERR_550"),
    ERR_551("ERR_551"),
    ERR_552("ERR_552"),
    ERR_553("ERR_553"),
    ERR_554("ERR_554"),
    ERR_555("ERR_555"),
    ERR_556("ERR_556"),
    ERR_557("ERR_557"),
    ERR_558("ERR_558"),
    ERR_559("ERR_559"),
    ERR_560("ERR_560"),
    ERR_561("ERR_561"),
    ERR_562("ERR_562"),
    ERR_563("ERR_563"),
    ERR_564("ERR_564"),
    ERR_565("ERR_565"),
    ERR_566("ERR_566"),
    ERR_567("ERR_567"),
    ERR_568("ERR_568"),
    ERR_569("ERR_569"),
    ERR_570("ERR_570"),
    ERR_571("ERR_571"),
    ERR_572("ERR_572"),
    ERR_573("ERR_573"),
    ERR_574("ERR_574"),
    ERR_575("ERR_575"),
    ERR_576("ERR_576"),
    ERR_577("ERR_577"),
    // ERR_578( "ERR_578" ),
    // ERR_579( "ERR_579" ),
    // ERR_580( "ERR_580" ),
    ERR_581("ERR_581"),
    // ERR_582( "ERR_582" ),
    // ERR_583( "ERR_583" ),
    // ERR_584( "ERR_584" ),
    // ERR_585( "ERR_585" ),
    // ERR_586( "ERR_586" ),
    // ERR_587( "ERR_587" ),
    // ERR_588( "ERR_588" ),
    // ERR_589( "ERR_589" ),
    // ERR_590( "ERR_590" ),
    ERR_591("ERR_591"),
    ERR_592("ERR_592"),
    ERR_593("ERR_593"),
    ERR_594("ERR_594"),
    // ERR_595( "ERR_595" ),
    ERR_596("ERR_596"),
    ERR_597("ERR_597"),
    // ERR_598( "ERR_598" ),
    ERR_599("ERR_599"),
    ERR_600("ERR_600"),
    ERR_601("ERR_601"),
    ERR_602("ERR_602"),
    ERR_603("ERR_603"),
    ERR_604("ERR_604"),
    ERR_605("ERR_605"),
    ERR_606("ERR_606"),
    ERR_607("ERR_607"),
    ERR_608("ERR_608"),
    ERR_609("ERR_609"),
    ERR_610("ERR_610"),
    ERR_611("ERR_611"),
    ERR_612("ERR_612"),
    ERR_613("ERR_613"),
    ERR_614("ERR_614"),
    ERR_615("ERR_615"),
    ERR_616("ERR_616"),
    ERR_617("ERR_617"),
    ERR_618("ERR_618"),
    ERR_619("ERR_619"),
    // ERR_620( "ERR_620" ),
    // ERR_621( "ERR_621" ),
    ERR_622("ERR_622"),
    ERR_623("ERR_623"),
    ERR_624("ERR_624"),
    ERR_625("ERR_625"),
    ERR_626("ERR_626"),
    ERR_627("ERR_627"),
    ERR_628("ERR_628"),
    ERR_629("ERR_629"),
    ERR_630("ERR_630"),
    ERR_631("ERR_631"),
    ERR_632("ERR_632"),
    ERR_633("ERR_633"),
    ERR_634("ERR_634"),
    ERR_635("ERR_635"),
    ERR_636("ERR_636"),
    ERR_637("ERR_637"),
    ERR_638("ERR_638"),
    ERR_639("ERR_639"),
    ERR_640("ERR_640"),
    ERR_641("ERR_641"),
    ERR_642("ERR_642"),
    // ERR_643( "ERR_643" ),
    // ERR_644( "ERR_644" ),
    // ERR_645( "ERR_645" ),
    ERR_646("ERR_646"),
    ERR_647("ERR_647"),
    ERR_648("ERR_648"),
    ERR_649("ERR_649"),
    ERR_650("ERR_650"),
    ERR_651("ERR_651"),
    ERR_652("ERR_652"),
    ERR_653("ERR_653"),
    ERR_654("ERR_654"),
    ERR_655("ERR_655"),
    ERR_656("ERR_656"),
    ERR_657("ERR_657"),
    ERR_658("ERR_658"),
    ERR_659("ERR_659"),
    ERR_660("ERR_660"),
    ERR_661("ERR_661"),
    ERR_662("ERR_662"),
    ERR_663("ERR_663"),
    ERR_664("ERR_664"),
    // ERR_665( "ERR_665" ),
    ERR_666("ERR_666"),
    ERR_667("ERR_667"),
    ERR_668("ERR_668"),
    ERR_669("ERR_669"),
    ERR_670("ERR_670"),
    ERR_671("ERR_671"),
    ERR_672("ERR_672"),
    // ERR_673( "ERR_673" ),
    ERR_674("ERR_674"),
    ERR_675("ERR_675"),
    ERR_676("ERR_676"),
    ERR_677("ERR_677"),
    ERR_678("ERR_678"),
    ERR_679("ERR_679"),
    ERR_680("ERR_680"),
    ERR_681("ERR_681"),
    ERR_682("ERR_682"),
    ERR_683("ERR_683"),
    ERR_684("ERR_684"),
    ERR_685("ERR_685"),
    ERR_686("ERR_686"),
    ERR_687("ERR_687"),
    // ERR_688( "ERR_688" ),
    ERR_689("ERR_689"),
    ERR_690("ERR_690"),
    ERR_691("ERR_691"),
    ERR_692("ERR_692"),
    // ERR_693( "ERR_693" ),
    ERR_694("ERR_694"),
    ERR_695("ERR_695"),
    // ERR_696( "ERR_696" ),
    ERR_697("ERR_697"),
    ERR_698("ERR_698"),
    ERR_699("ERR_699"),
    ERR_700("ERR_700"),
    ERR_701("ERR_701"),
    ERR_702("ERR_702"),
    ERR_703("ERR_703"),
    ERR_704("ERR_704"),
    ERR_705("ERR_705"),
    ERR_706("ERR_706"),
    ERR_707("ERR_707"),
    ERR_708("ERR_708"),
    ERR_709("ERR_709"),
    // ERR_710( "ERR_710" ),
    ERR_711("ERR_711"),
    ERR_712("ERR_712"),
    ERR_713("ERR_713"),
    ERR_714("ERR_714"),
    ERR_715("ERR_715"),
    ERR_716("ERR_716"),
    ERR_717("ERR_717"),
    ERR_718("ERR_718"),
    ERR_719("ERR_719"),
    ERR_720("ERR_720"),
    ERR_721("ERR_721"),
    ERR_722("ERR_722"),
    ERR_723("ERR_723"),
    ERR_724("ERR_724"),
    ERR_725("ERR_725"),
    ERR_726_FILE_UNDELETABLE( "ERR_726_FILE_UNDELETABLE" ),
    ERR_727("ERR_727"),
    ERR_728("ERR_728"),
    ERR_729("ERR_729"),
    ERR_730("ERR_730"),
    ERR_731("ERR_731"),
    ERR_732("ERR_732"),
    ERR_733("ERR_733"),
    ERR_734_CANNOT_ENCODE_KRBERROR("ERR_734_CANNOT_ENCODE_KRBERROR"),
    ERR_735_CANNOT_ENCODE_KRBSAFEBODY("ERR_735_CANNOT_ENCODE_KRBSAFEBODY"),
    ERR_736_CANNOT_ENCODE_KRBSAFE("ERR_736_CANNOT_ENCODE_KRBSAFE"),
    ERR_737_CANNOT_ENCODE_ENC_KRB_PRIV_PART("ERR_737_CANNOT_ENCODE_ENC_KRB_PRIV_PART"),
    ERR_738_CANNOT_ENCODE_KRB_PRIV("ERR_738_CANNOT_ENCODE_KRB_PRIV"),
    ERR_739_CANNOT_ENCODE_KRB_CRED_INFO("ERR_739_CANNOT_ENCODE_KRB_CRED_INFO"),
    ERR_740_CANNOT_ENCODE_ENC_KRB_CRED_PART("ERR_740_CANNOT_ENCODE_ENC_KRB_CRED_PART"),
    ERR_741_CANNOT_ENCODE_KRB_CRED("ERR_741_CANNOT_ENCODE_KRB_CRED"),
    ERR_742_CANNOT_ENCODE_ENC_TICKET_PART("ERR_742_CANNOT_ENCODE_ENC_TICKET_PART"),
    ERR_743_CANNOT_ENCODE_TYPED_DATA("ERR_743_CANNOT_ENCODE_TYPED_DATA"),
    ERR_744_NULL_PDU_LENGTH("ERR_744_NULL_PDU_LENGTH"),
    ERR_745_NOT_A_KERBEROS_STRING("ERR_745_NOT_A_KERBEROS_STRING");
    
    private static ResourceBundle errBundle = ResourceBundle
                .getBundle( "org.apache.directory.server.i18n.errors" );

    private final static ResourceBundle msgBundle = ResourceBundle
        .getBundle( "org/apache/directory/server/i18n/messages" );

    /** The error code */
    private String errorCode;


    /**
     * Creates a new instance of I18n.
     */
    private I18n( String errorCode )
    {
        this.errorCode = errorCode;
    }


    /**
     * @return the errorCode
     */
    public String getErrorCode()
    {
        return errorCode;
    }


    /**
     * 
     * Translate an error code with argument(s)
     *
     * @param err The error code
     * @param args The argument(s)
     * @return The translate error code
     */
    public static String err( I18n err, Object... args )
    {
        try
        {
            return err + " " + MessageFormat.format( errBundle.getString( err.getErrorCode() ), args );
        }
        catch ( Exception e )
        {
            StringBuffer sb = new StringBuffer();
            boolean comma = false;

            for ( Object obj : args )
            {
                if ( comma )
                {
                    sb.append( "," );
                }
                else
                {
                    comma = true;
                }

                sb.append( obj );
            }

            return err + " (" + sb.toString() + ")";
        }
    }


    /**
     * 
     * Translate a message with argument(s)
     *
     * @param msg The message
     * @param args The argument(s)
     * @return The translated message
     */
    public static String msg( String msg, Object... args )
    {
        try
        {
            return MessageFormat.format( msgBundle.getString( msg ), args );
        }
        catch ( MissingResourceException mre )
        {
            try
            {
                return MessageFormat.format( msg, args );
            }
            catch ( Exception e )
            {
                StringBuffer sb = new StringBuffer();
                boolean comma = false;

                for ( Object obj : args )
                {
                    if ( comma )
                    {
                        sb.append( "," );
                    }
                    else
                    {
                        comma = true;
                    }

                    sb.append( obj );
                }

                return msg + " (" + sb.toString() + ")";
            }
        }
    }
}
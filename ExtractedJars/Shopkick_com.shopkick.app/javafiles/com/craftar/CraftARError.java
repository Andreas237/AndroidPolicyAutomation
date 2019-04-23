// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import org.json.JSONException;
import org.json.JSONObject;

public class CraftARError
{
	public static final class ERROR_CODES extends Enum
	{

		public static ERROR_CODES valueOf(String s)
		{
			return (ERROR_CODES)Enum.valueOf(com/craftar/CraftARError$ERROR_CODES, s);
		//    0    0:ldc1            #2   <Class CraftARError$ERROR_CODES>
		//    1    2:aload_0         
		//    2    3:invokestatic    #179 <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class CraftARError$ERROR_CODES>
		//    4    9:areturn         
		}

		public static ERROR_CODES[] values()
		{
			return (ERROR_CODES[])((ERROR_CODES []) ($VALUES)).clone();
		//    0    0:getstatic       #171 <Field CraftARError$ERROR_CODES[] $VALUES>
		//    1    3:invokevirtual   #186 <Method Object _5B_Lcom.craftar.CraftARError$ERROR_CODES_3B_.clone()>
		//    2    6:checkcast       #182 <Class CraftARError$ERROR_CODES[]>
		//    3    9:areturn         
		}

		private static final ERROR_CODES $VALUES[];
		public static final ERROR_CODES COLLECTION_BUNDLE_SDK_VERSION_IS_OLD;
		public static final ERROR_CODES COLLECTION_BUNDLE_VERSION_IS_OLD;
		public static final ERROR_CODES COLLECTION_INVALID;
		public static final ERROR_CODES COLLECTION_INVALID_ITEM;
		public static final ERROR_CODES COLLECTION_MANAGER_DELETE_ERROR;
		public static final ERROR_CODES COLLECTION_MANAGER_EXTRACT_ERROR;
		public static final ERROR_CODES COLLECTION_MANAGER_INVALID_PARAMS;
		public static final ERROR_CODES COLLECTION_MISSING_FILES;
		public static final ERROR_CODES COLLECTION_NOT_FOUND;
		public static final ERROR_CODES COLLECTION_SYNC_ERROR;
		public static final ERROR_CODES COLLECTION_SYNC_INVALID_BUNDLE;
		public static final ERROR_CODES CRAFTAR_ITEM_AR_ALREADY_ADDED;
		public static final ERROR_CODES CRAFTAR_ITEM_AR_ERROR_INTERNAL;
		public static final ERROR_CODES CRAFTAR_ITEM_AR_ERROR_INVALID_DATA;
		public static final ERROR_CODES CRAFTAR_ITEM_AR_ERROR_LIMIT_EXCEEDED;
		public static final ERROR_CODES CRAFTAR_ITEM_AR_ERROR_WRONG_LICENSE;
		public static final ERROR_CODES ERROR_CAMERA_NOT_OPEN;
		public static final ERROR_CODES ERROR_IMAGE_HAS_TRANSPARENCY;
		public static final ERROR_CODES ERROR_IMAGE_MISSING;
		public static final ERROR_CODES ERROR_IMAGE_NOT_LOADED;
		public static final ERROR_CODES ERROR_IMAGE_NO_DETAILS;
		public static final ERROR_CODES ERROR_IMAGE_TOO_LARGE;
		public static final ERROR_CODES ERROR_IMAGE_TOO_SMALL;
		public static final ERROR_CODES ERROR_INTERNAL;
		public static final ERROR_CODES ERROR_INVALID_SERVER_RESPONSE;
		public static final ERROR_CODES ERROR_NETWORK;
		public static final ERROR_CODES ERROR_OPENING_IMAGE;
		public static final ERROR_CODES ERROR_READING_FILE;
		public static final ERROR_CODES ERROR_SCAN_QUOTA_EXCEEDED;
		public static final ERROR_CODES ERROR_SERVER;
		public static final ERROR_CODES ERROR_TAKING_PICTURE;
		public static final ERROR_CODES ERROR_UNKNOWN;
		public static final ERROR_CODES HTTP_ERROR;
		public static final ERROR_CODES ON_DEVICE_IR_COLLECTION_NOT_FOUND;
		public static final ERROR_CODES ON_DEVICE_IR_INTERNAL_ERROR_LOADING_COLLECTION;
		public static final ERROR_CODES ON_DEVICE_IR_NO_ACTIVE_COLLECTION;
		public static final ERROR_CODES SDK_VERSION_APP_ID_NOT_FOUND;
		public static final ERROR_CODES TOKEN_INVALID;

		static 
		{
			COLLECTION_MANAGER_EXTRACT_ERROR = new ERROR_CODES("COLLECTION_MANAGER_EXTRACT_ERROR", 0);
		//    0    0:new             #2   <Class CraftARError$ERROR_CODES>
		//    1    3:dup             
		//    2    4:ldc1            #52  <String "COLLECTION_MANAGER_EXTRACT_ERROR">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//    5   10:putstatic       #58  <Field CraftARError$ERROR_CODES COLLECTION_MANAGER_EXTRACT_ERROR>
			COLLECTION_MANAGER_DELETE_ERROR = new ERROR_CODES("COLLECTION_MANAGER_DELETE_ERROR", 1);
		//    6   13:new             #2   <Class CraftARError$ERROR_CODES>
		//    7   16:dup             
		//    8   17:ldc1            #59  <String "COLLECTION_MANAGER_DELETE_ERROR">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//   11   23:putstatic       #61  <Field CraftARError$ERROR_CODES COLLECTION_MANAGER_DELETE_ERROR>
			COLLECTION_MANAGER_INVALID_PARAMS = new ERROR_CODES("COLLECTION_MANAGER_INVALID_PARAMS", 2);
		//   12   26:new             #2   <Class CraftARError$ERROR_CODES>
		//   13   29:dup             
		//   14   30:ldc1            #62  <String "COLLECTION_MANAGER_INVALID_PARAMS">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//   17   36:putstatic       #64  <Field CraftARError$ERROR_CODES COLLECTION_MANAGER_INVALID_PARAMS>
			COLLECTION_NOT_FOUND = new ERROR_CODES("COLLECTION_NOT_FOUND", 3);
		//   18   39:new             #2   <Class CraftARError$ERROR_CODES>
		//   19   42:dup             
		//   20   43:ldc1            #65  <String "COLLECTION_NOT_FOUND">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//   23   49:putstatic       #67  <Field CraftARError$ERROR_CODES COLLECTION_NOT_FOUND>
			COLLECTION_MISSING_FILES = new ERROR_CODES("COLLECTION_MISSING_FILES", 4);
		//   24   52:new             #2   <Class CraftARError$ERROR_CODES>
		//   25   55:dup             
		//   26   56:ldc1            #68  <String "COLLECTION_MISSING_FILES">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//   29   62:putstatic       #70  <Field CraftARError$ERROR_CODES COLLECTION_MISSING_FILES>
			COLLECTION_INVALID = new ERROR_CODES("COLLECTION_INVALID", 5);
		//   30   65:new             #2   <Class CraftARError$ERROR_CODES>
		//   31   68:dup             
		//   32   69:ldc1            #71  <String "COLLECTION_INVALID">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//   35   75:putstatic       #73  <Field CraftARError$ERROR_CODES COLLECTION_INVALID>
			COLLECTION_INVALID_ITEM = new ERROR_CODES("COLLECTION_INVALID_ITEM", 6);
		//   36   78:new             #2   <Class CraftARError$ERROR_CODES>
		//   37   81:dup             
		//   38   82:ldc1            #74  <String "COLLECTION_INVALID_ITEM">
		//   39   84:bipush          6
		//   40   86:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//   41   89:putstatic       #76  <Field CraftARError$ERROR_CODES COLLECTION_INVALID_ITEM>
			COLLECTION_BUNDLE_VERSION_IS_OLD = new ERROR_CODES("COLLECTION_BUNDLE_VERSION_IS_OLD", 7);
		//   42   92:new             #2   <Class CraftARError$ERROR_CODES>
		//   43   95:dup             
		//   44   96:ldc1            #77  <String "COLLECTION_BUNDLE_VERSION_IS_OLD">
		//   45   98:bipush          7
		//   46  100:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//   47  103:putstatic       #79  <Field CraftARError$ERROR_CODES COLLECTION_BUNDLE_VERSION_IS_OLD>
			COLLECTION_BUNDLE_SDK_VERSION_IS_OLD = new ERROR_CODES("COLLECTION_BUNDLE_SDK_VERSION_IS_OLD", 8);
		//   48  106:new             #2   <Class CraftARError$ERROR_CODES>
		//   49  109:dup             
		//   50  110:ldc1            #80  <String "COLLECTION_BUNDLE_SDK_VERSION_IS_OLD">
		//   51  112:bipush          8
		//   52  114:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//   53  117:putstatic       #82  <Field CraftARError$ERROR_CODES COLLECTION_BUNDLE_SDK_VERSION_IS_OLD>
			COLLECTION_SYNC_INVALID_BUNDLE = new ERROR_CODES("COLLECTION_SYNC_INVALID_BUNDLE", 9);
		//   54  120:new             #2   <Class CraftARError$ERROR_CODES>
		//   55  123:dup             
		//   56  124:ldc1            #83  <String "COLLECTION_SYNC_INVALID_BUNDLE">
		//   57  126:bipush          9
		//   58  128:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//   59  131:putstatic       #85  <Field CraftARError$ERROR_CODES COLLECTION_SYNC_INVALID_BUNDLE>
			COLLECTION_SYNC_ERROR = new ERROR_CODES("COLLECTION_SYNC_ERROR", 10);
		//   60  134:new             #2   <Class CraftARError$ERROR_CODES>
		//   61  137:dup             
		//   62  138:ldc1            #86  <String "COLLECTION_SYNC_ERROR">
		//   63  140:bipush          10
		//   64  142:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//   65  145:putstatic       #88  <Field CraftARError$ERROR_CODES COLLECTION_SYNC_ERROR>
			TOKEN_INVALID = new ERROR_CODES("TOKEN_INVALID", 11);
		//   66  148:new             #2   <Class CraftARError$ERROR_CODES>
		//   67  151:dup             
		//   68  152:ldc1            #89  <String "TOKEN_INVALID">
		//   69  154:bipush          11
		//   70  156:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//   71  159:putstatic       #91  <Field CraftARError$ERROR_CODES TOKEN_INVALID>
			SDK_VERSION_APP_ID_NOT_FOUND = new ERROR_CODES("SDK_VERSION_APP_ID_NOT_FOUND", 12);
		//   72  162:new             #2   <Class CraftARError$ERROR_CODES>
		//   73  165:dup             
		//   74  166:ldc1            #92  <String "SDK_VERSION_APP_ID_NOT_FOUND">
		//   75  168:bipush          12
		//   76  170:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//   77  173:putstatic       #94  <Field CraftARError$ERROR_CODES SDK_VERSION_APP_ID_NOT_FOUND>
			ON_DEVICE_IR_COLLECTION_NOT_FOUND = new ERROR_CODES("ON_DEVICE_IR_COLLECTION_NOT_FOUND", 13);
		//   78  176:new             #2   <Class CraftARError$ERROR_CODES>
		//   79  179:dup             
		//   80  180:ldc1            #95  <String "ON_DEVICE_IR_COLLECTION_NOT_FOUND">
		//   81  182:bipush          13
		//   82  184:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//   83  187:putstatic       #97  <Field CraftARError$ERROR_CODES ON_DEVICE_IR_COLLECTION_NOT_FOUND>
			ON_DEVICE_IR_NO_ACTIVE_COLLECTION = new ERROR_CODES("ON_DEVICE_IR_NO_ACTIVE_COLLECTION", 14);
		//   84  190:new             #2   <Class CraftARError$ERROR_CODES>
		//   85  193:dup             
		//   86  194:ldc1            #98  <String "ON_DEVICE_IR_NO_ACTIVE_COLLECTION">
		//   87  196:bipush          14
		//   88  198:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//   89  201:putstatic       #100 <Field CraftARError$ERROR_CODES ON_DEVICE_IR_NO_ACTIVE_COLLECTION>
			ON_DEVICE_IR_INTERNAL_ERROR_LOADING_COLLECTION = new ERROR_CODES("ON_DEVICE_IR_INTERNAL_ERROR_LOADING_COLLECTION", 15);
		//   90  204:new             #2   <Class CraftARError$ERROR_CODES>
		//   91  207:dup             
		//   92  208:ldc1            #101 <String "ON_DEVICE_IR_INTERNAL_ERROR_LOADING_COLLECTION">
		//   93  210:bipush          15
		//   94  212:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//   95  215:putstatic       #103 <Field CraftARError$ERROR_CODES ON_DEVICE_IR_INTERNAL_ERROR_LOADING_COLLECTION>
			ERROR_IMAGE_NO_DETAILS = new ERROR_CODES("ERROR_IMAGE_NO_DETAILS", 16);
		//   96  218:new             #2   <Class CraftARError$ERROR_CODES>
		//   97  221:dup             
		//   98  222:ldc1            #104 <String "ERROR_IMAGE_NO_DETAILS">
		//   99  224:bipush          16
		//  100  226:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  101  229:putstatic       #106 <Field CraftARError$ERROR_CODES ERROR_IMAGE_NO_DETAILS>
			ERROR_IMAGE_HAS_TRANSPARENCY = new ERROR_CODES("ERROR_IMAGE_HAS_TRANSPARENCY", 17);
		//  102  232:new             #2   <Class CraftARError$ERROR_CODES>
		//  103  235:dup             
		//  104  236:ldc1            #107 <String "ERROR_IMAGE_HAS_TRANSPARENCY">
		//  105  238:bipush          17
		//  106  240:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  107  243:putstatic       #109 <Field CraftARError$ERROR_CODES ERROR_IMAGE_HAS_TRANSPARENCY>
			ERROR_READING_FILE = new ERROR_CODES("ERROR_READING_FILE", 18);
		//  108  246:new             #2   <Class CraftARError$ERROR_CODES>
		//  109  249:dup             
		//  110  250:ldc1            #110 <String "ERROR_READING_FILE">
		//  111  252:bipush          18
		//  112  254:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  113  257:putstatic       #112 <Field CraftARError$ERROR_CODES ERROR_READING_FILE>
			ERROR_OPENING_IMAGE = new ERROR_CODES("ERROR_OPENING_IMAGE", 19);
		//  114  260:new             #2   <Class CraftARError$ERROR_CODES>
		//  115  263:dup             
		//  116  264:ldc1            #113 <String "ERROR_OPENING_IMAGE">
		//  117  266:bipush          19
		//  118  268:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  119  271:putstatic       #115 <Field CraftARError$ERROR_CODES ERROR_OPENING_IMAGE>
			ERROR_IMAGE_TOO_SMALL = new ERROR_CODES("ERROR_IMAGE_TOO_SMALL", 20);
		//  120  274:new             #2   <Class CraftARError$ERROR_CODES>
		//  121  277:dup             
		//  122  278:ldc1            #116 <String "ERROR_IMAGE_TOO_SMALL">
		//  123  280:bipush          20
		//  124  282:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  125  285:putstatic       #118 <Field CraftARError$ERROR_CODES ERROR_IMAGE_TOO_SMALL>
			ERROR_IMAGE_TOO_LARGE = new ERROR_CODES("ERROR_IMAGE_TOO_LARGE", 21);
		//  126  288:new             #2   <Class CraftARError$ERROR_CODES>
		//  127  291:dup             
		//  128  292:ldc1            #119 <String "ERROR_IMAGE_TOO_LARGE">
		//  129  294:bipush          21
		//  130  296:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  131  299:putstatic       #121 <Field CraftARError$ERROR_CODES ERROR_IMAGE_TOO_LARGE>
			ERROR_IMAGE_MISSING = new ERROR_CODES("ERROR_IMAGE_MISSING", 22);
		//  132  302:new             #2   <Class CraftARError$ERROR_CODES>
		//  133  305:dup             
		//  134  306:ldc1            #122 <String "ERROR_IMAGE_MISSING">
		//  135  308:bipush          22
		//  136  310:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  137  313:putstatic       #124 <Field CraftARError$ERROR_CODES ERROR_IMAGE_MISSING>
			ERROR_CAMERA_NOT_OPEN = new ERROR_CODES("ERROR_CAMERA_NOT_OPEN", 23);
		//  138  316:new             #2   <Class CraftARError$ERROR_CODES>
		//  139  319:dup             
		//  140  320:ldc1            #125 <String "ERROR_CAMERA_NOT_OPEN">
		//  141  322:bipush          23
		//  142  324:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  143  327:putstatic       #127 <Field CraftARError$ERROR_CODES ERROR_CAMERA_NOT_OPEN>
			ERROR_TAKING_PICTURE = new ERROR_CODES("ERROR_TAKING_PICTURE", 24);
		//  144  330:new             #2   <Class CraftARError$ERROR_CODES>
		//  145  333:dup             
		//  146  334:ldc1            #128 <String "ERROR_TAKING_PICTURE">
		//  147  336:bipush          24
		//  148  338:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  149  341:putstatic       #130 <Field CraftARError$ERROR_CODES ERROR_TAKING_PICTURE>
			ERROR_NETWORK = new ERROR_CODES("ERROR_NETWORK", 25);
		//  150  344:new             #2   <Class CraftARError$ERROR_CODES>
		//  151  347:dup             
		//  152  348:ldc1            #131 <String "ERROR_NETWORK">
		//  153  350:bipush          25
		//  154  352:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  155  355:putstatic       #133 <Field CraftARError$ERROR_CODES ERROR_NETWORK>
			HTTP_ERROR = new ERROR_CODES("HTTP_ERROR", 26);
		//  156  358:new             #2   <Class CraftARError$ERROR_CODES>
		//  157  361:dup             
		//  158  362:ldc1            #134 <String "HTTP_ERROR">
		//  159  364:bipush          26
		//  160  366:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  161  369:putstatic       #136 <Field CraftARError$ERROR_CODES HTTP_ERROR>
			ERROR_SERVER = new ERROR_CODES("ERROR_SERVER", 27);
		//  162  372:new             #2   <Class CraftARError$ERROR_CODES>
		//  163  375:dup             
		//  164  376:ldc1            #137 <String "ERROR_SERVER">
		//  165  378:bipush          27
		//  166  380:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  167  383:putstatic       #139 <Field CraftARError$ERROR_CODES ERROR_SERVER>
			ERROR_SCAN_QUOTA_EXCEEDED = new ERROR_CODES("ERROR_SCAN_QUOTA_EXCEEDED", 28);
		//  168  386:new             #2   <Class CraftARError$ERROR_CODES>
		//  169  389:dup             
		//  170  390:ldc1            #140 <String "ERROR_SCAN_QUOTA_EXCEEDED">
		//  171  392:bipush          28
		//  172  394:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  173  397:putstatic       #142 <Field CraftARError$ERROR_CODES ERROR_SCAN_QUOTA_EXCEEDED>
			ERROR_IMAGE_NOT_LOADED = new ERROR_CODES("ERROR_IMAGE_NOT_LOADED", 29);
		//  174  400:new             #2   <Class CraftARError$ERROR_CODES>
		//  175  403:dup             
		//  176  404:ldc1            #143 <String "ERROR_IMAGE_NOT_LOADED">
		//  177  406:bipush          29
		//  178  408:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  179  411:putstatic       #145 <Field CraftARError$ERROR_CODES ERROR_IMAGE_NOT_LOADED>
			ERROR_INVALID_SERVER_RESPONSE = new ERROR_CODES("ERROR_INVALID_SERVER_RESPONSE", 30);
		//  180  414:new             #2   <Class CraftARError$ERROR_CODES>
		//  181  417:dup             
		//  182  418:ldc1            #146 <String "ERROR_INVALID_SERVER_RESPONSE">
		//  183  420:bipush          30
		//  184  422:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  185  425:putstatic       #148 <Field CraftARError$ERROR_CODES ERROR_INVALID_SERVER_RESPONSE>
			CRAFTAR_ITEM_AR_ALREADY_ADDED = new ERROR_CODES("CRAFTAR_ITEM_AR_ALREADY_ADDED", 31);
		//  186  428:new             #2   <Class CraftARError$ERROR_CODES>
		//  187  431:dup             
		//  188  432:ldc1            #149 <String "CRAFTAR_ITEM_AR_ALREADY_ADDED">
		//  189  434:bipush          31
		//  190  436:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  191  439:putstatic       #151 <Field CraftARError$ERROR_CODES CRAFTAR_ITEM_AR_ALREADY_ADDED>
			CRAFTAR_ITEM_AR_ERROR_INTERNAL = new ERROR_CODES("CRAFTAR_ITEM_AR_ERROR_INTERNAL", 32);
		//  192  442:new             #2   <Class CraftARError$ERROR_CODES>
		//  193  445:dup             
		//  194  446:ldc1            #152 <String "CRAFTAR_ITEM_AR_ERROR_INTERNAL">
		//  195  448:bipush          32
		//  196  450:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  197  453:putstatic       #154 <Field CraftARError$ERROR_CODES CRAFTAR_ITEM_AR_ERROR_INTERNAL>
			CRAFTAR_ITEM_AR_ERROR_INVALID_DATA = new ERROR_CODES("CRAFTAR_ITEM_AR_ERROR_INVALID_DATA", 33);
		//  198  456:new             #2   <Class CraftARError$ERROR_CODES>
		//  199  459:dup             
		//  200  460:ldc1            #155 <String "CRAFTAR_ITEM_AR_ERROR_INVALID_DATA">
		//  201  462:bipush          33
		//  202  464:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  203  467:putstatic       #157 <Field CraftARError$ERROR_CODES CRAFTAR_ITEM_AR_ERROR_INVALID_DATA>
			CRAFTAR_ITEM_AR_ERROR_LIMIT_EXCEEDED = new ERROR_CODES("CRAFTAR_ITEM_AR_ERROR_LIMIT_EXCEEDED", 34);
		//  204  470:new             #2   <Class CraftARError$ERROR_CODES>
		//  205  473:dup             
		//  206  474:ldc1            #158 <String "CRAFTAR_ITEM_AR_ERROR_LIMIT_EXCEEDED">
		//  207  476:bipush          34
		//  208  478:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  209  481:putstatic       #160 <Field CraftARError$ERROR_CODES CRAFTAR_ITEM_AR_ERROR_LIMIT_EXCEEDED>
			CRAFTAR_ITEM_AR_ERROR_WRONG_LICENSE = new ERROR_CODES("CRAFTAR_ITEM_AR_ERROR_WRONG_LICENSE", 35);
		//  210  484:new             #2   <Class CraftARError$ERROR_CODES>
		//  211  487:dup             
		//  212  488:ldc1            #161 <String "CRAFTAR_ITEM_AR_ERROR_WRONG_LICENSE">
		//  213  490:bipush          35
		//  214  492:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  215  495:putstatic       #163 <Field CraftARError$ERROR_CODES CRAFTAR_ITEM_AR_ERROR_WRONG_LICENSE>
			ERROR_INTERNAL = new ERROR_CODES("ERROR_INTERNAL", 36);
		//  216  498:new             #2   <Class CraftARError$ERROR_CODES>
		//  217  501:dup             
		//  218  502:ldc1            #164 <String "ERROR_INTERNAL">
		//  219  504:bipush          36
		//  220  506:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  221  509:putstatic       #166 <Field CraftARError$ERROR_CODES ERROR_INTERNAL>
			ERROR_UNKNOWN = new ERROR_CODES("ERROR_UNKNOWN", 37);
		//  222  512:new             #2   <Class CraftARError$ERROR_CODES>
		//  223  515:dup             
		//  224  516:ldc1            #167 <String "ERROR_UNKNOWN">
		//  225  518:bipush          37
		//  226  520:invokespecial   #56  <Method void CraftARError$ERROR_CODES(String, int)>
		//  227  523:putstatic       #169 <Field CraftARError$ERROR_CODES ERROR_UNKNOWN>
			$VALUES = (new ERROR_CODES[] {
				COLLECTION_MANAGER_EXTRACT_ERROR, COLLECTION_MANAGER_DELETE_ERROR, COLLECTION_MANAGER_INVALID_PARAMS, COLLECTION_NOT_FOUND, COLLECTION_MISSING_FILES, COLLECTION_INVALID, COLLECTION_INVALID_ITEM, COLLECTION_BUNDLE_VERSION_IS_OLD, COLLECTION_BUNDLE_SDK_VERSION_IS_OLD, COLLECTION_SYNC_INVALID_BUNDLE, 
				COLLECTION_SYNC_ERROR, TOKEN_INVALID, SDK_VERSION_APP_ID_NOT_FOUND, ON_DEVICE_IR_COLLECTION_NOT_FOUND, ON_DEVICE_IR_NO_ACTIVE_COLLECTION, ON_DEVICE_IR_INTERNAL_ERROR_LOADING_COLLECTION, ERROR_IMAGE_NO_DETAILS, ERROR_IMAGE_HAS_TRANSPARENCY, ERROR_READING_FILE, ERROR_OPENING_IMAGE, 
				ERROR_IMAGE_TOO_SMALL, ERROR_IMAGE_TOO_LARGE, ERROR_IMAGE_MISSING, ERROR_CAMERA_NOT_OPEN, ERROR_TAKING_PICTURE, ERROR_NETWORK, HTTP_ERROR, ERROR_SERVER, ERROR_SCAN_QUOTA_EXCEEDED, ERROR_IMAGE_NOT_LOADED, 
				ERROR_INVALID_SERVER_RESPONSE, CRAFTAR_ITEM_AR_ALREADY_ADDED, CRAFTAR_ITEM_AR_ERROR_INTERNAL, CRAFTAR_ITEM_AR_ERROR_INVALID_DATA, CRAFTAR_ITEM_AR_ERROR_LIMIT_EXCEEDED, CRAFTAR_ITEM_AR_ERROR_WRONG_LICENSE, ERROR_INTERNAL, ERROR_UNKNOWN
			});
		//  228  526:bipush          38
		//  229  528:anewarray       ERROR_CODES[]
		//  230  531:dup             
		//  231  532:iconst_0        
		//  232  533:getstatic       #58  <Field CraftARError$ERROR_CODES COLLECTION_MANAGER_EXTRACT_ERROR>
		//  233  536:aastore         
		//  234  537:dup             
		//  235  538:iconst_1        
		//  236  539:getstatic       #61  <Field CraftARError$ERROR_CODES COLLECTION_MANAGER_DELETE_ERROR>
		//  237  542:aastore         
		//  238  543:dup             
		//  239  544:iconst_2        
		//  240  545:getstatic       #64  <Field CraftARError$ERROR_CODES COLLECTION_MANAGER_INVALID_PARAMS>
		//  241  548:aastore         
		//  242  549:dup             
		//  243  550:iconst_3        
		//  244  551:getstatic       #67  <Field CraftARError$ERROR_CODES COLLECTION_NOT_FOUND>
		//  245  554:aastore         
		//  246  555:dup             
		//  247  556:iconst_4        
		//  248  557:getstatic       #70  <Field CraftARError$ERROR_CODES COLLECTION_MISSING_FILES>
		//  249  560:aastore         
		//  250  561:dup             
		//  251  562:iconst_5        
		//  252  563:getstatic       #73  <Field CraftARError$ERROR_CODES COLLECTION_INVALID>
		//  253  566:aastore         
		//  254  567:dup             
		//  255  568:bipush          6
		//  256  570:getstatic       #76  <Field CraftARError$ERROR_CODES COLLECTION_INVALID_ITEM>
		//  257  573:aastore         
		//  258  574:dup             
		//  259  575:bipush          7
		//  260  577:getstatic       #79  <Field CraftARError$ERROR_CODES COLLECTION_BUNDLE_VERSION_IS_OLD>
		//  261  580:aastore         
		//  262  581:dup             
		//  263  582:bipush          8
		//  264  584:getstatic       #82  <Field CraftARError$ERROR_CODES COLLECTION_BUNDLE_SDK_VERSION_IS_OLD>
		//  265  587:aastore         
		//  266  588:dup             
		//  267  589:bipush          9
		//  268  591:getstatic       #85  <Field CraftARError$ERROR_CODES COLLECTION_SYNC_INVALID_BUNDLE>
		//  269  594:aastore         
		//  270  595:dup             
		//  271  596:bipush          10
		//  272  598:getstatic       #88  <Field CraftARError$ERROR_CODES COLLECTION_SYNC_ERROR>
		//  273  601:aastore         
		//  274  602:dup             
		//  275  603:bipush          11
		//  276  605:getstatic       #91  <Field CraftARError$ERROR_CODES TOKEN_INVALID>
		//  277  608:aastore         
		//  278  609:dup             
		//  279  610:bipush          12
		//  280  612:getstatic       #94  <Field CraftARError$ERROR_CODES SDK_VERSION_APP_ID_NOT_FOUND>
		//  281  615:aastore         
		//  282  616:dup             
		//  283  617:bipush          13
		//  284  619:getstatic       #97  <Field CraftARError$ERROR_CODES ON_DEVICE_IR_COLLECTION_NOT_FOUND>
		//  285  622:aastore         
		//  286  623:dup             
		//  287  624:bipush          14
		//  288  626:getstatic       #100 <Field CraftARError$ERROR_CODES ON_DEVICE_IR_NO_ACTIVE_COLLECTION>
		//  289  629:aastore         
		//  290  630:dup             
		//  291  631:bipush          15
		//  292  633:getstatic       #103 <Field CraftARError$ERROR_CODES ON_DEVICE_IR_INTERNAL_ERROR_LOADING_COLLECTION>
		//  293  636:aastore         
		//  294  637:dup             
		//  295  638:bipush          16
		//  296  640:getstatic       #106 <Field CraftARError$ERROR_CODES ERROR_IMAGE_NO_DETAILS>
		//  297  643:aastore         
		//  298  644:dup             
		//  299  645:bipush          17
		//  300  647:getstatic       #109 <Field CraftARError$ERROR_CODES ERROR_IMAGE_HAS_TRANSPARENCY>
		//  301  650:aastore         
		//  302  651:dup             
		//  303  652:bipush          18
		//  304  654:getstatic       #112 <Field CraftARError$ERROR_CODES ERROR_READING_FILE>
		//  305  657:aastore         
		//  306  658:dup             
		//  307  659:bipush          19
		//  308  661:getstatic       #115 <Field CraftARError$ERROR_CODES ERROR_OPENING_IMAGE>
		//  309  664:aastore         
		//  310  665:dup             
		//  311  666:bipush          20
		//  312  668:getstatic       #118 <Field CraftARError$ERROR_CODES ERROR_IMAGE_TOO_SMALL>
		//  313  671:aastore         
		//  314  672:dup             
		//  315  673:bipush          21
		//  316  675:getstatic       #121 <Field CraftARError$ERROR_CODES ERROR_IMAGE_TOO_LARGE>
		//  317  678:aastore         
		//  318  679:dup             
		//  319  680:bipush          22
		//  320  682:getstatic       #124 <Field CraftARError$ERROR_CODES ERROR_IMAGE_MISSING>
		//  321  685:aastore         
		//  322  686:dup             
		//  323  687:bipush          23
		//  324  689:getstatic       #127 <Field CraftARError$ERROR_CODES ERROR_CAMERA_NOT_OPEN>
		//  325  692:aastore         
		//  326  693:dup             
		//  327  694:bipush          24
		//  328  696:getstatic       #130 <Field CraftARError$ERROR_CODES ERROR_TAKING_PICTURE>
		//  329  699:aastore         
		//  330  700:dup             
		//  331  701:bipush          25
		//  332  703:getstatic       #133 <Field CraftARError$ERROR_CODES ERROR_NETWORK>
		//  333  706:aastore         
		//  334  707:dup             
		//  335  708:bipush          26
		//  336  710:getstatic       #136 <Field CraftARError$ERROR_CODES HTTP_ERROR>
		//  337  713:aastore         
		//  338  714:dup             
		//  339  715:bipush          27
		//  340  717:getstatic       #139 <Field CraftARError$ERROR_CODES ERROR_SERVER>
		//  341  720:aastore         
		//  342  721:dup             
		//  343  722:bipush          28
		//  344  724:getstatic       #142 <Field CraftARError$ERROR_CODES ERROR_SCAN_QUOTA_EXCEEDED>
		//  345  727:aastore         
		//  346  728:dup             
		//  347  729:bipush          29
		//  348  731:getstatic       #145 <Field CraftARError$ERROR_CODES ERROR_IMAGE_NOT_LOADED>
		//  349  734:aastore         
		//  350  735:dup             
		//  351  736:bipush          30
		//  352  738:getstatic       #148 <Field CraftARError$ERROR_CODES ERROR_INVALID_SERVER_RESPONSE>
		//  353  741:aastore         
		//  354  742:dup             
		//  355  743:bipush          31
		//  356  745:getstatic       #151 <Field CraftARError$ERROR_CODES CRAFTAR_ITEM_AR_ALREADY_ADDED>
		//  357  748:aastore         
		//  358  749:dup             
		//  359  750:bipush          32
		//  360  752:getstatic       #154 <Field CraftARError$ERROR_CODES CRAFTAR_ITEM_AR_ERROR_INTERNAL>
		//  361  755:aastore         
		//  362  756:dup             
		//  363  757:bipush          33
		//  364  759:getstatic       #157 <Field CraftARError$ERROR_CODES CRAFTAR_ITEM_AR_ERROR_INVALID_DATA>
		//  365  762:aastore         
		//  366  763:dup             
		//  367  764:bipush          34
		//  368  766:getstatic       #160 <Field CraftARError$ERROR_CODES CRAFTAR_ITEM_AR_ERROR_LIMIT_EXCEEDED>
		//  369  769:aastore         
		//  370  770:dup             
		//  371  771:bipush          35
		//  372  773:getstatic       #163 <Field CraftARError$ERROR_CODES CRAFTAR_ITEM_AR_ERROR_WRONG_LICENSE>
		//  373  776:aastore         
		//  374  777:dup             
		//  375  778:bipush          36
		//  376  780:getstatic       #166 <Field CraftARError$ERROR_CODES ERROR_INTERNAL>
		//  377  783:aastore         
		//  378  784:dup             
		//  379  785:bipush          37
		//  380  787:getstatic       #169 <Field CraftARError$ERROR_CODES ERROR_UNKNOWN>
		//  381  790:aastore         
		//  382  791:putstatic       #171 <Field CraftARError$ERROR_CODES[] $VALUES>
		//* 383  794:return          
		}

		private ERROR_CODES(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #173 <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public CraftARError(ERROR_CODES error_codes, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mErrorCode = error_codes;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field CraftARError$ERROR_CODES mErrorCode>
		mErrorMessage = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field String mErrorMessage>
	//    8   14:return          
	}

	CraftARError(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		try
		{
			mErrorMessage = jsonobject.getString("message");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #26  <String "message">
	//    5    8:invokevirtual   #32  <Method String JSONObject.getString(String)>
	//    6   11:putfield        #20  <Field String mErrorMessage>
		}
	//*   7   14:goto            26
		catch(JSONException jsonexception)
	//*   8   17:astore_3        
		{
			mErrorMessage = jsonexception.getMessage();
	//    9   18:aload_0         
	//   10   19:aload_3         
	//   11   20:invokevirtual   #36  <Method String JSONException.getMessage()>
	//   12   23:putfield        #20  <Field String mErrorMessage>
		}
		jsonobject = ((JSONObject) (jsonobject.getString("code")));
	//   13   26:aload_1         
	//   14   27:ldc1            #38  <String "code">
	//   15   29:invokevirtual   #32  <Method String JSONObject.getString(String)>
	//   16   32:astore_1        
		byte byte0 = -1;
	//   17   33:iconst_m1       
	//   18   34:istore_2        
		((String) (jsonobject)).hashCode();
	//   19   35:aload_1         
	//   20   36:invokevirtual   #44  <Method int String.hashCode()>
		JVM INSTR lookupswitch 11: default 392
	//	               -1711819627: 280
	//	               -1206037940: 266
	//	               -1199231976: 252
	//	               -809043390: 238
	//	               -91618340: 224
	//	               1032817888: 209
	//	               1125627740: 195
	//	               1178575340: 180
	//	               1890647848: 166
	//	               1923153265: 151
	//	               1923421095: 136;
	//   21   39:lookupswitch    11: default 392
	//	               -1711819627: 280
	//	               -1206037940: 266
	//	               -1199231976: 252
	//	               -809043390: 238
	//	               -91618340: 224
	//	               1032817888: 209
	//	               1125627740: 195
	//	               1178575340: 180
	//	               1890647848: 166
	//	               1923153265: 151
	//	               1923421095: 136
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L12:
		if(((String) (jsonobject)).equals("TOKEN_WRONG"))
	//*  22  136:aload_1         
	//*  23  137:ldc1            #46  <String "TOKEN_WRONG">
	//*  24  139:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  25  142:ifeq            392
			byte0 = 8;
	//   26  145:bipush          8
	//   27  147:istore_2        
		  goto _L1
	//*  28  148:goto            392
_L11:
		if(((String) (jsonobject)).equals("TOKEN_INVALID"))
	//*  29  151:aload_1         
	//*  30  152:ldc1            #52  <String "TOKEN_INVALID">
	//*  31  154:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  32  157:ifeq            392
			byte0 = 6;
	//   33  160:bipush          6
	//   34  162:istore_2        
		  goto _L1
	//*  35  163:goto            392
_L10:
		if(((String) (jsonobject)).equals("IMAGE_NO_DETAILS"))
	//*  36  166:aload_1         
	//*  37  167:ldc1            #54  <String "IMAGE_NO_DETAILS">
	//*  38  169:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  39  172:ifeq            392
			byte0 = 1;
	//   40  175:iconst_1        
	//   41  176:istore_2        
		  goto _L1
	//*  42  177:goto            392
_L9:
		if(((String) (jsonobject)).equals("SERVER_ERROR"))
	//*  43  180:aload_1         
	//*  44  181:ldc1            #56  <String "SERVER_ERROR">
	//*  45  183:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  46  186:ifeq            392
			byte0 = 10;
	//   47  189:bipush          10
	//   48  191:istore_2        
		  goto _L1
	//*  49  192:goto            392
_L8:
		if(((String) (jsonobject)).equals("SCAN_QUOTA_EXCEEDED"))
	//*  50  195:aload_1         
	//*  51  196:ldc1            #58  <String "SCAN_QUOTA_EXCEEDED">
	//*  52  198:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  53  201:ifeq            392
			byte0 = 5;
	//   54  204:iconst_5        
	//   55  205:istore_2        
		  goto _L1
	//*  56  206:goto            392
_L7:
		if(((String) (jsonobject)).equals("TOKEN_MISSING"))
	//*  57  209:aload_1         
	//*  58  210:ldc1            #60  <String "TOKEN_MISSING">
	//*  59  212:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  60  215:ifeq            392
			byte0 = 7;
	//   61  218:bipush          7
	//   62  220:istore_2        
		  goto _L1
	//*  63  221:goto            392
_L6:
		if(((String) (jsonobject)).equals("IMAGE_TRANSPARENCY"))
	//*  64  224:aload_1         
	//*  65  225:ldc1            #62  <String "IMAGE_TRANSPARENCY">
	//*  66  227:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  67  230:ifeq            392
			byte0 = 4;
	//   68  233:iconst_4        
	//   69  234:istore_2        
		  goto _L1
	//*  70  235:goto            392
_L5:
		if(((String) (jsonobject)).equals("IMAGE_MISSING"))
	//*  71  238:aload_1         
	//*  72  239:ldc1            #64  <String "IMAGE_MISSING">
	//*  73  241:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  74  244:ifeq            392
			byte0 = 0;
	//   75  247:iconst_0        
	//   76  248:istore_2        
		  goto _L1
	//*  77  249:goto            392
_L4:
		if(((String) (jsonobject)).equals("IMAGE_TOO_SMALL"))
	//*  78  252:aload_1         
	//*  79  253:ldc1            #66  <String "IMAGE_TOO_SMALL">
	//*  80  255:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  81  258:ifeq            392
			byte0 = 3;
	//   82  261:iconst_3        
	//   83  262:istore_2        
		  goto _L1
	//*  84  263:goto            392
_L3:
		if(((String) (jsonobject)).equals("IMAGE_TOO_LARGE"))
	//*  85  266:aload_1         
	//*  86  267:ldc1            #68  <String "IMAGE_TOO_LARGE">
	//*  87  269:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  88  272:ifeq            392
			byte0 = 2;
	//   89  275:iconst_2        
	//   90  276:istore_2        
		  goto _L1
	//*  91  277:goto            392
_L2:
		if(((String) (jsonobject)).equals("IMAGE_NOT_LOADED"))
	//*  92  280:aload_1         
	//*  93  281:ldc1            #70  <String "IMAGE_NOT_LOADED">
	//*  94  283:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  95  286:ifeq            392
			byte0 = 9;
	//   96  289:bipush          9
	//   97  291:istore_2        
		  goto _L1
	//*  98  292:goto            392
_L14:
		jsonobject = ((JSONObject) (ERROR_CODES.ERROR_INVALID_SERVER_RESPONSE));
	//   99  295:getstatic       #73  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_INVALID_SERVER_RESPONSE>
	//  100  298:astore_1        
		  goto _L13
	//* 101  299:goto            374
	//* 102  302:aload_0         
	//* 103  303:getstatic       #76  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_SERVER>
	//* 104  306:putfield        #18  <Field CraftARError$ERROR_CODES mErrorCode>
	//* 105  309:return          
_L22:
		mErrorCode = ERROR_CODES.ERROR_IMAGE_NOT_LOADED;
	//  106  310:aload_0         
	//  107  311:getstatic       #79  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_IMAGE_NOT_LOADED>
	//  108  314:putfield        #18  <Field CraftARError$ERROR_CODES mErrorCode>
		return;
	//  109  317:return          
_L21:
		mErrorCode = ERROR_CODES.TOKEN_INVALID;
	//  110  318:aload_0         
	//  111  319:getstatic       #81  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.TOKEN_INVALID>
	//  112  322:putfield        #18  <Field CraftARError$ERROR_CODES mErrorCode>
		return;
	//  113  325:return          
_L20:
		mErrorCode = ERROR_CODES.ERROR_SCAN_QUOTA_EXCEEDED;
	//  114  326:aload_0         
	//  115  327:getstatic       #84  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_SCAN_QUOTA_EXCEEDED>
	//  116  330:putfield        #18  <Field CraftARError$ERROR_CODES mErrorCode>
		return;
	//  117  333:return          
_L19:
		mErrorCode = ERROR_CODES.ERROR_IMAGE_HAS_TRANSPARENCY;
	//  118  334:aload_0         
	//  119  335:getstatic       #87  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_IMAGE_HAS_TRANSPARENCY>
	//  120  338:putfield        #18  <Field CraftARError$ERROR_CODES mErrorCode>
		return;
	//  121  341:return          
_L18:
		mErrorCode = ERROR_CODES.ERROR_IMAGE_TOO_SMALL;
	//  122  342:aload_0         
	//  123  343:getstatic       #90  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_IMAGE_TOO_SMALL>
	//  124  346:putfield        #18  <Field CraftARError$ERROR_CODES mErrorCode>
		return;
	//  125  349:return          
_L17:
		mErrorCode = ERROR_CODES.ERROR_IMAGE_TOO_LARGE;
	//  126  350:aload_0         
	//  127  351:getstatic       #93  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_IMAGE_TOO_LARGE>
	//  128  354:putfield        #18  <Field CraftARError$ERROR_CODES mErrorCode>
		return;
	//  129  357:return          
_L16:
		mErrorCode = ERROR_CODES.ERROR_IMAGE_NO_DETAILS;
	//  130  358:aload_0         
	//  131  359:getstatic       #96  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_IMAGE_NO_DETAILS>
	//  132  362:putfield        #18  <Field CraftARError$ERROR_CODES mErrorCode>
		return;
	//  133  365:return          
_L15:
		mErrorCode = ERROR_CODES.ERROR_IMAGE_MISSING;
	//  134  366:aload_0         
	//  135  367:getstatic       #99  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_IMAGE_MISSING>
	//  136  370:putfield        #18  <Field CraftARError$ERROR_CODES mErrorCode>
		return;
	//  137  373:return          
_L13:
		mErrorCode = ((ERROR_CODES) (jsonobject));
	//  138  374:aload_0         
	//  139  375:aload_1         
	//  140  376:putfield        #18  <Field CraftARError$ERROR_CODES mErrorCode>
		return;
	//  141  379:return          
_L23:
		try
		{
			mErrorCode = ERROR_CODES.ERROR_SERVER;
			return;
		}
	//* 142  380:aload_0         
	//* 143  381:getstatic       #73  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_INVALID_SERVER_RESPONSE>
	//* 144  384:putfield        #18  <Field CraftARError$ERROR_CODES mErrorCode>
	//* 145  387:return          
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
		{
			mErrorCode = ERROR_CODES.ERROR_INVALID_SERVER_RESPONSE;
		}
		return;
	//* 146  388:astore_1        
	//* 147  389:goto            380
_L1:
		byte0;
	//  148  392:iload_2         
		JVM INSTR tableswitch 0 10: default 452
	//	               0 366
	//	               1 358
	//	               2 350
	//	               3 342
	//	               4 334
	//	               5 326
	//	               6 318
	//	               7 318
	//	               8 318
	//	               9 310
	//	               10 302;
	//  149  393:tableswitch     0 10: default 452
	//	               0 366
	//	               1 358
	//	               2 350
	//	               3 342
	//	               4 334
	//	               5 326
	//	               6 318
	//	               7 318
	//	               8 318
	//	               9 310
	//	               10 302
		   goto _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L21 _L21 _L22 _L23
	//* 150  452:goto            295
	}

	public ERROR_CODES getErrorCode()
	{
		return mErrorCode;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field CraftARError$ERROR_CODES mErrorCode>
	//    2    4:areturn         
	}

	public String getErrorMessage()
	{
		return mErrorMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String mErrorMessage>
	//    2    4:areturn         
	}

	ERROR_CODES mErrorCode;
	String mErrorMessage;
}

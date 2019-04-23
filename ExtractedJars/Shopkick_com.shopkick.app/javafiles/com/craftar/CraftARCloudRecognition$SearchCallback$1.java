// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import java.util.ArrayList;
import org.json.*;

// Referenced classes of package com.craftar:
//			CraftARCloudRecognition, CraftARCollection, CraftARItemFactory, CraftARItem, 
//			CraftARImage, CraftARBoundingBox, CLog, CraftARResult, 
//			CraftARSearchResponseHandler, CraftARError, CraftARNetworkError

class CraftARCloudRecognition$SearchCallback$1
	implements Runnable
{

	public void run()
	{
		if(val$statusCode != 200) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int val$statusCode>
	//    2    4:sipush          200
	//    3    7:icmpne          716
_L1:
		ArrayList arraylist = new ArrayList();
	//    4   10:new             #43  <Class ArrayList>
	//    5   13:dup             
	//    6   14:invokespecial   #44  <Method void ArrayList()>
	//    7   17:astore          10
		Object obj;
		Object obj1;
		obj = ((Object) (new JSONObject(val$message)));
	//    8   19:new             #46  <Class JSONObject>
	//    9   22:dup             
	//   10   23:aload_0         
	//   11   24:getfield        #30  <Field String val$message>
	//   12   27:invokespecial   #49  <Method void JSONObject(String)>
	//   13   30:astore          4
		obj1 = ((Object) (((JSONObject) (obj)).getJSONArray("results")));
	//   14   32:aload           4
	//   15   34:ldc1            #51  <String "results">
	//   16   36:invokevirtual   #55  <Method JSONArray JSONObject.getJSONArray(String)>
	//   17   39:astore          5
		if(((JSONArray) (obj1)).length() <= 0) goto _L4; else goto _L3
	//   18   41:aload           5
	//   19   43:invokevirtual   #61  <Method int JSONArray.length()>
	//   20   46:ifle            882
_L3:
		obj = ((Object) (new CraftARCollection(((JSONObject) (obj)).getJSONObject("collection"))));
	//   21   49:new             #63  <Class CraftARCollection>
	//   22   52:dup             
	//   23   53:aload           4
	//   24   55:ldc1            #65  <String "collection">
	//   25   57:invokevirtual   #69  <Method JSONObject JSONObject.getJSONObject(String)>
	//   26   60:invokespecial   #72  <Method void CraftARCollection(JSONObject)>
	//   27   63:astore          4
		  goto _L5
	//*  28   65:goto            885
_L10:
		int i;
		if(i >= ((JSONArray) (obj1)).length()) goto _L7; else goto _L6
	//   29   68:iload_1         
	//   30   69:aload           5
	//   31   71:invokevirtual   #61  <Method int JSONArray.length()>
	//   32   74:icmpge          503
_L6:
		int k;
		Object obj5;
		CraftARItem craftaritem;
		CraftARImage craftarimage;
		JSONObject jsonobject = ((JSONArray) (obj1)).getJSONObject(i);
	//   33   77:aload           5
	//   34   79:iload_1         
	//   35   80:invokevirtual   #75  <Method JSONObject JSONArray.getJSONObject(int)>
	//   36   83:astore          6
		craftaritem = CraftARItemFactory.createItem(((CraftARCollection) (obj)), jsonobject.getJSONObject("item"));
	//   37   85:aload           4
	//   38   87:aload           6
	//   39   89:ldc1            #77  <String "item">
	//   40   91:invokevirtual   #69  <Method JSONObject JSONObject.getJSONObject(String)>
	//   41   94:invokestatic    #83  <Method CraftARItem CraftARItemFactory.createItem(CraftARCollection, JSONObject)>
	//   42   97:astore          11
		String s = jsonobject.getString("image");
	//   43   99:aload           6
	//   44  101:ldc1            #85  <String "image">
	//   45  103:invokevirtual   #89  <Method String JSONObject.getString(String)>
	//   46  106:astore          7
		obj5 = ((Object) (craftaritem.getItemId()));
	//   47  108:aload           11
	//   48  110:invokevirtual   #95  <Method String CraftARItem.getItemId()>
	//   49  113:astore          8
		craftarimage = new CraftARImage(((CraftARCollection) (obj)).getImageFieldTemplate(), ((CraftARCollection) (obj)).getUUID(), ((String) (obj5)), s);
	//   50  115:new             #97  <Class CraftARImage>
	//   51  118:dup             
	//   52  119:aload           4
	//   53  121:invokevirtual   #100 <Method String CraftARCollection.getImageFieldTemplate()>
	//   54  124:aload           4
	//   55  126:invokevirtual   #103 <Method String CraftARCollection.getUUID()>
	//   56  129:aload           8
	//   57  131:aload           7
	//   58  133:invokespecial   #106 <Method void CraftARImage(String, String, String, String)>
	//   59  136:astore          12
		k = jsonobject.getInt("score");
	//   60  138:aload           6
	//   61  140:ldc1            #108 <String "score">
	//   62  142:invokevirtual   #112 <Method int JSONObject.getInt(String)>
	//   63  145:istore_3        
		if(!jsonobject.has("bbox"))
			break MISSING_BLOCK_LABEL_893;
	//   64  146:aload           6
	//   65  148:ldc1            #114 <String "bbox">
	//   66  150:invokevirtual   #118 <Method boolean JSONObject.has(String)>
	//   67  153:ifeq            893
		obj5 = ((Object) (jsonobject.getJSONArray("bbox")));
	//   68  156:aload           6
	//   69  158:ldc1            #114 <String "bbox">
	//   70  160:invokevirtual   #55  <Method JSONArray JSONObject.getJSONArray(String)>
	//   71  163:astore          8
		Object obj2;
		Object obj3;
		if(obj5 == null)
			break MISSING_BLOCK_LABEL_893;
	//   72  165:aload           8
	//   73  167:ifnull          890
		obj3 = obj1;
	//   74  170:aload           5
	//   75  172:astore          7
		obj2 = obj;
	//   76  174:aload           4
	//   77  176:astore          6
		Object obj7 = ((Object) (new float[4]));
	//   78  178:iconst_4        
	//   79  179:newarray        float[]
	//   80  181:astore          9
		obj3 = obj1;
	//   81  183:aload           5
	//   82  185:astore          7
		obj2 = obj;
	//   83  187:aload           4
	//   84  189:astore          6
		float af[] = new float[4];
	//   85  191:iconst_4        
	//   86  192:newarray        float[]
	//   87  194:astore          13
		int j = 0;
	//   88  196:iconst_0        
	//   89  197:istore_2        
_L9:
		obj3 = obj1;
	//   90  198:aload           5
	//   91  200:astore          7
		obj2 = obj;
	//   92  202:aload           4
	//   93  204:astore          6
		if(j < obj7.length)
			break MISSING_BLOCK_LABEL_360;
	//   94  206:iload_2         
	//   95  207:aload           9
	//   96  209:arraylength     
	//   97  210:icmplt          360
		obj3 = obj1;
	//   98  213:aload           5
	//   99  215:astore          7
		obj2 = obj;
	//  100  217:aload           4
	//  101  219:astore          6
		if(j < af.length)
	//* 102  221:iload_2         
	//* 103  222:aload           13
	//* 104  224:arraylength     
	//* 105  225:icmpge          231
			break MISSING_BLOCK_LABEL_360;
	//  106  228:goto            360
		obj3 = obj1;
	//  107  231:aload           5
	//  108  233:astore          7
		obj2 = obj;
	//  109  235:aload           4
	//  110  237:astore          6
		obj5 = ((Object) (new CraftARBoundingBox()));
	//  111  239:new             #120 <Class CraftARBoundingBox>
	//  112  242:dup             
	//  113  243:invokespecial   #121 <Method void CraftARBoundingBox()>
	//  114  246:astore          8
		try
		{
			obj5.TLx = obj7[0];
	//  115  248:aload           8
	//  116  250:aload           9
	//  117  252:iconst_0        
	//  118  253:faload          
	//  119  254:putfield        #125 <Field float CraftARBoundingBox.TLx>
			obj5.TLy = af[0];
	//  120  257:aload           8
	//  121  259:aload           13
	//  122  261:iconst_0        
	//  123  262:faload          
	//  124  263:putfield        #128 <Field float CraftARBoundingBox.TLy>
			obj5.TRx = obj7[1];
	//  125  266:aload           8
	//  126  268:aload           9
	//  127  270:iconst_1        
	//  128  271:faload          
	//  129  272:putfield        #131 <Field float CraftARBoundingBox.TRx>
			obj5.TRy = af[1];
	//  130  275:aload           8
	//  131  277:aload           13
	//  132  279:iconst_1        
	//  133  280:faload          
	//  134  281:putfield        #134 <Field float CraftARBoundingBox.TRy>
			obj5.BLx = obj7[2];
	//  135  284:aload           8
	//  136  286:aload           9
	//  137  288:iconst_2        
	//  138  289:faload          
	//  139  290:putfield        #137 <Field float CraftARBoundingBox.BLx>
			obj5.BLy = af[2];
	//  140  293:aload           8
	//  141  295:aload           13
	//  142  297:iconst_2        
	//  143  298:faload          
	//  144  299:putfield        #140 <Field float CraftARBoundingBox.BLy>
			obj5.BRx = obj7[3];
	//  145  302:aload           8
	//  146  304:aload           9
	//  147  306:iconst_3        
	//  148  307:faload          
	//  149  308:putfield        #143 <Field float CraftARBoundingBox.BRx>
			obj5.BRy = af[3];
	//  150  311:aload           8
	//  151  313:aload           13
	//  152  315:iconst_3        
	//  153  316:faload          
	//  154  317:putfield        #146 <Field float CraftARBoundingBox.BRy>
		}
	//* 155  320:aload           4
	//* 156  322:astore          7
	//* 157  324:aload           8
	//* 158  326:astore          6
	//* 159  328:aload           5
	//* 160  330:astore          4
	//* 161  332:aload           7
	//* 162  334:astore          5
	//* 163  336:goto            464
		// Misplaced declaration of an exception variable
		catch(Object obj7)
	//* 164  339:astore          9
		{
			obj2 = obj;
	//  165  341:aload           4
	//  166  343:astore          6
			obj3 = obj5;
	//  167  345:aload           8
	//  168  347:astore          7
			obj = obj1;
	//  169  349:aload           5
	//  170  351:astore          4
			obj1 = obj2;
	//  171  353:aload           6
	//  172  355:astore          5
			break; /* Loop/switch isn't completed */
	//  173  357:goto            447
		}
		obj3 = obj;
		obj2 = obj5;
		obj = obj1;
		obj1 = obj3;
		break MISSING_BLOCK_LABEL_464;
		obj3 = obj1;
	//  174  360:aload           5
	//  175  362:astore          7
		obj2 = obj;
	//  176  364:aload           4
	//  177  366:astore          6
		JSONArray jsonarray = ((JSONArray) (obj5)).getJSONArray(j);
	//  178  368:aload           8
	//  179  370:iload_2         
	//  180  371:invokevirtual   #149 <Method JSONArray JSONArray.getJSONArray(int)>
	//  181  374:astore          14
		try
		{
			obj7[j] = (float)jsonarray.getDouble(0);
	//  182  376:aload           9
	//  183  378:iload_2         
	//  184  379:aload           14
	//  185  381:iconst_0        
	//  186  382:invokevirtual   #153 <Method double JSONArray.getDouble(int)>
	//  187  385:d2f             
	//  188  386:fastore         
			af[j] = (float)((JSONArray) (obj5)).getJSONArray(j).getDouble(1);
	//  189  387:aload           13
	//  190  389:iload_2         
	//  191  390:aload           8
	//  192  392:iload_2         
	//  193  393:invokevirtual   #149 <Method JSONArray JSONArray.getJSONArray(int)>
	//  194  396:iconst_1        
	//  195  397:invokevirtual   #153 <Method double JSONArray.getDouble(int)>
	//  196  400:d2f             
	//  197  401:fastore         
		}
	//* 198  402:iload_2         
	//* 199  403:iconst_1        
	//* 200  404:iadd            
	//* 201  405:istore_2        
	//* 202  406:goto            198
		// Misplaced declaration of an exception variable
		catch(Object obj2)
	//* 203  409:astore          6
		{
			obj3 = obj1;
	//  204  411:aload           5
	//  205  413:astore          7
			break MISSING_BLOCK_LABEL_428;
	//  206  415:goto            428
		}
		j++;
		if(true) goto _L9; else goto _L8
		obj1;
	//  207  418:astore          5
		obj = obj2;
	//  208  420:aload           6
	//  209  422:astore          4
		obj2 = obj1;
	//  210  424:aload           5
	//  211  426:astore          6
		Object obj6 = null;
	//  212  428:aconst_null     
	//  213  429:astore          8
		obj1 = obj;
	//  214  431:aload           4
	//  215  433:astore          5
		obj = obj3;
	//  216  435:aload           7
	//  217  437:astore          4
		obj3 = ((Object) (obj6));
	//  218  439:aload           8
	//  219  441:astore          7
		obj7 = obj2;
	//  220  443:aload           6
	//  221  445:astore          9
_L8:
		try
		{
			CLog.e("Invalid JSON-Encoded bounding box");
	//  222  447:ldc1            #155 <String "Invalid JSON-Encoded bounding box">
	//  223  449:invokestatic    #160 <Method void CLog.e(String)>
			((JSONException) (obj7)).printStackTrace();
	//  224  452:aload           9
	//  225  454:invokevirtual   #163 <Method void JSONException.printStackTrace()>
		}
	//* 226  457:aload           7
	//* 227  459:astore          6
	//* 228  461:goto            464
	//* 229  464:aload           10
	//* 230  466:new             #165 <Class CraftARResult>
	//* 231  469:dup             
	//* 232  470:aload           11
	//* 233  472:aload           12
	//* 234  474:iload_3         
	//* 235  475:aload           6
	//* 236  477:invokespecial   #168 <Method void CraftARResult(CraftARItem, CraftARImage, int, CraftARBoundingBox)>
	//* 237  480:invokevirtual   #172 <Method boolean ArrayList.add(Object)>
	//* 238  483:pop             
	//* 239  484:iload_1         
	//* 240  485:iconst_1        
	//* 241  486:iadd            
	//* 242  487:istore_1        
	//* 243  488:aload           5
	//* 244  490:astore          6
	//* 245  492:aload           4
	//* 246  494:astore          5
	//* 247  496:aload           6
	//* 248  498:astore          4
	//* 249  500:goto            68
	//* 250  503:aload_0         
	//* 251  504:getfield        #26  <Field CraftARCloudRecognition$SearchCallback this$1>
	//* 252  507:getfield        #176 <Field CraftARCloudRecognition CraftARCloudRecognition$SearchCallback.this$0>
	//* 253  510:getfield        #180 <Field CraftARSearchResponseHandler CraftARCloudRecognition.mResponseHandler>
	//* 254  513:ifnull          545
	//* 255  516:aload_0         
	//* 256  517:getfield        #26  <Field CraftARCloudRecognition$SearchCallback this$1>
	//* 257  520:getfield        #176 <Field CraftARCloudRecognition CraftARCloudRecognition$SearchCallback.this$0>
	//* 258  523:getfield        #180 <Field CraftARSearchResponseHandler CraftARCloudRecognition.mResponseHandler>
	//* 259  526:aload           10
	//* 260  528:aload_0         
	//* 261  529:getfield        #32  <Field long val$ellapsedTime>
	//* 262  532:aload_0         
	//* 263  533:getfield        #26  <Field CraftARCloudRecognition$SearchCallback this$1>
	//* 264  536:getfield        #183 <Field int CraftARCloudRecognition$SearchCallback.mRequestCode>
	//* 265  539:invokeinterface #189 <Method void CraftARSearchResponseHandler.searchResults(ArrayList, long, int)>
	//* 266  544:return          
	//* 267  545:ldc1            #191 <String "No response handler is set. Logging search results">
	//* 268  547:invokestatic    #160 <Method void CLog.e(String)>
	//* 269  550:new             #193 <Class StringBuilder>
	//* 270  553:dup             
	//* 271  554:invokespecial   #194 <Method void StringBuilder()>
	//* 272  557:astore          4
	//* 273  559:aload           4
	//* 274  561:ldc1            #196 <String "Search results:">
	//* 275  563:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//* 276  566:pop             
	//* 277  567:aload           4
	//* 278  569:aload_0         
	//* 279  570:getfield        #30  <Field String val$message>
	//* 280  573:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//* 281  576:pop             
	//* 282  577:aload           4
	//* 283  579:invokevirtual   #203 <Method String StringBuilder.toString()>
	//* 284  582:invokestatic    #206 <Method void CLog.i(String)>
	//* 285  585:return          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 286  586:astore          4
		{
			((Exception) (obj)).printStackTrace();
	//  287  588:aload           4
	//  288  590:invokevirtual   #207 <Method void Exception.printStackTrace()>
			obj = ((Object) (CraftARError.ERROR_CODES.ERROR_INVALID_SERVER_RESPONSE));
	//  289  593:getstatic       #213 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_INVALID_SERVER_RESPONSE>
	//  290  596:astore          4
			obj1 = ((Object) (new StringBuilder()));
	//  291  598:new             #193 <Class StringBuilder>
	//  292  601:dup             
	//  293  602:invokespecial   #194 <Method void StringBuilder()>
	//  294  605:astore          5
			((StringBuilder) (obj1)).append("CraftAR results could not be generated from the server response: ");
	//  295  607:aload           5
	//  296  609:ldc1            #215 <String "CraftAR results could not be generated from the server response: ">
	//  297  611:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//  298  614:pop             
			((StringBuilder) (obj1)).append(val$message);
	//  299  615:aload           5
	//  300  617:aload_0         
	//  301  618:getfield        #30  <Field String val$message>
	//  302  621:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//  303  624:pop             
			obj = ((Object) (new CraftARError(((CraftARError.ERROR_CODES) (obj)), ((StringBuilder) (obj1)).toString())));
	//  304  625:new             #217 <Class CraftARError>
	//  305  628:dup             
	//  306  629:aload           4
	//  307  631:aload           5
	//  308  633:invokevirtual   #203 <Method String StringBuilder.toString()>
	//  309  636:invokespecial   #220 <Method void CraftARError(CraftARError$ERROR_CODES, String)>
	//  310  639:astore          4
			if(mResponseHandler != null)
	//* 311  641:aload_0         
	//* 312  642:getfield        #26  <Field CraftARCloudRecognition$SearchCallback this$1>
	//* 313  645:getfield        #176 <Field CraftARCloudRecognition CraftARCloudRecognition$SearchCallback.this$0>
	//* 314  648:getfield        #180 <Field CraftARSearchResponseHandler CraftARCloudRecognition.mResponseHandler>
	//* 315  651:ifnull          679
			{
				mResponseHandler.searchFailed(((CraftARError) (obj)), mRequestCode);
	//  316  654:aload_0         
	//  317  655:getfield        #26  <Field CraftARCloudRecognition$SearchCallback this$1>
	//  318  658:getfield        #176 <Field CraftARCloudRecognition CraftARCloudRecognition$SearchCallback.this$0>
	//  319  661:getfield        #180 <Field CraftARSearchResponseHandler CraftARCloudRecognition.mResponseHandler>
	//  320  664:aload           4
	//  321  666:aload_0         
	//  322  667:getfield        #26  <Field CraftARCloudRecognition$SearchCallback this$1>
	//  323  670:getfield        #183 <Field int CraftARCloudRecognition$SearchCallback.mRequestCode>
	//  324  673:invokeinterface #224 <Method void CraftARSearchResponseHandler.searchFailed(CraftARError, int)>
				return;
	//  325  678:return          
			} else
			{
				obj1 = ((Object) (new StringBuilder()));
	//  326  679:new             #193 <Class StringBuilder>
	//  327  682:dup             
	//  328  683:invokespecial   #194 <Method void StringBuilder()>
	//  329  686:astore          5
				((StringBuilder) (obj1)).append("Search failed : ");
	//  330  688:aload           5
	//  331  690:ldc1            #226 <String "Search failed : ">
	//  332  692:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//  333  695:pop             
				((StringBuilder) (obj1)).append(((CraftARError) (obj)).getErrorMessage());
	//  334  696:aload           5
	//  335  698:aload           4
	//  336  700:invokevirtual   #229 <Method String CraftARError.getErrorMessage()>
	//  337  703:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//  338  706:pop             
				CLog.e(((StringBuilder) (obj1)).toString());
	//  339  707:aload           5
	//  340  709:invokevirtual   #203 <Method String StringBuilder.toString()>
	//  341  712:invokestatic    #160 <Method void CLog.e(String)>
				return;
	//  342  715:return          
			}
		}
		obj2 = obj3;
_L11:
		arraylist.add(((Object) (new CraftARResult(craftaritem, craftarimage, k, ((CraftARBoundingBox) (obj2))))));
		i++;
		obj2 = obj1;
		obj1 = obj;
		obj = obj2;
		  goto _L10
_L7:
		if(mResponseHandler != null)
		{
			mResponseHandler.searchResults(arraylist, val$ellapsedTime, mRequestCode);
			return;
		} else
		{
			CLog.e("No response handler is set. Logging search results");
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("Search results:");
			((StringBuilder) (obj)).append(val$message);
			CLog.i(((StringBuilder) (obj)).toString());
			return;
		}
_L2:
		try
		{
			obj = ((Object) ((new JSONObject(val$message)).getJSONObject("error")));
	//  343  716:new             #46  <Class JSONObject>
	//  344  719:dup             
	//  345  720:aload_0         
	//  346  721:getfield        #30  <Field String val$message>
	//  347  724:invokespecial   #49  <Method void JSONObject(String)>
	//  348  727:ldc1            #231 <String "error">
	//  349  729:invokevirtual   #69  <Method JSONObject JSONObject.getJSONObject(String)>
	//  350  732:astore          4
			obj1 = ((Object) (new StringBuilder()));
	//  351  734:new             #193 <Class StringBuilder>
	//  352  737:dup             
	//  353  738:invokespecial   #194 <Method void StringBuilder()>
	//  354  741:astore          5
			((StringBuilder) (obj1)).append("errorJSON:");
	//  355  743:aload           5
	//  356  745:ldc1            #233 <String "errorJSON:">
	//  357  747:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//  358  750:pop             
			((StringBuilder) (obj1)).append(((JSONObject) (obj)).toString());
	//  359  751:aload           5
	//  360  753:aload           4
	//  361  755:invokevirtual   #234 <Method String JSONObject.toString()>
	//  362  758:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//  363  761:pop             
			CLog.v(((StringBuilder) (obj1)).toString());
	//  364  762:aload           5
	//  365  764:invokevirtual   #203 <Method String StringBuilder.toString()>
	//  366  767:invokestatic    #237 <Method void CLog.v(String)>
			obj = ((Object) (new CraftARError(((JSONObject) (obj)))));
	//  367  770:new             #217 <Class CraftARError>
	//  368  773:dup             
	//  369  774:aload           4
	//  370  776:invokespecial   #238 <Method void CraftARError(JSONObject)>
	//  371  779:astore          4
		}
	//* 372  781:goto            807
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 373  784:astore          4
		{
			obj = ((Object) (new CraftARNetworkError(CraftARError.ERROR_CODES.ERROR_NETWORK, ((JSONException) (obj)).getMessage(), val$statusCode)));
	//  374  786:new             #240 <Class CraftARNetworkError>
	//  375  789:dup             
	//  376  790:getstatic       #243 <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_NETWORK>
	//  377  793:aload           4
	//  378  795:invokevirtual   #246 <Method String JSONException.getMessage()>
	//  379  798:aload_0         
	//  380  799:getfield        #28  <Field int val$statusCode>
	//  381  802:invokespecial   #249 <Method void CraftARNetworkError(CraftARError$ERROR_CODES, String, int)>
	//  382  805:astore          4
		}
		if(mResponseHandler != null)
	//* 383  807:aload_0         
	//* 384  808:getfield        #26  <Field CraftARCloudRecognition$SearchCallback this$1>
	//* 385  811:getfield        #176 <Field CraftARCloudRecognition CraftARCloudRecognition$SearchCallback.this$0>
	//* 386  814:getfield        #180 <Field CraftARSearchResponseHandler CraftARCloudRecognition.mResponseHandler>
	//* 387  817:ifnull          845
		{
			mResponseHandler.searchFailed(((CraftARError) (obj)), mRequestCode);
	//  388  820:aload_0         
	//  389  821:getfield        #26  <Field CraftARCloudRecognition$SearchCallback this$1>
	//  390  824:getfield        #176 <Field CraftARCloudRecognition CraftARCloudRecognition$SearchCallback.this$0>
	//  391  827:getfield        #180 <Field CraftARSearchResponseHandler CraftARCloudRecognition.mResponseHandler>
	//  392  830:aload           4
	//  393  832:aload_0         
	//  394  833:getfield        #26  <Field CraftARCloudRecognition$SearchCallback this$1>
	//  395  836:getfield        #183 <Field int CraftARCloudRecognition$SearchCallback.mRequestCode>
	//  396  839:invokeinterface #224 <Method void CraftARSearchResponseHandler.searchFailed(CraftARError, int)>
			return;
	//  397  844:return          
		} else
		{
			obj1 = ((Object) (new StringBuilder()));
	//  398  845:new             #193 <Class StringBuilder>
	//  399  848:dup             
	//  400  849:invokespecial   #194 <Method void StringBuilder()>
	//  401  852:astore          5
			((StringBuilder) (obj1)).append("Search failed : ");
	//  402  854:aload           5
	//  403  856:ldc1            #226 <String "Search failed : ">
	//  404  858:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//  405  861:pop             
			((StringBuilder) (obj1)).append(((CraftARError) (obj)).getErrorMessage());
	//  406  862:aload           5
	//  407  864:aload           4
	//  408  866:invokevirtual   #229 <Method String CraftARError.getErrorMessage()>
	//  409  869:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//  410  872:pop             
			CLog.e(((StringBuilder) (obj1)).toString());
	//  411  873:aload           5
	//  412  875:invokevirtual   #203 <Method String StringBuilder.toString()>
	//  413  878:invokestatic    #160 <Method void CLog.e(String)>
			return;
	//  414  881:return          
		}
_L4:
		obj = null;
	//  415  882:aconst_null     
	//  416  883:astore          4
_L5:
		i = 0;
	//  417  885:iconst_0        
	//  418  886:istore_1        
		  goto _L10
	//* 419  887:goto            68
	//* 420  890:goto            893
		Object obj4 = obj;
	//  421  893:aload           4
	//  422  895:astore          7
		obj = obj1;
	//  423  897:aload           5
	//  424  899:astore          4
		obj2 = null;
	//  425  901:aconst_null     
	//  426  902:astore          6
		obj1 = obj4;
	//  427  904:aload           7
	//  428  906:astore          5
		  goto _L11
	//* 429  908:goto            464
	}

	final CraftARCloudRecognition.SearchCallback this$1;
	final long val$ellapsedTime;
	final String val$message;
	final int val$statusCode;

	CraftARCloudRecognition$SearchCallback$1()
	{
		this$1 = final_searchcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field CraftARCloudRecognition$SearchCallback this$1>
		val$statusCode = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #28  <Field int val$statusCode>
		val$message = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field String val$message>
		val$ellapsedTime = J.this;
	//    9   15:aload_0         
	//   10   16:lload           4
	//   11   18:putfield        #32  <Field long val$ellapsedTime>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #35  <Method void Object()>
	//   14   25:return          
	}
}

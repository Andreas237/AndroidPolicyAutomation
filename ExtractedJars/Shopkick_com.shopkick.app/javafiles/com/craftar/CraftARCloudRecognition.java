// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import org.json.*;

// Referenced classes of package com.craftar:
//			ImageRecognition, AppEventListener, CRSConnect, CloudSearchController, 
//			AppEventForwarder, CraftARGenericSDK, Build, CraftARQueryImage, 
//			CLog, SearchController, SetCloudCollectionListener, CraftARError, 
//			CraftARNetworkError, CraftARSearchResponseHandler, CraftARCollection, CraftARItemFactory, 
//			CraftARItem, CraftARImage, CraftARBoundingBox, CraftARResult, 
//			SearchParams, ConnectParams

public class CraftARCloudRecognition extends ImageRecognition
	implements AppEventListener
{
	class ConnectCallback
		implements CRSConnect.NetworkCallback
	{

		public void onResult(final int statusCode, String s)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #29  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #30  <Method void StringBuilder()>
		//    3    7:astore_3        
			stringbuilder.append("ConnectCallback, onResult: ");
		//    4    8:aload_3         
		//    5    9:ldc1            #32  <String "ConnectCallback, onResult: ">
		//    6   11:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(s);
		//    8   15:aload_3         
		//    9   16:aload_2         
		//   10   17:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//   11   20:pop             
			CLog.d(stringbuilder.toString());
		//   12   21:aload_3         
		//   13   22:invokevirtual   #40  <Method String StringBuilder.toString()>
		//   14   25:invokestatic    #46  <Method void CLog.d(String)>
			mResponseHandlerThread.post(((_cls1) (s)). new Runnable() {

				public void run()
				{
					JSONException jsonexception;
					if(statusCode == 200)
				//*   0    0:aload_0         
				//*   1    1:getfield        #26  <Field int val$statusCode>
				//*   2    4:sipush          200
				//*   3    7:icmpne          39
						if(mSetCollectionListener != null)
				//*   4   10:aload_0         
				//*   5   11:getfield        #24  <Field CraftARCloudRecognition$ConnectCallback this$1>
				//*   6   14:getfield        #39  <Field SetCloudCollectionListener CraftARCloudRecognition$ConnectCallback.mSetCollectionListener>
				//*   7   17:ifnull          33
						{
							mSetCollectionListener.collectionReady();
				//    8   20:aload_0         
				//    9   21:getfield        #24  <Field CraftARCloudRecognition$ConnectCallback this$1>
				//   10   24:getfield        #39  <Field SetCloudCollectionListener CraftARCloudRecognition$ConnectCallback.mSetCollectionListener>
				//   11   27:invokeinterface #44  <Method void SetCloudCollectionListener.collectionReady()>
							return;
				//   12   32:return          
						} else
						{
							CLog.e("No collection listener set");
				//   13   33:ldc1            #46  <String "No collection listener set">
				//   14   35:invokestatic    #52  <Method void CLog.e(String)>
							return;
				//   15   38:return          
						}
					Object obj;
					try
					{
						obj = ((Object) ((new JSONObject(message)).getJSONObject("error")));
				//   16   39:new             #54  <Class JSONObject>
				//   17   42:dup             
				//   18   43:aload_0         
				//   19   44:getfield        #28  <Field String val$message>
				//   20   47:invokespecial   #56  <Method void JSONObject(String)>
				//   21   50:ldc1            #58  <String "error">
				//   22   52:invokevirtual   #62  <Method JSONObject JSONObject.getJSONObject(String)>
				//   23   55:astore_1        
						StringBuilder stringbuilder = new StringBuilder();
				//   24   56:new             #64  <Class StringBuilder>
				//   25   59:dup             
				//   26   60:invokespecial   #65  <Method void StringBuilder()>
				//   27   63:astore_2        
						stringbuilder.append("errorJSON:");
				//   28   64:aload_2         
				//   29   65:ldc1            #67  <String "errorJSON:">
				//   30   67:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
				//   31   70:pop             
						stringbuilder.append(((JSONObject) (obj)).toString());
				//   32   71:aload_2         
				//   33   72:aload_1         
				//   34   73:invokevirtual   #75  <Method String JSONObject.toString()>
				//   35   76:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
				//   36   79:pop             
						CLog.v(stringbuilder.toString());
				//   37   80:aload_2         
				//   38   81:invokevirtual   #76  <Method String StringBuilder.toString()>
				//   39   84:invokestatic    #79  <Method void CLog.v(String)>
						obj = ((Object) (new CraftARError(((JSONObject) (obj)))));
				//   40   87:new             #81  <Class CraftARError>
				//   41   90:dup             
				//   42   91:aload_1         
				//   43   92:invokespecial   #84  <Method void CraftARError(JSONObject)>
				//   44   95:astore_1        
					}
				//*  45   96:goto            118
				//*  46   99:new             #86  <Class CraftARNetworkError>
				//*  47  102:dup             
				//*  48  103:getstatic       #92  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.HTTP_ERROR>
				//*  49  106:aload_0         
				//*  50  107:getfield        #28  <Field String val$message>
				//*  51  110:aload_0         
				//*  52  111:getfield        #26  <Field int val$statusCode>
				//*  53  114:invokespecial   #95  <Method void CraftARNetworkError(CraftARError$ERROR_CODES, String, int)>
				//*  54  117:astore_1        
				//*  55  118:aload_0         
				//*  56  119:getfield        #24  <Field CraftARCloudRecognition$ConnectCallback this$1>
				//*  57  122:getfield        #39  <Field SetCloudCollectionListener CraftARCloudRecognition$ConnectCallback.mSetCollectionListener>
				//*  58  125:ifnull          142
				//*  59  128:aload_0         
				//*  60  129:getfield        #24  <Field CraftARCloudRecognition$ConnectCallback this$1>
				//*  61  132:getfield        #39  <Field SetCloudCollectionListener CraftARCloudRecognition$ConnectCallback.mSetCollectionListener>
				//*  62  135:aload_1         
				//*  63  136:invokeinterface #99  <Method void SetCloudCollectionListener.setCollectionFailed(CraftARError)>
				//*  64  141:return          
				//*  65  142:aload_1         
				//*  66  143:invokevirtual   #102 <Method String CraftARError.getErrorMessage()>
				//*  67  146:invokestatic    #52  <Method void CLog.e(String)>
				//*  68  149:return          
					// Misplaced declaration of an exception variable
					catch(JSONException jsonexception)
					{
						obj = ((Object) (new CraftARNetworkError(CraftARError.ERROR_CODES.HTTP_ERROR, message, statusCode)));
					}
					if(mSetCollectionListener != null)
					{
						mSetCollectionListener.setCollectionFailed(((CraftARError) (obj)));
						return;
					} else
					{
						CLog.e(((CraftARError) (obj)).getErrorMessage());
						return;
					}
				//*  69  150:astore_1        
				//*  70  151:goto            99
				}

				final ConnectCallback this$1;
				final String val$message;
				final int val$statusCode;

			
			{
				this$1 = final_connectcallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field CraftARCloudRecognition$ConnectCallback this$1>
				statusCode = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #26  <Field int val$statusCode>
				message = String.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field String val$message>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
			}
);
		//   15   28:aload_0         
		//   16   29:getfield        #19  <Field CraftARCloudRecognition this$0>
		//   17   32:getfield        #50  <Field Handler CraftARCloudRecognition.mResponseHandlerThread>
		//   18   35:new             #11  <Class CraftARCloudRecognition$ConnectCallback$1>
		//   19   38:dup             
		//   20   39:aload_0         
		//   21   40:iload_1         
		//   22   41:aload_2         
		//   23   42:invokespecial   #53  <Method void CraftARCloudRecognition$ConnectCallback$1(CraftARCloudRecognition$ConnectCallback, int, String)>
		//   24   45:invokevirtual   #59  <Method boolean Handler.post(Runnable)>
		//   25   48:pop             
		//   26   49:return          
		}

		SetCloudCollectionListener mSetCollectionListener;
		final CraftARCloudRecognition this$0;

		ConnectCallback(SetCloudCollectionListener setcloudcollectionlistener)
		{
			this$0 = CraftARCloudRecognition.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field CraftARCloudRecognition this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			mSetCollectionListener = setcloudcollectionlistener;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field SetCloudCollectionListener mSetCollectionListener>
		//    8   14:return          
		}
	}

	class SearchCallback
		implements CRSConnect.NetworkCallback
	{

		public void onResult(final int statusCode, final String message)
		{
			if(mSearchesCancelled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field CraftARCloudRecognition this$0>
		//*   2    4:invokestatic    #39  <Method boolean CraftARCloudRecognition.access$700(CraftARCloudRecognition)>
		//*   3    7:ifeq            20
			{
				mNumPendingSearches = 0;
		//    4   10:aload_0         
		//    5   11:getfield        #23  <Field CraftARCloudRecognition this$0>
		//    6   14:iconst_0        
		//    7   15:invokestatic    #43  <Method int CraftARCloudRecognition.access$002(CraftARCloudRecognition, int)>
		//    8   18:pop             
				return;
		//    9   19:return          
			} else
			{
				long l = System.currentTimeMillis();
		//   10   20:invokestatic    #49  <Method long System.currentTimeMillis()>
		//   11   23:lstore_3        
				long l1 = mRequestTimestamp;
		//   12   24:aload_0         
		//   13   25:getfield        #32  <Field long mRequestTimestamp>
		//   14   28:lstore          5
				mResponseHandlerThread.post(((_cls1) (l - l1)). new Runnable() {

					public void run()
					{
						if(statusCode != 200) goto _L2; else goto _L1
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
						obj = ((Object) (new JSONObject(message)));
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
							((StringBuilder) (obj1)).append(message);
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
							mResponseHandler.searchResults(arraylist, ellapsedTime, mRequestCode);
							return;
						} else
						{
							CLog.e("No response handler is set. Logging search results");
							obj = ((Object) (new StringBuilder()));
							((StringBuilder) (obj)).append("Search results:");
							((StringBuilder) (obj)).append(message);
							CLog.i(((StringBuilder) (obj)).toString());
							return;
						}
_L2:
						try
						{
							obj = ((Object) ((new JSONObject(message)).getJSONObject("error")));
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
							obj = ((Object) (new CraftARNetworkError(CraftARError.ERROR_CODES.ERROR_NETWORK, ((JSONException) (obj)).getMessage(), statusCode)));
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

					final SearchCallback this$1;
					final long val$ellapsedTime;
					final String val$message;
					final int val$statusCode;

			
			{
				this$1 = final_searchcallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field CraftARCloudRecognition$SearchCallback this$1>
				statusCode = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #28  <Field int val$statusCode>
				message = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field String val$message>
				ellapsedTime = J.this;
			//    9   15:aload_0         
			//   10   16:lload           4
			//   11   18:putfield        #32  <Field long val$ellapsedTime>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
				}
);
		//   15   30:aload_0         
		//   16   31:getfield        #23  <Field CraftARCloudRecognition this$0>
		//   17   34:getfield        #53  <Field Handler CraftARCloudRecognition.mResponseHandlerThread>
		//   18   37:new             #11  <Class CraftARCloudRecognition$SearchCallback$1>
		//   19   40:dup             
		//   20   41:aload_0         
		//   21   42:iload_1         
		//   22   43:aload_2         
		//   23   44:lload_3         
		//   24   45:lload           5
		//   25   47:lsub            
		//   26   48:invokespecial   #56  <Method void CraftARCloudRecognition$SearchCallback$1(CraftARCloudRecognition$SearchCallback, int, String, long)>
		//   27   51:invokevirtual   #62  <Method boolean Handler.post(Runnable)>
		//   28   54:pop             
				int i = this.mResponseHandlerThread;
		//   29   55:aload_0         
		//   30   56:getfield        #23  <Field CraftARCloudRecognition this$0>
		//   31   59:invokestatic    #66  <Method int CraftARCloudRecognition.access$010(CraftARCloudRecognition)>
		//   32   62:pop             
				return;
		//   33   63:return          
			}
		}

		int mRequestCode;
		long mRequestTimestamp;
		CraftARSearchResponseHandler mSearchResponseHandler;
		final CraftARCloudRecognition this$0;

		SearchCallback(CraftARSearchResponseHandler craftarsearchresponsehandler, int i, long l)
		{
			this$0 = CraftARCloudRecognition.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field CraftARCloudRecognition this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #26  <Method void Object()>
			mSearchResponseHandler = craftarsearchresponsehandler;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #28  <Field CraftARSearchResponseHandler mSearchResponseHandler>
			mRequestCode = i;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #30  <Field int mRequestCode>
			mRequestTimestamp = l;
		//   11   19:aload_0         
		//   12   20:lload           4
		//   13   22:putfield        #32  <Field long mRequestTimestamp>
		//   14   25:return          
		}
	}


	CraftARCloudRecognition(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void ImageRecognition()>
		mNumPendingSearches = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #53  <Field int mNumPendingSearches>
		mEmbedTracking = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #55  <Field boolean mEmbedTracking>
		mEmbedCustom = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #57  <Field boolean mEmbedCustom>
		mRequestBoundingBoxes = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #59  <Field boolean mRequestBoundingBoxes>
		mSearchesCancelled = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #61  <Field boolean mSearchesCancelled>
		mContext = context;
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:putfield        #63  <Field Context mContext>
		mCRSConnect = new CRSConnect();
	//   20   34:aload_0         
	//   21   35:new             #65  <Class CRSConnect>
	//   22   38:dup             
	//   23   39:invokespecial   #66  <Method void CRSConnect()>
	//   24   42:putfield        #68  <Field CRSConnect mCRSConnect>
		mResponseHandlerThread = new Handler(mContext.getMainLooper());
	//   25   45:aload_0         
	//   26   46:new             #70  <Class Handler>
	//   27   49:dup             
	//   28   50:aload_0         
	//   29   51:getfield        #63  <Field Context mContext>
	//   30   54:invokevirtual   #76  <Method android.os.Looper Context.getMainLooper()>
	//   31   57:invokespecial   #79  <Method void Handler(android.os.Looper)>
	//   32   60:putfield        #81  <Field Handler mResponseHandlerThread>
		mNetworkThread = new HandlerThread("NetworkThread");
	//   33   63:aload_0         
	//   34   64:new             #83  <Class HandlerThread>
	//   35   67:dup             
	//   36   68:ldc1            #85  <String "NetworkThread">
	//   37   70:invokespecial   #88  <Method void HandlerThread(String)>
	//   38   73:putfield        #90  <Field HandlerThread mNetworkThread>
		mNetworkThread.start();
	//   39   76:aload_0         
	//   40   77:getfield        #90  <Field HandlerThread mNetworkThread>
	//   41   80:invokevirtual   #93  <Method void HandlerThread.start()>
		mNetworkThreadHandler = new Handler(mNetworkThread.getLooper());
	//   42   83:aload_0         
	//   43   84:new             #70  <Class Handler>
	//   44   87:dup             
	//   45   88:aload_0         
	//   46   89:getfield        #90  <Field HandlerThread mNetworkThread>
	//   47   92:invokevirtual   #96  <Method android.os.Looper HandlerThread.getLooper()>
	//   48   95:invokespecial   #79  <Method void Handler(android.os.Looper)>
	//   49   98:putfield        #98  <Field Handler mNetworkThreadHandler>
		mSearchController = ((SearchController) (new CloudSearchController(this)));
	//   50  101:aload_0         
	//   51  102:new             #100 <Class CloudSearchController>
	//   52  105:dup             
	//   53  106:aload_0         
	//   54  107:invokespecial   #103 <Method void CloudSearchController(CraftARCloudRecognition)>
	//   55  110:putfield        #105 <Field SearchController mSearchController>
		AppEventForwarder.addAppEventListener(((AppEventListener) (this)));
	//   56  113:aload_0         
	//   57  114:invokestatic    #111 <Method void AppEventForwarder.addAppEventListener(AppEventListener)>
	//   58  117:return          
	}

	public static CraftARCloudRecognition Instance()
	{
		if(self == null && CraftARGenericSDK.context != null)
	//*   0    0:getstatic       #116 <Field CraftARCloudRecognition self>
	//*   1    3:ifnonnull       28
	//*   2    6:getstatic       #121 <Field Context CraftARGenericSDK.context>
	//*   3    9:ifnull          28
		{
			Build.setup();
	//    4   12:invokestatic    #126 <Method void Build.setup()>
			self = new CraftARCloudRecognition(CraftARGenericSDK.context);
	//    5   15:new             #2   <Class CraftARCloudRecognition>
	//    6   18:dup             
	//    7   19:getstatic       #121 <Field Context CraftARGenericSDK.context>
	//    8   22:invokespecial   #128 <Method void CraftARCloudRecognition(Context)>
	//    9   25:putstatic       #116 <Field CraftARCloudRecognition self>
		}
		return self;
	//   10   28:getstatic       #116 <Field CraftARCloudRecognition self>
	//   11   31:areturn         
	}

	public void cancelPendingSearches()
	{
		mNetworkThreadHandler.removeCallbacksAndMessages(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Handler mNetworkThreadHandler>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #151 <Method void Handler.removeCallbacksAndMessages(Object)>
		mSearchesCancelled = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #61  <Field boolean mSearchesCancelled>
	//    7   13:return          
	}

	public int getPendingSearchRequestsCount()
	{
		return mNumPendingSearches;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int mNumPendingSearches>
	//    2    4:ireturn         
	}

	public SearchController getSearchController()
	{
		return mSearchController;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field SearchController mSearchController>
	//    2    4:areturn         
	}

	public void onAppFinish()
	{
	//    0    0:return          
	}

	public void onAppPause()
	{
		mNetworkThreadHandler.removeCallbacksAndMessages(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Handler mNetworkThreadHandler>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #151 <Method void Handler.removeCallbacksAndMessages(Object)>
	//    4    8:return          
	}

	public void onAppResume()
	{
	//    0    0:return          
	}

	public void search(CraftARQueryImage craftarqueryimage)
	{
		search(craftarqueryimage, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #163 <Method void search(CraftARQueryImage, int)>
	//    4    6:return          
	}

	public void search(final CraftARQueryImage imagedata, final int requestCode)
	{
		mSearchesCancelled = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #61  <Field boolean mSearchesCancelled>
		final long timeStamp = System.currentTimeMillis();
	//    3    5:invokestatic    #169 <Method long System.currentTimeMillis()>
	//    4    8:lstore_3        
		imagedata = ((CraftARQueryImage) (imagedata.toJPEGByteArray()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #175 <Method byte[] CraftARQueryImage.toJPEGByteArray()>
	//    7   13:astore_1        
		if(imagedata != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          38
		{
			mNetworkThreadHandler.post(new Runnable() {

				public void run()
				{
					int i = ((SearchParams) (this)).token;
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field CraftARCloudRecognition this$0>
				//    2    4:invokestatic    #42  <Method int CraftARCloudRecognition.access$008(CraftARCloudRecognition)>
				//    3    7:pop             
					SearchParams searchparams = new SearchParams();
				//    4    8:new             #44  <Class SearchParams>
				//    5   11:dup             
				//    6   12:invokespecial   #45  <Method void SearchParams()>
				//    7   15:astore_2        
					searchparams.token = mToken;
				//    8   16:aload_2         
				//    9   17:aload_0         
				//   10   18:getfield        #25  <Field CraftARCloudRecognition this$0>
				//   11   21:invokestatic    #49  <Method String CraftARCloudRecognition.access$100(CraftARCloudRecognition)>
				//   12   24:putfield        #53  <Field String SearchParams.token>
					searchparams.image = imagedata;
				//   13   27:aload_2         
				//   14   28:aload_0         
				//   15   29:getfield        #27  <Field byte[] val$imagedata>
				//   16   32:putfield        #56  <Field byte[] SearchParams.image>
					searchparams.requestBoundingBoxes = mRequestBoundingBoxes;
				//   17   35:aload_2         
				//   18   36:aload_0         
				//   19   37:getfield        #25  <Field CraftARCloudRecognition this$0>
				//   20   40:invokestatic    #60  <Method boolean CraftARCloudRecognition.access$200(CraftARCloudRecognition)>
				//   21   43:putfield        #64  <Field boolean SearchParams.requestBoundingBoxes>
					searchparams.embedCustom = mEmbedCustom;
				//   22   46:aload_2         
				//   23   47:aload_0         
				//   24   48:getfield        #25  <Field CraftARCloudRecognition this$0>
				//   25   51:invokestatic    #67  <Method boolean CraftARCloudRecognition.access$300(CraftARCloudRecognition)>
				//   26   54:putfield        #70  <Field boolean SearchParams.embedCustom>
					boolean flag;
					if((Build.SDK_CODENAME.equals("ARSDK") || Build.SDK_CODENAME.equals("ODIRAR")) && mEmbedTracking)
				//*  27   57:getstatic       #75  <Field String Build.SDK_CODENAME>
				//*  28   60:ldc1            #77  <String "ARSDK">
				//*  29   62:invokevirtual   #83  <Method boolean String.equals(Object)>
				//*  30   65:ifne            79
				//*  31   68:getstatic       #75  <Field String Build.SDK_CODENAME>
				//*  32   71:ldc1            #85  <String "ODIRAR">
				//*  33   73:invokevirtual   #83  <Method boolean String.equals(Object)>
				//*  34   76:ifeq            94
				//*  35   79:aload_0         
				//*  36   80:getfield        #25  <Field CraftARCloudRecognition this$0>
				//*  37   83:invokestatic    #88  <Method boolean CraftARCloudRecognition.access$400(CraftARCloudRecognition)>
				//*  38   86:ifeq            94
						flag = true;
				//   39   89:iconst_1        
				//   40   90:istore_1        
					else
				//*  41   91:goto            96
						flag = false;
				//   42   94:iconst_0        
				//   43   95:istore_1        
					searchparams.embedTrackingData = flag;
				//   44   96:aload_2         
				//   45   97:iload_1         
				//   46   98:putfield        #91  <Field boolean SearchParams.embedTrackingData>
					searchparams.sdkVersion = Build.SDK_VERSION;
				//   47  101:aload_2         
				//   48  102:getstatic       #94  <Field String Build.SDK_VERSION>
				//   49  105:putfield        #97  <Field String SearchParams.sdkVersion>
					if(mContext != null)
				//*  50  108:aload_0         
				//*  51  109:getfield        #25  <Field CraftARCloudRecognition this$0>
				//*  52  112:invokestatic    #101 <Method Context CraftARCloudRecognition.access$500(CraftARCloudRecognition)>
				//*  53  115:ifnull          135
						searchparams.appID = mContext.getApplicationInfo().packageName;
				//   54  118:aload_2         
				//   55  119:aload_0         
				//   56  120:getfield        #25  <Field CraftARCloudRecognition this$0>
				//   57  123:invokestatic    #101 <Method Context CraftARCloudRecognition.access$500(CraftARCloudRecognition)>
				//   58  126:invokevirtual   #107 <Method ApplicationInfo Context.getApplicationInfo()>
				//   59  129:getfield        #112 <Field String ApplicationInfo.packageName>
				//   60  132:putfield        #115 <Field String SearchParams.appID>
					try
					{
						mCRSConnect.search(searchparams, ((CRSConnect.NetworkCallback) (new SearchCallback(mResponseHandler, requestCode, timeStamp))));
				//   61  135:aload_0         
				//   62  136:getfield        #25  <Field CraftARCloudRecognition this$0>
				//   63  139:invokestatic    #119 <Method CRSConnect CraftARCloudRecognition.access$600(CraftARCloudRecognition)>
				//   64  142:aload_2         
				//   65  143:new             #121 <Class CraftARCloudRecognition$SearchCallback>
				//   66  146:dup             
				//   67  147:aload_0         
				//   68  148:getfield        #25  <Field CraftARCloudRecognition this$0>
				//   69  151:aload_0         
				//   70  152:getfield        #25  <Field CraftARCloudRecognition this$0>
				//   71  155:getfield        #125 <Field CraftARSearchResponseHandler CraftARCloudRecognition.mResponseHandler>
				//   72  158:aload_0         
				//   73  159:getfield        #29  <Field int val$requestCode>
				//   74  162:aload_0         
				//   75  163:getfield        #31  <Field long val$timeStamp>
				//   76  166:invokespecial   #128 <Method void CraftARCloudRecognition$SearchCallback(CraftARCloudRecognition, CraftARSearchResponseHandler, int, long)>
				//   77  169:invokevirtual   #133 <Method void CRSConnect.search(SearchParams, CRSConnect$NetworkCallback)>
						return;
				//   78  172:return          
					}
					catch(Exception exception)
				//*  79  173:astore_2        
					{
						exception.printStackTrace();
				//   80  174:aload_2         
				//   81  175:invokevirtual   #136 <Method void Exception.printStackTrace()>
						mResponseHandlerThread.post(((_cls1) (exception)). new Runnable() {

							public void run()
							{
								CraftARError craftarerror = new CraftARError(CraftARError.ERROR_CODES.ERROR_NETWORK, e.getMessage());
							//    0    0:new             #26  <Class CraftARError>
							//    1    3:dup             
							//    2    4:getstatic       #32  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_NETWORK>
							//    3    7:aload_0         
							//    4    8:getfield        #21  <Field Exception val$e>
							//    5   11:invokevirtual   #38  <Method String Exception.getMessage()>
							//    6   14:invokespecial   #41  <Method void CraftARError(CraftARError$ERROR_CODES, String)>
							//    7   17:astore_1        
								if(mResponseHandler != null)
							//*   8   18:aload_0         
							//*   9   19:getfield        #19  <Field CraftARCloudRecognition$1 this$1>
							//*  10   22:getfield        #45  <Field CraftARCloudRecognition CraftARCloudRecognition$1.this$0>
							//*  11   25:getfield        #51  <Field CraftARSearchResponseHandler CraftARCloudRecognition.mResponseHandler>
							//*  12   28:ifnull          55
								{
									mResponseHandler.searchFailed(craftarerror, requestCode);
							//   13   31:aload_0         
							//   14   32:getfield        #19  <Field CraftARCloudRecognition$1 this$1>
							//   15   35:getfield        #45  <Field CraftARCloudRecognition CraftARCloudRecognition$1.this$0>
							//   16   38:getfield        #51  <Field CraftARSearchResponseHandler CraftARCloudRecognition.mResponseHandler>
							//   17   41:aload_1         
							//   18   42:aload_0         
							//   19   43:getfield        #19  <Field CraftARCloudRecognition$1 this$1>
							//   20   46:getfield        #55  <Field int CraftARCloudRecognition$1.val$requestCode>
							//   21   49:invokeinterface #61  <Method void CraftARSearchResponseHandler.searchFailed(CraftARError, int)>
									return;
							//   22   54:return          
								} else
								{
									StringBuilder stringbuilder = new StringBuilder();
							//   23   55:new             #63  <Class StringBuilder>
							//   24   58:dup             
							//   25   59:invokespecial   #64  <Method void StringBuilder()>
							//   26   62:astore_2        
									stringbuilder.append("Search failed : ");
							//   27   63:aload_2         
							//   28   64:ldc1            #66  <String "Search failed : ">
							//   29   66:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
							//   30   69:pop             
									stringbuilder.append(craftarerror.getErrorMessage());
							//   31   70:aload_2         
							//   32   71:aload_1         
							//   33   72:invokevirtual   #73  <Method String CraftARError.getErrorMessage()>
							//   34   75:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
							//   35   78:pop             
									CLog.e(stringbuilder.toString());
							//   36   79:aload_2         
							//   37   80:invokevirtual   #76  <Method String StringBuilder.toString()>
							//   38   83:invokestatic    #82  <Method void CLog.e(String)>
									return;
							//   39   86:return          
								}
							}

							final _cls1 this$1;
							final Exception val$e;

			
			{
				this$1 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CraftARCloudRecognition$1 this$1>
				e = Exception.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Exception val$e>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
						}
);
				//   82  178:aload_0         
				//   83  179:getfield        #25  <Field CraftARCloudRecognition this$0>
				//   84  182:getfield        #140 <Field Handler CraftARCloudRecognition.mResponseHandlerThread>
				//   85  185:new             #13  <Class CraftARCloudRecognition$1$1>
				//   86  188:dup             
				//   87  189:aload_0         
				//   88  190:aload_2         
				//   89  191:invokespecial   #143 <Method void CraftARCloudRecognition$1$1(CraftARCloudRecognition$1, Exception)>
				//   90  194:invokevirtual   #149 <Method boolean Handler.post(Runnable)>
				//   91  197:pop             
						int i = ((SearchParams) (this)).token;
				//   92  198:aload_0         
				//   93  199:getfield        #25  <Field CraftARCloudRecognition this$0>
				//   94  202:invokestatic    #152 <Method int CraftARCloudRecognition.access$010(CraftARCloudRecognition)>
				//   95  205:pop             
						return;
				//   96  206:return          
					}
				}

				final CraftARCloudRecognition this$0;
				final byte val$imagedata[];
				final int val$requestCode;
				final long val$timeStamp;

			
			{
				this$0 = CraftARCloudRecognition.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field CraftARCloudRecognition this$0>
				imagedata = abyte0;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field byte[] val$imagedata>
				requestCode = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #29  <Field int val$requestCode>
				timeStamp = l;
			//    9   15:aload_0         
			//   10   16:lload           4
			//   11   18:putfield        #31  <Field long val$timeStamp>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #34  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//   10   18:aload_0         
	//   11   19:getfield        #98  <Field Handler mNetworkThreadHandler>
	//   12   22:new             #8   <Class CraftARCloudRecognition$1>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:iload_2         
	//   17   29:lload_3         
	//   18   30:invokespecial   #178 <Method void CraftARCloudRecognition$1(CraftARCloudRecognition, byte[], int, long)>
	//   19   33:invokevirtual   #182 <Method boolean Handler.post(Runnable)>
	//   20   36:pop             
			return;
	//   21   37:return          
		} else
		{
			mResponseHandlerThread.post(new Runnable() {

				public void run()
				{
					CraftARError craftarerror = new CraftARError(CraftARError.ERROR_CODES.ERROR_IMAGE_NOT_LOADED, "Query image could not be loaded");
				//    0    0:new             #28  <Class CraftARError>
				//    1    3:dup             
				//    2    4:getstatic       #34  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_IMAGE_NOT_LOADED>
				//    3    7:ldc1            #36  <String "Query image could not be loaded">
				//    4    9:invokespecial   #39  <Method void CraftARError(CraftARError$ERROR_CODES, String)>
				//    5   12:astore_1        
					if(mResponseHandler != null)
				//*   6   13:aload_0         
				//*   7   14:getfield        #19  <Field CraftARCloudRecognition this$0>
				//*   8   17:getfield        #43  <Field CraftARSearchResponseHandler CraftARCloudRecognition.mResponseHandler>
				//*   9   20:ifnull          41
					{
						mResponseHandler.searchFailed(craftarerror, requestCode);
				//   10   23:aload_0         
				//   11   24:getfield        #19  <Field CraftARCloudRecognition this$0>
				//   12   27:getfield        #43  <Field CraftARSearchResponseHandler CraftARCloudRecognition.mResponseHandler>
				//   13   30:aload_1         
				//   14   31:aload_0         
				//   15   32:getfield        #21  <Field int val$requestCode>
				//   16   35:invokeinterface #49  <Method void CraftARSearchResponseHandler.searchFailed(CraftARError, int)>
						return;
				//   17   40:return          
					} else
					{
						CLog.w("No response handler set");
				//   18   41:ldc1            #51  <String "No response handler set">
				//   19   43:invokestatic    #57  <Method void CLog.w(String)>
						StringBuilder stringbuilder = new StringBuilder();
				//   20   46:new             #59  <Class StringBuilder>
				//   21   49:dup             
				//   22   50:invokespecial   #60  <Method void StringBuilder()>
				//   23   53:astore_2        
						stringbuilder.append("Search failed(");
				//   24   54:aload_2         
				//   25   55:ldc1            #62  <String "Search failed(">
				//   26   57:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
				//   27   60:pop             
						stringbuilder.append(((Object) (craftarerror.getErrorCode())));
				//   28   61:aload_2         
				//   29   62:aload_1         
				//   30   63:invokevirtual   #70  <Method CraftARError$ERROR_CODES CraftARError.getErrorCode()>
				//   31   66:invokevirtual   #73  <Method StringBuilder StringBuilder.append(Object)>
				//   32   69:pop             
						stringbuilder.append("):");
				//   33   70:aload_2         
				//   34   71:ldc1            #75  <String "):">
				//   35   73:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
				//   36   76:pop             
						stringbuilder.append(craftarerror.getErrorMessage());
				//   37   77:aload_2         
				//   38   78:aload_1         
				//   39   79:invokevirtual   #79  <Method String CraftARError.getErrorMessage()>
				//   40   82:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
				//   41   85:pop             
						CLog.e(stringbuilder.toString());
				//   42   86:aload_2         
				//   43   87:invokevirtual   #82  <Method String StringBuilder.toString()>
				//   44   90:invokestatic    #85  <Method void CLog.e(String)>
						return;
				//   45   93:return          
					}
				}

				final CraftARCloudRecognition this$0;
				final int val$requestCode;

			
			{
				this$0 = CraftARCloudRecognition.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CraftARCloudRecognition this$0>
				requestCode = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int val$requestCode>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   22   38:aload_0         
	//   23   39:getfield        #81  <Field Handler mResponseHandlerThread>
	//   24   42:new             #12  <Class CraftARCloudRecognition$2>
	//   25   45:dup             
	//   26   46:aload_0         
	//   27   47:iload_2         
	//   28   48:invokespecial   #185 <Method void CraftARCloudRecognition$2(CraftARCloudRecognition, int)>
	//   29   51:invokevirtual   #182 <Method boolean Handler.post(Runnable)>
	//   30   54:pop             
			return;
	//   31   55:return          
		}
	}

	public void setCRSConnect(CRSConnect crsconnect)
	{
		mCRSConnect = crsconnect;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field CRSConnect mCRSConnect>
	//    3    5:return          
	}

	public void setCollection(final String collectionToken, final SetCloudCollectionListener listener)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #191 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #192 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("Setting collection token to ");
	//    4    8:aload_3         
	//    5    9:ldc1            #194 <String "Setting collection token to ">
	//    6   11:invokevirtual   #198 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(collectionToken);
	//    8   15:aload_3         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #198 <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		CLog.i(stringbuilder.toString());
	//   12   21:aload_3         
	//   13   22:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   14   25:invokestatic    #207 <Method void CLog.i(String)>
		mToken = collectionToken;
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:putfield        #137 <Field String mToken>
		mNetworkThreadHandler.post(new Runnable() {

			public void run()
			{
				Object obj = ((Object) (new ConnectParams()));
			//    0    0:new             #34  <Class ConnectParams>
			//    1    3:dup             
			//    2    4:invokespecial   #35  <Method void ConnectParams()>
			//    3    7:astore_1        
				obj.token = collectionToken;
			//    4    8:aload_1         
			//    5    9:aload_0         
			//    6   10:getfield        #23  <Field String val$collectionToken>
			//    7   13:putfield        #38  <Field String ConnectParams.token>
				try
				{
					mCRSConnect.connect(((ConnectParams) (obj)), ((CRSConnect.NetworkCallback) (new ConnectCallback(listener))));
			//    8   16:aload_0         
			//    9   17:getfield        #21  <Field CraftARCloudRecognition this$0>
			//   10   20:invokestatic    #42  <Method CRSConnect CraftARCloudRecognition.access$600(CraftARCloudRecognition)>
			//   11   23:aload_1         
			//   12   24:new             #44  <Class CraftARCloudRecognition$ConnectCallback>
			//   13   27:dup             
			//   14   28:aload_0         
			//   15   29:getfield        #21  <Field CraftARCloudRecognition this$0>
			//   16   32:aload_0         
			//   17   33:getfield        #25  <Field SetCloudCollectionListener val$listener>
			//   18   36:invokespecial   #47  <Method void CraftARCloudRecognition$ConnectCallback(CraftARCloudRecognition, SetCloudCollectionListener)>
			//   19   39:invokevirtual   #53  <Method void CRSConnect.connect(ConnectParams, CRSConnect$NetworkCallback)>
					return;
			//   20   42:return          
				}
				catch(Exception exception)
			//*  21   43:astore_1        
				{
					exception = ((Exception) (new CraftARError(CraftARError.ERROR_CODES.ERROR_NETWORK, exception.getMessage())));
			//   22   44:new             #55  <Class CraftARError>
			//   23   47:dup             
			//   24   48:getstatic       #61  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_NETWORK>
			//   25   51:aload_1         
			//   26   52:invokevirtual   #65  <Method String Exception.getMessage()>
			//   27   55:invokespecial   #68  <Method void CraftARError(CraftARError$ERROR_CODES, String)>
			//   28   58:astore_1        
				}
				SetCloudCollectionListener setcloudcollectionlistener = listener;
			//   29   59:aload_0         
			//   30   60:getfield        #25  <Field SetCloudCollectionListener val$listener>
			//   31   63:astore_2        
				if(setcloudcollectionlistener != null)
			//*  32   64:aload_2         
			//*  33   65:ifnull          76
				{
					setcloudcollectionlistener.setCollectionFailed(((CraftARError) (exception)));
			//   34   68:aload_2         
			//   35   69:aload_1         
			//   36   70:invokeinterface #74  <Method void SetCloudCollectionListener.setCollectionFailed(CraftARError)>
					return;
			//   37   75:return          
				} else
				{
					CLog.e(((CraftARError) (exception)).getErrorMessage());
			//   38   76:aload_1         
			//   39   77:invokevirtual   #77  <Method String CraftARError.getErrorMessage()>
			//   40   80:invokestatic    #83  <Method void CLog.e(String)>
					return;
			//   41   83:return          
				}
			}

			final CraftARCloudRecognition this$0;
			final String val$collectionToken;
			final SetCloudCollectionListener val$listener;

			
			{
				this$0 = CraftARCloudRecognition.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CraftARCloudRecognition this$0>
				collectionToken = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String val$collectionToken>
				listener = setcloudcollectionlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field SetCloudCollectionListener val$listener>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   18   33:aload_0         
	//   19   34:getfield        #98  <Field Handler mNetworkThreadHandler>
	//   20   37:new             #14  <Class CraftARCloudRecognition$3>
	//   21   40:dup             
	//   22   41:aload_0         
	//   23   42:aload_1         
	//   24   43:aload_2         
	//   25   44:invokespecial   #210 <Method void CraftARCloudRecognition$3(CraftARCloudRecognition, String, SetCloudCollectionListener)>
	//   26   47:invokevirtual   #182 <Method boolean Handler.post(Runnable)>
	//   27   50:pop             
	//   28   51:return          
	}

	public void setConnectURL(String s)
	{
		mCRSConnect.setConnectUrl(s);
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field CRSConnect mCRSConnect>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #214 <Method void CRSConnect.setConnectUrl(String)>
	//    4    8:return          
	}

	public void setEmbedCustom(boolean flag)
	{
		mEmbedCustom = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field boolean mEmbedCustom>
	//    3    5:return          
	}

	public void setRequestBoundingBoxes(boolean flag)
	{
		mRequestBoundingBoxes = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field boolean mRequestBoundingBoxes>
	//    3    5:return          
	}

	public void setSearchURL(String s)
	{
		mCRSConnect.setSearchUrl(s);
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field CRSConnect mCRSConnect>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #221 <Method void CRSConnect.setSearchUrl(String)>
	//    4    8:return          
	}

	private static CraftARCloudRecognition self;
	private CRSConnect mCRSConnect;
	private Context mContext;
	private boolean mEmbedCustom;
	private boolean mEmbedTracking;
	private HandlerThread mNetworkThread;
	private Handler mNetworkThreadHandler;
	private int mNumPendingSearches;
	private boolean mRequestBoundingBoxes;
	Handler mResponseHandlerThread;
	private SearchController mSearchController;
	private boolean mSearchesCancelled;
	private String mToken;


/*
	static int access$002(CraftARCloudRecognition craftarcloudrecognition, int i)
	{
		craftarcloudrecognition.mNumPendingSearches = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field int mNumPendingSearches>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$008(CraftARCloudRecognition craftarcloudrecognition)
	{
		int i = craftarcloudrecognition.mNumPendingSearches;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int mNumPendingSearches>
	//    2    4:istore_1        
		craftarcloudrecognition.mNumPendingSearches = i + 1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #53  <Field int mNumPendingSearches>
		return i;
	//    8   12:iload_1         
	//    9   13:ireturn         
	}

*/


/*
	static int access$010(CraftARCloudRecognition craftarcloudrecognition)
	{
		int i = craftarcloudrecognition.mNumPendingSearches;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int mNumPendingSearches>
	//    2    4:istore_1        
		craftarcloudrecognition.mNumPendingSearches = i - 1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_1        
	//    6    8:isub            
	//    7    9:putfield        #53  <Field int mNumPendingSearches>
		return i;
	//    8   12:iload_1         
	//    9   13:ireturn         
	}

*/


/*
	static String access$100(CraftARCloudRecognition craftarcloudrecognition)
	{
		return craftarcloudrecognition.mToken;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field String mToken>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$200(CraftARCloudRecognition craftarcloudrecognition)
	{
		return craftarcloudrecognition.mRequestBoundingBoxes;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean mRequestBoundingBoxes>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$300(CraftARCloudRecognition craftarcloudrecognition)
	{
		return craftarcloudrecognition.mEmbedCustom;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean mEmbedCustom>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$400(CraftARCloudRecognition craftarcloudrecognition)
	{
		return craftarcloudrecognition.mEmbedTracking;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field boolean mEmbedTracking>
	//    2    4:ireturn         
	}

*/


/*
	static Context access$500(CraftARCloudRecognition craftarcloudrecognition)
	{
		return craftarcloudrecognition.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Context mContext>
	//    2    4:areturn         
	}

*/


/*
	static CRSConnect access$600(CraftARCloudRecognition craftarcloudrecognition)
	{
		return craftarcloudrecognition.mCRSConnect;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field CRSConnect mCRSConnect>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$700(CraftARCloudRecognition craftarcloudrecognition)
	{
		return craftarcloudrecognition.mSearchesCancelled;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field boolean mSearchesCancelled>
	//    2    4:ireturn         
	}

*/
}

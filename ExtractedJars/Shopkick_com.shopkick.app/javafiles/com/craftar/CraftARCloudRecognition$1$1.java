// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Handler;

// Referenced classes of package com.craftar:
//			CraftARError, CraftARCloudRecognition, CraftARSearchResponseHandler, CLog, 
//			SearchParams, Build, CRSConnect

class CraftARCloudRecognition$1$1
	implements Runnable
{

	public void run()
	{
		CraftARError craftarerror = new CraftARError(CraftARError.ERROR_CODES.ERROR_NETWORK, val$e.getMessage());
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
			mResponseHandler.searchFailed(craftarerror, val$requestCode);
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

	final CraftARCloudRecognition._cls1 this$1;
	final Exception val$e;

	CraftARCloudRecognition$1$1()
	{
		this$1 = final__pcls1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CraftARCloudRecognition$1 this$1>
		val$e = Exception.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Exception val$e>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}

	// Unreferenced inner class com/craftar/CraftARCloudRecognition$1

/* anonymous class */
	class CraftARCloudRecognition._cls1
		implements Runnable
	{

		public void run()
		{
			int _tmp = CraftARCloudRecognition.access$008(CraftARCloudRecognition.this);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field CraftARCloudRecognition this$0>
		//    2    4:invokestatic    #42  <Method int CraftARCloudRecognition.access$008(CraftARCloudRecognition)>
		//    3    7:pop             
			SearchParams searchparams = new SearchParams();
		//    4    8:new             #44  <Class SearchParams>
		//    5   11:dup             
		//    6   12:invokespecial   #45  <Method void SearchParams()>
		//    7   15:astore_2        
			searchparams.token = CraftARCloudRecognition.access$100(CraftARCloudRecognition.this);
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
			searchparams.requestBoundingBoxes = CraftARCloudRecognition.access$200(CraftARCloudRecognition.this);
		//   17   35:aload_2         
		//   18   36:aload_0         
		//   19   37:getfield        #25  <Field CraftARCloudRecognition this$0>
		//   20   40:invokestatic    #60  <Method boolean CraftARCloudRecognition.access$200(CraftARCloudRecognition)>
		//   21   43:putfield        #64  <Field boolean SearchParams.requestBoundingBoxes>
			searchparams.embedCustom = CraftARCloudRecognition.access$300(CraftARCloudRecognition.this);
		//   22   46:aload_2         
		//   23   47:aload_0         
		//   24   48:getfield        #25  <Field CraftARCloudRecognition this$0>
		//   25   51:invokestatic    #67  <Method boolean CraftARCloudRecognition.access$300(CraftARCloudRecognition)>
		//   26   54:putfield        #70  <Field boolean SearchParams.embedCustom>
			boolean flag;
			if((Build.SDK_CODENAME.equals("ARSDK") || Build.SDK_CODENAME.equals("ODIRAR")) && CraftARCloudRecognition.access$400(CraftARCloudRecognition.this))
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
			if(CraftARCloudRecognition.access$500(CraftARCloudRecognition.this) != null)
		//*  50  108:aload_0         
		//*  51  109:getfield        #25  <Field CraftARCloudRecognition this$0>
		//*  52  112:invokestatic    #101 <Method Context CraftARCloudRecognition.access$500(CraftARCloudRecognition)>
		//*  53  115:ifnull          135
				searchparams.appID = CraftARCloudRecognition.access$500(CraftARCloudRecognition.this).getApplicationInfo().packageName;
		//   54  118:aload_2         
		//   55  119:aload_0         
		//   56  120:getfield        #25  <Field CraftARCloudRecognition this$0>
		//   57  123:invokestatic    #101 <Method Context CraftARCloudRecognition.access$500(CraftARCloudRecognition)>
		//   58  126:invokevirtual   #107 <Method ApplicationInfo Context.getApplicationInfo()>
		//   59  129:getfield        #112 <Field String ApplicationInfo.packageName>
		//   60  132:putfield        #115 <Field String SearchParams.appID>
			try
			{
				CraftARCloudRecognition.access$600(CraftARCloudRecognition.this).search(searchparams, ((CRSConnect.NetworkCallback) (new CraftARCloudRecognition.SearchCallback(CraftARCloudRecognition.this, mResponseHandler, requestCode, timeStamp))));
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
				mResponseHandlerThread.post(((Runnable) (((CraftARCloudRecognition._cls1._cls1) (exception)). new CraftARCloudRecognition._cls1._cls1())));
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
				int _tmp1 = CraftARCloudRecognition.access$010(CraftARCloudRecognition.this);
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
				this$0 = final_craftarcloudrecognition;
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
				timeStamp = J.this;
			//    9   15:aload_0         
			//   10   16:lload           4
			//   11   18:putfield        #31  <Field long val$timeStamp>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #34  <Method void Object()>
			//   14   25:return          
			}
	}

}

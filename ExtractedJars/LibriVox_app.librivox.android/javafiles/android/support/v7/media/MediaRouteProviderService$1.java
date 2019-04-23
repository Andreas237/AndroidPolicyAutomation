// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Intent;
import android.os.Bundle;
import android.os.Messenger;
import android.util.Log;

// Referenced classes of package android.support.v7.media:
//			MediaRouteProviderService

class MediaRouteProviderService$1 extends llback
{

	public void onError(String s, Bundle bundle)
	{
		if(MediaRouteProviderService.DEBUG)
	//*   0    0:getstatic       #41  <Field boolean MediaRouteProviderService.DEBUG>
	//*   1    3:ifeq            98
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #43  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #44  <Method void StringBuilder()>
	//    5   13:astore_3        
			stringbuilder.append(((Object) (val$client)));
	//    6   14:aload_3         
	//    7   15:aload_0         
	//    8   16:getfield        #21  <Field MediaRouteProviderService$ClientRecord val$client>
	//    9   19:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
	//   10   22:pop             
			stringbuilder.append(": Route control request failed");
	//   11   23:aload_3         
	//   12   24:ldc1            #50  <String ": Route control request failed">
	//   13   26:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
			stringbuilder.append(", controllerId=");
	//   15   30:aload_3         
	//   16   31:ldc1            #55  <String ", controllerId=">
	//   17   33:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			stringbuilder.append(val$controllerId);
	//   19   37:aload_3         
	//   20   38:aload_0         
	//   21   39:getfield        #23  <Field int val$controllerId>
	//   22   42:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   23   45:pop             
			stringbuilder.append(", intent=");
	//   24   46:aload_3         
	//   25   47:ldc1            #60  <String ", intent=">
	//   26   49:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
			stringbuilder.append(((Object) (val$intent)));
	//   28   53:aload_3         
	//   29   54:aload_0         
	//   30   55:getfield        #25  <Field Intent val$intent>
	//   31   58:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
	//   32   61:pop             
			stringbuilder.append(", error=");
	//   33   62:aload_3         
	//   34   63:ldc1            #62  <String ", error=">
	//   35   65:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   36   68:pop             
			stringbuilder.append(s);
	//   37   69:aload_3         
	//   38   70:aload_1         
	//   39   71:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   40   74:pop             
			stringbuilder.append(", data=");
	//   41   75:aload_3         
	//   42   76:ldc1            #64  <String ", data=">
	//   43   78:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   44   81:pop             
			stringbuilder.append(((Object) (bundle)));
	//   45   82:aload_3         
	//   46   83:aload_2         
	//   47   84:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
	//   48   87:pop             
			Log.d("MediaRouteProviderSrv", stringbuilder.toString());
	//   49   88:ldc1            #66  <String "MediaRouteProviderSrv">
	//   50   90:aload_3         
	//   51   91:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   52   94:invokestatic    #76  <Method int Log.d(String, String)>
	//   53   97:pop             
		}
		if(findClient(val$messenger) >= 0)
	//*  54   98:aload_0         
	//*  55   99:getfield        #19  <Field MediaRouteProviderService this$0>
	//*  56  102:aload_0         
	//*  57  103:getfield        #27  <Field Messenger val$messenger>
	//*  58  106:invokevirtual   #80  <Method int MediaRouteProviderService.findClient(Messenger)>
	//*  59  109:iflt            162
		{
			if(s != null)
	//*  60  112:aload_1         
	//*  61  113:ifnull          147
			{
				Bundle bundle1 = new Bundle();
	//   62  116:new             #82  <Class Bundle>
	//   63  119:dup             
	//   64  120:invokespecial   #83  <Method void Bundle()>
	//   65  123:astore_3        
				bundle1.putString("error", s);
	//   66  124:aload_3         
	//   67  125:ldc1            #85  <String "error">
	//   68  127:aload_1         
	//   69  128:invokevirtual   #89  <Method void Bundle.putString(String, String)>
				MediaRouteProviderService.sendReply(val$messenger, 4, val$requestId, 0, ((Object) (bundle)), bundle1);
	//   70  131:aload_0         
	//   71  132:getfield        #27  <Field Messenger val$messenger>
	//   72  135:iconst_4        
	//   73  136:aload_0         
	//   74  137:getfield        #29  <Field int val$requestId>
	//   75  140:iconst_0        
	//   76  141:aload_2         
	//   77  142:aload_3         
	//   78  143:invokestatic    #93  <Method void MediaRouteProviderService.sendReply(Messenger, int, int, int, Object, Bundle)>
				return;
	//   79  146:return          
			}
			MediaRouteProviderService.sendReply(val$messenger, 4, val$requestId, 0, ((Object) (bundle)), ((Bundle) (null)));
	//   80  147:aload_0         
	//   81  148:getfield        #27  <Field Messenger val$messenger>
	//   82  151:iconst_4        
	//   83  152:aload_0         
	//   84  153:getfield        #29  <Field int val$requestId>
	//   85  156:iconst_0        
	//   86  157:aload_2         
	//   87  158:aconst_null     
	//   88  159:invokestatic    #93  <Method void MediaRouteProviderService.sendReply(Messenger, int, int, int, Object, Bundle)>
		}
	//   89  162:return          
	}

	public void onResult(Bundle bundle)
	{
		if(MediaRouteProviderService.DEBUG)
	//*   0    0:getstatic       #41  <Field boolean MediaRouteProviderService.DEBUG>
	//*   1    3:ifeq            85
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #43  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #44  <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append(((Object) (val$client)));
	//    6   14:aload_2         
	//    7   15:aload_0         
	//    8   16:getfield        #21  <Field MediaRouteProviderService$ClientRecord val$client>
	//    9   19:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
	//   10   22:pop             
			stringbuilder.append(": Route control request succeeded");
	//   11   23:aload_2         
	//   12   24:ldc1            #97  <String ": Route control request succeeded">
	//   13   26:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
			stringbuilder.append(", controllerId=");
	//   15   30:aload_2         
	//   16   31:ldc1            #55  <String ", controllerId=">
	//   17   33:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			stringbuilder.append(val$controllerId);
	//   19   37:aload_2         
	//   20   38:aload_0         
	//   21   39:getfield        #23  <Field int val$controllerId>
	//   22   42:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   23   45:pop             
			stringbuilder.append(", intent=");
	//   24   46:aload_2         
	//   25   47:ldc1            #60  <String ", intent=">
	//   26   49:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
			stringbuilder.append(((Object) (val$intent)));
	//   28   53:aload_2         
	//   29   54:aload_0         
	//   30   55:getfield        #25  <Field Intent val$intent>
	//   31   58:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
	//   32   61:pop             
			stringbuilder.append(", data=");
	//   33   62:aload_2         
	//   34   63:ldc1            #64  <String ", data=">
	//   35   65:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   36   68:pop             
			stringbuilder.append(((Object) (bundle)));
	//   37   69:aload_2         
	//   38   70:aload_1         
	//   39   71:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
	//   40   74:pop             
			Log.d("MediaRouteProviderSrv", stringbuilder.toString());
	//   41   75:ldc1            #66  <String "MediaRouteProviderSrv">
	//   42   77:aload_2         
	//   43   78:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   44   81:invokestatic    #76  <Method int Log.d(String, String)>
	//   45   84:pop             
		}
		if(findClient(val$messenger) >= 0)
	//*  46   85:aload_0         
	//*  47   86:getfield        #19  <Field MediaRouteProviderService this$0>
	//*  48   89:aload_0         
	//*  49   90:getfield        #27  <Field Messenger val$messenger>
	//*  50   93:invokevirtual   #80  <Method int MediaRouteProviderService.findClient(Messenger)>
	//*  51   96:iflt            114
			MediaRouteProviderService.sendReply(val$messenger, 3, val$requestId, 0, ((Object) (bundle)), ((Bundle) (null)));
	//   52   99:aload_0         
	//   53  100:getfield        #27  <Field Messenger val$messenger>
	//   54  103:iconst_3        
	//   55  104:aload_0         
	//   56  105:getfield        #29  <Field int val$requestId>
	//   57  108:iconst_0        
	//   58  109:aload_1         
	//   59  110:aconst_null     
	//   60  111:invokestatic    #93  <Method void MediaRouteProviderService.sendReply(Messenger, int, int, int, Object, Bundle)>
	//   61  114:return          
	}

	final MediaRouteProviderService this$0;
	final ientRecord val$client;
	final int val$controllerId;
	final Intent val$intent;
	final Messenger val$messenger;
	final int val$requestId;

	MediaRouteProviderService$1()
	{
		this$0 = final_mediarouteproviderservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field MediaRouteProviderService this$0>
		val$client = ientrecord;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field MediaRouteProviderService$ClientRecord val$client>
		val$controllerId = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #23  <Field int val$controllerId>
		val$intent = intent1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #25  <Field Intent val$intent>
		val$messenger = messenger1;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #27  <Field Messenger val$messenger>
		val$requestId = I.this;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #29  <Field int val$requestId>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #32  <Method void MediaRouter$ControlRequestCallback()>
	//   20   37:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.screencast;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Base64OutputStream;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.io.ByteArrayOutputStream;

// Referenced classes of package com.facebook.stetho.inspector.screencast:
//			ScreencastDispatcher

private class ScreencastDispatcher$EventDispatchRunnable
	implements Runnable
{

	private ScreencastDispatcher$EventDispatchRunnable withEndAction(Runnable runnable)
	{
		mEndAction = runnable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field Runnable mEndAction>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void run()
	{
		if(ScreencastDispatcher.access$600(ScreencastDispatcher.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field ScreencastDispatcher this$0>
	//*   2    4:invokestatic    #37  <Method boolean ScreencastDispatcher.access$600(ScreencastDispatcher)>
	//*   3    7:ifeq            220
		{
			if(ScreencastDispatcher.access$800(ScreencastDispatcher.this) == null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #17  <Field ScreencastDispatcher this$0>
	//*   6   14:invokestatic    #41  <Method Bitmap ScreencastDispatcher.access$800(ScreencastDispatcher)>
	//*   7   17:ifnonnull       21
			{
				return;
	//    8   20:return          
			} else
			{
				int i = ScreencastDispatcher.access$800(ScreencastDispatcher.this).getWidth();
	//    9   21:aload_0         
	//   10   22:getfield        #17  <Field ScreencastDispatcher this$0>
	//   11   25:invokestatic    #41  <Method Bitmap ScreencastDispatcher.access$800(ScreencastDispatcher)>
	//   12   28:invokevirtual   #47  <Method int Bitmap.getWidth()>
	//   13   31:istore_1        
				int j = ScreencastDispatcher.access$800(ScreencastDispatcher.this).getHeight();
	//   14   32:aload_0         
	//   15   33:getfield        #17  <Field ScreencastDispatcher this$0>
	//   16   36:invokestatic    #41  <Method Bitmap ScreencastDispatcher.access$800(ScreencastDispatcher)>
	//   17   39:invokevirtual   #50  <Method int Bitmap.getHeight()>
	//   18   42:istore_2        
				ScreencastDispatcher.access$1300(ScreencastDispatcher.this).reset();
	//   19   43:aload_0         
	//   20   44:getfield        #17  <Field ScreencastDispatcher this$0>
	//   21   47:invokestatic    #54  <Method ByteArrayOutputStream ScreencastDispatcher.access$1300(ScreencastDispatcher)>
	//   22   50:invokevirtual   #59  <Method void ByteArrayOutputStream.reset()>
				Base64OutputStream base64outputstream = new Base64OutputStream(((java.io.OutputStream) (ScreencastDispatcher.access$1300(ScreencastDispatcher.this))), 0);
	//   23   53:new             #61  <Class Base64OutputStream>
	//   24   56:dup             
	//   25   57:aload_0         
	//   26   58:getfield        #17  <Field ScreencastDispatcher this$0>
	//   27   61:invokestatic    #54  <Method ByteArrayOutputStream ScreencastDispatcher.access$1300(ScreencastDispatcher)>
	//   28   64:iconst_0        
	//   29   65:invokespecial   #64  <Method void Base64OutputStream(java.io.OutputStream, int)>
	//   30   68:astore_3        
				android.graphics.Bitmap.CompressFormat compressformat = android.graphics.Bitmap.CompressFormat.valueOf(ScreencastDispatcher.access$900(ScreencastDispatcher.this).format.toUpperCase());
	//   31   69:aload_0         
	//   32   70:getfield        #17  <Field ScreencastDispatcher this$0>
	//   33   73:invokestatic    #68  <Method com.facebook.stetho.inspector.protocol.module.Page$StartScreencastRequest ScreencastDispatcher.access$900(ScreencastDispatcher)>
	//   34   76:getfield        #74  <Field String com.facebook.stetho.inspector.protocol.module.Page$StartScreencastRequest.format>
	//   35   79:invokevirtual   #80  <Method String String.toUpperCase()>
	//   36   82:invokestatic    #86  <Method android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.valueOf(String)>
	//   37   85:astore          4
				ScreencastDispatcher.access$800(ScreencastDispatcher.this).compress(compressformat, ScreencastDispatcher.access$900(ScreencastDispatcher.this).quality, ((java.io.OutputStream) (base64outputstream)));
	//   38   87:aload_0         
	//   39   88:getfield        #17  <Field ScreencastDispatcher this$0>
	//   40   91:invokestatic    #41  <Method Bitmap ScreencastDispatcher.access$800(ScreencastDispatcher)>
	//   41   94:aload           4
	//   42   96:aload_0         
	//   43   97:getfield        #17  <Field ScreencastDispatcher this$0>
	//   44  100:invokestatic    #68  <Method com.facebook.stetho.inspector.protocol.module.Page$StartScreencastRequest ScreencastDispatcher.access$900(ScreencastDispatcher)>
	//   45  103:getfield        #90  <Field int com.facebook.stetho.inspector.protocol.module.Page$StartScreencastRequest.quality>
	//   46  106:aload_3         
	//   47  107:invokevirtual   #94  <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
	//   48  110:pop             
				ScreencastDispatcher.access$1400(ScreencastDispatcher.this).data = ScreencastDispatcher.access$1300(ScreencastDispatcher.this).toString();
	//   49  111:aload_0         
	//   50  112:getfield        #17  <Field ScreencastDispatcher this$0>
	//   51  115:invokestatic    #98  <Method com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEvent ScreencastDispatcher.access$1400(ScreencastDispatcher)>
	//   52  118:aload_0         
	//   53  119:getfield        #17  <Field ScreencastDispatcher this$0>
	//   54  122:invokestatic    #54  <Method ByteArrayOutputStream ScreencastDispatcher.access$1300(ScreencastDispatcher)>
	//   55  125:invokevirtual   #101 <Method String ByteArrayOutputStream.toString()>
	//   56  128:putfield        #106 <Field String com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEvent.data>
				ScreencastDispatcher.access$1500(ScreencastDispatcher.this).pageScaleFactor = 1;
	//   57  131:aload_0         
	//   58  132:getfield        #17  <Field ScreencastDispatcher this$0>
	//   59  135:invokestatic    #110 <Method com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata ScreencastDispatcher.access$1500(ScreencastDispatcher)>
	//   60  138:iconst_1        
	//   61  139:putfield        #115 <Field int com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata.pageScaleFactor>
				ScreencastDispatcher.access$1500(ScreencastDispatcher.this).deviceWidth = i;
	//   62  142:aload_0         
	//   63  143:getfield        #17  <Field ScreencastDispatcher this$0>
	//   64  146:invokestatic    #110 <Method com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata ScreencastDispatcher.access$1500(ScreencastDispatcher)>
	//   65  149:iload_1         
	//   66  150:putfield        #118 <Field int com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata.deviceWidth>
				ScreencastDispatcher.access$1500(ScreencastDispatcher.this).deviceHeight = j;
	//   67  153:aload_0         
	//   68  154:getfield        #17  <Field ScreencastDispatcher this$0>
	//   69  157:invokestatic    #110 <Method com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata ScreencastDispatcher.access$1500(ScreencastDispatcher)>
	//   70  160:iload_2         
	//   71  161:putfield        #121 <Field int com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata.deviceHeight>
				ScreencastDispatcher.access$1400(ScreencastDispatcher.this).metadata = ScreencastDispatcher.access$1500(ScreencastDispatcher.this);
	//   72  164:aload_0         
	//   73  165:getfield        #17  <Field ScreencastDispatcher this$0>
	//   74  168:invokestatic    #98  <Method com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEvent ScreencastDispatcher.access$1400(ScreencastDispatcher)>
	//   75  171:aload_0         
	//   76  172:getfield        #17  <Field ScreencastDispatcher this$0>
	//   77  175:invokestatic    #110 <Method com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata ScreencastDispatcher.access$1500(ScreencastDispatcher)>
	//   78  178:putfield        #125 <Field com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEventMetadata com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEvent.metadata>
				ScreencastDispatcher.access$1600(ScreencastDispatcher.this).invokeMethod("Page.screencastFrame", ((Object) (ScreencastDispatcher.access$1400(ScreencastDispatcher.this))), ((com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback) (null)));
	//   79  181:aload_0         
	//   80  182:getfield        #17  <Field ScreencastDispatcher this$0>
	//   81  185:invokestatic    #129 <Method JsonRpcPeer ScreencastDispatcher.access$1600(ScreencastDispatcher)>
	//   82  188:ldc1            #131 <String "Page.screencastFrame">
	//   83  190:aload_0         
	//   84  191:getfield        #17  <Field ScreencastDispatcher this$0>
	//   85  194:invokestatic    #98  <Method com.facebook.stetho.inspector.protocol.module.Page$ScreencastFrameEvent ScreencastDispatcher.access$1400(ScreencastDispatcher)>
	//   86  197:aconst_null     
	//   87  198:invokevirtual   #137 <Method void JsonRpcPeer.invokeMethod(String, Object, com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback)>
				ScreencastDispatcher.access$1700(ScreencastDispatcher.this).postDelayed(mEndAction, 200L);
	//   88  201:aload_0         
	//   89  202:getfield        #17  <Field ScreencastDispatcher this$0>
	//   90  205:invokestatic    #141 <Method Handler ScreencastDispatcher.access$1700(ScreencastDispatcher)>
	//   91  208:aload_0         
	//   92  209:getfield        #32  <Field Runnable mEndAction>
	//   93  212:ldc2w           #142 <Long 200L>
	//   94  215:invokevirtual   #149 <Method boolean Handler.postDelayed(Runnable, long)>
	//   95  218:pop             
				return;
	//   96  219:return          
			}
		} else
		{
			return;
	//   97  220:return          
		}
	}

	private Runnable mEndAction;
	final ScreencastDispatcher this$0;


/*
	static ScreencastDispatcher$EventDispatchRunnable access$400(ScreencastDispatcher$EventDispatchRunnable screencastdispatcher$eventdispatchrunnable, Runnable runnable)
	{
		return screencastdispatcher$eventdispatchrunnable.withEndAction(runnable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method ScreencastDispatcher$EventDispatchRunnable withEndAction(Runnable)>
	//    3    5:areturn         
	}

*/

	private ScreencastDispatcher$EventDispatchRunnable()
	{
		this$0 = ScreencastDispatcher.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ScreencastDispatcher this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	ScreencastDispatcher$EventDispatchRunnable(ScreencastDispatcher._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void ScreencastDispatcher$EventDispatchRunnable(ScreencastDispatcher)>
	//    3    5:return          
	}
}

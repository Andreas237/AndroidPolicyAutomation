// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.content.*;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;

// Referenced classes of package com.facebook.share.widget:
//			LikeView

private class LikeView$LikeControllerBroadcastReceiver extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		context = ((Context) (intent.getAction()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #28  <Method String Intent.getAction()>
	//    2    4:astore_1        
		intent = ((Intent) (intent.getExtras()));
	//    3    5:aload_2         
	//    4    6:invokevirtual   #32  <Method Bundle Intent.getExtras()>
	//    5    9:astore_2        
		boolean flag1 = true;
	//    6   10:iconst_1        
	//    7   11:istore          4
		boolean flag = flag1;
	//    8   13:iload           4
	//    9   15:istore_3        
		if(intent != null)
	//*  10   16:aload_2         
	//*  11   17:ifnull          62
		{
			String s = ((Bundle) (intent)).getString("com.facebook.sdk.LikeActionController.OBJECT_ID");
	//   12   20:aload_2         
	//   13   21:ldc1            #34  <String "com.facebook.sdk.LikeActionController.OBJECT_ID">
	//   14   23:invokevirtual   #40  <Method String Bundle.getString(String)>
	//   15   26:astore          5
			flag = flag1;
	//   16   28:iload           4
	//   17   30:istore_3        
			if(!Utility.isNullOrEmpty(s))
	//*  18   31:aload           5
	//*  19   33:invokestatic    #46  <Method boolean Utility.isNullOrEmpty(String)>
	//*  20   36:ifne            62
				if(Utility.areObjectsEqual(((Object) (LikeView.access$600(LikeView.this))), ((Object) (s))))
	//*  21   39:aload_0         
	//*  22   40:getfield        #13  <Field LikeView this$0>
	//*  23   43:invokestatic    #50  <Method String LikeView.access$600(LikeView)>
	//*  24   46:aload           5
	//*  25   48:invokestatic    #54  <Method boolean Utility.areObjectsEqual(Object, Object)>
	//*  26   51:ifeq            60
					flag = flag1;
	//   27   54:iload           4
	//   28   56:istore_3        
				else
	//*  29   57:goto            62
					flag = false;
	//   30   60:iconst_0        
	//   31   61:istore_3        
		}
		if(!flag)
	//*  32   62:iload_3         
	//*  33   63:ifne            67
			return;
	//   34   66:return          
		if("com.facebook.sdk.LikeActionController.UPDATED".equals(((Object) (context))))
	//*  35   67:ldc1            #56  <String "com.facebook.sdk.LikeActionController.UPDATED">
	//*  36   69:aload_1         
	//*  37   70:invokevirtual   #62  <Method boolean String.equals(Object)>
	//*  38   73:ifeq            84
		{
			LikeView.access$700(LikeView.this);
	//   39   76:aload_0         
	//   40   77:getfield        #13  <Field LikeView this$0>
	//   41   80:invokestatic    #65  <Method void LikeView.access$700(LikeView)>
			return;
	//   42   83:return          
		}
		if("com.facebook.sdk.LikeActionController.DID_ERROR".equals(((Object) (context))))
	//*  43   84:ldc1            #67  <String "com.facebook.sdk.LikeActionController.DID_ERROR">
	//*  44   86:aload_1         
	//*  45   87:invokevirtual   #62  <Method boolean String.equals(Object)>
	//*  46   90:ifeq            120
		{
			if(LikeView.access$800(LikeView.this) != null)
	//*  47   93:aload_0         
	//*  48   94:getfield        #13  <Field LikeView this$0>
	//*  49   97:invokestatic    #71  <Method LikeView$OnErrorListener LikeView.access$800(LikeView)>
	//*  50  100:ifnull          156
			{
				LikeView.access$800(LikeView.this).onError(NativeProtocol.getExceptionFromErrorData(((Bundle) (intent))));
	//   51  103:aload_0         
	//   52  104:getfield        #13  <Field LikeView this$0>
	//   53  107:invokestatic    #71  <Method LikeView$OnErrorListener LikeView.access$800(LikeView)>
	//   54  110:aload_2         
	//   55  111:invokestatic    #77  <Method com.facebook.FacebookException NativeProtocol.getExceptionFromErrorData(Bundle)>
	//   56  114:invokeinterface #83  <Method void LikeView$OnErrorListener.onError(com.facebook.FacebookException)>
				return;
	//   57  119:return          
			}
		} else
		if("com.facebook.sdk.LikeActionController.DID_RESET".equals(((Object) (context))))
	//*  58  120:ldc1            #85  <String "com.facebook.sdk.LikeActionController.DID_RESET">
	//*  59  122:aload_1         
	//*  60  123:invokevirtual   #62  <Method boolean String.equals(Object)>
	//*  61  126:ifeq            156
		{
			context = ((Context) (LikeView.this));
	//   62  129:aload_0         
	//   63  130:getfield        #13  <Field LikeView this$0>
	//   64  133:astore_1        
			LikeView.access$1000(((LikeView) (context)), LikeView.access$600(((LikeView) (context))), LikeView.access$900(LikeView.this));
	//   65  134:aload_1         
	//   66  135:aload_1         
	//   67  136:invokestatic    #50  <Method String LikeView.access$600(LikeView)>
	//   68  139:aload_0         
	//   69  140:getfield        #13  <Field LikeView this$0>
	//   70  143:invokestatic    #89  <Method LikeView$ObjectType LikeView.access$900(LikeView)>
	//   71  146:invokestatic    #93  <Method void LikeView.access$1000(LikeView, String, LikeView$ObjectType)>
			LikeView.access$700(LikeView.this);
	//   72  149:aload_0         
	//   73  150:getfield        #13  <Field LikeView this$0>
	//   74  153:invokestatic    #65  <Method void LikeView.access$700(LikeView)>
		}
	//   75  156:return          
	}

	final LikeView this$0;

	private LikeView$LikeControllerBroadcastReceiver()
	{
		this$0 = LikeView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field LikeView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void BroadcastReceiver()>
	//    5    9:return          
	}

	LikeView$LikeControllerBroadcastReceiver(LikeView._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void LikeView$LikeControllerBroadcastReceiver(LikeView)>
	//    3    5:return          
	}
}

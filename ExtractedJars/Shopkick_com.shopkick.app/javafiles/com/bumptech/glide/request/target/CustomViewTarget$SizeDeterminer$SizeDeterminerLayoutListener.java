// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.util.Log;
import java.lang.ref.WeakReference;

// Referenced classes of package com.bumptech.glide.request.target:
//			CustomViewTarget

private static final class CustomViewTarget$SizeDeterminer$SizeDeterminerLayoutListener
	implements android.view.ViewTreeObserver.OnPreDrawListener
{

	public boolean onPreDraw()
	{
		if(Log.isLoggable("CustomViewTarget", 2))
	//*   0    0:ldc1            #34  <String "CustomViewTarget">
	//*   1    2:iconst_2        
	//*   2    3:invokestatic    #40  <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            40
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    9:new             #42  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #43  <Method void StringBuilder()>
	//    7   16:astore_1        
			stringbuilder.append("OnGlobalLayoutListener called attachStateListener=");
	//    8   17:aload_1         
	//    9   18:ldc1            #45  <String "OnGlobalLayoutListener called attachStateListener=">
	//   10   20:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(((Object) (this)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
	//   15   29:pop             
			Log.v("CustomViewTarget", stringbuilder.toString());
	//   16   30:ldc1            #34  <String "CustomViewTarget">
	//   17   32:aload_1         
	//   18   33:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   19   36:invokestatic    #60  <Method int Log.v(String, String)>
	//   20   39:pop             
		}
		CustomViewTarget.SizeDeterminer sizedeterminer = (CustomViewTarget.SizeDeterminer)sizeDeterminerRef.get();
	//   21   40:aload_0         
	//   22   41:getfield        #28  <Field WeakReference sizeDeterminerRef>
	//   23   44:invokevirtual   #64  <Method Object WeakReference.get()>
	//   24   47:checkcast       #8   <Class CustomViewTarget$SizeDeterminer>
	//   25   50:astore_1        
		if(sizedeterminer != null)
	//*  26   51:aload_1         
	//*  27   52:ifnull          59
			sizedeterminer.checkCurrentDimens();
	//   28   55:aload_1         
	//   29   56:invokevirtual   #67  <Method void CustomViewTarget$SizeDeterminer.checkCurrentDimens()>
		return true;
	//   30   59:iconst_1        
	//   31   60:ireturn         
	}

	private final WeakReference sizeDeterminerRef;

	CustomViewTarget$SizeDeterminer$SizeDeterminerLayoutListener(CustomViewTarget.SizeDeterminer sizedeterminer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		sizeDeterminerRef = new WeakReference(((Object) (sizedeterminer)));
	//    2    4:aload_0         
	//    3    5:new             #23  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #26  <Method void WeakReference(Object)>
	//    7   13:putfield        #28  <Field WeakReference sizeDeterminerRef>
	//    8   16:return          
	}
}

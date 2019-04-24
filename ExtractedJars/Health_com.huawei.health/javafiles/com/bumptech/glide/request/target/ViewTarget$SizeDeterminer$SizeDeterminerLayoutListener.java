// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.util.Log;
import java.lang.ref.WeakReference;

// Referenced classes of package com.bumptech.glide.request.target:
//			ViewTarget

static class ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener
	implements android.view.ViewTreeObserver.OnPreDrawListener
{

	public boolean onPreDraw()
	{
		if(Log.isLoggable("ViewTarget", 2))
	//*   0    0:ldc1            #32  <String "ViewTarget">
	//*   1    2:iconst_2        
	//*   2    3:invokestatic    #38  <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            34
			Log.v("ViewTarget", (new StringBuilder()).append("OnGlobalLayoutListener called listener=").append(((Object) (this))).toString());
	//    4    9:ldc1            #32  <String "ViewTarget">
	//    5   11:new             #40  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #41  <Method void StringBuilder()>
	//    8   18:ldc1            #43  <String "OnGlobalLayoutListener called listener=">
	//    9   20:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_0         
	//   11   24:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
	//   12   27:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   13   30:invokestatic    #58  <Method int Log.v(String, String)>
	//   14   33:pop             
		ViewTarget.SizeDeterminer sizedeterminer = (ViewTarget.SizeDeterminer)sizeDeterminerRef.get();
	//   15   34:aload_0         
	//   16   35:getfield        #27  <Field WeakReference sizeDeterminerRef>
	//   17   38:invokevirtual   #62  <Method Object WeakReference.get()>
	//   18   41:checkcast       #8   <Class ViewTarget$SizeDeterminer>
	//   19   44:astore_1        
		if(sizedeterminer != null)
	//*  20   45:aload_1         
	//*  21   46:ifnull          53
			sizedeterminer.checkCurrentDimens();
	//   22   49:aload_1         
	//   23   50:invokevirtual   #65  <Method void ViewTarget$SizeDeterminer.checkCurrentDimens()>
		return true;
	//   24   53:iconst_1        
	//   25   54:ireturn         
	}

	private final WeakReference sizeDeterminerRef;

	ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener(ViewTarget.SizeDeterminer sizedeterminer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		sizeDeterminerRef = new WeakReference(((Object) (sizedeterminer)));
	//    2    4:aload_0         
	//    3    5:new             #22  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #25  <Method void WeakReference(Object)>
	//    7   13:putfield        #27  <Field WeakReference sizeDeterminerRef>
	//    8   16:return          
	}
}

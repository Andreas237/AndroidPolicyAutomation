// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.view.PointerIcon;

public final class PointerIconCompat
{

	private PointerIconCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		mPointerIcon = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Object mPointerIcon>
	//    5    9:return          
	}

	public static PointerIconCompat getSystemIcon(Context context, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #22  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          21
			return new PointerIconCompat(((Object) (PointerIcon.getSystemIcon(context, i))));
	//    3    8:new             #2   <Class PointerIconCompat>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:iload_1         
	//    7   14:invokestatic    #27  <Method PointerIcon PointerIcon.getSystemIcon(Context, int)>
	//    8   17:invokespecial   #29  <Method void PointerIconCompat(Object)>
	//    9   20:areturn         
		else
			return new PointerIconCompat(((Object) (null)));
	//   10   21:new             #2   <Class PointerIconCompat>
	//   11   24:dup             
	//   12   25:aconst_null     
	//   13   26:invokespecial   #29  <Method void PointerIconCompat(Object)>
	//   14   29:areturn         
	}

	public Object getPointerIcon()
	{
		return mPointerIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Object mPointerIcon>
	//    2    4:areturn         
	}

	private Object mPointerIcon;
}

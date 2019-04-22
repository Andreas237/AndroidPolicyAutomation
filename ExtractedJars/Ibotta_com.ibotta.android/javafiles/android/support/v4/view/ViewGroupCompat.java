// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.ViewGroup;

// Referenced classes of package android.support.v4.view:
//			ViewCompat

public final class ViewGroupCompat
{

	public static boolean isTransitionGroup(ViewGroup viewgroup)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #13  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return viewgroup.isTransitionGroup();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #18  <Method boolean ViewGroup.isTransitionGroup()>
	//    5   12:ireturn         
		Boolean boolean1 = (Boolean)viewgroup.getTag(android.support.compat.R.id.tag_transition_group);
	//    6   13:aload_0         
	//    7   14:getstatic       #23  <Field int android.support.compat.R$id.tag_transition_group>
	//    8   17:invokevirtual   #27  <Method Object ViewGroup.getTag(int)>
	//    9   20:checkcast       #29  <Class Boolean>
	//   10   23:astore_1        
		return boolean1 != null && boolean1.booleanValue() || viewgroup.getBackground() != null || ViewCompat.getTransitionName(((android.view.View) (viewgroup))) != null;
	//   11   24:aload_1         
	//   12   25:ifnull          35
	//   13   28:aload_1         
	//   14   29:invokevirtual   #32  <Method boolean Boolean.booleanValue()>
	//   15   32:ifne            54
	//   16   35:aload_0         
	//   17   36:invokevirtual   #36  <Method android.graphics.drawable.Drawable ViewGroup.getBackground()>
	//   18   39:ifnonnull       54
	//   19   42:aload_0         
	//   20   43:invokestatic    #42  <Method String ViewCompat.getTransitionName(android.view.View)>
	//   21   46:ifnull          52
	//   22   49:goto            54
	//   23   52:iconst_0        
	//   24   53:ireturn         
	//   25   54:iconst_1        
	//   26   55:ireturn         
	}
}

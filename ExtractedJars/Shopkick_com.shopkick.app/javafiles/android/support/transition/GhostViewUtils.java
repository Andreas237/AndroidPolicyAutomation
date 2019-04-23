// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			GhostViewApi21, GhostViewApi14, GhostViewImpl

class GhostViewUtils
{

	private GhostViewUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	static GhostViewImpl addGhost(View view, ViewGroup viewgroup, Matrix matrix)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          15
			return GhostViewApi21.addGhost(view, viewgroup, matrix);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:invokestatic    #21  <Method GhostViewImpl GhostViewApi21.addGhost(View, ViewGroup, Matrix)>
	//    7   14:areturn         
		else
			return GhostViewApi14.addGhost(view, viewgroup);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokestatic    #26  <Method GhostViewImpl GhostViewApi14.addGhost(View, ViewGroup)>
	//   11   20:areturn         
	}

	static void removeGhost(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
		{
			GhostViewApi21.removeGhost(view);
	//    3    8:aload_0         
	//    4    9:invokestatic    #30  <Method void GhostViewApi21.removeGhost(View)>
			return;
	//    5   12:return          
		} else
		{
			GhostViewApi14.removeGhost(view);
	//    6   13:aload_0         
	//    7   14:invokestatic    #31  <Method void GhostViewApi14.removeGhost(View)>
			return;
	//    8   17:return          
		}
	}
}

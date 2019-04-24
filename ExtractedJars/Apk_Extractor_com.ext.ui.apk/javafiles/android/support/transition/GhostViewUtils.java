// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			GhostViewImpl

class GhostViewUtils
{

	GhostViewUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	static GhostViewImpl addGhost(View view, ViewGroup viewgroup, Matrix matrix)
	{
		return CREATOR.addGhost(view, viewgroup, matrix);
	//    0    0:getstatic       #21  <Field GhostViewImpl$Creator CREATOR>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #32  <Method GhostViewImpl GhostViewImpl$Creator.addGhost(View, ViewGroup, Matrix)>
	//    5   11:areturn         
	}

	static void removeGhost(View view)
	{
		CREATOR.removeGhost(view);
	//    0    0:getstatic       #21  <Field GhostViewImpl$Creator CREATOR>
	//    1    3:aload_0         
	//    2    4:invokeinterface #36  <Method void GhostViewImpl$Creator.removeGhost(View)>
	//    3    9:return          
	}

	private static final GhostViewImpl.Creator CREATOR;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			CREATOR = ((GhostViewImpl.Creator) (new GhostViewApi21.Creator()));
	//    3    8:new             #16  <Class GhostViewApi21$Creator>
	//    4   11:dup             
	//    5   12:invokespecial   #19  <Method void GhostViewApi21$Creator()>
	//    6   15:putstatic       #21  <Field GhostViewImpl$Creator CREATOR>
	//    7   18:return          
		else
			CREATOR = ((GhostViewImpl.Creator) (new GhostViewApi14.Creator()));
	//    8   19:new             #23  <Class GhostViewApi14$Creator>
	//    9   22:dup             
	//   10   23:invokespecial   #24  <Method void GhostViewApi14$Creator()>
	//   11   26:putstatic       #21  <Field GhostViewImpl$Creator CREATOR>
	//*  12   29:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.app.Presentation;
import android.content.Context;
import android.view.Display;
import android.view.Window;

public class CastPresentation extends Presentation
{

	public CastPresentation(Context context, Display display)
	{
		super(context, display);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void Presentation(Context, Display)>
		zza();
	//    4    6:aload_0         
	//    5    7:invokespecial   #15  <Method void zza()>
	//    6   10:return          
	}

	public CastPresentation(Context context, Display display, int i)
	{
		super(context, display, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #19  <Method void Presentation(Context, Display, int)>
		zza();
	//    5    7:aload_0         
	//    6    8:invokespecial   #15  <Method void zza()>
	//    7   11:return          
	}

	private final void zza()
	{
		Window window = getWindow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method Window getWindow()>
	//    2    4:astore_1        
		if(window != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          35
		{
			window.setType(2030);
	//    5    9:aload_1         
	//    6   10:sipush          2030
	//    7   13:invokevirtual   #29  <Method void Window.setType(int)>
			window.addFlags(0x10000000);
	//    8   16:aload_1         
	//    9   17:ldc1            #30  <Int 0x10000000>
	//   10   19:invokevirtual   #33  <Method void Window.addFlags(int)>
			window.addFlags(0x1000000);
	//   11   22:aload_1         
	//   12   23:ldc1            #34  <Int 0x1000000>
	//   13   25:invokevirtual   #33  <Method void Window.addFlags(int)>
			window.addFlags(1024);
	//   14   28:aload_1         
	//   15   29:sipush          1024
	//   16   32:invokevirtual   #33  <Method void Window.addFlags(int)>
		}
	//   17   35:return          
	}
}

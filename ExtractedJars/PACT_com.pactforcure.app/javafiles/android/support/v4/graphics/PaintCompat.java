// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.graphics.Paint;

// Referenced classes of package android.support.v4.graphics:
//			PaintCompatApi14

public final class PaintCompat
{

	private PaintCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static boolean hasGlyph(Paint paint, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
			return paint.hasGlyph(s);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #23  <Method boolean Paint.hasGlyph(String)>
	//    6   13:ireturn         
		else
			return PaintCompatApi14.hasGlyph(paint, s);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokestatic    #27  <Method boolean PaintCompatApi14.hasGlyph(Paint, String)>
	//   10   19:ireturn         
	}
}

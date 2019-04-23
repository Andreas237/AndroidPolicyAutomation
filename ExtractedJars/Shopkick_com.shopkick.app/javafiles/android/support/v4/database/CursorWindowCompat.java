// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.database;

import android.database.CursorWindow;

public final class CursorWindowCompat
{

	private CursorWindowCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static CursorWindow create(String s, long l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          18
			return new CursorWindow(s, l);
	//    3    8:new             #21  <Class CursorWindow>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:lload_1         
	//    7   14:invokespecial   #24  <Method void CursorWindow(String, long)>
	//    8   17:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 15)
	//*   9   18:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   21:bipush          15
	//*  11   23:icmplt          35
			return new CursorWindow(s);
	//   12   26:new             #21  <Class CursorWindow>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:invokespecial   #27  <Method void CursorWindow(String)>
	//   16   34:areturn         
		else
			return new CursorWindow(false);
	//   17   35:new             #21  <Class CursorWindow>
	//   18   38:dup             
	//   19   39:iconst_0        
	//   20   40:invokespecial   #30  <Method void CursorWindow(boolean)>
	//   21   43:areturn         
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bmp

public class bmt extends IOException
{

	public bmt(IOException ioexception, bmp bmp, int i)
	{
		super(((Throwable) (ioexception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void IOException(Throwable)>
		b = bmp;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #15  <Field bmp b>
		a = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #17  <Field int a>
	//    9   15:return          
	}

	public bmt(String s, bmp bmp, int i)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void IOException(String)>
		b = bmp;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #15  <Field bmp b>
		a = 1;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #17  <Field int a>
	//    9   15:return          
	}

	public bmt(String s, IOException ioexception, bmp bmp, int i)
	{
		super(s, ((Throwable) (ioexception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void IOException(String, Throwable)>
		b = bmp;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #15  <Field bmp b>
		a = 1;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #17  <Field int a>
	//   10   16:return          
	}

	private final int a;
	private final bmp b;
}

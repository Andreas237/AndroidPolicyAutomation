// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bgc, bgd, bge, bfo

final class bgf
	implements bgc
{

	private bgf(bgd bgd1)
	{
		a = bgd1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bgd a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	bgf(bgd bgd1, bge bge)
	{
		this(bgd1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void bgf(bgd)>
	//    3    5:return          
	}

	public final int a(int i)
	{
		return bgd.a(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #24  <Method int bgd.a(int)>
	//    2    4:ireturn         
	}

	public final void a(int i, double d)
	{
		a.a(i, d);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field bgd a>
	//    2    4:iload_1         
	//    3    5:dload_2         
	//    4    6:invokevirtual   #27  <Method void bgd.a(int, double)>
	//    5    9:return          
	}

	public final void a(int i, int j, bfo bfo)
	{
		a.a(i, j, bfo);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field bgd a>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #30  <Method void bgd.a(int, int, bfo)>
	//    6   10:return          
	}

	public final void a(int i, long l)
	{
		a.a(i, l);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field bgd a>
	//    2    4:iload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #33  <Method void bgd.a(int, long)>
	//    5    9:return          
	}

	public final void a(int i, long l, long l1)
	{
		a.a(i, l, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field bgd a>
	//    2    4:iload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokevirtual   #36  <Method void bgd.a(int, long, long)>
	//    6   11:return          
	}

	public final void a(int i, String s)
	{
		a.a(i, s);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field bgd a>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method void bgd.a(int, String)>
	//    5    9:return          
	}

	public final boolean b(int i)
	{
		return bgd.b(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #43  <Method boolean bgd.b(int)>
	//    2    4:ireturn         
	}

	public final void c(int i)
	{
		a.c(i);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field bgd a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #47  <Method void bgd.c(int)>
	//    4    8:return          
	}

	private final bgd a;
}

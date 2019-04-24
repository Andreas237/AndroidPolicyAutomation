// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			b, au, fo

class b$b$2
	implements Runnable
{

	public void run()
	{
		try
		{
			a.a(b.a.d.floor_names);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field fo a>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field b$b b>
	//    4    8:getfield        #32  <Field b b$b.a>
	//    5   11:getfield        #36  <Field au b.d>
	//    6   14:getfield        #42  <Field String[] au.floor_names>
	//    7   17:invokevirtual   #47  <Method void fo.a(String[])>
			a.a(b.a.d.activeFloorName);
	//    8   20:aload_0         
	//    9   21:getfield        #22  <Field fo a>
	//   10   24:aload_0         
	//   11   25:getfield        #20  <Field b$b b>
	//   12   28:getfield        #32  <Field b b$b.a>
	//   13   31:getfield        #36  <Field au b.d>
	//   14   34:getfield        #51  <Field String au.activeFloorName>
	//   15   37:invokevirtual   #54  <Method void fo.a(String)>
			if(!a.d())
	//*  16   40:aload_0         
	//*  17   41:getfield        #22  <Field fo a>
	//*  18   44:invokevirtual   #57  <Method boolean fo.d()>
	//*  19   47:ifne            58
				a.a(true);
	//   20   50:aload_0         
	//   21   51:getfield        #22  <Field fo a>
	//   22   54:iconst_1        
	//   23   55:invokevirtual   #60  <Method void fo.a(boolean)>
			return;
	//   24   58:return          
		}
		catch(Throwable throwable)
	//*  25   59:astore_1        
		{
			throwable.printStackTrace();
	//   26   60:aload_1         
	//   27   61:invokevirtual   #63  <Method void Throwable.printStackTrace()>
		}
	//   28   64:return          
	}

	final fo a;
	final b.b b;

	b$b$2(b.b b1, fo fo1)
	{
		b = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field b$b b>
		a = fo1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field fo a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			ed, fg

protected class fg$b extends ed
{

	protected Object a(Object aobj[])
	{
		return ((Object) (d(aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #23  <Method Void d(Object[])>
	//    3    5:areturn         
	}

	protected transient Void d(Object aobj[])
	{
		((Integer)aobj[0]).intValue();
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:aaload          
	//    3    3:checkcast       #27  <Class Integer>
	//    4    6:invokevirtual   #31  <Method int Integer.intValue()>
		JVM INSTR tableswitch 0 4: default 110
	//	               0 44
	//	               1 54
	//	               2 64
	//	               3 74
	//	               4 93;
	//    5    9:tableswitch     0 4: default 110
	//	               0 44
	//	               1 54
	//	               2 64
	//	               3 74
	//	               4 93
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
		break; /* Loop/switch isn't completed */
_L2:
		d.c();
	//    6   44:aload_0         
	//    7   45:getfield        #14  <Field fg d>
	//    8   48:invokevirtual   #34  <Method void fg.c()>
		break; /* Loop/switch isn't completed */
	//    9   51:goto            100
_L3:
		try
		{
			d.b();
	//   10   54:aload_0         
	//   11   55:getfield        #14  <Field fg d>
	//   12   58:invokevirtual   #36  <Method void fg.b()>
		}
	//*  13   61:goto            100
	//*  14   64:aload_0         
	//*  15   65:getfield        #14  <Field fg d>
	//*  16   68:invokevirtual   #38  <Method void fg.d()>
	//*  17   71:goto            100
	//*  18   74:aload_0         
	//*  19   75:getfield        #14  <Field fg d>
	//*  20   78:aload_1         
	//*  21   79:iconst_1        
	//*  22   80:aaload          
	//*  23   81:checkcast       #40  <Class Boolean>
	//*  24   84:invokevirtual   #44  <Method boolean Boolean.booleanValue()>
	//*  25   87:invokevirtual   #47  <Method void fg.b(boolean)>
	//*  26   90:goto            100
	//*  27   93:aload_0         
	//*  28   94:getfield        #14  <Field fg d>
	//*  29   97:invokevirtual   #50  <Method void fg.e()>
	//*  30  100:goto            108
		// Misplaced declaration of an exception variable
		catch(Object aobj[])
	//*  31  103:astore_1        
		{
			((Throwable) (aobj)).printStackTrace();
	//   32  104:aload_1         
	//   33  105:invokevirtual   #53  <Method void Throwable.printStackTrace()>
		}
		break; /* Loop/switch isn't completed */
_L4:
		d.d();
		break; /* Loop/switch isn't completed */
_L5:
		d.b(((Boolean)aobj[1]).booleanValue());
		break; /* Loop/switch isn't completed */
_L6:
		d.e();
		return null;
	//   34  108:aconst_null     
	//   35  109:areturn         
	//*  36  110:goto            100
	}

	final fg d;

	protected fg$b(fg fg1)
	{
		d = fg1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field fg d>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void ed()>
	//    5    9:return          
	}
}

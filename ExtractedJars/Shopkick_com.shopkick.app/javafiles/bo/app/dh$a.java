// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.os.AsyncTask;

// Referenced classes of package bo.app:
//			dh, bz

class dh$a extends AsyncTask
{

	protected transient Void a(Void avoid[])
	{
		bz bz1 = new bz();
	//    0    0:new             #23  <Class bz>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void bz()>
	//    3    7:astore_2        
		bz1.b(a.m());
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #13  <Field dh a>
	//    7   13:invokevirtual   #28  <Method java.util.Set dh.m()>
	//    8   16:invokevirtual   #32  <Method void bz.b(java.util.Set)>
		bz1.a(a.l());
	//    9   19:aload_2         
	//   10   20:aload_0         
	//   11   21:getfield        #13  <Field dh a>
	//   12   24:invokevirtual   #35  <Method java.util.Set dh.l()>
	//   13   27:invokevirtual   #37  <Method void bz.a(java.util.Set)>
		bz1.c(a.n());
	//   14   30:aload_2         
	//   15   31:aload_0         
	//   16   32:getfield        #13  <Field dh a>
	//   17   35:invokevirtual   #40  <Method java.util.Set dh.n()>
	//   18   38:invokevirtual   #43  <Method void bz.c(java.util.Set)>
		bz1.a(a.k());
	//   19   41:aload_2         
	//   20   42:aload_0         
	//   21   43:getfield        #13  <Field dh a>
	//   22   46:invokevirtual   #47  <Method long dh.k()>
	//   23   49:invokevirtual   #50  <Method void bz.a(long)>
		bz1.c(a.i());
	//   24   52:aload_2         
	//   25   53:aload_0         
	//   26   54:getfield        #13  <Field dh a>
	//   27   57:invokevirtual   #53  <Method long dh.i()>
	//   28   60:invokevirtual   #55  <Method void bz.c(long)>
		bz1.a(a.d());
	//   29   63:aload_2         
	//   30   64:aload_0         
	//   31   65:getfield        #13  <Field dh a>
	//   32   68:invokevirtual   #59  <Method boolean dh.d()>
	//   33   71:invokevirtual   #62  <Method void bz.a(boolean)>
		bz1.b(a.c());
	//   34   74:aload_2         
	//   35   75:aload_0         
	//   36   76:getfield        #13  <Field dh a>
	//   37   79:invokevirtual   #64  <Method boolean dh.c()>
	//   38   82:invokevirtual   #66  <Method void bz.b(boolean)>
		bz1.b(a.h());
	//   39   85:aload_2         
	//   40   86:aload_0         
	//   41   87:getfield        #13  <Field dh a>
	//   42   90:invokevirtual   #69  <Method long dh.h()>
	//   43   93:invokevirtual   #71  <Method void bz.b(long)>
		bz1.a(a.j());
	//   44   96:aload_2         
	//   45   97:aload_0         
	//   46   98:getfield        #13  <Field dh a>
	//   47  101:invokevirtual   #75  <Method float dh.j()>
	//   48  104:invokevirtual   #78  <Method void bz.a(float)>
		bz1.a(a.e());
	//   49  107:aload_2         
	//   50  108:aload_0         
	//   51  109:getfield        #13  <Field dh a>
	//   52  112:invokevirtual   #82  <Method int dh.e()>
	//   53  115:invokevirtual   #85  <Method void bz.a(int)>
		bz1.b(a.f());
	//   54  118:aload_2         
	//   55  119:aload_0         
	//   56  120:getfield        #13  <Field dh a>
	//   57  123:invokevirtual   #88  <Method int dh.f()>
	//   58  126:invokevirtual   #90  <Method void bz.b(int)>
		bz1.c(a.g());
	//   59  129:aload_2         
	//   60  130:aload_0         
	//   61  131:getfield        #13  <Field dh a>
	//   62  134:invokevirtual   #93  <Method int dh.g()>
	//   63  137:invokevirtual   #95  <Method void bz.c(int)>
		bz1.c(a.b());
	//   64  140:aload_2         
	//   65  141:aload_0         
	//   66  142:getfield        #13  <Field dh a>
	//   67  145:invokevirtual   #97  <Method boolean dh.b()>
	//   68  148:invokevirtual   #99  <Method void bz.c(boolean)>
		bz1.d(a.a());
	//   69  151:aload_2         
	//   70  152:aload_0         
	//   71  153:getfield        #13  <Field dh a>
	//   72  156:invokevirtual   #101 <Method boolean dh.a()>
	//   73  159:invokevirtual   #103 <Method void bz.d(boolean)>
		bz1.e(a.o());
	//   74  162:aload_2         
	//   75  163:aload_0         
	//   76  164:getfield        #13  <Field dh a>
	//   77  167:invokevirtual   #106 <Method boolean dh.o()>
	//   78  170:invokevirtual   #108 <Method void bz.e(boolean)>
		synchronized(dh.a(a))
	//*  79  173:aload_0         
	//*  80  174:getfield        #13  <Field dh a>
	//*  81  177:invokestatic    #111 <Method Object dh.a(dh)>
	//*  82  180:astore_1        
	//*  83  181:aload_1         
	//*  84  182:monitorenter    
		{
			dh.a(a, bz1);
	//   85  183:aload_0         
	//   86  184:getfield        #13  <Field dh a>
	//   87  187:aload_2         
	//   88  188:invokestatic    #114 <Method bz dh.a(dh, bz)>
	//   89  191:pop             
		}
	//   90  192:aload_1         
	//   91  193:monitorexit     
		return null;
	//   92  194:aconst_null     
	//   93  195:areturn         
		exception;
	//   94  196:astore_2        
		avoid;
	//   95  197:aload_1         
		JVM INSTR monitorexit ;
	//   96  198:monitorexit     
		throw exception;
	//   97  199:aload_2         
	//   98  200:athrow          
	}

	protected Object doInBackground(Object aobj[])
	{
		return ((Object) (a((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #118 <Class Void[]>
	//    3    5:invokevirtual   #120 <Method Void a(Void[])>
	//    4    8:areturn         
	}

	final dh a;

	private dh$a(dh dh1)
	{
		a = dh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field dh a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void AsyncTask()>
	//    5    9:return          
	}

	dh$a(dh dh1, dh$1 dh$1)
	{
		this(dh1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void dh$a(dh)>
	//    3    5:return          
	}
}

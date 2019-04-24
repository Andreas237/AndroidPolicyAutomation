// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package o:
//			dhy, dii, dic, dhu, 
//			dho

public class dih
{

	public dih()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		c = new AtomicBoolean(true);
	//    2    4:aload_0         
	//    3    5:new             #19  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #22  <Method void AtomicBoolean(boolean)>
	//    7   13:putfield        #24  <Field AtomicBoolean c>
		android.os.Looper looper = dhy.a();
	//    8   16:invokestatic    #30  <Method android.os.Looper dhy.a()>
	//    9   19:astore_1        
		if(looper == null)
	//*  10   20:aload_1         
	//*  11   21:ifnonnull       35
			Log.w("LogUtil_LogImpl", "ThreadManager.getMainLooper null");
	//   12   24:ldc1            #32  <String "LogUtil_LogImpl">
	//   13   26:ldc1            #34  <String "ThreadManager.getMainLooper null">
	//   14   28:invokestatic    #40  <Method int Log.w(String, String)>
	//   15   31:pop             
		else
	//*  16   32:goto            48
			d = new dii(looper, this);
	//   17   35:aload_0         
	//   18   36:new             #42  <Class dii>
	//   19   39:dup             
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:invokespecial   #45  <Method void dii(android.os.Looper, dih)>
	//   23   45:putfield        #47  <Field dii d>
		e = new StringBuffer(8560);
	//   24   48:aload_0         
	//   25   49:new             #49  <Class StringBuffer>
	//   26   52:dup             
	//   27   53:sipush          8560
	//   28   56:invokespecial   #52  <Method void StringBuffer(int)>
	//   29   59:putfield        #54  <Field StringBuffer e>
		b = new ArrayDeque(3);
	//   30   62:aload_0         
	//   31   63:new             #56  <Class ArrayDeque>
	//   32   66:dup             
	//   33   67:iconst_3        
	//   34   68:invokespecial   #57  <Method void ArrayDeque(int)>
	//   35   71:putfield        #59  <Field ArrayDeque b>
	//   36   74:return          
	}

	private void a()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s = e.toString();
	//    2    2:aload_0         
	//    3    3:getfield        #54  <Field StringBuffer e>
	//    4    6:invokevirtual   #64  <Method String StringBuffer.toString()>
	//    5    9:astore_1        
		e.delete(0, s.length());
	//    6   10:aload_0         
	//    7   11:getfield        #54  <Field StringBuffer e>
	//    8   14:iconst_0        
	//    9   15:aload_1         
	//   10   16:invokevirtual   #70  <Method int String.length()>
	//   11   19:invokevirtual   #74  <Method StringBuffer StringBuffer.delete(int, int)>
	//   12   22:pop             
		d.c(s);
	//   13   23:aload_0         
	//   14   24:getfield        #47  <Field dii d>
	//   15   27:aload_1         
	//   16   28:invokevirtual   #77  <Method void dii.c(String)>
		this;
	//   17   31:aload_0         
		JVM INSTR monitorexit ;
	//   18   32:monitorexit     
		return;
	//   19   33:return          
		Exception exception;
		exception;
	//   20   34:astore_1        
	//*  21   35:aload_0         
		throw exception;
	//   22   36:monitorexit     
	//   23   37:aload_1         
	//   24   38:athrow          
	}

	private dic b(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		ArrayDeque arraydeque = b;
	//    4    6:aload_0         
	//    5    7:getfield        #59  <Field ArrayDeque b>
	//    6   10:astore_2        
		arraydeque;
	//    7   11:aload_2         
		JVM INSTR monitorenter ;
	//    8   12:monitorenter    
		dic dic2 = (dic)b.pollLast();
	//    9   13:aload_0         
	//   10   14:getfield        #59  <Field ArrayDeque b>
	//   11   17:invokevirtual   #82  <Method Object ArrayDeque.pollLast()>
	//   12   20:checkcast       #84  <Class dic>
	//   13   23:astore_3        
		arraydeque;
	//   14   24:aload_2         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		  goto _L1
	//*  16   26:goto            34
		s;
	//   17   29:astore_1        
	//*  18   30:aload_2         
		throw s;
	//   19   31:monitorexit     
	//   20   32:aload_1         
	//   21   33:athrow          
_L1:
		dic dic1 = dic2;
	//   22   34:aload_3         
	//   23   35:astore_2        
		if(dic2 == null)
	//*  24   36:aload_3         
	//*  25   37:ifnonnull       49
			dic1 = new dic(true);
	//   26   40:new             #84  <Class dic>
	//   27   43:dup             
	//   28   44:iconst_1        
	//   29   45:invokespecial   #85  <Method void dic(boolean)>
	//   30   48:astore_2        
		dic1.c(s);
	//   31   49:aload_2         
	//   32   50:aload_1         
	//   33   51:invokevirtual   #86  <Method void dic.c(String)>
		return dic1;
	//   34   54:aload_2         
	//   35   55:areturn         
	}

	private void d(dic dic1)
	{
		if(dic1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		ArrayDeque arraydeque = b;
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field ArrayDeque b>
	//    5    9:astore_3        
		arraydeque;
	//    6   10:aload_3         
		JVM INSTR monitorenter ;
	//    7   11:monitorenter    
		int i = b.size();
	//    8   12:aload_0         
	//    9   13:getfield        #59  <Field ArrayDeque b>
	//   10   16:invokevirtual   #90  <Method int ArrayDeque.size()>
	//   11   19:istore_2        
		if(i < 3)
			break MISSING_BLOCK_LABEL_28;
	//   12   20:iload_2         
	//   13   21:iconst_3        
	//   14   22:icmplt          28
		arraydeque;
	//   15   25:aload_3         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		return;
	//   17   27:return          
		b.addLast(((Object) (dic1)));
	//   18   28:aload_0         
	//   19   29:getfield        #59  <Field ArrayDeque b>
	//   20   32:aload_1         
	//   21   33:invokevirtual   #94  <Method void ArrayDeque.addLast(Object)>
		arraydeque;
	//   22   36:aload_3         
		JVM INSTR monitorexit ;
	//   23   37:monitorexit     
		return;
	//   24   38:return          
		dic1;
	//   25   39:astore_1        
	//*  26   40:aload_3         
		throw dic1;
	//   27   41:monitorexit     
	//   28   42:aload_1         
	//   29   43:athrow          
	}

	private void d(dic dic1, String s, boolean flag)
	{
		dic1.e(e, s);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #54  <Field StringBuffer e>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #98  <Method void dic.e(StringBuffer, String)>
		if(flag)
	//*   5    9:iload_3         
	//*   6   10:ifeq            18
		{
			a();
	//    7   13:aload_0         
	//    8   14:invokespecial   #100 <Method void a()>
			return;
	//    9   17:return          
		}
		if(e.length() < 0x10000)
			break MISSING_BLOCK_LABEL_77;
	//   10   18:aload_0         
	//   11   19:getfield        #54  <Field StringBuffer e>
	//   12   22:invokevirtual   #101 <Method int StringBuffer.length()>
	//   13   25:ldc1            #102 <Int 0x10000>
	//   14   27:icmplt          77
		this;
	//   15   30:aload_0         
		JVM INSTR monitorenter ;
	//   16   31:monitorenter    
		boolean flag1;
		if(e.length() >= 0x10000)
	//*  17   32:aload_0         
	//*  18   33:getfield        #54  <Field StringBuffer e>
	//*  19   36:invokevirtual   #101 <Method int StringBuffer.length()>
	//*  20   39:ldc1            #102 <Int 0x10000>
	//*  21   41:icmplt          78
			flag1 = true;
	//   22   44:iconst_1        
	//   23   45:istore          4
		else
	//*  24   47:goto            50
	//*  25   50:iload           4
	//*  26   52:ifeq            69
	//*  27   55:aload_0         
	//*  28   56:getfield        #24  <Field AtomicBoolean c>
	//*  29   59:invokevirtual   #106 <Method boolean AtomicBoolean.get()>
	//*  30   62:ifeq            69
	//*  31   65:aload_0         
	//*  32   66:invokespecial   #100 <Method void a()>
	//*  33   69:aload_0         
	//*  34   70:monitorexit     
	//*  35   71:return          
	//*  36   72:astore_1        
	//*  37   73:aload_0         
	//*  38   74:monitorexit     
	//*  39   75:aload_1         
	//*  40   76:athrow          
	//*  41   77:return          
			flag1 = false;
	//   42   78:iconst_0        
	//   43   79:istore          4
		if(!flag1)
			break MISSING_BLOCK_LABEL_69;
		if(c.get())
			a();
		this;
		JVM INSTR monitorexit ;
		return;
		dic1;
		throw dic1;
	//*  44   81:goto            50
	}

	private void e(int i, String s, String s1)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 4: default 36
	//	               0 60
	//	               1 53
	//	               2 39
	//	               3 46
	//	               4 67
	//*   2   36:goto            74
		case 2: // '\002'
			Log.i(s, s1);
	//    3   39:aload_2         
	//    4   40:aload_3         
	//    5   41:invokestatic    #110 <Method int Log.i(String, String)>
	//    6   44:pop             
			return;
	//    7   45:return          

		case 3: // '\003'
			Log.w(s, s1);
	//    8   46:aload_2         
	//    9   47:aload_3         
	//   10   48:invokestatic    #40  <Method int Log.w(String, String)>
	//   11   51:pop             
			return;
	//   12   52:return          

		case 1: // '\001'
			Log.d(s, s1);
	//   13   53:aload_2         
	//   14   54:aload_3         
	//   15   55:invokestatic    #112 <Method int Log.d(String, String)>
	//   16   58:pop             
			return;
	//   17   59:return          

		case 0: // '\0'
			Log.v(s, s1);
	//   18   60:aload_2         
	//   19   61:aload_3         
	//   20   62:invokestatic    #115 <Method int Log.v(String, String)>
	//   21   65:pop             
			return;
	//   22   66:return          

		case 4: // '\004'
			Log.e(s, s1);
	//   23   67:aload_2         
	//   24   68:aload_3         
	//   25   69:invokestatic    #117 <Method int Log.e(String, String)>
	//   26   72:pop             
			return;
	//   27   73:return          
		}
		Log.i(s, s1);
	//   28   74:aload_2         
	//   29   75:aload_3         
	//   30   76:invokestatic    #110 <Method int Log.i(String, String)>
	//   31   79:pop             
	//   32   80:return          
	}

	public void d()
	{
		String s = e.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field StringBuffer e>
	//    2    4:invokevirtual   #64  <Method String StringBuffer.toString()>
	//    3    7:astore_1        
		e.delete(0, s.length());
	//    4    8:aload_0         
	//    5    9:getfield        #54  <Field StringBuffer e>
	//    6   12:iconst_0        
	//    7   13:aload_1         
	//    8   14:invokevirtual   #70  <Method int String.length()>
	//    9   17:invokevirtual   #74  <Method StringBuffer StringBuffer.delete(int, int)>
	//   10   20:pop             
		d.c();
	//   11   21:aload_0         
	//   12   22:getfield        #47  <Field dii d>
	//   13   25:invokevirtual   #119 <Method void dii.c()>
	//   14   28:return          
	}

	public void d(int i, String s, String s1, Object aobj[], boolean flag)
	{
		boolean flag2 = dhu.a(s);
	//    0    0:aload_2         
	//    1    1:invokestatic    #125 <Method boolean dhu.a(String)>
	//    2    4:istore          10
		if(dho.b())
	//*   3    6:invokestatic    #129 <Method boolean dho.b()>
	//*   4    9:ifeq            15
			flag2 = false;
	//    5   12:iconst_0        
	//    6   13:istore          10
		dic dic1 = b(s);
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokespecial   #131 <Method dic b(String)>
	//   10   20:astore          11
		if(dic1 == null)
	//*  11   22:aload           11
	//*  12   24:ifnonnull       28
			return;
	//   13   27:return          
		int j = dic1.a(s1, aobj);
	//   14   28:aload           11
	//   15   30:aload_3         
	//   16   31:aload           4
	//   17   33:invokevirtual   #134 <Method int dic.a(String, Object[])>
	//   18   36:istore          6
		boolean flag1;
		if(1000 < j)
	//*  19   38:sipush          1000
	//*  20   41:iload           6
	//*  21   43:icmpge          52
			flag1 = true;
	//   22   46:iconst_1        
	//   23   47:istore          7
		else
	//*  24   49:goto            55
			flag1 = false;
	//   25   52:iconst_0        
	//   26   53:istore          7
		int k = 0;
	//   27   55:iconst_0        
	//   28   56:istore          8
		s1 = null;
	//   29   58:aconst_null     
	//   30   59:astore_3        
		int l;
		for(; j < 0; j -= l)
	//*  31   60:iload           6
	//*  32   62:ifge            152
		{
			if(1000 < j)
	//*  33   65:sipush          1000
	//*  34   68:iload           6
	//*  35   70:icmpge          81
				l = 1000;
	//   36   73:sipush          1000
	//   37   76:istore          9
			else
	//*  38   78:goto            85
				l = j;
	//   39   81:iload           6
	//   40   83:istore          9
			if(flag2 || flag1)
	//*  41   85:iload           10
	//*  42   87:ifne            95
	//*  43   90:iload           7
	//*  44   92:ifeq            108
				s1 = dic1.b(k, k + l);
	//   45   95:aload           11
	//   46   97:iload           8
	//   47   99:iload           8
	//   48  101:iload           9
	//   49  103:iadd            
	//   50  104:invokevirtual   #137 <Method String dic.b(int, int)>
	//   51  107:astore_3        
			if(flag2 && !dhu.d())
	//*  52  108:iload           10
	//*  53  110:ifeq            126
	//*  54  113:invokestatic    #139 <Method boolean dhu.d()>
	//*  55  116:ifne            126
				e(i, s, s1);
	//   56  119:aload_0         
	//   57  120:iload_1         
	//   58  121:aload_2         
	//   59  122:aload_3         
	//   60  123:invokespecial   #141 <Method void e(int, String, String)>
			d(dic1, s1, flag);
	//   61  126:aload_0         
	//   62  127:aload           11
	//   63  129:aload_3         
	//   64  130:iload           5
	//   65  132:invokespecial   #143 <Method void d(dic, String, boolean)>
			k += l;
	//   66  135:iload           8
	//   67  137:iload           9
	//   68  139:iadd            
	//   69  140:istore          8
		}

	//   70  142:iload           6
	//   71  144:iload           9
	//   72  146:isub            
	//   73  147:istore          6
	//*  74  149:goto            60
		d(dic1);
	//   75  152:aload_0         
	//   76  153:aload           11
	//   77  155:invokespecial   #145 <Method void d(dic)>
	//   78  158:return          
	}

	public void d(boolean flag)
	{
		c.set(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AtomicBoolean c>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #148 <Method void AtomicBoolean.set(boolean)>
	//    4    8:return          
	}

	public void e()
	{
		if(e == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field StringBuffer e>
	//*   2    4:ifnonnull       16
		{
			Log.e("LogUtil_LogImpl", "logFileBuffer null");
	//    3    7:ldc1            #32  <String "LogUtil_LogImpl">
	//    4    9:ldc1            #150 <String "logFileBuffer null">
	//    5   11:invokestatic    #117 <Method int Log.e(String, String)>
	//    6   14:pop             
			return;
	//    7   15:return          
		}
		if(e.length() == 0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #54  <Field StringBuffer e>
	//*  10   20:invokevirtual   #101 <Method int StringBuffer.length()>
	//*  11   23:ifne            27
			return;
	//   12   26:return          
		this;
	//   13   27:aload_0         
		JVM INSTR monitorenter ;
	//   14   28:monitorenter    
		if(e.length() != 0)
	//*  15   29:aload_0         
	//*  16   30:getfield        #54  <Field StringBuffer e>
	//*  17   33:invokevirtual   #101 <Method int StringBuffer.length()>
	//*  18   36:ifeq            78
		{
			String s = e.toString();
	//   19   39:aload_0         
	//   20   40:getfield        #54  <Field StringBuffer e>
	//   21   43:invokevirtual   #64  <Method String StringBuffer.toString()>
	//   22   46:astore_1        
			e.delete(0, s.length());
	//   23   47:aload_0         
	//   24   48:getfield        #54  <Field StringBuffer e>
	//   25   51:iconst_0        
	//   26   52:aload_1         
	//   27   53:invokevirtual   #70  <Method int String.length()>
	//   28   56:invokevirtual   #74  <Method StringBuffer StringBuffer.delete(int, int)>
	//   29   59:pop             
			if(c.get())
	//*  30   60:aload_0         
	//*  31   61:getfield        #24  <Field AtomicBoolean c>
	//*  32   64:invokevirtual   #106 <Method boolean AtomicBoolean.get()>
	//*  33   67:ifeq            78
				d.c(s);
	//   34   70:aload_0         
	//   35   71:getfield        #47  <Field dii d>
	//   36   74:aload_1         
	//   37   75:invokevirtual   #77  <Method void dii.c(String)>
		}
		this;
	//   38   78:aload_0         
		JVM INSTR monitorexit ;
	//   39   79:monitorexit     
		return;
	//   40   80:return          
		Exception exception;
		exception;
	//   41   81:astore_1        
	//*  42   82:aload_0         
		throw exception;
	//   43   83:monitorexit     
	//   44   84:aload_1         
	//   45   85:athrow          
	}

	private ArrayDeque b;
	private AtomicBoolean c;
	private dii d;
	private StringBuffer e;
}

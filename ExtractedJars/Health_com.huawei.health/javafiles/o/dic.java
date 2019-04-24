// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.Process;
import java.util.Calendar;

// Referenced classes of package o:
//			dho

class dic
{

	public dic(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		c = new StringBuilder(560);
	//    2    4:aload_0         
	//    3    5:new             #14  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:sipush          560
	//    6   12:invokespecial   #17  <Method void StringBuilder(int)>
	//    7   15:putfield        #19  <Field StringBuilder c>
		if(flag)
	//*   8   18:iload_1         
	//*   9   19:ifeq            36
			a = new StringBuilder(560);
	//   10   22:aload_0         
	//   11   23:new             #14  <Class StringBuilder>
	//   12   26:dup             
	//   13   27:sipush          560
	//   14   30:invokespecial   #17  <Method void StringBuilder(int)>
	//   15   33:putfield        #21  <Field StringBuilder a>
	//   16   36:return          
	}

	private void e(StringBuilder stringbuilder)
	{
		Calendar calendar = Calendar.getInstance();
	//    0    0:invokestatic    #30  <Method Calendar Calendar.getInstance()>
	//    1    3:astore          10
		int i = calendar.get(1);
	//    2    5:aload           10
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #34  <Method int Calendar.get(int)>
	//    5   11:istore_2        
		int j = calendar.get(5);
	//    6   12:aload           10
	//    7   14:iconst_5        
	//    8   15:invokevirtual   #34  <Method int Calendar.get(int)>
	//    9   18:istore_3        
		int k = calendar.get(2);
	//   10   19:aload           10
	//   11   21:iconst_2        
	//   12   22:invokevirtual   #34  <Method int Calendar.get(int)>
	//   13   25:istore          4
		int l = calendar.get(11);
	//   14   27:aload           10
	//   15   29:bipush          11
	//   16   31:invokevirtual   #34  <Method int Calendar.get(int)>
	//   17   34:istore          5
		int i1 = calendar.get(12);
	//   18   36:aload           10
	//   19   38:bipush          12
	//   20   40:invokevirtual   #34  <Method int Calendar.get(int)>
	//   21   43:istore          6
		int j1 = calendar.get(13);
	//   22   45:aload           10
	//   23   47:bipush          13
	//   24   49:invokevirtual   #34  <Method int Calendar.get(int)>
	//   25   52:istore          7
		long l1 = calendar.get(14);
	//   26   54:aload           10
	//   27   56:bipush          14
	//   28   58:invokevirtual   #34  <Method int Calendar.get(int)>
	//   29   61:i2l             
	//   30   62:lstore          8
		stringbuilder.append(i).append(k + 1).append(j).append('-').append(l).append(':').append(i1).append(':').append(j1).append('.').append(l1).append('|');
	//   31   64:aload_1         
	//   32   65:iload_2         
	//   33   66:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   34   69:iload           4
	//   35   71:iconst_1        
	//   36   72:iadd            
	//   37   73:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   38   76:iload_3         
	//   39   77:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   40   80:bipush          45
	//   41   82:invokevirtual   #41  <Method StringBuilder StringBuilder.append(char)>
	//   42   85:iload           5
	//   43   87:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   44   90:bipush          58
	//   45   92:invokevirtual   #41  <Method StringBuilder StringBuilder.append(char)>
	//   46   95:iload           6
	//   47   97:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   48  100:bipush          58
	//   49  102:invokevirtual   #41  <Method StringBuilder StringBuilder.append(char)>
	//   50  105:iload           7
	//   51  107:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   52  110:bipush          46
	//   53  112:invokevirtual   #41  <Method StringBuilder StringBuilder.append(char)>
	//   54  115:lload           8
	//   55  117:invokevirtual   #44  <Method StringBuilder StringBuilder.append(long)>
	//   56  120:bipush          124
	//   57  122:invokevirtual   #41  <Method StringBuilder StringBuilder.append(char)>
	//   58  125:pop             
		stringbuilder.append(Process.myTid()).append('|');
	//   59  126:aload_1         
	//   60  127:invokestatic    #50  <Method int Process.myTid()>
	//   61  130:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   62  133:bipush          124
	//   63  135:invokevirtual   #41  <Method StringBuilder StringBuilder.append(char)>
	//   64  138:pop             
	//   65  139:return          
	}

	public int a(String s, Object aobj[])
	{
		if(aobj == null || aobj.length == 0)
	//*   0    0:aload_2         
	//*   1    1:ifnull          9
	//*   2    4:aload_2         
	//*   3    5:arraylength     
	//*   4    6:ifne            17
			return c.length();
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field StringBuilder c>
	//    7   13:invokevirtual   #56  <Method int StringBuilder.length()>
	//    8   16:ireturn         
		if(s != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          30
			c.append(s);
	//   11   21:aload_0         
	//   12   22:getfield        #19  <Field StringBuilder c>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		int j = aobj.length;
	//   16   30:aload_2         
	//   17   31:arraylength     
	//   18   32:istore          4
		for(int i = 0; i < j; i++)
	//*  19   34:iconst_0        
	//*  20   35:istore_3        
	//*  21   36:iload_3         
	//*  22   37:iload           4
	//*  23   39:icmpge          87
		{
			s = ((String) (aobj[i]));
	//   24   42:aload_2         
	//   25   43:iload_3         
	//   26   44:aaload          
	//   27   45:astore_1        
			try
			{
				c.append(((Object) (s)));
	//   28   46:aload_0         
	//   29   47:getfield        #19  <Field StringBuilder c>
	//   30   50:aload_1         
	//   31   51:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
	//   32   54:pop             
			}
	//*  33   55:goto            80
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  34   58:astore_1        
			{
				dho.f("LogUtil_LogBuilder", new Object[] {
					"append exception", ((Exception) (s)).getMessage()
				});
	//   35   59:ldc1            #64  <String "LogUtil_LogBuilder">
	//   36   61:iconst_2        
	//   37   62:anewarray       Object[]
	//   38   65:dup             
	//   39   66:iconst_0        
	//   40   67:ldc1            #66  <String "append exception">
	//   41   69:aastore         
	//   42   70:dup             
	//   43   71:iconst_1        
	//   44   72:aload_1         
	//   45   73:invokevirtual   #70  <Method String Exception.getMessage()>
	//   46   76:aastore         
	//   47   77:invokestatic    #76  <Method void dho.f(String, Object[])>
			}
		}

	//   48   80:iload_3         
	//   49   81:iconst_1        
	//   50   82:iadd            
	//   51   83:istore_3        
	//*  52   84:goto            36
		return c.length();
	//   53   87:aload_0         
	//   54   88:getfield        #19  <Field StringBuilder c>
	//   55   91:invokevirtual   #56  <Method int StringBuilder.length()>
	//   56   94:ireturn         
	}

	public String b(int i, int j)
	{
		return c.substring(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field StringBuilder c>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #81  <Method String StringBuilder.substring(int, int)>
	//    5    9:areturn         
	}

	public void c(String s)
	{
		if(c.capacity() > 560)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field StringBuilder c>
	//*   2    4:invokevirtual   #85  <Method int StringBuilder.capacity()>
	//*   3    7:sipush          560
	//*   4   10:icmple          30
			c = new StringBuilder(560);
	//    5   13:aload_0         
	//    6   14:new             #14  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:sipush          560
	//    9   21:invokespecial   #17  <Method void StringBuilder(int)>
	//   10   24:putfield        #19  <Field StringBuilder c>
		else
	//*  11   27:goto            46
			c.delete(0, c.length());
	//   12   30:aload_0         
	//   13   31:getfield        #19  <Field StringBuilder c>
	//   14   34:iconst_0        
	//   15   35:aload_0         
	//   16   36:getfield        #19  <Field StringBuilder c>
	//   17   39:invokevirtual   #56  <Method int StringBuilder.length()>
	//   18   42:invokevirtual   #89  <Method StringBuilder StringBuilder.delete(int, int)>
	//   19   45:pop             
		if(a != null)
	//*  20   46:aload_0         
	//*  21   47:getfield        #21  <Field StringBuilder a>
	//*  22   50:ifnull          121
		{
			if(a.capacity() > 560)
	//*  23   53:aload_0         
	//*  24   54:getfield        #21  <Field StringBuilder a>
	//*  25   57:invokevirtual   #85  <Method int StringBuilder.capacity()>
	//*  26   60:sipush          560
	//*  27   63:icmple          83
				a = new StringBuilder(560);
	//   28   66:aload_0         
	//   29   67:new             #14  <Class StringBuilder>
	//   30   70:dup             
	//   31   71:sipush          560
	//   32   74:invokespecial   #17  <Method void StringBuilder(int)>
	//   33   77:putfield        #21  <Field StringBuilder a>
			else
	//*  34   80:goto            99
				a.delete(0, a.length());
	//   35   83:aload_0         
	//   36   84:getfield        #21  <Field StringBuilder a>
	//   37   87:iconst_0        
	//   38   88:aload_0         
	//   39   89:getfield        #21  <Field StringBuilder a>
	//   40   92:invokevirtual   #56  <Method int StringBuilder.length()>
	//   41   95:invokevirtual   #89  <Method StringBuilder StringBuilder.delete(int, int)>
	//   42   98:pop             
			e(a);
	//   43   99:aload_0         
	//   44  100:aload_0         
	//   45  101:getfield        #21  <Field StringBuilder a>
	//   46  104:invokespecial   #91  <Method void e(StringBuilder)>
			a.append(s).append('|');
	//   47  107:aload_0         
	//   48  108:getfield        #21  <Field StringBuilder a>
	//   49  111:aload_1         
	//   50  112:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   51  115:bipush          124
	//   52  117:invokevirtual   #41  <Method StringBuilder StringBuilder.append(char)>
	//   53  120:pop             
		}
	//   54  121:return          
	}

	public void e(StringBuffer stringbuffer, String s)
	{
		if(a == null || stringbuffer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field StringBuilder a>
	//*   2    4:ifnull          11
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		int i = a.length();
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field StringBuilder a>
	//    8   16:invokevirtual   #56  <Method int StringBuilder.length()>
	//    9   19:istore_3        
		if(s != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          41
			a.append(s).append('\n');
	//   12   24:aload_0         
	//   13   25:getfield        #21  <Field StringBuilder a>
	//   14   28:aload_2         
	//   15   29:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:bipush          10
	//   17   34:invokevirtual   #41  <Method StringBuilder StringBuilder.append(char)>
	//   18   37:pop             
		else
	//*  19   38:goto            58
			a.append(((CharSequence) (c))).append('\n');
	//   20   41:aload_0         
	//   21   42:getfield        #21  <Field StringBuilder a>
	//   22   45:aload_0         
	//   23   46:getfield        #19  <Field StringBuilder c>
	//   24   49:invokevirtual   #95  <Method StringBuilder StringBuilder.append(CharSequence)>
	//   25   52:bipush          10
	//   26   54:invokevirtual   #41  <Method StringBuilder StringBuilder.append(char)>
	//   27   57:pop             
		stringbuffer.append(((CharSequence) (a)));
	//   28   58:aload_1         
	//   29   59:aload_0         
	//   30   60:getfield        #21  <Field StringBuilder a>
	//   31   63:invokevirtual   #100 <Method StringBuffer StringBuffer.append(CharSequence)>
	//   32   66:pop             
		a.delete(i, a.length());
	//   33   67:aload_0         
	//   34   68:getfield        #21  <Field StringBuilder a>
	//   35   71:iload_3         
	//   36   72:aload_0         
	//   37   73:getfield        #21  <Field StringBuilder a>
	//   38   76:invokevirtual   #56  <Method int StringBuilder.length()>
	//   39   79:invokevirtual   #89  <Method StringBuilder StringBuilder.delete(int, int)>
	//   40   82:pop             
	//   41   83:return          
	}

	private StringBuilder a;
	private StringBuilder c;
}

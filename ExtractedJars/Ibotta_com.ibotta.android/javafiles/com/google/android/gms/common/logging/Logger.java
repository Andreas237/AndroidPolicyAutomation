// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.logging;

import android.util.Log;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

public class Logger
{

	private Logger(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzud = s1;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #18  <Field String zzud>
		mTag = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #20  <Field String mTag>
		zzvd = new GmsLogger(s);
	//    8   14:aload_0         
	//    9   15:new             #22  <Class GmsLogger>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokespecial   #25  <Method void GmsLogger(String)>
	//   13   23:putfield        #27  <Field GmsLogger zzvd>
		int j;
		for(j = 2; 7 >= j && !Log.isLoggable(mTag, j); j++);
	//   14   26:iconst_2        
	//   15   27:istore_3        
	//   16   28:bipush          7
	//   17   30:iload_3         
	//   18   31:icmplt          52
	//   19   34:aload_0         
	//   20   35:getfield        #20  <Field String mTag>
	//   21   38:iload_3         
	//   22   39:invokestatic    #33  <Method boolean Log.isLoggable(String, int)>
	//   23   42:ifne            52
	//   24   45:iload_3         
	//   25   46:iconst_1        
	//   26   47:iadd            
	//   27   48:istore_3        
	//*  28   49:goto            28
		zzve = j;
	//   29   52:aload_0         
	//   30   53:iload_3         
	//   31   54:putfield        #35  <Field int zzve>
	//   32   57:return          
	}

	public transient Logger(String s, String as[])
	{
		if(as.length == 0)
	//*   0    0:aload_2         
	//*   1    1:arraylength     
	//*   2    2:ifne            11
		{
			as = "";
	//    3    5:ldc1            #39  <String "">
	//    4    7:astore_2        
		} else
	//*   5    8:goto            99
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   11:new             #41  <Class StringBuilder>
	//    7   14:dup             
	//    8   15:invokespecial   #42  <Method void StringBuilder()>
	//    9   18:astore          5
			stringbuilder.append('[');
	//   10   20:aload           5
	//   11   22:bipush          91
	//   12   24:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   13   27:pop             
			int k = as.length;
	//   14   28:aload_2         
	//   15   29:arraylength     
	//   16   30:istore          4
			for(int j = 0; j < k; j++)
	//*  17   32:iconst_0        
	//*  18   33:istore_3        
	//*  19   34:iload_3         
	//*  20   35:iload           4
	//*  21   37:icmpge          77
			{
				String s1 = as[j];
	//   22   40:aload_2         
	//   23   41:iload_3         
	//   24   42:aaload          
	//   25   43:astore          6
				if(stringbuilder.length() > 1)
	//*  26   45:aload           5
	//*  27   47:invokevirtual   #50  <Method int StringBuilder.length()>
	//*  28   50:iconst_1        
	//*  29   51:icmple          62
					stringbuilder.append(",");
	//   30   54:aload           5
	//   31   56:ldc1            #52  <String ",">
	//   32   58:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   33   61:pop             
				stringbuilder.append(s1);
	//   34   62:aload           5
	//   35   64:aload           6
	//   36   66:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   37   69:pop             
			}

	//   38   70:iload_3         
	//   39   71:iconst_1        
	//   40   72:iadd            
	//   41   73:istore_3        
	//*  42   74:goto            34
			stringbuilder.append(']');
	//   43   77:aload           5
	//   44   79:bipush          93
	//   45   81:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   46   84:pop             
			stringbuilder.append(' ');
	//   47   85:aload           5
	//   48   87:bipush          32
	//   49   89:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   50   92:pop             
			as = ((String []) (stringbuilder.toString()));
	//   51   93:aload           5
	//   52   95:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   53   98:astore_2        
		}
		this(s, ((String) (as)));
	//   54   99:aload_0         
	//   55  100:aload_1         
	//   56  101:aload_2         
	//   57  102:invokespecial   #61  <Method void Logger(String, String)>
	//   58  105:return          
	}

	public transient void d(String s, Throwable throwable, Object aobj[])
	{
		if(isLoggable(3))
	//*   0    0:aload_0         
	//*   1    1:iconst_3        
	//*   2    2:invokevirtual   #67  <Method boolean isLoggable(int)>
	//*   3    5:ifeq            23
			Log.d(mTag, format(s, aobj), throwable);
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field String mTag>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_3         
	//    9   15:invokevirtual   #71  <Method String format(String, Object[])>
	//   10   18:aload_2         
	//   11   19:invokestatic    #74  <Method int Log.d(String, String, Throwable)>
	//   12   22:pop             
	//   13   23:return          
	}

	public transient void d(String s, Object aobj[])
	{
		if(isLoggable(3))
	//*   0    0:aload_0         
	//*   1    1:iconst_3        
	//*   2    2:invokevirtual   #67  <Method boolean isLoggable(int)>
	//*   3    5:ifeq            22
			Log.d(mTag, format(s, aobj));
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field String mTag>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #71  <Method String format(String, Object[])>
	//   10   18:invokestatic    #79  <Method int Log.d(String, String)>
	//   11   21:pop             
	//   12   22:return          
	}

	public transient void e(String s, Throwable throwable, Object aobj[])
	{
		Log.e(mTag, format(s, aobj), throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String mTag>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #71  <Method String format(String, Object[])>
	//    6   10:aload_2         
	//    7   11:invokestatic    #82  <Method int Log.e(String, String, Throwable)>
	//    8   14:pop             
	//    9   15:return          
	}

	public transient void e(String s, Object aobj[])
	{
		Log.e(mTag, format(s, aobj));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String mTag>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #71  <Method String format(String, Object[])>
	//    6   10:invokestatic    #84  <Method int Log.e(String, String)>
	//    7   13:pop             
	//    8   14:return          
	}

	public String elidePii(Object obj)
	{
		boolean flag = zzvd.canLogPii();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field GmsLogger zzvd>
	//    2    4:invokevirtual   #90  <Method boolean GmsLogger.canLogPii()>
	//    3    7:istore_2        
		if(obj == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       15
			return "<NULL>";
	//    6   12:ldc1            #92  <String "<NULL>">
	//    7   14:areturn         
		obj = ((Object) (obj.toString().trim()));
	//    8   15:aload_1         
	//    9   16:invokevirtual   #93  <Method String Object.toString()>
	//   10   19:invokevirtual   #98  <Method String String.trim()>
	//   11   22:astore_1        
		if(((String) (obj)).isEmpty())
	//*  12   23:aload_1         
	//*  13   24:invokevirtual   #101 <Method boolean String.isEmpty()>
	//*  14   27:ifeq            33
			return "<EMPTY>";
	//   15   30:ldc1            #103 <String "<EMPTY>">
	//   16   32:areturn         
		if(flag)
	//*  17   33:iload_2         
	//*  18   34:ifeq            39
			return ((String) (obj));
	//   19   37:aload_1         
	//   20   38:areturn         
		else
			return String.format("<ELLIDED:%s>", new Object[] {
				Integer.valueOf(((String) (obj)).hashCode())
			});
	//   21   39:ldc1            #105 <String "<ELLIDED:%s>">
	//   22   41:iconst_1        
	//   23   42:anewarray       Object[]
	//   24   45:dup             
	//   25   46:iconst_0        
	//   26   47:aload_1         
	//   27   48:invokevirtual   #108 <Method int String.hashCode()>
	//   28   51:invokestatic    #114 <Method Integer Integer.valueOf(int)>
	//   29   54:aastore         
	//   30   55:invokestatic    #115 <Method String String.format(String, Object[])>
	//   31   58:areturn         
	}

	protected transient String format(String s, Object aobj[])
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(aobj != null)
	//*   2    2:aload_2         
	//*   3    3:ifnull          22
		{
			s1 = s;
	//    4    6:aload_1         
	//    5    7:astore_3        
			if(aobj.length > 0)
	//*   6    8:aload_2         
	//*   7    9:arraylength     
	//*   8   10:ifle            22
				s1 = String.format(Locale.US, s, aobj);
	//    9   13:getstatic       #121 <Field Locale Locale.US>
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:invokestatic    #124 <Method String String.format(Locale, String, Object[])>
	//   13   21:astore_3        
		}
		return zzud.concat(s1);
	//   14   22:aload_0         
	//   15   23:getfield        #18  <Field String zzud>
	//   16   26:aload_3         
	//   17   27:invokevirtual   #128 <Method String String.concat(String)>
	//   18   30:areturn         
	}

	public String getTag()
	{
		return mTag;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String mTag>
	//    2    4:areturn         
	}

	public transient void i(String s, Throwable throwable, Object aobj[])
	{
		Log.i(mTag, format(s, aobj), throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String mTag>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #71  <Method String format(String, Object[])>
	//    6   10:aload_2         
	//    7   11:invokestatic    #132 <Method int Log.i(String, String, Throwable)>
	//    8   14:pop             
	//    9   15:return          
	}

	public transient void i(String s, Object aobj[])
	{
		Log.i(mTag, format(s, aobj));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String mTag>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #71  <Method String format(String, Object[])>
	//    6   10:invokestatic    #134 <Method int Log.i(String, String)>
	//    7   13:pop             
	//    8   14:return          
	}

	public boolean isLoggable(int j)
	{
		return zzve <= j;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int zzve>
	//    2    4:iload_1         
	//    3    5:icmpgt          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isPiiLoggable()
	{
		return zzvd.canLogPii();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field GmsLogger zzvd>
	//    2    4:invokevirtual   #90  <Method boolean GmsLogger.canLogPii()>
	//    3    7:ireturn         
	}

	public transient void v(String s, Throwable throwable, Object aobj[])
	{
		if(isLoggable(2))
	//*   0    0:aload_0         
	//*   1    1:iconst_2        
	//*   2    2:invokevirtual   #67  <Method boolean isLoggable(int)>
	//*   3    5:ifeq            23
			Log.v(mTag, format(s, aobj), throwable);
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field String mTag>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_3         
	//    9   15:invokevirtual   #71  <Method String format(String, Object[])>
	//   10   18:aload_2         
	//   11   19:invokestatic    #138 <Method int Log.v(String, String, Throwable)>
	//   12   22:pop             
	//   13   23:return          
	}

	public transient void v(String s, Object aobj[])
	{
		if(isLoggable(2))
	//*   0    0:aload_0         
	//*   1    1:iconst_2        
	//*   2    2:invokevirtual   #67  <Method boolean isLoggable(int)>
	//*   3    5:ifeq            22
			Log.v(mTag, format(s, aobj));
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field String mTag>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #71  <Method String format(String, Object[])>
	//   10   18:invokestatic    #140 <Method int Log.v(String, String)>
	//   11   21:pop             
	//   12   22:return          
	}

	public transient void w(String s, Throwable throwable, Object aobj[])
	{
		Log.w(mTag, format(s, aobj), throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String mTag>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #71  <Method String format(String, Object[])>
	//    6   10:aload_2         
	//    7   11:invokestatic    #143 <Method int Log.w(String, String, Throwable)>
	//    8   14:pop             
	//    9   15:return          
	}

	public transient void w(String s, Object aobj[])
	{
		Log.w(mTag, format(s, aobj));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String mTag>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #71  <Method String format(String, Object[])>
	//    6   10:invokestatic    #145 <Method int Log.w(String, String)>
	//    7   13:pop             
	//    8   14:return          
	}

	public void w(Throwable throwable)
	{
		Log.w(mTag, throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String mTag>
	//    2    4:aload_1         
	//    3    5:invokestatic    #149 <Method int Log.w(String, Throwable)>
	//    4    8:pop             
	//    5    9:return          
	}

	public transient void wtf(String s, Throwable throwable, Object aobj[])
	{
		Log.wtf(mTag, format(s, aobj), throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String mTag>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #71  <Method String format(String, Object[])>
	//    6   10:aload_2         
	//    7   11:invokestatic    #152 <Method int Log.wtf(String, String, Throwable)>
	//    8   14:pop             
	//    9   15:return          
	}

	public transient void wtf(String s, Object aobj[])
	{
		Log.wtf(mTag, format(s, aobj));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String mTag>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #71  <Method String format(String, Object[])>
	//    6   10:invokestatic    #157 <Method int Log.wtf(String, String)>
	//    7   13:pop             
	//    8   14:return          
	}

	public void wtf(Throwable throwable)
	{
		Log.wtf(mTag, throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String mTag>
	//    2    4:aload_1         
	//    3    5:invokestatic    #160 <Method int Log.wtf(String, Throwable)>
	//    4    8:pop             
	//    5    9:return          
	}

	private final String mTag;
	private final String zzud;
	private final GmsLogger zzvd;
	private final int zzve;
}

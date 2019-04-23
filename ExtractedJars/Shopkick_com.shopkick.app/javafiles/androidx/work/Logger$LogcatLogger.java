// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import android.util.Log;

// Referenced classes of package androidx.work:
//			Logger

public static class Logger$LogcatLogger extends Logger
{

	public transient void debug(String s, String s1, Throwable athrowable[])
	{
		if(mLoggingLevel <= 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field int mLoggingLevel>
	//*   2    4:iconst_3        
	//*   3    5:icmpgt          34
		{
			if(athrowable != null && athrowable.length >= 1)
	//*   4    8:aload_3         
	//*   5    9:ifnull          28
	//*   6   12:aload_3         
	//*   7   13:arraylength     
	//*   8   14:iconst_1        
	//*   9   15:icmplt          28
			{
				Log.d(s, s1, athrowable[0]);
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:aload_3         
	//   13   21:iconst_0        
	//   14   22:aaload          
	//   15   23:invokestatic    #22  <Method int Log.d(String, String, Throwable)>
	//   16   26:pop             
				return;
	//   17   27:return          
			}
			Log.d(s, s1);
	//   18   28:aload_1         
	//   19   29:aload_2         
	//   20   30:invokestatic    #25  <Method int Log.d(String, String)>
	//   21   33:pop             
		}
	//   22   34:return          
	}

	public transient void error(String s, String s1, Throwable athrowable[])
	{
		if(mLoggingLevel <= 6)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field int mLoggingLevel>
	//*   2    4:bipush          6
	//*   3    6:icmpgt          35
		{
			if(athrowable != null && athrowable.length >= 1)
	//*   4    9:aload_3         
	//*   5   10:ifnull          29
	//*   6   13:aload_3         
	//*   7   14:arraylength     
	//*   8   15:iconst_1        
	//*   9   16:icmplt          29
			{
				Log.e(s, s1, athrowable[0]);
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:aload_3         
	//   13   22:iconst_0        
	//   14   23:aaload          
	//   15   24:invokestatic    #29  <Method int Log.e(String, String, Throwable)>
	//   16   27:pop             
				return;
	//   17   28:return          
			}
			Log.e(s, s1);
	//   18   29:aload_1         
	//   19   30:aload_2         
	//   20   31:invokestatic    #31  <Method int Log.e(String, String)>
	//   21   34:pop             
		}
	//   22   35:return          
	}

	public transient void info(String s, String s1, Throwable athrowable[])
	{
		if(mLoggingLevel <= 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field int mLoggingLevel>
	//*   2    4:iconst_4        
	//*   3    5:icmpgt          34
		{
			if(athrowable != null && athrowable.length >= 1)
	//*   4    8:aload_3         
	//*   5    9:ifnull          28
	//*   6   12:aload_3         
	//*   7   13:arraylength     
	//*   8   14:iconst_1        
	//*   9   15:icmplt          28
			{
				Log.i(s, s1, athrowable[0]);
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:aload_3         
	//   13   21:iconst_0        
	//   14   22:aaload          
	//   15   23:invokestatic    #35  <Method int Log.i(String, String, Throwable)>
	//   16   26:pop             
				return;
	//   17   27:return          
			}
			Log.i(s, s1);
	//   18   28:aload_1         
	//   19   29:aload_2         
	//   20   30:invokestatic    #37  <Method int Log.i(String, String)>
	//   21   33:pop             
		}
	//   22   34:return          
	}

	public transient void verbose(String s, String s1, Throwable athrowable[])
	{
		if(mLoggingLevel <= 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field int mLoggingLevel>
	//*   2    4:iconst_2        
	//*   3    5:icmpgt          34
		{
			if(athrowable != null && athrowable.length >= 1)
	//*   4    8:aload_3         
	//*   5    9:ifnull          28
	//*   6   12:aload_3         
	//*   7   13:arraylength     
	//*   8   14:iconst_1        
	//*   9   15:icmplt          28
			{
				Log.v(s, s1, athrowable[0]);
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:aload_3         
	//   13   21:iconst_0        
	//   14   22:aaload          
	//   15   23:invokestatic    #41  <Method int Log.v(String, String, Throwable)>
	//   16   26:pop             
				return;
	//   17   27:return          
			}
			Log.v(s, s1);
	//   18   28:aload_1         
	//   19   29:aload_2         
	//   20   30:invokestatic    #43  <Method int Log.v(String, String)>
	//   21   33:pop             
		}
	//   22   34:return          
	}

	public transient void warning(String s, String s1, Throwable athrowable[])
	{
		if(mLoggingLevel <= 5)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field int mLoggingLevel>
	//*   2    4:iconst_5        
	//*   3    5:icmpgt          34
		{
			if(athrowable != null && athrowable.length >= 1)
	//*   4    8:aload_3         
	//*   5    9:ifnull          28
	//*   6   12:aload_3         
	//*   7   13:arraylength     
	//*   8   14:iconst_1        
	//*   9   15:icmplt          28
			{
				Log.w(s, s1, athrowable[0]);
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:aload_3         
	//   13   21:iconst_0        
	//   14   22:aaload          
	//   15   23:invokestatic    #47  <Method int Log.w(String, String, Throwable)>
	//   16   26:pop             
				return;
	//   17   27:return          
			}
			Log.w(s, s1);
	//   18   28:aload_1         
	//   19   29:aload_2         
	//   20   30:invokestatic    #49  <Method int Log.w(String, String)>
	//   21   33:pop             
		}
	//   22   34:return          
	}

	private int mLoggingLevel;

	public Logger$LogcatLogger(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #11  <Method void Logger(int)>
		mLoggingLevel = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #13  <Field int mLoggingLevel>
	//    6   10:return          
	}
}

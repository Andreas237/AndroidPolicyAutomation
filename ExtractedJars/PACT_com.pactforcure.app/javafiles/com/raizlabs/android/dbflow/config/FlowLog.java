// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.config;

import android.util.Log;

public class FlowLog
{
	public static abstract class Level extends Enum
	{

		public static Level valueOf(String s)
		{
			return (Level)Enum.valueOf(com/raizlabs/android/dbflow/config/FlowLog$Level, s);
		//    0    0:ldc1            #2   <Class FlowLog$Level>
		//    1    2:aload_0         
		//    2    3:invokestatic    #70  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class FlowLog$Level>
		//    4    9:areturn         
		}

		public static Level[] values()
		{
			return (Level[])((Level []) ($VALUES)).clone();
		//    0    0:getstatic       #60  <Field FlowLog$Level[] $VALUES>
		//    1    3:invokevirtual   #77  <Method Object _5B_Lcom.raizlabs.android.dbflow.config.FlowLog$Level_3B_.clone()>
		//    2    6:checkcast       #73  <Class FlowLog$Level[]>
		//    3    9:areturn         
		}

		abstract void call(String s, String s1, Throwable throwable);

		private static final Level $VALUES[];
		public static final Level D;
		public static final Level E;
		public static final Level I;
		public static final Level V;
		public static final Level W;
		public static final Level WTF;

		static 
		{
			V = ((Level) (new Level("V", 0) {

				void call(String s, String s1, Throwable throwable)
				{
					Log.v(s, s1, throwable);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:aload_3         
				//    3    3:invokestatic    #21  <Method int Log.v(String, String, Throwable)>
				//    4    6:pop             
				//    5    7:return          
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void FlowLog$Level(String, int, FlowLog$1)>
			//    5    7:return          
			}
			}
));
		//    0    0:new             #10  <Class FlowLog$Level$1>
		//    1    3:dup             
		//    2    4:ldc1            #32  <String "V">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #36  <Method void FlowLog$Level$1(String, int)>
		//    5   10:putstatic       #38  <Field FlowLog$Level V>
			D = ((Level) (new Level("D", 1) {

				void call(String s, String s1, Throwable throwable)
				{
					Log.d(s, s1, throwable);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:aload_3         
				//    3    3:invokestatic    #21  <Method int Log.d(String, String, Throwable)>
				//    4    6:pop             
				//    5    7:return          
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void FlowLog$Level(String, int, FlowLog$1)>
			//    5    7:return          
			}
			}
));
		//    6   13:new             #12  <Class FlowLog$Level$2>
		//    7   16:dup             
		//    8   17:ldc1            #39  <String "D">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #40  <Method void FlowLog$Level$2(String, int)>
		//   11   23:putstatic       #42  <Field FlowLog$Level D>
			I = ((Level) (new Level("I", 2) {

				void call(String s, String s1, Throwable throwable)
				{
					Log.i(s, s1, throwable);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:aload_3         
				//    3    3:invokestatic    #21  <Method int Log.i(String, String, Throwable)>
				//    4    6:pop             
				//    5    7:return          
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void FlowLog$Level(String, int, FlowLog$1)>
			//    5    7:return          
			}
			}
));
		//   12   26:new             #14  <Class FlowLog$Level$3>
		//   13   29:dup             
		//   14   30:ldc1            #43  <String "I">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #44  <Method void FlowLog$Level$3(String, int)>
		//   17   36:putstatic       #46  <Field FlowLog$Level I>
			W = ((Level) (new Level("W", 3) {

				void call(String s, String s1, Throwable throwable)
				{
					Log.w(s, s1, throwable);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:aload_3         
				//    3    3:invokestatic    #21  <Method int Log.w(String, String, Throwable)>
				//    4    6:pop             
				//    5    7:return          
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void FlowLog$Level(String, int, FlowLog$1)>
			//    5    7:return          
			}
			}
));
		//   18   39:new             #16  <Class FlowLog$Level$4>
		//   19   42:dup             
		//   20   43:ldc1            #47  <String "W">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #48  <Method void FlowLog$Level$4(String, int)>
		//   23   49:putstatic       #50  <Field FlowLog$Level W>
			E = ((Level) (new Level("E", 4) {

				void call(String s, String s1, Throwable throwable)
				{
					Log.e(s, s1, throwable);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:aload_3         
				//    3    3:invokestatic    #21  <Method int Log.e(String, String, Throwable)>
				//    4    6:pop             
				//    5    7:return          
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void FlowLog$Level(String, int, FlowLog$1)>
			//    5    7:return          
			}
			}
));
		//   24   52:new             #18  <Class FlowLog$Level$5>
		//   25   55:dup             
		//   26   56:ldc1            #51  <String "E">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #52  <Method void FlowLog$Level$5(String, int)>
		//   29   62:putstatic       #54  <Field FlowLog$Level E>
			WTF = ((Level) (new Level("WTF", 5) {

				void call(String s, String s1, Throwable throwable)
				{
					if(android.os.Build.VERSION.SDK_INT >= 8)
				//*   0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
				//*   1    3:bipush          8
				//*   2    5:icmplt          16
					{
						Log.wtf(s, s1, throwable);
				//    3    8:aload_1         
				//    4    9:aload_2         
				//    5   10:aload_3         
				//    6   11:invokestatic    #27  <Method int Log.wtf(String, String, Throwable)>
				//    7   14:pop             
						return;
				//    8   15:return          
					} else
					{
						Log.e(s, (new StringBuilder()).append("!!!!!!!!*******").append(s1).append("********!!!!!!").toString(), throwable);
				//    9   16:aload_1         
				//   10   17:new             #29  <Class StringBuilder>
				//   11   20:dup             
				//   12   21:invokespecial   #32  <Method void StringBuilder()>
				//   13   24:ldc1            #34  <String "!!!!!!!!*******">
				//   14   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
				//   15   29:aload_2         
				//   16   30:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
				//   17   33:ldc1            #40  <String "********!!!!!!">
				//   18   35:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
				//   19   38:invokevirtual   #44  <Method String StringBuilder.toString()>
				//   20   41:aload_3         
				//   21   42:invokestatic    #47  <Method int Log.e(String, String, Throwable)>
				//   22   45:pop             
						return;
				//   23   46:return          
					}
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void FlowLog$Level(String, int, FlowLog$1)>
			//    5    7:return          
			}
			}
));
		//   30   65:new             #20  <Class FlowLog$Level$6>
		//   31   68:dup             
		//   32   69:ldc1            #55  <String "WTF">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #56  <Method void FlowLog$Level$6(String, int)>
		//   35   75:putstatic       #58  <Field FlowLog$Level WTF>
			$VALUES = (new Level[] {
				V, D, I, W, E, WTF
			});
		//   36   78:bipush          6
		//   37   80:anewarray       Level[]
		//   38   83:dup             
		//   39   84:iconst_0        
		//   40   85:getstatic       #38  <Field FlowLog$Level V>
		//   41   88:aastore         
		//   42   89:dup             
		//   43   90:iconst_1        
		//   44   91:getstatic       #42  <Field FlowLog$Level D>
		//   45   94:aastore         
		//   46   95:dup             
		//   47   96:iconst_2        
		//   48   97:getstatic       #46  <Field FlowLog$Level I>
		//   49  100:aastore         
		//   50  101:dup             
		//   51  102:iconst_3        
		//   52  103:getstatic       #50  <Field FlowLog$Level W>
		//   53  106:aastore         
		//   54  107:dup             
		//   55  108:iconst_4        
		//   56  109:getstatic       #54  <Field FlowLog$Level E>
		//   57  112:aastore         
		//   58  113:dup             
		//   59  114:iconst_5        
		//   60  115:getstatic       #58  <Field FlowLog$Level WTF>
		//   61  118:aastore         
		//   62  119:putstatic       #60  <Field FlowLog$Level[] $VALUES>
		//*  63  122:return          
		}

		private Level(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #62  <Method void Enum(String, int)>
		//    4    6:return          
		}

	}


	public FlowLog()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:return          
	}

	public static boolean isEnabled(Level level1)
	{
		return level1.ordinal() >= level.ordinal();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method int FlowLog$Level.ordinal()>
	//    2    4:getstatic       #40  <Field FlowLog$Level level>
	//    3    7:invokevirtual   #50  <Method int FlowLog$Level.ordinal()>
	//    4   10:icmplt          15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public static void log(Level level1, String s)
	{
		log(level1, s, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #55  <Method void log(FlowLog$Level, String, Throwable)>
	//    4    6:return          
	}

	public static void log(Level level1, String s, String s1, Throwable throwable)
	{
		if(isEnabled(level1))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #58  <Method boolean isEnabled(FlowLog$Level)>
	//*   2    4:ifeq            14
			level1.call(s, s1, throwable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #62  <Method void FlowLog$Level.call(String, String, Throwable)>
	//    8   14:return          
	}

	public static void log(Level level1, String s, Throwable throwable)
	{
		log(level1, TAG, s, throwable);
	//    0    0:aload_0         
	//    1    1:getstatic       #35  <Field String TAG>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #64  <Method void log(FlowLog$Level, String, String, Throwable)>
	//    5    9:return          
	}

	public static void log(Level level1, Throwable throwable)
	{
		log(level1, TAG, "", throwable);
	//    0    0:aload_0         
	//    1    1:getstatic       #35  <Field String TAG>
	//    2    4:ldc1            #67  <String "">
	//    3    6:aload_1         
	//    4    7:invokestatic    #64  <Method void log(FlowLog$Level, String, String, Throwable)>
	//    5   10:return          
	}

	public static void logError(Throwable throwable)
	{
		log(Level.E, throwable);
	//    0    0:getstatic       #38  <Field FlowLog$Level FlowLog$Level.E>
	//    1    3:aload_0         
	//    2    4:invokestatic    #71  <Method void log(FlowLog$Level, Throwable)>
	//    3    7:return          
	}

	public static void setMinimumLoggingLevel(Level level1)
	{
		level = level1;
	//    0    0:aload_0         
	//    1    1:putstatic       #40  <Field FlowLog$Level level>
	//    2    4:return          
	}

	public static final String TAG = ((Class) (com/raizlabs/android/dbflow/config/FlowLog)).getSimpleName();
	private static Level level;

	static 
	{
	//    0    0:ldc1            #2   <Class FlowLog>
	//    1    2:invokevirtual   #33  <Method String Class.getSimpleName()>
	//    2    5:putstatic       #35  <Field String TAG>
		level = Level.E;
	//    3    8:getstatic       #38  <Field FlowLog$Level FlowLog$Level.E>
	//    4   11:putstatic       #40  <Field FlowLog$Level level>
	//*   5   14:return          
	}
}

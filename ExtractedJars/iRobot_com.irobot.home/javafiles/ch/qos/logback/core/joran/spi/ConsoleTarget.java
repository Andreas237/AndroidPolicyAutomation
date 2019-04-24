// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.spi;

import java.io.OutputStream;
import java.io.PrintStream;

public final class ConsoleTarget extends Enum
{

	private ConsoleTarget(String s, int i, String s1, OutputStream outputstream)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #44  <Method void Enum(String, int)>
		name = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #46  <Field String name>
		stream = outputstream;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #48  <Field OutputStream stream>
	//   10   17:return          
	}

	public static ConsoleTarget findByName(String s)
	{
		ConsoleTarget aconsoletarget[] = values();
	//    0    0:invokestatic    #56  <Method ConsoleTarget[] values()>
	//    1    3:astore_3        
		int j = aconsoletarget.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int i = 0; i < j; i++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:iload_1         
	//*   8   10:iload_2         
	//*   9   11:icmpge          41
		{
			ConsoleTarget consoletarget = aconsoletarget[i];
	//   10   14:aload_3         
	//   11   15:iload_1         
	//   12   16:aaload          
	//   13   17:astore          4
			if(consoletarget.name.equalsIgnoreCase(s))
	//*  14   19:aload           4
	//*  15   21:getfield        #46  <Field String name>
	//*  16   24:aload_0         
	//*  17   25:invokevirtual   #62  <Method boolean String.equalsIgnoreCase(String)>
	//*  18   28:ifeq            34
				return consoletarget;
	//   19   31:aload           4
	//   20   33:areturn         
		}

	//   21   34:iload_1         
	//   22   35:iconst_1        
	//   23   36:iadd            
	//   24   37:istore_1        
	//*  25   38:goto            9
		return null;
	//   26   41:aconst_null     
	//   27   42:areturn         
	}

	public static ConsoleTarget valueOf(String s)
	{
		return (ConsoleTarget)Enum.valueOf(ch/qos/logback/core/joran/spi/ConsoleTarget, s);
	//    0    0:ldc1            #2   <Class ConsoleTarget>
	//    1    2:aload_0         
	//    2    3:invokestatic    #66  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ConsoleTarget>
	//    4    9:areturn         
	}

	public static ConsoleTarget[] values()
	{
		return (ConsoleTarget[])((ConsoleTarget []) ($VALUES)).clone();
	//    0    0:getstatic       #40  <Field ConsoleTarget[] $VALUES>
	//    1    3:invokevirtual   #71  <Method Object _5B_Lch.qos.logback.core.joran.spi.ConsoleTarget_3B_.clone()>
	//    2    6:checkcast       #67  <Class ConsoleTarget[]>
	//    3    9:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String name>
	//    2    4:areturn         
	}

	public OutputStream getStream()
	{
		return stream;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field OutputStream stream>
	//    2    4:areturn         
	}

	private static final ConsoleTarget $VALUES[];
	public static final ConsoleTarget SystemErr;
	public static final ConsoleTarget SystemOut;
	private final String name;
	private final OutputStream stream;

	static 
	{
		SystemOut = new ConsoleTarget("SystemOut", 0, "System.out", ((OutputStream) (new OutputStream() {

			public void flush()
			{
				System.out.flush();
			//    0    0:getstatic       #18  <Field PrintStream System.out>
			//    1    3:invokevirtual   #22  <Method void PrintStream.flush()>
			//    2    6:return          
			}

			public void write(int i)
			{
				System.out.write(i);
			//    0    0:getstatic       #18  <Field PrintStream System.out>
			//    1    3:iload_1         
			//    2    4:invokevirtual   #26  <Method void PrintStream.write(int)>
			//    3    7:return          
			}

			public void write(byte abyte0[])
			{
				System.out.write(abyte0);
			//    0    0:getstatic       #18  <Field PrintStream System.out>
			//    1    3:aload_1         
			//    2    4:invokevirtual   #29  <Method void PrintStream.write(byte[])>
			//    3    7:return          
			}

			public void write(byte abyte0[], int i, int j)
			{
				System.out.write(abyte0, i, j);
			//    0    0:getstatic       #18  <Field PrintStream System.out>
			//    1    3:aload_1         
			//    2    4:iload_2         
			//    3    5:iload_3         
			//    4    6:invokevirtual   #32  <Method void PrintStream.write(byte[], int, int)>
			//    5    9:return          
			}

		}
)));
	//    0    0:new             #2   <Class ConsoleTarget>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "SystemOut">
	//    3    6:iconst_0        
	//    4    7:ldc1            #24  <String "System.out">
	//    5    9:new             #7   <Class ConsoleTarget$1>
	//    6   12:dup             
	//    7   13:invokespecial   #27  <Method void ConsoleTarget$1()>
	//    8   16:invokespecial   #30  <Method void ConsoleTarget(String, int, String, OutputStream)>
	//    9   19:putstatic       #32  <Field ConsoleTarget SystemOut>
		SystemErr = new ConsoleTarget("SystemErr", 1, "System.err", ((OutputStream) (new OutputStream() {

			public void flush()
			{
				System.err.flush();
			//    0    0:getstatic       #18  <Field PrintStream System.err>
			//    1    3:invokevirtual   #22  <Method void PrintStream.flush()>
			//    2    6:return          
			}

			public void write(int i)
			{
				System.err.write(i);
			//    0    0:getstatic       #18  <Field PrintStream System.err>
			//    1    3:iload_1         
			//    2    4:invokevirtual   #26  <Method void PrintStream.write(int)>
			//    3    7:return          
			}

			public void write(byte abyte0[])
			{
				System.err.write(abyte0);
			//    0    0:getstatic       #18  <Field PrintStream System.err>
			//    1    3:aload_1         
			//    2    4:invokevirtual   #29  <Method void PrintStream.write(byte[])>
			//    3    7:return          
			}

			public void write(byte abyte0[], int i, int j)
			{
				System.err.write(abyte0, i, j);
			//    0    0:getstatic       #18  <Field PrintStream System.err>
			//    1    3:aload_1         
			//    2    4:iload_2         
			//    3    5:iload_3         
			//    4    6:invokevirtual   #32  <Method void PrintStream.write(byte[], int, int)>
			//    5    9:return          
			}

		}
)));
	//   10   22:new             #2   <Class ConsoleTarget>
	//   11   25:dup             
	//   12   26:ldc1            #33  <String "SystemErr">
	//   13   28:iconst_1        
	//   14   29:ldc1            #35  <String "System.err">
	//   15   31:new             #9   <Class ConsoleTarget$2>
	//   16   34:dup             
	//   17   35:invokespecial   #36  <Method void ConsoleTarget$2()>
	//   18   38:invokespecial   #30  <Method void ConsoleTarget(String, int, String, OutputStream)>
	//   19   41:putstatic       #38  <Field ConsoleTarget SystemErr>
		$VALUES = (new ConsoleTarget[] {
			SystemOut, SystemErr
		});
	//   20   44:iconst_2        
	//   21   45:anewarray       ConsoleTarget[]
	//   22   48:dup             
	//   23   49:iconst_0        
	//   24   50:getstatic       #32  <Field ConsoleTarget SystemOut>
	//   25   53:aastore         
	//   26   54:dup             
	//   27   55:iconst_1        
	//   28   56:getstatic       #38  <Field ConsoleTarget SystemErr>
	//   29   59:aastore         
	//   30   60:putstatic       #40  <Field ConsoleTarget[] $VALUES>
	//*  31   63:return          
	}
}

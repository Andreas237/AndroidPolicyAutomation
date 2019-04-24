// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.recovery;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.status.*;
import java.io.*;

// Referenced classes of package ch.qos.logback.core.recovery:
//			RecoveryCoordinator

public abstract class ResilientOutputStreamBase extends OutputStream
{

	public ResilientOutputStreamBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void OutputStream()>
		noContextWarning = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #23  <Field int noContextWarning>
		statusCount = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #25  <Field int statusCount>
		presumedClean = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #27  <Field boolean presumedClean>
	//   11   19:return          
	}

	private boolean isPresumedInError()
	{
		return recoveryCoordinator != null && !presumedClean;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field RecoveryCoordinator recoveryCoordinator>
	//    2    4:ifnull          16
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field boolean presumedClean>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private void postSuccessfulWrite()
	{
		if(recoveryCoordinator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field RecoveryCoordinator recoveryCoordinator>
	//*   2    4:ifnull          57
		{
			recoveryCoordinator = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #32  <Field RecoveryCoordinator recoveryCoordinator>
			statusCount = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #25  <Field int statusCount>
			StringBuilder stringbuilder = new StringBuilder();
	//    9   17:new             #35  <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #36  <Method void StringBuilder()>
	//   12   24:astore_1        
			stringbuilder.append("Recovered from IO failure on ");
	//   13   25:aload_1         
	//   14   26:ldc1            #38  <String "Recovered from IO failure on ">
	//   15   28:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			stringbuilder.append(getDescription());
	//   17   32:aload_1         
	//   18   33:aload_0         
	//   19   34:invokevirtual   #46  <Method String getDescription()>
	//   20   37:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
			addStatus(((Status) (new InfoStatus(stringbuilder.toString(), ((Object) (this))))));
	//   22   41:aload_0         
	//   23   42:new             #48  <Class InfoStatus>
	//   24   45:dup             
	//   25   46:aload_1         
	//   26   47:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   27   50:aload_0         
	//   28   51:invokespecial   #54  <Method void InfoStatus(String, Object)>
	//   29   54:invokevirtual   #58  <Method void addStatus(Status)>
		}
	//   30   57:return          
	}

	public void addStatus(Status status)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field Context context>
	//*   2    4:ifnonnull       57
		{
			int i = noContextWarning;
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field int noContextWarning>
	//    5   11:istore_2        
			noContextWarning = i + 1;
	//    6   12:aload_0         
	//    7   13:iload_2         
	//    8   14:iconst_1        
	//    9   15:iadd            
	//   10   16:putfield        #23  <Field int noContextWarning>
			if(i == 0)
	//*  11   19:iload_2         
	//*  12   20:ifne            56
			{
				status = ((Status) (System.out));
	//   13   23:getstatic       #66  <Field PrintStream System.out>
	//   14   26:astore_1        
				StringBuilder stringbuilder = new StringBuilder();
	//   15   27:new             #35  <Class StringBuilder>
	//   16   30:dup             
	//   17   31:invokespecial   #36  <Method void StringBuilder()>
	//   18   34:astore_3        
				stringbuilder.append("LOGBACK: No context given for ");
	//   19   35:aload_3         
	//   20   36:ldc1            #68  <String "LOGBACK: No context given for ">
	//   21   38:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
				stringbuilder.append(((Object) (this)));
	//   23   42:aload_3         
	//   24   43:aload_0         
	//   25   44:invokevirtual   #71  <Method StringBuilder StringBuilder.append(Object)>
	//   26   47:pop             
				((PrintStream) (status)).println(stringbuilder.toString());
	//   27   48:aload_1         
	//   28   49:aload_3         
	//   29   50:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   30   53:invokevirtual   #77  <Method void PrintStream.println(String)>
			}
			return;
	//   31   56:return          
		}
		StatusManager statusmanager = context.getStatusManager();
	//   32   57:aload_0         
	//   33   58:getfield        #60  <Field Context context>
	//   34   61:invokeinterface #83  <Method StatusManager Context.getStatusManager()>
	//   35   66:astore_3        
		if(statusmanager != null)
	//*  36   67:aload_3         
	//*  37   68:ifnull          78
			statusmanager.add(status);
	//   38   71:aload_3         
	//   39   72:aload_1         
	//   40   73:invokeinterface #88  <Method void StatusManager.add(Status)>
	//   41   78:return          
	}

	void addStatusIfCountNotOverLimit(Status status)
	{
		statusCount = statusCount + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field int statusCount>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #25  <Field int statusCount>
		if(statusCount < 8)
	//*   6   10:aload_0         
	//*   7   11:getfield        #25  <Field int statusCount>
	//*   8   14:bipush          8
	//*   9   16:icmpge          24
			addStatus(status);
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #58  <Method void addStatus(Status)>
		if(statusCount == 8)
	//*  13   24:aload_0         
	//*  14   25:getfield        #25  <Field int statusCount>
	//*  15   28:bipush          8
	//*  16   30:icmpne          78
		{
			addStatus(status);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #58  <Method void addStatus(Status)>
			status = ((Status) (new StringBuilder()));
	//   20   38:new             #35  <Class StringBuilder>
	//   21   41:dup             
	//   22   42:invokespecial   #36  <Method void StringBuilder()>
	//   23   45:astore_1        
			((StringBuilder) (status)).append("Will supress future messages regarding ");
	//   24   46:aload_1         
	//   25   47:ldc1            #91  <String "Will supress future messages regarding ">
	//   26   49:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
			((StringBuilder) (status)).append(getDescription());
	//   28   53:aload_1         
	//   29   54:aload_0         
	//   30   55:invokevirtual   #46  <Method String getDescription()>
	//   31   58:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   32   61:pop             
			addStatus(((Status) (new InfoStatus(((StringBuilder) (status)).toString(), ((Object) (this))))));
	//   33   62:aload_0         
	//   34   63:new             #48  <Class InfoStatus>
	//   35   66:dup             
	//   36   67:aload_1         
	//   37   68:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   38   71:aload_0         
	//   39   72:invokespecial   #54  <Method void InfoStatus(String, Object)>
	//   40   75:invokevirtual   #58  <Method void addStatus(Status)>
		}
	//   41   78:return          
	}

	void attemptRecovery()
	{
		StringBuilder stringbuilder;
		try
		{
			close();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #97  <Method void close()>
		}
	//*   2    4:new             #35  <Class StringBuilder>
	//*   3    7:dup             
	//*   4    8:invokespecial   #36  <Method void StringBuilder()>
	//*   5   11:astore_1        
	//*   6   12:aload_1         
	//*   7   13:ldc1            #99  <String "Attempting to recover from IO failure on ">
	//*   8   15:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//*   9   18:pop             
	//*  10   19:aload_1         
	//*  11   20:aload_0         
	//*  12   21:invokevirtual   #46  <Method String getDescription()>
	//*  13   24:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//*  14   27:pop             
	//*  15   28:aload_0         
	//*  16   29:new             #48  <Class InfoStatus>
	//*  17   32:dup             
	//*  18   33:aload_1         
	//*  19   34:invokevirtual   #51  <Method String StringBuilder.toString()>
	//*  20   37:aload_0         
	//*  21   38:invokespecial   #54  <Method void InfoStatus(String, Object)>
	//*  22   41:invokevirtual   #101 <Method void addStatusIfCountNotOverLimit(Status)>
	//*  23   44:aload_0         
	//*  24   45:aload_0         
	//*  25   46:invokevirtual   #105 <Method OutputStream openNewOutputStream()>
	//*  26   49:putfield        #107 <Field OutputStream os>
	//*  27   52:aload_0         
	//*  28   53:iconst_1        
	//*  29   54:putfield        #27  <Field boolean presumedClean>
	//*  30   57:return          
	//*  31   58:astore_1        
	//*  32   59:new             #35  <Class StringBuilder>
	//*  33   62:dup             
	//*  34   63:invokespecial   #36  <Method void StringBuilder()>
	//*  35   66:astore_2        
	//*  36   67:aload_2         
	//*  37   68:ldc1            #109 <String "Failed to open ">
	//*  38   70:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//*  39   73:pop             
	//*  40   74:aload_2         
	//*  41   75:aload_0         
	//*  42   76:invokevirtual   #46  <Method String getDescription()>
	//*  43   79:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//*  44   82:pop             
	//*  45   83:aload_0         
	//*  46   84:new             #111 <Class ErrorStatus>
	//*  47   87:dup             
	//*  48   88:aload_2         
	//*  49   89:invokevirtual   #51  <Method String StringBuilder.toString()>
	//*  50   92:aload_0         
	//*  51   93:aload_1         
	//*  52   94:invokespecial   #114 <Method void ErrorStatus(String, Object, Throwable)>
	//*  53   97:invokevirtual   #101 <Method void addStatusIfCountNotOverLimit(Status)>
	//*  54  100:return          
		catch(IOException ioexception1) { }
	//   55  101:astore_1        
		stringbuilder = new StringBuilder();
		stringbuilder.append("Attempting to recover from IO failure on ");
		stringbuilder.append(getDescription());
		addStatusIfCountNotOverLimit(((Status) (new InfoStatus(stringbuilder.toString(), ((Object) (this))))));
		try
		{
			os = openNewOutputStream();
			presumedClean = true;
			return;
		}
		catch(IOException ioexception)
		{
			StringBuilder stringbuilder1 = new StringBuilder();
			stringbuilder1.append("Failed to open ");
			stringbuilder1.append(getDescription());
			addStatusIfCountNotOverLimit(((Status) (new ErrorStatus(stringbuilder1.toString(), ((Object) (this)), ((Throwable) (ioexception))))));
			return;
		}
	//*  56  102:goto            4
	}

	public void close()
	{
		if(os != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field OutputStream os>
	//*   2    4:ifnull          14
			os.close();
	//    3    7:aload_0         
	//    4    8:getfield        #107 <Field OutputStream os>
	//    5   11:invokevirtual   #115 <Method void OutputStream.close()>
	//    6   14:return          
	}

	public void flush()
	{
		if(os != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field OutputStream os>
	//*   2    4:ifnull          25
			try
			{
				os.flush();
	//    3    7:aload_0         
	//    4    8:getfield        #107 <Field OutputStream os>
	//    5   11:invokevirtual   #118 <Method void OutputStream.flush()>
				postSuccessfulWrite();
	//    6   14:aload_0         
	//    7   15:invokespecial   #120 <Method void postSuccessfulWrite()>
				return;
	//    8   18:return          
			}
			catch(IOException ioexception)
	//*   9   19:astore_1        
			{
				postIOFailure(ioexception);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #124 <Method void postIOFailure(IOException)>
			}
	//   13   25:return          
	}

	public Context getContext()
	{
		return context;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Context context>
	//    2    4:areturn         
	}

	abstract String getDescription();

	abstract OutputStream openNewOutputStream();

	void postIOFailure(IOException ioexception)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #35  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("IO failure while writing to ");
	//    4    8:aload_2         
	//    5    9:ldc1            #128 <String "IO failure while writing to ">
	//    6   11:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getDescription());
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #46  <Method String getDescription()>
	//   11   20:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		addStatusIfCountNotOverLimit(((Status) (new ErrorStatus(stringbuilder.toString(), ((Object) (this)), ((Throwable) (ioexception))))));
	//   13   24:aload_0         
	//   14   25:new             #111 <Class ErrorStatus>
	//   15   28:dup             
	//   16   29:aload_2         
	//   17   30:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   18   33:aload_0         
	//   19   34:aload_1         
	//   20   35:invokespecial   #114 <Method void ErrorStatus(String, Object, Throwable)>
	//   21   38:invokevirtual   #101 <Method void addStatusIfCountNotOverLimit(Status)>
		presumedClean = false;
	//   22   41:aload_0         
	//   23   42:iconst_0        
	//   24   43:putfield        #27  <Field boolean presumedClean>
		if(recoveryCoordinator == null)
	//*  25   46:aload_0         
	//*  26   47:getfield        #32  <Field RecoveryCoordinator recoveryCoordinator>
	//*  27   50:ifnonnull       64
			recoveryCoordinator = new RecoveryCoordinator();
	//   28   53:aload_0         
	//   29   54:new             #130 <Class RecoveryCoordinator>
	//   30   57:dup             
	//   31   58:invokespecial   #131 <Method void RecoveryCoordinator()>
	//   32   61:putfield        #32  <Field RecoveryCoordinator recoveryCoordinator>
	//   33   64:return          
	}

	public void setContext(Context context1)
	{
		context = context1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field Context context>
	//    3    5:return          
	}

	public void write(int i)
	{
		if(isPresumedInError())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #137 <Method boolean isPresumedInError()>
	//*   2    4:ifeq            22
		{
			if(!recoveryCoordinator.isTooSoon())
	//*   3    7:aload_0         
	//*   4    8:getfield        #32  <Field RecoveryCoordinator recoveryCoordinator>
	//*   5   11:invokevirtual   #140 <Method boolean RecoveryCoordinator.isTooSoon()>
	//*   6   14:ifne            21
				attemptRecovery();
	//    7   17:aload_0         
	//    8   18:invokevirtual   #142 <Method void attemptRecovery()>
			return;
	//    9   21:return          
		}
		try
		{
			os.write(i);
	//   10   22:aload_0         
	//   11   23:getfield        #107 <Field OutputStream os>
	//   12   26:iload_1         
	//   13   27:invokevirtual   #144 <Method void OutputStream.write(int)>
			postSuccessfulWrite();
	//   14   30:aload_0         
	//   15   31:invokespecial   #120 <Method void postSuccessfulWrite()>
			return;
	//   16   34:return          
		}
		catch(IOException ioexception)
	//*  17   35:astore_2        
		{
			postIOFailure(ioexception);
	//   18   36:aload_0         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #124 <Method void postIOFailure(IOException)>
		}
	//   21   41:return          
	}

	public void write(byte abyte0[], int i, int j)
	{
		if(isPresumedInError())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #137 <Method boolean isPresumedInError()>
	//*   2    4:ifeq            22
		{
			if(!recoveryCoordinator.isTooSoon())
	//*   3    7:aload_0         
	//*   4    8:getfield        #32  <Field RecoveryCoordinator recoveryCoordinator>
	//*   5   11:invokevirtual   #140 <Method boolean RecoveryCoordinator.isTooSoon()>
	//*   6   14:ifne            21
				attemptRecovery();
	//    7   17:aload_0         
	//    8   18:invokevirtual   #142 <Method void attemptRecovery()>
			return;
	//    9   21:return          
		}
		try
		{
			os.write(abyte0, i, j);
	//   10   22:aload_0         
	//   11   23:getfield        #107 <Field OutputStream os>
	//   12   26:aload_1         
	//   13   27:iload_2         
	//   14   28:iload_3         
	//   15   29:invokevirtual   #147 <Method void OutputStream.write(byte[], int, int)>
			postSuccessfulWrite();
	//   16   32:aload_0         
	//   17   33:invokespecial   #120 <Method void postSuccessfulWrite()>
			return;
	//   18   36:return          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  19   37:astore_1        
		{
			postIOFailure(((IOException) (abyte0)));
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #124 <Method void postIOFailure(IOException)>
		}
	//   23   43:return          
	}

	static final int STATUS_COUNT_LIMIT = 8;
	private Context context;
	private int noContextWarning;
	protected OutputStream os;
	protected boolean presumedClean;
	private RecoveryCoordinator recoveryCoordinator;
	private int statusCount;
}

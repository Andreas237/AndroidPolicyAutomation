// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.autorun;

import android.os.RemoteException;
import com.sec.android.service.health.cp.accesscontrol.AccesscontrolUtil;
import com.sec.android.service.health.util.LOG;

// Referenced classes of package com.sec.android.service.health.autorun:
//			AutoRunService, AutoRunHandler

class AutoRunService$1 extends .Stub
{

	public int isAutoRunModeEnabled(String s)
		throws RemoteException
	{
		LOG.d(AutoRunService.access$000(), "isAutoRunModeEnabled()");
	//    0    0:invokestatic    #26  <Method Class AutoRunService.access$000()>
	//    1    3:ldc1            #28  <String "isAutoRunModeEnabled()">
	//    2    5:invokestatic    #34  <Method void LOG.d(Class, String)>
		if(!AccesscontrolUtil.checkSignature(((android.content.Context) (AutoRunService.access$100(AutoRunService.this))), AccesscontrolUtil.getCallerPackage(((android.content.Context) (AutoRunService.access$100(AutoRunService.this))))))
	//*   3    8:aload_0         
	//*   4    9:getfield        #12  <Field AutoRunService this$0>
	//*   5   12:invokestatic    #38  <Method AutoRunService AutoRunService.access$100(AutoRunService)>
	//*   6   15:aload_0         
	//*   7   16:getfield        #12  <Field AutoRunService this$0>
	//*   8   19:invokestatic    #38  <Method AutoRunService AutoRunService.access$100(AutoRunService)>
	//*   9   22:invokestatic    #44  <Method String AccesscontrolUtil.getCallerPackage(android.content.Context)>
	//*  10   25:invokestatic    #48  <Method boolean AccesscontrolUtil.checkSignature(android.content.Context, String)>
	//*  11   28:ifne            42
		{
			LOG.d(AutoRunService.access$000(), "[AutoRunService] isAutoRunModeEnable : Security exception - Caller application not privileged");
	//   12   31:invokestatic    #26  <Method Class AutoRunService.access$000()>
	//   13   34:ldc1            #50  <String "[AutoRunService] isAutoRunModeEnable : Security exception - Caller application not privileged">
	//   14   36:invokestatic    #34  <Method void LOG.d(Class, String)>
			return -5;
	//   15   39:bipush          -5
	//   16   41:ireturn         
		}
		int i;
		if(AutoRunService.access$200(AutoRunService.this) == null)
			break MISSING_BLOCK_LABEL_71;
	//   17   42:aload_0         
	//   18   43:getfield        #12  <Field AutoRunService this$0>
	//   19   46:invokestatic    #54  <Method AutoRunHandler AutoRunService.access$200(AutoRunService)>
	//   20   49:ifnull          71
		i = AutoRunService.access$200(AutoRunService.this).isEnabled(s);
	//   21   52:aload_0         
	//   22   53:getfield        #12  <Field AutoRunService this$0>
	//   23   56:invokestatic    #54  <Method AutoRunHandler AutoRunService.access$200(AutoRunService)>
	//   24   59:aload_1         
	//   25   60:invokevirtual   #59  <Method int AutoRunHandler.isEnabled(String)>
	//   26   63:istore_2        
		return i;
	//   27   64:iload_2         
	//   28   65:ireturn         
		s;
	//   29   66:astore_1        
		((Exception) (s)).printStackTrace();
	//   30   67:aload_1         
	//   31   68:invokevirtual   #62  <Method void Exception.printStackTrace()>
		return -1;
	//   32   71:iconst_m1       
	//   33   72:ireturn         
	}

	public int setAutoRunMode(String s, int i)
		throws RemoteException
	{
		LOG.d(AutoRunService.access$000(), "autoRunModeEnable()");
	//    0    0:invokestatic    #26  <Method Class AutoRunService.access$000()>
	//    1    3:ldc1            #67  <String "autoRunModeEnable()">
	//    2    5:invokestatic    #34  <Method void LOG.d(Class, String)>
		if(!AccesscontrolUtil.checkSignature(((android.content.Context) (AutoRunService.access$100(AutoRunService.this))), AccesscontrolUtil.getCallerPackage(((android.content.Context) (AutoRunService.access$100(AutoRunService.this))))))
	//*   3    8:aload_0         
	//*   4    9:getfield        #12  <Field AutoRunService this$0>
	//*   5   12:invokestatic    #38  <Method AutoRunService AutoRunService.access$100(AutoRunService)>
	//*   6   15:aload_0         
	//*   7   16:getfield        #12  <Field AutoRunService this$0>
	//*   8   19:invokestatic    #38  <Method AutoRunService AutoRunService.access$100(AutoRunService)>
	//*   9   22:invokestatic    #44  <Method String AccesscontrolUtil.getCallerPackage(android.content.Context)>
	//*  10   25:invokestatic    #48  <Method boolean AccesscontrolUtil.checkSignature(android.content.Context, String)>
	//*  11   28:ifne            42
		{
			LOG.d(AutoRunService.access$000(), "[AutoRunService] autoRunModeEnable : Security exception - Caller application not privileged");
	//   12   31:invokestatic    #26  <Method Class AutoRunService.access$000()>
	//   13   34:ldc1            #69  <String "[AutoRunService] autoRunModeEnable : Security exception - Caller application not privileged">
	//   14   36:invokestatic    #34  <Method void LOG.d(Class, String)>
			return -5;
	//   15   39:bipush          -5
	//   16   41:ireturn         
		}
		if(i == 100)
	//*  17   42:iload_2         
	//*  18   43:bipush          100
	//*  19   45:icmpne          70
		{
			try
			{
				if(AutoRunService.access$200(AutoRunService.this) != null)
	//*  20   48:aload_0         
	//*  21   49:getfield        #12  <Field AutoRunService this$0>
	//*  22   52:invokestatic    #54  <Method AutoRunHandler AutoRunService.access$200(AutoRunService)>
	//*  23   55:ifnull          105
					return AutoRunService.access$200(AutoRunService.this).enableMode(s);
	//   24   58:aload_0         
	//   25   59:getfield        #12  <Field AutoRunService this$0>
	//   26   62:invokestatic    #54  <Method AutoRunHandler AutoRunService.access$200(AutoRunService)>
	//   27   65:aload_1         
	//   28   66:invokevirtual   #72  <Method int AutoRunHandler.enableMode(String)>
	//   29   69:ireturn         
			}
	//*  30   70:iload_2         
	//*  31   71:bipush          101
	//*  32   73:icmpne          105
	//*  33   76:aload_0         
	//*  34   77:getfield        #12  <Field AutoRunService this$0>
	//*  35   80:invokestatic    #54  <Method AutoRunHandler AutoRunService.access$200(AutoRunService)>
	//*  36   83:ifnull          105
	//*  37   86:aload_0         
	//*  38   87:getfield        #12  <Field AutoRunService this$0>
	//*  39   90:invokestatic    #54  <Method AutoRunHandler AutoRunService.access$200(AutoRunService)>
	//*  40   93:aload_1         
	//*  41   94:invokevirtual   #75  <Method int AutoRunHandler.disableMode(String)>
	//*  42   97:istore_2        
	//*  43   98:iload_2         
	//*  44   99:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  45  100:astore_1        
			{
				((Exception) (s)).printStackTrace();
	//   46  101:aload_1         
	//   47  102:invokevirtual   #62  <Method void Exception.printStackTrace()>
			}
			break MISSING_BLOCK_LABEL_105;
		}
		if(i != 101)
			break MISSING_BLOCK_LABEL_105;
		if(AutoRunService.access$200(AutoRunService.this) == null)
			break MISSING_BLOCK_LABEL_105;
		i = AutoRunService.access$200(AutoRunService.this).disableMode(s);
		return i;
		return -1;
	//   48  105:iconst_m1       
	//   49  106:ireturn         
	}

	final AutoRunService this$0;

	AutoRunService$1()
	{
		this$0 = AutoRunService.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field AutoRunService this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void IAutoRunInterface$Stub()>
	//    5    9:return          
	}
}

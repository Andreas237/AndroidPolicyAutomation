// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.home.util.o;
import java.io.*;

// Referenced classes of package com.irobot.home:
//			WizardFragmentActivity

class WizardFragmentActivity$5
	implements Runnable
{

	public void run()
	{
		BufferedReader bufferedreader;
		bufferedreader = new BufferedReader(((java.io.Reader) (new InputStreamReader(Runtime.getRuntime().exec("logcat").getInputStream()))));
	//    0    0:new             #25  <Class BufferedReader>
	//    1    3:dup             
	//    2    4:new             #27  <Class InputStreamReader>
	//    3    7:dup             
	//    4    8:invokestatic    #33  <Method Runtime Runtime.getRuntime()>
	//    5   11:ldc1            #35  <String "logcat">
	//    6   13:invokevirtual   #39  <Method Process Runtime.exec(String)>
	//    7   16:invokevirtual   #45  <Method java.io.InputStream Process.getInputStream()>
	//    8   19:invokespecial   #48  <Method void InputStreamReader(java.io.InputStream)>
	//    9   22:invokespecial   #51  <Method void BufferedReader(java.io.Reader)>
	//   10   25:astore_2        
		a.z = new StringBuilder();
	//   11   26:aload_0         
	//   12   27:getfield        #17  <Field WizardFragmentActivity a>
	//   13   30:new             #53  <Class StringBuilder>
	//   14   33:dup             
	//   15   34:invokespecial   #54  <Method void StringBuilder()>
	//   16   37:putfield        #58  <Field StringBuilder WizardFragmentActivity.z>
		StringBuilder stringbuilder = a.z;
	//   17   40:aload_0         
	//   18   41:getfield        #17  <Field WizardFragmentActivity a>
	//   19   44:getfield        #58  <Field StringBuilder WizardFragmentActivity.z>
	//   20   47:astore_1        
		stringbuilder;
	//   21   48:aload_1         
		JVM INSTR monitorenter ;
	//   22   49:monitorenter    
_L1:
		String s;
		if(a.A)
			break MISSING_BLOCK_LABEL_97;
	//   23   50:aload_0         
	//   24   51:getfield        #17  <Field WizardFragmentActivity a>
	//   25   54:getfield        #62  <Field boolean WizardFragmentActivity.A>
	//   26   57:ifne            97
		s = bufferedreader.readLine();
	//   27   60:aload_2         
	//   28   61:invokevirtual   #66  <Method String BufferedReader.readLine()>
	//   29   64:astore_3        
		if(s == null)
			break MISSING_BLOCK_LABEL_97;
	//   30   65:aload_3         
	//   31   66:ifnull          97
		a.z.append(s);
	//   32   69:aload_0         
	//   33   70:getfield        #17  <Field WizardFragmentActivity a>
	//   34   73:getfield        #58  <Field StringBuilder WizardFragmentActivity.z>
	//   35   76:aload_3         
	//   36   77:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   37   80:pop             
		a.z.append("\n");
	//   38   81:aload_0         
	//   39   82:getfield        #17  <Field WizardFragmentActivity a>
	//   40   85:getfield        #58  <Field StringBuilder WizardFragmentActivity.z>
	//   41   88:ldc1            #72  <String "\n">
	//   42   90:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   43   93:pop             
		  goto _L1
	//*  44   94:goto            50
		stringbuilder;
	//   45   97:aload_1         
		JVM INSTR monitorexit ;
	//   46   98:monitorexit     
		return;
	//   47   99:return          
		Exception exception;
		exception;
	//   48  100:astore_2        
		stringbuilder;
	//   49  101:aload_1         
		JVM INSTR monitorexit ;
	//   50  102:monitorexit     
		IOException ioexception;
		try
		{
			throw exception;
	//   51  103:aload_2         
	//   52  104:athrow          
		}
	//*  53  105:aload_0         
	//*  54  106:getfield        #17  <Field WizardFragmentActivity a>
	//*  55  109:getfield        #76  <Field String WizardFragmentActivity.w>
	//*  56  112:ldc1            #78  <String "IO Exception while getting log.">
	//*  57  114:invokestatic    #84  <Method void o.e(String, String)>
	//*  58  117:return          
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			o.e(a.w, "IO Exception while getting log.");
		}
		return;
	//*  59  118:astore_1        
	//*  60  119:goto            105
	}

	final WizardFragmentActivity a;

	WizardFragmentActivity$5(WizardFragmentActivity wizardfragmentactivity)
	{
		a = wizardfragmentactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field WizardFragmentActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}

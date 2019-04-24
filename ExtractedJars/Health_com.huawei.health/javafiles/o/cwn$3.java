// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.File;

// Referenced classes of package o:
//			cwn, dho

class cwn$3
	implements Runnable
{

	public void run()
	{
		if(c.isDirectory())
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field File c>
	//*   2    4:invokevirtual   #33  <Method boolean File.isDirectory()>
	//*   3    7:ifeq            175
		{
			String as[] = c.list();
	//    4   10:aload_0         
	//    5   11:getfield        #20  <Field File c>
	//    6   14:invokevirtual   #37  <Method String[] File.list()>
	//    7   17:astore_2        
			if(as != null && as.length > 0)
	//*   8   18:aload_2         
	//*   9   19:ifnull          175
	//*  10   22:aload_2         
	//*  11   23:arraylength     
	//*  12   24:ifle            175
			{
				for(int i = 0; i < as.length; i++)
	//*  13   27:iconst_0        
	//*  14   28:istore_1        
	//*  15   29:iload_1         
	//*  16   30:aload_2         
	//*  17   31:arraylength     
	//*  18   32:icmpge          175
				{
					dho.d("MyCrashHandler", new Object[] {
						"fileName=", as[i]
					});
	//   19   35:ldc1            #39  <String "MyCrashHandler">
	//   20   37:iconst_2        
	//   21   38:anewarray       Object[]
	//   22   41:dup             
	//   23   42:iconst_0        
	//   24   43:ldc1            #41  <String "fileName=">
	//   25   45:aastore         
	//   26   46:dup             
	//   27   47:iconst_1        
	//   28   48:aload_2         
	//   29   49:iload_1         
	//   30   50:aaload          
	//   31   51:aastore         
	//   32   52:invokestatic    #47  <Method void dho.d(String, Object[])>
					File file = new File((new StringBuilder()).append(cwn.d(e)).append("/").append(as[i]).toString());
	//   33   55:new             #29  <Class File>
	//   34   58:dup             
	//   35   59:new             #49  <Class StringBuilder>
	//   36   62:dup             
	//   37   63:invokespecial   #50  <Method void StringBuilder()>
	//   38   66:aload_0         
	//   39   67:getfield        #18  <Field cwn e>
	//   40   70:invokestatic    #53  <Method String cwn.d(cwn)>
	//   41   73:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   42   76:ldc1            #59  <String "/">
	//   43   78:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   44   81:aload_2         
	//   45   82:iload_1         
	//   46   83:aaload          
	//   47   84:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   48   87:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   49   90:invokespecial   #66  <Method void File(String)>
	//   50   93:astore_3        
					String s = file.getName();
	//   51   94:aload_3         
	//   52   95:invokevirtual   #69  <Method String File.getName()>
	//   53   98:astore          4
					if(!file.isFile() || !s.startsWith("app_crashLog_") || !s.endsWith(".txt"))
						continue;
	//   54  100:aload_3         
	//   55  101:invokevirtual   #72  <Method boolean File.isFile()>
	//   56  104:ifeq            168
	//   57  107:aload           4
	//   58  109:ldc1            #74  <String "app_crashLog_">
	//   59  111:invokevirtual   #80  <Method boolean String.startsWith(String)>
	//   60  114:ifeq            168
	//   61  117:aload           4
	//   62  119:ldc1            #82  <String ".txt">
	//   63  121:invokevirtual   #85  <Method boolean String.endsWith(String)>
	//   64  124:ifeq            168
					try
					{
						if(file.delete())
	//*  65  127:aload_3         
	//*  66  128:invokevirtual   #88  <Method boolean File.delete()>
	//*  67  131:ifeq            148
							dho.d("MyCrashHandler", new Object[] {
								"delFile.delete ,success."
							});
	//   68  134:ldc1            #39  <String "MyCrashHandler">
	//   69  136:iconst_1        
	//   70  137:anewarray       Object[]
	//   71  140:dup             
	//   72  141:iconst_0        
	//   73  142:ldc1            #90  <String "delFile.delete ,success.">
	//   74  144:aastore         
	//   75  145:invokestatic    #47  <Method void dho.d(String, Object[])>
					}
	//*  76  148:goto            168
					catch(Exception exception)
	//*  77  151:astore_3        
					{
						dho.d("MyCrashHandler", new Object[] {
							exception.getMessage()
						});
	//   78  152:ldc1            #39  <String "MyCrashHandler">
	//   79  154:iconst_1        
	//   80  155:anewarray       Object[]
	//   81  158:dup             
	//   82  159:iconst_0        
	//   83  160:aload_3         
	//   84  161:invokevirtual   #93  <Method String Exception.getMessage()>
	//   85  164:aastore         
	//   86  165:invokestatic    #47  <Method void dho.d(String, Object[])>
					}
				}

	//   87  168:iload_1         
	//   88  169:iconst_1        
	//   89  170:iadd            
	//   90  171:istore_1        
			}
		}
	//*  91  172:goto            29
	//   92  175:return          
	}

	final File c;
	final cwn e;

	cwn$3(cwn cwn1, File file)
	{
		e = cwn1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field cwn e>
		c = file;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field File c>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}

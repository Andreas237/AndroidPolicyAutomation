// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.health;

import com.squareup.leakcanary.*;
import java.io.*;
import o.dbf;
import o.dho;

public class LeakUploadService extends DisplayLeakService
{

	public LeakUploadService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void DisplayLeakService()>
	//    2    4:return          
	}

	private void e(File file, String s)
	{
		FileOutputStream fileoutputstream;
		FileOutputStream fileoutputstream1;
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		fileoutputstream1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          4
		fileoutputstream = fileoutputstream1;
	//    4    6:aload           4
	//    5    8:astore_3        
		file = ((File) (obj));
	//    6    9:aload           5
	//    7   11:astore_1        
		Object obj1 = ((Object) (dbf.z(getApplicationContext())));
	//    8   12:aload_0         
	//    9   13:invokevirtual   #17  <Method android.content.Context getApplicationContext()>
	//   10   16:invokestatic    #23  <Method String dbf.z(android.content.Context)>
	//   11   19:astore          6
		fileoutputstream = fileoutputstream1;
	//   12   21:aload           4
	//   13   23:astore_3        
		file = ((File) (obj));
	//   14   24:aload           5
	//   15   26:astore_1        
		obj1 = ((Object) (new File((new StringBuilder()).append(((String) (obj1))).append("leak.txt").toString())));
	//   16   27:new             #25  <Class File>
	//   17   30:dup             
	//   18   31:new             #27  <Class StringBuilder>
	//   19   34:dup             
	//   20   35:invokespecial   #28  <Method void StringBuilder()>
	//   21   38:aload           6
	//   22   40:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:ldc1            #34  <String "leak.txt">
	//   24   45:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   25   48:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   26   51:invokespecial   #41  <Method void File(String)>
	//   27   54:astore          6
		fileoutputstream = fileoutputstream1;
	//   28   56:aload           4
	//   29   58:astore_3        
		file = ((File) (obj));
	//   30   59:aload           5
	//   31   61:astore_1        
		if(((File) (obj1)).exists())
			break MISSING_BLOCK_LABEL_104;
	//   32   62:aload           6
	//   33   64:invokevirtual   #45  <Method boolean File.exists()>
	//   34   67:ifne            104
		fileoutputstream = fileoutputstream1;
	//   35   70:aload           4
	//   36   72:astore_3        
		file = ((File) (obj));
	//   37   73:aload           5
	//   38   75:astore_1        
		if(((File) (obj1)).createNewFile())
			break MISSING_BLOCK_LABEL_104;
	//   39   76:aload           6
	//   40   78:invokevirtual   #48  <Method boolean File.createNewFile()>
	//   41   81:ifne            104
		fileoutputstream = fileoutputstream1;
	//   42   84:aload           4
	//   43   86:astore_3        
		file = ((File) (obj));
	//   44   87:aload           5
	//   45   89:astore_1        
		dho.b("LeakUploadService", new Object[] {
			"uploadLeakBlocking(), file create fail "
		});
	//   46   90:ldc1            #50  <String "LeakUploadService">
	//   47   92:iconst_1        
	//   48   93:anewarray       Object[]
	//   49   96:dup             
	//   50   97:iconst_0        
	//   51   98:ldc1            #54  <String "uploadLeakBlocking(), file create fail ">
	//   52  100:aastore         
	//   53  101:invokestatic    #60  <Method void dho.b(String, Object[])>
		fileoutputstream = fileoutputstream1;
	//   54  104:aload           4
	//   55  106:astore_3        
		file = ((File) (obj));
	//   56  107:aload           5
	//   57  109:astore_1        
		fileoutputstream1 = new FileOutputStream(((File) (obj1)), true);
	//   58  110:new             #62  <Class FileOutputStream>
	//   59  113:dup             
	//   60  114:aload           6
	//   61  116:iconst_1        
	//   62  117:invokespecial   #65  <Method void FileOutputStream(File, boolean)>
	//   63  120:astore          4
		fileoutputstream = fileoutputstream1;
	//   64  122:aload           4
	//   65  124:astore_3        
		file = ((File) (fileoutputstream1));
	//   66  125:aload           4
	//   67  127:astore_1        
		fileoutputstream1.write(s.getBytes("UTF-8"));
	//   68  128:aload           4
	//   69  130:aload_2         
	//   70  131:ldc1            #67  <String "UTF-8">
	//   71  133:invokevirtual   #73  <Method byte[] String.getBytes(String)>
	//   72  136:invokevirtual   #77  <Method void FileOutputStream.write(byte[])>
		fileoutputstream = fileoutputstream1;
	//   73  139:aload           4
	//   74  141:astore_3        
		file = ((File) (fileoutputstream1));
	//   75  142:aload           4
	//   76  144:astore_1        
		fileoutputstream1.flush();
	//   77  145:aload           4
	//   78  147:invokevirtual   #80  <Method void FileOutputStream.flush()>
		fileoutputstream = fileoutputstream1;
	//   79  150:aload           4
	//   80  152:astore_3        
		file = ((File) (fileoutputstream1));
	//   81  153:aload           4
	//   82  155:astore_1        
		try
		{
			fileoutputstream1.close();
	//   83  156:aload           4
	//   84  158:invokevirtual   #83  <Method void FileOutputStream.close()>
			return;
	//   85  161:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  86  162:astore_2        
		{
			file = ((File) (fileoutputstream));
	//   87  163:aload_3         
	//   88  164:astore_1        
		}
		dho.e("LeakUploadService", new Object[] {
			(new StringBuilder()).append("uploadLeakBlocking() IOException:").append(((IOException) (s)).getMessage()).toString()
		});
	//   89  165:ldc1            #50  <String "LeakUploadService">
	//   90  167:iconst_1        
	//   91  168:anewarray       Object[]
	//   92  171:dup             
	//   93  172:iconst_0        
	//   94  173:new             #27  <Class StringBuilder>
	//   95  176:dup             
	//   96  177:invokespecial   #28  <Method void StringBuilder()>
	//   97  180:ldc1            #85  <String "uploadLeakBlocking() IOException:">
	//   98  182:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   99  185:aload_2         
	//  100  186:invokevirtual   #88  <Method String IOException.getMessage()>
	//  101  189:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//  102  192:invokevirtual   #38  <Method String StringBuilder.toString()>
	//  103  195:aastore         
	//  104  196:invokestatic    #90  <Method void dho.e(String, Object[])>
		if(fileoutputstream == null)
			break MISSING_BLOCK_LABEL_207;
	//  105  199:aload_3         
	//  106  200:ifnull          207
		fileoutputstream.close();
	//  107  203:aload_3         
	//  108  204:invokevirtual   #83  <Method void FileOutputStream.close()>
		return;
	//  109  207:return          
		file;
	//  110  208:astore_1        
		dho.e("LeakUploadService", new Object[] {
			(new StringBuilder()).append("uploadLeakBlocking() IOException:").append(((IOException) (file)).getMessage()).toString()
		});
	//  111  209:ldc1            #50  <String "LeakUploadService">
	//  112  211:iconst_1        
	//  113  212:anewarray       Object[]
	//  114  215:dup             
	//  115  216:iconst_0        
	//  116  217:new             #27  <Class StringBuilder>
	//  117  220:dup             
	//  118  221:invokespecial   #28  <Method void StringBuilder()>
	//  119  224:ldc1            #85  <String "uploadLeakBlocking() IOException:">
	//  120  226:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//  121  229:aload_1         
	//  122  230:invokevirtual   #88  <Method String IOException.getMessage()>
	//  123  233:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//  124  236:invokevirtual   #38  <Method String StringBuilder.toString()>
	//  125  239:aastore         
	//  126  240:invokestatic    #90  <Method void dho.e(String, Object[])>
		return;
	//  127  243:return          
		s;
	//  128  244:astore_2        
		if(file != null)
	//* 129  245:aload_1         
	//* 130  246:ifnull          253
			try
			{
				((FileOutputStream) (file)).close();
	//  131  249:aload_1         
	//  132  250:invokevirtual   #83  <Method void FileOutputStream.close()>
			}
	//* 133  253:goto            291
			// Misplaced declaration of an exception variable
			catch(File file)
	//* 134  256:astore_1        
			{
				dho.e("LeakUploadService", new Object[] {
					(new StringBuilder()).append("uploadLeakBlocking() IOException:").append(((IOException) (file)).getMessage()).toString()
				});
	//  135  257:ldc1            #50  <String "LeakUploadService">
	//  136  259:iconst_1        
	//  137  260:anewarray       Object[]
	//  138  263:dup             
	//  139  264:iconst_0        
	//  140  265:new             #27  <Class StringBuilder>
	//  141  268:dup             
	//  142  269:invokespecial   #28  <Method void StringBuilder()>
	//  143  272:ldc1            #85  <String "uploadLeakBlocking() IOException:">
	//  144  274:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//  145  277:aload_1         
	//  146  278:invokevirtual   #88  <Method String IOException.getMessage()>
	//  147  281:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//  148  284:invokevirtual   #38  <Method String StringBuilder.toString()>
	//  149  287:aastore         
	//  150  288:invokestatic    #90  <Method void dho.e(String, Object[])>
			}
		throw s;
	//  151  291:aload_2         
	//  152  292:athrow          
	}

	public void afterDefaultHandling(HeapDump heapdump, AnalysisResult analysisresult, String s)
	{
		super.afterDefaultHandling(heapdump, analysisresult, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #94  <Method void DisplayLeakService.afterDefaultHandling(HeapDump, AnalysisResult, String)>
		if(!analysisresult.leakFound || analysisresult.excludedLeak)
	//*   5    7:aload_2         
	//*   6    8:getfield        #100 <Field boolean AnalysisResult.leakFound>
	//*   7   11:ifeq            21
	//*   8   14:aload_2         
	//*   9   15:getfield        #103 <Field boolean AnalysisResult.excludedLeak>
	//*  10   18:ifeq            22
		{
			return;
	//   11   21:return          
		} else
		{
			e(heapdump.heapDumpFile, s);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #109 <Field File HeapDump.heapDumpFile>
	//   15   27:aload_3         
	//   16   28:invokespecial   #111 <Method void e(File, String)>
			return;
	//   17   31:return          
		}
	}
}

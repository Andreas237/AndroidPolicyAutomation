// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;

import android.os.SystemClock;
import android.text.format.Formatter;
import com.squareup.leakcanary.internal.DisplayLeakActivity;
import com.squareup.leakcanary.internal.LeakCanaryInternals;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.squareup.leakcanary:
//			AbstractAnalysisResultService, HeapDump, CanaryLog, LeakCanary, 
//			AnalysisResult

public class DisplayLeakService extends AbstractAnalysisResultService
{

	public DisplayLeakService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AbstractAnalysisResultService()>
	//    2    4:return          
	}

	private HeapDump renameHeapdump(HeapDump heapdump)
	{
		Object obj = ((Object) ((new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS'.hprof'", Locale.US)).format(new Date())));
	//    0    0:new             #13  <Class SimpleDateFormat>
	//    1    3:dup             
	//    2    4:ldc1            #15  <String "yyyy-MM-dd_HH-mm-ss_SSS'.hprof'">
	//    3    6:getstatic       #21  <Field Locale Locale.US>
	//    4    9:invokespecial   #24  <Method void SimpleDateFormat(String, Locale)>
	//    5   12:new             #26  <Class Date>
	//    6   15:dup             
	//    7   16:invokespecial   #27  <Method void Date()>
	//    8   19:invokevirtual   #31  <Method String SimpleDateFormat.format(Date)>
	//    9   22:astore_2        
		obj = ((Object) (new File(heapdump.heapDumpFile.getParent(), ((String) (obj)))));
	//   10   23:new             #33  <Class File>
	//   11   26:dup             
	//   12   27:aload_1         
	//   13   28:getfield        #39  <Field File HeapDump.heapDumpFile>
	//   14   31:invokevirtual   #43  <Method String File.getParent()>
	//   15   34:aload_2         
	//   16   35:invokespecial   #46  <Method void File(String, String)>
	//   17   38:astore_2        
		if(!heapdump.heapDumpFile.renameTo(((File) (obj))))
	//*  18   39:aload_1         
	//*  19   40:getfield        #39  <Field File HeapDump.heapDumpFile>
	//*  20   43:aload_2         
	//*  21   44:invokevirtual   #50  <Method boolean File.renameTo(File)>
	//*  22   47:ifne            76
			CanaryLog.d("Could not rename heap dump file %s to %s", new Object[] {
				heapdump.heapDumpFile.getPath(), ((File) (obj)).getPath()
			});
	//   23   50:ldc1            #52  <String "Could not rename heap dump file %s to %s">
	//   24   52:iconst_2        
	//   25   53:anewarray       Object[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:aload_1         
	//   29   59:getfield        #39  <Field File HeapDump.heapDumpFile>
	//   30   62:invokevirtual   #57  <Method String File.getPath()>
	//   31   65:aastore         
	//   32   66:dup             
	//   33   67:iconst_1        
	//   34   68:aload_2         
	//   35   69:invokevirtual   #57  <Method String File.getPath()>
	//   36   72:aastore         
	//   37   73:invokestatic    #63  <Method void CanaryLog.d(String, Object[])>
		return new HeapDump(((File) (obj)), heapdump.referenceKey, heapdump.referenceName, heapdump.excludedRefs, heapdump.watchDurationMs, heapdump.gcDurationMs, heapdump.heapDumpDurationMs);
	//   38   76:new             #35  <Class HeapDump>
	//   39   79:dup             
	//   40   80:aload_2         
	//   41   81:aload_1         
	//   42   82:getfield        #67  <Field String HeapDump.referenceKey>
	//   43   85:aload_1         
	//   44   86:getfield        #70  <Field String HeapDump.referenceName>
	//   45   89:aload_1         
	//   46   90:getfield        #74  <Field ExcludedRefs HeapDump.excludedRefs>
	//   47   93:aload_1         
	//   48   94:getfield        #78  <Field long HeapDump.watchDurationMs>
	//   49   97:aload_1         
	//   50   98:getfield        #81  <Field long HeapDump.gcDurationMs>
	//   51  101:aload_1         
	//   52  102:getfield        #84  <Field long HeapDump.heapDumpDurationMs>
	//   53  105:invokespecial   #87  <Method void HeapDump(File, String, String, ExcludedRefs, long, long, long)>
	//   54  108:areturn         
	}

	private boolean saveResult(HeapDump heapdump, AnalysisResult analysisresult)
	{
		FileOutputStream fileoutputstream;
		FileOutputStream fileoutputstream1;
		Object obj;
		obj = ((Object) (new File(heapdump.heapDumpFile.getParentFile(), (new StringBuilder()).append(heapdump.heapDumpFile.getName()).append(".result").toString())));
	//    0    0:new             #33  <Class File>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #39  <Field File HeapDump.heapDumpFile>
	//    4    8:invokevirtual   #95  <Method File File.getParentFile()>
	//    5   11:new             #97  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #98  <Method void StringBuilder()>
	//    8   18:aload_1         
	//    9   19:getfield        #39  <Field File HeapDump.heapDumpFile>
	//   10   22:invokevirtual   #101 <Method String File.getName()>
	//   11   25:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:ldc1            #107 <String ".result">
	//   13   30:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   15   36:invokespecial   #113 <Method void File(File, String)>
	//   16   39:astore          5
		fileoutputstream1 = null;
	//   17   41:aconst_null     
	//   18   42:astore          4
		fileoutputstream = null;
	//   19   44:aconst_null     
	//   20   45:astore_3        
		obj = ((Object) (new FileOutputStream(((File) (obj)))));
	//   21   46:new             #115 <Class FileOutputStream>
	//   22   49:dup             
	//   23   50:aload           5
	//   24   52:invokespecial   #118 <Method void FileOutputStream(File)>
	//   25   55:astore          5
		fileoutputstream = ((FileOutputStream) (obj));
	//   26   57:aload           5
	//   27   59:astore_3        
		fileoutputstream1 = ((FileOutputStream) (obj));
	//   28   60:aload           5
	//   29   62:astore          4
		ObjectOutputStream objectoutputstream = new ObjectOutputStream(((java.io.OutputStream) (obj)));
	//   30   64:new             #120 <Class ObjectOutputStream>
	//   31   67:dup             
	//   32   68:aload           5
	//   33   70:invokespecial   #123 <Method void ObjectOutputStream(java.io.OutputStream)>
	//   34   73:astore          6
		fileoutputstream = ((FileOutputStream) (obj));
	//   35   75:aload           5
	//   36   77:astore_3        
		fileoutputstream1 = ((FileOutputStream) (obj));
	//   37   78:aload           5
	//   38   80:astore          4
		objectoutputstream.writeObject(((Object) (heapdump)));
	//   39   82:aload           6
	//   40   84:aload_1         
	//   41   85:invokevirtual   #127 <Method void ObjectOutputStream.writeObject(Object)>
		fileoutputstream = ((FileOutputStream) (obj));
	//   42   88:aload           5
	//   43   90:astore_3        
		fileoutputstream1 = ((FileOutputStream) (obj));
	//   44   91:aload           5
	//   45   93:astore          4
		objectoutputstream.writeObject(((Object) (analysisresult)));
	//   46   95:aload           6
	//   47   97:aload_2         
	//   48   98:invokevirtual   #127 <Method void ObjectOutputStream.writeObject(Object)>
		if(obj == null)
			break MISSING_BLOCK_LABEL_114;
	//   49  101:aload           5
	//   50  103:ifnull          114
		((FileOutputStream) (obj)).close();
	//   51  106:aload           5
	//   52  108:invokevirtual   #130 <Method void FileOutputStream.close()>
		return true;
	//   53  111:iconst_1        
	//   54  112:ireturn         
		heapdump;
	//   55  113:astore_1        
		return true;
	//   56  114:iconst_1        
	//   57  115:ireturn         
		heapdump;
	//   58  116:astore_1        
		fileoutputstream1 = fileoutputstream;
	//   59  117:aload_3         
	//   60  118:astore          4
		CanaryLog.d(((Throwable) (heapdump)), "Could not save leak analysis result to disk.", new Object[0]);
	//   61  120:aload_1         
	//   62  121:ldc1            #132 <String "Could not save leak analysis result to disk.">
	//   63  123:iconst_0        
	//   64  124:anewarray       Object[]
	//   65  127:invokestatic    #135 <Method void CanaryLog.d(Throwable, String, Object[])>
		if(fileoutputstream != null)
	//*  66  130:aload_3         
	//*  67  131:ifnull          162
			try
			{
				fileoutputstream.close();
	//   68  134:aload_3         
	//   69  135:invokevirtual   #130 <Method void FileOutputStream.close()>
			}
	//*  70  138:goto            162
			// Misplaced declaration of an exception variable
			catch(HeapDump heapdump) { }
	//   71  141:astore_1        
		break MISSING_BLOCK_LABEL_162;
	//   72  142:goto            162
		heapdump;
	//   73  145:astore_1        
		if(fileoutputstream1 != null)
	//*  74  146:aload           4
	//*  75  148:ifnull          160
			try
			{
				fileoutputstream1.close();
	//   76  151:aload           4
	//   77  153:invokevirtual   #130 <Method void FileOutputStream.close()>
			}
	//*  78  156:goto            160
			// Misplaced declaration of an exception variable
			catch(AnalysisResult analysisresult) { }
	//   79  159:astore_2        
		throw heapdump;
	//   80  160:aload_1         
	//   81  161:athrow          
		return false;
	//   82  162:iconst_0        
	//   83  163:ireturn         
	}

	protected void afterDefaultHandling(HeapDump heapdump, AnalysisResult analysisresult, String s)
	{
	//    0    0:return          
	}

	protected final void onHeapAnalyzed(HeapDump heapdump, AnalysisResult analysisresult)
	{
		String s2 = LeakCanary.leakInfo(((android.content.Context) (this)), heapdump, analysisresult, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokestatic    #145 <Method String LeakCanary.leakInfo(android.content.Context, HeapDump, AnalysisResult, boolean)>
	//    5    7:astore          8
		CanaryLog.d("%s", new Object[] {
			s2
		});
	//    6    9:ldc1            #147 <String "%s">
	//    7   11:iconst_1        
	//    8   12:anewarray       Object[]
	//    9   15:dup             
	//   10   16:iconst_0        
	//   11   17:aload           8
	//   12   19:aastore         
	//   13   20:invokestatic    #63  <Method void CanaryLog.d(String, Object[])>
		boolean flag1 = false;
	//   14   23:iconst_0        
	//   15   24:istore          4
		boolean flag;
		if(analysisresult.leakFound || analysisresult.failure != null)
	//*  16   26:aload_2         
	//*  17   27:getfield        #153 <Field boolean AnalysisResult.leakFound>
	//*  18   30:ifne            40
	//*  19   33:aload_2         
	//*  20   34:getfield        #157 <Field Throwable AnalysisResult.failure>
	//*  21   37:ifnull          45
			flag = true;
	//   22   40:iconst_1        
	//   23   41:istore_3        
		else
	//*  24   42:goto            47
			flag = false;
	//   25   45:iconst_0        
	//   26   46:istore_3        
		HeapDump heapdump1 = heapdump;
	//   27   47:aload_1         
	//   28   48:astore          7
		if(flag)
	//*  29   50:iload_3         
	//*  30   51:ifeq            70
		{
			heapdump1 = renameHeapdump(heapdump);
	//   31   54:aload_0         
	//   32   55:aload_1         
	//   33   56:invokespecial   #159 <Method HeapDump renameHeapdump(HeapDump)>
	//   34   59:astore          7
			flag1 = saveResult(heapdump1, analysisresult);
	//   35   61:aload_0         
	//   36   62:aload           7
	//   37   64:aload_2         
	//   38   65:invokespecial   #161 <Method boolean saveResult(HeapDump, AnalysisResult)>
	//   39   68:istore          4
		}
		String s;
		String s1;
		if(!flag)
	//*  40   70:iload_3         
	//*  41   71:ifne            97
		{
			s = getString(R.string.leak_canary_no_leak_title);
	//   42   74:aload_0         
	//   43   75:getstatic       #167 <Field int R$string.leak_canary_no_leak_title>
	//   44   78:invokevirtual   #171 <Method String getString(int)>
	//   45   81:astore          5
			s1 = getString(R.string.leak_canary_no_leak_text);
	//   46   83:aload_0         
	//   47   84:getstatic       #174 <Field int R$string.leak_canary_no_leak_text>
	//   48   87:invokevirtual   #171 <Method String getString(int)>
	//   49   90:astore          6
			heapdump = null;
	//   50   92:aconst_null     
	//   51   93:astore_1        
		} else
	//*  52   94:goto            238
		if(flag1)
	//*  53   97:iload           4
	//*  54   99:ifeq            218
		{
			heapdump = ((HeapDump) (DisplayLeakActivity.createPendingIntent(((android.content.Context) (this)), heapdump1.referenceKey)));
	//   55  102:aload_0         
	//   56  103:aload           7
	//   57  105:getfield        #67  <Field String HeapDump.referenceKey>
	//   58  108:invokestatic    #180 <Method android.app.PendingIntent DisplayLeakActivity.createPendingIntent(android.content.Context, String)>
	//   59  111:astore_1        
			if(analysisresult.failure == null)
	//*  60  112:aload_2         
	//*  61  113:getfield        #157 <Field Throwable AnalysisResult.failure>
	//*  62  116:ifnonnull       197
			{
				s = Formatter.formatShortFileSize(((android.content.Context) (this)), analysisresult.retainedHeapSize);
	//   63  119:aload_0         
	//   64  120:aload_2         
	//   65  121:getfield        #183 <Field long AnalysisResult.retainedHeapSize>
	//   66  124:invokestatic    #189 <Method String Formatter.formatShortFileSize(android.content.Context, long)>
	//   67  127:astore          5
				s1 = LeakCanaryInternals.classSimpleName(analysisresult.className);
	//   68  129:aload_2         
	//   69  130:getfield        #192 <Field String AnalysisResult.className>
	//   70  133:invokestatic    #198 <Method String LeakCanaryInternals.classSimpleName(String)>
	//   71  136:astore          6
				if(analysisresult.excludedLeak)
	//*  72  138:aload_2         
	//*  73  139:getfield        #201 <Field boolean AnalysisResult.excludedLeak>
	//*  74  142:ifeq            171
					s = getString(R.string.leak_canary_leak_excluded, new Object[] {
						s1, s
					});
	//   75  145:aload_0         
	//   76  146:getstatic       #204 <Field int R$string.leak_canary_leak_excluded>
	//   77  149:iconst_2        
	//   78  150:anewarray       Object[]
	//   79  153:dup             
	//   80  154:iconst_0        
	//   81  155:aload           6
	//   82  157:aastore         
	//   83  158:dup             
	//   84  159:iconst_1        
	//   85  160:aload           5
	//   86  162:aastore         
	//   87  163:invokevirtual   #207 <Method String getString(int, Object[])>
	//   88  166:astore          5
				else
	//*  89  168:goto            194
					s = getString(R.string.leak_canary_class_has_leaked, new Object[] {
						s1, s
					});
	//   90  171:aload_0         
	//   91  172:getstatic       #210 <Field int R$string.leak_canary_class_has_leaked>
	//   92  175:iconst_2        
	//   93  176:anewarray       Object[]
	//   94  179:dup             
	//   95  180:iconst_0        
	//   96  181:aload           6
	//   97  183:aastore         
	//   98  184:dup             
	//   99  185:iconst_1        
	//  100  186:aload           5
	//  101  188:aastore         
	//  102  189:invokevirtual   #207 <Method String getString(int, Object[])>
	//  103  192:astore          5
			} else
	//* 104  194:goto            206
			{
				s = getString(R.string.leak_canary_analysis_failed);
	//  105  197:aload_0         
	//  106  198:getstatic       #213 <Field int R$string.leak_canary_analysis_failed>
	//  107  201:invokevirtual   #171 <Method String getString(int)>
	//  108  204:astore          5
			}
			s1 = getString(R.string.leak_canary_notification_message);
	//  109  206:aload_0         
	//  110  207:getstatic       #216 <Field int R$string.leak_canary_notification_message>
	//  111  210:invokevirtual   #171 <Method String getString(int)>
	//  112  213:astore          6
		} else
	//* 113  215:goto            238
		{
			s = getString(R.string.leak_canary_could_not_save_title);
	//  114  218:aload_0         
	//  115  219:getstatic       #219 <Field int R$string.leak_canary_could_not_save_title>
	//  116  222:invokevirtual   #171 <Method String getString(int)>
	//  117  225:astore          5
			s1 = getString(R.string.leak_canary_could_not_save_text);
	//  118  227:aload_0         
	//  119  228:getstatic       #222 <Field int R$string.leak_canary_could_not_save_text>
	//  120  231:invokevirtual   #171 <Method String getString(int)>
	//  121  234:astore          6
			heapdump = null;
	//  122  236:aconst_null     
	//  123  237:astore_1        
		}
		LeakCanaryInternals.showNotification(((android.content.Context) (this)), ((CharSequence) (s)), ((CharSequence) (s1)), ((android.app.PendingIntent) (heapdump)), (int)(SystemClock.uptimeMillis() / 1000L));
	//  124  238:aload_0         
	//  125  239:aload           5
	//  126  241:aload           6
	//  127  243:aload_1         
	//  128  244:invokestatic    #228 <Method long SystemClock.uptimeMillis()>
	//  129  247:ldc2w           #229 <Long 1000L>
	//  130  250:ldiv            
	//  131  251:l2i             
	//  132  252:invokestatic    #234 <Method void LeakCanaryInternals.showNotification(android.content.Context, CharSequence, CharSequence, android.app.PendingIntent, int)>
		afterDefaultHandling(heapdump1, analysisresult, s2);
	//  133  255:aload_0         
	//  134  256:aload           7
	//  135  258:aload_2         
	//  136  259:aload           8
	//  137  261:invokevirtual   #236 <Method void afterDefaultHandling(HeapDump, AnalysisResult, String)>
	//  138  264:return          
	}
}

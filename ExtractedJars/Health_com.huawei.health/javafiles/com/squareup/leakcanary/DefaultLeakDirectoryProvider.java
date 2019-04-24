// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;

import android.content.Context;
import android.os.Environment;
import com.squareup.leakcanary.internal.LeakCanaryInternals;
import com.squareup.leakcanary.internal.RequestStoragePermissionActivity;
import java.io.File;
import java.io.FilenameFilter;
import java.util.*;

// Referenced classes of package com.squareup.leakcanary:
//			LeakDirectoryProvider, CanaryLog, HeapDumper

public final class DefaultLeakDirectoryProvider
	implements LeakDirectoryProvider
{

	public DefaultLeakDirectoryProvider(Context context1)
	{
		this(context1, 7);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:bipush          7
	//    3    4:invokespecial   #29  <Method void DefaultLeakDirectoryProvider(Context, int)>
	//    4    7:return          
	}

	public DefaultLeakDirectoryProvider(Context context1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		if(i < 1)
	//*   2    4:iload_2         
	//*   3    5:iconst_1        
	//*   4    6:icmpge          19
		{
			throw new IllegalArgumentException("maxStoredHeapDumps must be at least 1");
	//    5    9:new             #35  <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc1            #37  <String "maxStoredHeapDumps must be at least 1">
	//    8   15:invokespecial   #40  <Method void IllegalArgumentException(String)>
	//    9   18:athrow          
		} else
		{
			context = context1.getApplicationContext();
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #46  <Method Context Context.getApplicationContext()>
	//   13   24:putfield        #48  <Field Context context>
			maxStoredHeapDumps = i;
	//   14   27:aload_0         
	//   15   28:iload_2         
	//   16   29:putfield        #50  <Field int maxStoredHeapDumps>
			return;
	//   17   32:return          
		}
	}

	private File appStorageDirectory()
	{
		return new File(context.getFilesDir(), "leakcanary");
	//    0    0:new             #54  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field Context context>
	//    4    8:invokevirtual   #57  <Method File Context.getFilesDir()>
	//    5   11:ldc1            #59  <String "leakcanary">
	//    6   13:invokespecial   #62  <Method void File(File, String)>
	//    7   16:areturn         
	}

	private void cleanupOldHeapDumps()
	{
		List list = listFiles(((FilenameFilter) (new _cls3())));
	//    0    0:aload_0         
	//    1    1:new             #65  <Class DefaultLeakDirectoryProvider$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #68  <Method void DefaultLeakDirectoryProvider$3(DefaultLeakDirectoryProvider)>
	//    5    9:invokevirtual   #72  <Method List listFiles(FilenameFilter)>
	//    6   12:astore_3        
		int j = list.size() - maxStoredHeapDumps;
	//    7   13:aload_3         
	//    8   14:invokeinterface #78  <Method int List.size()>
	//    9   19:aload_0         
	//   10   20:getfield        #50  <Field int maxStoredHeapDumps>
	//   11   23:isub            
	//   12   24:istore_2        
		if(j > 0)
	//*  13   25:iload_2         
	//*  14   26:ifle            112
		{
			CanaryLog.d("Removing %d heap dumps", new Object[] {
				Integer.valueOf(j)
			});
	//   15   29:ldc1            #80  <String "Removing %d heap dumps">
	//   16   31:iconst_1        
	//   17   32:anewarray       Object[]
	//   18   35:dup             
	//   19   36:iconst_0        
	//   20   37:iload_2         
	//   21   38:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//   22   41:aastore         
	//   23   42:invokestatic    #92  <Method void CanaryLog.d(String, Object[])>
			Collections.sort(list, ((java.util.Comparator) (new _cls4())));
	//   24   45:aload_3         
	//   25   46:new             #94  <Class DefaultLeakDirectoryProvider$4>
	//   26   49:dup             
	//   27   50:aload_0         
	//   28   51:invokespecial   #95  <Method void DefaultLeakDirectoryProvider$4(DefaultLeakDirectoryProvider)>
	//   29   54:invokestatic    #101 <Method void Collections.sort(List, java.util.Comparator)>
			for(int i = 0; i < j; i++)
	//*  30   57:iconst_0        
	//*  31   58:istore_1        
	//*  32   59:iload_1         
	//*  33   60:iload_2         
	//*  34   61:icmpge          112
				if(!((File)list.get(i)).delete())
	//*  35   64:aload_3         
	//*  36   65:iload_1         
	//*  37   66:invokeinterface #105 <Method Object List.get(int)>
	//*  38   71:checkcast       #54  <Class File>
	//*  39   74:invokevirtual   #109 <Method boolean File.delete()>
	//*  40   77:ifne            105
					CanaryLog.d("Could not delete old hprof file %s", new Object[] {
						((File)list.get(i)).getPath()
					});
	//   41   80:ldc1            #111 <String "Could not delete old hprof file %s">
	//   42   82:iconst_1        
	//   43   83:anewarray       Object[]
	//   44   86:dup             
	//   45   87:iconst_0        
	//   46   88:aload_3         
	//   47   89:iload_1         
	//   48   90:invokeinterface #105 <Method Object List.get(int)>
	//   49   95:checkcast       #54  <Class File>
	//   50   98:invokevirtual   #115 <Method String File.getPath()>
	//   51  101:aastore         
	//   52  102:invokestatic    #92  <Method void CanaryLog.d(String, Object[])>

	//   53  105:iload_1         
	//   54  106:iconst_1        
	//   55  107:iadd            
	//   56  108:istore_1        
		}
	//*  57  109:goto            59
	//   58  112:return          
	}

	private boolean directoryWritableAfterMkdirs(File file)
	{
		return (file.mkdirs() || file.exists()) && file.canWrite();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #120 <Method boolean File.mkdirs()>
	//    2    4:ifne            14
	//    3    7:aload_1         
	//    4    8:invokevirtual   #123 <Method boolean File.exists()>
	//    5   11:ifeq            23
	//    6   14:aload_1         
	//    7   15:invokevirtual   #126 <Method boolean File.canWrite()>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private File externalStorageDirectory()
	{
		return new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), (new StringBuilder()).append("leakcanary-").append(context.getPackageName()).toString());
	//    0    0:new             #54  <Class File>
	//    1    3:dup             
	//    2    4:getstatic       #132 <Field String Environment.DIRECTORY_DOWNLOADS>
	//    3    7:invokestatic    #136 <Method File Environment.getExternalStoragePublicDirectory(String)>
	//    4   10:new             #138 <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #139 <Method void StringBuilder()>
	//    7   17:ldc1            #141 <String "leakcanary-">
	//    8   19:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:aload_0         
	//   10   23:getfield        #48  <Field Context context>
	//   11   26:invokevirtual   #148 <Method String Context.getPackageName()>
	//   12   29:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   13   32:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   14   35:invokespecial   #62  <Method void File(File, String)>
	//   15   38:areturn         
	}

	private boolean hasStoragePermission()
	{
		if(android.os.Build.VERSION.SDK_INT < 23)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmpge          10
			return true;
	//    3    8:iconst_1        
	//    4    9:ireturn         
		if(writeExternalStorageGranted)
	//*   5   10:aload_0         
	//*   6   11:getfield        #162 <Field boolean writeExternalStorageGranted>
	//*   7   14:ifeq            19
			return true;
	//    8   17:iconst_1        
	//    9   18:ireturn         
		boolean flag;
		if(context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0)
	//*  10   19:aload_0         
	//*  11   20:getfield        #48  <Field Context context>
	//*  12   23:ldc1            #164 <String "android.permission.WRITE_EXTERNAL_STORAGE">
	//*  13   25:invokevirtual   #168 <Method int Context.checkSelfPermission(String)>
	//*  14   28:ifne            36
			flag = true;
	//   15   31:iconst_1        
	//   16   32:istore_1        
		else
	//*  17   33:goto            38
			flag = false;
	//   18   36:iconst_0        
	//   19   37:istore_1        
		writeExternalStorageGranted = flag;
	//   20   38:aload_0         
	//   21   39:iload_1         
	//   22   40:putfield        #162 <Field boolean writeExternalStorageGranted>
		return writeExternalStorageGranted;
	//   23   43:aload_0         
	//   24   44:getfield        #162 <Field boolean writeExternalStorageGranted>
	//   25   47:ireturn         
	}

	private void requestWritePermissionNotification()
	{
		if(permissionNotificationDisplayed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #172 <Field boolean permissionNotificationDisplayed>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			permissionNotificationDisplayed = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #172 <Field boolean permissionNotificationDisplayed>
			android.app.PendingIntent pendingintent = RequestStoragePermissionActivity.createPendingIntent(context);
	//    7   13:aload_0         
	//    8   14:getfield        #48  <Field Context context>
	//    9   17:invokestatic    #178 <Method android.app.PendingIntent RequestStoragePermissionActivity.createPendingIntent(Context)>
	//   10   20:astore_1        
			String s = context.getString(R.string.leak_canary_permission_notification_title);
	//   11   21:aload_0         
	//   12   22:getfield        #48  <Field Context context>
	//   13   25:getstatic       #183 <Field int R$string.leak_canary_permission_notification_title>
	//   14   28:invokevirtual   #187 <Method String Context.getString(int)>
	//   15   31:astore_2        
			String s1 = context.getPackageName();
	//   16   32:aload_0         
	//   17   33:getfield        #48  <Field Context context>
	//   18   36:invokevirtual   #148 <Method String Context.getPackageName()>
	//   19   39:astore_3        
			s1 = context.getString(R.string.leak_canary_permission_notification_text, new Object[] {
				s1
			});
	//   20   40:aload_0         
	//   21   41:getfield        #48  <Field Context context>
	//   22   44:getstatic       #190 <Field int R$string.leak_canary_permission_notification_text>
	//   23   47:iconst_1        
	//   24   48:anewarray       Object[]
	//   25   51:dup             
	//   26   52:iconst_0        
	//   27   53:aload_3         
	//   28   54:aastore         
	//   29   55:invokevirtual   #193 <Method String Context.getString(int, Object[])>
	//   30   58:astore_3        
			LeakCanaryInternals.showNotification(context, ((CharSequence) (s)), ((CharSequence) (s1)), pendingintent, 0xdeafbeef);
	//   31   59:aload_0         
	//   32   60:getfield        #48  <Field Context context>
	//   33   63:aload_2         
	//   34   64:aload_3         
	//   35   65:aload_1         
	//   36   66:ldc1            #194 <Int 0xdeafbeef>
	//   37   68:invokestatic    #200 <Method void LeakCanaryInternals.showNotification(Context, CharSequence, CharSequence, android.app.PendingIntent, int)>
			return;
	//   38   71:return          
		}
	}

	public void clearLeakDirectory()
	{
		Iterator iterator = listFiles(((FilenameFilter) (new _cls2()))).iterator();
	//    0    0:aload_0         
	//    1    1:new             #203 <Class DefaultLeakDirectoryProvider$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #204 <Method void DefaultLeakDirectoryProvider$2(DefaultLeakDirectoryProvider)>
	//    5    9:invokevirtual   #72  <Method List listFiles(FilenameFilter)>
	//    6   12:invokeinterface #208 <Method Iterator List.iterator()>
	//    7   17:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_1         
	//    9   19:invokeinterface #213 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            63
			File file = (File)iterator.next();
	//   11   27:aload_1         
	//   12   28:invokeinterface #217 <Method Object Iterator.next()>
	//   13   33:checkcast       #54  <Class File>
	//   14   36:astore_2        
			if(!file.delete())
	//*  15   37:aload_2         
	//*  16   38:invokevirtual   #109 <Method boolean File.delete()>
	//*  17   41:ifne            60
				CanaryLog.d("Could not delete file %s", new Object[] {
					file.getPath()
				});
	//   18   44:ldc1            #219 <String "Could not delete file %s">
	//   19   46:iconst_1        
	//   20   47:anewarray       Object[]
	//   21   50:dup             
	//   22   51:iconst_0        
	//   23   52:aload_2         
	//   24   53:invokevirtual   #115 <Method String File.getPath()>
	//   25   56:aastore         
	//   26   57:invokestatic    #92  <Method void CanaryLog.d(String, Object[])>
		} while(true);
	//   27   60:goto            18
	//   28   63:return          
	}

	public List listFiles(FilenameFilter filenamefilter)
	{
		if(!hasStoragePermission())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #221 <Method boolean hasStoragePermission()>
	//*   2    4:ifne            11
			requestWritePermissionNotification();
	//    3    7:aload_0         
	//    4    8:invokespecial   #223 <Method void requestWritePermissionNotification()>
		ArrayList arraylist = new ArrayList();
	//    5   11:new             #225 <Class ArrayList>
	//    6   14:dup             
	//    7   15:invokespecial   #226 <Method void ArrayList()>
	//    8   18:astore_2        
		File afile[] = externalStorageDirectory().listFiles(filenamefilter);
	//    9   19:aload_0         
	//   10   20:invokespecial   #228 <Method File externalStorageDirectory()>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #231 <Method File[] File.listFiles(FilenameFilter)>
	//   13   27:astore_3        
		if(afile != null)
	//*  14   28:aload_3         
	//*  15   29:ifnull          43
			((List) (arraylist)).addAll(((java.util.Collection) (Arrays.asList(((Object []) (afile))))));
	//   16   32:aload_2         
	//   17   33:aload_3         
	//   18   34:invokestatic    #237 <Method List Arrays.asList(Object[])>
	//   19   37:invokeinterface #241 <Method boolean List.addAll(java.util.Collection)>
	//   20   42:pop             
		filenamefilter = ((FilenameFilter) (appStorageDirectory().listFiles(filenamefilter)));
	//   21   43:aload_0         
	//   22   44:invokespecial   #243 <Method File appStorageDirectory()>
	//   23   47:aload_1         
	//   24   48:invokevirtual   #231 <Method File[] File.listFiles(FilenameFilter)>
	//   25   51:astore_1        
		if(filenamefilter != null)
	//*  26   52:aload_1         
	//*  27   53:ifnull          67
			((List) (arraylist)).addAll(((java.util.Collection) (Arrays.asList(((Object []) (filenamefilter))))));
	//   28   56:aload_2         
	//   29   57:aload_1         
	//   30   58:invokestatic    #237 <Method List Arrays.asList(Object[])>
	//   31   61:invokeinterface #241 <Method boolean List.addAll(java.util.Collection)>
	//   32   66:pop             
		return ((List) (arraylist));
	//   33   67:aload_2         
	//   34   68:areturn         
	}

	public File newHeapDumpFile()
	{
		for(Iterator iterator = listFiles(((FilenameFilter) (new _cls1()))).iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:new             #248 <Class DefaultLeakDirectoryProvider$1>
	//*   2    4:dup             
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #249 <Method void DefaultLeakDirectoryProvider$1(DefaultLeakDirectoryProvider)>
	//*   5    9:invokevirtual   #72  <Method List listFiles(FilenameFilter)>
	//*   6   12:invokeinterface #208 <Method Iterator List.iterator()>
	//*   7   17:astore_1        
	//*   8   18:aload_1         
	//*   9   19:invokeinterface #213 <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            69
		{
			File file = (File)iterator.next();
	//   11   27:aload_1         
	//   12   28:invokeinterface #217 <Method Object Iterator.next()>
	//   13   33:checkcast       #54  <Class File>
	//   14   36:astore_2        
			if(System.currentTimeMillis() - file.lastModified() < 0x927c0L)
	//*  15   37:invokestatic    #255 <Method long System.currentTimeMillis()>
	//*  16   40:aload_2         
	//*  17   41:invokevirtual   #258 <Method long File.lastModified()>
	//*  18   44:lsub            
	//*  19   45:ldc2w           #259 <Long 0x927c0L>
	//*  20   48:lcmp            
	//*  21   49:ifge            66
			{
				CanaryLog.d("Could not dump heap, previous analysis still is in progress.", new Object[0]);
	//   22   52:ldc2            #262 <String "Could not dump heap, previous analysis still is in progress.">
	//   23   55:iconst_0        
	//   24   56:anewarray       Object[]
	//   25   59:invokestatic    #92  <Method void CanaryLog.d(String, Object[])>
				return HeapDumper.RETRY_LATER;
	//   26   62:getstatic       #268 <Field File HeapDumper.RETRY_LATER>
	//   27   65:areturn         
			}
		}

	//*  28   66:goto            18
		cleanupOldHeapDumps();
	//   29   69:aload_0         
	//   30   70:invokespecial   #270 <Method void cleanupOldHeapDumps()>
		File file1 = externalStorageDirectory();
	//   31   73:aload_0         
	//   32   74:invokespecial   #228 <Method File externalStorageDirectory()>
	//   33   77:astore_2        
		Object obj = ((Object) (file1));
	//   34   78:aload_2         
	//   35   79:astore_1        
		if(!directoryWritableAfterMkdirs(file1))
	//*  36   80:aload_0         
	//*  37   81:aload_2         
	//*  38   82:invokespecial   #272 <Method boolean directoryWritableAfterMkdirs(File)>
	//*  39   85:ifne            196
		{
			if(!hasStoragePermission())
	//*  40   88:aload_0         
	//*  41   89:invokespecial   #221 <Method boolean hasStoragePermission()>
	//*  42   92:ifne            112
			{
				CanaryLog.d("WRITE_EXTERNAL_STORAGE permission not granted", new Object[0]);
	//   43   95:ldc2            #274 <String "WRITE_EXTERNAL_STORAGE permission not granted">
	//   44   98:iconst_0        
	//   45   99:anewarray       Object[]
	//   46  102:invokestatic    #92  <Method void CanaryLog.d(String, Object[])>
				requestWritePermissionNotification();
	//   47  105:aload_0         
	//   48  106:invokespecial   #223 <Method void requestWritePermissionNotification()>
			} else
	//*  49  109:goto            160
			{
				obj = ((Object) (Environment.getExternalStorageState()));
	//   50  112:invokestatic    #277 <Method String Environment.getExternalStorageState()>
	//   51  115:astore_1        
				if(!"mounted".equals(obj))
	//*  52  116:ldc2            #279 <String "mounted">
	//*  53  119:aload_1         
	//*  54  120:invokevirtual   #285 <Method boolean String.equals(Object)>
	//*  55  123:ifne            143
					CanaryLog.d("External storage not mounted, state: %s", new Object[] {
						obj
					});
	//   56  126:ldc2            #287 <String "External storage not mounted, state: %s">
	//   57  129:iconst_1        
	//   58  130:anewarray       Object[]
	//   59  133:dup             
	//   60  134:iconst_0        
	//   61  135:aload_1         
	//   62  136:aastore         
	//   63  137:invokestatic    #92  <Method void CanaryLog.d(String, Object[])>
				else
	//*  64  140:goto            160
					CanaryLog.d("Could not create heap dump directory in external storage: [%s]", new Object[] {
						file1.getAbsolutePath()
					});
	//   65  143:ldc2            #289 <String "Could not create heap dump directory in external storage: [%s]">
	//   66  146:iconst_1        
	//   67  147:anewarray       Object[]
	//   68  150:dup             
	//   69  151:iconst_0        
	//   70  152:aload_2         
	//   71  153:invokevirtual   #292 <Method String File.getAbsolutePath()>
	//   72  156:aastore         
	//   73  157:invokestatic    #92  <Method void CanaryLog.d(String, Object[])>
			}
			file1 = appStorageDirectory();
	//   74  160:aload_0         
	//   75  161:invokespecial   #243 <Method File appStorageDirectory()>
	//   76  164:astore_2        
			obj = ((Object) (file1));
	//   77  165:aload_2         
	//   78  166:astore_1        
			if(!directoryWritableAfterMkdirs(file1))
	//*  79  167:aload_0         
	//*  80  168:aload_2         
	//*  81  169:invokespecial   #272 <Method boolean directoryWritableAfterMkdirs(File)>
	//*  82  172:ifne            196
			{
				CanaryLog.d("Could not create heap dump directory in app storage: [%s]", new Object[] {
					file1.getAbsolutePath()
				});
	//   83  175:ldc2            #294 <String "Could not create heap dump directory in app storage: [%s]">
	//   84  178:iconst_1        
	//   85  179:anewarray       Object[]
	//   86  182:dup             
	//   87  183:iconst_0        
	//   88  184:aload_2         
	//   89  185:invokevirtual   #292 <Method String File.getAbsolutePath()>
	//   90  188:aastore         
	//   91  189:invokestatic    #92  <Method void CanaryLog.d(String, Object[])>
				return HeapDumper.RETRY_LATER;
	//   92  192:getstatic       #268 <Field File HeapDumper.RETRY_LATER>
	//   93  195:areturn         
			}
		}
		return new File(((File) (obj)), (new StringBuilder()).append(UUID.randomUUID().toString()).append("_pending.hprof").toString());
	//   94  196:new             #54  <Class File>
	//   95  199:dup             
	//   96  200:aload_1         
	//   97  201:new             #138 <Class StringBuilder>
	//   98  204:dup             
	//   99  205:invokespecial   #139 <Method void StringBuilder()>
	//  100  208:invokestatic    #300 <Method UUID UUID.randomUUID()>
	//  101  211:invokevirtual   #301 <Method String UUID.toString()>
	//  102  214:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//  103  217:ldc1            #18  <String "_pending.hprof">
	//  104  219:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//  105  222:invokevirtual   #151 <Method String StringBuilder.toString()>
	//  106  225:invokespecial   #62  <Method void File(File, String)>
	//  107  228:areturn         
	}

	private static final int ANALYSIS_MAX_DURATION_MS = 0x927c0;
	private static final int DEFAULT_MAX_STORED_HEAP_DUMPS = 7;
	private static final String HPROF_SUFFIX = ".hprof";
	private static final String PENDING_HEAPDUMP_SUFFIX = "_pending.hprof";
	private final Context context;
	private final int maxStoredHeapDumps;
	private volatile boolean permissionNotificationDisplayed;
	private volatile boolean writeExternalStorageGranted;

	/* member class not found */
	class _cls3 {}


	/* member class not found */
	class _cls4 {}


	/* member class not found */
	class _cls2 {}


	/* member class not found */
	class _cls1 {}

}

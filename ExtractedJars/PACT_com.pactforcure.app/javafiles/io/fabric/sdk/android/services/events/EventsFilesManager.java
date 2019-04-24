// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package io.fabric.sdk.android.services.events:
//			EventsStorage, EventsStorageListener, EventTransform

public abstract class EventsFilesManager
{
	static class FileWithTimestamp
	{

		final File file;
		final long timestamp;

		public FileWithTimestamp(File file1, long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			file = file1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field File file>
			timestamp = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #20  <Field long timestamp>
		//    8   14:return          
		}
	}


	public EventsFilesManager(Context context1, EventTransform eventtransform, CurrentTimeProvider currenttimeprovider, EventsStorage eventsstorage, int i)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #45  <Class CopyOnWriteArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #46  <Method void CopyOnWriteArrayList()>
	//    6   12:putfield        #48  <Field List rollOverListeners>
		context = context1.getApplicationContext();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #54  <Method Context Context.getApplicationContext()>
	//   10   20:putfield        #56  <Field Context context>
		transform = eventtransform;
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:putfield        #58  <Field EventTransform transform>
		eventStorage = eventsstorage;
	//   14   28:aload_0         
	//   15   29:aload           4
	//   16   31:putfield        #60  <Field EventsStorage eventStorage>
		currentTimeProvider = currenttimeprovider;
	//   17   34:aload_0         
	//   18   35:aload_3         
	//   19   36:putfield        #62  <Field CurrentTimeProvider currentTimeProvider>
		lastRollOverTime = currentTimeProvider.getCurrentTimeMillis();
	//   20   39:aload_0         
	//   21   40:aload_0         
	//   22   41:getfield        #62  <Field CurrentTimeProvider currentTimeProvider>
	//   23   44:invokeinterface #68  <Method long CurrentTimeProvider.getCurrentTimeMillis()>
	//   24   49:putfield        #70  <Field long lastRollOverTime>
		defaultMaxFilesToKeep = i;
	//   25   52:aload_0         
	//   26   53:iload           5
	//   27   55:putfield        #72  <Field int defaultMaxFilesToKeep>
	//   28   58:return          
	}

	private void rollFileOverIfNeeded(int i)
		throws IOException
	{
		if(!eventStorage.canWorkingFileStore(i, getMaxByteSizePerFile()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field EventsStorage eventStorage>
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #82  <Method int getMaxByteSizePerFile()>
	//*   5    9:invokeinterface #88  <Method boolean EventsStorage.canWorkingFileStore(int, int)>
	//*   6   14:ifne            78
		{
			String s = String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[] {
				Integer.valueOf(eventStorage.getWorkingFileUsedSizeInBytes()), Integer.valueOf(i), Integer.valueOf(getMaxByteSizePerFile())
			});
	//    7   17:getstatic       #94  <Field Locale Locale.US>
	//    8   20:ldc1            #96  <String "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over">
	//    9   22:iconst_3        
	//   10   23:anewarray       Object[]
	//   11   26:dup             
	//   12   27:iconst_0        
	//   13   28:aload_0         
	//   14   29:getfield        #60  <Field EventsStorage eventStorage>
	//   15   32:invokeinterface #99  <Method int EventsStorage.getWorkingFileUsedSizeInBytes()>
	//   16   37:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   17   40:aastore         
	//   18   41:dup             
	//   19   42:iconst_1        
	//   20   43:iload_1         
	//   21   44:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   22   47:aastore         
	//   23   48:dup             
	//   24   49:iconst_2        
	//   25   50:aload_0         
	//   26   51:invokevirtual   #82  <Method int getMaxByteSizePerFile()>
	//   27   54:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   28   57:aastore         
	//   29   58:invokestatic    #111 <Method String String.format(Locale, String, Object[])>
	//   30   61:astore_2        
			CommonUtils.logControlled(context, 4, "Fabric", s);
	//   31   62:aload_0         
	//   32   63:getfield        #56  <Field Context context>
	//   33   66:iconst_4        
	//   34   67:ldc1            #113 <String "Fabric">
	//   35   69:aload_2         
	//   36   70:invokestatic    #119 <Method void CommonUtils.logControlled(Context, int, String, String)>
			rollFileOver();
	//   37   73:aload_0         
	//   38   74:invokevirtual   #123 <Method boolean rollFileOver()>
	//   39   77:pop             
		}
	//   40   78:return          
	}

	private void triggerRollOverOnListeners(String s)
	{
		for(Iterator iterator = rollOverListeners.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field List rollOverListeners>
	//*   2    4:invokeinterface #133 <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #138 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            53
		{
			EventsStorageListener eventsstoragelistener = (EventsStorageListener)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #142 <Method Object Iterator.next()>
	//    9   25:checkcast       #144 <Class EventsStorageListener>
	//   10   28:astore_3        
			try
			{
				eventsstoragelistener.onRollOver(s);
	//   11   29:aload_3         
	//   12   30:aload_1         
	//   13   31:invokeinterface #147 <Method void EventsStorageListener.onRollOver(String)>
			}
	//*  14   36:goto            10
			catch(Exception exception)
	//*  15   39:astore_3        
			{
				CommonUtils.logControlledError(context, "One of the roll over listeners threw an exception", ((Throwable) (exception)));
	//   16   40:aload_0         
	//   17   41:getfield        #56  <Field Context context>
	//   18   44:ldc1            #149 <String "One of the roll over listeners threw an exception">
	//   19   46:aload_3         
	//   20   47:invokestatic    #153 <Method void CommonUtils.logControlledError(Context, String, Throwable)>
			}
		}

	//*  21   50:goto            10
	//   22   53:return          
	}

	public void deleteAllEventsFiles()
	{
		eventStorage.deleteFilesInRollOverDirectory(eventStorage.getAllFilesInRollOverDirectory());
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field EventsStorage eventStorage>
	//    2    4:aload_0         
	//    3    5:getfield        #60  <Field EventsStorage eventStorage>
	//    4    8:invokeinterface #158 <Method List EventsStorage.getAllFilesInRollOverDirectory()>
	//    5   13:invokeinterface #162 <Method void EventsStorage.deleteFilesInRollOverDirectory(List)>
		eventStorage.deleteWorkingFile();
	//    6   18:aload_0         
	//    7   19:getfield        #60  <Field EventsStorage eventStorage>
	//    8   22:invokeinterface #165 <Method void EventsStorage.deleteWorkingFile()>
	//    9   27:return          
	}

	public void deleteOldestInRollOverIfOverMax()
	{
		Object obj1 = ((Object) (eventStorage.getAllFilesInRollOverDirectory()));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field EventsStorage eventStorage>
	//    2    4:invokeinterface #158 <Method List EventsStorage.getAllFilesInRollOverDirectory()>
	//    3    9:astore          4
		int i = getMaxFilesToKeep();
	//    4   11:aload_0         
	//    5   12:invokevirtual   #169 <Method int getMaxFilesToKeep()>
	//    6   15:istore_1        
		if(((List) (obj1)).size() <= i)
	//*   7   16:aload           4
	//*   8   18:invokeinterface #172 <Method int List.size()>
	//*   9   23:iload_1         
	//*  10   24:icmpgt          28
			return;
	//   11   27:return          
		int j = ((List) (obj1)).size() - i;
	//   12   28:aload           4
	//   13   30:invokeinterface #172 <Method int List.size()>
	//   14   35:iload_1         
	//   15   36:isub            
	//   16   37:istore_2        
		CommonUtils.logControlled(context, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[] {
			Integer.valueOf(((List) (obj1)).size()), Integer.valueOf(i), Integer.valueOf(j)
		}));
	//   17   38:aload_0         
	//   18   39:getfield        #56  <Field Context context>
	//   19   42:getstatic       #94  <Field Locale Locale.US>
	//   20   45:ldc1            #174 <String "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files">
	//   21   47:iconst_3        
	//   22   48:anewarray       Object[]
	//   23   51:dup             
	//   24   52:iconst_0        
	//   25   53:aload           4
	//   26   55:invokeinterface #172 <Method int List.size()>
	//   27   60:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   28   63:aastore         
	//   29   64:dup             
	//   30   65:iconst_1        
	//   31   66:iload_1         
	//   32   67:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   33   70:aastore         
	//   34   71:dup             
	//   35   72:iconst_2        
	//   36   73:iload_2         
	//   37   74:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   38   77:aastore         
	//   39   78:invokestatic    #111 <Method String String.format(Locale, String, Object[])>
	//   40   81:invokestatic    #177 <Method void CommonUtils.logControlled(Context, String)>
		Object obj = ((Object) (new TreeSet(new Comparator() {

			public int compare(FileWithTimestamp filewithtimestamp, FileWithTimestamp filewithtimestamp1)
			{
				return (int)(filewithtimestamp.timestamp - filewithtimestamp1.timestamp);
			//    0    0:aload_1         
			//    1    1:getfield        #29  <Field long EventsFilesManager$FileWithTimestamp.timestamp>
			//    2    4:aload_2         
			//    3    5:getfield        #29  <Field long EventsFilesManager$FileWithTimestamp.timestamp>
			//    4    8:lsub            
			//    5    9:l2i             
			//    6   10:ireturn         
			}

			public volatile int compare(Object obj2, Object obj3)
			{
				return compare((FileWithTimestamp)obj2, (FileWithTimestamp)obj3);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class EventsFilesManager$FileWithTimestamp>
			//    3    5:aload_2         
			//    4    6:checkcast       #25  <Class EventsFilesManager$FileWithTimestamp>
			//    5    9:invokevirtual   #32  <Method int compare(EventsFilesManager$FileWithTimestamp, EventsFilesManager$FileWithTimestamp)>
			//    6   12:ireturn         
			}

			final EventsFilesManager this$0;

			
			{
				this$0 = EventsFilesManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field EventsFilesManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
)));
	//   41   84:new             #179 <Class TreeSet>
	//   42   87:dup             
	//   43   88:new             #7   <Class EventsFilesManager$1>
	//   44   91:dup             
	//   45   92:aload_0         
	//   46   93:invokespecial   #182 <Method void EventsFilesManager$1(EventsFilesManager)>
	//   47   96:invokespecial   #185 <Method void TreeSet(Comparator)>
	//   48   99:astore_3        
		File file;
		for(obj1 = ((Object) (((List) (obj1)).iterator())); ((Iterator) (obj1)).hasNext(); ((TreeSet) (obj)).add(((Object) (new FileWithTimestamp(file, parseCreationTimestampFromFileName(file.getName()))))))
	//*  49  100:aload           4
	//*  50  102:invokeinterface #133 <Method Iterator List.iterator()>
	//*  51  107:astore          4
	//*  52  109:aload           4
	//*  53  111:invokeinterface #138 <Method boolean Iterator.hasNext()>
	//*  54  116:ifeq            157
			file = (File)((Iterator) (obj1)).next();
	//   55  119:aload           4
	//   56  121:invokeinterface #142 <Method Object Iterator.next()>
	//   57  126:checkcast       #187 <Class File>
	//   58  129:astore          5

	//   59  131:aload_3         
	//   60  132:new             #9   <Class EventsFilesManager$FileWithTimestamp>
	//   61  135:dup             
	//   62  136:aload           5
	//   63  138:aload_0         
	//   64  139:aload           5
	//   65  141:invokevirtual   #191 <Method String File.getName()>
	//   66  144:invokevirtual   #195 <Method long parseCreationTimestampFromFileName(String)>
	//   67  147:invokespecial   #198 <Method void EventsFilesManager$FileWithTimestamp(File, long)>
	//   68  150:invokevirtual   #202 <Method boolean TreeSet.add(Object)>
	//   69  153:pop             
	//*  70  154:goto            109
		obj1 = ((Object) (new ArrayList()));
	//   71  157:new             #204 <Class ArrayList>
	//   72  160:dup             
	//   73  161:invokespecial   #205 <Method void ArrayList()>
	//   74  164:astore          4
		obj = ((Object) (((TreeSet) (obj)).iterator()));
	//   75  166:aload_3         
	//   76  167:invokevirtual   #206 <Method Iterator TreeSet.iterator()>
	//   77  170:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   78  171:aload_3         
	//   79  172:invokeinterface #138 <Method boolean Iterator.hasNext()>
	//   80  177:ifeq            207
			((ArrayList) (obj1)).add(((Object) (((FileWithTimestamp)((Iterator) (obj)).next()).file)));
	//   81  180:aload           4
	//   82  182:aload_3         
	//   83  183:invokeinterface #142 <Method Object Iterator.next()>
	//   84  188:checkcast       #9   <Class EventsFilesManager$FileWithTimestamp>
	//   85  191:getfield        #210 <Field File EventsFilesManager$FileWithTimestamp.file>
	//   86  194:invokevirtual   #211 <Method boolean ArrayList.add(Object)>
	//   87  197:pop             
		} while(((ArrayList) (obj1)).size() != j);
	//   88  198:aload           4
	//   89  200:invokevirtual   #212 <Method int ArrayList.size()>
	//   90  203:iload_2         
	//   91  204:icmpne          171
		eventStorage.deleteFilesInRollOverDirectory(((List) (obj1)));
	//   92  207:aload_0         
	//   93  208:getfield        #60  <Field EventsStorage eventStorage>
	//   94  211:aload           4
	//   95  213:invokeinterface #162 <Method void EventsStorage.deleteFilesInRollOverDirectory(List)>
	//   96  218:return          
	}

	public void deleteSentFiles(List list)
	{
		eventStorage.deleteFilesInRollOverDirectory(list);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field EventsStorage eventStorage>
	//    2    4:aload_1         
	//    3    5:invokeinterface #162 <Method void EventsStorage.deleteFilesInRollOverDirectory(List)>
	//    4   10:return          
	}

	protected abstract String generateUniqueRollOverFileName();

	public List getBatchOfFilesToSend()
	{
		return eventStorage.getBatchOfFilesToSend(1);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field EventsStorage eventStorage>
	//    2    4:iconst_1        
	//    3    5:invokeinterface #219 <Method List EventsStorage.getBatchOfFilesToSend(int)>
	//    4   10:areturn         
	}

	public long getLastRollOverTime()
	{
		return lastRollOverTime;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field long lastRollOverTime>
	//    2    4:lreturn         
	}

	protected int getMaxByteSizePerFile()
	{
		return 8000;
	//    0    0:sipush          8000
	//    1    3:ireturn         
	}

	protected int getMaxFilesToKeep()
	{
		return defaultMaxFilesToKeep;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int defaultMaxFilesToKeep>
	//    2    4:ireturn         
	}

	public long parseCreationTimestampFromFileName(String s)
	{
		s = ((String) (s.split("_")));
	//    0    0:aload_1         
	//    1    1:ldc1            #21  <String "_">
	//    2    3:invokevirtual   #227 <Method String[] String.split(String)>
	//    3    6:astore_1        
		if(s.length != 3)
	//*   4    7:aload_1         
	//*   5    8:arraylength     
	//*   6    9:iconst_3        
	//*   7   10:icmpeq          15
			return 0L;
	//    8   13:lconst_0        
	//    9   14:lreturn         
		long l;
		try
		{
			l = Long.valueOf(((String) (s[2]))).longValue();
	//   10   15:aload_1         
	//   11   16:iconst_2        
	//   12   17:aaload          
	//   13   18:invokestatic    #232 <Method Long Long.valueOf(String)>
	//   14   21:invokevirtual   #235 <Method long Long.longValue()>
	//   15   24:lstore_2        
		}
	//*  16   25:lload_2         
	//*  17   26:lreturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  18   27:astore_1        
		{
			return 0L;
	//   19   28:lconst_0        
	//   20   29:lreturn         
		}
		return l;
	}

	public void registerRollOverListener(EventsStorageListener eventsstoragelistener)
	{
		if(eventsstoragelistener != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			rollOverListeners.add(((Object) (eventsstoragelistener)));
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field List rollOverListeners>
	//    4    8:aload_1         
	//    5    9:invokeinterface #238 <Method boolean List.add(Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	public boolean rollFileOver()
		throws IOException
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		String s = null;
	//    2    2:aconst_null     
	//    3    3:astore_2        
		if(!eventStorage.isWorkingFileEmpty())
	//*   4    4:aload_0         
	//*   5    5:getfield        #60  <Field EventsStorage eventStorage>
	//*   6    8:invokeinterface #241 <Method boolean EventsStorage.isWorkingFileEmpty()>
	//*   7   13:ifne            72
		{
			s = generateUniqueRollOverFileName();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #243 <Method String generateUniqueRollOverFileName()>
	//   10   20:astore_2        
			eventStorage.rollOver(s);
	//   11   21:aload_0         
	//   12   22:getfield        #60  <Field EventsStorage eventStorage>
	//   13   25:aload_2         
	//   14   26:invokeinterface #246 <Method void EventsStorage.rollOver(String)>
			CommonUtils.logControlled(context, 4, "Fabric", String.format(Locale.US, "generated new file %s", new Object[] {
				s
			}));
	//   15   31:aload_0         
	//   16   32:getfield        #56  <Field Context context>
	//   17   35:iconst_4        
	//   18   36:ldc1            #113 <String "Fabric">
	//   19   38:getstatic       #94  <Field Locale Locale.US>
	//   20   41:ldc1            #248 <String "generated new file %s">
	//   21   43:iconst_1        
	//   22   44:anewarray       Object[]
	//   23   47:dup             
	//   24   48:iconst_0        
	//   25   49:aload_2         
	//   26   50:aastore         
	//   27   51:invokestatic    #111 <Method String String.format(Locale, String, Object[])>
	//   28   54:invokestatic    #119 <Method void CommonUtils.logControlled(Context, int, String, String)>
			lastRollOverTime = currentTimeProvider.getCurrentTimeMillis();
	//   29   57:aload_0         
	//   30   58:aload_0         
	//   31   59:getfield        #62  <Field CurrentTimeProvider currentTimeProvider>
	//   32   62:invokeinterface #68  <Method long CurrentTimeProvider.getCurrentTimeMillis()>
	//   33   67:putfield        #70  <Field long lastRollOverTime>
			flag = true;
	//   34   70:iconst_1        
	//   35   71:istore_1        
		}
		triggerRollOverOnListeners(s);
	//   36   72:aload_0         
	//   37   73:aload_2         
	//   38   74:invokespecial   #250 <Method void triggerRollOverOnListeners(String)>
		return flag;
	//   39   77:iload_1         
	//   40   78:ireturn         
	}

	public void writeEvent(Object obj)
		throws IOException
	{
		obj = ((Object) (transform.toBytes(obj)));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field EventTransform transform>
	//    2    4:aload_1         
	//    3    5:invokeinterface #258 <Method byte[] EventTransform.toBytes(Object)>
	//    4   10:astore_1        
		rollFileOverIfNeeded(obj.length);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:arraylength     
	//    8   14:invokespecial   #260 <Method void rollFileOverIfNeeded(int)>
		eventStorage.add(((byte []) (obj)));
	//    9   17:aload_0         
	//   10   18:getfield        #60  <Field EventsStorage eventStorage>
	//   11   21:aload_1         
	//   12   22:invokeinterface #263 <Method void EventsStorage.add(byte[])>
	//   13   27:return          
	}

	public static final int MAX_BYTE_SIZE_PER_FILE = 8000;
	public static final int MAX_FILES_IN_BATCH = 1;
	public static final int MAX_FILES_TO_KEEP = 100;
	public static final String ROLL_OVER_FILE_NAME_SEPARATOR = "_";
	protected final Context context;
	protected final CurrentTimeProvider currentTimeProvider;
	private final int defaultMaxFilesToKeep;
	protected final EventsStorage eventStorage;
	protected volatile long lastRollOverTime;
	protected final List rollOverListeners = new CopyOnWriteArrayList();
	protected final EventTransform transform;
}

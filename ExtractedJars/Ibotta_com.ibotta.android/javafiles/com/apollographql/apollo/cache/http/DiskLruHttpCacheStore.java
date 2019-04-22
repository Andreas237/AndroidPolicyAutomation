// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.http;

import com.apollographql.apollo.api.cache.http.*;
import java.io.File;
import java.io.IOException;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.io.FileSystem;
import okio.Sink;
import okio.Source;

public final class DiskLruHttpCacheStore
	implements HttpCacheStore
{

	public DiskLruHttpCacheStore(File file, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		cache = DiskLruCache.create(FileSystem.SYSTEM, file, 0x18697, 2, l);
	//    2    4:aload_0         
	//    3    5:getstatic       #24  <Field FileSystem FileSystem.SYSTEM>
	//    4    8:aload_1         
	//    5    9:ldc1            #25  <Int 0x18697>
	//    6   11:iconst_2        
	//    7   12:lload_2         
	//    8   13:invokestatic    #31  <Method DiskLruCache DiskLruCache.create(FileSystem, File, int, int, long)>
	//    9   16:putfield        #33  <Field DiskLruCache cache>
	//   10   19:return          
	}

	public HttpCacheRecord cacheRecord(final String snapshot)
		throws IOException
	{
		snapshot = ((String) (cache.get(snapshot)));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field DiskLruCache cache>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #43  <Method okhttp3.internal.cache.DiskLruCache$Snapshot DiskLruCache.get(String)>
	//    4    8:astore_1        
		if(snapshot == null)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		else
			return new HttpCacheRecord() {

				public Source bodySource()
				{
					return snapshot.getSource(1);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field okhttp3.internal.cache.DiskLruCache$Snapshot val$snapshot>
				//    2    4:iconst_1        
				//    3    5:invokevirtual   #34  <Method Source okhttp3.internal.cache.DiskLruCache$Snapshot.getSource(int)>
				//    4    8:areturn         
				}

				public void close()
				{
					snapshot.close();
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field okhttp3.internal.cache.DiskLruCache$Snapshot val$snapshot>
				//    2    4:invokevirtual   #38  <Method void okhttp3.internal.cache.DiskLruCache$Snapshot.close()>
				//    3    7:return          
				}

				public Source headerSource()
				{
					return snapshot.getSource(0);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field okhttp3.internal.cache.DiskLruCache$Snapshot val$snapshot>
				//    2    4:iconst_0        
				//    3    5:invokevirtual   #34  <Method Source okhttp3.internal.cache.DiskLruCache$Snapshot.getSource(int)>
				//    4    8:areturn         
				}

				final DiskLruHttpCacheStore this$0;
				final okhttp3.internal.cache.DiskLruCache.Snapshot val$snapshot;

			
			{
				this$0 = DiskLruHttpCacheStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DiskLruHttpCacheStore this$0>
				snapshot = snapshot1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field okhttp3.internal.cache.DiskLruCache$Snapshot val$snapshot>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
;
	//    9   15:new             #8   <Class DiskLruHttpCacheStore$1>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokespecial   #46  <Method void DiskLruHttpCacheStore$1(DiskLruHttpCacheStore, okhttp3.internal.cache.DiskLruCache$Snapshot)>
	//   14   24:areturn         
	}

	public HttpCacheRecordEditor cacheRecordEditor(final String editor)
		throws IOException
	{
		editor = ((String) (cache.edit(editor)));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field DiskLruCache cache>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #53  <Method okhttp3.internal.cache.DiskLruCache$Editor DiskLruCache.edit(String)>
	//    4    8:astore_1        
		if(editor == null)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		else
			return new HttpCacheRecordEditor() {

				public void abort()
					throws IOException
				{
					editor.abort();
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field okhttp3.internal.cache.DiskLruCache$Editor val$editor>
				//    2    4:invokevirtual   #32  <Method void okhttp3.internal.cache.DiskLruCache$Editor.abort()>
				//    3    7:return          
				}

				public Sink bodySink()
				{
					return editor.newSink(1);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field okhttp3.internal.cache.DiskLruCache$Editor val$editor>
				//    2    4:iconst_1        
				//    3    5:invokevirtual   #40  <Method Sink okhttp3.internal.cache.DiskLruCache$Editor.newSink(int)>
				//    4    8:areturn         
				}

				public void commit()
					throws IOException
				{
					editor.commit();
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field okhttp3.internal.cache.DiskLruCache$Editor val$editor>
				//    2    4:invokevirtual   #44  <Method void okhttp3.internal.cache.DiskLruCache$Editor.commit()>
				//    3    7:return          
				}

				public Sink headerSink()
				{
					return editor.newSink(0);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field okhttp3.internal.cache.DiskLruCache$Editor val$editor>
				//    2    4:iconst_0        
				//    3    5:invokevirtual   #40  <Method Sink okhttp3.internal.cache.DiskLruCache$Editor.newSink(int)>
				//    4    8:areturn         
				}

				final DiskLruHttpCacheStore this$0;
				final okhttp3.internal.cache.DiskLruCache.Editor val$editor;

			
			{
				this$0 = DiskLruHttpCacheStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DiskLruHttpCacheStore this$0>
				editor = editor1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field okhttp3.internal.cache.DiskLruCache$Editor val$editor>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
;
	//    9   15:new             #10  <Class DiskLruHttpCacheStore$2>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokespecial   #56  <Method void DiskLruHttpCacheStore$2(DiskLruHttpCacheStore, okhttp3.internal.cache.DiskLruCache$Editor)>
	//   14   24:areturn         
	}

	public void delete()
		throws IOException
	{
		cache.delete();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field DiskLruCache cache>
	//    2    4:invokevirtual   #59  <Method void DiskLruCache.delete()>
	//    3    7:return          
	}

	public void remove(String s)
		throws IOException
	{
		cache.remove(s);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field DiskLruCache cache>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #64  <Method boolean DiskLruCache.remove(String)>
	//    4    8:pop             
	//    5    9:return          
	}

	private final DiskLruCache cache;
}

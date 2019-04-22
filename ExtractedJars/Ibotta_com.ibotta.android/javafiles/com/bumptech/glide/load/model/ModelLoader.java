// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.util.Preconditions;
import java.util.Collections;
import java.util.List;

public interface ModelLoader
{
	public static class LoadData
	{

		public final List alternateKeys;
		public final DataFetcher fetcher;
		public final Key sourceKey;

		public LoadData(Key key, DataFetcher datafetcher)
		{
			this(key, Collections.emptyList(), datafetcher);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #25  <Method List Collections.emptyList()>
		//    3    5:aload_2         
		//    4    6:invokespecial   #28  <Method void ModelLoader$LoadData(Key, List, DataFetcher)>
		//    5    9:return          
		}

		public LoadData(Key key, List list, DataFetcher datafetcher)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void Object()>
			sourceKey = (Key)Preconditions.checkNotNull(((Object) (key)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #41  <Method Object Preconditions.checkNotNull(Object)>
		//    5    9:checkcast       #43  <Class Key>
		//    6   12:putfield        #45  <Field Key sourceKey>
			alternateKeys = (List)Preconditions.checkNotNull(((Object) (list)));
		//    7   15:aload_0         
		//    8   16:aload_2         
		//    9   17:invokestatic    #41  <Method Object Preconditions.checkNotNull(Object)>
		//   10   20:checkcast       #47  <Class List>
		//   11   23:putfield        #49  <Field List alternateKeys>
			fetcher = (DataFetcher)Preconditions.checkNotNull(((Object) (datafetcher)));
		//   12   26:aload_0         
		//   13   27:aload_3         
		//   14   28:invokestatic    #41  <Method Object Preconditions.checkNotNull(Object)>
		//   15   31:checkcast       #51  <Class DataFetcher>
		//   16   34:putfield        #53  <Field DataFetcher fetcher>
		//   17   37:return          
		}
	}


	public abstract LoadData buildLoadData(Object obj, int i, int j, Options options);

	public abstract boolean handles(Object obj);
}

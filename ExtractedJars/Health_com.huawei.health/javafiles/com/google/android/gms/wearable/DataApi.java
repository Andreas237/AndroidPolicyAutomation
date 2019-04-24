// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.*;
import java.io.InputStream;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.gms.wearable:
//			Asset, DataItemAsset, PutDataRequest, DataItem, 
//			DataEventBuffer

public interface DataApi
{
	public static interface DataItemResult
		extends Result
	{

		public abstract DataItem getDataItem();
	}

	public static interface DataListener
	{

		public abstract void onDataChanged(DataEventBuffer dataeventbuffer);
	}

	public static interface DeleteDataItemsResult
		extends Result
	{

		public abstract int getNumDeleted();
	}

	public static interface FilterType
		extends Annotation
	{
	}

	public static interface GetFdForAssetResult
		extends Releasable, Result
	{

		public abstract ParcelFileDescriptor getFd();

		public abstract InputStream getInputStream();
	}


	public abstract PendingResult addListener(GoogleApiClient googleapiclient, DataListener datalistener);

	public abstract PendingResult addListener(GoogleApiClient googleapiclient, DataListener datalistener, Uri uri, int i);

	public abstract PendingResult deleteDataItems(GoogleApiClient googleapiclient, Uri uri);

	public abstract PendingResult deleteDataItems(GoogleApiClient googleapiclient, Uri uri, int i);

	public abstract PendingResult getDataItem(GoogleApiClient googleapiclient, Uri uri);

	public abstract PendingResult getDataItems(GoogleApiClient googleapiclient);

	public abstract PendingResult getDataItems(GoogleApiClient googleapiclient, Uri uri);

	public abstract PendingResult getDataItems(GoogleApiClient googleapiclient, Uri uri, int i);

	public abstract PendingResult getFdForAsset(GoogleApiClient googleapiclient, Asset asset);

	public abstract PendingResult getFdForAsset(GoogleApiClient googleapiclient, DataItemAsset dataitemasset);

	public abstract PendingResult putDataItem(GoogleApiClient googleapiclient, PutDataRequest putdatarequest);

	public abstract PendingResult removeListener(GoogleApiClient googleapiclient, DataListener datalistener);

	public static final String ACTION_DATA_CHANGED = "com.google.android.gms.wearable.DATA_CHANGED";
	public static final int FILTER_LITERAL = 0;
	public static final int FILTER_PREFIX = 1;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.wearable.*;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzb, zzcv, zzm, zzcx

public final class zzah
	implements DataApi
{
	public static class zza
		implements com.google.android.gms.wearable.DataApi.DataItemResult
	{

		public DataItem getDataItem()
		{
			return zzbUo;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field DataItem zzbUo>
		//    2    4:areturn         
		}

		public Status getStatus()
		{
			return zzair;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field Status zzair>
		//    2    4:areturn         
		}

		private final Status zzair;
		private final DataItem zzbUo;

		public zza(Status status, DataItem dataitem)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			zzair = status;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field Status zzair>
			zzbUo = dataitem;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field DataItem zzbUo>
		//    8   14:return          
		}
	}

	public static class zzb
		implements com.google.android.gms.wearable.DataApi.DeleteDataItemsResult
	{

		public int getNumDeleted()
		{
			return zzbUp;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field int zzbUp>
		//    2    4:ireturn         
		}

		public Status getStatus()
		{
			return zzair;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field Status zzair>
		//    2    4:areturn         
		}

		private final Status zzair;
		private final int zzbUp;

		public zzb(Status status, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			zzair = status;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field Status zzair>
			zzbUp = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #22  <Field int zzbUp>
		//    8   14:return          
		}
	}

	public static class zzc
		implements com.google.android.gms.wearable.DataApi.GetFdForAssetResult
	{

		public ParcelFileDescriptor getFd()
		{
			if(mClosed)
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field boolean mClosed>
		//*   2    4:ifeq            17
				throw new IllegalStateException("Cannot access the file descriptor after release().");
		//    3    7:new             #33  <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:ldc1            #35  <String "Cannot access the file descriptor after release().">
		//    6   13:invokespecial   #38  <Method void IllegalStateException(String)>
		//    7   16:athrow          
			else
				return zzbUq;
		//    8   17:aload_0         
		//    9   18:getfield        #28  <Field ParcelFileDescriptor zzbUq>
		//   10   21:areturn         
		}

		public InputStream getInputStream()
		{
			if(mClosed)
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field boolean mClosed>
		//*   2    4:ifeq            17
				throw new IllegalStateException("Cannot access the input stream after release().");
		//    3    7:new             #33  <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:ldc1            #42  <String "Cannot access the input stream after release().">
		//    6   13:invokespecial   #38  <Method void IllegalStateException(String)>
		//    7   16:athrow          
			if(zzbUq == null)
		//*   8   17:aload_0         
		//*   9   18:getfield        #28  <Field ParcelFileDescriptor zzbUq>
		//*  10   21:ifnonnull       26
				return null;
		//   11   24:aconst_null     
		//   12   25:areturn         
			if(zzbUb == null)
		//*  13   26:aload_0         
		//*  14   27:getfield        #44  <Field InputStream zzbUb>
		//*  15   30:ifnonnull       48
				zzbUb = ((InputStream) (new android.os.ParcelFileDescriptor.AutoCloseInputStream(zzbUq)));
		//   16   33:aload_0         
		//   17   34:new             #46  <Class android.os.ParcelFileDescriptor$AutoCloseInputStream>
		//   18   37:dup             
		//   19   38:aload_0         
		//   20   39:getfield        #28  <Field ParcelFileDescriptor zzbUq>
		//   21   42:invokespecial   #49  <Method void android.os.ParcelFileDescriptor$AutoCloseInputStream(ParcelFileDescriptor)>
		//   22   45:putfield        #44  <Field InputStream zzbUb>
			return zzbUb;
		//   23   48:aload_0         
		//   24   49:getfield        #44  <Field InputStream zzbUb>
		//   25   52:areturn         
		}

		public Status getStatus()
		{
			return zzair;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Status zzair>
		//    2    4:areturn         
		}

		public void release()
		{
			if(zzbUq == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field ParcelFileDescriptor zzbUq>
		//*   2    4:ifnonnull       8
				return;
		//    3    7:return          
			if(mClosed)
		//*   4    8:aload_0         
		//*   5    9:getfield        #24  <Field boolean mClosed>
		//*   6   12:ifeq            25
				throw new IllegalStateException("releasing an already released result.");
		//    7   15:new             #33  <Class IllegalStateException>
		//    8   18:dup             
		//    9   19:ldc1            #56  <String "releasing an already released result.">
		//   10   21:invokespecial   #38  <Method void IllegalStateException(String)>
		//   11   24:athrow          
			try
			{
				if(zzbUb != null)
		//*  12   25:aload_0         
		//*  13   26:getfield        #44  <Field InputStream zzbUb>
		//*  14   29:ifnull          42
				{
					zzbUb.close();
		//   15   32:aload_0         
		//   16   33:getfield        #44  <Field InputStream zzbUb>
		//   17   36:invokevirtual   #61  <Method void InputStream.close()>
					break MISSING_BLOCK_LABEL_49;
		//   18   39:goto            49
				}
			}
		//*  19   42:aload_0         
		//*  20   43:getfield        #28  <Field ParcelFileDescriptor zzbUq>
		//*  21   46:invokevirtual   #64  <Method void ParcelFileDescriptor.close()>
		//*  22   49:aload_0         
		//*  23   50:iconst_1        
		//*  24   51:putfield        #24  <Field boolean mClosed>
		//*  25   54:aload_0         
		//*  26   55:aconst_null     
		//*  27   56:putfield        #28  <Field ParcelFileDescriptor zzbUq>
		//*  28   59:aload_0         
		//*  29   60:aconst_null     
		//*  30   61:putfield        #44  <Field InputStream zzbUb>
		//*  31   64:return          
			catch(IOException ioexception)
		//*  32   65:astore_1        
			{
				return;
		//   33   66:return          
			}
			zzbUq.close();
			mClosed = true;
			zzbUq = null;
			zzbUb = null;
			return;
		}

		private volatile boolean mClosed;
		private final Status zzair;
		private volatile InputStream zzbUb;
		private volatile ParcelFileDescriptor zzbUq;

		public zzc(Status status, ParcelFileDescriptor parcelfiledescriptor)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			mClosed = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #24  <Field boolean mClosed>
			zzair = status;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #26  <Field Status zzair>
			zzbUq = parcelfiledescriptor;
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:putfield        #28  <Field ParcelFileDescriptor zzbUq>
		//   11   19:return          
		}
	}


	public zzah()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
	//    2    4:return          
	}

	private PendingResult zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
	{
		return com.google.android.gms.wearable.internal.zzb.zza(googleapiclient, zza(aintentfilter), ((Object) (datalistener)));
	//    0    0:aload_1         
	//    1    1:aload_3         
	//    2    2:invokestatic    #42  <Method zzb$zza zza(IntentFilter[])>
	//    3    5:aload_2         
	//    4    6:invokestatic    #47  <Method PendingResult zzb.zza(GoogleApiClient, zzb$zza, Object)>
	//    5    9:areturn         
	}

	private static zzb.zza zza(IntentFilter aintentfilter[])
	{
		return new zzb.zza(aintentfilter) {

			public void zza(zzcx zzcx1, com.google.android.gms.internal.zzaad.zzb zzb1, com.google.android.gms.wearable.DataApi.DataListener datalistener, zzabh zzabh)
				throws RemoteException
			{
				zzcx1.zza(zzb1, datalistener, zzabh, zzbTK);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:aload_3         
			//    3    3:aload           4
			//    4    5:aload_0         
			//    5    6:getfield        #18  <Field IntentFilter[] zzbTK>
			//    6    9:invokevirtual   #30  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.DataApi$DataListener, zzabh, IntentFilter[])>
			//    7   12:return          
			}

			public volatile void zza(zzcx zzcx1, com.google.android.gms.internal.zzaad.zzb zzb1, Object obj, zzabh zzabh)
				throws RemoteException
			{
				zza(zzcx1, zzb1, (com.google.android.gms.wearable.DataApi.DataListener)obj, zzabh);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:aload_3         
			//    4    4:checkcast       #36  <Class com.google.android.gms.wearable.DataApi$DataListener>
			//    5    7:aload           4
			//    6    9:invokevirtual   #38  <Method void zza(zzcx, com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.DataApi$DataListener, zzabh)>
			//    7   12:return          
			}

			final IntentFilter zzbTK[];

			
			{
				zzbTK = aintentfilter;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field IntentFilter[] zzbTK>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #22  <Class zzah$8>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #52  <Method void zzah$8(IntentFilter[])>
	//    4    8:areturn         
	}

	private void zza(Asset asset)
	{
		if(asset == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("asset is null");
	//    2    4:new             #56  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #58  <String "asset is null">
	//    5   10:invokespecial   #61  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(asset.getDigest() == null)
	//*   7   14:aload_1         
	//*   8   15:invokevirtual   #67  <Method String Asset.getDigest()>
	//*   9   18:ifnonnull       31
			throw new IllegalArgumentException("invalid asset");
	//   10   21:new             #56  <Class IllegalArgumentException>
	//   11   24:dup             
	//   12   25:ldc1            #69  <String "invalid asset">
	//   13   27:invokespecial   #61  <Method void IllegalArgumentException(String)>
	//   14   30:athrow          
		if(asset.getData() != null)
	//*  15   31:aload_1         
	//*  16   32:invokevirtual   #73  <Method byte[] Asset.getData()>
	//*  17   35:ifnull          48
			throw new IllegalArgumentException("invalid asset");
	//   18   38:new             #56  <Class IllegalArgumentException>
	//   19   41:dup             
	//   20   42:ldc1            #69  <String "invalid asset">
	//   21   44:invokespecial   #61  <Method void IllegalArgumentException(String)>
	//   22   47:athrow          
		else
			return;
	//   23   48:return          
	}

	public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener)
	{
		return zza(googleapiclient, datalistener, new IntentFilter[] {
			zzcv.zzip("com.google.android.gms.wearable.DATA_CHANGED")
		});
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:anewarray       IntentFilter[]
	//    5    7:dup             
	//    6    8:iconst_0        
	//    7    9:ldc1            #79  <String "com.google.android.gms.wearable.DATA_CHANGED">
	//    8   11:invokestatic    #85  <Method IntentFilter zzcv.zzip(String)>
	//    9   14:aastore         
	//   10   15:invokespecial   #87  <Method PendingResult zza(GoogleApiClient, com.google.android.gms.wearable.DataApi$DataListener, IntentFilter[])>
	//   11   18:areturn         
	}

	public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener, Uri uri, int i)
	{
		boolean flag;
		if(uri != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          10
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore          5
		else
	//*   4    7:goto            13
			flag = false;
	//    5   10:iconst_0        
	//    6   11:istore          5
		zzac.zzb(flag, "uri must not be null");
	//    7   13:iload           5
	//    8   15:ldc1            #91  <String "uri must not be null">
	//    9   17:invokestatic    #96  <Method void zzac.zzb(boolean, Object)>
		if(i == 0 || i == 1)
	//*  10   20:iload           4
	//*  11   22:ifeq            31
	//*  12   25:iload           4
	//*  13   27:iconst_1        
	//*  14   28:icmpne          37
			flag = true;
	//   15   31:iconst_1        
	//   16   32:istore          5
		else
	//*  17   34:goto            40
			flag = false;
	//   18   37:iconst_0        
	//   19   38:istore          5
		zzac.zzb(flag, "invalid filter type");
	//   20   40:iload           5
	//   21   42:ldc1            #98  <String "invalid filter type">
	//   22   44:invokestatic    #96  <Method void zzac.zzb(boolean, Object)>
		return zza(googleapiclient, datalistener, new IntentFilter[] {
			zzcv.zza("com.google.android.gms.wearable.DATA_CHANGED", uri, i)
		});
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:aload_2         
	//   26   50:iconst_1        
	//   27   51:anewarray       IntentFilter[]
	//   28   54:dup             
	//   29   55:iconst_0        
	//   30   56:ldc1            #79  <String "com.google.android.gms.wearable.DATA_CHANGED">
	//   31   58:aload_3         
	//   32   59:iload           4
	//   33   61:invokestatic    #101 <Method IntentFilter zzcv.zza(String, Uri, int)>
	//   34   64:aastore         
	//   35   65:invokespecial   #87  <Method PendingResult zza(GoogleApiClient, com.google.android.gms.wearable.DataApi$DataListener, IntentFilter[])>
	//   36   68:areturn         
	}

	public PendingResult deleteDataItems(GoogleApiClient googleapiclient, Uri uri)
	{
		return deleteDataItems(googleapiclient, uri, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #107 <Method PendingResult deleteDataItems(GoogleApiClient, Uri, int)>
	//    5    7:areturn         
	}

	public PendingResult deleteDataItems(GoogleApiClient googleapiclient, Uri uri, int i)
	{
		boolean flag;
		if(uri != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          10
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore          4
		else
	//*   4    7:goto            13
			flag = false;
	//    5   10:iconst_0        
	//    6   11:istore          4
		zzac.zzb(flag, "uri must not be null");
	//    7   13:iload           4
	//    8   15:ldc1            #91  <String "uri must not be null">
	//    9   17:invokestatic    #96  <Method void zzac.zzb(boolean, Object)>
		if(i == 0 || i == 1)
	//*  10   20:iload_3         
	//*  11   21:ifeq            29
	//*  12   24:iload_3         
	//*  13   25:iconst_1        
	//*  14   26:icmpne          35
			flag = true;
	//   15   29:iconst_1        
	//   16   30:istore          4
		else
	//*  17   32:goto            38
			flag = false;
	//   18   35:iconst_0        
	//   19   36:istore          4
		zzac.zzb(flag, "invalid filter type");
	//   20   38:iload           4
	//   21   40:ldc1            #98  <String "invalid filter type">
	//   22   42:invokestatic    #96  <Method void zzac.zzb(boolean, Object)>
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient, uri, i) {

			public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzcx)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #30  <Class zzcx>
			//    3    5:invokevirtual   #33  <Method void zza(zzcx)>
			//    4    8:return          
			}

			protected void zza(zzcx zzcx1)
				throws RemoteException
			{
				zzcx1.zzb(((com.google.android.gms.internal.zzaad.zzb) (this)), zzbBv, zzbUk);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #18  <Field Uri zzbBv>
			//    4    6:aload_0         
			//    5    7:getfield        #20  <Field int zzbUk>
			//    6   10:invokevirtual   #38  <Method void zzcx.zzb(com.google.android.gms.internal.zzaad$zzb, Uri, int)>
			//    7   13:return          
			}

			protected com.google.android.gms.wearable.DataApi.DeleteDataItemsResult zzbY(Status status)
			{
				return ((com.google.android.gms.wearable.DataApi.DeleteDataItemsResult) (new zzb(status, 0)));
			//    0    0:new             #42  <Class zzah$zzb>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:iconst_0        
			//    4    6:invokespecial   #45  <Method void zzah$zzb(Status, int)>
			//    5    9:areturn         
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzbY(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #49  <Method com.google.android.gms.wearable.DataApi$DeleteDataItemsResult zzbY(Status)>
			//    3    5:areturn         
			}

			final Uri zzbBv;
			final int zzbUk;

			
			{
				zzbBv = uri;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #18  <Field Uri zzbBv>
				zzbUk = i;
			//    3    5:aload_0         
			//    4    6:iload           4
			//    5    8:putfield        #20  <Field int zzbUk>
				super(googleapiclient);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:invokespecial   #23  <Method void zzm(GoogleApiClient)>
			//    9   16:return          
			}
		}
)))));
	//   23   45:aload_1         
	//   24   46:new             #16  <Class zzah$5>
	//   25   49:dup             
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:aload_2         
	//   29   53:iload_3         
	//   30   54:invokespecial   #111 <Method void zzah$5(zzah, GoogleApiClient, Uri, int)>
	//   31   57:invokevirtual   #116 <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//   32   60:areturn         
	}

	public PendingResult getDataItem(GoogleApiClient googleapiclient, Uri uri)
	{
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient, uri) {

			public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzcx)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class zzcx>
			//    3    5:invokevirtual   #29  <Method void zza(zzcx)>
			//    4    8:return          
			}

			protected void zza(zzcx zzcx1)
				throws RemoteException
			{
				zzcx1.zza(((com.google.android.gms.internal.zzaad.zzb) (this)), zzbBv);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #16  <Field Uri zzbBv>
			//    4    6:invokevirtual   #33  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, Uri)>
			//    5    9:return          
			}

			protected com.google.android.gms.wearable.DataApi.DataItemResult zzbW(Status status)
			{
				return ((com.google.android.gms.wearable.DataApi.DataItemResult) (new zza(status, ((DataItem) (null)))));
			//    0    0:new             #37  <Class zzah$zza>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #40  <Method void zzah$zza(Status, DataItem)>
			//    5    9:areturn         
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzbW(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #44  <Method com.google.android.gms.wearable.DataApi$DataItemResult zzbW(Status)>
			//    3    5:areturn         
			}

			final Uri zzbBv;

			
			{
				zzbBv = uri;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #16  <Field Uri zzbBv>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #19  <Method void zzm(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #10  <Class zzah$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #121 <Method void zzah$2(zzah, GoogleApiClient, Uri)>
	//    7   11:invokevirtual   #116 <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult getDataItems(GoogleApiClient googleapiclient)
	{
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient) {

			public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzcx)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #22  <Class zzcx>
			//    3    5:invokevirtual   #25  <Method void zza(zzcx)>
			//    4    8:return          
			}

			protected void zza(zzcx zzcx1)
				throws RemoteException
			{
				zzcx1.zzw(((com.google.android.gms.internal.zzaad.zzb) (this)));
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:invokevirtual   #30  <Method void zzcx.zzw(com.google.android.gms.internal.zzaad$zzb)>
			//    3    5:return          
			}

			protected DataItemBuffer zzbX(Status status)
			{
				return new DataItemBuffer(DataHolder.zzcJ(status.getStatusCode()));
			//    0    0:new             #34  <Class DataItemBuffer>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokevirtual   #40  <Method int Status.getStatusCode()>
			//    4    8:invokestatic    #46  <Method DataHolder DataHolder.zzcJ(int)>
			//    5   11:invokespecial   #49  <Method void DataItemBuffer(DataHolder)>
			//    6   14:areturn         
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzbX(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #53  <Method DataItemBuffer zzbX(Status)>
			//    3    5:areturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:invokespecial   #15  <Method void zzm(GoogleApiClient)>
			//    3    5:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #12  <Class zzah$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #127 <Method void zzah$3(zzah, GoogleApiClient)>
	//    6   10:invokevirtual   #116 <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//    7   13:areturn         
	}

	public PendingResult getDataItems(GoogleApiClient googleapiclient, Uri uri)
	{
		return getDataItems(googleapiclient, uri, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #130 <Method PendingResult getDataItems(GoogleApiClient, Uri, int)>
	//    5    7:areturn         
	}

	public PendingResult getDataItems(GoogleApiClient googleapiclient, Uri uri, int i)
	{
		boolean flag;
		if(uri != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          10
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore          4
		else
	//*   4    7:goto            13
			flag = false;
	//    5   10:iconst_0        
	//    6   11:istore          4
		zzac.zzb(flag, "uri must not be null");
	//    7   13:iload           4
	//    8   15:ldc1            #91  <String "uri must not be null">
	//    9   17:invokestatic    #96  <Method void zzac.zzb(boolean, Object)>
		if(i == 0 || i == 1)
	//*  10   20:iload_3         
	//*  11   21:ifeq            29
	//*  12   24:iload_3         
	//*  13   25:iconst_1        
	//*  14   26:icmpne          35
			flag = true;
	//   15   29:iconst_1        
	//   16   30:istore          4
		else
	//*  17   32:goto            38
			flag = false;
	//   18   35:iconst_0        
	//   19   36:istore          4
		zzac.zzb(flag, "invalid filter type");
	//   20   38:iload           4
	//   21   40:ldc1            #98  <String "invalid filter type">
	//   22   42:invokestatic    #96  <Method void zzac.zzb(boolean, Object)>
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient, uri, i) {

			public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzcx)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #30  <Class zzcx>
			//    3    5:invokevirtual   #33  <Method void zza(zzcx)>
			//    4    8:return          
			}

			protected void zza(zzcx zzcx1)
				throws RemoteException
			{
				zzcx1.zza(((com.google.android.gms.internal.zzaad.zzb) (this)), zzbBv, zzbUk);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #18  <Field Uri zzbBv>
			//    4    6:aload_0         
			//    5    7:getfield        #20  <Field int zzbUk>
			//    6   10:invokevirtual   #37  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, Uri, int)>
			//    7   13:return          
			}

			protected DataItemBuffer zzbX(Status status)
			{
				return new DataItemBuffer(DataHolder.zzcJ(status.getStatusCode()));
			//    0    0:new             #41  <Class DataItemBuffer>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokevirtual   #47  <Method int Status.getStatusCode()>
			//    4    8:invokestatic    #53  <Method DataHolder DataHolder.zzcJ(int)>
			//    5   11:invokespecial   #56  <Method void DataItemBuffer(DataHolder)>
			//    6   14:areturn         
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzbX(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #60  <Method DataItemBuffer zzbX(Status)>
			//    3    5:areturn         
			}

			final Uri zzbBv;
			final int zzbUk;

			
			{
				zzbBv = uri;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #18  <Field Uri zzbBv>
				zzbUk = i;
			//    3    5:aload_0         
			//    4    6:iload           4
			//    5    8:putfield        #20  <Field int zzbUk>
				super(googleapiclient);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:invokespecial   #23  <Method void zzm(GoogleApiClient)>
			//    9   16:return          
			}
		}
)))));
	//   23   45:aload_1         
	//   24   46:new             #14  <Class zzah$4>
	//   25   49:dup             
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:aload_2         
	//   29   53:iload_3         
	//   30   54:invokespecial   #132 <Method void zzah$4(zzah, GoogleApiClient, Uri, int)>
	//   31   57:invokevirtual   #116 <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//   32   60:areturn         
	}

	public PendingResult getFdForAsset(GoogleApiClient googleapiclient, Asset asset)
	{
		zza(asset);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #137 <Method void zza(Asset)>
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient, asset) {

			public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzcx)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class zzcx>
			//    3    5:invokevirtual   #29  <Method void zza(zzcx)>
			//    4    8:return          
			}

			protected void zza(zzcx zzcx1)
				throws RemoteException
			{
				zzcx1.zza(((com.google.android.gms.internal.zzaad.zzb) (this)), zzbUl);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #16  <Field Asset zzbUl>
			//    4    6:invokevirtual   #33  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, Asset)>
			//    5    9:return          
			}

			protected com.google.android.gms.wearable.DataApi.GetFdForAssetResult zzbZ(Status status)
			{
				return ((com.google.android.gms.wearable.DataApi.GetFdForAssetResult) (new zzc(status, ((ParcelFileDescriptor) (null)))));
			//    0    0:new             #37  <Class zzah$zzc>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #40  <Method void zzah$zzc(Status, ParcelFileDescriptor)>
			//    5    9:areturn         
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzbZ(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #44  <Method com.google.android.gms.wearable.DataApi$GetFdForAssetResult zzbZ(Status)>
			//    3    5:areturn         
			}

			final Asset zzbUl;

			
			{
				zzbUl = asset;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #16  <Field Asset zzbUl>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #19  <Method void zzm(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    3    5:aload_1         
	//    4    6:new             #18  <Class zzah$6>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokespecial   #140 <Method void zzah$6(zzah, GoogleApiClient, Asset)>
	//   10   16:invokevirtual   #116 <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//   11   19:areturn         
	}

	public PendingResult getFdForAsset(GoogleApiClient googleapiclient, DataItemAsset dataitemasset)
	{
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient, dataitemasset) {

			public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzcx)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class zzcx>
			//    3    5:invokevirtual   #29  <Method void zza(zzcx)>
			//    4    8:return          
			}

			protected void zza(zzcx zzcx1)
				throws RemoteException
			{
				zzcx1.zza(((com.google.android.gms.internal.zzaad.zzb) (this)), zzbUm);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #16  <Field DataItemAsset zzbUm>
			//    4    6:invokevirtual   #33  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, DataItemAsset)>
			//    5    9:return          
			}

			protected com.google.android.gms.wearable.DataApi.GetFdForAssetResult zzbZ(Status status)
			{
				return ((com.google.android.gms.wearable.DataApi.GetFdForAssetResult) (new zzc(status, ((ParcelFileDescriptor) (null)))));
			//    0    0:new             #37  <Class zzah$zzc>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #40  <Method void zzah$zzc(Status, ParcelFileDescriptor)>
			//    5    9:areturn         
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzbZ(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #44  <Method com.google.android.gms.wearable.DataApi$GetFdForAssetResult zzbZ(Status)>
			//    3    5:areturn         
			}

			final DataItemAsset zzbUm;

			
			{
				zzbUm = dataitemasset;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #16  <Field DataItemAsset zzbUm>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #19  <Method void zzm(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #20  <Class zzah$7>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #145 <Method void zzah$7(zzah, GoogleApiClient, DataItemAsset)>
	//    7   11:invokevirtual   #116 <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult putDataItem(GoogleApiClient googleapiclient, PutDataRequest putdatarequest)
	{
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient, putdatarequest) {

			public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzcx)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class zzcx>
			//    3    5:invokevirtual   #29  <Method void zza(zzcx)>
			//    4    8:return          
			}

			protected void zza(zzcx zzcx1)
				throws RemoteException
			{
				zzcx1.zza(((com.google.android.gms.internal.zzaad.zzb) (this)), zzbUj);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #16  <Field PutDataRequest zzbUj>
			//    4    6:invokevirtual   #33  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, PutDataRequest)>
			//    5    9:return          
			}

			public com.google.android.gms.wearable.DataApi.DataItemResult zzbW(Status status)
			{
				return ((com.google.android.gms.wearable.DataApi.DataItemResult) (new zza(status, ((DataItem) (null)))));
			//    0    0:new             #37  <Class zzah$zza>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #40  <Method void zzah$zza(Status, DataItem)>
			//    5    9:areturn         
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzbW(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #44  <Method com.google.android.gms.wearable.DataApi$DataItemResult zzbW(Status)>
			//    3    5:areturn         
			}

			final PutDataRequest zzbUj;

			
			{
				zzbUj = putdatarequest;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #16  <Field PutDataRequest zzbUj>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #19  <Method void zzm(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #8   <Class zzah$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #151 <Method void zzah$1(zzah, GoogleApiClient, PutDataRequest)>
	//    7   11:invokevirtual   #116 <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//    8   14:areturn         
	}

	public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.DataApi.DataListener datalistener)
	{
		return ((PendingResult) (googleapiclient.zza(((com.google.android.gms.internal.zzaad.zza) (new zzm(googleapiclient, datalistener) {

			public volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
				throws RemoteException
			{
				zza((zzcx)zzb1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class zzcx>
			//    3    5:invokevirtual   #29  <Method void zza(zzcx)>
			//    4    8:return          
			}

			protected void zza(zzcx zzcx1)
				throws RemoteException
			{
				zzcx1.zza(((com.google.android.gms.internal.zzaad.zzb) (this)), zzbUn);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:aload_0         
			//    3    3:getfield        #16  <Field com.google.android.gms.wearable.DataApi$DataListener zzbUn>
			//    4    6:invokevirtual   #33  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.DataApi$DataListener)>
			//    5    9:return          
			}

			public Status zzb(Status status)
			{
				return status;
			//    0    0:aload_1         
			//    1    1:areturn         
			}

			public Result zzc(Status status)
			{
				return ((Result) (zzb(status)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #39  <Method Status zzb(Status)>
			//    3    5:areturn         
			}

			final com.google.android.gms.wearable.DataApi.DataListener zzbUn;

			
			{
				zzbUn = datalistener;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #16  <Field com.google.android.gms.wearable.DataApi$DataListener zzbUn>
				super(googleapiclient);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #19  <Method void zzm(GoogleApiClient)>
			//    6   10:return          
			}
		}
)))));
	//    0    0:aload_1         
	//    1    1:new             #24  <Class zzah$9>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #156 <Method void zzah$9(zzah, GoogleApiClient, com.google.android.gms.wearable.DataApi$DataListener)>
	//    7   11:invokevirtual   #116 <Method com.google.android.gms.internal.zzaad$zza GoogleApiClient.zza(com.google.android.gms.internal.zzaad$zza)>
	//    8   14:areturn         
	}
}

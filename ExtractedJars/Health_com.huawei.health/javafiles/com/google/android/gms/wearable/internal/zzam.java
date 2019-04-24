// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataItemAsset;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzak

public class zzam extends zzc
	implements DataItemAsset
{

	public zzam(DataHolder dataholder, int i)
	{
		super(dataholder, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #10  <Method void zzc(DataHolder, int)>
	//    4    6:return          
	}

	public Object freeze()
	{
		return ((Object) (zzUw()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method DataItemAsset zzUw()>
	//    2    4:areturn         
	}

	public String getDataItemKey()
	{
		return getString("asset_key");
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <String "asset_key">
	//    2    3:invokevirtual   #25  <Method String getString(String)>
	//    3    6:areturn         
	}

	public String getId()
	{
		return getString("asset_id");
	//    0    0:aload_0         
	//    1    1:ldc1            #28  <String "asset_id">
	//    2    3:invokevirtual   #25  <Method String getString(String)>
	//    3    6:areturn         
	}

	public DataItemAsset zzUw()
	{
		return ((DataItemAsset) (new zzak(((DataItemAsset) (this)))));
	//    0    0:new             #30  <Class zzak>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void zzak(DataItemAsset)>
	//    4    8:areturn         
	}
}

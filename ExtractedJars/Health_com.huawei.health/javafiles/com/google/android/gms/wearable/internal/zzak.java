// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataItemAsset;

public class zzak
	implements DataItemAsset
{

	public zzak(DataItemAsset dataitemasset)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzGV = dataitemasset.getId();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #18  <Method String DataItemAsset.getId()>
	//    5   11:putfield        #20  <Field String zzGV>
		zzAX = dataitemasset.getDataItemKey();
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokeinterface #23  <Method String DataItemAsset.getDataItemKey()>
	//    9   21:putfield        #25  <Field String zzAX>
	//   10   24:return          
	}

	public Object freeze()
	{
		return ((Object) (zzUw()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method DataItemAsset zzUw()>
	//    2    4:areturn         
	}

	public String getDataItemKey()
	{
		return zzAX;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String zzAX>
	//    2    4:areturn         
	}

	public String getId()
	{
		return zzGV;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String zzGV>
	//    2    4:areturn         
	}

	public boolean isDataValid()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #37  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("DataItemAssetEntity[");
	//    4    8:aload_1         
	//    5    9:ldc1            #40  <String "DataItemAssetEntity[">
	//    6   11:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("@");
	//    8   15:aload_1         
	//    9   16:ldc1            #46  <String "@">
	//   10   18:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(Integer.toHexString(((Object)this).hashCode()));
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #50  <Method int Object.hashCode()>
	//   15   27:invokestatic    #56  <Method String Integer.toHexString(int)>
	//   16   30:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		if(zzGV == null)
	//*  18   34:aload_0         
	//*  19   35:getfield        #20  <Field String zzGV>
	//*  20   38:ifnonnull       51
		{
			stringbuilder.append(",noid");
	//   21   41:aload_1         
	//   22   42:ldc1            #58  <String ",noid">
	//   23   44:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
		} else
	//*  25   48:goto            67
		{
			stringbuilder.append(",");
	//   26   51:aload_1         
	//   27   52:ldc1            #60  <String ",">
	//   28   54:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
			stringbuilder.append(zzGV);
	//   30   58:aload_1         
	//   31   59:aload_0         
	//   32   60:getfield        #20  <Field String zzGV>
	//   33   63:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
		}
		stringbuilder.append(", key=");
	//   35   67:aload_1         
	//   36   68:ldc1            #62  <String ", key=">
	//   37   70:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   38   73:pop             
		stringbuilder.append(zzAX);
	//   39   74:aload_1         
	//   40   75:aload_0         
	//   41   76:getfield        #25  <Field String zzAX>
	//   42   79:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   43   82:pop             
		stringbuilder.append("]");
	//   44   83:aload_1         
	//   45   84:ldc1            #64  <String "]">
	//   46   86:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   47   89:pop             
		return stringbuilder.toString();
	//   48   90:aload_1         
	//   49   91:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   50   94:areturn         
	}

	public DataItemAsset zzUw()
	{
		return ((DataItemAsset) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	private final String zzAX;
	private final String zzGV;
}

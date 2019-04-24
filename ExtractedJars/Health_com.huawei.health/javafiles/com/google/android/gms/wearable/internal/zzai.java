// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public class zzai
	implements DataEvent
{

	public zzai(DataEvent dataevent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzakD = dataevent.getType();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #19  <Method int DataEvent.getType()>
	//    5   11:putfield        #21  <Field int zzakD>
		zzbUo = (DataItem)dataevent.getDataItem().freeze();
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokeinterface #25  <Method DataItem DataEvent.getDataItem()>
	//    9   21:invokeinterface #31  <Method Object DataItem.freeze()>
	//   10   26:checkcast       #27  <Class DataItem>
	//   11   29:putfield        #33  <Field DataItem zzbUo>
	//   12   32:return          
	}

	public Object freeze()
	{
		return ((Object) (zzUv()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method DataEvent zzUv()>
	//    2    4:areturn         
	}

	public DataItem getDataItem()
	{
		return zzbUo;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field DataItem zzbUo>
	//    2    4:areturn         
	}

	public int getType()
	{
		return zzakD;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int zzakD>
	//    2    4:ireturn         
	}

	public boolean isDataValid()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public String toString()
	{
		String s;
		if(getType() == 1)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #43  <Method int getType()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          14
			s = "changed";
	//    4    8:ldc1            #45  <String "changed">
	//    5   10:astore_2        
		else
	//*   6   11:goto            31
		if(getType() == 2)
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #43  <Method int getType()>
	//*   9   18:iconst_2        
	//*  10   19:icmpne          28
			s = "deleted";
	//   11   22:ldc1            #47  <String "deleted">
	//   12   24:astore_2        
		else
	//*  13   25:goto            31
			s = "unknown";
	//   14   28:ldc1            #49  <String "unknown">
	//   15   30:astore_2        
		String s1 = String.valueOf(((Object) (getDataItem())));
	//   16   31:aload_0         
	//   17   32:invokevirtual   #50  <Method DataItem getDataItem()>
	//   18   35:invokestatic    #56  <Method String String.valueOf(Object)>
	//   19   38:astore_3        
		int i = String.valueOf(((Object) (s))).length();
	//   20   39:aload_2         
	//   21   40:invokestatic    #56  <Method String String.valueOf(Object)>
	//   22   43:invokevirtual   #59  <Method int String.length()>
	//   23   46:istore_1        
		return (new StringBuilder(String.valueOf(((Object) (s1))).length() + (i + 35))).append("DataEventEntity{ type=").append(s).append(", dataitem=").append(s1).append(" }").toString();
	//   24   47:new             #61  <Class StringBuilder>
	//   25   50:dup             
	//   26   51:aload_3         
	//   27   52:invokestatic    #56  <Method String String.valueOf(Object)>
	//   28   55:invokevirtual   #59  <Method int String.length()>
	//   29   58:iload_1         
	//   30   59:bipush          35
	//   31   61:iadd            
	//   32   62:iadd            
	//   33   63:invokespecial   #64  <Method void StringBuilder(int)>
	//   34   66:ldc1            #66  <String "DataEventEntity{ type=">
	//   35   68:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   36   71:aload_2         
	//   37   72:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   38   75:ldc1            #72  <String ", dataitem=">
	//   39   77:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   40   80:aload_3         
	//   41   81:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   42   84:ldc1            #74  <String " }">
	//   43   86:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   44   89:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   45   92:areturn         
	}

	public DataEvent zzUv()
	{
		return ((DataEvent) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	private int zzakD;
	private DataItem zzbUo;
}

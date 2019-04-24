// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.os.*;
import java.util.*;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			UpdateDisplayState

public static class UpdateDisplayState$AnswerMap
	implements Parcelable
{

	public void a(Integer integer, String s)
	{
		a.put(((Object) (integer)), ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field HashMap a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #40  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #46  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void Bundle()>
	//    3    7:astore_3        
		java.util.Map.Entry entry;
		for(Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); bundle.putString(Integer.toString(((Integer)entry.getKey()).intValue()), (String)entry.getValue()))
	//*   4    8:aload_0         
	//*   5    9:getfield        #34  <Field HashMap a>
	//*   6   12:invokevirtual   #51  <Method Set HashMap.entrySet()>
	//*   7   15:invokeinterface #57  <Method Iterator Set.iterator()>
	//*   8   20:astore          4
	//*   9   22:aload           4
	//*  10   24:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//*  11   29:ifeq            77
			entry = (java.util.Map.Entry)iterator.next();
	//   12   32:aload           4
	//   13   34:invokeinterface #67  <Method Object Iterator.next()>
	//   14   39:checkcast       #69  <Class java.util.Map$Entry>
	//   15   42:astore          5

	//   16   44:aload_3         
	//   17   45:aload           5
	//   18   47:invokeinterface #72  <Method Object java.util.Map$Entry.getKey()>
	//   19   52:checkcast       #74  <Class Integer>
	//   20   55:invokevirtual   #77  <Method int Integer.intValue()>
	//   21   58:invokestatic    #81  <Method String Integer.toString(int)>
	//   22   61:aload           5
	//   23   63:invokeinterface #84  <Method Object java.util.Map$Entry.getValue()>
	//   24   68:checkcast       #86  <Class String>
	//   25   71:invokevirtual   #90  <Method void Bundle.putString(String, String)>
	//*  26   74:goto            22
		parcel.writeBundle(bundle);
	//   27   77:aload_1         
	//   28   78:aload_3         
	//   29   79:invokevirtual   #96  <Method void Parcel.writeBundle(Bundle)>
	//   30   82:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public UpdateDisplayState.AnswerMap a(Parcel parcel)
		{
			Bundle bundle = new Bundle(((Class) (com/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap)).getClassLoader());
		//    0    0:new             #21  <Class Bundle>
		//    1    3:dup             
		//    2    4:ldc1            #9   <Class UpdateDisplayState$AnswerMap>
		//    3    6:invokevirtual   #27  <Method ClassLoader Class.getClassLoader()>
		//    4    9:invokespecial   #30  <Method void Bundle(ClassLoader)>
		//    5   12:astore_2        
			UpdateDisplayState.AnswerMap answermap = new UpdateDisplayState.AnswerMap();
		//    6   13:new             #9   <Class UpdateDisplayState$AnswerMap>
		//    7   16:dup             
		//    8   17:invokespecial   #31  <Method void UpdateDisplayState$AnswerMap()>
		//    9   20:astore_3        
			bundle.readFromParcel(parcel);
		//   10   21:aload_2         
		//   11   22:aload_1         
		//   12   23:invokevirtual   #35  <Method void Bundle.readFromParcel(Parcel)>
			String s;
			for(parcel = ((Parcel) (bundle.keySet().iterator())); ((Iterator) (parcel)).hasNext(); answermap.a(Integer.valueOf(s), bundle.getString(s)))
		//*  13   26:aload_2         
		//*  14   27:invokevirtual   #39  <Method Set Bundle.keySet()>
		//*  15   30:invokeinterface #45  <Method Iterator Set.iterator()>
		//*  16   35:astore_1        
		//*  17   36:aload_1         
		//*  18   37:invokeinterface #51  <Method boolean Iterator.hasNext()>
		//*  19   42:ifeq            74
				s = (String)((Iterator) (parcel)).next();
		//   20   45:aload_1         
		//   21   46:invokeinterface #55  <Method Object Iterator.next()>
		//   22   51:checkcast       #57  <Class String>
		//   23   54:astore          4

		//   24   56:aload_3         
		//   25   57:aload           4
		//   26   59:invokestatic    #63  <Method Integer Integer.valueOf(String)>
		//   27   62:aload_2         
		//   28   63:aload           4
		//   29   65:invokevirtual   #67  <Method String Bundle.getString(String)>
		//   30   68:invokevirtual   #70  <Method void UpdateDisplayState$AnswerMap.a(Integer, String)>
		//*  31   71:goto            36
			return answermap;
		//   32   74:aload_3         
		//   33   75:areturn         
		}

		public UpdateDisplayState.AnswerMap[] a(int i)
		{
			return new UpdateDisplayState.AnswerMap[i];
		//    0    0:iload_1         
		//    1    1:anewarray       UpdateDisplayState.AnswerMap[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #75  <Method UpdateDisplayState$AnswerMap a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #79  <Method UpdateDisplayState$AnswerMap[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private final HashMap a = new HashMap();

	static 
	{
	//    0    0:new             #11  <Class UpdateDisplayState$AnswerMap$1>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void UpdateDisplayState$AnswerMap$1()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public UpdateDisplayState$AnswerMap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #31  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void HashMap()>
	//    6   12:putfield        #34  <Field HashMap a>
	//    7   15:return          
	}
}

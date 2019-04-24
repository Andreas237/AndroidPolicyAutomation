// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			UpdateDisplayState

static final class UpdateDisplayState$AnswerMap$1
	implements android.os.Parcelable.Creator
{

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

	UpdateDisplayState$AnswerMap$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}

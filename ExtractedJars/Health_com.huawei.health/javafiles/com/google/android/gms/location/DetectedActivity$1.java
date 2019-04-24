// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.location:
//			DetectedActivity

final class DetectedActivity$1
	implements Comparator
{

	public int compare(Object obj, Object obj1)
	{
		return zza((DetectedActivity)obj, (DetectedActivity)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class DetectedActivity>
	//    3    5:aload_2         
	//    4    6:checkcast       #9   <Class DetectedActivity>
	//    5    9:invokevirtual   #20  <Method int zza(DetectedActivity, DetectedActivity)>
	//    6   12:ireturn         
	}

	public int zza(DetectedActivity detectedactivity, DetectedActivity detectedactivity1)
	{
		int i = Integer.valueOf(detectedactivity1.getConfidence()).compareTo(Integer.valueOf(detectedactivity.getConfidence()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #24  <Method int DetectedActivity.getConfidence()>
	//    2    4:invokestatic    #30  <Method Integer Integer.valueOf(int)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #24  <Method int DetectedActivity.getConfidence()>
	//    5   11:invokestatic    #30  <Method Integer Integer.valueOf(int)>
	//    6   14:invokevirtual   #34  <Method int Integer.compareTo(Integer)>
	//    7   17:istore_3        
		if(i == 0)
	//*   8   18:iload_3         
	//*   9   19:ifne            40
			return Integer.valueOf(detectedactivity.getType()).compareTo(Integer.valueOf(detectedactivity1.getType()));
	//   10   22:aload_1         
	//   11   23:invokevirtual   #37  <Method int DetectedActivity.getType()>
	//   12   26:invokestatic    #30  <Method Integer Integer.valueOf(int)>
	//   13   29:aload_2         
	//   14   30:invokevirtual   #37  <Method int DetectedActivity.getType()>
	//   15   33:invokestatic    #30  <Method Integer Integer.valueOf(int)>
	//   16   36:invokevirtual   #34  <Method int Integer.compareTo(Integer)>
	//   17   39:ireturn         
		else
			return i;
	//   18   40:iload_3         
	//   19   41:ireturn         
	}

	DetectedActivity$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}

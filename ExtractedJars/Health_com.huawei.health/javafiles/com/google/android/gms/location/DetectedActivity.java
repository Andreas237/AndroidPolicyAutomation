// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import java.util.Comparator;

// Referenced classes of package com.google.android.gms.location:
//			zzh

public class DetectedActivity extends zza
{

	public DetectedActivity(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void zza()>
		zzbjB = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #55  <Field int zzbjB>
		zzbjC = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #57  <Field int zzbjC>
	//    8   14:return          
	}

	private int zzke(int i)
	{
		if(i > 15)
	//*   0    0:iload_1         
	//*   1    1:bipush          15
	//*   2    3:icmple          8
			return 4;
	//    3    6:iconst_4        
	//    4    7:ireturn         
		else
			return i;
	//    5    8:iload_1         
	//    6    9:ireturn         
	}

	public static String zzkf(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 8: default 52
	//	               0 55
	//	               1 58
	//	               2 61
	//	               3 64
	//	               4 67
	//	               5 70
	//	               6 79
	//	               7 73
	//	               8 76
	//*   2   52:goto            79
		case 0: // '\0'
			return "IN_VEHICLE";
	//    3   55:ldc1            #62  <String "IN_VEHICLE">
	//    4   57:areturn         

		case 1: // '\001'
			return "ON_BICYCLE";
	//    5   58:ldc1            #63  <String "ON_BICYCLE">
	//    6   60:areturn         

		case 2: // '\002'
			return "ON_FOOT";
	//    7   61:ldc1            #64  <String "ON_FOOT">
	//    8   63:areturn         

		case 3: // '\003'
			return "STILL";
	//    9   64:ldc1            #65  <String "STILL">
	//   10   66:areturn         

		case 4: // '\004'
			return "UNKNOWN";
	//   11   67:ldc1            #66  <String "UNKNOWN">
	//   12   69:areturn         

		case 5: // '\005'
			return "TILTING";
	//   13   70:ldc1            #67  <String "TILTING">
	//   14   72:areturn         

		case 7: // '\007'
			return "WALKING";
	//   15   73:ldc1            #68  <String "WALKING">
	//   16   75:areturn         

		case 8: // '\b'
			return "RUNNING";
	//   17   76:ldc1            #69  <String "RUNNING">
	//   18   78:areturn         
		}
		return Integer.toString(i);
	//   19   79:iload_0         
	//   20   80:invokestatic    #74  <Method String Integer.toString(int)>
	//   21   83:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null || ((Object)this).getClass() != obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #82  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #82  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		obj = ((Object) ((DetectedActivity)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class DetectedActivity>
	//   16   28:astore_1        
		return zzbjB == ((DetectedActivity) (obj)).zzbjB && zzbjC == ((DetectedActivity) (obj)).zzbjC;
	//   17   29:aload_0         
	//   18   30:getfield        #55  <Field int zzbjB>
	//   19   33:aload_1         
	//   20   34:getfield        #55  <Field int zzbjB>
	//   21   37:icmpne          53
	//   22   40:aload_0         
	//   23   41:getfield        #57  <Field int zzbjC>
	//   24   44:aload_1         
	//   25   45:getfield        #57  <Field int zzbjC>
	//   26   48:icmpne          53
	//   27   51:iconst_1        
	//   28   52:ireturn         
	//   29   53:iconst_0        
	//   30   54:ireturn         
	}

	public int getConfidence()
	{
		return zzbjC;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int zzbjC>
	//    2    4:ireturn         
	}

	public int getType()
	{
		return zzke(zzbjB);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #55  <Field int zzbjB>
	//    3    5:invokespecial   #87  <Method int zzke(int)>
	//    4    8:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			Integer.valueOf(zzbjB), Integer.valueOf(zzbjC)
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #55  <Field int zzbjB>
	//    6   10:invokestatic    #92  <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #57  <Field int zzbjC>
	//   12   20:invokestatic    #92  <Method Integer Integer.valueOf(int)>
	//   13   23:aastore         
	//   14   24:invokestatic    #97  <Method int zzaa.hashCode(Object[])>
	//   15   27:ireturn         
	}

	public String toString()
	{
		String s = String.valueOf(((Object) (zzkf(getType()))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method int getType()>
	//    2    4:invokestatic    #102 <Method String zzkf(int)>
	//    3    7:invokestatic    #107 <Method String String.valueOf(Object)>
	//    4   10:astore_2        
		int i = zzbjC;
	//    5   11:aload_0         
	//    6   12:getfield        #57  <Field int zzbjC>
	//    7   15:istore_1        
		return (new StringBuilder(String.valueOf(((Object) (s))).length() + 48)).append("DetectedActivity [type=").append(s).append(", confidence=").append(i).append("]").toString();
	//    8   16:new             #109 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:aload_2         
	//   11   21:invokestatic    #107 <Method String String.valueOf(Object)>
	//   12   24:invokevirtual   #112 <Method int String.length()>
	//   13   27:bipush          48
	//   14   29:iadd            
	//   15   30:invokespecial   #115 <Method void StringBuilder(int)>
	//   16   33:ldc1            #117 <String "DetectedActivity [type=">
	//   17   35:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:aload_2         
	//   19   39:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   20   42:ldc1            #123 <String ", confidence=">
	//   21   44:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   22   47:iload_1         
	//   23   48:invokevirtual   #126 <Method StringBuilder StringBuilder.append(int)>
	//   24   51:ldc1            #128 <String "]">
	//   25   53:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   27   59:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.location.zzh.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #136 <Method void com.google.android.gms.location.zzh.zza(DetectedActivity, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzh();
	public static final int IN_VEHICLE = 0;
	public static final int ON_BICYCLE = 1;
	public static final int ON_FOOT = 2;
	public static final int RUNNING = 8;
	public static final int STILL = 3;
	public static final int TILTING = 5;
	public static final int UNKNOWN = 4;
	public static final int WALKING = 7;
	public static final int zzbjA[] = {
		0, 1, 2, 4, 5, 6, 7, 8, 10, 11, 
		12, 13, 14
	};
	public static final Comparator zzbjy = new Comparator() {

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

	}
;
	public static final int zzbjz[] = {
		9, 10
	};
	int zzbjB;
	int zzbjC;

	static 
	{
	//    0    0:new             #6   <Class DetectedActivity$1>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void DetectedActivity$1()>
	//    3    7:putstatic       #41  <Field Comparator zzbjy>
	//    4   10:iconst_2        
	//    5   11:newarray        int[]
	//    6   13:dup             
	//    7   14:iconst_0        
	//    8   15:bipush          9
	//    9   17:iastore         
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:bipush          10
	//   13   22:iastore         
	//   14   23:putstatic       #43  <Field int[] zzbjz>
	//   15   26:bipush          13
	//   16   28:newarray        int[]
	//   17   30:dup             
	//   18   31:iconst_0        
	//   19   32:iconst_0        
	//   20   33:iastore         
	//   21   34:dup             
	//   22   35:iconst_1        
	//   23   36:iconst_1        
	//   24   37:iastore         
	//   25   38:dup             
	//   26   39:iconst_2        
	//   27   40:iconst_2        
	//   28   41:iastore         
	//   29   42:dup             
	//   30   43:iconst_3        
	//   31   44:iconst_4        
	//   32   45:iastore         
	//   33   46:dup             
	//   34   47:iconst_4        
	//   35   48:iconst_5        
	//   36   49:iastore         
	//   37   50:dup             
	//   38   51:iconst_5        
	//   39   52:bipush          6
	//   40   54:iastore         
	//   41   55:dup             
	//   42   56:bipush          6
	//   43   58:bipush          7
	//   44   60:iastore         
	//   45   61:dup             
	//   46   62:bipush          7
	//   47   64:bipush          8
	//   48   66:iastore         
	//   49   67:dup             
	//   50   68:bipush          8
	//   51   70:bipush          10
	//   52   72:iastore         
	//   53   73:dup             
	//   54   74:bipush          9
	//   55   76:bipush          11
	//   56   78:iastore         
	//   57   79:dup             
	//   58   80:bipush          10
	//   59   82:bipush          12
	//   60   84:iastore         
	//   61   85:dup             
	//   62   86:bipush          11
	//   63   88:bipush          13
	//   64   90:iastore         
	//   65   91:dup             
	//   66   92:bipush          12
	//   67   94:bipush          14
	//   68   96:iastore         
	//   69   97:putstatic       #45  <Field int[] zzbjA>
	//   70  100:new             #47  <Class zzh>
	//   71  103:dup             
	//   72  104:invokespecial   #48  <Method void zzh()>
	//   73  107:putstatic       #50  <Field android.os.Parcelable$Creator CREATOR>
	//*  74  110:return          
	}
}

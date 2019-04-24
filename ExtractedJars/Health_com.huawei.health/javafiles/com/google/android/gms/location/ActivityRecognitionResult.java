// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzd;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import java.util.*;

// Referenced classes of package com.google.android.gms.location:
//			zzc, DetectedActivity

public class ActivityRecognitionResult extends zza
	implements ReflectedParcelable
{

	public ActivityRecognitionResult(DetectedActivity detectedactivity, long l, long l1)
	{
		this(detectedactivity, l, l1, 0, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:iconst_0        
	//    5    6:aconst_null     
	//    6    7:invokespecial   #33  <Method void ActivityRecognitionResult(DetectedActivity, long, long, int, Bundle)>
	//    7   10:return          
	}

	public ActivityRecognitionResult(DetectedActivity detectedactivity, long l, long l1, int i, Bundle bundle)
	{
		this(Collections.singletonList(((Object) (detectedactivity))), l, l1, i, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #39  <Method List Collections.singletonList(Object)>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:iload           6
	//    6   10:aload           7
	//    7   12:invokespecial   #42  <Method void ActivityRecognitionResult(List, long, long, int, Bundle)>
	//    8   15:return          
	}

	public ActivityRecognitionResult(List list, long l, long l1)
	{
		this(list, l, l1, 0, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:iconst_0        
	//    5    6:aconst_null     
	//    6    7:invokespecial   #42  <Method void ActivityRecognitionResult(List, long, long, int, Bundle)>
	//    7   10:return          
	}

	public ActivityRecognitionResult(List list, long l, long l1, int i, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void zza()>
		boolean flag;
		if(list != null && list.size() > 0)
	//*   2    4:aload_1         
	//*   3    5:ifnull          23
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #52  <Method int List.size()>
	//*   6   14:ifle            23
			flag = true;
	//    7   17:iconst_1        
	//    8   18:istore          8
		else
	//*   9   20:goto            26
			flag = false;
	//   10   23:iconst_0        
	//   11   24:istore          8
		zzac.zzb(flag, "Must have at least 1 detected activity");
	//   12   26:iload           8
	//   13   28:ldc1            #54  <String "Must have at least 1 detected activity">
	//   14   30:invokestatic    #60  <Method void zzac.zzb(boolean, Object)>
		if(l > 0L && l1 > 0L)
	//*  15   33:lload_2         
	//*  16   34:lconst_0        
	//*  17   35:lcmp            
	//*  18   36:ifle            52
	//*  19   39:lload           4
	//*  20   41:lconst_0        
	//*  21   42:lcmp            
	//*  22   43:ifle            52
			flag = true;
	//   23   46:iconst_1        
	//   24   47:istore          8
		else
	//*  25   49:goto            55
			flag = false;
	//   26   52:iconst_0        
	//   27   53:istore          8
		zzac.zzb(flag, "Must set times");
	//   28   55:iload           8
	//   29   57:ldc1            #62  <String "Must set times">
	//   30   59:invokestatic    #60  <Method void zzac.zzb(boolean, Object)>
		zzbjq = list;
	//   31   62:aload_0         
	//   32   63:aload_1         
	//   33   64:putfield        #64  <Field List zzbjq>
		zzbjr = l;
	//   34   67:aload_0         
	//   35   68:lload_2         
	//   36   69:putfield        #66  <Field long zzbjr>
		zzbjs = l1;
	//   37   72:aload_0         
	//   38   73:lload           4
	//   39   75:putfield        #68  <Field long zzbjs>
		zzbjt = i;
	//   40   78:aload_0         
	//   41   79:iload           6
	//   42   81:putfield        #70  <Field int zzbjt>
		extras = bundle;
	//   43   84:aload_0         
	//   44   85:aload           7
	//   45   87:putfield        #72  <Field Bundle extras>
	//   46   90:return          
	}

	public static ActivityRecognitionResult extractResult(Intent intent)
	{
		ActivityRecognitionResult activityrecognitionresult = zzu(intent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #78  <Method ActivityRecognitionResult zzu(Intent)>
	//    2    4:astore_1        
		if(activityrecognitionresult != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return activityrecognitionresult;
	//    5    9:aload_1         
	//    6   10:areturn         
		intent = ((Intent) (zzw(intent)));
	//    7   11:aload_0         
	//    8   12:invokestatic    #82  <Method List zzw(Intent)>
	//    9   15:astore_0        
		if(intent == null || ((List) (intent)).isEmpty())
	//*  10   16:aload_0         
	//*  11   17:ifnull          29
	//*  12   20:aload_0         
	//*  13   21:invokeinterface #86  <Method boolean List.isEmpty()>
	//*  14   26:ifeq            31
			return null;
	//   15   29:aconst_null     
	//   16   30:areturn         
		else
			return (ActivityRecognitionResult)((List) (intent)).get(((List) (intent)).size() - 1);
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:invokeinterface #52  <Method int List.size()>
	//   20   38:iconst_1        
	//   21   39:isub            
	//   22   40:invokeinterface #90  <Method Object List.get(int)>
	//   23   45:checkcast       #2   <Class ActivityRecognitionResult>
	//   24   48:areturn         
	}

	public static boolean hasResult(Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(zzt(intent))
	//*   4    6:aload_0         
	//*   5    7:invokestatic    #95  <Method boolean zzt(Intent)>
	//*   6   10:ifeq            15
			return true;
	//    7   13:iconst_1        
	//    8   14:ireturn         
		intent = ((Intent) (zzw(intent)));
	//    9   15:aload_0         
	//   10   16:invokestatic    #82  <Method List zzw(Intent)>
	//   11   19:astore_0        
		return intent != null && !((List) (intent)).isEmpty();
	//   12   20:aload_0         
	//   13   21:ifnull          35
	//   14   24:aload_0         
	//   15   25:invokeinterface #86  <Method boolean List.isEmpty()>
	//   16   30:ifne            35
	//   17   33:iconst_1        
	//   18   34:ireturn         
	//   19   35:iconst_0        
	//   20   36:ireturn         
	}

	private static boolean zzc(Bundle bundle, Bundle bundle1)
	{
label0:
		{
			if(bundle == null && bundle1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       10
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       10
				return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
			if(bundle == null && bundle1 != null || bundle != null && bundle1 == null)
	//*   6   10:aload_0         
	//*   7   11:ifnonnull       18
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       26
	//*  10   18:aload_0         
	//*  11   19:ifnull          28
	//*  12   22:aload_1         
	//*  13   23:ifnonnull       28
				return false;
	//   14   26:iconst_0        
	//   15   27:ireturn         
			if(bundle.size() != bundle1.size())
	//*  16   28:aload_0         
	//*  17   29:invokevirtual   #100 <Method int Bundle.size()>
	//*  18   32:aload_1         
	//*  19   33:invokevirtual   #100 <Method int Bundle.size()>
	//*  20   36:icmpeq          41
				return false;
	//   21   39:iconst_0        
	//   22   40:ireturn         
			Iterator iterator = bundle.keySet().iterator();
	//   23   41:aload_0         
	//   24   42:invokevirtual   #104 <Method Set Bundle.keySet()>
	//   25   45:invokeinterface #110 <Method Iterator Set.iterator()>
	//   26   50:astore_2        
			String s;
label1:
			do
			{
				do
				{
					do
					{
						if(!iterator.hasNext())
							break label0;
	//   27   51:aload_2         
	//   28   52:invokeinterface #115 <Method boolean Iterator.hasNext()>
	//   29   57:ifeq            148
						s = (String)iterator.next();
	//   30   60:aload_2         
	//   31   61:invokeinterface #119 <Method Object Iterator.next()>
	//   32   66:checkcast       #121 <Class String>
	//   33   69:astore_3        
						if(!bundle1.containsKey(s))
	//*  34   70:aload_1         
	//*  35   71:aload_3         
	//*  36   72:invokevirtual   #125 <Method boolean Bundle.containsKey(String)>
	//*  37   75:ifne            80
							return false;
	//   38   78:iconst_0        
	//   39   79:ireturn         
						if(bundle.get(s) != null)
							break;
	//   40   80:aload_0         
	//   41   81:aload_3         
	//   42   82:invokevirtual   #128 <Method Object Bundle.get(String)>
	//   43   85:ifnonnull       98
						if(bundle1.get(s) != null)
	//*  44   88:aload_1         
	//*  45   89:aload_3         
	//*  46   90:invokevirtual   #128 <Method Object Bundle.get(String)>
	//*  47   93:ifnull          145
							return false;
	//   48   96:iconst_0        
	//   49   97:ireturn         
					} while(true);
					if(!(bundle.get(s) instanceof Bundle))
						continue label1;
	//   50   98:aload_0         
	//   51   99:aload_3         
	//   52  100:invokevirtual   #128 <Method Object Bundle.get(String)>
	//   53  103:instanceof      #99  <Class Bundle>
	//   54  106:ifeq            127
				} while(zzc(bundle.getBundle(s), bundle1.getBundle(s)));
	//   55  109:aload_0         
	//   56  110:aload_3         
	//   57  111:invokevirtual   #132 <Method Bundle Bundle.getBundle(String)>
	//   58  114:aload_1         
	//   59  115:aload_3         
	//   60  116:invokevirtual   #132 <Method Bundle Bundle.getBundle(String)>
	//   61  119:invokestatic    #134 <Method boolean zzc(Bundle, Bundle)>
	//   62  122:ifne            145
				return false;
	//   63  125:iconst_0        
	//   64  126:ireturn         
			} while(bundle.get(s).equals(bundle1.get(s)));
	//   65  127:aload_0         
	//   66  128:aload_3         
	//   67  129:invokevirtual   #128 <Method Object Bundle.get(String)>
	//   68  132:aload_1         
	//   69  133:aload_3         
	//   70  134:invokevirtual   #128 <Method Object Bundle.get(String)>
	//   71  137:invokevirtual   #140 <Method boolean Object.equals(Object)>
	//   72  140:ifne            145
			return false;
	//   73  143:iconst_0        
	//   74  144:ireturn         
		}
	//*  75  145:goto            51
		return true;
	//   76  148:iconst_1        
	//   77  149:ireturn         
	}

	private static boolean zzt(Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
	//    4    6:aload_0         
	//    5    7:ldc1            #142 <String "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT">
	//    6    9:invokevirtual   #147 <Method boolean Intent.hasExtra(String)>
	//    7   12:ireturn         
	}

	private static ActivityRecognitionResult zzu(Intent intent)
	{
		if(!hasResult(intent))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #149 <Method boolean hasResult(Intent)>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		intent = ((Intent) (intent.getExtras().get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #153 <Method Bundle Intent.getExtras()>
	//    7   13:ldc1            #142 <String "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT">
	//    8   15:invokevirtual   #128 <Method Object Bundle.get(String)>
	//    9   18:astore_0        
		if(intent instanceof byte[])
	//*  10   19:aload_0         
	//*  11   20:instanceof      #155 <Class byte[]>
	//*  12   23:ifeq            40
			return (ActivityRecognitionResult)zzd.zza((byte[])intent, CREATOR);
	//   13   26:aload_0         
	//   14   27:checkcast       #155 <Class byte[]>
	//   15   30:getstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//   16   33:invokestatic    #161 <Method com.google.android.gms.common.internal.safeparcel.SafeParcelable zzd.zza(byte[], android.os.Parcelable$Creator)>
	//   17   36:checkcast       #2   <Class ActivityRecognitionResult>
	//   18   39:areturn         
		if(intent instanceof ActivityRecognitionResult)
	//*  19   40:aload_0         
	//*  20   41:instanceof      #2   <Class ActivityRecognitionResult>
	//*  21   44:ifeq            52
			return (ActivityRecognitionResult)intent;
	//   22   47:aload_0         
	//   23   48:checkcast       #2   <Class ActivityRecognitionResult>
	//   24   51:areturn         
		else
			return null;
	//   25   52:aconst_null     
	//   26   53:areturn         
	}

	public static boolean zzv(Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST");
	//    4    6:aload_0         
	//    5    7:ldc1            #165 <String "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST">
	//    6    9:invokevirtual   #147 <Method boolean Intent.hasExtra(String)>
	//    7   12:ireturn         
	}

	public static List zzw(Intent intent)
	{
		if(!zzv(intent))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #168 <Method boolean zzv(Intent)>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return ((List) (zzd.zzb(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR)));
	//    5    9:aload_0         
	//    6   10:ldc1            #165 <String "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST">
	//    7   12:getstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//    8   15:invokestatic    #171 <Method java.util.ArrayList zzd.zzb(Intent, String, android.os.Parcelable$Creator)>
	//    9   18:areturn         
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
	//*   8   12:invokevirtual   #177 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #177 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		obj = ((Object) ((ActivityRecognitionResult)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class ActivityRecognitionResult>
	//   16   28:astore_1        
		return zzbjr == ((ActivityRecognitionResult) (obj)).zzbjr && zzbjs == ((ActivityRecognitionResult) (obj)).zzbjs && zzbjt == ((ActivityRecognitionResult) (obj)).zzbjt && zzaa.equal(((Object) (zzbjq)), ((Object) (((ActivityRecognitionResult) (obj)).zzbjq))) && zzc(extras, ((ActivityRecognitionResult) (obj)).extras);
	//   17   29:aload_0         
	//   18   30:getfield        #66  <Field long zzbjr>
	//   19   33:aload_1         
	//   20   34:getfield        #66  <Field long zzbjr>
	//   21   37:lcmp            
	//   22   38:ifne            94
	//   23   41:aload_0         
	//   24   42:getfield        #68  <Field long zzbjs>
	//   25   45:aload_1         
	//   26   46:getfield        #68  <Field long zzbjs>
	//   27   49:lcmp            
	//   28   50:ifne            94
	//   29   53:aload_0         
	//   30   54:getfield        #70  <Field int zzbjt>
	//   31   57:aload_1         
	//   32   58:getfield        #70  <Field int zzbjt>
	//   33   61:icmpne          94
	//   34   64:aload_0         
	//   35   65:getfield        #64  <Field List zzbjq>
	//   36   68:aload_1         
	//   37   69:getfield        #64  <Field List zzbjq>
	//   38   72:invokestatic    #183 <Method boolean zzaa.equal(Object, Object)>
	//   39   75:ifeq            94
	//   40   78:aload_0         
	//   41   79:getfield        #72  <Field Bundle extras>
	//   42   82:aload_1         
	//   43   83:getfield        #72  <Field Bundle extras>
	//   44   86:invokestatic    #134 <Method boolean zzc(Bundle, Bundle)>
	//   45   89:ifeq            94
	//   46   92:iconst_1        
	//   47   93:ireturn         
	//   48   94:iconst_0        
	//   49   95:ireturn         
	}

	public int getActivityConfidence(int i)
	{
		for(Iterator iterator = zzbjq.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field List zzbjq>
	//*   2    4:invokeinterface #186 <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #115 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            45
		{
			DetectedActivity detectedactivity = (DetectedActivity)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #119 <Method Object Iterator.next()>
	//    9   25:checkcast       #188 <Class DetectedActivity>
	//   10   28:astore_3        
			if(detectedactivity.getType() == i)
	//*  11   29:aload_3         
	//*  12   30:invokevirtual   #191 <Method int DetectedActivity.getType()>
	//*  13   33:iload_1         
	//*  14   34:icmpne          42
				return detectedactivity.getConfidence();
	//   15   37:aload_3         
	//   16   38:invokevirtual   #194 <Method int DetectedActivity.getConfidence()>
	//   17   41:ireturn         
		}

	//*  18   42:goto            10
		return 0;
	//   19   45:iconst_0        
	//   20   46:ireturn         
	}

	public long getElapsedRealtimeMillis()
	{
		return zzbjs;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field long zzbjs>
	//    2    4:lreturn         
	}

	public DetectedActivity getMostProbableActivity()
	{
		return (DetectedActivity)zzbjq.get(0);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field List zzbjq>
	//    2    4:iconst_0        
	//    3    5:invokeinterface #90  <Method Object List.get(int)>
	//    4   10:checkcast       #188 <Class DetectedActivity>
	//    5   13:areturn         
	}

	public List getProbableActivities()
	{
		return zzbjq;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field List zzbjq>
	//    2    4:areturn         
	}

	public long getTime()
	{
		return zzbjr;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field long zzbjr>
	//    2    4:lreturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			Long.valueOf(zzbjr), Long.valueOf(zzbjs), Integer.valueOf(zzbjt), zzbjq, extras
		});
	//    0    0:iconst_5        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #66  <Field long zzbjr>
	//    6   10:invokestatic    #209 <Method Long Long.valueOf(long)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #68  <Field long zzbjs>
	//   12   20:invokestatic    #209 <Method Long Long.valueOf(long)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #70  <Field int zzbjt>
	//   18   30:invokestatic    #214 <Method Integer Integer.valueOf(int)>
	//   19   33:aastore         
	//   20   34:dup             
	//   21   35:iconst_3        
	//   22   36:aload_0         
	//   23   37:getfield        #64  <Field List zzbjq>
	//   24   40:aastore         
	//   25   41:dup             
	//   26   42:iconst_4        
	//   27   43:aload_0         
	//   28   44:getfield        #72  <Field Bundle extras>
	//   29   47:aastore         
	//   30   48:invokestatic    #217 <Method int zzaa.hashCode(Object[])>
	//   31   51:ireturn         
	}

	public String toString()
	{
		String s = String.valueOf(((Object) (zzbjq)));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field List zzbjq>
	//    2    4:invokestatic    #222 <Method String String.valueOf(Object)>
	//    3    7:astore          5
		long l = zzbjr;
	//    4    9:aload_0         
	//    5   10:getfield        #66  <Field long zzbjr>
	//    6   13:lstore_1        
		long l1 = zzbjs;
	//    7   14:aload_0         
	//    8   15:getfield        #68  <Field long zzbjs>
	//    9   18:lstore_3        
		return (new StringBuilder(String.valueOf(((Object) (s))).length() + 124)).append("ActivityRecognitionResult [probableActivities=").append(s).append(", timeMillis=").append(l).append(", elapsedRealtimeMillis=").append(l1).append("]").toString();
	//   10   19:new             #224 <Class StringBuilder>
	//   11   22:dup             
	//   12   23:aload           5
	//   13   25:invokestatic    #222 <Method String String.valueOf(Object)>
	//   14   28:invokevirtual   #227 <Method int String.length()>
	//   15   31:bipush          124
	//   16   33:iadd            
	//   17   34:invokespecial   #230 <Method void StringBuilder(int)>
	//   18   37:ldc1            #232 <String "ActivityRecognitionResult [probableActivities=">
	//   19   39:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   20   42:aload           5
	//   21   44:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   22   47:ldc1            #238 <String ", timeMillis=">
	//   23   49:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   24   52:lload_1         
	//   25   53:invokevirtual   #241 <Method StringBuilder StringBuilder.append(long)>
	//   26   56:ldc1            #243 <String ", elapsedRealtimeMillis=">
	//   27   58:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   28   61:lload_3         
	//   29   62:invokevirtual   #241 <Method StringBuilder StringBuilder.append(long)>
	//   30   65:ldc1            #245 <String "]">
	//   31   67:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   32   70:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   33   73:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.location.zzc.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #252 <Method void com.google.android.gms.location.zzc.zza(ActivityRecognitionResult, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzc();
	Bundle extras;
	List zzbjq;
	long zzbjr;
	long zzbjs;
	int zzbjt;

	static 
	{
	//    0    0:new             #23  <Class zzc>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void zzc()>
	//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}

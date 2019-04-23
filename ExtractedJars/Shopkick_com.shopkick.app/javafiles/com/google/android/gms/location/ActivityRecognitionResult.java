// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.common.internal.safeparcel.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.location:
//			zzb, DetectedActivity

public class ActivityRecognitionResult extends AbstractSafeParcelable
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
	//    6    7:invokespecial   #47  <Method void ActivityRecognitionResult(DetectedActivity, long, long, int, Bundle)>
	//    7   10:return          
	}

	private ActivityRecognitionResult(DetectedActivity detectedactivity, long l, long l1, int i, Bundle bundle)
	{
		this(Collections.singletonList(((Object) (detectedactivity))), l, l1, 0, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #54  <Method List Collections.singletonList(Object)>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:iconst_0        
	//    6    9:aconst_null     
	//    7   10:invokespecial   #57  <Method void ActivityRecognitionResult(List, long, long, int, Bundle)>
	//    8   13:return          
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
	//    6    7:invokespecial   #57  <Method void ActivityRecognitionResult(List, long, long, int, Bundle)>
	//    7   10:return          
	}

	public ActivityRecognitionResult(List list, long l, long l1, int i, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void AbstractSafeParcelable()>
		boolean flag1 = true;
	//    2    4:iconst_1        
	//    3    5:istore          9
		boolean flag;
		if(list != null && list.size() > 0)
	//*   4    7:aload_1         
	//*   5    8:ifnull          26
	//*   6   11:aload_1         
	//*   7   12:invokeinterface #69  <Method int List.size()>
	//*   8   17:ifle            26
			flag = true;
	//    9   20:iconst_1        
	//   10   21:istore          8
		else
	//*  11   23:goto            29
			flag = false;
	//   12   26:iconst_0        
	//   13   27:istore          8
		Preconditions.checkArgument(flag, "Must have at least 1 detected activity");
	//   14   29:iload           8
	//   15   31:ldc1            #71  <String "Must have at least 1 detected activity">
	//   16   33:invokestatic    #77  <Method void Preconditions.checkArgument(boolean, Object)>
		if(l > 0L && l1 > 0L)
	//*  17   36:lload_2         
	//*  18   37:lconst_0        
	//*  19   38:lcmp            
	//*  20   39:ifle            56
	//*  21   42:lload           4
	//*  22   44:lconst_0        
	//*  23   45:lcmp            
	//*  24   46:ifle            56
			flag = flag1;
	//   25   49:iload           9
	//   26   51:istore          8
		else
	//*  27   53:goto            59
			flag = false;
	//   28   56:iconst_0        
	//   29   57:istore          8
		Preconditions.checkArgument(flag, "Must set times");
	//   30   59:iload           8
	//   31   61:ldc1            #79  <String "Must set times">
	//   32   63:invokestatic    #77  <Method void Preconditions.checkArgument(boolean, Object)>
		zze = list;
	//   33   66:aload_0         
	//   34   67:aload_1         
	//   35   68:putfield        #81  <Field List zze>
		zzf = l;
	//   36   71:aload_0         
	//   37   72:lload_2         
	//   38   73:putfield        #83  <Field long zzf>
		zzg = l1;
	//   39   76:aload_0         
	//   40   77:lload           4
	//   41   79:putfield        #85  <Field long zzg>
		zzh = i;
	//   42   82:aload_0         
	//   43   83:iload           6
	//   44   85:putfield        #87  <Field int zzh>
		extras = bundle;
	//   45   88:aload_0         
	//   46   89:aload           7
	//   47   91:putfield        #89  <Field Bundle extras>
	//   48   94:return          
	}

	public static ActivityRecognitionResult extractResult(Intent intent)
	{
		if(!hasResult(intent)) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokestatic    #97  <Method boolean hasResult(Intent)>
	//    2    4:ifeq            53
_L1:
		Object obj = intent.getExtras().get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
	//    3    7:aload_0         
	//    4    8:invokevirtual   #103 <Method Bundle Intent.getExtras()>
	//    5   11:ldc1            #105 <String "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT">
	//    6   13:invokevirtual   #111 <Method Object Bundle.get(String)>
	//    7   16:astore_1        
		if(!(obj instanceof byte[])) goto _L4; else goto _L3
	//    8   17:aload_1         
	//    9   18:instanceof      #113 <Class byte[]>
	//   10   21:ifeq            43
_L3:
		obj = ((Object) (SafeParcelableSerializer.deserializeFromBytes((byte[])obj, CREATOR)));
	//   11   24:aload_1         
	//   12   25:checkcast       #113 <Class byte[]>
	//   13   28:getstatic       #41  <Field android.os.Parcelable$Creator CREATOR>
	//   14   31:invokestatic    #119 <Method com.google.android.gms.common.internal.safeparcel.SafeParcelable SafeParcelableSerializer.deserializeFromBytes(byte[], android.os.Parcelable$Creator)>
	//   15   34:astore_1        
_L6:
		obj = ((Object) ((ActivityRecognitionResult)obj));
	//   16   35:aload_1         
	//   17   36:checkcast       #2   <Class ActivityRecognitionResult>
	//   18   39:astore_1        
		break; /* Loop/switch isn't completed */
	//   19   40:goto            55
_L4:
		if(obj instanceof ActivityRecognitionResult)
	//*  20   43:aload_1         
	//*  21   44:instanceof      #2   <Class ActivityRecognitionResult>
	//*  22   47:ifeq            53
			continue; /* Loop/switch isn't completed */
	//   23   50:goto            35
_L2:
		obj = null;
	//   24   53:aconst_null     
	//   25   54:astore_1        
		break; /* Loop/switch isn't completed */
		if(true) goto _L6; else goto _L5
_L5:
		if(obj != null)
	//*  26   55:aload_1         
	//*  27   56:ifnull          61
			return ((ActivityRecognitionResult) (obj));
	//   28   59:aload_1         
	//   29   60:areturn         
		intent = ((Intent) (zza(intent)));
	//   30   61:aload_0         
	//   31   62:invokestatic    #123 <Method List zza(Intent)>
	//   32   65:astore_0        
		if(intent != null)
	//*  33   66:aload_0         
	//*  34   67:ifnull          99
		{
			if(((List) (intent)).isEmpty())
	//*  35   70:aload_0         
	//*  36   71:invokeinterface #127 <Method boolean List.isEmpty()>
	//*  37   76:ifeq            81
				return null;
	//   38   79:aconst_null     
	//   39   80:areturn         
			else
				return (ActivityRecognitionResult)((List) (intent)).get(((List) (intent)).size() - 1);
	//   40   81:aload_0         
	//   41   82:aload_0         
	//   42   83:invokeinterface #69  <Method int List.size()>
	//   43   88:iconst_1        
	//   44   89:isub            
	//   45   90:invokeinterface #130 <Method Object List.get(int)>
	//   46   95:checkcast       #2   <Class ActivityRecognitionResult>
	//   47   98:areturn         
		} else
		{
			return null;
	//   48   99:aconst_null     
	//   49  100:areturn         
		}
	}

	public static boolean hasResult(Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		boolean flag;
		if(intent == null)
	//*   4    6:aload_0         
	//*   5    7:ifnonnull       15
			flag = false;
	//    6   10:iconst_0        
	//    7   11:istore_1        
		else
	//*   8   12:goto            22
			flag = intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
	//    9   15:aload_0         
	//   10   16:ldc1            #105 <String "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT">
	//   11   18:invokevirtual   #134 <Method boolean Intent.hasExtra(String)>
	//   12   21:istore_1        
		if(flag)
	//*  13   22:iload_1         
	//*  14   23:ifeq            28
			return true;
	//   15   26:iconst_1        
	//   16   27:ireturn         
		intent = ((Intent) (zza(intent)));
	//   17   28:aload_0         
	//   18   29:invokestatic    #123 <Method List zza(Intent)>
	//   19   32:astore_0        
		return intent != null && !((List) (intent)).isEmpty();
	//   20   33:aload_0         
	//   21   34:ifnull          48
	//   22   37:aload_0         
	//   23   38:invokeinterface #127 <Method boolean List.isEmpty()>
	//   24   43:ifne            48
	//   25   46:iconst_1        
	//   26   47:ireturn         
	//   27   48:iconst_0        
	//   28   49:ireturn         
	}

	private static List zza(Intent intent)
	{
		boolean flag;
		if(intent == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       9
			flag = false;
	//    2    4:iconst_0        
	//    3    5:istore_1        
		else
	//*   4    6:goto            16
			flag = intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST");
	//    5    9:aload_0         
	//    6   10:ldc1            #137 <String "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST">
	//    7   12:invokevirtual   #134 <Method boolean Intent.hasExtra(String)>
	//    8   15:istore_1        
		if(!flag)
	//*   9   16:iload_1         
	//*  10   17:ifne            22
			return null;
	//   11   20:aconst_null     
	//   12   21:areturn         
		else
			return ((List) (SafeParcelableSerializer.deserializeIterableFromIntentExtra(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR)));
	//   13   22:aload_0         
	//   14   23:ldc1            #137 <String "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST">
	//   15   25:getstatic       #41  <Field android.os.Parcelable$Creator CREATOR>
	//   16   28:invokestatic    #141 <Method java.util.ArrayList SafeParcelableSerializer.deserializeIterableFromIntentExtra(Intent, String, android.os.Parcelable$Creator)>
	//   17   31:areturn         
	}

	private static boolean zza(Bundle bundle, Bundle bundle1)
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
	//*  17   29:invokevirtual   #144 <Method int Bundle.size()>
	//*  18   32:aload_1         
	//*  19   33:invokevirtual   #144 <Method int Bundle.size()>
	//*  20   36:icmpeq          41
				return false;
	//   21   39:iconst_0        
	//   22   40:ireturn         
			Iterator iterator = bundle.keySet().iterator();
	//   23   41:aload_0         
	//   24   42:invokevirtual   #148 <Method Set Bundle.keySet()>
	//   25   45:invokeinterface #154 <Method Iterator Set.iterator()>
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
	//   28   52:invokeinterface #159 <Method boolean Iterator.hasNext()>
	//   29   57:ifeq            145
						s = (String)iterator.next();
	//   30   60:aload_2         
	//   31   61:invokeinterface #163 <Method Object Iterator.next()>
	//   32   66:checkcast       #165 <Class String>
	//   33   69:astore_3        
						if(!bundle1.containsKey(s))
	//*  34   70:aload_1         
	//*  35   71:aload_3         
	//*  36   72:invokevirtual   #168 <Method boolean Bundle.containsKey(String)>
	//*  37   75:ifne            80
							return false;
	//   38   78:iconst_0        
	//   39   79:ireturn         
						if(bundle.get(s) != null)
							break;
	//   40   80:aload_0         
	//   41   81:aload_3         
	//   42   82:invokevirtual   #111 <Method Object Bundle.get(String)>
	//   43   85:ifnonnull       98
						if(bundle1.get(s) != null)
	//*  44   88:aload_1         
	//*  45   89:aload_3         
	//*  46   90:invokevirtual   #111 <Method Object Bundle.get(String)>
	//*  47   93:ifnull          51
							return false;
	//   48   96:iconst_0        
	//   49   97:ireturn         
					} while(true);
					if(!(bundle.get(s) instanceof Bundle))
						continue label1;
	//   50   98:aload_0         
	//   51   99:aload_3         
	//   52  100:invokevirtual   #111 <Method Object Bundle.get(String)>
	//   53  103:instanceof      #107 <Class Bundle>
	//   54  106:ifeq            127
				} while(zza(bundle.getBundle(s), bundle1.getBundle(s)));
	//   55  109:aload_0         
	//   56  110:aload_3         
	//   57  111:invokevirtual   #172 <Method Bundle Bundle.getBundle(String)>
	//   58  114:aload_1         
	//   59  115:aload_3         
	//   60  116:invokevirtual   #172 <Method Bundle Bundle.getBundle(String)>
	//   61  119:invokestatic    #174 <Method boolean zza(Bundle, Bundle)>
	//   62  122:ifne            51
				return false;
	//   63  125:iconst_0        
	//   64  126:ireturn         
			} while(bundle.get(s).equals(bundle1.get(s)));
	//   65  127:aload_0         
	//   66  128:aload_3         
	//   67  129:invokevirtual   #111 <Method Object Bundle.get(String)>
	//   68  132:aload_1         
	//   69  133:aload_3         
	//   70  134:invokevirtual   #111 <Method Object Bundle.get(String)>
	//   71  137:invokevirtual   #180 <Method boolean Object.equals(Object)>
	//   72  140:ifne            51
			return false;
	//   73  143:iconst_0        
	//   74  144:ireturn         
		}
		return true;
	//   75  145:iconst_1        
	//   76  146:ireturn         
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
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          94
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #184 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #184 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((ActivityRecognitionResult)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class ActivityRecognitionResult>
	//   16   28:astore_1        
			if(zzf == ((ActivityRecognitionResult) (obj)).zzf && zzg == ((ActivityRecognitionResult) (obj)).zzg && zzh == ((ActivityRecognitionResult) (obj)).zzh && Objects.equal(((Object) (zze)), ((Object) (((ActivityRecognitionResult) (obj)).zze))) && zza(extras, ((ActivityRecognitionResult) (obj)).extras))
	//*  17   29:aload_0         
	//*  18   30:getfield        #83  <Field long zzf>
	//*  19   33:aload_1         
	//*  20   34:getfield        #83  <Field long zzf>
	//*  21   37:lcmp            
	//*  22   38:ifne            94
	//*  23   41:aload_0         
	//*  24   42:getfield        #85  <Field long zzg>
	//*  25   45:aload_1         
	//*  26   46:getfield        #85  <Field long zzg>
	//*  27   49:lcmp            
	//*  28   50:ifne            94
	//*  29   53:aload_0         
	//*  30   54:getfield        #87  <Field int zzh>
	//*  31   57:aload_1         
	//*  32   58:getfield        #87  <Field int zzh>
	//*  33   61:icmpne          94
	//*  34   64:aload_0         
	//*  35   65:getfield        #81  <Field List zze>
	//*  36   68:aload_1         
	//*  37   69:getfield        #81  <Field List zze>
	//*  38   72:invokestatic    #190 <Method boolean Objects.equal(Object, Object)>
	//*  39   75:ifeq            94
	//*  40   78:aload_0         
	//*  41   79:getfield        #89  <Field Bundle extras>
	//*  42   82:aload_1         
	//*  43   83:getfield        #89  <Field Bundle extras>
	//*  44   86:invokestatic    #174 <Method boolean zza(Bundle, Bundle)>
	//*  45   89:ifeq            94
				return true;
	//   46   92:iconst_1        
	//   47   93:ireturn         
		}
		return false;
	//   48   94:iconst_0        
	//   49   95:ireturn         
	}

	public int getActivityConfidence(int i)
	{
		for(Iterator iterator = zze.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field List zze>
	//*   2    4:invokeinterface #193 <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #159 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            42
		{
			DetectedActivity detectedactivity = (DetectedActivity)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #163 <Method Object Iterator.next()>
	//    9   25:checkcast       #195 <Class DetectedActivity>
	//   10   28:astore_3        
			if(detectedactivity.getType() == i)
	//*  11   29:aload_3         
	//*  12   30:invokevirtual   #198 <Method int DetectedActivity.getType()>
	//*  13   33:iload_1         
	//*  14   34:icmpne          10
				return detectedactivity.getConfidence();
	//   15   37:aload_3         
	//   16   38:invokevirtual   #201 <Method int DetectedActivity.getConfidence()>
	//   17   41:ireturn         
		}

		return 0;
	//   18   42:iconst_0        
	//   19   43:ireturn         
	}

	public long getElapsedRealtimeMillis()
	{
		return zzg;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field long zzg>
	//    2    4:lreturn         
	}

	public DetectedActivity getMostProbableActivity()
	{
		return (DetectedActivity)zze.get(0);
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field List zze>
	//    2    4:iconst_0        
	//    3    5:invokeinterface #130 <Method Object List.get(int)>
	//    4   10:checkcast       #195 <Class DetectedActivity>
	//    5   13:areturn         
	}

	public List getProbableActivities()
	{
		return zze;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field List zze>
	//    2    4:areturn         
	}

	public long getTime()
	{
		return zzf;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field long zzf>
	//    2    4:lreturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Long.valueOf(zzf), Long.valueOf(zzg), Integer.valueOf(zzh), zze, extras
		});
	//    0    0:iconst_5        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #83  <Field long zzf>
	//    6   10:invokestatic    #216 <Method Long Long.valueOf(long)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #85  <Field long zzg>
	//   12   20:invokestatic    #216 <Method Long Long.valueOf(long)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #87  <Field int zzh>
	//   18   30:invokestatic    #221 <Method Integer Integer.valueOf(int)>
	//   19   33:aastore         
	//   20   34:dup             
	//   21   35:iconst_3        
	//   22   36:aload_0         
	//   23   37:getfield        #81  <Field List zze>
	//   24   40:aastore         
	//   25   41:dup             
	//   26   42:iconst_4        
	//   27   43:aload_0         
	//   28   44:getfield        #89  <Field Bundle extras>
	//   29   47:aastore         
	//   30   48:invokestatic    #224 <Method int Objects.hashCode(Object[])>
	//   31   51:ireturn         
	}

	public String toString()
	{
		String s = String.valueOf(((Object) (zze)));
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field List zze>
	//    2    4:invokestatic    #229 <Method String String.valueOf(Object)>
	//    3    7:astore          5
		long l = zzf;
	//    4    9:aload_0         
	//    5   10:getfield        #83  <Field long zzf>
	//    6   13:lstore_1        
		long l1 = zzg;
	//    7   14:aload_0         
	//    8   15:getfield        #85  <Field long zzg>
	//    9   18:lstore_3        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 124);
	//   10   19:new             #231 <Class StringBuilder>
	//   11   22:dup             
	//   12   23:aload           5
	//   13   25:invokestatic    #229 <Method String String.valueOf(Object)>
	//   14   28:invokevirtual   #234 <Method int String.length()>
	//   15   31:bipush          124
	//   16   33:iadd            
	//   17   34:invokespecial   #237 <Method void StringBuilder(int)>
	//   18   37:astore          6
		stringbuilder.append("ActivityRecognitionResult [probableActivities=");
	//   19   39:aload           6
	//   20   41:ldc1            #239 <String "ActivityRecognitionResult [probableActivities=">
	//   21   43:invokevirtual   #243 <Method StringBuilder StringBuilder.append(String)>
	//   22   46:pop             
		stringbuilder.append(s);
	//   23   47:aload           6
	//   24   49:aload           5
	//   25   51:invokevirtual   #243 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
		stringbuilder.append(", timeMillis=");
	//   27   55:aload           6
	//   28   57:ldc1            #245 <String ", timeMillis=">
	//   29   59:invokevirtual   #243 <Method StringBuilder StringBuilder.append(String)>
	//   30   62:pop             
		stringbuilder.append(l);
	//   31   63:aload           6
	//   32   65:lload_1         
	//   33   66:invokevirtual   #248 <Method StringBuilder StringBuilder.append(long)>
	//   34   69:pop             
		stringbuilder.append(", elapsedRealtimeMillis=");
	//   35   70:aload           6
	//   36   72:ldc1            #250 <String ", elapsedRealtimeMillis=">
	//   37   74:invokevirtual   #243 <Method StringBuilder StringBuilder.append(String)>
	//   38   77:pop             
		stringbuilder.append(l1);
	//   39   78:aload           6
	//   40   80:lload_3         
	//   41   81:invokevirtual   #248 <Method StringBuilder StringBuilder.append(long)>
	//   42   84:pop             
		stringbuilder.append("]");
	//   43   85:aload           6
	//   44   87:ldc1            #252 <String "]">
	//   45   89:invokevirtual   #243 <Method StringBuilder StringBuilder.append(String)>
	//   46   92:pop             
		return stringbuilder.toString();
	//   47   93:aload           6
	//   48   95:invokevirtual   #254 <Method String StringBuilder.toString()>
	//   49   98:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #262 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeTypedList(parcel, 1, zze, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #81  <Field List zze>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #266 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeLong(parcel, 2, zzf);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #83  <Field long zzf>
	//   13   21:invokestatic    #270 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeLong(parcel, 3, zzg);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #85  <Field long zzg>
	//   18   30:invokestatic    #270 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeInt(parcel, 4, zzh);
	//   19   33:aload_1         
	//   20   34:iconst_4        
	//   21   35:aload_0         
	//   22   36:getfield        #87  <Field int zzh>
	//   23   39:invokestatic    #274 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBundle(parcel, 5, extras, false);
	//   24   42:aload_1         
	//   25   43:iconst_5        
	//   26   44:aload_0         
	//   27   45:getfield        #89  <Field Bundle extras>
	//   28   48:iconst_0        
	//   29   49:invokestatic    #278 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   30   52:aload_1         
	//   31   53:iload_2         
	//   32   54:invokestatic    #281 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   33   57:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzb();
	private Bundle extras;
	private List zze;
	private long zzf;
	private long zzg;
	private int zzh;

	static 
	{
	//    0    0:new             #36  <Class zzb>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void zzb()>
	//    3    7:putstatic       #41  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}

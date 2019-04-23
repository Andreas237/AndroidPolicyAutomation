// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.content.Context;
import android.content.Intent;
import android.content.pm.*;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.*;

// Referenced classes of package com.firebase.jobdispatcher:
//			JobValidator, JobParameters, Trigger, RetryStrategy, 
//			JobTrigger

public class DefaultJobValidator
	implements JobValidator
{

	public DefaultJobValidator(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Context context>
	//    5    9:return          
	}

	private static List addError(List list, String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return list;
	//    2    4:aload_0         
	//    3    5:areturn         
		if(list == null)
	//*   4    6:aload_0         
	//*   5    7:ifnonnull       15
		{
			return getMutableSingletonList(s);
	//    6   10:aload_1         
	//    7   11:invokestatic    #28  <Method List getMutableSingletonList(String)>
	//    8   14:areturn         
		} else
		{
			Collections.addAll(((java.util.Collection) (list)), ((Object []) (new String[] {
				s
			})));
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:anewarray       String[]
	//   12   20:dup             
	//   13   21:iconst_0        
	//   14   22:aload_1         
	//   15   23:aastore         
	//   16   24:invokestatic    #36  <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   17   27:pop             
			return list;
	//   18   28:aload_0         
	//   19   29:areturn         
		}
	}

	private static List addErrorsIf(boolean flag, List list, String s)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            10
			return addError(list, s);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #44  <Method List addError(List, String)>
	//    5    9:areturn         
		else
			return list;
	//    6   10:aload_1         
	//    7   11:areturn         
	}

	private static List getMutableSingletonList(String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #48  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void ArrayList()>
	//    3    7:astore_1        
		arraylist.add(((Object) (s)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #53  <Method boolean ArrayList.add(Object)>
	//    7   13:pop             
		return ((List) (arraylist));
	//    8   14:aload_1         
	//    9   15:areturn         
	}

	private static int measureBundleSize(Bundle bundle)
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #62  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		bundle.writeToParcel(parcel, 0);
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #68  <Method void Bundle.writeToParcel(Parcel, int)>
		int i = parcel.dataSize();
	//    6   10:aload_2         
	//    7   11:invokevirtual   #72  <Method int Parcel.dataSize()>
	//    8   14:istore_1        
		parcel.recycle();
	//    9   15:aload_2         
	//   10   16:invokevirtual   #75  <Method void Parcel.recycle()>
		return i;
	//   11   19:iload_1         
	//   12   20:ireturn         
	}

	private static List mergeErrorLists(List list, List list1)
	{
		if(list == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return list1;
	//    2    4:aload_1         
	//    3    5:areturn         
		if(list1 == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
		{
			return list;
	//    6   10:aload_0         
	//    7   11:areturn         
		} else
		{
			list.addAll(((java.util.Collection) (list1)));
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokeinterface #82  <Method boolean List.addAll(java.util.Collection)>
	//   11   19:pop             
			return list;
	//   12   20:aload_0         
	//   13   21:areturn         
		}
	}

	private static String validateExtrasType(Bundle bundle, String s)
	{
		Object obj = bundle.get(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #89  <Method Object Bundle.get(String)>
	//    3    5:astore_3        
		bundle = null;
	//    4    6:aconst_null     
	//    5    7:astore_0        
		if(obj != null && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof String))
	//*   6    8:aload_3         
	//*   7    9:ifnull          84
	//*   8   12:aload_3         
	//*   9   13:instanceof      #91  <Class Integer>
	//*  10   16:ifne            84
	//*  11   19:aload_3         
	//*  12   20:instanceof      #93  <Class Long>
	//*  13   23:ifne            84
	//*  14   26:aload_3         
	//*  15   27:instanceof      #95  <Class Double>
	//*  16   30:ifne            84
	//*  17   33:aload_3         
	//*  18   34:instanceof      #30  <Class String>
	//*  19   37:ifne            84
		{
			if(obj instanceof Boolean)
	//*  20   40:aload_3         
	//*  21   41:instanceof      #97  <Class Boolean>
	//*  22   44:ifeq            49
				return null;
	//   23   47:aconst_null     
	//   24   48:areturn         
			Locale locale = Locale.US;
	//   25   49:getstatic       #103 <Field Locale Locale.US>
	//   26   52:astore_2        
			if(obj != null)
	//*  27   53:aload_3         
	//*  28   54:ifnonnull       60
	//*  29   57:goto            65
				bundle = ((Bundle) (obj.getClass()));
	//   30   60:aload_3         
	//   31   61:invokevirtual   #107 <Method Class Object.getClass()>
	//   32   64:astore_0        
			return String.format(locale, "Received value of type '%s' for key '%s', but only the following extra parameter types are supported: Integer, Long, Double, String, and Boolean", new Object[] {
				bundle, s
			});
	//   33   65:aload_2         
	//   34   66:ldc1            #109 <String "Received value of type '%s' for key '%s', but only the following extra parameter types are supported: Integer, Long, Double, String, and Boolean">
	//   35   68:iconst_2        
	//   36   69:anewarray       Object[]
	//   37   72:dup             
	//   38   73:iconst_0        
	//   39   74:aload_0         
	//   40   75:aastore         
	//   41   76:dup             
	//   42   77:iconst_1        
	//   43   78:aload_1         
	//   44   79:aastore         
	//   45   80:invokestatic    #113 <Method String String.format(Locale, String, Object[])>
	//   46   83:areturn         
		} else
		{
			return null;
	//   47   84:aconst_null     
	//   48   85:areturn         
		}
	}

	private static List validateForPersistence(Bundle bundle)
	{
		List list1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		List list = null;
	//    2    2:aconst_null     
	//    3    3:astore_1        
		if(bundle != null)
	//*   4    4:aload_0         
	//*   5    5:ifnull          50
		{
			Iterator iterator = bundle.keySet().iterator();
	//    6    8:aload_0         
	//    7    9:invokevirtual   #119 <Method Set Bundle.keySet()>
	//    8   12:invokeinterface #125 <Method Iterator Set.iterator()>
	//    9   17:astore_3        
			do
			{
				list1 = list;
	//   10   18:aload_1         
	//   11   19:astore_2        
				if(!iterator.hasNext())
					break;
	//   12   20:aload_3         
	//   13   21:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//   14   26:ifeq            50
				list = addError(list, validateExtrasType(bundle, (String)iterator.next()));
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:invokeinterface #135 <Method Object Iterator.next()>
	//   19   37:checkcast       #30  <Class String>
	//   20   40:invokestatic    #137 <Method String validateExtrasType(Bundle, String)>
	//   21   43:invokestatic    #44  <Method List addError(List, String)>
	//   22   46:astore_1        
			} while(true);
	//   23   47:goto            18
		}
		return list1;
	//   24   50:aload_2         
	//   25   51:areturn         
	}

	private static List validateForTransport(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int i = measureBundleSize(bundle);
	//    4    6:aload_0         
	//    5    7:invokestatic    #141 <Method int measureBundleSize(Bundle)>
	//    6   10:istore_1        
		if(i > 10240)
	//*   7   11:iload_1         
	//*   8   12:sipush          10240
	//*   9   15:icmple          50
			return getMutableSingletonList(String.format(Locale.US, "Extras too large: %d bytes is > the max (%d bytes)", new Object[] {
				Integer.valueOf(i), Integer.valueOf(10240)
			}));
	//   10   18:getstatic       #103 <Field Locale Locale.US>
	//   11   21:ldc1            #143 <String "Extras too large: %d bytes is > the max (%d bytes)">
	//   12   23:iconst_2        
	//   13   24:anewarray       Object[]
	//   14   27:dup             
	//   15   28:iconst_0        
	//   16   29:iload_1         
	//   17   30:invokestatic    #147 <Method Integer Integer.valueOf(int)>
	//   18   33:aastore         
	//   19   34:dup             
	//   20   35:iconst_1        
	//   21   36:sipush          10240
	//   22   39:invokestatic    #147 <Method Integer Integer.valueOf(int)>
	//   23   42:aastore         
	//   24   43:invokestatic    #113 <Method String String.format(Locale, String, Object[])>
	//   25   46:invokestatic    #28  <Method List getMutableSingletonList(String)>
	//   26   49:areturn         
		else
			return null;
	//   27   50:aconst_null     
	//   28   51:areturn         
	}

	private static List validateTag(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       10
			return getMutableSingletonList("Tag can't be null");
	//    2    4:ldc1            #150 <String "Tag can't be null">
	//    3    6:invokestatic    #28  <Method List getMutableSingletonList(String)>
	//    4    9:areturn         
		if(s.length() > 100)
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #153 <Method int String.length()>
	//*   7   14:bipush          100
	//*   8   16:icmple          25
			return getMutableSingletonList("Tag must be shorter than 100");
	//    9   19:ldc1            #155 <String "Tag must be shorter than 100">
	//   10   21:invokestatic    #28  <Method List getMutableSingletonList(String)>
	//   11   24:areturn         
		else
			return null;
	//   12   25:aconst_null     
	//   13   26:areturn         
	}

	public List validate(JobParameters jobparameters)
	{
		List list1 = mergeErrorLists(mergeErrorLists(((List) (null)), validate(jobparameters.getTrigger())), validate(jobparameters.getRetryStrategy()));
	//    0    0:aconst_null     
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokeinterface #164 <Method JobTrigger JobParameters.getTrigger()>
	//    4    8:invokevirtual   #167 <Method List validate(JobTrigger)>
	//    5   11:invokestatic    #169 <Method List mergeErrorLists(List, List)>
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokeinterface #173 <Method RetryStrategy JobParameters.getRetryStrategy()>
	//    9   21:invokevirtual   #176 <Method List validate(RetryStrategy)>
	//   10   24:invokestatic    #169 <Method List mergeErrorLists(List, List)>
	//   11   27:astore_3        
		List list = list1;
	//   12   28:aload_3         
	//   13   29:astore_2        
		if(jobparameters.isRecurring())
	//*  14   30:aload_1         
	//*  15   31:invokeinterface #179 <Method boolean JobParameters.isRecurring()>
	//*  16   36:ifeq            60
		{
			list = list1;
	//   17   39:aload_3         
	//   18   40:astore_2        
			if(jobparameters.getTrigger() == Trigger.NOW)
	//*  19   41:aload_1         
	//*  20   42:invokeinterface #164 <Method JobTrigger JobParameters.getTrigger()>
	//*  21   47:getstatic       #185 <Field JobTrigger$ImmediateTrigger Trigger.NOW>
	//*  22   50:if_acmpne       60
				list = addError(list1, "ImmediateTriggers can't be used with recurring jobs");
	//   23   53:aload_3         
	//   24   54:ldc1            #187 <String "ImmediateTriggers can't be used with recurring jobs">
	//   25   56:invokestatic    #44  <Method List addError(List, String)>
	//   26   59:astore_2        
		}
		list1 = mergeErrorLists(list, validateForTransport(jobparameters.getExtras()));
	//   27   60:aload_2         
	//   28   61:aload_1         
	//   29   62:invokeinterface #191 <Method Bundle JobParameters.getExtras()>
	//   30   67:invokestatic    #193 <Method List validateForTransport(Bundle)>
	//   31   70:invokestatic    #169 <Method List mergeErrorLists(List, List)>
	//   32   73:astore_3        
		list = list1;
	//   33   74:aload_3         
	//   34   75:astore_2        
		if(jobparameters.getLifetime() > 1)
	//*  35   76:aload_1         
	//*  36   77:invokeinterface #196 <Method int JobParameters.getLifetime()>
	//*  37   82:iconst_1        
	//*  38   83:icmple          100
			list = mergeErrorLists(list1, validateForPersistence(jobparameters.getExtras()));
	//   39   86:aload_3         
	//   40   87:aload_1         
	//   41   88:invokeinterface #191 <Method Bundle JobParameters.getExtras()>
	//   42   93:invokestatic    #198 <Method List validateForPersistence(Bundle)>
	//   43   96:invokestatic    #169 <Method List mergeErrorLists(List, List)>
	//   44   99:astore_2        
		return mergeErrorLists(mergeErrorLists(list, validateTag(jobparameters.getTag())), validateService(jobparameters.getService()));
	//   45  100:aload_2         
	//   46  101:aload_1         
	//   47  102:invokeinterface #202 <Method String JobParameters.getTag()>
	//   48  107:invokestatic    #204 <Method List validateTag(String)>
	//   49  110:invokestatic    #169 <Method List mergeErrorLists(List, List)>
	//   50  113:aload_0         
	//   51  114:aload_1         
	//   52  115:invokeinterface #207 <Method String JobParameters.getService()>
	//   53  120:invokevirtual   #210 <Method List validateService(String)>
	//   54  123:invokestatic    #169 <Method List mergeErrorLists(List, List)>
	//   55  126:areturn         
	}

	public List validate(JobTrigger jobtrigger)
	{
		if(jobtrigger != Trigger.NOW && !(jobtrigger instanceof JobTrigger.ExecutionWindowTrigger) && !(jobtrigger instanceof JobTrigger.ContentUriTrigger))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #185 <Field JobTrigger$ImmediateTrigger Trigger.NOW>
	//*   2    4:if_acmpeq       27
	//*   3    7:aload_1         
	//*   4    8:instanceof      #213 <Class JobTrigger$ExecutionWindowTrigger>
	//*   5   11:ifne            27
	//*   6   14:aload_1         
	//*   7   15:instanceof      #215 <Class JobTrigger$ContentUriTrigger>
	//*   8   18:ifne            27
			return getMutableSingletonList("Unknown trigger provided");
	//    9   21:ldc1            #217 <String "Unknown trigger provided">
	//   10   23:invokestatic    #28  <Method List getMutableSingletonList(String)>
	//   11   26:areturn         
		else
			return null;
	//   12   27:aconst_null     
	//   13   28:areturn         
	}

	public List validate(RetryStrategy retrystrategy)
	{
		int i = retrystrategy.getPolicy();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #223 <Method int RetryStrategy.getPolicy()>
	//    2    4:istore_2        
		int j = retrystrategy.getInitialBackoff();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #226 <Method int RetryStrategy.getInitialBackoff()>
	//    5    9:istore_3        
		int k = retrystrategy.getMaximumBackoff();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #229 <Method int RetryStrategy.getMaximumBackoff()>
	//    8   14:istore          4
		boolean flag1 = false;
	//    9   16:iconst_0        
	//   10   17:istore          6
		boolean flag;
		if(i != 1 && i != 2)
	//*  11   19:iload_2         
	//*  12   20:iconst_1        
	//*  13   21:icmpeq          35
	//*  14   24:iload_2         
	//*  15   25:iconst_2        
	//*  16   26:icmpeq          35
			flag = true;
	//   17   29:iconst_1        
	//   18   30:istore          5
		else
	//*  19   32:goto            38
			flag = false;
	//   20   35:iconst_0        
	//   21   36:istore          5
		retrystrategy = ((RetryStrategy) (addErrorsIf(flag, ((List) (null)), "Unknown retry policy provided")));
	//   22   38:iload           5
	//   23   40:aconst_null     
	//   24   41:ldc1            #231 <String "Unknown retry policy provided">
	//   25   43:invokestatic    #233 <Method List addErrorsIf(boolean, List, String)>
	//   26   46:astore_1        
		if(k < j)
	//*  27   47:iload           4
	//*  28   49:iload_3         
	//*  29   50:icmpge          59
			flag = true;
	//   30   53:iconst_1        
	//   31   54:istore          5
		else
	//*  32   56:goto            62
			flag = false;
	//   33   59:iconst_0        
	//   34   60:istore          5
		retrystrategy = ((RetryStrategy) (addErrorsIf(flag, ((List) (retrystrategy)), "Maximum backoff must be greater than or equal to initial backoff")));
	//   35   62:iload           5
	//   36   64:aload_1         
	//   37   65:ldc1            #235 <String "Maximum backoff must be greater than or equal to initial backoff">
	//   38   67:invokestatic    #233 <Method List addErrorsIf(boolean, List, String)>
	//   39   70:astore_1        
		if(300 > k)
	//*  40   71:sipush          300
	//*  41   74:iload           4
	//*  42   76:icmple          85
			flag = true;
	//   43   79:iconst_1        
	//   44   80:istore          5
		else
	//*  45   82:goto            88
			flag = false;
	//   46   85:iconst_0        
	//   47   86:istore          5
		retrystrategy = ((RetryStrategy) (addErrorsIf(flag, ((List) (retrystrategy)), "Maximum backoff must be greater than 300s (5 minutes)")));
	//   48   88:iload           5
	//   49   90:aload_1         
	//   50   91:ldc1            #237 <String "Maximum backoff must be greater than 300s (5 minutes)">
	//   51   93:invokestatic    #233 <Method List addErrorsIf(boolean, List, String)>
	//   52   96:astore_1        
		flag = flag1;
	//   53   97:iload           6
	//   54   99:istore          5
		if(j < 30)
	//*  55  101:iload_3         
	//*  56  102:bipush          30
	//*  57  104:icmpge          110
			flag = true;
	//   58  107:iconst_1        
	//   59  108:istore          5
		return addErrorsIf(flag, ((List) (retrystrategy)), "Initial backoff must be at least 30s");
	//   60  110:iload           5
	//   61  112:aload_1         
	//   62  113:ldc1            #239 <String "Initial backoff must be at least 30s">
	//   63  115:invokestatic    #233 <Method List addErrorsIf(boolean, List, String)>
	//   64  118:areturn         
	}

	List validateService(String s)
	{
		if(s != null && !s.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          206
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #244 <Method boolean String.isEmpty()>
	//*   4    8:ifeq            14
	//*   5   11:goto            206
		{
			Object obj = ((Object) (context));
	//    6   14:aload_0         
	//    7   15:getfield        #20  <Field Context context>
	//    8   18:astore_2        
			if(obj == null)
	//*   9   19:aload_2         
	//*  10   20:ifnonnull       29
				return getMutableSingletonList("Context is null, can't query PackageManager");
	//   11   23:ldc1            #246 <String "Context is null, can't query PackageManager">
	//   12   25:invokestatic    #28  <Method List getMutableSingletonList(String)>
	//   13   28:areturn         
			obj = ((Object) (((Context) (obj)).getPackageManager()));
	//   14   29:aload_2         
	//   15   30:invokevirtual   #252 <Method PackageManager Context.getPackageManager()>
	//   16   33:astore_2        
			if(obj == null)
	//*  17   34:aload_2         
	//*  18   35:ifnonnull       44
				return getMutableSingletonList("PackageManager is null, can't validate service");
	//   19   38:ldc1            #254 <String "PackageManager is null, can't validate service">
	//   20   40:invokestatic    #28  <Method List getMutableSingletonList(String)>
	//   21   43:areturn         
			Intent intent = new Intent("com.firebase.jobdispatcher.ACTION_EXECUTE");
	//   22   44:new             #256 <Class Intent>
	//   23   47:dup             
	//   24   48:ldc2            #258 <String "com.firebase.jobdispatcher.ACTION_EXECUTE">
	//   25   51:invokespecial   #261 <Method void Intent(String)>
	//   26   54:astore_3        
			intent.setClassName(context, s);
	//   27   55:aload_3         
	//   28   56:aload_0         
	//   29   57:getfield        #20  <Field Context context>
	//   30   60:aload_1         
	//   31   61:invokevirtual   #265 <Method Intent Intent.setClassName(Context, String)>
	//   32   64:pop             
			obj = ((Object) (((PackageManager) (obj)).queryIntentServices(intent, 0)));
	//   33   65:aload_2         
	//   34   66:aload_3         
	//   35   67:iconst_0        
	//   36   68:invokevirtual   #271 <Method List PackageManager.queryIntentServices(Intent, int)>
	//   37   71:astore_2        
			if(obj != null && !((List) (obj)).isEmpty())
	//*  38   72:aload_2         
	//*  39   73:ifnull          163
	//*  40   76:aload_2         
	//*  41   77:invokeinterface #272 <Method boolean List.isEmpty()>
	//*  42   82:ifeq            88
	//*  43   85:goto            163
			{
				for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  44   88:aload_2         
	//*  45   89:invokeinterface #273 <Method Iterator List.iterator()>
	//*  46   94:astore_2        
	//*  47   95:aload_2         
	//*  48   96:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//*  49  101:ifeq            133
				{
					ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj)).next();
	//   50  104:aload_2         
	//   51  105:invokeinterface #135 <Method Object Iterator.next()>
	//   52  110:checkcast       #275 <Class ResolveInfo>
	//   53  113:astore_3        
					if(resolveinfo.serviceInfo != null && resolveinfo.serviceInfo.enabled)
	//*  54  114:aload_3         
	//*  55  115:getfield        #279 <Field ServiceInfo ResolveInfo.serviceInfo>
	//*  56  118:ifnull          95
	//*  57  121:aload_3         
	//*  58  122:getfield        #279 <Field ServiceInfo ResolveInfo.serviceInfo>
	//*  59  125:getfield        #285 <Field boolean ServiceInfo.enabled>
	//*  60  128:ifeq            95
						return null;
	//   61  131:aconst_null     
	//   62  132:areturn         
				}

				obj = ((Object) (new StringBuilder()));
	//   63  133:new             #287 <Class StringBuilder>
	//   64  136:dup             
	//   65  137:invokespecial   #288 <Method void StringBuilder()>
	//   66  140:astore_2        
				((StringBuilder) (obj)).append(s);
	//   67  141:aload_2         
	//   68  142:aload_1         
	//   69  143:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//   70  146:pop             
				((StringBuilder) (obj)).append(" is disabled.");
	//   71  147:aload_2         
	//   72  148:ldc2            #294 <String " is disabled.">
	//   73  151:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//   74  154:pop             
				return getMutableSingletonList(((StringBuilder) (obj)).toString());
	//   75  155:aload_2         
	//   76  156:invokevirtual   #297 <Method String StringBuilder.toString()>
	//   77  159:invokestatic    #28  <Method List getMutableSingletonList(String)>
	//   78  162:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   79  163:new             #287 <Class StringBuilder>
	//   80  166:dup             
	//   81  167:invokespecial   #288 <Method void StringBuilder()>
	//   82  170:astore_2        
				stringbuilder.append("Couldn't find a registered service with the name ");
	//   83  171:aload_2         
	//   84  172:ldc2            #299 <String "Couldn't find a registered service with the name ">
	//   85  175:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//   86  178:pop             
				stringbuilder.append(s);
	//   87  179:aload_2         
	//   88  180:aload_1         
	//   89  181:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//   90  184:pop             
				stringbuilder.append(". Is it declared in the manifest with the right intent-filter? If not, the job won't be started.");
	//   91  185:aload_2         
	//   92  186:ldc2            #301 <String ". Is it declared in the manifest with the right intent-filter? If not, the job won't be started.">
	//   93  189:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//   94  192:pop             
				Log.e("FJD.GooglePlayReceiver", stringbuilder.toString());
	//   95  193:ldc2            #303 <String "FJD.GooglePlayReceiver">
	//   96  196:aload_2         
	//   97  197:invokevirtual   #297 <Method String StringBuilder.toString()>
	//   98  200:invokestatic    #309 <Method int Log.e(String, String)>
	//   99  203:pop             
				return null;
	//  100  204:aconst_null     
	//  101  205:areturn         
			}
		} else
		{
			return getMutableSingletonList("Service can't be empty");
	//  102  206:ldc2            #311 <String "Service can't be empty">
	//  103  209:invokestatic    #28  <Method List getMutableSingletonList(String)>
	//  104  212:areturn         
		}
	}

	public static final int MAX_EXTRAS_SIZE_BYTES = 10240;
	public static final int MAX_TAG_LENGTH = 100;
	private final Context context;
}

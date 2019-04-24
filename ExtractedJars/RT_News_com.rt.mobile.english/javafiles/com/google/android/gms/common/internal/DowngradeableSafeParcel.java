// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.reflect.Field;

// Referenced classes of package com.google.android.gms.common.internal:
//			ReflectedParcelable

public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable
	implements ReflectedParcelable
{
	public static final class DowngradeableSafeParcelHelper
	{

		public static Bundle getExtras(Intent intent, Context context, Integer integer)
		{
			synchronized(DowngradeableSafeParcel.zzcs())
		//*   0    0:invokestatic    #18  <Method Object DowngradeableSafeParcel.zzcs()>
		//*   1    3:astore_3        
		//*   2    4:aload_3         
		//*   3    5:monitorenter    
			{
				intent = ((Intent) (DowngradeableSafeParcel.getExtras(intent, context, integer)));
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:aload_2         
		//    7    9:invokestatic    #20  <Method Bundle DowngradeableSafeParcel.getExtras(Intent, Context, Integer)>
		//    8   12:astore_0        
			}
		//    9   13:aload_3         
		//   10   14:monitorexit     
			return ((Bundle) (intent));
		//   11   15:aload_0         
		//   12   16:areturn         
			intent;
		//   13   17:astore_0        
			obj;
		//   14   18:aload_3         
			JVM INSTR monitorexit ;
		//   15   19:monitorexit     
			throw intent;
		//   16   20:aload_0         
		//   17   21:athrow          
		}

		public static Parcelable getParcelable(Intent intent, String s, Context context, Integer integer)
		{
			synchronized(DowngradeableSafeParcel.zzcs())
		//*   0    0:invokestatic    #18  <Method Object DowngradeableSafeParcel.zzcs()>
		//*   1    3:astore          4
		//*   2    5:aload           4
		//*   3    7:monitorenter    
			{
				intent = ((Intent) (DowngradeableSafeParcel.getParcelable(intent, s, context, integer)));
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:aload_3         
		//    8   12:invokestatic    #24  <Method Parcelable DowngradeableSafeParcel.getParcelable(Intent, String, Context, Integer)>
		//    9   15:astore_0        
			}
		//   10   16:aload           4
		//   11   18:monitorexit     
			return ((Parcelable) (intent));
		//   12   19:aload_0         
		//   13   20:areturn         
			intent;
		//   14   21:astore_0        
			obj;
		//   15   22:aload           4
			JVM INSTR monitorexit ;
		//   16   24:monitorexit     
			throw intent;
		//   17   25:aload_0         
		//   18   26:athrow          
		}

		public static Parcelable getParcelable(Bundle bundle, String s, Context context, Integer integer)
		{
			synchronized(DowngradeableSafeParcel.zzcs())
		//*   0    0:invokestatic    #18  <Method Object DowngradeableSafeParcel.zzcs()>
		//*   1    3:astore          4
		//*   2    5:aload           4
		//*   3    7:monitorenter    
			{
				bundle = ((Bundle) (DowngradeableSafeParcel.getParcelable(bundle, s, context, integer)));
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:aload_3         
		//    8   12:invokestatic    #29  <Method Parcelable DowngradeableSafeParcel.getParcelable(Bundle, String, Context, Integer)>
		//    9   15:astore_0        
			}
		//   10   16:aload           4
		//   11   18:monitorexit     
			return ((Parcelable) (bundle));
		//   12   19:aload_0         
		//   13   20:areturn         
			bundle;
		//   14   21:astore_0        
			obj;
		//   15   22:aload           4
			JVM INSTR monitorexit ;
		//   16   24:monitorexit     
			throw bundle;
		//   17   25:aload_0         
		//   18   26:athrow          
		}

		public static boolean putParcelable(Bundle bundle, String s, DowngradeableSafeParcel downgradeablesafeparcel, Context context, Integer integer)
		{
			return DowngradeableSafeParcel.putParcelable(bundle, s, downgradeablesafeparcel, context, integer);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:invokestatic    #34  <Method boolean DowngradeableSafeParcel.putParcelable(Bundle, String, DowngradeableSafeParcel, Context, Integer)>
		//    6    9:ireturn         
		}

		public DowngradeableSafeParcelHelper()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public DowngradeableSafeParcel()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void AbstractSafeParcelable()>
		zzsm = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #30  <Field boolean zzsm>
	//    5    9:return          
	}

	protected static boolean canUnparcelSafely(String s)
	{
		ClassLoader classloader = getUnparcelClassLoader();
	//    0    0:invokestatic    #38  <Method ClassLoader getUnparcelClassLoader()>
	//    1    3:astore_2        
		if(classloader == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       10
			return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
		boolean flag;
		try
		{
			flag = zza(classloader.loadClass(s));
	//    6   10:aload_2         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #44  <Method Class ClassLoader.loadClass(String)>
	//    9   15:invokestatic    #48  <Method boolean zza(Class)>
	//   10   18:istore_1        
		}
	//*  11   19:iload_1         
	//*  12   20:ireturn         
	//*  13   21:iconst_0        
	//*  14   22:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return false;
		}
		return flag;
	//*  15   23:astore_0        
	//*  16   24:goto            21
	}

	static Bundle getExtras(Intent intent, Context context, Integer integer)
	{
		if(context == null)
			break MISSING_BLOCK_LABEL_48;
	//    0    0:aload_1         
	//    1    1:ifnull          48
		zza(context.getClassLoader(), integer);
	//    2    4:aload_1         
	//    3    5:invokevirtual   #55  <Method ClassLoader Context.getClassLoader()>
	//    4    8:aload_2         
	//    5    9:invokestatic    #58  <Method void zza(ClassLoader, Integer)>
		if(intent.getExtras() == null)
			break MISSING_BLOCK_LABEL_48;
	//    6   12:aload_0         
	//    7   13:invokevirtual   #63  <Method Bundle Intent.getExtras()>
	//    8   16:ifnull          48
		context = ((Context) (new Bundle()));
	//    9   19:new             #65  <Class Bundle>
	//   10   22:dup             
	//   11   23:invokespecial   #66  <Method void Bundle()>
	//   12   26:astore_1        
		((Bundle) (context)).putAll(intent.getExtras());
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:invokevirtual   #63  <Method Bundle Intent.getExtras()>
	//   16   32:invokevirtual   #70  <Method void Bundle.putAll(Bundle)>
		intent = ((Intent) (context));
	//   17   35:aload_1         
	//   18   36:astore_0        
		break MISSING_BLOCK_LABEL_50;
	//   19   37:goto            50
		intent;
	//   20   40:astore_0        
		zza(((ClassLoader) (null)), ((Integer) (null)));
	//   21   41:aconst_null     
	//   22   42:aconst_null     
	//   23   43:invokestatic    #58  <Method void zza(ClassLoader, Integer)>
		throw intent;
	//   24   46:aload_0         
	//   25   47:athrow          
		intent = null;
	//   26   48:aconst_null     
	//   27   49:astore_0        
		zza(((ClassLoader) (null)), ((Integer) (null)));
	//   28   50:aconst_null     
	//   29   51:aconst_null     
	//   30   52:invokestatic    #58  <Method void zza(ClassLoader, Integer)>
		return ((Bundle) (intent));
	//   31   55:aload_0         
	//   32   56:areturn         
	}

	static Parcelable getParcelable(Intent intent, String s, Context context, Integer integer)
	{
		if(context == null)
			break MISSING_BLOCK_LABEL_29;
	//    0    0:aload_2         
	//    1    1:ifnull          29
		zza(context.getClassLoader(), integer);
	//    2    4:aload_2         
	//    3    5:invokevirtual   #55  <Method ClassLoader Context.getClassLoader()>
	//    4    8:aload_3         
	//    5    9:invokestatic    #58  <Method void zza(ClassLoader, Integer)>
		intent = ((Intent) (intent.getParcelableExtra(s)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #76  <Method Parcelable Intent.getParcelableExtra(String)>
	//    9   17:astore_0        
		break MISSING_BLOCK_LABEL_31;
	//   10   18:goto            31
		intent;
	//   11   21:astore_0        
		zza(((ClassLoader) (null)), ((Integer) (null)));
	//   12   22:aconst_null     
	//   13   23:aconst_null     
	//   14   24:invokestatic    #58  <Method void zza(ClassLoader, Integer)>
		throw intent;
	//   15   27:aload_0         
	//   16   28:athrow          
		intent = null;
	//   17   29:aconst_null     
	//   18   30:astore_0        
		zza(((ClassLoader) (null)), ((Integer) (null)));
	//   19   31:aconst_null     
	//   20   32:aconst_null     
	//   21   33:invokestatic    #58  <Method void zza(ClassLoader, Integer)>
		return ((Parcelable) (intent));
	//   22   36:aload_0         
	//   23   37:areturn         
	}

	static Parcelable getParcelable(Bundle bundle, String s, Context context, Integer integer)
	{
		if(context == null)
			break MISSING_BLOCK_LABEL_29;
	//    0    0:aload_2         
	//    1    1:ifnull          29
		zza(context.getClassLoader(), integer);
	//    2    4:aload_2         
	//    3    5:invokevirtual   #55  <Method ClassLoader Context.getClassLoader()>
	//    4    8:aload_3         
	//    5    9:invokestatic    #58  <Method void zza(ClassLoader, Integer)>
		bundle = ((Bundle) (bundle.getParcelable(s)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #81  <Method Parcelable Bundle.getParcelable(String)>
	//    9   17:astore_0        
		break MISSING_BLOCK_LABEL_31;
	//   10   18:goto            31
		bundle;
	//   11   21:astore_0        
		zza(((ClassLoader) (null)), ((Integer) (null)));
	//   12   22:aconst_null     
	//   13   23:aconst_null     
	//   14   24:invokestatic    #58  <Method void zza(ClassLoader, Integer)>
		throw bundle;
	//   15   27:aload_0         
	//   16   28:athrow          
		bundle = null;
	//   17   29:aconst_null     
	//   18   30:astore_0        
		zza(((ClassLoader) (null)), ((Integer) (null)));
	//   19   31:aconst_null     
	//   20   32:aconst_null     
	//   21   33:invokestatic    #58  <Method void zza(ClassLoader, Integer)>
		return ((Parcelable) (bundle));
	//   22   36:aload_0         
	//   23   37:areturn         
	}

	protected static ClassLoader getUnparcelClassLoader()
	{
		ClassLoader classloader;
		synchronized(zzsj)
	//*   0    0:getstatic       #26  <Field Object zzsj>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			classloader = zzsk;
	//    4    6:getstatic       #84  <Field ClassLoader zzsk>
	//    5    9:astore_1        
		}
	//    6   10:aload_0         
	//    7   11:monitorexit     
		return classloader;
	//    8   12:aload_1         
	//    9   13:areturn         
		exception;
	//   10   14:astore_1        
		obj;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		throw exception;
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	protected static Integer getUnparcelClientVersion()
	{
		Integer integer;
		synchronized(zzsj)
	//*   0    0:getstatic       #26  <Field Object zzsj>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			integer = zzsl;
	//    4    6:getstatic       #88  <Field Integer zzsl>
	//    5    9:astore_1        
		}
	//    6   10:aload_0         
	//    7   11:monitorexit     
		return integer;
	//    8   12:aload_1         
	//    9   13:areturn         
		exception;
	//   10   14:astore_1        
		obj;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		throw exception;
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	static boolean putParcelable(Bundle bundle, String s, DowngradeableSafeParcel downgradeablesafeparcel, Context context, Integer integer)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if(context == null && integer == null)
	//*   2    3:aload_3         
	//*   3    4:ifnonnull       14
	//*   4    7:aload           4
	//*   5    9:ifnonnull       14
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		if(downgradeablesafeparcel.zza(context, integer))
	//*   8   14:aload_2         
	//*   9   15:aload_3         
	//*  10   16:aload           4
	//*  11   18:invokespecial   #93  <Method boolean zza(Context, Integer)>
	//*  12   21:ifeq            33
		{
			bundle.putParcelable(s, ((Parcelable) (downgradeablesafeparcel)));
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:aload_2         
	//   16   27:invokevirtual   #96  <Method void Bundle.putParcelable(String, Parcelable)>
			flag = true;
	//   17   30:iconst_1        
	//   18   31:istore          5
		}
		return flag;
	//   19   33:iload           5
	//   20   35:ireturn         
	}

	private static void zza(ClassLoader classloader, Integer integer)
	{
		synchronized(zzsj)
	//*   0    0:getstatic       #26  <Field Object zzsj>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			zzsk = classloader;
	//    4    6:aload_0         
	//    5    7:putstatic       #84  <Field ClassLoader zzsk>
			zzsl = integer;
	//    6   10:aload_1         
	//    7   11:putstatic       #88  <Field Integer zzsl>
		}
	//    8   14:aload_2         
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		classloader;
	//   11   17:astore_0        
		obj;
	//   12   18:aload_2         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		throw classloader;
	//   14   20:aload_0         
	//   15   21:athrow          
	}

	private final boolean zza(Context context, Integer integer)
	{
		if(integer != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          13
			return prepareForClientVersion(integer.intValue());
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #102 <Method int Integer.intValue()>
	//    5    9:invokevirtual   #106 <Method boolean prepareForClientVersion(int)>
	//    6   12:ireturn         
		try
		{
			setShouldDowngrade(zza(context.getClassLoader().loadClass(((Object)this).getClass().getCanonicalName())) ^ true);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #55  <Method ClassLoader Context.getClassLoader()>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #110 <Method Class Object.getClass()>
	//   12   22:invokevirtual   #116 <Method String Class.getCanonicalName()>
	//   13   25:invokevirtual   #44  <Method Class ClassLoader.loadClass(String)>
	//   14   28:invokestatic    #48  <Method boolean zza(Class)>
	//   15   31:iconst_1        
	//   16   32:ixor            
	//   17   33:invokevirtual   #120 <Method void setShouldDowngrade(boolean)>
		}
	//*  18   36:iconst_1        
	//*  19   37:ireturn         
	//*  20   38:iconst_0        
	//*  21   39:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return false;
		}
		return true;
	//*  22   40:astore_1        
	//*  23   41:goto            38
	}

	private static boolean zza(Class class1)
	{
		boolean flag;
		try
		{
			flag = "SAFE_PARCELABLE_NULL_STRING".equals(class1.getField("NULL").get(((Object) (null))));
	//    0    0:ldc1            #126 <String "SAFE_PARCELABLE_NULL_STRING">
	//    1    2:aload_0         
	//    2    3:ldc1            #128 <String "NULL">
	//    3    5:invokevirtual   #132 <Method Field Class.getField(String)>
	//    4    8:aconst_null     
	//    5    9:invokevirtual   #138 <Method Object Field.get(Object)>
	//    6   12:invokevirtual   #144 <Method boolean String.equals(Object)>
	//    7   15:istore_1        
		}
	//*   8   16:iload_1         
	//*   9   17:ireturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
	//*  10   18:astore_0        
		{
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		}
		return flag;
	}

	static Object zzcs()
	{
		return zzsj;
	//    0    0:getstatic       #26  <Field Object zzsj>
	//    1    3:areturn         
	}

	protected abstract boolean prepareForClientVersion(int i);

	public void setShouldDowngrade(boolean flag)
	{
		zzsm = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field boolean zzsm>
	//    3    5:return          
	}

	protected boolean shouldDowngrade()
	{
		return zzsm;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean zzsm>
	//    2    4:ireturn         
	}

	private static final Object zzsj = new Object();
	private static ClassLoader zzsk;
	private static Integer zzsl;
	private boolean zzsm;

	static 
	{
	//    0    0:new             #21  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void Object()>
	//    3    7:putstatic       #26  <Field Object zzsj>
	//*   4   10:return          
	}
}

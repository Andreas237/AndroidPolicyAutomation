// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			zze, Preconditions, Objects

public abstract class GmsClientSupervisor
{
	protected static final class zza
	{

		public final boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(!(obj instanceof zza))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class GmsClientSupervisor$zza>
		//*   7   11:ifne            16
				return false;
		//    8   14:iconst_0        
		//    9   15:ireturn         
			obj = ((Object) ((zza)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class GmsClientSupervisor$zza>
		//   12   20:astore_1        
			return Objects.equal(((Object) (zzdr)), ((Object) (((zza) (obj)).zzdr))) && Objects.equal(((Object) (zzds)), ((Object) (((zza) (obj)).zzds))) && Objects.equal(((Object) (mComponentName)), ((Object) (((zza) (obj)).mComponentName))) && zzdt == ((zza) (obj)).zzdt;
		//   13   21:aload_0         
		//   14   22:getfield        #21  <Field String zzdr>
		//   15   25:aload_1         
		//   16   26:getfield        #21  <Field String zzdr>
		//   17   29:invokestatic    #52  <Method boolean Objects.equal(Object, Object)>
		//   18   32:ifeq            76
		//   19   35:aload_0         
		//   20   36:getfield        #23  <Field String zzds>
		//   21   39:aload_1         
		//   22   40:getfield        #23  <Field String zzds>
		//   23   43:invokestatic    #52  <Method boolean Objects.equal(Object, Object)>
		//   24   46:ifeq            76
		//   25   49:aload_0         
		//   26   50:getfield        #33  <Field ComponentName mComponentName>
		//   27   53:aload_1         
		//   28   54:getfield        #33  <Field ComponentName mComponentName>
		//   29   57:invokestatic    #52  <Method boolean Objects.equal(Object, Object)>
		//   30   60:ifeq            76
		//   31   63:aload_0         
		//   32   64:getfield        #35  <Field int zzdt>
		//   33   67:aload_1         
		//   34   68:getfield        #35  <Field int zzdt>
		//   35   71:icmpne          76
		//   36   74:iconst_1        
		//   37   75:ireturn         
		//   38   76:iconst_0        
		//   39   77:ireturn         
		}

		public final ComponentName getComponentName()
		{
			return mComponentName;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field ComponentName mComponentName>
		//    2    4:areturn         
		}

		public final String getPackage()
		{
			return zzds;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field String zzds>
		//    2    4:areturn         
		}

		public final int hashCode()
		{
			return Objects.hashCode(new Object[] {
				zzdr, zzds, mComponentName, Integer.valueOf(zzdt)
			});
		//    0    0:iconst_4        
		//    1    1:anewarray       Object[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:aload_0         
		//    5    7:getfield        #21  <Field String zzdr>
		//    6   10:aastore         
		//    7   11:dup             
		//    8   12:iconst_1        
		//    9   13:aload_0         
		//   10   14:getfield        #23  <Field String zzds>
		//   11   17:aastore         
		//   12   18:dup             
		//   13   19:iconst_2        
		//   14   20:aload_0         
		//   15   21:getfield        #33  <Field ComponentName mComponentName>
		//   16   24:aastore         
		//   17   25:dup             
		//   18   26:iconst_3        
		//   19   27:aload_0         
		//   20   28:getfield        #35  <Field int zzdt>
		//   21   31:invokestatic    #64  <Method Integer Integer.valueOf(int)>
		//   22   34:aastore         
		//   23   35:invokestatic    #67  <Method int Objects.hashCode(Object[])>
		//   24   38:ireturn         
		}

		public final String toString()
		{
			String s1 = zzdr;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field String zzdr>
		//    2    4:astore_2        
			String s = s1;
		//    3    5:aload_2         
		//    4    6:astore_1        
			if(s1 == null)
		//*   5    7:aload_2         
		//*   6    8:ifnonnull       19
				s = mComponentName.flattenToString();
		//    7   11:aload_0         
		//    8   12:getfield        #33  <Field ComponentName mComponentName>
		//    9   15:invokevirtual   #71  <Method String ComponentName.flattenToString()>
		//   10   18:astore_1        
			return s;
		//   11   19:aload_1         
		//   12   20:areturn         
		}

		public final Intent zzb(Context context)
		{
			context = ((Context) (zzdr));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field String zzdr>
		//    2    4:astore_1        
			if(context != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          25
				return (new Intent(((String) (context)))).setPackage(zzds);
		//    5    9:new             #75  <Class Intent>
		//    6   12:dup             
		//    7   13:aload_1         
		//    8   14:invokespecial   #78  <Method void Intent(String)>
		//    9   17:aload_0         
		//   10   18:getfield        #23  <Field String zzds>
		//   11   21:invokevirtual   #82  <Method Intent Intent.setPackage(String)>
		//   12   24:areturn         
			else
				return (new Intent()).setComponent(mComponentName);
		//   13   25:new             #75  <Class Intent>
		//   14   28:dup             
		//   15   29:invokespecial   #83  <Method void Intent()>
		//   16   32:aload_0         
		//   17   33:getfield        #33  <Field ComponentName mComponentName>
		//   18   36:invokevirtual   #87  <Method Intent Intent.setComponent(ComponentName)>
		//   19   39:areturn         
		}

		public final int zzq()
		{
			return zzdt;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field int zzdt>
		//    2    4:ireturn         
		}

		private final ComponentName mComponentName;
		private final String zzdr;
		private final String zzds;
		private final int zzdt;

		public zza(ComponentName componentname, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			zzdr = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #21  <Field String zzdr>
			zzds = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #23  <Field String zzds>
			mComponentName = (ComponentName)Preconditions.checkNotNull(((Object) (componentname)));
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:invokestatic    #29  <Method Object Preconditions.checkNotNull(Object)>
		//   11   19:checkcast       #31  <Class ComponentName>
		//   12   22:putfield        #33  <Field ComponentName mComponentName>
			zzdt = 129;
		//   13   25:aload_0         
		//   14   26:sipush          129
		//   15   29:putfield        #35  <Field int zzdt>
		//   16   32:return          
		}

		public zza(String s, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			zzdr = Preconditions.checkNotEmpty(s);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #41  <Method String Preconditions.checkNotEmpty(String)>
		//    5    9:putfield        #21  <Field String zzdr>
			zzds = "com.google.android.gms";
		//    6   12:aload_0         
		//    7   13:ldc1            #43  <String "com.google.android.gms">
		//    8   15:putfield        #23  <Field String zzds>
			mComponentName = null;
		//    9   18:aload_0         
		//   10   19:aconst_null     
		//   11   20:putfield        #33  <Field ComponentName mComponentName>
			zzdt = 129;
		//   12   23:aload_0         
		//   13   24:sipush          129
		//   14   27:putfield        #35  <Field int zzdt>
		//   15   30:return          
		}

		public zza(String s, String s1, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			zzdr = Preconditions.checkNotEmpty(s);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #41  <Method String Preconditions.checkNotEmpty(String)>
		//    5    9:putfield        #21  <Field String zzdr>
			zzds = Preconditions.checkNotEmpty(s1);
		//    6   12:aload_0         
		//    7   13:aload_2         
		//    8   14:invokestatic    #41  <Method String Preconditions.checkNotEmpty(String)>
		//    9   17:putfield        #23  <Field String zzds>
			mComponentName = null;
		//   10   20:aload_0         
		//   11   21:aconst_null     
		//   12   22:putfield        #33  <Field ComponentName mComponentName>
			zzdt = i;
		//   13   25:aload_0         
		//   14   26:iload_3         
		//   15   27:putfield        #35  <Field int zzdt>
		//   16   30:return          
		}
	}


	public GmsClientSupervisor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static GmsClientSupervisor getInstance(Context context)
	{
		synchronized(zzdp)
	//*   0    0:getstatic       #19  <Field Object zzdp>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			if(zzdq == null)
	//*   4    6:getstatic       #24  <Field GmsClientSupervisor zzdq>
	//*   5    9:ifnonnull       26
				zzdq = ((GmsClientSupervisor) (new zze(context.getApplicationContext())));
	//    6   12:new             #26  <Class zze>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokevirtual   #32  <Method Context Context.getApplicationContext()>
	//   10   20:invokespecial   #35  <Method void zze(Context)>
	//   11   23:putstatic       #24  <Field GmsClientSupervisor zzdq>
		}
	//   12   26:aload_1         
	//   13   27:monitorexit     
		return zzdq;
	//   14   28:getstatic       #24  <Field GmsClientSupervisor zzdq>
	//   15   31:areturn         
		context;
	//   16   32:astore_0        
		obj;
	//   17   33:aload_1         
		JVM INSTR monitorexit ;
	//   18   34:monitorexit     
		throw context;
	//   19   35:aload_0         
	//   20   36:athrow          
	}

	public boolean bindService(ComponentName componentname, ServiceConnection serviceconnection, String s)
	{
		return zza(new zza(componentname, 129), serviceconnection, s);
	//    0    0:aload_0         
	//    1    1:new             #6   <Class GmsClientSupervisor$zza>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:sipush          129
	//    5    9:invokespecial   #41  <Method void GmsClientSupervisor$zza(ComponentName, int)>
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #44  <Method boolean zza(GmsClientSupervisor$zza, ServiceConnection, String)>
	//    9   17:ireturn         
	}

	public boolean bindService(String s, ServiceConnection serviceconnection, String s1)
	{
		return zza(new zza(s, 129), serviceconnection, s1);
	//    0    0:aload_0         
	//    1    1:new             #6   <Class GmsClientSupervisor$zza>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:sipush          129
	//    5    9:invokespecial   #48  <Method void GmsClientSupervisor$zza(String, int)>
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #44  <Method boolean zza(GmsClientSupervisor$zza, ServiceConnection, String)>
	//    9   17:ireturn         
	}

	public void unbindService(ComponentName componentname, ServiceConnection serviceconnection, String s)
	{
		zzb(new zza(componentname, 129), serviceconnection, s);
	//    0    0:aload_0         
	//    1    1:new             #6   <Class GmsClientSupervisor$zza>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:sipush          129
	//    5    9:invokespecial   #41  <Method void GmsClientSupervisor$zza(ComponentName, int)>
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #54  <Method void zzb(GmsClientSupervisor$zza, ServiceConnection, String)>
	//    9   17:return          
	}

	public void unbindService(String s, ServiceConnection serviceconnection, String s1)
	{
		zzb(new zza(s, 129), serviceconnection, s1);
	//    0    0:aload_0         
	//    1    1:new             #6   <Class GmsClientSupervisor$zza>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:sipush          129
	//    5    9:invokespecial   #48  <Method void GmsClientSupervisor$zza(String, int)>
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #54  <Method void zzb(GmsClientSupervisor$zza, ServiceConnection, String)>
	//    9   17:return          
	}

	public final void zza(String s, String s1, int i, ServiceConnection serviceconnection, String s2)
	{
		zzb(new zza(s, s1, i), serviceconnection, s2);
	//    0    0:aload_0         
	//    1    1:new             #6   <Class GmsClientSupervisor$zza>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #59  <Method void GmsClientSupervisor$zza(String, String, int)>
	//    7   11:aload           4
	//    8   13:aload           5
	//    9   15:invokevirtual   #54  <Method void zzb(GmsClientSupervisor$zza, ServiceConnection, String)>
	//   10   18:return          
	}

	protected abstract boolean zza(zza zza1, ServiceConnection serviceconnection, String s);

	protected abstract void zzb(zza zza1, ServiceConnection serviceconnection, String s);

	private static final Object zzdp = new Object();
	private static GmsClientSupervisor zzdq;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void Object()>
	//    3    7:putstatic       #19  <Field Object zzdp>
	//*   4   10:return          
	}
}

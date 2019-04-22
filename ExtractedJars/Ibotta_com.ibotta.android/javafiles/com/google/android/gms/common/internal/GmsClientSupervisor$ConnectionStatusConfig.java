// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			GmsClientSupervisor, Preconditions, Objects

protected static final class GmsClientSupervisor$ConnectionStatusConfig
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
		if(!(obj instanceof GmsClientSupervisor$ConnectionStatusConfig))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class GmsClientSupervisor$ConnectionStatusConfig>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((GmsClientSupervisor$ConnectionStatusConfig)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class GmsClientSupervisor$ConnectionStatusConfig>
	//   12   20:astore_1        
		return Objects.equal(((Object) (zzto)), ((Object) (((GmsClientSupervisor$ConnectionStatusConfig) (obj)).zzto))) && Objects.equal(((Object) (zztp)), ((Object) (((GmsClientSupervisor$ConnectionStatusConfig) (obj)).zztp))) && Objects.equal(((Object) (mComponentName)), ((Object) (((GmsClientSupervisor$ConnectionStatusConfig) (obj)).mComponentName))) && zztq == ((GmsClientSupervisor$ConnectionStatusConfig) (obj)).zztq;
	//   13   21:aload_0         
	//   14   22:getfield        #21  <Field String zzto>
	//   15   25:aload_1         
	//   16   26:getfield        #21  <Field String zzto>
	//   17   29:invokestatic    #52  <Method boolean Objects.equal(Object, Object)>
	//   18   32:ifeq            76
	//   19   35:aload_0         
	//   20   36:getfield        #23  <Field String zztp>
	//   21   39:aload_1         
	//   22   40:getfield        #23  <Field String zztp>
	//   23   43:invokestatic    #52  <Method boolean Objects.equal(Object, Object)>
	//   24   46:ifeq            76
	//   25   49:aload_0         
	//   26   50:getfield        #33  <Field ComponentName mComponentName>
	//   27   53:aload_1         
	//   28   54:getfield        #33  <Field ComponentName mComponentName>
	//   29   57:invokestatic    #52  <Method boolean Objects.equal(Object, Object)>
	//   30   60:ifeq            76
	//   31   63:aload_0         
	//   32   64:getfield        #35  <Field int zztq>
	//   33   67:aload_1         
	//   34   68:getfield        #35  <Field int zztq>
	//   35   71:icmpne          76
	//   36   74:iconst_1        
	//   37   75:ireturn         
	//   38   76:iconst_0        
	//   39   77:ireturn         
	}

	public final String getAction()
	{
		return zzto;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String zzto>
	//    2    4:areturn         
	}

	public final int getBindFlags()
	{
		return zztq;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int zztq>
	//    2    4:ireturn         
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
		return zztp;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String zztp>
	//    2    4:areturn         
	}

	public final Intent getStartServiceIntent(Context context)
	{
		context = ((Context) (zzto));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String zzto>
	//    2    4:astore_1        
		if(context != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          25
			return (new Intent(((String) (context)))).setPackage(zztp);
	//    5    9:new             #63  <Class Intent>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #66  <Method void Intent(String)>
	//    9   17:aload_0         
	//   10   18:getfield        #23  <Field String zztp>
	//   11   21:invokevirtual   #70  <Method Intent Intent.setPackage(String)>
	//   12   24:areturn         
		else
			return (new Intent()).setComponent(mComponentName);
	//   13   25:new             #63  <Class Intent>
	//   14   28:dup             
	//   15   29:invokespecial   #71  <Method void Intent()>
	//   16   32:aload_0         
	//   17   33:getfield        #33  <Field ComponentName mComponentName>
	//   18   36:invokevirtual   #75  <Method Intent Intent.setComponent(ComponentName)>
	//   19   39:areturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			zzto, zztp, mComponentName, Integer.valueOf(zztq)
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #21  <Field String zzto>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #23  <Field String zztp>
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:aload_0         
	//   15   21:getfield        #33  <Field ComponentName mComponentName>
	//   16   24:aastore         
	//   17   25:dup             
	//   18   26:iconst_3        
	//   19   27:aload_0         
	//   20   28:getfield        #35  <Field int zztq>
	//   21   31:invokestatic    #82  <Method Integer Integer.valueOf(int)>
	//   22   34:aastore         
	//   23   35:invokestatic    #85  <Method int Objects.hashCode(Object[])>
	//   24   38:ireturn         
	}

	public final String toString()
	{
		String s1 = zzto;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String zzto>
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
	//    9   15:invokevirtual   #89  <Method String ComponentName.flattenToString()>
	//   10   18:astore_1        
		return s;
	//   11   19:aload_1         
	//   12   20:areturn         
	}

	private final ComponentName mComponentName;
	private final String zzto;
	private final String zztp;
	private final int zztq;

	public GmsClientSupervisor$ConnectionStatusConfig(ComponentName componentname, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzto = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #21  <Field String zzto>
		zztp = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #23  <Field String zztp>
		mComponentName = (ComponentName)Preconditions.checkNotNull(((Object) (componentname)));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokestatic    #29  <Method Object Preconditions.checkNotNull(Object)>
	//   11   19:checkcast       #31  <Class ComponentName>
	//   12   22:putfield        #33  <Field ComponentName mComponentName>
		zztq = i;
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:putfield        #35  <Field int zztq>
	//   16   30:return          
	}

	public GmsClientSupervisor$ConnectionStatusConfig(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzto = Preconditions.checkNotEmpty(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #41  <Method String Preconditions.checkNotEmpty(String)>
	//    5    9:putfield        #21  <Field String zzto>
		zztp = "com.google.android.gms";
	//    6   12:aload_0         
	//    7   13:ldc1            #43  <String "com.google.android.gms">
	//    8   15:putfield        #23  <Field String zztp>
		mComponentName = null;
	//    9   18:aload_0         
	//   10   19:aconst_null     
	//   11   20:putfield        #33  <Field ComponentName mComponentName>
		zztq = i;
	//   12   23:aload_0         
	//   13   24:iload_2         
	//   14   25:putfield        #35  <Field int zztq>
	//   15   28:return          
	}

	public GmsClientSupervisor$ConnectionStatusConfig(String s, String s1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzto = Preconditions.checkNotEmpty(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #41  <Method String Preconditions.checkNotEmpty(String)>
	//    5    9:putfield        #21  <Field String zzto>
		zztp = Preconditions.checkNotEmpty(s1);
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:invokestatic    #41  <Method String Preconditions.checkNotEmpty(String)>
	//    9   17:putfield        #23  <Field String zztp>
		mComponentName = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #33  <Field ComponentName mComponentName>
		zztq = i;
	//   13   25:aload_0         
	//   14   26:iload_3         
	//   15   27:putfield        #35  <Field int zztq>
	//   16   30:return          
	}
}

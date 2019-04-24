// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.common.internal.zzac;

public final class zzaaz
{
	private final class zza extends Handler
	{

		public void handleMessage(Message message)
		{
			boolean flag = true;
		//    0    0:iconst_1        
		//    1    1:istore_2        
			if(message.what != 1)
		//*   2    2:aload_1         
		//*   3    3:getfield        #25  <Field int Message.what>
		//*   4    6:iconst_1        
		//*   5    7:icmpne          29
		//*   6   10:iload_2         
		//*   7   11:invokestatic    #31  <Method void zzac.zzas(boolean)>
		//*   8   14:aload_0         
		//*   9   15:getfield        #13  <Field zzaaz zzaBA>
		//*  10   18:aload_1         
		//*  11   19:getfield        #35  <Field Object Message.obj>
		//*  12   22:checkcast       #37  <Class zzaaz$zzc>
		//*  13   25:invokevirtual   #41  <Method void zzaaz.zzb(zzaaz$zzc)>
		//*  14   28:return          
				flag = false;
		//   15   29:iconst_0        
		//   16   30:istore_2        
			zzac.zzas(flag);
			zzaBA.zzb((zzc)message.obj);
		//*  17   31:goto            10
		}

		final zzaaz zzaBA;

		public zza(Looper looper)
		{
			zzaBA = zzaaz.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field zzaaz zzaBA>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #16  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}

	public static final class zzb
	{

		public boolean equals(Object obj)
		{
			if(this != obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
		//*   3    5:iconst_1        
		//*   4    6:ireturn         
			{
				if(!(obj instanceof zzb))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class zzaaz$zzb>
		//*   7   11:ifne            16
					return false;
		//    8   14:iconst_0        
		//    9   15:ireturn         
				obj = ((Object) ((zzb)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class zzaaz$zzb>
		//   12   20:astore_1        
				if(mListener != ((zzb) (obj)).mListener || !zzaBB.equals(((Object) (((zzb) (obj)).zzaBB))))
		//*  13   21:aload_0         
		//*  14   22:getfield        #20  <Field Object mListener>
		//*  15   25:aload_1         
		//*  16   26:getfield        #20  <Field Object mListener>
		//*  17   29:if_acmpne       46
		//*  18   32:aload_0         
		//*  19   33:getfield        #22  <Field String zzaBB>
		//*  20   36:aload_1         
		//*  21   37:getfield        #22  <Field String zzaBB>
		//*  22   40:invokevirtual   #31  <Method boolean String.equals(Object)>
		//*  23   43:ifne            5
					return false;
		//   24   46:iconst_0        
		//   25   47:ireturn         
			}
			return true;
		}

		public int hashCode()
		{
			return System.identityHashCode(mListener) * 31 + zzaBB.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field Object mListener>
		//    2    4:invokestatic    #39  <Method int System.identityHashCode(Object)>
		//    3    7:bipush          31
		//    4    9:imul            
		//    5   10:aload_0         
		//    6   11:getfield        #22  <Field String zzaBB>
		//    7   14:invokevirtual   #41  <Method int String.hashCode()>
		//    8   17:iadd            
		//    9   18:ireturn         
		}

		private final Object mListener;
		private final String zzaBB;

		zzb(Object obj, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			mListener = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field Object mListener>
			zzaBB = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field String zzaBB>
		//    8   14:return          
		}
	}

	public static interface zzc
	{

		public abstract void zzs(Object obj);

		public abstract void zzvy();
	}


	zzaaz(Looper looper, Object obj, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		zzaBy = new zza(looper);
	//    2    4:aload_0         
	//    3    5:new             #7   <Class zzaaz$zza>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #31  <Method void zzaaz$zza(zzaaz, Looper)>
	//    8   14:putfield        #33  <Field zzaaz$zza zzaBy>
		mListener = zzac.zzb(obj, "Listener must not be null");
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:ldc1            #35  <String "Listener must not be null">
	//   12   21:invokestatic    #40  <Method Object zzac.zzb(Object, Object)>
	//   13   24:putfield        #42  <Field Object mListener>
		zzaBz = new zzb(obj, zzac.zzdv(s));
	//   14   27:aload_0         
	//   15   28:new             #10  <Class zzaaz$zzb>
	//   16   31:dup             
	//   17   32:aload_2         
	//   18   33:aload_3         
	//   19   34:invokestatic    #46  <Method String zzac.zzdv(String)>
	//   20   37:invokespecial   #49  <Method void zzaaz$zzb(Object, String)>
	//   21   40:putfield        #51  <Field zzaaz$zzb zzaBz>
	//   22   43:return          
	}

	public void clear()
	{
		mListener = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #42  <Field Object mListener>
	//    3    5:return          
	}

	public void zza(zzc zzc1)
	{
		zzac.zzb(((Object) (zzc1)), "Notifier must not be null");
	//    0    0:aload_1         
	//    1    1:ldc1            #59  <String "Notifier must not be null">
	//    2    3:invokestatic    #40  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		zzc1 = ((zzc) (zzaBy.obtainMessage(1, ((Object) (zzc1)))));
	//    4    7:aload_0         
	//    5    8:getfield        #33  <Field zzaaz$zza zzaBy>
	//    6   11:iconst_1        
	//    7   12:aload_1         
	//    8   13:invokevirtual   #63  <Method Message zzaaz$zza.obtainMessage(int, Object)>
	//    9   16:astore_1        
		zzaBy.sendMessage(((Message) (zzc1)));
	//   10   17:aload_0         
	//   11   18:getfield        #33  <Field zzaaz$zza zzaBy>
	//   12   21:aload_1         
	//   13   22:invokevirtual   #67  <Method boolean zzaaz$zza.sendMessage(Message)>
	//   14   25:pop             
	//   15   26:return          
	}

	void zzb(zzc zzc1)
	{
		Object obj = mListener;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Object mListener>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       16
		{
			zzc1.zzvy();
	//    5    9:aload_1         
	//    6   10:invokeinterface #73  <Method void zzaaz$zzc.zzvy()>
			return;
	//    7   15:return          
		}
		try
		{
			zzc1.zzs(obj);
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokeinterface #77  <Method void zzaaz$zzc.zzs(Object)>
			return;
	//   11   23:return          
		}
		catch(RuntimeException runtimeexception)
	//*  12   24:astore_2        
		{
			zzc1.zzvy();
	//   13   25:aload_1         
	//   14   26:invokeinterface #73  <Method void zzaaz$zzc.zzvy()>
			throw runtimeexception;
	//   15   31:aload_2         
	//   16   32:athrow          
		}
	}

	public zzb zzwp()
	{
		return zzaBz;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field zzaaz$zzb zzaBz>
	//    2    4:areturn         
	}

	private volatile Object mListener;
	private final zza zzaBy;
	private final zzb zzaBz;
}

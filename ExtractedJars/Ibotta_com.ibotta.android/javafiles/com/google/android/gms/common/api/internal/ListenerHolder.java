// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.*;
import com.google.android.gms.common.internal.Preconditions;

public final class ListenerHolder
{
	public static final class ListenerKey
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
			if(!(obj instanceof ListenerKey))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class ListenerHolder$ListenerKey>
		//*   7   11:ifne            16
				return false;
		//    8   14:iconst_0        
		//    9   15:ireturn         
			obj = ((Object) ((ListenerKey)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class ListenerHolder$ListenerKey>
		//   12   20:astore_1        
			return zzli == ((ListenerKey) (obj)).zzli && zzll.equals(((Object) (((ListenerKey) (obj)).zzll)));
		//   13   21:aload_0         
		//   14   22:getfield        #21  <Field Object zzli>
		//   15   25:aload_1         
		//   16   26:getfield        #21  <Field Object zzli>
		//   17   29:if_acmpne       48
		//   18   32:aload_0         
		//   19   33:getfield        #23  <Field String zzll>
		//   20   36:aload_1         
		//   21   37:getfield        #23  <Field String zzll>
		//   22   40:invokevirtual   #33  <Method boolean String.equals(Object)>
		//   23   43:ifeq            48
		//   24   46:iconst_1        
		//   25   47:ireturn         
		//   26   48:iconst_0        
		//   27   49:ireturn         
		}

		public final int hashCode()
		{
			return System.identityHashCode(zzli) * 31 + zzll.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Object zzli>
		//    2    4:invokestatic    #41  <Method int System.identityHashCode(Object)>
		//    3    7:bipush          31
		//    4    9:imul            
		//    5   10:aload_0         
		//    6   11:getfield        #23  <Field String zzll>
		//    7   14:invokevirtual   #43  <Method int String.hashCode()>
		//    8   17:iadd            
		//    9   18:ireturn         
		}

		private final Object zzli;
		private final String zzll;

		ListenerKey(Object obj, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			zzli = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field Object zzli>
			zzll = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field String zzll>
		//    8   14:return          
		}
	}

	public static interface Notifier
	{

		public abstract void notifyListener(Object obj);

		public abstract void onNotifyListenerFailed();
	}

	private final class zza extends Handler
	{

		public final void handleMessage(Message message)
		{
			int i = message.what;
		//    0    0:aload_1         
		//    1    1:getfield        #25  <Field int Message.what>
		//    2    4:istore_2        
			boolean flag = true;
		//    3    5:iconst_1        
		//    4    6:istore_3        
			if(i != 1)
		//*   5    7:iload_2         
		//*   6    8:iconst_1        
		//*   7    9:icmpne          15
		//*   8   12:goto            17
				flag = false;
		//    9   15:iconst_0        
		//   10   16:istore_3        
			Preconditions.checkArgument(flag);
		//   11   17:iload_3         
		//   12   18:invokestatic    #31  <Method void Preconditions.checkArgument(boolean)>
			zzlk.notifyListenerInternal((Notifier)message.obj);
		//   13   21:aload_0         
		//   14   22:getfield        #13  <Field ListenerHolder zzlk>
		//   15   25:aload_1         
		//   16   26:getfield        #35  <Field Object Message.obj>
		//   17   29:checkcast       #37  <Class ListenerHolder$Notifier>
		//   18   32:invokevirtual   #41  <Method void ListenerHolder.notifyListenerInternal(ListenerHolder$Notifier)>
		//   19   35:return          
		}

		private final ListenerHolder zzlk;

		public zza(Looper looper)
		{
			zzlk = ListenerHolder.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ListenerHolder zzlk>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #16  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}


	ListenerHolder(Looper looper, Object obj, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		zzlh = new zza(looper);
	//    2    4:aload_0         
	//    3    5:new             #13  <Class ListenerHolder$zza>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #32  <Method void ListenerHolder$zza(ListenerHolder, Looper)>
	//    8   14:putfield        #34  <Field ListenerHolder$zza zzlh>
		zzli = Preconditions.checkNotNull(obj, "Listener must not be null");
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:ldc1            #36  <String "Listener must not be null">
	//   12   21:invokestatic    #42  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   13   24:putfield        #44  <Field Object zzli>
		zzlj = new ListenerKey(obj, Preconditions.checkNotEmpty(s));
	//   14   27:aload_0         
	//   15   28:new             #7   <Class ListenerHolder$ListenerKey>
	//   16   31:dup             
	//   17   32:aload_2         
	//   18   33:aload_3         
	//   19   34:invokestatic    #48  <Method String Preconditions.checkNotEmpty(String)>
	//   20   37:invokespecial   #51  <Method void ListenerHolder$ListenerKey(Object, String)>
	//   21   40:putfield        #53  <Field ListenerHolder$ListenerKey zzlj>
	//   22   43:return          
	}

	public final void clear()
	{
		zzli = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #44  <Field Object zzli>
	//    3    5:return          
	}

	public final ListenerKey getListenerKey()
	{
		return zzlj;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ListenerHolder$ListenerKey zzlj>
	//    2    4:areturn         
	}

	public final boolean hasListener()
	{
		return zzli != null;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Object zzli>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final void notifyListener(Notifier notifier)
	{
		Preconditions.checkNotNull(((Object) (notifier)), "Notifier must not be null");
	//    0    0:aload_1         
	//    1    1:ldc1            #68  <String "Notifier must not be null">
	//    2    3:invokestatic    #42  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		notifier = ((Notifier) (zzlh.obtainMessage(1, ((Object) (notifier)))));
	//    4    7:aload_0         
	//    5    8:getfield        #34  <Field ListenerHolder$zza zzlh>
	//    6   11:iconst_1        
	//    7   12:aload_1         
	//    8   13:invokevirtual   #72  <Method Message ListenerHolder$zza.obtainMessage(int, Object)>
	//    9   16:astore_1        
		zzlh.sendMessage(((Message) (notifier)));
	//   10   17:aload_0         
	//   11   18:getfield        #34  <Field ListenerHolder$zza zzlh>
	//   12   21:aload_1         
	//   13   22:invokevirtual   #76  <Method boolean ListenerHolder$zza.sendMessage(Message)>
	//   14   25:pop             
	//   15   26:return          
	}

	final void notifyListenerInternal(Notifier notifier)
	{
		Object obj = zzli;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Object zzli>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       16
		{
			notifier.onNotifyListenerFailed();
	//    5    9:aload_1         
	//    6   10:invokeinterface #83  <Method void ListenerHolder$Notifier.onNotifyListenerFailed()>
			return;
	//    7   15:return          
		}
		try
		{
			notifier.notifyListener(obj);
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokeinterface #86  <Method void ListenerHolder$Notifier.notifyListener(Object)>
			return;
	//   11   23:return          
		}
		catch(RuntimeException runtimeexception)
	//*  12   24:astore_2        
		{
			notifier.onNotifyListenerFailed();
	//   13   25:aload_1         
	//   14   26:invokeinterface #83  <Method void ListenerHolder$Notifier.onNotifyListenerFailed()>
			throw runtimeexception;
	//   15   31:aload_2         
	//   16   32:athrow          
		}
	}

	private final zza zzlh;
	private volatile Object zzli;
	private final ListenerKey zzlj;
}

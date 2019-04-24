// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zal;

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
			return zajj == ((ListenerKey) (obj)).zajj && zajm.equals(((Object) (((ListenerKey) (obj)).zajm)));
		//   13   21:aload_0         
		//   14   22:getfield        #21  <Field Object zajj>
		//   15   25:aload_1         
		//   16   26:getfield        #21  <Field Object zajj>
		//   17   29:if_acmpne       48
		//   18   32:aload_0         
		//   19   33:getfield        #23  <Field String zajm>
		//   20   36:aload_1         
		//   21   37:getfield        #23  <Field String zajm>
		//   22   40:invokevirtual   #33  <Method boolean String.equals(Object)>
		//   23   43:ifeq            48
		//   24   46:iconst_1        
		//   25   47:ireturn         
		//   26   48:iconst_0        
		//   27   49:ireturn         
		}

		public final int hashCode()
		{
			return System.identityHashCode(zajj) * 31 + zajm.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Object zajj>
		//    2    4:invokestatic    #41  <Method int System.identityHashCode(Object)>
		//    3    7:bipush          31
		//    4    9:imul            
		//    5   10:aload_0         
		//    6   11:getfield        #23  <Field String zajm>
		//    7   14:invokevirtual   #43  <Method int String.hashCode()>
		//    8   17:iadd            
		//    9   18:ireturn         
		}

		private final Object zajj;
		private final String zajm;

		ListenerKey(Object obj, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			zajj = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field Object zajj>
			zajm = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field String zajm>
		//    8   14:return          
		}
	}

	public static interface Notifier
	{

		public abstract void notifyListener(Object obj);

		public abstract void onNotifyListenerFailed();
	}

	private final class zaa extends zal
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
			zajl.notifyListenerInternal((Notifier)message.obj);
		//   13   21:aload_0         
		//   14   22:getfield        #13  <Field ListenerHolder zajl>
		//   15   25:aload_1         
		//   16   26:getfield        #35  <Field Object Message.obj>
		//   17   29:checkcast       #37  <Class ListenerHolder$Notifier>
		//   18   32:invokevirtual   #41  <Method void ListenerHolder.notifyListenerInternal(ListenerHolder$Notifier)>
		//   19   35:return          
		}

		private final ListenerHolder zajl;

		public zaa(Looper looper)
		{
			zajl = ListenerHolder.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ListenerHolder zajl>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #16  <Method void zal(Looper)>
		//    6   10:return          
		}
	}


	ListenerHolder(Looper looper, Object obj, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		zaji = new zaa(looper);
	//    2    4:aload_0         
	//    3    5:new             #13  <Class ListenerHolder$zaa>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #31  <Method void ListenerHolder$zaa(ListenerHolder, Looper)>
	//    8   14:putfield        #33  <Field ListenerHolder$zaa zaji>
		zajj = Preconditions.checkNotNull(obj, "Listener must not be null");
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:ldc1            #35  <String "Listener must not be null">
	//   12   21:invokestatic    #41  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   13   24:putfield        #43  <Field Object zajj>
		zajk = new ListenerKey(obj, Preconditions.checkNotEmpty(s));
	//   14   27:aload_0         
	//   15   28:new             #7   <Class ListenerHolder$ListenerKey>
	//   16   31:dup             
	//   17   32:aload_2         
	//   18   33:aload_3         
	//   19   34:invokestatic    #47  <Method String Preconditions.checkNotEmpty(String)>
	//   20   37:invokespecial   #50  <Method void ListenerHolder$ListenerKey(Object, String)>
	//   21   40:putfield        #52  <Field ListenerHolder$ListenerKey zajk>
	//   22   43:return          
	}

	public final void clear()
	{
		zajj = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #43  <Field Object zajj>
	//    3    5:return          
	}

	public final ListenerKey getListenerKey()
	{
		return zajk;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ListenerHolder$ListenerKey zajk>
	//    2    4:areturn         
	}

	public final boolean hasListener()
	{
		return zajj != null;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object zajj>
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
	//    1    1:ldc1            #66  <String "Notifier must not be null">
	//    2    3:invokestatic    #41  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		notifier = ((Notifier) (zaji.obtainMessage(1, ((Object) (notifier)))));
	//    4    7:aload_0         
	//    5    8:getfield        #33  <Field ListenerHolder$zaa zaji>
	//    6   11:iconst_1        
	//    7   12:aload_1         
	//    8   13:invokevirtual   #70  <Method Message ListenerHolder$zaa.obtainMessage(int, Object)>
	//    9   16:astore_1        
		zaji.sendMessage(((Message) (notifier)));
	//   10   17:aload_0         
	//   11   18:getfield        #33  <Field ListenerHolder$zaa zaji>
	//   12   21:aload_1         
	//   13   22:invokevirtual   #74  <Method boolean ListenerHolder$zaa.sendMessage(Message)>
	//   14   25:pop             
	//   15   26:return          
	}

	final void notifyListenerInternal(Notifier notifier)
	{
		Object obj = zajj;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Object zajj>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       16
		{
			notifier.onNotifyListenerFailed();
	//    5    9:aload_1         
	//    6   10:invokeinterface #81  <Method void ListenerHolder$Notifier.onNotifyListenerFailed()>
			return;
	//    7   15:return          
		}
		try
		{
			notifier.notifyListener(obj);
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokeinterface #84  <Method void ListenerHolder$Notifier.notifyListener(Object)>
			return;
	//   11   23:return          
		}
		catch(RuntimeException runtimeexception)
	//*  12   24:astore_2        
		{
			notifier.onNotifyListenerFailed();
	//   13   25:aload_1         
	//   14   26:invokeinterface #81  <Method void ListenerHolder$Notifier.onNotifyListenerFailed()>
			throw runtimeexception;
	//   15   31:aload_2         
	//   16   32:athrow          
		}
	}

	private final zaa zaji;
	private volatile Object zajj;
	private final ListenerKey zajk;
}

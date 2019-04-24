// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//			Task

public class OneoffTask extends Task
{
	public static class Builder extends Task.Builder
	{

		static long zza(Builder builder)
		{
			return builder.zzbgi;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field long zzbgi>
		//    2    4:lreturn         
		}

		static long zzb(Builder builder)
		{
			return builder.zzbgj;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field long zzbgj>
		//    2    4:lreturn         
		}

		public OneoffTask build()
		{
			checkConditions();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #33  <Method void checkConditions()>
			return new OneoffTask(this);
		//    2    4:new             #6   <Class OneoffTask>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:aconst_null     
		//    6   10:invokespecial   #36  <Method void OneoffTask(OneoffTask$Builder, OneoffTask$1)>
		//    7   13:areturn         
		}

		public volatile Task build()
		{
			return ((Task) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #39  <Method OneoffTask build()>
		//    2    4:areturn         
		}

		protected void checkConditions()
		{
			super.checkConditions();
		//    0    0:aload_0         
		//    1    1:invokespecial   #40  <Method void Task$Builder.checkConditions()>
			if(zzbgi == -1L || zzbgj == -1L)
		//*   2    4:aload_0         
		//*   3    5:getfield        #18  <Field long zzbgi>
		//*   4    8:ldc2w           #15  <Long -1L>
		//*   5   11:lcmp            
		//*   6   12:ifeq            26
		//*   7   15:aload_0         
		//*   8   16:getfield        #20  <Field long zzbgj>
		//*   9   19:ldc2w           #15  <Long -1L>
		//*  10   22:lcmp            
		//*  11   23:ifne            36
				throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
		//   12   26:new             #42  <Class IllegalArgumentException>
		//   13   29:dup             
		//   14   30:ldc1            #44  <String "Must specify an execution window using setExecutionWindow.">
		//   15   32:invokespecial   #47  <Method void IllegalArgumentException(String)>
		//   16   35:athrow          
			if(zzbgi >= zzbgj)
		//*  17   36:aload_0         
		//*  18   37:getfield        #18  <Field long zzbgi>
		//*  19   40:aload_0         
		//*  20   41:getfield        #20  <Field long zzbgj>
		//*  21   44:lcmp            
		//*  22   45:iflt            58
				throw new IllegalArgumentException("Window start must be shorter than window end.");
		//   23   48:new             #42  <Class IllegalArgumentException>
		//   24   51:dup             
		//   25   52:ldc1            #49  <String "Window start must be shorter than window end.">
		//   26   54:invokespecial   #47  <Method void IllegalArgumentException(String)>
		//   27   57:athrow          
			else
				return;
		//   28   58:return          
		}

		public Builder setExecutionWindow(long l, long l1)
		{
			zzbgi = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #18  <Field long zzbgi>
			zzbgj = l1;
		//    3    5:aload_0         
		//    4    6:lload_3         
		//    5    7:putfield        #20  <Field long zzbgj>
			return this;
		//    6   10:aload_0         
		//    7   11:areturn         
		}

		public Builder setExtras(Bundle bundle)
		{
			extras = bundle;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #57  <Field Bundle extras>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public volatile Task.Builder setExtras(Bundle bundle)
		{
			return ((Task.Builder) (setExtras(bundle)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #60  <Method OneoffTask$Builder setExtras(Bundle)>
		//    3    5:areturn         
		}

		public Builder setPersisted(boolean flag)
		{
			isPersisted = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #24  <Field boolean isPersisted>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public volatile Task.Builder setPersisted(boolean flag)
		{
			return ((Task.Builder) (setPersisted(flag)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #65  <Method OneoffTask$Builder setPersisted(boolean)>
		//    3    5:areturn         
		}

		public Builder setRequiredNetwork(int i)
		{
			requiredNetworkState = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #71  <Field int requiredNetworkState>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public volatile Task.Builder setRequiredNetwork(int i)
		{
			return ((Task.Builder) (setRequiredNetwork(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #74  <Method OneoffTask$Builder setRequiredNetwork(int)>
		//    3    5:areturn         
		}

		public Builder setRequiresCharging(boolean flag)
		{
			requiresCharging = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #78  <Field boolean requiresCharging>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public volatile Task.Builder setRequiresCharging(boolean flag)
		{
			return ((Task.Builder) (setRequiresCharging(flag)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #80  <Method OneoffTask$Builder setRequiresCharging(boolean)>
		//    3    5:areturn         
		}

		public Builder setService(Class class1)
		{
			gcmTaskService = class1.getName();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #88  <Method String Class.getName()>
		//    3    5:putfield        #92  <Field String gcmTaskService>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public volatile Task.Builder setService(Class class1)
		{
			return ((Task.Builder) (setService(class1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #97  <Method OneoffTask$Builder setService(Class)>
		//    3    5:areturn         
		}

		public Builder setTag(String s)
		{
			tag = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #102 <Field String tag>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public volatile Task.Builder setTag(String s)
		{
			return ((Task.Builder) (setTag(s)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #105 <Method OneoffTask$Builder setTag(String)>
		//    3    5:areturn         
		}

		public Builder setUpdateCurrent(boolean flag)
		{
			updateCurrent = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #109 <Field boolean updateCurrent>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public volatile Task.Builder setUpdateCurrent(boolean flag)
		{
			return ((Task.Builder) (setUpdateCurrent(flag)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #111 <Method OneoffTask$Builder setUpdateCurrent(boolean)>
		//    3    5:areturn         
		}

		private long zzbgi;
		private long zzbgj;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Task$Builder()>
			zzbgi = -1L;
		//    2    4:aload_0         
		//    3    5:ldc2w           #15  <Long -1L>
		//    4    8:putfield        #18  <Field long zzbgi>
			zzbgj = -1L;
		//    5   11:aload_0         
		//    6   12:ldc2w           #15  <Long -1L>
		//    7   15:putfield        #20  <Field long zzbgj>
			isPersisted = false;
		//    8   18:aload_0         
		//    9   19:iconst_0        
		//   10   20:putfield        #24  <Field boolean isPersisted>
		//   11   23:return          
		}
	}


	private OneoffTask(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void Task(Parcel)>
		zzbgg = parcel.readLong();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #33  <Method long Parcel.readLong()>
	//    6   10:putfield        #35  <Field long zzbgg>
		zzbgh = parcel.readLong();
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #33  <Method long Parcel.readLong()>
	//   10   18:putfield        #37  <Field long zzbgh>
	//   11   21:return          
	}


	private OneoffTask(Builder builder)
	{
		super(((Task.Builder) (builder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method void Task(Task$Builder)>
		zzbgg = Builder.zza(builder);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #48  <Method long OneoffTask$Builder.zza(OneoffTask$Builder)>
	//    6   10:putfield        #35  <Field long zzbgg>
		zzbgh = Builder.zzb(builder);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokestatic    #51  <Method long OneoffTask$Builder.zzb(OneoffTask$Builder)>
	//   10   18:putfield        #37  <Field long zzbgh>
	//   11   21:return          
	}


	public long getWindowEnd()
	{
		return zzbgh;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long zzbgh>
	//    2    4:lreturn         
	}

	public long getWindowStart()
	{
		return zzbgg;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field long zzbgg>
	//    2    4:lreturn         
	}

	public void toBundle(Bundle bundle)
	{
		super.toBundle(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #60  <Method void Task.toBundle(Bundle)>
		bundle.putLong("window_start", zzbgg);
	//    3    5:aload_1         
	//    4    6:ldc1            #62  <String "window_start">
	//    5    8:aload_0         
	//    6    9:getfield        #35  <Field long zzbgg>
	//    7   12:invokevirtual   #68  <Method void Bundle.putLong(String, long)>
		bundle.putLong("window_end", zzbgh);
	//    8   15:aload_1         
	//    9   16:ldc1            #70  <String "window_end">
	//   10   18:aload_0         
	//   11   19:getfield        #37  <Field long zzbgh>
	//   12   22:invokevirtual   #68  <Method void Bundle.putLong(String, long)>
	//   13   25:return          
	}

	public String toString()
	{
		String s = String.valueOf(((Object) (((Object)this).toString())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method String Object.toString()>
	//    2    4:invokestatic    #82  <Method String String.valueOf(Object)>
	//    3    7:astore          5
		long l = getWindowStart();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #84  <Method long getWindowStart()>
	//    6   13:lstore_1        
		long l1 = getWindowEnd();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #86  <Method long getWindowEnd()>
	//    9   18:lstore_3        
		return (new StringBuilder(String.valueOf(((Object) (s))).length() + 64)).append(s).append(" windowStart=").append(l).append(" windowEnd=").append(l1).toString();
	//   10   19:new             #88  <Class StringBuilder>
	//   11   22:dup             
	//   12   23:aload           5
	//   13   25:invokestatic    #82  <Method String String.valueOf(Object)>
	//   14   28:invokevirtual   #92  <Method int String.length()>
	//   15   31:bipush          64
	//   16   33:iadd            
	//   17   34:invokespecial   #95  <Method void StringBuilder(int)>
	//   18   37:aload           5
	//   19   39:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   20   42:ldc1            #101 <String " windowStart=">
	//   21   44:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   22   47:lload_1         
	//   23   48:invokevirtual   #104 <Method StringBuilder StringBuilder.append(long)>
	//   24   51:ldc1            #106 <String " windowEnd=">
	//   25   53:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   26   56:lload_3         
	//   27   57:invokevirtual   #104 <Method StringBuilder StringBuilder.append(long)>
	//   28   60:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   29   63:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #111 <Method void Task.writeToParcel(Parcel, int)>
		parcel.writeLong(zzbgg);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #35  <Field long zzbgg>
	//    7   11:invokevirtual   #115 <Method void Parcel.writeLong(long)>
		parcel.writeLong(zzbgh);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #37  <Field long zzbgh>
	//   11   19:invokevirtual   #115 <Method void Parcel.writeLong(long)>
	//   12   22:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (zzgh(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method OneoffTask zzgh(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (zzju(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #26  <Method OneoffTask[] zzju(int)>
		//    3    5:areturn         
		}

		public OneoffTask zzgh(Parcel parcel)
		{
			return new OneoffTask(parcel);
		//    0    0:new             #9   <Class OneoffTask>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #29  <Method void OneoffTask(Parcel, OneoffTask$1)>
		//    5    9:areturn         
		}

		public OneoffTask[] zzju(int i)
		{
			return new OneoffTask[i];
		//    0    0:iload_1         
		//    1    1:anewarray       OneoffTask[]
		//    2    4:areturn         
		}

	}
;
	private final long zzbgg;
	private final long zzbgh;

	static 
	{
	//    0    0:new             #6   <Class OneoffTask$1>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void OneoffTask$1()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}

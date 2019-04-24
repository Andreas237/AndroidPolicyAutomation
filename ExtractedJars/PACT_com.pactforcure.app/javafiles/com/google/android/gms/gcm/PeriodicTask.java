// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//			Task

public class PeriodicTask extends Task
{
	public static class Builder extends Task.Builder
	{

		static long zza(Builder builder)
		{
			return builder.zzbgk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field long zzbgk>
		//    2    4:lreturn         
		}

		static long zzb(Builder builder)
		{
			return builder.zzbgl;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field long zzbgl>
		//    2    4:lreturn         
		}

		public PeriodicTask build()
		{
			checkConditions();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #33  <Method void checkConditions()>
			return new PeriodicTask(this);
		//    2    4:new             #6   <Class PeriodicTask>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:aconst_null     
		//    6   10:invokespecial   #36  <Method void PeriodicTask(PeriodicTask$Builder, PeriodicTask$1)>
		//    7   13:areturn         
		}

		public volatile Task build()
		{
			return ((Task) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #39  <Method PeriodicTask build()>
		//    2    4:areturn         
		}

		protected void checkConditions()
		{
			super.checkConditions();
		//    0    0:aload_0         
		//    1    1:invokespecial   #40  <Method void Task$Builder.checkConditions()>
			if(zzbgk == -1L)
		//*   2    4:aload_0         
		//*   3    5:getfield        #18  <Field long zzbgk>
		//*   4    8:ldc2w           #15  <Long -1L>
		//*   5   11:lcmp            
		//*   6   12:ifne            25
				throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
		//    7   15:new             #42  <Class IllegalArgumentException>
		//    8   18:dup             
		//    9   19:ldc1            #44  <String "Must call setPeriod(long) to establish an execution interval for this periodic task.">
		//   10   21:invokespecial   #47  <Method void IllegalArgumentException(String)>
		//   11   24:athrow          
			if(zzbgk <= 0L)
		//*  12   25:aload_0         
		//*  13   26:getfield        #18  <Field long zzbgk>
		//*  14   29:lconst_0        
		//*  15   30:lcmp            
		//*  16   31:ifgt            68
			{
				long l = zzbgk;
		//   17   34:aload_0         
		//   18   35:getfield        #18  <Field long zzbgk>
		//   19   38:lstore_1        
				throw new IllegalArgumentException((new StringBuilder(66)).append("Period set cannot be less than or equal to 0: ").append(l).toString());
		//   20   39:new             #42  <Class IllegalArgumentException>
		//   21   42:dup             
		//   22   43:new             #49  <Class StringBuilder>
		//   23   46:dup             
		//   24   47:bipush          66
		//   25   49:invokespecial   #52  <Method void StringBuilder(int)>
		//   26   52:ldc1            #54  <String "Period set cannot be less than or equal to 0: ">
		//   27   54:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   28   57:lload_1         
		//   29   58:invokevirtual   #61  <Method StringBuilder StringBuilder.append(long)>
		//   30   61:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   31   64:invokespecial   #47  <Method void IllegalArgumentException(String)>
		//   32   67:athrow          
			}
			if(zzbgl == -1L)
		//*  33   68:aload_0         
		//*  34   69:getfield        #20  <Field long zzbgl>
		//*  35   72:ldc2w           #15  <Long -1L>
		//*  36   75:lcmp            
		//*  37   76:ifne            93
				zzbgl = (long)((float)zzbgk * 0.1F);
		//   38   79:aload_0         
		//   39   80:aload_0         
		//   40   81:getfield        #18  <Field long zzbgk>
		//   41   84:l2f             
		//   42   85:ldc1            #66  <Float 0.1F>
		//   43   87:fmul            
		//   44   88:f2l             
		//   45   89:putfield        #20  <Field long zzbgl>
			else
		//*  46   92:return          
			if(zzbgl > zzbgk)
		//*  47   93:aload_0         
		//*  48   94:getfield        #20  <Field long zzbgl>
		//*  49   97:aload_0         
		//*  50   98:getfield        #18  <Field long zzbgk>
		//*  51  101:lcmp            
		//*  52  102:ifle            92
			{
				zzbgl = zzbgk;
		//   53  105:aload_0         
		//   54  106:aload_0         
		//   55  107:getfield        #18  <Field long zzbgk>
		//   56  110:putfield        #20  <Field long zzbgl>
				return;
		//   57  113:return          
			}
		}

		public Builder setExtras(Bundle bundle)
		{
			extras = bundle;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #72  <Field Bundle extras>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public volatile Task.Builder setExtras(Bundle bundle)
		{
			return ((Task.Builder) (setExtras(bundle)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #75  <Method PeriodicTask$Builder setExtras(Bundle)>
		//    3    5:areturn         
		}

		public Builder setFlex(long l)
		{
			zzbgl = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #20  <Field long zzbgl>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setPeriod(long l)
		{
			zzbgk = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #18  <Field long zzbgk>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
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
		//    2    2:invokevirtual   #83  <Method PeriodicTask$Builder setPersisted(boolean)>
		//    3    5:areturn         
		}

		public Builder setRequiredNetwork(int i)
		{
			requiredNetworkState = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #89  <Field int requiredNetworkState>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public volatile Task.Builder setRequiredNetwork(int i)
		{
			return ((Task.Builder) (setRequiredNetwork(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #92  <Method PeriodicTask$Builder setRequiredNetwork(int)>
		//    3    5:areturn         
		}

		public Builder setRequiresCharging(boolean flag)
		{
			requiresCharging = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #96  <Field boolean requiresCharging>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public volatile Task.Builder setRequiresCharging(boolean flag)
		{
			return ((Task.Builder) (setRequiresCharging(flag)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #98  <Method PeriodicTask$Builder setRequiresCharging(boolean)>
		//    3    5:areturn         
		}

		public Builder setService(Class class1)
		{
			gcmTaskService = class1.getName();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #105 <Method String Class.getName()>
		//    3    5:putfield        #109 <Field String gcmTaskService>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public volatile Task.Builder setService(Class class1)
		{
			return ((Task.Builder) (setService(class1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #114 <Method PeriodicTask$Builder setService(Class)>
		//    3    5:areturn         
		}

		public Builder setTag(String s)
		{
			tag = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #119 <Field String tag>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public volatile Task.Builder setTag(String s)
		{
			return ((Task.Builder) (setTag(s)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #122 <Method PeriodicTask$Builder setTag(String)>
		//    3    5:areturn         
		}

		public Builder setUpdateCurrent(boolean flag)
		{
			updateCurrent = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #126 <Field boolean updateCurrent>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public volatile Task.Builder setUpdateCurrent(boolean flag)
		{
			return ((Task.Builder) (setUpdateCurrent(flag)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #128 <Method PeriodicTask$Builder setUpdateCurrent(boolean)>
		//    3    5:areturn         
		}

		private long zzbgk;
		private long zzbgl;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Task$Builder()>
			zzbgk = -1L;
		//    2    4:aload_0         
		//    3    5:ldc2w           #15  <Long -1L>
		//    4    8:putfield        #18  <Field long zzbgk>
			zzbgl = -1L;
		//    5   11:aload_0         
		//    6   12:ldc2w           #15  <Long -1L>
		//    7   15:putfield        #20  <Field long zzbgl>
			isPersisted = true;
		//    8   18:aload_0         
		//    9   19:iconst_1        
		//   10   20:putfield        #24  <Field boolean isPersisted>
		//   11   23:return          
		}
	}


	private PeriodicTask(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void Task(Parcel)>
		mIntervalInSeconds = -1L;
	//    3    5:aload_0         
	//    4    6:ldc2w           #28  <Long -1L>
	//    5    9:putfield        #31  <Field long mIntervalInSeconds>
		mFlexInSeconds = -1L;
	//    6   12:aload_0         
	//    7   13:ldc2w           #28  <Long -1L>
	//    8   16:putfield        #33  <Field long mFlexInSeconds>
		mIntervalInSeconds = parcel.readLong();
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #39  <Method long Parcel.readLong()>
	//   12   24:putfield        #31  <Field long mIntervalInSeconds>
		mFlexInSeconds = Math.min(parcel.readLong(), mIntervalInSeconds);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #39  <Method long Parcel.readLong()>
	//   16   32:aload_0         
	//   17   33:getfield        #31  <Field long mIntervalInSeconds>
	//   18   36:invokestatic    #45  <Method long Math.min(long, long)>
	//   19   39:putfield        #33  <Field long mFlexInSeconds>
	//   20   42:return          
	}


	private PeriodicTask(Builder builder)
	{
		super(((Task.Builder) (builder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method void Task(Task$Builder)>
		mIntervalInSeconds = -1L;
	//    3    5:aload_0         
	//    4    6:ldc2w           #28  <Long -1L>
	//    5    9:putfield        #31  <Field long mIntervalInSeconds>
		mFlexInSeconds = -1L;
	//    6   12:aload_0         
	//    7   13:ldc2w           #28  <Long -1L>
	//    8   16:putfield        #33  <Field long mFlexInSeconds>
		mIntervalInSeconds = Builder.zza(builder);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokestatic    #56  <Method long PeriodicTask$Builder.zza(PeriodicTask$Builder)>
	//   12   24:putfield        #31  <Field long mIntervalInSeconds>
		mFlexInSeconds = Math.min(Builder.zzb(builder), mIntervalInSeconds);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokestatic    #59  <Method long PeriodicTask$Builder.zzb(PeriodicTask$Builder)>
	//   16   32:aload_0         
	//   17   33:getfield        #31  <Field long mIntervalInSeconds>
	//   18   36:invokestatic    #45  <Method long Math.min(long, long)>
	//   19   39:putfield        #33  <Field long mFlexInSeconds>
	//   20   42:return          
	}


	public long getFlex()
	{
		return mFlexInSeconds;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field long mFlexInSeconds>
	//    2    4:lreturn         
	}

	public long getPeriod()
	{
		return mIntervalInSeconds;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field long mIntervalInSeconds>
	//    2    4:lreturn         
	}

	public void toBundle(Bundle bundle)
	{
		super.toBundle(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #68  <Method void Task.toBundle(Bundle)>
		bundle.putLong("period", mIntervalInSeconds);
	//    3    5:aload_1         
	//    4    6:ldc1            #70  <String "period">
	//    5    8:aload_0         
	//    6    9:getfield        #31  <Field long mIntervalInSeconds>
	//    7   12:invokevirtual   #76  <Method void Bundle.putLong(String, long)>
		bundle.putLong("period_flex", mFlexInSeconds);
	//    8   15:aload_1         
	//    9   16:ldc1            #78  <String "period_flex">
	//   10   18:aload_0         
	//   11   19:getfield        #33  <Field long mFlexInSeconds>
	//   12   22:invokevirtual   #76  <Method void Bundle.putLong(String, long)>
	//   13   25:return          
	}

	public String toString()
	{
		String s = String.valueOf(((Object) (((Object)this).toString())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method String Object.toString()>
	//    2    4:invokestatic    #90  <Method String String.valueOf(Object)>
	//    3    7:astore          5
		long l = getPeriod();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #92  <Method long getPeriod()>
	//    6   13:lstore_1        
		long l1 = getFlex();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #94  <Method long getFlex()>
	//    9   18:lstore_3        
		return (new StringBuilder(String.valueOf(((Object) (s))).length() + 54)).append(s).append(" period=").append(l).append(" flex=").append(l1).toString();
	//   10   19:new             #96  <Class StringBuilder>
	//   11   22:dup             
	//   12   23:aload           5
	//   13   25:invokestatic    #90  <Method String String.valueOf(Object)>
	//   14   28:invokevirtual   #100 <Method int String.length()>
	//   15   31:bipush          54
	//   16   33:iadd            
	//   17   34:invokespecial   #103 <Method void StringBuilder(int)>
	//   18   37:aload           5
	//   19   39:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   20   42:ldc1            #109 <String " period=">
	//   21   44:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   22   47:lload_1         
	//   23   48:invokevirtual   #112 <Method StringBuilder StringBuilder.append(long)>
	//   24   51:ldc1            #114 <String " flex=">
	//   25   53:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:lload_3         
	//   27   57:invokevirtual   #112 <Method StringBuilder StringBuilder.append(long)>
	//   28   60:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   29   63:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #119 <Method void Task.writeToParcel(Parcel, int)>
		parcel.writeLong(mIntervalInSeconds);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #31  <Field long mIntervalInSeconds>
	//    7   11:invokevirtual   #123 <Method void Parcel.writeLong(long)>
		parcel.writeLong(mFlexInSeconds);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #33  <Field long mFlexInSeconds>
	//   11   19:invokevirtual   #123 <Method void Parcel.writeLong(long)>
	//   12   22:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (zzgj(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method PeriodicTask zzgj(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (zzjw(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #26  <Method PeriodicTask[] zzjw(int)>
		//    3    5:areturn         
		}

		public PeriodicTask zzgj(Parcel parcel)
		{
			return new PeriodicTask(parcel);
		//    0    0:new             #9   <Class PeriodicTask>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #29  <Method void PeriodicTask(Parcel, PeriodicTask$1)>
		//    5    9:areturn         
		}

		public PeriodicTask[] zzjw(int i)
		{
			return new PeriodicTask[i];
		//    0    0:iload_1         
		//    1    1:anewarray       PeriodicTask[]
		//    2    4:areturn         
		}

	}
;
	protected long mFlexInSeconds;
	protected long mIntervalInSeconds;

	static 
	{
	//    0    0:new             #6   <Class PeriodicTask$1>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void PeriodicTask$1()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}

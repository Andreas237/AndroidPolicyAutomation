// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import android.net.Uri;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

// Referenced classes of package androidx.work:
//			NetworkType, ContentUriTriggers

public final class Constraints
{
	public static final class Builder
	{

		public Builder addContentUriTrigger(Uri uri, boolean flag)
		{
			mContentUriTriggers.add(uri, flag);
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field ContentUriTriggers mContentUriTriggers>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #60  <Method void ContentUriTriggers.add(Uri, boolean)>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Constraints build()
		{
			return new Constraints(this);
		//    0    0:new             #6   <Class Constraints>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #67  <Method void Constraints(Constraints$Builder)>
		//    4    8:areturn         
		}

		public Builder setRequiredNetworkType(NetworkType networktype)
		{
			mRequiredNetworkType = networktype;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #34  <Field NetworkType mRequiredNetworkType>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setRequiresBatteryNotLow(boolean flag)
		{
			mRequiresBatteryNotLow = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #36  <Field boolean mRequiresBatteryNotLow>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setRequiresCharging(boolean flag)
		{
			mRequiresCharging = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #25  <Field boolean mRequiresCharging>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setRequiresDeviceIdle(boolean flag)
		{
			mRequiresDeviceIdle = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #27  <Field boolean mRequiresDeviceIdle>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setRequiresStorageNotLow(boolean flag)
		{
			mRequiresStorageNotLow = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #38  <Field boolean mRequiresStorageNotLow>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setTriggerContentMaxDelay(long l, TimeUnit timeunit)
		{
			mTriggerContentMaxDelay = timeunit.toMillis(l);
		//    0    0:aload_0         
		//    1    1:aload_3         
		//    2    2:lload_1         
		//    3    3:invokevirtual   #83  <Method long TimeUnit.toMillis(long)>
		//    4    6:putfield        #44  <Field long mTriggerContentMaxDelay>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder setTriggerContentMaxDelay(Duration duration)
		{
			mTriggerContentMaxDelay = duration.toMillis();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #90  <Method long Duration.toMillis()>
		//    3    5:putfield        #44  <Field long mTriggerContentMaxDelay>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setTriggerContentUpdateDelay(long l, TimeUnit timeunit)
		{
			mTriggerContentUpdateDelay = timeunit.toMillis(l);
		//    0    0:aload_0         
		//    1    1:aload_3         
		//    2    2:lload_1         
		//    3    3:invokevirtual   #83  <Method long TimeUnit.toMillis(long)>
		//    4    6:putfield        #42  <Field long mTriggerContentUpdateDelay>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder setTriggerContentUpdateDelay(Duration duration)
		{
			mTriggerContentUpdateDelay = duration.toMillis();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #90  <Method long Duration.toMillis()>
		//    3    5:putfield        #42  <Field long mTriggerContentUpdateDelay>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		ContentUriTriggers mContentUriTriggers;
		NetworkType mRequiredNetworkType;
		boolean mRequiresBatteryNotLow;
		boolean mRequiresCharging;
		boolean mRequiresDeviceIdle;
		boolean mRequiresStorageNotLow;
		long mTriggerContentMaxDelay;
		long mTriggerContentUpdateDelay;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			mRequiresCharging = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #25  <Field boolean mRequiresCharging>
			mRequiresDeviceIdle = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #27  <Field boolean mRequiresDeviceIdle>
			mRequiredNetworkType = NetworkType.NOT_REQUIRED;
		//    8   14:aload_0         
		//    9   15:getstatic       #32  <Field NetworkType NetworkType.NOT_REQUIRED>
		//   10   18:putfield        #34  <Field NetworkType mRequiredNetworkType>
			mRequiresBatteryNotLow = false;
		//   11   21:aload_0         
		//   12   22:iconst_0        
		//   13   23:putfield        #36  <Field boolean mRequiresBatteryNotLow>
			mRequiresStorageNotLow = false;
		//   14   26:aload_0         
		//   15   27:iconst_0        
		//   16   28:putfield        #38  <Field boolean mRequiresStorageNotLow>
			mTriggerContentUpdateDelay = -1L;
		//   17   31:aload_0         
		//   18   32:ldc2w           #39  <Long -1L>
		//   19   35:putfield        #42  <Field long mTriggerContentUpdateDelay>
			mTriggerContentMaxDelay = -1L;
		//   20   38:aload_0         
		//   21   39:ldc2w           #39  <Long -1L>
		//   22   42:putfield        #44  <Field long mTriggerContentMaxDelay>
			mContentUriTriggers = new ContentUriTriggers();
		//   23   45:aload_0         
		//   24   46:new             #46  <Class ContentUriTriggers>
		//   25   49:dup             
		//   26   50:invokespecial   #47  <Method void ContentUriTriggers()>
		//   27   53:putfield        #49  <Field ContentUriTriggers mContentUriTriggers>
		//   28   56:return          
		}
	}


	public Constraints()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		mRequiredNetworkType = NetworkType.NOT_REQUIRED;
	//    2    4:aload_0         
	//    3    5:getstatic       #53  <Field NetworkType NetworkType.NOT_REQUIRED>
	//    4    8:putfield        #55  <Field NetworkType mRequiredNetworkType>
		mTriggerContentUpdateDelay = -1L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #56  <Long -1L>
	//    7   15:putfield        #59  <Field long mTriggerContentUpdateDelay>
		mTriggerMaxContentDelay = -1L;
	//    8   18:aload_0         
	//    9   19:ldc2w           #56  <Long -1L>
	//   10   22:putfield        #61  <Field long mTriggerMaxContentDelay>
		mContentUriTriggers = new ContentUriTriggers();
	//   11   25:aload_0         
	//   12   26:new             #63  <Class ContentUriTriggers>
	//   13   29:dup             
	//   14   30:invokespecial   #64  <Method void ContentUriTriggers()>
	//   15   33:putfield        #66  <Field ContentUriTriggers mContentUriTriggers>
	//   16   36:return          
	}

	Constraints(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		mRequiredNetworkType = NetworkType.NOT_REQUIRED;
	//    2    4:aload_0         
	//    3    5:getstatic       #53  <Field NetworkType NetworkType.NOT_REQUIRED>
	//    4    8:putfield        #55  <Field NetworkType mRequiredNetworkType>
		mTriggerContentUpdateDelay = -1L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #56  <Long -1L>
	//    7   15:putfield        #59  <Field long mTriggerContentUpdateDelay>
		mTriggerMaxContentDelay = -1L;
	//    8   18:aload_0         
	//    9   19:ldc2w           #56  <Long -1L>
	//   10   22:putfield        #61  <Field long mTriggerMaxContentDelay>
		mContentUriTriggers = new ContentUriTriggers();
	//   11   25:aload_0         
	//   12   26:new             #63  <Class ContentUriTriggers>
	//   13   29:dup             
	//   14   30:invokespecial   #64  <Method void ContentUriTriggers()>
	//   15   33:putfield        #66  <Field ContentUriTriggers mContentUriTriggers>
		mRequiresCharging = builder.mRequiresCharging;
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:getfield        #70  <Field boolean Constraints$Builder.mRequiresCharging>
	//   19   41:putfield        #71  <Field boolean mRequiresCharging>
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 23 && builder.mRequiresDeviceIdle)
	//*  20   44:getstatic       #77  <Field int android.os.Build$VERSION.SDK_INT>
	//*  21   47:bipush          23
	//*  22   49:icmplt          64
	//*  23   52:aload_1         
	//*  24   53:getfield        #79  <Field boolean Constraints$Builder.mRequiresDeviceIdle>
	//*  25   56:ifeq            64
			flag = true;
	//   26   59:iconst_1        
	//   27   60:istore_2        
		else
	//*  28   61:goto            66
			flag = false;
	//   29   64:iconst_0        
	//   30   65:istore_2        
		mRequiresDeviceIdle = flag;
	//   31   66:aload_0         
	//   32   67:iload_2         
	//   33   68:putfield        #80  <Field boolean mRequiresDeviceIdle>
		mRequiredNetworkType = builder.mRequiredNetworkType;
	//   34   71:aload_0         
	//   35   72:aload_1         
	//   36   73:getfield        #81  <Field NetworkType Constraints$Builder.mRequiredNetworkType>
	//   37   76:putfield        #55  <Field NetworkType mRequiredNetworkType>
		mRequiresBatteryNotLow = builder.mRequiresBatteryNotLow;
	//   38   79:aload_0         
	//   39   80:aload_1         
	//   40   81:getfield        #83  <Field boolean Constraints$Builder.mRequiresBatteryNotLow>
	//   41   84:putfield        #84  <Field boolean mRequiresBatteryNotLow>
		mRequiresStorageNotLow = builder.mRequiresStorageNotLow;
	//   42   87:aload_0         
	//   43   88:aload_1         
	//   44   89:getfield        #86  <Field boolean Constraints$Builder.mRequiresStorageNotLow>
	//   45   92:putfield        #87  <Field boolean mRequiresStorageNotLow>
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  46   95:getstatic       #77  <Field int android.os.Build$VERSION.SDK_INT>
	//*  47   98:bipush          24
	//*  48  100:icmplt          127
		{
			mContentUriTriggers = builder.mContentUriTriggers;
	//   49  103:aload_0         
	//   50  104:aload_1         
	//   51  105:getfield        #88  <Field ContentUriTriggers Constraints$Builder.mContentUriTriggers>
	//   52  108:putfield        #66  <Field ContentUriTriggers mContentUriTriggers>
			mTriggerContentUpdateDelay = builder.mTriggerContentUpdateDelay;
	//   53  111:aload_0         
	//   54  112:aload_1         
	//   55  113:getfield        #89  <Field long Constraints$Builder.mTriggerContentUpdateDelay>
	//   56  116:putfield        #59  <Field long mTriggerContentUpdateDelay>
			mTriggerMaxContentDelay = builder.mTriggerContentMaxDelay;
	//   57  119:aload_0         
	//   58  120:aload_1         
	//   59  121:getfield        #92  <Field long Constraints$Builder.mTriggerContentMaxDelay>
	//   60  124:putfield        #61  <Field long mTriggerMaxContentDelay>
		}
	//   61  127:return          
	}

	public Constraints(Constraints constraints)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		mRequiredNetworkType = NetworkType.NOT_REQUIRED;
	//    2    4:aload_0         
	//    3    5:getstatic       #53  <Field NetworkType NetworkType.NOT_REQUIRED>
	//    4    8:putfield        #55  <Field NetworkType mRequiredNetworkType>
		mTriggerContentUpdateDelay = -1L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #56  <Long -1L>
	//    7   15:putfield        #59  <Field long mTriggerContentUpdateDelay>
		mTriggerMaxContentDelay = -1L;
	//    8   18:aload_0         
	//    9   19:ldc2w           #56  <Long -1L>
	//   10   22:putfield        #61  <Field long mTriggerMaxContentDelay>
		mContentUriTriggers = new ContentUriTriggers();
	//   11   25:aload_0         
	//   12   26:new             #63  <Class ContentUriTriggers>
	//   13   29:dup             
	//   14   30:invokespecial   #64  <Method void ContentUriTriggers()>
	//   15   33:putfield        #66  <Field ContentUriTriggers mContentUriTriggers>
		mRequiresCharging = constraints.mRequiresCharging;
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:getfield        #71  <Field boolean mRequiresCharging>
	//   19   41:putfield        #71  <Field boolean mRequiresCharging>
		mRequiresDeviceIdle = constraints.mRequiresDeviceIdle;
	//   20   44:aload_0         
	//   21   45:aload_1         
	//   22   46:getfield        #80  <Field boolean mRequiresDeviceIdle>
	//   23   49:putfield        #80  <Field boolean mRequiresDeviceIdle>
		mRequiredNetworkType = constraints.mRequiredNetworkType;
	//   24   52:aload_0         
	//   25   53:aload_1         
	//   26   54:getfield        #55  <Field NetworkType mRequiredNetworkType>
	//   27   57:putfield        #55  <Field NetworkType mRequiredNetworkType>
		mRequiresBatteryNotLow = constraints.mRequiresBatteryNotLow;
	//   28   60:aload_0         
	//   29   61:aload_1         
	//   30   62:getfield        #84  <Field boolean mRequiresBatteryNotLow>
	//   31   65:putfield        #84  <Field boolean mRequiresBatteryNotLow>
		mRequiresStorageNotLow = constraints.mRequiresStorageNotLow;
	//   32   68:aload_0         
	//   33   69:aload_1         
	//   34   70:getfield        #87  <Field boolean mRequiresStorageNotLow>
	//   35   73:putfield        #87  <Field boolean mRequiresStorageNotLow>
		mContentUriTriggers = constraints.mContentUriTriggers;
	//   36   76:aload_0         
	//   37   77:aload_1         
	//   38   78:getfield        #66  <Field ContentUriTriggers mContentUriTriggers>
	//   39   81:putfield        #66  <Field ContentUriTriggers mContentUriTriggers>
	//   40   84:return          
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
	//*   6    8:ifnull          134
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #101 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #101 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((Constraints)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class Constraints>
	//   16   28:astore_1        
			if(mRequiresCharging != ((Constraints) (obj)).mRequiresCharging)
	//*  17   29:aload_0         
	//*  18   30:getfield        #71  <Field boolean mRequiresCharging>
	//*  19   33:aload_1         
	//*  20   34:getfield        #71  <Field boolean mRequiresCharging>
	//*  21   37:icmpeq          42
				return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
			if(mRequiresDeviceIdle != ((Constraints) (obj)).mRequiresDeviceIdle)
	//*  24   42:aload_0         
	//*  25   43:getfield        #80  <Field boolean mRequiresDeviceIdle>
	//*  26   46:aload_1         
	//*  27   47:getfield        #80  <Field boolean mRequiresDeviceIdle>
	//*  28   50:icmpeq          55
				return false;
	//   29   53:iconst_0        
	//   30   54:ireturn         
			if(mRequiresBatteryNotLow != ((Constraints) (obj)).mRequiresBatteryNotLow)
	//*  31   55:aload_0         
	//*  32   56:getfield        #84  <Field boolean mRequiresBatteryNotLow>
	//*  33   59:aload_1         
	//*  34   60:getfield        #84  <Field boolean mRequiresBatteryNotLow>
	//*  35   63:icmpeq          68
				return false;
	//   36   66:iconst_0        
	//   37   67:ireturn         
			if(mRequiresStorageNotLow != ((Constraints) (obj)).mRequiresStorageNotLow)
	//*  38   68:aload_0         
	//*  39   69:getfield        #87  <Field boolean mRequiresStorageNotLow>
	//*  40   72:aload_1         
	//*  41   73:getfield        #87  <Field boolean mRequiresStorageNotLow>
	//*  42   76:icmpeq          81
				return false;
	//   43   79:iconst_0        
	//   44   80:ireturn         
			if(mTriggerContentUpdateDelay != ((Constraints) (obj)).mTriggerContentUpdateDelay)
	//*  45   81:aload_0         
	//*  46   82:getfield        #59  <Field long mTriggerContentUpdateDelay>
	//*  47   85:aload_1         
	//*  48   86:getfield        #59  <Field long mTriggerContentUpdateDelay>
	//*  49   89:lcmp            
	//*  50   90:ifeq            95
				return false;
	//   51   93:iconst_0        
	//   52   94:ireturn         
			if(mTriggerMaxContentDelay != ((Constraints) (obj)).mTriggerMaxContentDelay)
	//*  53   95:aload_0         
	//*  54   96:getfield        #61  <Field long mTriggerMaxContentDelay>
	//*  55   99:aload_1         
	//*  56  100:getfield        #61  <Field long mTriggerMaxContentDelay>
	//*  57  103:lcmp            
	//*  58  104:ifeq            109
				return false;
	//   59  107:iconst_0        
	//   60  108:ireturn         
			if(mRequiredNetworkType != ((Constraints) (obj)).mRequiredNetworkType)
	//*  61  109:aload_0         
	//*  62  110:getfield        #55  <Field NetworkType mRequiredNetworkType>
	//*  63  113:aload_1         
	//*  64  114:getfield        #55  <Field NetworkType mRequiredNetworkType>
	//*  65  117:if_acmpeq       122
				return false;
	//   66  120:iconst_0        
	//   67  121:ireturn         
			else
				return mContentUriTriggers.equals(((Object) (((Constraints) (obj)).mContentUriTriggers)));
	//   68  122:aload_0         
	//   69  123:getfield        #66  <Field ContentUriTriggers mContentUriTriggers>
	//   70  126:aload_1         
	//   71  127:getfield        #66  <Field ContentUriTriggers mContentUriTriggers>
	//   72  130:invokevirtual   #103 <Method boolean ContentUriTriggers.equals(Object)>
	//   73  133:ireturn         
		} else
		{
			return false;
	//   74  134:iconst_0        
	//   75  135:ireturn         
		}
	}

	public ContentUriTriggers getContentUriTriggers()
	{
		return mContentUriTriggers;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field ContentUriTriggers mContentUriTriggers>
	//    2    4:areturn         
	}

	public NetworkType getRequiredNetworkType()
	{
		return mRequiredNetworkType;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field NetworkType mRequiredNetworkType>
	//    2    4:areturn         
	}

	public long getTriggerContentUpdateDelay()
	{
		return mTriggerContentUpdateDelay;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field long mTriggerContentUpdateDelay>
	//    2    4:lreturn         
	}

	public long getTriggerMaxContentDelay()
	{
		return mTriggerMaxContentDelay;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field long mTriggerMaxContentDelay>
	//    2    4:lreturn         
	}

	public boolean hasContentUriTriggers()
	{
		return mContentUriTriggers.size() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field ContentUriTriggers mContentUriTriggers>
	//    2    4:invokevirtual   #118 <Method int ContentUriTriggers.size()>
	//    3    7:ifle            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public int hashCode()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #121 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #123 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #128 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public boolean requiresBatteryNotLow()
	{
		return mRequiresBatteryNotLow;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field boolean mRequiresBatteryNotLow>
	//    2    4:ireturn         
	}

	public boolean requiresCharging()
	{
		return mRequiresCharging;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field boolean mRequiresCharging>
	//    2    4:ireturn         
	}

	public boolean requiresDeviceIdle()
	{
		return mRequiresDeviceIdle;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field boolean mRequiresDeviceIdle>
	//    2    4:ireturn         
	}

	public boolean requiresStorageNotLow()
	{
		return mRequiresStorageNotLow;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field boolean mRequiresStorageNotLow>
	//    2    4:ireturn         
	}

	public void setContentUriTriggers(ContentUriTriggers contenturitriggers)
	{
		mContentUriTriggers = contenturitriggers;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field ContentUriTriggers mContentUriTriggers>
	//    3    5:return          
	}

	public void setRequiredNetworkType(NetworkType networktype)
	{
		mRequiredNetworkType = networktype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field NetworkType mRequiredNetworkType>
	//    3    5:return          
	}

	public void setRequiresBatteryNotLow(boolean flag)
	{
		mRequiresBatteryNotLow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #84  <Field boolean mRequiresBatteryNotLow>
	//    3    5:return          
	}

	public void setRequiresCharging(boolean flag)
	{
		mRequiresCharging = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #71  <Field boolean mRequiresCharging>
	//    3    5:return          
	}

	public void setRequiresDeviceIdle(boolean flag)
	{
		mRequiresDeviceIdle = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #80  <Field boolean mRequiresDeviceIdle>
	//    3    5:return          
	}

	public void setRequiresStorageNotLow(boolean flag)
	{
		mRequiresStorageNotLow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #87  <Field boolean mRequiresStorageNotLow>
	//    3    5:return          
	}

	public void setTriggerContentUpdateDelay(long l)
	{
		mTriggerContentUpdateDelay = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #59  <Field long mTriggerContentUpdateDelay>
	//    3    5:return          
	}

	public void setTriggerMaxContentDelay(long l)
	{
		mTriggerMaxContentDelay = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #61  <Field long mTriggerMaxContentDelay>
	//    3    5:return          
	}

	public static final Constraints NONE = (new Builder()).build();
	private ContentUriTriggers mContentUriTriggers;
	private NetworkType mRequiredNetworkType;
	private boolean mRequiresBatteryNotLow;
	private boolean mRequiresCharging;
	private boolean mRequiresDeviceIdle;
	private boolean mRequiresStorageNotLow;
	private long mTriggerContentUpdateDelay;
	private long mTriggerMaxContentDelay;

	static 
	{
	//    0    0:new             #6   <Class Constraints$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void Constraints$Builder()>
	//    3    7:invokevirtual   #40  <Method Constraints Constraints$Builder.build()>
	//    4   10:putstatic       #42  <Field Constraints NONE>
	//*   5   13:return          
	}
}

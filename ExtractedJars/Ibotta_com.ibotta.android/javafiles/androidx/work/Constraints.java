// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;


// Referenced classes of package androidx.work:
//			ContentUriTriggers, NetworkType

public final class Constraints
{
	public static final class Builder
	{

		public Constraints build()
		{
			return new Constraints(this);
		//    0    0:new             #6   <Class Constraints>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #47  <Method void Constraints(Constraints$Builder)>
		//    4    8:areturn         
		}

		public Builder setRequiredNetworkType(NetworkType networktype)
		{
			mRequiredNetworkType = networktype;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #31  <Field NetworkType mRequiredNetworkType>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		ContentUriTriggers mContentUriTriggers;
		NetworkType mRequiredNetworkType;
		boolean mRequiresBatteryNotLow;
		boolean mRequiresCharging;
		boolean mRequiresDeviceIdle;
		boolean mRequiresStorageNotLow;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			mRequiresCharging = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #22  <Field boolean mRequiresCharging>
			mRequiresDeviceIdle = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #24  <Field boolean mRequiresDeviceIdle>
			mRequiredNetworkType = NetworkType.NOT_REQUIRED;
		//    8   14:aload_0         
		//    9   15:getstatic       #29  <Field NetworkType NetworkType.NOT_REQUIRED>
		//   10   18:putfield        #31  <Field NetworkType mRequiredNetworkType>
			mRequiresBatteryNotLow = false;
		//   11   21:aload_0         
		//   12   22:iconst_0        
		//   13   23:putfield        #33  <Field boolean mRequiresBatteryNotLow>
			mRequiresStorageNotLow = false;
		//   14   26:aload_0         
		//   15   27:iconst_0        
		//   16   28:putfield        #35  <Field boolean mRequiresStorageNotLow>
			mContentUriTriggers = new ContentUriTriggers();
		//   17   31:aload_0         
		//   18   32:new             #37  <Class ContentUriTriggers>
		//   19   35:dup             
		//   20   36:invokespecial   #38  <Method void ContentUriTriggers()>
		//   21   39:putfield        #40  <Field ContentUriTriggers mContentUriTriggers>
		//   22   42:return          
		}
	}


	public Constraints()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:return          
	}

	Constraints(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		mRequiresCharging = builder.mRequiresCharging;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #48  <Field boolean Constraints$Builder.mRequiresCharging>
	//    5    9:putfield        #49  <Field boolean mRequiresCharging>
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 23 && builder.mRequiresDeviceIdle)
	//*   6   12:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   15:bipush          23
	//*   8   17:icmplt          32
	//*   9   20:aload_1         
	//*  10   21:getfield        #57  <Field boolean Constraints$Builder.mRequiresDeviceIdle>
	//*  11   24:ifeq            32
			flag = true;
	//   12   27:iconst_1        
	//   13   28:istore_2        
		else
	//*  14   29:goto            34
			flag = false;
	//   15   32:iconst_0        
	//   16   33:istore_2        
		mRequiresDeviceIdle = flag;
	//   17   34:aload_0         
	//   18   35:iload_2         
	//   19   36:putfield        #58  <Field boolean mRequiresDeviceIdle>
		mRequiredNetworkType = builder.mRequiredNetworkType;
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:getfield        #60  <Field NetworkType Constraints$Builder.mRequiredNetworkType>
	//   23   44:putfield        #61  <Field NetworkType mRequiredNetworkType>
		mRequiresBatteryNotLow = builder.mRequiresBatteryNotLow;
	//   24   47:aload_0         
	//   25   48:aload_1         
	//   26   49:getfield        #63  <Field boolean Constraints$Builder.mRequiresBatteryNotLow>
	//   27   52:putfield        #64  <Field boolean mRequiresBatteryNotLow>
		mRequiresStorageNotLow = builder.mRequiresStorageNotLow;
	//   28   55:aload_0         
	//   29   56:aload_1         
	//   30   57:getfield        #66  <Field boolean Constraints$Builder.mRequiresStorageNotLow>
	//   31   60:putfield        #67  <Field boolean mRequiresStorageNotLow>
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  32   63:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//*  33   66:bipush          24
	//*  34   68:icmplt          79
			builder = ((Builder) (builder.mContentUriTriggers));
	//   35   71:aload_1         
	//   36   72:getfield        #69  <Field ContentUriTriggers Constraints$Builder.mContentUriTriggers>
	//   37   75:astore_1        
		else
	//*  38   76:goto            87
			builder = ((Builder) (new ContentUriTriggers()));
	//   39   79:new             #71  <Class ContentUriTriggers>
	//   40   82:dup             
	//   41   83:invokespecial   #72  <Method void ContentUriTriggers()>
	//   42   86:astore_1        
		mContentUriTriggers = ((ContentUriTriggers) (builder));
	//   43   87:aload_0         
	//   44   88:aload_1         
	//   45   89:putfield        #73  <Field ContentUriTriggers mContentUriTriggers>
	//   46   92:return          
	}

	public Constraints(Constraints constraints)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		mRequiresCharging = constraints.mRequiresCharging;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #49  <Field boolean mRequiresCharging>
	//    5    9:putfield        #49  <Field boolean mRequiresCharging>
		mRequiresDeviceIdle = constraints.mRequiresDeviceIdle;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #58  <Field boolean mRequiresDeviceIdle>
	//    9   17:putfield        #58  <Field boolean mRequiresDeviceIdle>
		mRequiredNetworkType = constraints.mRequiredNetworkType;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #61  <Field NetworkType mRequiredNetworkType>
	//   13   25:putfield        #61  <Field NetworkType mRequiredNetworkType>
		mRequiresBatteryNotLow = constraints.mRequiresBatteryNotLow;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #64  <Field boolean mRequiresBatteryNotLow>
	//   17   33:putfield        #64  <Field boolean mRequiresBatteryNotLow>
		mRequiresStorageNotLow = constraints.mRequiresStorageNotLow;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #67  <Field boolean mRequiresStorageNotLow>
	//   21   41:putfield        #67  <Field boolean mRequiresStorageNotLow>
		mContentUriTriggers = constraints.mContentUriTriggers;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getfield        #73  <Field ContentUriTriggers mContentUriTriggers>
	//   25   49:putfield        #73  <Field ContentUriTriggers mContentUriTriggers>
	//   26   52:return          
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
	//*   6    8:ifnull          117
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #82  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #82  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((Constraints)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class Constraints>
	//   16   28:astore_1        
			if(mRequiredNetworkType == ((Constraints) (obj)).mRequiredNetworkType && mRequiresCharging == ((Constraints) (obj)).mRequiresCharging && mRequiresDeviceIdle == ((Constraints) (obj)).mRequiresDeviceIdle && mRequiresBatteryNotLow == ((Constraints) (obj)).mRequiresBatteryNotLow && mRequiresStorageNotLow == ((Constraints) (obj)).mRequiresStorageNotLow)
	//*  17   29:aload_0         
	//*  18   30:getfield        #61  <Field NetworkType mRequiredNetworkType>
	//*  19   33:aload_1         
	//*  20   34:getfield        #61  <Field NetworkType mRequiredNetworkType>
	//*  21   37:if_acmpne       115
	//*  22   40:aload_0         
	//*  23   41:getfield        #49  <Field boolean mRequiresCharging>
	//*  24   44:aload_1         
	//*  25   45:getfield        #49  <Field boolean mRequiresCharging>
	//*  26   48:icmpne          115
	//*  27   51:aload_0         
	//*  28   52:getfield        #58  <Field boolean mRequiresDeviceIdle>
	//*  29   55:aload_1         
	//*  30   56:getfield        #58  <Field boolean mRequiresDeviceIdle>
	//*  31   59:icmpne          115
	//*  32   62:aload_0         
	//*  33   63:getfield        #64  <Field boolean mRequiresBatteryNotLow>
	//*  34   66:aload_1         
	//*  35   67:getfield        #64  <Field boolean mRequiresBatteryNotLow>
	//*  36   70:icmpne          115
	//*  37   73:aload_0         
	//*  38   74:getfield        #67  <Field boolean mRequiresStorageNotLow>
	//*  39   77:aload_1         
	//*  40   78:getfield        #67  <Field boolean mRequiresStorageNotLow>
	//*  41   81:icmpne          115
			{
				ContentUriTriggers contenturitriggers = mContentUriTriggers;
	//   42   84:aload_0         
	//   43   85:getfield        #73  <Field ContentUriTriggers mContentUriTriggers>
	//   44   88:astore_2        
				if(contenturitriggers != null)
	//*  45   89:aload_2         
	//*  46   90:ifnull          106
				{
					if(contenturitriggers.equals(((Object) (((Constraints) (obj)).mContentUriTriggers))))
	//*  47   93:aload_2         
	//*  48   94:aload_1         
	//*  49   95:getfield        #73  <Field ContentUriTriggers mContentUriTriggers>
	//*  50   98:invokevirtual   #84  <Method boolean ContentUriTriggers.equals(Object)>
	//*  51  101:ifeq            115
						return true;
	//   52  104:iconst_1        
	//   53  105:ireturn         
				} else
				if(((Constraints) (obj)).mContentUriTriggers == null)
	//*  54  106:aload_1         
	//*  55  107:getfield        #73  <Field ContentUriTriggers mContentUriTriggers>
	//*  56  110:ifnonnull       115
					return true;
	//   57  113:iconst_1        
	//   58  114:ireturn         
			}
			return false;
	//   59  115:iconst_0        
	//   60  116:ireturn         
		} else
		{
			return false;
	//   61  117:iconst_0        
	//   62  118:ireturn         
		}
	}

	public ContentUriTriggers getContentUriTriggers()
	{
		return mContentUriTriggers;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field ContentUriTriggers mContentUriTriggers>
	//    2    4:areturn         
	}

	public NetworkType getRequiredNetworkType()
	{
		return mRequiredNetworkType;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field NetworkType mRequiredNetworkType>
	//    2    4:areturn         
	}

	public boolean hasContentUriTriggers()
	{
		ContentUriTriggers contenturitriggers = mContentUriTriggers;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field ContentUriTriggers mContentUriTriggers>
	//    2    4:astore_1        
		return contenturitriggers != null && contenturitriggers.size() > 0;
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #96  <Method int ContentUriTriggers.size()>
	//    7   13:ifle            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public int hashCode()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #99  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #101 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #106 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public boolean requiresBatteryNotLow()
	{
		return mRequiresBatteryNotLow;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean mRequiresBatteryNotLow>
	//    2    4:ireturn         
	}

	public boolean requiresCharging()
	{
		return mRequiresCharging;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field boolean mRequiresCharging>
	//    2    4:ireturn         
	}

	public boolean requiresDeviceIdle()
	{
		return mRequiresDeviceIdle;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field boolean mRequiresDeviceIdle>
	//    2    4:ireturn         
	}

	public boolean requiresStorageNotLow()
	{
		return mRequiresStorageNotLow;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field boolean mRequiresStorageNotLow>
	//    2    4:ireturn         
	}

	public void setContentUriTriggers(ContentUriTriggers contenturitriggers)
	{
		mContentUriTriggers = contenturitriggers;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #73  <Field ContentUriTriggers mContentUriTriggers>
	//    3    5:return          
	}

	public void setRequiredNetworkType(NetworkType networktype)
	{
		mRequiredNetworkType = networktype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field NetworkType mRequiredNetworkType>
	//    3    5:return          
	}

	public void setRequiresBatteryNotLow(boolean flag)
	{
		mRequiresBatteryNotLow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #64  <Field boolean mRequiresBatteryNotLow>
	//    3    5:return          
	}

	public void setRequiresCharging(boolean flag)
	{
		mRequiresCharging = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field boolean mRequiresCharging>
	//    3    5:return          
	}

	public void setRequiresDeviceIdle(boolean flag)
	{
		mRequiresDeviceIdle = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field boolean mRequiresDeviceIdle>
	//    3    5:return          
	}

	public void setRequiresStorageNotLow(boolean flag)
	{
		mRequiresStorageNotLow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #67  <Field boolean mRequiresStorageNotLow>
	//    3    5:return          
	}

	public static final Constraints NONE = (new Builder()).build();
	private ContentUriTriggers mContentUriTriggers;
	private NetworkType mRequiredNetworkType;
	private boolean mRequiresBatteryNotLow;
	private boolean mRequiresCharging;
	private boolean mRequiresDeviceIdle;
	private boolean mRequiresStorageNotLow;

	static 
	{
	//    0    0:new             #6   <Class Constraints$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void Constraints$Builder()>
	//    3    7:invokevirtual   #36  <Method Constraints Constraints$Builder.build()>
	//    4   10:putstatic       #38  <Field Constraints NONE>
	//*   5   13:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class DockEvacuationReport
{

	public DockEvacuationReport(String s, String s1, String s2, String s3, String s4, String s5, int i, 
			int j, int k, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		mDockId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field String mDockId>
		mDockSku = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field String mDockSku>
		mDockPartNumber = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field String mDockPartNumber>
		mDockVersion = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #31  <Field String mDockVersion>
		mRobotId = s4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #33  <Field String mRobotId>
		mEvacType = s5;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #35  <Field String mEvacType>
		mMissionNumber = i;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #37  <Field int mMissionNumber>
		mDockState = j;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #39  <Field int mDockState>
		mTimestamp = k;
	//   26   49:aload_0         
	//   27   50:iload           9
	//   28   52:putfield        #41  <Field int mTimestamp>
		mIsFull = flag;
	//   29   55:aload_0         
	//   30   56:iload           10
	//   31   58:putfield        #43  <Field boolean mIsFull>
		mIsFullTransition = flag1;
	//   32   61:aload_0         
	//   33   62:iload           11
	//   34   64:putfield        #45  <Field boolean mIsFullTransition>
	//   35   67:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof DockEvacuationReport;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class DockEvacuationReport>
	//    2    4:istore_2        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(!flag)
	//*   5    7:iload_2         
	//*   6    8:ifne            13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		obj = ((Object) ((DockEvacuationReport)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class DockEvacuationReport>
	//   11   17:astore_1        
		flag = flag1;
	//   12   18:iload_3         
	//   13   19:istore_2        
		if(mDockId.equals(((Object) (((DockEvacuationReport) (obj)).mDockId))))
	//*  14   20:aload_0         
	//*  15   21:getfield        #25  <Field String mDockId>
	//*  16   24:aload_1         
	//*  17   25:getfield        #25  <Field String mDockId>
	//*  18   28:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  19   31:ifeq            181
		{
			flag = flag1;
	//   20   34:iload_3         
	//   21   35:istore_2        
			if(mDockSku.equals(((Object) (((DockEvacuationReport) (obj)).mDockSku))))
	//*  22   36:aload_0         
	//*  23   37:getfield        #27  <Field String mDockSku>
	//*  24   40:aload_1         
	//*  25   41:getfield        #27  <Field String mDockSku>
	//*  26   44:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  27   47:ifeq            181
			{
				flag = flag1;
	//   28   50:iload_3         
	//   29   51:istore_2        
				if(mDockPartNumber.equals(((Object) (((DockEvacuationReport) (obj)).mDockPartNumber))))
	//*  30   52:aload_0         
	//*  31   53:getfield        #29  <Field String mDockPartNumber>
	//*  32   56:aload_1         
	//*  33   57:getfield        #29  <Field String mDockPartNumber>
	//*  34   60:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  35   63:ifeq            181
				{
					flag = flag1;
	//   36   66:iload_3         
	//   37   67:istore_2        
					if(mDockVersion.equals(((Object) (((DockEvacuationReport) (obj)).mDockVersion))))
	//*  38   68:aload_0         
	//*  39   69:getfield        #31  <Field String mDockVersion>
	//*  40   72:aload_1         
	//*  41   73:getfield        #31  <Field String mDockVersion>
	//*  42   76:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  43   79:ifeq            181
					{
						flag = flag1;
	//   44   82:iload_3         
	//   45   83:istore_2        
						if(mRobotId.equals(((Object) (((DockEvacuationReport) (obj)).mRobotId))))
	//*  46   84:aload_0         
	//*  47   85:getfield        #33  <Field String mRobotId>
	//*  48   88:aload_1         
	//*  49   89:getfield        #33  <Field String mRobotId>
	//*  50   92:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  51   95:ifeq            181
						{
							flag = flag1;
	//   52   98:iload_3         
	//   53   99:istore_2        
							if(mEvacType.equals(((Object) (((DockEvacuationReport) (obj)).mEvacType))))
	//*  54  100:aload_0         
	//*  55  101:getfield        #35  <Field String mEvacType>
	//*  56  104:aload_1         
	//*  57  105:getfield        #35  <Field String mEvacType>
	//*  58  108:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  59  111:ifeq            181
							{
								flag = flag1;
	//   60  114:iload_3         
	//   61  115:istore_2        
								if(mMissionNumber == ((DockEvacuationReport) (obj)).mMissionNumber)
	//*  62  116:aload_0         
	//*  63  117:getfield        #37  <Field int mMissionNumber>
	//*  64  120:aload_1         
	//*  65  121:getfield        #37  <Field int mMissionNumber>
	//*  66  124:icmpne          181
								{
									flag = flag1;
	//   67  127:iload_3         
	//   68  128:istore_2        
									if(mDockState == ((DockEvacuationReport) (obj)).mDockState)
	//*  69  129:aload_0         
	//*  70  130:getfield        #39  <Field int mDockState>
	//*  71  133:aload_1         
	//*  72  134:getfield        #39  <Field int mDockState>
	//*  73  137:icmpne          181
									{
										flag = flag1;
	//   74  140:iload_3         
	//   75  141:istore_2        
										if(mTimestamp == ((DockEvacuationReport) (obj)).mTimestamp)
	//*  76  142:aload_0         
	//*  77  143:getfield        #41  <Field int mTimestamp>
	//*  78  146:aload_1         
	//*  79  147:getfield        #41  <Field int mTimestamp>
	//*  80  150:icmpne          181
										{
											flag = flag1;
	//   81  153:iload_3         
	//   82  154:istore_2        
											if(mIsFull == ((DockEvacuationReport) (obj)).mIsFull)
	//*  83  155:aload_0         
	//*  84  156:getfield        #43  <Field boolean mIsFull>
	//*  85  159:aload_1         
	//*  86  160:getfield        #43  <Field boolean mIsFull>
	//*  87  163:icmpne          181
											{
												flag = flag1;
	//   88  166:iload_3         
	//   89  167:istore_2        
												if(mIsFullTransition == ((DockEvacuationReport) (obj)).mIsFullTransition)
	//*  90  168:aload_0         
	//*  91  169:getfield        #45  <Field boolean mIsFullTransition>
	//*  92  172:aload_1         
	//*  93  173:getfield        #45  <Field boolean mIsFullTransition>
	//*  94  176:icmpne          181
													flag = true;
	//   95  179:iconst_1        
	//   96  180:istore_2        
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return flag;
	//   97  181:iload_2         
	//   98  182:ireturn         
	}

	public String getDockId()
	{
		return mDockId;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String mDockId>
	//    2    4:areturn         
	}

	public String getDockPartNumber()
	{
		return mDockPartNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String mDockPartNumber>
	//    2    4:areturn         
	}

	public String getDockSku()
	{
		return mDockSku;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String mDockSku>
	//    2    4:areturn         
	}

	public int getDockState()
	{
		return mDockState;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int mDockState>
	//    2    4:ireturn         
	}

	public String getDockVersion()
	{
		return mDockVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String mDockVersion>
	//    2    4:areturn         
	}

	public String getEvacType()
	{
		return mEvacType;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String mEvacType>
	//    2    4:areturn         
	}

	public boolean getIsFull()
	{
		return mIsFull;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean mIsFull>
	//    2    4:ireturn         
	}

	public boolean getIsFullTransition()
	{
		return mIsFullTransition;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean mIsFullTransition>
	//    2    4:ireturn         
	}

	public int getMissionNumber()
	{
		return mMissionNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int mMissionNumber>
	//    2    4:ireturn         
	}

	public String getRobotId()
	{
		return mRobotId;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String mRobotId>
	//    2    4:areturn         
	}

	public int getTimestamp()
	{
		return mTimestamp;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int mTimestamp>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #69  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #71  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #76  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #79  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #80  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("DockEvacuationReport{mDockId=");
	//    4    8:aload_1         
	//    5    9:ldc1            #82  <String "DockEvacuationReport{mDockId=">
	//    6   11:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mDockId);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #25  <Field String mDockId>
	//   11   20:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(",mDockSku=");
	//   13   24:aload_1         
	//   14   25:ldc1            #88  <String ",mDockSku=">
	//   15   27:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mDockSku);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #27  <Field String mDockSku>
	//   20   36:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(",mDockPartNumber=");
	//   22   40:aload_1         
	//   23   41:ldc1            #90  <String ",mDockPartNumber=">
	//   24   43:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mDockPartNumber);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #29  <Field String mDockPartNumber>
	//   29   52:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append(",mDockVersion=");
	//   31   56:aload_1         
	//   32   57:ldc1            #92  <String ",mDockVersion=">
	//   33   59:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(mDockVersion);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #31  <Field String mDockVersion>
	//   38   68:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   39   71:pop             
		stringbuilder.append(",mRobotId=");
	//   40   72:aload_1         
	//   41   73:ldc1            #94  <String ",mRobotId=">
	//   42   75:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(mRobotId);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #33  <Field String mRobotId>
	//   47   84:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   48   87:pop             
		stringbuilder.append(",mEvacType=");
	//   49   88:aload_1         
	//   50   89:ldc1            #96  <String ",mEvacType=">
	//   51   91:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(mEvacType);
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #35  <Field String mEvacType>
	//   56  100:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   57  103:pop             
		stringbuilder.append(",mMissionNumber=");
	//   58  104:aload_1         
	//   59  105:ldc1            #98  <String ",mMissionNumber=">
	//   60  107:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   61  110:pop             
		stringbuilder.append(mMissionNumber);
	//   62  111:aload_1         
	//   63  112:aload_0         
	//   64  113:getfield        #37  <Field int mMissionNumber>
	//   65  116:invokevirtual   #101 <Method StringBuilder StringBuilder.append(int)>
	//   66  119:pop             
		stringbuilder.append(",mDockState=");
	//   67  120:aload_1         
	//   68  121:ldc1            #103 <String ",mDockState=">
	//   69  123:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   70  126:pop             
		stringbuilder.append(mDockState);
	//   71  127:aload_1         
	//   72  128:aload_0         
	//   73  129:getfield        #39  <Field int mDockState>
	//   74  132:invokevirtual   #101 <Method StringBuilder StringBuilder.append(int)>
	//   75  135:pop             
		stringbuilder.append(",mTimestamp=");
	//   76  136:aload_1         
	//   77  137:ldc1            #105 <String ",mTimestamp=">
	//   78  139:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   79  142:pop             
		stringbuilder.append(mTimestamp);
	//   80  143:aload_1         
	//   81  144:aload_0         
	//   82  145:getfield        #41  <Field int mTimestamp>
	//   83  148:invokevirtual   #101 <Method StringBuilder StringBuilder.append(int)>
	//   84  151:pop             
		stringbuilder.append(",mIsFull=");
	//   85  152:aload_1         
	//   86  153:ldc1            #107 <String ",mIsFull=">
	//   87  155:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   88  158:pop             
		stringbuilder.append(mIsFull);
	//   89  159:aload_1         
	//   90  160:aload_0         
	//   91  161:getfield        #43  <Field boolean mIsFull>
	//   92  164:invokevirtual   #110 <Method StringBuilder StringBuilder.append(boolean)>
	//   93  167:pop             
		stringbuilder.append(",mIsFullTransition=");
	//   94  168:aload_1         
	//   95  169:ldc1            #112 <String ",mIsFullTransition=">
	//   96  171:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   97  174:pop             
		stringbuilder.append(mIsFullTransition);
	//   98  175:aload_1         
	//   99  176:aload_0         
	//  100  177:getfield        #45  <Field boolean mIsFullTransition>
	//  101  180:invokevirtual   #110 <Method StringBuilder StringBuilder.append(boolean)>
	//  102  183:pop             
		stringbuilder.append("}");
	//  103  184:aload_1         
	//  104  185:ldc1            #114 <String "}">
	//  105  187:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//  106  190:pop             
		return stringbuilder.toString();
	//  107  191:aload_1         
	//  108  192:invokevirtual   #116 <Method String StringBuilder.toString()>
	//  109  195:areturn         
	}

	final String mDockId;
	final String mDockPartNumber;
	final String mDockSku;
	final int mDockState;
	final String mDockVersion;
	final String mEvacType;
	final boolean mIsFull;
	final boolean mIsFullTransition;
	final int mMissionNumber;
	final String mRobotId;
	final int mTimestamp;
}

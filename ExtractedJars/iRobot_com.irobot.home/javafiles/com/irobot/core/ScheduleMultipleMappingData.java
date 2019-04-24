// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.irobot.core:
//			ScheduleLocationType, ScheduleMultipleMappingType

public final class ScheduleMultipleMappingData
{

	public ScheduleMultipleMappingData(ScheduleMultipleMappingType schedulemultiplemappingtype, boolean flag, ArrayList arraylist, int i, int j, ScheduleLocationType schedulelocationtype, String s, 
			String s1, String s2, ArrayList arraylist1, ArrayList arraylist2, boolean flag1, HashMap hashmap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		mType = schedulemultiplemappingtype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field ScheduleMultipleMappingType mType>
		mEnabled = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #36  <Field boolean mEnabled>
		mDays = arraylist;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #38  <Field ArrayList mDays>
		mHour = i;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #40  <Field int mHour>
		mMinute = j;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #42  <Field int mMinute>
		mLocationType = schedulelocationtype;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #44  <Field ScheduleLocationType mLocationType>
		mMapId = s;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #46  <Field String mMapId>
		mMapVersion = s1;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #48  <Field String mMapVersion>
		mLastUserEditedMapVersion = s2;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #50  <Field String mLastUserEditedMapVersion>
		mRegionIds = arraylist1;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #52  <Field ArrayList mRegionIds>
		mRegionNames = arraylist2;
	//   32   61:aload_0         
	//   33   62:aload           11
	//   34   64:putfield        #54  <Field ArrayList mRegionNames>
		mIsOrdered = flag1;
	//   35   67:aload_0         
	//   36   68:iload           12
	//   37   70:putfield        #56  <Field boolean mIsOrdered>
		mMissionParameters = hashmap;
	//   38   73:aload_0         
	//   39   74:aload           13
	//   40   76:putfield        #58  <Field HashMap mMissionParameters>
	//   41   79:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof ScheduleMultipleMappingData;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class ScheduleMultipleMappingData>
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
		obj = ((Object) ((ScheduleMultipleMappingData)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class ScheduleMultipleMappingData>
	//   11   17:astore_1        
		flag = flag1;
	//   12   18:iload_3         
	//   13   19:istore_2        
		if(mType == ((ScheduleMultipleMappingData) (obj)).mType)
	//*  14   20:aload_0         
	//*  15   21:getfield        #34  <Field ScheduleMultipleMappingType mType>
	//*  16   24:aload_1         
	//*  17   25:getfield        #34  <Field ScheduleMultipleMappingType mType>
	//*  18   28:if_acmpne       210
		{
			flag = flag1;
	//   19   31:iload_3         
	//   20   32:istore_2        
			if(mEnabled == ((ScheduleMultipleMappingData) (obj)).mEnabled)
	//*  21   33:aload_0         
	//*  22   34:getfield        #36  <Field boolean mEnabled>
	//*  23   37:aload_1         
	//*  24   38:getfield        #36  <Field boolean mEnabled>
	//*  25   41:icmpne          210
			{
				flag = flag1;
	//   26   44:iload_3         
	//   27   45:istore_2        
				if(mDays.equals(((Object) (((ScheduleMultipleMappingData) (obj)).mDays))))
	//*  28   46:aload_0         
	//*  29   47:getfield        #38  <Field ArrayList mDays>
	//*  30   50:aload_1         
	//*  31   51:getfield        #38  <Field ArrayList mDays>
	//*  32   54:invokevirtual   #67  <Method boolean ArrayList.equals(Object)>
	//*  33   57:ifeq            210
				{
					flag = flag1;
	//   34   60:iload_3         
	//   35   61:istore_2        
					if(mHour == ((ScheduleMultipleMappingData) (obj)).mHour)
	//*  36   62:aload_0         
	//*  37   63:getfield        #40  <Field int mHour>
	//*  38   66:aload_1         
	//*  39   67:getfield        #40  <Field int mHour>
	//*  40   70:icmpne          210
					{
						flag = flag1;
	//   41   73:iload_3         
	//   42   74:istore_2        
						if(mMinute == ((ScheduleMultipleMappingData) (obj)).mMinute)
	//*  43   75:aload_0         
	//*  44   76:getfield        #42  <Field int mMinute>
	//*  45   79:aload_1         
	//*  46   80:getfield        #42  <Field int mMinute>
	//*  47   83:icmpne          210
						{
							flag = flag1;
	//   48   86:iload_3         
	//   49   87:istore_2        
							if(mLocationType == ((ScheduleMultipleMappingData) (obj)).mLocationType)
	//*  50   88:aload_0         
	//*  51   89:getfield        #44  <Field ScheduleLocationType mLocationType>
	//*  52   92:aload_1         
	//*  53   93:getfield        #44  <Field ScheduleLocationType mLocationType>
	//*  54   96:if_acmpne       210
							{
								flag = flag1;
	//   55   99:iload_3         
	//   56  100:istore_2        
								if(mMapId.equals(((Object) (((ScheduleMultipleMappingData) (obj)).mMapId))))
	//*  57  101:aload_0         
	//*  58  102:getfield        #46  <Field String mMapId>
	//*  59  105:aload_1         
	//*  60  106:getfield        #46  <Field String mMapId>
	//*  61  109:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*  62  112:ifeq            210
								{
									flag = flag1;
	//   63  115:iload_3         
	//   64  116:istore_2        
									if(mMapVersion.equals(((Object) (((ScheduleMultipleMappingData) (obj)).mMapVersion))))
	//*  65  117:aload_0         
	//*  66  118:getfield        #48  <Field String mMapVersion>
	//*  67  121:aload_1         
	//*  68  122:getfield        #48  <Field String mMapVersion>
	//*  69  125:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*  70  128:ifeq            210
									{
										flag = flag1;
	//   71  131:iload_3         
	//   72  132:istore_2        
										if(mLastUserEditedMapVersion.equals(((Object) (((ScheduleMultipleMappingData) (obj)).mLastUserEditedMapVersion))))
	//*  73  133:aload_0         
	//*  74  134:getfield        #50  <Field String mLastUserEditedMapVersion>
	//*  75  137:aload_1         
	//*  76  138:getfield        #50  <Field String mLastUserEditedMapVersion>
	//*  77  141:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*  78  144:ifeq            210
										{
											flag = flag1;
	//   79  147:iload_3         
	//   80  148:istore_2        
											if(mRegionIds.equals(((Object) (((ScheduleMultipleMappingData) (obj)).mRegionIds))))
	//*  81  149:aload_0         
	//*  82  150:getfield        #52  <Field ArrayList mRegionIds>
	//*  83  153:aload_1         
	//*  84  154:getfield        #52  <Field ArrayList mRegionIds>
	//*  85  157:invokevirtual   #67  <Method boolean ArrayList.equals(Object)>
	//*  86  160:ifeq            210
											{
												flag = flag1;
	//   87  163:iload_3         
	//   88  164:istore_2        
												if(mRegionNames.equals(((Object) (((ScheduleMultipleMappingData) (obj)).mRegionNames))))
	//*  89  165:aload_0         
	//*  90  166:getfield        #54  <Field ArrayList mRegionNames>
	//*  91  169:aload_1         
	//*  92  170:getfield        #54  <Field ArrayList mRegionNames>
	//*  93  173:invokevirtual   #67  <Method boolean ArrayList.equals(Object)>
	//*  94  176:ifeq            210
												{
													flag = flag1;
	//   95  179:iload_3         
	//   96  180:istore_2        
													if(mIsOrdered == ((ScheduleMultipleMappingData) (obj)).mIsOrdered)
	//*  97  181:aload_0         
	//*  98  182:getfield        #56  <Field boolean mIsOrdered>
	//*  99  185:aload_1         
	//* 100  186:getfield        #56  <Field boolean mIsOrdered>
	//* 101  189:icmpne          210
													{
														flag = flag1;
	//  102  192:iload_3         
	//  103  193:istore_2        
														if(mMissionParameters.equals(((Object) (((ScheduleMultipleMappingData) (obj)).mMissionParameters))))
	//* 104  194:aload_0         
	//* 105  195:getfield        #58  <Field HashMap mMissionParameters>
	//* 106  198:aload_1         
	//* 107  199:getfield        #58  <Field HashMap mMissionParameters>
	//* 108  202:invokevirtual   #73  <Method boolean HashMap.equals(Object)>
	//* 109  205:ifeq            210
															flag = true;
	//  110  208:iconst_1        
	//  111  209:istore_2        
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
			}
		}
		return flag;
	//  112  210:iload_2         
	//  113  211:ireturn         
	}

	public ArrayList getDays()
	{
		return mDays;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ArrayList mDays>
	//    2    4:areturn         
	}

	public boolean getEnabled()
	{
		return mEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean mEnabled>
	//    2    4:ireturn         
	}

	public int getHour()
	{
		return mHour;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int mHour>
	//    2    4:ireturn         
	}

	public boolean getIsOrdered()
	{
		return mIsOrdered;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field boolean mIsOrdered>
	//    2    4:ireturn         
	}

	public String getLastUserEditedMapVersion()
	{
		return mLastUserEditedMapVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String mLastUserEditedMapVersion>
	//    2    4:areturn         
	}

	public ScheduleLocationType getLocationType()
	{
		return mLocationType;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ScheduleLocationType mLocationType>
	//    2    4:areturn         
	}

	public String getMapId()
	{
		return mMapId;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String mMapId>
	//    2    4:areturn         
	}

	public String getMapVersion()
	{
		return mMapVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String mMapVersion>
	//    2    4:areturn         
	}

	public int getMinute()
	{
		return mMinute;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int mMinute>
	//    2    4:ireturn         
	}

	public HashMap getMissionParameters()
	{
		return mMissionParameters;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field HashMap mMissionParameters>
	//    2    4:areturn         
	}

	public ArrayList getRegionIds()
	{
		return mRegionIds;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ArrayList mRegionIds>
	//    2    4:areturn         
	}

	public ArrayList getRegionNames()
	{
		return mRegionNames;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field ArrayList mRegionNames>
	//    2    4:areturn         
	}

	public ScheduleMultipleMappingType getType()
	{
		return mType;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ScheduleMultipleMappingType mType>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #99  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #101 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #106 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #109 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #110 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ScheduleMultipleMappingData{mType=");
	//    4    8:aload_1         
	//    5    9:ldc1            #112 <String "ScheduleMultipleMappingData{mType=">
	//    6   11:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (mType)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #34  <Field ScheduleMultipleMappingType mType>
	//   11   20:invokevirtual   #119 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(",mEnabled=");
	//   13   24:aload_1         
	//   14   25:ldc1            #121 <String ",mEnabled=">
	//   15   27:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mEnabled);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #36  <Field boolean mEnabled>
	//   20   36:invokevirtual   #124 <Method StringBuilder StringBuilder.append(boolean)>
	//   21   39:pop             
		stringbuilder.append(",mDays=");
	//   22   40:aload_1         
	//   23   41:ldc1            #126 <String ",mDays=">
	//   24   43:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(((Object) (mDays)));
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #38  <Field ArrayList mDays>
	//   29   52:invokevirtual   #119 <Method StringBuilder StringBuilder.append(Object)>
	//   30   55:pop             
		stringbuilder.append(",mHour=");
	//   31   56:aload_1         
	//   32   57:ldc1            #128 <String ",mHour=">
	//   33   59:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(mHour);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #40  <Field int mHour>
	//   38   68:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//   39   71:pop             
		stringbuilder.append(",mMinute=");
	//   40   72:aload_1         
	//   41   73:ldc1            #133 <String ",mMinute=">
	//   42   75:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(mMinute);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #42  <Field int mMinute>
	//   47   84:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//   48   87:pop             
		stringbuilder.append(",mLocationType=");
	//   49   88:aload_1         
	//   50   89:ldc1            #135 <String ",mLocationType=">
	//   51   91:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(((Object) (mLocationType)));
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #44  <Field ScheduleLocationType mLocationType>
	//   56  100:invokevirtual   #119 <Method StringBuilder StringBuilder.append(Object)>
	//   57  103:pop             
		stringbuilder.append(",mMapId=");
	//   58  104:aload_1         
	//   59  105:ldc1            #137 <String ",mMapId=">
	//   60  107:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   61  110:pop             
		stringbuilder.append(mMapId);
	//   62  111:aload_1         
	//   63  112:aload_0         
	//   64  113:getfield        #46  <Field String mMapId>
	//   65  116:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   66  119:pop             
		stringbuilder.append(",mMapVersion=");
	//   67  120:aload_1         
	//   68  121:ldc1            #139 <String ",mMapVersion=">
	//   69  123:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   70  126:pop             
		stringbuilder.append(mMapVersion);
	//   71  127:aload_1         
	//   72  128:aload_0         
	//   73  129:getfield        #48  <Field String mMapVersion>
	//   74  132:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   75  135:pop             
		stringbuilder.append(",mLastUserEditedMapVersion=");
	//   76  136:aload_1         
	//   77  137:ldc1            #141 <String ",mLastUserEditedMapVersion=">
	//   78  139:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   79  142:pop             
		stringbuilder.append(mLastUserEditedMapVersion);
	//   80  143:aload_1         
	//   81  144:aload_0         
	//   82  145:getfield        #50  <Field String mLastUserEditedMapVersion>
	//   83  148:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   84  151:pop             
		stringbuilder.append(",mRegionIds=");
	//   85  152:aload_1         
	//   86  153:ldc1            #143 <String ",mRegionIds=">
	//   87  155:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   88  158:pop             
		stringbuilder.append(((Object) (mRegionIds)));
	//   89  159:aload_1         
	//   90  160:aload_0         
	//   91  161:getfield        #52  <Field ArrayList mRegionIds>
	//   92  164:invokevirtual   #119 <Method StringBuilder StringBuilder.append(Object)>
	//   93  167:pop             
		stringbuilder.append(",mRegionNames=");
	//   94  168:aload_1         
	//   95  169:ldc1            #145 <String ",mRegionNames=">
	//   96  171:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   97  174:pop             
		stringbuilder.append(((Object) (mRegionNames)));
	//   98  175:aload_1         
	//   99  176:aload_0         
	//  100  177:getfield        #54  <Field ArrayList mRegionNames>
	//  101  180:invokevirtual   #119 <Method StringBuilder StringBuilder.append(Object)>
	//  102  183:pop             
		stringbuilder.append(",mIsOrdered=");
	//  103  184:aload_1         
	//  104  185:ldc1            #147 <String ",mIsOrdered=">
	//  105  187:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//  106  190:pop             
		stringbuilder.append(mIsOrdered);
	//  107  191:aload_1         
	//  108  192:aload_0         
	//  109  193:getfield        #56  <Field boolean mIsOrdered>
	//  110  196:invokevirtual   #124 <Method StringBuilder StringBuilder.append(boolean)>
	//  111  199:pop             
		stringbuilder.append(",mMissionParameters=");
	//  112  200:aload_1         
	//  113  201:ldc1            #149 <String ",mMissionParameters=">
	//  114  203:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//  115  206:pop             
		stringbuilder.append(((Object) (mMissionParameters)));
	//  116  207:aload_1         
	//  117  208:aload_0         
	//  118  209:getfield        #58  <Field HashMap mMissionParameters>
	//  119  212:invokevirtual   #119 <Method StringBuilder StringBuilder.append(Object)>
	//  120  215:pop             
		stringbuilder.append("}");
	//  121  216:aload_1         
	//  122  217:ldc1            #151 <String "}">
	//  123  219:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//  124  222:pop             
		return stringbuilder.toString();
	//  125  223:aload_1         
	//  126  224:invokevirtual   #153 <Method String StringBuilder.toString()>
	//  127  227:areturn         
	}

	final ArrayList mDays;
	final boolean mEnabled;
	final int mHour;
	final boolean mIsOrdered;
	final String mLastUserEditedMapVersion;
	final ScheduleLocationType mLocationType;
	final String mMapId;
	final String mMapVersion;
	final int mMinute;
	final HashMap mMissionParameters;
	final ArrayList mRegionIds;
	final ArrayList mRegionNames;
	final ScheduleMultipleMappingType mType;
}

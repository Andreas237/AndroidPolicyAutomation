// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.irobot.core:
//			RobotMissionHistoryCompletionStatus, RobotPadCategory, RobotRankOverlap

public final class RobotMissionHistoryItem
{

	public RobotMissionHistoryItem(int i, int j, int k, RobotMissionHistoryCompletionStatus robotmissionhistorycompletionstatus, int l, HashMap hashmap, int i1, 
			int j1, int k1, int l1, int i2, int j2, short word0, short word1, 
			short word2, short word3, short word4, ArrayList arraylist, boolean flag, int k2, String s, 
			String s1, String s2, String s3, ArrayList arraylist1, ArrayList arraylist2, short word5, RobotRankOverlap robotrankoverlap, 
			RobotPadCategory robotpadcategory, String s4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
		mTimestamp = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #56  <Field int mTimestamp>
		mStartTime = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #58  <Field int mStartTime>
		mMissionId = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #60  <Field int mMissionId>
		mCompletionStatus = robotmissionhistorycompletionstatus;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #62  <Field RobotMissionHistoryCompletionStatus mCompletionStatus>
		mEndedOnDock = l;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #64  <Field int mEndedOnDock>
		mRobotSpecificStates = hashmap;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #66  <Field HashMap mRobotSpecificStates>
		mSquareFeetCovered = i1;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #68  <Field int mSquareFeetCovered>
		mMinutesRunning = j1;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #70  <Field int mMinutesRunning>
		mMinutesCharging = k1;
	//   26   49:aload_0         
	//   27   50:iload           9
	//   28   52:putfield        #72  <Field int mMinutesCharging>
		mMinutesPaused = l1;
	//   29   55:aload_0         
	//   30   56:iload           10
	//   31   58:putfield        #74  <Field int mMinutesPaused>
		mMinutesDone = i2;
	//   32   61:aload_0         
	//   33   62:iload           11
	//   34   64:putfield        #76  <Field int mMinutesDone>
		mMissionDurationInMinutes = j2;
	//   35   67:aload_0         
	//   36   68:iload           12
	//   37   70:putfield        #78  <Field int mMissionDurationInMinutes>
		mNumberOfDirtDetects = word0;
	//   38   73:aload_0         
	//   39   74:iload           13
	//   40   76:putfield        #80  <Field short mNumberOfDirtDetects>
		mNumberOfTimesCharged = word1;
	//   41   79:aload_0         
	//   42   80:iload           14
	//   43   82:putfield        #82  <Field short mNumberOfTimesCharged>
		mNumberOfRescues = word2;
	//   44   85:aload_0         
	//   45   86:iload           15
	//   46   88:putfield        #84  <Field short mNumberOfRescues>
		mNumberOfEvacuations = word3;
	//   47   91:aload_0         
	//   48   92:iload           16
	//   49   94:putfield        #86  <Field short mNumberOfEvacuations>
		mErrorCode = word4;
	//   50   97:aload_0         
	//   51   98:iload           17
	//   52  100:putfield        #88  <Field short mErrorCode>
		mWifiSignalStrengthHistory = arraylist;
	//   53  103:aload_0         
	//   54  104:aload           18
	//   55  106:putfield        #90  <Field ArrayList mWifiSignalStrengthHistory>
		mDidEvacuateForMission = flag;
	//   56  109:aload_0         
	//   57  110:iload           19
	//   58  112:putfield        #92  <Field boolean mDidEvacuateForMission>
		mDockErrorStateForMission = k2;
	//   59  115:aload_0         
	//   60  116:iload           20
	//   61  118:putfield        #94  <Field int mDockErrorStateForMission>
		mDockReplacementErrorStringId = s;
	//   62  121:aload_0         
	//   63  122:aload           21
	//   64  124:putfield        #96  <Field String mDockReplacementErrorStringId>
		mDockErrorHelpId = s1;
	//   65  127:aload_0         
	//   66  128:aload           22
	//   67  130:putfield        #98  <Field String mDockErrorHelpId>
		mStaticMapId = s2;
	//   68  133:aload_0         
	//   69  134:aload           23
	//   70  136:putfield        #100 <Field String mStaticMapId>
		mStaticMapRequestedId = s3;
	//   71  139:aload_0         
	//   72  140:aload           24
	//   73  142:putfield        #102 <Field String mStaticMapRequestedId>
		mPersistentMapIds = arraylist1;
	//   74  145:aload_0         
	//   75  146:aload           25
	//   76  148:putfield        #104 <Field ArrayList mPersistentMapIds>
		mPersistentRobotMapIds = arraylist2;
	//   77  151:aload_0         
	//   78  152:aload           26
	//   79  154:putfield        #106 <Field ArrayList mPersistentRobotMapIds>
		mNumberOfTanksUsed = word5;
	//   80  157:aload_0         
	//   81  158:iload           27
	//   82  160:putfield        #108 <Field short mNumberOfTanksUsed>
		mRankOverlapSelected = robotrankoverlap;
	//   83  163:aload_0         
	//   84  164:aload           28
	//   85  166:putfield        #110 <Field RobotRankOverlap mRankOverlapSelected>
		mPadCategoryUsed = robotpadcategory;
	//   86  169:aload_0         
	//   87  170:aload           29
	//   88  172:putfield        #112 <Field RobotPadCategory mPadCategoryUsed>
		mCommandType = s4;
	//   89  175:aload_0         
	//   90  176:aload           30
	//   91  178:putfield        #114 <Field String mCommandType>
	//   92  181:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof RobotMissionHistoryItem;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class RobotMissionHistoryItem>
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
		obj = ((Object) ((RobotMissionHistoryItem)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class RobotMissionHistoryItem>
	//   11   17:astore_1        
		flag = flag1;
	//   12   18:iload_3         
	//   13   19:istore_2        
		if(mTimestamp == ((RobotMissionHistoryItem) (obj)).mTimestamp)
	//*  14   20:aload_0         
	//*  15   21:getfield        #56  <Field int mTimestamp>
	//*  16   24:aload_1         
	//*  17   25:getfield        #56  <Field int mTimestamp>
	//*  18   28:icmpne          437
		{
			flag = flag1;
	//   19   31:iload_3         
	//   20   32:istore_2        
			if(mStartTime == ((RobotMissionHistoryItem) (obj)).mStartTime)
	//*  21   33:aload_0         
	//*  22   34:getfield        #58  <Field int mStartTime>
	//*  23   37:aload_1         
	//*  24   38:getfield        #58  <Field int mStartTime>
	//*  25   41:icmpne          437
			{
				flag = flag1;
	//   26   44:iload_3         
	//   27   45:istore_2        
				if(mMissionId == ((RobotMissionHistoryItem) (obj)).mMissionId)
	//*  28   46:aload_0         
	//*  29   47:getfield        #60  <Field int mMissionId>
	//*  30   50:aload_1         
	//*  31   51:getfield        #60  <Field int mMissionId>
	//*  32   54:icmpne          437
				{
					flag = flag1;
	//   33   57:iload_3         
	//   34   58:istore_2        
					if(mCompletionStatus == ((RobotMissionHistoryItem) (obj)).mCompletionStatus)
	//*  35   59:aload_0         
	//*  36   60:getfield        #62  <Field RobotMissionHistoryCompletionStatus mCompletionStatus>
	//*  37   63:aload_1         
	//*  38   64:getfield        #62  <Field RobotMissionHistoryCompletionStatus mCompletionStatus>
	//*  39   67:if_acmpne       437
					{
						flag = flag1;
	//   40   70:iload_3         
	//   41   71:istore_2        
						if(mEndedOnDock == ((RobotMissionHistoryItem) (obj)).mEndedOnDock)
	//*  42   72:aload_0         
	//*  43   73:getfield        #64  <Field int mEndedOnDock>
	//*  44   76:aload_1         
	//*  45   77:getfield        #64  <Field int mEndedOnDock>
	//*  46   80:icmpne          437
						{
							flag = flag1;
	//   47   83:iload_3         
	//   48   84:istore_2        
							if(mRobotSpecificStates.equals(((Object) (((RobotMissionHistoryItem) (obj)).mRobotSpecificStates))))
	//*  49   85:aload_0         
	//*  50   86:getfield        #66  <Field HashMap mRobotSpecificStates>
	//*  51   89:aload_1         
	//*  52   90:getfield        #66  <Field HashMap mRobotSpecificStates>
	//*  53   93:invokevirtual   #123 <Method boolean HashMap.equals(Object)>
	//*  54   96:ifeq            437
							{
								flag = flag1;
	//   55   99:iload_3         
	//   56  100:istore_2        
								if(mSquareFeetCovered == ((RobotMissionHistoryItem) (obj)).mSquareFeetCovered)
	//*  57  101:aload_0         
	//*  58  102:getfield        #68  <Field int mSquareFeetCovered>
	//*  59  105:aload_1         
	//*  60  106:getfield        #68  <Field int mSquareFeetCovered>
	//*  61  109:icmpne          437
								{
									flag = flag1;
	//   62  112:iload_3         
	//   63  113:istore_2        
									if(mMinutesRunning == ((RobotMissionHistoryItem) (obj)).mMinutesRunning)
	//*  64  114:aload_0         
	//*  65  115:getfield        #70  <Field int mMinutesRunning>
	//*  66  118:aload_1         
	//*  67  119:getfield        #70  <Field int mMinutesRunning>
	//*  68  122:icmpne          437
									{
										flag = flag1;
	//   69  125:iload_3         
	//   70  126:istore_2        
										if(mMinutesCharging == ((RobotMissionHistoryItem) (obj)).mMinutesCharging)
	//*  71  127:aload_0         
	//*  72  128:getfield        #72  <Field int mMinutesCharging>
	//*  73  131:aload_1         
	//*  74  132:getfield        #72  <Field int mMinutesCharging>
	//*  75  135:icmpne          437
										{
											flag = flag1;
	//   76  138:iload_3         
	//   77  139:istore_2        
											if(mMinutesPaused == ((RobotMissionHistoryItem) (obj)).mMinutesPaused)
	//*  78  140:aload_0         
	//*  79  141:getfield        #74  <Field int mMinutesPaused>
	//*  80  144:aload_1         
	//*  81  145:getfield        #74  <Field int mMinutesPaused>
	//*  82  148:icmpne          437
											{
												flag = flag1;
	//   83  151:iload_3         
	//   84  152:istore_2        
												if(mMinutesDone == ((RobotMissionHistoryItem) (obj)).mMinutesDone)
	//*  85  153:aload_0         
	//*  86  154:getfield        #76  <Field int mMinutesDone>
	//*  87  157:aload_1         
	//*  88  158:getfield        #76  <Field int mMinutesDone>
	//*  89  161:icmpne          437
												{
													flag = flag1;
	//   90  164:iload_3         
	//   91  165:istore_2        
													if(mMissionDurationInMinutes == ((RobotMissionHistoryItem) (obj)).mMissionDurationInMinutes)
	//*  92  166:aload_0         
	//*  93  167:getfield        #78  <Field int mMissionDurationInMinutes>
	//*  94  170:aload_1         
	//*  95  171:getfield        #78  <Field int mMissionDurationInMinutes>
	//*  96  174:icmpne          437
													{
														flag = flag1;
	//   97  177:iload_3         
	//   98  178:istore_2        
														if(mNumberOfDirtDetects == ((RobotMissionHistoryItem) (obj)).mNumberOfDirtDetects)
	//*  99  179:aload_0         
	//* 100  180:getfield        #80  <Field short mNumberOfDirtDetects>
	//* 101  183:aload_1         
	//* 102  184:getfield        #80  <Field short mNumberOfDirtDetects>
	//* 103  187:icmpne          437
														{
															flag = flag1;
	//  104  190:iload_3         
	//  105  191:istore_2        
															if(mNumberOfTimesCharged == ((RobotMissionHistoryItem) (obj)).mNumberOfTimesCharged)
	//* 106  192:aload_0         
	//* 107  193:getfield        #82  <Field short mNumberOfTimesCharged>
	//* 108  196:aload_1         
	//* 109  197:getfield        #82  <Field short mNumberOfTimesCharged>
	//* 110  200:icmpne          437
															{
																flag = flag1;
	//  111  203:iload_3         
	//  112  204:istore_2        
																if(mNumberOfRescues == ((RobotMissionHistoryItem) (obj)).mNumberOfRescues)
	//* 113  205:aload_0         
	//* 114  206:getfield        #84  <Field short mNumberOfRescues>
	//* 115  209:aload_1         
	//* 116  210:getfield        #84  <Field short mNumberOfRescues>
	//* 117  213:icmpne          437
																{
																	flag = flag1;
	//  118  216:iload_3         
	//  119  217:istore_2        
																	if(mNumberOfEvacuations == ((RobotMissionHistoryItem) (obj)).mNumberOfEvacuations)
	//* 120  218:aload_0         
	//* 121  219:getfield        #86  <Field short mNumberOfEvacuations>
	//* 122  222:aload_1         
	//* 123  223:getfield        #86  <Field short mNumberOfEvacuations>
	//* 124  226:icmpne          437
																	{
																		flag = flag1;
	//  125  229:iload_3         
	//  126  230:istore_2        
																		if(mErrorCode == ((RobotMissionHistoryItem) (obj)).mErrorCode)
	//* 127  231:aload_0         
	//* 128  232:getfield        #88  <Field short mErrorCode>
	//* 129  235:aload_1         
	//* 130  236:getfield        #88  <Field short mErrorCode>
	//* 131  239:icmpne          437
																		{
																			flag = flag1;
	//  132  242:iload_3         
	//  133  243:istore_2        
																			if(mWifiSignalStrengthHistory.equals(((Object) (((RobotMissionHistoryItem) (obj)).mWifiSignalStrengthHistory))))
	//* 134  244:aload_0         
	//* 135  245:getfield        #90  <Field ArrayList mWifiSignalStrengthHistory>
	//* 136  248:aload_1         
	//* 137  249:getfield        #90  <Field ArrayList mWifiSignalStrengthHistory>
	//* 138  252:invokevirtual   #126 <Method boolean ArrayList.equals(Object)>
	//* 139  255:ifeq            437
																			{
																				flag = flag1;
	//  140  258:iload_3         
	//  141  259:istore_2        
																				if(mDidEvacuateForMission == ((RobotMissionHistoryItem) (obj)).mDidEvacuateForMission)
	//* 142  260:aload_0         
	//* 143  261:getfield        #92  <Field boolean mDidEvacuateForMission>
	//* 144  264:aload_1         
	//* 145  265:getfield        #92  <Field boolean mDidEvacuateForMission>
	//* 146  268:icmpne          437
																				{
																					flag = flag1;
	//  147  271:iload_3         
	//  148  272:istore_2        
																					if(mDockErrorStateForMission == ((RobotMissionHistoryItem) (obj)).mDockErrorStateForMission)
	//* 149  273:aload_0         
	//* 150  274:getfield        #94  <Field int mDockErrorStateForMission>
	//* 151  277:aload_1         
	//* 152  278:getfield        #94  <Field int mDockErrorStateForMission>
	//* 153  281:icmpne          437
																					{
																						flag = flag1;
	//  154  284:iload_3         
	//  155  285:istore_2        
																						if(mDockReplacementErrorStringId.equals(((Object) (((RobotMissionHistoryItem) (obj)).mDockReplacementErrorStringId))))
	//* 156  286:aload_0         
	//* 157  287:getfield        #96  <Field String mDockReplacementErrorStringId>
	//* 158  290:aload_1         
	//* 159  291:getfield        #96  <Field String mDockReplacementErrorStringId>
	//* 160  294:invokevirtual   #129 <Method boolean String.equals(Object)>
	//* 161  297:ifeq            437
																						{
																							flag = flag1;
	//  162  300:iload_3         
	//  163  301:istore_2        
																							if(mDockErrorHelpId.equals(((Object) (((RobotMissionHistoryItem) (obj)).mDockErrorHelpId))))
	//* 164  302:aload_0         
	//* 165  303:getfield        #98  <Field String mDockErrorHelpId>
	//* 166  306:aload_1         
	//* 167  307:getfield        #98  <Field String mDockErrorHelpId>
	//* 168  310:invokevirtual   #129 <Method boolean String.equals(Object)>
	//* 169  313:ifeq            437
																							{
																								flag = flag1;
	//  170  316:iload_3         
	//  171  317:istore_2        
																								if(mStaticMapId.equals(((Object) (((RobotMissionHistoryItem) (obj)).mStaticMapId))))
	//* 172  318:aload_0         
	//* 173  319:getfield        #100 <Field String mStaticMapId>
	//* 174  322:aload_1         
	//* 175  323:getfield        #100 <Field String mStaticMapId>
	//* 176  326:invokevirtual   #129 <Method boolean String.equals(Object)>
	//* 177  329:ifeq            437
																								{
																									flag = flag1;
	//  178  332:iload_3         
	//  179  333:istore_2        
																									if(mStaticMapRequestedId.equals(((Object) (((RobotMissionHistoryItem) (obj)).mStaticMapRequestedId))))
	//* 180  334:aload_0         
	//* 181  335:getfield        #102 <Field String mStaticMapRequestedId>
	//* 182  338:aload_1         
	//* 183  339:getfield        #102 <Field String mStaticMapRequestedId>
	//* 184  342:invokevirtual   #129 <Method boolean String.equals(Object)>
	//* 185  345:ifeq            437
																									{
																										flag = flag1;
	//  186  348:iload_3         
	//  187  349:istore_2        
																										if(mPersistentMapIds.equals(((Object) (((RobotMissionHistoryItem) (obj)).mPersistentMapIds))))
	//* 188  350:aload_0         
	//* 189  351:getfield        #104 <Field ArrayList mPersistentMapIds>
	//* 190  354:aload_1         
	//* 191  355:getfield        #104 <Field ArrayList mPersistentMapIds>
	//* 192  358:invokevirtual   #126 <Method boolean ArrayList.equals(Object)>
	//* 193  361:ifeq            437
																										{
																											flag = flag1;
	//  194  364:iload_3         
	//  195  365:istore_2        
																											if(mPersistentRobotMapIds.equals(((Object) (((RobotMissionHistoryItem) (obj)).mPersistentRobotMapIds))))
	//* 196  366:aload_0         
	//* 197  367:getfield        #106 <Field ArrayList mPersistentRobotMapIds>
	//* 198  370:aload_1         
	//* 199  371:getfield        #106 <Field ArrayList mPersistentRobotMapIds>
	//* 200  374:invokevirtual   #126 <Method boolean ArrayList.equals(Object)>
	//* 201  377:ifeq            437
																											{
																												flag = flag1;
	//  202  380:iload_3         
	//  203  381:istore_2        
																												if(mNumberOfTanksUsed == ((RobotMissionHistoryItem) (obj)).mNumberOfTanksUsed)
	//* 204  382:aload_0         
	//* 205  383:getfield        #108 <Field short mNumberOfTanksUsed>
	//* 206  386:aload_1         
	//* 207  387:getfield        #108 <Field short mNumberOfTanksUsed>
	//* 208  390:icmpne          437
																												{
																													flag = flag1;
	//  209  393:iload_3         
	//  210  394:istore_2        
																													if(mRankOverlapSelected == ((RobotMissionHistoryItem) (obj)).mRankOverlapSelected)
	//* 211  395:aload_0         
	//* 212  396:getfield        #110 <Field RobotRankOverlap mRankOverlapSelected>
	//* 213  399:aload_1         
	//* 214  400:getfield        #110 <Field RobotRankOverlap mRankOverlapSelected>
	//* 215  403:if_acmpne       437
																													{
																														flag = flag1;
	//  216  406:iload_3         
	//  217  407:istore_2        
																														if(mPadCategoryUsed == ((RobotMissionHistoryItem) (obj)).mPadCategoryUsed)
	//* 218  408:aload_0         
	//* 219  409:getfield        #112 <Field RobotPadCategory mPadCategoryUsed>
	//* 220  412:aload_1         
	//* 221  413:getfield        #112 <Field RobotPadCategory mPadCategoryUsed>
	//* 222  416:if_acmpne       437
																														{
																															flag = flag1;
	//  223  419:iload_3         
	//  224  420:istore_2        
																															if(mCommandType.equals(((Object) (((RobotMissionHistoryItem) (obj)).mCommandType))))
	//* 225  421:aload_0         
	//* 226  422:getfield        #114 <Field String mCommandType>
	//* 227  425:aload_1         
	//* 228  426:getfield        #114 <Field String mCommandType>
	//* 229  429:invokevirtual   #129 <Method boolean String.equals(Object)>
	//* 230  432:ifeq            437
																																flag = true;
	//  231  435:iconst_1        
	//  232  436:istore_2        
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
						}
					}
				}
			}
		}
		return flag;
	//  233  437:iload_2         
	//  234  438:ireturn         
	}

	public String getCommandType()
	{
		return mCommandType;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field String mCommandType>
	//    2    4:areturn         
	}

	public RobotMissionHistoryCompletionStatus getCompletionStatus()
	{
		return mCompletionStatus;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field RobotMissionHistoryCompletionStatus mCompletionStatus>
	//    2    4:areturn         
	}

	public boolean getDidEvacuateForMission()
	{
		return mDidEvacuateForMission;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field boolean mDidEvacuateForMission>
	//    2    4:ireturn         
	}

	public String getDockErrorHelpId()
	{
		return mDockErrorHelpId;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field String mDockErrorHelpId>
	//    2    4:areturn         
	}

	public int getDockErrorStateForMission()
	{
		return mDockErrorStateForMission;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int mDockErrorStateForMission>
	//    2    4:ireturn         
	}

	public String getDockReplacementErrorStringId()
	{
		return mDockReplacementErrorStringId;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field String mDockReplacementErrorStringId>
	//    2    4:areturn         
	}

	public int getEndedOnDock()
	{
		return mEndedOnDock;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int mEndedOnDock>
	//    2    4:ireturn         
	}

	public short getErrorCode()
	{
		return mErrorCode;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field short mErrorCode>
	//    2    4:ireturn         
	}

	public int getMinutesCharging()
	{
		return mMinutesCharging;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int mMinutesCharging>
	//    2    4:ireturn         
	}

	public int getMinutesDone()
	{
		return mMinutesDone;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field int mMinutesDone>
	//    2    4:ireturn         
	}

	public int getMinutesPaused()
	{
		return mMinutesPaused;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int mMinutesPaused>
	//    2    4:ireturn         
	}

	public int getMinutesRunning()
	{
		return mMinutesRunning;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int mMinutesRunning>
	//    2    4:ireturn         
	}

	public int getMissionDurationInMinutes()
	{
		return mMissionDurationInMinutes;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field int mMissionDurationInMinutes>
	//    2    4:ireturn         
	}

	public int getMissionId()
	{
		return mMissionId;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int mMissionId>
	//    2    4:ireturn         
	}

	public short getNumberOfDirtDetects()
	{
		return mNumberOfDirtDetects;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field short mNumberOfDirtDetects>
	//    2    4:ireturn         
	}

	public short getNumberOfEvacuations()
	{
		return mNumberOfEvacuations;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field short mNumberOfEvacuations>
	//    2    4:ireturn         
	}

	public short getNumberOfRescues()
	{
		return mNumberOfRescues;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field short mNumberOfRescues>
	//    2    4:ireturn         
	}

	public short getNumberOfTanksUsed()
	{
		return mNumberOfTanksUsed;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field short mNumberOfTanksUsed>
	//    2    4:ireturn         
	}

	public short getNumberOfTimesCharged()
	{
		return mNumberOfTimesCharged;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field short mNumberOfTimesCharged>
	//    2    4:ireturn         
	}

	public RobotPadCategory getPadCategoryUsed()
	{
		return mPadCategoryUsed;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field RobotPadCategory mPadCategoryUsed>
	//    2    4:areturn         
	}

	public ArrayList getPersistentMapIds()
	{
		return mPersistentMapIds;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field ArrayList mPersistentMapIds>
	//    2    4:areturn         
	}

	public ArrayList getPersistentRobotMapIds()
	{
		return mPersistentRobotMapIds;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field ArrayList mPersistentRobotMapIds>
	//    2    4:areturn         
	}

	public RobotRankOverlap getRankOverlapSelected()
	{
		return mRankOverlapSelected;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field RobotRankOverlap mRankOverlapSelected>
	//    2    4:areturn         
	}

	public HashMap getRobotSpecificStates()
	{
		return mRobotSpecificStates;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field HashMap mRobotSpecificStates>
	//    2    4:areturn         
	}

	public int getSquareFeetCovered()
	{
		return mSquareFeetCovered;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int mSquareFeetCovered>
	//    2    4:ireturn         
	}

	public int getStartTime()
	{
		return mStartTime;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int mStartTime>
	//    2    4:ireturn         
	}

	public String getStaticMapId()
	{
		return mStaticMapId;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field String mStaticMapId>
	//    2    4:areturn         
	}

	public String getStaticMapRequestedId()
	{
		return mStaticMapRequestedId;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field String mStaticMapRequestedId>
	//    2    4:areturn         
	}

	public int getTimestamp()
	{
		return mTimestamp;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int mTimestamp>
	//    2    4:ireturn         
	}

	public ArrayList getWifiSignalStrengthHistory()
	{
		return mWifiSignalStrengthHistory;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field ArrayList mWifiSignalStrengthHistory>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #174 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #176 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #181 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #184 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #185 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("RobotMissionHistoryItem{mTimestamp=");
	//    4    8:aload_1         
	//    5    9:ldc1            #187 <String "RobotMissionHistoryItem{mTimestamp=">
	//    6   11:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mTimestamp);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #56  <Field int mTimestamp>
	//   11   20:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(",mStartTime=");
	//   13   24:aload_1         
	//   14   25:ldc1            #196 <String ",mStartTime=">
	//   15   27:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mStartTime);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #58  <Field int mStartTime>
	//   20   36:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		stringbuilder.append(",mMissionId=");
	//   22   40:aload_1         
	//   23   41:ldc1            #198 <String ",mMissionId=">
	//   24   43:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mMissionId);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #60  <Field int mMissionId>
	//   29   52:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//   30   55:pop             
		stringbuilder.append(",mCompletionStatus=");
	//   31   56:aload_1         
	//   32   57:ldc1            #200 <String ",mCompletionStatus=">
	//   33   59:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(((Object) (mCompletionStatus)));
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #62  <Field RobotMissionHistoryCompletionStatus mCompletionStatus>
	//   38   68:invokevirtual   #203 <Method StringBuilder StringBuilder.append(Object)>
	//   39   71:pop             
		stringbuilder.append(",mEndedOnDock=");
	//   40   72:aload_1         
	//   41   73:ldc1            #205 <String ",mEndedOnDock=">
	//   42   75:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(mEndedOnDock);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #64  <Field int mEndedOnDock>
	//   47   84:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//   48   87:pop             
		stringbuilder.append(",mRobotSpecificStates=");
	//   49   88:aload_1         
	//   50   89:ldc1            #207 <String ",mRobotSpecificStates=">
	//   51   91:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(((Object) (mRobotSpecificStates)));
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #66  <Field HashMap mRobotSpecificStates>
	//   56  100:invokevirtual   #203 <Method StringBuilder StringBuilder.append(Object)>
	//   57  103:pop             
		stringbuilder.append(",mSquareFeetCovered=");
	//   58  104:aload_1         
	//   59  105:ldc1            #209 <String ",mSquareFeetCovered=">
	//   60  107:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   61  110:pop             
		stringbuilder.append(mSquareFeetCovered);
	//   62  111:aload_1         
	//   63  112:aload_0         
	//   64  113:getfield        #68  <Field int mSquareFeetCovered>
	//   65  116:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//   66  119:pop             
		stringbuilder.append(",mMinutesRunning=");
	//   67  120:aload_1         
	//   68  121:ldc1            #211 <String ",mMinutesRunning=">
	//   69  123:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   70  126:pop             
		stringbuilder.append(mMinutesRunning);
	//   71  127:aload_1         
	//   72  128:aload_0         
	//   73  129:getfield        #70  <Field int mMinutesRunning>
	//   74  132:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//   75  135:pop             
		stringbuilder.append(",mMinutesCharging=");
	//   76  136:aload_1         
	//   77  137:ldc1            #213 <String ",mMinutesCharging=">
	//   78  139:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   79  142:pop             
		stringbuilder.append(mMinutesCharging);
	//   80  143:aload_1         
	//   81  144:aload_0         
	//   82  145:getfield        #72  <Field int mMinutesCharging>
	//   83  148:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//   84  151:pop             
		stringbuilder.append(",mMinutesPaused=");
	//   85  152:aload_1         
	//   86  153:ldc1            #215 <String ",mMinutesPaused=">
	//   87  155:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   88  158:pop             
		stringbuilder.append(mMinutesPaused);
	//   89  159:aload_1         
	//   90  160:aload_0         
	//   91  161:getfield        #74  <Field int mMinutesPaused>
	//   92  164:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//   93  167:pop             
		stringbuilder.append(",mMinutesDone=");
	//   94  168:aload_1         
	//   95  169:ldc1            #217 <String ",mMinutesDone=">
	//   96  171:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   97  174:pop             
		stringbuilder.append(mMinutesDone);
	//   98  175:aload_1         
	//   99  176:aload_0         
	//  100  177:getfield        #76  <Field int mMinutesDone>
	//  101  180:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//  102  183:pop             
		stringbuilder.append(",mMissionDurationInMinutes=");
	//  103  184:aload_1         
	//  104  185:ldc1            #219 <String ",mMissionDurationInMinutes=">
	//  105  187:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  106  190:pop             
		stringbuilder.append(mMissionDurationInMinutes);
	//  107  191:aload_1         
	//  108  192:aload_0         
	//  109  193:getfield        #78  <Field int mMissionDurationInMinutes>
	//  110  196:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//  111  199:pop             
		stringbuilder.append(",mNumberOfDirtDetects=");
	//  112  200:aload_1         
	//  113  201:ldc1            #221 <String ",mNumberOfDirtDetects=">
	//  114  203:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  115  206:pop             
		stringbuilder.append(((int) (mNumberOfDirtDetects)));
	//  116  207:aload_1         
	//  117  208:aload_0         
	//  118  209:getfield        #80  <Field short mNumberOfDirtDetects>
	//  119  212:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//  120  215:pop             
		stringbuilder.append(",mNumberOfTimesCharged=");
	//  121  216:aload_1         
	//  122  217:ldc1            #223 <String ",mNumberOfTimesCharged=">
	//  123  219:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  124  222:pop             
		stringbuilder.append(((int) (mNumberOfTimesCharged)));
	//  125  223:aload_1         
	//  126  224:aload_0         
	//  127  225:getfield        #82  <Field short mNumberOfTimesCharged>
	//  128  228:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//  129  231:pop             
		stringbuilder.append(",mNumberOfRescues=");
	//  130  232:aload_1         
	//  131  233:ldc1            #225 <String ",mNumberOfRescues=">
	//  132  235:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  133  238:pop             
		stringbuilder.append(((int) (mNumberOfRescues)));
	//  134  239:aload_1         
	//  135  240:aload_0         
	//  136  241:getfield        #84  <Field short mNumberOfRescues>
	//  137  244:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//  138  247:pop             
		stringbuilder.append(",mNumberOfEvacuations=");
	//  139  248:aload_1         
	//  140  249:ldc1            #227 <String ",mNumberOfEvacuations=">
	//  141  251:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  142  254:pop             
		stringbuilder.append(((int) (mNumberOfEvacuations)));
	//  143  255:aload_1         
	//  144  256:aload_0         
	//  145  257:getfield        #86  <Field short mNumberOfEvacuations>
	//  146  260:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//  147  263:pop             
		stringbuilder.append(",mErrorCode=");
	//  148  264:aload_1         
	//  149  265:ldc1            #229 <String ",mErrorCode=">
	//  150  267:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  151  270:pop             
		stringbuilder.append(((int) (mErrorCode)));
	//  152  271:aload_1         
	//  153  272:aload_0         
	//  154  273:getfield        #88  <Field short mErrorCode>
	//  155  276:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//  156  279:pop             
		stringbuilder.append(",mWifiSignalStrengthHistory=");
	//  157  280:aload_1         
	//  158  281:ldc1            #231 <String ",mWifiSignalStrengthHistory=">
	//  159  283:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  160  286:pop             
		stringbuilder.append(((Object) (mWifiSignalStrengthHistory)));
	//  161  287:aload_1         
	//  162  288:aload_0         
	//  163  289:getfield        #90  <Field ArrayList mWifiSignalStrengthHistory>
	//  164  292:invokevirtual   #203 <Method StringBuilder StringBuilder.append(Object)>
	//  165  295:pop             
		stringbuilder.append(",mDidEvacuateForMission=");
	//  166  296:aload_1         
	//  167  297:ldc1            #233 <String ",mDidEvacuateForMission=">
	//  168  299:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  169  302:pop             
		stringbuilder.append(mDidEvacuateForMission);
	//  170  303:aload_1         
	//  171  304:aload_0         
	//  172  305:getfield        #92  <Field boolean mDidEvacuateForMission>
	//  173  308:invokevirtual   #236 <Method StringBuilder StringBuilder.append(boolean)>
	//  174  311:pop             
		stringbuilder.append(",mDockErrorStateForMission=");
	//  175  312:aload_1         
	//  176  313:ldc1            #238 <String ",mDockErrorStateForMission=">
	//  177  315:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  178  318:pop             
		stringbuilder.append(mDockErrorStateForMission);
	//  179  319:aload_1         
	//  180  320:aload_0         
	//  181  321:getfield        #94  <Field int mDockErrorStateForMission>
	//  182  324:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//  183  327:pop             
		stringbuilder.append(",mDockReplacementErrorStringId=");
	//  184  328:aload_1         
	//  185  329:ldc1            #240 <String ",mDockReplacementErrorStringId=">
	//  186  331:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  187  334:pop             
		stringbuilder.append(mDockReplacementErrorStringId);
	//  188  335:aload_1         
	//  189  336:aload_0         
	//  190  337:getfield        #96  <Field String mDockReplacementErrorStringId>
	//  191  340:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  192  343:pop             
		stringbuilder.append(",mDockErrorHelpId=");
	//  193  344:aload_1         
	//  194  345:ldc1            #242 <String ",mDockErrorHelpId=">
	//  195  347:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  196  350:pop             
		stringbuilder.append(mDockErrorHelpId);
	//  197  351:aload_1         
	//  198  352:aload_0         
	//  199  353:getfield        #98  <Field String mDockErrorHelpId>
	//  200  356:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  201  359:pop             
		stringbuilder.append(",mStaticMapId=");
	//  202  360:aload_1         
	//  203  361:ldc1            #244 <String ",mStaticMapId=">
	//  204  363:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  205  366:pop             
		stringbuilder.append(mStaticMapId);
	//  206  367:aload_1         
	//  207  368:aload_0         
	//  208  369:getfield        #100 <Field String mStaticMapId>
	//  209  372:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  210  375:pop             
		stringbuilder.append(",mStaticMapRequestedId=");
	//  211  376:aload_1         
	//  212  377:ldc1            #246 <String ",mStaticMapRequestedId=">
	//  213  379:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  214  382:pop             
		stringbuilder.append(mStaticMapRequestedId);
	//  215  383:aload_1         
	//  216  384:aload_0         
	//  217  385:getfield        #102 <Field String mStaticMapRequestedId>
	//  218  388:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  219  391:pop             
		stringbuilder.append(",mPersistentMapIds=");
	//  220  392:aload_1         
	//  221  393:ldc1            #248 <String ",mPersistentMapIds=">
	//  222  395:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  223  398:pop             
		stringbuilder.append(((Object) (mPersistentMapIds)));
	//  224  399:aload_1         
	//  225  400:aload_0         
	//  226  401:getfield        #104 <Field ArrayList mPersistentMapIds>
	//  227  404:invokevirtual   #203 <Method StringBuilder StringBuilder.append(Object)>
	//  228  407:pop             
		stringbuilder.append(",mPersistentRobotMapIds=");
	//  229  408:aload_1         
	//  230  409:ldc1            #250 <String ",mPersistentRobotMapIds=">
	//  231  411:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  232  414:pop             
		stringbuilder.append(((Object) (mPersistentRobotMapIds)));
	//  233  415:aload_1         
	//  234  416:aload_0         
	//  235  417:getfield        #106 <Field ArrayList mPersistentRobotMapIds>
	//  236  420:invokevirtual   #203 <Method StringBuilder StringBuilder.append(Object)>
	//  237  423:pop             
		stringbuilder.append(",mNumberOfTanksUsed=");
	//  238  424:aload_1         
	//  239  425:ldc1            #252 <String ",mNumberOfTanksUsed=">
	//  240  427:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  241  430:pop             
		stringbuilder.append(((int) (mNumberOfTanksUsed)));
	//  242  431:aload_1         
	//  243  432:aload_0         
	//  244  433:getfield        #108 <Field short mNumberOfTanksUsed>
	//  245  436:invokevirtual   #194 <Method StringBuilder StringBuilder.append(int)>
	//  246  439:pop             
		stringbuilder.append(",mRankOverlapSelected=");
	//  247  440:aload_1         
	//  248  441:ldc1            #254 <String ",mRankOverlapSelected=">
	//  249  443:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  250  446:pop             
		stringbuilder.append(((Object) (mRankOverlapSelected)));
	//  251  447:aload_1         
	//  252  448:aload_0         
	//  253  449:getfield        #110 <Field RobotRankOverlap mRankOverlapSelected>
	//  254  452:invokevirtual   #203 <Method StringBuilder StringBuilder.append(Object)>
	//  255  455:pop             
		stringbuilder.append(",mPadCategoryUsed=");
	//  256  456:aload_1         
	//  257  457:ldc2            #256 <String ",mPadCategoryUsed=">
	//  258  460:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  259  463:pop             
		stringbuilder.append(((Object) (mPadCategoryUsed)));
	//  260  464:aload_1         
	//  261  465:aload_0         
	//  262  466:getfield        #112 <Field RobotPadCategory mPadCategoryUsed>
	//  263  469:invokevirtual   #203 <Method StringBuilder StringBuilder.append(Object)>
	//  264  472:pop             
		stringbuilder.append(",mCommandType=");
	//  265  473:aload_1         
	//  266  474:ldc2            #258 <String ",mCommandType=">
	//  267  477:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  268  480:pop             
		stringbuilder.append(mCommandType);
	//  269  481:aload_1         
	//  270  482:aload_0         
	//  271  483:getfield        #114 <Field String mCommandType>
	//  272  486:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  273  489:pop             
		stringbuilder.append("}");
	//  274  490:aload_1         
	//  275  491:ldc2            #260 <String "}">
	//  276  494:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//  277  497:pop             
		return stringbuilder.toString();
	//  278  498:aload_1         
	//  279  499:invokevirtual   #262 <Method String StringBuilder.toString()>
	//  280  502:areturn         
	}

	public static final String COMMAND_TYPE_TRAIN = "train";
	final String mCommandType;
	final RobotMissionHistoryCompletionStatus mCompletionStatus;
	final boolean mDidEvacuateForMission;
	final String mDockErrorHelpId;
	final int mDockErrorStateForMission;
	final String mDockReplacementErrorStringId;
	final int mEndedOnDock;
	final short mErrorCode;
	final int mMinutesCharging;
	final int mMinutesDone;
	final int mMinutesPaused;
	final int mMinutesRunning;
	final int mMissionDurationInMinutes;
	final int mMissionId;
	final short mNumberOfDirtDetects;
	final short mNumberOfEvacuations;
	final short mNumberOfRescues;
	final short mNumberOfTanksUsed;
	final short mNumberOfTimesCharged;
	final RobotPadCategory mPadCategoryUsed;
	final ArrayList mPersistentMapIds;
	final ArrayList mPersistentRobotMapIds;
	final RobotRankOverlap mRankOverlapSelected;
	final HashMap mRobotSpecificStates;
	final int mSquareFeetCovered;
	final int mStartTime;
	final String mStaticMapId;
	final String mStaticMapRequestedId;
	final int mTimestamp;
	final ArrayList mWifiSignalStrengthHistory;
}

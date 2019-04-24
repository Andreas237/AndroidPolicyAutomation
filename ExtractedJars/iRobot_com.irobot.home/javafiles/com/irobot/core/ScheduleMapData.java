// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;

public final class ScheduleMapData
{

	public ScheduleMapData(String s, String s1, String s2, ArrayList arraylist, ArrayList arraylist1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mMapId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field String mMapId>
		mMapVersion = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field String mMapVersion>
		mLastUserEditedMapVersion = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field String mLastUserEditedMapVersion>
		mRegionIds = arraylist;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #27  <Field ArrayList mRegionIds>
		mRegionNames = arraylist1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #29  <Field ArrayList mRegionNames>
		mIsOrdered = flag;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #31  <Field boolean mIsOrdered>
	//   20   37:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof ScheduleMapData;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class ScheduleMapData>
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
		obj = ((Object) ((ScheduleMapData)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class ScheduleMapData>
	//   11   17:astore_1        
		flag = flag1;
	//   12   18:iload_3         
	//   13   19:istore_2        
		if(mMapId.equals(((Object) (((ScheduleMapData) (obj)).mMapId))))
	//*  14   20:aload_0         
	//*  15   21:getfield        #21  <Field String mMapId>
	//*  16   24:aload_1         
	//*  17   25:getfield        #21  <Field String mMapId>
	//*  18   28:invokevirtual   #40  <Method boolean String.equals(Object)>
	//*  19   31:ifeq            113
		{
			flag = flag1;
	//   20   34:iload_3         
	//   21   35:istore_2        
			if(mMapVersion.equals(((Object) (((ScheduleMapData) (obj)).mMapVersion))))
	//*  22   36:aload_0         
	//*  23   37:getfield        #23  <Field String mMapVersion>
	//*  24   40:aload_1         
	//*  25   41:getfield        #23  <Field String mMapVersion>
	//*  26   44:invokevirtual   #40  <Method boolean String.equals(Object)>
	//*  27   47:ifeq            113
			{
				flag = flag1;
	//   28   50:iload_3         
	//   29   51:istore_2        
				if(mLastUserEditedMapVersion.equals(((Object) (((ScheduleMapData) (obj)).mLastUserEditedMapVersion))))
	//*  30   52:aload_0         
	//*  31   53:getfield        #25  <Field String mLastUserEditedMapVersion>
	//*  32   56:aload_1         
	//*  33   57:getfield        #25  <Field String mLastUserEditedMapVersion>
	//*  34   60:invokevirtual   #40  <Method boolean String.equals(Object)>
	//*  35   63:ifeq            113
				{
					flag = flag1;
	//   36   66:iload_3         
	//   37   67:istore_2        
					if(mRegionIds.equals(((Object) (((ScheduleMapData) (obj)).mRegionIds))))
	//*  38   68:aload_0         
	//*  39   69:getfield        #27  <Field ArrayList mRegionIds>
	//*  40   72:aload_1         
	//*  41   73:getfield        #27  <Field ArrayList mRegionIds>
	//*  42   76:invokevirtual   #43  <Method boolean ArrayList.equals(Object)>
	//*  43   79:ifeq            113
					{
						flag = flag1;
	//   44   82:iload_3         
	//   45   83:istore_2        
						if(mRegionNames.equals(((Object) (((ScheduleMapData) (obj)).mRegionNames))))
	//*  46   84:aload_0         
	//*  47   85:getfield        #29  <Field ArrayList mRegionNames>
	//*  48   88:aload_1         
	//*  49   89:getfield        #29  <Field ArrayList mRegionNames>
	//*  50   92:invokevirtual   #43  <Method boolean ArrayList.equals(Object)>
	//*  51   95:ifeq            113
						{
							flag = flag1;
	//   52   98:iload_3         
	//   53   99:istore_2        
							if(mIsOrdered == ((ScheduleMapData) (obj)).mIsOrdered)
	//*  54  100:aload_0         
	//*  55  101:getfield        #31  <Field boolean mIsOrdered>
	//*  56  104:aload_1         
	//*  57  105:getfield        #31  <Field boolean mIsOrdered>
	//*  58  108:icmpne          113
								flag = true;
	//   59  111:iconst_1        
	//   60  112:istore_2        
						}
					}
				}
			}
		}
		return flag;
	//   61  113:iload_2         
	//   62  114:ireturn         
	}

	public boolean getIsOrdered()
	{
		return mIsOrdered;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field boolean mIsOrdered>
	//    2    4:ireturn         
	}

	public String getLastUserEditedMapVersion()
	{
		return mLastUserEditedMapVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String mLastUserEditedMapVersion>
	//    2    4:areturn         
	}

	public String getMapId()
	{
		return mMapId;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String mMapId>
	//    2    4:areturn         
	}

	public String getMapVersion()
	{
		return mMapVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String mMapVersion>
	//    2    4:areturn         
	}

	public ArrayList getRegionIds()
	{
		return mRegionIds;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ArrayList mRegionIds>
	//    2    4:areturn         
	}

	public ArrayList getRegionNames()
	{
		return mRegionNames;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayList mRegionNames>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #57  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #59  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #64  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #67  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ScheduleMapData{mMapId=");
	//    4    8:aload_1         
	//    5    9:ldc1            #70  <String "ScheduleMapData{mMapId=">
	//    6   11:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mMapId);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #21  <Field String mMapId>
	//   11   20:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(",mMapVersion=");
	//   13   24:aload_1         
	//   14   25:ldc1            #76  <String ",mMapVersion=">
	//   15   27:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mMapVersion);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #23  <Field String mMapVersion>
	//   20   36:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(",mLastUserEditedMapVersion=");
	//   22   40:aload_1         
	//   23   41:ldc1            #78  <String ",mLastUserEditedMapVersion=">
	//   24   43:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mLastUserEditedMapVersion);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #25  <Field String mLastUserEditedMapVersion>
	//   29   52:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append(",mRegionIds=");
	//   31   56:aload_1         
	//   32   57:ldc1            #80  <String ",mRegionIds=">
	//   33   59:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(((Object) (mRegionIds)));
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #27  <Field ArrayList mRegionIds>
	//   38   68:invokevirtual   #83  <Method StringBuilder StringBuilder.append(Object)>
	//   39   71:pop             
		stringbuilder.append(",mRegionNames=");
	//   40   72:aload_1         
	//   41   73:ldc1            #85  <String ",mRegionNames=">
	//   42   75:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(((Object) (mRegionNames)));
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #29  <Field ArrayList mRegionNames>
	//   47   84:invokevirtual   #83  <Method StringBuilder StringBuilder.append(Object)>
	//   48   87:pop             
		stringbuilder.append(",mIsOrdered=");
	//   49   88:aload_1         
	//   50   89:ldc1            #87  <String ",mIsOrdered=">
	//   51   91:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(mIsOrdered);
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #31  <Field boolean mIsOrdered>
	//   56  100:invokevirtual   #90  <Method StringBuilder StringBuilder.append(boolean)>
	//   57  103:pop             
		stringbuilder.append("}");
	//   58  104:aload_1         
	//   59  105:ldc1            #92  <String "}">
	//   60  107:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   61  110:pop             
		return stringbuilder.toString();
	//   62  111:aload_1         
	//   63  112:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   64  115:areturn         
	}

	final boolean mIsOrdered;
	final String mLastUserEditedMapVersion;
	final String mMapId;
	final String mMapVersion;
	final ArrayList mRegionIds;
	final ArrayList mRegionNames;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


// Referenced classes of package com.irobot.core:
//			ImageId

public final class RegionListItem
{

	public RegionListItem(String s, String s1, ImageId imageid, String s2, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mMapId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String mMapId>
		mRegionId = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String mRegionId>
		mIconImageId = imageid;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field ImageId mIconImageId>
		mName = s2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #26  <Field String mName>
		mIsDockInRegion = flag;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #28  <Field boolean mIsDockInRegion>
		mIsSelected = flag1;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #30  <Field boolean mIsSelected>
	//   20   37:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof RegionListItem;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class RegionListItem>
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
		obj = ((Object) ((RegionListItem)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class RegionListItem>
	//   11   17:astore_1        
		flag = flag1;
	//   12   18:iload_3         
	//   13   19:istore_2        
		if(mMapId.equals(((Object) (((RegionListItem) (obj)).mMapId))))
	//*  14   20:aload_0         
	//*  15   21:getfield        #20  <Field String mMapId>
	//*  16   24:aload_1         
	//*  17   25:getfield        #20  <Field String mMapId>
	//*  18   28:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  19   31:ifeq            107
		{
			flag = flag1;
	//   20   34:iload_3         
	//   21   35:istore_2        
			if(mRegionId.equals(((Object) (((RegionListItem) (obj)).mRegionId))))
	//*  22   36:aload_0         
	//*  23   37:getfield        #22  <Field String mRegionId>
	//*  24   40:aload_1         
	//*  25   41:getfield        #22  <Field String mRegionId>
	//*  26   44:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  27   47:ifeq            107
			{
				flag = flag1;
	//   28   50:iload_3         
	//   29   51:istore_2        
				if(mIconImageId == ((RegionListItem) (obj)).mIconImageId)
	//*  30   52:aload_0         
	//*  31   53:getfield        #24  <Field ImageId mIconImageId>
	//*  32   56:aload_1         
	//*  33   57:getfield        #24  <Field ImageId mIconImageId>
	//*  34   60:if_acmpne       107
				{
					flag = flag1;
	//   35   63:iload_3         
	//   36   64:istore_2        
					if(mName.equals(((Object) (((RegionListItem) (obj)).mName))))
	//*  37   65:aload_0         
	//*  38   66:getfield        #26  <Field String mName>
	//*  39   69:aload_1         
	//*  40   70:getfield        #26  <Field String mName>
	//*  41   73:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  42   76:ifeq            107
					{
						flag = flag1;
	//   43   79:iload_3         
	//   44   80:istore_2        
						if(mIsDockInRegion == ((RegionListItem) (obj)).mIsDockInRegion)
	//*  45   81:aload_0         
	//*  46   82:getfield        #28  <Field boolean mIsDockInRegion>
	//*  47   85:aload_1         
	//*  48   86:getfield        #28  <Field boolean mIsDockInRegion>
	//*  49   89:icmpne          107
						{
							flag = flag1;
	//   50   92:iload_3         
	//   51   93:istore_2        
							if(mIsSelected == ((RegionListItem) (obj)).mIsSelected)
	//*  52   94:aload_0         
	//*  53   95:getfield        #30  <Field boolean mIsSelected>
	//*  54   98:aload_1         
	//*  55   99:getfield        #30  <Field boolean mIsSelected>
	//*  56  102:icmpne          107
								flag = true;
	//   57  105:iconst_1        
	//   58  106:istore_2        
						}
					}
				}
			}
		}
		return flag;
	//   59  107:iload_2         
	//   60  108:ireturn         
	}

	public ImageId getIconImageId()
	{
		return mIconImageId;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ImageId mIconImageId>
	//    2    4:areturn         
	}

	public boolean getIsDockInRegion()
	{
		return mIsDockInRegion;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field boolean mIsDockInRegion>
	//    2    4:ireturn         
	}

	public boolean getIsSelected()
	{
		return mIsSelected;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean mIsSelected>
	//    2    4:ireturn         
	}

	public String getMapId()
	{
		return mMapId;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String mMapId>
	//    2    4:areturn         
	}

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String mName>
	//    2    4:areturn         
	}

	public String getRegionId()
	{
		return mRegionId;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String mRegionId>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #50  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #52  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #57  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #60  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("RegionListItem{mMapId=");
	//    4    8:aload_1         
	//    5    9:ldc1            #63  <String "RegionListItem{mMapId=">
	//    6   11:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mMapId);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #20  <Field String mMapId>
	//   11   20:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(",mRegionId=");
	//   13   24:aload_1         
	//   14   25:ldc1            #69  <String ",mRegionId=">
	//   15   27:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mRegionId);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #22  <Field String mRegionId>
	//   20   36:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(",mIconImageId=");
	//   22   40:aload_1         
	//   23   41:ldc1            #71  <String ",mIconImageId=">
	//   24   43:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(((Object) (mIconImageId)));
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #24  <Field ImageId mIconImageId>
	//   29   52:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   30   55:pop             
		stringbuilder.append(",mName=");
	//   31   56:aload_1         
	//   32   57:ldc1            #76  <String ",mName=">
	//   33   59:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(mName);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #26  <Field String mName>
	//   38   68:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   39   71:pop             
		stringbuilder.append(",mIsDockInRegion=");
	//   40   72:aload_1         
	//   41   73:ldc1            #78  <String ",mIsDockInRegion=">
	//   42   75:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(mIsDockInRegion);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #28  <Field boolean mIsDockInRegion>
	//   47   84:invokevirtual   #81  <Method StringBuilder StringBuilder.append(boolean)>
	//   48   87:pop             
		stringbuilder.append(",mIsSelected=");
	//   49   88:aload_1         
	//   50   89:ldc1            #83  <String ",mIsSelected=">
	//   51   91:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(mIsSelected);
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #30  <Field boolean mIsSelected>
	//   56  100:invokevirtual   #81  <Method StringBuilder StringBuilder.append(boolean)>
	//   57  103:pop             
		stringbuilder.append("}");
	//   58  104:aload_1         
	//   59  105:ldc1            #85  <String "}">
	//   60  107:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   61  110:pop             
		return stringbuilder.toString();
	//   62  111:aload_1         
	//   63  112:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   64  115:areturn         
	}

	final ImageId mIconImageId;
	final boolean mIsDockInRegion;
	final boolean mIsSelected;
	final String mMapId;
	final String mName;
	final String mRegionId;
}

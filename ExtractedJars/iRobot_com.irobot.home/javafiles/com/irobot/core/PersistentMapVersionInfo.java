// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class PersistentMapVersionInfo
{

	public PersistentMapVersionInfo(String s, String s1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mPmapId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field String mPmapId>
		mPmapVersionId = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #18  <Field String mPmapVersionId>
		mLastUpdatedTimeStamp = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #20  <Field int mLastUpdatedTimeStamp>
	//   11   19:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof PersistentMapVersionInfo;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class PersistentMapVersionInfo>
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
		obj = ((Object) ((PersistentMapVersionInfo)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class PersistentMapVersionInfo>
	//   11   17:astore_1        
		flag = flag1;
	//   12   18:iload_3         
	//   13   19:istore_2        
		if(mPmapId.equals(((Object) (((PersistentMapVersionInfo) (obj)).mPmapId))))
	//*  14   20:aload_0         
	//*  15   21:getfield        #16  <Field String mPmapId>
	//*  16   24:aload_1         
	//*  17   25:getfield        #16  <Field String mPmapId>
	//*  18   28:invokevirtual   #27  <Method boolean String.equals(Object)>
	//*  19   31:ifeq            65
		{
			flag = flag1;
	//   20   34:iload_3         
	//   21   35:istore_2        
			if(mPmapVersionId.equals(((Object) (((PersistentMapVersionInfo) (obj)).mPmapVersionId))))
	//*  22   36:aload_0         
	//*  23   37:getfield        #18  <Field String mPmapVersionId>
	//*  24   40:aload_1         
	//*  25   41:getfield        #18  <Field String mPmapVersionId>
	//*  26   44:invokevirtual   #27  <Method boolean String.equals(Object)>
	//*  27   47:ifeq            65
			{
				flag = flag1;
	//   28   50:iload_3         
	//   29   51:istore_2        
				if(mLastUpdatedTimeStamp == ((PersistentMapVersionInfo) (obj)).mLastUpdatedTimeStamp)
	//*  30   52:aload_0         
	//*  31   53:getfield        #20  <Field int mLastUpdatedTimeStamp>
	//*  32   56:aload_1         
	//*  33   57:getfield        #20  <Field int mLastUpdatedTimeStamp>
	//*  34   60:icmpne          65
					flag = true;
	//   35   63:iconst_1        
	//   36   64:istore_2        
			}
		}
		return flag;
	//   37   65:iload_2         
	//   38   66:ireturn         
	}

	public int getLastUpdatedTimeStamp()
	{
		return mLastUpdatedTimeStamp;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int mLastUpdatedTimeStamp>
	//    2    4:ireturn         
	}

	public String getPmapId()
	{
		return mPmapId;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field String mPmapId>
	//    2    4:areturn         
	}

	public String getPmapVersionId()
	{
		return mPmapVersionId;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String mPmapVersionId>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return ((527 + mPmapId.hashCode()) * 31 + mPmapVersionId.hashCode()) * 31 + mLastUpdatedTimeStamp;
	//    0    0:sipush          527
	//    1    3:aload_0         
	//    2    4:getfield        #16  <Field String mPmapId>
	//    3    7:invokevirtual   #35  <Method int String.hashCode()>
	//    4   10:iadd            
	//    5   11:bipush          31
	//    6   13:imul            
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field String mPmapVersionId>
	//    9   18:invokevirtual   #35  <Method int String.hashCode()>
	//   10   21:iadd            
	//   11   22:bipush          31
	//   12   24:imul            
	//   13   25:aload_0         
	//   14   26:getfield        #20  <Field int mLastUpdatedTimeStamp>
	//   15   29:iadd            
	//   16   30:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("PersistentMapVersionInfo{mPmapId=");
	//    4    8:aload_1         
	//    5    9:ldc1            #41  <String "PersistentMapVersionInfo{mPmapId=">
	//    6   11:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mPmapId);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #16  <Field String mPmapId>
	//   11   20:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(",mPmapVersionId=");
	//   13   24:aload_1         
	//   14   25:ldc1            #47  <String ",mPmapVersionId=">
	//   15   27:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mPmapVersionId);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #18  <Field String mPmapVersionId>
	//   20   36:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(",mLastUpdatedTimeStamp=");
	//   22   40:aload_1         
	//   23   41:ldc1            #49  <String ",mLastUpdatedTimeStamp=">
	//   24   43:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mLastUpdatedTimeStamp);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #20  <Field int mLastUpdatedTimeStamp>
	//   29   52:invokevirtual   #52  <Method StringBuilder StringBuilder.append(int)>
	//   30   55:pop             
		stringbuilder.append("}");
	//   31   56:aload_1         
	//   32   57:ldc1            #54  <String "}">
	//   33   59:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		return stringbuilder.toString();
	//   35   63:aload_1         
	//   36   64:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   37   67:areturn         
	}

	final int mLastUpdatedTimeStamp;
	final String mPmapId;
	final String mPmapVersionId;
}

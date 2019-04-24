// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class DockEvacuationLifetimeData
{

	public DockEvacuationLifetimeData(String s, String s1, int i, int j, int k, int l, int i1, 
			int j1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mDockId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field String mDockId>
		mDockVersion = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field String mDockVersion>
		mLastUpdateDate = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #25  <Field int mLastUpdateDate>
		mTotalEvacCount = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #27  <Field int mTotalEvacCount>
		mTotalEvacTime = k;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #29  <Field int mTotalEvacTime>
		mTotalDockingCount = l;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #31  <Field int mTotalDockingCount>
		mTotalMotorCount = i1;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #33  <Field int mTotalMotorCount>
		mEvacCountSinceFull = j1;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #35  <Field int mEvacCountSinceFull>
	//   26   49:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof DockEvacuationLifetimeData;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class DockEvacuationLifetimeData>
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
		obj = ((Object) ((DockEvacuationLifetimeData)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class DockEvacuationLifetimeData>
	//   11   17:astore_1        
		flag = flag1;
	//   12   18:iload_3         
	//   13   19:istore_2        
		if(mDockId.equals(((Object) (((DockEvacuationLifetimeData) (obj)).mDockId))))
	//*  14   20:aload_0         
	//*  15   21:getfield        #21  <Field String mDockId>
	//*  16   24:aload_1         
	//*  17   25:getfield        #21  <Field String mDockId>
	//*  18   28:invokevirtual   #42  <Method boolean String.equals(Object)>
	//*  19   31:ifeq            130
		{
			flag = flag1;
	//   20   34:iload_3         
	//   21   35:istore_2        
			if(mDockVersion.equals(((Object) (((DockEvacuationLifetimeData) (obj)).mDockVersion))))
	//*  22   36:aload_0         
	//*  23   37:getfield        #23  <Field String mDockVersion>
	//*  24   40:aload_1         
	//*  25   41:getfield        #23  <Field String mDockVersion>
	//*  26   44:invokevirtual   #42  <Method boolean String.equals(Object)>
	//*  27   47:ifeq            130
			{
				flag = flag1;
	//   28   50:iload_3         
	//   29   51:istore_2        
				if(mLastUpdateDate == ((DockEvacuationLifetimeData) (obj)).mLastUpdateDate)
	//*  30   52:aload_0         
	//*  31   53:getfield        #25  <Field int mLastUpdateDate>
	//*  32   56:aload_1         
	//*  33   57:getfield        #25  <Field int mLastUpdateDate>
	//*  34   60:icmpne          130
				{
					flag = flag1;
	//   35   63:iload_3         
	//   36   64:istore_2        
					if(mTotalEvacCount == ((DockEvacuationLifetimeData) (obj)).mTotalEvacCount)
	//*  37   65:aload_0         
	//*  38   66:getfield        #27  <Field int mTotalEvacCount>
	//*  39   69:aload_1         
	//*  40   70:getfield        #27  <Field int mTotalEvacCount>
	//*  41   73:icmpne          130
					{
						flag = flag1;
	//   42   76:iload_3         
	//   43   77:istore_2        
						if(mTotalEvacTime == ((DockEvacuationLifetimeData) (obj)).mTotalEvacTime)
	//*  44   78:aload_0         
	//*  45   79:getfield        #29  <Field int mTotalEvacTime>
	//*  46   82:aload_1         
	//*  47   83:getfield        #29  <Field int mTotalEvacTime>
	//*  48   86:icmpne          130
						{
							flag = flag1;
	//   49   89:iload_3         
	//   50   90:istore_2        
							if(mTotalDockingCount == ((DockEvacuationLifetimeData) (obj)).mTotalDockingCount)
	//*  51   91:aload_0         
	//*  52   92:getfield        #31  <Field int mTotalDockingCount>
	//*  53   95:aload_1         
	//*  54   96:getfield        #31  <Field int mTotalDockingCount>
	//*  55   99:icmpne          130
							{
								flag = flag1;
	//   56  102:iload_3         
	//   57  103:istore_2        
								if(mTotalMotorCount == ((DockEvacuationLifetimeData) (obj)).mTotalMotorCount)
	//*  58  104:aload_0         
	//*  59  105:getfield        #33  <Field int mTotalMotorCount>
	//*  60  108:aload_1         
	//*  61  109:getfield        #33  <Field int mTotalMotorCount>
	//*  62  112:icmpne          130
								{
									flag = flag1;
	//   63  115:iload_3         
	//   64  116:istore_2        
									if(mEvacCountSinceFull == ((DockEvacuationLifetimeData) (obj)).mEvacCountSinceFull)
	//*  65  117:aload_0         
	//*  66  118:getfield        #35  <Field int mEvacCountSinceFull>
	//*  67  121:aload_1         
	//*  68  122:getfield        #35  <Field int mEvacCountSinceFull>
	//*  69  125:icmpne          130
										flag = true;
	//   70  128:iconst_1        
	//   71  129:istore_2        
								}
							}
						}
					}
				}
			}
		}
		return flag;
	//   72  130:iload_2         
	//   73  131:ireturn         
	}

	public String getDockId()
	{
		return mDockId;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String mDockId>
	//    2    4:areturn         
	}

	public String getDockVersion()
	{
		return mDockVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String mDockVersion>
	//    2    4:areturn         
	}

	public int getEvacCountSinceFull()
	{
		return mEvacCountSinceFull;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int mEvacCountSinceFull>
	//    2    4:ireturn         
	}

	public int getLastUpdateDate()
	{
		return mLastUpdateDate;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int mLastUpdateDate>
	//    2    4:ireturn         
	}

	public int getTotalDockingCount()
	{
		return mTotalDockingCount;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int mTotalDockingCount>
	//    2    4:ireturn         
	}

	public int getTotalEvacCount()
	{
		return mTotalEvacCount;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int mTotalEvacCount>
	//    2    4:ireturn         
	}

	public int getTotalEvacTime()
	{
		return mTotalEvacTime;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int mTotalEvacTime>
	//    2    4:ireturn         
	}

	public int getTotalMotorCount()
	{
		return mTotalMotorCount;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int mTotalMotorCount>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return (((((((527 + mDockId.hashCode()) * 31 + mDockVersion.hashCode()) * 31 + mLastUpdateDate) * 31 + mTotalEvacCount) * 31 + mTotalEvacTime) * 31 + mTotalDockingCount) * 31 + mTotalMotorCount) * 31 + mEvacCountSinceFull;
	//    0    0:sipush          527
	//    1    3:aload_0         
	//    2    4:getfield        #21  <Field String mDockId>
	//    3    7:invokevirtual   #55  <Method int String.hashCode()>
	//    4   10:iadd            
	//    5   11:bipush          31
	//    6   13:imul            
	//    7   14:aload_0         
	//    8   15:getfield        #23  <Field String mDockVersion>
	//    9   18:invokevirtual   #55  <Method int String.hashCode()>
	//   10   21:iadd            
	//   11   22:bipush          31
	//   12   24:imul            
	//   13   25:aload_0         
	//   14   26:getfield        #25  <Field int mLastUpdateDate>
	//   15   29:iadd            
	//   16   30:bipush          31
	//   17   32:imul            
	//   18   33:aload_0         
	//   19   34:getfield        #27  <Field int mTotalEvacCount>
	//   20   37:iadd            
	//   21   38:bipush          31
	//   22   40:imul            
	//   23   41:aload_0         
	//   24   42:getfield        #29  <Field int mTotalEvacTime>
	//   25   45:iadd            
	//   26   46:bipush          31
	//   27   48:imul            
	//   28   49:aload_0         
	//   29   50:getfield        #31  <Field int mTotalDockingCount>
	//   30   53:iadd            
	//   31   54:bipush          31
	//   32   56:imul            
	//   33   57:aload_0         
	//   34   58:getfield        #33  <Field int mTotalMotorCount>
	//   35   61:iadd            
	//   36   62:bipush          31
	//   37   64:imul            
	//   38   65:aload_0         
	//   39   66:getfield        #35  <Field int mEvacCountSinceFull>
	//   40   69:iadd            
	//   41   70:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #58  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("DockEvacuationLifetimeData{mDockId=");
	//    4    8:aload_1         
	//    5    9:ldc1            #61  <String "DockEvacuationLifetimeData{mDockId=">
	//    6   11:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mDockId);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #21  <Field String mDockId>
	//   11   20:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(",mDockVersion=");
	//   13   24:aload_1         
	//   14   25:ldc1            #67  <String ",mDockVersion=">
	//   15   27:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mDockVersion);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #23  <Field String mDockVersion>
	//   20   36:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(",mLastUpdateDate=");
	//   22   40:aload_1         
	//   23   41:ldc1            #69  <String ",mLastUpdateDate=">
	//   24   43:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mLastUpdateDate);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #25  <Field int mLastUpdateDate>
	//   29   52:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//   30   55:pop             
		stringbuilder.append(",mTotalEvacCount=");
	//   31   56:aload_1         
	//   32   57:ldc1            #74  <String ",mTotalEvacCount=">
	//   33   59:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(mTotalEvacCount);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #27  <Field int mTotalEvacCount>
	//   38   68:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//   39   71:pop             
		stringbuilder.append(",mTotalEvacTime=");
	//   40   72:aload_1         
	//   41   73:ldc1            #76  <String ",mTotalEvacTime=">
	//   42   75:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(mTotalEvacTime);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #29  <Field int mTotalEvacTime>
	//   47   84:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//   48   87:pop             
		stringbuilder.append(",mTotalDockingCount=");
	//   49   88:aload_1         
	//   50   89:ldc1            #78  <String ",mTotalDockingCount=">
	//   51   91:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(mTotalDockingCount);
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #31  <Field int mTotalDockingCount>
	//   56  100:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//   57  103:pop             
		stringbuilder.append(",mTotalMotorCount=");
	//   58  104:aload_1         
	//   59  105:ldc1            #80  <String ",mTotalMotorCount=">
	//   60  107:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   61  110:pop             
		stringbuilder.append(mTotalMotorCount);
	//   62  111:aload_1         
	//   63  112:aload_0         
	//   64  113:getfield        #33  <Field int mTotalMotorCount>
	//   65  116:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//   66  119:pop             
		stringbuilder.append(",mEvacCountSinceFull=");
	//   67  120:aload_1         
	//   68  121:ldc1            #82  <String ",mEvacCountSinceFull=">
	//   69  123:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   70  126:pop             
		stringbuilder.append(mEvacCountSinceFull);
	//   71  127:aload_1         
	//   72  128:aload_0         
	//   73  129:getfield        #35  <Field int mEvacCountSinceFull>
	//   74  132:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
	//   75  135:pop             
		stringbuilder.append("}");
	//   76  136:aload_1         
	//   77  137:ldc1            #84  <String "}">
	//   78  139:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   79  142:pop             
		return stringbuilder.toString();
	//   80  143:aload_1         
	//   81  144:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   82  147:areturn         
	}

	final String mDockId;
	final String mDockVersion;
	final int mEvacCountSinceFull;
	final int mLastUpdateDate;
	final int mTotalDockingCount;
	final int mTotalEvacCount;
	final int mTotalEvacTime;
	final int mTotalMotorCount;
}

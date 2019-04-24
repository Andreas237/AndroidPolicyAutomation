// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class MaintenancePart
{

	public MaintenancePart(String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field String mId>
		mName = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field String mName>
		mBuyLink = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #19  <Field String mBuyLink>
	//   11   19:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof MaintenancePart;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class MaintenancePart>
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
		obj = ((Object) ((MaintenancePart)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class MaintenancePart>
	//   11   17:astore_1        
		flag = flag1;
	//   12   18:iload_3         
	//   13   19:istore_2        
		if(mId.equals(((Object) (((MaintenancePart) (obj)).mId))))
	//*  14   20:aload_0         
	//*  15   21:getfield        #15  <Field String mId>
	//*  16   24:aload_1         
	//*  17   25:getfield        #15  <Field String mId>
	//*  18   28:invokevirtual   #26  <Method boolean String.equals(Object)>
	//*  19   31:ifeq            68
		{
			flag = flag1;
	//   20   34:iload_3         
	//   21   35:istore_2        
			if(mName.equals(((Object) (((MaintenancePart) (obj)).mName))))
	//*  22   36:aload_0         
	//*  23   37:getfield        #17  <Field String mName>
	//*  24   40:aload_1         
	//*  25   41:getfield        #17  <Field String mName>
	//*  26   44:invokevirtual   #26  <Method boolean String.equals(Object)>
	//*  27   47:ifeq            68
			{
				flag = flag1;
	//   28   50:iload_3         
	//   29   51:istore_2        
				if(mBuyLink.equals(((Object) (((MaintenancePart) (obj)).mBuyLink))))
	//*  30   52:aload_0         
	//*  31   53:getfield        #19  <Field String mBuyLink>
	//*  32   56:aload_1         
	//*  33   57:getfield        #19  <Field String mBuyLink>
	//*  34   60:invokevirtual   #26  <Method boolean String.equals(Object)>
	//*  35   63:ifeq            68
					flag = true;
	//   36   66:iconst_1        
	//   37   67:istore_2        
			}
		}
		return flag;
	//   38   68:iload_2         
	//   39   69:ireturn         
	}

	public String getBuyLink()
	{
		return mBuyLink;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String mBuyLink>
	//    2    4:areturn         
	}

	public String getId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String mId>
	//    2    4:areturn         
	}

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String mName>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return ((527 + mId.hashCode()) * 31 + mName.hashCode()) * 31 + mBuyLink.hashCode();
	//    0    0:sipush          527
	//    1    3:aload_0         
	//    2    4:getfield        #15  <Field String mId>
	//    3    7:invokevirtual   #34  <Method int String.hashCode()>
	//    4   10:iadd            
	//    5   11:bipush          31
	//    6   13:imul            
	//    7   14:aload_0         
	//    8   15:getfield        #17  <Field String mName>
	//    9   18:invokevirtual   #34  <Method int String.hashCode()>
	//   10   21:iadd            
	//   11   22:bipush          31
	//   12   24:imul            
	//   13   25:aload_0         
	//   14   26:getfield        #19  <Field String mBuyLink>
	//   15   29:invokevirtual   #34  <Method int String.hashCode()>
	//   16   32:iadd            
	//   17   33:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #37  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MaintenancePart{mId=");
	//    4    8:aload_1         
	//    5    9:ldc1            #40  <String "MaintenancePart{mId=">
	//    6   11:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mId);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #15  <Field String mId>
	//   11   20:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(",mName=");
	//   13   24:aload_1         
	//   14   25:ldc1            #46  <String ",mName=">
	//   15   27:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mName);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #17  <Field String mName>
	//   20   36:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(",mBuyLink=");
	//   22   40:aload_1         
	//   23   41:ldc1            #48  <String ",mBuyLink=">
	//   24   43:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mBuyLink);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #19  <Field String mBuyLink>
	//   29   52:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append("}");
	//   31   56:aload_1         
	//   32   57:ldc1            #50  <String "}">
	//   33   59:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		return stringbuilder.toString();
	//   35   63:aload_1         
	//   36   64:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   37   67:areturn         
	}

	final String mBuyLink;
	final String mId;
	final String mName;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


class AdapterHelper$UpdateOp
{

	String cmdToString()
	{
		int i = cmd;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int cmd>
	//    2    4:istore_1        
		if(i != 4)
	//*   3    5:iload_1         
	//*   4    6:iconst_4        
	//*   5    7:icmpeq          52
		{
			if(i != 8)
	//*   6   10:iload_1         
	//*   7   11:bipush          8
	//*   8   13:icmpeq          49
				switch(i)
	//*   9   16:iload_1         
				{
	//*  10   17:tableswitch     1 2: default 40
	//	               1 46
	//	               2 43
				default:
					return "??";
	//   11   40:ldc1            #38  <String "??">
	//   12   42:areturn         

				case 2: // '\002'
					return "rm";
	//   13   43:ldc1            #40  <String "rm">
	//   14   45:areturn         

				case 1: // '\001'
					return "add";
	//   15   46:ldc1            #42  <String "add">
	//   16   48:areturn         
				}
			else
				return "mv";
	//   17   49:ldc1            #44  <String "mv">
	//   18   51:areturn         
		} else
		{
			return "up";
	//   19   52:ldc1            #46  <String "up">
	//   20   54:areturn         
		}
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
	//*   6    8:ifnull          149
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #52  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #52  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((AdapterHelper$UpdateOp)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class AdapterHelper$UpdateOp>
	//   16   28:astore_1        
			int i = cmd;
	//   17   29:aload_0         
	//   18   30:getfield        #27  <Field int cmd>
	//   19   33:istore_2        
			if(i != ((AdapterHelper$UpdateOp) (obj)).cmd)
	//*  20   34:iload_2         
	//*  21   35:aload_1         
	//*  22   36:getfield        #27  <Field int cmd>
	//*  23   39:icmpeq          44
				return false;
	//   24   42:iconst_0        
	//   25   43:ireturn         
			if(i == 8 && Math.abs(itemCount - positionStart) == 1 && itemCount == ((AdapterHelper$UpdateOp) (obj)).positionStart && positionStart == ((AdapterHelper$UpdateOp) (obj)).itemCount)
	//*  26   44:iload_2         
	//*  27   45:bipush          8
	//*  28   47:icmpne          90
	//*  29   50:aload_0         
	//*  30   51:getfield        #31  <Field int itemCount>
	//*  31   54:aload_0         
	//*  32   55:getfield        #29  <Field int positionStart>
	//*  33   58:isub            
	//*  34   59:invokestatic    #58  <Method int Math.abs(int)>
	//*  35   62:iconst_1        
	//*  36   63:icmpne          90
	//*  37   66:aload_0         
	//*  38   67:getfield        #31  <Field int itemCount>
	//*  39   70:aload_1         
	//*  40   71:getfield        #29  <Field int positionStart>
	//*  41   74:icmpne          90
	//*  42   77:aload_0         
	//*  43   78:getfield        #29  <Field int positionStart>
	//*  44   81:aload_1         
	//*  45   82:getfield        #31  <Field int itemCount>
	//*  46   85:icmpne          90
				return true;
	//   47   88:iconst_1        
	//   48   89:ireturn         
			if(itemCount != ((AdapterHelper$UpdateOp) (obj)).itemCount)
	//*  49   90:aload_0         
	//*  50   91:getfield        #31  <Field int itemCount>
	//*  51   94:aload_1         
	//*  52   95:getfield        #31  <Field int itemCount>
	//*  53   98:icmpeq          103
				return false;
	//   54  101:iconst_0        
	//   55  102:ireturn         
			if(positionStart != ((AdapterHelper$UpdateOp) (obj)).positionStart)
	//*  56  103:aload_0         
	//*  57  104:getfield        #29  <Field int positionStart>
	//*  58  107:aload_1         
	//*  59  108:getfield        #29  <Field int positionStart>
	//*  60  111:icmpeq          116
				return false;
	//   61  114:iconst_0        
	//   62  115:ireturn         
			Object obj1 = payload;
	//   63  116:aload_0         
	//   64  117:getfield        #33  <Field Object payload>
	//   65  120:astore_3        
			if(obj1 != null)
	//*  66  121:aload_3         
	//*  67  122:ifnull          138
			{
				if(!obj1.equals(((AdapterHelper$UpdateOp) (obj)).payload))
	//*  68  125:aload_3         
	//*  69  126:aload_1         
	//*  70  127:getfield        #33  <Field Object payload>
	//*  71  130:invokevirtual   #60  <Method boolean Object.equals(Object)>
	//*  72  133:ifne            147
					return false;
	//   73  136:iconst_0        
	//   74  137:ireturn         
			} else
			if(((AdapterHelper$UpdateOp) (obj)).payload != null)
	//*  75  138:aload_1         
	//*  76  139:getfield        #33  <Field Object payload>
	//*  77  142:ifnull          147
				return false;
	//   78  145:iconst_0        
	//   79  146:ireturn         
			return true;
	//   80  147:iconst_1        
	//   81  148:ireturn         
		} else
		{
			return false;
	//   82  149:iconst_0        
	//   83  150:ireturn         
		}
	}

	public int hashCode()
	{
		return (cmd * 31 + positionStart) * 31 + itemCount;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int cmd>
	//    2    4:bipush          31
	//    3    6:imul            
	//    4    7:aload_0         
	//    5    8:getfield        #29  <Field int positionStart>
	//    6   11:iadd            
	//    7   12:bipush          31
	//    8   14:imul            
	//    9   15:aload_0         
	//   10   16:getfield        #31  <Field int itemCount>
	//   11   19:iadd            
	//   12   20:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #65  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokestatic    #72  <Method int System.identityHashCode(Object)>
	//    7   13:invokestatic    #78  <Method String Integer.toHexString(int)>
	//    8   16:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append("[");
	//   10   20:aload_1         
	//   11   21:ldc1            #84  <String "[">
	//   12   23:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(cmdToString());
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:invokevirtual   #86  <Method String cmdToString()>
	//   17   32:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
		stringbuilder.append(",s:");
	//   19   36:aload_1         
	//   20   37:ldc1            #88  <String ",s:">
	//   21   39:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		stringbuilder.append(positionStart);
	//   23   43:aload_1         
	//   24   44:aload_0         
	//   25   45:getfield        #29  <Field int positionStart>
	//   26   48:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
	//   27   51:pop             
		stringbuilder.append("c:");
	//   28   52:aload_1         
	//   29   53:ldc1            #93  <String "c:">
	//   30   55:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   31   58:pop             
		stringbuilder.append(itemCount);
	//   32   59:aload_1         
	//   33   60:aload_0         
	//   34   61:getfield        #31  <Field int itemCount>
	//   35   64:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
	//   36   67:pop             
		stringbuilder.append(",p:");
	//   37   68:aload_1         
	//   38   69:ldc1            #95  <String ",p:">
	//   39   71:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   40   74:pop             
		stringbuilder.append(payload);
	//   41   75:aload_1         
	//   42   76:aload_0         
	//   43   77:getfield        #33  <Field Object payload>
	//   44   80:invokevirtual   #98  <Method StringBuilder StringBuilder.append(Object)>
	//   45   83:pop             
		stringbuilder.append("]");
	//   46   84:aload_1         
	//   47   85:ldc1            #100 <String "]">
	//   48   87:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   49   90:pop             
		return stringbuilder.toString();
	//   50   91:aload_1         
	//   51   92:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   52   95:areturn         
	}

	static final int ADD = 1;
	static final int MOVE = 8;
	static final int POOL_SIZE = 30;
	static final int REMOVE = 2;
	static final int UPDATE = 4;
	int cmd;
	int itemCount;
	Object payload;
	int positionStart;

	AdapterHelper$UpdateOp(int i, int j, int k, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		cmd = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #27  <Field int cmd>
		positionStart = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #29  <Field int positionStart>
		itemCount = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #31  <Field int itemCount>
		payload = obj;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #33  <Field Object payload>
	//   14   25:return          
	}
}

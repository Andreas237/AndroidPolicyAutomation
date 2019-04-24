// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			AdapterHelper

static class AdapterHelper$UpdateOp
{

	String cmdToString()
	{
		int i = cmd;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int cmd>
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
	//   11   40:ldc1            #41  <String "??">
	//   12   42:areturn         

				case 2: // '\002'
					return "rm";
	//   13   43:ldc1            #43  <String "rm">
	//   14   45:areturn         

				case 1: // '\001'
					return "add";
	//   15   46:ldc1            #45  <String "add">
	//   16   48:areturn         
				}
			else
				return "mv";
	//   17   49:ldc1            #47  <String "mv">
	//   18   51:areturn         
		} else
		{
			return "up";
	//   19   52:ldc1            #49  <String "up">
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
	//*   6    8:ifnull          151
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #55  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #55  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((AdapterHelper$UpdateOp)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class AdapterHelper$UpdateOp>
	//   16   28:astore_1        
			if(cmd != ((AdapterHelper$UpdateOp) (obj)).cmd)
	//*  17   29:aload_0         
	//*  18   30:getfield        #30  <Field int cmd>
	//*  19   33:aload_1         
	//*  20   34:getfield        #30  <Field int cmd>
	//*  21   37:icmpeq          42
				return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
			if(cmd == 8 && Math.abs(itemCount - positionStart) == 1 && itemCount == ((AdapterHelper$UpdateOp) (obj)).positionStart && positionStart == ((AdapterHelper$UpdateOp) (obj)).itemCount)
	//*  24   42:aload_0         
	//*  25   43:getfield        #30  <Field int cmd>
	//*  26   46:bipush          8
	//*  27   48:icmpne          91
	//*  28   51:aload_0         
	//*  29   52:getfield        #34  <Field int itemCount>
	//*  30   55:aload_0         
	//*  31   56:getfield        #32  <Field int positionStart>
	//*  32   59:isub            
	//*  33   60:invokestatic    #61  <Method int Math.abs(int)>
	//*  34   63:iconst_1        
	//*  35   64:icmpne          91
	//*  36   67:aload_0         
	//*  37   68:getfield        #34  <Field int itemCount>
	//*  38   71:aload_1         
	//*  39   72:getfield        #32  <Field int positionStart>
	//*  40   75:icmpne          91
	//*  41   78:aload_0         
	//*  42   79:getfield        #32  <Field int positionStart>
	//*  43   82:aload_1         
	//*  44   83:getfield        #34  <Field int itemCount>
	//*  45   86:icmpne          91
				return true;
	//   46   89:iconst_1        
	//   47   90:ireturn         
			if(itemCount != ((AdapterHelper$UpdateOp) (obj)).itemCount)
	//*  48   91:aload_0         
	//*  49   92:getfield        #34  <Field int itemCount>
	//*  50   95:aload_1         
	//*  51   96:getfield        #34  <Field int itemCount>
	//*  52   99:icmpeq          104
				return false;
	//   53  102:iconst_0        
	//   54  103:ireturn         
			if(positionStart != ((AdapterHelper$UpdateOp) (obj)).positionStart)
	//*  55  104:aload_0         
	//*  56  105:getfield        #32  <Field int positionStart>
	//*  57  108:aload_1         
	//*  58  109:getfield        #32  <Field int positionStart>
	//*  59  112:icmpeq          117
				return false;
	//   60  115:iconst_0        
	//   61  116:ireturn         
			if(payload != null)
	//*  62  117:aload_0         
	//*  63  118:getfield        #36  <Field Object payload>
	//*  64  121:ifnull          140
			{
				if(!payload.equals(((AdapterHelper$UpdateOp) (obj)).payload))
	//*  65  124:aload_0         
	//*  66  125:getfield        #36  <Field Object payload>
	//*  67  128:aload_1         
	//*  68  129:getfield        #36  <Field Object payload>
	//*  69  132:invokevirtual   #63  <Method boolean Object.equals(Object)>
	//*  70  135:ifne            149
					return false;
	//   71  138:iconst_0        
	//   72  139:ireturn         
			} else
			if(((AdapterHelper$UpdateOp) (obj)).payload != null)
	//*  73  140:aload_1         
	//*  74  141:getfield        #36  <Field Object payload>
	//*  75  144:ifnull          149
				return false;
	//   76  147:iconst_0        
	//   77  148:ireturn         
			return true;
	//   78  149:iconst_1        
	//   79  150:ireturn         
		} else
		{
			return false;
	//   80  151:iconst_0        
	//   81  152:ireturn         
		}
	}

	public int hashCode()
	{
		return 31 * (cmd * 31 + positionStart) + itemCount;
	//    0    0:bipush          31
	//    1    2:aload_0         
	//    2    3:getfield        #30  <Field int cmd>
	//    3    6:bipush          31
	//    4    8:imul            
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field int positionStart>
	//    7   13:iadd            
	//    8   14:imul            
	//    9   15:aload_0         
	//   10   16:getfield        #34  <Field int itemCount>
	//   11   19:iadd            
	//   12   20:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #68  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokestatic    #75  <Method int System.identityHashCode(Object)>
	//    7   13:invokestatic    #81  <Method String Integer.toHexString(int)>
	//    8   16:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append("[");
	//   10   20:aload_1         
	//   11   21:ldc1            #87  <String "[">
	//   12   23:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(cmdToString());
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:invokevirtual   #89  <Method String cmdToString()>
	//   17   32:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
		stringbuilder.append(",s:");
	//   19   36:aload_1         
	//   20   37:ldc1            #91  <String ",s:">
	//   21   39:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		stringbuilder.append(positionStart);
	//   23   43:aload_1         
	//   24   44:aload_0         
	//   25   45:getfield        #32  <Field int positionStart>
	//   26   48:invokevirtual   #94  <Method StringBuilder StringBuilder.append(int)>
	//   27   51:pop             
		stringbuilder.append("c:");
	//   28   52:aload_1         
	//   29   53:ldc1            #96  <String "c:">
	//   30   55:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   31   58:pop             
		stringbuilder.append(itemCount);
	//   32   59:aload_1         
	//   33   60:aload_0         
	//   34   61:getfield        #34  <Field int itemCount>
	//   35   64:invokevirtual   #94  <Method StringBuilder StringBuilder.append(int)>
	//   36   67:pop             
		stringbuilder.append(",p:");
	//   37   68:aload_1         
	//   38   69:ldc1            #98  <String ",p:">
	//   39   71:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   40   74:pop             
		stringbuilder.append(payload);
	//   41   75:aload_1         
	//   42   76:aload_0         
	//   43   77:getfield        #36  <Field Object payload>
	//   44   80:invokevirtual   #101 <Method StringBuilder StringBuilder.append(Object)>
	//   45   83:pop             
		stringbuilder.append("]");
	//   46   84:aload_1         
	//   47   85:ldc1            #103 <String "]">
	//   48   87:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   49   90:pop             
		return stringbuilder.toString();
	//   50   91:aload_1         
	//   51   92:invokevirtual   #105 <Method String StringBuilder.toString()>
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
	//    1    1:invokespecial   #28  <Method void Object()>
		cmd = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #30  <Field int cmd>
		positionStart = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #32  <Field int positionStart>
		itemCount = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #34  <Field int itemCount>
		payload = obj;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #36  <Field Object payload>
	//   14   25:return          
	}
}

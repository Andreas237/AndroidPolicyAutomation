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
		switch(cmd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field int cmd>
		{
	//*   2    4:tableswitch     1 8: default 52
	//	               1 55
	//	               2 58
	//	               3 67
	//	               4 61
	//	               5 67
	//	               6 67
	//	               7 67
	//	               8 64
	//*   3   52:goto            67
		case 1: // '\001'
			return "add";
	//    4   55:ldc1            #41  <String "add">
	//    5   57:areturn         

		case 2: // '\002'
			return "rm";
	//    6   58:ldc1            #43  <String "rm">
	//    7   60:areturn         

		case 4: // '\004'
			return "up";
	//    8   61:ldc1            #45  <String "up">
	//    9   63:areturn         

		case 8: // '\b'
			return "mv";
	//   10   64:ldc1            #47  <String "mv">
	//   11   66:areturn         
		}
		return "??";
	//   12   67:ldc1            #49  <String "??">
	//   13   69:areturn         
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
		if(obj == null || ((Object)this).getClass() != obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
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
	}

	public int hashCode()
	{
		return (cmd * 31 + positionStart) * 31 + itemCount;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int cmd>
	//    2    4:bipush          31
	//    3    6:imul            
	//    4    7:aload_0         
	//    5    8:getfield        #32  <Field int positionStart>
	//    6   11:iadd            
	//    7   12:bipush          31
	//    8   14:imul            
	//    9   15:aload_0         
	//   10   16:getfield        #34  <Field int itemCount>
	//   11   19:iadd            
	//   12   20:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append(Integer.toHexString(System.identityHashCode(((Object) (this))))).append("[").append(cmdToString()).append(",s:").append(positionStart).append("c:").append(itemCount).append(",p:").append(payload).append("]").toString();
	//    0    0:new             #68  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokestatic    #75  <Method int System.identityHashCode(Object)>
	//    5   11:invokestatic    #81  <Method String Integer.toHexString(int)>
	//    6   14:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #87  <String "[">
	//    8   19:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:aload_0         
	//   10   23:invokevirtual   #89  <Method String cmdToString()>
	//   11   26:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   12   29:ldc1            #91  <String ",s:">
	//   13   31:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   14   34:aload_0         
	//   15   35:getfield        #32  <Field int positionStart>
	//   16   38:invokevirtual   #94  <Method StringBuilder StringBuilder.append(int)>
	//   17   41:ldc1            #96  <String "c:">
	//   18   43:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   19   46:aload_0         
	//   20   47:getfield        #34  <Field int itemCount>
	//   21   50:invokevirtual   #94  <Method StringBuilder StringBuilder.append(int)>
	//   22   53:ldc1            #98  <String ",p:">
	//   23   55:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   24   58:aload_0         
	//   25   59:getfield        #36  <Field Object payload>
	//   26   62:invokevirtual   #101 <Method StringBuilder StringBuilder.append(Object)>
	//   27   65:ldc1            #103 <String "]">
	//   28   67:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   29   70:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   30   73:areturn         
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

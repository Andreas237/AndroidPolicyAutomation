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
	//	               3 52
	//	               4 61
	//	               5 52
	//	               6 52
	//	               7 52
	//	               8 64
		case 3: // '\003'
		case 5: // '\005'
		case 6: // '\006'
		case 7: // '\007'
		default:
			return "??";
	//    3   52:ldc1            #41  <String "??">
	//    4   54:areturn         

		case 1: // '\001'
			return "add";
	//    5   55:ldc1            #43  <String "add">
	//    6   57:areturn         

		case 2: // '\002'
			return "rm";
	//    7   58:ldc1            #45  <String "rm">
	//    8   60:areturn         

		case 4: // '\004'
			return "up";
	//    9   61:ldc1            #47  <String "up">
	//   10   63:areturn         

		case 8: // '\b'
			return "mv";
	//   11   64:ldc1            #49  <String "mv">
	//   12   66:areturn         
		}
	}

	public boolean equals(Object obj)
	{
		if(this != obj) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpne       7
_L1:
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
_L2:
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
		if(cmd == 8 && Math.abs(itemCount - positionStart) == 1 && itemCount == ((AdapterHelper$UpdateOp) (obj)).positionStart && positionStart == ((AdapterHelper$UpdateOp) (obj)).itemCount) goto _L1; else goto _L3
	//   24   42:aload_0         
	//   25   43:getfield        #30  <Field int cmd>
	//   26   46:bipush          8
	//   27   48:icmpne          89
	//   28   51:aload_0         
	//   29   52:getfield        #34  <Field int itemCount>
	//   30   55:aload_0         
	//   31   56:getfield        #32  <Field int positionStart>
	//   32   59:isub            
	//   33   60:invokestatic    #61  <Method int Math.abs(int)>
	//   34   63:iconst_1        
	//   35   64:icmpne          89
	//   36   67:aload_0         
	//   37   68:getfield        #34  <Field int itemCount>
	//   38   71:aload_1         
	//   39   72:getfield        #32  <Field int positionStart>
	//   40   75:icmpne          89
	//   41   78:aload_0         
	//   42   79:getfield        #32  <Field int positionStart>
	//   43   82:aload_1         
	//   44   83:getfield        #34  <Field int itemCount>
	//   45   86:icmpeq          5
_L3:
		if(itemCount != ((AdapterHelper$UpdateOp) (obj)).itemCount)
	//*  46   89:aload_0         
	//*  47   90:getfield        #34  <Field int itemCount>
	//*  48   93:aload_1         
	//*  49   94:getfield        #34  <Field int itemCount>
	//*  50   97:icmpeq          102
			return false;
	//   51  100:iconst_0        
	//   52  101:ireturn         
		if(positionStart != ((AdapterHelper$UpdateOp) (obj)).positionStart)
	//*  53  102:aload_0         
	//*  54  103:getfield        #32  <Field int positionStart>
	//*  55  106:aload_1         
	//*  56  107:getfield        #32  <Field int positionStart>
	//*  57  110:icmpeq          115
			return false;
	//   58  113:iconst_0        
	//   59  114:ireturn         
		if(payload == null)
			continue; /* Loop/switch isn't completed */
	//   60  115:aload_0         
	//   61  116:getfield        #36  <Field Object payload>
	//   62  119:ifnull          138
		if(payload.equals(((AdapterHelper$UpdateOp) (obj)).payload)) goto _L1; else goto _L4
	//   63  122:aload_0         
	//   64  123:getfield        #36  <Field Object payload>
	//   65  126:aload_1         
	//   66  127:getfield        #36  <Field Object payload>
	//   67  130:invokevirtual   #63  <Method boolean Object.equals(Object)>
	//   68  133:ifne            5
_L4:
		return false;
	//   69  136:iconst_0        
	//   70  137:ireturn         
		if(((AdapterHelper$UpdateOp) (obj)).payload == null) goto _L1; else goto _L5
	//   71  138:aload_1         
	//   72  139:getfield        #36  <Field Object payload>
	//   73  142:ifnull          5
_L5:
		return false;
	//   74  145:iconst_0        
	//   75  146:ireturn         
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

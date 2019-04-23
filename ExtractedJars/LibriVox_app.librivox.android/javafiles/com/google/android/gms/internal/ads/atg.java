// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ate, atd, atc, auh, 
//			ast, avm, avi, aqk, 
//			atf

final class atg extends ate
{

	private atg()
	{
		super(((atf) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #31  <Method void ate(atf)>
	//    3    5:return          
	}

	atg(atf atf)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void atg()>
	//    2    4:return          
	}

	private static List a(Object obj, long l, int i)
	{
		List list = c(obj, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #38  <Method List c(Object, long)>
	//    3    5:astore          5
		if(list.isEmpty())
	//*   4    7:aload           5
	//*   5    9:invokeinterface #44  <Method boolean List.isEmpty()>
	//*   6   14:ifeq            90
		{
			Object obj1;
			if(list instanceof atd)
	//*   7   17:aload           5
	//*   8   19:instanceof      #46  <Class atd>
	//*   9   22:ifeq            38
				obj1 = ((Object) (new atc(i)));
	//   10   25:new             #48  <Class atc>
	//   11   28:dup             
	//   12   29:iload_3         
	//   13   30:invokespecial   #51  <Method void atc(int)>
	//   14   33:astore          4
			else
	//*  15   35:goto            80
			if((list instanceof auh) && (list instanceof ast))
	//*  16   38:aload           5
	//*  17   40:instanceof      #53  <Class auh>
	//*  18   43:ifeq            70
	//*  19   46:aload           5
	//*  20   48:instanceof      #55  <Class ast>
	//*  21   51:ifeq            70
				obj1 = ((Object) (((ast)list).a(i)));
	//   22   54:aload           5
	//   23   56:checkcast       #55  <Class ast>
	//   24   59:iload_3         
	//   25   60:invokeinterface #58  <Method ast ast.a(int)>
	//   26   65:astore          4
			else
	//*  27   67:goto            80
				obj1 = ((Object) (new ArrayList(i)));
	//   28   70:new             #60  <Class ArrayList>
	//   29   73:dup             
	//   30   74:iload_3         
	//   31   75:invokespecial   #61  <Method void ArrayList(int)>
	//   32   78:astore          4
			avm.a(obj, l, obj1);
	//   33   80:aload_0         
	//   34   81:lload_1         
	//   35   82:aload           4
	//   36   84:invokestatic    #66  <Method void avm.a(Object, long, Object)>
			return ((List) (obj1));
	//   37   87:aload           4
	//   38   89:areturn         
		}
		if(a.isAssignableFrom(((Object) (list)).getClass()))
	//*  39   90:getstatic       #26  <Field Class a>
	//*  40   93:aload           5
	//*  41   95:invokevirtual   #24  <Method Class Object.getClass()>
	//*  42   98:invokevirtual   #72  <Method boolean Class.isAssignableFrom(Class)>
	//*  43  101:ifeq            140
		{
			ArrayList arraylist = new ArrayList(list.size() + i);
	//   44  104:new             #60  <Class ArrayList>
	//   45  107:dup             
	//   46  108:aload           5
	//   47  110:invokeinterface #76  <Method int List.size()>
	//   48  115:iload_3         
	//   49  116:iadd            
	//   50  117:invokespecial   #61  <Method void ArrayList(int)>
	//   51  120:astore          4
			arraylist.addAll(((java.util.Collection) (list)));
	//   52  122:aload           4
	//   53  124:aload           5
	//   54  126:invokevirtual   #80  <Method boolean ArrayList.addAll(java.util.Collection)>
	//   55  129:pop             
			avm.a(obj, l, ((Object) (arraylist)));
	//   56  130:aload_0         
	//   57  131:lload_1         
	//   58  132:aload           4
	//   59  134:invokestatic    #66  <Method void avm.a(Object, long, Object)>
			return ((List) (arraylist));
	//   60  137:aload           4
	//   61  139:areturn         
		}
		if(list instanceof avi)
	//*  62  140:aload           5
	//*  63  142:instanceof      #82  <Class avi>
	//*  64  145:ifeq            187
		{
			atc atc1 = new atc(list.size() + i);
	//   65  148:new             #48  <Class atc>
	//   66  151:dup             
	//   67  152:aload           5
	//   68  154:invokeinterface #76  <Method int List.size()>
	//   69  159:iload_3         
	//   70  160:iadd            
	//   71  161:invokespecial   #51  <Method void atc(int)>
	//   72  164:astore          4
			((aqk) (atc1)).addAll(((java.util.Collection) ((avi)list)));
	//   73  166:aload           4
	//   74  168:aload           5
	//   75  170:checkcast       #82  <Class avi>
	//   76  173:invokevirtual   #85  <Method boolean aqk.addAll(java.util.Collection)>
	//   77  176:pop             
			avm.a(obj, l, ((Object) (atc1)));
	//   78  177:aload_0         
	//   79  178:lload_1         
	//   80  179:aload           4
	//   81  181:invokestatic    #66  <Method void avm.a(Object, long, Object)>
			return ((List) (atc1));
	//   82  184:aload           4
	//   83  186:areturn         
		}
		Object obj2 = ((Object) (list));
	//   84  187:aload           5
	//   85  189:astore          4
		if(list instanceof auh)
	//*  86  191:aload           5
	//*  87  193:instanceof      #53  <Class auh>
	//*  88  196:ifeq            257
		{
			obj2 = ((Object) (list));
	//   89  199:aload           5
	//   90  201:astore          4
			if(list instanceof ast)
	//*  91  203:aload           5
	//*  92  205:instanceof      #55  <Class ast>
	//*  93  208:ifeq            257
			{
				ast ast1 = (ast)list;
	//   94  211:aload           5
	//   95  213:checkcast       #55  <Class ast>
	//   96  216:astore          6
				obj2 = ((Object) (list));
	//   97  218:aload           5
	//   98  220:astore          4
				if(!ast1.a())
	//*  99  222:aload           6
	//* 100  224:invokeinterface #87  <Method boolean ast.a()>
	//* 101  229:ifne            257
				{
					obj2 = ((Object) (ast1.a(list.size() + i)));
	//  102  232:aload           6
	//  103  234:aload           5
	//  104  236:invokeinterface #76  <Method int List.size()>
	//  105  241:iload_3         
	//  106  242:iadd            
	//  107  243:invokeinterface #58  <Method ast ast.a(int)>
	//  108  248:astore          4
					avm.a(obj, l, obj2);
	//  109  250:aload_0         
	//  110  251:lload_1         
	//  111  252:aload           4
	//  112  254:invokestatic    #66  <Method void avm.a(Object, long, Object)>
				}
			}
		}
		return ((List) (obj2));
	//  113  257:aload           4
	//  114  259:areturn         
	}

	private static List c(Object obj, long l)
	{
		return (List)avm.f(obj, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #91  <Method Object avm.f(Object, long)>
	//    3    5:checkcast       #40  <Class List>
	//    4    8:areturn         
	}

	final List a(Object obj, long l)
	{
		return a(obj, l, 10);
	//    0    0:aload_1         
	//    1    1:lload_2         
	//    2    2:bipush          10
	//    3    4:invokestatic    #93  <Method List a(Object, long, int)>
	//    4    7:areturn         
	}

	final void a(Object obj, Object obj1, long l)
	{
		obj1 = ((Object) (c(obj1, l)));
	//    0    0:aload_2         
	//    1    1:lload_3         
	//    2    2:invokestatic    #38  <Method List c(Object, long)>
	//    3    5:astore_2        
		List list = a(obj, l, ((List) (obj1)).size());
	//    4    6:aload_1         
	//    5    7:lload_3         
	//    6    8:aload_2         
	//    7    9:invokeinterface #76  <Method int List.size()>
	//    8   14:invokestatic    #93  <Method List a(Object, long, int)>
	//    9   17:astore          7
		int i = list.size();
	//   10   19:aload           7
	//   11   21:invokeinterface #76  <Method int List.size()>
	//   12   26:istore          5
		int j = ((List) (obj1)).size();
	//   13   28:aload_2         
	//   14   29:invokeinterface #76  <Method int List.size()>
	//   15   34:istore          6
		if(i > 0 && j > 0)
	//*  16   36:iload           5
	//*  17   38:ifle            55
	//*  18   41:iload           6
	//*  19   43:ifle            55
			list.addAll(((java.util.Collection) (obj1)));
	//   20   46:aload           7
	//   21   48:aload_2         
	//   22   49:invokeinterface #95  <Method boolean List.addAll(java.util.Collection)>
	//   23   54:pop             
		if(i > 0)
	//*  24   55:iload           5
	//*  25   57:ifle            63
			obj1 = ((Object) (list));
	//   26   60:aload           7
	//   27   62:astore_2        
		avm.a(obj, l, obj1);
	//   28   63:aload_1         
	//   29   64:lload_3         
	//   30   65:aload_2         
	//   31   66:invokestatic    #66  <Method void avm.a(Object, long, Object)>
	//   32   69:return          
	}

	final void b(Object obj, long l)
	{
		Object obj1 = ((Object) ((List)avm.f(obj, l)));
	//    0    0:aload_1         
	//    1    1:lload_2         
	//    2    2:invokestatic    #91  <Method Object avm.f(Object, long)>
	//    3    5:checkcast       #40  <Class List>
	//    4    8:astore          4
		if(obj1 instanceof atd)
	//*   5   10:aload           4
	//*   6   12:instanceof      #46  <Class atd>
	//*   7   15:ifeq            33
		{
			obj1 = ((Object) (((atd)obj1).e()));
	//    8   18:aload           4
	//    9   20:checkcast       #46  <Class atd>
	//   10   23:invokeinterface #101 <Method atd atd.e()>
	//   11   28:astore          4
		} else
	//*  12   30:goto            93
		{
			if(a.isAssignableFrom(obj1.getClass()))
	//*  13   33:getstatic       #26  <Field Class a>
	//*  14   36:aload           4
	//*  15   38:invokevirtual   #24  <Method Class Object.getClass()>
	//*  16   41:invokevirtual   #72  <Method boolean Class.isAssignableFrom(Class)>
	//*  17   44:ifeq            48
				return;
	//   18   47:return          
			if((obj1 instanceof auh) && (obj1 instanceof ast))
	//*  19   48:aload           4
	//*  20   50:instanceof      #53  <Class auh>
	//*  21   53:ifeq            86
	//*  22   56:aload           4
	//*  23   58:instanceof      #55  <Class ast>
	//*  24   61:ifeq            86
			{
				obj = ((Object) ((ast)obj1));
	//   25   64:aload           4
	//   26   66:checkcast       #55  <Class ast>
	//   27   69:astore_1        
				if(((ast) (obj)).a())
	//*  28   70:aload_1         
	//*  29   71:invokeinterface #87  <Method boolean ast.a()>
	//*  30   76:ifeq            85
					((ast) (obj)).b();
	//   31   79:aload_1         
	//   32   80:invokeinterface #103 <Method void ast.b()>
				return;
	//   33   85:return          
			}
			obj1 = ((Object) (Collections.unmodifiableList(((List) (obj1)))));
	//   34   86:aload           4
	//   35   88:invokestatic    #18  <Method List Collections.unmodifiableList(List)>
	//   36   91:astore          4
		}
		avm.a(obj, l, obj1);
	//   37   93:aload_1         
	//   38   94:lload_2         
	//   39   95:aload           4
	//   40   97:invokestatic    #66  <Method void avm.a(Object, long, Object)>
	//   41  100:return          
	}

	private static final Class a = ((Object) (Collections.unmodifiableList(Collections.emptyList()))).getClass();

	static 
	{
	//    0    0:invokestatic    #14  <Method List Collections.emptyList()>
	//    1    3:invokestatic    #18  <Method List Collections.unmodifiableList(List)>
	//    2    6:invokevirtual   #24  <Method Class Object.getClass()>
	//    3    9:putstatic       #26  <Field Class a>
	//*   4   12:return          
	}
}

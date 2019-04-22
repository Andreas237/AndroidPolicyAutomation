// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.ListUtil;
import java.util.*;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			ShadowDocument, ElementInfo

public final class ShadowDocument$UpdateBuilder
{

	private HashSet acquireNotNewChildrenHashSet()
	{
		HashSet hashset1 = mCachedNotNewChildrenSet;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field HashSet mCachedNotNewChildrenSet>
	//    2    4:astore_2        
		HashSet hashset = hashset1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(hashset1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       19
			hashset = new HashSet();
	//    7   11:new             #30  <Class HashSet>
	//    8   14:dup             
	//    9   15:invokespecial   #31  <Method void HashSet()>
	//   10   18:astore_1        
		mCachedNotNewChildrenSet = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #38  <Field HashSet mCachedNotNewChildrenSet>
		return hashset;
	//   14   24:aload_1         
	//   15   25:areturn         
	}

	private void releaseNotNewChildrenHashSet(HashSet hashset)
	{
		hashset.clear();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #45  <Method void HashSet.clear()>
		if(mCachedNotNewChildrenSet == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #38  <Field HashSet mCachedNotNewChildrenSet>
	//*   4    8:ifnonnull       16
			mCachedNotNewChildrenSet = hashset;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #38  <Field HashSet mCachedNotNewChildrenSet>
	//    8   16:return          
	}

	private void setElementParent(Object obj, Object obj1)
	{
		Object obj2 = ((Object) ((ElementInfo)mElementToInfoChangesMap.get(obj)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Map mElementToInfoChangesMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #54  <Method Object Map.get(Object)>
	//    4   10:checkcast       #56  <Class ElementInfo>
	//    5   13:astore_3        
		if(obj2 != null && obj1 == ((ElementInfo) (obj2)).parentElement)
	//*   6   14:aload_3         
	//*   7   15:ifnull          27
	//*   8   18:aload_2         
	//*   9   19:aload_3         
	//*  10   20:getfield        #60  <Field Object ElementInfo.parentElement>
	//*  11   23:if_acmpne       27
			return;
	//   12   26:return          
		ElementInfo elementinfo = (ElementInfo)ShadowDocument.access$000(ShadowDocument.this).get(obj);
	//   13   27:aload_0         
	//   14   28:getfield        #20  <Field ShadowDocument this$0>
	//   15   31:invokestatic    #64  <Method IdentityHashMap ShadowDocument.access$000(ShadowDocument)>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #67  <Method Object IdentityHashMap.get(Object)>
	//   18   38:checkcast       #56  <Class ElementInfo>
	//   19   41:astore          4
		if(obj2 == null && elementinfo != null && obj1 == elementinfo.parentElement)
	//*  20   43:aload_3         
	//*  21   44:ifnonnull       62
	//*  22   47:aload           4
	//*  23   49:ifnull          62
	//*  24   52:aload_2         
	//*  25   53:aload           4
	//*  26   55:getfield        #60  <Field Object ElementInfo.parentElement>
	//*  27   58:if_acmpne       62
			return;
	//   28   61:return          
		if(obj2 != null && elementinfo != null && obj1 == elementinfo.parentElement && ListUtil.identityEquals(elementinfo.children, ((ElementInfo) (obj2)).children))
	//*  29   62:aload_3         
	//*  30   63:ifnull          120
	//*  31   66:aload           4
	//*  32   68:ifnull          120
	//*  33   71:aload_2         
	//*  34   72:aload           4
	//*  35   74:getfield        #60  <Field Object ElementInfo.parentElement>
	//*  36   77:if_acmpne       120
	//*  37   80:aload           4
	//*  38   82:getfield        #71  <Field List ElementInfo.children>
	//*  39   85:aload_3         
	//*  40   86:getfield        #71  <Field List ElementInfo.children>
	//*  41   89:invokestatic    #77  <Method boolean ListUtil.identityEquals(List, List)>
	//*  42   92:ifeq            120
		{
			mElementToInfoChangesMap.remove(obj);
	//   43   95:aload_0         
	//   44   96:getfield        #28  <Field Map mElementToInfoChangesMap>
	//   45   99:aload_1         
	//   46  100:invokeinterface #80  <Method Object Map.remove(Object)>
	//   47  105:pop             
			if(obj1 == null)
	//*  48  106:aload_2         
	//*  49  107:ifnonnull       119
				mRootElementChanges.remove(obj);
	//   50  110:aload_0         
	//   51  111:getfield        #33  <Field HashSet mRootElementChanges>
	//   52  114:aload_1         
	//   53  115:invokevirtual   #83  <Method boolean HashSet.remove(Object)>
	//   54  118:pop             
			return;
	//   55  119:return          
		}
		if(obj2 != null)
	//*  56  120:aload_3         
	//*  57  121:ifnull          132
			obj2 = ((Object) (((ElementInfo) (obj2)).children));
	//   58  124:aload_3         
	//   59  125:getfield        #71  <Field List ElementInfo.children>
	//   60  128:astore_3        
		else
	//*  61  129:goto            150
		if(elementinfo != null)
	//*  62  132:aload           4
	//*  63  134:ifnull          146
			obj2 = ((Object) (elementinfo.children));
	//   64  137:aload           4
	//   65  139:getfield        #71  <Field List ElementInfo.children>
	//   66  142:astore_3        
		else
	//*  67  143:goto            150
			obj2 = ((Object) (Collections.emptyList()));
	//   68  146:invokestatic    #89  <Method List Collections.emptyList()>
	//   69  149:astore_3        
		obj2 = ((Object) (new ElementInfo(obj, obj1, ((List) (obj2)))));
	//   70  150:new             #56  <Class ElementInfo>
	//   71  153:dup             
	//   72  154:aload_1         
	//   73  155:aload_2         
	//   74  156:aload_3         
	//   75  157:invokespecial   #92  <Method void ElementInfo(Object, Object, List)>
	//   76  160:astore_3        
		mElementToInfoChangesMap.put(obj, obj2);
	//   77  161:aload_0         
	//   78  162:getfield        #28  <Field Map mElementToInfoChangesMap>
	//   79  165:aload_1         
	//   80  166:aload_3         
	//   81  167:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   82  172:pop             
		if(obj1 == null)
	//*  83  173:aload_2         
	//*  84  174:ifnonnull       187
		{
			mRootElementChanges.add(obj);
	//   85  177:aload_0         
	//   86  178:getfield        #33  <Field HashSet mRootElementChanges>
	//   87  181:aload_1         
	//   88  182:invokevirtual   #99  <Method boolean HashSet.add(Object)>
	//   89  185:pop             
			return;
	//   90  186:return          
		} else
		{
			mRootElementChanges.remove(obj);
	//   91  187:aload_0         
	//   92  188:getfield        #33  <Field HashSet mRootElementChanges>
	//   93  191:aload_1         
	//   94  192:invokevirtual   #83  <Method boolean HashSet.remove(Object)>
	//   95  195:pop             
			return;
	//   96  196:return          
		}
	}

	public ShadowDocument.Update build()
	{
		return new ShadowDocument.Update(ShadowDocument.this, mElementToInfoChangesMap, ((java.util.Set) (mRootElementChanges)));
	//    0    0:new             #103 <Class ShadowDocument$Update>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field ShadowDocument this$0>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field Map mElementToInfoChangesMap>
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field HashSet mRootElementChanges>
	//    8   16:invokespecial   #106 <Method void ShadowDocument$Update(ShadowDocument, Map, java.util.Set)>
	//    9   19:areturn         
	}

	public void setElementChildren(Object obj, List list)
	{
		ElementInfo elementinfo = (ElementInfo)mElementToInfoChangesMap.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Map mElementToInfoChangesMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #54  <Method Object Map.get(Object)>
	//    4   10:checkcast       #56  <Class ElementInfo>
	//    5   13:astore          7
		if(elementinfo != null && ListUtil.identityEquals(list, elementinfo.children))
	//*   6   15:aload           7
	//*   7   17:ifnull          33
	//*   8   20:aload_2         
	//*   9   21:aload           7
	//*  10   23:getfield        #71  <Field List ElementInfo.children>
	//*  11   26:invokestatic    #77  <Method boolean ListUtil.identityEquals(List, List)>
	//*  12   29:ifeq            33
			return;
	//   13   32:return          
		ElementInfo elementinfo1 = (ElementInfo)ShadowDocument.access$000(ShadowDocument.this).get(obj);
	//   14   33:aload_0         
	//   15   34:getfield        #20  <Field ShadowDocument this$0>
	//   16   37:invokestatic    #64  <Method IdentityHashMap ShadowDocument.access$000(ShadowDocument)>
	//   17   40:aload_1         
	//   18   41:invokevirtual   #67  <Method Object IdentityHashMap.get(Object)>
	//   19   44:checkcast       #56  <Class ElementInfo>
	//   20   47:astore          8
		if(elementinfo == null && elementinfo1 != null && ListUtil.identityEquals(list, elementinfo1.children))
	//*  21   49:aload           7
	//*  22   51:ifnonnull       72
	//*  23   54:aload           8
	//*  24   56:ifnull          72
	//*  25   59:aload_2         
	//*  26   60:aload           8
	//*  27   62:getfield        #71  <Field List ElementInfo.children>
	//*  28   65:invokestatic    #77  <Method boolean ListUtil.identityEquals(List, List)>
	//*  29   68:ifeq            72
			return;
	//   30   71:return          
		if(elementinfo != null && elementinfo1 != null && elementinfo1.parentElement == elementinfo.parentElement && ListUtil.identityEquals(list, elementinfo1.children))
	//*  31   72:aload           7
	//*  32   74:ifnull          136
	//*  33   77:aload           8
	//*  34   79:ifnull          136
	//*  35   82:aload           8
	//*  36   84:getfield        #60  <Field Object ElementInfo.parentElement>
	//*  37   87:aload           7
	//*  38   89:getfield        #60  <Field Object ElementInfo.parentElement>
	//*  39   92:if_acmpne       136
	//*  40   95:aload_2         
	//*  41   96:aload           8
	//*  42   98:getfield        #71  <Field List ElementInfo.children>
	//*  43  101:invokestatic    #77  <Method boolean ListUtil.identityEquals(List, List)>
	//*  44  104:ifeq            136
		{
			list = ((List) ((ElementInfo)ShadowDocument.access$000(ShadowDocument.this).get(obj)));
	//   45  107:aload_0         
	//   46  108:getfield        #20  <Field ShadowDocument this$0>
	//   47  111:invokestatic    #64  <Method IdentityHashMap ShadowDocument.access$000(ShadowDocument)>
	//   48  114:aload_1         
	//   49  115:invokevirtual   #67  <Method Object IdentityHashMap.get(Object)>
	//   50  118:checkcast       #56  <Class ElementInfo>
	//   51  121:astore_2        
			mElementToInfoChangesMap.remove(obj);
	//   52  122:aload_0         
	//   53  123:getfield        #28  <Field Map mElementToInfoChangesMap>
	//   54  126:aload_1         
	//   55  127:invokeinterface #80  <Method Object Map.remove(Object)>
	//   56  132:pop             
		} else
	//*  57  133:goto            193
		{
			Object obj1;
			if(elementinfo != null)
	//*  58  136:aload           7
	//*  59  138:ifnull          151
				obj1 = elementinfo.parentElement;
	//   60  141:aload           7
	//   61  143:getfield        #60  <Field Object ElementInfo.parentElement>
	//   62  146:astore          6
			else
	//*  63  148:goto            169
			if(elementinfo1 != null)
	//*  64  151:aload           8
	//*  65  153:ifnull          166
				obj1 = elementinfo1.parentElement;
	//   66  156:aload           8
	//   67  158:getfield        #60  <Field Object ElementInfo.parentElement>
	//   68  161:astore          6
			else
	//*  69  163:goto            169
				obj1 = null;
	//   70  166:aconst_null     
	//   71  167:astore          6
			list = ((List) (new ElementInfo(obj, obj1, list)));
	//   72  169:new             #56  <Class ElementInfo>
	//   73  172:dup             
	//   74  173:aload_1         
	//   75  174:aload           6
	//   76  176:aload_2         
	//   77  177:invokespecial   #92  <Method void ElementInfo(Object, Object, List)>
	//   78  180:astore_2        
			mElementToInfoChangesMap.put(obj, ((Object) (list)));
	//   79  181:aload_0         
	//   80  182:getfield        #28  <Field Map mElementToInfoChangesMap>
	//   81  185:aload_1         
	//   82  186:aload_2         
	//   83  187:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   84  192:pop             
		}
		HashSet hashset = acquireNotNewChildrenHashSet();
	//   85  193:aload_0         
	//   86  194:invokespecial   #110 <Method HashSet acquireNotNewChildrenHashSet()>
	//   87  197:astore          6
		boolean flag = false;
	//   88  199:iconst_0        
	//   89  200:istore          4
		if(elementinfo1 != null && elementinfo1.children != ((ElementInfo) (list)).children)
	//*  90  202:aload           8
	//*  91  204:ifnull          263
	//*  92  207:aload           8
	//*  93  209:getfield        #71  <Field List ElementInfo.children>
	//*  94  212:aload_2         
	//*  95  213:getfield        #71  <Field List ElementInfo.children>
	//*  96  216:if_acmpeq       263
		{
			int l = elementinfo1.children.size();
	//   97  219:aload           8
	//   98  221:getfield        #71  <Field List ElementInfo.children>
	//   99  224:invokeinterface #116 <Method int List.size()>
	//  100  229:istore          5
			for(int i = 0; i < l; i++)
	//* 101  231:iconst_0        
	//* 102  232:istore_3        
	//* 103  233:iload_3         
	//* 104  234:iload           5
	//* 105  236:icmpge          263
				hashset.add(elementinfo1.children.get(i));
	//  106  239:aload           6
	//  107  241:aload           8
	//  108  243:getfield        #71  <Field List ElementInfo.children>
	//  109  246:iload_3         
	//  110  247:invokeinterface #119 <Method Object List.get(int)>
	//  111  252:invokevirtual   #99  <Method boolean HashSet.add(Object)>
	//  112  255:pop             

	//  113  256:iload_3         
	//  114  257:iconst_1        
	//  115  258:iadd            
	//  116  259:istore_3        
		}
	//* 117  260:goto            233
		if(elementinfo != null && elementinfo.children != ((ElementInfo) (list)).children)
	//* 118  263:aload           7
	//* 119  265:ifnull          324
	//* 120  268:aload           7
	//* 121  270:getfield        #71  <Field List ElementInfo.children>
	//* 122  273:aload_2         
	//* 123  274:getfield        #71  <Field List ElementInfo.children>
	//* 124  277:if_acmpeq       324
		{
			int i1 = elementinfo.children.size();
	//  125  280:aload           7
	//  126  282:getfield        #71  <Field List ElementInfo.children>
	//  127  285:invokeinterface #116 <Method int List.size()>
	//  128  290:istore          5
			for(int j = 0; j < i1; j++)
	//* 129  292:iconst_0        
	//* 130  293:istore_3        
	//* 131  294:iload_3         
	//* 132  295:iload           5
	//* 133  297:icmpge          324
				hashset.add(elementinfo.children.get(j));
	//  134  300:aload           6
	//  135  302:aload           7
	//  136  304:getfield        #71  <Field List ElementInfo.children>
	//  137  307:iload_3         
	//  138  308:invokeinterface #119 <Method Object List.get(int)>
	//  139  313:invokevirtual   #99  <Method boolean HashSet.add(Object)>
	//  140  316:pop             

	//  141  317:iload_3         
	//  142  318:iconst_1        
	//  143  319:iadd            
	//  144  320:istore_3        
		}
	//* 145  321:goto            294
		int j1 = ((ElementInfo) (list)).children.size();
	//  146  324:aload_2         
	//  147  325:getfield        #71  <Field List ElementInfo.children>
	//  148  328:invokeinterface #116 <Method int List.size()>
	//  149  333:istore          5
		for(int k = ((int) (flag)); k < j1; k++)
	//* 150  335:iload           4
	//* 151  337:istore_3        
	//* 152  338:iload_3         
	//* 153  339:iload           5
	//* 154  341:icmpge          378
		{
			Object obj2 = ((ElementInfo) (list)).children.get(k);
	//  155  344:aload_2         
	//  156  345:getfield        #71  <Field List ElementInfo.children>
	//  157  348:iload_3         
	//  158  349:invokeinterface #119 <Method Object List.get(int)>
	//  159  354:astore          7
			setElementParent(obj2, obj);
	//  160  356:aload_0         
	//  161  357:aload           7
	//  162  359:aload_1         
	//  163  360:invokespecial   #121 <Method void setElementParent(Object, Object)>
			hashset.remove(obj2);
	//  164  363:aload           6
	//  165  365:aload           7
	//  166  367:invokevirtual   #83  <Method boolean HashSet.remove(Object)>
	//  167  370:pop             
		}

	//  168  371:iload_3         
	//  169  372:iconst_1        
	//  170  373:iadd            
	//  171  374:istore_3        
	//* 172  375:goto            338
		list = ((List) (hashset.iterator()));
	//  173  378:aload           6
	//  174  380:invokevirtual   #125 <Method Iterator HashSet.iterator()>
	//  175  383:astore_2        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//  176  384:aload_2         
	//  177  385:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//  178  390:ifeq            475
			Object obj3 = ((Iterator) (list)).next();
	//  179  393:aload_2         
	//  180  394:invokeinterface #135 <Method Object Iterator.next()>
	//  181  399:astore          7
			ElementInfo elementinfo2 = (ElementInfo)mElementToInfoChangesMap.get(obj3);
	//  182  401:aload_0         
	//  183  402:getfield        #28  <Field Map mElementToInfoChangesMap>
	//  184  405:aload           7
	//  185  407:invokeinterface #54  <Method Object Map.get(Object)>
	//  186  412:checkcast       #56  <Class ElementInfo>
	//  187  415:astore          8
			if(elementinfo2 == null || elementinfo2.parentElement == obj)
	//* 188  417:aload           8
	//* 189  419:ifnull          434
	//* 190  422:aload           8
	//* 191  424:getfield        #60  <Field Object ElementInfo.parentElement>
	//* 192  427:aload_1         
	//* 193  428:if_acmpeq       434
	//* 194  431:goto            384
			{
				ElementInfo elementinfo3 = (ElementInfo)ShadowDocument.access$000(ShadowDocument.this).get(obj3);
	//  195  434:aload_0         
	//  196  435:getfield        #20  <Field ShadowDocument this$0>
	//  197  438:invokestatic    #64  <Method IdentityHashMap ShadowDocument.access$000(ShadowDocument)>
	//  198  441:aload           7
	//  199  443:invokevirtual   #67  <Method Object IdentityHashMap.get(Object)>
	//  200  446:checkcast       #56  <Class ElementInfo>
	//  201  449:astore          8
				if(elementinfo3 != null && elementinfo3.parentElement == obj)
	//* 202  451:aload           8
	//* 203  453:ifnull          384
	//* 204  456:aload           8
	//* 205  458:getfield        #60  <Field Object ElementInfo.parentElement>
	//* 206  461:aload_1         
	//* 207  462:if_acmpne       384
					setElementParent(obj3, ((Object) (null)));
	//  208  465:aload_0         
	//  209  466:aload           7
	//  210  468:aconst_null     
	//  211  469:invokespecial   #121 <Method void setElementParent(Object, Object)>
			}
		} while(true);
	//  212  472:goto            384
		releaseNotNewChildrenHashSet(hashset);
	//  213  475:aload_0         
	//  214  476:aload           6
	//  215  478:invokespecial   #137 <Method void releaseNotNewChildrenHashSet(HashSet)>
	//  216  481:return          
	}

	private HashSet mCachedNotNewChildrenSet;
	private final Map mElementToInfoChangesMap = new LinkedHashMap();
	private final HashSet mRootElementChanges = new HashSet();
	final ShadowDocument this$0;

	public ShadowDocument$UpdateBuilder()
	{
		this$0 = ShadowDocument.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ShadowDocument this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:aload_0         
	//    6   10:new             #25  <Class LinkedHashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #26  <Method void LinkedHashMap()>
	//    9   17:putfield        #28  <Field Map mElementToInfoChangesMap>
	//   10   20:aload_0         
	//   11   21:new             #30  <Class HashSet>
	//   12   24:dup             
	//   13   25:invokespecial   #31  <Method void HashSet()>
	//   14   28:putfield        #33  <Field HashSet mRootElementChanges>
	//   15   31:return          
	}
}

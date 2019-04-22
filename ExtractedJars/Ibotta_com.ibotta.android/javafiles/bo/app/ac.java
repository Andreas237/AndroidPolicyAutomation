// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.app.Activity;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.*;

// Referenced classes of package bo.app:
//			ad, dw, ac

public class ac
	implements ad
{

	public ac(Executor executor, dw dw1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #46  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #47  <Method void ConcurrentHashMap()>
	//    6   12:putfield        #49  <Field ConcurrentMap b>
	//    7   15:aload_0         
	//    8   16:new             #46  <Class ConcurrentHashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #47  <Method void ConcurrentHashMap()>
	//   11   23:putfield        #51  <Field ConcurrentMap c>
	//   12   26:aload_0         
	//   13   27:new             #46  <Class ConcurrentHashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #47  <Method void ConcurrentHashMap()>
	//   16   34:putfield        #53  <Field ConcurrentMap d>
	//   17   37:aload_0         
	//   18   38:new             #46  <Class ConcurrentHashMap>
	//   19   41:dup             
	//   20   42:invokespecial   #47  <Method void ConcurrentHashMap()>
	//   21   45:putfield        #55  <Field ConcurrentMap e>
	//   22   48:aload_0         
	//   23   49:new             #4   <Class Object>
	//   24   52:dup             
	//   25   53:invokespecial   #44  <Method void Object()>
	//   26   56:putfield        #57  <Field Object h>
	//   27   59:aload_0         
	//   28   60:new             #4   <Class Object>
	//   29   63:dup             
	//   30   64:invokespecial   #44  <Method void Object()>
	//   31   67:putfield        #59  <Field Object i>
	//   32   70:aload_0         
	//   33   71:new             #4   <Class Object>
	//   34   74:dup             
	//   35   75:invokespecial   #44  <Method void Object()>
	//   36   78:putfield        #61  <Field Object j>
	//   37   81:aload_0         
	//   38   82:new             #4   <Class Object>
	//   39   85:dup             
	//   40   86:invokespecial   #44  <Method void Object()>
	//   41   89:putfield        #63  <Field Object k>
		f = executor;
	//   42   92:aload_0         
	//   43   93:aload_1         
	//   44   94:putfield        #65  <Field Executor f>
		g = dw1;
	//   45   97:aload_0         
	//   46   98:aload_2         
	//   47   99:putfield        #67  <Field dw g>
	//   48  102:return          
	}

	static CopyOnWriteArraySet a(ac ac1, Class class1, CopyOnWriteArraySet copyonwritearrayset)
	{
		return ac1.a(class1, copyonwritearrayset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #71  <Method CopyOnWriteArraySet a(Class, CopyOnWriteArraySet)>
	//    4    6:areturn         
	}

	private CopyOnWriteArraySet a(Class class1, CopyOnWriteArraySet copyonwritearrayset)
	{
		CopyOnWriteArraySet copyonwritearrayset1 = (CopyOnWriteArraySet)copyonwritearrayset;
	//    0    0:aload_2         
	//    1    1:checkcast       #73  <Class CopyOnWriteArraySet>
	//    2    4:astore_3        
		String s = a;
	//    3    5:getstatic       #39  <Field String a>
	//    4    8:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    5   10:new             #75  <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #76  <Method void StringBuilder()>
	//    8   17:astore          5
		stringbuilder.append("Triggering ");
	//    9   19:aload           5
	//   10   21:ldc1            #78  <String "Triggering ">
	//   11   23:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		stringbuilder.append(class1.getName());
	//   13   27:aload           5
	//   14   29:aload_1         
	//   15   30:invokevirtual   #88  <Method String Class.getName()>
	//   16   33:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
		stringbuilder.append(" on ");
	//   18   37:aload           5
	//   19   39:ldc1            #90  <String " on ">
	//   20   41:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
		stringbuilder.append(copyonwritearrayset.size());
	//   22   45:aload           5
	//   23   47:aload_2         
	//   24   48:invokevirtual   #94  <Method int CopyOnWriteArraySet.size()>
	//   25   51:invokevirtual   #97  <Method StringBuilder StringBuilder.append(int)>
	//   26   54:pop             
		stringbuilder.append(" subscribers.");
	//   27   55:aload           5
	//   28   57:ldc1            #99  <String " subscribers.">
	//   29   59:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   30   62:pop             
		AppboyLogger.d(s, stringbuilder.toString(), false);
	//   31   63:aload           4
	//   32   65:aload           5
	//   33   67:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   34   70:iconst_0        
	//   35   71:invokestatic    #105 <Method int AppboyLogger.d(String, String, boolean)>
	//   36   74:pop             
		return copyonwritearrayset1;
	//   37   75:aload_3         
	//   38   76:areturn         
	}

	private void a(Class class1)
	{
		Object obj = k;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Object k>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj1;
		if(!e.containsKey(((Object) (class1))))
			break MISSING_BLOCK_LABEL_79;
	//    5    7:aload_0         
	//    6    8:getfield        #55  <Field ConcurrentMap e>
	//    7   11:aload_1         
	//    8   12:invokeinterface #114 <Method boolean ConcurrentMap.containsKey(Object)>
	//    9   17:ifeq            79
		obj1 = ((Object) (a));
	//   10   20:getstatic       #39  <Field String a>
	//   11   23:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   12   24:new             #75  <Class StringBuilder>
	//   13   27:dup             
	//   14   28:invokespecial   #76  <Method void StringBuilder()>
	//   15   31:astore          4
		stringbuilder.append("Publishing cached event for class: ");
	//   16   33:aload           4
	//   17   35:ldc1            #116 <String "Publishing cached event for class: ">
	//   18   37:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
		stringbuilder.append(((Object) (class1)));
	//   20   41:aload           4
	//   21   43:aload_1         
	//   22   44:invokevirtual   #119 <Method StringBuilder StringBuilder.append(Object)>
	//   23   47:pop             
		AppboyLogger.v(((String) (obj1)), stringbuilder.toString());
	//   24   48:aload_3         
	//   25   49:aload           4
	//   26   51:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   27   54:invokestatic    #123 <Method int AppboyLogger.v(String, String)>
	//   28   57:pop             
		obj1 = e.remove(((Object) (class1)));
	//   29   58:aload_0         
	//   30   59:getfield        #55  <Field ConcurrentMap e>
	//   31   62:aload_1         
	//   32   63:invokeinterface #127 <Method Object ConcurrentMap.remove(Object)>
	//   33   68:astore_3        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_79;
	//   34   69:aload_3         
	//   35   70:ifnull          79
		a(obj1, class1);
	//   36   73:aload_0         
	//   37   74:aload_3         
	//   38   75:aload_1         
	//   39   76:invokevirtual   #130 <Method void a(Object, Class)>
		obj;
	//   40   79:aload_2         
		JVM INSTR monitorexit ;
	//   41   80:monitorexit     
		return;
	//   42   81:return          
		class1;
	//   43   82:astore_1        
		obj;
	//   44   83:aload_2         
		JVM INSTR monitorexit ;
	//   45   84:monitorexit     
		throw class1;
	//   46   85:aload_1         
	//   47   86:athrow          
	}

	private boolean a(IEventSubscriber ieventsubscriber, Class class1, ConcurrentMap concurrentmap)
	{
		if(ieventsubscriber == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       62
		{
			if(class1 == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       14
				ieventsubscriber = "null eventClass";
	//    4    8:ldc1            #134 <String "null eventClass">
	//    5   10:astore_1        
			else
	//*   6   11:goto            19
				ieventsubscriber = ((IEventSubscriber) (class1.getName()));
	//    7   14:aload_2         
	//    8   15:invokevirtual   #88  <Method String Class.getName()>
	//    9   18:astore_1        
			class1 = ((Class) (a));
	//   10   19:getstatic       #39  <Field String a>
	//   11   22:astore_2        
			concurrentmap = ((ConcurrentMap) (new StringBuilder()));
	//   12   23:new             #75  <Class StringBuilder>
	//   13   26:dup             
	//   14   27:invokespecial   #76  <Method void StringBuilder()>
	//   15   30:astore_3        
			((StringBuilder) (concurrentmap)).append("Error: Attempted to add a null subscriber for eventClass ");
	//   16   31:aload_3         
	//   17   32:ldc1            #136 <String "Error: Attempted to add a null subscriber for eventClass ">
	//   18   34:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			((StringBuilder) (concurrentmap)).append(((String) (ieventsubscriber)));
	//   20   38:aload_3         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
			((StringBuilder) (concurrentmap)).append(". This subscriber is being ignored. Please check your calling code to ensure that all potential subscriptions are valid.");
	//   24   44:aload_3         
	//   25   45:ldc1            #138 <String ". This subscriber is being ignored. Please check your calling code to ensure that all potential subscriptions are valid.">
	//   26   47:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
			AppboyLogger.e(((String) (class1)), ((StringBuilder) (concurrentmap)).toString());
	//   28   51:aload_2         
	//   29   52:aload_3         
	//   30   53:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   31   56:invokestatic    #140 <Method int AppboyLogger.e(String, String)>
	//   32   59:pop             
			return false;
	//   33   60:iconst_0        
	//   34   61:ireturn         
		}
		CopyOnWriteArraySet copyonwritearrayset = (CopyOnWriteArraySet)concurrentmap.get(((Object) (class1)));
	//   35   62:aload_3         
	//   36   63:aload_2         
	//   37   64:invokeinterface #143 <Method Object ConcurrentMap.get(Object)>
	//   38   69:checkcast       #73  <Class CopyOnWriteArraySet>
	//   39   72:astore          6
		Object obj = ((Object) (copyonwritearrayset));
	//   40   74:aload           6
	//   41   76:astore          5
		if(copyonwritearrayset == null)
	//*  42   78:aload           6
	//*  43   80:ifnonnull       115
		{
			obj = ((Object) (new CopyOnWriteArraySet()));
	//   44   83:new             #73  <Class CopyOnWriteArraySet>
	//   45   86:dup             
	//   46   87:invokespecial   #144 <Method void CopyOnWriteArraySet()>
	//   47   90:astore          5
			concurrentmap = ((ConcurrentMap) ((CopyOnWriteArraySet)concurrentmap.putIfAbsent(((Object) (class1)), obj)));
	//   48   92:aload_3         
	//   49   93:aload_2         
	//   50   94:aload           5
	//   51   96:invokeinterface #148 <Method Object ConcurrentMap.putIfAbsent(Object, Object)>
	//   52  101:checkcast       #73  <Class CopyOnWriteArraySet>
	//   53  104:astore_3        
			if(concurrentmap != null)
	//*  54  105:aload_3         
	//*  55  106:ifnonnull       112
	//*  56  109:goto            115
				obj = ((Object) (concurrentmap));
	//   57  112:aload_3         
	//   58  113:astore          5
		}
		boolean flag = ((CopyOnWriteArraySet) (obj)).add(((Object) (ieventsubscriber)));
	//   59  115:aload           5
	//   60  117:aload_1         
	//   61  118:invokevirtual   #151 <Method boolean CopyOnWriteArraySet.add(Object)>
	//   62  121:istore          4
		a(class1);
	//   63  123:aload_0         
	//   64  124:aload_2         
	//   65  125:invokespecial   #153 <Method void a(Class)>
		return flag;
	//   66  128:iload           4
	//   67  130:ireturn         
	}

	private boolean a(CopyOnWriteArraySet copyonwritearrayset, IEventSubscriber ieventsubscriber)
	{
		return copyonwritearrayset != null && ieventsubscriber != null && copyonwritearrayset.remove(((Object) (ieventsubscriber)));
	//    0    0:aload_1         
	//    1    1:ifnull          18
	//    2    4:aload_2         
	//    3    5:ifnull          18
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #157 <Method boolean CopyOnWriteArraySet.remove(Object)>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public void a()
	{
		synchronized(i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field Object i>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			c.clear();
	//    5    7:aload_0         
	//    6    8:getfield        #51  <Field ConcurrentMap c>
	//    7   11:invokeinterface #161 <Method void ConcurrentMap.clear()>
		}
	//    8   16:aload_1         
	//    9   17:monitorexit     
		synchronized(j)
	//*  10   18:aload_0         
	//*  11   19:getfield        #61  <Field Object j>
	//*  12   22:astore_1        
	//*  13   23:aload_1         
	//*  14   24:monitorenter    
		{
			d.clear();
	//   15   25:aload_0         
	//   16   26:getfield        #53  <Field ConcurrentMap d>
	//   17   29:invokeinterface #161 <Method void ConcurrentMap.clear()>
		}
	//   18   34:aload_1         
	//   19   35:monitorexit     
		synchronized(h)
	//*  20   36:aload_0         
	//*  21   37:getfield        #57  <Field Object h>
	//*  22   40:astore_1        
	//*  23   41:aload_1         
	//*  24   42:monitorenter    
		{
			b.clear();
	//   25   43:aload_0         
	//   26   44:getfield        #49  <Field ConcurrentMap b>
	//   27   47:invokeinterface #161 <Method void ConcurrentMap.clear()>
		}
	//   28   52:aload_1         
	//   29   53:monitorexit     
		return;
	//   30   54:return          
		exception;
	//   31   55:astore_2        
		obj;
	//   32   56:aload_1         
		JVM INSTR monitorexit ;
	//   33   57:monitorexit     
		throw exception;
	//   34   58:aload_2         
	//   35   59:athrow          
		exception1;
	//   36   60:astore_2        
		obj;
	//   37   61:aload_1         
		JVM INSTR monitorexit ;
	//   38   62:monitorexit     
		throw exception1;
	//   39   63:aload_2         
	//   40   64:athrow          
		exception2;
	//   41   65:astore_2        
		obj;
	//   42   66:aload_1         
		JVM INSTR monitorexit ;
	//   43   67:monitorexit     
		throw exception2;
	//   44   68:aload_2         
	//   45   69:athrow          
	}

	public void a(Object obj, Class class1)
	{
		if(g.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field dw g>
	//*   2    4:invokevirtual   #166 <Method boolean dw.a()>
	//*   3    7:ifeq            72
		{
			String s = a;
	//    4   10:getstatic       #39  <Field String a>
	//    5   13:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//    6   15:new             #75  <Class StringBuilder>
	//    7   18:dup             
	//    8   19:invokespecial   #76  <Method void StringBuilder()>
	//    9   22:astore          6
			stringbuilder.append("SDK is disabled. Not publishing event class: ");
	//   10   24:aload           6
	//   11   26:ldc1            #168 <String "SDK is disabled. Not publishing event class: ">
	//   12   28:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:pop             
			stringbuilder.append(class1.getName());
	//   14   32:aload           6
	//   15   34:aload_2         
	//   16   35:invokevirtual   #88  <Method String Class.getName()>
	//   17   38:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
			stringbuilder.append(" and message: ");
	//   19   42:aload           6
	//   20   44:ldc1            #170 <String " and message: ">
	//   21   46:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   22   49:pop             
			stringbuilder.append(obj.toString());
	//   23   50:aload           6
	//   24   52:aload_1         
	//   25   53:invokevirtual   #171 <Method String Object.toString()>
	//   26   56:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   27   59:pop             
			AppboyLogger.d(s, stringbuilder.toString());
	//   28   60:aload           5
	//   29   62:aload           6
	//   30   64:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   31   67:invokestatic    #173 <Method int AppboyLogger.d(String, String)>
	//   32   70:pop             
			return;
	//   33   71:return          
		}
		Object obj1 = ((Object) (a));
	//   34   72:getstatic       #39  <Field String a>
	//   35   75:astore          5
		Object obj2 = ((Object) (new StringBuilder()));
	//   36   77:new             #75  <Class StringBuilder>
	//   37   80:dup             
	//   38   81:invokespecial   #76  <Method void StringBuilder()>
	//   39   84:astore          6
		((StringBuilder) (obj2)).append(class1.getName());
	//   40   86:aload           6
	//   41   88:aload_2         
	//   42   89:invokevirtual   #88  <Method String Class.getName()>
	//   43   92:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   44   95:pop             
		((StringBuilder) (obj2)).append(" fired: ");
	//   45   96:aload           6
	//   46   98:ldc1            #175 <String " fired: ">
	//   47  100:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   48  103:pop             
		((StringBuilder) (obj2)).append(obj.toString());
	//   49  104:aload           6
	//   50  106:aload_1         
	//   51  107:invokevirtual   #171 <Method String Object.toString()>
	//   52  110:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   53  113:pop             
		obj2 = ((Object) (((StringBuilder) (obj2)).toString()));
	//   54  114:aload           6
	//   55  116:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   56  119:astore          6
		boolean flag1 = false;
	//   57  121:iconst_0        
	//   58  122:istore          4
		AppboyLogger.d(((String) (obj1)), ((String) (obj2)), false);
	//   59  124:aload           5
	//   60  126:aload           6
	//   61  128:iconst_0        
	//   62  129:invokestatic    #105 <Method int AppboyLogger.d(String, String, boolean)>
	//   63  132:pop             
		obj1 = ((Object) (b.entrySet().iterator()));
	//   64  133:aload_0         
	//   65  134:getfield        #49  <Field ConcurrentMap b>
	//   66  137:invokeinterface #179 <Method Set ConcurrentMap.entrySet()>
	//   67  142:invokeinterface #185 <Method Iterator Set.iterator()>
	//   68  147:astore          5
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
	//   69  149:aload           5
	//   70  151:invokeinterface #190 <Method boolean Iterator.hasNext()>
	//   71  156:ifeq            236
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
	//   72  159:aload           5
	//   73  161:invokeinterface #194 <Method Object Iterator.next()>
	//   74  166:checkcast       #196 <Class java.util.Map$Entry>
	//   75  169:astore          6
			CopyOnWriteArraySet copyonwritearrayset = (CopyOnWriteArraySet)((ConcurrentMap)entry.getValue()).get(((Object) (class1)));
	//   76  171:aload           6
	//   77  173:invokeinterface #199 <Method Object java.util.Map$Entry.getValue()>
	//   78  178:checkcast       #110 <Class ConcurrentMap>
	//   79  181:aload_2         
	//   80  182:invokeinterface #143 <Method Object ConcurrentMap.get(Object)>
	//   81  187:checkcast       #73  <Class CopyOnWriteArraySet>
	//   82  190:astore          7
			if(copyonwritearrayset != null && !copyonwritearrayset.isEmpty())
	//*  83  192:aload           7
	//*  84  194:ifnull          149
	//*  85  197:aload           7
	//*  86  199:invokevirtual   #202 <Method boolean CopyOnWriteArraySet.isEmpty()>
	//*  87  202:ifne            149
			{
				((Activity)entry.getKey()).runOnUiThread(((Runnable) (new WebViewClient(this, class1, copyonwritearrayset, obj) {

					public void onPageFinished(WebView webview, String s2)
					{
						webview = ((WebView) (String.valueOf(((Object) (s2)))));
					//    0    0:aload_2         
					//    1    1:invokestatic    #26  <Method String String.valueOf(Object)>
					//    2    4:astore_1        
						if(((String) (webview)).length() != 0)
					//*   3    5:aload_1         
					//*   4    6:invokevirtual   #30  <Method int String.length()>
					//*   5    9:ifeq            22
							webview = ((WebView) ("Finished ".concat(((String) (webview)))));
					//    6   12:ldc1            #32  <String "Finished ">
					//    7   14:aload_1         
					//    8   15:invokevirtual   #36  <Method String String.concat(String)>
					//    9   18:astore_1        
						else
					//*  10   19:goto            32
							webview = ((WebView) (new String("Finished ")));
					//   11   22:new             #22  <Class String>
					//   12   25:dup             
					//   13   26:ldc1            #32  <String "Finished ">
					//   14   28:invokespecial   #39  <Method void String(String)>
					//   15   31:astore_1        
						com.google.ads.interactivemedia.v3.impl.ac.c(((String) (webview)));
					//   16   32:aload_1         
					//   17   33:invokestatic    #42  <Method void ac.c(String)>
					//   18   36:return          
					}

					public void onPageStarted(WebView webview, String s2, Bitmap bitmap)
					{
						webview = ((WebView) (String.valueOf(((Object) (s2)))));
					//    0    0:aload_2         
					//    1    1:invokestatic    #26  <Method String String.valueOf(Object)>
					//    2    4:astore_1        
						if(((String) (webview)).length() != 0)
					//*   3    5:aload_1         
					//*   4    6:invokevirtual   #30  <Method int String.length()>
					//*   5    9:ifeq            22
							webview = ((WebView) ("Started ".concat(((String) (webview)))));
					//    6   12:ldc1            #46  <String "Started ">
					//    7   14:aload_1         
					//    8   15:invokevirtual   #36  <Method String String.concat(String)>
					//    9   18:astore_1        
						else
					//*  10   19:goto            32
							webview = ((WebView) (new String("Started ")));
					//   11   22:new             #22  <Class String>
					//   12   25:dup             
					//   13   26:ldc1            #46  <String "Started ">
					//   14   28:invokespecial   #39  <Method void String(String)>
					//   15   31:astore_1        
						com.google.ads.interactivemedia.v3.impl.ac.c(((String) (webview)));
					//   16   32:aload_1         
					//   17   33:invokestatic    #42  <Method void ac.c(String)>
					//   18   36:return          
					}

					public void onReceivedError(WebView webview, int l, String s2, String s3)
					{
						webview = ((WebView) (new StringBuilder(String.valueOf(((Object) (s2))).length() + 20 + String.valueOf(((Object) (s3))).length())));
					//    0    0:new             #50  <Class StringBuilder>
					//    1    3:dup             
					//    2    4:aload_3         
					//    3    5:invokestatic    #26  <Method String String.valueOf(Object)>
					//    4    8:invokevirtual   #30  <Method int String.length()>
					//    5   11:bipush          20
					//    6   13:iadd            
					//    7   14:aload           4
					//    8   16:invokestatic    #26  <Method String String.valueOf(Object)>
					//    9   19:invokevirtual   #30  <Method int String.length()>
					//   10   22:iadd            
					//   11   23:invokespecial   #53  <Method void StringBuilder(int)>
					//   12   26:astore_1        
						((StringBuilder) (webview)).append("Error: ");
					//   13   27:aload_1         
					//   14   28:ldc1            #55  <String "Error: ">
					//   15   30:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
					//   16   33:pop             
						((StringBuilder) (webview)).append(l);
					//   17   34:aload_1         
					//   18   35:iload_2         
					//   19   36:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
					//   20   39:pop             
						((StringBuilder) (webview)).append(" ");
					//   21   40:aload_1         
					//   22   41:ldc1            #64  <String " ">
					//   23   43:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
					//   24   46:pop             
						((StringBuilder) (webview)).append(s2);
					//   25   47:aload_1         
					//   26   48:aload_3         
					//   27   49:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
					//   28   52:pop             
						((StringBuilder) (webview)).append(" ");
					//   29   53:aload_1         
					//   30   54:ldc1            #64  <String " ">
					//   31   56:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
					//   32   59:pop             
						((StringBuilder) (webview)).append(s3);
					//   33   60:aload_1         
					//   34   61:aload           4
					//   35   63:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
					//   36   66:pop             
						com.google.ads.interactivemedia.v3.impl.ac.c(((StringBuilder) (webview)).toString());
					//   37   67:aload_1         
					//   38   68:invokevirtual   #68  <Method String StringBuilder.toString()>
					//   39   71:invokestatic    #42  <Method void ac.c(String)>
					//   40   74:return          
					}

					public boolean shouldOverrideUrlLoading(WebView webview, String s2)
					{
						if(!s2.startsWith("gmsg://"))
					//*   0    0:aload_2         
					//*   1    1:ldc1            #72  <String "gmsg://">
					//*   2    3:invokevirtual   #76  <Method boolean String.startsWith(String)>
					//*   3    6:ifne            11
						{
							return false;
					//    4    9:iconst_0        
					//    5   10:ireturn         
						} else
						{
							a.b(s2);
					//    6   11:aload_0         
					//    7   12:getfield        #14  <Field ac a>
					//    8   15:aload_2         
					//    9   16:invokevirtual   #79  <Method void ac.b(String)>
							return true;
					//   10   19:iconst_1        
					//   11   20:ireturn         
						}
					}

					final ac a;

			
			{
				a = ac1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ac a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void WebViewClient()>
			//    5    9:return          
			}
				}
)));
	//   88  205:aload           6
	//   89  207:invokeinterface #205 <Method Object java.util.Map$Entry.getKey()>
	//   90  212:checkcast       #207 <Class Activity>
	//   91  215:new             #8   <Class ac$1>
	//   92  218:dup             
	//   93  219:aload_0         
	//   94  220:aload_2         
	//   95  221:aload           7
	//   96  223:aload_1         
	//   97  224:invokespecial   #210 <Method void ac$1(ac, Class, CopyOnWriteArraySet, Object)>
	//   98  227:invokevirtual   #214 <Method void Activity.runOnUiThread(Runnable)>
				flag1 = true;
	//   99  230:iconst_1        
	//  100  231:istore          4
			}
		} while(true);
	//  101  233:goto            149
		obj1 = ((Object) ((CopyOnWriteArraySet)c.get(((Object) (class1)))));
	//  102  236:aload_0         
	//  103  237:getfield        #51  <Field ConcurrentMap c>
	//  104  240:aload_2         
	//  105  241:invokeinterface #143 <Method Object ConcurrentMap.get(Object)>
	//  106  246:checkcast       #73  <Class CopyOnWriteArraySet>
	//  107  249:astore          5
		boolean flag = flag1;
	//  108  251:iload           4
	//  109  253:istore_3        
		if(obj1 != null)
	//* 110  254:aload           5
	//* 111  256:ifnull          329
		{
			IEventSubscriber ieventsubscriber;
			for(Iterator iterator = a(class1, ((CopyOnWriteArraySet) (obj1))).iterator(); iterator.hasNext(); f.execute(new Runnable(ieventsubscriber, obj) {

		public void run()
		{
			a.trigger(b);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field IEventSubscriber a>
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field Object b>
		//    4    8:invokeinterface #35  <Method void IEventSubscriber.trigger(Object)>
		//    5   13:return          
		}

		final IEventSubscriber a;
		final Object b;
		final ac c;

			
			{
				c = ac.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ac c>
				a = ieventsubscriber;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field IEventSubscriber a>
				b = obj;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field Object b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
	}
))
	//* 112  259:aload_0         
	//* 113  260:aload_2         
	//* 114  261:aload           5
	//* 115  263:invokespecial   #71  <Method CopyOnWriteArraySet a(Class, CopyOnWriteArraySet)>
	//* 116  266:invokevirtual   #215 <Method Iterator CopyOnWriteArraySet.iterator()>
	//* 117  269:astore          6
	//* 118  271:aload           6
	//* 119  273:invokeinterface #190 <Method boolean Iterator.hasNext()>
	//* 120  278:ifeq            316
				ieventsubscriber = (IEventSubscriber)iterator.next();
	//  121  281:aload           6
	//  122  283:invokeinterface #194 <Method Object Iterator.next()>
	//  123  288:checkcast       #217 <Class IEventSubscriber>
	//  124  291:astore          7

	//  125  293:aload_0         
	//  126  294:getfield        #65  <Field Executor f>
	//  127  297:new             #10  <Class ac$2>
	//  128  300:dup             
	//  129  301:aload_0         
	//  130  302:aload           7
	//  131  304:aload_1         
	//  132  305:invokespecial   #220 <Method void ac$2(ac, IEventSubscriber, Object)>
	//  133  308:invokeinterface #225 <Method void Executor.execute(Runnable)>
	//* 134  313:goto            271
			flag = flag1;
	//  135  316:iload           4
	//  136  318:istore_3        
			if(!((CopyOnWriteArraySet) (obj1)).isEmpty())
	//* 137  319:aload           5
	//* 138  321:invokevirtual   #202 <Method boolean CopyOnWriteArraySet.isEmpty()>
	//* 139  324:ifne            329
				flag = true;
	//  140  327:iconst_1        
	//  141  328:istore_3        
		}
		obj1 = ((Object) ((CopyOnWriteArraySet)d.get(((Object) (class1)))));
	//  142  329:aload_0         
	//  143  330:getfield        #53  <Field ConcurrentMap d>
	//  144  333:aload_2         
	//  145  334:invokeinterface #143 <Method Object ConcurrentMap.get(Object)>
	//  146  339:checkcast       #73  <Class CopyOnWriteArraySet>
	//  147  342:astore          5
		flag1 = flag;
	//  148  344:iload_3         
	//  149  345:istore          4
		if(obj1 != null)
	//* 150  347:aload           5
	//* 151  349:ifnull          407
		{
			for(Iterator iterator1 = a(class1, ((CopyOnWriteArraySet) (obj1))).iterator(); iterator1.hasNext(); ((IEventSubscriber)iterator1.next()).trigger(obj));
	//  152  352:aload_0         
	//  153  353:aload_2         
	//  154  354:aload           5
	//  155  356:invokespecial   #71  <Method CopyOnWriteArraySet a(Class, CopyOnWriteArraySet)>
	//  156  359:invokevirtual   #215 <Method Iterator CopyOnWriteArraySet.iterator()>
	//  157  362:astore          6
	//  158  364:aload           6
	//  159  366:invokeinterface #190 <Method boolean Iterator.hasNext()>
	//  160  371:ifeq            393
	//  161  374:aload           6
	//  162  376:invokeinterface #194 <Method Object Iterator.next()>
	//  163  381:checkcast       #217 <Class IEventSubscriber>
	//  164  384:aload_1         
	//  165  385:invokeinterface #229 <Method void IEventSubscriber.trigger(Object)>
	//* 166  390:goto            364
			flag1 = flag;
	//  167  393:iload_3         
	//  168  394:istore          4
			if(!((CopyOnWriteArraySet) (obj1)).isEmpty())
	//* 169  396:aload           5
	//* 170  398:invokevirtual   #202 <Method boolean CopyOnWriteArraySet.isEmpty()>
	//* 171  401:ifne            407
				flag1 = true;
	//  172  404:iconst_1        
	//  173  405:istore          4
		}
		if(!flag1 && obj != null)
	//* 174  407:iload           4
	//* 175  409:ifne            487
	//* 176  412:aload_1         
	//* 177  413:ifnull          487
		{
			String s1 = a;
	//  178  416:getstatic       #39  <Field String a>
	//  179  419:astore          5
			StringBuilder stringbuilder1 = new StringBuilder();
	//  180  421:new             #75  <Class StringBuilder>
	//  181  424:dup             
	//  182  425:invokespecial   #76  <Method void StringBuilder()>
	//  183  428:astore          6
			stringbuilder1.append("Event was published, but no subscribers were found. Saving event for later publishing to a matching subscriber. Event class: ");
	//  184  430:aload           6
	//  185  432:ldc1            #231 <String "Event was published, but no subscribers were found. Saving event for later publishing to a matching subscriber. Event class: ">
	//  186  434:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//  187  437:pop             
			stringbuilder1.append(((Object) (class1)));
	//  188  438:aload           6
	//  189  440:aload_2         
	//  190  441:invokevirtual   #119 <Method StringBuilder StringBuilder.append(Object)>
	//  191  444:pop             
			AppboyLogger.i(s1, stringbuilder1.toString());
	//  192  445:aload           5
	//  193  447:aload           6
	//  194  449:invokevirtual   #102 <Method String StringBuilder.toString()>
	//  195  452:invokestatic    #233 <Method int AppboyLogger.i(String, String)>
	//  196  455:pop             
			synchronized(e)
	//* 197  456:aload_0         
	//* 198  457:getfield        #55  <Field ConcurrentMap e>
	//* 199  460:astore          5
	//* 200  462:aload           5
	//* 201  464:monitorenter    
			{
				e.put(((Object) (class1)), obj);
	//  202  465:aload_0         
	//  203  466:getfield        #55  <Field ConcurrentMap e>
	//  204  469:aload_2         
	//  205  470:aload_1         
	//  206  471:invokeinterface #236 <Method Object ConcurrentMap.put(Object, Object)>
	//  207  476:pop             
			}
	//  208  477:aload           5
	//  209  479:monitorexit     
			return;
	//  210  480:return          
		} else
	//* 211  481:astore_1        
	//* 212  482:aload           5
	//* 213  484:monitorexit     
	//* 214  485:aload_1         
	//* 215  486:athrow          
		{
			return;
	//  216  487:return          
		}
		obj;
		concurrentmap;
		JVM INSTR monitorexit ;
		throw obj;
	}

	public boolean a(IEventSubscriber ieventsubscriber, Class class1)
	{
		boolean flag;
		synchronized(i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field Object i>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			flag = a(ieventsubscriber, class1, c);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_0         
	//    9   13:getfield        #51  <Field ConcurrentMap c>
	//   10   16:invokespecial   #240 <Method boolean a(IEventSubscriber, Class, ConcurrentMap)>
	//   11   19:istore_3        
		}
	//   12   20:aload           4
	//   13   22:monitorexit     
		return flag;
	//   14   23:iload_3         
	//   15   24:ireturn         
		ieventsubscriber;
	//   16   25:astore_1        
		obj;
	//   17   26:aload           4
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
		throw ieventsubscriber;
	//   19   29:aload_1         
	//   20   30:athrow          
	}

	public boolean b(IEventSubscriber ieventsubscriber, Class class1)
	{
		boolean flag;
		synchronized(j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field Object j>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			flag = a(ieventsubscriber, class1, d);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_0         
	//    9   13:getfield        #53  <Field ConcurrentMap d>
	//   10   16:invokespecial   #240 <Method boolean a(IEventSubscriber, Class, ConcurrentMap)>
	//   11   19:istore_3        
		}
	//   12   20:aload           4
	//   13   22:monitorexit     
		return flag;
	//   14   23:iload_3         
	//   15   24:ireturn         
		ieventsubscriber;
	//   16   25:astore_1        
		obj;
	//   17   26:aload           4
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
		throw ieventsubscriber;
	//   19   29:aload_1         
	//   20   30:athrow          
	}

	public boolean c(IEventSubscriber ieventsubscriber, Class class1)
	{
		boolean flag;
		synchronized(i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field Object i>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			flag = a((CopyOnWriteArraySet)c.get(((Object) (class1))), ieventsubscriber);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #51  <Field ConcurrentMap c>
	//    8   14:aload_2         
	//    9   15:invokeinterface #143 <Method Object ConcurrentMap.get(Object)>
	//   10   20:checkcast       #73  <Class CopyOnWriteArraySet>
	//   11   23:aload_1         
	//   12   24:invokespecial   #243 <Method boolean a(CopyOnWriteArraySet, IEventSubscriber)>
	//   13   27:istore_3        
		}
	//   14   28:aload           4
	//   15   30:monitorexit     
		return flag;
	//   16   31:iload_3         
	//   17   32:ireturn         
		ieventsubscriber;
	//   18   33:astore_1        
		obj;
	//   19   34:aload           4
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		throw ieventsubscriber;
	//   21   37:aload_1         
	//   22   38:athrow          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/ac);
	private final ConcurrentMap b = new ConcurrentHashMap();
	private final ConcurrentMap c = new ConcurrentHashMap();
	private final ConcurrentMap d = new ConcurrentHashMap();
	private final ConcurrentMap e = new ConcurrentHashMap();
	private final Executor f;
	private final dw g;
	private final Object h = new Object();
	private final Object i = new Object();
	private final Object j = new Object();
	private final Object k = new Object();

	static 
	{
	//    0    0:ldc1            #2   <Class ac>
	//    1    2:invokestatic    #37  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #39  <Field String a>
	//*   3    8:return          
	}
}

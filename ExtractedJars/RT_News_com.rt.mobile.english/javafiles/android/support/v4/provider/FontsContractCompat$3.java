// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.support.v4.util.SimpleArrayMap;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.provider:
//			FontsContractCompat

static final class FontsContractCompat$3
	implements ReplyCallback
{

	public void onReply(pefaceResult pefaceresult)
	{
		Object obj = FontsContractCompat.access$200();
	//    0    0:invokestatic    #28  <Method Object FontsContractCompat.access$200()>
	//    1    3:astore_3        
		obj;
	//    2    4:aload_3         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		ArrayList arraylist = (ArrayList)FontsContractCompat.access$300().get(((Object) (val$id)));
	//    4    6:invokestatic    #32  <Method SimpleArrayMap FontsContractCompat.access$300()>
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field String val$id>
	//    7   13:invokevirtual   #38  <Method Object SimpleArrayMap.get(Object)>
	//    8   16:checkcast       #40  <Class ArrayList>
	//    9   19:astore          4
		if(arraylist != null)
			break MISSING_BLOCK_LABEL_29;
	//   10   21:aload           4
	//   11   23:ifnonnull       29
		obj;
	//   12   26:aload_3         
		JVM INSTR monitorexit ;
	//   13   27:monitorexit     
		return;
	//   14   28:return          
		FontsContractCompat.access$300().remove(((Object) (val$id)));
	//   15   29:invokestatic    #32  <Method SimpleArrayMap FontsContractCompat.access$300()>
	//   16   32:aload_0         
	//   17   33:getfield        #18  <Field String val$id>
	//   18   36:invokevirtual   #43  <Method Object SimpleArrayMap.remove(Object)>
	//   19   39:pop             
		obj;
	//   20   40:aload_3         
		JVM INSTR monitorexit ;
	//   21   41:monitorexit     
		for(int i = 0; i < arraylist.size(); i++)
	//*  22   42:iconst_0        
	//*  23   43:istore_2        
	//*  24   44:iload_2         
	//*  25   45:aload           4
	//*  26   47:invokevirtual   #47  <Method int ArrayList.size()>
	//*  27   50:icmpge          75
			((ReplyCallback)arraylist.get(i)).onReply(((Object) (pefaceresult)));
	//   28   53:aload           4
	//   29   55:iload_2         
	//   30   56:invokevirtual   #50  <Method Object ArrayList.get(int)>
	//   31   59:checkcast       #7   <Class SelfDestructiveThread$ReplyCallback>
	//   32   62:aload_1         
	//   33   63:invokeinterface #53  <Method void SelfDestructiveThread$ReplyCallback.onReply(Object)>

	//   34   68:iload_2         
	//   35   69:iconst_1        
	//   36   70:iadd            
	//   37   71:istore_2        
	//*  38   72:goto            44
		return;
	//   39   75:return          
		pefaceresult;
	//   40   76:astore_1        
		obj;
	//   41   77:aload_3         
		JVM INSTR monitorexit ;
	//   42   78:monitorexit     
		throw pefaceresult;
	//   43   79:aload_1         
	//   44   80:athrow          
	}

	public volatile void onReply(Object obj)
	{
		onReply((pefaceResult)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #55  <Class FontsContractCompat$TypefaceResult>
	//    3    5:invokevirtual   #57  <Method void onReply(FontsContractCompat$TypefaceResult)>
	//    4    8:return          
	}

	final String val$id;

	FontsContractCompat$3(String s)
	{
		val$id = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field String val$id>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}

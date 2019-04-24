// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.graphics.Typeface;
import android.support.v4.util.SimpleArrayMap;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.provider:
//			FontsContractCompat

static final class FontsContractCompat$3
	implements ReplyCallback
{

	public void onReply(Typeface typeface)
	{
		ArrayList arraylist;
		synchronized(FontsContractCompat.access$200())
	//*   0    0:invokestatic    #28  <Method Object FontsContractCompat.access$200()>
	//*   1    3:astore_3        
	//*   2    4:aload_3         
	//*   3    5:monitorenter    
		{
			arraylist = (ArrayList)FontsContractCompat.access$300().get(((Object) (val$id)));
	//    4    6:invokestatic    #32  <Method SimpleArrayMap FontsContractCompat.access$300()>
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field String val$id>
	//    7   13:invokevirtual   #38  <Method Object SimpleArrayMap.get(Object)>
	//    8   16:checkcast       #40  <Class ArrayList>
	//    9   19:astore          4
			FontsContractCompat.access$300().remove(((Object) (val$id)));
	//   10   21:invokestatic    #32  <Method SimpleArrayMap FontsContractCompat.access$300()>
	//   11   24:aload_0         
	//   12   25:getfield        #18  <Field String val$id>
	//   13   28:invokevirtual   #43  <Method Object SimpleArrayMap.remove(Object)>
	//   14   31:pop             
		}
	//   15   32:aload_3         
	//   16   33:monitorexit     
		for(int i = 0; i < arraylist.size(); i++)
	//*  17   34:iconst_0        
	//*  18   35:istore_2        
	//*  19   36:iload_2         
	//*  20   37:aload           4
	//*  21   39:invokevirtual   #47  <Method int ArrayList.size()>
	//*  22   42:icmpge          72
			((ReplyCallback)arraylist.get(i)).onReply(((Object) (typeface)));
	//   23   45:aload           4
	//   24   47:iload_2         
	//   25   48:invokevirtual   #50  <Method Object ArrayList.get(int)>
	//   26   51:checkcast       #7   <Class SelfDestructiveThread$ReplyCallback>
	//   27   54:aload_1         
	//   28   55:invokeinterface #53  <Method void SelfDestructiveThread$ReplyCallback.onReply(Object)>

	//   29   60:iload_2         
	//   30   61:iconst_1        
	//   31   62:iadd            
	//   32   63:istore_2        
		break MISSING_BLOCK_LABEL_72;
	//   33   64:goto            36
		typeface;
	//   34   67:astore_1        
		obj;
	//   35   68:aload_3         
		JVM INSTR monitorexit ;
	//   36   69:monitorexit     
		throw typeface;
	//   37   70:aload_1         
	//   38   71:athrow          
	//   39   72:return          
	}

	public volatile void onReply(Object obj)
	{
		onReply((Typeface)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #55  <Class Typeface>
	//    3    5:invokevirtual   #57  <Method void onReply(Typeface)>
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

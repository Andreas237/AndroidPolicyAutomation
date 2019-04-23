// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class ListenerUtil
{

	public ListenerUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static Object getListener(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          14
			return view.getTag(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #32  <Method Object View.getTag(int)>
	//    6   13:areturn         
		SparseArray sparsearray = sListeners;
	//    7   14:getstatic       #16  <Field SparseArray sListeners>
	//    8   17:astore_2        
		sparsearray;
	//    9   18:aload_2         
		JVM INSTR monitorenter ;
	//   10   19:monitorenter    
		WeakHashMap weakhashmap = (WeakHashMap)sListeners.get(i);
	//   11   20:getstatic       #16  <Field SparseArray sListeners>
	//   12   23:iload_1         
	//   13   24:invokevirtual   #35  <Method Object SparseArray.get(int)>
	//   14   27:checkcast       #37  <Class WeakHashMap>
	//   15   30:astore_3        
		if(weakhashmap != null)
			break MISSING_BLOCK_LABEL_39;
	//   16   31:aload_3         
	//   17   32:ifnonnull       39
		sparsearray;
	//   18   35:aload_2         
		JVM INSTR monitorexit ;
	//   19   36:monitorexit     
		return ((Object) (null));
	//   20   37:aconst_null     
	//   21   38:areturn         
		view = ((View) ((WeakReference)weakhashmap.get(((Object) (view)))));
	//   22   39:aload_3         
	//   23   40:aload_0         
	//   24   41:invokevirtual   #40  <Method Object WeakHashMap.get(Object)>
	//   25   44:checkcast       #42  <Class WeakReference>
	//   26   47:astore_0        
		if(view != null)
			break MISSING_BLOCK_LABEL_56;
	//   27   48:aload_0         
	//   28   49:ifnonnull       56
		sparsearray;
	//   29   52:aload_2         
		JVM INSTR monitorexit ;
	//   30   53:monitorexit     
		return ((Object) (null));
	//   31   54:aconst_null     
	//   32   55:areturn         
		view = ((View) (((WeakReference) (view)).get()));
	//   33   56:aload_0         
	//   34   57:invokevirtual   #45  <Method Object WeakReference.get()>
	//   35   60:astore_0        
		sparsearray;
	//   36   61:aload_2         
		JVM INSTR monitorexit ;
	//   37   62:monitorexit     
		return ((Object) (view));
	//   38   63:aload_0         
	//   39   64:areturn         
		view;
	//   40   65:astore_0        
		sparsearray;
	//   41   66:aload_2         
		JVM INSTR monitorexit ;
	//   42   67:monitorexit     
		throw view;
	//   43   68:aload_0         
	//   44   69:athrow          
	}

	public static Object trackListener(View view, Object obj, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          22
		{
			Object obj1 = view.getTag(i);
	//    3    8:aload_0         
	//    4    9:iload_2         
	//    5   10:invokevirtual   #32  <Method Object View.getTag(int)>
	//    6   13:astore_3        
			view.setTag(i, obj);
	//    7   14:aload_0         
	//    8   15:iload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #53  <Method void View.setTag(int, Object)>
			return obj1;
	//   11   20:aload_3         
	//   12   21:areturn         
		}
		SparseArray sparsearray = sListeners;
	//   13   22:getstatic       #16  <Field SparseArray sListeners>
	//   14   25:astore          5
		sparsearray;
	//   15   27:aload           5
		JVM INSTR monitorenter ;
	//   16   29:monitorenter    
		WeakHashMap weakhashmap1 = (WeakHashMap)sListeners.get(i);
	//   17   30:getstatic       #16  <Field SparseArray sListeners>
	//   18   33:iload_2         
	//   19   34:invokevirtual   #35  <Method Object SparseArray.get(int)>
	//   20   37:checkcast       #37  <Class WeakHashMap>
	//   21   40:astore          4
		WeakHashMap weakhashmap;
		weakhashmap = weakhashmap1;
	//   22   42:aload           4
	//   23   44:astore_3        
		if(weakhashmap1 != null)
			break MISSING_BLOCK_LABEL_66;
	//   24   45:aload           4
	//   25   47:ifnonnull       66
		weakhashmap = new WeakHashMap();
	//   26   50:new             #37  <Class WeakHashMap>
	//   27   53:dup             
	//   28   54:invokespecial   #54  <Method void WeakHashMap()>
	//   29   57:astore_3        
		sListeners.put(i, ((Object) (weakhashmap)));
	//   30   58:getstatic       #16  <Field SparseArray sListeners>
	//   31   61:iload_2         
	//   32   62:aload_3         
	//   33   63:invokevirtual   #57  <Method void SparseArray.put(int, Object)>
		if(obj != null)
			break MISSING_BLOCK_LABEL_82;
	//   34   66:aload_1         
	//   35   67:ifnonnull       82
		view = ((View) ((WeakReference)weakhashmap.remove(((Object) (view)))));
	//   36   70:aload_3         
	//   37   71:aload_0         
	//   38   72:invokevirtual   #60  <Method Object WeakHashMap.remove(Object)>
	//   39   75:checkcast       #42  <Class WeakReference>
	//   40   78:astore_0        
		break MISSING_BLOCK_LABEL_99;
	//   41   79:goto            99
		view = ((View) ((WeakReference)weakhashmap.put(((Object) (view)), ((Object) (new WeakReference(obj))))));
	//   42   82:aload_3         
	//   43   83:aload_0         
	//   44   84:new             #42  <Class WeakReference>
	//   45   87:dup             
	//   46   88:aload_1         
	//   47   89:invokespecial   #63  <Method void WeakReference(Object)>
	//   48   92:invokevirtual   #66  <Method Object WeakHashMap.put(Object, Object)>
	//   49   95:checkcast       #42  <Class WeakReference>
	//   50   98:astore_0        
		if(view != null)
			break MISSING_BLOCK_LABEL_108;
	//   51   99:aload_0         
	//   52  100:ifnonnull       108
		sparsearray;
	//   53  103:aload           5
		JVM INSTR monitorexit ;
	//   54  105:monitorexit     
		return ((Object) (null));
	//   55  106:aconst_null     
	//   56  107:areturn         
		view = ((View) (((WeakReference) (view)).get()));
	//   57  108:aload_0         
	//   58  109:invokevirtual   #45  <Method Object WeakReference.get()>
	//   59  112:astore_0        
		sparsearray;
	//   60  113:aload           5
		JVM INSTR monitorexit ;
	//   61  115:monitorexit     
		return ((Object) (view));
	//   62  116:aload_0         
	//   63  117:areturn         
		view;
	//   64  118:astore_0        
		sparsearray;
	//   65  119:aload           5
		JVM INSTR monitorexit ;
	//   66  121:monitorexit     
		throw view;
	//   67  122:aload_0         
	//   68  123:athrow          
	}

	private static final SparseArray sListeners = new SparseArray();

	static 
	{
	//    0    0:new             #11  <Class SparseArray>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void SparseArray()>
	//    3    7:putstatic       #16  <Field SparseArray sListeners>
	//*   4   10:return          
	}
}

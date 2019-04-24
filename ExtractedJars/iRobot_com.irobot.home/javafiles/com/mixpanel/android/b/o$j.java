// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.b;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import java.util.*;

// Referenced classes of package com.mixpanel.android.b:
//			o, a

public static class o$j extends o
{

	public void a()
	{
		Iterator iterator = c.entrySet().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field WeakHashMap c>
	//    2    4:invokevirtual   #40  <Method Set WeakHashMap.entrySet()>
	//    3    7:invokeinterface #46  <Method Iterator Set.iterator()>
	//    4   12:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    5   13:aload_1         
	//    6   14:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            76
			Object obj = ((Object) ((java.util.Entry)iterator.next()));
	//    8   22:aload_1         
	//    9   23:invokeinterface #56  <Method Object Iterator.next()>
	//   10   28:checkcast       #58  <Class java.util.Map$Entry>
	//   11   31:astore_3        
			View view = (View)((java.util.Entry) (obj)).getKey();
	//   12   32:aload_3         
	//   13   33:invokeinterface #61  <Method Object java.util.Map$Entry.getKey()>
	//   14   38:checkcast       #63  <Class View>
	//   15   41:astore_2        
			obj = ((java.util.Entry) (obj)).getValue();
	//   16   42:aload_3         
	//   17   43:invokeinterface #66  <Method Object java.util.Map$Entry.getValue()>
	//   18   48:astore_3        
			if(obj != null)
	//*  19   49:aload_3         
	//*  20   50:ifnull          13
			{
				d[0] = obj;
	//   21   53:aload_0         
	//   22   54:getfield        #26  <Field Object[] d>
	//   23   57:iconst_0        
	//   24   58:aload_3         
	//   25   59:aastore         
				a.a(view, d);
	//   26   60:aload_0         
	//   27   61:getfield        #20  <Field a a>
	//   28   64:aload_2         
	//   29   65:aload_0         
	//   30   66:getfield        #26  <Field Object[] d>
	//   31   69:invokevirtual   #71  <Method Object a.a(View, Object[])>
	//   32   72:pop             
			}
		} while(true);
	//   33   73:goto            13
	//   34   76:return          
	}

	public void a(View view)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field a b>
	//*   2    4:ifnull          199
		{
			Object aobj[] = a.a();
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field a a>
	//    5   11:invokevirtual   #75  <Method Object[] a.a()>
	//    6   14:astore_2        
			if(1 == aobj.length)
	//*   7   15:iconst_1        
	//*   8   16:aload_2         
	//*   9   17:arraylength     
	//*  10   18:icmpne          199
			{
				Object obj1 = aobj[0];
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:aaload          
	//   14   24:astore_3        
				Object obj = b.a(view);
	//   15   25:aload_0         
	//   16   26:getfield        #22  <Field a b>
	//   17   29:aload_1         
	//   18   30:invokevirtual   #78  <Method Object a.a(View)>
	//   19   33:astore_2        
				if(obj1 == obj)
	//*  20   34:aload_3         
	//*  21   35:aload_2         
	//*  22   36:if_acmpne       40
					return;
	//   23   39:return          
				if(obj1 != null)
	//*  24   40:aload_3         
	//*  25   41:ifnull          127
					if((obj1 instanceof Bitmap) && (obj instanceof Bitmap))
	//*  26   44:aload_3         
	//*  27   45:instanceof      #80  <Class Bitmap>
	//*  28   48:ifeq            73
	//*  29   51:aload_2         
	//*  30   52:instanceof      #80  <Class Bitmap>
	//*  31   55:ifeq            73
					{
						if(((Bitmap)obj1).sameAs((Bitmap)obj))
	//*  32   58:aload_3         
	//*  33   59:checkcast       #80  <Class Bitmap>
	//*  34   62:aload_2         
	//*  35   63:checkcast       #80  <Class Bitmap>
	//*  36   66:invokevirtual   #84  <Method boolean Bitmap.sameAs(Bitmap)>
	//*  37   69:ifeq            127
							return;
	//   38   72:return          
					} else
					if((obj1 instanceof BitmapDrawable) && (obj instanceof BitmapDrawable))
	//*  39   73:aload_3         
	//*  40   74:instanceof      #86  <Class BitmapDrawable>
	//*  41   77:ifeq            118
	//*  42   80:aload_2         
	//*  43   81:instanceof      #86  <Class BitmapDrawable>
	//*  44   84:ifeq            118
					{
						obj1 = ((Object) (((BitmapDrawable)obj1).getBitmap()));
	//   45   87:aload_3         
	//   46   88:checkcast       #86  <Class BitmapDrawable>
	//   47   91:invokevirtual   #90  <Method Bitmap BitmapDrawable.getBitmap()>
	//   48   94:astore_3        
						Bitmap bitmap = ((BitmapDrawable)obj).getBitmap();
	//   49   95:aload_2         
	//   50   96:checkcast       #86  <Class BitmapDrawable>
	//   51   99:invokevirtual   #90  <Method Bitmap BitmapDrawable.getBitmap()>
	//   52  102:astore          4
						if(obj1 != null && ((Bitmap) (obj1)).sameAs(bitmap))
	//*  53  104:aload_3         
	//*  54  105:ifnull          127
	//*  55  108:aload_3         
	//*  56  109:aload           4
	//*  57  111:invokevirtual   #84  <Method boolean Bitmap.sameAs(Bitmap)>
	//*  58  114:ifeq            127
							return;
	//   59  117:return          
					} else
					if(obj1.equals(obj))
	//*  60  118:aload_3         
	//*  61  119:aload_2         
	//*  62  120:invokevirtual   #94  <Method boolean Object.equals(Object)>
	//*  63  123:ifeq            127
						return;
	//   64  126:return          
				if(!(obj instanceof Bitmap) && !(obj instanceof BitmapDrawable) && !c.containsKey(((Object) (view))))
	//*  65  127:aload_2         
	//*  66  128:instanceof      #80  <Class Bitmap>
	//*  67  131:ifne            199
	//*  68  134:aload_2         
	//*  69  135:instanceof      #86  <Class BitmapDrawable>
	//*  70  138:ifne            199
	//*  71  141:aload_0         
	//*  72  142:getfield        #33  <Field WeakHashMap c>
	//*  73  145:aload_1         
	//*  74  146:invokevirtual   #97  <Method boolean WeakHashMap.containsKey(Object)>
	//*  75  149:ifeq            155
	//*  76  152:goto            199
				{
					d[0] = obj;
	//   77  155:aload_0         
	//   78  156:getfield        #26  <Field Object[] d>
	//   79  159:iconst_0        
	//   80  160:aload_2         
	//   81  161:aastore         
					if(a.a(d))
	//*  82  162:aload_0         
	//*  83  163:getfield        #20  <Field a a>
	//*  84  166:aload_0         
	//*  85  167:getfield        #26  <Field Object[] d>
	//*  86  170:invokevirtual   #100 <Method boolean a.a(Object[])>
	//*  87  173:ifeq            189
						c.put(((Object) (view)), obj);
	//   88  176:aload_0         
	//   89  177:getfield        #33  <Field WeakHashMap c>
	//   90  180:aload_1         
	//   91  181:aload_2         
	//   92  182:invokevirtual   #104 <Method Object WeakHashMap.put(Object, Object)>
	//   93  185:pop             
					else
	//*  94  186:goto            199
						c.put(((Object) (view)), ((Object) (null)));
	//   95  189:aload_0         
	//   96  190:getfield        #33  <Field WeakHashMap c>
	//   97  193:aload_1         
	//   98  194:aconst_null     
	//   99  195:invokevirtual   #104 <Method Object WeakHashMap.put(Object, Object)>
	//  100  198:pop             
				}
			}
		}
		a.a(view);
	//  101  199:aload_0         
	//  102  200:getfield        #20  <Field a a>
	//  103  203:aload_1         
	//  104  204:invokevirtual   #78  <Method Object a.a(View)>
	//  105  207:pop             
	//  106  208:return          
	}

	public volatile void b(View view)
	{
		super.b(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #106 <Method void o.b(View)>
	//    3    5:return          
	}

	private final a a;
	private final a b;
	private final WeakHashMap c = new WeakHashMap();
	private final Object d[] = new Object[1];

	public o$j(List list, a a1, a a2)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void o(List)>
		a = a1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field a a>
		b = a2;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #22  <Field a b>
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:anewarray       Object[]
	//   12   20:putfield        #26  <Field Object[] d>
	//   13   23:aload_0         
	//   14   24:new             #28  <Class WeakHashMap>
	//   15   27:dup             
	//   16   28:invokespecial   #31  <Method void WeakHashMap()>
	//   17   31:putfield        #33  <Field WeakHashMap c>
	//   18   34:return          
	}
}

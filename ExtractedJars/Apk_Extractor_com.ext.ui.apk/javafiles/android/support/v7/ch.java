// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.graphics.Bitmap;
import java.util.*;

// Referenced classes of package android.support.v7:
//			ci

public class ch
{

	public ch()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = Collections.synchronizedMap(((Map) (new LinkedHashMap(10, 1.5F, true))));
	//    2    4:aload_0         
	//    3    5:new             #16  <Class LinkedHashMap>
	//    4    8:dup             
	//    5    9:bipush          10
	//    6   11:ldc1            #17  <Float 1.5F>
	//    7   13:iconst_1        
	//    8   14:invokespecial   #20  <Method void LinkedHashMap(int, float, boolean)>
	//    9   17:invokestatic    #26  <Method Map Collections.synchronizedMap(Map)>
	//   10   20:putfield        #28  <Field Map a>
		b = 0L;
	//   11   23:aload_0         
	//   12   24:lconst_0        
	//   13   25:putfield        #30  <Field long b>
		c = 0xf4240L;
	//   14   28:aload_0         
	//   15   29:ldc2w           #31  <Long 0xf4240L>
	//   16   32:putfield        #34  <Field long c>
		a(Runtime.getRuntime().maxMemory() / 4L);
	//   17   35:aload_0         
	//   18   36:invokestatic    #40  <Method Runtime Runtime.getRuntime()>
	//   19   39:invokevirtual   #44  <Method long Runtime.maxMemory()>
	//   20   42:ldc2w           #45  <Long 4L>
	//   21   45:ldiv            
	//   22   46:invokevirtual   #49  <Method void a(long)>
	//   23   49:return          
	}

	private void b()
	{
		if(b > c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field long b>
	//*   2    4:aload_0         
	//*   3    5:getfield        #34  <Field long c>
	//*   4    8:lcmp            
	//*   5    9:ifle            118
		{
			Iterator iterator = a.entrySet().iterator();
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field Map a>
	//    8   16:invokeinterface #56  <Method Set Map.entrySet()>
	//    9   21:invokeinterface #62  <Method Iterator Set.iterator()>
	//   10   26:astore_1        
			do
			{
				if(!iterator.hasNext())
					break;
	//   11   27:aload_1         
	//   12   28:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//   13   33:ifeq            86
				java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   14   36:aload_1         
	//   15   37:invokeinterface #72  <Method Object Iterator.next()>
	//   16   42:checkcast       #74  <Class java.util.Map$Entry>
	//   17   45:astore_2        
				b = b - a((Bitmap)entry.getValue());
	//   18   46:aload_0         
	//   19   47:aload_0         
	//   20   48:getfield        #30  <Field long b>
	//   21   51:aload_0         
	//   22   52:aload_2         
	//   23   53:invokeinterface #77  <Method Object java.util.Map$Entry.getValue()>
	//   24   58:checkcast       #79  <Class Bitmap>
	//   25   61:invokevirtual   #82  <Method long a(Bitmap)>
	//   26   64:lsub            
	//   27   65:putfield        #30  <Field long b>
				iterator.remove();
	//   28   68:aload_1         
	//   29   69:invokeinterface #85  <Method void Iterator.remove()>
			} while(b > c);
	//   30   74:aload_0         
	//   31   75:getfield        #30  <Field long b>
	//   32   78:aload_0         
	//   33   79:getfield        #34  <Field long c>
	//   34   82:lcmp            
	//   35   83:ifgt            27
			ci.a("MemoryCache", (new StringBuilder()).append("Clean cache. New size ").append(a.size()).toString());
	//   36   86:ldc1            #87  <String "MemoryCache">
	//   37   88:new             #89  <Class StringBuilder>
	//   38   91:dup             
	//   39   92:invokespecial   #90  <Method void StringBuilder()>
	//   40   95:ldc1            #92  <String "Clean cache. New size ">
	//   41   97:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   42  100:aload_0         
	//   43  101:getfield        #28  <Field Map a>
	//   44  104:invokeinterface #100 <Method int Map.size()>
	//   45  109:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//   46  112:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   47  115:invokestatic    #112 <Method void ci.a(String, String)>
		}
	//   48  118:return          
	}

	long a(Bitmap bitmap)
	{
		if(bitmap == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return 0L;
	//    2    4:lconst_0        
	//    3    5:lreturn         
		else
			return (long)(bitmap.getRowBytes() * bitmap.getHeight());
	//    4    6:aload_1         
	//    5    7:invokevirtual   #115 <Method int Bitmap.getRowBytes()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #118 <Method int Bitmap.getHeight()>
	//    8   14:imul            
	//    9   15:i2l             
	//   10   16:lreturn         
	}

	public Bitmap a(String s)
	{
		if(!a.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Map a>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #125 <Method boolean Map.containsKey(Object)>
	//*   4   10:ifne            15
			return null;
	//    5   13:aconst_null     
	//    6   14:areturn         
		try
		{
			s = ((String) ((Bitmap)a.get(((Object) (s)))));
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field Map a>
	//    9   19:aload_1         
	//   10   20:invokeinterface #129 <Method Object Map.get(Object)>
	//   11   25:checkcast       #79  <Class Bitmap>
	//   12   28:astore_1        
		}
	//*  13   29:aload_1         
	//*  14   30:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  15   31:astore_1        
		{
			((NullPointerException) (s)).printStackTrace();
	//   16   32:aload_1         
	//   17   33:invokevirtual   #132 <Method void NullPointerException.printStackTrace()>
			return null;
	//   18   36:aconst_null     
	//   19   37:areturn         
		}
		return ((Bitmap) (s));
	}

	public void a()
	{
		try
		{
			a.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Map a>
	//    2    4:invokeinterface #135 <Method void Map.clear()>
			b = 0L;
	//    3    9:aload_0         
	//    4   10:lconst_0        
	//    5   11:putfield        #30  <Field long b>
			return;
	//    6   14:return          
		}
		catch(NullPointerException nullpointerexception)
	//*   7   15:astore_1        
		{
			nullpointerexception.printStackTrace();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #132 <Method void NullPointerException.printStackTrace()>
		}
	//   10   20:return          
	}

	public void a(long l)
	{
		c = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #34  <Field long c>
	//    3    5:return          
	}

	public void a(String s, Bitmap bitmap)
	{
		try
		{
			if(a.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Map a>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #125 <Method boolean Map.containsKey(Object)>
	//*   4   10:ifeq            39
				b = b - a((Bitmap)a.get(((Object) (s))));
	//    5   13:aload_0         
	//    6   14:aload_0         
	//    7   15:getfield        #30  <Field long b>
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #28  <Field Map a>
	//   11   23:aload_1         
	//   12   24:invokeinterface #129 <Method Object Map.get(Object)>
	//   13   29:checkcast       #79  <Class Bitmap>
	//   14   32:invokevirtual   #82  <Method long a(Bitmap)>
	//   15   35:lsub            
	//   16   36:putfield        #30  <Field long b>
			a.put(((Object) (s)), ((Object) (bitmap)));
	//   17   39:aload_0         
	//   18   40:getfield        #28  <Field Map a>
	//   19   43:aload_1         
	//   20   44:aload_2         
	//   21   45:invokeinterface #142 <Method Object Map.put(Object, Object)>
	//   22   50:pop             
			b = b + a(bitmap);
	//   23   51:aload_0         
	//   24   52:aload_0         
	//   25   53:getfield        #30  <Field long b>
	//   26   56:aload_0         
	//   27   57:aload_2         
	//   28   58:invokevirtual   #82  <Method long a(Bitmap)>
	//   29   61:ladd            
	//   30   62:putfield        #30  <Field long b>
			b();
	//   31   65:aload_0         
	//   32   66:invokespecial   #144 <Method void b()>
			return;
	//   33   69:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  34   70:astore_1        
		{
			((Throwable) (s)).printStackTrace();
	//   35   71:aload_1         
	//   36   72:invokevirtual   #145 <Method void Throwable.printStackTrace()>
		}
	//   37   75:return          
	}

	private Map a;
	private long b;
	private long c;
}

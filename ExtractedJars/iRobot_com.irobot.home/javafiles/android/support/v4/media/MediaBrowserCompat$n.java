// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.*;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat, b, a

public static abstract class MediaBrowserCompat$n
{
	private class a
		implements a.d
	{

		List a(List list, Bundle bundle)
		{
			if(list == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
		//    4    6:aload_2         
		//    5    7:ldc1            #24  <String "android.media.browse.extra.PAGE">
		//    6    9:iconst_m1       
		//    7   10:invokevirtual   #30  <Method int Bundle.getInt(String, int)>
		//    8   13:istore_3        
			int i1 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
		//    9   14:aload_2         
		//   10   15:ldc1            #32  <String "android.media.browse.extra.PAGE_SIZE">
		//   11   17:iconst_m1       
		//   12   18:invokevirtual   #30  <Method int Bundle.getInt(String, int)>
		//   13   21:istore          6
			if(i == -1 && i1 == -1)
		//*  14   23:iload_3         
		//*  15   24:iconst_m1       
		//*  16   25:icmpne          36
		//*  17   28:iload           6
		//*  18   30:iconst_m1       
		//*  19   31:icmpne          36
				return list;
		//   20   34:aload_1         
		//   21   35:areturn         
			int l = i1 * i;
		//   22   36:iload           6
		//   23   38:iload_3         
		//   24   39:imul            
		//   25   40:istore          5
			int k = l + i1;
		//   26   42:iload           5
		//   27   44:iload           6
		//   28   46:iadd            
		//   29   47:istore          4
			if(i >= 0 && i1 >= 1 && l < list.size())
		//*  30   49:iload_3         
		//*  31   50:iflt            104
		//*  32   53:iload           6
		//*  33   55:iconst_1        
		//*  34   56:icmplt          104
		//*  35   59:iload           5
		//*  36   61:aload_1         
		//*  37   62:invokeinterface #38  <Method int List.size()>
		//*  38   67:icmplt          73
		//*  39   70:goto            104
			{
				int j = k;
		//   40   73:iload           4
		//   41   75:istore_3        
				if(k > list.size())
		//*  42   76:iload           4
		//*  43   78:aload_1         
		//*  44   79:invokeinterface #38  <Method int List.size()>
		//*  45   84:icmple          94
					j = list.size();
		//   46   87:aload_1         
		//   47   88:invokeinterface #38  <Method int List.size()>
		//   48   93:istore_3        
				return list.subList(l, j);
		//   49   94:aload_1         
		//   50   95:iload           5
		//   51   97:iload_3         
		//   52   98:invokeinterface #42  <Method List List.subList(int, int)>
		//   53  103:areturn         
			} else
			{
				return Collections.EMPTY_LIST;
		//   54  104:getstatic       #48  <Field List Collections.EMPTY_LIST>
		//   55  107:areturn         
			}
		}

		public void a(String s)
		{
			a.a(s);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field MediaBrowserCompat$n a>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #53  <Method void MediaBrowserCompat$n.a(String)>
		//    4    8:return          
		}

		public void a(String s, List list)
		{
			Object obj;
			if(a.a == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field MediaBrowserCompat$n a>
		//*   2    4:getfield        #57  <Field WeakReference MediaBrowserCompat$n.a>
		//*   3    7:ifnonnull       16
				obj = null;
		//    4   10:aconst_null     
		//    5   11:astore          4
			else
		//*   6   13:goto            31
				obj = ((Object) ((MediaBrowserCompat.m)a.a.get()));
		//    7   16:aload_0         
		//    8   17:getfield        #17  <Field MediaBrowserCompat$n a>
		//    9   20:getfield        #57  <Field WeakReference MediaBrowserCompat$n.a>
		//   10   23:invokevirtual   #63  <Method Object WeakReference.get()>
		//   11   26:checkcast       #65  <Class MediaBrowserCompat$m>
		//   12   29:astore          4
			if(obj == null)
		//*  13   31:aload           4
		//*  14   33:ifnonnull       49
			{
				a.a(s, MediaBrowserCompat.MediaItem.a(list));
		//   15   36:aload_0         
		//   16   37:getfield        #17  <Field MediaBrowserCompat$n a>
		//   17   40:aload_1         
		//   18   41:aload_2         
		//   19   42:invokestatic    #70  <Method List MediaBrowserCompat$MediaItem.a(List)>
		//   20   45:invokevirtual   #72  <Method void MediaBrowserCompat$n.a(String, List)>
				return;
		//   21   48:return          
			}
			list = MediaBrowserCompat.MediaItem.a(list);
		//   22   49:aload_2         
		//   23   50:invokestatic    #70  <Method List MediaBrowserCompat$MediaItem.a(List)>
		//   24   53:astore_2        
			List list1 = ((MediaBrowserCompat.m) (obj)).b();
		//   25   54:aload           4
		//   26   56:invokevirtual   #76  <Method List MediaBrowserCompat$m.b()>
		//   27   59:astore          5
			obj = ((Object) (((MediaBrowserCompat.m) (obj)).a()));
		//   28   61:aload           4
		//   29   63:invokevirtual   #78  <Method List MediaBrowserCompat$m.a()>
		//   30   66:astore          4
			for(int i = 0; i < list1.size(); i++)
		//*  31   68:iconst_0        
		//*  32   69:istore_3        
		//*  33   70:iload_3         
		//*  34   71:aload           5
		//*  35   73:invokeinterface #38  <Method int List.size()>
		//*  36   78:icmpge          135
			{
				Bundle bundle = (Bundle)((List) (obj)).get(i);
		//   37   81:aload           4
		//   38   83:iload_3         
		//   39   84:invokeinterface #81  <Method Object List.get(int)>
		//   40   89:checkcast       #26  <Class Bundle>
		//   41   92:astore          6
				if(bundle == null)
		//*  42   94:aload           6
		//*  43   96:ifnonnull       111
					a.a(s, list);
		//   44   99:aload_0         
		//   45  100:getfield        #17  <Field MediaBrowserCompat$n a>
		//   46  103:aload_1         
		//   47  104:aload_2         
		//   48  105:invokevirtual   #72  <Method void MediaBrowserCompat$n.a(String, List)>
				else
		//*  49  108:goto            128
					a.a(s, a(list, bundle), bundle);
		//   50  111:aload_0         
		//   51  112:getfield        #17  <Field MediaBrowserCompat$n a>
		//   52  115:aload_1         
		//   53  116:aload_0         
		//   54  117:aload_2         
		//   55  118:aload           6
		//   56  120:invokevirtual   #83  <Method List a(List, Bundle)>
		//   57  123:aload           6
		//   58  125:invokevirtual   #86  <Method void MediaBrowserCompat$n.a(String, List, Bundle)>
			}

		//   59  128:iload_3         
		//   60  129:iconst_1        
		//   61  130:iadd            
		//   62  131:istore_3        
		//*  63  132:goto            70
		//   64  135:return          
		}

		final MediaBrowserCompat.n a;

		a()
		{
			a = MediaBrowserCompat.n.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field MediaBrowserCompat$n a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}
	}

	private class b extends a
		implements b.a
	{

		public void a(String s, Bundle bundle)
		{
			b.a(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field MediaBrowserCompat$n b>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #24  <Method void MediaBrowserCompat$n.a(String, Bundle)>
		//    5    9:return          
		}

		public void a(String s, List list, Bundle bundle)
		{
			b.a(s, MediaBrowserCompat.MediaItem.a(list), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field MediaBrowserCompat$n b>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #30  <Method List MediaBrowserCompat$MediaItem.a(List)>
		//    5    9:aload_3         
		//    6   10:invokevirtual   #32  <Method void MediaBrowserCompat$n.a(String, List, Bundle)>
		//    7   13:return          
		}

		final MediaBrowserCompat.n b;

		b()
		{
			b = MediaBrowserCompat.n.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field MediaBrowserCompat$n b>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #19  <Method void MediaBrowserCompat$n$a(MediaBrowserCompat$n)>
		//    6   10:return          
		}
	}


	static IBinder a(MediaBrowserCompat$n mediabrowsercompat$n)
	{
		return mediabrowsercompat$n.c;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field IBinder c>
	//    2    4:areturn         
	}

	public void a(String s)
	{
	//    0    0:return          
	}

	public void a(String s, Bundle bundle)
	{
	//    0    0:return          
	}

	public void a(String s, List list)
	{
	//    0    0:return          
	}

	public void a(String s, List list, Bundle bundle)
	{
	//    0    0:return          
	}

	WeakReference a;
	private final Object b;
	private final IBinder c;

	public MediaBrowserCompat$n()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   2    4:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          26
	//*   4    9:icmplt          33
		{
			b = android.support.v4.media.b.a(((b.a) (new b())));
	//    5   12:aload_0         
	//    6   13:new             #12  <Class MediaBrowserCompat$n$b>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #31  <Method void MediaBrowserCompat$n$b(MediaBrowserCompat$n)>
	//   10   21:invokestatic    #36  <Method Object b.a(b$a)>
	//   11   24:putfield        #38  <Field Object b>
			c = null;
	//   12   27:aload_0         
	//   13   28:aconst_null     
	//   14   29:putfield        #40  <Field IBinder c>
			return;
	//   15   32:return          
		}
		Binder binder;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  16   33:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   36:bipush          21
	//*  18   38:icmplt          70
		{
			b = android.support.v4.media.a.a(((a.d) (new a())));
	//   19   41:aload_0         
	//   20   42:new             #9   <Class MediaBrowserCompat$n$a>
	//   21   45:dup             
	//   22   46:aload_0         
	//   23   47:invokespecial   #41  <Method void MediaBrowserCompat$n$a(MediaBrowserCompat$n)>
	//   24   50:invokestatic    #46  <Method Object a.a(a$d)>
	//   25   53:putfield        #38  <Field Object b>
			binder = new Binder();
	//   26   56:new             #48  <Class Binder>
	//   27   59:dup             
	//   28   60:invokespecial   #49  <Method void Binder()>
	//   29   63:astore_1        
		} else
	//*  30   64:aload_0         
	//*  31   65:aload_1         
	//*  32   66:putfield        #40  <Field IBinder c>
	//*  33   69:return          
		{
			b = null;
	//   34   70:aload_0         
	//   35   71:aconst_null     
	//   36   72:putfield        #38  <Field Object b>
			binder = new Binder();
	//   37   75:new             #48  <Class Binder>
	//   38   78:dup             
	//   39   79:invokespecial   #49  <Method void Binder()>
	//   40   82:astore_1        
		}
		c = ((IBinder) (binder));
	//*  41   83:goto            64
	}
}

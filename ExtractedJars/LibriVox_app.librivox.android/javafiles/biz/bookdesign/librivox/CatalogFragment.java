// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.a.g;
import android.support.v4.app.Fragment;
import android.view.*;
import android.widget.ListView;
import biz.bookdesign.catalogbase.*;
import biz.bookdesign.librivox.a.i;
import java.util.*;

// Referenced classes of package biz.bookdesign.librivox:
//			at, ax, az, ga, 
//			ge, bi, av, aw, 
//			ay, bw, au

public class CatalogFragment extends Fragment
{

	public CatalogFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Fragment()>
		f = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #32  <Field boolean f>
		g = new HashMap();
	//    5    9:aload_0         
	//    6   10:new             #34  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #35  <Method void HashMap()>
	//    9   17:putfield        #37  <Field HashMap g>
		h = ((Set) (new HashSet()));
	//   10   20:aload_0         
	//   11   21:new             #39  <Class HashSet>
	//   12   24:dup             
	//   13   25:invokespecial   #40  <Method void HashSet()>
	//   14   28:putfield        #42  <Field Set h>
		k = ((q) (new at(this)));
	//   15   31:aload_0         
	//   16   32:new             #44  <Class at>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokespecial   #47  <Method void at(CatalogFragment)>
	//   20   40:putfield        #49  <Field q k>
	//   21   43:return          
	}

	static long a(CatalogFragment catalogfragment, long l)
	{
		catalogfragment.j = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #53  <Field long j>
		return l;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

	static r a(CatalogFragment catalogfragment)
	{
		return catalogfragment.i;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field r i>
	//    2    4:areturn         
	}

	private static List a(Bundle bundle)
	{
		ArrayList arraylist = bundle.getIntegerArrayList("type");
	//    0    0:aload_0         
	//    1    1:ldc1            #59  <String "type">
	//    2    3:invokevirtual   #65  <Method ArrayList Bundle.getIntegerArrayList(String)>
	//    3    6:astore_2        
		ArrayList arraylist1 = bundle.getCharSequenceArrayList("subtype");
	//    4    7:aload_0         
	//    5    8:ldc1            #67  <String "subtype">
	//    6   10:invokevirtual   #70  <Method ArrayList Bundle.getCharSequenceArrayList(String)>
	//    7   13:astore_3        
		bundle = ((Bundle) (bundle.getCharSequenceArrayList("machinetype")));
	//    8   14:aload_0         
	//    9   15:ldc1            #72  <String "machinetype">
	//   10   17:invokevirtual   #70  <Method ArrayList Bundle.getCharSequenceArrayList(String)>
	//   11   20:astore_0        
		ArrayList arraylist2 = new ArrayList(((List) (arraylist)).size());
	//   12   21:new             #74  <Class ArrayList>
	//   13   24:dup             
	//   14   25:aload_2         
	//   15   26:invokeinterface #80  <Method int List.size()>
	//   16   31:invokespecial   #83  <Method void ArrayList(int)>
	//   17   34:astore          4
		for(int l = 0; l < ((List) (arraylist)).size(); l++)
	//*  18   36:iconst_0        
	//*  19   37:istore_1        
	//*  20   38:iload_1         
	//*  21   39:aload_2         
	//*  22   40:invokeinterface #80  <Method int List.size()>
	//*  23   45:icmpge          149
		{
			u u1 = new u(((Integer)((List) (arraylist)).get(l)).intValue());
	//   24   48:new             #85  <Class u>
	//   25   51:dup             
	//   26   52:aload_2         
	//   27   53:iload_1         
	//   28   54:invokeinterface #89  <Method Object List.get(int)>
	//   29   59:checkcast       #91  <Class Integer>
	//   30   62:invokevirtual   #94  <Method int Integer.intValue()>
	//   31   65:invokespecial   #95  <Method void u(int)>
	//   32   68:astore          5
			if(((List) (arraylist1)).get(l) != null)
	//*  33   70:aload_3         
	//*  34   71:iload_1         
	//*  35   72:invokeinterface #89  <Method Object List.get(int)>
	//*  36   77:ifnull          101
				u1.a(((CharSequence)((List) (arraylist1)).get(l)).toString());
	//   37   80:aload           5
	//   38   82:aload_3         
	//   39   83:iload_1         
	//   40   84:invokeinterface #89  <Method Object List.get(int)>
	//   41   89:checkcast       #97  <Class CharSequence>
	//   42   92:invokeinterface #101 <Method String CharSequence.toString()>
	//   43   97:invokevirtual   #104 <Method u u.a(String)>
	//   44  100:pop             
			if(((List) (bundle)).get(l) != null)
	//*  45  101:aload_0         
	//*  46  102:iload_1         
	//*  47  103:invokeinterface #89  <Method Object List.get(int)>
	//*  48  108:ifnull          132
				u1.b(((CharSequence)((List) (bundle)).get(l)).toString());
	//   49  111:aload           5
	//   50  113:aload_0         
	//   51  114:iload_1         
	//   52  115:invokeinterface #89  <Method Object List.get(int)>
	//   53  120:checkcast       #97  <Class CharSequence>
	//   54  123:invokeinterface #101 <Method String CharSequence.toString()>
	//   55  128:invokevirtual   #106 <Method u u.b(String)>
	//   56  131:pop             
			((List) (arraylist2)).add(((Object) (u1)));
	//   57  132:aload           4
	//   58  134:aload           5
	//   59  136:invokeinterface #110 <Method boolean List.add(Object)>
	//   60  141:pop             
		}

	//   61  142:iload_1         
	//   62  143:iconst_1        
	//   63  144:iadd            
	//   64  145:istore_1        
	//*  65  146:goto            38
		return ((List) (arraylist2));
	//   66  149:aload           4
	//   67  151:areturn         
	}

	private void a(int l, int i1)
	{
		Iterator iterator = b.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field List b>
	//    2    4:invokeinterface #117 <Method Iterator List.iterator()>
	//    3    9:astore          5
		int j1 = 0;
	//    4   11:iconst_0        
	//    5   12:istore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   13:aload           5
	//    7   15:invokeinterface #123 <Method boolean Iterator.hasNext()>
	//    8   20:ifeq            67
			if(((u)iterator.next()).a() == l)
	//*   9   23:aload           5
	//*  10   25:invokeinterface #127 <Method Object Iterator.next()>
	//*  11   30:checkcast       #85  <Class u>
	//*  12   33:invokevirtual   #129 <Method int u.a()>
	//*  13   36:iload_1         
	//*  14   37:icmpne          13
			{
				int k1 = j1 + 1;
	//   15   40:iload_3         
	//   16   41:iconst_1        
	//   17   42:iadd            
	//   18   43:istore          4
				j1 = k1;
	//   19   45:iload           4
	//   20   47:istore_3        
				if(k1 > i1)
	//*  21   48:iload           4
	//*  22   50:iload_2         
	//*  23   51:icmple          13
				{
					iterator.remove();
	//   24   54:aload           5
	//   25   56:invokeinterface #132 <Method void Iterator.remove()>
					j1 = k1;
	//   26   61:iload           4
	//   27   63:istore_3        
				}
			}
		} while(true);
	//   28   64:goto            13
	//   29   67:return          
	}

	static void a(CatalogFragment catalogfragment, u u1)
	{
		catalogfragment.b(u1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #136 <Method void b(u)>
	//    3    5:return          
	}

	private void a(List list, Bundle bundle)
	{
		ArrayList arraylist = new ArrayList(list.size());
	//    0    0:new             #74  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokeinterface #80  <Method int List.size()>
	//    4   10:invokespecial   #83  <Method void ArrayList(int)>
	//    5   13:astore_3        
		ArrayList arraylist1 = new ArrayList(list.size());
	//    6   14:new             #74  <Class ArrayList>
	//    7   17:dup             
	//    8   18:aload_1         
	//    9   19:invokeinterface #80  <Method int List.size()>
	//   10   24:invokespecial   #83  <Method void ArrayList(int)>
	//   11   27:astore          4
		ArrayList arraylist2 = new ArrayList(list.size());
	//   12   29:new             #74  <Class ArrayList>
	//   13   32:dup             
	//   14   33:aload_1         
	//   15   34:invokeinterface #80  <Method int List.size()>
	//   16   39:invokespecial   #83  <Method void ArrayList(int)>
	//   17   42:astore          5
		u u1;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); arraylist2.add(((Object) (u1.c()))))
	//*  18   44:aload_1         
	//*  19   45:invokeinterface #117 <Method Iterator List.iterator()>
	//*  20   50:astore_1        
	//*  21   51:aload_1         
	//*  22   52:invokeinterface #123 <Method boolean Iterator.hasNext()>
	//*  23   57:ifeq            109
		{
			u1 = (u)((Iterator) (list)).next();
	//   24   60:aload_1         
	//   25   61:invokeinterface #127 <Method Object Iterator.next()>
	//   26   66:checkcast       #85  <Class u>
	//   27   69:astore          6
			arraylist.add(((Object) (Integer.valueOf(u1.a()))));
	//   28   71:aload_3         
	//   29   72:aload           6
	//   30   74:invokevirtual   #129 <Method int u.a()>
	//   31   77:invokestatic    #141 <Method Integer Integer.valueOf(int)>
	//   32   80:invokevirtual   #142 <Method boolean ArrayList.add(Object)>
	//   33   83:pop             
			arraylist1.add(((Object) (u1.b())));
	//   34   84:aload           4
	//   35   86:aload           6
	//   36   88:invokevirtual   #144 <Method String u.b()>
	//   37   91:invokevirtual   #142 <Method boolean ArrayList.add(Object)>
	//   38   94:pop             
		}

	//   39   95:aload           5
	//   40   97:aload           6
	//   41   99:invokevirtual   #146 <Method String u.c()>
	//   42  102:invokevirtual   #142 <Method boolean ArrayList.add(Object)>
	//   43  105:pop             
	//*  44  106:goto            51
		bundle.putIntegerArrayList("type", arraylist);
	//   45  109:aload_2         
	//   46  110:ldc1            #59  <String "type">
	//   47  112:aload_3         
	//   48  113:invokevirtual   #150 <Method void Bundle.putIntegerArrayList(String, ArrayList)>
		bundle.putCharSequenceArrayList("subtype", arraylist1);
	//   49  116:aload_2         
	//   50  117:ldc1            #67  <String "subtype">
	//   51  119:aload           4
	//   52  121:invokevirtual   #153 <Method void Bundle.putCharSequenceArrayList(String, ArrayList)>
		bundle.putCharSequenceArrayList("machinetype", arraylist2);
	//   53  124:aload_2         
	//   54  125:ldc1            #72  <String "machinetype">
	//   55  127:aload           5
	//   56  129:invokevirtual   #153 <Method void Bundle.putCharSequenceArrayList(String, ArrayList)>
		bundle.putSerializable("scrollPositions", ((java.io.Serializable) (g)));
	//   57  132:aload_2         
	//   58  133:ldc1            #155 <String "scrollPositions">
	//   59  135:aload_0         
	//   60  136:getfield        #37  <Field HashMap g>
	//   61  139:invokevirtual   #159 <Method void Bundle.putSerializable(String, java.io.Serializable)>
	//   62  142:return          
	}

	static Set b(CatalogFragment catalogfragment)
	{
		return catalogfragment.h;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Set h>
	//    2    4:areturn         
	}

	private void b(u u1)
	{
		(new ax(this, u1)).execute(((Object []) (new Void[0])));
	//    0    0:new             #162 <Class ax>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #164 <Method void ax(CatalogFragment, u)>
	//    5    9:iconst_0        
	//    6   10:anewarray       Void[]
	//    7   13:invokevirtual   #170 <Method android.os.AsyncTask ax.execute(Object[])>
	//    8   16:pop             
	//    9   17:return          
	}

	static az c(CatalogFragment catalogfragment)
	{
		return catalogfragment.c;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field az c>
	//    2    4:areturn         
	}

	static List d(CatalogFragment catalogfragment)
	{
		return catalogfragment.b;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field List b>
	//    2    4:areturn         
	}

	static long e(CatalogFragment catalogfragment)
	{
		return catalogfragment.j;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field long j>
	//    2    4:lreturn         
	}

	static HashMap f(CatalogFragment catalogfragment)
	{
		return catalogfragment.g;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field HashMap g>
	//    2    4:areturn         
	}

	static q g(CatalogFragment catalogfragment)
	{
		return catalogfragment.k;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field q k>
	//    2    4:areturn         
	}

	public List a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field List b>
	//    2    4:areturn         
	}

	public void a(u u1)
	{
		b.remove(((Object) (u1)));
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field List b>
	//    2    4:aload_1         
	//    3    5:invokeinterface #180 <Method boolean List.remove(Object)>
	//    4   10:pop             
		a(5, 1);
	//    5   11:aload_0         
	//    6   12:iconst_5        
	//    7   13:iconst_1        
	//    8   14:invokespecial   #182 <Method void a(int, int)>
		a(9, 1);
	//    9   17:aload_0         
	//   10   18:bipush          9
	//   11   20:iconst_1        
	//   12   21:invokespecial   #182 <Method void a(int, int)>
		a(10, 1);
	//   13   24:aload_0         
	//   14   25:bipush          10
	//   15   27:iconst_1        
	//   16   28:invokespecial   #182 <Method void a(int, int)>
		a(8, 1);
	//   17   31:aload_0         
	//   18   32:bipush          8
	//   19   34:iconst_1        
	//   20   35:invokespecial   #182 <Method void a(int, int)>
		b.add(0, ((Object) (u1)));
	//   21   38:aload_0         
	//   22   39:getfield        #113 <Field List b>
	//   23   42:iconst_0        
	//   24   43:aload_1         
	//   25   44:invokeinterface #185 <Method void List.add(int, Object)>
		c.notifyDataSetChanged();
	//   26   49:aload_0         
	//   27   50:getfield        #173 <Field az c>
	//   28   53:invokevirtual   #190 <Method void az.notifyDataSetChanged()>
		(new ga(((android.content.Context) (a)))).a(biz.bookdesign.librivox.ge.a, u1);
	//   29   56:new             #192 <Class ga>
	//   30   59:dup             
	//   31   60:aload_0         
	//   32   61:getfield        #194 <Field bi a>
	//   33   64:invokespecial   #197 <Method void ga(android.content.Context)>
	//   34   67:getstatic       #202 <Field ge biz.bookdesign.librivox.ge.a>
	//   35   70:aload_1         
	//   36   71:invokevirtual   #205 <Method void biz.bookdesign.librivox.ga.a(ge, u)>
	//   37   74:return          
	}

	public void onActivityCreated(Bundle bundle)
	{
		super.onActivityCreated(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #209 <Method void Fragment.onActivityCreated(Bundle)>
		a = (bi)getActivity();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #213 <Method android.support.v4.app.x getActivity()>
	//    6   10:checkcast       #215 <Class bi>
	//    7   13:putfield        #194 <Field bi a>
		i = biz.bookdesign.catalogbase.a.g().a(((android.support.v4.app.x) (a)));
	//    8   16:aload_0         
	//    9   17:invokestatic    #220 <Method a a.g()>
	//   10   20:aload_0         
	//   11   21:getfield        #194 <Field bi a>
	//   12   24:invokevirtual   #223 <Method r a.a(android.support.v4.app.x)>
	//   13   27:putfield        #56  <Field r i>
		i.a(((Runnable) (new av(this))));
	//   14   30:aload_0         
	//   15   31:getfield        #56  <Field r i>
	//   16   34:new             #225 <Class av>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #226 <Method void av(CatalogFragment)>
	//   20   42:invokeinterface #231 <Method void r.a(Runnable)>
		i.a(((biz.bookdesign.catalogbase.t) (new aw(this))));
	//   21   47:aload_0         
	//   22   48:getfield        #56  <Field r i>
	//   23   51:new             #233 <Class aw>
	//   24   54:dup             
	//   25   55:aload_0         
	//   26   56:invokespecial   #234 <Method void aw(CatalogFragment)>
	//   27   59:invokeinterface #237 <Method void r.a(biz.bookdesign.catalogbase.t)>
		d = new ay(this, ((at) (null)));
	//   28   64:aload_0         
	//   29   65:new             #239 <Class ay>
	//   30   68:dup             
	//   31   69:aload_0         
	//   32   70:aconst_null     
	//   33   71:invokespecial   #242 <Method void ay(CatalogFragment, at)>
	//   34   74:putfield        #244 <Field ay d>
		e = android.support.v4.a.g.a(((android.content.Context) (a)));
	//   35   77:aload_0         
	//   36   78:aload_0         
	//   37   79:getfield        #194 <Field bi a>
	//   38   82:invokestatic    #249 <Method g g.a(android.content.Context)>
	//   39   85:putfield        #251 <Field g e>
	//   40   88:return          
	}

	public boolean onContextItemSelected(MenuItem menuitem)
	{
		return i.a(menuitem);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field r i>
	//    2    4:aload_1         
	//    3    5:invokeinterface #255 <Method boolean r.a(MenuItem)>
	//    4   10:ireturn         
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          28
		{
			b = a(bundle);
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:invokestatic    #259 <Method List a(Bundle)>
	//    5    9:putfield        #113 <Field List b>
			g = (HashMap)bundle.getSerializable("scrollPositions");
	//    6   12:aload_0         
	//    7   13:aload_3         
	//    8   14:ldc1            #155 <String "scrollPositions">
	//    9   16:invokevirtual   #263 <Method java.io.Serializable Bundle.getSerializable(String)>
	//   10   19:checkcast       #34  <Class HashMap>
	//   11   22:putfield        #37  <Field HashMap g>
		} else
	//*  12   25:goto            45
		{
			b = (new ga(((android.content.Context) (biz.bookdesign.librivox.bw.g())))).a();
	//   13   28:aload_0         
	//   14   29:new             #192 <Class ga>
	//   15   32:dup             
	//   16   33:invokestatic    #266 <Method a biz.bookdesign.librivox.bw.g()>
	//   17   36:invokespecial   #197 <Method void ga(android.content.Context)>
	//   18   39:invokevirtual   #268 <Method List biz.bookdesign.librivox.ga.a()>
	//   19   42:putfield        #113 <Field List b>
		}
		viewgroup = (ViewGroup)layoutinflater.inflate(i.library, viewgroup, false);
	//   20   45:aload_1         
	//   21   46:getstatic       #274 <Field int i.library>
	//   22   49:aload_2         
	//   23   50:iconst_0        
	//   24   51:invokevirtual   #280 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   25   54:checkcast       #282 <Class ViewGroup>
	//   26   57:astore_2        
		bundle = ((Bundle) ((ListView)viewgroup.findViewById(0x102000a)));
	//   27   58:aload_2         
	//   28   59:ldc2            #283 <Int 0x102000a>
	//   29   62:invokevirtual   #287 <Method View ViewGroup.findViewById(int)>
	//   30   65:checkcast       #289 <Class ListView>
	//   31   68:astore_3        
		layoutinflater = ((LayoutInflater) (layoutinflater.inflate(i.book_list_tail, ((ViewGroup) (bundle)), false)));
	//   32   69:aload_1         
	//   33   70:getstatic       #292 <Field int i.book_list_tail>
	//   34   73:aload_3         
	//   35   74:iconst_0        
	//   36   75:invokevirtual   #280 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   37   78:astore_1        
		((View) (layoutinflater)).setOnClickListener(((android.view.View.OnClickListener) (new au(this))));
	//   38   79:aload_1         
	//   39   80:new             #294 <Class au>
	//   40   83:dup             
	//   41   84:aload_0         
	//   42   85:invokespecial   #295 <Method void au(CatalogFragment)>
	//   43   88:invokevirtual   #301 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		((ListView) (bundle)).addFooterView(((View) (layoutinflater)));
	//   44   91:aload_3         
	//   45   92:aload_1         
	//   46   93:invokevirtual   #305 <Method void ListView.addFooterView(View)>
		c = new az(this);
	//   47   96:aload_0         
	//   48   97:new             #187 <Class az>
	//   49  100:dup             
	//   50  101:aload_0         
	//   51  102:invokespecial   #306 <Method void az(CatalogFragment)>
	//   52  105:putfield        #173 <Field az c>
		((ListView) (bundle)).setAdapter(((android.widget.ListAdapter) (c)));
	//   53  108:aload_3         
	//   54  109:aload_0         
	//   55  110:getfield        #173 <Field az c>
	//   56  113:invokevirtual   #310 <Method void ListView.setAdapter(android.widget.ListAdapter)>
		return ((View) (viewgroup));
	//   57  116:aload_2         
	//   58  117:areturn         
	}

	public void onDestroy()
	{
		biz.bookdesign.librivox.ga.a(a());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #312 <Method List a()>
	//    2    4:invokestatic    #315 <Method void biz.bookdesign.librivox.ga.a(List)>
		super.onDestroy();
	//    3    7:aload_0         
	//    4    8:invokespecial   #317 <Method void Fragment.onDestroy()>
	//    5   11:return          
	}

	public void onDestroyView()
	{
		e.a(((android.content.BroadcastReceiver) (d)));
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field g e>
	//    2    4:aload_0         
	//    3    5:getfield        #244 <Field ay d>
	//    4    8:invokevirtual   #321 <Method void g.a(android.content.BroadcastReceiver)>
		super.onDestroyView();
	//    5   11:aload_0         
	//    6   12:invokespecial   #323 <Method void Fragment.onDestroyView()>
	//    7   15:return          
	}

	public void onPause()
	{
		f = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #32  <Field boolean f>
		e.a(((android.content.BroadcastReceiver) (d)));
	//    3    5:aload_0         
	//    4    6:getfield        #251 <Field g e>
	//    5    9:aload_0         
	//    6   10:getfield        #244 <Field ay d>
	//    7   13:invokevirtual   #321 <Method void g.a(android.content.BroadcastReceiver)>
		super.onPause();
	//    8   16:aload_0         
	//    9   17:invokespecial   #326 <Method void Fragment.onPause()>
	//   10   20:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #329 <Method void Fragment.onResume()>
		if(f)
	//*   2    4:aload_0         
	//*   3    5:getfield        #32  <Field boolean f>
	//*   4    8:ifeq            24
		{
			az az1 = c;
	//    5   11:aload_0         
	//    6   12:getfield        #173 <Field az c>
	//    7   15:astore_1        
			if(az1 != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          24
				az1.notifyDataSetChanged();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #190 <Method void az.notifyDataSetChanged()>
		}
		IntentFilter intentfilter = new IntentFilter();
	//   12   24:new             #331 <Class IntentFilter>
	//   13   27:dup             
	//   14   28:invokespecial   #332 <Method void IntentFilter()>
	//   15   31:astore_1        
		intentfilter.addAction("biz.bookdesign.librivox.STAR_NOTIFICATION");
	//   16   32:aload_1         
	//   17   33:ldc2            #334 <String "biz.bookdesign.librivox.STAR_NOTIFICATION">
	//   18   36:invokevirtual   #338 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.REFRESH_NOTIFICATION");
	//   19   39:aload_1         
	//   20   40:ldc2            #340 <String "biz.bookdesign.librivox.REFRESH_NOTIFICATION">
	//   21   43:invokevirtual   #338 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.dl.DOWNLOAD_NOTIFICATION");
	//   22   46:aload_1         
	//   23   47:ldc2            #342 <String "biz.bookdesign.librivox.dl.DOWNLOAD_NOTIFICATION">
	//   24   50:invokevirtual   #338 <Method void IntentFilter.addAction(String)>
		e.a(((android.content.BroadcastReceiver) (d)), intentfilter);
	//   25   53:aload_0         
	//   26   54:getfield        #251 <Field g e>
	//   27   57:aload_0         
	//   28   58:getfield        #244 <Field ay d>
	//   29   61:aload_1         
	//   30   62:invokevirtual   #345 <Method void g.a(android.content.BroadcastReceiver, IntentFilter)>
	//   31   65:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		a(b, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #113 <Field List b>
	//    3    5:aload_1         
	//    4    6:invokespecial   #348 <Method void a(List, Bundle)>
		super.onSaveInstanceState(bundle);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #350 <Method void Fragment.onSaveInstanceState(Bundle)>
	//    8   14:return          
	}

	bi a;
	private List b;
	private az c;
	private ay d;
	private g e;
	private boolean f;
	private HashMap g;
	private Set h;
	private r i;
	private long j;
	private q k;
}

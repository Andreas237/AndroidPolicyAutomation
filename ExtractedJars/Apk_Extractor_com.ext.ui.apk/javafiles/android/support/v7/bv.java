// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.content.Context;
import android.view.*;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.*;

// Referenced classes of package android.support.v7:
//			cg, ck, ci

public class bv extends android.support.v7.widget.RecyclerView.Adapter
{
	class a extends android.support.v7.widget.RecyclerView.ViewHolder
	{

		ImageView a;
		TextView b;
		TextView c;
		ImageView d;
		ImageView e;
		final bv f;

		public a(View view)
		{
			f = bv.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field bv f>
			super(view);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #24  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
			a = (ImageView)view.findViewById(0x7f090061);
		//    6   10:aload_0         
		//    7   11:aload_2         
		//    8   12:ldc1            #25  <Int 0x7f090061>
		//    9   14:invokevirtual   #31  <Method View View.findViewById(int)>
		//   10   17:checkcast       #33  <Class ImageView>
		//   11   20:putfield        #35  <Field ImageView a>
			b = (TextView)view.findViewById(0x7f0900c6);
		//   12   23:aload_0         
		//   13   24:aload_2         
		//   14   25:ldc1            #36  <Int 0x7f0900c6>
		//   15   27:invokevirtual   #31  <Method View View.findViewById(int)>
		//   16   30:checkcast       #38  <Class TextView>
		//   17   33:putfield        #40  <Field TextView b>
			c = (TextView)view.findViewById(0x7f0900b9);
		//   18   36:aload_0         
		//   19   37:aload_2         
		//   20   38:ldc1            #41  <Int 0x7f0900b9>
		//   21   40:invokevirtual   #31  <Method View View.findViewById(int)>
		//   22   43:checkcast       #38  <Class TextView>
		//   23   46:putfield        #43  <Field TextView c>
			d = (ImageView)view.findViewById(0x7f090036);
		//   24   49:aload_0         
		//   25   50:aload_2         
		//   26   51:ldc1            #44  <Int 0x7f090036>
		//   27   53:invokevirtual   #31  <Method View View.findViewById(int)>
		//   28   56:checkcast       #33  <Class ImageView>
		//   29   59:putfield        #46  <Field ImageView d>
			e = (ImageView)view.findViewById(0x7f090084);
		//   30   62:aload_0         
		//   31   63:aload_2         
		//   32   64:ldc1            #47  <Int 0x7f090084>
		//   33   66:invokevirtual   #31  <Method View View.findViewById(int)>
		//   34   69:checkcast       #33  <Class ImageView>
		//   35   72:putfield        #49  <Field ImageView e>
			view.setOnLongClickListener(new _cls1(this, bv.this));
		//   36   75:aload_2         
		//   37   76:new             #9   <Class bv$a$1>
		//   38   79:dup             
		//   39   80:aload_0         
		//   40   81:aload_1         
		//   41   82:invokespecial   #52  <Method void bv$a$1(bv$a, bv)>
		//   42   85:invokevirtual   #56  <Method void View.setOnLongClickListener(android.view.View$OnLongClickListener)>
		//   43   88:return          
		}
	}

	public static interface b
	{

		public abstract void a(View view, int i);

		public abstract void b(View view, int i);

		public abstract void onAdapterViewClick(View view);
	}


	public bv(Context context, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void android.support.v7.widget.RecyclerView$Adapter()>
		a = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #38  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void ArrayList()>
	//    6   12:putfield        #41  <Field List a>
		b = new HashSet();
	//    7   15:aload_0         
	//    8   16:new             #43  <Class HashSet>
	//    9   19:dup             
	//   10   20:invokespecial   #44  <Method void HashSet()>
	//   11   23:putfield        #46  <Field HashSet b>
		g = 1;
	//   12   26:aload_0         
	//   13   27:iconst_1        
	//   14   28:putfield        #48  <Field int g>
		e = context;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:putfield        #50  <Field Context e>
		f = (b)context;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:checkcast       #16  <Class bv$b>
	//   21   41:putfield        #52  <Field bv$b f>
		a.addAll(((java.util.Collection) (list)));
	//   22   44:aload_0         
	//   23   45:getfield        #41  <Field List a>
	//   24   48:aload_2         
	//   25   49:invokeinterface #58  <Method boolean List.addAll(java.util.Collection)>
	//   26   54:pop             
		d = new cg();
	//   27   55:aload_0         
	//   28   56:new             #60  <Class cg>
	//   29   59:dup             
	//   30   60:invokespecial   #61  <Method void cg()>
	//   31   63:putfield        #63  <Field cg d>
	//   32   66:return          
	}

	static b a(bv bv1)
	{
		return bv1.f;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field bv$b f>
	//    2    4:areturn         
	}

	public a a(ViewGroup viewgroup, int i)
	{
		viewgroup = ((ViewGroup) (((LayoutInflater)e.getSystemService("layout_inflater")).inflate(0x7f0b002e, viewgroup, false)));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Context e>
	//    2    4:ldc1            #70  <String "layout_inflater">
	//    3    6:invokevirtual   #76  <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #78  <Class LayoutInflater>
	//    5   12:ldc1            #79  <Int 0x7f0b002e>
	//    6   14:aload_1         
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #83  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    9   19:astore_1        
		((View) (viewgroup)).setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				bv.a(a).onAdapterViewClick(view);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field bv a>
			//    2    4:invokestatic    #25  <Method bv$b bv.a(bv)>
			//    3    7:aload_1         
			//    4    8:invokeinterface #30  <Method void bv$b.onAdapterViewClick(View)>
			//    5   13:return          
			}

			final bv a;

			
			{
				a = bv.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bv a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   10   20:aload_1         
	//   11   21:new             #7   <Class bv$1>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokespecial   #86  <Method void bv$1(bv)>
	//   15   29:invokevirtual   #92  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		return new a(((View) (viewgroup)));
	//   16   32:new             #11  <Class bv$a>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokespecial   #95  <Method void bv$a(bv, View)>
	//   21   41:areturn         
	}

	public ck a(int i)
	{
		if(a != null && i < a.size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field List a>
	//*   2    4:ifnull          34
	//*   3    7:iload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #41  <Field List a>
	//*   6   12:invokeinterface #100 <Method int List.size()>
	//*   7   17:icmpge          34
			return (ck)a.get(i);
	//    8   20:aload_0         
	//    9   21:getfield        #41  <Field List a>
	//   10   24:iload_1         
	//   11   25:invokeinterface #104 <Method Object List.get(int)>
	//   12   30:checkcast       #106 <Class ck>
	//   13   33:areturn         
		else
			return null;
	//   14   34:aconst_null     
	//   15   35:areturn         
	}

	public List a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List a>
	//    2    4:areturn         
	}

	public void a(a a1, int i)
	{
		String s;
		String s1;
label0:
		{
			ck ck1 = a(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #111 <Method ck a(int)>
	//    3    5:astore_3        
			if(ck1 != null)
	//*   4    6:aload_3         
	//*   5    7:ifnull          86
			{
				s = ck1.d();
	//    6   10:aload_3         
	//    7   11:invokevirtual   #114 <Method String ck.d()>
	//    8   14:astore          4
				s1 = ck1.e();
	//    9   16:aload_3         
	//   10   17:invokevirtual   #116 <Method String ck.e()>
	//   11   20:astore          5
				if(!ck1.b())
					break label0;
	//   12   22:aload_3         
	//   13   23:invokevirtual   #119 <Method boolean ck.b()>
	//   14   26:ifeq            87
				a1.b.setText(((CharSequence) (s)));
	//   15   29:aload_1         
	//   16   30:getfield        #122 <Field TextView bv$a.b>
	//   17   33:aload           4
	//   18   35:invokevirtual   #128 <Method void TextView.setText(CharSequence)>
				a1.c.setText(((CharSequence) (ck1.a())));
	//   19   38:aload_1         
	//   20   39:getfield        #130 <Field TextView bv$a.c>
	//   21   42:aload_3         
	//   22   43:invokevirtual   #132 <Method String ck.a()>
	//   23   46:invokevirtual   #128 <Method void TextView.setText(CharSequence)>
				a1.a.setImageBitmap(ck1.c());
	//   24   49:aload_1         
	//   25   50:getfield        #135 <Field ImageView bv$a.a>
	//   26   53:aload_3         
	//   27   54:invokevirtual   #138 <Method android.graphics.Bitmap ck.c()>
	//   28   57:invokevirtual   #144 <Method void ImageView.setImageBitmap(android.graphics.Bitmap)>
				a1.e.setVisibility(0);
	//   29   60:aload_1         
	//   30   61:getfield        #146 <Field ImageView bv$a.e>
	//   31   64:iconst_0        
	//   32   65:invokevirtual   #150 <Method void ImageView.setVisibility(int)>
				a1.e.setImageResource(0x7f080065);
	//   33   68:aload_1         
	//   34   69:getfield        #146 <Field ImageView bv$a.e>
	//   35   72:ldc1            #151 <Int 0x7f080065>
	//   36   74:invokevirtual   #154 <Method void ImageView.setImageResource(int)>
				a1.d.setVisibility(8);
	//   37   77:aload_1         
	//   38   78:getfield        #156 <Field ImageView bv$a.d>
	//   39   81:bipush          8
	//   40   83:invokevirtual   #150 <Method void ImageView.setVisibility(int)>
			}
			return;
	//   41   86:return          
		}
		a1.e.setImageResource(0x7f08006d);
	//   42   87:aload_1         
	//   43   88:getfield        #146 <Field ImageView bv$a.e>
	//   44   91:ldc1            #157 <Int 0x7f08006d>
	//   45   93:invokevirtual   #154 <Method void ImageView.setImageResource(int)>
		a1.b.setText(((CharSequence) (s)));
	//   46   96:aload_1         
	//   47   97:getfield        #122 <Field TextView bv$a.b>
	//   48  100:aload           4
	//   49  102:invokevirtual   #128 <Method void TextView.setText(CharSequence)>
		a1.c.setText(((CharSequence) (s1)));
	//   50  105:aload_1         
	//   51  106:getfield        #130 <Field TextView bv$a.c>
	//   52  109:aload           5
	//   53  111:invokevirtual   #128 <Method void TextView.setText(CharSequence)>
		d.a(s1, a1.a, this);
	//   54  114:aload_0         
	//   55  115:getfield        #63  <Field cg d>
	//   56  118:aload           5
	//   57  120:aload_1         
	//   58  121:getfield        #135 <Field ImageView bv$a.a>
	//   59  124:aload_0         
	//   60  125:invokevirtual   #160 <Method void cg.a(String, ImageView, bv)>
		if(c)
	//*  61  128:aload_0         
	//*  62  129:getfield        #162 <Field boolean c>
	//*  63  132:ifeq            191
		{
			a1.d.setVisibility(0);
	//   64  135:aload_1         
	//   65  136:getfield        #156 <Field ImageView bv$a.d>
	//   66  139:iconst_0        
	//   67  140:invokevirtual   #150 <Method void ImageView.setVisibility(int)>
			a1.e.setVisibility(4);
	//   68  143:aload_1         
	//   69  144:getfield        #146 <Field ImageView bv$a.e>
	//   70  147:iconst_4        
	//   71  148:invokevirtual   #150 <Method void ImageView.setVisibility(int)>
		} else
	//*  72  151:aload_0         
	//*  73  152:getfield        #46  <Field HashSet b>
	//*  74  155:iload_2         
	//*  75  156:invokestatic    #168 <Method Integer Integer.valueOf(int)>
	//*  76  159:invokevirtual   #172 <Method boolean HashSet.contains(Object)>
	//*  77  162:ifeq            210
	//*  78  165:aload_1         
	//*  79  166:getfield        #156 <Field ImageView bv$a.d>
	//*  80  169:ldc1            #173 <Int 0x1080010>
	//*  81  171:invokevirtual   #154 <Method void ImageView.setImageResource(int)>
	//*  82  174:aload_1         
	//*  83  175:getfield        #146 <Field ImageView bv$a.e>
	//*  84  178:new             #9   <Class bv$2>
	//*  85  181:dup             
	//*  86  182:aload_0         
	//*  87  183:iload_2         
	//*  88  184:invokespecial   #176 <Method void bv$2(bv, int)>
	//*  89  187:invokevirtual   #177 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
	//*  90  190:return          
		{
			a1.d.setVisibility(4);
	//   91  191:aload_1         
	//   92  192:getfield        #156 <Field ImageView bv$a.d>
	//   93  195:iconst_4        
	//   94  196:invokevirtual   #150 <Method void ImageView.setVisibility(int)>
			a1.e.setVisibility(0);
	//   95  199:aload_1         
	//   96  200:getfield        #146 <Field ImageView bv$a.e>
	//   97  203:iconst_0        
	//   98  204:invokevirtual   #150 <Method void ImageView.setVisibility(int)>
		}
		if(b.contains(((Object) (Integer.valueOf(i)))))
			a1.d.setImageResource(0x1080010);
		else
	//*  99  207:goto            151
			a1.d.setImageResource(0x108000f);
	//  100  210:aload_1         
	//  101  211:getfield        #156 <Field ImageView bv$a.d>
	//  102  214:ldc1            #178 <Int 0x108000f>
	//  103  216:invokevirtual   #154 <Method void ImageView.setImageResource(int)>
		a1.e.setOnClickListener(new android.view.View.OnClickListener(i) {

			public void onClick(View view)
			{
				bv.a(b).a(view, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field bv b>
			//    2    4:invokestatic    #29  <Method bv$b bv.a(bv)>
			//    3    7:aload_1         
			//    4    8:aload_0         
			//    5    9:getfield        #20  <Field int a>
			//    6   12:invokeinterface #34  <Method void bv$b.a(View, int)>
			//    7   17:return          
			}

			final int a;
			final bv b;

			
			{
				b = bv.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field bv b>
				a = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #20  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//* 104  219:goto            174
	}

	public void a(List list)
	{
		a.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List a>
	//    2    4:invokeinterface #182 <Method void List.clear()>
		if(list != null)
	//*   3    9:aload_1         
	//*   4   10:ifnull          24
			a.addAll(((java.util.Collection) (list)));
	//    5   13:aload_0         
	//    6   14:getfield        #41  <Field List a>
	//    7   17:aload_1         
	//    8   18:invokeinterface #58  <Method boolean List.addAll(java.util.Collection)>
	//    9   23:pop             
	//   10   24:return          
	}

	public void a(boolean flag)
	{
		c = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #162 <Field boolean c>
	//    3    5:return          
	}

	public boolean a(Integer integer)
	{
		if(b.contains(((Object) (integer))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field HashSet b>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #172 <Method boolean HashSet.contains(Object)>
	//*   4    8:ifeq            50
		{
			b.remove(((Object) (integer)));
	//    5   11:aload_0         
	//    6   12:getfield        #46  <Field HashSet b>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #188 <Method boolean HashSet.remove(Object)>
	//    9   19:pop             
			ci.a("MainAdapter", (new StringBuilder()).append("item unSelected :").append(((Object) (integer))).toString());
	//   10   20:ldc1            #190 <String "MainAdapter">
	//   11   22:new             #192 <Class StringBuilder>
	//   12   25:dup             
	//   13   26:invokespecial   #193 <Method void StringBuilder()>
	//   14   29:ldc1            #195 <String "item unSelected :">
	//   15   31:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #202 <Method StringBuilder StringBuilder.append(Object)>
	//   18   38:invokevirtual   #205 <Method String StringBuilder.toString()>
	//   19   41:invokestatic    #210 <Method void ci.a(String, String)>
			notifyDataSetChanged();
	//   20   44:aload_0         
	//   21   45:invokevirtual   #213 <Method void notifyDataSetChanged()>
			return false;
	//   22   48:iconst_0        
	//   23   49:ireturn         
		} else
		{
			b.add(((Object) (integer)));
	//   24   50:aload_0         
	//   25   51:getfield        #46  <Field HashSet b>
	//   26   54:aload_1         
	//   27   55:invokevirtual   #216 <Method boolean HashSet.add(Object)>
	//   28   58:pop             
			ci.a("MainAdapter", (new StringBuilder()).append("item Selected :").append(((Object) (integer))).toString());
	//   29   59:ldc1            #190 <String "MainAdapter">
	//   30   61:new             #192 <Class StringBuilder>
	//   31   64:dup             
	//   32   65:invokespecial   #193 <Method void StringBuilder()>
	//   33   68:ldc1            #218 <String "item Selected :">
	//   34   70:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   35   73:aload_1         
	//   36   74:invokevirtual   #202 <Method StringBuilder StringBuilder.append(Object)>
	//   37   77:invokevirtual   #205 <Method String StringBuilder.toString()>
	//   38   80:invokestatic    #210 <Method void ci.a(String, String)>
			notifyDataSetChanged();
	//   39   83:aload_0         
	//   40   84:invokevirtual   #213 <Method void notifyDataSetChanged()>
			return true;
	//   41   87:iconst_1        
	//   42   88:ireturn         
		}
	}

	public void b()
	{
		b.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field HashSet b>
	//    2    4:invokevirtual   #219 <Method void HashSet.clear()>
		notifyDataSetChanged();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #213 <Method void notifyDataSetChanged()>
	//    5   11:return          
	}

	public void b(int i)
	{
		g = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #48  <Field int g>
	//    3    5:return          
	}

	public void c()
	{
		b.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field HashSet b>
	//    2    4:invokevirtual   #219 <Method void HashSet.clear()>
		for(int i = 0; i < getItemCount(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #222 <Method int getItemCount()>
	//*   8   14:icmpge          36
			b.add(((Object) (Integer.valueOf(i))));
	//    9   17:aload_0         
	//   10   18:getfield        #46  <Field HashSet b>
	//   11   21:iload_1         
	//   12   22:invokestatic    #168 <Method Integer Integer.valueOf(int)>
	//   13   25:invokevirtual   #216 <Method boolean HashSet.add(Object)>
	//   14   28:pop             

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_1        
	//*  19   33:goto            9
		notifyDataSetChanged();
	//   20   36:aload_0         
	//   21   37:invokevirtual   #213 <Method void notifyDataSetChanged()>
	//   22   40:return          
	}

	public HashSet d()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field HashSet b>
	//    2    4:areturn         
	}

	public void e()
	{
		d.a();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field cg d>
	//    2    4:invokevirtual   #226 <Method void cg.a()>
	//    3    7:return          
	}

	public int f()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int g>
	//    2    4:ireturn         
	}

	public int getItemCount()
	{
		int i;
label0:
		{
			i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
			if(a != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #41  <Field List a>
	//*   4    6:ifnull          78
			{
				int j = a.size();
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field List a>
	//    7   13:invokeinterface #100 <Method int List.size()>
	//    8   18:istore_2        
				i = j;
	//    9   19:iload_2         
	//   10   20:istore_1        
				if(j > 0)
	//*  11   21:iload_2         
	//*  12   22:ifle            50
				{
					i = j;
	//   13   25:iload_2         
	//   14   26:istore_1        
					if(((ck)a.get(0)).b())
	//*  15   27:aload_0         
	//*  16   28:getfield        #41  <Field List a>
	//*  17   31:iconst_0        
	//*  18   32:invokeinterface #104 <Method Object List.get(int)>
	//*  19   37:checkcast       #106 <Class ck>
	//*  20   40:invokevirtual   #119 <Method boolean ck.b()>
	//*  21   43:ifeq            50
						i = j - 1;
	//   22   46:iload_2         
	//   23   47:iconst_1        
	//   24   48:isub            
	//   25   49:istore_1        
				}
				if(i <= 1 || !((ck)a.get(1)).b())
					break label0;
	//   26   50:iload_1         
	//   27   51:iconst_1        
	//   28   52:icmple          80
	//   29   55:aload_0         
	//   30   56:getfield        #41  <Field List a>
	//   31   59:iconst_1        
	//   32   60:invokeinterface #104 <Method Object List.get(int)>
	//   33   65:checkcast       #106 <Class ck>
	//   34   68:invokevirtual   #119 <Method boolean ck.b()>
	//   35   71:ifeq            80
				i--;
	//   36   74:iload_1         
	//   37   75:iconst_1        
	//   38   76:isub            
	//   39   77:istore_1        
			}
			return i;
	//   40   78:iload_1         
	//   41   79:ireturn         
		}
		return i;
	//   42   80:iload_1         
	//   43   81:ireturn         
	}

	public long getItemId(int i)
	{
		return 0L;
	//    0    0:lconst_0        
	//    1    1:lreturn         
	}

	public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		a((a)viewholder, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #11  <Class bv$a>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #232 <Method void a(bv$a, int)>
	//    5    9:return          
	}

	public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		return ((android.support.v7.widget.RecyclerView.ViewHolder) (a(viewgroup, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #236 <Method bv$a a(ViewGroup, int)>
	//    4    6:areturn         
	}

	private List a;
	private HashSet b;
	private boolean c;
	private cg d;
	private Context e;
	private b f;
	private int g;

	// Unreferenced inner class android/support/v7/bv$a$1

/* anonymous class */
	class a._cls1
		implements android.view.View.OnLongClickListener
	{

		public boolean onLongClick(View view)
		{
			bv.a(b.f).b(view, b.getAdapterPosition());
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field bv$a b>
		//    2    4:getfield        #31  <Field bv bv$a.f>
		//    3    7:invokestatic    #34  <Method bv$b bv.a(bv)>
		//    4   10:aload_1         
		//    5   11:aload_0         
		//    6   12:getfield        #20  <Field bv$a b>
		//    7   15:invokevirtual   #38  <Method int bv$a.getAdapterPosition()>
		//    8   18:invokeinterface #43  <Method void bv$b.b(View, int)>
			return true;
		//    9   23:iconst_1        
		//   10   24:ireturn         
		}

		final bv a;
		final a b;

			
			{
				b = a1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field bv$a b>
				a = bv1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field bv a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
	}

}

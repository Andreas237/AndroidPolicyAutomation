// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.*;
import android.widget.*;

// Referenced classes of package android.support.v7.app:
//			AlertController, i

public static class AlertController$a
{
	public static interface a
	{

		public abstract void a(ListView listview);
	}


	private void b(AlertController alertcontroller)
	{
		cycleListView cyclelistview;
		cyclelistview = (cycleListView)b.inflate(alertcontroller.l, ((ViewGroup) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field LayoutInflater b>
	//    2    4:aload_1         
	//    3    5:getfield        #108 <Field int AlertController.l>
	//    4    8:aconst_null     
	//    5    9:invokevirtual   #112 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//    6   12:checkcast       #114 <Class AlertController$RecycleListView>
	//    7   15:astore          4
		Object obj;
		if(D)
	//*   8   17:aload_0         
	//*   9   18:getfield        #116 <Field boolean D>
	//*  10   21:ifeq            83
		{
			if(H == null)
	//*  11   24:aload_0         
	//*  12   25:getfield        #118 <Field Cursor H>
	//*  13   28:ifnonnull       59
				obj = ((Object) (new ArrayAdapter(a, alertcontroller.m, 0x1020014, s, cyclelistview) {

					public View getView(int j1, View view, ViewGroup viewgroup)
					{
						view = super.getView(j1, view, viewgroup);
					//    0    0:aload_0         
					//    1    1:iload_1         
					//    2    2:aload_2         
					//    3    3:aload_3         
					//    4    4:invokespecial   #29  <Method View ArrayAdapter.getView(int, View, ViewGroup)>
					//    5    7:astore_2        
						if(b.C != null && b.C[j1])
					//*   6    8:aload_0         
					//*   7    9:getfield        #19  <Field AlertController$a b>
					//*   8   12:getfield        #33  <Field boolean[] AlertController$a.C>
					//*   9   15:ifnull          39
					//*  10   18:aload_0         
					//*  11   19:getfield        #19  <Field AlertController$a b>
					//*  12   22:getfield        #33  <Field boolean[] AlertController$a.C>
					//*  13   25:iload_1         
					//*  14   26:baload          
					//*  15   27:ifeq            39
							a.setItemChecked(j1, true);
					//   16   30:aload_0         
					//   17   31:getfield        #21  <Field AlertController$RecycleListView a>
					//   18   34:iload_1         
					//   19   35:iconst_1        
					//   20   36:invokevirtual   #39  <Method void AlertController$RecycleListView.setItemChecked(int, boolean)>
						return view;
					//   21   39:aload_2         
					//   22   40:areturn         
					}

					final AlertController.RecycleListView a;
					final AlertController.a b;

			
			{
				b = AlertController.a.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AlertController$a b>
				a = recyclelistview;
			//    3    5:aload_0         
			//    4    6:aload           6
			//    5    8:putfield        #21  <Field AlertController$RecycleListView a>
				super(context, i1, j1, ((Object []) (acharsequence)));
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:iload_3         
			//    9   14:iload           4
			//   10   16:aload           5
			//   11   18:invokespecial   #24  <Method void ArrayAdapter(Context, int, int, Object[])>
			//   12   21:return          
			}
				}
));
	//   14   31:new             #9   <Class AlertController$a$1>
	//   15   34:dup             
	//   16   35:aload_0         
	//   17   36:aload_0         
	//   18   37:getfield        #90  <Field Context a>
	//   19   40:aload_1         
	//   20   41:getfield        #120 <Field int AlertController.m>
	//   21   44:ldc1            #121 <Int 0x1020014>
	//   22   46:aload_0         
	//   23   47:getfield        #123 <Field CharSequence[] s>
	//   24   50:aload           4
	//   25   52:invokespecial   #126 <Method void AlertController$a$1(AlertController$a, Context, int, int, CharSequence[], AlertController$RecycleListView)>
	//   26   55:astore_3        
			else
	//*  27   56:goto            186
				obj = ((Object) (new CursorAdapter(a, H, false, cyclelistview, alertcontroller) {

					public void bindView(View view, Context context, Cursor cursor)
					{
						((CheckedTextView)view.findViewById(0x1020014)).setText(((CharSequence) (cursor.getString(d))));
					//    0    0:aload_1         
					//    1    1:ldc1            #54  <Int 0x1020014>
					//    2    3:invokevirtual   #60  <Method View View.findViewById(int)>
					//    3    6:checkcast       #62  <Class CheckedTextView>
					//    4    9:aload_3         
					//    5   10:aload_0         
					//    6   11:getfield        #45  <Field int d>
					//    7   14:invokeinterface #66  <Method String Cursor.getString(int)>
					//    8   19:invokevirtual   #70  <Method void CheckedTextView.setText(CharSequence)>
						view = ((View) (a));
					//    9   22:aload_0         
					//   10   23:getfield        #25  <Field AlertController$RecycleListView a>
					//   11   26:astore_1        
						int j1 = cursor.getPosition();
					//   12   27:aload_3         
					//   13   28:invokeinterface #74  <Method int Cursor.getPosition()>
					//   14   33:istore          4
						int k1 = cursor.getInt(e);
					//   15   35:aload_3         
					//   16   36:aload_0         
					//   17   37:getfield        #50  <Field int e>
					//   18   40:invokeinterface #78  <Method int Cursor.getInt(int)>
					//   19   45:istore          5
						boolean flag = true;
					//   20   47:iconst_1        
					//   21   48:istore          6
						if(k1 != 1)
					//*  22   50:iload           5
					//*  23   52:iconst_1        
					//*  24   53:icmpne          59
					//*  25   56:goto            62
							flag = false;
					//   26   59:iconst_0        
					//   27   60:istore          6
						((AlertController.RecycleListView) (view)).setItemChecked(j1, flag);
					//   28   62:aload_1         
					//   29   63:iload           4
					//   30   65:iload           6
					//   31   67:invokevirtual   #84  <Method void AlertController$RecycleListView.setItemChecked(int, boolean)>
					//   32   70:return          
					}

					public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
					{
						return c.b.inflate(b.m, viewgroup, false);
					//    0    0:aload_0         
					//    1    1:getfield        #23  <Field AlertController$a c>
					//    2    4:getfield        #89  <Field LayoutInflater AlertController$a.b>
					//    3    7:aload_0         
					//    4    8:getfield        #27  <Field AlertController b>
					//    5   11:getfield        #92  <Field int AlertController.m>
					//    6   14:aload_3         
					//    7   15:iconst_0        
					//    8   16:invokevirtual   #98  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
					//    9   19:areturn         
					}

					final AlertController.RecycleListView a;
					final AlertController b;
					final AlertController.a c;
					private final int d;
					private final int e;

			
			{
				c = AlertController.a.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field AlertController$a c>
				a = recyclelistview;
			//    3    5:aload_0         
			//    4    6:aload           5
			//    5    8:putfield        #25  <Field AlertController$RecycleListView a>
				b = alertcontroller;
			//    6   11:aload_0         
			//    7   12:aload           6
			//    8   14:putfield        #27  <Field AlertController b>
				super(context, cursor, flag);
			//    9   17:aload_0         
			//   10   18:aload_2         
			//   11   19:aload_3         
			//   12   20:iload           4
			//   13   22:invokespecial   #30  <Method void CursorAdapter(Context, Cursor, boolean)>
				a1 = ((AlertController.a) (getCursor()));
			//   14   25:aload_0         
			//   15   26:invokevirtual   #34  <Method Cursor getCursor()>
			//   16   29:astore_1        
				d = getColumnIndexOrThrow(c.I);
			//   17   30:aload_0         
			//   18   31:aload_1         
			//   19   32:aload_0         
			//   20   33:getfield        #23  <Field AlertController$a c>
			//   21   36:getfield        #37  <Field String AlertController$a.I>
			//   22   39:invokeinterface #43  <Method int Cursor.getColumnIndexOrThrow(String)>
			//   23   44:putfield        #45  <Field int d>
				e = getColumnIndexOrThrow(c.J);
			//   24   47:aload_0         
			//   25   48:aload_1         
			//   26   49:aload_0         
			//   27   50:getfield        #23  <Field AlertController$a c>
			//   28   53:getfield        #48  <Field String AlertController$a.J>
			//   29   56:invokeinterface #43  <Method int Cursor.getColumnIndexOrThrow(String)>
			//   30   61:putfield        #50  <Field int e>
			//   31   64:return          
			}
				}
));
	//   28   59:new             #11  <Class AlertController$a$2>
	//   29   62:dup             
	//   30   63:aload_0         
	//   31   64:aload_0         
	//   32   65:getfield        #90  <Field Context a>
	//   33   68:aload_0         
	//   34   69:getfield        #118 <Field Cursor H>
	//   35   72:iconst_0        
	//   36   73:aload           4
	//   37   75:aload_1         
	//   38   76:invokespecial   #129 <Method void AlertController$a$2(AlertController$a, Context, Cursor, boolean, AlertController$RecycleListView, AlertController)>
	//   39   79:astore_3        
		} else
	//*  40   80:goto            186
		{
			int i1;
			if(E)
	//*  41   83:aload_0         
	//*  42   84:getfield        #131 <Field boolean E>
	//*  43   87:ifeq            98
				i1 = alertcontroller.n;
	//   44   90:aload_1         
	//   45   91:getfield        #133 <Field int AlertController.n>
	//   46   94:istore_2        
			else
	//*  47   95:goto            106
				i1 = alertcontroller.o;
	//   48   98:aload_1         
	//   49   99:getfield        #135 <Field int AlertController.o>
	//   50  102:istore_2        
	//*  51  103:goto            95
			if(H != null)
	//*  52  106:aload_0         
	//*  53  107:getfield        #118 <Field Cursor H>
	//*  54  110:ifnull          152
				obj = ((Object) (new SimpleCursorAdapter(a, i1, H, new String[] {
					I
				}, new int[] {
					0x1020014
				})));
	//   55  113:new             #137 <Class SimpleCursorAdapter>
	//   56  116:dup             
	//   57  117:aload_0         
	//   58  118:getfield        #90  <Field Context a>
	//   59  121:iload_2         
	//   60  122:aload_0         
	//   61  123:getfield        #118 <Field Cursor H>
	//   62  126:iconst_1        
	//   63  127:anewarray       String[]
	//   64  130:dup             
	//   65  131:iconst_0        
	//   66  132:aload_0         
	//   67  133:getfield        #141 <Field String I>
	//   68  136:aastore         
	//   69  137:iconst_1        
	//   70  138:newarray        int[]
	//   71  140:dup             
	//   72  141:iconst_0        
	//   73  142:ldc1            #121 <Int 0x1020014>
	//   74  144:iastore         
	//   75  145:invokespecial   #144 <Method void SimpleCursorAdapter(Context, int, Cursor, String[], int[])>
	//   76  148:astore_3        
			else
	//*  77  149:goto            186
			if(t != null)
	//*  78  152:aload_0         
	//*  79  153:getfield        #146 <Field ListAdapter t>
	//*  80  156:ifnull          167
				obj = ((Object) (t));
	//   81  159:aload_0         
	//   82  160:getfield        #146 <Field ListAdapter t>
	//   83  163:astore_3        
			else
	//*  84  164:goto            186
				obj = ((Object) (new AlertController$c(a, i1, 0x1020014, s)));
	//   85  167:new             #148 <Class AlertController$c>
	//   86  170:dup             
	//   87  171:aload_0         
	//   88  172:getfield        #90  <Field Context a>
	//   89  175:iload_2         
	//   90  176:ldc1            #121 <Int 0x1020014>
	//   91  178:aload_0         
	//   92  179:getfield        #123 <Field CharSequence[] s>
	//   93  182:invokespecial   #151 <Method void AlertController$c(Context, int, int, CharSequence[])>
	//   94  185:astore_3        
		}
		if(L != null)
	//*  95  186:aload_0         
	//*  96  187:getfield        #153 <Field AlertController$a$a L>
	//*  97  190:ifnull          204
			L.a(((ListView) (cyclelistview)));
	//   98  193:aload_0         
	//   99  194:getfield        #153 <Field AlertController$a$a L>
	//  100  197:aload           4
	//  101  199:invokeinterface #156 <Method void AlertController$a$a.a(ListView)>
		alertcontroller.j = ((ListAdapter) (obj));
	//  102  204:aload_1         
	//  103  205:aload_3         
	//  104  206:putfield        #158 <Field ListAdapter AlertController.j>
		alertcontroller.k = F;
	//  105  209:aload_1         
	//  106  210:aload_0         
	//  107  211:getfield        #86  <Field int F>
	//  108  214:putfield        #160 <Field int AlertController.k>
		if(u == null) goto _L2; else goto _L1
	//  109  217:aload_0         
	//  110  218:getfield        #162 <Field android.content.DialogInterface$OnClickListener u>
	//  111  221:ifnull          243
_L1:
		android.widget.ClickListener clicklistener = new android.widget.AdapterView.OnItemClickListener(alertcontroller) {

			public void onItemClick(AdapterView adapterview, View view, int j1, long l1)
			{
				b.u.onClick(((android.content.DialogInterface) (a.a)), j1);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field AlertController$a b>
			//    2    4:getfield        #32  <Field android.content.DialogInterface$OnClickListener AlertController$a.u>
			//    3    7:aload_0         
			//    4    8:getfield        #22  <Field AlertController a>
			//    5   11:getfield        #35  <Field i AlertController.a>
			//    6   14:iload_3         
			//    7   15:invokeinterface #41  <Method void android.content.DialogInterface$OnClickListener.onClick(android.content.DialogInterface, int)>
				if(!b.E)
			//*   8   20:aload_0         
			//*   9   21:getfield        #20  <Field AlertController$a b>
			//*  10   24:getfield        #45  <Field boolean AlertController$a.E>
			//*  11   27:ifne            40
					a.a.dismiss();
			//   12   30:aload_0         
			//   13   31:getfield        #22  <Field AlertController a>
			//   14   34:getfield        #35  <Field i AlertController.a>
			//   15   37:invokevirtual   #50  <Method void i.dismiss()>
			//   16   40:return          
			}

			final AlertController a;
			final AlertController.a b;

			
			{
				b = AlertController.a.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AlertController$a b>
				a = alertcontroller;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field AlertController a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//  112  224:new             #13  <Class AlertController$a$3>
	//  113  227:dup             
	//  114  228:aload_0         
	//  115  229:aload_1         
	//  116  230:invokespecial   #165 <Method void AlertController$a$3(AlertController$a, AlertController)>
	//  117  233:astore_3        
_L4:
		cyclelistview.setOnItemClickListener(clicklistener);
	//  118  234:aload           4
	//  119  236:aload_3         
	//  120  237:invokevirtual   #169 <Method void AlertController$RecycleListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		break; /* Loop/switch isn't completed */
	//  121  240:goto            265
_L2:
		if(G == null)
			break; /* Loop/switch isn't completed */
	//  122  243:aload_0         
	//  123  244:getfield        #171 <Field android.content.DialogInterface$OnMultiChoiceClickListener G>
	//  124  247:ifnull          265
		clicklistener = new android.widget.AdapterView.OnItemClickListener(cyclelistview, alertcontroller) {

			public void onItemClick(AdapterView adapterview, View view, int j1, long l1)
			{
				if(c.C != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #22  <Field AlertController$a c>
			//*   2    4:getfield        #36  <Field boolean[] AlertController$a.C>
			//*   3    7:ifnull          27
					c.C[j1] = a.isItemChecked(j1);
			//    4   10:aload_0         
			//    5   11:getfield        #22  <Field AlertController$a c>
			//    6   14:getfield        #36  <Field boolean[] AlertController$a.C>
			//    7   17:iload_3         
			//    8   18:aload_0         
			//    9   19:getfield        #24  <Field AlertController$RecycleListView a>
			//   10   22:iload_3         
			//   11   23:invokevirtual   #42  <Method boolean AlertController$RecycleListView.isItemChecked(int)>
			//   12   26:bastore         
				c.G.onClick(((android.content.DialogInterface) (b.a)), j1, a.isItemChecked(j1));
			//   13   27:aload_0         
			//   14   28:getfield        #22  <Field AlertController$a c>
			//   15   31:getfield        #46  <Field android.content.DialogInterface$OnMultiChoiceClickListener AlertController$a.G>
			//   16   34:aload_0         
			//   17   35:getfield        #26  <Field AlertController b>
			//   18   38:getfield        #49  <Field i AlertController.a>
			//   19   41:iload_3         
			//   20   42:aload_0         
			//   21   43:getfield        #24  <Field AlertController$RecycleListView a>
			//   22   46:iload_3         
			//   23   47:invokevirtual   #42  <Method boolean AlertController$RecycleListView.isItemChecked(int)>
			//   24   50:invokeinterface #55  <Method void android.content.DialogInterface$OnMultiChoiceClickListener.onClick(android.content.DialogInterface, int, boolean)>
			//   25   55:return          
			}

			final AlertController.RecycleListView a;
			final AlertController b;
			final AlertController.a c;

			
			{
				c = AlertController.a.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AlertController$a c>
				a = recyclelistview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field AlertController$RecycleListView a>
				b = alertcontroller;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field AlertController b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void Object()>
			//   11   19:return          
			}
		}
;
	//  125  250:new             #15  <Class AlertController$a$4>
	//  126  253:dup             
	//  127  254:aload_0         
	//  128  255:aload           4
	//  129  257:aload_1         
	//  130  258:invokespecial   #174 <Method void AlertController$a$4(AlertController$a, AlertController$RecycleListView, AlertController)>
	//  131  261:astore_3        
		if(true) goto _L4; else goto _L3
	//  132  262:goto            234
_L3:
		if(K != null)
	//* 133  265:aload_0         
	//* 134  266:getfield        #176 <Field android.widget.AdapterView$OnItemSelectedListener K>
	//* 135  269:ifnull          281
			cyclelistview.setOnItemSelectedListener(K);
	//  136  272:aload           4
	//  137  274:aload_0         
	//  138  275:getfield        #176 <Field android.widget.AdapterView$OnItemSelectedListener K>
	//  139  278:invokevirtual   #180 <Method void AlertController$RecycleListView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
		if(E)
	//* 140  281:aload_0         
	//* 141  282:getfield        #131 <Field boolean E>
	//* 142  285:ifeq            297
			cyclelistview.setChoiceMode(1);
	//  143  288:aload           4
	//  144  290:iconst_1        
	//  145  291:invokevirtual   #184 <Method void AlertController$RecycleListView.setChoiceMode(int)>
		else
	//* 146  294:goto            310
		if(D)
	//* 147  297:aload_0         
	//* 148  298:getfield        #116 <Field boolean D>
	//* 149  301:ifeq            310
			cyclelistview.setChoiceMode(2);
	//  150  304:aload           4
	//  151  306:iconst_2        
	//  152  307:invokevirtual   #184 <Method void AlertController$RecycleListView.setChoiceMode(int)>
		alertcontroller.b = ((ListView) (cyclelistview));
	//  153  310:aload_1         
	//  154  311:aload           4
	//  155  313:putfield        #187 <Field ListView AlertController.b>
		return;
	//  156  316:return          
	}

	public void a(AlertController alertcontroller)
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field View g>
	//*   2    4:ifnull          18
		{
			alertcontroller.b(g);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #189 <Field View g>
	//    6   12:invokevirtual   #192 <Method void AlertController.b(View)>
		} else
	//*   7   15:goto            82
		{
			if(f != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #194 <Field CharSequence f>
	//*  10   22:ifnull          33
				alertcontroller.a(f);
	//   11   25:aload_1         
	//   12   26:aload_0         
	//   13   27:getfield        #194 <Field CharSequence f>
	//   14   30:invokevirtual   #197 <Method void AlertController.a(CharSequence)>
			if(d != null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #199 <Field Drawable d>
	//*  17   37:ifnull          48
				alertcontroller.a(d);
	//   18   40:aload_1         
	//   19   41:aload_0         
	//   20   42:getfield        #199 <Field Drawable d>
	//   21   45:invokevirtual   #202 <Method void AlertController.a(Drawable)>
			if(c != 0)
	//*  22   48:aload_0         
	//*  23   49:getfield        #80  <Field int c>
	//*  24   52:ifeq            63
				alertcontroller.b(c);
	//   25   55:aload_1         
	//   26   56:aload_0         
	//   27   57:getfield        #80  <Field int c>
	//   28   60:invokevirtual   #204 <Method void AlertController.b(int)>
			if(e != 0)
	//*  29   63:aload_0         
	//*  30   64:getfield        #82  <Field int e>
	//*  31   67:ifeq            82
				alertcontroller.b(alertcontroller.c(e));
	//   32   70:aload_1         
	//   33   71:aload_1         
	//   34   72:aload_0         
	//   35   73:getfield        #82  <Field int e>
	//   36   76:invokevirtual   #207 <Method int AlertController.c(int)>
	//   37   79:invokevirtual   #204 <Method void AlertController.b(int)>
		}
		if(h != null)
	//*  38   82:aload_0         
	//*  39   83:getfield        #209 <Field CharSequence h>
	//*  40   86:ifnull          97
			alertcontroller.b(h);
	//   41   89:aload_1         
	//   42   90:aload_0         
	//   43   91:getfield        #209 <Field CharSequence h>
	//   44   94:invokevirtual   #211 <Method void AlertController.b(CharSequence)>
		if(i != null)
	//*  45   97:aload_0         
	//*  46   98:getfield        #213 <Field CharSequence i>
	//*  47  101:ifnull          118
			alertcontroller.a(-1, i, j, ((android.os.Message) (null)));
	//   48  104:aload_1         
	//   49  105:iconst_m1       
	//   50  106:aload_0         
	//   51  107:getfield        #213 <Field CharSequence i>
	//   52  110:aload_0         
	//   53  111:getfield        #215 <Field android.content.DialogInterface$OnClickListener j>
	//   54  114:aconst_null     
	//   55  115:invokevirtual   #218 <Method void AlertController.a(int, CharSequence, android.content.DialogInterface$OnClickListener, android.os.Message)>
		if(k != null)
	//*  56  118:aload_0         
	//*  57  119:getfield        #220 <Field CharSequence k>
	//*  58  122:ifnull          140
			alertcontroller.a(-2, k, l, ((android.os.Message) (null)));
	//   59  125:aload_1         
	//   60  126:bipush          -2
	//   61  128:aload_0         
	//   62  129:getfield        #220 <Field CharSequence k>
	//   63  132:aload_0         
	//   64  133:getfield        #222 <Field android.content.DialogInterface$OnClickListener l>
	//   65  136:aconst_null     
	//   66  137:invokevirtual   #218 <Method void AlertController.a(int, CharSequence, android.content.DialogInterface$OnClickListener, android.os.Message)>
		if(m != null)
	//*  67  140:aload_0         
	//*  68  141:getfield        #224 <Field CharSequence m>
	//*  69  144:ifnull          162
			alertcontroller.a(-3, m, n, ((android.os.Message) (null)));
	//   70  147:aload_1         
	//   71  148:bipush          -3
	//   72  150:aload_0         
	//   73  151:getfield        #224 <Field CharSequence m>
	//   74  154:aload_0         
	//   75  155:getfield        #226 <Field android.content.DialogInterface$OnClickListener n>
	//   76  158:aconst_null     
	//   77  159:invokevirtual   #218 <Method void AlertController.a(int, CharSequence, android.content.DialogInterface$OnClickListener, android.os.Message)>
		if(s != null || H != null || t != null)
	//*  78  162:aload_0         
	//*  79  163:getfield        #123 <Field CharSequence[] s>
	//*  80  166:ifnonnull       183
	//*  81  169:aload_0         
	//*  82  170:getfield        #118 <Field Cursor H>
	//*  83  173:ifnonnull       183
	//*  84  176:aload_0         
	//*  85  177:getfield        #146 <Field ListAdapter t>
	//*  86  180:ifnull          188
			b(alertcontroller);
	//   87  183:aload_0         
	//   88  184:aload_1         
	//   89  185:invokespecial   #228 <Method void b(AlertController)>
		if(w != null)
	//*  90  188:aload_0         
	//*  91  189:getfield        #230 <Field View w>
	//*  92  192:ifnull          236
			if(B)
	//*  93  195:aload_0         
	//*  94  196:getfield        #84  <Field boolean B>
	//*  95  199:ifeq            227
			{
				alertcontroller.a(w, x, y, z, A);
	//   96  202:aload_1         
	//   97  203:aload_0         
	//   98  204:getfield        #230 <Field View w>
	//   99  207:aload_0         
	//  100  208:getfield        #232 <Field int x>
	//  101  211:aload_0         
	//  102  212:getfield        #234 <Field int y>
	//  103  215:aload_0         
	//  104  216:getfield        #236 <Field int z>
	//  105  219:aload_0         
	//  106  220:getfield        #238 <Field int A>
	//  107  223:invokevirtual   #241 <Method void AlertController.a(View, int, int, int, int)>
				return;
	//  108  226:return          
			} else
			{
				alertcontroller.c(w);
	//  109  227:aload_1         
	//  110  228:aload_0         
	//  111  229:getfield        #230 <Field View w>
	//  112  232:invokevirtual   #243 <Method void AlertController.c(View)>
				return;
	//  113  235:return          
			}
		if(v != 0)
	//* 114  236:aload_0         
	//* 115  237:getfield        #245 <Field int v>
	//* 116  240:ifeq            251
			alertcontroller.a(v);
	//  117  243:aload_1         
	//  118  244:aload_0         
	//  119  245:getfield        #245 <Field int v>
	//  120  248:invokevirtual   #247 <Method void AlertController.a(int)>
	//  121  251:return          
	}

	public int A;
	public boolean B;
	public boolean C[];
	public boolean D;
	public boolean E;
	public int F;
	public android.content.MultiChoiceClickListener G;
	public Cursor H;
	public String I;
	public String J;
	public android.widget.SelectedListener K;
	public a L;
	public boolean M;
	public final Context a;
	public final LayoutInflater b;
	public int c;
	public Drawable d;
	public int e;
	public CharSequence f;
	public View g;
	public CharSequence h;
	public CharSequence i;
	public android.content.ClickListener j;
	public CharSequence k;
	public android.content.ClickListener l;
	public CharSequence m;
	public android.content.ClickListener n;
	public boolean o;
	public android.content.CancelListener p;
	public android.content.DismissListener q;
	public android.content.KeyListener r;
	public CharSequence s[];
	public ListAdapter t;
	public android.content.ClickListener u;
	public int v;
	public View w;
	public int x;
	public int y;
	public int z;

	public AlertController$a(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void Object()>
		c = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #80  <Field int c>
		e = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #82  <Field int e>
		B = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #84  <Field boolean B>
		F = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #86  <Field int F>
		M = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #88  <Field boolean M>
		a = context;
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:putfield        #90  <Field Context a>
		o = true;
	//   20   34:aload_0         
	//   21   35:iconst_1        
	//   22   36:putfield        #92  <Field boolean o>
		b = (LayoutInflater)context.getSystemService("layout_inflater");
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:ldc1            #94  <String "layout_inflater">
	//   26   43:invokevirtual   #100 <Method Object Context.getSystemService(String)>
	//   27   46:checkcast       #102 <Class LayoutInflater>
	//   28   49:putfield        #104 <Field LayoutInflater b>
	//   29   52:return          
	}
}

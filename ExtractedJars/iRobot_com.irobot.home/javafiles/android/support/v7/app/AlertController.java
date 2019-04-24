// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.s;
import android.support.v4.widget.NestedScrollView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.*;
import android.widget.*;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.app:
//			i

class AlertController
{
	public static class RecycleListView extends ListView
	{

		public void a(boolean flag, boolean flag1)
		{
			if(!flag1 || !flag)
		//*   0    0:iload_2         
		//*   1    1:ifeq            8
		//*   2    4:iload_1         
		//*   3    5:ifne            67
			{
				int k1 = getPaddingLeft();
		//    4    8:aload_0         
		//    5    9:invokevirtual   #49  <Method int getPaddingLeft()>
		//    6   12:istore          5
				int i1;
				if(flag)
		//*   7   14:iload_1         
		//*   8   15:ifeq            26
					i1 = getPaddingTop();
		//    9   18:aload_0         
		//   10   19:invokevirtual   #52  <Method int getPaddingTop()>
		//   11   22:istore_3        
				else
		//*  12   23:goto            31
					i1 = a;
		//   13   26:aload_0         
		//   14   27:getfield        #44  <Field int a>
		//   15   30:istore_3        
				int l1 = getPaddingRight();
		//   16   31:aload_0         
		//   17   32:invokevirtual   #55  <Method int getPaddingRight()>
		//   18   35:istore          6
				int j1;
				if(flag1)
		//*  19   37:iload_2         
		//*  20   38:ifeq            50
					j1 = getPaddingBottom();
		//   21   41:aload_0         
		//   22   42:invokevirtual   #58  <Method int getPaddingBottom()>
		//   23   45:istore          4
				else
		//*  24   47:goto            56
					j1 = b;
		//   25   50:aload_0         
		//   26   51:getfield        #39  <Field int b>
		//   27   54:istore          4
				setPadding(k1, i1, l1, j1);
		//   28   56:aload_0         
		//   29   57:iload           5
		//   30   59:iload_3         
		//   31   60:iload           6
		//   32   62:iload           4
		//   33   64:invokevirtual   #62  <Method void setPadding(int, int, int, int)>
			}
		//   34   67:return          
		}

		private final int a;
		private final int b;

		public RecycleListView(Context context)
		{
			this(context, ((AttributeSet) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #15  <Method void AlertController$RecycleListView(Context, AttributeSet)>
		//    4    6:return          
		}

		public RecycleListView(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #17  <Method void ListView(Context, AttributeSet)>
			context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.a.a.j.RecycleListView)));
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:getstatic       #22  <Field int[] android.support.v7.a.a$j.RecycleListView>
		//    7   11:invokevirtual   #28  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//    8   14:astore_1        
			b = ((TypedArray) (context)).getDimensionPixelOffset(android.support.v7.a.a.j.RecycleListView_paddingBottomNoButtons, -1);
		//    9   15:aload_0         
		//   10   16:aload_1         
		//   11   17:getstatic       #31  <Field int android.support.v7.a.a$j.RecycleListView_paddingBottomNoButtons>
		//   12   20:iconst_m1       
		//   13   21:invokevirtual   #37  <Method int TypedArray.getDimensionPixelOffset(int, int)>
		//   14   24:putfield        #39  <Field int b>
			a = ((TypedArray) (context)).getDimensionPixelOffset(android.support.v7.a.a.j.RecycleListView_paddingTopNoTitle, -1);
		//   15   27:aload_0         
		//   16   28:aload_1         
		//   17   29:getstatic       #42  <Field int android.support.v7.a.a$j.RecycleListView_paddingTopNoTitle>
		//   18   32:iconst_m1       
		//   19   33:invokevirtual   #37  <Method int TypedArray.getDimensionPixelOffset(int, int)>
		//   20   36:putfield        #44  <Field int a>
		//   21   39:return          
		}
	}

	public static class a
	{

		private void b(AlertController alertcontroller)
		{
			RecycleListView recyclelistview;
			recyclelistview = (RecycleListView)b.inflate(alertcontroller.l, ((ViewGroup) (null)));
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
					obj = ((Object) (new ArrayAdapter(this, a, alertcontroller.m, 0x1020014, s, recyclelistview) {

						public View getView(int i1, View view, ViewGroup viewgroup)
						{
							view = super.getView(i1, view, viewgroup);
						//    0    0:aload_0         
						//    1    1:iload_1         
						//    2    2:aload_2         
						//    3    3:aload_3         
						//    4    4:invokespecial   #29  <Method View ArrayAdapter.getView(int, View, ViewGroup)>
						//    5    7:astore_2        
							if(b.C != null && b.C[i1])
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
								a.setItemChecked(i1, true);
						//   16   30:aload_0         
						//   17   31:getfield        #21  <Field AlertController$RecycleListView a>
						//   18   34:iload_1         
						//   19   35:iconst_1        
						//   20   36:invokevirtual   #39  <Method void AlertController$RecycleListView.setItemChecked(int, boolean)>
							return view;
						//   21   39:aload_2         
						//   22   40:areturn         
						}

						final RecycleListView a;
						final a b;

			
			{
				b = a1;
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
					obj = ((Object) (new CursorAdapter(this, a, H, false, recyclelistview, alertcontroller) {

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
							int i1 = cursor.getPosition();
						//   12   27:aload_3         
						//   13   28:invokeinterface #74  <Method int Cursor.getPosition()>
						//   14   33:istore          4
							int j1 = cursor.getInt(e);
						//   15   35:aload_3         
						//   16   36:aload_0         
						//   17   37:getfield        #50  <Field int e>
						//   18   40:invokeinterface #78  <Method int Cursor.getInt(int)>
						//   19   45:istore          5
							boolean flag = true;
						//   20   47:iconst_1        
						//   21   48:istore          6
							if(j1 != 1)
						//*  22   50:iload           5
						//*  23   52:iconst_1        
						//*  24   53:icmpne          59
						//*  25   56:goto            62
								flag = false;
						//   26   59:iconst_0        
						//   27   60:istore          6
							((RecycleListView) (view)).setItemChecked(i1, flag);
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

						final RecycleListView a;
						final AlertController b;
						final a c;
						private final int d;
						private final int e;

			
			{
				c = a1;
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
				a1 = ((a) (getCursor()));
			//   14   25:aload_0         
			//   15   26:invokevirtual   #34  <Method Cursor getCursor()>
			//   16   29:astore_1        
				d = ((Cursor) (a1)).getColumnIndexOrThrow(c.I);
			//   17   30:aload_0         
			//   18   31:aload_1         
			//   19   32:aload_0         
			//   20   33:getfield        #23  <Field AlertController$a c>
			//   21   36:getfield        #37  <Field String AlertController$a.I>
			//   22   39:invokeinterface #43  <Method int Cursor.getColumnIndexOrThrow(String)>
			//   23   44:putfield        #45  <Field int d>
				e = ((Cursor) (a1)).getColumnIndexOrThrow(c.J);
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
					obj = ((Object) (new c(a, i1, 0x1020014, s)));
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
				L.a(((ListView) (recyclelistview)));
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
			android.widget.AdapterView.OnItemClickListener onitemclicklistener = new android.widget.AdapterView.OnItemClickListener(this, alertcontroller) {

				public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
				{
					b.u.onClick(((DialogInterface) (a.a)), i1);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field AlertController$a b>
				//    2    4:getfield        #32  <Field android.content.DialogInterface$OnClickListener AlertController$a.u>
				//    3    7:aload_0         
				//    4    8:getfield        #22  <Field AlertController a>
				//    5   11:getfield        #35  <Field i AlertController.a>
				//    6   14:iload_3         
				//    7   15:invokeinterface #41  <Method void android.content.DialogInterface$OnClickListener.onClick(DialogInterface, int)>
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
				final a b;

			
			{
				b = a1;
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
			recyclelistview.setOnItemClickListener(onitemclicklistener);
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
			onitemclicklistener = new android.widget.AdapterView.OnItemClickListener(this, recyclelistview, alertcontroller) {

				public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
				{
					if(c.C != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #22  <Field AlertController$a c>
				//*   2    4:getfield        #36  <Field boolean[] AlertController$a.C>
				//*   3    7:ifnull          27
						c.C[i1] = a.isItemChecked(i1);
				//    4   10:aload_0         
				//    5   11:getfield        #22  <Field AlertController$a c>
				//    6   14:getfield        #36  <Field boolean[] AlertController$a.C>
				//    7   17:iload_3         
				//    8   18:aload_0         
				//    9   19:getfield        #24  <Field AlertController$RecycleListView a>
				//   10   22:iload_3         
				//   11   23:invokevirtual   #42  <Method boolean AlertController$RecycleListView.isItemChecked(int)>
				//   12   26:bastore         
					c.G.onClick(((DialogInterface) (b.a)), i1, a.isItemChecked(i1));
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
				//   24   50:invokeinterface #55  <Method void android.content.DialogInterface$OnMultiChoiceClickListener.onClick(DialogInterface, int, boolean)>
				//   25   55:return          
				}

				final RecycleListView a;
				final AlertController b;
				final a c;

			
			{
				c = a1;
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
				recyclelistview.setOnItemSelectedListener(K);
		//  136  272:aload           4
		//  137  274:aload_0         
		//  138  275:getfield        #176 <Field android.widget.AdapterView$OnItemSelectedListener K>
		//  139  278:invokevirtual   #180 <Method void AlertController$RecycleListView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
			if(E)
		//* 140  281:aload_0         
		//* 141  282:getfield        #131 <Field boolean E>
		//* 142  285:ifeq            297
				recyclelistview.setChoiceMode(1);
		//  143  288:aload           4
		//  144  290:iconst_1        
		//  145  291:invokevirtual   #184 <Method void AlertController$RecycleListView.setChoiceMode(int)>
			else
		//* 146  294:goto            310
			if(D)
		//* 147  297:aload_0         
		//* 148  298:getfield        #116 <Field boolean D>
		//* 149  301:ifeq            310
				recyclelistview.setChoiceMode(2);
		//  150  304:aload           4
		//  151  306:iconst_2        
		//  152  307:invokevirtual   #184 <Method void AlertController$RecycleListView.setChoiceMode(int)>
			alertcontroller.b = ((ListView) (recyclelistview));
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
				alertcontroller.a(-1, i, j, ((Message) (null)));
		//   48  104:aload_1         
		//   49  105:iconst_m1       
		//   50  106:aload_0         
		//   51  107:getfield        #213 <Field CharSequence i>
		//   52  110:aload_0         
		//   53  111:getfield        #215 <Field android.content.DialogInterface$OnClickListener j>
		//   54  114:aconst_null     
		//   55  115:invokevirtual   #218 <Method void AlertController.a(int, CharSequence, android.content.DialogInterface$OnClickListener, Message)>
			if(k != null)
		//*  56  118:aload_0         
		//*  57  119:getfield        #220 <Field CharSequence k>
		//*  58  122:ifnull          140
				alertcontroller.a(-2, k, l, ((Message) (null)));
		//   59  125:aload_1         
		//   60  126:bipush          -2
		//   61  128:aload_0         
		//   62  129:getfield        #220 <Field CharSequence k>
		//   63  132:aload_0         
		//   64  133:getfield        #222 <Field android.content.DialogInterface$OnClickListener l>
		//   65  136:aconst_null     
		//   66  137:invokevirtual   #218 <Method void AlertController.a(int, CharSequence, android.content.DialogInterface$OnClickListener, Message)>
			if(m != null)
		//*  67  140:aload_0         
		//*  68  141:getfield        #224 <Field CharSequence m>
		//*  69  144:ifnull          162
				alertcontroller.a(-3, m, n, ((Message) (null)));
		//   70  147:aload_1         
		//   71  148:bipush          -3
		//   72  150:aload_0         
		//   73  151:getfield        #224 <Field CharSequence m>
		//   74  154:aload_0         
		//   75  155:getfield        #226 <Field android.content.DialogInterface$OnClickListener n>
		//   76  158:aconst_null     
		//   77  159:invokevirtual   #218 <Method void AlertController.a(int, CharSequence, android.content.DialogInterface$OnClickListener, Message)>
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
		public android.content.DialogInterface.OnMultiChoiceClickListener G;
		public Cursor H;
		public String I;
		public String J;
		public android.widget.AdapterView.OnItemSelectedListener K;
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
		public android.content.DialogInterface.OnClickListener j;
		public CharSequence k;
		public android.content.DialogInterface.OnClickListener l;
		public CharSequence m;
		public android.content.DialogInterface.OnClickListener n;
		public boolean o;
		public android.content.DialogInterface.OnCancelListener p;
		public android.content.DialogInterface.OnDismissListener q;
		public android.content.DialogInterface.OnKeyListener r;
		public CharSequence s[];
		public ListAdapter t;
		public android.content.DialogInterface.OnClickListener u;
		public int v;
		public View w;
		public int x;
		public int y;
		public int z;

		public a(Context context)
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

	public static interface a.a
	{

		public abstract void a(ListView listview);
	}

	private static final class b extends Handler
	{

		public void handleMessage(Message message)
		{
			int i1 = message.what;
		//    0    0:aload_1         
		//    1    1:getfield        #31  <Field int Message.what>
		//    2    4:istore_2        
			if(i1 != 1)
		//*   3    5:iload_2         
		//*   4    6:iconst_1        
		//*   5    7:icmpeq          64
			{
				switch(i1)
		//*   6   10:iload_2         
				{
		//*   7   11:tableswitch     -3 -1: default 36
		//		               -3 37
		//		               -2 37
		//		               -1 37
				default:
					return;
		//    8   36:return          

				case -3: 
				case -2: 
				case -1: 
					((android.content.DialogInterface.OnClickListener)message.obj).onClick((DialogInterface)a.get(), message.what);
		//    9   37:aload_1         
		//   10   38:getfield        #35  <Field Object Message.obj>
		//   11   41:checkcast       #37  <Class android.content.DialogInterface$OnClickListener>
		//   12   44:aload_0         
		//   13   45:getfield        #22  <Field WeakReference a>
		//   14   48:invokevirtual   #41  <Method Object WeakReference.get()>
		//   15   51:checkcast       #43  <Class DialogInterface>
		//   16   54:aload_1         
		//   17   55:getfield        #31  <Field int Message.what>
		//   18   58:invokeinterface #47  <Method void android.content.DialogInterface$OnClickListener.onClick(DialogInterface, int)>
					break;
				}
				return;
		//   19   63:return          
			} else
			{
				((DialogInterface)message.obj).dismiss();
		//   20   64:aload_1         
		//   21   65:getfield        #35  <Field Object Message.obj>
		//   22   68:checkcast       #43  <Class DialogInterface>
		//   23   71:invokeinterface #50  <Method void DialogInterface.dismiss()>
				return;
		//   24   76:return          
			}
		}

		private WeakReference a;

		public b(DialogInterface dialoginterface)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Handler()>
			a = new WeakReference(((Object) (dialoginterface)));
		//    2    4:aload_0         
		//    3    5:new             #17  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #20  <Method void WeakReference(Object)>
		//    7   13:putfield        #22  <Field WeakReference a>
		//    8   16:return          
		}
	}

	private static class c extends ArrayAdapter
	{

		public long getItemId(int i1)
		{
			return (long)i1;
		//    0    0:iload_1         
		//    1    1:i2l             
		//    2    2:lreturn         
		}

		public boolean hasStableIds()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public c(Context context, int i1, int j1, CharSequence acharsequence[])
		{
			super(context, i1, j1, ((Object []) (acharsequence)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:aload           4
		//    5    6:invokespecial   #13  <Method void ArrayAdapter(Context, int, int, Object[])>
		//    6    9:return          
		}
	}


	public AlertController(Context context, i i1, Window window)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #95  <Method void Object()>
		A = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #97  <Field boolean A>
		E = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #99  <Field int E>
		k = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #101 <Field int k>
		N = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #103 <Field int N>
	//   14   24:aload_0         
	//   15   25:new             #6   <Class AlertController$1>
	//   16   28:dup             
	//   17   29:aload_0         
	//   18   30:invokespecial   #106 <Method void AlertController$1(AlertController)>
	//   19   33:putfield        #108 <Field android.view.View$OnClickListener O>
		q = context;
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:putfield        #110 <Field Context q>
		a = i1;
	//   23   41:aload_0         
	//   24   42:aload_2         
	//   25   43:putfield        #112 <Field i a>
		r = window;
	//   26   46:aload_0         
	//   27   47:aload_3         
	//   28   48:putfield        #114 <Field Window r>
		p = ((Handler) (new b(((DialogInterface) (i1)))));
	//   29   51:aload_0         
	//   30   52:new             #32  <Class AlertController$b>
	//   31   55:dup             
	//   32   56:aload_2         
	//   33   57:invokespecial   #117 <Method void AlertController$b(DialogInterface)>
	//   34   60:putfield        #119 <Field Handler p>
		context = ((Context) (context.obtainStyledAttributes(((AttributeSet) (null)), android.support.v7.a.a.j.AlertDialog, android.support.v7.a.a.a.alertDialogStyle, 0)));
	//   35   63:aload_1         
	//   36   64:aconst_null     
	//   37   65:getstatic       #125 <Field int[] android.support.v7.a.a$j.AlertDialog>
	//   38   68:getstatic       #130 <Field int android.support.v7.a.a$a.alertDialogStyle>
	//   39   71:iconst_0        
	//   40   72:invokevirtual   #136 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   41   75:astore_1        
		K = ((TypedArray) (context)).getResourceId(android.support.v7.a.a.j.AlertDialog_android_layout, 0);
	//   42   76:aload_0         
	//   43   77:aload_1         
	//   44   78:getstatic       #139 <Field int android.support.v7.a.a$j.AlertDialog_android_layout>
	//   45   81:iconst_0        
	//   46   82:invokevirtual   #145 <Method int TypedArray.getResourceId(int, int)>
	//   47   85:putfield        #147 <Field int K>
		L = ((TypedArray) (context)).getResourceId(android.support.v7.a.a.j.AlertDialog_buttonPanelSideLayout, 0);
	//   48   88:aload_0         
	//   49   89:aload_1         
	//   50   90:getstatic       #150 <Field int android.support.v7.a.a$j.AlertDialog_buttonPanelSideLayout>
	//   51   93:iconst_0        
	//   52   94:invokevirtual   #145 <Method int TypedArray.getResourceId(int, int)>
	//   53   97:putfield        #152 <Field int L>
		l = ((TypedArray) (context)).getResourceId(android.support.v7.a.a.j.AlertDialog_listLayout, 0);
	//   54  100:aload_0         
	//   55  101:aload_1         
	//   56  102:getstatic       #155 <Field int android.support.v7.a.a$j.AlertDialog_listLayout>
	//   57  105:iconst_0        
	//   58  106:invokevirtual   #145 <Method int TypedArray.getResourceId(int, int)>
	//   59  109:putfield        #157 <Field int l>
		m = ((TypedArray) (context)).getResourceId(android.support.v7.a.a.j.AlertDialog_multiChoiceItemLayout, 0);
	//   60  112:aload_0         
	//   61  113:aload_1         
	//   62  114:getstatic       #160 <Field int android.support.v7.a.a$j.AlertDialog_multiChoiceItemLayout>
	//   63  117:iconst_0        
	//   64  118:invokevirtual   #145 <Method int TypedArray.getResourceId(int, int)>
	//   65  121:putfield        #162 <Field int m>
		n = ((TypedArray) (context)).getResourceId(android.support.v7.a.a.j.AlertDialog_singleChoiceItemLayout, 0);
	//   66  124:aload_0         
	//   67  125:aload_1         
	//   68  126:getstatic       #165 <Field int android.support.v7.a.a$j.AlertDialog_singleChoiceItemLayout>
	//   69  129:iconst_0        
	//   70  130:invokevirtual   #145 <Method int TypedArray.getResourceId(int, int)>
	//   71  133:putfield        #167 <Field int n>
		o = ((TypedArray) (context)).getResourceId(android.support.v7.a.a.j.AlertDialog_listItemLayout, 0);
	//   72  136:aload_0         
	//   73  137:aload_1         
	//   74  138:getstatic       #170 <Field int android.support.v7.a.a$j.AlertDialog_listItemLayout>
	//   75  141:iconst_0        
	//   76  142:invokevirtual   #145 <Method int TypedArray.getResourceId(int, int)>
	//   77  145:putfield        #172 <Field int o>
		M = ((TypedArray) (context)).getBoolean(android.support.v7.a.a.j.AlertDialog_showTitle, true);
	//   78  148:aload_0         
	//   79  149:aload_1         
	//   80  150:getstatic       #175 <Field int android.support.v7.a.a$j.AlertDialog_showTitle>
	//   81  153:iconst_1        
	//   82  154:invokevirtual   #179 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   83  157:putfield        #181 <Field boolean M>
		((TypedArray) (context)).recycle();
	//   84  160:aload_1         
	//   85  161:invokevirtual   #184 <Method void TypedArray.recycle()>
		i1.b(1);
	//   86  164:aload_2         
	//   87  165:iconst_1        
	//   88  166:invokevirtual   #189 <Method boolean i.b(int)>
	//   89  169:pop             
	//   90  170:return          
	}

	private ViewGroup a(View view, View view1)
	{
		if(view == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       26
		{
			view = view1;
	//    2    4:aload_2         
	//    3    5:astore_1        
			if(view1 instanceof ViewStub)
	//*   4    6:aload_2         
	//*   5    7:instanceof      #193 <Class ViewStub>
	//*   6   10:ifeq            21
				view = ((ViewStub)view1).inflate();
	//    7   13:aload_2         
	//    8   14:checkcast       #193 <Class ViewStub>
	//    9   17:invokevirtual   #197 <Method View ViewStub.inflate()>
	//   10   20:astore_1        
			return (ViewGroup)view;
	//   11   21:aload_1         
	//   12   22:checkcast       #199 <Class ViewGroup>
	//   13   25:areturn         
		}
		if(view1 != null)
	//*  14   26:aload_2         
	//*  15   27:ifnull          50
		{
			android.view.ViewParent viewparent = view1.getParent();
	//   16   30:aload_2         
	//   17   31:invokevirtual   #205 <Method android.view.ViewParent View.getParent()>
	//   18   34:astore_3        
			if(viewparent instanceof ViewGroup)
	//*  19   35:aload_3         
	//*  20   36:instanceof      #199 <Class ViewGroup>
	//*  21   39:ifeq            50
				((ViewGroup)viewparent).removeView(view1);
	//   22   42:aload_3         
	//   23   43:checkcast       #199 <Class ViewGroup>
	//   24   46:aload_2         
	//   25   47:invokevirtual   #209 <Method void ViewGroup.removeView(View)>
		}
		view1 = view;
	//   26   50:aload_1         
	//   27   51:astore_2        
		if(view instanceof ViewStub)
	//*  28   52:aload_1         
	//*  29   53:instanceof      #193 <Class ViewStub>
	//*  30   56:ifeq            67
			view1 = ((ViewStub)view).inflate();
	//   31   59:aload_1         
	//   32   60:checkcast       #193 <Class ViewStub>
	//   33   63:invokevirtual   #197 <Method View ViewStub.inflate()>
	//   34   66:astore_2        
		return (ViewGroup)view1;
	//   35   67:aload_2         
	//   36   68:checkcast       #199 <Class ViewGroup>
	//   37   71:areturn         
	}

	static void a(View view, View view1, View view2)
	{
		byte byte2 = 4;
	//    0    0:iconst_4        
	//    1    1:istore          4
		if(view1 != null)
	//*   2    3:aload_1         
	//*   3    4:ifnull          27
		{
			byte byte0;
			if(view.canScrollVertically(-1))
	//*   4    7:aload_0         
	//*   5    8:iconst_m1       
	//*   6    9:invokevirtual   #213 <Method boolean View.canScrollVertically(int)>
	//*   7   12:ifeq            20
				byte0 = 0;
	//    8   15:iconst_0        
	//    9   16:istore_3        
			else
	//*  10   17:goto            22
				byte0 = 4;
	//   11   20:iconst_4        
	//   12   21:istore_3        
			view1.setVisibility(((int) (byte0)));
	//   13   22:aload_1         
	//   14   23:iload_3         
	//   15   24:invokevirtual   #217 <Method void View.setVisibility(int)>
		}
		if(view2 != null)
	//*  16   27:aload_2         
	//*  17   28:ifnull          49
		{
			byte byte1 = byte2;
	//   18   31:iload           4
	//   19   33:istore_3        
			if(view.canScrollVertically(1))
	//*  20   34:aload_0         
	//*  21   35:iconst_1        
	//*  22   36:invokevirtual   #213 <Method boolean View.canScrollVertically(int)>
	//*  23   39:ifeq            44
				byte1 = 0;
	//   24   42:iconst_0        
	//   25   43:istore_3        
			view2.setVisibility(((int) (byte1)));
	//   26   44:aload_2         
	//   27   45:iload_3         
	//   28   46:invokevirtual   #217 <Method void View.setVisibility(int)>
		}
	//   29   49:return          
	}

	private void a(ViewGroup viewgroup)
	{
		View view = u;
	//    0    0:aload_0         
	//    1    1:getfield        #220 <Field View u>
	//    2    4:astore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(view != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          19
			view = u;
	//    7   11:aload_0         
	//    8   12:getfield        #220 <Field View u>
	//    9   15:astore_3        
		else
	//*  10   16:goto            48
		if(v != 0)
	//*  11   19:aload_0         
	//*  12   20:getfield        #222 <Field int v>
	//*  13   23:ifeq            46
			view = LayoutInflater.from(q).inflate(v, viewgroup, false);
	//   14   26:aload_0         
	//   15   27:getfield        #110 <Field Context q>
	//   16   30:invokestatic    #228 <Method LayoutInflater LayoutInflater.from(Context)>
	//   17   33:aload_0         
	//   18   34:getfield        #222 <Field int v>
	//   19   37:aload_1         
	//   20   38:iconst_0        
	//   21   39:invokevirtual   #231 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   22   42:astore_3        
		else
	//*  23   43:goto            48
			view = null;
	//   24   46:aconst_null     
	//   25   47:astore_3        
		if(view != null)
	//*  26   48:aload_3         
	//*  27   49:ifnull          54
			flag = true;
	//   28   52:iconst_1        
	//   29   53:istore_2        
		if(!flag || !a(view))
	//*  30   54:iload_2         
	//*  31   55:ifeq            65
	//*  32   58:aload_3         
	//*  33   59:invokestatic    #234 <Method boolean a(View)>
	//*  34   62:ifne            76
			r.setFlags(0x20000, 0x20000);
	//   35   65:aload_0         
	//   36   66:getfield        #114 <Field Window r>
	//   37   69:ldc1            #235 <Int 0x20000>
	//   38   71:ldc1            #235 <Int 0x20000>
	//   39   73:invokevirtual   #241 <Method void Window.setFlags(int, int)>
		if(flag)
	//*  40   76:iload_2         
	//*  41   77:ifeq            157
		{
			FrameLayout framelayout = (FrameLayout)r.findViewById(android.support.v7.a.a.f.custom);
	//   42   80:aload_0         
	//   43   81:getfield        #114 <Field Window r>
	//   44   84:getstatic       #246 <Field int android.support.v7.a.a$f.custom>
	//   45   87:invokevirtual   #250 <Method View Window.findViewById(int)>
	//   46   90:checkcast       #252 <Class FrameLayout>
	//   47   93:astore          4
			framelayout.addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
	//   48   95:aload           4
	//   49   97:aload_3         
	//   50   98:new             #254 <Class android.view.ViewGroup$LayoutParams>
	//   51  101:dup             
	//   52  102:iconst_m1       
	//   53  103:iconst_m1       
	//   54  104:invokespecial   #256 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   55  107:invokevirtual   #260 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			if(A)
	//*  56  110:aload_0         
	//*  57  111:getfield        #97  <Field boolean A>
	//*  58  114:ifeq            138
				framelayout.setPadding(w, x, y, z);
	//   59  117:aload           4
	//   60  119:aload_0         
	//   61  120:getfield        #262 <Field int w>
	//   62  123:aload_0         
	//   63  124:getfield        #264 <Field int x>
	//   64  127:aload_0         
	//   65  128:getfield        #266 <Field int y>
	//   66  131:aload_0         
	//   67  132:getfield        #268 <Field int z>
	//   68  135:invokevirtual   #272 <Method void FrameLayout.setPadding(int, int, int, int)>
			if(b != null)
	//*  69  138:aload_0         
	//*  70  139:getfield        #274 <Field ListView b>
	//*  71  142:ifnull          163
			{
				((android.support.v7.widget.LinearLayoutCompat.LayoutParams)viewgroup.getLayoutParams()).g = 0.0F;
	//   72  145:aload_1         
	//   73  146:invokevirtual   #278 <Method android.view.ViewGroup$LayoutParams ViewGroup.getLayoutParams()>
	//   74  149:checkcast       #280 <Class android.support.v7.widget.LinearLayoutCompat$LayoutParams>
	//   75  152:fconst_0        
	//   76  153:putfield        #282 <Field float android.support.v7.widget.LinearLayoutCompat$LayoutParams.g>
				return;
	//   77  156:return          
			}
		} else
		{
			viewgroup.setVisibility(8);
	//   78  157:aload_1         
	//   79  158:bipush          8
	//   80  160:invokevirtual   #283 <Method void ViewGroup.setVisibility(int)>
		}
	//   81  163:return          
	}

	private void a(ViewGroup viewgroup, View view, int i1, int j1)
	{
		View view2 = r.findViewById(android.support.v7.a.a.f.scrollIndicatorUp);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field Window r>
	//    2    4:getstatic       #287 <Field int android.support.v7.a.a$f.scrollIndicatorUp>
	//    3    7:invokevirtual   #250 <Method View Window.findViewById(int)>
	//    4   10:astore          6
		View view1 = r.findViewById(android.support.v7.a.a.f.scrollIndicatorDown);
	//    5   12:aload_0         
	//    6   13:getfield        #114 <Field Window r>
	//    7   16:getstatic       #290 <Field int android.support.v7.a.a$f.scrollIndicatorDown>
	//    8   19:invokevirtual   #250 <Method View Window.findViewById(int)>
	//    9   22:astore          5
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  10   24:getstatic       #295 <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   27:bipush          23
	//*  12   29:icmplt          62
		{
			android.support.v4.view.s.a(view, i1, j1);
	//   13   32:aload_2         
	//   14   33:iload_3         
	//   15   34:iload           4
	//   16   36:invokestatic    #300 <Method void s.a(View, int, int)>
			if(view2 != null)
	//*  17   39:aload           6
	//*  18   41:ifnull          50
				viewgroup.removeView(view2);
	//   19   44:aload_1         
	//   20   45:aload           6
	//   21   47:invokevirtual   #209 <Method void ViewGroup.removeView(View)>
			if(view1 != null)
	//*  22   50:aload           5
	//*  23   52:ifnull          233
			{
				viewgroup.removeView(view1);
	//   24   55:aload_1         
	//   25   56:aload           5
	//   26   58:invokevirtual   #209 <Method void ViewGroup.removeView(View)>
				return;
	//   27   61:return          
			}
		} else
		{
			Object obj = null;
	//   28   62:aconst_null     
	//   29   63:astore          7
			view = view2;
	//   30   65:aload           6
	//   31   67:astore_2        
			if(view2 != null)
	//*  32   68:aload           6
	//*  33   70:ifnull          90
			{
				view = view2;
	//   34   73:aload           6
	//   35   75:astore_2        
				if((i1 & 1) == 0)
	//*  36   76:iload_3         
	//*  37   77:iconst_1        
	//*  38   78:iand            
	//*  39   79:ifne            90
				{
					viewgroup.removeView(view2);
	//   40   82:aload_1         
	//   41   83:aload           6
	//   42   85:invokevirtual   #209 <Method void ViewGroup.removeView(View)>
					view = null;
	//   43   88:aconst_null     
	//   44   89:astore_2        
				}
			}
			if(view1 != null && (i1 & 2) == 0)
	//*  45   90:aload           5
	//*  46   92:ifnull          114
	//*  47   95:iload_3         
	//*  48   96:iconst_2        
	//*  49   97:iand            
	//*  50   98:ifne            114
			{
				viewgroup.removeView(view1);
	//   51  101:aload_1         
	//   52  102:aload           5
	//   53  104:invokevirtual   #209 <Method void ViewGroup.removeView(View)>
				view1 = ((View) (obj));
	//   54  107:aload           7
	//   55  109:astore          5
			}
	//*  56  111:goto            114
			if(view != null || view1 != null)
	//*  57  114:aload_2         
	//*  58  115:ifnonnull       123
	//*  59  118:aload           5
	//*  60  120:ifnull          233
			{
				if(t != null)
	//*  61  123:aload_0         
	//*  62  124:getfield        #302 <Field CharSequence t>
	//*  63  127:ifnull          168
				{
					i.setOnScrollChangeListener(new android.support.v4.widget.NestedScrollView.b(view, view1) {

						public void a(NestedScrollView nestedscrollview, int k1, int l1, int i2, int j2)
						{
							AlertController.a(((View) (nestedscrollview)), a, b);
						//    0    0:aload_1         
						//    1    1:aload_0         
						//    2    2:getfield        #21  <Field View a>
						//    3    5:aload_0         
						//    4    6:getfield        #23  <Field View b>
						//    5    9:invokestatic    #31  <Method void AlertController.a(View, View, View)>
						//    6   12:return          
						}

						final View a;
						final View b;
						final AlertController c;

			
			{
				c = AlertController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AlertController c>
				a = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field View a>
				b = view1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field View b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Object()>
			//   11   19:return          
			}
					}
);
	//   64  130:aload_0         
	//   65  131:getfield        #304 <Field NestedScrollView i>
	//   66  134:new             #8   <Class AlertController$2>
	//   67  137:dup             
	//   68  138:aload_0         
	//   69  139:aload_2         
	//   70  140:aload           5
	//   71  142:invokespecial   #307 <Method void AlertController$2(AlertController, View, View)>
	//   72  145:invokevirtual   #313 <Method void NestedScrollView.setOnScrollChangeListener(android.support.v4.widget.NestedScrollView$b)>
					i.post(new Runnable(view, view1) {

						public void run()
						{
							AlertController.a(((View) (c.i)), a, b);
						//    0    0:aload_0         
						//    1    1:getfield        #19  <Field AlertController c>
						//    2    4:getfield        #32  <Field NestedScrollView AlertController.i>
						//    3    7:aload_0         
						//    4    8:getfield        #21  <Field View a>
						//    5   11:aload_0         
						//    6   12:getfield        #23  <Field View b>
						//    7   15:invokestatic    #35  <Method void AlertController.a(View, View, View)>
						//    8   18:return          
						}

						final View a;
						final View b;
						final AlertController c;

			
			{
				c = AlertController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AlertController c>
				a = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field View a>
				b = view1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field View b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Object()>
			//   11   19:return          
			}
					}
);
	//   73  148:aload_0         
	//   74  149:getfield        #304 <Field NestedScrollView i>
	//   75  152:new             #10  <Class AlertController$3>
	//   76  155:dup             
	//   77  156:aload_0         
	//   78  157:aload_2         
	//   79  158:aload           5
	//   80  160:invokespecial   #314 <Method void AlertController$3(AlertController, View, View)>
	//   81  163:invokevirtual   #318 <Method boolean NestedScrollView.post(Runnable)>
	//   82  166:pop             
					return;
	//   83  167:return          
				}
				if(b != null)
	//*  84  168:aload_0         
	//*  85  169:getfield        #274 <Field ListView b>
	//*  86  172:ifnull          213
				{
					b.setOnScrollListener(new android.widget.AbsListView.OnScrollListener(view, view1) {

						public void onScroll(AbsListView abslistview, int k1, int l1, int i2)
						{
							AlertController.a(((View) (abslistview)), a, b);
						//    0    0:aload_1         
						//    1    1:aload_0         
						//    2    2:getfield        #21  <Field View a>
						//    3    5:aload_0         
						//    4    6:getfield        #23  <Field View b>
						//    5    9:invokestatic    #32  <Method void AlertController.a(View, View, View)>
						//    6   12:return          
						}

						public void onScrollStateChanged(AbsListView abslistview, int k1)
						{
						//    0    0:return          
						}

						final View a;
						final View b;
						final AlertController c;

			
			{
				c = AlertController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AlertController c>
				a = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field View a>
				b = view1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field View b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Object()>
			//   11   19:return          
			}
					}
);
	//   87  175:aload_0         
	//   88  176:getfield        #274 <Field ListView b>
	//   89  179:new             #12  <Class AlertController$4>
	//   90  182:dup             
	//   91  183:aload_0         
	//   92  184:aload_2         
	//   93  185:aload           5
	//   94  187:invokespecial   #319 <Method void AlertController$4(AlertController, View, View)>
	//   95  190:invokevirtual   #325 <Method void ListView.setOnScrollListener(android.widget.AbsListView$OnScrollListener)>
					b.post(new Runnable(view, view1) {

						public void run()
						{
							AlertController.a(((View) (c.b)), a, b);
						//    0    0:aload_0         
						//    1    1:getfield        #19  <Field AlertController c>
						//    2    4:getfield        #31  <Field ListView AlertController.b>
						//    3    7:aload_0         
						//    4    8:getfield        #21  <Field View a>
						//    5   11:aload_0         
						//    6   12:getfield        #23  <Field View b>
						//    7   15:invokestatic    #34  <Method void AlertController.a(View, View, View)>
						//    8   18:return          
						}

						final View a;
						final View b;
						final AlertController c;

			
			{
				c = AlertController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AlertController c>
				a = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field View a>
				b = view1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field View b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Object()>
			//   11   19:return          
			}
					}
);
	//   96  193:aload_0         
	//   97  194:getfield        #274 <Field ListView b>
	//   98  197:new             #14  <Class AlertController$5>
	//   99  200:dup             
	//  100  201:aload_0         
	//  101  202:aload_2         
	//  102  203:aload           5
	//  103  205:invokespecial   #326 <Method void AlertController$5(AlertController, View, View)>
	//  104  208:invokevirtual   #327 <Method boolean ListView.post(Runnable)>
	//  105  211:pop             
					return;
	//  106  212:return          
				}
				if(view != null)
	//* 107  213:aload_2         
	//* 108  214:ifnull          222
					viewgroup.removeView(view);
	//  109  217:aload_1         
	//  110  218:aload_2         
	//  111  219:invokevirtual   #209 <Method void ViewGroup.removeView(View)>
				if(view1 != null)
	//* 112  222:aload           5
	//* 113  224:ifnull          233
					viewgroup.removeView(view1);
	//  114  227:aload_1         
	//  115  228:aload           5
	//  116  230:invokevirtual   #209 <Method void ViewGroup.removeView(View)>
			}
		}
	//  117  233:return          
	}

	private void a(Button button)
	{
		android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)button.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams Button.getLayoutParams()>
	//    2    4:checkcast       #333 <Class android.widget.LinearLayout$LayoutParams>
	//    3    7:astore_2        
		layoutparams.gravity = 1;
	//    4    8:aload_2         
	//    5    9:iconst_1        
	//    6   10:putfield        #336 <Field int android.widget.LinearLayout$LayoutParams.gravity>
		layoutparams.weight = 0.5F;
	//    7   13:aload_2         
	//    8   14:ldc2            #337 <Float 0.5F>
	//    9   17:putfield        #340 <Field float android.widget.LinearLayout$LayoutParams.weight>
		button.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #344 <Method void Button.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   13   25:return          
	}

	private static boolean a(Context context)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #347 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #348 <Method void TypedValue()>
	//    3    7:astore_1        
		context.getTheme().resolveAttribute(android.support.v7.a.a.a.alertDialogCenterButtons, typedvalue, true);
	//    4    8:aload_0         
	//    5    9:invokevirtual   #352 <Method android.content.res.Resources$Theme Context.getTheme()>
	//    6   12:getstatic       #355 <Field int android.support.v7.a.a$a.alertDialogCenterButtons>
	//    7   15:aload_1         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #361 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   10   20:pop             
		return typedvalue.data != 0;
	//   11   21:aload_1         
	//   12   22:getfield        #364 <Field int TypedValue.data>
	//   13   25:ifeq            30
	//   14   28:iconst_1        
	//   15   29:ireturn         
	//   16   30:iconst_0        
	//   17   31:ireturn         
	}

	static boolean a(View view)
	{
		if(view.onCheckIsTextEditor())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #368 <Method boolean View.onCheckIsTextEditor()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(!(view instanceof ViewGroup))
	//*   5    9:aload_0         
	//*   6   10:instanceof      #199 <Class ViewGroup>
	//*   7   13:ifne            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		view = ((View) ((ViewGroup)view));
	//   10   18:aload_0         
	//   11   19:checkcast       #199 <Class ViewGroup>
	//   12   22:astore_0        
		for(int i1 = ((ViewGroup) (view)).getChildCount(); i1 > 0;)
	//*  13   23:aload_0         
	//*  14   24:invokevirtual   #372 <Method int ViewGroup.getChildCount()>
	//*  15   27:istore_1        
	//*  16   28:iload_1         
	//*  17   29:ifle            51
		{
			int j1 = i1 - 1;
	//   18   32:iload_1         
	//   19   33:iconst_1        
	//   20   34:isub            
	//   21   35:istore_2        
			i1 = j1;
	//   22   36:iload_2         
	//   23   37:istore_1        
			if(a(((ViewGroup) (view)).getChildAt(j1)))
	//*  24   38:aload_0         
	//*  25   39:iload_2         
	//*  26   40:invokevirtual   #375 <Method View ViewGroup.getChildAt(int)>
	//*  27   43:invokestatic    #234 <Method boolean a(View)>
	//*  28   46:ifeq            28
				return true;
	//   29   49:iconst_1        
	//   30   50:ireturn         
		}

		return false;
	//   31   51:iconst_0        
	//   32   52:ireturn         
	}

	private int b()
	{
		if(L == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field int L>
	//*   2    4:ifne            12
			return K;
	//    3    7:aload_0         
	//    4    8:getfield        #147 <Field int K>
	//    5   11:ireturn         
		if(N == 1)
	//*   6   12:aload_0         
	//*   7   13:getfield        #103 <Field int N>
	//*   8   16:iconst_1        
	//*   9   17:icmpne          25
			return L;
	//   10   20:aload_0         
	//   11   21:getfield        #152 <Field int L>
	//   12   24:ireturn         
		else
			return K;
	//   13   25:aload_0         
	//   14   26:getfield        #147 <Field int K>
	//   15   29:ireturn         
	}

	private void b(ViewGroup viewgroup)
	{
		if(J != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #377 <Field View J>
	//*   2    4:ifnull          44
		{
			android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-1, -2);
	//    3    7:new             #254 <Class android.view.ViewGroup$LayoutParams>
	//    4   10:dup             
	//    5   11:iconst_m1       
	//    6   12:bipush          -2
	//    7   14:invokespecial   #256 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//    8   17:astore_2        
			viewgroup.addView(J, 0, layoutparams);
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:getfield        #377 <Field View J>
	//   12   23:iconst_0        
	//   13   24:aload_2         
	//   14   25:invokevirtual   #380 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
			r.findViewById(android.support.v7.a.a.f.title_template).setVisibility(8);
	//   15   28:aload_0         
	//   16   29:getfield        #114 <Field Window r>
	//   17   32:getstatic       #383 <Field int android.support.v7.a.a$f.title_template>
	//   18   35:invokevirtual   #250 <Method View Window.findViewById(int)>
	//   19   38:bipush          8
	//   20   40:invokevirtual   #217 <Method void View.setVisibility(int)>
			return;
	//   21   43:return          
		}
		G = (ImageView)r.findViewById(0x1020006);
	//   22   44:aload_0         
	//   23   45:aload_0         
	//   24   46:getfield        #114 <Field Window r>
	//   25   49:ldc2            #384 <Int 0x1020006>
	//   26   52:invokevirtual   #250 <Method View Window.findViewById(int)>
	//   27   55:checkcast       #386 <Class ImageView>
	//   28   58:putfield        #388 <Field ImageView G>
		if(TextUtils.isEmpty(s) ^ true && M)
	//*  29   61:aload_0         
	//*  30   62:getfield        #390 <Field CharSequence s>
	//*  31   65:invokestatic    #396 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  32   68:iconst_1        
	//*  33   69:ixor            
	//*  34   70:ifeq            191
	//*  35   73:aload_0         
	//*  36   74:getfield        #181 <Field boolean M>
	//*  37   77:ifeq            191
		{
			H = (TextView)r.findViewById(android.support.v7.a.a.f.alertTitle);
	//   38   80:aload_0         
	//   39   81:aload_0         
	//   40   82:getfield        #114 <Field Window r>
	//   41   85:getstatic       #399 <Field int android.support.v7.a.a$f.alertTitle>
	//   42   88:invokevirtual   #250 <Method View Window.findViewById(int)>
	//   43   91:checkcast       #401 <Class TextView>
	//   44   94:putfield        #403 <Field TextView H>
			H.setText(s);
	//   45   97:aload_0         
	//   46   98:getfield        #403 <Field TextView H>
	//   47  101:aload_0         
	//   48  102:getfield        #390 <Field CharSequence s>
	//   49  105:invokevirtual   #407 <Method void TextView.setText(CharSequence)>
			if(E != 0)
	//*  50  108:aload_0         
	//*  51  109:getfield        #99  <Field int E>
	//*  52  112:ifeq            127
			{
				G.setImageResource(E);
	//   53  115:aload_0         
	//   54  116:getfield        #388 <Field ImageView G>
	//   55  119:aload_0         
	//   56  120:getfield        #99  <Field int E>
	//   57  123:invokevirtual   #410 <Method void ImageView.setImageResource(int)>
				return;
	//   58  126:return          
			}
			if(F != null)
	//*  59  127:aload_0         
	//*  60  128:getfield        #412 <Field Drawable F>
	//*  61  131:ifnull          146
			{
				G.setImageDrawable(F);
	//   62  134:aload_0         
	//   63  135:getfield        #388 <Field ImageView G>
	//   64  138:aload_0         
	//   65  139:getfield        #412 <Field Drawable F>
	//   66  142:invokevirtual   #416 <Method void ImageView.setImageDrawable(Drawable)>
				return;
	//   67  145:return          
			} else
			{
				H.setPadding(G.getPaddingLeft(), G.getPaddingTop(), G.getPaddingRight(), G.getPaddingBottom());
	//   68  146:aload_0         
	//   69  147:getfield        #403 <Field TextView H>
	//   70  150:aload_0         
	//   71  151:getfield        #388 <Field ImageView G>
	//   72  154:invokevirtual   #419 <Method int ImageView.getPaddingLeft()>
	//   73  157:aload_0         
	//   74  158:getfield        #388 <Field ImageView G>
	//   75  161:invokevirtual   #422 <Method int ImageView.getPaddingTop()>
	//   76  164:aload_0         
	//   77  165:getfield        #388 <Field ImageView G>
	//   78  168:invokevirtual   #425 <Method int ImageView.getPaddingRight()>
	//   79  171:aload_0         
	//   80  172:getfield        #388 <Field ImageView G>
	//   81  175:invokevirtual   #428 <Method int ImageView.getPaddingBottom()>
	//   82  178:invokevirtual   #429 <Method void TextView.setPadding(int, int, int, int)>
				G.setVisibility(8);
	//   83  181:aload_0         
	//   84  182:getfield        #388 <Field ImageView G>
	//   85  185:bipush          8
	//   86  187:invokevirtual   #430 <Method void ImageView.setVisibility(int)>
				return;
	//   87  190:return          
			}
		} else
		{
			r.findViewById(android.support.v7.a.a.f.title_template).setVisibility(8);
	//   88  191:aload_0         
	//   89  192:getfield        #114 <Field Window r>
	//   90  195:getstatic       #383 <Field int android.support.v7.a.a$f.title_template>
	//   91  198:invokevirtual   #250 <Method View Window.findViewById(int)>
	//   92  201:bipush          8
	//   93  203:invokevirtual   #217 <Method void View.setVisibility(int)>
			G.setVisibility(8);
	//   94  206:aload_0         
	//   95  207:getfield        #388 <Field ImageView G>
	//   96  210:bipush          8
	//   97  212:invokevirtual   #430 <Method void ImageView.setVisibility(int)>
			viewgroup.setVisibility(8);
	//   98  215:aload_1         
	//   99  216:bipush          8
	//  100  218:invokevirtual   #283 <Method void ViewGroup.setVisibility(int)>
			return;
	//  101  221:return          
		}
	}

	private void c()
	{
		Object obj3 = ((Object) (r.findViewById(android.support.v7.a.a.f.parentPanel)));
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field Window r>
	//    2    4:getstatic       #433 <Field int android.support.v7.a.a$f.parentPanel>
	//    3    7:invokevirtual   #250 <Method View Window.findViewById(int)>
	//    4   10:astore          8
		Object obj2 = ((Object) (((View) (obj3)).findViewById(android.support.v7.a.a.f.topPanel)));
	//    5   12:aload           8
	//    6   14:getstatic       #436 <Field int android.support.v7.a.a$f.topPanel>
	//    7   17:invokevirtual   #437 <Method View View.findViewById(int)>
	//    8   20:astore          7
		Object obj1 = ((Object) (((View) (obj3)).findViewById(android.support.v7.a.a.f.contentPanel)));
	//    9   22:aload           8
	//   10   24:getstatic       #440 <Field int android.support.v7.a.a$f.contentPanel>
	//   11   27:invokevirtual   #437 <Method View View.findViewById(int)>
	//   12   30:astore          6
		Object obj = ((Object) (((View) (obj3)).findViewById(android.support.v7.a.a.f.buttonPanel)));
	//   13   32:aload           8
	//   14   34:getstatic       #443 <Field int android.support.v7.a.a$f.buttonPanel>
	//   15   37:invokevirtual   #437 <Method View View.findViewById(int)>
	//   16   40:astore          5
		obj3 = ((Object) ((ViewGroup)((View) (obj3)).findViewById(android.support.v7.a.a.f.customPanel)));
	//   17   42:aload           8
	//   18   44:getstatic       #446 <Field int android.support.v7.a.a$f.customPanel>
	//   19   47:invokevirtual   #437 <Method View View.findViewById(int)>
	//   20   50:checkcast       #199 <Class ViewGroup>
	//   21   53:astore          8
		a(((ViewGroup) (obj3)));
	//   22   55:aload_0         
	//   23   56:aload           8
	//   24   58:invokespecial   #448 <Method void a(ViewGroup)>
		View view2 = ((ViewGroup) (obj3)).findViewById(android.support.v7.a.a.f.topPanel);
	//   25   61:aload           8
	//   26   63:getstatic       #436 <Field int android.support.v7.a.a$f.topPanel>
	//   27   66:invokevirtual   #449 <Method View ViewGroup.findViewById(int)>
	//   28   69:astore          11
		View view1 = ((ViewGroup) (obj3)).findViewById(android.support.v7.a.a.f.contentPanel);
	//   29   71:aload           8
	//   30   73:getstatic       #440 <Field int android.support.v7.a.a$f.contentPanel>
	//   31   76:invokevirtual   #449 <Method View ViewGroup.findViewById(int)>
	//   32   79:astore          10
		View view = ((ViewGroup) (obj3)).findViewById(android.support.v7.a.a.f.buttonPanel);
	//   33   81:aload           8
	//   34   83:getstatic       #443 <Field int android.support.v7.a.a$f.buttonPanel>
	//   35   86:invokevirtual   #449 <Method View ViewGroup.findViewById(int)>
	//   36   89:astore          9
		obj2 = ((Object) (a(view2, ((View) (obj2)))));
	//   37   91:aload_0         
	//   38   92:aload           11
	//   39   94:aload           7
	//   40   96:invokespecial   #451 <Method ViewGroup a(View, View)>
	//   41   99:astore          7
		obj1 = ((Object) (a(view1, ((View) (obj1)))));
	//   42  101:aload_0         
	//   43  102:aload           10
	//   44  104:aload           6
	//   45  106:invokespecial   #451 <Method ViewGroup a(View, View)>
	//   46  109:astore          6
		obj = ((Object) (a(view, ((View) (obj)))));
	//   47  111:aload_0         
	//   48  112:aload           9
	//   49  114:aload           5
	//   50  116:invokespecial   #451 <Method ViewGroup a(View, View)>
	//   51  119:astore          5
		c(((ViewGroup) (obj1)));
	//   52  121:aload_0         
	//   53  122:aload           6
	//   54  124:invokespecial   #453 <Method void c(ViewGroup)>
		d(((ViewGroup) (obj)));
	//   55  127:aload_0         
	//   56  128:aload           5
	//   57  130:invokespecial   #455 <Method void d(ViewGroup)>
		b(((ViewGroup) (obj2)));
	//   58  133:aload_0         
	//   59  134:aload           7
	//   60  136:invokespecial   #457 <Method void b(ViewGroup)>
		boolean flag1 = false;
	//   61  139:iconst_0        
	//   62  140:istore_2        
		boolean flag;
		if(obj3 != null && ((ViewGroup) (obj3)).getVisibility() != 8)
	//*  63  141:aload           8
	//*  64  143:ifnull          161
	//*  65  146:aload           8
	//*  66  148:invokevirtual   #460 <Method int ViewGroup.getVisibility()>
	//*  67  151:bipush          8
	//*  68  153:icmpeq          161
			flag = true;
	//   69  156:iconst_1        
	//   70  157:istore_1        
		else
	//*  71  158:goto            163
			flag = false;
	//   72  161:iconst_0        
	//   73  162:istore_1        
		boolean flag2;
		if(obj2 != null && ((ViewGroup) (obj2)).getVisibility() != 8)
	//*  74  163:aload           7
	//*  75  165:ifnull          183
	//*  76  168:aload           7
	//*  77  170:invokevirtual   #460 <Method int ViewGroup.getVisibility()>
	//*  78  173:bipush          8
	//*  79  175:icmpeq          183
			flag2 = true;
	//   80  178:iconst_1        
	//   81  179:istore_3        
		else
	//*  82  180:goto            185
			flag2 = false;
	//   83  183:iconst_0        
	//   84  184:istore_3        
		boolean flag3;
		if(obj != null && ((ViewGroup) (obj)).getVisibility() != 8)
	//*  85  185:aload           5
	//*  86  187:ifnull          206
	//*  87  190:aload           5
	//*  88  192:invokevirtual   #460 <Method int ViewGroup.getVisibility()>
	//*  89  195:bipush          8
	//*  90  197:icmpeq          206
			flag3 = true;
	//   91  200:iconst_1        
	//   92  201:istore          4
		else
	//*  93  203:goto            209
			flag3 = false;
	//   94  206:iconst_0        
	//   95  207:istore          4
		if(!flag3 && obj1 != null)
	//*  96  209:iload           4
	//*  97  211:ifne            240
	//*  98  214:aload           6
	//*  99  216:ifnull          240
		{
			obj = ((Object) (((ViewGroup) (obj1)).findViewById(android.support.v7.a.a.f.textSpacerNoButtons)));
	//  100  219:aload           6
	//  101  221:getstatic       #463 <Field int android.support.v7.a.a$f.textSpacerNoButtons>
	//  102  224:invokevirtual   #449 <Method View ViewGroup.findViewById(int)>
	//  103  227:astore          5
			if(obj != null)
	//* 104  229:aload           5
	//* 105  231:ifnull          240
				((View) (obj)).setVisibility(0);
	//  106  234:aload           5
	//  107  236:iconst_0        
	//  108  237:invokevirtual   #217 <Method void View.setVisibility(int)>
		}
		if(flag2)
	//* 109  240:iload_3         
	//* 110  241:ifeq            300
		{
			if(i != null)
	//* 111  244:aload_0         
	//* 112  245:getfield        #304 <Field NestedScrollView i>
	//* 113  248:ifnull          259
				i.setClipToPadding(true);
	//  114  251:aload_0         
	//  115  252:getfield        #304 <Field NestedScrollView i>
	//  116  255:iconst_1        
	//  117  256:invokevirtual   #467 <Method void NestedScrollView.setClipToPadding(boolean)>
			obj = null;
	//  118  259:aconst_null     
	//  119  260:astore          5
			if(t != null || b != null)
	//* 120  262:aload_0         
	//* 121  263:getfield        #302 <Field CharSequence t>
	//* 122  266:ifnonnull       276
	//* 123  269:aload_0         
	//* 124  270:getfield        #274 <Field ListView b>
	//* 125  273:ifnull          286
				obj = ((Object) (((ViewGroup) (obj2)).findViewById(android.support.v7.a.a.f.titleDividerNoCustom)));
	//  126  276:aload           7
	//  127  278:getstatic       #470 <Field int android.support.v7.a.a$f.titleDividerNoCustom>
	//  128  281:invokevirtual   #449 <Method View ViewGroup.findViewById(int)>
	//  129  284:astore          5
			if(obj != null)
	//* 130  286:aload           5
	//* 131  288:ifnull          326
				((View) (obj)).setVisibility(0);
	//  132  291:aload           5
	//  133  293:iconst_0        
	//  134  294:invokevirtual   #217 <Method void View.setVisibility(int)>
		} else
	//* 135  297:goto            326
		if(obj1 != null)
	//* 136  300:aload           6
	//* 137  302:ifnull          326
		{
			obj = ((Object) (((ViewGroup) (obj1)).findViewById(android.support.v7.a.a.f.textSpacerNoTitle)));
	//  138  305:aload           6
	//  139  307:getstatic       #473 <Field int android.support.v7.a.a$f.textSpacerNoTitle>
	//  140  310:invokevirtual   #449 <Method View ViewGroup.findViewById(int)>
	//  141  313:astore          5
			if(obj != null)
	//* 142  315:aload           5
	//* 143  317:ifnull          326
				((View) (obj)).setVisibility(0);
	//  144  320:aload           5
	//  145  322:iconst_0        
	//  146  323:invokevirtual   #217 <Method void View.setVisibility(int)>
		}
		if(b instanceof RecycleListView)
	//* 147  326:aload_0         
	//* 148  327:getfield        #274 <Field ListView b>
	//* 149  330:instanceof      #16  <Class AlertController$RecycleListView>
	//* 150  333:ifeq            349
			((RecycleListView)b).a(flag2, flag3);
	//  151  336:aload_0         
	//  152  337:getfield        #274 <Field ListView b>
	//  153  340:checkcast       #16  <Class AlertController$RecycleListView>
	//  154  343:iload_3         
	//  155  344:iload           4
	//  156  346:invokevirtual   #476 <Method void AlertController$RecycleListView.a(boolean, boolean)>
		if(!flag)
	//* 157  349:iload_1         
	//* 158  350:ifne            401
		{
			if(b != null)
	//* 159  353:aload_0         
	//* 160  354:getfield        #274 <Field ListView b>
	//* 161  357:ifnull          369
				obj = ((Object) (b));
	//  162  360:aload_0         
	//  163  361:getfield        #274 <Field ListView b>
	//  164  364:astore          5
			else
	//* 165  366:goto            375
				obj = ((Object) (i));
	//  166  369:aload_0         
	//  167  370:getfield        #304 <Field NestedScrollView i>
	//  168  373:astore          5
			if(obj != null)
	//* 169  375:aload           5
	//* 170  377:ifnull          401
			{
				byte byte0 = ((byte) (flag1));
	//  171  380:iload_2         
	//  172  381:istore_1        
				if(flag3)
	//* 173  382:iload           4
	//* 174  384:ifeq            389
					byte0 = 2;
	//  175  387:iconst_2        
	//  176  388:istore_1        
				a(((ViewGroup) (obj1)), ((View) (obj)), flag2 | byte0, 3);
	//  177  389:aload_0         
	//  178  390:aload           6
	//  179  392:aload           5
	//  180  394:iload_3         
	//  181  395:iload_1         
	//  182  396:ior             
	//  183  397:iconst_3        
	//  184  398:invokespecial   #478 <Method void a(ViewGroup, View, int, int)>
			}
		}
		obj = ((Object) (b));
	//  185  401:aload_0         
	//  186  402:getfield        #274 <Field ListView b>
	//  187  405:astore          5
		if(obj != null && j != null)
	//* 188  407:aload           5
	//* 189  409:ifnull          451
	//* 190  412:aload_0         
	//* 191  413:getfield        #480 <Field ListAdapter j>
	//* 192  416:ifnull          451
		{
			((ListView) (obj)).setAdapter(j);
	//  193  419:aload           5
	//  194  421:aload_0         
	//  195  422:getfield        #480 <Field ListAdapter j>
	//  196  425:invokevirtual   #484 <Method void ListView.setAdapter(ListAdapter)>
			int i1 = k;
	//  197  428:aload_0         
	//  198  429:getfield        #101 <Field int k>
	//  199  432:istore_1        
			if(i1 > -1)
	//* 200  433:iload_1         
	//* 201  434:iconst_m1       
	//* 202  435:icmple          451
			{
				((ListView) (obj)).setItemChecked(i1, true);
	//  203  438:aload           5
	//  204  440:iload_1         
	//  205  441:iconst_1        
	//  206  442:invokevirtual   #488 <Method void ListView.setItemChecked(int, boolean)>
				((ListView) (obj)).setSelection(i1);
	//  207  445:aload           5
	//  208  447:iload_1         
	//  209  448:invokevirtual   #491 <Method void ListView.setSelection(int)>
			}
		}
	//  210  451:return          
	}

	private void c(ViewGroup viewgroup)
	{
		i = (NestedScrollView)r.findViewById(android.support.v7.a.a.f.scrollView);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #114 <Field Window r>
	//    3    5:getstatic       #494 <Field int android.support.v7.a.a$f.scrollView>
	//    4    8:invokevirtual   #250 <Method View Window.findViewById(int)>
	//    5   11:checkcast       #309 <Class NestedScrollView>
	//    6   14:putfield        #304 <Field NestedScrollView i>
		i.setFocusable(false);
	//    7   17:aload_0         
	//    8   18:getfield        #304 <Field NestedScrollView i>
	//    9   21:iconst_0        
	//   10   22:invokevirtual   #497 <Method void NestedScrollView.setFocusable(boolean)>
		i.setNestedScrollingEnabled(false);
	//   11   25:aload_0         
	//   12   26:getfield        #304 <Field NestedScrollView i>
	//   13   29:iconst_0        
	//   14   30:invokevirtual   #500 <Method void NestedScrollView.setNestedScrollingEnabled(boolean)>
		I = (TextView)viewgroup.findViewById(0x102000b);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:ldc2            #501 <Int 0x102000b>
	//   18   38:invokevirtual   #449 <Method View ViewGroup.findViewById(int)>
	//   19   41:checkcast       #401 <Class TextView>
	//   20   44:putfield        #503 <Field TextView I>
		if(I == null)
	//*  21   47:aload_0         
	//*  22   48:getfield        #503 <Field TextView I>
	//*  23   51:ifnonnull       55
			return;
	//   24   54:return          
		if(t != null)
	//*  25   55:aload_0         
	//*  26   56:getfield        #302 <Field CharSequence t>
	//*  27   59:ifnull          74
		{
			I.setText(t);
	//   28   62:aload_0         
	//   29   63:getfield        #503 <Field TextView I>
	//   30   66:aload_0         
	//   31   67:getfield        #302 <Field CharSequence t>
	//   32   70:invokevirtual   #407 <Method void TextView.setText(CharSequence)>
			return;
	//   33   73:return          
		}
		I.setVisibility(8);
	//   34   74:aload_0         
	//   35   75:getfield        #503 <Field TextView I>
	//   36   78:bipush          8
	//   37   80:invokevirtual   #504 <Method void TextView.setVisibility(int)>
		i.removeView(((View) (I)));
	//   38   83:aload_0         
	//   39   84:getfield        #304 <Field NestedScrollView i>
	//   40   87:aload_0         
	//   41   88:getfield        #503 <Field TextView I>
	//   42   91:invokevirtual   #505 <Method void NestedScrollView.removeView(View)>
		if(b != null)
	//*  43   94:aload_0         
	//*  44   95:getfield        #274 <Field ListView b>
	//*  45   98:ifnull          145
		{
			viewgroup = (ViewGroup)i.getParent();
	//   46  101:aload_0         
	//   47  102:getfield        #304 <Field NestedScrollView i>
	//   48  105:invokevirtual   #506 <Method android.view.ViewParent NestedScrollView.getParent()>
	//   49  108:checkcast       #199 <Class ViewGroup>
	//   50  111:astore_1        
			int i1 = viewgroup.indexOfChild(((View) (i)));
	//   51  112:aload_1         
	//   52  113:aload_0         
	//   53  114:getfield        #304 <Field NestedScrollView i>
	//   54  117:invokevirtual   #510 <Method int ViewGroup.indexOfChild(View)>
	//   55  120:istore_2        
			viewgroup.removeViewAt(i1);
	//   56  121:aload_1         
	//   57  122:iload_2         
	//   58  123:invokevirtual   #513 <Method void ViewGroup.removeViewAt(int)>
			viewgroup.addView(((View) (b)), i1, new android.view.ViewGroup.LayoutParams(-1, -1));
	//   59  126:aload_1         
	//   60  127:aload_0         
	//   61  128:getfield        #274 <Field ListView b>
	//   62  131:iload_2         
	//   63  132:new             #254 <Class android.view.ViewGroup$LayoutParams>
	//   64  135:dup             
	//   65  136:iconst_m1       
	//   66  137:iconst_m1       
	//   67  138:invokespecial   #256 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   68  141:invokevirtual   #380 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   69  144:return          
		} else
		{
			viewgroup.setVisibility(8);
	//   70  145:aload_1         
	//   71  146:bipush          8
	//   72  148:invokevirtual   #283 <Method void ViewGroup.setVisibility(int)>
			return;
	//   73  151:return          
		}
	}

	private void d(ViewGroup viewgroup)
	{
		int i1;
		boolean flag1;
		c = (Button)viewgroup.findViewById(0x1020019);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #514 <Int 0x1020019>
	//    3    5:invokevirtual   #449 <Method View ViewGroup.findViewById(int)>
	//    4    8:checkcast       #330 <Class Button>
	//    5   11:putfield        #516 <Field Button c>
		c.setOnClickListener(O);
	//    6   14:aload_0         
	//    7   15:getfield        #516 <Field Button c>
	//    8   18:aload_0         
	//    9   19:getfield        #108 <Field android.view.View$OnClickListener O>
	//   10   22:invokevirtual   #520 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		boolean flag2 = TextUtils.isEmpty(B);
	//   11   25:aload_0         
	//   12   26:getfield        #522 <Field CharSequence B>
	//   13   29:invokestatic    #396 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   14   32:istore          4
		flag1 = true;
	//   15   34:iconst_1        
	//   16   35:istore_3        
		if(flag2)
	//*  17   36:iload           4
	//*  18   38:ifeq            55
		{
			c.setVisibility(8);
	//   19   41:aload_0         
	//   20   42:getfield        #516 <Field Button c>
	//   21   45:bipush          8
	//   22   47:invokevirtual   #523 <Method void Button.setVisibility(int)>
			i1 = 0;
	//   23   50:iconst_0        
	//   24   51:istore_2        
		} else
	//*  25   52:goto            76
		{
			c.setText(B);
	//   26   55:aload_0         
	//   27   56:getfield        #516 <Field Button c>
	//   28   59:aload_0         
	//   29   60:getfield        #522 <Field CharSequence B>
	//   30   63:invokevirtual   #524 <Method void Button.setText(CharSequence)>
			c.setVisibility(0);
	//   31   66:aload_0         
	//   32   67:getfield        #516 <Field Button c>
	//   33   70:iconst_0        
	//   34   71:invokevirtual   #523 <Method void Button.setVisibility(int)>
			i1 = 1;
	//   35   74:iconst_1        
	//   36   75:istore_2        
		}
		e = (Button)viewgroup.findViewById(0x102001a);
	//   37   76:aload_0         
	//   38   77:aload_1         
	//   39   78:ldc2            #525 <Int 0x102001a>
	//   40   81:invokevirtual   #449 <Method View ViewGroup.findViewById(int)>
	//   41   84:checkcast       #330 <Class Button>
	//   42   87:putfield        #527 <Field Button e>
		e.setOnClickListener(O);
	//   43   90:aload_0         
	//   44   91:getfield        #527 <Field Button e>
	//   45   94:aload_0         
	//   46   95:getfield        #108 <Field android.view.View$OnClickListener O>
	//   47   98:invokevirtual   #520 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(TextUtils.isEmpty(C))
	//*  48  101:aload_0         
	//*  49  102:getfield        #529 <Field CharSequence C>
	//*  50  105:invokestatic    #396 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  51  108:ifeq            123
		{
			e.setVisibility(8);
	//   52  111:aload_0         
	//   53  112:getfield        #527 <Field Button e>
	//   54  115:bipush          8
	//   55  117:invokevirtual   #523 <Method void Button.setVisibility(int)>
		} else
	//*  56  120:goto            146
		{
			e.setText(C);
	//   57  123:aload_0         
	//   58  124:getfield        #527 <Field Button e>
	//   59  127:aload_0         
	//   60  128:getfield        #529 <Field CharSequence C>
	//   61  131:invokevirtual   #524 <Method void Button.setText(CharSequence)>
			e.setVisibility(0);
	//   62  134:aload_0         
	//   63  135:getfield        #527 <Field Button e>
	//   64  138:iconst_0        
	//   65  139:invokevirtual   #523 <Method void Button.setVisibility(int)>
			i1 |= 2;
	//   66  142:iload_2         
	//   67  143:iconst_2        
	//   68  144:ior             
	//   69  145:istore_2        
		}
		g = (Button)viewgroup.findViewById(0x102001b);
	//   70  146:aload_0         
	//   71  147:aload_1         
	//   72  148:ldc2            #530 <Int 0x102001b>
	//   73  151:invokevirtual   #449 <Method View ViewGroup.findViewById(int)>
	//   74  154:checkcast       #330 <Class Button>
	//   75  157:putfield        #532 <Field Button g>
		g.setOnClickListener(O);
	//   76  160:aload_0         
	//   77  161:getfield        #532 <Field Button g>
	//   78  164:aload_0         
	//   79  165:getfield        #108 <Field android.view.View$OnClickListener O>
	//   80  168:invokevirtual   #520 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(TextUtils.isEmpty(D))
	//*  81  171:aload_0         
	//*  82  172:getfield        #534 <Field CharSequence D>
	//*  83  175:invokestatic    #396 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  84  178:ifeq            193
		{
			g.setVisibility(8);
	//   85  181:aload_0         
	//   86  182:getfield        #532 <Field Button g>
	//   87  185:bipush          8
	//   88  187:invokevirtual   #523 <Method void Button.setVisibility(int)>
		} else
	//*  89  190:goto            216
		{
			g.setText(D);
	//   90  193:aload_0         
	//   91  194:getfield        #532 <Field Button g>
	//   92  197:aload_0         
	//   93  198:getfield        #534 <Field CharSequence D>
	//   94  201:invokevirtual   #524 <Method void Button.setText(CharSequence)>
			g.setVisibility(0);
	//   95  204:aload_0         
	//   96  205:getfield        #532 <Field Button g>
	//   97  208:iconst_0        
	//   98  209:invokevirtual   #523 <Method void Button.setVisibility(int)>
			i1 |= 4;
	//   99  212:iload_2         
	//  100  213:iconst_4        
	//  101  214:ior             
	//  102  215:istore_2        
		}
		if(!a(q)) goto _L2; else goto _L1
	//  103  216:aload_0         
	//  104  217:getfield        #110 <Field Context q>
	//  105  220:invokestatic    #536 <Method boolean a(Context)>
	//  106  223:ifeq            274
_L1:
		if(i1 != 1) goto _L4; else goto _L3
	//  107  226:iload_2         
	//  108  227:iconst_1        
	//  109  228:icmpne          246
_L3:
		Button button = c;
	//  110  231:aload_0         
	//  111  232:getfield        #516 <Field Button c>
	//  112  235:astore          5
_L5:
		a(button);
	//  113  237:aload_0         
	//  114  238:aload           5
	//  115  240:invokespecial   #538 <Method void a(Button)>
		break; /* Loop/switch isn't completed */
	//  116  243:goto            274
_L4:
		if(i1 == 2)
	//* 117  246:iload_2         
	//* 118  247:iconst_2        
	//* 119  248:icmpne          260
		{
			button = e;
	//  120  251:aload_0         
	//  121  252:getfield        #527 <Field Button e>
	//  122  255:astore          5
			continue; /* Loop/switch isn't completed */
	//  123  257:goto            237
		}
		if(i1 != 4)
			break; /* Loop/switch isn't completed */
	//  124  260:iload_2         
	//  125  261:iconst_4        
	//  126  262:icmpne          274
		button = g;
	//  127  265:aload_0         
	//  128  266:getfield        #532 <Field Button g>
	//  129  269:astore          5
		if(true) goto _L5; else goto _L2
	//  130  271:goto            237
_L2:
		boolean flag;
		if(i1 != 0)
	//* 131  274:iload_2         
	//* 132  275:ifeq            283
			flag = flag1;
	//  133  278:iload_3         
	//  134  279:istore_2        
		else
	//* 135  280:goto            285
			flag = false;
	//  136  283:iconst_0        
	//  137  284:istore_2        
		if(!flag)
	//* 138  285:iload_2         
	//* 139  286:ifne            295
			viewgroup.setVisibility(8);
	//  140  289:aload_1         
	//  141  290:bipush          8
	//  142  292:invokevirtual   #283 <Method void ViewGroup.setVisibility(int)>
		return;
	//  143  295:return          
	}

	public void a()
	{
		int i1 = b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #540 <Method int b()>
	//    2    4:istore_1        
		a.setContentView(i1);
	//    3    5:aload_0         
	//    4    6:getfield        #112 <Field i a>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #543 <Method void i.setContentView(int)>
		c();
	//    7   13:aload_0         
	//    8   14:invokespecial   #545 <Method void c()>
	//    9   17:return          
	}

	public void a(int i1)
	{
		u = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #220 <Field View u>
		v = i1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #222 <Field int v>
		A = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #97  <Field boolean A>
	//    9   15:return          
	}

	public void a(int i1, CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener, Message message)
	{
		Message message1 = message;
	//    0    0:aload           4
	//    1    2:astore          5
		if(message == null)
	//*   2    4:aload           4
	//*   3    6:ifnonnull       28
		{
			message1 = message;
	//    4    9:aload           4
	//    5   11:astore          5
			if(onclicklistener != null)
	//*   6   13:aload_3         
	//*   7   14:ifnull          28
				message1 = p.obtainMessage(i1, ((Object) (onclicklistener)));
	//    8   17:aload_0         
	//    9   18:getfield        #119 <Field Handler p>
	//   10   21:iload_1         
	//   11   22:aload_3         
	//   12   23:invokevirtual   #552 <Method Message Handler.obtainMessage(int, Object)>
	//   13   26:astore          5
		}
		switch(i1)
	//*  14   28:iload_1         
		{
	//*  15   29:tableswitch     -3 -1: default 56
	//	               -3 91
	//	               -2 79
	//	               -1 67
		default:
			throw new IllegalArgumentException("Button does not exist");
	//   16   56:new             #554 <Class IllegalArgumentException>
	//   17   59:dup             
	//   18   60:ldc2            #556 <String "Button does not exist">
	//   19   63:invokespecial   #559 <Method void IllegalArgumentException(String)>
	//   20   66:athrow          

		case -1: 
			B = charsequence;
	//   21   67:aload_0         
	//   22   68:aload_2         
	//   23   69:putfield        #522 <Field CharSequence B>
			d = message1;
	//   24   72:aload_0         
	//   25   73:aload           5
	//   26   75:putfield        #561 <Field Message d>
			return;
	//   27   78:return          

		case -2: 
			C = charsequence;
	//   28   79:aload_0         
	//   29   80:aload_2         
	//   30   81:putfield        #529 <Field CharSequence C>
			f = message1;
	//   31   84:aload_0         
	//   32   85:aload           5
	//   33   87:putfield        #563 <Field Message f>
			return;
	//   34   90:return          

		case -3: 
			D = charsequence;
	//   35   91:aload_0         
	//   36   92:aload_2         
	//   37   93:putfield        #534 <Field CharSequence D>
			h = message1;
	//   38   96:aload_0         
	//   39   97:aload           5
	//   40   99:putfield        #565 <Field Message h>
			return;
	//   41  102:return          
		}
	}

	public void a(Drawable drawable)
	{
		F = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #412 <Field Drawable F>
		E = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #99  <Field int E>
		if(G != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #388 <Field ImageView G>
	//*   8   14:ifnull          47
		{
			if(drawable != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          38
			{
				G.setVisibility(0);
	//   11   21:aload_0         
	//   12   22:getfield        #388 <Field ImageView G>
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #430 <Method void ImageView.setVisibility(int)>
				G.setImageDrawable(drawable);
	//   15   29:aload_0         
	//   16   30:getfield        #388 <Field ImageView G>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #416 <Method void ImageView.setImageDrawable(Drawable)>
				return;
	//   19   37:return          
			}
			G.setVisibility(8);
	//   20   38:aload_0         
	//   21   39:getfield        #388 <Field ImageView G>
	//   22   42:bipush          8
	//   23   44:invokevirtual   #430 <Method void ImageView.setVisibility(int)>
		}
	//   24   47:return          
	}

	public void a(View view, int i1, int j1, int k1, int l1)
	{
		u = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #220 <Field View u>
		v = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #222 <Field int v>
		A = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #97  <Field boolean A>
		w = i1;
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:putfield        #262 <Field int w>
		x = j1;
	//   12   20:aload_0         
	//   13   21:iload_3         
	//   14   22:putfield        #264 <Field int x>
		y = k1;
	//   15   25:aload_0         
	//   16   26:iload           4
	//   17   28:putfield        #266 <Field int y>
		z = l1;
	//   18   31:aload_0         
	//   19   32:iload           5
	//   20   34:putfield        #268 <Field int z>
	//   21   37:return          
	}

	public void a(CharSequence charsequence)
	{
		s = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #390 <Field CharSequence s>
		if(H != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #403 <Field TextView H>
	//*   5    9:ifnull          20
			H.setText(charsequence);
	//    6   12:aload_0         
	//    7   13:getfield        #403 <Field TextView H>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #407 <Method void TextView.setText(CharSequence)>
	//   10   20:return          
	}

	public boolean a(int i1, KeyEvent keyevent)
	{
		return i != null && i.a(keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #304 <Field NestedScrollView i>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #304 <Field NestedScrollView i>
	//    5   11:aload_2         
	//    6   12:invokevirtual   #570 <Method boolean NestedScrollView.a(KeyEvent)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public void b(int i1)
	{
		F = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #412 <Field Drawable F>
		E = i1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #99  <Field int E>
		if(G != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #388 <Field ImageView G>
	//*   8   14:ifnull          50
		{
			if(i1 != 0)
	//*   9   17:iload_1         
	//*  10   18:ifeq            41
			{
				G.setVisibility(0);
	//   11   21:aload_0         
	//   12   22:getfield        #388 <Field ImageView G>
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #430 <Method void ImageView.setVisibility(int)>
				G.setImageResource(E);
	//   15   29:aload_0         
	//   16   30:getfield        #388 <Field ImageView G>
	//   17   33:aload_0         
	//   18   34:getfield        #99  <Field int E>
	//   19   37:invokevirtual   #410 <Method void ImageView.setImageResource(int)>
				return;
	//   20   40:return          
			}
			G.setVisibility(8);
	//   21   41:aload_0         
	//   22   42:getfield        #388 <Field ImageView G>
	//   23   45:bipush          8
	//   24   47:invokevirtual   #430 <Method void ImageView.setVisibility(int)>
		}
	//   25   50:return          
	}

	public void b(View view)
	{
		J = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #377 <Field View J>
	//    3    5:return          
	}

	public void b(CharSequence charsequence)
	{
		t = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #302 <Field CharSequence t>
		if(I != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #503 <Field TextView I>
	//*   5    9:ifnull          20
			I.setText(charsequence);
	//    6   12:aload_0         
	//    7   13:getfield        #503 <Field TextView I>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #407 <Method void TextView.setText(CharSequence)>
	//   10   20:return          
	}

	public boolean b(int i1, KeyEvent keyevent)
	{
		return i != null && i.a(keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #304 <Field NestedScrollView i>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #304 <Field NestedScrollView i>
	//    5   11:aload_2         
	//    6   12:invokevirtual   #570 <Method boolean NestedScrollView.a(KeyEvent)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public int c(int i1)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #347 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #348 <Method void TypedValue()>
	//    3    7:astore_2        
		q.getTheme().resolveAttribute(i1, typedvalue, true);
	//    4    8:aload_0         
	//    5    9:getfield        #110 <Field Context q>
	//    6   12:invokevirtual   #352 <Method android.content.res.Resources$Theme Context.getTheme()>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #361 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   11   21:pop             
		return typedvalue.resourceId;
	//   12   22:aload_2         
	//   13   23:getfield        #574 <Field int TypedValue.resourceId>
	//   14   26:ireturn         
	}

	public void c(View view)
	{
		u = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #220 <Field View u>
		v = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #222 <Field int v>
		A = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #97  <Field boolean A>
	//    9   15:return          
	}

	public Button d(int i1)
	{
		switch(i1)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     -3 -1: default 28
	//	               -3 40
	//	               -2 35
	//	               -1 30
		default:
			return null;
	//    2   28:aconst_null     
	//    3   29:areturn         

		case -1: 
			return c;
	//    4   30:aload_0         
	//    5   31:getfield        #516 <Field Button c>
	//    6   34:areturn         

		case -2: 
			return e;
	//    7   35:aload_0         
	//    8   36:getfield        #527 <Field Button e>
	//    9   39:areturn         

		case -3: 
			return g;
	//   10   40:aload_0         
	//   11   41:getfield        #532 <Field Button g>
	//   12   44:areturn         
		}
	}

	private boolean A;
	private CharSequence B;
	private CharSequence C;
	private CharSequence D;
	private int E;
	private Drawable F;
	private ImageView G;
	private TextView H;
	private TextView I;
	private View J;
	private int K;
	private int L;
	private boolean M;
	private int N;
	private final android.view.View.OnClickListener O = new android.view.View.OnClickListener() {

		public void onClick(View view)
		{
			if(view != a.c || a.d == null) goto _L2; else goto _L1
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #14  <Field AlertController a>
		//    3    5:getfield        #24  <Field Button AlertController.c>
		//    4    8:if_acmpne       37
		//    5   11:aload_0         
		//    6   12:getfield        #14  <Field AlertController a>
		//    7   15:getfield        #28  <Field Message AlertController.d>
		//    8   18:ifnull          37
_L1:
			view = ((View) (a.d));
		//    9   21:aload_0         
		//   10   22:getfield        #14  <Field AlertController a>
		//   11   25:getfield        #28  <Field Message AlertController.d>
		//   12   28:astore_1        
_L4:
			view = ((View) (Message.obtain(((Message) (view)))));
		//   13   29:aload_1         
		//   14   30:invokestatic    #34  <Method Message Message.obtain(Message)>
		//   15   33:astore_1        
			break MISSING_BLOCK_LABEL_103;
		//   16   34:goto            103
_L2:
			if(view == a.e && a.f != null)
		//*  17   37:aload_1         
		//*  18   38:aload_0         
		//*  19   39:getfield        #14  <Field AlertController a>
		//*  20   42:getfield        #37  <Field Button AlertController.e>
		//*  21   45:if_acmpne       69
		//*  22   48:aload_0         
		//*  23   49:getfield        #14  <Field AlertController a>
		//*  24   52:getfield        #40  <Field Message AlertController.f>
		//*  25   55:ifnull          69
			{
				view = ((View) (a.f));
		//   26   58:aload_0         
		//   27   59:getfield        #14  <Field AlertController a>
		//   28   62:getfield        #40  <Field Message AlertController.f>
		//   29   65:astore_1        
				continue; /* Loop/switch isn't completed */
		//   30   66:goto            29
			}
			if(view != a.g || a.h == null)
				break; /* Loop/switch isn't completed */
		//   31   69:aload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #14  <Field AlertController a>
		//   34   74:getfield        #43  <Field Button AlertController.g>
		//   35   77:if_acmpne       101
		//   36   80:aload_0         
		//   37   81:getfield        #14  <Field AlertController a>
		//   38   84:getfield        #46  <Field Message AlertController.h>
		//   39   87:ifnull          101
			view = ((View) (a.h));
		//   40   90:aload_0         
		//   41   91:getfield        #14  <Field AlertController a>
		//   42   94:getfield        #46  <Field Message AlertController.h>
		//   43   97:astore_1        
			if(true) goto _L4; else goto _L3
		//   44   98:goto            29
_L3:
			view = null;
		//   45  101:aconst_null     
		//   46  102:astore_1        
			if(view != null)
		//*  47  103:aload_1         
		//*  48  104:ifnull          111
				((Message) (view)).sendToTarget();
		//   49  107:aload_1         
		//   50  108:invokevirtual   #49  <Method void Message.sendToTarget()>
			a.p.obtainMessage(1, ((Object) (a.a))).sendToTarget();
		//   51  111:aload_0         
		//   52  112:getfield        #14  <Field AlertController a>
		//   53  115:getfield        #53  <Field Handler AlertController.p>
		//   54  118:iconst_1        
		//   55  119:aload_0         
		//   56  120:getfield        #14  <Field AlertController a>
		//   57  123:getfield        #56  <Field i AlertController.a>
		//   58  126:invokevirtual   #62  <Method Message Handler.obtainMessage(int, Object)>
		//   59  129:invokevirtual   #49  <Method void Message.sendToTarget()>
			return;
		//   60  132:return          
		}

		final AlertController a;

			
			{
				a = AlertController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field AlertController a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	final i a;
	ListView b;
	Button c;
	Message d;
	Button e;
	Message f;
	Button g;
	Message h;
	NestedScrollView i;
	ListAdapter j;
	int k;
	int l;
	int m;
	int n;
	int o;
	Handler p;
	private final Context q;
	private final Window r;
	private CharSequence s;
	private CharSequence t;
	private View u;
	private int v;
	private int w;
	private int x;
	private int y;
	private int z;
}

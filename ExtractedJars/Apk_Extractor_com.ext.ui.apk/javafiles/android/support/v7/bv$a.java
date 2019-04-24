// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package android.support.v7:
//			bv

class bv$a extends android.support.v7.widget.lerView.ViewHolder
{

	ImageView a;
	TextView b;
	TextView c;
	ImageView d;
	ImageView e;
	final bv f;

	public bv$a(bv bv1, View view)
	{
		f = bv1;
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
		view.setOnLongClickListener(new android.view.View.OnLongClickListener(bv1) {

			public boolean onLongClick(View view1)
			{
				bv.a(b.f).b(view1, b.getAdapterPosition());
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
			final bv.a b;

			
			{
				b = bv.a.this;
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
);
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

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.view.ViewGroup;
import biz.bookdesign.catalogbase.i;

// Referenced classes of package biz.bookdesign.librivox:
//			LibriVoxDetailsActivity, bw, cg

class ci extends i
{

	ci(LibriVoxDetailsActivity librivoxdetailsactivity, ViewGroup viewgroup)
	{
		a = librivoxdetailsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field LibriVoxDetailsActivity a>
		super(((biz.bookdesign.catalogbase.bm) (librivoxdetailsactivity.e)), LibriVoxDetailsActivity.c(librivoxdetailsactivity), ((android.support.v4.app.x) (librivoxdetailsactivity)), viewgroup, true, LibriVoxDetailsActivity.e(librivoxdetailsactivity));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #16  <Field biz.bookdesign.librivox.client.o LibriVoxDetailsActivity.e>
	//    6   10:aload_1         
	//    7   11:invokestatic    #20  <Method biz.bookdesign.catalogbase.u LibriVoxDetailsActivity.c(LibriVoxDetailsActivity)>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:iconst_1        
	//   11   17:aload_1         
	//   12   18:invokestatic    #23  <Method biz.bookdesign.catalogbase.q LibriVoxDetailsActivity.e(LibriVoxDetailsActivity)>
	//   13   21:invokespecial   #26  <Method void i(biz.bookdesign.catalogbase.bm, biz.bookdesign.catalogbase.u, android.support.v4.app.x, ViewGroup, boolean, biz.bookdesign.catalogbase.q)>
	//   14   24:return          
	}

	public int getItemCount()
	{
		int j = super.getItemCount();
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method int i.getItemCount()>
	//    2    4:istore_1        
		if(LibriVoxDetailsActivity.f(a))
	//*   3    5:aload_0         
	//*   4    6:getfield        #10  <Field LibriVoxDetailsActivity a>
	//*   5    9:invokestatic    #35  <Method boolean LibriVoxDetailsActivity.f(LibriVoxDetailsActivity)>
	//*   6   12:ifeq            17
			return j;
	//    7   15:iload_1         
	//    8   16:ireturn         
		else
			return j + (j / (LibriVoxDetailsActivity.g(a) - 1) + 1);
	//    9   17:iload_1         
	//   10   18:iload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #10  <Field LibriVoxDetailsActivity a>
	//   13   23:invokestatic    #39  <Method int LibriVoxDetailsActivity.g(LibriVoxDetailsActivity)>
	//   14   26:iconst_1        
	//   15   27:isub            
	//   16   28:idiv            
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:iadd            
	//   20   32:ireturn         
	}

	public int getItemViewType(int j)
	{
		return !LibriVoxDetailsActivity.c(a, j) ? 0 : 1;
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field LibriVoxDetailsActivity a>
	//    2    4:iload_1         
	//    3    5:invokestatic    #44  <Method boolean LibriVoxDetailsActivity.c(LibriVoxDetailsActivity, int)>
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int j)
	{
		if(!LibriVoxDetailsActivity.c(a, j))
	//*   0    0:aload_0         
	//*   1    1:getfield        #10  <Field LibriVoxDetailsActivity a>
	//*   2    4:iload_2         
	//*   3    5:invokestatic    #44  <Method boolean LibriVoxDetailsActivity.c(LibriVoxDetailsActivity, int)>
	//*   4    8:ifne            24
			super.onBindViewHolder(viewholder, LibriVoxDetailsActivity.d(a, j));
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #10  <Field LibriVoxDetailsActivity a>
	//    9   17:iload_2         
	//   10   18:invokestatic    #50  <Method int LibriVoxDetailsActivity.d(LibriVoxDetailsActivity, int)>
	//   11   21:invokespecial   #52  <Method void i.onBindViewHolder(android.support.v7.widget.RecyclerView$ViewHolder, int)>
	//   12   24:return          
	}

	public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int j)
	{
		switch(j)
	//*   0    0:iload_2         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 85
	//	               1 57
		default:
			viewgroup = ((ViewGroup) (new StringBuilder()));
	//    2   24:new             #56  <Class StringBuilder>
	//    3   27:dup             
	//    4   28:invokespecial   #59  <Method void StringBuilder()>
	//    5   31:astore_1        
			((StringBuilder) (viewgroup)).append("Unexpected view type ");
	//    6   32:aload_1         
	//    7   33:ldc1            #61  <String "Unexpected view type ">
	//    8   35:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//    9   38:pop             
			((StringBuilder) (viewgroup)).append(j);
	//   10   39:aload_1         
	//   11   40:iload_2         
	//   12   41:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//   13   44:pop             
			throw new IllegalStateException(((StringBuilder) (viewgroup)).toString());
	//   14   45:new             #70  <Class IllegalStateException>
	//   15   48:dup             
	//   16   49:aload_1         
	//   17   50:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   18   53:invokespecial   #77  <Method void IllegalStateException(String)>
	//   19   56:athrow          

		case 1: // '\001'
			viewgroup = ((ViewGroup) (((bw)bw.g()).a(((android.support.v4.app.x) (a)), viewgroup)));
	//   20   57:invokestatic    #82  <Method biz.bookdesign.catalogbase.a bw.g()>
	//   21   60:checkcast       #79  <Class bw>
	//   22   63:aload_0         
	//   23   64:getfield        #10  <Field LibriVoxDetailsActivity a>
	//   24   67:aload_1         
	//   25   68:invokevirtual   #85  <Method android.view.View bw.a(android.support.v4.app.x, ViewGroup)>
	//   26   71:astore_1        
			return ((android.support.v7.widget.RecyclerView.ViewHolder) (new cg(a, ((android.view.View) (viewgroup)))));
	//   27   72:new             #87  <Class cg>
	//   28   75:dup             
	//   29   76:aload_0         
	//   30   77:getfield        #10  <Field LibriVoxDetailsActivity a>
	//   31   80:aload_1         
	//   32   81:invokespecial   #90  <Method void cg(LibriVoxDetailsActivity, android.view.View)>
	//   33   84:areturn         

		case 0: // '\0'
			return super.onCreateViewHolder(viewgroup, j);
	//   34   85:aload_0         
	//   35   86:aload_1         
	//   36   87:iload_2         
	//   37   88:invokespecial   #92  <Method android.support.v7.widget.RecyclerView$ViewHolder i.onCreateViewHolder(ViewGroup, int)>
	//   38   91:areturn         
		}
	}

	final LibriVoxDetailsActivity a;
}

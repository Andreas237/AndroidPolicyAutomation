// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.support.v7.widget.RecyclerView;
import biz.bookdesign.catalogbase.a;
import biz.bookdesign.catalogbase.ay;

// Referenced classes of package biz.bookdesign.librivox:
//			ce, LibriVoxDetailsActivity, ci

class cf extends ay
{

	cf(ce ce1)
	{
		b = ce1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field ce b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void ay()>
	//    5    9:return          
	}

	public Void a()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field biz.bookdesign.catalogbase.u a>
	//*   2    4:ifnonnull       27
		{
			biz.bookdesign.librivox.LibriVoxDetailsActivity.a(b.d, b.a);
	//    3    7:aload_0         
	//    4    8:getfield        #10  <Field ce b>
	//    5   11:getfield        #25  <Field LibriVoxDetailsActivity ce.d>
	//    6   14:aload_0         
	//    7   15:getfield        #10  <Field ce b>
	//    8   18:getfield        #28  <Field RecyclerView biz.bookdesign.librivox.ce.a>
	//    9   21:invokestatic    #33  <Method void biz.bookdesign.librivox.LibriVoxDetailsActivity.a(LibriVoxDetailsActivity, RecyclerView)>
		} else
	//*  10   24:goto            121
		{
			biz.bookdesign.librivox.LibriVoxDetailsActivity.a(b.d, a);
	//   11   27:aload_0         
	//   12   28:getfield        #10  <Field ce b>
	//   13   31:getfield        #25  <Field LibriVoxDetailsActivity ce.d>
	//   14   34:aload_0         
	//   15   35:getfield        #19  <Field biz.bookdesign.catalogbase.u a>
	//   16   38:invokestatic    #36  <Method biz.bookdesign.catalogbase.u biz.bookdesign.librivox.LibriVoxDetailsActivity.a(LibriVoxDetailsActivity, biz.bookdesign.catalogbase.u)>
	//   17   41:pop             
			biz.bookdesign.librivox.LibriVoxDetailsActivity.a(b.d, new ci(b.d, b.b));
	//   18   42:aload_0         
	//   19   43:getfield        #10  <Field ce b>
	//   20   46:getfield        #25  <Field LibriVoxDetailsActivity ce.d>
	//   21   49:new             #38  <Class ci>
	//   22   52:dup             
	//   23   53:aload_0         
	//   24   54:getfield        #10  <Field ce b>
	//   25   57:getfield        #25  <Field LibriVoxDetailsActivity ce.d>
	//   26   60:aload_0         
	//   27   61:getfield        #10  <Field ce b>
	//   28   64:getfield        #41  <Field android.view.ViewGroup ce.b>
	//   29   67:invokespecial   #44  <Method void ci(LibriVoxDetailsActivity, android.view.ViewGroup)>
	//   30   70:invokestatic    #47  <Method ci biz.bookdesign.librivox.LibriVoxDetailsActivity.a(LibriVoxDetailsActivity, ci)>
	//   31   73:pop             
			b.a.setAdapter(((android.support.v7.widget.RecyclerView.Adapter) (LibriVoxDetailsActivity.d(b.d))));
	//   32   74:aload_0         
	//   33   75:getfield        #10  <Field ce b>
	//   34   78:getfield        #28  <Field RecyclerView biz.bookdesign.librivox.ce.a>
	//   35   81:aload_0         
	//   36   82:getfield        #10  <Field ce b>
	//   37   85:getfield        #25  <Field LibriVoxDetailsActivity ce.d>
	//   38   88:invokestatic    #50  <Method ci LibriVoxDetailsActivity.d(LibriVoxDetailsActivity)>
	//   39   91:invokevirtual   #56  <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$Adapter)>
			biz.bookdesign.librivox.LibriVoxDetailsActivity.a(b.d, b.a);
	//   40   94:aload_0         
	//   41   95:getfield        #10  <Field ce b>
	//   42   98:getfield        #25  <Field LibriVoxDetailsActivity ce.d>
	//   43  101:aload_0         
	//   44  102:getfield        #10  <Field ce b>
	//   45  105:getfield        #28  <Field RecyclerView biz.bookdesign.librivox.ce.a>
	//   46  108:invokestatic    #33  <Method void biz.bookdesign.librivox.LibriVoxDetailsActivity.a(LibriVoxDetailsActivity, RecyclerView)>
			biz.bookdesign.catalogbase.a.g().a(a);
	//   47  111:invokestatic    #62  <Method a a.g()>
	//   48  114:aload_0         
	//   49  115:getfield        #19  <Field biz.bookdesign.catalogbase.u a>
	//   50  118:invokevirtual   #65  <Method void a.a(biz.bookdesign.catalogbase.u)>
		}
		return null;
	//   51  121:aconst_null     
	//   52  122:areturn         
	}

	public Object call()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method Void a()>
	//    2    4:areturn         
	}

	final ce b;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bab, bav, bbq, akh, 
//			ahi

public final class bac extends bab
{

	private bac(Context context, String s, boolean flag)
	{
		super(context, s, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #8   <Method void bab(Context, String, boolean)>
	//    5    7:return          
	}

	public static bac a(String s, Context context, boolean flag)
	{
		a(context, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #14  <Method void a(Context, boolean)>
		return new bac(context, s, flag);
	//    3    5:new             #2   <Class bac>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokespecial   #15  <Method void bac(Context, String, boolean)>
	//    9   15:areturn         
	}

	protected final List a(bav bav1, Context context, akh akh, ahi ahi)
	{
		if(bav1.c() != null && r)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #22  <Method java.util.concurrent.ExecutorService bav.c()>
	//*   2    4:ifnull          77
	//*   3    7:aload_0         
	//*   4    8:getfield        #26  <Field boolean r>
	//*   5   11:ifne            17
	//*   6   14:goto            77
		{
			int i = bav1.n();
	//    7   17:aload_1         
	//    8   18:invokevirtual   #30  <Method int bav.n()>
	//    9   21:istore          5
			ArrayList arraylist = new ArrayList();
	//   10   23:new             #32  <Class ArrayList>
	//   11   26:dup             
	//   12   27:invokespecial   #35  <Method void ArrayList()>
	//   13   30:astore          6
			((List) (arraylist)).addAll(((java.util.Collection) (super.a(bav1, context, akh, ahi))));
	//   14   32:aload           6
	//   15   34:aload_0         
	//   16   35:aload_1         
	//   17   36:aload_2         
	//   18   37:aload_3         
	//   19   38:aload           4
	//   20   40:invokespecial   #37  <Method List bab.a(bav, Context, akh, ahi)>
	//   21   43:invokeinterface #43  <Method boolean List.addAll(java.util.Collection)>
	//   22   48:pop             
			((List) (arraylist)).add(((Object) (new bbq(bav1, "DPtJycwRqj/e0TdTHULzeUhZhWJ1IU3iwhH90sUbn4eYKEdB5HI7UC0PtJgg2RSN", "Ye7G7hL63+8nOBoyCAHdjfK62rvCOKz3+aC1KA/K9CI=", akh, i, 24))));
	//   23   49:aload           6
	//   24   51:new             #45  <Class bbq>
	//   25   54:dup             
	//   26   55:aload_1         
	//   27   56:ldc1            #47  <String "DPtJycwRqj/e0TdTHULzeUhZhWJ1IU3iwhH90sUbn4eYKEdB5HI7UC0PtJgg2RSN">
	//   28   58:ldc1            #49  <String "Ye7G7hL63+8nOBoyCAHdjfK62rvCOKz3+aC1KA/K9CI=">
	//   29   60:aload_3         
	//   30   61:iload           5
	//   31   63:bipush          24
	//   32   65:invokespecial   #52  <Method void bbq(bav, String, String, akh, int, int)>
	//   33   68:invokeinterface #56  <Method boolean List.add(Object)>
	//   34   73:pop             
			return ((List) (arraylist));
	//   35   74:aload           6
	//   36   76:areturn         
		} else
		{
			return super.a(bav1, context, akh, ahi);
	//   37   77:aload_0         
	//   38   78:aload_1         
	//   39   79:aload_2         
	//   40   80:aload_3         
	//   41   81:aload           4
	//   42   83:invokespecial   #37  <Method List bab.a(bav, Context, akh, ahi)>
	//   43   86:areturn         
		}
	}
}

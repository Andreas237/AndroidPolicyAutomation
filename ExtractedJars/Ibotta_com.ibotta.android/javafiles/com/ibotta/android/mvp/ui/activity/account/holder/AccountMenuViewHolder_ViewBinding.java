// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.holder:
//			AccountMenuViewHolder

public class AccountMenuViewHolder_ViewBinding
	implements Unbinder
{

	public AccountMenuViewHolder_ViewBinding(AccountMenuViewHolder accountmenuviewholder, View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		target = accountmenuviewholder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field AccountMenuViewHolder target>
		accountmenuviewholder.ivIcon = (ImageView)Utils.findRequiredViewAsType(view, 0x7f0902ac, "field 'ivIcon'", android/widget/ImageView);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:ldc1            #17  <Int 0x7f0902ac>
	//    8   13:ldc1            #19  <String "field 'ivIcon'">
	//    9   15:ldc1            #21  <Class ImageView>
	//   10   17:invokestatic    #27  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   11   20:checkcast       #21  <Class ImageView>
	//   12   23:putfield        #33  <Field ImageView AccountMenuViewHolder.ivIcon>
		accountmenuviewholder.tvName = (TextView)Utils.findRequiredViewAsType(view, 0x7f09054d, "field 'tvName'", android/widget/TextView);
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:ldc1            #34  <Int 0x7f09054d>
	//   16   30:ldc1            #36  <String "field 'tvName'">
	//   17   32:ldc1            #38  <Class TextView>
	//   18   34:invokestatic    #27  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   19   37:checkcast       #38  <Class TextView>
	//   20   40:putfield        #42  <Field TextView AccountMenuViewHolder.tvName>
		accountmenuviewholder.tvExtra = (TextView)Utils.findRequiredViewAsType(view, 0x7f090522, "field 'tvExtra'", android/widget/TextView);
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:ldc1            #43  <Int 0x7f090522>
	//   24   47:ldc1            #45  <String "field 'tvExtra'">
	//   25   49:ldc1            #38  <Class TextView>
	//   26   51:invokestatic    #27  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   27   54:checkcast       #38  <Class TextView>
	//   28   57:putfield        #48  <Field TextView AccountMenuViewHolder.tvExtra>
	//   29   60:return          
	}

	public void unbind()
	{
		AccountMenuViewHolder accountmenuviewholder = target;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AccountMenuViewHolder target>
	//    2    4:astore_1        
		if(accountmenuviewholder != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          30
		{
			target = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #16  <Field AccountMenuViewHolder target>
			accountmenuviewholder.ivIcon = null;
	//    8   14:aload_1         
	//    9   15:aconst_null     
	//   10   16:putfield        #33  <Field ImageView AccountMenuViewHolder.ivIcon>
			accountmenuviewholder.tvName = null;
	//   11   19:aload_1         
	//   12   20:aconst_null     
	//   13   21:putfield        #42  <Field TextView AccountMenuViewHolder.tvName>
			accountmenuviewholder.tvExtra = null;
	//   14   24:aload_1         
	//   15   25:aconst_null     
	//   16   26:putfield        #48  <Field TextView AccountMenuViewHolder.tvExtra>
			return;
	//   17   29:return          
		} else
		{
			throw new IllegalStateException("Bindings already cleared.");
	//   18   30:new             #54  <Class IllegalStateException>
	//   19   33:dup             
	//   20   34:ldc1            #56  <String "Bindings already cleared.">
	//   21   36:invokespecial   #59  <Method void IllegalStateException(String)>
	//   22   39:athrow          
		}
	}

	private AccountMenuViewHolder target;
}

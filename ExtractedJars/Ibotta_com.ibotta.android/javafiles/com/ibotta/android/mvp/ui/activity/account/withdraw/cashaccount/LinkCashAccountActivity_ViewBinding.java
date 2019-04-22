// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.cashaccount;

import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.view.Window;
import android.widget.*;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ibotta.android.views.base.title.TitleBarView;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.cashaccount:
//			LinkCashAccountActivity

public class LinkCashAccountActivity_ViewBinding
	implements Unbinder
{

	public LinkCashAccountActivity_ViewBinding(LinkCashAccountActivity linkcashaccountactivity)
	{
		this(linkcashaccountactivity, linkcashaccountactivity.getWindow().getDecorView());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #17  <Method Window LinkCashAccountActivity.getWindow()>
	//    4    6:invokevirtual   #23  <Method View Window.getDecorView()>
	//    5    9:invokespecial   #26  <Method void LinkCashAccountActivity_ViewBinding(LinkCashAccountActivity, View)>
	//    6   12:return          
	}

	public LinkCashAccountActivity_ViewBinding(LinkCashAccountActivity linkcashaccountactivity, View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		target = linkcashaccountactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field LinkCashAccountActivity target>
		linkcashaccountactivity.tbvLinkAccount = (TitleBarView)Utils.findRequiredViewAsType(view, 0x7f090449, "field 'tbvLinkAccount'", com/ibotta/android/views/base/title/TitleBarView);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:ldc1            #34  <Int 0x7f090449>
	//    8   13:ldc1            #36  <String "field 'tbvLinkAccount'">
	//    9   15:ldc1            #38  <Class TitleBarView>
	//   10   17:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   11   20:checkcast       #38  <Class TitleBarView>
	//   12   23:putfield        #48  <Field TitleBarView LinkCashAccountActivity.tbvLinkAccount>
		linkcashaccountactivity.ivLogo = (ImageView)Utils.findRequiredViewAsType(view, 0x7f0902b4, "field 'ivLogo'", android/widget/ImageView);
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:ldc1            #49  <Int 0x7f0902b4>
	//   16   30:ldc1            #51  <String "field 'ivLogo'">
	//   17   32:ldc1            #53  <Class ImageView>
	//   18   34:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   19   37:checkcast       #53  <Class ImageView>
	//   20   40:putfield        #57  <Field ImageView LinkCashAccountActivity.ivLogo>
		linkcashaccountactivity.tilFirstName = (TextInputLayout)Utils.findRequiredViewAsType(view, 0x7f09046f, "field 'tilFirstName'", android/support/design/widget/TextInputLayout);
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:ldc1            #58  <Int 0x7f09046f>
	//   24   47:ldc1            #60  <String "field 'tilFirstName'">
	//   25   49:ldc1            #62  <Class TextInputLayout>
	//   26   51:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   27   54:checkcast       #62  <Class TextInputLayout>
	//   28   57:putfield        #66  <Field TextInputLayout LinkCashAccountActivity.tilFirstName>
		linkcashaccountactivity.etFirstName = (EditText)Utils.findRequiredViewAsType(view, 0x7f0901c7, "field 'etFirstName'", android/widget/EditText);
	//   29   60:aload_1         
	//   30   61:aload_2         
	//   31   62:ldc1            #67  <Int 0x7f0901c7>
	//   32   64:ldc1            #69  <String "field 'etFirstName'">
	//   33   66:ldc1            #71  <Class EditText>
	//   34   68:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   35   71:checkcast       #71  <Class EditText>
	//   36   74:putfield        #75  <Field EditText LinkCashAccountActivity.etFirstName>
		linkcashaccountactivity.tilLastName = (TextInputLayout)Utils.findRequiredViewAsType(view, 0x7f090472, "field 'tilLastName'", android/support/design/widget/TextInputLayout);
	//   37   77:aload_1         
	//   38   78:aload_2         
	//   39   79:ldc1            #76  <Int 0x7f090472>
	//   40   81:ldc1            #78  <String "field 'tilLastName'">
	//   41   83:ldc1            #62  <Class TextInputLayout>
	//   42   85:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   43   88:checkcast       #62  <Class TextInputLayout>
	//   44   91:putfield        #81  <Field TextInputLayout LinkCashAccountActivity.tilLastName>
		linkcashaccountactivity.etLastName = (EditText)Utils.findRequiredViewAsType(view, 0x7f0901cc, "field 'etLastName'", android/widget/EditText);
	//   45   94:aload_1         
	//   46   95:aload_2         
	//   47   96:ldc1            #82  <Int 0x7f0901cc>
	//   48   98:ldc1            #84  <String "field 'etLastName'">
	//   49  100:ldc1            #71  <Class EditText>
	//   50  102:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   51  105:checkcast       #71  <Class EditText>
	//   52  108:putfield        #87  <Field EditText LinkCashAccountActivity.etLastName>
		linkcashaccountactivity.tilEmailName = (TextInputLayout)Utils.findRequiredViewAsType(view, 0x7f09046e, "field 'tilEmailName'", android/support/design/widget/TextInputLayout);
	//   53  111:aload_1         
	//   54  112:aload_2         
	//   55  113:ldc1            #88  <Int 0x7f09046e>
	//   56  115:ldc1            #90  <String "field 'tilEmailName'">
	//   57  117:ldc1            #62  <Class TextInputLayout>
	//   58  119:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   59  122:checkcast       #62  <Class TextInputLayout>
	//   60  125:putfield        #93  <Field TextInputLayout LinkCashAccountActivity.tilEmailName>
		linkcashaccountactivity.etEmail = (EditText)Utils.findRequiredViewAsType(view, 0x7f0901c5, "field 'etEmail'", android/widget/EditText);
	//   61  128:aload_1         
	//   62  129:aload_2         
	//   63  130:ldc1            #94  <Int 0x7f0901c5>
	//   64  132:ldc1            #96  <String "field 'etEmail'">
	//   65  134:ldc1            #71  <Class EditText>
	//   66  136:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   67  139:checkcast       #71  <Class EditText>
	//   68  142:putfield        #99  <Field EditText LinkCashAccountActivity.etEmail>
		linkcashaccountactivity.bLinkAccount = (Button)Utils.findRequiredViewAsType(view, 0x7f090091, "field 'bLinkAccount'", android/widget/Button);
	//   69  145:aload_1         
	//   70  146:aload_2         
	//   71  147:ldc1            #100 <Int 0x7f090091>
	//   72  149:ldc1            #102 <String "field 'bLinkAccount'">
	//   73  151:ldc1            #104 <Class Button>
	//   74  153:invokestatic    #44  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   75  156:checkcast       #104 <Class Button>
	//   76  159:putfield        #108 <Field Button LinkCashAccountActivity.bLinkAccount>
	//   77  162:return          
	}

	public void unbind()
	{
		LinkCashAccountActivity linkcashaccountactivity = target;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field LinkCashAccountActivity target>
	//    2    4:astore_1        
		if(linkcashaccountactivity != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          60
		{
			target = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #33  <Field LinkCashAccountActivity target>
			linkcashaccountactivity.tbvLinkAccount = null;
	//    8   14:aload_1         
	//    9   15:aconst_null     
	//   10   16:putfield        #48  <Field TitleBarView LinkCashAccountActivity.tbvLinkAccount>
			linkcashaccountactivity.ivLogo = null;
	//   11   19:aload_1         
	//   12   20:aconst_null     
	//   13   21:putfield        #57  <Field ImageView LinkCashAccountActivity.ivLogo>
			linkcashaccountactivity.tilFirstName = null;
	//   14   24:aload_1         
	//   15   25:aconst_null     
	//   16   26:putfield        #66  <Field TextInputLayout LinkCashAccountActivity.tilFirstName>
			linkcashaccountactivity.etFirstName = null;
	//   17   29:aload_1         
	//   18   30:aconst_null     
	//   19   31:putfield        #75  <Field EditText LinkCashAccountActivity.etFirstName>
			linkcashaccountactivity.tilLastName = null;
	//   20   34:aload_1         
	//   21   35:aconst_null     
	//   22   36:putfield        #81  <Field TextInputLayout LinkCashAccountActivity.tilLastName>
			linkcashaccountactivity.etLastName = null;
	//   23   39:aload_1         
	//   24   40:aconst_null     
	//   25   41:putfield        #87  <Field EditText LinkCashAccountActivity.etLastName>
			linkcashaccountactivity.tilEmailName = null;
	//   26   44:aload_1         
	//   27   45:aconst_null     
	//   28   46:putfield        #93  <Field TextInputLayout LinkCashAccountActivity.tilEmailName>
			linkcashaccountactivity.etEmail = null;
	//   29   49:aload_1         
	//   30   50:aconst_null     
	//   31   51:putfield        #99  <Field EditText LinkCashAccountActivity.etEmail>
			linkcashaccountactivity.bLinkAccount = null;
	//   32   54:aload_1         
	//   33   55:aconst_null     
	//   34   56:putfield        #108 <Field Button LinkCashAccountActivity.bLinkAccount>
			return;
	//   35   59:return          
		} else
		{
			throw new IllegalStateException("Bindings already cleared.");
	//   36   60:new             #112 <Class IllegalStateException>
	//   37   63:dup             
	//   38   64:ldc1            #114 <String "Bindings already cleared.">
	//   39   66:invokespecial   #117 <Method void IllegalStateException(String)>
	//   40   69:athrow          
		}
	}

	private LinkCashAccountActivity target;
}

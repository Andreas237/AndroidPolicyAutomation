// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.irobot.core.*;

// Referenced classes of package com.irobot.home.fragments:
//			x

class x$1
	implements TextWatcher
{

	public void afterTextChanged(Editable editable)
	{
		editable = ((Editable) (((Object) (a.b.getText())).toString()));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field x a>
	//    2    4:getfield        #25  <Field EditText x.b>
	//    3    7:invokevirtual   #31  <Method Editable EditText.getText()>
	//    4   10:invokevirtual   #35  <Method String Object.toString()>
	//    5   13:astore_1        
		boolean flag;
		if(editable != null && AssetValidationResult.Valid == CommonUtilities.validateAssetName(((String) (editable))))
	//*   6   14:aload_1         
	//*   7   15:ifnull          77
	//*   8   18:getstatic       #41  <Field AssetValidationResult AssetValidationResult.Valid>
	//*   9   21:aload_1         
	//*  10   22:invokestatic    #47  <Method AssetValidationResult CommonUtilities.validateAssetName(String)>
	//*  11   25:if_acmpne       77
		{
			a.d = ((String) (editable));
	//   12   28:aload_0         
	//   13   29:getfield        #16  <Field x a>
	//   14   32:aload_1         
	//   15   33:putfield        #51  <Field String x.d>
			AssetSetupUIService assetsetupuiservice = Assembler.getInstance().getAssetSetupUIService();
	//   16   36:invokestatic    #57  <Method Assembler Assembler.getInstance()>
	//   17   39:invokevirtual   #61  <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//   18   42:astore_3        
			if(assetsetupuiservice != null)
	//*  19   43:aload_3         
	//*  20   44:ifnull          67
			{
				AssetSetupUIServiceData assetsetupuiservicedata = AssetSetupUIServiceData.create();
	//   21   47:invokestatic    #67  <Method AssetSetupUIServiceData AssetSetupUIServiceData.create()>
	//   22   50:astore          4
				assetsetupuiservicedata.setAssetName(((String) (editable)));
	//   23   52:aload           4
	//   24   54:aload_1         
	//   25   55:invokevirtual   #71  <Method void AssetSetupUIServiceData.setAssetName(String)>
				assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.UpdateServiceData, assetsetupuiservicedata);
	//   26   58:aload_3         
	//   27   59:getstatic       #77  <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.UpdateServiceData>
	//   28   62:aload           4
	//   29   64:invokevirtual   #83  <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
			}
			editable = ((Editable) (a));
	//   30   67:aload_0         
	//   31   68:getfield        #16  <Field x a>
	//   32   71:astore_1        
			flag = true;
	//   33   72:iconst_1        
	//   34   73:istore_2        
		} else
	//*  35   74:goto            84
		{
			editable = ((Editable) (a));
	//   36   77:aload_0         
	//   37   78:getfield        #16  <Field x a>
	//   38   81:astore_1        
			flag = false;
	//   39   82:iconst_0        
	//   40   83:istore_2        
		}
		x.a(((x) (editable)), flag);
	//   41   84:aload_1         
	//   42   85:iload_2         
	//   43   86:invokestatic    #86  <Method void x.a(x, boolean)>
	//   44   89:return          
	}

	public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
		charsequence = ((CharSequence) (charsequence.toString()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #92  <Method String CharSequence.toString()>
	//    2    6:astore_1        
		if(((String) (charsequence)).isEmpty())
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #98  <Method boolean String.isEmpty()>
	//*   5   11:ifeq            24
		{
			a.d = "";
	//    6   14:aload_0         
	//    7   15:getfield        #16  <Field x a>
	//    8   18:ldc1            #100 <String "">
	//    9   20:putfield        #51  <Field String x.d>
			return;
	//   10   23:return          
		}
		if(AssetValidationResult.Valid != CommonUtilities.validateAssetName(((String) (charsequence))))
	//*  11   24:getstatic       #41  <Field AssetValidationResult AssetValidationResult.Valid>
	//*  12   27:aload_1         
	//*  13   28:invokestatic    #47  <Method AssetValidationResult CommonUtilities.validateAssetName(String)>
	//*  14   31:if_acmpeq       103
		{
			a.b.removeTextChangedListener(((TextWatcher) (this)));
	//   15   34:aload_0         
	//   16   35:getfield        #16  <Field x a>
	//   17   38:getfield        #25  <Field EditText x.b>
	//   18   41:aload_0         
	//   19   42:invokevirtual   #104 <Method void EditText.removeTextChangedListener(TextWatcher)>
			a.b.setText(((CharSequence) (a.d)));
	//   20   45:aload_0         
	//   21   46:getfield        #16  <Field x a>
	//   22   49:getfield        #25  <Field EditText x.b>
	//   23   52:aload_0         
	//   24   53:getfield        #16  <Field x a>
	//   25   56:getfield        #51  <Field String x.d>
	//   26   59:invokevirtual   #108 <Method void EditText.setText(CharSequence)>
			if(a.d != null)
	//*  27   62:aload_0         
	//*  28   63:getfield        #16  <Field x a>
	//*  29   66:getfield        #51  <Field String x.d>
	//*  30   69:ifnull          92
				a.b.setSelection(a.d.length());
	//   31   72:aload_0         
	//   32   73:getfield        #16  <Field x a>
	//   33   76:getfield        #25  <Field EditText x.b>
	//   34   79:aload_0         
	//   35   80:getfield        #16  <Field x a>
	//   36   83:getfield        #51  <Field String x.d>
	//   37   86:invokevirtual   #112 <Method int String.length()>
	//   38   89:invokevirtual   #116 <Method void EditText.setSelection(int)>
			a.b.addTextChangedListener(((TextWatcher) (this)));
	//   39   92:aload_0         
	//   40   93:getfield        #16  <Field x a>
	//   41   96:getfield        #25  <Field EditText x.b>
	//   42   99:aload_0         
	//   43  100:invokevirtual   #119 <Method void EditText.addTextChangedListener(TextWatcher)>
		}
	//   44  103:return          
	}

	final x a;

	x$1(x x1)
	{
		a = x1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field x a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}

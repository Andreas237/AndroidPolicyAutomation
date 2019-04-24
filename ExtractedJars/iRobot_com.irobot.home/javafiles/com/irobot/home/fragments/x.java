// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.content.res.Resources;
import android.text.*;
import android.widget.*;
import com.irobot.core.*;
import com.irobot.home.*;

// Referenced classes of package com.irobot.home.fragments:
//			g

public class x extends g
{

	public x()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void g()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #28  <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:invokevirtual   #34  <Method Resources IRobotApplication.getResources()>
	//    5   11:ldc1            #35  <Int 0x7f0a000e>
	//    6   13:invokevirtual   #41  <Method int Resources.getInteger(int)>
	//    7   16:putfield        #43  <Field int f>
		e = false;
	//    8   19:aload_0         
	//    9   20:iconst_0        
	//   10   21:putfield        #45  <Field boolean e>
	//   11   24:return          
	}

	static void a(x x1, boolean flag)
	{
		x1.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #50  <Method void a(boolean)>
	//    3    5:return          
	}

	private void a(boolean flag)
	{
		BroadcastSetupActivity broadcastsetupactivity = (BroadcastSetupActivity)getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method android.app.Activity getActivity()>
	//    2    4:checkcast       #56  <Class BroadcastSetupActivity>
	//    3    7:astore_2        
		if(broadcastsetupactivity != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          17
			broadcastsetupactivity.b(flag);
	//    6   12:aload_2         
	//    7   13:iload_1         
	//    8   14:invokevirtual   #58  <Method void BroadcastSetupActivity.b(boolean)>
	//    9   17:return          
	}

	public void a()
	{
		int i;
		boolean flag;
		Object obj;
label0:
		{
			d = "";
	//    0    0:aload_0         
	//    1    1:ldc1            #60  <String "">
	//    2    3:putfield        #62  <Field String d>
			obj = ((Object) (b));
	//    3    6:aload_0         
	//    4    7:getfield        #64  <Field EditText b>
	//    5   10:astore          4
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
			((EditText) (obj)).setFilters(new InputFilter[] {
				new android.text.InputFilter.LengthFilter(f)
			});
	//    8   14:aload           4
	//    9   16:iconst_1        
	//   10   17:anewarray       InputFilter[]
	//   11   20:dup             
	//   12   21:iconst_0        
	//   13   22:new             #68  <Class android.text.InputFilter$LengthFilter>
	//   14   25:dup             
	//   15   26:aload_0         
	//   16   27:getfield        #43  <Field int f>
	//   17   30:invokespecial   #71  <Method void android.text.InputFilter$LengthFilter(int)>
	//   18   33:aastore         
	//   19   34:invokevirtual   #77  <Method void EditText.setFilters(InputFilter[])>
			b.setInputType(0x80090);
	//   20   37:aload_0         
	//   21   38:getfield        #64  <Field EditText b>
	//   22   41:ldc1            #78  <Int 0x80090>
	//   23   43:invokevirtual   #81  <Method void EditText.setInputType(int)>
			b.addTextChangedListener(new TextWatcher() {

				public void afterTextChanged(Editable editable)
				{
					editable = ((Editable) (((Object) (a.b.getText())).toString()));
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field x a>
				//    2    4:getfield        #25  <Field EditText x.b>
				//    3    7:invokevirtual   #31  <Method Editable EditText.getText()>
				//    4   10:invokevirtual   #35  <Method String Object.toString()>
				//    5   13:astore_1        
					boolean flag2;
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
						flag2 = true;
				//   33   72:iconst_1        
				//   34   73:istore_2        
					} else
				//*  35   74:goto            84
					{
						editable = ((Editable) (a));
				//   36   77:aload_0         
				//   37   78:getfield        #16  <Field x a>
				//   38   81:astore_1        
						flag2 = false;
				//   39   82:iconst_0        
				//   40   83:istore_2        
					}
					x.a(((x) (editable)), flag2);
				//   41   84:aload_1         
				//   42   85:iload_2         
				//   43   86:invokestatic    #86  <Method void x.a(x, boolean)>
				//   44   89:return          
				}

				public void beforeTextChanged(CharSequence charsequence, int j, int k, int l)
				{
				//    0    0:return          
				}

				public void onTextChanged(CharSequence charsequence, int j, int k, int l)
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

			
			{
				a = x.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field x a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   24   46:aload_0         
	//   25   47:getfield        #64  <Field EditText b>
	//   26   50:new             #6   <Class x$1>
	//   27   53:dup             
	//   28   54:aload_0         
	//   29   55:invokespecial   #84  <Method void x$1(x)>
	//   30   58:invokevirtual   #88  <Method void EditText.addTextChangedListener(TextWatcher)>
			obj = ((Object) (Assembler.getInstance().getAssetSetupUIService()));
	//   31   61:invokestatic    #94  <Method Assembler Assembler.getInstance()>
	//   32   64:invokevirtual   #98  <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//   33   67:astore          4
			if(obj != null)
	//*  34   69:aload           4
	//*  35   71:ifnull          113
			{
				boolean flag1;
				if(((AssetSetupUIService) (obj)).getServiceData().getPlaceholderSkuType() == SkuType.SanMarino)
	//*  36   74:aload           4
	//*  37   76:invokevirtual   #104 <Method AssetSetupUIServiceData AssetSetupUIService.getServiceData()>
	//*  38   79:invokevirtual   #110 <Method SkuType AssetSetupUIServiceData.getPlaceholderSkuType()>
	//*  39   82:getstatic       #116 <Field SkuType SkuType.SanMarino>
	//*  40   85:if_acmpne       93
					flag1 = true;
	//   41   88:iconst_1        
	//   42   89:istore_3        
				else
	//*  43   90:goto            95
					flag1 = false;
	//   44   93:iconst_0        
	//   45   94:istore_3        
				e = flag1;
	//   46   95:aload_0         
	//   47   96:iload_3         
	//   48   97:putfield        #45  <Field boolean e>
				if(e)
	//*  49  100:aload_0         
	//*  50  101:getfield        #45  <Field boolean e>
	//*  51  104:ifeq            113
				{
					i = 0x7f0f00ed;
	//   52  107:ldc1            #117 <Int 0x7f0f00ed>
	//   53  109:istore_1        
					break label0;
	//   54  110:goto            116
				}
			}
			i = 0x7f0f07ab;
	//   55  113:ldc1            #118 <Int 0x7f0f07ab>
	//   56  115:istore_1        
		}
		obj = ((Object) (((AssetSetupUIService) (obj)).getServiceData().getAssetName()));
	//   57  116:aload           4
	//   58  118:invokevirtual   #104 <Method AssetSetupUIServiceData AssetSetupUIService.getServiceData()>
	//   59  121:invokevirtual   #122 <Method String AssetSetupUIServiceData.getAssetName()>
	//   60  124:astore          4
		if(TextUtils.isEmpty(((CharSequence) (obj))) || AssetValidationResult.Valid != CommonUtilities.validateAssetName(((String) (obj))))
	//*  61  126:aload           4
	//*  62  128:invokestatic    #128 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  63  131:ifne            148
	//*  64  134:getstatic       #134 <Field AssetValidationResult AssetValidationResult.Valid>
	//*  65  137:aload           4
	//*  66  139:invokestatic    #140 <Method AssetValidationResult CommonUtilities.validateAssetName(String)>
	//*  67  142:if_acmpne       148
	//*  68  145:goto            150
			flag = false;
	//   69  148:iconst_0        
	//   70  149:istore_2        
		EditText edittext = b;
	//   71  150:aload_0         
	//   72  151:getfield        #64  <Field EditText b>
	//   73  154:astore          5
		if(!flag)
	//*  74  156:iload_2         
	//*  75  157:ifeq            163
	//*  76  160:goto            173
			obj = ((Object) (getResources().getText(i)));
	//   77  163:aload_0         
	//   78  164:invokevirtual   #141 <Method Resources getResources()>
	//   79  167:iload_1         
	//   80  168:invokevirtual   #145 <Method CharSequence Resources.getText(int)>
	//   81  171:astore          4
		edittext.setText(((CharSequence) (obj)));
	//   82  173:aload           5
	//   83  175:aload           4
	//   84  177:invokevirtual   #149 <Method void EditText.setText(CharSequence)>
	//   85  180:return          
	}

	TextView a;
	EditText b;
	LinearLayout c;
	String d;
	boolean e;
	private final int f = IRobotApplication_.r().getResources().getInteger(0x7f0a000e);
}

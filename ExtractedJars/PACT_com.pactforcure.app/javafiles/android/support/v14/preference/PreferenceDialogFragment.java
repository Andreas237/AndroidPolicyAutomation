// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v14.preference;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.preference.DialogPreference;
import android.text.TextUtils;
import android.view.*;
import android.widget.TextView;

public abstract class PreferenceDialogFragment extends DialogFragment
	implements android.content.DialogInterface.OnClickListener
{

	public PreferenceDialogFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void DialogFragment()>
	//    2    4:return          
	}

	private void requestInputMethod(Dialog dialog)
	{
		dialog.getWindow().setSoftInputMode(5);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method Window Dialog.getWindow()>
	//    2    4:iconst_5        
	//    3    5:invokevirtual   #60  <Method void Window.setSoftInputMode(int)>
	//    4    8:return          
	}

	public DialogPreference getPreference()
	{
		if(mPreference == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field DialogPreference mPreference>
	//*   2    4:ifnonnull       37
		{
			String s = getArguments().getString("key");
	//    3    7:aload_0         
	//    4    8:invokevirtual   #68  <Method Bundle getArguments()>
	//    5   11:ldc1            #10  <String "key">
	//    6   13:invokevirtual   #74  <Method String Bundle.getString(String)>
	//    7   16:astore_1        
			mPreference = (DialogPreference)((android.support.v7.preference.DialogPreference.TargetFragment)getTargetFragment()).findPreference(((CharSequence) (s)));
	//    8   17:aload_0         
	//    9   18:aload_0         
	//   10   19:invokevirtual   #78  <Method android.app.Fragment getTargetFragment()>
	//   11   22:checkcast       #80  <Class android.support.v7.preference.DialogPreference$TargetFragment>
	//   12   25:aload_1         
	//   13   26:invokeinterface #84  <Method android.support.v7.preference.Preference android.support.v7.preference.DialogPreference$TargetFragment.findPreference(CharSequence)>
	//   14   31:checkcast       #86  <Class DialogPreference>
	//   15   34:putfield        #64  <Field DialogPreference mPreference>
		}
		return mPreference;
	//   16   37:aload_0         
	//   17   38:getfield        #64  <Field DialogPreference mPreference>
	//   18   41:areturn         
	}

	protected boolean needInputMethod()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected void onBindDialogView(View view)
	{
		view = view.findViewById(0x102000b);
	//    0    0:aload_1         
	//    1    1:ldc1            #96  <Int 0x102000b>
	//    2    3:invokevirtual   #102 <Method View View.findViewById(int)>
	//    3    6:astore_1        
		if(view != null)
	//*   4    7:aload_1         
	//*   5    8:ifnull          56
		{
			CharSequence charsequence = mDialogMessage;
	//    6   11:aload_0         
	//    7   12:getfield        #104 <Field CharSequence mDialogMessage>
	//    8   15:astore_3        
			byte byte0 = 8;
	//    9   16:bipush          8
	//   10   18:istore_2        
			if(!TextUtils.isEmpty(charsequence))
	//*  11   19:aload_3         
	//*  12   20:invokestatic    #110 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   23:ifne            43
			{
				if(view instanceof TextView)
	//*  14   26:aload_1         
	//*  15   27:instanceof      #112 <Class TextView>
	//*  16   30:ifeq            41
					((TextView)view).setText(charsequence);
	//   17   33:aload_1         
	//   18   34:checkcast       #112 <Class TextView>
	//   19   37:aload_3         
	//   20   38:invokevirtual   #116 <Method void TextView.setText(CharSequence)>
				byte0 = 0;
	//   21   41:iconst_0        
	//   22   42:istore_2        
			}
			if(view.getVisibility() != byte0)
	//*  23   43:aload_1         
	//*  24   44:invokevirtual   #120 <Method int View.getVisibility()>
	//*  25   47:iload_2         
	//*  26   48:icmpeq          56
				view.setVisibility(((int) (byte0)));
	//   27   51:aload_1         
	//   28   52:iload_2         
	//   29   53:invokevirtual   #123 <Method void View.setVisibility(int)>
		}
	//   30   56:return          
	}

	public void onClick(DialogInterface dialoginterface, int i)
	{
		mWhichButtonClicked = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #127 <Field int mWhichButtonClicked>
	//    3    5:return          
	}

	public void onCreate(Bundle bundle)
	{
		Object obj;
		String s;
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #131 <Method void DialogFragment.onCreate(Bundle)>
		obj = ((Object) (getTargetFragment()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #78  <Method android.app.Fragment getTargetFragment()>
	//    5    9:astore_2        
		if(!(obj instanceof android.support.v7.preference.DialogPreference.TargetFragment))
	//*   6   10:aload_2         
	//*   7   11:instanceof      #80  <Class android.support.v7.preference.DialogPreference$TargetFragment>
	//*   8   14:ifne            27
			throw new IllegalStateException("Target fragment must implement TargetFragment interface");
	//    9   17:new             #133 <Class IllegalStateException>
	//   10   20:dup             
	//   11   21:ldc1            #135 <String "Target fragment must implement TargetFragment interface">
	//   12   23:invokespecial   #138 <Method void IllegalStateException(String)>
	//   13   26:athrow          
		obj = ((Object) ((android.support.v7.preference.DialogPreference.TargetFragment)obj));
	//   14   27:aload_2         
	//   15   28:checkcast       #80  <Class android.support.v7.preference.DialogPreference$TargetFragment>
	//   16   31:astore_2        
		s = getArguments().getString("key");
	//   17   32:aload_0         
	//   18   33:invokevirtual   #68  <Method Bundle getArguments()>
	//   19   36:ldc1            #10  <String "key">
	//   20   38:invokevirtual   #74  <Method String Bundle.getString(String)>
	//   21   41:astore_3        
		if(bundle != null) goto _L2; else goto _L1
	//   22   42:aload_1         
	//   23   43:ifnonnull       203
_L1:
		mPreference = (DialogPreference)((android.support.v7.preference.DialogPreference.TargetFragment) (obj)).findPreference(((CharSequence) (s)));
	//   24   46:aload_0         
	//   25   47:aload_2         
	//   26   48:aload_3         
	//   27   49:invokeinterface #84  <Method android.support.v7.preference.Preference android.support.v7.preference.DialogPreference$TargetFragment.findPreference(CharSequence)>
	//   28   54:checkcast       #86  <Class DialogPreference>
	//   29   57:putfield        #64  <Field DialogPreference mPreference>
		mDialogTitle = mPreference.getDialogTitle();
	//   30   60:aload_0         
	//   31   61:aload_0         
	//   32   62:getfield        #64  <Field DialogPreference mPreference>
	//   33   65:invokevirtual   #142 <Method CharSequence DialogPreference.getDialogTitle()>
	//   34   68:putfield        #144 <Field CharSequence mDialogTitle>
		mPositiveButtonText = mPreference.getPositiveButtonText();
	//   35   71:aload_0         
	//   36   72:aload_0         
	//   37   73:getfield        #64  <Field DialogPreference mPreference>
	//   38   76:invokevirtual   #147 <Method CharSequence DialogPreference.getPositiveButtonText()>
	//   39   79:putfield        #149 <Field CharSequence mPositiveButtonText>
		mNegativeButtonText = mPreference.getNegativeButtonText();
	//   40   82:aload_0         
	//   41   83:aload_0         
	//   42   84:getfield        #64  <Field DialogPreference mPreference>
	//   43   87:invokevirtual   #152 <Method CharSequence DialogPreference.getNegativeButtonText()>
	//   44   90:putfield        #154 <Field CharSequence mNegativeButtonText>
		mDialogMessage = mPreference.getDialogMessage();
	//   45   93:aload_0         
	//   46   94:aload_0         
	//   47   95:getfield        #64  <Field DialogPreference mPreference>
	//   48   98:invokevirtual   #157 <Method CharSequence DialogPreference.getDialogMessage()>
	//   49  101:putfield        #104 <Field CharSequence mDialogMessage>
		mDialogLayoutRes = mPreference.getDialogLayoutResource();
	//   50  104:aload_0         
	//   51  105:aload_0         
	//   52  106:getfield        #64  <Field DialogPreference mPreference>
	//   53  109:invokevirtual   #160 <Method int DialogPreference.getDialogLayoutResource()>
	//   54  112:putfield        #162 <Field int mDialogLayoutRes>
		bundle = ((Bundle) (mPreference.getDialogIcon()));
	//   55  115:aload_0         
	//   56  116:getfield        #64  <Field DialogPreference mPreference>
	//   57  119:invokevirtual   #166 <Method Drawable DialogPreference.getDialogIcon()>
	//   58  122:astore_1        
		if(bundle != null && !(bundle instanceof BitmapDrawable)) goto _L4; else goto _L3
	//   59  123:aload_1         
	//   60  124:ifnull          134
	//   61  127:aload_1         
	//   62  128:instanceof      #168 <Class BitmapDrawable>
	//   63  131:ifeq            143
_L3:
		mDialogIcon = (BitmapDrawable)bundle;
	//   64  134:aload_0         
	//   65  135:aload_1         
	//   66  136:checkcast       #168 <Class BitmapDrawable>
	//   67  139:putfield        #170 <Field BitmapDrawable mDialogIcon>
_L6:
		return;
	//   68  142:return          
_L4:
		Bitmap bitmap = Bitmap.createBitmap(((Drawable) (bundle)).getIntrinsicWidth(), ((Drawable) (bundle)).getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
	//   69  143:aload_1         
	//   70  144:invokevirtual   #175 <Method int Drawable.getIntrinsicWidth()>
	//   71  147:aload_1         
	//   72  148:invokevirtual   #178 <Method int Drawable.getIntrinsicHeight()>
	//   73  151:getstatic       #184 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   74  154:invokestatic    #190 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   75  157:astore_2        
		Canvas canvas = new Canvas(bitmap);
	//   76  158:new             #192 <Class Canvas>
	//   77  161:dup             
	//   78  162:aload_2         
	//   79  163:invokespecial   #195 <Method void Canvas(Bitmap)>
	//   80  166:astore_3        
		((Drawable) (bundle)).setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
	//   81  167:aload_1         
	//   82  168:iconst_0        
	//   83  169:iconst_0        
	//   84  170:aload_3         
	//   85  171:invokevirtual   #198 <Method int Canvas.getWidth()>
	//   86  174:aload_3         
	//   87  175:invokevirtual   #201 <Method int Canvas.getHeight()>
	//   88  178:invokevirtual   #205 <Method void Drawable.setBounds(int, int, int, int)>
		((Drawable) (bundle)).draw(canvas);
	//   89  181:aload_1         
	//   90  182:aload_3         
	//   91  183:invokevirtual   #209 <Method void Drawable.draw(Canvas)>
		mDialogIcon = new BitmapDrawable(getResources(), bitmap);
	//   92  186:aload_0         
	//   93  187:new             #168 <Class BitmapDrawable>
	//   94  190:dup             
	//   95  191:aload_0         
	//   96  192:invokevirtual   #213 <Method android.content.res.Resources getResources()>
	//   97  195:aload_2         
	//   98  196:invokespecial   #216 <Method void BitmapDrawable(android.content.res.Resources, Bitmap)>
	//   99  199:putfield        #170 <Field BitmapDrawable mDialogIcon>
		return;
	//  100  202:return          
_L2:
		mDialogTitle = bundle.getCharSequence("PreferenceDialogFragment.title");
	//  101  203:aload_0         
	//  102  204:aload_1         
	//  103  205:ldc1            #28  <String "PreferenceDialogFragment.title">
	//  104  207:invokevirtual   #220 <Method CharSequence Bundle.getCharSequence(String)>
	//  105  210:putfield        #144 <Field CharSequence mDialogTitle>
		mPositiveButtonText = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
	//  106  213:aload_0         
	//  107  214:aload_1         
	//  108  215:ldc1            #25  <String "PreferenceDialogFragment.positiveText">
	//  109  217:invokevirtual   #220 <Method CharSequence Bundle.getCharSequence(String)>
	//  110  220:putfield        #149 <Field CharSequence mPositiveButtonText>
		mNegativeButtonText = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
	//  111  223:aload_0         
	//  112  224:aload_1         
	//  113  225:ldc1            #22  <String "PreferenceDialogFragment.negativeText">
	//  114  227:invokevirtual   #220 <Method CharSequence Bundle.getCharSequence(String)>
	//  115  230:putfield        #154 <Field CharSequence mNegativeButtonText>
		mDialogMessage = bundle.getCharSequence("PreferenceDialogFragment.message");
	//  116  233:aload_0         
	//  117  234:aload_1         
	//  118  235:ldc1            #19  <String "PreferenceDialogFragment.message">
	//  119  237:invokevirtual   #220 <Method CharSequence Bundle.getCharSequence(String)>
	//  120  240:putfield        #104 <Field CharSequence mDialogMessage>
		mDialogLayoutRes = bundle.getInt("PreferenceDialogFragment.layout", 0);
	//  121  243:aload_0         
	//  122  244:aload_1         
	//  123  245:ldc1            #16  <String "PreferenceDialogFragment.layout">
	//  124  247:iconst_0        
	//  125  248:invokevirtual   #224 <Method int Bundle.getInt(String, int)>
	//  126  251:putfield        #162 <Field int mDialogLayoutRes>
		bundle = ((Bundle) ((Bitmap)bundle.getParcelable("PreferenceDialogFragment.icon")));
	//  127  254:aload_1         
	//  128  255:ldc1            #13  <String "PreferenceDialogFragment.icon">
	//  129  257:invokevirtual   #228 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//  130  260:checkcast       #186 <Class Bitmap>
	//  131  263:astore_1        
		if(bundle != null)
	//* 132  264:aload_1         
	//* 133  265:ifnull          142
		{
			mDialogIcon = new BitmapDrawable(getResources(), ((Bitmap) (bundle)));
	//  134  268:aload_0         
	//  135  269:new             #168 <Class BitmapDrawable>
	//  136  272:dup             
	//  137  273:aload_0         
	//  138  274:invokevirtual   #213 <Method android.content.res.Resources getResources()>
	//  139  277:aload_1         
	//  140  278:invokespecial   #216 <Method void BitmapDrawable(android.content.res.Resources, Bitmap)>
	//  141  281:putfield        #170 <Field BitmapDrawable mDialogIcon>
			return;
	//  142  284:return          
		}
		if(true) goto _L6; else goto _L5
_L5:
	}

	public Dialog onCreateDialog(Bundle bundle)
	{
		Object obj = ((Object) (getActivity()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #235 <Method android.app.Activity getActivity()>
	//    2    4:astore_2        
		mWhichButtonClicked = -2;
	//    3    5:aload_0         
	//    4    6:bipush          -2
	//    5    8:putfield        #127 <Field int mWhichButtonClicked>
		bundle = ((Bundle) ((new android.app.AlertDialog.Builder(((Context) (obj)))).setTitle(mDialogTitle).setIcon(((Drawable) (mDialogIcon))).setPositiveButton(mPositiveButtonText, ((android.content.DialogInterface.OnClickListener) (this))).setNegativeButton(mNegativeButtonText, ((android.content.DialogInterface.OnClickListener) (this)))));
	//    6   11:new             #237 <Class android.app.AlertDialog$Builder>
	//    7   14:dup             
	//    8   15:aload_2         
	//    9   16:invokespecial   #240 <Method void android.app.AlertDialog$Builder(Context)>
	//   10   19:aload_0         
	//   11   20:getfield        #144 <Field CharSequence mDialogTitle>
	//   12   23:invokevirtual   #244 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   13   26:aload_0         
	//   14   27:getfield        #170 <Field BitmapDrawable mDialogIcon>
	//   15   30:invokevirtual   #248 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setIcon(Drawable)>
	//   16   33:aload_0         
	//   17   34:getfield        #149 <Field CharSequence mPositiveButtonText>
	//   18   37:aload_0         
	//   19   38:invokevirtual   #252 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   20   41:aload_0         
	//   21   42:getfield        #154 <Field CharSequence mNegativeButtonText>
	//   22   45:aload_0         
	//   23   46:invokevirtual   #255 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   24   49:astore_1        
		obj = ((Object) (onCreateDialogView(((Context) (obj)))));
	//   25   50:aload_0         
	//   26   51:aload_2         
	//   27   52:invokevirtual   #259 <Method View onCreateDialogView(Context)>
	//   28   55:astore_2        
		if(obj != null)
	//*  29   56:aload_2         
	//*  30   57:ifnull          95
		{
			onBindDialogView(((View) (obj)));
	//   31   60:aload_0         
	//   32   61:aload_2         
	//   33   62:invokevirtual   #261 <Method void onBindDialogView(View)>
			((android.app.AlertDialog.Builder) (bundle)).setView(((View) (obj)));
	//   34   65:aload_1         
	//   35   66:aload_2         
	//   36   67:invokevirtual   #265 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setView(View)>
	//   37   70:pop             
		} else
	//*  38   71:aload_0         
	//*  39   72:aload_1         
	//*  40   73:invokevirtual   #269 <Method void onPrepareDialogBuilder(android.app.AlertDialog$Builder)>
	//*  41   76:aload_1         
	//*  42   77:invokevirtual   #273 <Method android.app.AlertDialog android.app.AlertDialog$Builder.create()>
	//*  43   80:astore_1        
	//*  44   81:aload_0         
	//*  45   82:invokevirtual   #275 <Method boolean needInputMethod()>
	//*  46   85:ifeq            93
	//*  47   88:aload_0         
	//*  48   89:aload_1         
	//*  49   90:invokespecial   #277 <Method void requestInputMethod(Dialog)>
	//*  50   93:aload_1         
	//*  51   94:areturn         
		{
			((android.app.AlertDialog.Builder) (bundle)).setMessage(mDialogMessage);
	//   52   95:aload_1         
	//   53   96:aload_0         
	//   54   97:getfield        #104 <Field CharSequence mDialogMessage>
	//   55  100:invokevirtual   #280 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   56  103:pop             
		}
		onPrepareDialogBuilder(((android.app.AlertDialog.Builder) (bundle)));
		bundle = ((Bundle) (((android.app.AlertDialog.Builder) (bundle)).create()));
		if(needInputMethod())
			requestInputMethod(((Dialog) (bundle)));
		return ((Dialog) (bundle));
	//*  57  104:goto            71
	}

	protected View onCreateDialogView(Context context)
	{
		int i = mDialogLayoutRes;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field int mDialogLayoutRes>
	//    2    4:istore_2        
		if(i == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return LayoutInflater.from(context).inflate(i, ((android.view.ViewGroup) (null)));
	//    7   11:aload_1         
	//    8   12:invokestatic    #286 <Method LayoutInflater LayoutInflater.from(Context)>
	//    9   15:iload_2         
	//   10   16:aconst_null     
	//   11   17:invokevirtual   #290 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   12   20:areturn         
	}

	public abstract void onDialogClosed(boolean flag);

	public void onDismiss(DialogInterface dialoginterface)
	{
		super.onDismiss(dialoginterface);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #296 <Method void DialogFragment.onDismiss(DialogInterface)>
		boolean flag;
		if(mWhichButtonClicked == -1)
	//*   3    5:aload_0         
	//*   4    6:getfield        #127 <Field int mWhichButtonClicked>
	//*   5    9:iconst_m1       
	//*   6   10:icmpne          21
			flag = true;
	//    7   13:iconst_1        
	//    8   14:istore_2        
		else
	//*   9   15:aload_0         
	//*  10   16:iload_2         
	//*  11   17:invokevirtual   #298 <Method void onDialogClosed(boolean)>
	//*  12   20:return          
			flag = false;
	//   13   21:iconst_0        
	//   14   22:istore_2        
		onDialogClosed(flag);
	//*  15   23:goto            15
	}

	protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder builder)
	{
	//    0    0:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #301 <Method void DialogFragment.onSaveInstanceState(Bundle)>
		bundle.putCharSequence("PreferenceDialogFragment.title", mDialogTitle);
	//    3    5:aload_1         
	//    4    6:ldc1            #28  <String "PreferenceDialogFragment.title">
	//    5    8:aload_0         
	//    6    9:getfield        #144 <Field CharSequence mDialogTitle>
	//    7   12:invokevirtual   #305 <Method void Bundle.putCharSequence(String, CharSequence)>
		bundle.putCharSequence("PreferenceDialogFragment.positiveText", mPositiveButtonText);
	//    8   15:aload_1         
	//    9   16:ldc1            #25  <String "PreferenceDialogFragment.positiveText">
	//   10   18:aload_0         
	//   11   19:getfield        #149 <Field CharSequence mPositiveButtonText>
	//   12   22:invokevirtual   #305 <Method void Bundle.putCharSequence(String, CharSequence)>
		bundle.putCharSequence("PreferenceDialogFragment.negativeText", mNegativeButtonText);
	//   13   25:aload_1         
	//   14   26:ldc1            #22  <String "PreferenceDialogFragment.negativeText">
	//   15   28:aload_0         
	//   16   29:getfield        #154 <Field CharSequence mNegativeButtonText>
	//   17   32:invokevirtual   #305 <Method void Bundle.putCharSequence(String, CharSequence)>
		bundle.putCharSequence("PreferenceDialogFragment.message", mDialogMessage);
	//   18   35:aload_1         
	//   19   36:ldc1            #19  <String "PreferenceDialogFragment.message">
	//   20   38:aload_0         
	//   21   39:getfield        #104 <Field CharSequence mDialogMessage>
	//   22   42:invokevirtual   #305 <Method void Bundle.putCharSequence(String, CharSequence)>
		bundle.putInt("PreferenceDialogFragment.layout", mDialogLayoutRes);
	//   23   45:aload_1         
	//   24   46:ldc1            #16  <String "PreferenceDialogFragment.layout">
	//   25   48:aload_0         
	//   26   49:getfield        #162 <Field int mDialogLayoutRes>
	//   27   52:invokevirtual   #309 <Method void Bundle.putInt(String, int)>
		if(mDialogIcon != null)
	//*  28   55:aload_0         
	//*  29   56:getfield        #170 <Field BitmapDrawable mDialogIcon>
	//*  30   59:ifnull          75
			bundle.putParcelable("PreferenceDialogFragment.icon", ((android.os.Parcelable) (mDialogIcon.getBitmap())));
	//   31   62:aload_1         
	//   32   63:ldc1            #13  <String "PreferenceDialogFragment.icon">
	//   33   65:aload_0         
	//   34   66:getfield        #170 <Field BitmapDrawable mDialogIcon>
	//   35   69:invokevirtual   #313 <Method Bitmap BitmapDrawable.getBitmap()>
	//   36   72:invokevirtual   #317 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
	//   37   75:return          
	}

	protected static final String ARG_KEY = "key";
	private static final String SAVE_STATE_ICON = "PreferenceDialogFragment.icon";
	private static final String SAVE_STATE_LAYOUT = "PreferenceDialogFragment.layout";
	private static final String SAVE_STATE_MESSAGE = "PreferenceDialogFragment.message";
	private static final String SAVE_STATE_NEGATIVE_TEXT = "PreferenceDialogFragment.negativeText";
	private static final String SAVE_STATE_POSITIVE_TEXT = "PreferenceDialogFragment.positiveText";
	private static final String SAVE_STATE_TITLE = "PreferenceDialogFragment.title";
	private BitmapDrawable mDialogIcon;
	private int mDialogLayoutRes;
	private CharSequence mDialogMessage;
	private CharSequence mDialogTitle;
	private CharSequence mNegativeButtonText;
	private CharSequence mPositiveButtonText;
	private DialogPreference mPreference;
	private int mWhichButtonClicked;
}

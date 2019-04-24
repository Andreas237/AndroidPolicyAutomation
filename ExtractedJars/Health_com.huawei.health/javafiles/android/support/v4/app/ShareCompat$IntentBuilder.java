// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.Html;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			ShareCompat

public static class ShareCompat$IntentBuilder
{

	private void combineArrayExtra(String s, ArrayList arraylist)
	{
		String as[] = mIntent.getStringArrayExtra(s);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Intent mIntent>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #71  <Method String[] Intent.getStringArrayExtra(String)>
	//    4    8:astore          4
		int i;
		if(as != null)
	//*   5   10:aload           4
	//*   6   12:ifnull          22
			i = as.length;
	//    7   15:aload           4
	//    8   17:arraylength     
	//    9   18:istore_3        
		else
	//*  10   19:goto            24
			i = 0;
	//   11   22:iconst_0        
	//   12   23:istore_3        
		String as1[] = new String[arraylist.size() + i];
	//   13   24:aload_2         
	//   14   25:invokevirtual   #77  <Method int ArrayList.size()>
	//   15   28:iload_3         
	//   16   29:iadd            
	//   17   30:anewarray       String[]
	//   18   33:astore          5
		arraylist.toArray(((Object []) (as1)));
	//   19   35:aload_2         
	//   20   36:aload           5
	//   21   38:invokevirtual   #83  <Method Object[] ArrayList.toArray(Object[])>
	//   22   41:pop             
		if(as != null)
	//*  23   42:aload           4
	//*  24   44:ifnull          60
			System.arraycopy(((Object) (as)), 0, ((Object) (as1)), arraylist.size(), i);
	//   25   47:aload           4
	//   26   49:iconst_0        
	//   27   50:aload           5
	//   28   52:aload_2         
	//   29   53:invokevirtual   #77  <Method int ArrayList.size()>
	//   30   56:iload_3         
	//   31   57:invokestatic    #89  <Method void System.arraycopy(Object, int, Object, int, int)>
		mIntent.putExtra(s, as1);
	//   32   60:aload_0         
	//   33   61:getfield        #38  <Field Intent mIntent>
	//   34   64:aload_1         
	//   35   65:aload           5
	//   36   67:invokevirtual   #92  <Method Intent Intent.putExtra(String, String[])>
	//   37   70:pop             
	//   38   71:return          
	}

	private void combineArrayExtra(String s, String as[])
	{
		Intent intent = getIntent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method Intent getIntent()>
	//    2    4:astore          4
		String as1[] = intent.getStringArrayExtra(s);
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokevirtual   #71  <Method String[] Intent.getStringArrayExtra(String)>
	//    6   12:astore          5
		int i;
		if(as1 != null)
	//*   7   14:aload           5
	//*   8   16:ifnull          26
			i = as1.length;
	//    9   19:aload           5
	//   10   21:arraylength     
	//   11   22:istore_3        
		else
	//*  12   23:goto            28
			i = 0;
	//   13   26:iconst_0        
	//   14   27:istore_3        
		String as2[] = new String[as.length + i];
	//   15   28:aload_2         
	//   16   29:arraylength     
	//   17   30:iload_3         
	//   18   31:iadd            
	//   19   32:anewarray       String[]
	//   20   35:astore          6
		if(as1 != null)
	//*  21   37:aload           5
	//*  22   39:ifnull          52
			System.arraycopy(((Object) (as1)), 0, ((Object) (as2)), 0, i);
	//   23   42:aload           5
	//   24   44:iconst_0        
	//   25   45:aload           6
	//   26   47:iconst_0        
	//   27   48:iload_3         
	//   28   49:invokestatic    #89  <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (as)), 0, ((Object) (as2)), i, as.length);
	//   29   52:aload_2         
	//   30   53:iconst_0        
	//   31   54:aload           6
	//   32   56:iload_3         
	//   33   57:aload_2         
	//   34   58:arraylength     
	//   35   59:invokestatic    #89  <Method void System.arraycopy(Object, int, Object, int, int)>
		intent.putExtra(s, as2);
	//   36   62:aload           4
	//   37   64:aload_1         
	//   38   65:aload           6
	//   39   67:invokevirtual   #92  <Method Intent Intent.putExtra(String, String[])>
	//   40   70:pop             
	//   41   71:return          
	}

	public static ShareCompat$IntentBuilder from(Activity activity)
	{
		return new ShareCompat$IntentBuilder(activity);
	//    0    0:new             #2   <Class ShareCompat$IntentBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #103 <Method void ShareCompat$IntentBuilder(Activity)>
	//    4    8:areturn         
	}

	public ShareCompat$IntentBuilder addEmailBcc(String s)
	{
		if(mBccAddresses == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field ArrayList mBccAddresses>
	//*   2    4:ifnonnull       18
			mBccAddresses = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #73  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #108 <Method void ArrayList()>
	//    7   15:putfield        #107 <Field ArrayList mBccAddresses>
		mBccAddresses.add(((Object) (s)));
	//    8   18:aload_0         
	//    9   19:getfield        #107 <Field ArrayList mBccAddresses>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #112 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
		return this;
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	public ShareCompat$IntentBuilder addEmailBcc(String as[])
	{
		combineArrayExtra("android.intent.extra.BCC", as);
	//    0    0:aload_0         
	//    1    1:ldc1            #115 <String "android.intent.extra.BCC">
	//    2    3:aload_1         
	//    3    4:invokespecial   #117 <Method void combineArrayExtra(String, String[])>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public ShareCompat$IntentBuilder addEmailCc(String s)
	{
		if(mCcAddresses == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field ArrayList mCcAddresses>
	//*   2    4:ifnonnull       18
			mCcAddresses = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #73  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #108 <Method void ArrayList()>
	//    7   15:putfield        #120 <Field ArrayList mCcAddresses>
		mCcAddresses.add(((Object) (s)));
	//    8   18:aload_0         
	//    9   19:getfield        #120 <Field ArrayList mCcAddresses>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #112 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
		return this;
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	public ShareCompat$IntentBuilder addEmailCc(String as[])
	{
		combineArrayExtra("android.intent.extra.CC", as);
	//    0    0:aload_0         
	//    1    1:ldc1            #122 <String "android.intent.extra.CC">
	//    2    3:aload_1         
	//    3    4:invokespecial   #117 <Method void combineArrayExtra(String, String[])>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public ShareCompat$IntentBuilder addEmailTo(String s)
	{
		if(mToAddresses == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field ArrayList mToAddresses>
	//*   2    4:ifnonnull       18
			mToAddresses = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #73  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #108 <Method void ArrayList()>
	//    7   15:putfield        #125 <Field ArrayList mToAddresses>
		mToAddresses.add(((Object) (s)));
	//    8   18:aload_0         
	//    9   19:getfield        #125 <Field ArrayList mToAddresses>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #112 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
		return this;
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	public ShareCompat$IntentBuilder addEmailTo(String as[])
	{
		combineArrayExtra("android.intent.extra.EMAIL", as);
	//    0    0:aload_0         
	//    1    1:ldc1            #127 <String "android.intent.extra.EMAIL">
	//    2    3:aload_1         
	//    3    4:invokespecial   #117 <Method void combineArrayExtra(String, String[])>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public ShareCompat$IntentBuilder addStream(Uri uri)
	{
		Uri uri1 = (Uri)mIntent.getParcelableExtra("android.intent.extra.STREAM");
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Intent mIntent>
	//    2    4:ldc1            #131 <String "android.intent.extra.STREAM">
	//    3    6:invokevirtual   #135 <Method Parcelable Intent.getParcelableExtra(String)>
	//    4    9:checkcast       #137 <Class Uri>
	//    5   12:astore_2        
		if(mStreams == null && uri1 == null)
	//*   6   13:aload_0         
	//*   7   14:getfield        #139 <Field ArrayList mStreams>
	//*   8   17:ifnonnull       30
	//*   9   20:aload_2         
	//*  10   21:ifnonnull       30
			return setStream(uri);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:invokevirtual   #142 <Method ShareCompat$IntentBuilder setStream(Uri)>
	//   14   29:areturn         
		if(mStreams == null)
	//*  15   30:aload_0         
	//*  16   31:getfield        #139 <Field ArrayList mStreams>
	//*  17   34:ifnonnull       48
			mStreams = new ArrayList();
	//   18   37:aload_0         
	//   19   38:new             #73  <Class ArrayList>
	//   20   41:dup             
	//   21   42:invokespecial   #108 <Method void ArrayList()>
	//   22   45:putfield        #139 <Field ArrayList mStreams>
		if(uri1 != null)
	//*  23   48:aload_2         
	//*  24   49:ifnull          70
		{
			mIntent.removeExtra("android.intent.extra.STREAM");
	//   25   52:aload_0         
	//   26   53:getfield        #38  <Field Intent mIntent>
	//   27   56:ldc1            #131 <String "android.intent.extra.STREAM">
	//   28   58:invokevirtual   #146 <Method void Intent.removeExtra(String)>
			mStreams.add(((Object) (uri1)));
	//   29   61:aload_0         
	//   30   62:getfield        #139 <Field ArrayList mStreams>
	//   31   65:aload_2         
	//   32   66:invokevirtual   #112 <Method boolean ArrayList.add(Object)>
	//   33   69:pop             
		}
		mStreams.add(((Object) (uri)));
	//   34   70:aload_0         
	//   35   71:getfield        #139 <Field ArrayList mStreams>
	//   36   74:aload_1         
	//   37   75:invokevirtual   #112 <Method boolean ArrayList.add(Object)>
	//   38   78:pop             
		return this;
	//   39   79:aload_0         
	//   40   80:areturn         
	}

	public Intent createChooserIntent()
	{
		return Intent.createChooser(getIntent(), mChooserTitle);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method Intent getIntent()>
	//    2    4:aload_0         
	//    3    5:getfield        #149 <Field CharSequence mChooserTitle>
	//    4    8:invokestatic    #153 <Method Intent Intent.createChooser(Intent, CharSequence)>
	//    5   11:areturn         
	}

	Activity getActivity()
	{
		return mActivity;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Activity mActivity>
	//    2    4:areturn         
	}

	public Intent getIntent()
	{
		if(mToAddresses != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field ArrayList mToAddresses>
	//*   2    4:ifnull          22
		{
			combineArrayExtra("android.intent.extra.EMAIL", mToAddresses);
	//    3    7:aload_0         
	//    4    8:ldc1            #127 <String "android.intent.extra.EMAIL">
	//    5   10:aload_0         
	//    6   11:getfield        #125 <Field ArrayList mToAddresses>
	//    7   14:invokespecial   #157 <Method void combineArrayExtra(String, ArrayList)>
			mToAddresses = null;
	//    8   17:aload_0         
	//    9   18:aconst_null     
	//   10   19:putfield        #125 <Field ArrayList mToAddresses>
		}
		if(mCcAddresses != null)
	//*  11   22:aload_0         
	//*  12   23:getfield        #120 <Field ArrayList mCcAddresses>
	//*  13   26:ifnull          44
		{
			combineArrayExtra("android.intent.extra.CC", mCcAddresses);
	//   14   29:aload_0         
	//   15   30:ldc1            #122 <String "android.intent.extra.CC">
	//   16   32:aload_0         
	//   17   33:getfield        #120 <Field ArrayList mCcAddresses>
	//   18   36:invokespecial   #157 <Method void combineArrayExtra(String, ArrayList)>
			mCcAddresses = null;
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:putfield        #120 <Field ArrayList mCcAddresses>
		}
		if(mBccAddresses != null)
	//*  22   44:aload_0         
	//*  23   45:getfield        #107 <Field ArrayList mBccAddresses>
	//*  24   48:ifnull          66
		{
			combineArrayExtra("android.intent.extra.BCC", mBccAddresses);
	//   25   51:aload_0         
	//   26   52:ldc1            #115 <String "android.intent.extra.BCC">
	//   27   54:aload_0         
	//   28   55:getfield        #107 <Field ArrayList mBccAddresses>
	//   29   58:invokespecial   #157 <Method void combineArrayExtra(String, ArrayList)>
			mBccAddresses = null;
	//   30   61:aload_0         
	//   31   62:aconst_null     
	//   32   63:putfield        #107 <Field ArrayList mBccAddresses>
		}
		boolean flag;
		if(mStreams != null && mStreams.size() > 1)
	//*  33   66:aload_0         
	//*  34   67:getfield        #139 <Field ArrayList mStreams>
	//*  35   70:ifnull          89
	//*  36   73:aload_0         
	//*  37   74:getfield        #139 <Field ArrayList mStreams>
	//*  38   77:invokevirtual   #77  <Method int ArrayList.size()>
	//*  39   80:iconst_1        
	//*  40   81:icmple          89
			flag = true;
	//   41   84:iconst_1        
	//   42   85:istore_1        
		else
	//*  43   86:goto            91
			flag = false;
	//   44   89:iconst_0        
	//   45   90:istore_1        
		boolean flag1 = mIntent.getAction().equals("android.intent.action.SEND_MULTIPLE");
	//   46   91:aload_0         
	//   47   92:getfield        #38  <Field Intent mIntent>
	//   48   95:invokevirtual   #160 <Method String Intent.getAction()>
	//   49   98:ldc1            #162 <String "android.intent.action.SEND_MULTIPLE">
	//   50  100:invokevirtual   #165 <Method boolean String.equals(Object)>
	//   51  103:istore_2        
		if(!flag && flag1)
	//*  52  104:iload_1         
	//*  53  105:ifne            177
	//*  54  108:iload_2         
	//*  55  109:ifeq            177
		{
			mIntent.setAction("android.intent.action.SEND");
	//   56  112:aload_0         
	//   57  113:getfield        #38  <Field Intent mIntent>
	//   58  116:ldc1            #32  <String "android.intent.action.SEND">
	//   59  118:invokevirtual   #36  <Method Intent Intent.setAction(String)>
	//   60  121:pop             
			if(mStreams != null && !mStreams.isEmpty())
	//*  61  122:aload_0         
	//*  62  123:getfield        #139 <Field ArrayList mStreams>
	//*  63  126:ifnull          163
	//*  64  129:aload_0         
	//*  65  130:getfield        #139 <Field ArrayList mStreams>
	//*  66  133:invokevirtual   #169 <Method boolean ArrayList.isEmpty()>
	//*  67  136:ifne            163
				mIntent.putExtra("android.intent.extra.STREAM", (Parcelable)mStreams.get(0));
	//   68  139:aload_0         
	//   69  140:getfield        #38  <Field Intent mIntent>
	//   70  143:ldc1            #131 <String "android.intent.extra.STREAM">
	//   71  145:aload_0         
	//   72  146:getfield        #139 <Field ArrayList mStreams>
	//   73  149:iconst_0        
	//   74  150:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//   75  153:checkcast       #175 <Class Parcelable>
	//   76  156:invokevirtual   #59  <Method Intent Intent.putExtra(String, Parcelable)>
	//   77  159:pop             
			else
	//*  78  160:goto            172
				mIntent.removeExtra("android.intent.extra.STREAM");
	//   79  163:aload_0         
	//   80  164:getfield        #38  <Field Intent mIntent>
	//   81  167:ldc1            #131 <String "android.intent.extra.STREAM">
	//   82  169:invokevirtual   #146 <Method void Intent.removeExtra(String)>
			mStreams = null;
	//   83  172:aload_0         
	//   84  173:aconst_null     
	//   85  174:putfield        #139 <Field ArrayList mStreams>
		}
		if(flag && !flag1)
	//*  86  177:iload_1         
	//*  87  178:ifeq            238
	//*  88  181:iload_2         
	//*  89  182:ifne            238
		{
			mIntent.setAction("android.intent.action.SEND_MULTIPLE");
	//   90  185:aload_0         
	//   91  186:getfield        #38  <Field Intent mIntent>
	//   92  189:ldc1            #162 <String "android.intent.action.SEND_MULTIPLE">
	//   93  191:invokevirtual   #36  <Method Intent Intent.setAction(String)>
	//   94  194:pop             
			if(mStreams != null && !mStreams.isEmpty())
	//*  95  195:aload_0         
	//*  96  196:getfield        #139 <Field ArrayList mStreams>
	//*  97  199:ifnull          229
	//*  98  202:aload_0         
	//*  99  203:getfield        #139 <Field ArrayList mStreams>
	//* 100  206:invokevirtual   #169 <Method boolean ArrayList.isEmpty()>
	//* 101  209:ifne            229
				mIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", mStreams);
	//  102  212:aload_0         
	//  103  213:getfield        #38  <Field Intent mIntent>
	//  104  216:ldc1            #131 <String "android.intent.extra.STREAM">
	//  105  218:aload_0         
	//  106  219:getfield        #139 <Field ArrayList mStreams>
	//  107  222:invokevirtual   #179 <Method Intent Intent.putParcelableArrayListExtra(String, ArrayList)>
	//  108  225:pop             
			else
	//* 109  226:goto            238
				mIntent.removeExtra("android.intent.extra.STREAM");
	//  110  229:aload_0         
	//  111  230:getfield        #38  <Field Intent mIntent>
	//  112  233:ldc1            #131 <String "android.intent.extra.STREAM">
	//  113  235:invokevirtual   #146 <Method void Intent.removeExtra(String)>
		}
		return mIntent;
	//  114  238:aload_0         
	//  115  239:getfield        #38  <Field Intent mIntent>
	//  116  242:areturn         
	}

	public ShareCompat$IntentBuilder setChooserTitle(int i)
	{
		return setChooserTitle(mActivity.getText(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field Activity mActivity>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #186 <Method CharSequence Activity.getText(int)>
	//    5    9:invokevirtual   #189 <Method ShareCompat$IntentBuilder setChooserTitle(CharSequence)>
	//    6   12:areturn         
	}

	public ShareCompat$IntentBuilder setChooserTitle(CharSequence charsequence)
	{
		mChooserTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #149 <Field CharSequence mChooserTitle>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareCompat$IntentBuilder setEmailBcc(String as[])
	{
		mIntent.putExtra("android.intent.extra.BCC", as);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Intent mIntent>
	//    2    4:ldc1            #115 <String "android.intent.extra.BCC">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #92  <Method Intent Intent.putExtra(String, String[])>
	//    5   10:pop             
		return this;
	//    6   11:aload_0         
	//    7   12:areturn         
	}

	public ShareCompat$IntentBuilder setEmailCc(String as[])
	{
		mIntent.putExtra("android.intent.extra.CC", as);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Intent mIntent>
	//    2    4:ldc1            #122 <String "android.intent.extra.CC">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #92  <Method Intent Intent.putExtra(String, String[])>
	//    5   10:pop             
		return this;
	//    6   11:aload_0         
	//    7   12:areturn         
	}

	public ShareCompat$IntentBuilder setEmailTo(String as[])
	{
		if(mToAddresses != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field ArrayList mToAddresses>
	//*   2    4:ifnull          12
			mToAddresses = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #125 <Field ArrayList mToAddresses>
		mIntent.putExtra("android.intent.extra.EMAIL", as);
	//    6   12:aload_0         
	//    7   13:getfield        #38  <Field Intent mIntent>
	//    8   16:ldc1            #127 <String "android.intent.extra.EMAIL">
	//    9   18:aload_1         
	//   10   19:invokevirtual   #92  <Method Intent Intent.putExtra(String, String[])>
	//   11   22:pop             
		return this;
	//   12   23:aload_0         
	//   13   24:areturn         
	}

	public ShareCompat$IntentBuilder setHtmlText(String s)
	{
		mIntent.putExtra("android.intent.extra.HTML_TEXT", s);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Intent mIntent>
	//    2    4:ldc1            #196 <String "android.intent.extra.HTML_TEXT">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #50  <Method Intent Intent.putExtra(String, String)>
	//    5   10:pop             
		if(!mIntent.hasExtra("android.intent.extra.TEXT"))
	//*   6   11:aload_0         
	//*   7   12:getfield        #38  <Field Intent mIntent>
	//*   8   15:ldc1            #198 <String "android.intent.extra.TEXT">
	//*   9   17:invokevirtual   #202 <Method boolean Intent.hasExtra(String)>
	//*  10   20:ifne            32
			setText(((CharSequence) (Html.fromHtml(s))));
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokestatic    #208 <Method android.text.Spanned Html.fromHtml(String)>
	//   14   28:invokevirtual   #211 <Method ShareCompat$IntentBuilder setText(CharSequence)>
	//   15   31:pop             
		return this;
	//   16   32:aload_0         
	//   17   33:areturn         
	}

	public ShareCompat$IntentBuilder setStream(Uri uri)
	{
		if(!mIntent.getAction().equals("android.intent.action.SEND"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field Intent mIntent>
	//*   2    4:invokevirtual   #160 <Method String Intent.getAction()>
	//*   3    7:ldc1            #32  <String "android.intent.action.SEND">
	//*   4    9:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*   5   12:ifne            25
			mIntent.setAction("android.intent.action.SEND");
	//    6   15:aload_0         
	//    7   16:getfield        #38  <Field Intent mIntent>
	//    8   19:ldc1            #32  <String "android.intent.action.SEND">
	//    9   21:invokevirtual   #36  <Method Intent Intent.setAction(String)>
	//   10   24:pop             
		mStreams = null;
	//   11   25:aload_0         
	//   12   26:aconst_null     
	//   13   27:putfield        #139 <Field ArrayList mStreams>
		mIntent.putExtra("android.intent.extra.STREAM", ((Parcelable) (uri)));
	//   14   30:aload_0         
	//   15   31:getfield        #38  <Field Intent mIntent>
	//   16   34:ldc1            #131 <String "android.intent.extra.STREAM">
	//   17   36:aload_1         
	//   18   37:invokevirtual   #59  <Method Intent Intent.putExtra(String, Parcelable)>
	//   19   40:pop             
		return this;
	//   20   41:aload_0         
	//   21   42:areturn         
	}

	public ShareCompat$IntentBuilder setSubject(String s)
	{
		mIntent.putExtra("android.intent.extra.SUBJECT", s);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Intent mIntent>
	//    2    4:ldc1            #214 <String "android.intent.extra.SUBJECT">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #50  <Method Intent Intent.putExtra(String, String)>
	//    5   10:pop             
		return this;
	//    6   11:aload_0         
	//    7   12:areturn         
	}

	public ShareCompat$IntentBuilder setText(CharSequence charsequence)
	{
		mIntent.putExtra("android.intent.extra.TEXT", charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Intent mIntent>
	//    2    4:ldc1            #198 <String "android.intent.extra.TEXT">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #217 <Method Intent Intent.putExtra(String, CharSequence)>
	//    5   10:pop             
		return this;
	//    6   11:aload_0         
	//    7   12:areturn         
	}

	public ShareCompat$IntentBuilder setType(String s)
	{
		mIntent.setType(s);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Intent mIntent>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #220 <Method Intent Intent.setType(String)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public void startChooser()
	{
		mActivity.startActivity(createChooserIntent());
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Activity mActivity>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #223 <Method Intent createChooserIntent()>
	//    4    8:invokevirtual   #227 <Method void Activity.startActivity(Intent)>
	//    5   11:return          
	}

	private Activity mActivity;
	private ArrayList mBccAddresses;
	private ArrayList mCcAddresses;
	private CharSequence mChooserTitle;
	private Intent mIntent;
	private ArrayList mStreams;
	private ArrayList mToAddresses;

	private ShareCompat$IntentBuilder(Activity activity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mActivity = activity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field Activity mActivity>
		mIntent = (new Intent()).setAction("android.intent.action.SEND");
	//    5    9:aload_0         
	//    6   10:new             #29  <Class Intent>
	//    7   13:dup             
	//    8   14:invokespecial   #30  <Method void Intent()>
	//    9   17:ldc1            #32  <String "android.intent.action.SEND">
	//   10   19:invokevirtual   #36  <Method Intent Intent.setAction(String)>
	//   11   22:putfield        #38  <Field Intent mIntent>
		mIntent.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", activity.getPackageName());
	//   12   25:aload_0         
	//   13   26:getfield        #38  <Field Intent mIntent>
	//   14   29:ldc1            #40  <String "android.support.v4.app.EXTRA_CALLING_PACKAGE">
	//   15   31:aload_1         
	//   16   32:invokevirtual   #46  <Method String Activity.getPackageName()>
	//   17   35:invokevirtual   #50  <Method Intent Intent.putExtra(String, String)>
	//   18   38:pop             
		mIntent.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", ((Parcelable) (activity.getComponentName())));
	//   19   39:aload_0         
	//   20   40:getfield        #38  <Field Intent mIntent>
	//   21   43:ldc1            #52  <String "android.support.v4.app.EXTRA_CALLING_ACTIVITY">
	//   22   45:aload_1         
	//   23   46:invokevirtual   #56  <Method android.content.ComponentName Activity.getComponentName()>
	//   24   49:invokevirtual   #59  <Method Intent Intent.putExtra(String, Parcelable)>
	//   25   52:pop             
		mIntent.addFlags(0x80000);
	//   26   53:aload_0         
	//   27   54:getfield        #38  <Field Intent mIntent>
	//   28   57:ldc1            #60  <Int 0x80000>
	//   29   59:invokevirtual   #64  <Method Intent Intent.addFlags(int)>
	//   30   62:pop             
	//   31   63:return          
	}
}

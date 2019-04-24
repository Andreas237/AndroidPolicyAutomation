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
		String as1[];
		if(as != null)
	//*   5   10:aload           4
	//*   6   12:ifnull          67
			i = as.length;
	//    7   15:aload           4
	//    8   17:arraylength     
	//    9   18:istore_3        
		else
	//*  10   19:aload_2         
	//*  11   20:invokevirtual   #77  <Method int ArrayList.size()>
	//*  12   23:iload_3         
	//*  13   24:iadd            
	//*  14   25:anewarray       String[]
	//*  15   28:astore          5
	//*  16   30:aload_2         
	//*  17   31:aload           5
	//*  18   33:invokevirtual   #83  <Method Object[] ArrayList.toArray(Object[])>
	//*  19   36:pop             
	//*  20   37:aload           4
	//*  21   39:ifnull          55
	//*  22   42:aload           4
	//*  23   44:iconst_0        
	//*  24   45:aload           5
	//*  25   47:aload_2         
	//*  26   48:invokevirtual   #77  <Method int ArrayList.size()>
	//*  27   51:iload_3         
	//*  28   52:invokestatic    #89  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  29   55:aload_0         
	//*  30   56:getfield        #38  <Field Intent mIntent>
	//*  31   59:aload_1         
	//*  32   60:aload           5
	//*  33   62:invokevirtual   #92  <Method Intent Intent.putExtra(String, String[])>
	//*  34   65:pop             
	//*  35   66:return          
			i = 0;
	//   36   67:iconst_0        
	//   37   68:istore_3        
		as1 = new String[arraylist.size() + i];
		arraylist.toArray(((Object []) (as1)));
		if(as != null)
			System.arraycopy(((Object) (as)), 0, ((Object) (as1)), arraylist.size(), i);
		mIntent.putExtra(s, as1);
	//*  38   69:goto            19
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
		String as2[];
		if(as1 != null)
	//*   7   14:aload           5
	//*   8   16:ifnull          67
			i = as1.length;
	//    9   19:aload           5
	//   10   21:arraylength     
	//   11   22:istore_3        
		else
	//*  12   23:aload_2         
	//*  13   24:arraylength     
	//*  14   25:iload_3         
	//*  15   26:iadd            
	//*  16   27:anewarray       String[]
	//*  17   30:astore          6
	//*  18   32:aload           5
	//*  19   34:ifnull          47
	//*  20   37:aload           5
	//*  21   39:iconst_0        
	//*  22   40:aload           6
	//*  23   42:iconst_0        
	//*  24   43:iload_3         
	//*  25   44:invokestatic    #89  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  26   47:aload_2         
	//*  27   48:iconst_0        
	//*  28   49:aload           6
	//*  29   51:iload_3         
	//*  30   52:aload_2         
	//*  31   53:arraylength     
	//*  32   54:invokestatic    #89  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  33   57:aload           4
	//*  34   59:aload_1         
	//*  35   60:aload           6
	//*  36   62:invokevirtual   #92  <Method Intent Intent.putExtra(String, String[])>
	//*  37   65:pop             
	//*  38   66:return          
			i = 0;
	//   39   67:iconst_0        
	//   40   68:istore_3        
		as2 = new String[as.length + i];
		if(as1 != null)
			System.arraycopy(((Object) (as1)), 0, ((Object) (as2)), 0, i);
		System.arraycopy(((Object) (as)), 0, ((Object) (as2)), i, as.length);
		intent.putExtra(s, as2);
	//*  41   69:goto            23
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
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		if(mToAddresses != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #125 <Field ArrayList mToAddresses>
	//*   4    6:ifnull          24
		{
			combineArrayExtra("android.intent.extra.EMAIL", mToAddresses);
	//    5    9:aload_0         
	//    6   10:ldc1            #127 <String "android.intent.extra.EMAIL">
	//    7   12:aload_0         
	//    8   13:getfield        #125 <Field ArrayList mToAddresses>
	//    9   16:invokespecial   #157 <Method void combineArrayExtra(String, ArrayList)>
			mToAddresses = null;
	//   10   19:aload_0         
	//   11   20:aconst_null     
	//   12   21:putfield        #125 <Field ArrayList mToAddresses>
		}
		if(mCcAddresses != null)
	//*  13   24:aload_0         
	//*  14   25:getfield        #120 <Field ArrayList mCcAddresses>
	//*  15   28:ifnull          46
		{
			combineArrayExtra("android.intent.extra.CC", mCcAddresses);
	//   16   31:aload_0         
	//   17   32:ldc1            #122 <String "android.intent.extra.CC">
	//   18   34:aload_0         
	//   19   35:getfield        #120 <Field ArrayList mCcAddresses>
	//   20   38:invokespecial   #157 <Method void combineArrayExtra(String, ArrayList)>
			mCcAddresses = null;
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:putfield        #120 <Field ArrayList mCcAddresses>
		}
		if(mBccAddresses != null)
	//*  24   46:aload_0         
	//*  25   47:getfield        #107 <Field ArrayList mBccAddresses>
	//*  26   50:ifnull          68
		{
			combineArrayExtra("android.intent.extra.BCC", mBccAddresses);
	//   27   53:aload_0         
	//   28   54:ldc1            #115 <String "android.intent.extra.BCC">
	//   29   56:aload_0         
	//   30   57:getfield        #107 <Field ArrayList mBccAddresses>
	//   31   60:invokespecial   #157 <Method void combineArrayExtra(String, ArrayList)>
			mBccAddresses = null;
	//   32   63:aload_0         
	//   33   64:aconst_null     
	//   34   65:putfield        #107 <Field ArrayList mBccAddresses>
		}
		boolean flag1;
		if(mStreams == null || mStreams.size() <= 1)
	//*  35   68:aload_0         
	//*  36   69:getfield        #139 <Field ArrayList mStreams>
	//*  37   72:ifnull          214
	//*  38   75:aload_0         
	//*  39   76:getfield        #139 <Field ArrayList mStreams>
	//*  40   79:invokevirtual   #77  <Method int ArrayList.size()>
	//*  41   82:iconst_1        
	//*  42   83:icmple          214
	//*  43   86:aload_0         
	//*  44   87:getfield        #38  <Field Intent mIntent>
	//*  45   90:invokevirtual   #160 <Method String Intent.getAction()>
	//*  46   93:ldc1            #162 <String "android.intent.action.SEND_MULTIPLE">
	//*  47   95:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  48   98:istore_2        
	//*  49   99:iload_1         
	//*  50  100:ifne            160
	//*  51  103:iload_2         
	//*  52  104:ifeq            160
	//*  53  107:aload_0         
	//*  54  108:getfield        #38  <Field Intent mIntent>
	//*  55  111:ldc1            #32  <String "android.intent.action.SEND">
	//*  56  113:invokevirtual   #36  <Method Intent Intent.setAction(String)>
	//*  57  116:pop             
	//*  58  117:aload_0         
	//*  59  118:getfield        #139 <Field ArrayList mStreams>
	//*  60  121:ifnull          219
	//*  61  124:aload_0         
	//*  62  125:getfield        #139 <Field ArrayList mStreams>
	//*  63  128:invokevirtual   #169 <Method boolean ArrayList.isEmpty()>
	//*  64  131:ifne            219
	//*  65  134:aload_0         
	//*  66  135:getfield        #38  <Field Intent mIntent>
	//*  67  138:ldc1            #131 <String "android.intent.extra.STREAM">
	//*  68  140:aload_0         
	//*  69  141:getfield        #139 <Field ArrayList mStreams>
	//*  70  144:iconst_0        
	//*  71  145:invokevirtual   #173 <Method Object ArrayList.get(int)>
	//*  72  148:checkcast       #175 <Class Parcelable>
	//*  73  151:invokevirtual   #59  <Method Intent Intent.putExtra(String, Parcelable)>
	//*  74  154:pop             
	//*  75  155:aload_0         
	//*  76  156:aconst_null     
	//*  77  157:putfield        #139 <Field ArrayList mStreams>
	//*  78  160:iload_1         
	//*  79  161:ifeq            209
	//*  80  164:iload_2         
	//*  81  165:ifne            209
	//*  82  168:aload_0         
	//*  83  169:getfield        #38  <Field Intent mIntent>
	//*  84  172:ldc1            #162 <String "android.intent.action.SEND_MULTIPLE">
	//*  85  174:invokevirtual   #36  <Method Intent Intent.setAction(String)>
	//*  86  177:pop             
	//*  87  178:aload_0         
	//*  88  179:getfield        #139 <Field ArrayList mStreams>
	//*  89  182:ifnull          231
	//*  90  185:aload_0         
	//*  91  186:getfield        #139 <Field ArrayList mStreams>
	//*  92  189:invokevirtual   #169 <Method boolean ArrayList.isEmpty()>
	//*  93  192:ifne            231
	//*  94  195:aload_0         
	//*  95  196:getfield        #38  <Field Intent mIntent>
	//*  96  199:ldc1            #131 <String "android.intent.extra.STREAM">
	//*  97  201:aload_0         
	//*  98  202:getfield        #139 <Field ArrayList mStreams>
	//*  99  205:invokevirtual   #179 <Method Intent Intent.putParcelableArrayListExtra(String, ArrayList)>
	//* 100  208:pop             
	//* 101  209:aload_0         
	//* 102  210:getfield        #38  <Field Intent mIntent>
	//* 103  213:areturn         
			flag = false;
	//  104  214:iconst_0        
	//  105  215:istore_1        
		flag1 = mIntent.getAction().equals("android.intent.action.SEND_MULTIPLE");
		if(!flag && flag1)
		{
			mIntent.setAction("android.intent.action.SEND");
			if(mStreams != null && !mStreams.isEmpty())
				mIntent.putExtra("android.intent.extra.STREAM", (Parcelable)mStreams.get(0));
			else
	//* 106  216:goto            86
				mIntent.removeExtra("android.intent.extra.STREAM");
	//  107  219:aload_0         
	//  108  220:getfield        #38  <Field Intent mIntent>
	//  109  223:ldc1            #131 <String "android.intent.extra.STREAM">
	//  110  225:invokevirtual   #146 <Method void Intent.removeExtra(String)>
			mStreams = null;
		}
		if(flag && !flag1)
		{
			mIntent.setAction("android.intent.action.SEND_MULTIPLE");
			if(mStreams != null && !mStreams.isEmpty())
				mIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", mStreams);
			else
	//* 111  228:goto            155
				mIntent.removeExtra("android.intent.extra.STREAM");
	//  112  231:aload_0         
	//  113  232:getfield        #38  <Field Intent mIntent>
	//  114  235:ldc1            #131 <String "android.intent.extra.STREAM">
	//  115  237:invokevirtual   #146 <Method void Intent.removeExtra(String)>
		}
		return mIntent;
	//* 116  240:goto            209
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

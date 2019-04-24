// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import java.util.ArrayList;

public final class ShareCompat
{
	public static class IntentBuilder
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

		public static IntentBuilder from(Activity activity)
		{
			return new IntentBuilder(activity);
		//    0    0:new             #2   <Class ShareCompat$IntentBuilder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #103 <Method void ShareCompat$IntentBuilder(Activity)>
		//    4    8:areturn         
		}

		public IntentBuilder addEmailBcc(String s)
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

		public IntentBuilder addEmailBcc(String as[])
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

		public IntentBuilder addEmailCc(String s)
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

		public IntentBuilder addEmailCc(String as[])
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

		public IntentBuilder addEmailTo(String s)
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

		public IntentBuilder addEmailTo(String as[])
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

		public IntentBuilder addStream(Uri uri)
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

		public IntentBuilder setChooserTitle(int i)
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

		public IntentBuilder setChooserTitle(CharSequence charsequence)
		{
			mChooserTitle = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #149 <Field CharSequence mChooserTitle>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public IntentBuilder setEmailBcc(String as[])
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

		public IntentBuilder setEmailCc(String as[])
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

		public IntentBuilder setEmailTo(String as[])
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

		public IntentBuilder setHtmlText(String s)
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
		//   13   25:invokestatic    #208 <Method Spanned Html.fromHtml(String)>
		//   14   28:invokevirtual   #211 <Method ShareCompat$IntentBuilder setText(CharSequence)>
		//   15   31:pop             
			return this;
		//   16   32:aload_0         
		//   17   33:areturn         
		}

		public IntentBuilder setStream(Uri uri)
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

		public IntentBuilder setSubject(String s)
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

		public IntentBuilder setText(CharSequence charsequence)
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

		public IntentBuilder setType(String s)
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

		private IntentBuilder(Activity activity)
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
		//   23   46:invokevirtual   #56  <Method ComponentName Activity.getComponentName()>
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

	public static class IntentReader
	{

		public static IntentReader from(Activity activity)
		{
			return new IntentReader(activity);
		//    0    0:new             #2   <Class ShareCompat$IntentReader>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #52  <Method void ShareCompat$IntentReader(Activity)>
		//    4    8:areturn         
		}

		private static void withinStyle(StringBuilder stringbuilder, CharSequence charsequence, int i, int j)
		{
			while(i < j) 
		//*   0    0:iload_2         
		//*   1    1:iload_3         
		//*   2    2:icmpge          178
			{
				char c = charsequence.charAt(i);
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokeinterface #60  <Method char CharSequence.charAt(int)>
		//    6   12:istore          4
				if(c == '<')
		//*   7   14:iload           4
		//*   8   16:bipush          60
		//*   9   18:icmpne          35
					stringbuilder.append("&lt;");
		//   10   21:aload_0         
		//   11   22:ldc1            #62  <String "&lt;">
		//   12   24:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:pop             
				else
		//*  14   28:iload_2         
		//*  15   29:iconst_1        
		//*  16   30:iadd            
		//*  17   31:istore_2        
		//*  18   32:goto            0
				if(c == '>')
		//*  19   35:iload           4
		//*  20   37:bipush          62
		//*  21   39:icmpne          52
					stringbuilder.append("&gt;");
		//   22   42:aload_0         
		//   23   43:ldc1            #70  <String "&gt;">
		//   24   45:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   25   48:pop             
				else
		//*  26   49:goto            28
				if(c == '&')
		//*  27   52:iload           4
		//*  28   54:bipush          38
		//*  29   56:icmpne          69
					stringbuilder.append("&amp;");
		//   30   59:aload_0         
		//   31   60:ldc1            #72  <String "&amp;">
		//   32   62:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   33   65:pop             
				else
		//*  34   66:goto            28
				if(c > '~' || c < ' ')
		//*  35   69:iload           4
		//*  36   71:bipush          126
		//*  37   73:icmpgt          83
		//*  38   76:iload           4
		//*  39   78:bipush          32
		//*  40   80:icmpge          116
					stringbuilder.append((new StringBuilder()).append("&#").append(((int) (c))).append(";").toString());
		//   41   83:aload_0         
		//   42   84:new             #64  <Class StringBuilder>
		//   43   87:dup             
		//   44   88:invokespecial   #73  <Method void StringBuilder()>
		//   45   91:ldc1            #75  <String "&#">
		//   46   93:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   47   96:iload           4
		//   48   98:invokevirtual   #78  <Method StringBuilder StringBuilder.append(int)>
		//   49  101:ldc1            #80  <String ";">
		//   50  103:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   51  106:invokevirtual   #84  <Method String StringBuilder.toString()>
		//   52  109:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   53  112:pop             
				else
		//*  54  113:goto            28
				if(c == ' ')
		//*  55  116:iload           4
		//*  56  118:bipush          32
		//*  57  120:icmpne          168
				{
					for(; i + 1 < j && charsequence.charAt(i + 1) == ' '; i++)
		//*  58  123:iload_2         
		//*  59  124:iconst_1        
		//*  60  125:iadd            
		//*  61  126:iload_3         
		//*  62  127:icmpge          158
		//*  63  130:aload_1         
		//*  64  131:iload_2         
		//*  65  132:iconst_1        
		//*  66  133:iadd            
		//*  67  134:invokeinterface #60  <Method char CharSequence.charAt(int)>
		//*  68  139:bipush          32
		//*  69  141:icmpne          158
						stringbuilder.append("&nbsp;");
		//   70  144:aload_0         
		//   71  145:ldc1            #86  <String "&nbsp;">
		//   72  147:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   73  150:pop             

		//   74  151:iload_2         
		//   75  152:iconst_1        
		//   76  153:iadd            
		//   77  154:istore_2        
		//*  78  155:goto            123
					stringbuilder.append(' ');
		//   79  158:aload_0         
		//   80  159:bipush          32
		//   81  161:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
		//   82  164:pop             
				} else
		//*  83  165:goto            28
				{
					stringbuilder.append(c);
		//   84  168:aload_0         
		//   85  169:iload           4
		//   86  171:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
		//   87  174:pop             
				}
				i++;
			}
		//*  88  175:goto            28
		//   89  178:return          
		}

		public ComponentName getCallingActivity()
		{
			return mCallingActivity;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field ComponentName mCallingActivity>
		//    2    4:areturn         
		}

		public Drawable getCallingActivityIcon()
		{
			if(mCallingActivity == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #47  <Field ComponentName mCallingActivity>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			Object obj = ((Object) (mActivity.getPackageManager()));
		//    5    9:aload_0         
		//    6   10:getfield        #27  <Field Activity mActivity>
		//    7   13:invokevirtual   #98  <Method PackageManager Activity.getPackageManager()>
		//    8   16:astore_1        
			try
			{
				obj = ((Object) (((PackageManager) (obj)).getActivityIcon(mCallingActivity)));
		//    9   17:aload_1         
		//   10   18:aload_0         
		//   11   19:getfield        #47  <Field ComponentName mCallingActivity>
		//   12   22:invokevirtual   #104 <Method Drawable PackageManager.getActivityIcon(ComponentName)>
		//   13   25:astore_1        
			}
		//*  14   26:aload_1         
		//*  15   27:areturn         
			catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
		//*  16   28:astore_1        
			{
				Log.e("IntentReader", "Could not retrieve icon for calling activity", ((Throwable) (namenotfoundexception)));
		//   17   29:ldc1            #10  <String "IntentReader">
		//   18   31:ldc1            #106 <String "Could not retrieve icon for calling activity">
		//   19   33:aload_1         
		//   20   34:invokestatic    #112 <Method int Log.e(String, String, Throwable)>
		//   21   37:pop             
				return null;
		//   22   38:aconst_null     
		//   23   39:areturn         
			}
			return ((Drawable) (obj));
		}

		public Drawable getCallingApplicationIcon()
		{
			if(mCallingPackage == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #41  <Field String mCallingPackage>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			Object obj = ((Object) (mActivity.getPackageManager()));
		//    5    9:aload_0         
		//    6   10:getfield        #27  <Field Activity mActivity>
		//    7   13:invokevirtual   #98  <Method PackageManager Activity.getPackageManager()>
		//    8   16:astore_1        
			try
			{
				obj = ((Object) (((PackageManager) (obj)).getApplicationIcon(mCallingPackage)));
		//    9   17:aload_1         
		//   10   18:aload_0         
		//   11   19:getfield        #41  <Field String mCallingPackage>
		//   12   22:invokevirtual   #117 <Method Drawable PackageManager.getApplicationIcon(String)>
		//   13   25:astore_1        
			}
		//*  14   26:aload_1         
		//*  15   27:areturn         
			catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
		//*  16   28:astore_1        
			{
				Log.e("IntentReader", "Could not retrieve icon for calling application", ((Throwable) (namenotfoundexception)));
		//   17   29:ldc1            #10  <String "IntentReader">
		//   18   31:ldc1            #119 <String "Could not retrieve icon for calling application">
		//   19   33:aload_1         
		//   20   34:invokestatic    #112 <Method int Log.e(String, String, Throwable)>
		//   21   37:pop             
				return null;
		//   22   38:aconst_null     
		//   23   39:areturn         
			}
			return ((Drawable) (obj));
		}

		public CharSequence getCallingApplicationLabel()
		{
			if(mCallingPackage == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #41  <Field String mCallingPackage>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			Object obj = ((Object) (mActivity.getPackageManager()));
		//    5    9:aload_0         
		//    6   10:getfield        #27  <Field Activity mActivity>
		//    7   13:invokevirtual   #98  <Method PackageManager Activity.getPackageManager()>
		//    8   16:astore_1        
			try
			{
				obj = ((Object) (((PackageManager) (obj)).getApplicationLabel(((PackageManager) (obj)).getApplicationInfo(mCallingPackage, 0))));
		//    9   17:aload_1         
		//   10   18:aload_1         
		//   11   19:aload_0         
		//   12   20:getfield        #41  <Field String mCallingPackage>
		//   13   23:iconst_0        
		//   14   24:invokevirtual   #125 <Method android.content.pm.ApplicationInfo PackageManager.getApplicationInfo(String, int)>
		//   15   27:invokevirtual   #129 <Method CharSequence PackageManager.getApplicationLabel(android.content.pm.ApplicationInfo)>
		//   16   30:astore_1        
			}
		//*  17   31:aload_1         
		//*  18   32:areturn         
			catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
		//*  19   33:astore_1        
			{
				Log.e("IntentReader", "Could not retrieve label for calling application", ((Throwable) (namenotfoundexception)));
		//   20   34:ldc1            #10  <String "IntentReader">
		//   21   36:ldc1            #131 <String "Could not retrieve label for calling application">
		//   22   38:aload_1         
		//   23   39:invokestatic    #112 <Method int Log.e(String, String, Throwable)>
		//   24   42:pop             
				return null;
		//   25   43:aconst_null     
		//   26   44:areturn         
			}
			return ((CharSequence) (obj));
		}

		public String getCallingPackage()
		{
			return mCallingPackage;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field String mCallingPackage>
		//    2    4:areturn         
		}

		public String[] getEmailBcc()
		{
			return mIntent.getStringArrayExtra("android.intent.extra.BCC");
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #135 <String "android.intent.extra.BCC">
		//    3    6:invokevirtual   #141 <Method String[] Intent.getStringArrayExtra(String)>
		//    4    9:areturn         
		}

		public String[] getEmailCc()
		{
			return mIntent.getStringArrayExtra("android.intent.extra.CC");
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #144 <String "android.intent.extra.CC">
		//    3    6:invokevirtual   #141 <Method String[] Intent.getStringArrayExtra(String)>
		//    4    9:areturn         
		}

		public String[] getEmailTo()
		{
			return mIntent.getStringArrayExtra("android.intent.extra.EMAIL");
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #147 <String "android.intent.extra.EMAIL">
		//    3    6:invokevirtual   #141 <Method String[] Intent.getStringArrayExtra(String)>
		//    4    9:areturn         
		}

		public String getHtmlText()
		{
			String s1 = mIntent.getStringExtra("android.intent.extra.HTML_TEXT");
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #150 <String "android.intent.extra.HTML_TEXT">
		//    3    6:invokevirtual   #154 <Method String Intent.getStringExtra(String)>
		//    4    9:astore_2        
			String s = s1;
		//    5   10:aload_2         
		//    6   11:astore_1        
			if(s1 == null)
		//*   7   12:aload_2         
		//*   8   13:ifnonnull       36
			{
				CharSequence charsequence = getText();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #157 <Method CharSequence getText()>
		//   11   20:astore_3        
				if(charsequence instanceof Spanned)
		//*  12   21:aload_3         
		//*  13   22:instanceof      #159 <Class Spanned>
		//*  14   25:ifeq            38
				{
					s = Html.toHtml((Spanned)charsequence);
		//   15   28:aload_3         
		//   16   29:checkcast       #159 <Class Spanned>
		//   17   32:invokestatic    #165 <Method String Html.toHtml(Spanned)>
		//   18   35:astore_1        
				} else
		//*  19   36:aload_1         
		//*  20   37:areturn         
				{
					s = s1;
		//   21   38:aload_2         
		//   22   39:astore_1        
					if(charsequence != null)
		//*  23   40:aload_3         
		//*  24   41:ifnull          36
						if(android.os.Build.VERSION.SDK_INT >= 16)
		//*  25   44:getstatic       #171 <Field int android.os.Build$VERSION.SDK_INT>
		//*  26   47:bipush          16
		//*  27   49:icmplt          57
						{
							return Html.escapeHtml(charsequence);
		//   28   52:aload_3         
		//   29   53:invokestatic    #175 <Method String Html.escapeHtml(CharSequence)>
		//   30   56:areturn         
						} else
						{
							StringBuilder stringbuilder = new StringBuilder();
		//   31   57:new             #64  <Class StringBuilder>
		//   32   60:dup             
		//   33   61:invokespecial   #73  <Method void StringBuilder()>
		//   34   64:astore_1        
							withinStyle(stringbuilder, charsequence, 0, charsequence.length());
		//   35   65:aload_1         
		//   36   66:aload_3         
		//   37   67:iconst_0        
		//   38   68:aload_3         
		//   39   69:invokeinterface #179 <Method int CharSequence.length()>
		//   40   74:invokestatic    #181 <Method void withinStyle(StringBuilder, CharSequence, int, int)>
							return stringbuilder.toString();
		//   41   77:aload_1         
		//   42   78:invokevirtual   #84  <Method String StringBuilder.toString()>
		//   43   81:areturn         
						}
				}
			}
			return s;
		}

		public Uri getStream()
		{
			return (Uri)mIntent.getParcelableExtra("android.intent.extra.STREAM");
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #185 <String "android.intent.extra.STREAM">
		//    3    6:invokevirtual   #189 <Method Parcelable Intent.getParcelableExtra(String)>
		//    4    9:checkcast       #191 <Class Uri>
		//    5   12:areturn         
		}

		public Uri getStream(int i)
		{
			if(mStreams == null && isMultipleShare())
		//*   0    0:aload_0         
		//*   1    1:getfield        #194 <Field ArrayList mStreams>
		//*   2    4:ifnonnull       27
		//*   3    7:aload_0         
		//*   4    8:invokevirtual   #198 <Method boolean isMultipleShare()>
		//*   5   11:ifeq            27
				mStreams = mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
		//    6   14:aload_0         
		//    7   15:aload_0         
		//    8   16:getfield        #35  <Field Intent mIntent>
		//    9   19:ldc1            #185 <String "android.intent.extra.STREAM">
		//   10   21:invokevirtual   #202 <Method ArrayList Intent.getParcelableArrayListExtra(String)>
		//   11   24:putfield        #194 <Field ArrayList mStreams>
			if(mStreams != null)
		//*  12   27:aload_0         
		//*  13   28:getfield        #194 <Field ArrayList mStreams>
		//*  14   31:ifnull          46
				return (Uri)mStreams.get(i);
		//   15   34:aload_0         
		//   16   35:getfield        #194 <Field ArrayList mStreams>
		//   17   38:iload_1         
		//   18   39:invokevirtual   #208 <Method Object ArrayList.get(int)>
		//   19   42:checkcast       #191 <Class Uri>
		//   20   45:areturn         
			if(i == 0)
		//*  21   46:iload_1         
		//*  22   47:ifne            63
				return (Uri)mIntent.getParcelableExtra("android.intent.extra.STREAM");
		//   23   50:aload_0         
		//   24   51:getfield        #35  <Field Intent mIntent>
		//   25   54:ldc1            #185 <String "android.intent.extra.STREAM">
		//   26   56:invokevirtual   #189 <Method Parcelable Intent.getParcelableExtra(String)>
		//   27   59:checkcast       #191 <Class Uri>
		//   28   62:areturn         
			else
				throw new IndexOutOfBoundsException((new StringBuilder()).append("Stream items available: ").append(getStreamCount()).append(" index requested: ").append(i).toString());
		//   29   63:new             #210 <Class IndexOutOfBoundsException>
		//   30   66:dup             
		//   31   67:new             #64  <Class StringBuilder>
		//   32   70:dup             
		//   33   71:invokespecial   #73  <Method void StringBuilder()>
		//   34   74:ldc1            #212 <String "Stream items available: ">
		//   35   76:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   36   79:aload_0         
		//   37   80:invokevirtual   #215 <Method int getStreamCount()>
		//   38   83:invokevirtual   #78  <Method StringBuilder StringBuilder.append(int)>
		//   39   86:ldc1            #217 <String " index requested: ">
		//   40   88:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   41   91:iload_1         
		//   42   92:invokevirtual   #78  <Method StringBuilder StringBuilder.append(int)>
		//   43   95:invokevirtual   #84  <Method String StringBuilder.toString()>
		//   44   98:invokespecial   #220 <Method void IndexOutOfBoundsException(String)>
		//   45  101:athrow          
		}

		public int getStreamCount()
		{
			if(mStreams == null && isMultipleShare())
		//*   0    0:aload_0         
		//*   1    1:getfield        #194 <Field ArrayList mStreams>
		//*   2    4:ifnonnull       27
		//*   3    7:aload_0         
		//*   4    8:invokevirtual   #198 <Method boolean isMultipleShare()>
		//*   5   11:ifeq            27
				mStreams = mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
		//    6   14:aload_0         
		//    7   15:aload_0         
		//    8   16:getfield        #35  <Field Intent mIntent>
		//    9   19:ldc1            #185 <String "android.intent.extra.STREAM">
		//   10   21:invokevirtual   #202 <Method ArrayList Intent.getParcelableArrayListExtra(String)>
		//   11   24:putfield        #194 <Field ArrayList mStreams>
			if(mStreams != null)
		//*  12   27:aload_0         
		//*  13   28:getfield        #194 <Field ArrayList mStreams>
		//*  14   31:ifnull          42
				return mStreams.size();
		//   15   34:aload_0         
		//   16   35:getfield        #194 <Field ArrayList mStreams>
		//   17   38:invokevirtual   #223 <Method int ArrayList.size()>
		//   18   41:ireturn         
			return !mIntent.hasExtra("android.intent.extra.STREAM") ? 0 : 1;
		//   19   42:aload_0         
		//   20   43:getfield        #35  <Field Intent mIntent>
		//   21   46:ldc1            #185 <String "android.intent.extra.STREAM">
		//   22   48:invokevirtual   #227 <Method boolean Intent.hasExtra(String)>
		//   23   51:ifeq            56
		//   24   54:iconst_1        
		//   25   55:ireturn         
		//   26   56:iconst_0        
		//   27   57:ireturn         
		}

		public String getSubject()
		{
			return mIntent.getStringExtra("android.intent.extra.SUBJECT");
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #230 <String "android.intent.extra.SUBJECT">
		//    3    6:invokevirtual   #154 <Method String Intent.getStringExtra(String)>
		//    4    9:areturn         
		}

		public CharSequence getText()
		{
			return mIntent.getCharSequenceExtra("android.intent.extra.TEXT");
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #232 <String "android.intent.extra.TEXT">
		//    3    6:invokevirtual   #236 <Method CharSequence Intent.getCharSequenceExtra(String)>
		//    4    9:areturn         
		}

		public String getType()
		{
			return mIntent.getType();
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:invokevirtual   #239 <Method String Intent.getType()>
		//    3    7:areturn         
		}

		public boolean isMultipleShare()
		{
			return "android.intent.action.SEND_MULTIPLE".equals(((Object) (mIntent.getAction())));
		//    0    0:ldc1            #241 <String "android.intent.action.SEND_MULTIPLE">
		//    1    2:aload_0         
		//    2    3:getfield        #35  <Field Intent mIntent>
		//    3    6:invokevirtual   #244 <Method String Intent.getAction()>
		//    4    9:invokevirtual   #250 <Method boolean String.equals(Object)>
		//    5   12:ireturn         
		}

		public boolean isShareIntent()
		{
			String s = mIntent.getAction();
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:invokevirtual   #244 <Method String Intent.getAction()>
		//    3    7:astore_1        
			return "android.intent.action.SEND".equals(((Object) (s))) || "android.intent.action.SEND_MULTIPLE".equals(((Object) (s)));
		//    4    8:ldc1            #253 <String "android.intent.action.SEND">
		//    5   10:aload_1         
		//    6   11:invokevirtual   #250 <Method boolean String.equals(Object)>
		//    7   14:ifne            26
		//    8   17:ldc1            #241 <String "android.intent.action.SEND_MULTIPLE">
		//    9   19:aload_1         
		//   10   20:invokevirtual   #250 <Method boolean String.equals(Object)>
		//   11   23:ifeq            28
		//   12   26:iconst_1        
		//   13   27:ireturn         
		//   14   28:iconst_0        
		//   15   29:ireturn         
		}

		public boolean isSingleShare()
		{
			return "android.intent.action.SEND".equals(((Object) (mIntent.getAction())));
		//    0    0:ldc1            #253 <String "android.intent.action.SEND">
		//    1    2:aload_0         
		//    2    3:getfield        #35  <Field Intent mIntent>
		//    3    6:invokevirtual   #244 <Method String Intent.getAction()>
		//    4    9:invokevirtual   #250 <Method boolean String.equals(Object)>
		//    5   12:ireturn         
		}

		private static final String TAG = "IntentReader";
		private Activity mActivity;
		private ComponentName mCallingActivity;
		private String mCallingPackage;
		private Intent mIntent;
		private ArrayList mStreams;

		private IntentReader(Activity activity)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			mActivity = activity;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #27  <Field Activity mActivity>
			mIntent = activity.getIntent();
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:invokevirtual   #33  <Method Intent Activity.getIntent()>
		//    8   14:putfield        #35  <Field Intent mIntent>
			mCallingPackage = ShareCompat.getCallingPackage(activity);
		//    9   17:aload_0         
		//   10   18:aload_1         
		//   11   19:invokestatic    #39  <Method String ShareCompat.getCallingPackage(Activity)>
		//   12   22:putfield        #41  <Field String mCallingPackage>
			mCallingActivity = ShareCompat.getCallingActivity(activity);
		//   13   25:aload_0         
		//   14   26:aload_1         
		//   15   27:invokestatic    #45  <Method ComponentName ShareCompat.getCallingActivity(Activity)>
		//   16   30:putfield        #47  <Field ComponentName mCallingActivity>
		//   17   33:return          
		}
	}


	private ShareCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	public static void configureMenuItem(Menu menu, int i, IntentBuilder intentbuilder)
	{
		menu = ((Menu) (menu.findItem(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokeinterface #33  <Method MenuItem Menu.findItem(int)>
	//    3    7:astore_0        
		if(menu == null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       44
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Could not find menu item with id ").append(i).append(" in the supplied menu").toString());
	//    6   12:new             #35  <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:new             #37  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #38  <Method void StringBuilder()>
	//   11   23:ldc1            #40  <String "Could not find menu item with id ">
	//   12   25:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:iload_1         
	//   14   29:invokevirtual   #47  <Method StringBuilder StringBuilder.append(int)>
	//   15   32:ldc1            #49  <String " in the supplied menu">
	//   16   34:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   18   40:invokespecial   #56  <Method void IllegalArgumentException(String)>
	//   19   43:athrow          
		} else
		{
			configureMenuItem(((MenuItem) (menu)), intentbuilder);
	//   20   44:aload_0         
	//   21   45:aload_2         
	//   22   46:invokestatic    #59  <Method void configureMenuItem(MenuItem, ShareCompat$IntentBuilder)>
			return;
	//   23   49:return          
		}
	}

	public static void configureMenuItem(MenuItem menuitem, IntentBuilder intentbuilder)
	{
		Object obj = ((Object) (menuitem.getActionProvider()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #65  <Method android.view.ActionProvider MenuItem.getActionProvider()>
	//    2    6:astore_2        
		if(!(obj instanceof ShareActionProvider))
	//*   3    7:aload_2         
	//*   4    8:instanceof      #67  <Class ShareActionProvider>
	//*   5   11:ifne            103
			obj = ((Object) (new ShareActionProvider(((android.content.Context) (intentbuilder.getActivity())))));
	//    6   14:new             #67  <Class ShareActionProvider>
	//    7   17:dup             
	//    8   18:aload_1         
	//    9   19:invokevirtual   #71  <Method Activity ShareCompat$IntentBuilder.getActivity()>
	//   10   22:invokespecial   #74  <Method void ShareActionProvider(android.content.Context)>
	//   11   25:astore_2        
		else
	//*  12   26:aload_2         
	//*  13   27:new             #37  <Class StringBuilder>
	//*  14   30:dup             
	//*  15   31:invokespecial   #38  <Method void StringBuilder()>
	//*  16   34:ldc1            #20  <String ".sharecompat_">
	//*  17   36:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//*  18   39:aload_1         
	//*  19   40:invokevirtual   #71  <Method Activity ShareCompat$IntentBuilder.getActivity()>
	//*  20   43:invokevirtual   #78  <Method Class Object.getClass()>
	//*  21   46:invokevirtual   #83  <Method String Class.getName()>
	//*  22   49:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//*  23   52:invokevirtual   #53  <Method String StringBuilder.toString()>
	//*  24   55:invokevirtual   #86  <Method void ShareActionProvider.setShareHistoryFileName(String)>
	//*  25   58:aload_2         
	//*  26   59:aload_1         
	//*  27   60:invokevirtual   #90  <Method Intent ShareCompat$IntentBuilder.getIntent()>
	//*  28   63:invokevirtual   #94  <Method void ShareActionProvider.setShareIntent(Intent)>
	//*  29   66:aload_0         
	//*  30   67:aload_2         
	//*  31   68:invokeinterface #98  <Method MenuItem MenuItem.setActionProvider(android.view.ActionProvider)>
	//*  32   73:pop             
	//*  33   74:getstatic       #104 <Field int android.os.Build$VERSION.SDK_INT>
	//*  34   77:bipush          16
	//*  35   79:icmpge          102
	//*  36   82:aload_0         
	//*  37   83:invokeinterface #108 <Method boolean MenuItem.hasSubMenu()>
	//*  38   88:ifne            102
	//*  39   91:aload_0         
	//*  40   92:aload_1         
	//*  41   93:invokevirtual   #111 <Method Intent ShareCompat$IntentBuilder.createChooserIntent()>
	//*  42   96:invokeinterface #115 <Method MenuItem MenuItem.setIntent(Intent)>
	//*  43  101:pop             
	//*  44  102:return          
			obj = ((Object) ((ShareActionProvider)obj));
	//   45  103:aload_2         
	//   46  104:checkcast       #67  <Class ShareActionProvider>
	//   47  107:astore_2        
		((ShareActionProvider) (obj)).setShareHistoryFileName((new StringBuilder()).append(".sharecompat_").append(((Object) (intentbuilder.getActivity())).getClass().getName()).toString());
		((ShareActionProvider) (obj)).setShareIntent(intentbuilder.getIntent());
		menuitem.setActionProvider(((android.view.ActionProvider) (obj)));
		if(android.os.Build.VERSION.SDK_INT < 16 && !menuitem.hasSubMenu())
			menuitem.setIntent(intentbuilder.createChooserIntent());
	//*  48  108:goto            26
	}

	public static ComponentName getCallingActivity(Activity activity)
	{
		ComponentName componentname1 = activity.getCallingActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #122 <Method ComponentName Activity.getCallingActivity()>
	//    2    4:astore_2        
		ComponentName componentname = componentname1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(componentname1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       24
			componentname = (ComponentName)activity.getIntent().getParcelableExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY");
	//    7   11:aload_0         
	//    8   12:invokevirtual   #123 <Method Intent Activity.getIntent()>
	//    9   15:ldc1            #14  <String "android.support.v4.app.EXTRA_CALLING_ACTIVITY">
	//   10   17:invokevirtual   #129 <Method Parcelable Intent.getParcelableExtra(String)>
	//   11   20:checkcast       #131 <Class ComponentName>
	//   12   23:astore_1        
		return componentname;
	//   13   24:aload_1         
	//   14   25:areturn         
	}

	public static String getCallingPackage(Activity activity)
	{
		String s1 = activity.getCallingPackage();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method String Activity.getCallingPackage()>
	//    2    4:astore_2        
		String s = s1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(s1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       21
			s = activity.getIntent().getStringExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE");
	//    7   11:aload_0         
	//    8   12:invokevirtual   #123 <Method Intent Activity.getIntent()>
	//    9   15:ldc1            #17  <String "android.support.v4.app.EXTRA_CALLING_PACKAGE">
	//   10   17:invokevirtual   #139 <Method String Intent.getStringExtra(String)>
	//   11   20:astore_1        
		return s;
	//   12   21:aload_1         
	//   13   22:areturn         
	}

	public static final String EXTRA_CALLING_ACTIVITY = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
	public static final String EXTRA_CALLING_PACKAGE = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
	private static final String HISTORY_FILENAME_PREFIX = ".sharecompat_";
}

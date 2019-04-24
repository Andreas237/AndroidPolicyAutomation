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
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			ShareCompatICS, ShareCompatJB

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
		//    7   13:invokevirtual   #61  <Method PackageManager Activity.getPackageManager()>
		//    8   16:astore_1        
			try
			{
				obj = ((Object) (((PackageManager) (obj)).getActivityIcon(mCallingActivity)));
		//    9   17:aload_1         
		//   10   18:aload_0         
		//   11   19:getfield        #47  <Field ComponentName mCallingActivity>
		//   12   22:invokevirtual   #67  <Method Drawable PackageManager.getActivityIcon(ComponentName)>
		//   13   25:astore_1        
			}
		//*  14   26:aload_1         
		//*  15   27:areturn         
			catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
		//*  16   28:astore_1        
			{
				Log.e("IntentReader", "Could not retrieve icon for calling activity", ((Throwable) (namenotfoundexception)));
		//   17   29:ldc1            #10  <String "IntentReader">
		//   18   31:ldc1            #69  <String "Could not retrieve icon for calling activity">
		//   19   33:aload_1         
		//   20   34:invokestatic    #75  <Method int Log.e(String, String, Throwable)>
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
		//    7   13:invokevirtual   #61  <Method PackageManager Activity.getPackageManager()>
		//    8   16:astore_1        
			try
			{
				obj = ((Object) (((PackageManager) (obj)).getApplicationIcon(mCallingPackage)));
		//    9   17:aload_1         
		//   10   18:aload_0         
		//   11   19:getfield        #41  <Field String mCallingPackage>
		//   12   22:invokevirtual   #80  <Method Drawable PackageManager.getApplicationIcon(String)>
		//   13   25:astore_1        
			}
		//*  14   26:aload_1         
		//*  15   27:areturn         
			catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
		//*  16   28:astore_1        
			{
				Log.e("IntentReader", "Could not retrieve icon for calling application", ((Throwable) (namenotfoundexception)));
		//   17   29:ldc1            #10  <String "IntentReader">
		//   18   31:ldc1            #82  <String "Could not retrieve icon for calling application">
		//   19   33:aload_1         
		//   20   34:invokestatic    #75  <Method int Log.e(String, String, Throwable)>
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
		//    7   13:invokevirtual   #61  <Method PackageManager Activity.getPackageManager()>
		//    8   16:astore_1        
			try
			{
				obj = ((Object) (((PackageManager) (obj)).getApplicationLabel(((PackageManager) (obj)).getApplicationInfo(mCallingPackage, 0))));
		//    9   17:aload_1         
		//   10   18:aload_1         
		//   11   19:aload_0         
		//   12   20:getfield        #41  <Field String mCallingPackage>
		//   13   23:iconst_0        
		//   14   24:invokevirtual   #88  <Method android.content.pm.ApplicationInfo PackageManager.getApplicationInfo(String, int)>
		//   15   27:invokevirtual   #92  <Method CharSequence PackageManager.getApplicationLabel(android.content.pm.ApplicationInfo)>
		//   16   30:astore_1        
			}
		//*  17   31:aload_1         
		//*  18   32:areturn         
			catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
		//*  19   33:astore_1        
			{
				Log.e("IntentReader", "Could not retrieve label for calling application", ((Throwable) (namenotfoundexception)));
		//   20   34:ldc1            #10  <String "IntentReader">
		//   21   36:ldc1            #94  <String "Could not retrieve label for calling application">
		//   22   38:aload_1         
		//   23   39:invokestatic    #75  <Method int Log.e(String, String, Throwable)>
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
		//    2    4:ldc1            #99  <String "android.intent.extra.BCC">
		//    3    6:invokevirtual   #105 <Method String[] Intent.getStringArrayExtra(String)>
		//    4    9:areturn         
		}

		public String[] getEmailCc()
		{
			return mIntent.getStringArrayExtra("android.intent.extra.CC");
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #108 <String "android.intent.extra.CC">
		//    3    6:invokevirtual   #105 <Method String[] Intent.getStringArrayExtra(String)>
		//    4    9:areturn         
		}

		public String[] getEmailTo()
		{
			return mIntent.getStringArrayExtra("android.intent.extra.EMAIL");
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #111 <String "android.intent.extra.EMAIL">
		//    3    6:invokevirtual   #105 <Method String[] Intent.getStringArrayExtra(String)>
		//    4    9:areturn         
		}

		public String getHtmlText()
		{
			String s1 = mIntent.getStringExtra("android.intent.extra.HTML_TEXT");
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #114 <String "android.intent.extra.HTML_TEXT">
		//    3    6:invokevirtual   #118 <Method String Intent.getStringExtra(String)>
		//    4    9:astore_2        
			String s = s1;
		//    5   10:aload_2         
		//    6   11:astore_1        
			if(s1 == null)
		//*   7   12:aload_2         
		//*   8   13:ifnonnull       52
			{
				CharSequence charsequence = getText();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #121 <Method CharSequence getText()>
		//   11   20:astore_3        
				if(charsequence instanceof Spanned)
		//*  12   21:aload_3         
		//*  13   22:instanceof      #123 <Class Spanned>
		//*  14   25:ifeq            36
					return Html.toHtml((Spanned)charsequence);
		//   15   28:aload_3         
		//   16   29:checkcast       #123 <Class Spanned>
		//   17   32:invokestatic    #129 <Method String Html.toHtml(Spanned)>
		//   18   35:areturn         
				s = s1;
		//   19   36:aload_2         
		//   20   37:astore_1        
				if(charsequence != null)
		//*  21   38:aload_3         
		//*  22   39:ifnull          52
					s = ShareCompat.IMPL.escapeHtml(charsequence);
		//   23   42:getstatic       #133 <Field ShareCompat$ShareCompatImpl ShareCompat.IMPL>
		//   24   45:aload_3         
		//   25   46:invokeinterface #139 <Method String ShareCompat$ShareCompatImpl.escapeHtml(CharSequence)>
		//   26   51:astore_1        
			}
			return s;
		//   27   52:aload_1         
		//   28   53:areturn         
		}

		public Uri getStream()
		{
			return (Uri)mIntent.getParcelableExtra("android.intent.extra.STREAM");
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #143 <String "android.intent.extra.STREAM">
		//    3    6:invokevirtual   #147 <Method Parcelable Intent.getParcelableExtra(String)>
		//    4    9:checkcast       #149 <Class Uri>
		//    5   12:areturn         
		}

		public Uri getStream(int i)
		{
			if(mStreams == null && isMultipleShare())
		//*   0    0:aload_0         
		//*   1    1:getfield        #152 <Field ArrayList mStreams>
		//*   2    4:ifnonnull       27
		//*   3    7:aload_0         
		//*   4    8:invokevirtual   #156 <Method boolean isMultipleShare()>
		//*   5   11:ifeq            27
				mStreams = mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
		//    6   14:aload_0         
		//    7   15:aload_0         
		//    8   16:getfield        #35  <Field Intent mIntent>
		//    9   19:ldc1            #143 <String "android.intent.extra.STREAM">
		//   10   21:invokevirtual   #160 <Method ArrayList Intent.getParcelableArrayListExtra(String)>
		//   11   24:putfield        #152 <Field ArrayList mStreams>
			if(mStreams != null)
		//*  12   27:aload_0         
		//*  13   28:getfield        #152 <Field ArrayList mStreams>
		//*  14   31:ifnull          46
				return (Uri)mStreams.get(i);
		//   15   34:aload_0         
		//   16   35:getfield        #152 <Field ArrayList mStreams>
		//   17   38:iload_1         
		//   18   39:invokevirtual   #166 <Method Object ArrayList.get(int)>
		//   19   42:checkcast       #149 <Class Uri>
		//   20   45:areturn         
			if(i == 0)
		//*  21   46:iload_1         
		//*  22   47:ifne            63
				return (Uri)mIntent.getParcelableExtra("android.intent.extra.STREAM");
		//   23   50:aload_0         
		//   24   51:getfield        #35  <Field Intent mIntent>
		//   25   54:ldc1            #143 <String "android.intent.extra.STREAM">
		//   26   56:invokevirtual   #147 <Method Parcelable Intent.getParcelableExtra(String)>
		//   27   59:checkcast       #149 <Class Uri>
		//   28   62:areturn         
			else
				throw new IndexOutOfBoundsException((new StringBuilder()).append("Stream items available: ").append(getStreamCount()).append(" index requested: ").append(i).toString());
		//   29   63:new             #168 <Class IndexOutOfBoundsException>
		//   30   66:dup             
		//   31   67:new             #170 <Class StringBuilder>
		//   32   70:dup             
		//   33   71:invokespecial   #171 <Method void StringBuilder()>
		//   34   74:ldc1            #173 <String "Stream items available: ">
		//   35   76:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
		//   36   79:aload_0         
		//   37   80:invokevirtual   #181 <Method int getStreamCount()>
		//   38   83:invokevirtual   #184 <Method StringBuilder StringBuilder.append(int)>
		//   39   86:ldc1            #186 <String " index requested: ">
		//   40   88:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
		//   41   91:iload_1         
		//   42   92:invokevirtual   #184 <Method StringBuilder StringBuilder.append(int)>
		//   43   95:invokevirtual   #189 <Method String StringBuilder.toString()>
		//   44   98:invokespecial   #192 <Method void IndexOutOfBoundsException(String)>
		//   45  101:athrow          
		}

		public int getStreamCount()
		{
			if(mStreams == null && isMultipleShare())
		//*   0    0:aload_0         
		//*   1    1:getfield        #152 <Field ArrayList mStreams>
		//*   2    4:ifnonnull       27
		//*   3    7:aload_0         
		//*   4    8:invokevirtual   #156 <Method boolean isMultipleShare()>
		//*   5   11:ifeq            27
				mStreams = mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
		//    6   14:aload_0         
		//    7   15:aload_0         
		//    8   16:getfield        #35  <Field Intent mIntent>
		//    9   19:ldc1            #143 <String "android.intent.extra.STREAM">
		//   10   21:invokevirtual   #160 <Method ArrayList Intent.getParcelableArrayListExtra(String)>
		//   11   24:putfield        #152 <Field ArrayList mStreams>
			if(mStreams != null)
		//*  12   27:aload_0         
		//*  13   28:getfield        #152 <Field ArrayList mStreams>
		//*  14   31:ifnull          42
				return mStreams.size();
		//   15   34:aload_0         
		//   16   35:getfield        #152 <Field ArrayList mStreams>
		//   17   38:invokevirtual   #195 <Method int ArrayList.size()>
		//   18   41:ireturn         
			return !mIntent.hasExtra("android.intent.extra.STREAM") ? 0 : 1;
		//   19   42:aload_0         
		//   20   43:getfield        #35  <Field Intent mIntent>
		//   21   46:ldc1            #143 <String "android.intent.extra.STREAM">
		//   22   48:invokevirtual   #199 <Method boolean Intent.hasExtra(String)>
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
		//    2    4:ldc1            #202 <String "android.intent.extra.SUBJECT">
		//    3    6:invokevirtual   #118 <Method String Intent.getStringExtra(String)>
		//    4    9:areturn         
		}

		public CharSequence getText()
		{
			return mIntent.getCharSequenceExtra("android.intent.extra.TEXT");
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #204 <String "android.intent.extra.TEXT">
		//    3    6:invokevirtual   #208 <Method CharSequence Intent.getCharSequenceExtra(String)>
		//    4    9:areturn         
		}

		public String getType()
		{
			return mIntent.getType();
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:invokevirtual   #211 <Method String Intent.getType()>
		//    3    7:areturn         
		}

		public boolean isMultipleShare()
		{
			return "android.intent.action.SEND_MULTIPLE".equals(((Object) (mIntent.getAction())));
		//    0    0:ldc1            #213 <String "android.intent.action.SEND_MULTIPLE">
		//    1    2:aload_0         
		//    2    3:getfield        #35  <Field Intent mIntent>
		//    3    6:invokevirtual   #216 <Method String Intent.getAction()>
		//    4    9:invokevirtual   #222 <Method boolean String.equals(Object)>
		//    5   12:ireturn         
		}

		public boolean isShareIntent()
		{
			String s = mIntent.getAction();
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:invokevirtual   #216 <Method String Intent.getAction()>
		//    3    7:astore_1        
			return "android.intent.action.SEND".equals(((Object) (s))) || "android.intent.action.SEND_MULTIPLE".equals(((Object) (s)));
		//    4    8:ldc1            #225 <String "android.intent.action.SEND">
		//    5   10:aload_1         
		//    6   11:invokevirtual   #222 <Method boolean String.equals(Object)>
		//    7   14:ifne            26
		//    8   17:ldc1            #213 <String "android.intent.action.SEND_MULTIPLE">
		//    9   19:aload_1         
		//   10   20:invokevirtual   #222 <Method boolean String.equals(Object)>
		//   11   23:ifeq            28
		//   12   26:iconst_1        
		//   13   27:ireturn         
		//   14   28:iconst_0        
		//   15   29:ireturn         
		}

		public boolean isSingleShare()
		{
			return "android.intent.action.SEND".equals(((Object) (mIntent.getAction())));
		//    0    0:ldc1            #225 <String "android.intent.action.SEND">
		//    1    2:aload_0         
		//    2    3:getfield        #35  <Field Intent mIntent>
		//    3    6:invokevirtual   #216 <Method String Intent.getAction()>
		//    4    9:invokevirtual   #222 <Method boolean String.equals(Object)>
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

	static interface ShareCompatImpl
	{

		public abstract void configureMenuItem(MenuItem menuitem, IntentBuilder intentbuilder);

		public abstract String escapeHtml(CharSequence charsequence);
	}

	static class ShareCompatImplBase
		implements ShareCompatImpl
	{

		private static void withinStyle(StringBuilder stringbuilder, CharSequence charsequence, int i, int j)
		{
			for(; i < j; i++)
		//*   0    0:iload_2         
		//*   1    1:iload_3         
		//*   2    2:icmpge          178
			{
				char c = charsequence.charAt(i);
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokeinterface #22  <Method char CharSequence.charAt(int)>
		//    6   12:istore          4
				if(c == '<')
		//*   7   14:iload           4
		//*   8   16:bipush          60
		//*   9   18:icmpne          31
				{
					stringbuilder.append("&lt;");
		//   10   21:aload_0         
		//   11   22:ldc1            #24  <String "&lt;">
		//   12   24:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
		//   13   27:pop             
					continue;
		//   14   28:goto            171
				}
				if(c == '>')
		//*  15   31:iload           4
		//*  16   33:bipush          62
		//*  17   35:icmpne          48
				{
					stringbuilder.append("&gt;");
		//   18   38:aload_0         
		//   19   39:ldc1            #32  <String "&gt;">
		//   20   41:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
		//   21   44:pop             
					continue;
		//   22   45:goto            171
				}
				if(c == '&')
		//*  23   48:iload           4
		//*  24   50:bipush          38
		//*  25   52:icmpne          65
				{
					stringbuilder.append("&amp;");
		//   26   55:aload_0         
		//   27   56:ldc1            #34  <String "&amp;">
		//   28   58:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
		//   29   61:pop             
					continue;
		//   30   62:goto            171
				}
				if(c > '~' || c < ' ')
		//*  31   65:iload           4
		//*  32   67:bipush          126
		//*  33   69:icmpgt          79
		//*  34   72:iload           4
		//*  35   74:bipush          32
		//*  36   76:icmpge          112
				{
					stringbuilder.append((new StringBuilder()).append("&#").append(((int) (c))).append(";").toString());
		//   37   79:aload_0         
		//   38   80:new             #26  <Class StringBuilder>
		//   39   83:dup             
		//   40   84:invokespecial   #35  <Method void StringBuilder()>
		//   41   87:ldc1            #37  <String "&#">
		//   42   89:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
		//   43   92:iload           4
		//   44   94:invokevirtual   #40  <Method StringBuilder StringBuilder.append(int)>
		//   45   97:ldc1            #42  <String ";">
		//   46   99:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
		//   47  102:invokevirtual   #46  <Method String StringBuilder.toString()>
		//   48  105:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
		//   49  108:pop             
					continue;
		//   50  109:goto            171
				}
				if(c == ' ')
		//*  51  112:iload           4
		//*  52  114:bipush          32
		//*  53  116:icmpne          164
				{
					for(; i + 1 < j && charsequence.charAt(i + 1) == ' '; i++)
		//*  54  119:iload_2         
		//*  55  120:iconst_1        
		//*  56  121:iadd            
		//*  57  122:iload_3         
		//*  58  123:icmpge          154
		//*  59  126:aload_1         
		//*  60  127:iload_2         
		//*  61  128:iconst_1        
		//*  62  129:iadd            
		//*  63  130:invokeinterface #22  <Method char CharSequence.charAt(int)>
		//*  64  135:bipush          32
		//*  65  137:icmpne          154
						stringbuilder.append("&nbsp;");
		//   66  140:aload_0         
		//   67  141:ldc1            #48  <String "&nbsp;">
		//   68  143:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
		//   69  146:pop             

		//   70  147:iload_2         
		//   71  148:iconst_1        
		//   72  149:iadd            
		//   73  150:istore_2        
		//*  74  151:goto            119
					stringbuilder.append(' ');
		//   75  154:aload_0         
		//   76  155:bipush          32
		//   77  157:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
		//   78  160:pop             
				} else
		//*  79  161:goto            171
				{
					stringbuilder.append(c);
		//   80  164:aload_0         
		//   81  165:iload           4
		//   82  167:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
		//   83  170:pop             
				}
			}

		//   84  171:iload_2         
		//   85  172:iconst_1        
		//   86  173:iadd            
		//   87  174:istore_2        
		//*  88  175:goto            0
		//   89  178:return          
		}

		public void configureMenuItem(MenuItem menuitem, IntentBuilder intentbuilder)
		{
			menuitem.setIntent(intentbuilder.createChooserIntent());
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #59  <Method Intent ShareCompat$IntentBuilder.createChooserIntent()>
		//    3    5:invokeinterface #65  <Method MenuItem MenuItem.setIntent(Intent)>
		//    4   10:pop             
		//    5   11:return          
		}

		public String escapeHtml(CharSequence charsequence)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #26  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #35  <Method void StringBuilder()>
		//    3    7:astore_2        
			withinStyle(stringbuilder, charsequence, 0, charsequence.length());
		//    4    8:aload_2         
		//    5    9:aload_1         
		//    6   10:iconst_0        
		//    7   11:aload_1         
		//    8   12:invokeinterface #71  <Method int CharSequence.length()>
		//    9   17:invokestatic    #73  <Method void withinStyle(StringBuilder, CharSequence, int, int)>
			return stringbuilder.toString();
		//   10   20:aload_2         
		//   11   21:invokevirtual   #46  <Method String StringBuilder.toString()>
		//   12   24:areturn         
		}

		ShareCompatImplBase()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class ShareCompatImplICS extends ShareCompatImplBase
	{

		public void configureMenuItem(MenuItem menuitem, IntentBuilder intentbuilder)
		{
			ShareCompatICS.configureMenuItem(menuitem, intentbuilder.getActivity(), intentbuilder.getIntent());
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #20  <Method Activity ShareCompat$IntentBuilder.getActivity()>
		//    3    5:aload_2         
		//    4    6:invokevirtual   #24  <Method Intent ShareCompat$IntentBuilder.getIntent()>
		//    5    9:invokestatic    #29  <Method void ShareCompatICS.configureMenuItem(MenuItem, Activity, Intent)>
			if(shouldAddChooserIntent(menuitem))
		//*   6   12:aload_0         
		//*   7   13:aload_1         
		//*   8   14:invokevirtual   #33  <Method boolean shouldAddChooserIntent(MenuItem)>
		//*   9   17:ifeq            31
				menuitem.setIntent(intentbuilder.createChooserIntent());
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:invokevirtual   #36  <Method Intent ShareCompat$IntentBuilder.createChooserIntent()>
		//   13   25:invokeinterface #42  <Method MenuItem MenuItem.setIntent(Intent)>
		//   14   30:pop             
		//   15   31:return          
		}

		boolean shouldAddChooserIntent(MenuItem menuitem)
		{
			return !menuitem.hasSubMenu();
		//    0    0:aload_1         
		//    1    1:invokeinterface #46  <Method boolean MenuItem.hasSubMenu()>
		//    2    6:ifne            11
		//    3    9:iconst_1        
		//    4   10:ireturn         
		//    5   11:iconst_0        
		//    6   12:ireturn         
		}

		ShareCompatImplICS()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void ShareCompat$ShareCompatImplBase()>
		//    2    4:return          
		}
	}

	static class ShareCompatImplJB extends ShareCompatImplICS
	{

		public String escapeHtml(CharSequence charsequence)
		{
			return ShareCompatJB.escapeHtml(charsequence);
		//    0    0:aload_1         
		//    1    1:invokestatic    #18  <Method String ShareCompatJB.escapeHtml(CharSequence)>
		//    2    4:areturn         
		}

		boolean shouldAddChooserIntent(MenuItem menuitem)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		ShareCompatImplJB()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void ShareCompat$ShareCompatImplICS()>
		//    2    4:return          
		}
	}


	private ShareCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
	//    2    4:return          
	}

	public static void configureMenuItem(Menu menu, int i, IntentBuilder intentbuilder)
	{
		menu = ((Menu) (menu.findItem(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokeinterface #56  <Method MenuItem Menu.findItem(int)>
	//    3    7:astore_0        
		if(menu == null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       44
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Could not find menu item with id ").append(i).append(" in the supplied menu").toString());
	//    6   12:new             #58  <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:new             #60  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #61  <Method void StringBuilder()>
	//   11   23:ldc1            #63  <String "Could not find menu item with id ">
	//   12   25:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:iload_1         
	//   14   29:invokevirtual   #70  <Method StringBuilder StringBuilder.append(int)>
	//   15   32:ldc1            #72  <String " in the supplied menu">
	//   16   34:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   18   40:invokespecial   #79  <Method void IllegalArgumentException(String)>
	//   19   43:athrow          
		} else
		{
			configureMenuItem(((MenuItem) (menu)), intentbuilder);
	//   20   44:aload_0         
	//   21   45:aload_2         
	//   22   46:invokestatic    #82  <Method void configureMenuItem(MenuItem, ShareCompat$IntentBuilder)>
			return;
	//   23   49:return          
		}
	}

	public static void configureMenuItem(MenuItem menuitem, IntentBuilder intentbuilder)
	{
		IMPL.configureMenuItem(menuitem, intentbuilder);
	//    0    0:getstatic       #44  <Field ShareCompat$ShareCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #83  <Method void ShareCompat$ShareCompatImpl.configureMenuItem(MenuItem, ShareCompat$IntentBuilder)>
	//    4   10:return          
	}

	public static ComponentName getCallingActivity(Activity activity)
	{
		ComponentName componentname1 = activity.getCallingActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method ComponentName Activity.getCallingActivity()>
	//    2    4:astore_2        
		ComponentName componentname = componentname1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(componentname1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       24
			componentname = (ComponentName)activity.getIntent().getParcelableExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY");
	//    7   11:aload_0         
	//    8   12:invokevirtual   #94  <Method Intent Activity.getIntent()>
	//    9   15:ldc1            #26  <String "android.support.v4.app.EXTRA_CALLING_ACTIVITY">
	//   10   17:invokevirtual   #100 <Method Parcelable Intent.getParcelableExtra(String)>
	//   11   20:checkcast       #102 <Class ComponentName>
	//   12   23:astore_1        
		return componentname;
	//   13   24:aload_1         
	//   14   25:areturn         
	}

	public static String getCallingPackage(Activity activity)
	{
		String s1 = activity.getCallingPackage();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #106 <Method String Activity.getCallingPackage()>
	//    2    4:astore_2        
		String s = s1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(s1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       21
			s = activity.getIntent().getStringExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE");
	//    7   11:aload_0         
	//    8   12:invokevirtual   #94  <Method Intent Activity.getIntent()>
	//    9   15:ldc1            #29  <String "android.support.v4.app.EXTRA_CALLING_PACKAGE">
	//   10   17:invokevirtual   #110 <Method String Intent.getStringExtra(String)>
	//   11   20:astore_1        
		return s;
	//   12   21:aload_1         
	//   13   22:areturn         
	}

	public static final String EXTRA_CALLING_ACTIVITY = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
	public static final String EXTRA_CALLING_PACKAGE = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
	static ShareCompatImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          19
			IMPL = ((ShareCompatImpl) (new ShareCompatImplJB()));
	//    3    8:new             #21  <Class ShareCompat$ShareCompatImplJB>
	//    4   11:dup             
	//    5   12:invokespecial   #42  <Method void ShareCompat$ShareCompatImplJB()>
	//    6   15:putstatic       #44  <Field ShareCompat$ShareCompatImpl IMPL>
	//    7   18:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   8   19:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          14
	//*  10   24:icmplt          38
			IMPL = ((ShareCompatImpl) (new ShareCompatImplICS()));
	//   11   27:new             #18  <Class ShareCompat$ShareCompatImplICS>
	//   12   30:dup             
	//   13   31:invokespecial   #45  <Method void ShareCompat$ShareCompatImplICS()>
	//   14   34:putstatic       #44  <Field ShareCompat$ShareCompatImpl IMPL>
	//   15   37:return          
		else
			IMPL = ((ShareCompatImpl) (new ShareCompatImplBase()));
	//   16   38:new             #15  <Class ShareCompat$ShareCompatImplBase>
	//   17   41:dup             
	//   18   42:invokespecial   #46  <Method void ShareCompat$ShareCompatImplBase()>
	//   19   45:putstatic       #44  <Field ShareCompat$ShareCompatImpl IMPL>
	//*  20   48:return          
	}
}

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
			ArrayList arraylist = mStreams;
		//   33   66:aload_0         
		//   34   67:getfield        #139 <Field ArrayList mStreams>
		//   35   70:astore_3        
			boolean flag = true;
		//   36   71:iconst_1        
		//   37   72:istore_1        
			if(arraylist == null || mStreams.size() <= 1)
		//*  38   73:aload_3         
		//*  39   74:ifnull          91
		//*  40   77:aload_0         
		//*  41   78:getfield        #139 <Field ArrayList mStreams>
		//*  42   81:invokevirtual   #77  <Method int ArrayList.size()>
		//*  43   84:iconst_1        
		//*  44   85:icmple          91
		//*  45   88:goto            93
				flag = false;
		//   46   91:iconst_0        
		//   47   92:istore_1        
			boolean flag1 = mIntent.getAction().equals("android.intent.action.SEND_MULTIPLE");
		//   48   93:aload_0         
		//   49   94:getfield        #38  <Field Intent mIntent>
		//   50   97:invokevirtual   #160 <Method String Intent.getAction()>
		//   51  100:ldc1            #162 <String "android.intent.action.SEND_MULTIPLE">
		//   52  102:invokevirtual   #165 <Method boolean String.equals(Object)>
		//   53  105:istore_2        
			if(!flag && flag1)
		//*  54  106:iload_1         
		//*  55  107:ifne            179
		//*  56  110:iload_2         
		//*  57  111:ifeq            179
			{
				mIntent.setAction("android.intent.action.SEND");
		//   58  114:aload_0         
		//   59  115:getfield        #38  <Field Intent mIntent>
		//   60  118:ldc1            #32  <String "android.intent.action.SEND">
		//   61  120:invokevirtual   #36  <Method Intent Intent.setAction(String)>
		//   62  123:pop             
				if(mStreams != null && !mStreams.isEmpty())
		//*  63  124:aload_0         
		//*  64  125:getfield        #139 <Field ArrayList mStreams>
		//*  65  128:ifnull          165
		//*  66  131:aload_0         
		//*  67  132:getfield        #139 <Field ArrayList mStreams>
		//*  68  135:invokevirtual   #169 <Method boolean ArrayList.isEmpty()>
		//*  69  138:ifne            165
					mIntent.putExtra("android.intent.extra.STREAM", (Parcelable)mStreams.get(0));
		//   70  141:aload_0         
		//   71  142:getfield        #38  <Field Intent mIntent>
		//   72  145:ldc1            #131 <String "android.intent.extra.STREAM">
		//   73  147:aload_0         
		//   74  148:getfield        #139 <Field ArrayList mStreams>
		//   75  151:iconst_0        
		//   76  152:invokevirtual   #173 <Method Object ArrayList.get(int)>
		//   77  155:checkcast       #175 <Class Parcelable>
		//   78  158:invokevirtual   #59  <Method Intent Intent.putExtra(String, Parcelable)>
		//   79  161:pop             
				else
		//*  80  162:goto            174
					mIntent.removeExtra("android.intent.extra.STREAM");
		//   81  165:aload_0         
		//   82  166:getfield        #38  <Field Intent mIntent>
		//   83  169:ldc1            #131 <String "android.intent.extra.STREAM">
		//   84  171:invokevirtual   #146 <Method void Intent.removeExtra(String)>
				mStreams = null;
		//   85  174:aload_0         
		//   86  175:aconst_null     
		//   87  176:putfield        #139 <Field ArrayList mStreams>
			}
			if(flag && !flag1)
		//*  88  179:iload_1         
		//*  89  180:ifeq            240
		//*  90  183:iload_2         
		//*  91  184:ifne            240
			{
				mIntent.setAction("android.intent.action.SEND_MULTIPLE");
		//   92  187:aload_0         
		//   93  188:getfield        #38  <Field Intent mIntent>
		//   94  191:ldc1            #162 <String "android.intent.action.SEND_MULTIPLE">
		//   95  193:invokevirtual   #36  <Method Intent Intent.setAction(String)>
		//   96  196:pop             
				if(mStreams != null && !mStreams.isEmpty())
		//*  97  197:aload_0         
		//*  98  198:getfield        #139 <Field ArrayList mStreams>
		//*  99  201:ifnull          231
		//* 100  204:aload_0         
		//* 101  205:getfield        #139 <Field ArrayList mStreams>
		//* 102  208:invokevirtual   #169 <Method boolean ArrayList.isEmpty()>
		//* 103  211:ifne            231
					mIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", mStreams);
		//  104  214:aload_0         
		//  105  215:getfield        #38  <Field Intent mIntent>
		//  106  218:ldc1            #131 <String "android.intent.extra.STREAM">
		//  107  220:aload_0         
		//  108  221:getfield        #139 <Field ArrayList mStreams>
		//  109  224:invokevirtual   #179 <Method Intent Intent.putParcelableArrayListExtra(String, ArrayList)>
		//  110  227:pop             
				else
		//* 111  228:goto            240
					mIntent.removeExtra("android.intent.extra.STREAM");
		//  112  231:aload_0         
		//  113  232:getfield        #38  <Field Intent mIntent>
		//  114  235:ldc1            #131 <String "android.intent.extra.STREAM">
		//  115  237:invokevirtual   #146 <Method void Intent.removeExtra(String)>
			}
			return mIntent;
		//  116  240:aload_0         
		//  117  241:getfield        #38  <Field Intent mIntent>
		//  118  244:areturn         
		}

		public IntentBuilder setChooserTitle(int i)
		{
			return setChooserTitle(mActivity.getText(i));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #27  <Field Activity mActivity>
		//    3    5:iload_1         
		//    4    6:invokevirtual   #185 <Method CharSequence Activity.getText(int)>
		//    5    9:invokevirtual   #188 <Method ShareCompat$IntentBuilder setChooserTitle(CharSequence)>
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
		//    2    4:ldc1            #194 <String "android.intent.extra.HTML_TEXT">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #50  <Method Intent Intent.putExtra(String, String)>
		//    5   10:pop             
			if(!mIntent.hasExtra("android.intent.extra.TEXT"))
		//*   6   11:aload_0         
		//*   7   12:getfield        #38  <Field Intent mIntent>
		//*   8   15:ldc1            #196 <String "android.intent.extra.TEXT">
		//*   9   17:invokevirtual   #200 <Method boolean Intent.hasExtra(String)>
		//*  10   20:ifne            32
				setText(((CharSequence) (Html.fromHtml(s))));
		//   11   23:aload_0         
		//   12   24:aload_1         
		//   13   25:invokestatic    #206 <Method Spanned Html.fromHtml(String)>
		//   14   28:invokevirtual   #209 <Method ShareCompat$IntentBuilder setText(CharSequence)>
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
		//    2    4:ldc1            #212 <String "android.intent.extra.SUBJECT">
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
		//    2    4:ldc1            #196 <String "android.intent.extra.TEXT">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #215 <Method Intent Intent.putExtra(String, CharSequence)>
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
		//    3    5:invokevirtual   #218 <Method Intent Intent.setType(String)>
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
		//    3    5:invokevirtual   #221 <Method Intent createChooserIntent()>
		//    4    8:invokevirtual   #225 <Method void Activity.startActivity(Intent)>
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
			for(; i < j; i++)
		//*   0    0:iload_2         
		//*   1    1:iload_3         
		//*   2    2:icmpge          194
			{
				char c = charsequence.charAt(i);
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokeinterface #60  <Method char CharSequence.charAt(int)>
		//    6   12:istore          4
				Object obj;
				if(c == '<')
		//*   7   14:iload           4
		//*   8   16:bipush          60
		//*   9   18:icmpne          35
					obj = "&lt;";
		//   10   21:ldc1            #62  <String "&lt;">
		//   11   23:astore          6
				else
		//*  12   25:aload_0         
		//*  13   26:aload           6
		//*  14   28:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//*  15   31:pop             
		//*  16   32:goto            187
				if(c == '>')
		//*  17   35:iload           4
		//*  18   37:bipush          62
		//*  19   39:icmpne          49
					obj = "&gt;";
		//   20   42:ldc1            #70  <String "&gt;">
		//   21   44:astore          6
				else
		//*  22   46:goto            25
				if(c == '&')
		//*  23   49:iload           4
		//*  24   51:bipush          38
		//*  25   53:icmpne          63
				{
					obj = "&amp;";
		//   26   56:ldc1            #72  <String "&amp;">
		//   27   58:astore          6
				} else
		//*  28   60:goto            25
				{
					if(c <= '~' && c >= ' ')
		//*  29   63:iload           4
		//*  30   65:bipush          126
		//*  31   67:icmpgt          144
		//*  32   70:iload           4
		//*  33   72:bipush          32
		//*  34   74:icmpge          80
		//*  35   77:goto            144
					{
						if(c == ' ')
		//*  36   80:iload           4
		//*  37   82:bipush          32
		//*  38   84:icmpne          134
						{
							do
							{
								int k = i + 1;
		//   39   87:iload_2         
		//   40   88:iconst_1        
		//   41   89:iadd            
		//   42   90:istore          5
								if(k >= j || charsequence.charAt(k) != ' ')
									break;
		//   43   92:iload           5
		//   44   94:iload_3         
		//   45   95:icmpge          124
		//   46   98:aload_1         
		//   47   99:iload           5
		//   48  101:invokeinterface #60  <Method char CharSequence.charAt(int)>
		//   49  106:bipush          32
		//   50  108:icmpne          124
								stringbuilder.append("&nbsp;");
		//   51  111:aload_0         
		//   52  112:ldc1            #74  <String "&nbsp;">
		//   53  114:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   54  117:pop             
								i = k;
		//   55  118:iload           5
		//   56  120:istore_2        
							} while(true);
		//   57  121:goto            87
							stringbuilder.append(' ');
		//   58  124:aload_0         
		//   59  125:bipush          32
		//   60  127:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
		//   61  130:pop             
						} else
		//*  62  131:goto            187
						{
							stringbuilder.append(c);
		//   63  134:aload_0         
		//   64  135:iload           4
		//   65  137:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
		//   66  140:pop             
						}
						continue;
		//   67  141:goto            187
					}
					obj = ((Object) (new StringBuilder()));
		//   68  144:new             #64  <Class StringBuilder>
		//   69  147:dup             
		//   70  148:invokespecial   #78  <Method void StringBuilder()>
		//   71  151:astore          6
					((StringBuilder) (obj)).append("&#");
		//   72  153:aload           6
		//   73  155:ldc1            #80  <String "&#">
		//   74  157:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   75  160:pop             
					((StringBuilder) (obj)).append(((int) (c)));
		//   76  161:aload           6
		//   77  163:iload           4
		//   78  165:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
		//   79  168:pop             
					((StringBuilder) (obj)).append(";");
		//   80  169:aload           6
		//   81  171:ldc1            #85  <String ";">
		//   82  173:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   83  176:pop             
					obj = ((Object) (((StringBuilder) (obj)).toString()));
		//   84  177:aload           6
		//   85  179:invokevirtual   #89  <Method String StringBuilder.toString()>
		//   86  182:astore          6
				}
				stringbuilder.append(((String) (obj)));
			}

		//   87  184:goto            25
		//   88  187:iload_2         
		//   89  188:iconst_1        
		//   90  189:iadd            
		//   91  190:istore_2        
		//*  92  191:goto            0
		//   93  194:return          
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
			String s = mIntent.getStringExtra("android.intent.extra.HTML_TEXT");
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Intent mIntent>
		//    2    4:ldc1            #150 <String "android.intent.extra.HTML_TEXT">
		//    3    6:invokevirtual   #154 <Method String Intent.getStringExtra(String)>
		//    4    9:astore_2        
			Object obj = ((Object) (s));
		//    5   10:aload_2         
		//    6   11:astore_1        
			if(s == null)
		//*   7   12:aload_2         
		//*   8   13:ifnonnull       80
			{
				CharSequence charsequence = getText();
		//    9   16:aload_0         
		//   10   17:invokevirtual   #157 <Method CharSequence getText()>
		//   11   20:astore_3        
				if(charsequence instanceof Spanned)
		//*  12   21:aload_3         
		//*  13   22:instanceof      #159 <Class Spanned>
		//*  14   25:ifeq            36
					return Html.toHtml((Spanned)charsequence);
		//   15   28:aload_3         
		//   16   29:checkcast       #159 <Class Spanned>
		//   17   32:invokestatic    #165 <Method String Html.toHtml(Spanned)>
		//   18   35:areturn         
				obj = ((Object) (s));
		//   19   36:aload_2         
		//   20   37:astore_1        
				if(charsequence != null)
		//*  21   38:aload_3         
		//*  22   39:ifnull          80
				{
					if(android.os.Build.VERSION.SDK_INT >= 16)
		//*  23   42:getstatic       #171 <Field int android.os.Build$VERSION.SDK_INT>
		//*  24   45:bipush          16
		//*  25   47:icmplt          55
						return Html.escapeHtml(charsequence);
		//   26   50:aload_3         
		//   27   51:invokestatic    #175 <Method String Html.escapeHtml(CharSequence)>
		//   28   54:areturn         
					obj = ((Object) (new StringBuilder()));
		//   29   55:new             #64  <Class StringBuilder>
		//   30   58:dup             
		//   31   59:invokespecial   #78  <Method void StringBuilder()>
		//   32   62:astore_1        
					withinStyle(((StringBuilder) (obj)), charsequence, 0, charsequence.length());
		//   33   63:aload_1         
		//   34   64:aload_3         
		//   35   65:iconst_0        
		//   36   66:aload_3         
		//   37   67:invokeinterface #179 <Method int CharSequence.length()>
		//   38   72:invokestatic    #181 <Method void withinStyle(StringBuilder, CharSequence, int, int)>
					obj = ((Object) (((StringBuilder) (obj)).toString()));
		//   39   75:aload_1         
		//   40   76:invokevirtual   #89  <Method String StringBuilder.toString()>
		//   41   79:astore_1        
				}
			}
			return ((String) (obj));
		//   42   80:aload_1         
		//   43   81:areturn         
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
			Object obj;
			if(mStreams != null)
		//*  12   27:aload_0         
		//*  13   28:getfield        #194 <Field ArrayList mStreams>
		//*  14   31:ifnull          48
				obj = mStreams.get(i);
		//   15   34:aload_0         
		//   16   35:getfield        #194 <Field ArrayList mStreams>
		//   17   38:iload_1         
		//   18   39:invokevirtual   #208 <Method Object ArrayList.get(int)>
		//   19   42:astore_2        
			else
		//*  20   43:aload_2         
		//*  21   44:checkcast       #191 <Class Uri>
		//*  22   47:areturn         
			if(i == 0)
		//*  23   48:iload_1         
		//*  24   49:ifne            65
			{
				obj = ((Object) (mIntent.getParcelableExtra("android.intent.extra.STREAM")));
		//   25   52:aload_0         
		//   26   53:getfield        #35  <Field Intent mIntent>
		//   27   56:ldc1            #185 <String "android.intent.extra.STREAM">
		//   28   58:invokevirtual   #189 <Method Parcelable Intent.getParcelableExtra(String)>
		//   29   61:astore_2        
			} else
		//*  30   62:goto            43
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   31   65:new             #64  <Class StringBuilder>
		//   32   68:dup             
		//   33   69:invokespecial   #78  <Method void StringBuilder()>
		//   34   72:astore_2        
				stringbuilder.append("Stream items available: ");
		//   35   73:aload_2         
		//   36   74:ldc1            #210 <String "Stream items available: ">
		//   37   76:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   38   79:pop             
				stringbuilder.append(getStreamCount());
		//   39   80:aload_2         
		//   40   81:aload_0         
		//   41   82:invokevirtual   #213 <Method int getStreamCount()>
		//   42   85:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
		//   43   88:pop             
				stringbuilder.append(" index requested: ");
		//   44   89:aload_2         
		//   45   90:ldc1            #215 <String " index requested: ">
		//   46   92:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   47   95:pop             
				stringbuilder.append(i);
		//   48   96:aload_2         
		//   49   97:iload_1         
		//   50   98:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
		//   51  101:pop             
				throw new IndexOutOfBoundsException(stringbuilder.toString());
		//   52  102:new             #217 <Class IndexOutOfBoundsException>
		//   53  105:dup             
		//   54  106:aload_2         
		//   55  107:invokevirtual   #89  <Method String StringBuilder.toString()>
		//   56  110:invokespecial   #220 <Method void IndexOutOfBoundsException(String)>
		//   57  113:athrow          
			}
			return (Uri)obj;
		}

		public int getStreamCount()
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #222 <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #224 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #227 <Method void Runtime(String)>
		//    4    9:athrow          
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
		//    7   14:ifne            31
		//    8   17:ldc1            #241 <String "android.intent.action.SEND_MULTIPLE">
		//    9   19:aload_1         
		//   10   20:invokevirtual   #250 <Method boolean String.equals(Object)>
		//   11   23:ifeq            29
		//   12   26:goto            31
		//   13   29:iconst_0        
		//   14   30:ireturn         
		//   15   31:iconst_1        
		//   16   32:ireturn         
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
	//*   5    9:ifnonnull       52
		{
			menu = ((Menu) (new StringBuilder()));
	//    6   12:new             #35  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #36  <Method void StringBuilder()>
	//    9   19:astore_0        
			((StringBuilder) (menu)).append("Could not find menu item with id ");
	//   10   20:aload_0         
	//   11   21:ldc1            #38  <String "Could not find menu item with id ">
	//   12   23:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
			((StringBuilder) (menu)).append(i);
	//   14   27:aload_0         
	//   15   28:iload_1         
	//   16   29:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
	//   17   32:pop             
			((StringBuilder) (menu)).append(" in the supplied menu");
	//   18   33:aload_0         
	//   19   34:ldc1            #47  <String " in the supplied menu">
	//   20   36:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
			throw new IllegalArgumentException(((StringBuilder) (menu)).toString());
	//   22   40:new             #49  <Class IllegalArgumentException>
	//   23   43:dup             
	//   24   44:aload_0         
	//   25   45:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   26   48:invokespecial   #56  <Method void IllegalArgumentException(String)>
	//   27   51:athrow          
		} else
		{
			configureMenuItem(((MenuItem) (menu)), intentbuilder);
	//   28   52:aload_0         
	//   29   53:aload_2         
	//   30   54:invokestatic    #59  <Method void configureMenuItem(MenuItem, ShareCompat$IntentBuilder)>
			return;
	//   31   57:return          
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
	//*   5   11:ifne            29
			obj = ((Object) (new ShareActionProvider(((android.content.Context) (intentbuilder.getActivity())))));
	//    6   14:new             #67  <Class ShareActionProvider>
	//    7   17:dup             
	//    8   18:aload_1         
	//    9   19:invokevirtual   #71  <Method Activity ShareCompat$IntentBuilder.getActivity()>
	//   10   22:invokespecial   #74  <Method void ShareActionProvider(android.content.Context)>
	//   11   25:astore_2        
		else
	//*  12   26:goto            34
			obj = ((Object) ((ShareActionProvider)obj));
	//   13   29:aload_2         
	//   14   30:checkcast       #67  <Class ShareActionProvider>
	//   15   33:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   16   34:new             #35  <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #36  <Method void StringBuilder()>
	//   19   41:astore_3        
		stringbuilder.append(".sharecompat_");
	//   20   42:aload_3         
	//   21   43:ldc1            #20  <String ".sharecompat_">
	//   22   45:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
		stringbuilder.append(((Object) (intentbuilder.getActivity())).getClass().getName());
	//   24   49:aload_3         
	//   25   50:aload_1         
	//   26   51:invokevirtual   #71  <Method Activity ShareCompat$IntentBuilder.getActivity()>
	//   27   54:invokevirtual   #78  <Method Class Object.getClass()>
	//   28   57:invokevirtual   #83  <Method String Class.getName()>
	//   29   60:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   30   63:pop             
		((ShareActionProvider) (obj)).setShareHistoryFileName(stringbuilder.toString());
	//   31   64:aload_2         
	//   32   65:aload_3         
	//   33   66:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   34   69:invokevirtual   #86  <Method void ShareActionProvider.setShareHistoryFileName(String)>
		((ShareActionProvider) (obj)).setShareIntent(intentbuilder.getIntent());
	//   35   72:aload_2         
	//   36   73:aload_1         
	//   37   74:invokevirtual   #90  <Method Intent ShareCompat$IntentBuilder.getIntent()>
	//   38   77:invokevirtual   #94  <Method void ShareActionProvider.setShareIntent(Intent)>
		menuitem.setActionProvider(((android.view.ActionProvider) (obj)));
	//   39   80:aload_0         
	//   40   81:aload_2         
	//   41   82:invokeinterface #98  <Method MenuItem MenuItem.setActionProvider(android.view.ActionProvider)>
	//   42   87:pop             
		if(android.os.Build.VERSION.SDK_INT < 16 && !menuitem.hasSubMenu())
	//*  43   88:getstatic       #104 <Field int android.os.Build$VERSION.SDK_INT>
	//*  44   91:bipush          16
	//*  45   93:icmpge          116
	//*  46   96:aload_0         
	//*  47   97:invokeinterface #108 <Method boolean MenuItem.hasSubMenu()>
	//*  48  102:ifne            116
			menuitem.setIntent(intentbuilder.createChooserIntent());
	//   49  105:aload_0         
	//   50  106:aload_1         
	//   51  107:invokevirtual   #111 <Method Intent ShareCompat$IntentBuilder.createChooserIntent()>
	//   52  110:invokeinterface #115 <Method MenuItem MenuItem.setIntent(Intent)>
	//   53  115:pop             
	//   54  116:return          
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

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import java.util.ArrayList;

public final class ShareCompat
{
	public static class IntentBuilder
	{

		private void combineArrayExtra(String s, ArrayList arraylist)
		{
			String as[] = mIntent.getStringArrayExtra(s);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field Intent mIntent>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #69  <Method String[] Intent.getStringArrayExtra(String)>
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
		//   14   25:invokevirtual   #75  <Method int ArrayList.size()>
		//   15   28:iload_3         
		//   16   29:iadd            
		//   17   30:anewarray       String[]
		//   18   33:astore          5
			arraylist.toArray(((Object []) (as1)));
		//   19   35:aload_2         
		//   20   36:aload           5
		//   21   38:invokevirtual   #81  <Method Object[] ArrayList.toArray(Object[])>
		//   22   41:pop             
			if(as != null)
		//*  23   42:aload           4
		//*  24   44:ifnull          60
				System.arraycopy(((Object) (as)), 0, ((Object) (as1)), arraylist.size(), i);
		//   25   47:aload           4
		//   26   49:iconst_0        
		//   27   50:aload           5
		//   28   52:aload_2         
		//   29   53:invokevirtual   #75  <Method int ArrayList.size()>
		//   30   56:iload_3         
		//   31   57:invokestatic    #87  <Method void System.arraycopy(Object, int, Object, int, int)>
			mIntent.putExtra(s, as1);
		//   32   60:aload_0         
		//   33   61:getfield        #36  <Field Intent mIntent>
		//   34   64:aload_1         
		//   35   65:aload           5
		//   36   67:invokevirtual   #90  <Method Intent Intent.putExtra(String, String[])>
		//   37   70:pop             
		//   38   71:return          
		}

		public static IntentBuilder from(Activity activity)
		{
			return new IntentBuilder(activity);
		//    0    0:new             #2   <Class ShareCompat$IntentBuilder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #96  <Method void ShareCompat$IntentBuilder(Activity)>
		//    4    8:areturn         
		}

		public Intent getIntent()
		{
			ArrayList arraylist = mToAddresses;
		//    0    0:aload_0         
		//    1    1:getfield        #100 <Field ArrayList mToAddresses>
		//    2    4:astore_3        
			if(arraylist != null)
		//*   3    5:aload_3         
		//*   4    6:ifnull          21
			{
				combineArrayExtra("android.intent.extra.EMAIL", arraylist);
		//    5    9:aload_0         
		//    6   10:ldc1            #102 <String "android.intent.extra.EMAIL">
		//    7   12:aload_3         
		//    8   13:invokespecial   #104 <Method void combineArrayExtra(String, ArrayList)>
				mToAddresses = null;
		//    9   16:aload_0         
		//   10   17:aconst_null     
		//   11   18:putfield        #100 <Field ArrayList mToAddresses>
			}
			arraylist = mCcAddresses;
		//   12   21:aload_0         
		//   13   22:getfield        #106 <Field ArrayList mCcAddresses>
		//   14   25:astore_3        
			if(arraylist != null)
		//*  15   26:aload_3         
		//*  16   27:ifnull          42
			{
				combineArrayExtra("android.intent.extra.CC", arraylist);
		//   17   30:aload_0         
		//   18   31:ldc1            #108 <String "android.intent.extra.CC">
		//   19   33:aload_3         
		//   20   34:invokespecial   #104 <Method void combineArrayExtra(String, ArrayList)>
				mCcAddresses = null;
		//   21   37:aload_0         
		//   22   38:aconst_null     
		//   23   39:putfield        #106 <Field ArrayList mCcAddresses>
			}
			arraylist = mBccAddresses;
		//   24   42:aload_0         
		//   25   43:getfield        #110 <Field ArrayList mBccAddresses>
		//   26   46:astore_3        
			if(arraylist != null)
		//*  27   47:aload_3         
		//*  28   48:ifnull          63
			{
				combineArrayExtra("android.intent.extra.BCC", arraylist);
		//   29   51:aload_0         
		//   30   52:ldc1            #112 <String "android.intent.extra.BCC">
		//   31   54:aload_3         
		//   32   55:invokespecial   #104 <Method void combineArrayExtra(String, ArrayList)>
				mBccAddresses = null;
		//   33   58:aload_0         
		//   34   59:aconst_null     
		//   35   60:putfield        #110 <Field ArrayList mBccAddresses>
			}
			arraylist = mStreams;
		//   36   63:aload_0         
		//   37   64:getfield        #114 <Field ArrayList mStreams>
		//   38   67:astore_3        
			boolean flag = true;
		//   39   68:iconst_1        
		//   40   69:istore_1        
			if(arraylist == null || arraylist.size() <= 1)
		//*  41   70:aload_3         
		//*  42   71:ifnull          85
		//*  43   74:aload_3         
		//*  44   75:invokevirtual   #75  <Method int ArrayList.size()>
		//*  45   78:iconst_1        
		//*  46   79:icmple          85
		//*  47   82:goto            87
				flag = false;
		//   48   85:iconst_0        
		//   49   86:istore_1        
			boolean flag1 = mIntent.getAction().equals("android.intent.action.SEND_MULTIPLE");
		//   50   87:aload_0         
		//   51   88:getfield        #36  <Field Intent mIntent>
		//   52   91:invokevirtual   #117 <Method String Intent.getAction()>
		//   53   94:ldc1            #119 <String "android.intent.action.SEND_MULTIPLE">
		//   54   96:invokevirtual   #123 <Method boolean String.equals(Object)>
		//   55   99:istore_2        
			if(!flag && flag1)
		//*  56  100:iload_1         
		//*  57  101:ifne            172
		//*  58  104:iload_2         
		//*  59  105:ifeq            172
			{
				mIntent.setAction("android.intent.action.SEND");
		//   60  108:aload_0         
		//   61  109:getfield        #36  <Field Intent mIntent>
		//   62  112:ldc1            #30  <String "android.intent.action.SEND">
		//   63  114:invokevirtual   #34  <Method Intent Intent.setAction(String)>
		//   64  117:pop             
				ArrayList arraylist1 = mStreams;
		//   65  118:aload_0         
		//   66  119:getfield        #114 <Field ArrayList mStreams>
		//   67  122:astore_3        
				if(arraylist1 != null && !arraylist1.isEmpty())
		//*  68  123:aload_3         
		//*  69  124:ifnull          158
		//*  70  127:aload_3         
		//*  71  128:invokevirtual   #127 <Method boolean ArrayList.isEmpty()>
		//*  72  131:ifne            158
					mIntent.putExtra("android.intent.extra.STREAM", (Parcelable)mStreams.get(0));
		//   73  134:aload_0         
		//   74  135:getfield        #36  <Field Intent mIntent>
		//   75  138:ldc1            #129 <String "android.intent.extra.STREAM">
		//   76  140:aload_0         
		//   77  141:getfield        #114 <Field ArrayList mStreams>
		//   78  144:iconst_0        
		//   79  145:invokevirtual   #133 <Method Object ArrayList.get(int)>
		//   80  148:checkcast       #135 <Class Parcelable>
		//   81  151:invokevirtual   #57  <Method Intent Intent.putExtra(String, Parcelable)>
		//   82  154:pop             
				else
		//*  83  155:goto            167
					mIntent.removeExtra("android.intent.extra.STREAM");
		//   84  158:aload_0         
		//   85  159:getfield        #36  <Field Intent mIntent>
		//   86  162:ldc1            #129 <String "android.intent.extra.STREAM">
		//   87  164:invokevirtual   #139 <Method void Intent.removeExtra(String)>
				mStreams = null;
		//   88  167:aload_0         
		//   89  168:aconst_null     
		//   90  169:putfield        #114 <Field ArrayList mStreams>
			}
			if(flag && !flag1)
		//*  91  172:iload_1         
		//*  92  173:ifeq            232
		//*  93  176:iload_2         
		//*  94  177:ifne            232
			{
				mIntent.setAction("android.intent.action.SEND_MULTIPLE");
		//   95  180:aload_0         
		//   96  181:getfield        #36  <Field Intent mIntent>
		//   97  184:ldc1            #119 <String "android.intent.action.SEND_MULTIPLE">
		//   98  186:invokevirtual   #34  <Method Intent Intent.setAction(String)>
		//   99  189:pop             
				ArrayList arraylist2 = mStreams;
		//  100  190:aload_0         
		//  101  191:getfield        #114 <Field ArrayList mStreams>
		//  102  194:astore_3        
				if(arraylist2 != null && !arraylist2.isEmpty())
		//* 103  195:aload_3         
		//* 104  196:ifnull          223
		//* 105  199:aload_3         
		//* 106  200:invokevirtual   #127 <Method boolean ArrayList.isEmpty()>
		//* 107  203:ifne            223
					mIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", mStreams);
		//  108  206:aload_0         
		//  109  207:getfield        #36  <Field Intent mIntent>
		//  110  210:ldc1            #129 <String "android.intent.extra.STREAM">
		//  111  212:aload_0         
		//  112  213:getfield        #114 <Field ArrayList mStreams>
		//  113  216:invokevirtual   #143 <Method Intent Intent.putParcelableArrayListExtra(String, ArrayList)>
		//  114  219:pop             
				else
		//* 115  220:goto            232
					mIntent.removeExtra("android.intent.extra.STREAM");
		//  116  223:aload_0         
		//  117  224:getfield        #36  <Field Intent mIntent>
		//  118  227:ldc1            #129 <String "android.intent.extra.STREAM">
		//  119  229:invokevirtual   #139 <Method void Intent.removeExtra(String)>
			}
			return mIntent;
		//  120  232:aload_0         
		//  121  233:getfield        #36  <Field Intent mIntent>
		//  122  236:areturn         
		}

		public IntentBuilder setSubject(String s)
		{
			mIntent.putExtra("android.intent.extra.SUBJECT", s);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field Intent mIntent>
		//    2    4:ldc1            #147 <String "android.intent.extra.SUBJECT">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #48  <Method Intent Intent.putExtra(String, String)>
		//    5   10:pop             
			return this;
		//    6   11:aload_0         
		//    7   12:areturn         
		}

		public IntentBuilder setText(CharSequence charsequence)
		{
			mIntent.putExtra("android.intent.extra.TEXT", charsequence);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field Intent mIntent>
		//    2    4:ldc1            #151 <String "android.intent.extra.TEXT">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #154 <Method Intent Intent.putExtra(String, CharSequence)>
		//    5   10:pop             
			return this;
		//    6   11:aload_0         
		//    7   12:areturn         
		}

		public IntentBuilder setType(String s)
		{
			mIntent.setType(s);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field Intent mIntent>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #157 <Method Intent Intent.setType(String)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		private Activity mActivity;
		private ArrayList mBccAddresses;
		private ArrayList mCcAddresses;
		private Intent mIntent;
		private ArrayList mStreams;
		private ArrayList mToAddresses;

		private IntentBuilder(Activity activity)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			mActivity = activity;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #25  <Field Activity mActivity>
			mIntent = (new Intent()).setAction("android.intent.action.SEND");
		//    5    9:aload_0         
		//    6   10:new             #27  <Class Intent>
		//    7   13:dup             
		//    8   14:invokespecial   #28  <Method void Intent()>
		//    9   17:ldc1            #30  <String "android.intent.action.SEND">
		//   10   19:invokevirtual   #34  <Method Intent Intent.setAction(String)>
		//   11   22:putfield        #36  <Field Intent mIntent>
			mIntent.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", activity.getPackageName());
		//   12   25:aload_0         
		//   13   26:getfield        #36  <Field Intent mIntent>
		//   14   29:ldc1            #38  <String "android.support.v4.app.EXTRA_CALLING_PACKAGE">
		//   15   31:aload_1         
		//   16   32:invokevirtual   #44  <Method String Activity.getPackageName()>
		//   17   35:invokevirtual   #48  <Method Intent Intent.putExtra(String, String)>
		//   18   38:pop             
			mIntent.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", ((Parcelable) (activity.getComponentName())));
		//   19   39:aload_0         
		//   20   40:getfield        #36  <Field Intent mIntent>
		//   21   43:ldc1            #50  <String "android.support.v4.app.EXTRA_CALLING_ACTIVITY">
		//   22   45:aload_1         
		//   23   46:invokevirtual   #54  <Method android.content.ComponentName Activity.getComponentName()>
		//   24   49:invokevirtual   #57  <Method Intent Intent.putExtra(String, Parcelable)>
		//   25   52:pop             
			mIntent.addFlags(0x80000);
		//   26   53:aload_0         
		//   27   54:getfield        #36  <Field Intent mIntent>
		//   28   57:ldc1            #58  <Int 0x80000>
		//   29   59:invokevirtual   #62  <Method Intent Intent.addFlags(int)>
		//   30   62:pop             
		//   31   63:return          
		}
	}

}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.os.*;
import com.mixpanel.android.a.f;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			InAppNotification

public class UpdateDisplayState
	implements Parcelable
{
	public static class AnswerMap
		implements Parcelable
	{

		public void a(Integer integer, String s)
		{
			a.put(((Object) (integer)), ((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field HashMap a>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #40  <Method Object HashMap.put(Object, Object)>
		//    5    9:pop             
		//    6   10:return          
		}

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #46  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #47  <Method void Bundle()>
		//    3    7:astore_3        
			java.util.Map.Entry entry;
			for(Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); bundle.putString(Integer.toString(((Integer)entry.getKey()).intValue()), (String)entry.getValue()))
		//*   4    8:aload_0         
		//*   5    9:getfield        #34  <Field HashMap a>
		//*   6   12:invokevirtual   #51  <Method Set HashMap.entrySet()>
		//*   7   15:invokeinterface #57  <Method Iterator Set.iterator()>
		//*   8   20:astore          4
		//*   9   22:aload           4
		//*  10   24:invokeinterface #63  <Method boolean Iterator.hasNext()>
		//*  11   29:ifeq            77
				entry = (java.util.Map.Entry)iterator.next();
		//   12   32:aload           4
		//   13   34:invokeinterface #67  <Method Object Iterator.next()>
		//   14   39:checkcast       #69  <Class java.util.Map$Entry>
		//   15   42:astore          5

		//   16   44:aload_3         
		//   17   45:aload           5
		//   18   47:invokeinterface #72  <Method Object java.util.Map$Entry.getKey()>
		//   19   52:checkcast       #74  <Class Integer>
		//   20   55:invokevirtual   #77  <Method int Integer.intValue()>
		//   21   58:invokestatic    #81  <Method String Integer.toString(int)>
		//   22   61:aload           5
		//   23   63:invokeinterface #84  <Method Object java.util.Map$Entry.getValue()>
		//   24   68:checkcast       #86  <Class String>
		//   25   71:invokevirtual   #90  <Method void Bundle.putString(String, String)>
		//*  26   74:goto            22
			parcel.writeBundle(bundle);
		//   27   77:aload_1         
		//   28   78:aload_3         
		//   29   79:invokevirtual   #96  <Method void Parcel.writeBundle(Bundle)>
		//   30   82:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public AnswerMap a(Parcel parcel)
			{
				Bundle bundle = new Bundle(((Class) (com/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap)).getClassLoader());
			//    0    0:new             #21  <Class Bundle>
			//    1    3:dup             
			//    2    4:ldc1            #9   <Class UpdateDisplayState$AnswerMap>
			//    3    6:invokevirtual   #27  <Method ClassLoader Class.getClassLoader()>
			//    4    9:invokespecial   #30  <Method void Bundle(ClassLoader)>
			//    5   12:astore_2        
				AnswerMap answermap = new AnswerMap();
			//    6   13:new             #9   <Class UpdateDisplayState$AnswerMap>
			//    7   16:dup             
			//    8   17:invokespecial   #31  <Method void UpdateDisplayState$AnswerMap()>
			//    9   20:astore_3        
				bundle.readFromParcel(parcel);
			//   10   21:aload_2         
			//   11   22:aload_1         
			//   12   23:invokevirtual   #35  <Method void Bundle.readFromParcel(Parcel)>
				String s;
				for(parcel = ((Parcel) (bundle.keySet().iterator())); ((Iterator) (parcel)).hasNext(); answermap.a(Integer.valueOf(s), bundle.getString(s)))
			//*  13   26:aload_2         
			//*  14   27:invokevirtual   #39  <Method Set Bundle.keySet()>
			//*  15   30:invokeinterface #45  <Method Iterator Set.iterator()>
			//*  16   35:astore_1        
			//*  17   36:aload_1         
			//*  18   37:invokeinterface #51  <Method boolean Iterator.hasNext()>
			//*  19   42:ifeq            74
					s = (String)((Iterator) (parcel)).next();
			//   20   45:aload_1         
			//   21   46:invokeinterface #55  <Method Object Iterator.next()>
			//   22   51:checkcast       #57  <Class String>
			//   23   54:astore          4

			//   24   56:aload_3         
			//   25   57:aload           4
			//   26   59:invokestatic    #63  <Method Integer Integer.valueOf(String)>
			//   27   62:aload_2         
			//   28   63:aload           4
			//   29   65:invokevirtual   #67  <Method String Bundle.getString(String)>
			//   30   68:invokevirtual   #70  <Method void UpdateDisplayState$AnswerMap.a(Integer, String)>
			//*  31   71:goto            36
				return answermap;
			//   32   74:aload_3         
			//   33   75:areturn         
			}

			public AnswerMap[] a(int i)
			{
				return new AnswerMap[i];
			//    0    0:iload_1         
			//    1    1:anewarray       AnswerMap[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #75  <Method UpdateDisplayState$AnswerMap a(Parcel)>
			//    3    5:areturn         
			}

			public Object[] newArray(int i)
			{
				return ((Object []) (a(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #79  <Method UpdateDisplayState$AnswerMap[] a(int)>
			//    3    5:areturn         
			}

		}
;
		private final HashMap a = new HashMap();

		static 
		{
		//    0    0:new             #11  <Class UpdateDisplayState$AnswerMap$1>
		//    1    3:dup             
		//    2    4:invokespecial   #22  <Method void UpdateDisplayState$AnswerMap$1()>
		//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public AnswerMap()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #31  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #32  <Method void HashMap()>
		//    6   12:putfield        #34  <Field HashMap a>
		//    7   15:return          
		}
	}

	public static abstract class DisplayState
		implements Parcelable
	{

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public DisplayState a(Parcel parcel)
			{
				Bundle bundle = new Bundle(((Class) (com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState)).getClassLoader());
			//    0    0:new             #21  <Class Bundle>
			//    1    3:dup             
			//    2    4:ldc1            #9   <Class UpdateDisplayState$DisplayState>
			//    3    6:invokevirtual   #27  <Method ClassLoader Class.getClassLoader()>
			//    4    9:invokespecial   #30  <Method void Bundle(ClassLoader)>
			//    5   12:astore_2        
				bundle.readFromParcel(parcel);
			//    6   13:aload_2         
			//    7   14:aload_1         
			//    8   15:invokevirtual   #34  <Method void Bundle.readFromParcel(Parcel)>
				parcel = ((Parcel) (bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY")));
			//    9   18:aload_2         
			//   10   19:ldc1            #36  <String "com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY">
			//   11   21:invokevirtual   #40  <Method String Bundle.getString(String)>
			//   12   24:astore_1        
				bundle = bundle.getBundle("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY");
			//   13   25:aload_2         
			//   14   26:ldc1            #42  <String "com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY">
			//   15   28:invokevirtual   #46  <Method Bundle Bundle.getBundle(String)>
			//   16   31:astore_2        
				if("InAppNotificationState".equals(((Object) (parcel))))
			//*  17   32:ldc1            #48  <String "InAppNotificationState">
			//*  18   34:aload_1         
			//*  19   35:invokevirtual   #54  <Method boolean String.equals(Object)>
			//*  20   38:ifeq            51
				{
					return ((DisplayState) (new DisplayState.InAppNotificationState(bundle)));
			//   21   41:new             #56  <Class UpdateDisplayState$DisplayState$InAppNotificationState>
			//   22   44:dup             
			//   23   45:aload_2         
			//   24   46:aconst_null     
			//   25   47:invokespecial   #59  <Method void UpdateDisplayState$DisplayState$InAppNotificationState(Bundle, UpdateDisplayState$1)>
			//   26   50:areturn         
				} else
				{
					StringBuilder stringbuilder = new StringBuilder();
			//   27   51:new             #61  <Class StringBuilder>
			//   28   54:dup             
			//   29   55:invokespecial   #62  <Method void StringBuilder()>
			//   30   58:astore_2        
					stringbuilder.append("Unrecognized display state type ");
			//   31   59:aload_2         
			//   32   60:ldc1            #64  <String "Unrecognized display state type ">
			//   33   62:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
			//   34   65:pop             
					stringbuilder.append(((String) (parcel)));
			//   35   66:aload_2         
			//   36   67:aload_1         
			//   37   68:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
			//   38   71:pop             
					throw new RuntimeException(stringbuilder.toString());
			//   39   72:new             #70  <Class RuntimeException>
			//   40   75:dup             
			//   41   76:aload_2         
			//   42   77:invokevirtual   #74  <Method String StringBuilder.toString()>
			//   43   80:invokespecial   #77  <Method void RuntimeException(String)>
			//   44   83:athrow          
				}
			}

			public DisplayState[] a(int i)
			{
				return new DisplayState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       DisplayState[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #82  <Method UpdateDisplayState$DisplayState a(Parcel)>
			//    3    5:areturn         
			}

			public Object[] newArray(int i)
			{
				return ((Object []) (a(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #86  <Method UpdateDisplayState$DisplayState[] a(int)>
			//    3    5:areturn         
			}

		}
;

		static 
		{
		//    0    0:new             #11  <Class UpdateDisplayState$DisplayState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #24  <Method void UpdateDisplayState$DisplayState$1()>
		//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		private DisplayState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
		//    2    4:return          
		}

	}

	public static final class DisplayState.InAppNotificationState extends DisplayState
	{

		public InAppNotification a()
		{
			return a;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field InAppNotification a>
		//    2    4:areturn         
		}

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #40  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #66  <Method void Bundle()>
		//    3    7:astore_3        
			bundle.putParcelable(c, ((Parcelable) (a)));
		//    4    8:aload_3         
		//    5    9:getstatic       #38  <Field String c>
		//    6   12:aload_0         
		//    7   13:getfield        #48  <Field InAppNotification a>
		//    8   16:invokevirtual   #70  <Method void Bundle.putParcelable(String, Parcelable)>
			bundle.putInt(d, b);
		//    9   19:aload_3         
		//   10   20:getstatic       #50  <Field String d>
		//   11   23:aload_0         
		//   12   24:getfield        #56  <Field int b>
		//   13   27:invokevirtual   #74  <Method void Bundle.putInt(String, int)>
			parcel.writeBundle(bundle);
		//   14   30:aload_1         
		//   15   31:aload_3         
		//   16   32:invokevirtual   #79  <Method void Parcel.writeBundle(Bundle)>
		//   17   35:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public DisplayState.InAppNotificationState a(Parcel parcel)
			{
				Bundle bundle = new Bundle(((Class) (com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState)).getClassLoader());
			//    0    0:new             #24  <Class Bundle>
			//    1    3:dup             
			//    2    4:ldc1            #9   <Class UpdateDisplayState$DisplayState$InAppNotificationState>
			//    3    6:invokevirtual   #30  <Method ClassLoader Class.getClassLoader()>
			//    4    9:invokespecial   #33  <Method void Bundle(ClassLoader)>
			//    5   12:astore_2        
				bundle.readFromParcel(parcel);
			//    6   13:aload_2         
			//    7   14:aload_1         
			//    8   15:invokevirtual   #37  <Method void Bundle.readFromParcel(Parcel)>
				return new DisplayState.InAppNotificationState(bundle);
			//    9   18:new             #9   <Class UpdateDisplayState$DisplayState$InAppNotificationState>
			//   10   21:dup             
			//   11   22:aload_2         
			//   12   23:aconst_null     
			//   13   24:invokespecial   #40  <Method void UpdateDisplayState$DisplayState$InAppNotificationState(Bundle, UpdateDisplayState$1)>
			//   14   27:areturn         
			}

			public DisplayState.InAppNotificationState[] a(int i)
			{
				return new DisplayState.InAppNotificationState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       DisplayState.InAppNotificationState[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #45  <Method UpdateDisplayState$DisplayState$InAppNotificationState a(Parcel)>
			//    3    5:areturn         
			}

			public Object[] newArray(int i)
			{
				return ((Object []) (a(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #49  <Method UpdateDisplayState$DisplayState$InAppNotificationState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		private static String c = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.INAPP_KEY";
		private static String d = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.HIGHLIGHT_KEY";
		private final InAppNotification a;
		private final int b;

		static 
		{
		//    0    0:new             #10  <Class UpdateDisplayState$DisplayState$InAppNotificationState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #29  <Method void UpdateDisplayState$DisplayState$InAppNotificationState$1()>
		//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		private DisplayState.InAppNotificationState(Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #36  <Method void UpdateDisplayState$DisplayState(UpdateDisplayState$1)>
			a = (InAppNotification)bundle.getParcelable(c);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:getstatic       #38  <Field String c>
		//    6   10:invokevirtual   #44  <Method Parcelable Bundle.getParcelable(String)>
		//    7   13:checkcast       #46  <Class InAppNotification>
		//    8   16:putfield        #48  <Field InAppNotification a>
			b = bundle.getInt(d);
		//    9   19:aload_0         
		//   10   20:aload_1         
		//   11   21:getstatic       #50  <Field String d>
		//   12   24:invokevirtual   #54  <Method int Bundle.getInt(String)>
		//   13   27:putfield        #56  <Field int b>
		//   14   30:return          
		}


		public DisplayState.InAppNotificationState(InAppNotification inappnotification, int i)
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #36  <Method void UpdateDisplayState$DisplayState(UpdateDisplayState$1)>
			a = inappnotification;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #48  <Field InAppNotification a>
			b = i;
		//    6   10:aload_0         
		//    7   11:iload_2         
		//    8   12:putfield        #56  <Field int b>
		//    9   15:return          
		}
	}


	private UpdateDisplayState(Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void Object()>
		a = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #64  <String "com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY">
	//    5    8:invokevirtual   #70  <Method String Bundle.getString(String)>
	//    6   11:putfield        #72  <Field String a>
		b = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY");
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:ldc1            #74  <String "com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY">
	//   10   18:invokevirtual   #70  <Method String Bundle.getString(String)>
	//   11   21:putfield        #76  <Field String b>
		c = (DisplayState)bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY");
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:ldc1            #78  <String "com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY">
	//   15   28:invokevirtual   #82  <Method Parcelable Bundle.getParcelable(String)>
	//   16   31:checkcast       #15  <Class UpdateDisplayState$DisplayState>
	//   17   34:putfield        #84  <Field UpdateDisplayState$DisplayState c>
	//   18   37:return          
	}


	UpdateDisplayState(DisplayState displaystate, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #72  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #76  <Field String b>
		c = displaystate;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #84  <Field UpdateDisplayState$DisplayState c>
	//   11   19:return          
	}

	static int a(DisplayState displaystate, String s, String s1)
	{
		if(!d.isHeldByCurrentThread())
	//*   0    0:getstatic       #59  <Field ReentrantLock d>
	//*   1    3:invokevirtual   #93  <Method boolean ReentrantLock.isHeldByCurrentThread()>
	//*   2    6:ifne            17
			throw new AssertionError();
	//    3    9:new             #95  <Class AssertionError>
	//    4   12:dup             
	//    5   13:invokespecial   #96  <Method void AssertionError()>
	//    6   16:athrow          
		if(!b())
	//*   7   17:invokestatic    #98  <Method boolean b()>
	//*   8   20:ifne            54
		{
			e = System.currentTimeMillis();
	//    9   23:invokestatic    #104 <Method long System.currentTimeMillis()>
	//   10   26:putstatic       #106 <Field long e>
			f = new UpdateDisplayState(displaystate, s, s1);
	//   11   29:new             #2   <Class UpdateDisplayState>
	//   12   32:dup             
	//   13   33:aload_0         
	//   14   34:aload_1         
	//   15   35:aload_2         
	//   16   36:invokespecial   #108 <Method void UpdateDisplayState(UpdateDisplayState$DisplayState, String, String)>
	//   17   39:putstatic       #110 <Field UpdateDisplayState f>
			g++;
	//   18   42:getstatic       #112 <Field int g>
	//   19   45:iconst_1        
	//   20   46:iadd            
	//   21   47:putstatic       #112 <Field int g>
			return g;
	//   22   50:getstatic       #112 <Field int g>
	//   23   53:ireturn         
		} else
		{
			com.mixpanel.android.a.f.a("MixpanelAPI.UpDisplSt", "Already showing (or cooking) a Mixpanel update, declining to show another.");
	//   24   54:ldc1            #114 <String "MixpanelAPI.UpDisplSt">
	//   25   56:ldc1            #116 <String "Already showing (or cooking) a Mixpanel update, declining to show another.">
	//   26   58:invokestatic    #121 <Method void f.a(String, String)>
			return -1;
	//   27   61:iconst_m1       
	//   28   62:ireturn         
		}
	}

	static ReentrantLock a()
	{
		return d;
	//    0    0:getstatic       #59  <Field ReentrantLock d>
	//    1    3:areturn         
	}

	public static void a(int i)
	{
		d.lock();
	//    0    0:getstatic       #59  <Field ReentrantLock d>
	//    1    3:invokevirtual   #126 <Method void ReentrantLock.lock()>
		if(i == h)
	//*   2    6:iload_0         
	//*   3    7:getstatic       #128 <Field int h>
	//*   4   10:icmpne          21
		{
			h = -1;
	//    5   13:iconst_m1       
	//    6   14:putstatic       #128 <Field int h>
			f = null;
	//    7   17:aconst_null     
	//    8   18:putstatic       #110 <Field UpdateDisplayState f>
		}
		d.unlock();
	//    9   21:getstatic       #59  <Field ReentrantLock d>
	//   10   24:invokevirtual   #131 <Method void ReentrantLock.unlock()>
		return;
	//   11   27:return          
		Exception exception;
		exception;
	//   12   28:astore_1        
		d.unlock();
	//   13   29:getstatic       #59  <Field ReentrantLock d>
	//   14   32:invokevirtual   #131 <Method void ReentrantLock.unlock()>
		throw exception;
	//   15   35:aload_1         
	//   16   36:athrow          
	}

	public static UpdateDisplayState b(int i)
	{
		d.lock();
	//    0    0:getstatic       #59  <Field ReentrantLock d>
	//    1    3:invokevirtual   #126 <Method void ReentrantLock.lock()>
		if(h <= 0) goto _L2; else goto _L1
	//    2    6:getstatic       #128 <Field int h>
	//    3    9:ifle            29
_L1:
		int j = h;
	//    4   12:getstatic       #128 <Field int h>
	//    5   15:istore_1        
		if(j == i) goto _L2; else goto _L3
	//    6   16:iload_1         
	//    7   17:iload_0         
	//    8   18:icmpeq          29
_L3:
		d.unlock();
	//    9   21:getstatic       #59  <Field ReentrantLock d>
	//   10   24:invokevirtual   #131 <Method void ReentrantLock.unlock()>
		return null;
	//   11   27:aconst_null     
	//   12   28:areturn         
_L2:
		if(f != null) goto _L4; else goto _L3
	//   13   29:getstatic       #110 <Field UpdateDisplayState f>
	//   14   32:ifnonnull       38
	//*  15   35:goto            21
_L4:
		UpdateDisplayState updatedisplaystate;
		e = System.currentTimeMillis();
	//   16   38:invokestatic    #104 <Method long System.currentTimeMillis()>
	//   17   41:putstatic       #106 <Field long e>
		h = i;
	//   18   44:iload_0         
	//   19   45:putstatic       #128 <Field int h>
		updatedisplaystate = f;
	//   20   48:getstatic       #110 <Field UpdateDisplayState f>
	//   21   51:astore_2        
		d.unlock();
	//   22   52:getstatic       #59  <Field ReentrantLock d>
	//   23   55:invokevirtual   #131 <Method void ReentrantLock.unlock()>
		return updatedisplaystate;
	//   24   58:aload_2         
	//   25   59:areturn         
		Exception exception;
		exception;
	//   26   60:astore_2        
		d.unlock();
	//   27   61:getstatic       #59  <Field ReentrantLock d>
	//   28   64:invokevirtual   #131 <Method void ReentrantLock.unlock()>
		throw exception;
	//   29   67:aload_2         
	//   30   68:athrow          
	}

	static boolean b()
	{
		if(!d.isHeldByCurrentThread())
	//*   0    0:getstatic       #59  <Field ReentrantLock d>
	//*   1    3:invokevirtual   #93  <Method boolean ReentrantLock.isHeldByCurrentThread()>
	//*   2    6:ifne            17
			throw new AssertionError();
	//    3    9:new             #95  <Class AssertionError>
	//    4   12:dup             
	//    5   13:invokespecial   #96  <Method void AssertionError()>
	//    6   16:athrow          
		long l = System.currentTimeMillis();
	//    7   17:invokestatic    #104 <Method long System.currentTimeMillis()>
	//    8   20:lstore_0        
		long l1 = e;
	//    9   21:getstatic       #106 <Field long e>
	//   10   24:lstore_2        
		if(g > 0 && l - l1 > 0x2932e00L)
	//*  11   25:getstatic       #112 <Field int g>
	//*  12   28:ifle            52
	//*  13   31:lload_0         
	//*  14   32:lload_2         
	//*  15   33:lsub            
	//*  16   34:ldc2w           #133 <Long 0x2932e00L>
	//*  17   37:lcmp            
	//*  18   38:ifle            52
		{
			com.mixpanel.android.a.f.c("MixpanelAPI.UpDisplSt", "UpdateDisplayState set long, long ago, without showing. Update state will be cleared.");
	//   19   41:ldc1            #114 <String "MixpanelAPI.UpDisplSt">
	//   20   43:ldc1            #136 <String "UpdateDisplayState set long, long ago, without showing. Update state will be cleared.">
	//   21   45:invokestatic    #138 <Method void f.c(String, String)>
			f = null;
	//   22   48:aconst_null     
	//   23   49:putstatic       #110 <Field UpdateDisplayState f>
		}
		return f != null;
	//   24   52:getstatic       #110 <Field UpdateDisplayState f>
	//   25   55:ifnull          60
	//   26   58:iconst_1        
	//   27   59:ireturn         
	//   28   60:iconst_0        
	//   29   61:ireturn         
	}

	public DisplayState c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field UpdateDisplayState$DisplayState c>
	//    2    4:areturn         
	}

	public String d()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String b>
	//    2    4:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #66  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #145 <Method void Bundle()>
	//    3    7:astore_3        
		bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY", a);
	//    4    8:aload_3         
	//    5    9:ldc1            #64  <String "com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY">
	//    6   11:aload_0         
	//    7   12:getfield        #72  <Field String a>
	//    8   15:invokevirtual   #148 <Method void Bundle.putString(String, String)>
		bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY", b);
	//    9   18:aload_3         
	//   10   19:ldc1            #74  <String "com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY">
	//   11   21:aload_0         
	//   12   22:getfield        #76  <Field String b>
	//   13   25:invokevirtual   #148 <Method void Bundle.putString(String, String)>
		bundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY", ((Parcelable) (c)));
	//   14   28:aload_3         
	//   15   29:ldc1            #78  <String "com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY">
	//   16   31:aload_0         
	//   17   32:getfield        #84  <Field UpdateDisplayState$DisplayState c>
	//   18   35:invokevirtual   #152 <Method void Bundle.putParcelable(String, Parcelable)>
		parcel.writeBundle(bundle);
	//   19   38:aload_1         
	//   20   39:aload_3         
	//   21   40:invokevirtual   #157 <Method void Parcel.writeBundle(Bundle)>
	//   22   43:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public UpdateDisplayState a(Parcel parcel)
		{
			Bundle bundle = new Bundle(((Class) (com/mixpanel/android/mpmetrics/UpdateDisplayState)).getClassLoader());
		//    0    0:new             #18  <Class Bundle>
		//    1    3:dup             
		//    2    4:ldc1            #9   <Class UpdateDisplayState>
		//    3    6:invokevirtual   #24  <Method ClassLoader Class.getClassLoader()>
		//    4    9:invokespecial   #27  <Method void Bundle(ClassLoader)>
		//    5   12:astore_2        
			bundle.readFromParcel(parcel);
		//    6   13:aload_2         
		//    7   14:aload_1         
		//    8   15:invokevirtual   #31  <Method void Bundle.readFromParcel(Parcel)>
			return new UpdateDisplayState(bundle);
		//    9   18:new             #9   <Class UpdateDisplayState>
		//   10   21:dup             
		//   11   22:aload_2         
		//   12   23:aconst_null     
		//   13   24:invokespecial   #34  <Method void UpdateDisplayState(Bundle, UpdateDisplayState$1)>
		//   14   27:areturn         
		}

		public UpdateDisplayState[] a(int i)
		{
			return new UpdateDisplayState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       UpdateDisplayState[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #39  <Method UpdateDisplayState a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #43  <Method UpdateDisplayState[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private static final ReentrantLock d = new ReentrantLock();
	private static long e = -1L;
	private static UpdateDisplayState f;
	private static int g = 0;
	private static int h = -1;
	private final String a;
	private final String b;
	private final DisplayState c;

	static 
	{
	//    0    0:new             #8   <Class UpdateDisplayState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #52  <Method void UpdateDisplayState$1()>
	//    3    7:putstatic       #54  <Field android.os.Parcelable$Creator CREATOR>
	//    4   10:new             #56  <Class ReentrantLock>
	//    5   13:dup             
	//    6   14:invokespecial   #57  <Method void ReentrantLock()>
	//    7   17:putstatic       #59  <Field ReentrantLock d>
	//*   8   20:return          
	}
}

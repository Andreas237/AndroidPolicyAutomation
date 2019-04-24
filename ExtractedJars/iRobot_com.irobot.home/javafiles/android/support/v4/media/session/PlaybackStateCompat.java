// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.text.TextUtils;
import java.util.*;

// Referenced classes of package android.support.v4.media.session:
//			e, f

public final class PlaybackStateCompat
	implements Parcelable
{
	public static final class CustomAction
		implements Parcelable
	{

		public static CustomAction a(Object obj)
		{
			if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:aload_0         
		//*   1    1:ifnull          46
		//*   2    4:getstatic       #76  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmpge          15
		//*   5   12:goto            46
			{
				CustomAction customaction = new CustomAction(android.support.v4.media.session.e.a.a(obj), android.support.v4.media.session.e.a.b(obj), android.support.v4.media.session.e.a.c(obj), android.support.v4.media.session.e.a.d(obj));
		//    6   15:new             #2   <Class PlaybackStateCompat$CustomAction>
		//    7   18:dup             
		//    8   19:aload_0         
		//    9   20:invokestatic    #81  <Method String e$a.a(Object)>
		//   10   23:aload_0         
		//   11   24:invokestatic    #84  <Method CharSequence e$a.b(Object)>
		//   12   27:aload_0         
		//   13   28:invokestatic    #87  <Method int e$a.c(Object)>
		//   14   31:aload_0         
		//   15   32:invokestatic    #90  <Method Bundle e$a.d(Object)>
		//   16   35:invokespecial   #92  <Method void PlaybackStateCompat$CustomAction(String, CharSequence, int, Bundle)>
		//   17   38:astore_1        
				customaction.e = obj;
		//   18   39:aload_1         
		//   19   40:aload_0         
		//   20   41:putfield        #94  <Field Object e>
				return customaction;
		//   21   44:aload_1         
		//   22   45:areturn         
			} else
			{
				return null;
		//   23   46:aconst_null     
		//   24   47:areturn         
			}
		}

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #98  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #99  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("Action:mName='");
		//    4    8:aload_1         
		//    5    9:ldc1            #101 <String "Action:mName='">
		//    6   11:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(((Object) (b)));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #57  <Field CharSequence b>
		//   11   20:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
		//   12   23:pop             
			stringbuilder.append(", mIcon=");
		//   13   24:aload_1         
		//   14   25:ldc1            #110 <String ", mIcon=">
		//   15   27:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			stringbuilder.append(c);
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:getfield        #63  <Field int c>
		//   20   36:invokevirtual   #113 <Method StringBuilder StringBuilder.append(int)>
		//   21   39:pop             
			stringbuilder.append(", mExtras=");
		//   22   40:aload_1         
		//   23   41:ldc1            #115 <String ", mExtras=">
		//   24   43:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
		//   25   46:pop             
			stringbuilder.append(((Object) (d)));
		//   26   47:aload_1         
		//   27   48:aload_0         
		//   28   49:getfield        #69  <Field Bundle d>
		//   29   52:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
		//   30   55:pop             
			return stringbuilder.toString();
		//   31   56:aload_1         
		//   32   57:invokevirtual   #117 <Method String StringBuilder.toString()>
		//   33   60:areturn         
		}

		public void writeToParcel(Parcel parcel, int i1)
		{
			parcel.writeString(a);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #42  <Field String a>
		//    3    5:invokevirtual   #123 <Method void Parcel.writeString(String)>
			TextUtils.writeToParcel(b, parcel, i1);
		//    4    8:aload_0         
		//    5    9:getfield        #57  <Field CharSequence b>
		//    6   12:aload_1         
		//    7   13:iload_2         
		//    8   14:invokestatic    #126 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			parcel.writeInt(c);
		//    9   17:aload_1         
		//   10   18:aload_0         
		//   11   19:getfield        #63  <Field int c>
		//   12   22:invokevirtual   #130 <Method void Parcel.writeInt(int)>
			parcel.writeBundle(d);
		//   13   25:aload_1         
		//   14   26:aload_0         
		//   15   27:getfield        #69  <Field Bundle d>
		//   16   30:invokevirtual   #134 <Method void Parcel.writeBundle(Bundle)>
		//   17   33:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public CustomAction a(Parcel parcel)
			{
				return new CustomAction(parcel);
			//    0    0:new             #9   <Class PlaybackStateCompat$CustomAction>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void PlaybackStateCompat$CustomAction(Parcel)>
			//    4    8:areturn         
			}

			public CustomAction[] a(int i1)
			{
				return new CustomAction[i1];
			//    0    0:iload_1         
			//    1    1:anewarray       CustomAction[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #27  <Method PlaybackStateCompat$CustomAction a(Parcel)>
			//    3    5:areturn         
			}

			public Object[] newArray(int i1)
			{
				return ((Object []) (a(i1)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #31  <Method PlaybackStateCompat$CustomAction[] a(int)>
			//    3    5:areturn         
			}

		}
;
		private final String a;
		private final CharSequence b;
		private final int c;
		private final Bundle d;
		private Object e;

		static 
		{
		//    0    0:new             #11  <Class PlaybackStateCompat$CustomAction$1>
		//    1    3:dup             
		//    2    4:invokespecial   #29  <Method void PlaybackStateCompat$CustomAction$1()>
		//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		CustomAction(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #34  <Method void Object()>
			a = parcel.readString();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #40  <Method String Parcel.readString()>
		//    5    9:putfield        #42  <Field String a>
			b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
		//    6   12:aload_0         
		//    7   13:getstatic       #47  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
		//    8   16:aload_1         
		//    9   17:invokeinterface #53  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   10   22:checkcast       #55  <Class CharSequence>
		//   11   25:putfield        #57  <Field CharSequence b>
			c = parcel.readInt();
		//   12   28:aload_0         
		//   13   29:aload_1         
		//   14   30:invokevirtual   #61  <Method int Parcel.readInt()>
		//   15   33:putfield        #63  <Field int c>
			d = parcel.readBundle();
		//   16   36:aload_0         
		//   17   37:aload_1         
		//   18   38:invokevirtual   #67  <Method Bundle Parcel.readBundle()>
		//   19   41:putfield        #69  <Field Bundle d>
		//   20   44:return          
		}

		CustomAction(String s, CharSequence charsequence, int i1, Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #34  <Method void Object()>
			a = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #42  <Field String a>
			b = charsequence;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #57  <Field CharSequence b>
			c = i1;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #63  <Field int c>
			d = bundle;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #69  <Field Bundle d>
		//   14   25:return          
		}
	}


	PlaybackStateCompat(int i1, long l1, long l2, float f1, long l3, int j1, CharSequence charsequence, long l4, List list, long l5, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		a = i1;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #48  <Field int a>
		b = l1;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #50  <Field long b>
		c = l2;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #52  <Field long c>
		d = f1;
	//   11   20:aload_0         
	//   12   21:fload           6
	//   13   23:putfield        #54  <Field float d>
		e = l3;
	//   14   26:aload_0         
	//   15   27:lload           7
	//   16   29:putfield        #56  <Field long e>
		f = j1;
	//   17   32:aload_0         
	//   18   33:iload           9
	//   19   35:putfield        #58  <Field int f>
		g = charsequence;
	//   20   38:aload_0         
	//   21   39:aload           10
	//   22   41:putfield        #60  <Field CharSequence g>
		h = l4;
	//   23   44:aload_0         
	//   24   45:lload           11
	//   25   47:putfield        #62  <Field long h>
		i = ((List) (new ArrayList(((java.util.Collection) (list)))));
	//   26   50:aload_0         
	//   27   51:new             #64  <Class ArrayList>
	//   28   54:dup             
	//   29   55:aload           13
	//   30   57:invokespecial   #67  <Method void ArrayList(java.util.Collection)>
	//   31   60:putfield        #69  <Field List i>
		j = l5;
	//   32   63:aload_0         
	//   33   64:lload           14
	//   34   66:putfield        #71  <Field long j>
		k = bundle;
	//   35   69:aload_0         
	//   36   70:aload           16
	//   37   72:putfield        #73  <Field Bundle k>
	//   38   75:return          
	}

	PlaybackStateCompat(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		a = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #82  <Method int Parcel.readInt()>
	//    5    9:putfield        #48  <Field int a>
		b = parcel.readLong();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #86  <Method long Parcel.readLong()>
	//    9   17:putfield        #50  <Field long b>
		d = parcel.readFloat();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #90  <Method float Parcel.readFloat()>
	//   13   25:putfield        #54  <Field float d>
		h = parcel.readLong();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #86  <Method long Parcel.readLong()>
	//   17   33:putfield        #62  <Field long h>
		c = parcel.readLong();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #86  <Method long Parcel.readLong()>
	//   21   41:putfield        #52  <Field long c>
		e = parcel.readLong();
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #86  <Method long Parcel.readLong()>
	//   25   49:putfield        #56  <Field long e>
		g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//   26   52:aload_0         
	//   27   53:getstatic       #95  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   28   56:aload_1         
	//   29   57:invokeinterface #101 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   30   62:checkcast       #103 <Class CharSequence>
	//   31   65:putfield        #60  <Field CharSequence g>
		i = ((List) (parcel.createTypedArrayList(CustomAction.CREATOR)));
	//   32   68:aload_0         
	//   33   69:aload_1         
	//   34   70:getstatic       #104 <Field android.os.Parcelable$Creator PlaybackStateCompat$CustomAction.CREATOR>
	//   35   73:invokevirtual   #108 <Method ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   36   76:putfield        #69  <Field List i>
		j = parcel.readLong();
	//   37   79:aload_0         
	//   38   80:aload_1         
	//   39   81:invokevirtual   #86  <Method long Parcel.readLong()>
	//   40   84:putfield        #71  <Field long j>
		k = parcel.readBundle();
	//   41   87:aload_0         
	//   42   88:aload_1         
	//   43   89:invokevirtual   #112 <Method Bundle Parcel.readBundle()>
	//   44   92:putfield        #73  <Field Bundle k>
		f = parcel.readInt();
	//   45   95:aload_0         
	//   46   96:aload_1         
	//   47   97:invokevirtual   #82  <Method int Parcel.readInt()>
	//   48  100:putfield        #58  <Field int f>
	//   49  103:return          
	}

	public static PlaybackStateCompat a(Object obj)
	{
		Object obj2 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		Bundle bundle = null;
	//    2    2:aconst_null     
	//    3    3:astore_2        
		Object obj1 = ((Object) (obj2));
	//    4    4:aload_3         
	//    5    5:astore_1        
		if(obj != null)
	//*   6    6:aload_0         
	//*   7    7:ifnull          144
		{
			obj1 = ((Object) (obj2));
	//    8   10:aload_3         
	//    9   11:astore_1        
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  10   12:getstatic       #118 <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   15:bipush          21
	//*  12   17:icmplt          144
			{
				Object obj3 = ((Object) (android.support.v4.media.session.e.h(obj)));
	//   13   20:aload_0         
	//   14   21:invokestatic    #123 <Method List e.h(Object)>
	//   15   24:astore_3        
				if(obj3 != null)
	//*  16   25:aload_3         
	//*  17   26:ifnull          81
				{
					obj1 = ((Object) (new ArrayList(((List) (obj3)).size())));
	//   18   29:new             #64  <Class ArrayList>
	//   19   32:dup             
	//   20   33:aload_3         
	//   21   34:invokeinterface #128 <Method int List.size()>
	//   22   39:invokespecial   #131 <Method void ArrayList(int)>
	//   23   42:astore_1        
					for(obj3 = ((Object) (((List) (obj3)).iterator())); ((Iterator) (obj3)).hasNext(); ((List) (obj1)).add(((Object) (CustomAction.a(((Iterator) (obj3)).next())))));
	//   24   43:aload_3         
	//   25   44:invokeinterface #135 <Method Iterator List.iterator()>
	//   26   49:astore_3        
	//   27   50:aload_3         
	//   28   51:invokeinterface #141 <Method boolean Iterator.hasNext()>
	//   29   56:ifeq            78
	//   30   59:aload_1         
	//   31   60:aload_3         
	//   32   61:invokeinterface #145 <Method Object Iterator.next()>
	//   33   66:invokestatic    #148 <Method PlaybackStateCompat$CustomAction PlaybackStateCompat$CustomAction.a(Object)>
	//   34   69:invokeinterface #152 <Method boolean List.add(Object)>
	//   35   74:pop             
				} else
	//*  36   75:goto            50
	//*  37   78:goto            83
				{
					obj1 = null;
	//   38   81:aconst_null     
	//   39   82:astore_1        
				}
				if(android.os.Build.VERSION.SDK_INT >= 22)
	//*  40   83:getstatic       #118 <Field int android.os.Build$VERSION.SDK_INT>
	//*  41   86:bipush          22
	//*  42   88:icmplt          96
					bundle = android.support.v4.media.session.f.a(obj);
	//   43   91:aload_0         
	//   44   92:invokestatic    #157 <Method Bundle f.a(Object)>
	//   45   95:astore_2        
				obj1 = ((Object) (new PlaybackStateCompat(android.support.v4.media.session.e.a(obj), android.support.v4.media.session.e.b(obj), android.support.v4.media.session.e.c(obj), android.support.v4.media.session.e.d(obj), android.support.v4.media.session.e.e(obj), 0, android.support.v4.media.session.e.f(obj), android.support.v4.media.session.e.g(obj), ((List) (obj1)), android.support.v4.media.session.e.i(obj), bundle)));
	//   46   96:new             #2   <Class PlaybackStateCompat>
	//   47   99:dup             
	//   48  100:aload_0         
	//   49  101:invokestatic    #160 <Method int e.a(Object)>
	//   50  104:aload_0         
	//   51  105:invokestatic    #163 <Method long e.b(Object)>
	//   52  108:aload_0         
	//   53  109:invokestatic    #165 <Method long e.c(Object)>
	//   54  112:aload_0         
	//   55  113:invokestatic    #168 <Method float e.d(Object)>
	//   56  116:aload_0         
	//   57  117:invokestatic    #170 <Method long e.e(Object)>
	//   58  120:iconst_0        
	//   59  121:aload_0         
	//   60  122:invokestatic    #173 <Method CharSequence e.f(Object)>
	//   61  125:aload_0         
	//   62  126:invokestatic    #175 <Method long e.g(Object)>
	//   63  129:aload_1         
	//   64  130:aload_0         
	//   65  131:invokestatic    #177 <Method long e.i(Object)>
	//   66  134:aload_2         
	//   67  135:invokespecial   #179 <Method void PlaybackStateCompat(int, long, long, float, long, int, CharSequence, long, List, long, Bundle)>
	//   68  138:astore_1        
				obj1.l = obj;
	//   69  139:aload_1         
	//   70  140:aload_0         
	//   71  141:putfield        #181 <Field Object l>
			}
		}
		return ((PlaybackStateCompat) (obj1));
	//   72  144:aload_1         
	//   73  145:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("PlaybackState {");
	//    0    0:new             #186 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #188 <String "PlaybackState {">
	//    3    6:invokespecial   #191 <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append("state=");
	//    5   10:aload_1         
	//    6   11:ldc1            #193 <String "state=">
	//    7   13:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(a);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #48  <Field int a>
	//   12   22:invokevirtual   #200 <Method StringBuilder StringBuilder.append(int)>
	//   13   25:pop             
		stringbuilder.append(", position=");
	//   14   26:aload_1         
	//   15   27:ldc1            #202 <String ", position=">
	//   16   29:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		stringbuilder.append(b);
	//   18   33:aload_1         
	//   19   34:aload_0         
	//   20   35:getfield        #50  <Field long b>
	//   21   38:invokevirtual   #205 <Method StringBuilder StringBuilder.append(long)>
	//   22   41:pop             
		stringbuilder.append(", buffered position=");
	//   23   42:aload_1         
	//   24   43:ldc1            #207 <String ", buffered position=">
	//   25   45:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		stringbuilder.append(c);
	//   27   49:aload_1         
	//   28   50:aload_0         
	//   29   51:getfield        #52  <Field long c>
	//   30   54:invokevirtual   #205 <Method StringBuilder StringBuilder.append(long)>
	//   31   57:pop             
		stringbuilder.append(", speed=");
	//   32   58:aload_1         
	//   33   59:ldc1            #209 <String ", speed=">
	//   34   61:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   35   64:pop             
		stringbuilder.append(d);
	//   36   65:aload_1         
	//   37   66:aload_0         
	//   38   67:getfield        #54  <Field float d>
	//   39   70:invokevirtual   #212 <Method StringBuilder StringBuilder.append(float)>
	//   40   73:pop             
		stringbuilder.append(", updated=");
	//   41   74:aload_1         
	//   42   75:ldc1            #214 <String ", updated=">
	//   43   77:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   44   80:pop             
		stringbuilder.append(h);
	//   45   81:aload_1         
	//   46   82:aload_0         
	//   47   83:getfield        #62  <Field long h>
	//   48   86:invokevirtual   #205 <Method StringBuilder StringBuilder.append(long)>
	//   49   89:pop             
		stringbuilder.append(", actions=");
	//   50   90:aload_1         
	//   51   91:ldc1            #216 <String ", actions=">
	//   52   93:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   53   96:pop             
		stringbuilder.append(e);
	//   54   97:aload_1         
	//   55   98:aload_0         
	//   56   99:getfield        #56  <Field long e>
	//   57  102:invokevirtual   #205 <Method StringBuilder StringBuilder.append(long)>
	//   58  105:pop             
		stringbuilder.append(", error code=");
	//   59  106:aload_1         
	//   60  107:ldc1            #218 <String ", error code=">
	//   61  109:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   62  112:pop             
		stringbuilder.append(f);
	//   63  113:aload_1         
	//   64  114:aload_0         
	//   65  115:getfield        #58  <Field int f>
	//   66  118:invokevirtual   #200 <Method StringBuilder StringBuilder.append(int)>
	//   67  121:pop             
		stringbuilder.append(", error message=");
	//   68  122:aload_1         
	//   69  123:ldc1            #220 <String ", error message=">
	//   70  125:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   71  128:pop             
		stringbuilder.append(g);
	//   72  129:aload_1         
	//   73  130:aload_0         
	//   74  131:getfield        #60  <Field CharSequence g>
	//   75  134:invokevirtual   #223 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   76  137:pop             
		stringbuilder.append(", custom actions=");
	//   77  138:aload_1         
	//   78  139:ldc1            #225 <String ", custom actions=">
	//   79  141:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   80  144:pop             
		stringbuilder.append(((Object) (i)));
	//   81  145:aload_1         
	//   82  146:aload_0         
	//   83  147:getfield        #69  <Field List i>
	//   84  150:invokevirtual   #228 <Method StringBuilder StringBuilder.append(Object)>
	//   85  153:pop             
		stringbuilder.append(", active item id=");
	//   86  154:aload_1         
	//   87  155:ldc1            #230 <String ", active item id=">
	//   88  157:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   89  160:pop             
		stringbuilder.append(j);
	//   90  161:aload_1         
	//   91  162:aload_0         
	//   92  163:getfield        #71  <Field long j>
	//   93  166:invokevirtual   #205 <Method StringBuilder StringBuilder.append(long)>
	//   94  169:pop             
		stringbuilder.append("}");
	//   95  170:aload_1         
	//   96  171:ldc1            #232 <String "}">
	//   97  173:invokevirtual   #197 <Method StringBuilder StringBuilder.append(String)>
	//   98  176:pop             
		return stringbuilder.toString();
	//   99  177:aload_1         
	//  100  178:invokevirtual   #234 <Method String StringBuilder.toString()>
	//  101  181:areturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		parcel.writeInt(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #48  <Field int a>
	//    3    5:invokevirtual   #239 <Method void Parcel.writeInt(int)>
		parcel.writeLong(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #50  <Field long b>
	//    7   13:invokevirtual   #243 <Method void Parcel.writeLong(long)>
		parcel.writeFloat(d);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #54  <Field float d>
	//   11   21:invokevirtual   #247 <Method void Parcel.writeFloat(float)>
		parcel.writeLong(h);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #62  <Field long h>
	//   15   29:invokevirtual   #243 <Method void Parcel.writeLong(long)>
		parcel.writeLong(c);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #52  <Field long c>
	//   19   37:invokevirtual   #243 <Method void Parcel.writeLong(long)>
		parcel.writeLong(e);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #56  <Field long e>
	//   23   45:invokevirtual   #243 <Method void Parcel.writeLong(long)>
		TextUtils.writeToParcel(g, parcel, i1);
	//   24   48:aload_0         
	//   25   49:getfield        #60  <Field CharSequence g>
	//   26   52:aload_1         
	//   27   53:iload_2         
	//   28   54:invokestatic    #250 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
		parcel.writeTypedList(i);
	//   29   57:aload_1         
	//   30   58:aload_0         
	//   31   59:getfield        #69  <Field List i>
	//   32   62:invokevirtual   #254 <Method void Parcel.writeTypedList(List)>
		parcel.writeLong(j);
	//   33   65:aload_1         
	//   34   66:aload_0         
	//   35   67:getfield        #71  <Field long j>
	//   36   70:invokevirtual   #243 <Method void Parcel.writeLong(long)>
		parcel.writeBundle(k);
	//   37   73:aload_1         
	//   38   74:aload_0         
	//   39   75:getfield        #73  <Field Bundle k>
	//   40   78:invokevirtual   #258 <Method void Parcel.writeBundle(Bundle)>
		parcel.writeInt(f);
	//   41   81:aload_1         
	//   42   82:aload_0         
	//   43   83:getfield        #58  <Field int f>
	//   44   86:invokevirtual   #239 <Method void Parcel.writeInt(int)>
	//   45   89:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public PlaybackStateCompat a(Parcel parcel)
		{
			return new PlaybackStateCompat(parcel);
		//    0    0:new             #9   <Class PlaybackStateCompat>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void PlaybackStateCompat(Parcel)>
		//    4    8:areturn         
		}

		public PlaybackStateCompat[] a(int i1)
		{
			return new PlaybackStateCompat[i1];
		//    0    0:iload_1         
		//    1    1:anewarray       PlaybackStateCompat[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method PlaybackStateCompat a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i1)
		{
			return ((Object []) (a(i1)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method PlaybackStateCompat[] a(int)>
		//    3    5:areturn         
		}

	}
;
	final int a;
	final long b;
	final long c;
	final float d;
	final long e;
	final int f;
	final CharSequence g;
	final long h;
	List i;
	final long j;
	final Bundle k;
	private Object l;

	static 
	{
	//    0    0:new             #8   <Class PlaybackStateCompat$1>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void PlaybackStateCompat$1()>
	//    3    7:putstatic       #43  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.*;

// Referenced classes of package android.support.v4.media.session:
//			d, b

public class MediaSessionCompat
{
	public static final class QueueItem
		implements Parcelable
	{

		public static QueueItem a(Object obj)
		{
			if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:aload_0         
		//*   1    1:ifnull          35
		//*   2    4:getstatic       #70  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmpge          15
		//*   5   12:goto            35
				return new QueueItem(obj, MediaDescriptionCompat.a(d.a.a(obj)), d.a.b(obj));
		//    6   15:new             #2   <Class MediaSessionCompat$QueueItem>
		//    7   18:dup             
		//    8   19:aload_0         
		//    9   20:aload_0         
		//   10   21:invokestatic    #75  <Method Object d$a.a(Object)>
		//   11   24:invokestatic    #78  <Method MediaDescriptionCompat MediaDescriptionCompat.a(Object)>
		//   12   27:aload_0         
		//   13   28:invokestatic    #81  <Method long d$a.b(Object)>
		//   14   31:invokespecial   #83  <Method void MediaSessionCompat$QueueItem(Object, MediaDescriptionCompat, long)>
		//   15   34:areturn         
			else
				return null;
		//   16   35:aconst_null     
		//   17   36:areturn         
		}

		public static List a(List list)
		{
			if(list != null && android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:aload_0         
		//*   1    1:ifnull          60
		//*   2    4:getstatic       #70  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmpge          15
		//*   5   12:goto            60
			{
				ArrayList arraylist = new ArrayList();
		//    6   15:new             #86  <Class ArrayList>
		//    7   18:dup             
		//    8   19:invokespecial   #87  <Method void ArrayList()>
		//    9   22:astore_1        
				for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (a(((Iterator) (list)).next())))));
		//   10   23:aload_0         
		//   11   24:invokeinterface #93  <Method Iterator List.iterator()>
		//   12   29:astore_0        
		//   13   30:aload_0         
		//   14   31:invokeinterface #99  <Method boolean Iterator.hasNext()>
		//   15   36:ifeq            58
		//   16   39:aload_1         
		//   17   40:aload_0         
		//   18   41:invokeinterface #103 <Method Object Iterator.next()>
		//   19   46:invokestatic    #105 <Method MediaSessionCompat$QueueItem a(Object)>
		//   20   49:invokeinterface #109 <Method boolean List.add(Object)>
		//   21   54:pop             
		//*  22   55:goto            30
				return ((List) (arraylist));
		//   23   58:aload_1         
		//   24   59:areturn         
			} else
			{
				return null;
		//   25   60:aconst_null     
		//   26   61:areturn         
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
		//    0    0:new             #117 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #118 <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("MediaSession.QueueItem {Description=");
		//    4    8:aload_1         
		//    5    9:ldc1            #120 <String "MediaSession.QueueItem {Description=">
		//    6   11:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(((Object) (a)));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #41  <Field MediaDescriptionCompat a>
		//   11   20:invokevirtual   #127 <Method StringBuilder StringBuilder.append(Object)>
		//   12   23:pop             
			stringbuilder.append(", Id=");
		//   13   24:aload_1         
		//   14   25:ldc1            #129 <String ", Id=">
		//   15   27:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			stringbuilder.append(b);
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:getfield        #49  <Field long b>
		//   20   36:invokevirtual   #132 <Method StringBuilder StringBuilder.append(long)>
		//   21   39:pop             
			stringbuilder.append(" }");
		//   22   40:aload_1         
		//   23   41:ldc1            #134 <String " }">
		//   24   43:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
		//   25   46:pop             
			return stringbuilder.toString();
		//   26   47:aload_1         
		//   27   48:invokevirtual   #136 <Method String StringBuilder.toString()>
		//   28   51:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			a.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field MediaDescriptionCompat a>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #140 <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
			parcel.writeLong(b);
		//    5    9:aload_1         
		//    6   10:aload_0         
		//    7   11:getfield        #49  <Field long b>
		//    8   14:invokevirtual   #144 <Method void Parcel.writeLong(long)>
		//    9   17:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public QueueItem a(Parcel parcel)
			{
				return new QueueItem(parcel);
			//    0    0:new             #9   <Class MediaSessionCompat$QueueItem>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void MediaSessionCompat$QueueItem(Parcel)>
			//    4    8:areturn         
			}

			public QueueItem[] a(int i)
			{
				return new QueueItem[i];
			//    0    0:iload_1         
			//    1    1:anewarray       QueueItem[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #27  <Method MediaSessionCompat$QueueItem a(Parcel)>
			//    3    5:areturn         
			}

			public Object[] newArray(int i)
			{
				return ((Object []) (a(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #31  <Method MediaSessionCompat$QueueItem[] a(int)>
			//    3    5:areturn         
			}

		}
;
		private final MediaDescriptionCompat a;
		private final long b;
		private Object c;

		static 
		{
		//    0    0:new             #11  <Class MediaSessionCompat$QueueItem$1>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void MediaSessionCompat$QueueItem$1()>
		//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		QueueItem(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
			a = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
		//    2    4:aload_0         
		//    3    5:getstatic       #33  <Field android.os.Parcelable$Creator MediaDescriptionCompat.CREATOR>
		//    4    8:aload_1         
		//    5    9:invokeinterface #39  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//    6   14:checkcast       #32  <Class MediaDescriptionCompat>
		//    7   17:putfield        #41  <Field MediaDescriptionCompat a>
			b = parcel.readLong();
		//    8   20:aload_0         
		//    9   21:aload_1         
		//   10   22:invokevirtual   #47  <Method long Parcel.readLong()>
		//   11   25:putfield        #49  <Field long b>
		//   12   28:return          
		}

		private QueueItem(Object obj, MediaDescriptionCompat mediadescriptioncompat, long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
			if(mediadescriptioncompat == null)
		//*   2    4:aload_2         
		//*   3    5:ifnonnull       18
				throw new IllegalArgumentException("Description cannot be null.");
		//    4    8:new             #52  <Class IllegalArgumentException>
		//    5   11:dup             
		//    6   12:ldc1            #54  <String "Description cannot be null.">
		//    7   14:invokespecial   #57  <Method void IllegalArgumentException(String)>
		//    8   17:athrow          
			if(l == -1L)
		//*   9   18:lload_3         
		//*  10   19:ldc2w           #58  <Long -1L>
		//*  11   22:lcmp            
		//*  12   23:ifne            36
			{
				throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
		//   13   26:new             #52  <Class IllegalArgumentException>
		//   14   29:dup             
		//   15   30:ldc1            #61  <String "Id cannot be QueueItem.UNKNOWN_ID">
		//   16   32:invokespecial   #57  <Method void IllegalArgumentException(String)>
		//   17   35:athrow          
			} else
			{
				a = mediadescriptioncompat;
		//   18   36:aload_0         
		//   19   37:aload_2         
		//   20   38:putfield        #41  <Field MediaDescriptionCompat a>
				b = l;
		//   21   41:aload_0         
		//   22   42:lload_3         
		//   23   43:putfield        #49  <Field long b>
				c = obj;
		//   24   46:aload_0         
		//   25   47:aload_1         
		//   26   48:putfield        #63  <Field Object c>
				return;
		//   27   51:return          
			}
		}
	}

	static final class ResultReceiverWrapper
		implements Parcelable
	{

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			a.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field ResultReceiver a>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #43  <Method void ResultReceiver.writeToParcel(Parcel, int)>
		//    5    9:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public ResultReceiverWrapper a(Parcel parcel)
			{
				return new ResultReceiverWrapper(parcel);
			//    0    0:new             #9   <Class MediaSessionCompat$ResultReceiverWrapper>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void MediaSessionCompat$ResultReceiverWrapper(Parcel)>
			//    4    8:areturn         
			}

			public ResultReceiverWrapper[] a(int i)
			{
				return new ResultReceiverWrapper[i];
			//    0    0:iload_1         
			//    1    1:anewarray       ResultReceiverWrapper[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #27  <Method MediaSessionCompat$ResultReceiverWrapper a(Parcel)>
			//    3    5:areturn         
			}

			public Object[] newArray(int i)
			{
				return ((Object []) (a(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #31  <Method MediaSessionCompat$ResultReceiverWrapper[] a(int)>
			//    3    5:areturn         
			}

		}
;
		private ResultReceiver a;

		static 
		{
		//    0    0:new             #11  <Class MediaSessionCompat$ResultReceiverWrapper$1>
		//    1    3:dup             
		//    2    4:invokespecial   #21  <Method void MediaSessionCompat$ResultReceiverWrapper$1()>
		//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		ResultReceiverWrapper(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			a = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel);
		//    2    4:aload_0         
		//    3    5:getstatic       #29  <Field android.os.Parcelable$Creator ResultReceiver.CREATOR>
		//    4    8:aload_1         
		//    5    9:invokeinterface #35  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//    6   14:checkcast       #28  <Class ResultReceiver>
		//    7   17:putfield        #37  <Field ResultReceiver a>
		//    8   20:return          
		}
	}

	public static final class Token
		implements Parcelable
	{

		public static Token a(Object obj)
		{
			return a(obj, ((b) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokestatic    #39  <Method MediaSessionCompat$Token a(Object, b)>
		//    3    5:areturn         
		}

		public static Token a(Object obj, b b1)
		{
			if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:aload_0         
		//*   1    1:ifnull          25
		//*   2    4:getstatic       #45  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmplt          25
				return new Token(d.a(obj), b1);
		//    5   12:new             #2   <Class MediaSessionCompat$Token>
		//    6   15:dup             
		//    7   16:aload_0         
		//    8   17:invokestatic    #50  <Method Object d.a(Object)>
		//    9   20:aload_1         
		//   10   21:invokespecial   #30  <Method void MediaSessionCompat$Token(Object, b)>
		//   11   24:areturn         
			else
				return null;
		//   12   25:aconst_null     
		//   13   26:areturn         
		}

		public Object a()
		{
			return a;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field Object a>
		//    2    4:areturn         
		}

		public b b()
		{
			return b;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field b b>
		//    2    4:areturn         
		}

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(!(obj instanceof Token))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class MediaSessionCompat$Token>
		//*   7   11:ifne            16
				return false;
		//    8   14:iconst_0        
		//    9   15:ireturn         
			obj = ((Object) ((Token)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class MediaSessionCompat$Token>
		//   12   20:astore_1        
			if(a == null)
		//*  13   21:aload_0         
		//*  14   22:getfield        #33  <Field Object a>
		//*  15   25:ifnonnull       39
				return ((Token) (obj)).a == null;
		//   16   28:aload_1         
		//   17   29:getfield        #33  <Field Object a>
		//   18   32:ifnonnull       37
		//   19   35:iconst_1        
		//   20   36:ireturn         
		//   21   37:iconst_0        
		//   22   38:ireturn         
			if(((Token) (obj)).a == null)
		//*  23   39:aload_1         
		//*  24   40:getfield        #33  <Field Object a>
		//*  25   43:ifnonnull       48
				return false;
		//   26   46:iconst_0        
		//   27   47:ireturn         
			else
				return a.equals(((Token) (obj)).a);
		//   28   48:aload_0         
		//   29   49:getfield        #33  <Field Object a>
		//   30   52:aload_1         
		//   31   53:getfield        #33  <Field Object a>
		//   32   56:invokevirtual   #58  <Method boolean Object.equals(Object)>
		//   33   59:ireturn         
		}

		public int hashCode()
		{
			if(a == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field Object a>
		//*   2    4:ifnonnull       9
				return 0;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			else
				return a.hashCode();
		//    5    9:aload_0         
		//    6   10:getfield        #33  <Field Object a>
		//    7   13:invokevirtual   #61  <Method int Object.hashCode()>
		//    8   16:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:getstatic       #45  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          21
		//*   2    5:icmplt          21
			{
				parcel.writeParcelable((Parcelable)a, i);
		//    3    8:aload_1         
		//    4    9:aload_0         
		//    5   10:getfield        #33  <Field Object a>
		//    6   13:checkcast       #6   <Class Parcelable>
		//    7   16:iload_2         
		//    8   17:invokevirtual   #69  <Method void Parcel.writeParcelable(Parcelable, int)>
				return;
		//    9   20:return          
			} else
			{
				parcel.writeStrongBinder((IBinder)a);
		//   10   21:aload_1         
		//   11   22:aload_0         
		//   12   23:getfield        #33  <Field Object a>
		//   13   26:checkcast       #71  <Class IBinder>
		//   14   29:invokevirtual   #75  <Method void Parcel.writeStrongBinder(IBinder)>
				return;
		//   15   32:return          
			}
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public Token a(Parcel parcel)
			{
				if(android.os.Build.VERSION.SDK_INT >= 21)
			//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
			//*   1    3:bipush          21
			//*   2    5:icmplt          17
					parcel = ((Parcel) (parcel.readParcelable(((ClassLoader) (null)))));
			//    3    8:aload_1         
			//    4    9:aconst_null     
			//    5   10:invokevirtual   #31  <Method Parcelable Parcel.readParcelable(ClassLoader)>
			//    6   13:astore_1        
				else
			//*   7   14:goto            22
					parcel = ((Parcel) (parcel.readStrongBinder()));
			//    8   17:aload_1         
			//    9   18:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
			//   10   21:astore_1        
				return new Token(((Object) (parcel)));
			//   11   22:new             #9   <Class MediaSessionCompat$Token>
			//   12   25:dup             
			//   13   26:aload_1         
			//   14   27:invokespecial   #38  <Method void MediaSessionCompat$Token(Object)>
			//   15   30:areturn         
			}

			public Token[] a(int i)
			{
				return new Token[i];
			//    0    0:iload_1         
			//    1    1:anewarray       Token[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #43  <Method MediaSessionCompat$Token a(Parcel)>
			//    3    5:areturn         
			}

			public Object[] newArray(int i)
			{
				return ((Object []) (a(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #47  <Method MediaSessionCompat$Token[] a(int)>
			//    3    5:areturn         
			}

		}
;
		private final Object a;
		private final b b;

		static 
		{
		//    0    0:new             #11  <Class MediaSessionCompat$Token$1>
		//    1    3:dup             
		//    2    4:invokespecial   #23  <Method void MediaSessionCompat$Token$1()>
		//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		Token(Object obj)
		{
			this(obj, ((b) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #30  <Method void MediaSessionCompat$Token(Object, b)>
		//    4    6:return          
		}

		Token(Object obj, b b1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
			a = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #33  <Field Object a>
			b = b1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #35  <Field b b>
		//    8   14:return          
		}
	}

}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.text.TextUtils;
import java.util.*;

// Referenced classes of package android.support.v4.media.session:
//			bm, MediaSessionCompat, bp, br

public final class PlaybackStateCompat
	implements Parcelable
{

	PlaybackStateCompat(int i1, long l1, long l2, float f1, long l3, int j1, CharSequence charsequence, long l4, List list, long l5, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		a = i1;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #41  <Field int a>
		b = l1;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #43  <Field long b>
		c = l2;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #45  <Field long c>
		d = f1;
	//   11   20:aload_0         
	//   12   21:fload           6
	//   13   23:putfield        #47  <Field float d>
		e = l3;
	//   14   26:aload_0         
	//   15   27:lload           7
	//   16   29:putfield        #49  <Field long e>
		f = j1;
	//   17   32:aload_0         
	//   18   33:iload           9
	//   19   35:putfield        #51  <Field int f>
		g = charsequence;
	//   20   38:aload_0         
	//   21   39:aload           10
	//   22   41:putfield        #53  <Field CharSequence g>
		h = l4;
	//   23   44:aload_0         
	//   24   45:lload           11
	//   25   47:putfield        #55  <Field long h>
		i = ((List) (new ArrayList(((java.util.Collection) (list)))));
	//   26   50:aload_0         
	//   27   51:new             #57  <Class ArrayList>
	//   28   54:dup             
	//   29   55:aload           13
	//   30   57:invokespecial   #60  <Method void ArrayList(java.util.Collection)>
	//   31   60:putfield        #62  <Field List i>
		j = l5;
	//   32   63:aload_0         
	//   33   64:lload           14
	//   34   66:putfield        #64  <Field long j>
		k = bundle;
	//   35   69:aload_0         
	//   36   70:aload           16
	//   37   72:putfield        #66  <Field Bundle k>
	//   38   75:return          
	}

	PlaybackStateCompat(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		a = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #73  <Method int Parcel.readInt()>
	//    5    9:putfield        #41  <Field int a>
		b = parcel.readLong();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #77  <Method long Parcel.readLong()>
	//    9   17:putfield        #43  <Field long b>
		d = parcel.readFloat();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #81  <Method float Parcel.readFloat()>
	//   13   25:putfield        #47  <Field float d>
		h = parcel.readLong();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #77  <Method long Parcel.readLong()>
	//   17   33:putfield        #55  <Field long h>
		c = parcel.readLong();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #77  <Method long Parcel.readLong()>
	//   21   41:putfield        #45  <Field long c>
		e = parcel.readLong();
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #77  <Method long Parcel.readLong()>
	//   25   49:putfield        #49  <Field long e>
		g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//   26   52:aload_0         
	//   27   53:getstatic       #86  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   28   56:aload_1         
	//   29   57:invokeinterface #92  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   30   62:checkcast       #94  <Class CharSequence>
	//   31   65:putfield        #53  <Field CharSequence g>
		i = ((List) (parcel.createTypedArrayList(CustomAction.CREATOR)));
	//   32   68:aload_0         
	//   33   69:aload_1         
	//   34   70:getstatic       #97  <Field android.os.Parcelable$Creator PlaybackStateCompat$CustomAction.CREATOR>
	//   35   73:invokevirtual   #101 <Method ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   36   76:putfield        #62  <Field List i>
		j = parcel.readLong();
	//   37   79:aload_0         
	//   38   80:aload_1         
	//   39   81:invokevirtual   #77  <Method long Parcel.readLong()>
	//   40   84:putfield        #64  <Field long j>
		k = parcel.readBundle(((Class) (android/support/v4/media/session/MediaSessionCompat)).getClassLoader());
	//   41   87:aload_0         
	//   42   88:aload_1         
	//   43   89:ldc1            #103 <Class MediaSessionCompat>
	//   44   91:invokevirtual   #109 <Method ClassLoader Class.getClassLoader()>
	//   45   94:invokevirtual   #113 <Method Bundle Parcel.readBundle(ClassLoader)>
	//   46   97:putfield        #66  <Field Bundle k>
		f = parcel.readInt();
	//   47  100:aload_0         
	//   48  101:aload_1         
	//   49  102:invokevirtual   #73  <Method int Parcel.readInt()>
	//   50  105:putfield        #51  <Field int f>
	//   51  108:return          
	}

	public static PlaybackStateCompat a(Object obj)
	{
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          143
	//*   2    4:getstatic       #119 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          143
		{
			Object obj2 = ((Object) (bp.h(obj)));
	//    5   12:aload_0         
	//    6   13:invokestatic    #124 <Method List bp.h(Object)>
	//    7   16:astore_2        
			Object obj1;
			if(obj2 != null)
	//*   8   17:aload_2         
	//*   9   18:ifnull          73
			{
				obj1 = ((Object) (new ArrayList(((List) (obj2)).size())));
	//   10   21:new             #57  <Class ArrayList>
	//   11   24:dup             
	//   12   25:aload_2         
	//   13   26:invokeinterface #129 <Method int List.size()>
	//   14   31:invokespecial   #132 <Method void ArrayList(int)>
	//   15   34:astore_1        
				for(obj2 = ((Object) (((List) (obj2)).iterator())); ((Iterator) (obj2)).hasNext(); ((List) (obj1)).add(((Object) (CustomAction.a(((Iterator) (obj2)).next())))));
	//   16   35:aload_2         
	//   17   36:invokeinterface #136 <Method Iterator List.iterator()>
	//   18   41:astore_2        
	//   19   42:aload_2         
	//   20   43:invokeinterface #142 <Method boolean Iterator.hasNext()>
	//   21   48:ifeq            70
	//   22   51:aload_1         
	//   23   52:aload_2         
	//   24   53:invokeinterface #146 <Method Object Iterator.next()>
	//   25   58:invokestatic    #149 <Method PlaybackStateCompat$CustomAction PlaybackStateCompat$CustomAction.a(Object)>
	//   26   61:invokeinterface #153 <Method boolean List.add(Object)>
	//   27   66:pop             
			} else
	//*  28   67:goto            42
	//*  29   70:goto            75
			{
				obj1 = null;
	//   30   73:aconst_null     
	//   31   74:astore_1        
			}
			if(android.os.Build.VERSION.SDK_INT >= 22)
	//*  32   75:getstatic       #119 <Field int android.os.Build$VERSION.SDK_INT>
	//*  33   78:bipush          22
	//*  34   80:icmplt          91
				obj2 = ((Object) (br.a(obj)));
	//   35   83:aload_0         
	//   36   84:invokestatic    #158 <Method Bundle br.a(Object)>
	//   37   87:astore_2        
			else
	//*  38   88:goto            93
				obj2 = null;
	//   39   91:aconst_null     
	//   40   92:astore_2        
			obj1 = ((Object) (new PlaybackStateCompat(bp.a(obj), bp.b(obj), bp.c(obj), bp.d(obj), bp.e(obj), 0, bp.f(obj), bp.g(obj), ((List) (obj1)), bp.i(obj), ((Bundle) (obj2)))));
	//   41   93:new             #2   <Class PlaybackStateCompat>
	//   42   96:dup             
	//   43   97:aload_0         
	//   44   98:invokestatic    #161 <Method int bp.a(Object)>
	//   45  101:aload_0         
	//   46  102:invokestatic    #164 <Method long bp.b(Object)>
	//   47  105:aload_0         
	//   48  106:invokestatic    #166 <Method long bp.c(Object)>
	//   49  109:aload_0         
	//   50  110:invokestatic    #169 <Method float bp.d(Object)>
	//   51  113:aload_0         
	//   52  114:invokestatic    #171 <Method long bp.e(Object)>
	//   53  117:iconst_0        
	//   54  118:aload_0         
	//   55  119:invokestatic    #174 <Method CharSequence bp.f(Object)>
	//   56  122:aload_0         
	//   57  123:invokestatic    #176 <Method long bp.g(Object)>
	//   58  126:aload_1         
	//   59  127:aload_0         
	//   60  128:invokestatic    #178 <Method long bp.i(Object)>
	//   61  131:aload_2         
	//   62  132:invokespecial   #180 <Method void PlaybackStateCompat(int, long, long, float, long, int, CharSequence, long, List, long, Bundle)>
	//   63  135:astore_1        
			obj1.l = obj;
	//   64  136:aload_1         
	//   65  137:aload_0         
	//   66  138:putfield        #182 <Field Object l>
			return ((PlaybackStateCompat) (obj1));
	//   67  141:aload_1         
	//   68  142:areturn         
		} else
		{
			return null;
	//   69  143:aconst_null     
	//   70  144:areturn         
		}
	}

	public int a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int a>
	//    2    4:ireturn         
	}

	public long b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field long b>
	//    2    4:lreturn         
	}

	public long c()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field long h>
	//    2    4:lreturn         
	}

	public float d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field float d>
	//    2    4:freturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public long e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field long e>
	//    2    4:lreturn         
	}

	public Object f()
	{
		if(l == null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field Object l>
	//*   2    4:ifnonnull       179
	//*   3    7:getstatic       #119 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          21
	//*   5   12:icmplt          179
		{
			Object obj = ((Object) (i));
	//    6   15:aload_0         
	//    7   16:getfield        #62  <Field List i>
	//    8   19:astore_1        
			if(obj != null)
	//*   9   20:aload_1         
	//*  10   21:ifnull          82
			{
				obj = ((Object) (new ArrayList(((List) (obj)).size())));
	//   11   24:new             #57  <Class ArrayList>
	//   12   27:dup             
	//   13   28:aload_1         
	//   14   29:invokeinterface #129 <Method int List.size()>
	//   15   34:invokespecial   #132 <Method void ArrayList(int)>
	//   16   37:astore_1        
				for(Iterator iterator = i.iterator(); iterator.hasNext(); ((List) (obj)).add(((CustomAction)iterator.next()).a()));
	//   17   38:aload_0         
	//   18   39:getfield        #62  <Field List i>
	//   19   42:invokeinterface #136 <Method Iterator List.iterator()>
	//   20   47:astore_2        
	//   21   48:aload_2         
	//   22   49:invokeinterface #142 <Method boolean Iterator.hasNext()>
	//   23   54:ifeq            79
	//   24   57:aload_1         
	//   25   58:aload_2         
	//   26   59:invokeinterface #146 <Method Object Iterator.next()>
	//   27   64:checkcast       #96  <Class PlaybackStateCompat$CustomAction>
	//   28   67:invokevirtual   #185 <Method Object PlaybackStateCompat$CustomAction.a()>
	//   29   70:invokeinterface #153 <Method boolean List.add(Object)>
	//   30   75:pop             
			} else
	//*  31   76:goto            48
	//*  32   79:goto            84
			{
				obj = null;
	//   33   82:aconst_null     
	//   34   83:astore_1        
			}
			if(android.os.Build.VERSION.SDK_INT >= 22)
	//*  35   84:getstatic       #119 <Field int android.os.Build$VERSION.SDK_INT>
	//*  36   87:bipush          22
	//*  37   89:icmplt          139
				l = br.a(a, b, c, d, e, g, h, ((List) (obj)), j, k);
	//   38   92:aload_0         
	//   39   93:aload_0         
	//   40   94:getfield        #41  <Field int a>
	//   41   97:aload_0         
	//   42   98:getfield        #43  <Field long b>
	//   43  101:aload_0         
	//   44  102:getfield        #45  <Field long c>
	//   45  105:aload_0         
	//   46  106:getfield        #47  <Field float d>
	//   47  109:aload_0         
	//   48  110:getfield        #49  <Field long e>
	//   49  113:aload_0         
	//   50  114:getfield        #53  <Field CharSequence g>
	//   51  117:aload_0         
	//   52  118:getfield        #55  <Field long h>
	//   53  121:aload_1         
	//   54  122:aload_0         
	//   55  123:getfield        #64  <Field long j>
	//   56  126:aload_0         
	//   57  127:getfield        #66  <Field Bundle k>
	//   58  130:invokestatic    #188 <Method Object br.a(int, long, long, float, long, CharSequence, long, List, long, Bundle)>
	//   59  133:putfield        #182 <Field Object l>
			else
	//*  60  136:goto            179
				l = bp.a(a, b, c, d, e, g, h, ((List) (obj)), j);
	//   61  139:aload_0         
	//   62  140:aload_0         
	//   63  141:getfield        #41  <Field int a>
	//   64  144:aload_0         
	//   65  145:getfield        #43  <Field long b>
	//   66  148:aload_0         
	//   67  149:getfield        #45  <Field long c>
	//   68  152:aload_0         
	//   69  153:getfield        #47  <Field float d>
	//   70  156:aload_0         
	//   71  157:getfield        #49  <Field long e>
	//   72  160:aload_0         
	//   73  161:getfield        #53  <Field CharSequence g>
	//   74  164:aload_0         
	//   75  165:getfield        #55  <Field long h>
	//   76  168:aload_1         
	//   77  169:aload_0         
	//   78  170:getfield        #64  <Field long j>
	//   79  173:invokestatic    #191 <Method Object bp.a(int, long, long, float, long, CharSequence, long, List, long)>
	//   80  176:putfield        #182 <Field Object l>
		}
		return l;
	//   81  179:aload_0         
	//   82  180:getfield        #182 <Field Object l>
	//   83  183:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("PlaybackState {");
	//    0    0:new             #195 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #197 <String "PlaybackState {">
	//    3    6:invokespecial   #200 <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append("state=");
	//    5   10:aload_1         
	//    6   11:ldc1            #202 <String "state=">
	//    7   13:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(a);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #41  <Field int a>
	//   12   22:invokevirtual   #209 <Method StringBuilder StringBuilder.append(int)>
	//   13   25:pop             
		stringbuilder.append(", position=");
	//   14   26:aload_1         
	//   15   27:ldc1            #211 <String ", position=">
	//   16   29:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		stringbuilder.append(b);
	//   18   33:aload_1         
	//   19   34:aload_0         
	//   20   35:getfield        #43  <Field long b>
	//   21   38:invokevirtual   #214 <Method StringBuilder StringBuilder.append(long)>
	//   22   41:pop             
		stringbuilder.append(", buffered position=");
	//   23   42:aload_1         
	//   24   43:ldc1            #216 <String ", buffered position=">
	//   25   45:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		stringbuilder.append(c);
	//   27   49:aload_1         
	//   28   50:aload_0         
	//   29   51:getfield        #45  <Field long c>
	//   30   54:invokevirtual   #214 <Method StringBuilder StringBuilder.append(long)>
	//   31   57:pop             
		stringbuilder.append(", speed=");
	//   32   58:aload_1         
	//   33   59:ldc1            #218 <String ", speed=">
	//   34   61:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   35   64:pop             
		stringbuilder.append(d);
	//   36   65:aload_1         
	//   37   66:aload_0         
	//   38   67:getfield        #47  <Field float d>
	//   39   70:invokevirtual   #221 <Method StringBuilder StringBuilder.append(float)>
	//   40   73:pop             
		stringbuilder.append(", updated=");
	//   41   74:aload_1         
	//   42   75:ldc1            #223 <String ", updated=">
	//   43   77:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   44   80:pop             
		stringbuilder.append(h);
	//   45   81:aload_1         
	//   46   82:aload_0         
	//   47   83:getfield        #55  <Field long h>
	//   48   86:invokevirtual   #214 <Method StringBuilder StringBuilder.append(long)>
	//   49   89:pop             
		stringbuilder.append(", actions=");
	//   50   90:aload_1         
	//   51   91:ldc1            #225 <String ", actions=">
	//   52   93:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   53   96:pop             
		stringbuilder.append(e);
	//   54   97:aload_1         
	//   55   98:aload_0         
	//   56   99:getfield        #49  <Field long e>
	//   57  102:invokevirtual   #214 <Method StringBuilder StringBuilder.append(long)>
	//   58  105:pop             
		stringbuilder.append(", error code=");
	//   59  106:aload_1         
	//   60  107:ldc1            #227 <String ", error code=">
	//   61  109:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   62  112:pop             
		stringbuilder.append(f);
	//   63  113:aload_1         
	//   64  114:aload_0         
	//   65  115:getfield        #51  <Field int f>
	//   66  118:invokevirtual   #209 <Method StringBuilder StringBuilder.append(int)>
	//   67  121:pop             
		stringbuilder.append(", error message=");
	//   68  122:aload_1         
	//   69  123:ldc1            #229 <String ", error message=">
	//   70  125:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   71  128:pop             
		stringbuilder.append(g);
	//   72  129:aload_1         
	//   73  130:aload_0         
	//   74  131:getfield        #53  <Field CharSequence g>
	//   75  134:invokevirtual   #232 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   76  137:pop             
		stringbuilder.append(", custom actions=");
	//   77  138:aload_1         
	//   78  139:ldc1            #234 <String ", custom actions=">
	//   79  141:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   80  144:pop             
		stringbuilder.append(((Object) (i)));
	//   81  145:aload_1         
	//   82  146:aload_0         
	//   83  147:getfield        #62  <Field List i>
	//   84  150:invokevirtual   #237 <Method StringBuilder StringBuilder.append(Object)>
	//   85  153:pop             
		stringbuilder.append(", active item id=");
	//   86  154:aload_1         
	//   87  155:ldc1            #239 <String ", active item id=">
	//   88  157:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   89  160:pop             
		stringbuilder.append(j);
	//   90  161:aload_1         
	//   91  162:aload_0         
	//   92  163:getfield        #64  <Field long j>
	//   93  166:invokevirtual   #214 <Method StringBuilder StringBuilder.append(long)>
	//   94  169:pop             
		stringbuilder.append("}");
	//   95  170:aload_1         
	//   96  171:ldc1            #241 <String "}">
	//   97  173:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   98  176:pop             
		return stringbuilder.toString();
	//   99  177:aload_1         
	//  100  178:invokevirtual   #243 <Method String StringBuilder.toString()>
	//  101  181:areturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		parcel.writeInt(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field int a>
	//    3    5:invokevirtual   #248 <Method void Parcel.writeInt(int)>
		parcel.writeLong(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #43  <Field long b>
	//    7   13:invokevirtual   #252 <Method void Parcel.writeLong(long)>
		parcel.writeFloat(d);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #47  <Field float d>
	//   11   21:invokevirtual   #256 <Method void Parcel.writeFloat(float)>
		parcel.writeLong(h);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #55  <Field long h>
	//   15   29:invokevirtual   #252 <Method void Parcel.writeLong(long)>
		parcel.writeLong(c);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #45  <Field long c>
	//   19   37:invokevirtual   #252 <Method void Parcel.writeLong(long)>
		parcel.writeLong(e);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #49  <Field long e>
	//   23   45:invokevirtual   #252 <Method void Parcel.writeLong(long)>
		TextUtils.writeToParcel(g, parcel, i1);
	//   24   48:aload_0         
	//   25   49:getfield        #53  <Field CharSequence g>
	//   26   52:aload_1         
	//   27   53:iload_2         
	//   28   54:invokestatic    #259 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
		parcel.writeTypedList(i);
	//   29   57:aload_1         
	//   30   58:aload_0         
	//   31   59:getfield        #62  <Field List i>
	//   32   62:invokevirtual   #263 <Method void Parcel.writeTypedList(List)>
		parcel.writeLong(j);
	//   33   65:aload_1         
	//   34   66:aload_0         
	//   35   67:getfield        #64  <Field long j>
	//   36   70:invokevirtual   #252 <Method void Parcel.writeLong(long)>
		parcel.writeBundle(k);
	//   37   73:aload_1         
	//   38   74:aload_0         
	//   39   75:getfield        #66  <Field Bundle k>
	//   40   78:invokevirtual   #267 <Method void Parcel.writeBundle(Bundle)>
		parcel.writeInt(f);
	//   41   81:aload_1         
	//   42   82:aload_0         
	//   43   83:getfield        #51  <Field int f>
	//   44   86:invokevirtual   #248 <Method void Parcel.writeInt(int)>
	//   45   89:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new bm();
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
	//    0    0:new             #31  <Class bm>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void bm()>
	//    3    7:putstatic       #36  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	private class CustomAction
		implements Parcelable
	{

		public static CustomAction a(Object obj)
		{
			if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:aload_0         
		//*   1    1:ifnull          46
		//*   2    4:getstatic       #80  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmpge          15
		//*   5   12:goto            46
			{
				CustomAction customaction = new CustomAction(bq.a(obj), bq.b(obj), bq.c(obj), bq.d(obj));
		//    6   15:new             #2   <Class PlaybackStateCompat$CustomAction>
		//    7   18:dup             
		//    8   19:aload_0         
		//    9   20:invokestatic    #85  <Method String bq.a(Object)>
		//   10   23:aload_0         
		//   11   24:invokestatic    #88  <Method CharSequence bq.b(Object)>
		//   12   27:aload_0         
		//   13   28:invokestatic    #91  <Method int bq.c(Object)>
		//   14   31:aload_0         
		//   15   32:invokestatic    #94  <Method Bundle bq.d(Object)>
		//   16   35:invokespecial   #96  <Method void PlaybackStateCompat$CustomAction(String, CharSequence, int, Bundle)>
		//   17   38:astore_1        
				customaction.e = obj;
		//   18   39:aload_1         
		//   19   40:aload_0         
		//   20   41:putfield        #98  <Field Object e>
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

		public Object a()
		{
			if(e == null && android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:aload_0         
		//*   1    1:getfield        #98  <Field Object e>
		//*   2    4:ifnonnull       46
		//*   3    7:getstatic       #80  <Field int android.os.Build$VERSION.SDK_INT>
		//*   4   10:bipush          21
		//*   5   12:icmpge          18
		//*   6   15:goto            46
			{
				e = bq.a(a, b, c, d);
		//    7   18:aload_0         
		//    8   19:aload_0         
		//    9   20:getfield        #38  <Field String a>
		//   10   23:aload_0         
		//   11   24:getfield        #53  <Field CharSequence b>
		//   12   27:aload_0         
		//   13   28:getfield        #59  <Field int c>
		//   14   31:aload_0         
		//   15   32:getfield        #73  <Field Bundle d>
		//   16   35:invokestatic    #102 <Method Object bq.a(String, CharSequence, int, Bundle)>
		//   17   38:putfield        #98  <Field Object e>
				return e;
		//   18   41:aload_0         
		//   19   42:getfield        #98  <Field Object e>
		//   20   45:areturn         
			} else
			{
				return e;
		//   21   46:aload_0         
		//   22   47:getfield        #98  <Field Object e>
		//   23   50:areturn         
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
		//    0    0:new             #106 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #107 <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("Action:mName='");
		//    4    8:aload_1         
		//    5    9:ldc1            #109 <String "Action:mName='">
		//    6   11:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(((Object) (b)));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #53  <Field CharSequence b>
		//   11   20:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
		//   12   23:pop             
			stringbuilder.append(", mIcon=");
		//   13   24:aload_1         
		//   14   25:ldc1            #118 <String ", mIcon=">
		//   15   27:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			stringbuilder.append(c);
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:getfield        #59  <Field int c>
		//   20   36:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
		//   21   39:pop             
			stringbuilder.append(", mExtras=");
		//   22   40:aload_1         
		//   23   41:ldc1            #123 <String ", mExtras=">
		//   24   43:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//   25   46:pop             
			stringbuilder.append(((Object) (d)));
		//   26   47:aload_1         
		//   27   48:aload_0         
		//   28   49:getfield        #73  <Field Bundle d>
		//   29   52:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
		//   30   55:pop             
			return stringbuilder.toString();
		//   31   56:aload_1         
		//   32   57:invokevirtual   #125 <Method String StringBuilder.toString()>
		//   33   60:areturn         
		}

		public void writeToParcel(Parcel parcel, int i1)
		{
			parcel.writeString(a);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #38  <Field String a>
		//    3    5:invokevirtual   #131 <Method void Parcel.writeString(String)>
			TextUtils.writeToParcel(b, parcel, i1);
		//    4    8:aload_0         
		//    5    9:getfield        #53  <Field CharSequence b>
		//    6   12:aload_1         
		//    7   13:iload_2         
		//    8   14:invokestatic    #134 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			parcel.writeInt(c);
		//    9   17:aload_1         
		//   10   18:aload_0         
		//   11   19:getfield        #59  <Field int c>
		//   12   22:invokevirtual   #138 <Method void Parcel.writeInt(int)>
			parcel.writeBundle(d);
		//   13   25:aload_1         
		//   14   26:aload_0         
		//   15   27:getfield        #73  <Field Bundle d>
		//   16   30:invokevirtual   #142 <Method void Parcel.writeBundle(Bundle)>
		//   17   33:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new bo();
		private final String a;
		private final CharSequence b;
		private final int c;
		private final Bundle d;
		private Object e;

		static 
		{
		//    0    0:new             #22  <Class bo>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void bo()>
		//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		CustomAction(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
			a = parcel.readString();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #36  <Method String Parcel.readString()>
		//    5    9:putfield        #38  <Field String a>
			b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
		//    6   12:aload_0         
		//    7   13:getstatic       #43  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
		//    8   16:aload_1         
		//    9   17:invokeinterface #49  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   10   22:checkcast       #51  <Class CharSequence>
		//   11   25:putfield        #53  <Field CharSequence b>
			c = parcel.readInt();
		//   12   28:aload_0         
		//   13   29:aload_1         
		//   14   30:invokevirtual   #57  <Method int Parcel.readInt()>
		//   15   33:putfield        #59  <Field int c>
			d = parcel.readBundle(((Class) (android/support/v4/media/session/MediaSessionCompat)).getClassLoader());
		//   16   36:aload_0         
		//   17   37:aload_1         
		//   18   38:ldc1            #61  <Class MediaSessionCompat>
		//   19   40:invokevirtual   #67  <Method ClassLoader Class.getClassLoader()>
		//   20   43:invokevirtual   #71  <Method Bundle Parcel.readBundle(ClassLoader)>
		//   21   46:putfield        #73  <Field Bundle d>
		//   22   49:return          
		}

		CustomAction(String s, CharSequence charsequence, int i1, Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
			a = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #38  <Field String a>
			b = charsequence;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #53  <Field CharSequence b>
			c = i1;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #59  <Field int c>
			d = bundle;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #73  <Field Bundle d>
		//   14   25:return          
		}
	}

}

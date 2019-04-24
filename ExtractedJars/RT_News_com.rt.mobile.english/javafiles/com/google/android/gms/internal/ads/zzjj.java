// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzjl, zzmq

public final class zzjj extends AbstractSafeParcelable
{

	public zzjj(int i, long l, Bundle bundle, int j, List list, boolean flag, 
			int k, boolean flag1, String s, zzmq zzmq, Location location, String s1, Bundle bundle1, 
			Bundle bundle2, List list1, String s2, String s3, boolean flag2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void AbstractSafeParcelable()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #74  <Field int versionCode>
		zzapw = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #76  <Field long zzapw>
		if(bundle == null)
	//*   8   14:aload           4
	//*   9   16:ifnonnull       31
			bundle = new Bundle();
	//   10   19:new             #78  <Class Bundle>
	//   11   22:dup             
	//   12   23:invokespecial   #79  <Method void Bundle()>
	//   13   26:astore          4
	//*  14   28:goto            31
		extras = bundle;
	//   15   31:aload_0         
	//   16   32:aload           4
	//   17   34:putfield        #81  <Field Bundle extras>
		zzapx = j;
	//   18   37:aload_0         
	//   19   38:iload           5
	//   20   40:putfield        #83  <Field int zzapx>
		zzapy = list;
	//   21   43:aload_0         
	//   22   44:aload           6
	//   23   46:putfield        #85  <Field List zzapy>
		zzapz = flag;
	//   24   49:aload_0         
	//   25   50:iload           7
	//   26   52:putfield        #87  <Field boolean zzapz>
		zzaqa = k;
	//   27   55:aload_0         
	//   28   56:iload           8
	//   29   58:putfield        #89  <Field int zzaqa>
		zzaqb = flag1;
	//   30   61:aload_0         
	//   31   62:iload           9
	//   32   64:putfield        #91  <Field boolean zzaqb>
		zzaqc = s;
	//   33   67:aload_0         
	//   34   68:aload           10
	//   35   70:putfield        #93  <Field String zzaqc>
		zzaqd = zzmq;
	//   36   73:aload_0         
	//   37   74:aload           11
	//   38   76:putfield        #95  <Field zzmq zzaqd>
		zzaqe = location;
	//   39   79:aload_0         
	//   40   80:aload           12
	//   41   82:putfield        #97  <Field Location zzaqe>
		zzaqf = s1;
	//   42   85:aload_0         
	//   43   86:aload           13
	//   44   88:putfield        #99  <Field String zzaqf>
		if(bundle1 == null)
	//*  45   91:aload           14
	//*  46   93:ifnonnull       108
			bundle1 = new Bundle();
	//   47   96:new             #78  <Class Bundle>
	//   48   99:dup             
	//   49  100:invokespecial   #79  <Method void Bundle()>
	//   50  103:astore          14
	//*  51  105:goto            108
		zzaqg = bundle1;
	//   52  108:aload_0         
	//   53  109:aload           14
	//   54  111:putfield        #101 <Field Bundle zzaqg>
		zzaqh = bundle2;
	//   55  114:aload_0         
	//   56  115:aload           15
	//   57  117:putfield        #103 <Field Bundle zzaqh>
		zzaqi = list1;
	//   58  120:aload_0         
	//   59  121:aload           16
	//   60  123:putfield        #105 <Field List zzaqi>
		zzaqj = s2;
	//   61  126:aload_0         
	//   62  127:aload           17
	//   63  129:putfield        #107 <Field String zzaqj>
		zzaqk = s3;
	//   64  132:aload_0         
	//   65  133:aload           18
	//   66  135:putfield        #109 <Field String zzaqk>
		zzaql = flag2;
	//   67  138:aload_0         
	//   68  139:iload           19
	//   69  141:putfield        #111 <Field boolean zzaql>
	//   70  144:return          
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof zzjj))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class zzjj>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj = ((Object) ((zzjj)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class zzjj>
	//    7   13:astore_1        
		return versionCode == ((zzjj) (obj)).versionCode && zzapw == ((zzjj) (obj)).zzapw && Objects.equal(((Object) (extras)), ((Object) (((zzjj) (obj)).extras))) && zzapx == ((zzjj) (obj)).zzapx && Objects.equal(((Object) (zzapy)), ((Object) (((zzjj) (obj)).zzapy))) && zzapz == ((zzjj) (obj)).zzapz && zzaqa == ((zzjj) (obj)).zzaqa && zzaqb == ((zzjj) (obj)).zzaqb && Objects.equal(((Object) (zzaqc)), ((Object) (((zzjj) (obj)).zzaqc))) && Objects.equal(((Object) (zzaqd)), ((Object) (((zzjj) (obj)).zzaqd))) && Objects.equal(((Object) (zzaqe)), ((Object) (((zzjj) (obj)).zzaqe))) && Objects.equal(((Object) (zzaqf)), ((Object) (((zzjj) (obj)).zzaqf))) && Objects.equal(((Object) (zzaqg)), ((Object) (((zzjj) (obj)).zzaqg))) && Objects.equal(((Object) (zzaqh)), ((Object) (((zzjj) (obj)).zzaqh))) && Objects.equal(((Object) (zzaqi)), ((Object) (((zzjj) (obj)).zzaqi))) && Objects.equal(((Object) (zzaqj)), ((Object) (((zzjj) (obj)).zzaqj))) && Objects.equal(((Object) (zzaqk)), ((Object) (((zzjj) (obj)).zzaqk))) && zzaql == ((zzjj) (obj)).zzaql;
	//    8   14:aload_0         
	//    9   15:getfield        #74  <Field int versionCode>
	//   10   18:aload_1         
	//   11   19:getfield        #74  <Field int versionCode>
	//   12   22:icmpne          248
	//   13   25:aload_0         
	//   14   26:getfield        #76  <Field long zzapw>
	//   15   29:aload_1         
	//   16   30:getfield        #76  <Field long zzapw>
	//   17   33:lcmp            
	//   18   34:ifne            248
	//   19   37:aload_0         
	//   20   38:getfield        #81  <Field Bundle extras>
	//   21   41:aload_1         
	//   22   42:getfield        #81  <Field Bundle extras>
	//   23   45:invokestatic    #123 <Method boolean Objects.equal(Object, Object)>
	//   24   48:ifeq            248
	//   25   51:aload_0         
	//   26   52:getfield        #83  <Field int zzapx>
	//   27   55:aload_1         
	//   28   56:getfield        #83  <Field int zzapx>
	//   29   59:icmpne          248
	//   30   62:aload_0         
	//   31   63:getfield        #85  <Field List zzapy>
	//   32   66:aload_1         
	//   33   67:getfield        #85  <Field List zzapy>
	//   34   70:invokestatic    #123 <Method boolean Objects.equal(Object, Object)>
	//   35   73:ifeq            248
	//   36   76:aload_0         
	//   37   77:getfield        #87  <Field boolean zzapz>
	//   38   80:aload_1         
	//   39   81:getfield        #87  <Field boolean zzapz>
	//   40   84:icmpne          248
	//   41   87:aload_0         
	//   42   88:getfield        #89  <Field int zzaqa>
	//   43   91:aload_1         
	//   44   92:getfield        #89  <Field int zzaqa>
	//   45   95:icmpne          248
	//   46   98:aload_0         
	//   47   99:getfield        #91  <Field boolean zzaqb>
	//   48  102:aload_1         
	//   49  103:getfield        #91  <Field boolean zzaqb>
	//   50  106:icmpne          248
	//   51  109:aload_0         
	//   52  110:getfield        #93  <Field String zzaqc>
	//   53  113:aload_1         
	//   54  114:getfield        #93  <Field String zzaqc>
	//   55  117:invokestatic    #123 <Method boolean Objects.equal(Object, Object)>
	//   56  120:ifeq            248
	//   57  123:aload_0         
	//   58  124:getfield        #95  <Field zzmq zzaqd>
	//   59  127:aload_1         
	//   60  128:getfield        #95  <Field zzmq zzaqd>
	//   61  131:invokestatic    #123 <Method boolean Objects.equal(Object, Object)>
	//   62  134:ifeq            248
	//   63  137:aload_0         
	//   64  138:getfield        #97  <Field Location zzaqe>
	//   65  141:aload_1         
	//   66  142:getfield        #97  <Field Location zzaqe>
	//   67  145:invokestatic    #123 <Method boolean Objects.equal(Object, Object)>
	//   68  148:ifeq            248
	//   69  151:aload_0         
	//   70  152:getfield        #99  <Field String zzaqf>
	//   71  155:aload_1         
	//   72  156:getfield        #99  <Field String zzaqf>
	//   73  159:invokestatic    #123 <Method boolean Objects.equal(Object, Object)>
	//   74  162:ifeq            248
	//   75  165:aload_0         
	//   76  166:getfield        #101 <Field Bundle zzaqg>
	//   77  169:aload_1         
	//   78  170:getfield        #101 <Field Bundle zzaqg>
	//   79  173:invokestatic    #123 <Method boolean Objects.equal(Object, Object)>
	//   80  176:ifeq            248
	//   81  179:aload_0         
	//   82  180:getfield        #103 <Field Bundle zzaqh>
	//   83  183:aload_1         
	//   84  184:getfield        #103 <Field Bundle zzaqh>
	//   85  187:invokestatic    #123 <Method boolean Objects.equal(Object, Object)>
	//   86  190:ifeq            248
	//   87  193:aload_0         
	//   88  194:getfield        #105 <Field List zzaqi>
	//   89  197:aload_1         
	//   90  198:getfield        #105 <Field List zzaqi>
	//   91  201:invokestatic    #123 <Method boolean Objects.equal(Object, Object)>
	//   92  204:ifeq            248
	//   93  207:aload_0         
	//   94  208:getfield        #107 <Field String zzaqj>
	//   95  211:aload_1         
	//   96  212:getfield        #107 <Field String zzaqj>
	//   97  215:invokestatic    #123 <Method boolean Objects.equal(Object, Object)>
	//   98  218:ifeq            248
	//   99  221:aload_0         
	//  100  222:getfield        #109 <Field String zzaqk>
	//  101  225:aload_1         
	//  102  226:getfield        #109 <Field String zzaqk>
	//  103  229:invokestatic    #123 <Method boolean Objects.equal(Object, Object)>
	//  104  232:ifeq            248
	//  105  235:aload_0         
	//  106  236:getfield        #111 <Field boolean zzaql>
	//  107  239:aload_1         
	//  108  240:getfield        #111 <Field boolean zzaql>
	//  109  243:icmpne          248
	//  110  246:iconst_1        
	//  111  247:ireturn         
	//  112  248:iconst_0        
	//  113  249:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Integer.valueOf(versionCode), Long.valueOf(zzapw), extras, Integer.valueOf(zzapx), zzapy, Boolean.valueOf(zzapz), Integer.valueOf(zzaqa), Boolean.valueOf(zzaqb), zzaqc, zzaqd, 
			zzaqe, zzaqf, zzaqg, zzaqh, zzaqi, zzaqj, zzaqk, Boolean.valueOf(zzaql)
		});
	//    0    0:bipush          18
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #74  <Field int versionCode>
	//    6   11:invokestatic    #133 <Method Integer Integer.valueOf(int)>
	//    7   14:aastore         
	//    8   15:dup             
	//    9   16:iconst_1        
	//   10   17:aload_0         
	//   11   18:getfield        #76  <Field long zzapw>
	//   12   21:invokestatic    #138 <Method Long Long.valueOf(long)>
	//   13   24:aastore         
	//   14   25:dup             
	//   15   26:iconst_2        
	//   16   27:aload_0         
	//   17   28:getfield        #81  <Field Bundle extras>
	//   18   31:aastore         
	//   19   32:dup             
	//   20   33:iconst_3        
	//   21   34:aload_0         
	//   22   35:getfield        #83  <Field int zzapx>
	//   23   38:invokestatic    #133 <Method Integer Integer.valueOf(int)>
	//   24   41:aastore         
	//   25   42:dup             
	//   26   43:iconst_4        
	//   27   44:aload_0         
	//   28   45:getfield        #85  <Field List zzapy>
	//   29   48:aastore         
	//   30   49:dup             
	//   31   50:iconst_5        
	//   32   51:aload_0         
	//   33   52:getfield        #87  <Field boolean zzapz>
	//   34   55:invokestatic    #143 <Method Boolean Boolean.valueOf(boolean)>
	//   35   58:aastore         
	//   36   59:dup             
	//   37   60:bipush          6
	//   38   62:aload_0         
	//   39   63:getfield        #89  <Field int zzaqa>
	//   40   66:invokestatic    #133 <Method Integer Integer.valueOf(int)>
	//   41   69:aastore         
	//   42   70:dup             
	//   43   71:bipush          7
	//   44   73:aload_0         
	//   45   74:getfield        #91  <Field boolean zzaqb>
	//   46   77:invokestatic    #143 <Method Boolean Boolean.valueOf(boolean)>
	//   47   80:aastore         
	//   48   81:dup             
	//   49   82:bipush          8
	//   50   84:aload_0         
	//   51   85:getfield        #93  <Field String zzaqc>
	//   52   88:aastore         
	//   53   89:dup             
	//   54   90:bipush          9
	//   55   92:aload_0         
	//   56   93:getfield        #95  <Field zzmq zzaqd>
	//   57   96:aastore         
	//   58   97:dup             
	//   59   98:bipush          10
	//   60  100:aload_0         
	//   61  101:getfield        #97  <Field Location zzaqe>
	//   62  104:aastore         
	//   63  105:dup             
	//   64  106:bipush          11
	//   65  108:aload_0         
	//   66  109:getfield        #99  <Field String zzaqf>
	//   67  112:aastore         
	//   68  113:dup             
	//   69  114:bipush          12
	//   70  116:aload_0         
	//   71  117:getfield        #101 <Field Bundle zzaqg>
	//   72  120:aastore         
	//   73  121:dup             
	//   74  122:bipush          13
	//   75  124:aload_0         
	//   76  125:getfield        #103 <Field Bundle zzaqh>
	//   77  128:aastore         
	//   78  129:dup             
	//   79  130:bipush          14
	//   80  132:aload_0         
	//   81  133:getfield        #105 <Field List zzaqi>
	//   82  136:aastore         
	//   83  137:dup             
	//   84  138:bipush          15
	//   85  140:aload_0         
	//   86  141:getfield        #107 <Field String zzaqj>
	//   87  144:aastore         
	//   88  145:dup             
	//   89  146:bipush          16
	//   90  148:aload_0         
	//   91  149:getfield        #109 <Field String zzaqk>
	//   92  152:aastore         
	//   93  153:dup             
	//   94  154:bipush          17
	//   95  156:aload_0         
	//   96  157:getfield        #111 <Field boolean zzaql>
	//   97  160:invokestatic    #143 <Method Boolean Boolean.valueOf(boolean)>
	//   98  163:aastore         
	//   99  164:invokestatic    #146 <Method int Objects.hashCode(Object[])>
	//  100  167:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #154 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, versionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #74  <Field int versionCode>
	//    7   11:invokestatic    #158 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeLong(parcel, 2, zzapw);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #76  <Field long zzapw>
	//   12   20:invokestatic    #162 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeBundle(parcel, 3, extras, false);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #81  <Field Bundle extras>
	//   17   29:iconst_0        
	//   18   30:invokestatic    #166 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.writeInt(parcel, 4, zzapx);
	//   19   33:aload_1         
	//   20   34:iconst_4        
	//   21   35:aload_0         
	//   22   36:getfield        #83  <Field int zzapx>
	//   23   39:invokestatic    #158 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeStringList(parcel, 5, zzapy, false);
	//   24   42:aload_1         
	//   25   43:iconst_5        
	//   26   44:aload_0         
	//   27   45:getfield        #85  <Field List zzapy>
	//   28   48:iconst_0        
	//   29   49:invokestatic    #170 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 6, zzapz);
	//   30   52:aload_1         
	//   31   53:bipush          6
	//   32   55:aload_0         
	//   33   56:getfield        #87  <Field boolean zzapz>
	//   34   59:invokestatic    #174 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeInt(parcel, 7, zzaqa);
	//   35   62:aload_1         
	//   36   63:bipush          7
	//   37   65:aload_0         
	//   38   66:getfield        #89  <Field int zzaqa>
	//   39   69:invokestatic    #158 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBoolean(parcel, 8, zzaqb);
	//   40   72:aload_1         
	//   41   73:bipush          8
	//   42   75:aload_0         
	//   43   76:getfield        #91  <Field boolean zzaqb>
	//   44   79:invokestatic    #174 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeString(parcel, 9, zzaqc, false);
	//   45   82:aload_1         
	//   46   83:bipush          9
	//   47   85:aload_0         
	//   48   86:getfield        #93  <Field String zzaqc>
	//   49   89:iconst_0        
	//   50   90:invokestatic    #178 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 10, ((android.os.Parcelable) (zzaqd)), i, false);
	//   51   93:aload_1         
	//   52   94:bipush          10
	//   53   96:aload_0         
	//   54   97:getfield        #95  <Field zzmq zzaqd>
	//   55  100:iload_2         
	//   56  101:iconst_0        
	//   57  102:invokestatic    #182 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 11, ((android.os.Parcelable) (zzaqe)), i, false);
	//   58  105:aload_1         
	//   59  106:bipush          11
	//   60  108:aload_0         
	//   61  109:getfield        #97  <Field Location zzaqe>
	//   62  112:iload_2         
	//   63  113:iconst_0        
	//   64  114:invokestatic    #182 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeString(parcel, 12, zzaqf, false);
	//   65  117:aload_1         
	//   66  118:bipush          12
	//   67  120:aload_0         
	//   68  121:getfield        #99  <Field String zzaqf>
	//   69  124:iconst_0        
	//   70  125:invokestatic    #178 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeBundle(parcel, 13, zzaqg, false);
	//   71  128:aload_1         
	//   72  129:bipush          13
	//   73  131:aload_0         
	//   74  132:getfield        #101 <Field Bundle zzaqg>
	//   75  135:iconst_0        
	//   76  136:invokestatic    #166 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.writeBundle(parcel, 14, zzaqh, false);
	//   77  139:aload_1         
	//   78  140:bipush          14
	//   79  142:aload_0         
	//   80  143:getfield        #103 <Field Bundle zzaqh>
	//   81  146:iconst_0        
	//   82  147:invokestatic    #166 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.writeStringList(parcel, 15, zzaqi, false);
	//   83  150:aload_1         
	//   84  151:bipush          15
	//   85  153:aload_0         
	//   86  154:getfield        #105 <Field List zzaqi>
	//   87  157:iconst_0        
	//   88  158:invokestatic    #170 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeString(parcel, 16, zzaqj, false);
	//   89  161:aload_1         
	//   90  162:bipush          16
	//   91  164:aload_0         
	//   92  165:getfield        #107 <Field String zzaqj>
	//   93  168:iconst_0        
	//   94  169:invokestatic    #178 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 17, zzaqk, false);
	//   95  172:aload_1         
	//   96  173:bipush          17
	//   97  175:aload_0         
	//   98  176:getfield        #109 <Field String zzaqk>
	//   99  179:iconst_0        
	//  100  180:invokestatic    #178 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 18, zzaql);
	//  101  183:aload_1         
	//  102  184:bipush          18
	//  103  186:aload_0         
	//  104  187:getfield        #111 <Field boolean zzaql>
	//  105  190:invokestatic    #174 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//  106  193:aload_1         
	//  107  194:iload_3         
	//  108  195:invokestatic    #185 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//  109  198:return          
	}

	public final zzjj zzhv()
	{
		Bundle bundle1 = zzaqg.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Bundle zzaqg>
	//    2    4:ldc1            #189 <String "com.google.ads.mediation.admob.AdMobAdapter">
	//    3    6:invokevirtual   #193 <Method Bundle Bundle.getBundle(String)>
	//    4    9:astore_2        
		Bundle bundle = bundle1;
	//    5   10:aload_2         
	//    6   11:astore_1        
		if(bundle1 == null)
	//*   7   12:aload_2         
	//*   8   13:ifnonnull       34
		{
			bundle = extras;
	//    9   16:aload_0         
	//   10   17:getfield        #81  <Field Bundle extras>
	//   11   20:astore_1        
			zzaqg.putBundle("com.google.ads.mediation.admob.AdMobAdapter", extras);
	//   12   21:aload_0         
	//   13   22:getfield        #101 <Field Bundle zzaqg>
	//   14   25:ldc1            #189 <String "com.google.ads.mediation.admob.AdMobAdapter">
	//   15   27:aload_0         
	//   16   28:getfield        #81  <Field Bundle extras>
	//   17   31:invokevirtual   #197 <Method void Bundle.putBundle(String, Bundle)>
		}
		return new zzjj(versionCode, zzapw, bundle, zzapx, zzapy, zzapz, zzaqa, zzaqb, zzaqc, zzaqd, zzaqe, zzaqf, zzaqg, zzaqh, zzaqi, zzaqj, zzaqk, zzaql);
	//   18   34:new             #2   <Class zzjj>
	//   19   37:dup             
	//   20   38:aload_0         
	//   21   39:getfield        #74  <Field int versionCode>
	//   22   42:aload_0         
	//   23   43:getfield        #76  <Field long zzapw>
	//   24   46:aload_1         
	//   25   47:aload_0         
	//   26   48:getfield        #83  <Field int zzapx>
	//   27   51:aload_0         
	//   28   52:getfield        #85  <Field List zzapy>
	//   29   55:aload_0         
	//   30   56:getfield        #87  <Field boolean zzapz>
	//   31   59:aload_0         
	//   32   60:getfield        #89  <Field int zzaqa>
	//   33   63:aload_0         
	//   34   64:getfield        #91  <Field boolean zzaqb>
	//   35   67:aload_0         
	//   36   68:getfield        #93  <Field String zzaqc>
	//   37   71:aload_0         
	//   38   72:getfield        #95  <Field zzmq zzaqd>
	//   39   75:aload_0         
	//   40   76:getfield        #97  <Field Location zzaqe>
	//   41   79:aload_0         
	//   42   80:getfield        #99  <Field String zzaqf>
	//   43   83:aload_0         
	//   44   84:getfield        #101 <Field Bundle zzaqg>
	//   45   87:aload_0         
	//   46   88:getfield        #103 <Field Bundle zzaqh>
	//   47   91:aload_0         
	//   48   92:getfield        #105 <Field List zzaqi>
	//   49   95:aload_0         
	//   50   96:getfield        #107 <Field String zzaqj>
	//   51   99:aload_0         
	//   52  100:getfield        #109 <Field String zzaqk>
	//   53  103:aload_0         
	//   54  104:getfield        #111 <Field boolean zzaql>
	//   55  107:invokespecial   #199 <Method void zzjj(int, long, Bundle, int, List, boolean, int, boolean, String, zzmq, Location, String, Bundle, Bundle, List, String, String, boolean)>
	//   56  110:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzjl();
	public final Bundle extras;
	public final int versionCode;
	public final long zzapw;
	public final int zzapx;
	public final List zzapy;
	public final boolean zzapz;
	public final int zzaqa;
	public final boolean zzaqb;
	public final String zzaqc;
	public final zzmq zzaqd;
	public final Location zzaqe;
	public final String zzaqf;
	public final Bundle zzaqg;
	public final Bundle zzaqh;
	public final List zzaqi;
	public final String zzaqj;
	public final String zzaqk;
	public final boolean zzaql;

	static 
	{
	//    0    0:new             #62  <Class zzjl>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void zzjl()>
	//    3    7:putstatic       #67  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}

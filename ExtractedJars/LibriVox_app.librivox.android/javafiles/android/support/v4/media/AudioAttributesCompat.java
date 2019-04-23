// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.util.SparseIntArray;
import androidx.versionedparcelable.d;

// Referenced classes of package android.support.v4.media:
//			a

public class AudioAttributesCompat
	implements d
{

	AudioAttributesCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}

	static int a(boolean flag, int i, int j)
	{
		if((i & 1) == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:iconst_1        
	//*   4    4:icmpne          16
			return !flag ? 7 : 1;
	//    5    7:iload_0         
	//    6    8:ifeq            13
	//    7   11:iconst_1        
	//    8   12:ireturn         
	//    9   13:bipush          7
	//   10   15:ireturn         
		if((i & 4) == 4)
	//*  11   16:iload_1         
	//*  12   17:iconst_4        
	//*  13   18:iand            
	//*  14   19:iconst_4        
	//*  15   20:icmpne          32
			return !flag ? 6 : 0;
	//   16   23:iload_0         
	//   17   24:ifeq            29
	//   18   27:iconst_0        
	//   19   28:ireturn         
	//   20   29:bipush          6
	//   21   31:ireturn         
		i = 3;
	//   22   32:iconst_3        
	//   23   33:istore_1        
		switch(j)
	//*  24   34:iload_2         
		{
	//*  25   35:tableswitch     0 16: default 116
	//	               0 146
	//	               1 144
	//	               2 142
	//	               3 133
	//	               4 131
	//	               5 129
	//	               6 127
	//	               7 129
	//	               8 129
	//	               9 129
	//	               10 129
	//	               11 124
	//	               12 144
	//	               13 122
	//	               14 144
	//	               15 116
	//	               16 144
		case 15: // '\017'
		default:
			if(!flag)
	//*  26  116:iload_0         
	//*  27  117:ifne            155
			{
				return 3;
	//   28  120:iconst_3        
	//   29  121:ireturn         
			} else
	//*  30  122:iconst_1        
	//*  31  123:ireturn         
	//*  32  124:bipush          10
	//*  33  126:ireturn         
	//*  34  127:iconst_2        
	//*  35  128:ireturn         
	//*  36  129:iconst_5        
	//*  37  130:ireturn         
	//*  38  131:iconst_4        
	//*  39  132:ireturn         
	//*  40  133:iload_0         
	//*  41  134:ifeq            139
	//*  42  137:iconst_0        
	//*  43  138:ireturn         
	//*  44  139:bipush          8
	//*  45  141:ireturn         
	//*  46  142:iconst_0        
	//*  47  143:ireturn         
	//*  48  144:iconst_3        
	//*  49  145:ireturn         
	//*  50  146:iload_0         
	//*  51  147:ifeq            153
	//*  52  150:ldc1            #31  <Int 0x80000000>
	//*  53  152:istore_1        
	//*  54  153:iload_1         
	//*  55  154:ireturn         
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   56  155:new             #33  <Class StringBuilder>
	//   57  158:dup             
	//   58  159:invokespecial   #34  <Method void StringBuilder()>
	//   59  162:astore_3        
				stringbuilder.append("Unknown usage value ");
	//   60  163:aload_3         
	//   61  164:ldc1            #36  <String "Unknown usage value ">
	//   62  166:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   63  169:pop             
				stringbuilder.append(j);
	//   64  170:aload_3         
	//   65  171:iload_2         
	//   66  172:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
	//   67  175:pop             
				stringbuilder.append(" in audio attributes");
	//   68  176:aload_3         
	//   69  177:ldc1            #45  <String " in audio attributes">
	//   70  179:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   71  182:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   72  183:new             #47  <Class IllegalArgumentException>
	//   73  186:dup             
	//   74  187:aload_3         
	//   75  188:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   76  191:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   77  194:athrow          
			}

		case 13: // '\r'
			return 1;

		case 11: // '\013'
			return 10;

		case 6: // '\006'
			return 2;

		case 5: // '\005'
		case 7: // '\007'
		case 8: // '\b'
		case 9: // '\t'
		case 10: // '\n'
			return 5;

		case 4: // '\004'
			return 4;

		case 3: // '\003'
			return !flag ? 8 : 0;

		case 2: // '\002'
			return 0;

		case 1: // '\001'
		case 12: // '\f'
		case 14: // '\016'
		case 16: // '\020'
			return 3;

		case 0: // '\0'
			break;
		}
		if(flag)
			i = 0x80000000;
		return i;
	}

	static String a(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 16: default 84
	//	               0 155
	//	               1 152
	//	               2 149
	//	               3 146
	//	               4 143
	//	               5 140
	//	               6 137
	//	               7 134
	//	               8 131
	//	               9 128
	//	               10 125
	//	               11 122
	//	               12 119
	//	               13 116
	//	               14 113
	//	               15 84
	//	               16 110
		case 15: // '\017'
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    2   84:new             #33  <Class StringBuilder>
	//    3   87:dup             
	//    4   88:invokespecial   #34  <Method void StringBuilder()>
	//    5   91:astore_1        
			stringbuilder.append("unknown usage ");
	//    6   92:aload_1         
	//    7   93:ldc1            #57  <String "unknown usage ">
	//    8   95:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    9   98:pop             
			stringbuilder.append(i);
	//   10   99:aload_1         
	//   11  100:iload_0         
	//   12  101:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
	//   13  104:pop             
			return stringbuilder.toString();
	//   14  105:aload_1         
	//   15  106:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   16  109:areturn         

		case 16: // '\020'
			return "USAGE_ASSISTANT";
	//   17  110:ldc1            #59  <String "USAGE_ASSISTANT">
	//   18  112:areturn         

		case 14: // '\016'
			return "USAGE_GAME";
	//   19  113:ldc1            #61  <String "USAGE_GAME">
	//   20  115:areturn         

		case 13: // '\r'
			return "USAGE_ASSISTANCE_SONIFICATION";
	//   21  116:ldc1            #63  <String "USAGE_ASSISTANCE_SONIFICATION">
	//   22  118:areturn         

		case 12: // '\f'
			return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
	//   23  119:ldc1            #65  <String "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE">
	//   24  121:areturn         

		case 11: // '\013'
			return "USAGE_ASSISTANCE_ACCESSIBILITY";
	//   25  122:ldc1            #67  <String "USAGE_ASSISTANCE_ACCESSIBILITY">
	//   26  124:areturn         

		case 10: // '\n'
			return "USAGE_NOTIFICATION_EVENT";
	//   27  125:ldc1            #69  <String "USAGE_NOTIFICATION_EVENT">
	//   28  127:areturn         

		case 9: // '\t'
			return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
	//   29  128:ldc1            #71  <String "USAGE_NOTIFICATION_COMMUNICATION_DELAYED">
	//   30  130:areturn         

		case 8: // '\b'
			return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
	//   31  131:ldc1            #73  <String "USAGE_NOTIFICATION_COMMUNICATION_INSTANT">
	//   32  133:areturn         

		case 7: // '\007'
			return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
	//   33  134:ldc1            #75  <String "USAGE_NOTIFICATION_COMMUNICATION_REQUEST">
	//   34  136:areturn         

		case 6: // '\006'
			return "USAGE_NOTIFICATION_RINGTONE";
	//   35  137:ldc1            #77  <String "USAGE_NOTIFICATION_RINGTONE">
	//   36  139:areturn         

		case 5: // '\005'
			return "USAGE_NOTIFICATION";
	//   37  140:ldc1            #79  <String "USAGE_NOTIFICATION">
	//   38  142:areturn         

		case 4: // '\004'
			return "USAGE_ALARM";
	//   39  143:ldc1            #81  <String "USAGE_ALARM">
	//   40  145:areturn         

		case 3: // '\003'
			return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
	//   41  146:ldc1            #83  <String "USAGE_VOICE_COMMUNICATION_SIGNALLING">
	//   42  148:areturn         

		case 2: // '\002'
			return "USAGE_VOICE_COMMUNICATION";
	//   43  149:ldc1            #85  <String "USAGE_VOICE_COMMUNICATION">
	//   44  151:areturn         

		case 1: // '\001'
			return "USAGE_MEDIA";
	//   45  152:ldc1            #87  <String "USAGE_MEDIA">
	//   46  154:areturn         

		case 0: // '\0'
			return "USAGE_UNKNOWN";
	//   47  155:ldc1            #89  <String "USAGE_UNKNOWN">
	//   48  157:areturn         
		}
	}

	public boolean equals(Object obj)
	{
		boolean flag1 = obj instanceof AudioAttributesCompat;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class AudioAttributesCompat>
	//    2    4:istore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(!flag1)
	//*   5    7:iload_3         
	//*   6    8:ifne            13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		obj = ((Object) ((AudioAttributesCompat)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class AudioAttributesCompat>
	//   11   17:astore_1        
		a a1 = a;
	//   12   18:aload_0         
	//   13   19:getfield        #93  <Field a a>
	//   14   22:astore          4
		if(a1 == null)
	//*  15   24:aload           4
	//*  16   26:ifnonnull       40
		{
			if(((AudioAttributesCompat) (obj)).a == null)
	//*  17   29:aload_1         
	//*  18   30:getfield        #93  <Field a a>
	//*  19   33:ifnonnull       38
				flag = true;
	//   20   36:iconst_1        
	//   21   37:istore_2        
			return flag;
	//   22   38:iload_2         
	//   23   39:ireturn         
		} else
		{
			return ((Object) (a1)).equals(((Object) (((AudioAttributesCompat) (obj)).a)));
	//   24   40:aload           4
	//   25   42:aload_1         
	//   26   43:getfield        #93  <Field a a>
	//   27   46:invokevirtual   #95  <Method boolean Object.equals(Object)>
	//   28   49:ireturn         
		}
	}

	public int hashCode()
	{
		return ((Object) (a)).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field a a>
	//    2    4:invokevirtual   #99  <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		return ((Object) (a)).toString();
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field a a>
	//    2    4:invokevirtual   #100 <Method String Object.toString()>
	//    3    7:areturn         
	}

	private static final SparseIntArray b;
	private static final int c[] = {
		0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
		10, 11, 12, 13, 14, 16
	};
	a a;

	static 
	{
		b = new SparseIntArray();
	//    0    0:new             #16  <Class SparseIntArray>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void SparseIntArray()>
	//    3    7:putstatic       #21  <Field SparseIntArray b>
		b.put(5, 1);
	//    4   10:getstatic       #21  <Field SparseIntArray b>
	//    5   13:iconst_5        
	//    6   14:iconst_1        
	//    7   15:invokevirtual   #25  <Method void SparseIntArray.put(int, int)>
		b.put(6, 2);
	//    8   18:getstatic       #21  <Field SparseIntArray b>
	//    9   21:bipush          6
	//   10   23:iconst_2        
	//   11   24:invokevirtual   #25  <Method void SparseIntArray.put(int, int)>
		b.put(7, 2);
	//   12   27:getstatic       #21  <Field SparseIntArray b>
	//   13   30:bipush          7
	//   14   32:iconst_2        
	//   15   33:invokevirtual   #25  <Method void SparseIntArray.put(int, int)>
		b.put(8, 1);
	//   16   36:getstatic       #21  <Field SparseIntArray b>
	//   17   39:bipush          8
	//   18   41:iconst_1        
	//   19   42:invokevirtual   #25  <Method void SparseIntArray.put(int, int)>
		b.put(9, 1);
	//   20   45:getstatic       #21  <Field SparseIntArray b>
	//   21   48:bipush          9
	//   22   50:iconst_1        
	//   23   51:invokevirtual   #25  <Method void SparseIntArray.put(int, int)>
		b.put(10, 1);
	//   24   54:getstatic       #21  <Field SparseIntArray b>
	//   25   57:bipush          10
	//   26   59:iconst_1        
	//   27   60:invokevirtual   #25  <Method void SparseIntArray.put(int, int)>
	//   28   63:bipush          16
	//   29   65:newarray        int[]
	//   30   67:dup             
	//   31   68:iconst_0        
	//   32   69:iconst_0        
	//   33   70:iastore         
	//   34   71:dup             
	//   35   72:iconst_1        
	//   36   73:iconst_1        
	//   37   74:iastore         
	//   38   75:dup             
	//   39   76:iconst_2        
	//   40   77:iconst_2        
	//   41   78:iastore         
	//   42   79:dup             
	//   43   80:iconst_3        
	//   44   81:iconst_3        
	//   45   82:iastore         
	//   46   83:dup             
	//   47   84:iconst_4        
	//   48   85:iconst_4        
	//   49   86:iastore         
	//   50   87:dup             
	//   51   88:iconst_5        
	//   52   89:iconst_5        
	//   53   90:iastore         
	//   54   91:dup             
	//   55   92:bipush          6
	//   56   94:bipush          6
	//   57   96:iastore         
	//   58   97:dup             
	//   59   98:bipush          7
	//   60  100:bipush          7
	//   61  102:iastore         
	//   62  103:dup             
	//   63  104:bipush          8
	//   64  106:bipush          8
	//   65  108:iastore         
	//   66  109:dup             
	//   67  110:bipush          9
	//   68  112:bipush          9
	//   69  114:iastore         
	//   70  115:dup             
	//   71  116:bipush          10
	//   72  118:bipush          10
	//   73  120:iastore         
	//   74  121:dup             
	//   75  122:bipush          11
	//   76  124:bipush          11
	//   77  126:iastore         
	//   78  127:dup             
	//   79  128:bipush          12
	//   80  130:bipush          12
	//   81  132:iastore         
	//   82  133:dup             
	//   83  134:bipush          13
	//   84  136:bipush          13
	//   85  138:iastore         
	//   86  139:dup             
	//   87  140:bipush          14
	//   88  142:bipush          14
	//   89  144:iastore         
	//   90  145:dup             
	//   91  146:bipush          15
	//   92  148:bipush          16
	//   93  150:iastore         
	//   94  151:putstatic       #27  <Field int[] c>
	//*  95  154:return          
	}
}

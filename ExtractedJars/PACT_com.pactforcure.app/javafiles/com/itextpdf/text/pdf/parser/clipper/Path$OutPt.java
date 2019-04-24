// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;


// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			Path

static class Path$OutPt
{

	public static  getLowerMostRec( ,  1)
	{
		if(.bottomPt == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field Path$OutPt Path$OutRec.bottomPt>
	//*   2    4:ifnonnull       18
			.bottomPt = .pts.getBottomPt();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field Path$OutPt Path$OutRec.pts>
	//    6   12:invokevirtual   #33  <Method Path$OutPt getBottomPt()>
	//    7   15:putfield        #26  <Field Path$OutPt Path$OutRec.bottomPt>
		if(1.bottomPt == null)
	//*   8   18:aload_1         
	//*   9   19:getfield        #26  <Field Path$OutPt Path$OutRec.bottomPt>
	//*  10   22:ifnonnull       36
			1.bottomPt = 1.pts.getBottomPt();
	//   11   25:aload_1         
	//   12   26:aload_1         
	//   13   27:getfield        #29  <Field Path$OutPt Path$OutRec.pts>
	//   14   30:invokevirtual   #33  <Method Path$OutPt getBottomPt()>
	//   15   33:putfield        #26  <Field Path$OutPt Path$OutRec.bottomPt>
		Path$OutPt path$outpt = .bottomPt;
	//   16   36:aload_0         
	//   17   37:getfield        #26  <Field Path$OutPt Path$OutRec.bottomPt>
	//   18   40:astore_2        
		Path$OutPt path$outpt1 = 1.bottomPt;
	//   19   41:aload_1         
	//   20   42:getfield        #26  <Field Path$OutPt Path$OutRec.bottomPt>
	//   21   45:astore_3        
		if(path$outpt.getPt().getY() <= path$outpt1.getPt().getY())
	//*  22   46:aload_2         
	//*  23   47:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//*  24   50:invokevirtual   #43  <Method long Point$LongPoint.getY()>
	//*  25   53:aload_3         
	//*  26   54:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//*  27   57:invokevirtual   #43  <Method long Point$LongPoint.getY()>
	//*  28   60:lcmp            
	//*  29   61:ifle            66
	//*  30   64:aload_0         
	//*  31   65:areturn         
		{
			if(path$outpt.getPt().getY() < path$outpt1.getPt().getY())
	//*  32   66:aload_2         
	//*  33   67:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//*  34   70:invokevirtual   #43  <Method long Point$LongPoint.getY()>
	//*  35   73:aload_3         
	//*  36   74:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//*  37   77:invokevirtual   #43  <Method long Point$LongPoint.getY()>
	//*  38   80:lcmp            
	//*  39   81:ifge            86
				return 1;
	//   40   84:aload_1         
	//   41   85:areturn         
			if(path$outpt.getPt().getX() >= path$outpt1.getPt().getX())
	//*  42   86:aload_2         
	//*  43   87:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//*  44   90:invokevirtual   #46  <Method long Point$LongPoint.getX()>
	//*  45   93:aload_3         
	//*  46   94:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//*  47   97:invokevirtual   #46  <Method long Point$LongPoint.getX()>
	//*  48  100:lcmp            
	//*  49  101:iflt            64
			{
				if(path$outpt.getPt().getX() > path$outpt1.getPt().getX())
	//*  50  104:aload_2         
	//*  51  105:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//*  52  108:invokevirtual   #46  <Method long Point$LongPoint.getX()>
	//*  53  111:aload_3         
	//*  54  112:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//*  55  115:invokevirtual   #46  <Method long Point$LongPoint.getX()>
	//*  56  118:lcmp            
	//*  57  119:ifle            124
					return 1;
	//   58  122:aload_1         
	//   59  123:areturn         
				if(path$outpt.next == path$outpt)
	//*  60  124:aload_2         
	//*  61  125:getfield        #48  <Field Path$OutPt next>
	//*  62  128:aload_2         
	//*  63  129:if_acmpne       134
					return 1;
	//   64  132:aload_1         
	//   65  133:areturn         
				if(path$outpt1.next != path$outpt1 && !isFirstBottomPt(path$outpt, path$outpt1))
	//*  66  134:aload_3         
	//*  67  135:getfield        #48  <Field Path$OutPt next>
	//*  68  138:aload_3         
	//*  69  139:if_acmpeq       64
	//*  70  142:aload_2         
	//*  71  143:aload_3         
	//*  72  144:invokestatic    #52  <Method boolean isFirstBottomPt(Path$OutPt, Path$OutPt)>
	//*  73  147:ifne            64
					return 1;
	//   74  150:aload_1         
	//   75  151:areturn         
			}
		}
		return ;
	}

	private static boolean isFirstBottomPt(Path$OutPt path$outpt, Path$OutPt path$outpt1)
	{
		Path$OutPt path$outpt2;
		for(path$outpt2 = path$outpt.prev; path$outpt2.getPt().equals(((Object) (path$outpt.getPt()))) && !((Object) (path$outpt2)).equals(((Object) (path$outpt))); path$outpt2 = path$outpt2.prev);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Path$OutPt prev>
	//    2    4:astore          10
	//    3    6:aload           10
	//    4    8:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//    7   15:invokevirtual   #58  <Method boolean Point$LongPoint.equals(Object)>
	//    8   18:ifeq            40
	//    9   21:aload           10
	//   10   23:aload_0         
	//   11   24:invokevirtual   #59  <Method boolean Object.equals(Object)>
	//   12   27:ifne            40
	//   13   30:aload           10
	//   14   32:getfield        #54  <Field Path$OutPt prev>
	//   15   35:astore          10
	//*  16   37:goto            6
		double d = Math.abs(oint.getDeltaX(path$outpt.getPt(), path$outpt2.getPt()));
	//   17   40:aload_0         
	//   18   41:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//   19   44:aload           10
	//   20   46:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//   21   49:invokestatic    #63  <Method double Point$LongPoint.getDeltaX(Point$LongPoint, Point$LongPoint)>
	//   22   52:invokestatic    #69  <Method double Math.abs(double)>
	//   23   55:dstore_2        
		for(path$outpt2 = path$outpt.next; path$outpt2.getPt().equals(((Object) (path$outpt.getPt()))) && !((Object) (path$outpt2)).equals(((Object) (path$outpt))); path$outpt2 = path$outpt2.next);
	//   24   56:aload_0         
	//   25   57:getfield        #48  <Field Path$OutPt next>
	//   26   60:astore          10
	//   27   62:aload           10
	//   28   64:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//   29   67:aload_0         
	//   30   68:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//   31   71:invokevirtual   #58  <Method boolean Point$LongPoint.equals(Object)>
	//   32   74:ifeq            96
	//   33   77:aload           10
	//   34   79:aload_0         
	//   35   80:invokevirtual   #59  <Method boolean Object.equals(Object)>
	//   36   83:ifne            96
	//   37   86:aload           10
	//   38   88:getfield        #48  <Field Path$OutPt next>
	//   39   91:astore          10
	//*  40   93:goto            62
		double d1 = Math.abs(oint.getDeltaX(path$outpt.getPt(), path$outpt2.getPt()));
	//   41   96:aload_0         
	//   42   97:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//   43  100:aload           10
	//   44  102:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//   45  105:invokestatic    #63  <Method double Point$LongPoint.getDeltaX(Point$LongPoint, Point$LongPoint)>
	//   46  108:invokestatic    #69  <Method double Math.abs(double)>
	//   47  111:dstore          4
		for(path$outpt = path$outpt1.prev; path$outpt.getPt().equals(((Object) (path$outpt1.getPt()))) && !((Object) (path$outpt)).equals(((Object) (path$outpt1))); path$outpt = path$outpt.prev);
	//   48  113:aload_1         
	//   49  114:getfield        #54  <Field Path$OutPt prev>
	//   50  117:astore_0        
	//   51  118:aload_0         
	//   52  119:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//   53  122:aload_1         
	//   54  123:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//   55  126:invokevirtual   #58  <Method boolean Point$LongPoint.equals(Object)>
	//   56  129:ifeq            148
	//   57  132:aload_0         
	//   58  133:aload_1         
	//   59  134:invokevirtual   #59  <Method boolean Object.equals(Object)>
	//   60  137:ifne            148
	//   61  140:aload_0         
	//   62  141:getfield        #54  <Field Path$OutPt prev>
	//   63  144:astore_0        
	//*  64  145:goto            118
		double d2 = Math.abs(oint.getDeltaX(path$outpt1.getPt(), path$outpt.getPt()));
	//   65  148:aload_1         
	//   66  149:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//   67  152:aload_0         
	//   68  153:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//   69  156:invokestatic    #63  <Method double Point$LongPoint.getDeltaX(Point$LongPoint, Point$LongPoint)>
	//   70  159:invokestatic    #69  <Method double Math.abs(double)>
	//   71  162:dstore          6
		for(path$outpt = path$outpt1.next; path$outpt.getPt().equals(((Object) (path$outpt1.getPt()))) && ((Object) (path$outpt)).equals(((Object) (path$outpt1))); path$outpt = path$outpt.next);
	//   72  164:aload_1         
	//   73  165:getfield        #48  <Field Path$OutPt next>
	//   74  168:astore_0        
	//   75  169:aload_0         
	//   76  170:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//   77  173:aload_1         
	//   78  174:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//   79  177:invokevirtual   #58  <Method boolean Point$LongPoint.equals(Object)>
	//   80  180:ifeq            199
	//   81  183:aload_0         
	//   82  184:aload_1         
	//   83  185:invokevirtual   #59  <Method boolean Object.equals(Object)>
	//   84  188:ifeq            199
	//   85  191:aload_0         
	//   86  192:getfield        #48  <Field Path$OutPt next>
	//   87  195:astore_0        
	//*  88  196:goto            169
		double d3 = Math.abs(oint.getDeltaX(path$outpt1.getPt(), path$outpt.getPt()));
	//   89  199:aload_1         
	//   90  200:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//   91  203:aload_0         
	//   92  204:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//   93  207:invokestatic    #63  <Method double Point$LongPoint.getDeltaX(Point$LongPoint, Point$LongPoint)>
	//   94  210:invokestatic    #69  <Method double Math.abs(double)>
	//   95  213:dstore          8
		return d >= d2 && d >= d3 || d1 >= d2 && d1 >= d3;
	//   96  215:dload_2         
	//   97  216:dload           6
	//   98  218:dcmpl           
	//   99  219:iflt            229
	//  100  222:dload_2         
	//  101  223:dload           8
	//  102  225:dcmpl           
	//  103  226:ifge            245
	//  104  229:dload           4
	//  105  231:dload           6
	//  106  233:dcmpl           
	//  107  234:iflt            247
	//  108  237:dload           4
	//  109  239:dload           8
	//  110  241:dcmpl           
	//  111  242:iflt            247
	//  112  245:iconst_1        
	//  113  246:ireturn         
	//  114  247:iconst_0        
	//  115  248:ireturn         
	}

	public Path$OutPt duplicate(boolean flag)
	{
		Path$OutPt path$outpt = new Path$OutPt();
	//    0    0:new             #2   <Class Path$OutPt>
	//    1    3:dup             
	//    2    4:invokespecial   #72  <Method void Path$OutPt()>
	//    3    7:astore_2        
		path$outpt.setPt(new oint(getPt()));
	//    4    8:aload_2         
	//    5    9:new             #39  <Class Point$LongPoint>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//    9   17:invokespecial   #75  <Method void Point$LongPoint(Point$LongPoint)>
	//   10   20:invokevirtual   #78  <Method void setPt(Point$LongPoint)>
		path$outpt.idx = idx;
	//   11   23:aload_2         
	//   12   24:aload_0         
	//   13   25:getfield        #80  <Field int idx>
	//   14   28:putfield        #80  <Field int idx>
		if(flag)
	//*  15   31:iload_1         
	//*  16   32:ifeq            63
		{
			path$outpt.next = next;
	//   17   35:aload_2         
	//   18   36:aload_0         
	//   19   37:getfield        #48  <Field Path$OutPt next>
	//   20   40:putfield        #48  <Field Path$OutPt next>
			path$outpt.prev = this;
	//   21   43:aload_2         
	//   22   44:aload_0         
	//   23   45:putfield        #54  <Field Path$OutPt prev>
			next.prev = path$outpt;
	//   24   48:aload_0         
	//   25   49:getfield        #48  <Field Path$OutPt next>
	//   26   52:aload_2         
	//   27   53:putfield        #54  <Field Path$OutPt prev>
			next = path$outpt;
	//   28   56:aload_0         
	//   29   57:aload_2         
	//   30   58:putfield        #48  <Field Path$OutPt next>
			return path$outpt;
	//   31   61:aload_2         
	//   32   62:areturn         
		} else
		{
			path$outpt.prev = prev;
	//   33   63:aload_2         
	//   34   64:aload_0         
	//   35   65:getfield        #54  <Field Path$OutPt prev>
	//   36   68:putfield        #54  <Field Path$OutPt prev>
			path$outpt.next = this;
	//   37   71:aload_2         
	//   38   72:aload_0         
	//   39   73:putfield        #48  <Field Path$OutPt next>
			prev.next = path$outpt;
	//   40   76:aload_0         
	//   41   77:getfield        #54  <Field Path$OutPt prev>
	//   42   80:aload_2         
	//   43   81:putfield        #48  <Field Path$OutPt next>
			prev = path$outpt;
	//   44   84:aload_0         
	//   45   85:aload_2         
	//   46   86:putfield        #54  <Field Path$OutPt prev>
			return path$outpt;
	//   47   89:aload_2         
	//   48   90:areturn         
		}
	}

	Path$OutPt getBottomPt()
	{
		Path$OutPt path$outpt3;
label0:
		{
			Path$OutPt path$outpt4 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
			Path$OutPt path$outpt = next;
	//    2    3:aload_0         
	//    3    4:getfield        #48  <Field Path$OutPt next>
	//    4    7:astore_1        
			Path$OutPt path$outpt1 = this;
	//    5    8:aload_0         
	//    6    9:astore_2        
			while(path$outpt != path$outpt1) 
	//*   7   10:aload_1         
	//*   8   11:aload_2         
	//*   9   12:if_acmpeq       162
			{
				Path$OutPt path$outpt2;
				Path$OutPt path$outpt5;
				if(path$outpt.getPt().getY() > path$outpt1.getPt().getY())
	//*  10   15:aload_1         
	//*  11   16:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//*  12   19:invokevirtual   #43  <Method long Point$LongPoint.getY()>
	//*  13   22:aload_2         
	//*  14   23:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//*  15   26:invokevirtual   #43  <Method long Point$LongPoint.getY()>
	//*  16   29:lcmp            
	//*  17   30:ifle            52
				{
					path$outpt5 = path$outpt;
	//   18   33:aload_1         
	//   19   34:astore          5
					path$outpt2 = null;
	//   20   36:aconst_null     
	//   21   37:astore_3        
				} else
	//*  22   38:aload_1         
	//*  23   39:getfield        #48  <Field Path$OutPt next>
	//*  24   42:astore_1        
	//*  25   43:aload_3         
	//*  26   44:astore          4
	//*  27   46:aload           5
	//*  28   48:astore_2        
	//*  29   49:goto            10
				{
					path$outpt2 = path$outpt4;
	//   30   52:aload           4
	//   31   54:astore_3        
					path$outpt5 = path$outpt1;
	//   32   55:aload_2         
	//   33   56:astore          5
					if(path$outpt.getPt().getY() == path$outpt1.getPt().getY())
	//*  34   58:aload_1         
	//*  35   59:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//*  36   62:invokevirtual   #43  <Method long Point$LongPoint.getY()>
	//*  37   65:aload_2         
	//*  38   66:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//*  39   69:invokevirtual   #43  <Method long Point$LongPoint.getY()>
	//*  40   72:lcmp            
	//*  41   73:ifne            38
					{
						path$outpt2 = path$outpt4;
	//   42   76:aload           4
	//   43   78:astore_3        
						path$outpt5 = path$outpt1;
	//   44   79:aload_2         
	//   45   80:astore          5
						if(path$outpt.getPt().getX() <= path$outpt1.getPt().getX())
	//*  46   82:aload_1         
	//*  47   83:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//*  48   86:invokevirtual   #46  <Method long Point$LongPoint.getX()>
	//*  49   89:aload_2         
	//*  50   90:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//*  51   93:invokevirtual   #46  <Method long Point$LongPoint.getX()>
	//*  52   96:lcmp            
	//*  53   97:ifgt            38
							if(path$outpt.getPt().getX() < path$outpt1.getPt().getX())
	//*  54  100:aload_1         
	//*  55  101:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//*  56  104:invokevirtual   #46  <Method long Point$LongPoint.getX()>
	//*  57  107:aload_2         
	//*  58  108:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//*  59  111:invokevirtual   #46  <Method long Point$LongPoint.getX()>
	//*  60  114:lcmp            
	//*  61  115:ifge            126
							{
								path$outpt2 = null;
	//   62  118:aconst_null     
	//   63  119:astore_3        
								path$outpt5 = path$outpt;
	//   64  120:aload_1         
	//   65  121:astore          5
							} else
	//*  66  123:goto            38
							{
								path$outpt2 = path$outpt4;
	//   67  126:aload           4
	//   68  128:astore_3        
								path$outpt5 = path$outpt1;
	//   69  129:aload_2         
	//   70  130:astore          5
								if(path$outpt.next != path$outpt1)
	//*  71  132:aload_1         
	//*  72  133:getfield        #48  <Field Path$OutPt next>
	//*  73  136:aload_2         
	//*  74  137:if_acmpeq       38
								{
									path$outpt2 = path$outpt4;
	//   75  140:aload           4
	//   76  142:astore_3        
									path$outpt5 = path$outpt1;
	//   77  143:aload_2         
	//   78  144:astore          5
									if(path$outpt.prev != path$outpt1)
	//*  79  146:aload_1         
	//*  80  147:getfield        #54  <Field Path$OutPt prev>
	//*  81  150:aload_2         
	//*  82  151:if_acmpeq       38
									{
										path$outpt2 = path$outpt;
	//   83  154:aload_1         
	//   84  155:astore_3        
										path$outpt5 = path$outpt1;
	//   85  156:aload_2         
	//   86  157:astore          5
									}
								}
							}
					}
				}
				path$outpt = path$outpt.next;
				path$outpt4 = path$outpt2;
				path$outpt1 = path$outpt5;
			}
	//*  87  159:goto            38
			path$outpt3 = path$outpt1;
	//   88  162:aload_2         
	//   89  163:astore_3        
			if(path$outpt4 == null)
				break label0;
	//   90  164:aload           4
	//   91  166:ifnull          228
			do
			{
				path$outpt3 = path$outpt1;
	//   92  169:aload_2         
	//   93  170:astore_3        
				if(path$outpt4 == path$outpt)
					break label0;
	//   94  171:aload           4
	//   95  173:aload_1         
	//   96  174:if_acmpeq       228
				Path$OutPt path$outpt6 = path$outpt1;
	//   97  177:aload_2         
	//   98  178:astore          5
				if(!isFirstBottomPt(path$outpt, path$outpt4))
	//*  99  180:aload_1         
	//* 100  181:aload           4
	//* 101  183:invokestatic    #52  <Method boolean isFirstBottomPt(Path$OutPt, Path$OutPt)>
	//* 102  186:ifne            193
					path$outpt6 = path$outpt4;
	//  103  189:aload           4
	//  104  191:astore          5
				path$outpt3 = path$outpt4.next;
	//  105  193:aload           4
	//  106  195:getfield        #48  <Field Path$OutPt next>
	//  107  198:astore_3        
				do
				{
					path$outpt4 = path$outpt3;
	//  108  199:aload_3         
	//  109  200:astore          4
					path$outpt1 = path$outpt6;
	//  110  202:aload           5
	//  111  204:astore_2        
					if(path$outpt3.getPt().equals(((Object) (path$outpt6.getPt()))))
						break;
	//  112  205:aload_3         
	//  113  206:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//  114  209:aload           5
	//  115  211:invokevirtual   #37  <Method Point$LongPoint getPt()>
	//  116  214:invokevirtual   #58  <Method boolean Point$LongPoint.equals(Object)>
	//  117  217:ifne            169
					path$outpt3 = path$outpt3.next;
	//  118  220:aload_3         
	//  119  221:getfield        #48  <Field Path$OutPt next>
	//  120  224:astore_3        
				} while(true);
	//  121  225:goto            199
			} while(true);
		}
		return path$outpt3;
	//  122  228:aload_3         
	//  123  229:areturn         
	}

	public int getPointCount()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		Path$OutPt path$outpt = this;
	//    2    2:aload_0         
	//    3    3:astore_3        
		int j;
		Path$OutPt path$outpt1;
		do
		{
			j = i + 1;
	//    4    4:iload_1         
	//    5    5:iconst_1        
	//    6    6:iadd            
	//    7    7:istore_2        
			path$outpt1 = path$outpt.next;
	//    8    8:aload_3         
	//    9    9:getfield        #48  <Field Path$OutPt next>
	//   10   12:astore          4
			if(path$outpt1 == this)
				break;
	//   11   14:aload           4
	//   12   16:aload_0         
	//   13   17:if_acmpeq       30
			path$outpt = path$outpt1;
	//   14   20:aload           4
	//   15   22:astore_3        
			i = j;
	//   16   23:iload_2         
	//   17   24:istore_1        
		} while(path$outpt1 != null);
	//   18   25:aload           4
	//   19   27:ifnonnull       4
		return j;
	//   20   30:iload_2         
	//   21   31:ireturn         
	}

	public oint getPt()
	{
		return pt;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Point$LongPoint pt>
	//    2    4:areturn         
	}

	public void reversePolyPtLinks()
	{
		Path$OutPt path$outpt = this;
	//    0    0:aload_0         
	//    1    1:astore_1        
		Path$OutPt path$outpt1;
		do
		{
			path$outpt1 = path$outpt.next;
	//    2    2:aload_1         
	//    3    3:getfield        #48  <Field Path$OutPt next>
	//    4    6:astore_2        
			path$outpt.next = path$outpt.prev;
	//    5    7:aload_1         
	//    6    8:aload_1         
	//    7    9:getfield        #54  <Field Path$OutPt prev>
	//    8   12:putfield        #48  <Field Path$OutPt next>
			path$outpt.prev = path$outpt1;
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:putfield        #54  <Field Path$OutPt prev>
			path$outpt = path$outpt1;
	//   12   20:aload_2         
	//   13   21:astore_1        
		} while(path$outpt1 != this);
	//   14   22:aload_2         
	//   15   23:aload_0         
	//   16   24:if_acmpne       2
	//   17   27:return          
	}

	public void setPt(oint oint)
	{
		pt = oint;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field Point$LongPoint pt>
	//    3    5:return          
	}

	int idx;
	Path$OutPt next;
	Path$OutPt prev;
	protected oint pt;

	Path$OutPt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}
}

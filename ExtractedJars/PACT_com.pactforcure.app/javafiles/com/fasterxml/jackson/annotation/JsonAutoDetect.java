// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

public interface JsonAutoDetect
	extends Annotation
{
	public static final class Visibility extends Enum
	{

		public static Visibility valueOf(String s)
		{
			return (Visibility)Enum.valueOf(com/fasterxml/jackson/annotation/JsonAutoDetect$Visibility, s);
		//    0    0:ldc1            #2   <Class JsonAutoDetect$Visibility>
		//    1    2:aload_0         
		//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class JsonAutoDetect$Visibility>
		//    4    9:areturn         
		}

		public static Visibility[] values()
		{
			return (Visibility[])((Visibility []) ($VALUES)).clone();
		//    0    0:getstatic       #43  <Field JsonAutoDetect$Visibility[] $VALUES>
		//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonAutoDetect$Visibility_3B_.clone()>
		//    2    6:checkcast       #54  <Class JsonAutoDetect$Visibility[]>
		//    3    9:areturn         
		}

		public boolean isVisible(Member member)
		{
			boolean flag;
			boolean flag1;
			flag1 = true;
		//    0    0:iconst_1        
		//    1    1:istore_3        
			flag = flag1;
		//    2    2:iload_3         
		//    3    3:istore_2        
			static class _cls1
			{

				static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[];

				static 
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility = new int[Visibility.values().length];
				//    0    0:invokestatic    #18  <Method JsonAutoDetect$Visibility[] JsonAutoDetect$Visibility.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[Visibility.ANY.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
				//    5   12:getstatic       #24  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.ANY>
				//    6   15:invokevirtual   #28  <Method int JsonAutoDetect$Visibility.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
				//*  10   23:getstatic       #31  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.NONE>
				//*  11   26:invokevirtual   #28  <Method int JsonAutoDetect$Visibility.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
				//*  15   34:getstatic       #34  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.NON_PRIVATE>
				//*  16   37:invokevirtual   #28  <Method int JsonAutoDetect$Visibility.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
				//*  20   45:getstatic       #37  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.PROTECTED_AND_PUBLIC>
				//*  21   48:invokevirtual   #28  <Method int JsonAutoDetect$Visibility.ordinal()>
				//*  22   51:iconst_4        
				//*  23   52:iastore         
				//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
				//*  25   56:getstatic       #40  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.PUBLIC_ONLY>
				//*  26   59:invokevirtual   #28  <Method int JsonAutoDetect$Visibility.ordinal()>
				//*  27   62:iconst_5        
				//*  28   63:iastore         
				//*  29   64:return          
				//*  30   65:astore_0        
				//*  31   66:return          
				//*  32   67:astore_0        
				//*  33   68:goto            53
				//*  34   71:astore_0        
				//*  35   72:goto            42
				//*  36   75:astore_0        
				//*  37   76:goto            31
					catch(NoSuchFieldError nosuchfielderror4) { }
				//   38   79:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[Visibility.NONE.ordinal()] = 2;
					}
					catch(NoSuchFieldError nosuchfielderror3) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[Visibility.NON_PRIVATE.ordinal()] = 3;
					}
					catch(NoSuchFieldError nosuchfielderror2) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[Visibility.PROTECTED_AND_PUBLIC.ordinal()] = 4;
					}
					catch(NoSuchFieldError nosuchfielderror1) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[Visibility.PUBLIC_ONLY.ordinal()] = 5;
					}
					catch(NoSuchFieldError nosuchfielderror)
					{
						return;
					}
				//*  39   80:goto            20
				}
			}

			_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility[ordinal()];
		//    4    4:getstatic       #66  <Field int[] JsonAutoDetect$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
		//    5    7:aload_0         
		//    6    8:invokevirtual   #70  <Method int ordinal()>
		//    7   11:iaload          
			JVM INSTR tableswitch 1 5: default 48
		//		               1 50
		//		               2 52
		//		               3 54
		//		               4 70
		//		               5 84;
		//    8   12:tableswitch     1 5: default 48
		//		               1 50
		//		               2 52
		//		               3 54
		//		               4 70
		//		               5 84
			   goto _L1 _L2 _L3 _L4 _L5 _L6
_L2:
			break MISSING_BLOCK_LABEL_50;
_L1:
			flag = false;
		//    9   48:iconst_0        
		//   10   49:istore_2        
_L8:
			return flag;
		//   11   50:iload_2         
		//   12   51:ireturn         
_L3:
			return false;
		//   13   52:iconst_0        
		//   14   53:ireturn         
_L4:
			flag = flag1;
		//   15   54:iload_3         
		//   16   55:istore_2        
			if(!Modifier.isPrivate(member.getModifiers())) goto _L8; else goto _L7
		//   17   56:aload_1         
		//   18   57:invokeinterface #75  <Method int Member.getModifiers()>
		//   19   62:invokestatic    #81  <Method boolean Modifier.isPrivate(int)>
		//   20   65:ifeq            50
_L7:
			return false;
		//   21   68:iconst_0        
		//   22   69:ireturn         
_L5:
			flag = flag1;
		//   23   70:iload_3         
		//   24   71:istore_2        
			if(Modifier.isProtected(member.getModifiers())) goto _L8; else goto _L6
		//   25   72:aload_1         
		//   26   73:invokeinterface #75  <Method int Member.getModifiers()>
		//   27   78:invokestatic    #84  <Method boolean Modifier.isProtected(int)>
		//   28   81:ifne            50
_L6:
			return Modifier.isPublic(member.getModifiers());
		//   29   84:aload_1         
		//   30   85:invokeinterface #75  <Method int Member.getModifiers()>
		//   31   90:invokestatic    #87  <Method boolean Modifier.isPublic(int)>
		//   32   93:ireturn         
		}

		private static final Visibility $VALUES[];
		public static final Visibility ANY;
		public static final Visibility DEFAULT;
		public static final Visibility NONE;
		public static final Visibility NON_PRIVATE;
		public static final Visibility PROTECTED_AND_PUBLIC;
		public static final Visibility PUBLIC_ONLY;

		static 
		{
			ANY = new Visibility("ANY", 0);
		//    0    0:new             #2   <Class JsonAutoDetect$Visibility>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "ANY">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void JsonAutoDetect$Visibility(String, int)>
		//    5   10:putstatic       #26  <Field JsonAutoDetect$Visibility ANY>
			NON_PRIVATE = new Visibility("NON_PRIVATE", 1);
		//    6   13:new             #2   <Class JsonAutoDetect$Visibility>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "NON_PRIVATE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #24  <Method void JsonAutoDetect$Visibility(String, int)>
		//   11   23:putstatic       #29  <Field JsonAutoDetect$Visibility NON_PRIVATE>
			PROTECTED_AND_PUBLIC = new Visibility("PROTECTED_AND_PUBLIC", 2);
		//   12   26:new             #2   <Class JsonAutoDetect$Visibility>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "PROTECTED_AND_PUBLIC">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #24  <Method void JsonAutoDetect$Visibility(String, int)>
		//   17   36:putstatic       #32  <Field JsonAutoDetect$Visibility PROTECTED_AND_PUBLIC>
			PUBLIC_ONLY = new Visibility("PUBLIC_ONLY", 3);
		//   18   39:new             #2   <Class JsonAutoDetect$Visibility>
		//   19   42:dup             
		//   20   43:ldc1            #33  <String "PUBLIC_ONLY">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #24  <Method void JsonAutoDetect$Visibility(String, int)>
		//   23   49:putstatic       #35  <Field JsonAutoDetect$Visibility PUBLIC_ONLY>
			NONE = new Visibility("NONE", 4);
		//   24   52:new             #2   <Class JsonAutoDetect$Visibility>
		//   25   55:dup             
		//   26   56:ldc1            #36  <String "NONE">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #24  <Method void JsonAutoDetect$Visibility(String, int)>
		//   29   62:putstatic       #38  <Field JsonAutoDetect$Visibility NONE>
			DEFAULT = new Visibility("DEFAULT", 5);
		//   30   65:new             #2   <Class JsonAutoDetect$Visibility>
		//   31   68:dup             
		//   32   69:ldc1            #39  <String "DEFAULT">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #24  <Method void JsonAutoDetect$Visibility(String, int)>
		//   35   75:putstatic       #41  <Field JsonAutoDetect$Visibility DEFAULT>
			$VALUES = (new Visibility[] {
				ANY, NON_PRIVATE, PROTECTED_AND_PUBLIC, PUBLIC_ONLY, NONE, DEFAULT
			});
		//   36   78:bipush          6
		//   37   80:anewarray       Visibility[]
		//   38   83:dup             
		//   39   84:iconst_0        
		//   40   85:getstatic       #26  <Field JsonAutoDetect$Visibility ANY>
		//   41   88:aastore         
		//   42   89:dup             
		//   43   90:iconst_1        
		//   44   91:getstatic       #29  <Field JsonAutoDetect$Visibility NON_PRIVATE>
		//   45   94:aastore         
		//   46   95:dup             
		//   47   96:iconst_2        
		//   48   97:getstatic       #32  <Field JsonAutoDetect$Visibility PROTECTED_AND_PUBLIC>
		//   49  100:aastore         
		//   50  101:dup             
		//   51  102:iconst_3        
		//   52  103:getstatic       #35  <Field JsonAutoDetect$Visibility PUBLIC_ONLY>
		//   53  106:aastore         
		//   54  107:dup             
		//   55  108:iconst_4        
		//   56  109:getstatic       #38  <Field JsonAutoDetect$Visibility NONE>
		//   57  112:aastore         
		//   58  113:dup             
		//   59  114:iconst_5        
		//   60  115:getstatic       #41  <Field JsonAutoDetect$Visibility DEFAULT>
		//   61  118:aastore         
		//   62  119:putstatic       #43  <Field JsonAutoDetect$Visibility[] $VALUES>
		//*  63  122:return          
		}

		private Visibility(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #45  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public abstract Visibility creatorVisibility();

	public abstract Visibility fieldVisibility();

	public abstract Visibility getterVisibility();

	public abstract Visibility isGetterVisibility();

	public abstract Visibility setterVisibility();
}

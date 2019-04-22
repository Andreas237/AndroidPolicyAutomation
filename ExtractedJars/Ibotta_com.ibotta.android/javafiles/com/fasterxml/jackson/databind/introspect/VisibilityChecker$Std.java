// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import java.io.Serializable;
import java.lang.reflect.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			VisibilityChecker, AnnotatedMember, AnnotatedField, AnnotatedMethod

public static class VisibilityChecker$Std
	implements VisibilityChecker, Serializable
{

	private com.fasterxml.jackson.annotation.ity _defaultOrOverride(com.fasterxml.jackson.annotation.ity ity, com.fasterxml.jackson.annotation.ity ity1)
	{
		if(ity1 == com.fasterxml.jackson.annotation.ity.DEFAULT)
	//*   0    0:aload_2         
	//*   1    1:getstatic       #44  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.DEFAULT>
	//*   2    4:if_acmpne       9
			return ity;
	//    3    7:aload_1         
	//    4    8:areturn         
		else
			return ity1;
	//    5    9:aload_2         
	//    6   10:areturn         
	}

	public static VisibilityChecker$Std defaultInstance()
	{
		return DEFAULT;
	//    0    0:getstatic       #38  <Field VisibilityChecker$Std DEFAULT>
	//    1    3:areturn         
	}

	protected VisibilityChecker$Std _with(com.fasterxml.jackson.annotation.ity ity, com.fasterxml.jackson.annotation.ity ity1, com.fasterxml.jackson.annotation.ity ity2, com.fasterxml.jackson.annotation.ity ity3, com.fasterxml.jackson.annotation.ity ity4)
	{
		if(ity == _getterMinLevel && ity1 == _isGetterMinLevel && ity2 == _setterMinLevel && ity3 == _creatorMinLevel && ity4 == _fieldMinLevel)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #46  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
	//*   3    5:if_acmpne       44
	//*   4    8:aload_2         
	//*   5    9:aload_0         
	//*   6   10:getfield        #48  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
	//*   7   13:if_acmpne       44
	//*   8   16:aload_3         
	//*   9   17:aload_0         
	//*  10   18:getfield        #50  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
	//*  11   21:if_acmpne       44
	//*  12   24:aload           4
	//*  13   26:aload_0         
	//*  14   27:getfield        #52  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
	//*  15   30:if_acmpne       44
	//*  16   33:aload           5
	//*  17   35:aload_0         
	//*  18   36:getfield        #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
	//*  19   39:if_acmpne       44
			return this;
	//   20   42:aload_0         
	//   21   43:areturn         
		else
			return new VisibilityChecker$Std(ity, ity1, ity2, ity3, ity4);
	//   22   44:new             #2   <Class VisibilityChecker$Std>
	//   23   47:dup             
	//   24   48:aload_1         
	//   25   49:aload_2         
	//   26   50:aload_3         
	//   27   51:aload           4
	//   28   53:aload           5
	//   29   55:invokespecial   #36  <Method void VisibilityChecker$Std(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   30   58:areturn         
	}

	public boolean isCreatorVisible(AnnotatedMember annotatedmember)
	{
		return isCreatorVisible(annotatedmember.getMember());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #68  <Method Member AnnotatedMember.getMember()>
	//    3    5:invokevirtual   #71  <Method boolean isCreatorVisible(Member)>
	//    4    8:ireturn         
	}

	public boolean isCreatorVisible(Member member)
	{
		return _creatorMinLevel.isVisible(member);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #74  <Method boolean com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.isVisible(Member)>
	//    4    8:ireturn         
	}

	public boolean isFieldVisible(AnnotatedField annotatedfield)
	{
		return isFieldVisible(annotatedfield.getAnnotated());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #82  <Method Field AnnotatedField.getAnnotated()>
	//    3    5:invokevirtual   #85  <Method boolean isFieldVisible(Field)>
	//    4    8:ireturn         
	}

	public boolean isFieldVisible(Field field)
	{
		return _fieldMinLevel.isVisible(((Member) (field)));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #74  <Method boolean com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.isVisible(Member)>
	//    4    8:ireturn         
	}

	public boolean isGetterVisible(AnnotatedMethod annotatedmethod)
	{
		return isGetterVisible(annotatedmethod.getAnnotated());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #92  <Method Method AnnotatedMethod.getAnnotated()>
	//    3    5:invokevirtual   #95  <Method boolean isGetterVisible(Method)>
	//    4    8:ireturn         
	}

	public boolean isGetterVisible(Method method)
	{
		return _getterMinLevel.isVisible(((Member) (method)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #74  <Method boolean com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.isVisible(Member)>
	//    4    8:ireturn         
	}

	public boolean isIsGetterVisible(AnnotatedMethod annotatedmethod)
	{
		return isIsGetterVisible(annotatedmethod.getAnnotated());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #92  <Method Method AnnotatedMethod.getAnnotated()>
	//    3    5:invokevirtual   #98  <Method boolean isIsGetterVisible(Method)>
	//    4    8:ireturn         
	}

	public boolean isIsGetterVisible(Method method)
	{
		return _isGetterMinLevel.isVisible(((Member) (method)));
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #74  <Method boolean com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.isVisible(Member)>
	//    4    8:ireturn         
	}

	public boolean isSetterVisible(AnnotatedMethod annotatedmethod)
	{
		return isSetterVisible(annotatedmethod.getAnnotated());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #92  <Method Method AnnotatedMethod.getAnnotated()>
	//    3    5:invokevirtual   #101 <Method boolean isSetterVisible(Method)>
	//    4    8:ireturn         
	}

	public boolean isSetterVisible(Method method)
	{
		return _setterMinLevel.isVisible(((Member) (method)));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #74  <Method boolean com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.isVisible(Member)>
	//    4    8:ireturn         
	}

	public String toString()
	{
		return String.format("[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]", new Object[] {
			_getterMinLevel, _isGetterMinLevel, _setterMinLevel, _creatorMinLevel, _fieldMinLevel
		});
	//    0    0:ldc1            #105 <String "[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]">
	//    1    2:iconst_5        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #46  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:aload_0         
	//   11   16:getfield        #48  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
	//   12   19:aastore         
	//   13   20:dup             
	//   14   21:iconst_2        
	//   15   22:aload_0         
	//   16   23:getfield        #50  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
	//   17   26:aastore         
	//   18   27:dup             
	//   19   28:iconst_3        
	//   20   29:aload_0         
	//   21   30:getfield        #52  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
	//   22   33:aastore         
	//   23   34:dup             
	//   24   35:iconst_4        
	//   25   36:aload_0         
	//   26   37:getfield        #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
	//   27   40:aastore         
	//   28   41:invokestatic    #111 <Method String String.format(String, Object[])>
	//   29   44:areturn         
	}

	public VisibilityChecker$Std with(com.fasterxml.jackson.annotation.ity ity)
	{
		if(ity == com.fasterxml.jackson.annotation.ity.DEFAULT)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #44  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.DEFAULT>
	//*   2    4:if_acmpne       11
			return DEFAULT;
	//    3    7:getstatic       #38  <Field VisibilityChecker$Std DEFAULT>
	//    4   10:areturn         
		else
			return new VisibilityChecker$Std(ity);
	//    5   11:new             #2   <Class VisibilityChecker$Std>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #115 <Method void VisibilityChecker$Std(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//    9   19:areturn         
	}

	public VisibilityChecker$Std with(JsonAutoDetect jsonautodetect)
	{
		if(jsonautodetect != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          79
			return _with(_defaultOrOverride(_getterMinLevel, jsonautodetect.getterVisibility()), _defaultOrOverride(_isGetterMinLevel, jsonautodetect.isGetterVisibility()), _defaultOrOverride(_setterMinLevel, jsonautodetect.setterVisibility()), _defaultOrOverride(_creatorMinLevel, jsonautodetect.creatorVisibility()), _defaultOrOverride(_fieldMinLevel, jsonautodetect.fieldVisibility()));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #46  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
	//    6   10:aload_1         
	//    7   11:invokeinterface #122 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility JsonAutoDetect.getterVisibility()>
	//    8   16:invokespecial   #124 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _defaultOrOverride(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #48  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
	//   12   24:aload_1         
	//   13   25:invokeinterface #127 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility JsonAutoDetect.isGetterVisibility()>
	//   14   30:invokespecial   #124 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _defaultOrOverride(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #50  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
	//   18   38:aload_1         
	//   19   39:invokeinterface #130 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility JsonAutoDetect.setterVisibility()>
	//   20   44:invokespecial   #124 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _defaultOrOverride(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   21   47:aload_0         
	//   22   48:aload_0         
	//   23   49:getfield        #52  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
	//   24   52:aload_1         
	//   25   53:invokeinterface #133 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility JsonAutoDetect.creatorVisibility()>
	//   26   58:invokespecial   #124 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _defaultOrOverride(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   27   61:aload_0         
	//   28   62:aload_0         
	//   29   63:getfield        #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
	//   30   66:aload_1         
	//   31   67:invokeinterface #136 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility JsonAutoDetect.fieldVisibility()>
	//   32   72:invokespecial   #124 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _defaultOrOverride(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   33   75:invokevirtual   #138 <Method VisibilityChecker$Std _with(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   34   78:areturn         
		else
			return this;
	//   35   79:aload_0         
	//   36   80:areturn         
	}

	public volatile VisibilityChecker with(com.fasterxml.jackson.annotation.ity ity)
	{
		return ((VisibilityChecker) (with(ity)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #141 <Method VisibilityChecker$Std with(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//    3    5:areturn         
	}

	public volatile VisibilityChecker with(JsonAutoDetect jsonautodetect)
	{
		return ((VisibilityChecker) (with(jsonautodetect)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #144 <Method VisibilityChecker$Std with(JsonAutoDetect)>
	//    3    5:areturn         
	}

	public VisibilityChecker$Std withCreatorVisibility(com.fasterxml.jackson.annotation.ity ity)
	{
		com.fasterxml.jackson.annotation.ity ity1 = ity;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(ity == com.fasterxml.jackson.annotation.ity.DEFAULT)
	//*   2    2:aload_1         
	//*   3    3:getstatic       #44  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.DEFAULT>
	//*   4    6:if_acmpne       16
			ity1 = DEFAULT._creatorMinLevel;
	//    5    9:getstatic       #38  <Field VisibilityChecker$Std DEFAULT>
	//    6   12:getfield        #52  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
	//    7   15:astore_2        
		if(_creatorMinLevel == ity1)
	//*   8   16:aload_0         
	//*   9   17:getfield        #52  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
	//*  10   20:aload_2         
	//*  11   21:if_acmpne       26
			return this;
	//   12   24:aload_0         
	//   13   25:areturn         
		else
			return new VisibilityChecker$Std(_getterMinLevel, _isGetterMinLevel, _setterMinLevel, ity1, _fieldMinLevel);
	//   14   26:new             #2   <Class VisibilityChecker$Std>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:getfield        #46  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
	//   18   34:aload_0         
	//   19   35:getfield        #48  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
	//   20   38:aload_0         
	//   21   39:getfield        #50  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
	//   22   42:aload_2         
	//   23   43:aload_0         
	//   24   44:getfield        #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
	//   25   47:invokespecial   #36  <Method void VisibilityChecker$Std(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   26   50:areturn         
	}

	public volatile VisibilityChecker withCreatorVisibility(com.fasterxml.jackson.annotation.ity ity)
	{
		return ((VisibilityChecker) (withCreatorVisibility(ity)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #147 <Method VisibilityChecker$Std withCreatorVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//    3    5:areturn         
	}

	public VisibilityChecker$Std withFieldVisibility(com.fasterxml.jackson.annotation.ity ity)
	{
		com.fasterxml.jackson.annotation.ity ity1 = ity;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(ity == com.fasterxml.jackson.annotation.ity.DEFAULT)
	//*   2    2:aload_1         
	//*   3    3:getstatic       #44  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.DEFAULT>
	//*   4    6:if_acmpne       16
			ity1 = DEFAULT._fieldMinLevel;
	//    5    9:getstatic       #38  <Field VisibilityChecker$Std DEFAULT>
	//    6   12:getfield        #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
	//    7   15:astore_2        
		if(_fieldMinLevel == ity1)
	//*   8   16:aload_0         
	//*   9   17:getfield        #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
	//*  10   20:aload_2         
	//*  11   21:if_acmpne       26
			return this;
	//   12   24:aload_0         
	//   13   25:areturn         
		else
			return new VisibilityChecker$Std(_getterMinLevel, _isGetterMinLevel, _setterMinLevel, _creatorMinLevel, ity1);
	//   14   26:new             #2   <Class VisibilityChecker$Std>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:getfield        #46  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
	//   18   34:aload_0         
	//   19   35:getfield        #48  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
	//   20   38:aload_0         
	//   21   39:getfield        #50  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
	//   22   42:aload_0         
	//   23   43:getfield        #52  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
	//   24   46:aload_2         
	//   25   47:invokespecial   #36  <Method void VisibilityChecker$Std(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   26   50:areturn         
	}

	public volatile VisibilityChecker withFieldVisibility(com.fasterxml.jackson.annotation.ity ity)
	{
		return ((VisibilityChecker) (withFieldVisibility(ity)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #150 <Method VisibilityChecker$Std withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//    3    5:areturn         
	}

	public VisibilityChecker$Std withGetterVisibility(com.fasterxml.jackson.annotation.ity ity)
	{
		com.fasterxml.jackson.annotation.ity ity1 = ity;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(ity == com.fasterxml.jackson.annotation.ity.DEFAULT)
	//*   2    2:aload_1         
	//*   3    3:getstatic       #44  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.DEFAULT>
	//*   4    6:if_acmpne       16
			ity1 = DEFAULT._getterMinLevel;
	//    5    9:getstatic       #38  <Field VisibilityChecker$Std DEFAULT>
	//    6   12:getfield        #46  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
	//    7   15:astore_2        
		if(_getterMinLevel == ity1)
	//*   8   16:aload_0         
	//*   9   17:getfield        #46  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
	//*  10   20:aload_2         
	//*  11   21:if_acmpne       26
			return this;
	//   12   24:aload_0         
	//   13   25:areturn         
		else
			return new VisibilityChecker$Std(ity1, _isGetterMinLevel, _setterMinLevel, _creatorMinLevel, _fieldMinLevel);
	//   14   26:new             #2   <Class VisibilityChecker$Std>
	//   15   29:dup             
	//   16   30:aload_2         
	//   17   31:aload_0         
	//   18   32:getfield        #48  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
	//   19   35:aload_0         
	//   20   36:getfield        #50  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
	//   21   39:aload_0         
	//   22   40:getfield        #52  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
	//   23   43:aload_0         
	//   24   44:getfield        #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
	//   25   47:invokespecial   #36  <Method void VisibilityChecker$Std(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   26   50:areturn         
	}

	public volatile VisibilityChecker withGetterVisibility(com.fasterxml.jackson.annotation.ity ity)
	{
		return ((VisibilityChecker) (withGetterVisibility(ity)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #153 <Method VisibilityChecker$Std withGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//    3    5:areturn         
	}

	public VisibilityChecker$Std withIsGetterVisibility(com.fasterxml.jackson.annotation.ity ity)
	{
		com.fasterxml.jackson.annotation.ity ity1 = ity;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(ity == com.fasterxml.jackson.annotation.ity.DEFAULT)
	//*   2    2:aload_1         
	//*   3    3:getstatic       #44  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.DEFAULT>
	//*   4    6:if_acmpne       16
			ity1 = DEFAULT._isGetterMinLevel;
	//    5    9:getstatic       #38  <Field VisibilityChecker$Std DEFAULT>
	//    6   12:getfield        #48  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
	//    7   15:astore_2        
		if(_isGetterMinLevel == ity1)
	//*   8   16:aload_0         
	//*   9   17:getfield        #48  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
	//*  10   20:aload_2         
	//*  11   21:if_acmpne       26
			return this;
	//   12   24:aload_0         
	//   13   25:areturn         
		else
			return new VisibilityChecker$Std(_getterMinLevel, ity1, _setterMinLevel, _creatorMinLevel, _fieldMinLevel);
	//   14   26:new             #2   <Class VisibilityChecker$Std>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:getfield        #46  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
	//   18   34:aload_2         
	//   19   35:aload_0         
	//   20   36:getfield        #50  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
	//   21   39:aload_0         
	//   22   40:getfield        #52  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
	//   23   43:aload_0         
	//   24   44:getfield        #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
	//   25   47:invokespecial   #36  <Method void VisibilityChecker$Std(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   26   50:areturn         
	}

	public volatile VisibilityChecker withIsGetterVisibility(com.fasterxml.jackson.annotation.ity ity)
	{
		return ((VisibilityChecker) (withIsGetterVisibility(ity)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #156 <Method VisibilityChecker$Std withIsGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//    3    5:areturn         
	}

	public VisibilityChecker$Std withOverrides(com.fasterxml.jackson.annotation.JsonAutoDetect.Value value)
	{
		if(value != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          69
			return _with(_defaultOrOverride(_getterMinLevel, value.getGetterVisibility()), _defaultOrOverride(_isGetterMinLevel, value.getIsGetterVisibility()), _defaultOrOverride(_setterMinLevel, value.getSetterVisibility()), _defaultOrOverride(_creatorMinLevel, value.getCreatorVisibility()), _defaultOrOverride(_fieldMinLevel, value.getFieldVisibility()));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #46  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #163 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Value.getGetterVisibility()>
	//    8   14:invokespecial   #124 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _defaultOrOverride(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #48  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #166 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Value.getIsGetterVisibility()>
	//   14   26:invokespecial   #124 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _defaultOrOverride(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #50  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #169 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Value.getSetterVisibility()>
	//   20   38:invokespecial   #124 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _defaultOrOverride(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   21   41:aload_0         
	//   22   42:aload_0         
	//   23   43:getfield        #52  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
	//   24   46:aload_1         
	//   25   47:invokevirtual   #172 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Value.getCreatorVisibility()>
	//   26   50:invokespecial   #124 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _defaultOrOverride(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   27   53:aload_0         
	//   28   54:aload_0         
	//   29   55:getfield        #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
	//   30   58:aload_1         
	//   31   59:invokevirtual   #175 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Value.getFieldVisibility()>
	//   32   62:invokespecial   #124 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _defaultOrOverride(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   33   65:invokevirtual   #138 <Method VisibilityChecker$Std _with(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   34   68:areturn         
		else
			return this;
	//   35   69:aload_0         
	//   36   70:areturn         
	}

	public volatile VisibilityChecker withOverrides(com.fasterxml.jackson.annotation.JsonAutoDetect.Value value)
	{
		return ((VisibilityChecker) (withOverrides(value)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #178 <Method VisibilityChecker$Std withOverrides(com.fasterxml.jackson.annotation.JsonAutoDetect$Value)>
	//    3    5:areturn         
	}

	public VisibilityChecker$Std withSetterVisibility(com.fasterxml.jackson.annotation.ity ity)
	{
		com.fasterxml.jackson.annotation.ity ity1 = ity;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(ity == com.fasterxml.jackson.annotation.ity.DEFAULT)
	//*   2    2:aload_1         
	//*   3    3:getstatic       #44  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.DEFAULT>
	//*   4    6:if_acmpne       16
			ity1 = DEFAULT._setterMinLevel;
	//    5    9:getstatic       #38  <Field VisibilityChecker$Std DEFAULT>
	//    6   12:getfield        #50  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
	//    7   15:astore_2        
		if(_setterMinLevel == ity1)
	//*   8   16:aload_0         
	//*   9   17:getfield        #50  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
	//*  10   20:aload_2         
	//*  11   21:if_acmpne       26
			return this;
	//   12   24:aload_0         
	//   13   25:areturn         
		else
			return new VisibilityChecker$Std(_getterMinLevel, _isGetterMinLevel, ity1, _creatorMinLevel, _fieldMinLevel);
	//   14   26:new             #2   <Class VisibilityChecker$Std>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:getfield        #46  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
	//   18   34:aload_0         
	//   19   35:getfield        #48  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
	//   20   38:aload_2         
	//   21   39:aload_0         
	//   22   40:getfield        #52  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
	//   23   43:aload_0         
	//   24   44:getfield        #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
	//   25   47:invokespecial   #36  <Method void VisibilityChecker$Std(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   26   50:areturn         
	}

	public volatile VisibilityChecker withSetterVisibility(com.fasterxml.jackson.annotation.ity ity)
	{
		return ((VisibilityChecker) (withSetterVisibility(ity)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #181 <Method VisibilityChecker$Std withSetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//    3    5:areturn         
	}

	public VisibilityChecker$Std withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.ity ity)
	{
		switch(VisibilityChecker._cls1.$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[propertyaccessor.ordinal()])
	//*   0    0:getstatic       #189 <Field int[] VisibilityChecker$1.$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #195 <Method int PropertyAccessor.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 6: default 48
	//	               1 80
	//	               2 74
	//	               3 68
	//	               4 62
	//	               5 56
	//	               6 50
		default:
			return this;
	//    5   48:aload_0         
	//    6   49:areturn         

		case 6: // '\006'
			return with(ity);
	//    7   50:aload_0         
	//    8   51:aload_2         
	//    9   52:invokevirtual   #141 <Method VisibilityChecker$Std with(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   10   55:areturn         

		case 5: // '\005'
			return withIsGetterVisibility(ity);
	//   11   56:aload_0         
	//   12   57:aload_2         
	//   13   58:invokevirtual   #156 <Method VisibilityChecker$Std withIsGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   14   61:areturn         

		case 4: // '\004'
			return withFieldVisibility(ity);
	//   15   62:aload_0         
	//   16   63:aload_2         
	//   17   64:invokevirtual   #150 <Method VisibilityChecker$Std withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   18   67:areturn         

		case 3: // '\003'
			return withCreatorVisibility(ity);
	//   19   68:aload_0         
	//   20   69:aload_2         
	//   21   70:invokevirtual   #147 <Method VisibilityChecker$Std withCreatorVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   22   73:areturn         

		case 2: // '\002'
			return withSetterVisibility(ity);
	//   23   74:aload_0         
	//   24   75:aload_2         
	//   25   76:invokevirtual   #181 <Method VisibilityChecker$Std withSetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   26   79:areturn         

		case 1: // '\001'
			return withGetterVisibility(ity);
	//   27   80:aload_0         
	//   28   81:aload_2         
	//   29   82:invokevirtual   #153 <Method VisibilityChecker$Std withGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   30   85:areturn         
		}
	}

	public volatile VisibilityChecker withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.ity ity)
	{
		return ((VisibilityChecker) (withVisibility(propertyaccessor, ity)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #198 <Method VisibilityChecker$Std withVisibility(PropertyAccessor, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//    4    6:areturn         
	}

	protected static final VisibilityChecker$Std DEFAULT;
	private static final long serialVersionUID = 1L;
	protected final com.fasterxml.jackson.annotation.ity _creatorMinLevel;
	protected final com.fasterxml.jackson.annotation.ity _fieldMinLevel;
	protected final com.fasterxml.jackson.annotation.ity _getterMinLevel;
	protected final com.fasterxml.jackson.annotation.ity _isGetterMinLevel;
	protected final com.fasterxml.jackson.annotation.ity _setterMinLevel;

	static 
	{
		DEFAULT = new VisibilityChecker$Std(com.fasterxml.jackson.annotation.ity.PUBLIC_ONLY, com.fasterxml.jackson.annotation.ity.PUBLIC_ONLY, com.fasterxml.jackson.annotation.ity.ANY, com.fasterxml.jackson.annotation.ity.ANY, com.fasterxml.jackson.annotation.ity.PUBLIC_ONLY);
	//    0    0:new             #2   <Class VisibilityChecker$Std>
	//    1    3:dup             
	//    2    4:getstatic       #29  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.PUBLIC_ONLY>
	//    3    7:getstatic       #29  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.PUBLIC_ONLY>
	//    4   10:getstatic       #32  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.ANY>
	//    5   13:getstatic       #32  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.ANY>
	//    6   16:getstatic       #29  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.PUBLIC_ONLY>
	//    7   19:invokespecial   #36  <Method void VisibilityChecker$Std(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//    8   22:putstatic       #38  <Field VisibilityChecker$Std DEFAULT>
	//*   9   25:return          
	}

	public VisibilityChecker$Std(com.fasterxml.jackson.annotation.ity ity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		if(ity == com.fasterxml.jackson.annotation.ity.DEFAULT)
	//*   2    4:aload_1         
	//*   3    5:getstatic       #44  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.DEFAULT>
	//*   4    8:if_acmpne       56
		{
			ity = ((com.fasterxml.jackson.annotation.ity) (DEFAULT));
	//    5   11:getstatic       #38  <Field VisibilityChecker$Std DEFAULT>
	//    6   14:astore_1        
			_getterMinLevel = ((VisibilityChecker$Std) (ity))._getterMinLevel;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:getfield        #46  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
	//   10   20:putfield        #46  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
			_isGetterMinLevel = ((VisibilityChecker$Std) (ity))._isGetterMinLevel;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:getfield        #48  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
	//   14   28:putfield        #48  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
			_setterMinLevel = ((VisibilityChecker$Std) (ity))._setterMinLevel;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:getfield        #50  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
	//   18   36:putfield        #50  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
			_creatorMinLevel = ((VisibilityChecker$Std) (ity))._creatorMinLevel;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:getfield        #52  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
	//   22   44:putfield        #52  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
			_fieldMinLevel = ((VisibilityChecker$Std) (ity))._fieldMinLevel;
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:getfield        #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
	//   26   52:putfield        #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
			return;
	//   27   55:return          
		} else
		{
			_getterMinLevel = ity;
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:putfield        #46  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
			_isGetterMinLevel = ity;
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:putfield        #48  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
			_setterMinLevel = ity;
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:putfield        #50  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
			_creatorMinLevel = ity;
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:putfield        #52  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
			_fieldMinLevel = ity;
	//   40   76:aload_0         
	//   41   77:aload_1         
	//   42   78:putfield        #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
			return;
	//   43   81:return          
		}
	}

	public VisibilityChecker$Std(com.fasterxml.jackson.annotation.ity ity, com.fasterxml.jackson.annotation.ity ity1, com.fasterxml.jackson.annotation.ity ity2, com.fasterxml.jackson.annotation.ity ity3, com.fasterxml.jackson.annotation.ity ity4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		_getterMinLevel = ity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #46  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
		_isGetterMinLevel = ity1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #48  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
		_setterMinLevel = ity2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #50  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
		_creatorMinLevel = ity3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #52  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
		_fieldMinLevel = ity4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
	//   17   31:return          
	}
}

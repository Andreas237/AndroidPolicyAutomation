// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import java.io.Serializable;
import java.lang.reflect.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotatedMember, AnnotatedField, AnnotatedMethod

public interface VisibilityChecker
{
	public static class Std
		implements VisibilityChecker, Serializable
	{

		public static Std defaultInstance()
		{
			return DEFAULT;
		//    0    0:getstatic       #46  <Field VisibilityChecker$Std DEFAULT>
		//    1    3:areturn         
		}

		public boolean isCreatorVisible(AnnotatedMember annotatedmember)
		{
			return isCreatorVisible(annotatedmember.getMember());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #86  <Method Member AnnotatedMember.getMember()>
		//    3    5:invokevirtual   #89  <Method boolean isCreatorVisible(Member)>
		//    4    8:ireturn         
		}

		public boolean isCreatorVisible(Member member)
		{
			return _creatorMinLevel.isVisible(member);
		//    0    0:aload_0         
		//    1    1:getfield        #62  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #92  <Method boolean com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.isVisible(Member)>
		//    4    8:ireturn         
		}

		public boolean isFieldVisible(AnnotatedField annotatedfield)
		{
			return isFieldVisible(annotatedfield.getAnnotated());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #100 <Method Field AnnotatedField.getAnnotated()>
		//    3    5:invokevirtual   #103 <Method boolean isFieldVisible(Field)>
		//    4    8:ireturn         
		}

		public boolean isFieldVisible(Field field)
		{
			return _fieldMinLevel.isVisible(((Member) (field)));
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #92  <Method boolean com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.isVisible(Member)>
		//    4    8:ireturn         
		}

		public boolean isGetterVisible(AnnotatedMethod annotatedmethod)
		{
			return isGetterVisible(annotatedmethod.getAnnotated());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #110 <Method Method AnnotatedMethod.getAnnotated()>
		//    3    5:invokevirtual   #113 <Method boolean isGetterVisible(Method)>
		//    4    8:ireturn         
		}

		public boolean isGetterVisible(Method method)
		{
			return _getterMinLevel.isVisible(((Member) (method)));
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #92  <Method boolean com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.isVisible(Member)>
		//    4    8:ireturn         
		}

		public boolean isIsGetterVisible(AnnotatedMethod annotatedmethod)
		{
			return isIsGetterVisible(annotatedmethod.getAnnotated());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #110 <Method Method AnnotatedMethod.getAnnotated()>
		//    3    5:invokevirtual   #116 <Method boolean isIsGetterVisible(Method)>
		//    4    8:ireturn         
		}

		public boolean isIsGetterVisible(Method method)
		{
			return _isGetterMinLevel.isVisible(((Member) (method)));
		//    0    0:aload_0         
		//    1    1:getfield        #58  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #92  <Method boolean com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.isVisible(Member)>
		//    4    8:ireturn         
		}

		public boolean isSetterVisible(AnnotatedMethod annotatedmethod)
		{
			return isSetterVisible(annotatedmethod.getAnnotated());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #110 <Method Method AnnotatedMethod.getAnnotated()>
		//    3    5:invokevirtual   #119 <Method boolean isSetterVisible(Method)>
		//    4    8:ireturn         
		}

		public boolean isSetterVisible(Method method)
		{
			return _setterMinLevel.isVisible(((Member) (method)));
		//    0    0:aload_0         
		//    1    1:getfield        #60  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #92  <Method boolean com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.isVisible(Member)>
		//    4    8:ireturn         
		}

		public String toString()
		{
			return (new StringBuilder("[Visibility:")).append(" getter: ").append(((Object) (_getterMinLevel))).append(", isGetter: ").append(((Object) (_isGetterMinLevel))).append(", setter: ").append(((Object) (_setterMinLevel))).append(", creator: ").append(((Object) (_creatorMinLevel))).append(", field: ").append(((Object) (_fieldMinLevel))).append("]").toString();
		//    0    0:new             #123 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:ldc1            #125 <String "[Visibility:">
		//    3    6:invokespecial   #128 <Method void StringBuilder(String)>
		//    4    9:ldc1            #130 <String " getter: ">
		//    5   11:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
		//    6   14:aload_0         
		//    7   15:getfield        #56  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
		//    8   18:invokevirtual   #137 <Method StringBuilder StringBuilder.append(Object)>
		//    9   21:ldc1            #139 <String ", isGetter: ">
		//   10   23:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
		//   11   26:aload_0         
		//   12   27:getfield        #58  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
		//   13   30:invokevirtual   #137 <Method StringBuilder StringBuilder.append(Object)>
		//   14   33:ldc1            #141 <String ", setter: ">
		//   15   35:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
		//   16   38:aload_0         
		//   17   39:getfield        #60  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
		//   18   42:invokevirtual   #137 <Method StringBuilder StringBuilder.append(Object)>
		//   19   45:ldc1            #143 <String ", creator: ">
		//   20   47:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
		//   21   50:aload_0         
		//   22   51:getfield        #62  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
		//   23   54:invokevirtual   #137 <Method StringBuilder StringBuilder.append(Object)>
		//   24   57:ldc1            #145 <String ", field: ">
		//   25   59:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
		//   26   62:aload_0         
		//   27   63:getfield        #64  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
		//   28   66:invokevirtual   #137 <Method StringBuilder StringBuilder.append(Object)>
		//   29   69:ldc1            #147 <String "]">
		//   30   71:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
		//   31   74:invokevirtual   #149 <Method String StringBuilder.toString()>
		//   32   77:areturn         
		}

		public Std with(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
		{
			if(visibility == com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.DEFAULT)
		//*   0    0:aload_1         
		//*   1    1:getstatic       #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.DEFAULT>
		//*   2    4:if_acmpne       11
				return DEFAULT;
		//    3    7:getstatic       #46  <Field VisibilityChecker$Std DEFAULT>
		//    4   10:areturn         
			else
				return new Std(visibility);
		//    5   11:new             #2   <Class VisibilityChecker$Std>
		//    6   14:dup             
		//    7   15:aload_1         
		//    8   16:invokespecial   #153 <Method void VisibilityChecker$Std(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//    9   19:areturn         
		}

		public Std with(JsonAutoDetect jsonautodetect)
		{
			Std std = this;
		//    0    0:aload_0         
		//    1    1:astore_2        
			Std std1 = std;
		//    2    2:aload_2         
		//    3    3:astore_3        
			if(jsonautodetect != null)
		//*   4    4:aload_1         
		//*   5    5:ifnull          55
				std1 = std.withGetterVisibility(jsonautodetect.getterVisibility()).withIsGetterVisibility(jsonautodetect.isGetterVisibility()).withSetterVisibility(jsonautodetect.setterVisibility()).withCreatorVisibility(jsonautodetect.creatorVisibility()).withFieldVisibility(jsonautodetect.fieldVisibility());
		//    6    8:aload_2         
		//    7    9:aload_1         
		//    8   10:invokeinterface #68  <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility JsonAutoDetect.getterVisibility()>
		//    9   15:invokevirtual   #157 <Method VisibilityChecker$Std withGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//   10   18:aload_1         
		//   11   19:invokeinterface #70  <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility JsonAutoDetect.isGetterVisibility()>
		//   12   24:invokevirtual   #160 <Method VisibilityChecker$Std withIsGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//   13   27:aload_1         
		//   14   28:invokeinterface #72  <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility JsonAutoDetect.setterVisibility()>
		//   15   33:invokevirtual   #163 <Method VisibilityChecker$Std withSetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//   16   36:aload_1         
		//   17   37:invokeinterface #74  <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility JsonAutoDetect.creatorVisibility()>
		//   18   42:invokevirtual   #166 <Method VisibilityChecker$Std withCreatorVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//   19   45:aload_1         
		//   20   46:invokeinterface #76  <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility JsonAutoDetect.fieldVisibility()>
		//   21   51:invokevirtual   #169 <Method VisibilityChecker$Std withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//   22   54:astore_3        
			return std1;
		//   23   55:aload_3         
		//   24   56:areturn         
		}

		public volatile VisibilityChecker with(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
		{
			return ((VisibilityChecker) (with(visibility)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #172 <Method VisibilityChecker$Std with(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//    3    5:areturn         
		}

		public volatile VisibilityChecker with(JsonAutoDetect jsonautodetect)
		{
			return ((VisibilityChecker) (with(jsonautodetect)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #175 <Method VisibilityChecker$Std with(JsonAutoDetect)>
		//    3    5:areturn         
		}

		public Std withCreatorVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
		{
			com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility1 = visibility;
		//    0    0:aload_1         
		//    1    1:astore_2        
			if(visibility == com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.DEFAULT)
		//*   2    2:aload_1         
		//*   3    3:getstatic       #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.DEFAULT>
		//*   4    6:if_acmpne       16
				visibility1 = DEFAULT._creatorMinLevel;
		//    5    9:getstatic       #46  <Field VisibilityChecker$Std DEFAULT>
		//    6   12:getfield        #62  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
		//    7   15:astore_2        
			if(_creatorMinLevel == visibility1)
		//*   8   16:aload_0         
		//*   9   17:getfield        #62  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
		//*  10   20:aload_2         
		//*  11   21:if_acmpne       26
				return this;
		//   12   24:aload_0         
		//   13   25:areturn         
			else
				return new Std(_getterMinLevel, _isGetterMinLevel, _setterMinLevel, visibility1, _fieldMinLevel);
		//   14   26:new             #2   <Class VisibilityChecker$Std>
		//   15   29:dup             
		//   16   30:aload_0         
		//   17   31:getfield        #56  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
		//   18   34:aload_0         
		//   19   35:getfield        #58  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
		//   20   38:aload_0         
		//   21   39:getfield        #60  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
		//   22   42:aload_2         
		//   23   43:aload_0         
		//   24   44:getfield        #64  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
		//   25   47:invokespecial   #177 <Method void VisibilityChecker$Std(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//   26   50:areturn         
		}

		public volatile VisibilityChecker withCreatorVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
		{
			return ((VisibilityChecker) (withCreatorVisibility(visibility)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #166 <Method VisibilityChecker$Std withCreatorVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//    3    5:areturn         
		}

		public Std withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
		{
			com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility1 = visibility;
		//    0    0:aload_1         
		//    1    1:astore_2        
			if(visibility == com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.DEFAULT)
		//*   2    2:aload_1         
		//*   3    3:getstatic       #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.DEFAULT>
		//*   4    6:if_acmpne       16
				visibility1 = DEFAULT._fieldMinLevel;
		//    5    9:getstatic       #46  <Field VisibilityChecker$Std DEFAULT>
		//    6   12:getfield        #64  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
		//    7   15:astore_2        
			if(_fieldMinLevel == visibility1)
		//*   8   16:aload_0         
		//*   9   17:getfield        #64  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
		//*  10   20:aload_2         
		//*  11   21:if_acmpne       26
				return this;
		//   12   24:aload_0         
		//   13   25:areturn         
			else
				return new Std(_getterMinLevel, _isGetterMinLevel, _setterMinLevel, _creatorMinLevel, visibility1);
		//   14   26:new             #2   <Class VisibilityChecker$Std>
		//   15   29:dup             
		//   16   30:aload_0         
		//   17   31:getfield        #56  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
		//   18   34:aload_0         
		//   19   35:getfield        #58  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
		//   20   38:aload_0         
		//   21   39:getfield        #60  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
		//   22   42:aload_0         
		//   23   43:getfield        #62  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
		//   24   46:aload_2         
		//   25   47:invokespecial   #177 <Method void VisibilityChecker$Std(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//   26   50:areturn         
		}

		public volatile VisibilityChecker withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
		{
			return ((VisibilityChecker) (withFieldVisibility(visibility)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #169 <Method VisibilityChecker$Std withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//    3    5:areturn         
		}

		public Std withGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
		{
			com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility1 = visibility;
		//    0    0:aload_1         
		//    1    1:astore_2        
			if(visibility == com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.DEFAULT)
		//*   2    2:aload_1         
		//*   3    3:getstatic       #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.DEFAULT>
		//*   4    6:if_acmpne       16
				visibility1 = DEFAULT._getterMinLevel;
		//    5    9:getstatic       #46  <Field VisibilityChecker$Std DEFAULT>
		//    6   12:getfield        #56  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
		//    7   15:astore_2        
			if(_getterMinLevel == visibility1)
		//*   8   16:aload_0         
		//*   9   17:getfield        #56  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
		//*  10   20:aload_2         
		//*  11   21:if_acmpne       26
				return this;
		//   12   24:aload_0         
		//   13   25:areturn         
			else
				return new Std(visibility1, _isGetterMinLevel, _setterMinLevel, _creatorMinLevel, _fieldMinLevel);
		//   14   26:new             #2   <Class VisibilityChecker$Std>
		//   15   29:dup             
		//   16   30:aload_2         
		//   17   31:aload_0         
		//   18   32:getfield        #58  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
		//   19   35:aload_0         
		//   20   36:getfield        #60  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
		//   21   39:aload_0         
		//   22   40:getfield        #62  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
		//   23   43:aload_0         
		//   24   44:getfield        #64  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
		//   25   47:invokespecial   #177 <Method void VisibilityChecker$Std(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//   26   50:areturn         
		}

		public volatile VisibilityChecker withGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
		{
			return ((VisibilityChecker) (withGetterVisibility(visibility)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #157 <Method VisibilityChecker$Std withGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//    3    5:areturn         
		}

		public Std withIsGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
		{
			com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility1 = visibility;
		//    0    0:aload_1         
		//    1    1:astore_2        
			if(visibility == com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.DEFAULT)
		//*   2    2:aload_1         
		//*   3    3:getstatic       #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.DEFAULT>
		//*   4    6:if_acmpne       16
				visibility1 = DEFAULT._isGetterMinLevel;
		//    5    9:getstatic       #46  <Field VisibilityChecker$Std DEFAULT>
		//    6   12:getfield        #58  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
		//    7   15:astore_2        
			if(_isGetterMinLevel == visibility1)
		//*   8   16:aload_0         
		//*   9   17:getfield        #58  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
		//*  10   20:aload_2         
		//*  11   21:if_acmpne       26
				return this;
		//   12   24:aload_0         
		//   13   25:areturn         
			else
				return new Std(_getterMinLevel, visibility1, _setterMinLevel, _creatorMinLevel, _fieldMinLevel);
		//   14   26:new             #2   <Class VisibilityChecker$Std>
		//   15   29:dup             
		//   16   30:aload_0         
		//   17   31:getfield        #56  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
		//   18   34:aload_2         
		//   19   35:aload_0         
		//   20   36:getfield        #60  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
		//   21   39:aload_0         
		//   22   40:getfield        #62  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
		//   23   43:aload_0         
		//   24   44:getfield        #64  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
		//   25   47:invokespecial   #177 <Method void VisibilityChecker$Std(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//   26   50:areturn         
		}

		public volatile VisibilityChecker withIsGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
		{
			return ((VisibilityChecker) (withIsGetterVisibility(visibility)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #160 <Method VisibilityChecker$Std withIsGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//    3    5:areturn         
		}

		public Std withSetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
		{
			com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility1 = visibility;
		//    0    0:aload_1         
		//    1    1:astore_2        
			if(visibility == com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.DEFAULT)
		//*   2    2:aload_1         
		//*   3    3:getstatic       #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.DEFAULT>
		//*   4    6:if_acmpne       16
				visibility1 = DEFAULT._setterMinLevel;
		//    5    9:getstatic       #46  <Field VisibilityChecker$Std DEFAULT>
		//    6   12:getfield        #60  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
		//    7   15:astore_2        
			if(_setterMinLevel == visibility1)
		//*   8   16:aload_0         
		//*   9   17:getfield        #60  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
		//*  10   20:aload_2         
		//*  11   21:if_acmpne       26
				return this;
		//   12   24:aload_0         
		//   13   25:areturn         
			else
				return new Std(_getterMinLevel, _isGetterMinLevel, visibility1, _creatorMinLevel, _fieldMinLevel);
		//   14   26:new             #2   <Class VisibilityChecker$Std>
		//   15   29:dup             
		//   16   30:aload_0         
		//   17   31:getfield        #56  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
		//   18   34:aload_0         
		//   19   35:getfield        #58  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
		//   20   38:aload_2         
		//   21   39:aload_0         
		//   22   40:getfield        #62  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
		//   23   43:aload_0         
		//   24   44:getfield        #64  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
		//   25   47:invokespecial   #177 <Method void VisibilityChecker$Std(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//   26   50:areturn         
		}

		public volatile VisibilityChecker withSetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
		{
			return ((VisibilityChecker) (withSetterVisibility(visibility)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #163 <Method VisibilityChecker$Std withSetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//    3    5:areturn         
		}

		public Std withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
		{
			static class _cls1
			{

				static final int $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[];

				static 
				{
					$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor = new int[PropertyAccessor.values().length];
				//    0    0:invokestatic    #18  <Method PropertyAccessor[] PropertyAccessor.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.GETTER.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
				//    5   12:getstatic       #24  <Field PropertyAccessor PropertyAccessor.GETTER>
				//    6   15:invokevirtual   #28  <Method int PropertyAccessor.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
				//*  10   23:getstatic       #31  <Field PropertyAccessor PropertyAccessor.SETTER>
				//*  11   26:invokevirtual   #28  <Method int PropertyAccessor.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
				//*  15   34:getstatic       #34  <Field PropertyAccessor PropertyAccessor.CREATOR>
				//*  16   37:invokevirtual   #28  <Method int PropertyAccessor.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
				//*  20   45:getstatic       #37  <Field PropertyAccessor PropertyAccessor.FIELD>
				//*  21   48:invokevirtual   #28  <Method int PropertyAccessor.ordinal()>
				//*  22   51:iconst_4        
				//*  23   52:iastore         
				//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
				//*  25   56:getstatic       #40  <Field PropertyAccessor PropertyAccessor.IS_GETTER>
				//*  26   59:invokevirtual   #28  <Method int PropertyAccessor.ordinal()>
				//*  27   62:iconst_5        
				//*  28   63:iastore         
				//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
				//*  30   67:getstatic       #43  <Field PropertyAccessor PropertyAccessor.ALL>
				//*  31   70:invokevirtual   #28  <Method int PropertyAccessor.ordinal()>
				//*  32   73:bipush          6
				//*  33   75:iastore         
				//*  34   76:return          
				//*  35   77:astore_0        
				//*  36   78:return          
				//*  37   79:astore_0        
				//*  38   80:goto            64
				//*  39   83:astore_0        
				//*  40   84:goto            53
				//*  41   87:astore_0        
				//*  42   88:goto            42
				//*  43   91:astore_0        
				//*  44   92:goto            31
					catch(NoSuchFieldError nosuchfielderror5) { }
				//   45   95:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.SETTER.ordinal()] = 2;
					}
					catch(NoSuchFieldError nosuchfielderror4) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.CREATOR.ordinal()] = 3;
					}
					catch(NoSuchFieldError nosuchfielderror3) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.FIELD.ordinal()] = 4;
					}
					catch(NoSuchFieldError nosuchfielderror2) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.IS_GETTER.ordinal()] = 5;
					}
					catch(NoSuchFieldError nosuchfielderror1) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.ALL.ordinal()] = 6;
					}
					catch(NoSuchFieldError nosuchfielderror)
					{
						return;
					}
				//*  46   96:goto            20
				}
			}

			switch(_cls1..SwitchMap.com.fasterxml.jackson.annotation.PropertyAccessor[propertyaccessor.ordinal()])
		//*   0    0:getstatic       #185 <Field int[] VisibilityChecker$1.$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
		//*   1    3:aload_1         
		//*   2    4:invokevirtual   #191 <Method int PropertyAccessor.ordinal()>
		//*   3    7:iaload          
			{
		//*   4    8:tableswitch     1 6: default 48
		//		               1 50
		//		               2 56
		//		               3 62
		//		               4 68
		//		               5 74
		//		               6 80
			default:
				return this;
		//    5   48:aload_0         
		//    6   49:areturn         

			case 1: // '\001'
				return withGetterVisibility(visibility);
		//    7   50:aload_0         
		//    8   51:aload_2         
		//    9   52:invokevirtual   #157 <Method VisibilityChecker$Std withGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//   10   55:areturn         

			case 2: // '\002'
				return withSetterVisibility(visibility);
		//   11   56:aload_0         
		//   12   57:aload_2         
		//   13   58:invokevirtual   #163 <Method VisibilityChecker$Std withSetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//   14   61:areturn         

			case 3: // '\003'
				return withCreatorVisibility(visibility);
		//   15   62:aload_0         
		//   16   63:aload_2         
		//   17   64:invokevirtual   #166 <Method VisibilityChecker$Std withCreatorVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//   18   67:areturn         

			case 4: // '\004'
				return withFieldVisibility(visibility);
		//   19   68:aload_0         
		//   20   69:aload_2         
		//   21   70:invokevirtual   #169 <Method VisibilityChecker$Std withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//   22   73:areturn         

			case 5: // '\005'
				return withIsGetterVisibility(visibility);
		//   23   74:aload_0         
		//   24   75:aload_2         
		//   25   76:invokevirtual   #160 <Method VisibilityChecker$Std withIsGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//   26   79:areturn         

			case 6: // '\006'
				return with(visibility);
		//   27   80:aload_0         
		//   28   81:aload_2         
		//   29   82:invokevirtual   #172 <Method VisibilityChecker$Std with(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//   30   85:areturn         
			}
		}

		public volatile VisibilityChecker withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
		{
			return ((VisibilityChecker) (withVisibility(propertyaccessor, visibility)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #194 <Method VisibilityChecker$Std withVisibility(PropertyAccessor, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
		//    4    6:areturn         
		}

		protected static final Std DEFAULT = new Std((JsonAutoDetect)((Class) (com/fasterxml/jackson/databind/introspect/VisibilityChecker$Std)).getAnnotation(com/fasterxml/jackson/annotation/JsonAutoDetect));
		private static final long serialVersionUID = 1L;
		protected final com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility _creatorMinLevel;
		protected final com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility _fieldMinLevel;
		protected final com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility _getterMinLevel;
		protected final com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility _isGetterMinLevel;
		protected final com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility _setterMinLevel;

		static 
		{
		//    0    0:new             #2   <Class VisibilityChecker$Std>
		//    1    3:dup             
		//    2    4:ldc1            #2   <Class VisibilityChecker$Std>
		//    3    6:ldc1            #34  <Class JsonAutoDetect>
		//    4    8:invokevirtual   #40  <Method java.lang.annotation.Annotation Class.getAnnotation(Class)>
		//    5   11:checkcast       #34  <Class JsonAutoDetect>
		//    6   14:invokespecial   #44  <Method void VisibilityChecker$Std(JsonAutoDetect)>
		//    7   17:putstatic       #46  <Field VisibilityChecker$Std DEFAULT>
		//*   8   20:return          
		}

		public Std(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #50  <Method void Object()>
			if(visibility == com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.DEFAULT)
		//*   2    4:aload_1         
		//*   3    5:getstatic       #54  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.DEFAULT>
		//*   4    8:if_acmpne       62
			{
				_getterMinLevel = DEFAULT._getterMinLevel;
		//    5   11:aload_0         
		//    6   12:getstatic       #46  <Field VisibilityChecker$Std DEFAULT>
		//    7   15:getfield        #56  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
		//    8   18:putfield        #56  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
				_isGetterMinLevel = DEFAULT._isGetterMinLevel;
		//    9   21:aload_0         
		//   10   22:getstatic       #46  <Field VisibilityChecker$Std DEFAULT>
		//   11   25:getfield        #58  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
		//   12   28:putfield        #58  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
				_setterMinLevel = DEFAULT._setterMinLevel;
		//   13   31:aload_0         
		//   14   32:getstatic       #46  <Field VisibilityChecker$Std DEFAULT>
		//   15   35:getfield        #60  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
		//   16   38:putfield        #60  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
				_creatorMinLevel = DEFAULT._creatorMinLevel;
		//   17   41:aload_0         
		//   18   42:getstatic       #46  <Field VisibilityChecker$Std DEFAULT>
		//   19   45:getfield        #62  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
		//   20   48:putfield        #62  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
				_fieldMinLevel = DEFAULT._fieldMinLevel;
		//   21   51:aload_0         
		//   22   52:getstatic       #46  <Field VisibilityChecker$Std DEFAULT>
		//   23   55:getfield        #64  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
		//   24   58:putfield        #64  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
				return;
		//   25   61:return          
			} else
			{
				_getterMinLevel = visibility;
		//   26   62:aload_0         
		//   27   63:aload_1         
		//   28   64:putfield        #56  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
				_isGetterMinLevel = visibility;
		//   29   67:aload_0         
		//   30   68:aload_1         
		//   31   69:putfield        #58  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
				_setterMinLevel = visibility;
		//   32   72:aload_0         
		//   33   73:aload_1         
		//   34   74:putfield        #60  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
				_creatorMinLevel = visibility;
		//   35   77:aload_0         
		//   36   78:aload_1         
		//   37   79:putfield        #62  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
				_fieldMinLevel = visibility;
		//   38   82:aload_0         
		//   39   83:aload_1         
		//   40   84:putfield        #64  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
				return;
		//   41   87:return          
			}
		}

		public Std(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility1, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility2, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility3, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility4)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #50  <Method void Object()>
			_getterMinLevel = visibility;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #56  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
			_isGetterMinLevel = visibility1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #58  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
			_setterMinLevel = visibility2;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #60  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
			_creatorMinLevel = visibility3;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #62  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
			_fieldMinLevel = visibility4;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #64  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
		//   17   31:return          
		}

		public Std(JsonAutoDetect jsonautodetect)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #50  <Method void Object()>
			_getterMinLevel = jsonautodetect.getterVisibility();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokeinterface #68  <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility JsonAutoDetect.getterVisibility()>
		//    5   11:putfield        #56  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _getterMinLevel>
			_isGetterMinLevel = jsonautodetect.isGetterVisibility();
		//    6   14:aload_0         
		//    7   15:aload_1         
		//    8   16:invokeinterface #70  <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility JsonAutoDetect.isGetterVisibility()>
		//    9   21:putfield        #58  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _isGetterMinLevel>
			_setterMinLevel = jsonautodetect.setterVisibility();
		//   10   24:aload_0         
		//   11   25:aload_1         
		//   12   26:invokeinterface #72  <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility JsonAutoDetect.setterVisibility()>
		//   13   31:putfield        #60  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _setterMinLevel>
			_creatorMinLevel = jsonautodetect.creatorVisibility();
		//   14   34:aload_0         
		//   15   35:aload_1         
		//   16   36:invokeinterface #74  <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility JsonAutoDetect.creatorVisibility()>
		//   17   41:putfield        #62  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _creatorMinLevel>
			_fieldMinLevel = jsonautodetect.fieldVisibility();
		//   18   44:aload_0         
		//   19   45:aload_1         
		//   20   46:invokeinterface #76  <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility JsonAutoDetect.fieldVisibility()>
		//   21   51:putfield        #64  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility _fieldMinLevel>
		//   22   54:return          
		}
	}


	public abstract boolean isCreatorVisible(AnnotatedMember annotatedmember);

	public abstract boolean isCreatorVisible(Member member);

	public abstract boolean isFieldVisible(AnnotatedField annotatedfield);

	public abstract boolean isFieldVisible(Field field);

	public abstract boolean isGetterVisible(AnnotatedMethod annotatedmethod);

	public abstract boolean isGetterVisible(Method method);

	public abstract boolean isIsGetterVisible(AnnotatedMethod annotatedmethod);

	public abstract boolean isIsGetterVisible(Method method);

	public abstract boolean isSetterVisible(AnnotatedMethod annotatedmethod);

	public abstract boolean isSetterVisible(Method method);

	public abstract VisibilityChecker with(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);

	public abstract VisibilityChecker with(JsonAutoDetect jsonautodetect);

	public abstract VisibilityChecker withCreatorVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);

	public abstract VisibilityChecker withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);

	public abstract VisibilityChecker withGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);

	public abstract VisibilityChecker withIsGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);

	public abstract VisibilityChecker withSetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);

	public abstract VisibilityChecker withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);
}

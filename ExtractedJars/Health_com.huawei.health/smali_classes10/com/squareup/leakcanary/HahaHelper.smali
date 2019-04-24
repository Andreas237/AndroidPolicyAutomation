.class public final Lcom/squareup/leakcanary/HahaHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final WRAPPER_TYPES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 37
    new-instance v0, Ljava/util/HashSet;

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/String;

    const-class v2, Ljava/lang/Boolean;

    .line 38
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Ljava/lang/Character;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-class v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-class v2, Ljava/lang/Double;

    .line 39
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-class v2, Ljava/lang/Byte;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-class v2, Ljava/lang/Short;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-class v2, Ljava/lang/Integer;

    .line 40
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const-class v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 38
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/squareup/leakcanary/HahaHelper;->WRAPPER_TYPES:Ljava/util/Set;

    .line 37
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 182
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 183
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method static asString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 13

    .line 79
    move-object v5, p0

    check-cast v5, Lcom/squareup/haha/perflib/Instance;

    .line 80
    invoke-static {v5}, Lcom/squareup/leakcanary/HahaHelper;->classInstanceValues(Lcom/squareup/haha/perflib/Instance;)Ljava/util/List;

    move-result-object v6

    .line 82
    const-string v0, "count"

    invoke-static {v6, v0}, Lcom/squareup/leakcanary/HahaHelper;->fieldValue(Ljava/util/List;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Integer;

    .line 83
    const-string v0, "count"

    invoke-static {v7, v0}, Lcom/squareup/leakcanary/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 84
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    .line 85
    const-string v0, ""

    return-object v0

    .line 88
    :cond_0
    const-string v0, "value"

    invoke-static {v6, v0}, Lcom/squareup/leakcanary/HahaHelper;->fieldValue(Ljava/util/List;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    .line 89
    const-string v0, "value"

    invoke-static {v8, v0}, Lcom/squareup/leakcanary/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 93
    invoke-static {v8}, Lcom/squareup/leakcanary/HahaHelper;->isCharArray(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 94
    move-object v10, v8

    check-cast v10, Lcom/squareup/haha/perflib/ArrayInstance;

    .line 96
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 101
    const-string v0, "offset"

    invoke-static {v6, v0}, Lcom/squareup/leakcanary/HahaHelper;->hasField(Ljava/util/List;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 102
    const-string v0, "offset"

    invoke-static {v6, v0}, Lcom/squareup/leakcanary/HahaHelper;->fieldValue(Ljava/util/List;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/Integer;

    .line 103
    const-string v0, "offset"

    invoke-static {v9, v0}, Lcom/squareup/leakcanary/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 106
    :cond_1
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v10, v0, v1}, Lcom/squareup/haha/perflib/ArrayInstance;->asCharArray(II)[C

    move-result-object v11

    .line 107
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v11}, Ljava/lang/String;-><init>([C)V

    return-object v0

    .line 108
    :cond_2
    invoke-static {v8}, Lcom/squareup/leakcanary/HahaHelper;->isByteArray(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 110
    move-object v10, v8

    check-cast v10, Lcom/squareup/haha/perflib/ArrayInstance;

    .line 114
    :try_start_0
    const-class v0, Lcom/squareup/haha/perflib/ArrayInstance;

    const-string v1, "asRawByteArray"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Class;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 115
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    .line 116
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 117
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object v7, v0, v1

    invoke-virtual {v11, v10, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, [B

    .line 118
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {v0, v12, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2

    return-object v0

    .line 119
    :catch_0
    move-exception v11

    .line 120
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v11}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 121
    :catch_1
    move-exception v11

    .line 122
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v11}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 123
    :catch_2
    move-exception v11

    .line 124
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v11}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 127
    :cond_3
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not find char array in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static classInstanceValues(Lcom/squareup/haha/perflib/Instance;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/perflib/Instance;)Ljava/util/List<Lcom/squareup/haha/perflib/ClassInstance$FieldValue;>;"
        }
    .end annotation

    .line 158
    move-object v1, p0

    check-cast v1, Lcom/squareup/haha/perflib/ClassInstance;

    .line 159
    invoke-virtual {v1}, Lcom/squareup/haha/perflib/ClassInstance;->getValues()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static extendsThread(Lcom/squareup/haha/perflib/ClassObj;)Z
    .locals 4

    .line 66
    const/4 v2, 0x0

    .line 67
    move-object v3, p0

    .line 68
    :goto_0
    invoke-virtual {v3}, Lcom/squareup/haha/perflib/ClassObj;->getSuperClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 69
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/ClassObj;->getClassName()Ljava/lang/String;

    move-result-object v0

    const-class v1, Ljava/lang/Thread;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    const/4 v2, 0x1

    .line 71
    goto :goto_1

    .line 73
    :cond_0
    invoke-virtual {v3}, Lcom/squareup/haha/perflib/ClassObj;->getSuperClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v3

    goto :goto_0

    .line 75
    :cond_1
    :goto_1
    return v2
.end method

.method static fieldToString(Lcom/squareup/haha/perflib/ClassInstance$FieldValue;)Ljava/lang/String;
    .locals 2

    .line 47
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;->getField()Lcom/squareup/haha/perflib/Field;

    move-result-object v0

    invoke-virtual {p0}, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/squareup/leakcanary/HahaHelper;->fieldToString(Lcom/squareup/haha/perflib/Field;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static fieldToString(Lcom/squareup/haha/perflib/Field;Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static fieldToString(Ljava/util/Map$Entry;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map$Entry<Lcom/squareup/haha/perflib/Field;Ljava/lang/Object;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 43
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/Field;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/squareup/leakcanary/HahaHelper;->fieldToString(Lcom/squareup/haha/perflib/Field;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static fieldValue(Ljava/util/List;Ljava/lang/String;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/util/List<Lcom/squareup/haha/perflib/ClassInstance$FieldValue;>;Ljava/lang/String;)TT;"
        }
    .end annotation

    .line 164
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;

    .line 165
    invoke-virtual {v4}, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;->getField()Lcom/squareup/haha/perflib/Field;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/Field;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    invoke-virtual {v4}, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 168
    :cond_0
    goto :goto_0

    .line 169
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Field "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " does not exists"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static hasField(Ljava/util/List;Ljava/lang/String;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/squareup/haha/perflib/ClassInstance$FieldValue;>;Ljava/lang/String;)Z"
        }
    .end annotation

    .line 173
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;

    .line 174
    invoke-virtual {v2}, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;->getField()Lcom/squareup/haha/perflib/Field;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/Field;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 176
    const/4 v0, 0x1

    return v0

    .line 178
    :cond_0
    goto :goto_0

    .line 179
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private static isByteArray(Ljava/lang/Object;)Z
    .locals 2

    .line 154
    instance-of v0, p0, Lcom/squareup/haha/perflib/ArrayInstance;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/squareup/haha/perflib/ArrayInstance;

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/ArrayInstance;->getArrayType()Lcom/squareup/haha/perflib/Type;

    move-result-object v0

    sget-object v1, Lcom/squareup/haha/perflib/Type;->BYTE:Lcom/squareup/haha/perflib/Type;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static isCharArray(Ljava/lang/Object;)Z
    .locals 2

    .line 150
    instance-of v0, p0, Lcom/squareup/haha/perflib/ArrayInstance;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/squareup/haha/perflib/ArrayInstance;

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/ArrayInstance;->getArrayType()Lcom/squareup/haha/perflib/Type;

    move-result-object v0

    sget-object v1, Lcom/squareup/haha/perflib/Type;->CHAR:Lcom/squareup/haha/perflib/Type;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isPrimitiveOrWrapperArray(Ljava/lang/Object;)Z
    .locals 3

    .line 139
    instance-of v0, p0, Lcom/squareup/haha/perflib/ArrayInstance;

    if-nez v0, :cond_0

    .line 140
    const/4 v0, 0x0

    return v0

    .line 142
    :cond_0
    move-object v2, p0

    check-cast v2, Lcom/squareup/haha/perflib/ArrayInstance;

    .line 143
    invoke-virtual {v2}, Lcom/squareup/haha/perflib/ArrayInstance;->getArrayType()Lcom/squareup/haha/perflib/Type;

    move-result-object v0

    sget-object v1, Lcom/squareup/haha/perflib/Type;->OBJECT:Lcom/squareup/haha/perflib/Type;

    if-eq v0, v1, :cond_1

    .line 144
    const/4 v0, 0x1

    return v0

    .line 146
    :cond_1
    sget-object v0, Lcom/squareup/leakcanary/HahaHelper;->WRAPPER_TYPES:Ljava/util/Set;

    invoke-virtual {v2}, Lcom/squareup/haha/perflib/ArrayInstance;->getClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/haha/perflib/ClassObj;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static isPrimitiveWrapper(Ljava/lang/Object;)Z
    .locals 2

    .line 132
    instance-of v0, p0, Lcom/squareup/haha/perflib/ClassInstance;

    if-nez v0, :cond_0

    .line 133
    const/4 v0, 0x0

    return v0

    .line 135
    :cond_0
    sget-object v0, Lcom/squareup/leakcanary/HahaHelper;->WRAPPER_TYPES:Ljava/util/Set;

    move-object v1, p0

    check-cast v1, Lcom/squareup/haha/perflib/ClassInstance;

    invoke-virtual {v1}, Lcom/squareup/haha/perflib/ClassInstance;->getClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/haha/perflib/ClassObj;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method static threadName(Lcom/squareup/haha/perflib/Instance;)Ljava/lang/String;
    .locals 3

    .line 55
    invoke-static {p0}, Lcom/squareup/leakcanary/HahaHelper;->classInstanceValues(Lcom/squareup/haha/perflib/Instance;)Ljava/util/List;

    move-result-object v1

    .line 56
    const-string v0, "name"

    invoke-static {v1, v0}, Lcom/squareup/leakcanary/HahaHelper;->fieldValue(Ljava/util/List;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 57
    if-nez v2, :cond_0

    .line 60
    const-string v0, "Thread name not available"

    return-object v0

    .line 62
    :cond_0
    invoke-static {v2}, Lcom/squareup/leakcanary/HahaHelper;->asString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

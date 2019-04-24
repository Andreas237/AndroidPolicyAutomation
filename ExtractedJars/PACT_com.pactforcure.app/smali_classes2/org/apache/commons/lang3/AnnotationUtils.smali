.class public Lorg/apache/commons/lang3/AnnotationUtils;
.super Ljava/lang/Object;
.source "AnnotationUtils.java"


# static fields
.field private static final TO_STRING_STYLE:Lorg/apache/commons/lang3/builder/ToStringStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 51
    new-instance v0, Lorg/apache/commons/lang3/AnnotationUtils$1;

    invoke-direct {v0}, Lorg/apache/commons/lang3/AnnotationUtils$1;-><init>()V

    sput-object v0, Lorg/apache/commons/lang3/AnnotationUtils;->TO_STRING_STYLE:Lorg/apache/commons/lang3/builder/ToStringStyle;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    return-void
.end method

.method private static annotationArrayMemberEquals([Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Z
    .locals 4
    .param p0, "a1"    # [Ljava/lang/annotation/Annotation;
    .param p1, "a2"    # [Ljava/lang/annotation/Annotation;

    .prologue
    const/4 v1, 0x0

    .line 326
    array-length v2, p0

    array-length v3, p1

    if-eq v2, v3, :cond_1

    .line 334
    :cond_0
    :goto_0
    return v1

    .line 329
    :cond_1
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    array-length v2, p0

    if-ge v0, v2, :cond_2

    .line 330
    aget-object v2, p0, v0

    aget-object v3, p1, v0

    invoke-static {v2, v3}, Lorg/apache/commons/lang3/AnnotationUtils;->equals(Ljava/lang/annotation/Annotation;Ljava/lang/annotation/Annotation;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 329
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 334
    :cond_2
    const/4 v1, 0x1

    goto :goto_0
.end method

.method private static arrayMemberEquals(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p1, "o1"    # Ljava/lang/Object;
    .param p2, "o2"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    .prologue
    .line 288
    .local p0, "componentType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {p0}, Ljava/lang/Class;->isAnnotation()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 289
    check-cast p1, [Ljava/lang/annotation/Annotation;

    .end local p1    # "o1":Ljava/lang/Object;
    check-cast p1, [Ljava/lang/annotation/Annotation;

    check-cast p2, [Ljava/lang/annotation/Annotation;

    .end local p2    # "o2":Ljava/lang/Object;
    check-cast p2, [Ljava/lang/annotation/Annotation;

    invoke-static {p1, p2}, Lorg/apache/commons/lang3/AnnotationUtils;->annotationArrayMemberEquals([Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Z

    move-result v0

    .line 315
    :goto_0
    return v0

    .line 291
    .restart local p1    # "o1":Ljava/lang/Object;
    .restart local p2    # "o2":Ljava/lang/Object;
    :cond_0
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 292
    check-cast p1, [B

    .end local p1    # "o1":Ljava/lang/Object;
    check-cast p1, [B

    check-cast p2, [B

    .end local p2    # "o2":Ljava/lang/Object;
    check-cast p2, [B

    invoke-static {p1, p2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    goto :goto_0

    .line 294
    .restart local p1    # "o1":Ljava/lang/Object;
    .restart local p2    # "o2":Ljava/lang/Object;
    :cond_1
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 295
    check-cast p1, [S

    .end local p1    # "o1":Ljava/lang/Object;
    check-cast p1, [S

    check-cast p2, [S

    .end local p2    # "o2":Ljava/lang/Object;
    check-cast p2, [S

    invoke-static {p1, p2}, Ljava/util/Arrays;->equals([S[S)Z

    move-result v0

    goto :goto_0

    .line 297
    .restart local p1    # "o1":Ljava/lang/Object;
    .restart local p2    # "o2":Ljava/lang/Object;
    :cond_2
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 298
    check-cast p1, [I

    .end local p1    # "o1":Ljava/lang/Object;
    check-cast p1, [I

    check-cast p2, [I

    .end local p2    # "o2":Ljava/lang/Object;
    check-cast p2, [I

    invoke-static {p1, p2}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v0

    goto :goto_0

    .line 300
    .restart local p1    # "o1":Ljava/lang/Object;
    .restart local p2    # "o2":Ljava/lang/Object;
    :cond_3
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 301
    check-cast p1, [C

    .end local p1    # "o1":Ljava/lang/Object;
    check-cast p1, [C

    check-cast p2, [C

    .end local p2    # "o2":Ljava/lang/Object;
    check-cast p2, [C

    invoke-static {p1, p2}, Ljava/util/Arrays;->equals([C[C)Z

    move-result v0

    goto :goto_0

    .line 303
    .restart local p1    # "o1":Ljava/lang/Object;
    .restart local p2    # "o2":Ljava/lang/Object;
    :cond_4
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 304
    check-cast p1, [J

    .end local p1    # "o1":Ljava/lang/Object;
    check-cast p1, [J

    check-cast p2, [J

    .end local p2    # "o2":Ljava/lang/Object;
    check-cast p2, [J

    invoke-static {p1, p2}, Ljava/util/Arrays;->equals([J[J)Z

    move-result v0

    goto :goto_0

    .line 306
    .restart local p1    # "o1":Ljava/lang/Object;
    .restart local p2    # "o2":Ljava/lang/Object;
    :cond_5
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 307
    check-cast p1, [F

    .end local p1    # "o1":Ljava/lang/Object;
    check-cast p1, [F

    check-cast p2, [F

    .end local p2    # "o2":Ljava/lang/Object;
    check-cast p2, [F

    invoke-static {p1, p2}, Ljava/util/Arrays;->equals([F[F)Z

    move-result v0

    goto :goto_0

    .line 309
    .restart local p1    # "o1":Ljava/lang/Object;
    .restart local p2    # "o2":Ljava/lang/Object;
    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 310
    check-cast p1, [D

    .end local p1    # "o1":Ljava/lang/Object;
    check-cast p1, [D

    check-cast p2, [D

    .end local p2    # "o2":Ljava/lang/Object;
    check-cast p2, [D

    invoke-static {p1, p2}, Ljava/util/Arrays;->equals([D[D)Z

    move-result v0

    goto/16 :goto_0

    .line 312
    .restart local p1    # "o1":Ljava/lang/Object;
    .restart local p2    # "o2":Ljava/lang/Object;
    :cond_7
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 313
    check-cast p1, [Z

    .end local p1    # "o1":Ljava/lang/Object;
    check-cast p1, [Z

    check-cast p2, [Z

    .end local p2    # "o2":Ljava/lang/Object;
    check-cast p2, [Z

    invoke-static {p1, p2}, Ljava/util/Arrays;->equals([Z[Z)Z

    move-result v0

    goto/16 :goto_0

    .line 315
    .restart local p1    # "o1":Ljava/lang/Object;
    .restart local p2    # "o2":Ljava/lang/Object;
    :cond_8
    check-cast p1, [Ljava/lang/Object;

    .end local p1    # "o1":Ljava/lang/Object;
    check-cast p1, [Ljava/lang/Object;

    check-cast p2, [Ljava/lang/Object;

    .end local p2    # "o2":Ljava/lang/Object;
    check-cast p2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v0

    goto/16 :goto_0
.end method

.method private static arrayMemberHash(Ljava/lang/Class;Ljava/lang/Object;)I
    .locals 1
    .param p1, "o"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/Object;",
            ")I"
        }
    .end annotation

    .prologue
    .line 345
    .local p0, "componentType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 346
    check-cast p1, [B

    .end local p1    # "o":Ljava/lang/Object;
    check-cast p1, [B

    invoke-static {p1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    .line 369
    :goto_0
    return v0

    .line 348
    .restart local p1    # "o":Ljava/lang/Object;
    :cond_0
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 349
    check-cast p1, [S

    .end local p1    # "o":Ljava/lang/Object;
    check-cast p1, [S

    invoke-static {p1}, Ljava/util/Arrays;->hashCode([S)I

    move-result v0

    goto :goto_0

    .line 351
    .restart local p1    # "o":Ljava/lang/Object;
    :cond_1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 352
    check-cast p1, [I

    .end local p1    # "o":Ljava/lang/Object;
    check-cast p1, [I

    invoke-static {p1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v0

    goto :goto_0

    .line 354
    .restart local p1    # "o":Ljava/lang/Object;
    :cond_2
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 355
    check-cast p1, [C

    .end local p1    # "o":Ljava/lang/Object;
    check-cast p1, [C

    invoke-static {p1}, Ljava/util/Arrays;->hashCode([C)I

    move-result v0

    goto :goto_0

    .line 357
    .restart local p1    # "o":Ljava/lang/Object;
    :cond_3
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 358
    check-cast p1, [J

    .end local p1    # "o":Ljava/lang/Object;
    check-cast p1, [J

    invoke-static {p1}, Ljava/util/Arrays;->hashCode([J)I

    move-result v0

    goto :goto_0

    .line 360
    .restart local p1    # "o":Ljava/lang/Object;
    :cond_4
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 361
    check-cast p1, [F

    .end local p1    # "o":Ljava/lang/Object;
    check-cast p1, [F

    invoke-static {p1}, Ljava/util/Arrays;->hashCode([F)I

    move-result v0

    goto :goto_0

    .line 363
    .restart local p1    # "o":Ljava/lang/Object;
    :cond_5
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 364
    check-cast p1, [D

    .end local p1    # "o":Ljava/lang/Object;
    check-cast p1, [D

    invoke-static {p1}, Ljava/util/Arrays;->hashCode([D)I

    move-result v0

    goto :goto_0

    .line 366
    .restart local p1    # "o":Ljava/lang/Object;
    :cond_6
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 367
    check-cast p1, [Z

    .end local p1    # "o":Ljava/lang/Object;
    check-cast p1, [Z

    invoke-static {p1}, Ljava/util/Arrays;->hashCode([Z)I

    move-result v0

    goto :goto_0

    .line 369
    .restart local p1    # "o":Ljava/lang/Object;
    :cond_7
    check-cast p1, [Ljava/lang/Object;

    .end local p1    # "o":Ljava/lang/Object;
    check-cast p1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    goto :goto_0
.end method

.method public static equals(Ljava/lang/annotation/Annotation;Ljava/lang/annotation/Annotation;)Z
    .locals 13
    .param p0, "a1"    # Ljava/lang/annotation/Annotation;
    .param p1, "a2"    # Ljava/lang/annotation/Annotation;

    .prologue
    const/4 v9, 0x1

    const/4 v10, 0x0

    .line 123
    if-ne p0, p1, :cond_1

    .line 152
    :cond_0
    :goto_0
    return v9

    .line 126
    :cond_1
    if-eqz p0, :cond_2

    if-nez p1, :cond_3

    :cond_2
    move v9, v10

    .line 127
    goto :goto_0

    .line 129
    :cond_3
    invoke-interface {p0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v5

    .line 130
    .local v5, "type":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    invoke-interface {p1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v6

    .line 131
    .local v6, "type2":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    const-string v11, "Annotation %s with null annotationType()"

    new-array v12, v9, [Ljava/lang/Object;

    aput-object p0, v12, v10

    invoke-static {v5, v11, v12}, Lorg/apache/commons/lang3/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    const-string v11, "Annotation %s with null annotationType()"

    new-array v12, v9, [Ljava/lang/Object;

    aput-object p1, v12, v10

    invoke-static {v6, v11, v12}, Lorg/apache/commons/lang3/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_4

    move v9, v10

    .line 134
    goto :goto_0

    .line 137
    :cond_4
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/reflect/Method;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_1
    if-ge v2, v3, :cond_0

    aget-object v4, v0, v2

    .line 138
    .local v4, "m":Ljava/lang/reflect/Method;
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    array-length v11, v11

    if-nez v11, :cond_5

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v11

    invoke-static {v11}, Lorg/apache/commons/lang3/AnnotationUtils;->isValidAnnotationMemberType(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_5

    .line 140
    const/4 v11, 0x0

    new-array v11, v11, [Ljava/lang/Object;

    invoke-virtual {v4, p0, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    .line 141
    .local v7, "v1":Ljava/lang/Object;
    const/4 v11, 0x0

    new-array v11, v11, [Ljava/lang/Object;

    invoke-virtual {v4, p1, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    .line 142
    .local v8, "v2":Ljava/lang/Object;
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v11

    invoke-static {v11, v7, v8}, Lorg/apache/commons/lang3/AnnotationUtils;->memberEquals(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v11

    if-nez v11, :cond_5

    move v9, v10

    .line 143
    goto :goto_0

    .line 137
    .end local v7    # "v1":Ljava/lang/Object;
    .end local v8    # "v2":Ljava/lang/Object;
    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 147
    .end local v0    # "arr$":[Ljava/lang/reflect/Method;
    .end local v2    # "i$":I
    .end local v3    # "len$":I
    .end local v4    # "m":Ljava/lang/reflect/Method;
    :catch_0
    move-exception v1

    .local v1, "ex":Ljava/lang/IllegalAccessException;
    move v9, v10

    .line 148
    goto :goto_0

    .line 149
    .end local v1    # "ex":Ljava/lang/IllegalAccessException;
    :catch_1
    move-exception v1

    .local v1, "ex":Ljava/lang/reflect/InvocationTargetException;
    move v9, v10

    .line 150
    goto :goto_0
.end method

.method public static hashCode(Ljava/lang/annotation/Annotation;)I
    .locals 12
    .param p0, "a"    # Ljava/lang/annotation/Annotation;

    .prologue
    .line 168
    const/4 v5, 0x0

    .line 169
    .local v5, "result":I
    invoke-interface {p0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v6

    .line 170
    .local v6, "type":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/reflect/Method;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v4, v0, v2

    .line 172
    .local v4, "m":Ljava/lang/reflect/Method;
    const/4 v8, 0x0

    :try_start_0
    new-array v8, v8, [Ljava/lang/Object;

    invoke-virtual {v4, p0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    .line 173
    .local v7, "value":Ljava/lang/Object;
    if-nez v7, :cond_0

    .line 174
    new-instance v8, Ljava/lang/IllegalStateException;

    const-string v9, "Annotation method %s returned null"

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v4, v10, v11

    invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v8
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 178
    .end local v7    # "value":Ljava/lang/Object;
    :catch_0
    move-exception v1

    .line 179
    .local v1, "ex":Ljava/lang/RuntimeException;
    throw v1

    .line 177
    .end local v1    # "ex":Ljava/lang/RuntimeException;
    .restart local v7    # "value":Ljava/lang/Object;
    :cond_0
    :try_start_1
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v7}, Lorg/apache/commons/lang3/AnnotationUtils;->hashMember(Ljava/lang/String;Ljava/lang/Object;)I
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v8

    add-int/2addr v5, v8

    .line 170
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 180
    .end local v7    # "value":Ljava/lang/Object;
    :catch_1
    move-exception v1

    .line 181
    .local v1, "ex":Ljava/lang/Exception;
    new-instance v8, Ljava/lang/RuntimeException;

    invoke-direct {v8, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v8

    .line 184
    .end local v1    # "ex":Ljava/lang/Exception;
    .end local v4    # "m":Ljava/lang/reflect/Method;
    :cond_1
    return v5
.end method

.method private static hashMember(Ljava/lang/String;Ljava/lang/Object;)I
    .locals 2
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "value"    # Ljava/lang/Object;

    .prologue
    .line 243
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    mul-int/lit8 v0, v1, 0x7f

    .line 244
    .local v0, "part1":I
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 245
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1, p1}, Lorg/apache/commons/lang3/AnnotationUtils;->arrayMemberHash(Ljava/lang/Class;Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    .line 250
    .end local p1    # "value":Ljava/lang/Object;
    :goto_0
    return v1

    .line 247
    .restart local p1    # "value":Ljava/lang/Object;
    :cond_0
    instance-of v1, p1, Ljava/lang/annotation/Annotation;

    if-eqz v1, :cond_1

    .line 248
    check-cast p1, Ljava/lang/annotation/Annotation;

    .end local p1    # "value":Ljava/lang/Object;
    invoke-static {p1}, Lorg/apache/commons/lang3/AnnotationUtils;->hashCode(Ljava/lang/annotation/Annotation;)I

    move-result v1

    xor-int/2addr v1, v0

    goto :goto_0

    .line 250
    .restart local p1    # "value":Ljava/lang/Object;
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v1, v0

    goto :goto_0
.end method

.method public static isValidAnnotationMemberType(Ljava/lang/Class;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .local p0, "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const/4 v0, 0x0

    .line 224
    if-nez p0, :cond_1

    .line 230
    :cond_0
    :goto_0
    return v0

    .line 227
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 228
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p0

    .line 230
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p0}, Ljava/lang/Class;->isAnnotation()Z

    move-result v1

    if-nez v1, :cond_3

    const-class v1, Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-class v1, Ljava/lang/Class;

    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_3
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private static memberEquals(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p1, "o1"    # Ljava/lang/Object;
    .param p2, "o2"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    .prologue
    .line 264
    .local p0, "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    if-ne p1, p2, :cond_0

    .line 265
    const/4 v0, 0x1

    .line 276
    .end local p1    # "o1":Ljava/lang/Object;
    .end local p2    # "o2":Ljava/lang/Object;
    :goto_0
    return v0

    .line 267
    .restart local p1    # "o1":Ljava/lang/Object;
    .restart local p2    # "o2":Ljava/lang/Object;
    :cond_0
    if-eqz p1, :cond_1

    if-nez p2, :cond_2

    .line 268
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 270
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 271
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lorg/apache/commons/lang3/AnnotationUtils;->arrayMemberEquals(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 273
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->isAnnotation()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 274
    check-cast p1, Ljava/lang/annotation/Annotation;

    .end local p1    # "o1":Ljava/lang/Object;
    check-cast p2, Ljava/lang/annotation/Annotation;

    .end local p2    # "o2":Ljava/lang/Object;
    invoke-static {p1, p2}, Lorg/apache/commons/lang3/AnnotationUtils;->equals(Ljava/lang/annotation/Annotation;Ljava/lang/annotation/Annotation;)Z

    move-result v0

    goto :goto_0

    .line 276
    .restart local p1    # "o1":Ljava/lang/Object;
    .restart local p2    # "o2":Ljava/lang/Object;
    :cond_4
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public static toString(Ljava/lang/annotation/Annotation;)Ljava/lang/String;
    .locals 8
    .param p0, "a"    # Ljava/lang/annotation/Annotation;

    .prologue
    .line 196
    new-instance v1, Lorg/apache/commons/lang3/builder/ToStringBuilder;

    sget-object v6, Lorg/apache/commons/lang3/AnnotationUtils;->TO_STRING_STYLE:Lorg/apache/commons/lang3/builder/ToStringStyle;

    invoke-direct {v1, p0, v6}, Lorg/apache/commons/lang3/builder/ToStringBuilder;-><init>(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;)V

    .line 197
    .local v1, "builder":Lorg/apache/commons/lang3/builder/ToStringBuilder;
    invoke-interface {p0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/reflect/Method;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_0
    if-ge v3, v4, :cond_1

    aget-object v5, v0, v3

    .line 198
    .local v5, "m":Ljava/lang/reflect/Method;
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v6

    array-length v6, v6

    if-lez v6, :cond_0

    .line 197
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 202
    :cond_0
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    invoke-virtual {v5, p0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Lorg/apache/commons/lang3/builder/ToStringBuilder;->append(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/ToStringBuilder;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    .line 203
    :catch_0
    move-exception v2

    .line 204
    .local v2, "ex":Ljava/lang/RuntimeException;
    throw v2

    .line 205
    .end local v2    # "ex":Ljava/lang/RuntimeException;
    :catch_1
    move-exception v2

    .line 206
    .local v2, "ex":Ljava/lang/Exception;
    new-instance v6, Ljava/lang/RuntimeException;

    invoke-direct {v6, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v6

    .line 209
    .end local v2    # "ex":Ljava/lang/Exception;
    .end local v5    # "m":Ljava/lang/reflect/Method;
    :cond_1
    invoke-virtual {v1}, Lorg/apache/commons/lang3/builder/ToStringBuilder;->build()Ljava/lang/String;

    move-result-object v6

    return-object v6
.end method

.class public Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;
.super Lorg/apache/commons/lang3/builder/ToStringBuilder;
.source "ReflectionToStringBuilder.java"


# instance fields
.field private appendStatics:Z

.field private appendTransients:Z

.field protected excludeFieldNames:[Ljava/lang/String;

.field private excludeNullValues:Z

.field private upToClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 482
    invoke-static {p1}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/apache/commons/lang3/builder/ToStringBuilder;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 443
    iput-boolean p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->appendStatics:Z

    .line 448
    iput-boolean p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->appendTransients:Z

    const/4 p1, 0x0

    .line 465
    iput-object p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->upToClass:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;)V
    .locals 0

    .line 502
    invoke-static {p1}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lorg/apache/commons/lang3/builder/ToStringBuilder;-><init>(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;)V

    const/4 p1, 0x0

    .line 443
    iput-boolean p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->appendStatics:Z

    .line 448
    iput-boolean p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->appendTransients:Z

    const/4 p1, 0x0

    .line 465
    iput-object p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->upToClass:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;Ljava/lang/StringBuffer;)V
    .locals 0

    .line 528
    invoke-static {p1}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Lorg/apache/commons/lang3/builder/ToStringBuilder;-><init>(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;Ljava/lang/StringBuffer;)V

    const/4 p1, 0x0

    .line 443
    iput-boolean p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->appendStatics:Z

    .line 448
    iput-boolean p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->appendTransients:Z

    const/4 p1, 0x0

    .line 465
    iput-object p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->upToClass:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;Ljava/lang/StringBuffer;Ljava/lang/Class;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lorg/apache/commons/lang3/builder/ToStringStyle;",
            "Ljava/lang/StringBuffer;",
            "Ljava/lang/Class<",
            "-TT;>;ZZ)V"
        }
    .end annotation

    .line 553
    invoke-static {p1}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Lorg/apache/commons/lang3/builder/ToStringBuilder;-><init>(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;Ljava/lang/StringBuffer;)V

    const/4 p1, 0x0

    .line 443
    iput-boolean p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->appendStatics:Z

    .line 448
    iput-boolean p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->appendTransients:Z

    const/4 p1, 0x0

    .line 465
    iput-object p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->upToClass:Ljava/lang/Class;

    .line 554
    invoke-virtual {p0, p4}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->setUpToClass(Ljava/lang/Class;)V

    .line 555
    invoke-virtual {p0, p5}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->setAppendTransients(Z)V

    .line 556
    invoke-virtual {p0, p6}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->setAppendStatics(Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;Ljava/lang/StringBuffer;Ljava/lang/Class;ZZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lorg/apache/commons/lang3/builder/ToStringStyle;",
            "Ljava/lang/StringBuffer;",
            "Ljava/lang/Class<",
            "-TT;>;ZZZ)V"
        }
    .end annotation

    .line 584
    invoke-static {p1}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Lorg/apache/commons/lang3/builder/ToStringBuilder;-><init>(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;Ljava/lang/StringBuffer;)V

    const/4 p1, 0x0

    .line 443
    iput-boolean p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->appendStatics:Z

    .line 448
    iput-boolean p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->appendTransients:Z

    const/4 p1, 0x0

    .line 465
    iput-object p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->upToClass:Ljava/lang/Class;

    .line 585
    invoke-virtual {p0, p4}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->setUpToClass(Ljava/lang/Class;)V

    .line 586
    invoke-virtual {p0, p5}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->setAppendTransients(Z)V

    .line 587
    invoke-virtual {p0, p6}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->setAppendStatics(Z)V

    .line 588
    invoke-virtual {p0, p7}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->setExcludeNullValues(Z)V

    return-void
.end method

.method private static checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "The Object passed in should not be null."

    .line 436
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Lorg/apache/commons/lang3/Validate;->isTrue(ZLjava/lang/String;[Ljava/lang/Object;)V

    return-object p0
.end method

.method static toNoNullStringArray(Ljava/util/Collection;)[Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)[",
            "Ljava/lang/String;"
        }
    .end annotation

    if-nez p0, :cond_0

    .line 397
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    return-object p0

    .line 399
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->toNoNullStringArray([Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static toNoNullStringArray([Ljava/lang/Object;)[Ljava/lang/String;
    .locals 4

    .line 412
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 413
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    if-eqz v3, :cond_0

    .line 415
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 418
    :cond_1
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    invoke-interface {v0, p0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    return-object p0
.end method

.method public static toString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 129
    invoke-static {p0, v1, v0, v0, v1}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->toString(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;ZZLjava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toString(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 164
    invoke-static {p0, p1, v0, v0, v1}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->toString(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;ZZLjava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toString(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;Z)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 205
    invoke-static {p0, p1, p2, v0, v1}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->toString(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;ZZLjava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toString(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;ZZ)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 254
    invoke-static {p0, p1, p2, p3, v0}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->toString(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;ZZLjava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toString(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;ZZLjava/lang/Class;)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lorg/apache/commons/lang3/builder/ToStringStyle;",
            "ZZ",
            "Ljava/lang/Class<",
            "-TT;>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 310
    new-instance v7, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;

    const/4 v3, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v4, p4

    move v5, p2

    move v6, p3

    invoke-direct/range {v0 .. v6}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;-><init>(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;Ljava/lang/StringBuffer;Ljava/lang/Class;ZZ)V

    .line 311
    invoke-virtual {v7}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toString(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;ZZZLjava/lang/Class;)Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lorg/apache/commons/lang3/builder/ToStringStyle;",
            "ZZZ",
            "Ljava/lang/Class<",
            "-TT;>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 369
    new-instance v8, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;

    const/4 v3, 0x0

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v4, p5

    move v5, p2

    move v6, p3

    move v7, p4

    invoke-direct/range {v0 .. v7}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;-><init>(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;Ljava/lang/StringBuffer;Ljava/lang/Class;ZZZ)V

    .line 370
    invoke-virtual {v8}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toStringExclude(Ljava/lang/Object;Ljava/util/Collection;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 383
    invoke-static {p1}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->toNoNullStringArray(Ljava/util/Collection;)[Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->toStringExclude(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static varargs toStringExclude(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 432
    new-instance v0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;

    invoke-direct {v0, p0}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->setExcludeFieldNames([Ljava/lang/String;)Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected accept(Ljava/lang/reflect/Field;)Z
    .locals 3

    .line 604
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x24

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    return v1

    .line 608
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->isAppendTransients()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 612
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->isAppendStatics()Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    .line 616
    :cond_2
    iget-object v0, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->excludeFieldNames:[Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 617
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_3

    return v1

    .line 621
    :cond_3
    const-class v0, Lorg/apache/commons/lang3/builder/ToStringExclude;

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method protected appendFieldsIn(Ljava/lang/Class;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 638
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 639
    invoke-virtual {p0}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->getObject()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->reflectionAppendArray(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;

    return-void

    .line 642
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object p1

    const/4 v0, 0x1

    .line 643
    invoke-static {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible([Ljava/lang/reflect/AccessibleObject;Z)V

    .line 644
    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_4

    aget-object v4, p1, v3

    .line 645
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v5

    .line 646
    invoke-virtual {p0, v4}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->accept(Ljava/lang/reflect/Field;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 650
    :try_start_0
    invoke-virtual {p0, v4}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->getValue(Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v6

    .line 651
    iget-boolean v7, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->excludeNullValues:Z

    if-eqz v7, :cond_1

    if-eqz v6, :cond_3

    .line 652
    :cond_1
    const-class v7, Lorg/apache/commons/lang3/builder/ToStringSummary;

    invoke-virtual {v4, v7}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v4

    if-nez v4, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {p0, v5, v6, v4}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->append(Ljava/lang/String;Ljava/lang/Object;Z)Lorg/apache/commons/lang3/builder/ToStringBuilder;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 659
    new-instance v0, Ljava/lang/InternalError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected IllegalAccessException: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/IllegalAccessException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public getExcludeFieldNames()[Ljava/lang/String;
    .locals 1

    .line 669
    iget-object v0, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->excludeFieldNames:[Ljava/lang/String;

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public getUpToClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 680
    iget-object v0, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->upToClass:Ljava/lang/Class;

    return-object v0
.end method

.method protected getValue(Ljava/lang/reflect/Field;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 700
    invoke-virtual {p0}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->getObject()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isAppendStatics()Z
    .locals 1

    .line 712
    iget-boolean v0, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->appendStatics:Z

    return v0
.end method

.method public isAppendTransients()Z
    .locals 1

    .line 723
    iget-boolean v0, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->appendTransients:Z

    return v0
.end method

.method public isExcludeNullValues()Z
    .locals 1

    .line 735
    iget-boolean v0, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->excludeNullValues:Z

    return v0
.end method

.method public reflectionAppendArray(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;
    .locals 3

    .line 748
    invoke-virtual {p0}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->getStyle()Lorg/apache/commons/lang3/builder/ToStringStyle;

    move-result-object v0

    invoke-virtual {p0}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->getStringBuffer()Ljava/lang/StringBuffer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Lorg/apache/commons/lang3/builder/ToStringStyle;->reflectionAppendArrayDetail(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0
.end method

.method public setAppendStatics(Z)V
    .locals 0

    .line 762
    iput-boolean p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->appendStatics:Z

    return-void
.end method

.method public setAppendTransients(Z)V
    .locals 0

    .line 774
    iput-boolean p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->appendTransients:Z

    return-void
.end method

.method public varargs setExcludeFieldNames([Ljava/lang/String;)Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 799
    iput-object p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->excludeFieldNames:[Ljava/lang/String;

    goto :goto_0

    .line 802
    :cond_0
    invoke-static {p1}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->toNoNullStringArray([Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->excludeFieldNames:[Ljava/lang/String;

    .line 803
    iget-object p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->excludeFieldNames:[Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    :goto_0
    return-object p0
.end method

.method public setExcludeNullValues(Z)V
    .locals 0

    .line 787
    iput-boolean p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->excludeNullValues:Z

    return-void
.end method

.method public setUpToClass(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 818
    invoke-virtual {p0}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->getObject()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 819
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 820
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Specified class is not a superclass of the object"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 823
    :cond_1
    :goto_0
    iput-object p1, p0, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->upToClass:Ljava/lang/Class;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 835
    invoke-virtual {p0}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->getObject()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 836
    invoke-virtual {p0}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->getStyle()Lorg/apache/commons/lang3/builder/ToStringStyle;

    move-result-object v0

    invoke-virtual {v0}, Lorg/apache/commons/lang3/builder/ToStringStyle;->getNullText()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 838
    :cond_0
    invoke-virtual {p0}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->getObject()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 839
    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->appendFieldsIn(Ljava/lang/Class;)V

    .line 840
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->getUpToClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    .line 841
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    .line 842
    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->appendFieldsIn(Ljava/lang/Class;)V

    goto :goto_0

    .line 844
    :cond_1
    invoke-super {p0}, Lorg/apache/commons/lang3/builder/ToStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

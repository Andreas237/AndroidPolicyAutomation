.class public abstract Lcom/ibotta/android/graphql/mapper/BaseMapper;
.super Ljava/lang/Object;
.source "BaseMapper.java"

# interfaces
.implements Lcom/ibotta/android/graphql/mapper/Mapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        "O:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/graphql/mapper/Mapper<",
        "TI;TO;>;"
    }
.end annotation


# instance fields
.field private final formatting:Lcom/ibotta/android/util/Formatting;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/graphql/mapper/BaseMapper;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method

.method static synthetic lambda$asDouble$3(Ljava/lang/Number;)Ljava/lang/Double;
    .locals 2

    .line 38
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$asFloat$1(Ljava/lang/Number;)Ljava/lang/Float;
    .locals 0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$asInt$2(Ljava/lang/Number;)Ljava/lang/Integer;
    .locals 0

    .line 34
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$asLong$4(Ljava/lang/Number;)Ljava/lang/Long;
    .locals 2

    .line 42
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$asShort$0(Ljava/lang/Number;)Ljava/lang/Short;
    .locals 0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Number;->shortValue()S

    move-result p0

    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected asBoolean(Ljava/lang/Boolean;)Z
    .locals 1

    const/4 v0, 0x0

    .line 46
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method protected asDate(Ljava/lang/String;)Ljava/util/Date;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/BaseMapper;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Formatting;->fromServerDateString(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method

.method protected asDouble(Ljava/lang/Number;)D
    .locals 2

    const-wide/16 v0, 0x0

    .line 38
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/graphql/mapper/-$$Lambda$BaseMapper$b1L6GaeD2P4N448Xlxz4U0sjNj4;

    invoke-direct {v1, p1}, Lcom/ibotta/android/graphql/mapper/-$$Lambda$BaseMapper$b1L6GaeD2P4N448Xlxz4U0sjNj4;-><init>(Ljava/lang/Number;)V

    invoke-static {p1, v0, v1}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;Ljava9/util/function/Supplier;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method protected asFloat(Ljava/lang/Number;)F
    .locals 2

    const/4 v0, 0x0

    .line 30
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/graphql/mapper/-$$Lambda$BaseMapper$8Yc24V7M6hnH5OOMk-ftg4p-MvU;

    invoke-direct {v1, p1}, Lcom/ibotta/android/graphql/mapper/-$$Lambda$BaseMapper$8Yc24V7M6hnH5OOMk-ftg4p-MvU;-><init>(Ljava/lang/Number;)V

    invoke-static {p1, v0, v1}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;Ljava9/util/function/Supplier;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    return p1
.end method

.method protected asFloatSet(Ljava/util/Collection;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Double;",
            ">;)",
            "Ljava/util/Set<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 83
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    return-object p1

    .line 86
    :cond_0
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 87
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    .line 88
    invoke-virtual {v1}, Ljava/lang/Double;->floatValue()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method protected asInt(Ljava/lang/Number;)I
    .locals 2

    const/4 v0, 0x0

    .line 34
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/graphql/mapper/-$$Lambda$BaseMapper$X3OiAtVPJMs9TnGmf3SfP_Pw0qI;

    invoke-direct {v1, p1}, Lcom/ibotta/android/graphql/mapper/-$$Lambda$BaseMapper$X3OiAtVPJMs9TnGmf3SfP_Pw0qI;-><init>(Ljava/lang/Number;)V

    invoke-static {p1, v0, v1}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;Ljava9/util/function/Supplier;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method protected asInt(Ljava/lang/String;)I
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 56
    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to parse int String: %1$s"

    const/4 v3, 0x1

    .line 58
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v0

    invoke-static {v1, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return v0
.end method

.method protected asIntegerSet(Ljava/util/Collection;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 70
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    return-object p1

    .line 73
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 74
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    .line 75
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->intValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method protected asLong(Ljava/lang/Number;)J
    .locals 2

    const-wide/16 v0, 0x0

    .line 42
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/graphql/mapper/-$$Lambda$BaseMapper$9kwpPQSxTc3J3bV8FJRjKsgiOiM;

    invoke-direct {v1, p1}, Lcom/ibotta/android/graphql/mapper/-$$Lambda$BaseMapper$9kwpPQSxTc3J3bV8FJRjKsgiOiM;-><init>(Ljava/lang/Number;)V

    invoke-static {p1, v0, v1}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;Ljava9/util/function/Supplier;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method protected asShort(Ljava/lang/Number;)S
    .locals 2

    const/4 v0, 0x0

    .line 26
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/graphql/mapper/-$$Lambda$BaseMapper$X9PrX-BmLuvgZO71LOoKQUbgPjo;

    invoke-direct {v1, p1}, Lcom/ibotta/android/graphql/mapper/-$$Lambda$BaseMapper$X9PrX-BmLuvgZO71LOoKQUbgPjo;-><init>(Ljava/lang/Number;)V

    invoke-static {p1, v0, v1}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;Ljava9/util/function/Supplier;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Short;

    invoke-virtual {p1}, Ljava/lang/Short;->shortValue()S

    move-result p1

    return p1
.end method

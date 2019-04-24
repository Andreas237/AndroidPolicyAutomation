.class public final Ljava9/util/stream/Collectors;
.super Ljava/lang/Object;
.source "Collectors.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljava9/util/stream/Collectors$CollectorImpl;
    }
.end annotation


# static fields
.field static final CH_CONCURRENT_ID:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava9/util/stream/Collector$Characteristics;",
            ">;"
        }
    .end annotation
.end field

.field static final CH_CONCURRENT_NOID:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava9/util/stream/Collector$Characteristics;",
            ">;"
        }
    .end annotation
.end field

.field static final CH_ID:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava9/util/stream/Collector$Characteristics;",
            ">;"
        }
    .end annotation
.end field

.field static final CH_NOID:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava9/util/stream/Collector$Characteristics;",
            ">;"
        }
    .end annotation
.end field

.field static final CH_UNORDERED_ID:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava9/util/stream/Collector$Characteristics;",
            ">;"
        }
    .end annotation
.end field

.field static final CH_UNORDERED_NOID:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava9/util/stream/Collector$Characteristics;",
            ">;"
        }
    .end annotation
.end field

.field static final DBL_SUM_STATS:Ljava9/util/function/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/function/Supplier<",
            "Ljava9/util/DoubleSummaryStatistics;",
            ">;"
        }
    .end annotation
.end field

.field static final INT_SUM_STATS:Ljava9/util/function/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/function/Supplier<",
            "Ljava9/util/IntSummaryStatistics;",
            ">;"
        }
    .end annotation
.end field

.field private static final LIST_ADD:Ljava9/util/function/BiConsumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/function/BiConsumer<",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;*>;"
        }
    .end annotation
.end field

.field static final LNG_SUM_STATS:Ljava9/util/function/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/function/Supplier<",
            "Ljava9/util/LongSummaryStatistics;",
            ">;"
        }
    .end annotation
.end field

.field private static final SET_ADD:Ljava9/util/function/BiConsumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/function/BiConsumer<",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;*>;"
        }
    .end annotation
.end field

.field private static final UNMOD_MAP_FINISHER:Ljava9/util/function/Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/function/Function<",
            "Ljava/util/Map<",
            "**>;",
            "Ljava/util/Map<",
            "**>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 111
    sget-object v0, Ljava9/util/stream/Collector$Characteristics;->CONCURRENT:Ljava9/util/stream/Collector$Characteristics;

    sget-object v1, Ljava9/util/stream/Collector$Characteristics;->UNORDERED:Ljava9/util/stream/Collector$Characteristics;

    sget-object v2, Ljava9/util/stream/Collector$Characteristics;->IDENTITY_FINISH:Ljava9/util/stream/Collector$Characteristics;

    .line 112
    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ljava9/util/stream/Collectors;->CH_CONCURRENT_ID:Ljava/util/Set;

    .line 115
    sget-object v0, Ljava9/util/stream/Collector$Characteristics;->CONCURRENT:Ljava9/util/stream/Collector$Characteristics;

    sget-object v1, Ljava9/util/stream/Collector$Characteristics;->UNORDERED:Ljava9/util/stream/Collector$Characteristics;

    .line 116
    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ljava9/util/stream/Collectors;->CH_CONCURRENT_NOID:Ljava/util/Set;

    .line 118
    sget-object v0, Ljava9/util/stream/Collector$Characteristics;->IDENTITY_FINISH:Ljava9/util/stream/Collector$Characteristics;

    .line 119
    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ljava9/util/stream/Collectors;->CH_ID:Ljava/util/Set;

    .line 120
    sget-object v0, Ljava9/util/stream/Collector$Characteristics;->UNORDERED:Ljava9/util/stream/Collector$Characteristics;

    sget-object v1, Ljava9/util/stream/Collector$Characteristics;->IDENTITY_FINISH:Ljava9/util/stream/Collector$Characteristics;

    .line 121
    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ljava9/util/stream/Collectors;->CH_UNORDERED_ID:Ljava/util/Set;

    .line 123
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ljava9/util/stream/Collectors;->CH_NOID:Ljava/util/Set;

    .line 124
    sget-object v0, Ljava9/util/stream/Collector$Characteristics;->UNORDERED:Ljava9/util/stream/Collector$Characteristics;

    .line 125
    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ljava9/util/stream/Collectors;->CH_UNORDERED_NOID:Ljava/util/Set;

    .line 129
    sget-object v0, Ljava9/util/stream/-$$Lambda$KE2B7nQsvPwODd-wfH4mrXzcBAc;->INSTANCE:Ljava9/util/stream/-$$Lambda$KE2B7nQsvPwODd-wfH4mrXzcBAc;

    sput-object v0, Ljava9/util/stream/Collectors;->DBL_SUM_STATS:Ljava9/util/function/Supplier;

    .line 130
    sget-object v0, Ljava9/util/stream/-$$Lambda$Uy0-CdjYOdxkpaO5FJ2C62-Yrjs;->INSTANCE:Ljava9/util/stream/-$$Lambda$Uy0-CdjYOdxkpaO5FJ2C62-Yrjs;

    sput-object v0, Ljava9/util/stream/Collectors;->INT_SUM_STATS:Ljava9/util/function/Supplier;

    .line 131
    sget-object v0, Ljava9/util/stream/-$$Lambda$yXy-BmNbaoa6HDFtyCZZMoivylY;->INSTANCE:Ljava9/util/stream/-$$Lambda$yXy-BmNbaoa6HDFtyCZZMoivylY;

    sput-object v0, Ljava9/util/stream/Collectors;->LNG_SUM_STATS:Ljava9/util/function/Supplier;

    .line 155
    sget-object v0, Ljava9/util/stream/-$$Lambda$Collectors$hGUF7ttg4IJCEWYyjbN7q9noQnQ;->INSTANCE:Ljava9/util/stream/-$$Lambda$Collectors$hGUF7ttg4IJCEWYyjbN7q9noQnQ;

    sput-object v0, Ljava9/util/stream/Collectors;->UNMOD_MAP_FINISHER:Ljava9/util/function/Function;

    .line 163
    sget-object v0, Ljava9/util/stream/-$$Lambda$OPTHUCIQRpc8985AtTGZiyQUnfQ;->INSTANCE:Ljava9/util/stream/-$$Lambda$OPTHUCIQRpc8985AtTGZiyQUnfQ;

    sput-object v0, Ljava9/util/stream/Collectors;->LIST_ADD:Ljava9/util/function/BiConsumer;

    .line 164
    sget-object v0, Ljava9/util/stream/-$$Lambda$ZAepYDZM-xIpR25ftgh6cfvR5EE;->INSTANCE:Ljava9/util/stream/-$$Lambda$ZAepYDZM-xIpR25ftgh6cfvR5EE;

    sput-object v0, Ljava9/util/stream/Collectors;->SET_ADD:Ljava9/util/function/BiConsumer;

    return-void
.end method

.method private static arrayListNew()Ljava9/util/function/Supplier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava9/util/function/Supplier<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    .line 147
    sget-object v0, Ljava9/util/stream/-$$Lambda$lh8rmJiOq5y3WKYRNYgXFEc_csk;->INSTANCE:Ljava9/util/stream/-$$Lambda$lh8rmJiOq5y3WKYRNYgXFEc_csk;

    return-object v0
.end method

.method public static collectingAndThen(Ljava9/util/stream/Collector;Ljava9/util/function/Function;)Ljava9/util/stream/Collector;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "A:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            "RR:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/stream/Collector<",
            "TT;TA;TR;>;",
            "Ljava9/util/function/Function<",
            "TR;TRR;>;)",
            "Ljava9/util/stream/Collector<",
            "TT;TA;TRR;>;"
        }
    .end annotation

    .line 662
    invoke-interface {p0}, Ljava9/util/stream/Collector;->characteristics()Ljava/util/Set;

    move-result-object v0

    .line 663
    sget-object v1, Ljava9/util/stream/Collector$Characteristics;->IDENTITY_FINISH:Ljava9/util/stream/Collector$Characteristics;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 664
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 665
    sget-object v0, Ljava9/util/stream/Collectors;->CH_NOID:Ljava/util/Set;

    move-object v6, v0

    goto :goto_0

    .line 667
    :cond_0
    invoke-static {v0}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object v0

    .line 668
    sget-object v1, Ljava9/util/stream/Collector$Characteristics;->IDENTITY_FINISH:Ljava9/util/stream/Collector$Characteristics;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 669
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    move-object v6, v0

    goto :goto_0

    :cond_1
    move-object v6, v0

    .line 672
    :goto_0
    new-instance v0, Ljava9/util/stream/Collectors$CollectorImpl;

    invoke-interface {p0}, Ljava9/util/stream/Collector;->supplier()Ljava9/util/function/Supplier;

    move-result-object v2

    .line 673
    invoke-interface {p0}, Ljava9/util/stream/Collector;->accumulator()Ljava9/util/function/BiConsumer;

    move-result-object v3

    .line 674
    invoke-interface {p0}, Ljava9/util/stream/Collector;->combiner()Ljava9/util/function/BinaryOperator;

    move-result-object v4

    .line 675
    invoke-interface {p0}, Ljava9/util/stream/Collector;->finisher()Ljava9/util/function/Function;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava9/util/function/Function;->andThen(Ljava9/util/function/Function;)Ljava9/util/function/Function;

    move-result-object v5

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ljava9/util/stream/Collectors$CollectorImpl;-><init>(Ljava9/util/function/Supplier;Ljava9/util/function/BiConsumer;Ljava9/util/function/BinaryOperator;Ljava9/util/function/Function;Ljava/util/Set;)V

    return-object v0
.end method

.method static computeFinalSum([D)D
    .locals 5

    const/4 v0, 0x0

    .line 837
    aget-wide v0, p0, v0

    const/4 v2, 0x1

    aget-wide v3, p0, v2

    add-double/2addr v0, v3

    .line 838
    array-length v3, p0

    sub-int/2addr v3, v2

    aget-wide v2, p0, v3

    .line 839
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {v2, v3}, Ljava/lang/Double;->isInfinite(D)Z

    move-result p0

    if-eqz p0, :cond_0

    return-wide v2

    :cond_0
    return-wide v0
.end method

.method private static duplicateKeyException(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/IllegalStateException;
    .locals 4

    .line 185
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Duplicate key %s (attempted merging values %s and %s)"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    const/4 p0, 0x1

    aput-object p1, v2, p0

    const/4 p0, 0x2

    aput-object p2, v2, p0

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private static hashMapNew()Ljava9/util/function/Supplier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava9/util/function/Supplier<",
            "Ljava/util/Map<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 134
    sget-object v0, Ljava9/util/stream/-$$Lambda$_34M-6wqvL4TdgdUvWViyv3v188;->INSTANCE:Ljava9/util/stream/-$$Lambda$_34M-6wqvL4TdgdUvWViyv3v188;

    return-object v0
.end method

.method private static hashSetNew()Ljava9/util/function/Supplier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava9/util/function/Supplier<",
            "Ljava/util/Set<",
            "TT;>;>;"
        }
    .end annotation

    .line 151
    sget-object v0, Ljava9/util/stream/-$$Lambda$1EhBz-vnQQdfgouwBPYkBcFTToc;->INSTANCE:Ljava9/util/stream/-$$Lambda$1EhBz-vnQQdfgouwBPYkBcFTToc;

    return-object v0
.end method

.method public static joining(Ljava/lang/CharSequence;)Ljava9/util/stream/Collector;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava9/util/stream/Collector<",
            "Ljava/lang/CharSequence;",
            "*",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, ""

    const-string v1, ""

    .line 445
    invoke-static {p0, v0, v1}, Ljava9/util/stream/Collectors;->joining(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava9/util/stream/Collector;

    move-result-object p0

    return-object p0
.end method

.method public static joining(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava9/util/stream/Collector;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava9/util/stream/Collector<",
            "Ljava/lang/CharSequence;",
            "*",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 464
    new-instance v6, Ljava9/util/stream/Collectors$CollectorImpl;

    new-instance v1, Ljava9/util/stream/-$$Lambda$Collectors$ZgaeO_lnjOrDLXQwFzhcnVbavJY;

    invoke-direct {v1, p0, p1, p2}, Ljava9/util/stream/-$$Lambda$Collectors$ZgaeO_lnjOrDLXQwFzhcnVbavJY;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    sget-object v2, Ljava9/util/stream/-$$Lambda$yB580q2dxUH5oEjpVVAkQORj1HU;->INSTANCE:Ljava9/util/stream/-$$Lambda$yB580q2dxUH5oEjpVVAkQORj1HU;

    sget-object v3, Ljava9/util/stream/-$$Lambda$r-0b6rtFqD3KYzwTcUhOx648YrM;->INSTANCE:Ljava9/util/stream/-$$Lambda$r-0b6rtFqD3KYzwTcUhOx648YrM;

    sget-object v4, Ljava9/util/stream/-$$Lambda$e6Y-UmZ2CFuCkM7_b6HRNGmLmv8;->INSTANCE:Ljava9/util/stream/-$$Lambda$e6Y-UmZ2CFuCkM7_b6HRNGmLmv8;

    sget-object v5, Ljava9/util/stream/Collectors;->CH_NOID:Ljava/util/Set;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ljava9/util/stream/Collectors$CollectorImpl;-><init>(Ljava9/util/function/Supplier;Ljava9/util/function/BiConsumer;Ljava9/util/function/BinaryOperator;Ljava9/util/function/Function;Ljava/util/Set;)V

    return-object v6
.end method

.method static synthetic lambda$joining$91(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava9/util/StringJoiner;
    .locals 1

    .line 465
    new-instance v0, Ljava9/util/StringJoiner;

    invoke-direct {v0, p0, p1, p2}, Ljava9/util/StringJoiner;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method static synthetic lambda$mapMerger$92(Ljava9/util/function/BinaryOperator;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;
    .locals 2

    .line 485
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 486
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v1, v0, p0}, Ljava9/util/Maps;->merge(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;Ljava9/util/function/BiFunction;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method static synthetic lambda$static$79(Ljava/util/Map;)Ljava/util/Map;
    .locals 1

    .line 156
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/util/Map$Entry;

    invoke-interface {p0, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/util/Map$Entry;

    invoke-static {p0}, Ljava9/util/Maps;->ofEntries([Ljava/util/Map$Entry;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$toCollection$83(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;
    .locals 0

    .line 324
    invoke-interface {p0, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method static synthetic lambda$toList$84(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 341
    invoke-interface {p0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method static synthetic lambda$toMap$147(Ljava9/util/function/Function;Ljava9/util/function/Function;Ljava9/util/function/BinaryOperator;Ljava/util/Map;Ljava/lang/Object;)V
    .locals 0

    .line 1715
    invoke-interface {p0, p4}, Ljava9/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p4}, Ljava9/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p3, p0, p1, p2}, Ljava9/util/Maps;->merge(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;Ljava9/util/function/BiFunction;)Ljava/lang/Object;

    return-void
.end method

.method static synthetic lambda$toSet$87(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;
    .locals 2

    .line 383
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 384
    invoke-interface {p1, p0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object p1

    .line 386
    :cond_0
    invoke-interface {p0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method static synthetic lambda$toUnmodifiableList$85(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 360
    invoke-interface {p0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method static synthetic lambda$toUnmodifiableList$86(Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 361
    invoke-interface {p0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava9/util/Lists;->of([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$toUnmodifiableSet$88(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;
    .locals 2

    .line 412
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 413
    invoke-interface {p1, p0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object p1

    .line 415
    :cond_0
    invoke-interface {p0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method static synthetic lambda$toUnmodifiableSet$89(Ljava/util/Set;)Ljava/util/Set;
    .locals 0

    .line 418
    invoke-interface {p0}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava9/util/Sets;->of([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$uniqKeysMapAccumulator$81(Ljava9/util/function/Function;Ljava9/util/function/Function;Ljava/util/Map;Ljava/lang/Object;)V
    .locals 0

    .line 236
    invoke-interface {p0, p3}, Ljava9/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 237
    invoke-interface {p1, p3}, Ljava9/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 239
    instance-of p3, p2, Ljava/util/concurrent/ConcurrentMap;

    if-eqz p3, :cond_0

    .line 240
    check-cast p2, Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {p2, p0, p1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_0

    .line 242
    :cond_0
    invoke-static {p2, p0, p1}, Ljava9/util/Maps;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :goto_0
    if-nez p2, :cond_1

    return-void

    .line 245
    :cond_1
    invoke-static {p0, p2, p1}, Ljava9/util/stream/Collectors;->duplicateKeyException(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/IllegalStateException;

    move-result-object p0

    throw p0
.end method

.method static synthetic lambda$uniqKeysMapMerger$80(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;
    .locals 3

    .line 203
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 204
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    .line 205
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 207
    instance-of v2, p0, Ljava/util/concurrent/ConcurrentMap;

    if-eqz v2, :cond_0

    .line 208
    move-object v2, p0

    check-cast v2, Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v2, v1, v0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_1

    .line 210
    :cond_0
    invoke-static {p0, v1, v0}, Ljava9/util/Maps;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :goto_1
    if-nez v2, :cond_1

    goto :goto_0

    .line 213
    :cond_1
    invoke-static {v1, v2, v0}, Ljava9/util/stream/Collectors;->duplicateKeyException(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/IllegalStateException;

    move-result-object p0

    throw p0

    :cond_2
    return-object p0
.end method

.method private static final listAdd()Ljava9/util/function/BiConsumer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava9/util/function/BiConsumer<",
            "Ljava/util/List<",
            "TT;>;TT;>;"
        }
    .end annotation

    .line 168
    sget-object v0, Ljava9/util/stream/Collectors;->LIST_ADD:Ljava9/util/function/BiConsumer;

    return-object v0
.end method

.method private static mapMerger(Ljava9/util/function/BinaryOperator;)Ljava9/util/function/BinaryOperator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            "M::",
            "Ljava/util/Map<",
            "TK;TV;>;>(",
            "Ljava9/util/function/BinaryOperator<",
            "TV;>;)",
            "Ljava9/util/function/BinaryOperator<",
            "TM;>;"
        }
    .end annotation

    .line 484
    new-instance v0, Ljava9/util/stream/-$$Lambda$Collectors$1l4Rne6vPecMpC04e1Oi1Ce-hfk;

    invoke-direct {v0, p0}, Ljava9/util/stream/-$$Lambda$Collectors$1l4Rne6vPecMpC04e1Oi1Ce-hfk;-><init>(Ljava9/util/function/BinaryOperator;)V

    return-object v0
.end method

.method private static final setAdd()Ljava9/util/function/BiConsumer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava9/util/function/BiConsumer<",
            "Ljava/util/Set<",
            "TT;>;TT;>;"
        }
    .end annotation

    .line 173
    sget-object v0, Ljava9/util/stream/Collectors;->SET_ADD:Ljava9/util/function/BiConsumer;

    return-object v0
.end method

.method static sumWithCompensation([DD)[D
    .locals 6

    const/4 v0, 0x1

    .line 822
    aget-wide v1, p0, v0

    sub-double/2addr p1, v1

    const/4 v1, 0x0

    .line 823
    aget-wide v2, p0, v1

    add-double v4, v2, p1

    sub-double v2, v4, v2

    sub-double/2addr v2, p1

    .line 825
    aput-wide v2, p0, v0

    .line 826
    aput-wide v4, p0, v1

    return-object p0
.end method

.method public static toCollection(Ljava9/util/function/Supplier;)Ljava9/util/stream/Collector;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "C::",
            "Ljava/util/Collection<",
            "TT;>;>(",
            "Ljava9/util/function/Supplier<",
            "TC;>;)",
            "Ljava9/util/stream/Collector<",
            "TT;*TC;>;"
        }
    .end annotation

    .line 323
    new-instance v0, Ljava9/util/stream/Collectors$CollectorImpl;

    sget-object v1, Ljava9/util/stream/-$$Lambda$q_-4ywmBwhq9plfsh2LNvjEL-xI;->INSTANCE:Ljava9/util/stream/-$$Lambda$q_-4ywmBwhq9plfsh2LNvjEL-xI;

    sget-object v2, Ljava9/util/stream/-$$Lambda$Collectors$h7NBaWBIhzOtrhXs68VHo9u6x6Y;->INSTANCE:Ljava9/util/stream/-$$Lambda$Collectors$h7NBaWBIhzOtrhXs68VHo9u6x6Y;

    sget-object v3, Ljava9/util/stream/Collectors;->CH_ID:Ljava/util/Set;

    invoke-direct {v0, p0, v1, v2, v3}, Ljava9/util/stream/Collectors$CollectorImpl;-><init>(Ljava9/util/function/Supplier;Ljava9/util/function/BiConsumer;Ljava9/util/function/BinaryOperator;Ljava/util/Set;)V

    return-object v0
.end method

.method public static toList()Ljava9/util/stream/Collector;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava9/util/stream/Collector<",
            "TT;*",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    .line 340
    new-instance v0, Ljava9/util/stream/Collectors$CollectorImpl;

    invoke-static {}, Ljava9/util/stream/Collectors;->arrayListNew()Ljava9/util/function/Supplier;

    move-result-object v1

    invoke-static {}, Ljava9/util/stream/Collectors;->listAdd()Ljava9/util/function/BiConsumer;

    move-result-object v2

    sget-object v3, Ljava9/util/stream/-$$Lambda$Collectors$X2ZpgqrBuxwT8M0mv1G7No5ptPM;->INSTANCE:Ljava9/util/stream/-$$Lambda$Collectors$X2ZpgqrBuxwT8M0mv1G7No5ptPM;

    sget-object v4, Ljava9/util/stream/Collectors;->CH_ID:Ljava/util/Set;

    invoke-direct {v0, v1, v2, v3, v4}, Ljava9/util/stream/Collectors$CollectorImpl;-><init>(Ljava9/util/function/Supplier;Ljava9/util/function/BiConsumer;Ljava9/util/function/BinaryOperator;Ljava/util/Set;)V

    return-object v0
.end method

.method public static toMap(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/stream/Collector;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "K:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TT;+TK;>;",
            "Ljava9/util/function/Function<",
            "-TT;+TU;>;)",
            "Ljava9/util/stream/Collector<",
            "TT;*",
            "Ljava/util/Map<",
            "TK;TU;>;>;"
        }
    .end annotation

    .line 1520
    new-instance v0, Ljava9/util/stream/Collectors$CollectorImpl;

    invoke-static {}, Ljava9/util/stream/Collectors;->hashMapNew()Ljava9/util/function/Supplier;

    move-result-object v1

    .line 1521
    invoke-static {p0, p1}, Ljava9/util/stream/Collectors;->uniqKeysMapAccumulator(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/function/BiConsumer;

    move-result-object p0

    .line 1522
    invoke-static {}, Ljava9/util/stream/Collectors;->uniqKeysMapMerger()Ljava9/util/function/BinaryOperator;

    move-result-object p1

    sget-object v2, Ljava9/util/stream/Collectors;->CH_ID:Ljava/util/Set;

    invoke-direct {v0, v1, p0, p1, v2}, Ljava9/util/stream/Collectors$CollectorImpl;-><init>(Ljava9/util/function/Supplier;Ljava9/util/function/BiConsumer;Ljava9/util/function/BinaryOperator;Ljava/util/Set;)V

    return-object v0
.end method

.method public static toMap(Ljava9/util/function/Function;Ljava9/util/function/Function;Ljava9/util/function/BinaryOperator;Ljava9/util/function/Supplier;)Ljava9/util/stream/Collector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "K:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            "M::",
            "Ljava/util/Map<",
            "TK;TU;>;>(",
            "Ljava9/util/function/Function<",
            "-TT;+TK;>;",
            "Ljava9/util/function/Function<",
            "-TT;+TU;>;",
            "Ljava9/util/function/BinaryOperator<",
            "TU;>;",
            "Ljava9/util/function/Supplier<",
            "TM;>;)",
            "Ljava9/util/stream/Collector<",
            "TT;*TM;>;"
        }
    .end annotation

    .line 1714
    new-instance v0, Ljava9/util/stream/-$$Lambda$Collectors$34d7sWLz-EW-OBlC2isbSjuWawo;

    invoke-direct {v0, p0, p1, p2}, Ljava9/util/stream/-$$Lambda$Collectors$34d7sWLz-EW-OBlC2isbSjuWawo;-><init>(Ljava9/util/function/Function;Ljava9/util/function/Function;Ljava9/util/function/BinaryOperator;)V

    .line 1716
    new-instance p0, Ljava9/util/stream/Collectors$CollectorImpl;

    invoke-static {p2}, Ljava9/util/stream/Collectors;->mapMerger(Ljava9/util/function/BinaryOperator;)Ljava9/util/function/BinaryOperator;

    move-result-object p1

    sget-object p2, Ljava9/util/stream/Collectors;->CH_ID:Ljava/util/Set;

    invoke-direct {p0, p3, v0, p1, p2}, Ljava9/util/stream/Collectors$CollectorImpl;-><init>(Ljava9/util/function/Supplier;Ljava9/util/function/BiConsumer;Ljava9/util/function/BinaryOperator;Ljava/util/Set;)V

    return-object p0
.end method

.method public static toSet()Ljava9/util/stream/Collector;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava9/util/stream/Collector<",
            "TT;*",
            "Ljava/util/Set<",
            "TT;>;>;"
        }
    .end annotation

    .line 381
    new-instance v0, Ljava9/util/stream/Collectors$CollectorImpl;

    invoke-static {}, Ljava9/util/stream/Collectors;->hashSetNew()Ljava9/util/function/Supplier;

    move-result-object v1

    invoke-static {}, Ljava9/util/stream/Collectors;->setAdd()Ljava9/util/function/BiConsumer;

    move-result-object v2

    sget-object v3, Ljava9/util/stream/-$$Lambda$Collectors$mfPUcuqQucogYBPg8mTMzgNLizk;->INSTANCE:Ljava9/util/stream/-$$Lambda$Collectors$mfPUcuqQucogYBPg8mTMzgNLizk;

    sget-object v4, Ljava9/util/stream/Collectors;->CH_UNORDERED_ID:Ljava/util/Set;

    invoke-direct {v0, v1, v2, v3, v4}, Ljava9/util/stream/Collectors$CollectorImpl;-><init>(Ljava9/util/function/Supplier;Ljava9/util/function/BiConsumer;Ljava9/util/function/BinaryOperator;Ljava/util/Set;)V

    return-object v0
.end method

.method public static toUnmodifiableList()Ljava9/util/stream/Collector;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava9/util/stream/Collector<",
            "TT;*",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    .line 359
    new-instance v6, Ljava9/util/stream/Collectors$CollectorImpl;

    invoke-static {}, Ljava9/util/stream/Collectors;->arrayListNew()Ljava9/util/function/Supplier;

    move-result-object v1

    invoke-static {}, Ljava9/util/stream/Collectors;->listAdd()Ljava9/util/function/BiConsumer;

    move-result-object v2

    sget-object v3, Ljava9/util/stream/-$$Lambda$Collectors$9IJ6cv7Xx0FiRIqhyV8ZIMkK0VU;->INSTANCE:Ljava9/util/stream/-$$Lambda$Collectors$9IJ6cv7Xx0FiRIqhyV8ZIMkK0VU;

    sget-object v4, Ljava9/util/stream/-$$Lambda$Collectors$DZcKDFFBg4x0LwslPZgU_KnRV44;->INSTANCE:Ljava9/util/stream/-$$Lambda$Collectors$DZcKDFFBg4x0LwslPZgU_KnRV44;

    sget-object v5, Ljava9/util/stream/Collectors;->CH_NOID:Ljava/util/Set;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ljava9/util/stream/Collectors$CollectorImpl;-><init>(Ljava9/util/function/Supplier;Ljava9/util/function/BiConsumer;Ljava9/util/function/BinaryOperator;Ljava9/util/function/Function;Ljava/util/Set;)V

    return-object v6
.end method

.method public static toUnmodifiableMap(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/stream/Collector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "K:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TT;+TK;>;",
            "Ljava9/util/function/Function<",
            "-TT;+TU;>;)",
            "Ljava9/util/stream/Collector<",
            "TT;*",
            "Ljava/util/Map<",
            "TK;TU;>;>;"
        }
    .end annotation

    const-string v0, "keyMapper"

    .line 1557
    invoke-static {p0, v0}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "valueMapper"

    .line 1558
    invoke-static {p1, v0}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1560
    invoke-static {p0, p1}, Ljava9/util/stream/Collectors;->toMap(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/stream/Collector;

    move-result-object p0

    .line 1561
    invoke-static {}, Ljava9/util/stream/Collectors;->unmodMapFinisher()Ljava9/util/function/Function;

    move-result-object p1

    .line 1559
    invoke-static {p0, p1}, Ljava9/util/stream/Collectors;->collectingAndThen(Ljava9/util/stream/Collector;Ljava9/util/function/Function;)Ljava9/util/stream/Collector;

    move-result-object p0

    return-object p0
.end method

.method public static toUnmodifiableMap(Ljava9/util/function/Function;Ljava9/util/function/Function;Ljava9/util/function/BinaryOperator;)Ljava9/util/stream/Collector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "K:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TT;+TK;>;",
            "Ljava9/util/function/Function<",
            "-TT;+TU;>;",
            "Ljava9/util/function/BinaryOperator<",
            "TU;>;)",
            "Ljava9/util/stream/Collector<",
            "TT;*",
            "Ljava/util/Map<",
            "TK;TU;>;>;"
        }
    .end annotation

    const-string v0, "keyMapper"

    .line 1662
    invoke-static {p0, v0}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "valueMapper"

    .line 1663
    invoke-static {p1, v0}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "mergeFunction"

    .line 1664
    invoke-static {p2, v0}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1666
    invoke-static {}, Ljava9/util/stream/Collectors;->hashMapNew()Ljava9/util/function/Supplier;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Ljava9/util/stream/Collectors;->toMap(Ljava9/util/function/Function;Ljava9/util/function/Function;Ljava9/util/function/BinaryOperator;Ljava9/util/function/Supplier;)Ljava9/util/stream/Collector;

    move-result-object p0

    .line 1667
    invoke-static {}, Ljava9/util/stream/Collectors;->unmodMapFinisher()Ljava9/util/function/Function;

    move-result-object p1

    .line 1665
    invoke-static {p0, p1}, Ljava9/util/stream/Collectors;->collectingAndThen(Ljava9/util/stream/Collector;Ljava9/util/function/Function;)Ljava9/util/stream/Collector;

    move-result-object p0

    return-object p0
.end method

.method public static toUnmodifiableSet()Ljava9/util/stream/Collector;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava9/util/stream/Collector<",
            "TT;*",
            "Ljava/util/Set<",
            "TT;>;>;"
        }
    .end annotation

    .line 410
    new-instance v6, Ljava9/util/stream/Collectors$CollectorImpl;

    invoke-static {}, Ljava9/util/stream/Collectors;->hashSetNew()Ljava9/util/function/Supplier;

    move-result-object v1

    invoke-static {}, Ljava9/util/stream/Collectors;->setAdd()Ljava9/util/function/BiConsumer;

    move-result-object v2

    sget-object v3, Ljava9/util/stream/-$$Lambda$Collectors$nk7vg3Yrg8yJDft95v3Vp-c6IlA;->INSTANCE:Ljava9/util/stream/-$$Lambda$Collectors$nk7vg3Yrg8yJDft95v3Vp-c6IlA;

    sget-object v4, Ljava9/util/stream/-$$Lambda$Collectors$6XPMJ8dneo0gBVReVLlwvIE_DWM;->INSTANCE:Ljava9/util/stream/-$$Lambda$Collectors$6XPMJ8dneo0gBVReVLlwvIE_DWM;

    sget-object v5, Ljava9/util/stream/Collectors;->CH_UNORDERED_NOID:Ljava/util/Set;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ljava9/util/stream/Collectors$CollectorImpl;-><init>(Ljava9/util/function/Supplier;Ljava9/util/function/BiConsumer;Ljava9/util/function/BinaryOperator;Ljava9/util/function/Function;Ljava/util/Set;)V

    return-object v6
.end method

.method private static uniqKeysMapAccumulator(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/function/BiConsumer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TT;+TK;>;",
            "Ljava9/util/function/Function<",
            "-TT;+TV;>;)",
            "Ljava9/util/function/BiConsumer<",
            "Ljava/util/Map<",
            "TK;TV;>;TT;>;"
        }
    .end annotation

    .line 235
    new-instance v0, Ljava9/util/stream/-$$Lambda$Collectors$JfS8w6JDjBd9BHyCITZ-OVjdFc8;

    invoke-direct {v0, p0, p1}, Ljava9/util/stream/-$$Lambda$Collectors$JfS8w6JDjBd9BHyCITZ-OVjdFc8;-><init>(Ljava9/util/function/Function;Ljava9/util/function/Function;)V

    return-object v0
.end method

.method private static uniqKeysMapMerger()Ljava9/util/function/BinaryOperator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            "M::",
            "Ljava/util/Map<",
            "TK;TV;>;>()",
            "Ljava9/util/function/BinaryOperator<",
            "TM;>;"
        }
    .end annotation

    .line 202
    sget-object v0, Ljava9/util/stream/-$$Lambda$Collectors$HWS5WXni2Ir2p0SMZDl_nohFkCA;->INSTANCE:Ljava9/util/stream/-$$Lambda$Collectors$HWS5WXni2Ir2p0SMZDl_nohFkCA;

    return-object v0
.end method

.method private static final unmodMapFinisher()Ljava9/util/function/Function;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava9/util/function/Function<",
            "Ljava/util/Map<",
            "TK;TU;>;",
            "Ljava/util/Map<",
            "TK;TU;>;>;"
        }
    .end annotation

    .line 160
    sget-object v0, Ljava9/util/stream/Collectors;->UNMOD_MAP_FINISHER:Ljava9/util/function/Function;

    return-object v0
.end method

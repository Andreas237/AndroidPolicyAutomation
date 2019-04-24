.class public abstract Lcom/google/common/collect/ImmutableList;
.super Lcom/google/common/collect/ImmutableCollection;
.source "ImmutableList.java"

# interfaces
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
    emulated = true
    serializable = true
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/common/collect/ImmutableList$Builder;,
        Lcom/google/common/collect/ImmutableList$SerializedForm;,
        Lcom/google/common/collect/ImmutableList$ReverseImmutableList;,
        Lcom/google/common/collect/ImmutableList$SubList;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/collect/ImmutableCollection<",
        "TE;>;",
        "Ljava/util/List<",
        "TE;>;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 345
    invoke-direct {p0}, Lcom/google/common/collect/ImmutableCollection;-><init>()V

    return-void
.end method

.method static asImmutableList([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    .line 334
    array-length v0, p0

    invoke-static {p0, v0}, Lcom/google/common/collect/ImmutableList;->asImmutableList([Ljava/lang/Object;I)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0
.end method

.method static asImmutableList([Ljava/lang/Object;I)Lcom/google/common/collect/ImmutableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            "I)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 340
    invoke-static {}, Lcom/google/common/collect/ImmutableList;->of()Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0

    .line 342
    :cond_0
    new-instance v0, Lcom/google/common/collect/RegularImmutableList;

    invoke-direct {v0, p0, p1}, Lcom/google/common/collect/RegularImmutableList;-><init>([Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static builder()Lcom/google/common/collect/ImmutableList$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/collect/ImmutableList$Builder<",
            "TE;>;"
        }
    .end annotation

    .line 639
    new-instance v0, Lcom/google/common/collect/ImmutableList$Builder;

    invoke-direct {v0}, Lcom/google/common/collect/ImmutableList$Builder;-><init>()V

    return-object v0
.end method

.method private static varargs construct([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    .line 325
    invoke-static {p0}, Lcom/google/common/collect/ObjectArrays;->checkElementsNotNull([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/google/common/collect/ImmutableList;->asImmutableList([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0
.end method

.method public static copyOf(Ljava/lang/Iterable;)Lcom/google/common/collect/ImmutableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+TE;>;)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    .line 209
    invoke-static {p0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/util/Collection;

    .line 211
    invoke-static {p0}, Lcom/google/common/collect/ImmutableList;->copyOf(Ljava/util/Collection;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    goto :goto_0

    .line 212
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-static {p0}, Lcom/google/common/collect/ImmutableList;->copyOf(Ljava/util/Iterator;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static copyOf(Ljava/util/Collection;)Lcom/google/common/collect/ImmutableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+TE;>;)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    .line 235
    instance-of v0, p0, Lcom/google/common/collect/ImmutableCollection;

    if-eqz v0, :cond_1

    .line 237
    check-cast p0, Lcom/google/common/collect/ImmutableCollection;

    invoke-virtual {p0}, Lcom/google/common/collect/ImmutableCollection;->asList()Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    .line 238
    invoke-virtual {p0}, Lcom/google/common/collect/ImmutableList;->isPartialView()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/common/collect/ImmutableList;->toArray()[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/google/common/collect/ImmutableList;->asImmutableList([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    :cond_0
    return-object p0

    .line 240
    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/google/common/collect/ImmutableList;->construct([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0
.end method

.method public static copyOf(Ljava/util/Iterator;)Lcom/google/common/collect/ImmutableList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator<",
            "+TE;>;)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    .line 250
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 251
    invoke-static {}, Lcom/google/common/collect/ImmutableList;->of()Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0

    .line 253
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 254
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    .line 255
    invoke-static {v0}, Lcom/google/common/collect/ImmutableList;->of(Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0

    .line 257
    :cond_1
    new-instance v1, Lcom/google/common/collect/ImmutableList$Builder;

    invoke-direct {v1}, Lcom/google/common/collect/ImmutableList$Builder;-><init>()V

    invoke-virtual {v1, v0}, Lcom/google/common/collect/ImmutableList$Builder;->add(Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/common/collect/ImmutableList$Builder;->addAll(Ljava/util/Iterator;)Lcom/google/common/collect/ImmutableList$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/common/collect/ImmutableList$Builder;->build()Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0
.end method

.method public static copyOf([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([TE;)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    .line 268
    array-length v0, p0

    if-nez v0, :cond_0

    .line 269
    invoke-static {}, Lcom/google/common/collect/ImmutableList;->of()Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    goto :goto_0

    .line 270
    :cond_0
    invoke-virtual {p0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    invoke-static {p0}, Lcom/google/common/collect/ImmutableList;->construct([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static of()Lcom/google/common/collect/ImmutableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    .line 64
    sget-object v0, Lcom/google/common/collect/RegularImmutableList;->EMPTY:Lcom/google/common/collect/ImmutableList;

    return-object v0
.end method

.method public static of(Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 76
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lcom/google/common/collect/ImmutableList;->construct([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 85
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    invoke-static {v0}, Lcom/google/common/collect/ImmutableList;->construct([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x3

    .line 94
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    invoke-static {v0}, Lcom/google/common/collect/ImmutableList;->construct([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;TE;)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x4

    .line 103
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    invoke-static {v0}, Lcom/google/common/collect/ImmutableList;->construct([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;TE;TE;)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x5

    .line 112
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    const/4 p0, 0x4

    aput-object p4, v0, p0

    invoke-static {v0}, Lcom/google/common/collect/ImmutableList;->construct([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;TE;TE;TE;)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x6

    .line 121
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    const/4 p0, 0x4

    aput-object p4, v0, p0

    const/4 p0, 0x5

    aput-object p5, v0, p0

    invoke-static {v0}, Lcom/google/common/collect/ImmutableList;->construct([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;TE;TE;TE;TE;)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x7

    .line 130
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    const/4 p0, 0x4

    aput-object p4, v0, p0

    const/4 p0, 0x5

    aput-object p5, v0, p0

    const/4 p0, 0x6

    aput-object p6, v0, p0

    invoke-static {v0}, Lcom/google/common/collect/ImmutableList;->construct([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;TE;TE;TE;TE;TE;)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    const/16 v0, 0x8

    .line 139
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    const/4 p0, 0x4

    aput-object p4, v0, p0

    const/4 p0, 0x5

    aput-object p5, v0, p0

    const/4 p0, 0x6

    aput-object p6, v0, p0

    const/4 p0, 0x7

    aput-object p7, v0, p0

    invoke-static {v0}, Lcom/google/common/collect/ImmutableList;->construct([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;TE;TE;TE;TE;TE;TE;)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    const/16 v0, 0x9

    .line 148
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    const/4 p0, 0x4

    aput-object p4, v0, p0

    const/4 p0, 0x5

    aput-object p5, v0, p0

    const/4 p0, 0x6

    aput-object p6, v0, p0

    const/4 p0, 0x7

    aput-object p7, v0, p0

    const/16 p0, 0x8

    aput-object p8, v0, p0

    invoke-static {v0}, Lcom/google/common/collect/ImmutableList;->construct([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;TE;TE;TE;TE;TE;TE;TE;)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    const/16 v0, 0xa

    .line 158
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    const/4 p0, 0x4

    aput-object p4, v0, p0

    const/4 p0, 0x5

    aput-object p5, v0, p0

    const/4 p0, 0x6

    aput-object p6, v0, p0

    const/4 p0, 0x7

    aput-object p7, v0, p0

    const/16 p0, 0x8

    aput-object p8, v0, p0

    const/16 p0, 0x9

    aput-object p9, v0, p0

    invoke-static {v0}, Lcom/google/common/collect/ImmutableList;->construct([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;TE;TE;TE;TE;TE;TE;TE;TE;)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    const/16 v0, 0xb

    .line 168
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    const/4 p0, 0x4

    aput-object p4, v0, p0

    const/4 p0, 0x5

    aput-object p5, v0, p0

    const/4 p0, 0x6

    aput-object p6, v0, p0

    const/4 p0, 0x7

    aput-object p7, v0, p0

    const/16 p0, 0x8

    aput-object p8, v0, p0

    const/16 p0, 0x9

    aput-object p9, v0, p0

    const/16 p0, 0xa

    aput-object p10, v0, p0

    invoke-static {v0}, Lcom/google/common/collect/ImmutableList;->construct([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0
.end method

.method public static varargs of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;TE;TE;TE;TE;TE;TE;TE;TE;TE;[TE;)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 183
    array-length v0, p12

    const/16 v1, 0xc

    add-int/2addr v0, v1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 184
    aput-object p0, v0, v2

    const/4 p0, 0x1

    .line 185
    aput-object p1, v0, p0

    const/4 p0, 0x2

    .line 186
    aput-object p2, v0, p0

    const/4 p0, 0x3

    .line 187
    aput-object p3, v0, p0

    const/4 p0, 0x4

    .line 188
    aput-object p4, v0, p0

    const/4 p0, 0x5

    .line 189
    aput-object p5, v0, p0

    const/4 p0, 0x6

    .line 190
    aput-object p6, v0, p0

    const/4 p0, 0x7

    .line 191
    aput-object p7, v0, p0

    const/16 p0, 0x8

    .line 192
    aput-object p8, v0, p0

    const/16 p0, 0x9

    .line 193
    aput-object p9, v0, p0

    const/16 p0, 0xa

    .line 194
    aput-object p10, v0, p0

    const/16 p0, 0xb

    .line 195
    aput-object p11, v0, p0

    .line 196
    array-length p0, p12

    invoke-static {p12, v2, v0, v1, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 197
    invoke-static {v0}, Lcom/google/common/collect/ImmutableList;->construct([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/InvalidObjectException;
        }
    .end annotation

    .line 626
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Use SerializedForm"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static sortedCopyOf(Ljava/lang/Iterable;)Lcom/google/common/collect/ImmutableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Ljava/lang/Comparable<",
            "-TE;>;>(",
            "Ljava/lang/Iterable<",
            "+TE;>;)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 290
    new-array v0, v0, [Ljava/lang/Comparable;

    invoke-static {p0, v0}, Lcom/google/common/collect/Iterables;->toArray(Ljava/lang/Iterable;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Comparable;

    .line 291
    move-object v0, p0

    check-cast v0, [Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/common/collect/ObjectArrays;->checkElementsNotNull([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 292
    invoke-static {p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 293
    invoke-static {p0}, Lcom/google/common/collect/ImmutableList;->asImmutableList([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0
.end method

.method public static sortedCopyOf(Ljava/util/Comparator;Ljava/lang/Iterable;)Lcom/google/common/collect/ImmutableList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TE;>;",
            "Ljava/lang/Iterable<",
            "+TE;>;)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    .line 313
    invoke-static {p0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    invoke-static {p1}, Lcom/google/common/collect/Iterables;->toArray(Ljava/lang/Iterable;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    .line 316
    invoke-static {p1}, Lcom/google/common/collect/ObjectArrays;->checkElementsNotNull([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 317
    invoke-static {p1, p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 318
    invoke-static {p1}, Lcom/google/common/collect/ImmutableList;->asImmutableList([Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 481
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 0
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 456
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final asList()Lcom/google/common/collect/ImmutableList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    return-object p0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 381
    invoke-virtual {p0, p1}, Lcom/google/common/collect/ImmutableList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method copyIntoArray([Ljava/lang/Object;I)I
    .locals 4

    .line 510
    invoke-virtual {p0}, Lcom/google/common/collect/ImmutableList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    add-int v2, p2, v1

    .line 512
    invoke-virtual {p0, v1}, Lcom/google/common/collect/ImmutableList;->get(I)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    add-int/2addr p2, v0

    return p2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 591
    invoke-static {p0, p1}, Lcom/google/common/collect/Lists;->equalsImpl(Ljava/util/List;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 4

    .line 597
    invoke-virtual {p0}, Lcom/google/common/collect/ImmutableList;->size()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    mul-int/lit8 v1, v1, 0x1f

    .line 599
    invoke-virtual {p0, v2}, Lcom/google/common/collect/ImmutableList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v1, v3

    not-int v1, v1

    not-int v1, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    .line 371
    :cond_0
    invoke-static {p0, p1}, Lcom/google/common/collect/Lists;->indexOfImpl(Ljava/util/List;Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public iterator()Lcom/google/common/collect/UnmodifiableIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/collect/UnmodifiableIterator<",
            "TE;>;"
        }
    .end annotation

    .line 351
    invoke-virtual {p0}, Lcom/google/common/collect/ImmutableList;->listIterator()Lcom/google/common/collect/UnmodifiableListIterator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 52
    invoke-virtual {p0}, Lcom/google/common/collect/ImmutableList;->iterator()Lcom/google/common/collect/UnmodifiableIterator;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    .line 376
    :cond_0
    invoke-static {p0, p1}, Lcom/google/common/collect/Lists;->lastIndexOfImpl(Ljava/util/List;Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public listIterator()Lcom/google/common/collect/UnmodifiableListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/collect/UnmodifiableListIterator<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 356
    invoke-virtual {p0, v0}, Lcom/google/common/collect/ImmutableList;->listIterator(I)Lcom/google/common/collect/UnmodifiableListIterator;

    move-result-object v0

    return-object v0
.end method

.method public listIterator(I)Lcom/google/common/collect/UnmodifiableListIterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/collect/UnmodifiableListIterator<",
            "TE;>;"
        }
    .end annotation

    .line 361
    new-instance v0, Lcom/google/common/collect/ImmutableList$1;

    invoke-virtual {p0}, Lcom/google/common/collect/ImmutableList;->size()I

    move-result v1

    invoke-direct {v0, p0, v1, p1}, Lcom/google/common/collect/ImmutableList$1;-><init>(Lcom/google/common/collect/ImmutableList;II)V

    return-object v0
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 52
    invoke-virtual {p0}, Lcom/google/common/collect/ImmutableList;->listIterator()Lcom/google/common/collect/UnmodifiableListIterator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 52
    invoke-virtual {p0, p1}, Lcom/google/common/collect/ImmutableList;->listIterator(I)Lcom/google/common/collect/UnmodifiableListIterator;

    move-result-object p1

    return-object p1
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 0
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 494
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public reverse()Lcom/google/common/collect/ImmutableList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    .line 526
    invoke-virtual {p0}, Lcom/google/common/collect/ImmutableList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/common/collect/ImmutableList$ReverseImmutableList;

    invoke-direct {v0, p0}, Lcom/google/common/collect/ImmutableList$ReverseImmutableList;-><init>(Lcom/google/common/collect/ImmutableList;)V

    :goto_0
    return-object v0
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 469
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public subList(II)Lcom/google/common/collect/ImmutableList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    .line 394
    invoke-virtual {p0}, Lcom/google/common/collect/ImmutableList;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, Lcom/google/common/base/Preconditions;->checkPositionIndexes(III)V

    sub-int v0, p2, p1

    .line 396
    invoke-virtual {p0}, Lcom/google/common/collect/ImmutableList;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    return-object p0

    :cond_0
    if-nez v0, :cond_1

    .line 399
    invoke-static {}, Lcom/google/common/collect/ImmutableList;->of()Lcom/google/common/collect/ImmutableList;

    move-result-object p1

    return-object p1

    .line 401
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/google/common/collect/ImmutableList;->subListUnchecked(II)Lcom/google/common/collect/ImmutableList;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 52
    invoke-virtual {p0, p1, p2}, Lcom/google/common/collect/ImmutableList;->subList(II)Lcom/google/common/collect/ImmutableList;

    move-result-object p1

    return-object p1
.end method

.method subListUnchecked(II)Lcom/google/common/collect/ImmutableList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/common/collect/ImmutableList<",
            "TE;>;"
        }
    .end annotation

    .line 411
    new-instance v0, Lcom/google/common/collect/ImmutableList$SubList;

    sub-int/2addr p2, p1

    invoke-direct {v0, p0, p1, p2}, Lcom/google/common/collect/ImmutableList$SubList;-><init>(Lcom/google/common/collect/ImmutableList;II)V

    return-object v0
.end method

.method writeReplace()Ljava/lang/Object;
    .locals 2

    .line 631
    new-instance v0, Lcom/google/common/collect/ImmutableList$SerializedForm;

    invoke-virtual {p0}, Lcom/google/common/collect/ImmutableList;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/common/collect/ImmutableList$SerializedForm;-><init>([Ljava/lang/Object;)V

    return-object v0
.end method

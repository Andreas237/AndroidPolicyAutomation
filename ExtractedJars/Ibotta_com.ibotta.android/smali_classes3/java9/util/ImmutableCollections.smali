.class final Ljava9/util/ImmutableCollections;
.super Ljava/lang/Object;
.source "ImmutableCollections.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljava9/util/ImmutableCollections$MapN;,
        Ljava9/util/ImmutableCollections$Map1;,
        Ljava9/util/ImmutableCollections$Map0;,
        Ljava9/util/ImmutableCollections$AbstractImmutableMap;,
        Ljava9/util/ImmutableCollections$SetN;,
        Ljava9/util/ImmutableCollections$Set2;,
        Ljava9/util/ImmutableCollections$Set1;,
        Ljava9/util/ImmutableCollections$Set0;,
        Ljava9/util/ImmutableCollections$AbstractImmutableSet;,
        Ljava9/util/ImmutableCollections$ListN;,
        Ljava9/util/ImmutableCollections$List2;,
        Ljava9/util/ImmutableCollections$List1;,
        Ljava9/util/ImmutableCollections$List0;,
        Ljava9/util/ImmutableCollections$AbstractImmutableList;
    }
.end annotation


# static fields
.field static final SALT:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 61
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v1, v0

    .line 62
    sput v1, Ljava9/util/ImmutableCollections;->SALT:I

    return-void
.end method

.method static synthetic access$000(II)I
    .locals 0

    .line 52
    invoke-static {p0, p1}, Ljava9/util/ImmutableCollections;->floorMod(II)I

    move-result p0

    return p0
.end method

.method private static floorDiv(II)I
    .locals 2

    .line 826
    div-int v0, p0, p1

    xor-int v1, p0, p1

    if-gez v1, :cond_0

    mul-int p1, p1, v0

    if-eq p1, p0, :cond_0

    add-int/lit8 v0, v0, -0x1

    :cond_0
    return v0
.end method

.method private static floorMod(II)I
    .locals 1

    .line 822
    invoke-static {p0, p1}, Ljava9/util/ImmutableCollections;->floorDiv(II)I

    move-result v0

    mul-int v0, v0, p1

    sub-int/2addr p0, v0

    return p0
.end method

.method static listOf([Ljava/lang/Object;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([TE;)",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation

    .line 792
    array-length v0, p0

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    .line 800
    new-instance v0, Ljava9/util/ImmutableCollections$ListN;

    invoke-direct {v0, p0}, Ljava9/util/ImmutableCollections$ListN;-><init>([Ljava/lang/Object;)V

    return-object v0

    .line 798
    :pswitch_0
    new-instance v0, Ljava9/util/ImmutableCollections$List2;

    aget-object v1, p0, v1

    const/4 v2, 0x1

    aget-object p0, p0, v2

    invoke-direct {v0, v1, p0}, Ljava9/util/ImmutableCollections$List2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    .line 796
    :pswitch_1
    new-instance v0, Ljava9/util/ImmutableCollections$List1;

    aget-object p0, p0, v1

    invoke-direct {v0, p0}, Ljava9/util/ImmutableCollections$List1;-><init>(Ljava/lang/Object;)V

    return-object v0

    .line 794
    :pswitch_2
    invoke-static {}, Ljava9/util/ImmutableCollections$List0;->instance()Ljava9/util/ImmutableCollections$List0;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static rangeCheckForAdd(II)V
    .locals 3

    if-ltz p0, :cond_0

    if-gt p0, p1, :cond_0

    return-void

    .line 786
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", Size: "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static setOf(Ljava/lang/Object;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;)",
            "Ljava/util/Set<",
            "TE;>;"
        }
    .end annotation

    .line 805
    new-instance v0, Ljava9/util/ImmutableCollections$Set1;

    invoke-direct {v0, p0}, Ljava9/util/ImmutableCollections$Set1;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method static setOf([Ljava/lang/Object;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([TE;)",
            "Ljava/util/Set<",
            "TE;>;"
        }
    .end annotation

    .line 809
    array-length v0, p0

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    .line 817
    new-instance v0, Ljava9/util/ImmutableCollections$SetN;

    invoke-direct {v0, p0}, Ljava9/util/ImmutableCollections$SetN;-><init>([Ljava/lang/Object;)V

    return-object v0

    .line 815
    :pswitch_0
    new-instance v0, Ljava9/util/ImmutableCollections$Set2;

    aget-object v1, p0, v1

    const/4 v2, 0x1

    aget-object p0, p0, v2

    invoke-direct {v0, v1, p0}, Ljava9/util/ImmutableCollections$Set2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    .line 813
    :pswitch_1
    new-instance v0, Ljava9/util/ImmutableCollections$Set1;

    aget-object p0, p0, v1

    invoke-direct {v0, p0}, Ljava9/util/ImmutableCollections$Set1;-><init>(Ljava/lang/Object;)V

    return-object v0

    .line 811
    :pswitch_2
    invoke-static {}, Ljava9/util/ImmutableCollections$Set0;->instance()Ljava9/util/ImmutableCollections$Set0;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static uoe()Ljava/lang/UnsupportedOperationException;
    .locals 1

    .line 74
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    return-object v0
.end method

.class final Ljava9/util/ImmutableCollections$ListN;
.super Ljava9/util/ImmutableCollections$AbstractImmutableList;
.source "ImmutableCollections.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/ImmutableCollections;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "ListN"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava9/util/ImmutableCollections$AbstractImmutableList<",
        "TE;>;"
    }
.end annotation


# instance fields
.field private final elements:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TE;"
        }
    .end annotation
.end field


# direct methods
.method varargs constructor <init>([Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)V"
        }
    .end annotation

    .line 225
    invoke-direct {p0}, Ljava9/util/ImmutableCollections$AbstractImmutableList;-><init>()V

    .line 228
    array-length v0, p1

    new-array v0, v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 229
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 230
    aget-object v2, p1, v1

    invoke-static {v2}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 232
    :cond_0
    iput-object v0, p0, Ljava9/util/ImmutableCollections$ListN;->elements:[Ljava/lang/Object;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 266
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "not serial proxy"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 3

    .line 270
    new-instance v0, Ljava9/util/CollSer;

    iget-object v1, p0, Ljava9/util/ImmutableCollections$ListN;->elements:[Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Ljava9/util/CollSer;-><init>(I[Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 5

    .line 248
    iget-object v0, p0, Ljava9/util/ImmutableCollections$ListN;->elements:[Ljava/lang/Object;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 249
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 242
    iget-object v0, p0, Ljava9/util/ImmutableCollections$ListN;->elements:[Ljava/lang/Object;

    array-length v0, v0

    invoke-static {p1, v0}, Ljava9/util/Objects;->checkIndex(II)I

    .line 243
    iget-object v0, p0, Ljava9/util/ImmutableCollections$ListN;->elements:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public hashCode()I
    .locals 5

    .line 259
    iget-object v0, p0, Ljava9/util/ImmutableCollections$ListN;->elements:[Ljava/lang/Object;

    array-length v1, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    mul-int/lit8 v2, v2, 0x1f

    .line 260
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    add-int/2addr v2, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return v2
.end method

.method public size()I
    .locals 1

    .line 237
    iget-object v0, p0, Ljava9/util/ImmutableCollections$ListN;->elements:[Ljava/lang/Object;

    array-length v0, v0

    return v0
.end method

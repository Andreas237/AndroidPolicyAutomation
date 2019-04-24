.class final Ljava9/util/ImmutableCollections$List2;
.super Ljava9/util/ImmutableCollections$AbstractImmutableList;
.source "ImmutableCollections.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/ImmutableCollections;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "List2"
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
.field private final e0:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field private final e1:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;TE;)V"
        }
    .end annotation

    .line 182
    invoke-direct {p0}, Ljava9/util/ImmutableCollections$AbstractImmutableList;-><init>()V

    .line 183
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Ljava9/util/ImmutableCollections$List2;->e0:Ljava/lang/Object;

    .line 184
    invoke-static {p2}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Ljava9/util/ImmutableCollections$List2;->e1:Ljava/lang/Object;

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

    .line 214
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "not serial proxy"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 4

    .line 218
    new-instance v0, Ljava9/util/CollSer;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Ljava9/util/ImmutableCollections$List2;->e0:Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Ljava9/util/ImmutableCollections$List2;->e1:Ljava/lang/Object;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v3, v1}, Ljava9/util/CollSer;-><init>(I[Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 204
    iget-object v0, p0, Ljava9/util/ImmutableCollections$List2;->e0:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ljava9/util/ImmutableCollections$List2;->e1:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 194
    invoke-static {p1, v0}, Ljava9/util/Objects;->checkIndex(II)I

    if-nez p1, :cond_0

    .line 196
    iget-object p1, p0, Ljava9/util/ImmutableCollections$List2;->e0:Ljava/lang/Object;

    return-object p1

    .line 198
    :cond_0
    iget-object p1, p0, Ljava9/util/ImmutableCollections$List2;->e1:Ljava/lang/Object;

    return-object p1
.end method

.method public hashCode()I
    .locals 2

    .line 209
    iget-object v0, p0, Ljava9/util/ImmutableCollections$List2;->e0:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit8 v0, v0, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    .line 210
    iget-object v1, p0, Ljava9/util/ImmutableCollections$List2;->e1:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public size()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

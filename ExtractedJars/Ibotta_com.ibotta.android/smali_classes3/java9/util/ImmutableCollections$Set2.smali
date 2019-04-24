.class final Ljava9/util/ImmutableCollections$Set2;
.super Ljava9/util/ImmutableCollections$AbstractImmutableSet;
.source "ImmutableCollections.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/ImmutableCollections;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Set2"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava9/util/ImmutableCollections$AbstractImmutableSet<",
        "TE;>;"
    }
.end annotation


# instance fields
.field final e0:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field final e1:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;TE;)V"
        }
    .end annotation

    .line 370
    invoke-direct {p0}, Ljava9/util/ImmutableCollections$AbstractImmutableSet;-><init>()V

    .line 371
    invoke-static {p2}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 375
    sget v0, Ljava9/util/ImmutableCollections;->SALT:I

    if-ltz v0, :cond_0

    .line 376
    iput-object p1, p0, Ljava9/util/ImmutableCollections$Set2;->e0:Ljava/lang/Object;

    .line 377
    iput-object p2, p0, Ljava9/util/ImmutableCollections$Set2;->e1:Ljava/lang/Object;

    goto :goto_0

    .line 379
    :cond_0
    iput-object p2, p0, Ljava9/util/ImmutableCollections$Set2;->e0:Ljava/lang/Object;

    .line 380
    iput-object p1, p0, Ljava9/util/ImmutableCollections$Set2;->e1:Ljava/lang/Object;

    :goto_0
    return-void

    .line 372
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "duplicate element: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 425
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "not serial proxy"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 5

    .line 429
    new-instance v0, Ljava9/util/CollSer;

    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/Object;

    iget-object v3, p0, Ljava9/util/ImmutableCollections$Set2;->e0:Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Ljava9/util/ImmutableCollections$Set2;->e1:Ljava/lang/Object;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Ljava9/util/CollSer;-><init>(I[Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 391
    iget-object v0, p0, Ljava9/util/ImmutableCollections$Set2;->e0:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ljava9/util/ImmutableCollections$Set2;->e1:Ljava/lang/Object;

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

.method public hashCode()I
    .locals 2

    .line 396
    iget-object v0, p0, Ljava9/util/ImmutableCollections$Set2;->e0:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Ljava9/util/ImmutableCollections$Set2;->e1:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    .line 401
    new-instance v0, Ljava9/util/ImmutableCollections$Set2$1;

    invoke-direct {v0, p0}, Ljava9/util/ImmutableCollections$Set2$1;-><init>(Ljava9/util/ImmutableCollections$Set2;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

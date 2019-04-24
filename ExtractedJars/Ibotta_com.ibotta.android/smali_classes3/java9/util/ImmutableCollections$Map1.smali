.class final Ljava9/util/ImmutableCollections$Map1;
.super Ljava9/util/ImmutableCollections$AbstractImmutableMap;
.source "ImmutableCollections.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/ImmutableCollections;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Map1"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava9/util/ImmutableCollections$AbstractImmutableMap<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field private final k0:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field private final v0:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    .line 593
    invoke-direct {p0}, Ljava9/util/ImmutableCollections$AbstractImmutableMap;-><init>()V

    .line 594
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Ljava9/util/ImmutableCollections$Map1;->k0:Ljava/lang/Object;

    .line 595
    invoke-static {p2}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Ljava9/util/ImmutableCollections$Map1;->v0:Ljava/lang/Object;

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

    .line 614
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "not serial proxy"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 4

    .line 618
    new-instance v0, Ljava9/util/CollSer;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Ljava9/util/ImmutableCollections$Map1;->k0:Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Ljava9/util/ImmutableCollections$Map1;->v0:Ljava/lang/Object;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x3

    invoke-direct {v0, v2, v1}, Ljava9/util/CollSer;-><init>(I[Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 605
    iget-object v0, p0, Ljava9/util/ImmutableCollections$Map1;->k0:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 610
    iget-object v0, p0, Ljava9/util/ImmutableCollections$Map1;->v0:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public entrySet()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 600
    new-instance v0, Ljava9/util/KeyValueHolder;

    iget-object v1, p0, Ljava9/util/ImmutableCollections$Map1;->k0:Ljava/lang/Object;

    iget-object v2, p0, Ljava9/util/ImmutableCollections$Map1;->v0:Ljava/lang/Object;

    invoke-direct {v0, v1, v2}, Ljava9/util/KeyValueHolder;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Ljava9/util/ImmutableCollections;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 623
    iget-object v0, p0, Ljava9/util/ImmutableCollections$Map1;->k0:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Ljava9/util/ImmutableCollections$Map1;->v0:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

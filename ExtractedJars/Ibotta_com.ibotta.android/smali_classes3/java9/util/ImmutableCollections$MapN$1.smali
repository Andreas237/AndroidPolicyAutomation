.class Ljava9/util/ImmutableCollections$MapN$1;
.super Ljava/util/AbstractSet;
.source "ImmutableCollections.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljava9/util/ImmutableCollections$MapN;->entrySet()Ljava/util/Set;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSet<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Ljava9/util/ImmutableCollections$MapN;


# direct methods
.method constructor <init>(Ljava9/util/ImmutableCollections$MapN;)V
    .locals 0

    .line 710
    iput-object p1, p0, Ljava9/util/ImmutableCollections$MapN$1;->this$0:Ljava9/util/ImmutableCollections$MapN;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 718
    new-instance v0, Ljava9/util/ImmutableCollections$MapN$1$1;

    invoke-direct {v0, p0}, Ljava9/util/ImmutableCollections$MapN$1$1;-><init>(Ljava9/util/ImmutableCollections$MapN$1;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    .line 713
    iget-object v0, p0, Ljava9/util/ImmutableCollections$MapN$1;->this$0:Ljava9/util/ImmutableCollections$MapN;

    iget v0, v0, Ljava9/util/ImmutableCollections$MapN;->size:I

    return v0
.end method

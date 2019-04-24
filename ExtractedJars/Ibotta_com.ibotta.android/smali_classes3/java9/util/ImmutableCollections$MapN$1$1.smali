.class Ljava9/util/ImmutableCollections$MapN$1$1;
.super Ljava9/util/Iterators$ImmutableIt;
.source "ImmutableCollections.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljava9/util/ImmutableCollections$MapN$1;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava9/util/Iterators$ImmutableIt<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field idx:I

.field final synthetic this$1:Ljava9/util/ImmutableCollections$MapN$1;


# direct methods
.method constructor <init>(Ljava9/util/ImmutableCollections$MapN$1;)V
    .locals 0

    .line 718
    iput-object p1, p0, Ljava9/util/ImmutableCollections$MapN$1$1;->this$1:Ljava9/util/ImmutableCollections$MapN$1;

    invoke-direct {p0}, Ljava9/util/Iterators$ImmutableIt;-><init>()V

    const/4 p1, 0x0

    .line 719
    iput p1, p0, Ljava9/util/ImmutableCollections$MapN$1$1;->idx:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    .line 723
    :goto_0
    iget v0, p0, Ljava9/util/ImmutableCollections$MapN$1$1;->idx:I

    iget-object v1, p0, Ljava9/util/ImmutableCollections$MapN$1$1;->this$1:Ljava9/util/ImmutableCollections$MapN$1;

    iget-object v1, v1, Ljava9/util/ImmutableCollections$MapN$1;->this$0:Ljava9/util/ImmutableCollections$MapN;

    iget-object v1, v1, Ljava9/util/ImmutableCollections$MapN;->table:[Ljava/lang/Object;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 724
    iget-object v0, p0, Ljava9/util/ImmutableCollections$MapN$1$1;->this$1:Ljava9/util/ImmutableCollections$MapN$1;

    iget-object v0, v0, Ljava9/util/ImmutableCollections$MapN$1;->this$0:Ljava9/util/ImmutableCollections$MapN;

    iget-object v0, v0, Ljava9/util/ImmutableCollections$MapN;->table:[Ljava/lang/Object;

    iget v1, p0, Ljava9/util/ImmutableCollections$MapN$1$1;->idx:I

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x2

    .line 726
    iput v1, p0, Ljava9/util/ImmutableCollections$MapN$1$1;->idx:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 718
    invoke-virtual {p0}, Ljava9/util/ImmutableCollections$MapN$1$1;->next()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public next()Ljava/util/Map$Entry;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 733
    invoke-virtual {p0}, Ljava9/util/ImmutableCollections$MapN$1$1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 735
    new-instance v0, Ljava9/util/KeyValueHolder;

    iget-object v1, p0, Ljava9/util/ImmutableCollections$MapN$1$1;->this$1:Ljava9/util/ImmutableCollections$MapN$1;

    iget-object v1, v1, Ljava9/util/ImmutableCollections$MapN$1;->this$0:Ljava9/util/ImmutableCollections$MapN;

    iget-object v1, v1, Ljava9/util/ImmutableCollections$MapN;->table:[Ljava/lang/Object;

    iget v2, p0, Ljava9/util/ImmutableCollections$MapN$1$1;->idx:I

    aget-object v1, v1, v2

    iget-object v2, p0, Ljava9/util/ImmutableCollections$MapN$1$1;->this$1:Ljava9/util/ImmutableCollections$MapN$1;

    iget-object v2, v2, Ljava9/util/ImmutableCollections$MapN$1;->this$0:Ljava9/util/ImmutableCollections$MapN;

    iget-object v2, v2, Ljava9/util/ImmutableCollections$MapN;->table:[Ljava/lang/Object;

    iget v3, p0, Ljava9/util/ImmutableCollections$MapN$1$1;->idx:I

    add-int/lit8 v3, v3, 0x1

    aget-object v2, v2, v3

    invoke-direct {v0, v1, v2}, Ljava9/util/KeyValueHolder;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 737
    iget v1, p0, Ljava9/util/ImmutableCollections$MapN$1$1;->idx:I

    add-int/lit8 v1, v1, 0x2

    iput v1, p0, Ljava9/util/ImmutableCollections$MapN$1$1;->idx:I

    return-object v0

    .line 740
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

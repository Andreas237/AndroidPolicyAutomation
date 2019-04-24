.class Lcom/nytimes/android/external/cache/LocalCache$WriteQueue$2;
.super Lcom/nytimes/android/external/cache/AbstractSequentialIterator;
.source "LocalCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/nytimes/android/external/cache/AbstractSequentialIterator<",
        "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;


# direct methods
.method constructor <init>(Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V
    .locals 0

    .line 3742
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue$2;->this$0:Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;

    invoke-direct {p0, p2}, Lcom/nytimes/android/external/cache/AbstractSequentialIterator;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected computeNext(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .locals 1
    .param p1    # Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;)",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 3746
    invoke-interface {p1}, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;->getNextInWriteQueue()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    .line 3747
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue$2;->this$0:Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;

    iget-object v0, v0, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue;->head:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    return-object p1
.end method

.method protected bridge synthetic computeNext(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 3742
    check-cast p1, Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    invoke-virtual {p0, p1}, Lcom/nytimes/android/external/cache/LocalCache$WriteQueue$2;->computeNext(Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    move-result-object p1

    return-object p1
.end method

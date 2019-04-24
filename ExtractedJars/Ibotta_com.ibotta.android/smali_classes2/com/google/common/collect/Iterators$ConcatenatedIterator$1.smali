.class final Lcom/google/common/collect/Iterators$ConcatenatedIterator$1;
.super Lcom/google/common/collect/MultitransformedIterator;
.source "Iterators.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/common/collect/Iterators$ConcatenatedIterator;->getComponentIterators(Ljava/util/Iterator;)Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/collect/MultitransformedIterator<",
        "Ljava/util/Iterator<",
        "+TT;>;",
        "Ljava/util/Iterator<",
        "+TT;>;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/util/Iterator;)V
    .locals 0

    .line 1300
    invoke-direct {p0, p1}, Lcom/google/common/collect/MultitransformedIterator;-><init>(Ljava/util/Iterator;)V

    return-void
.end method


# virtual methods
.method bridge synthetic transform(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 0

    .line 1300
    check-cast p1, Ljava/util/Iterator;

    invoke-virtual {p0, p1}, Lcom/google/common/collect/Iterators$ConcatenatedIterator$1;->transform(Ljava/util/Iterator;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method transform(Ljava/util/Iterator;)Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "+TT;>;)",
            "Ljava/util/Iterator<",
            "+",
            "Ljava/util/Iterator<",
            "+TT;>;>;"
        }
    .end annotation

    .line 1303
    instance-of v0, p1, Lcom/google/common/collect/Iterators$ConcatenatedIterator;

    if-eqz v0, :cond_0

    .line 1304
    move-object v0, p1

    check-cast v0, Lcom/google/common/collect/Iterators$ConcatenatedIterator;

    .line 1306
    iget-object v1, v0, Lcom/google/common/collect/Iterators$ConcatenatedIterator;->current:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1307
    iget-object p1, v0, Lcom/google/common/collect/Iterators$ConcatenatedIterator;->backingIterator:Ljava/util/Iterator;

    invoke-static {p1}, Lcom/google/common/collect/Iterators$ConcatenatedIterator;->access$000(Ljava/util/Iterator;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1

    .line 1310
    :cond_0
    invoke-static {p1}, Lcom/google/common/collect/Iterators;->singletonIterator(Ljava/lang/Object;)Lcom/google/common/collect/UnmodifiableIterator;

    move-result-object p1

    return-object p1
.end method

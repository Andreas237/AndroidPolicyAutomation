.class public Lcom/squareup/haha/guava/collect/Lists$ReverseList;
.super Ljava/util/AbstractList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/util/AbstractList<TT;>;"
    }
.end annotation


# instance fields
.field public final forwardList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TT;>;)V"
        }
    .end annotation

    .line 766
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 767
    invoke-static {p1}, Lcom/squareup/haha/guava/base/Joiner;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->forwardList:Ljava/util/List;

    .line 768
    return-void
.end method

.method static synthetic access$000(Lcom/squareup/haha/guava/collect/Lists$ReverseList;I)I
    .locals 1

    .line 763
    invoke-direct {p0, p1}, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->reversePosition(I)I

    move-result v0

    return v0
.end method

.method private reverseIndex(I)I
    .locals 2

    .line 775
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->size()I

    move-result v1

    .line 776
    invoke-static {p1, v1}, Lcom/squareup/haha/guava/base/Joiner;->checkElementIndex(II)I

    .line 777
    add-int/lit8 v0, v1, -0x1

    sub-int/2addr v0, p1

    return v0
.end method

.method private reversePosition(I)I
    .locals 2

    .line 781
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->size()I

    move-result v1

    .line 782
    invoke-static {p1, v1}, Lcom/squareup/haha/guava/base/Joiner;->checkPositionIndex(II)I

    .line 783
    sub-int v0, v1, p1

    return v0
.end method


# virtual methods
.method public add(ILjava/lang/Object;)V
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation

    .line 787
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->forwardList:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->reversePosition(I)I

    move-result v1

    invoke-interface {v0, v1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 788
    return-void
.end method

.method public clear()V
    .locals 1

    .line 791
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->forwardList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 792
    return-void
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 807
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->forwardList:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->reverseIndex(I)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<TT;>;"
        }
    .end annotation

    .line 821
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/ListIterator<TT;>;"
        }
    .end annotation

    .line 825
    invoke-direct {p0, p1}, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->reversePosition(I)I

    move-result v1

    .line 826
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->forwardList:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v2

    .line 827
    new-instance v0, Lcom/squareup/haha/guava/collect/Lists$ReverseList$1;

    invoke-direct {v0, p0, v2}, Lcom/squareup/haha/guava/collect/Lists$ReverseList$1;-><init>(Lcom/squareup/haha/guava/collect/Lists$ReverseList;Ljava/util/ListIterator;)V

    return-object v0
.end method

.method public remove(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 795
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->forwardList:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->reverseIndex(I)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected removeRange(II)V
    .locals 1

    .line 799
    invoke-virtual {p0, p1, p2}, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 800
    return-void
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)TT;"
        }
    .end annotation

    .line 803
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->forwardList:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->reverseIndex(I)I

    move-result v1

    invoke-interface {v0, v1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .line 811
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->forwardList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public subList(II)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<TT;>;"
        }
    .end annotation

    .line 815
    invoke-virtual {p0}, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, Lcom/squareup/haha/guava/base/Joiner;->checkPositionIndexes(III)V

    .line 816
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->forwardList:Ljava/util/List;

    invoke-direct {p0, p2}, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->reversePosition(I)I

    move-result v1

    invoke-direct {p0, p1}, Lcom/squareup/haha/guava/collect/Lists$ReverseList;->reversePosition(I)I

    move-result v2

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/haha/guava/base/Joiner;->reverse(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

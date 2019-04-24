.class final Lcom/squareup/haha/guava/collect/ImmutableList$SubList;
.super Lcom/squareup/haha/guava/collect/ImmutableList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/guava/collect/ImmutableList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SubList"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/haha/guava/collect/ImmutableList<TE;>;"
    }
.end annotation


# instance fields
.field private transient length:I

.field private transient offset:I

.field private synthetic this$0:Lcom/squareup/haha/guava/collect/ImmutableList;


# direct methods
.method constructor <init>(Lcom/squareup/haha/guava/collect/ImmutableList;II)V
    .locals 0

    .line 406
    iput-object p1, p0, Lcom/squareup/haha/guava/collect/ImmutableList$SubList;->this$0:Lcom/squareup/haha/guava/collect/ImmutableList;

    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/ImmutableList;-><init>()V

    .line 407
    iput p2, p0, Lcom/squareup/haha/guava/collect/ImmutableList$SubList;->offset:I

    .line 408
    iput p3, p0, Lcom/squareup/haha/guava/collect/ImmutableList$SubList;->length:I

    .line 409
    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 418
    iget v0, p0, Lcom/squareup/haha/guava/collect/ImmutableList$SubList;->length:I

    invoke-static {p1, v0}, Lcom/squareup/haha/guava/base/Joiner;->checkElementIndex(II)I

    .line 419
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/ImmutableList$SubList;->this$0:Lcom/squareup/haha/guava/collect/ImmutableList;

    iget v1, p0, Lcom/squareup/haha/guava/collect/ImmutableList$SubList;->offset:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Lcom/squareup/haha/guava/collect/ImmutableList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method final isPartialView()Z
    .locals 1

    .line 430
    const/4 v0, 0x1

    return v0
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 402
    invoke-super {p0}, Lcom/squareup/haha/guava/collect/ImmutableList;->iterator()Lcom/squareup/haha/guava/collect/UnmodifiableIterator;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 2

    .line 402
    .line 1344
    move-object v1, p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/squareup/haha/guava/collect/ImmutableList;->listIterator(I)Lcom/squareup/haha/guava/collect/UnmodifiableListIterator;

    move-result-object v0

    .line 402
    return-object v0
.end method

.method public final bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 402
    invoke-super {p0, p1}, Lcom/squareup/haha/guava/collect/ImmutableList;->listIterator(I)Lcom/squareup/haha/guava/collect/UnmodifiableListIterator;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 413
    iget v0, p0, Lcom/squareup/haha/guava/collect/ImmutableList$SubList;->length:I

    return v0
.end method

.method public final subList(II)Lcom/squareup/haha/guava/collect/ImmutableList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Lcom/squareup/haha/guava/collect/ImmutableList<TE;>;"
        }
    .end annotation

    .line 424
    iget v0, p0, Lcom/squareup/haha/guava/collect/ImmutableList$SubList;->length:I

    invoke-static {p1, p2, v0}, Lcom/squareup/haha/guava/base/Joiner;->checkPositionIndexes(III)V

    .line 425
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/ImmutableList$SubList;->this$0:Lcom/squareup/haha/guava/collect/ImmutableList;

    iget v1, p0, Lcom/squareup/haha/guava/collect/ImmutableList$SubList;->offset:I

    add-int/2addr v1, p1

    iget v2, p0, Lcom/squareup/haha/guava/collect/ImmutableList$SubList;->offset:I

    add-int/2addr v2, p2

    invoke-virtual {v0, v1, v2}, Lcom/squareup/haha/guava/collect/ImmutableList;->subList(II)Lcom/squareup/haha/guava/collect/ImmutableList;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 1

    .line 402
    invoke-virtual {p0, p1, p2}, Lcom/squareup/haha/guava/collect/ImmutableList$SubList;->subList(II)Lcom/squareup/haha/guava/collect/ImmutableList;

    move-result-object v0

    return-object v0
.end method

.class final Lorg/jdom2/ContentList$CLListIterator;
.super Ljava/lang/Object;
.source "ContentList.java"

# interfaces
.implements Ljava/util/ListIterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/ContentList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "CLListIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/ListIterator<",
        "Lorg/jdom2/Content;",
        ">;"
    }
.end annotation


# instance fields
.field private canremove:Z

.field private canset:Z

.field private cursor:I

.field private expectedmod:I

.field private forward:Z

.field final synthetic this$0:Lorg/jdom2/ContentList;


# direct methods
.method constructor <init>(Lorg/jdom2/ContentList;I)V
    .locals 2

    .line 747
    iput-object p1, p0, Lorg/jdom2/ContentList$CLListIterator;->this$0:Lorg/jdom2/ContentList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 728
    iput-boolean v0, p0, Lorg/jdom2/ContentList$CLListIterator;->forward:Z

    .line 730
    iput-boolean v0, p0, Lorg/jdom2/ContentList$CLListIterator;->canremove:Z

    .line 732
    iput-boolean v0, p0, Lorg/jdom2/ContentList$CLListIterator;->canset:Z

    const/4 v1, -0x1

    .line 735
    iput v1, p0, Lorg/jdom2/ContentList$CLListIterator;->expectedmod:I

    .line 737
    iput v1, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    .line 748
    invoke-static {p1}, Lorg/jdom2/ContentList;->access$100(Lorg/jdom2/ContentList;)I

    move-result v1

    iput v1, p0, Lorg/jdom2/ContentList$CLListIterator;->expectedmod:I

    .line 751
    iput-boolean v0, p0, Lorg/jdom2/ContentList$CLListIterator;->forward:Z

    .line 753
    invoke-static {p1, p2, v0}, Lorg/jdom2/ContentList;->access$400(Lorg/jdom2/ContentList;IZ)V

    .line 755
    iput p2, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    return-void
.end method

.method private checkConcurrent()V
    .locals 2

    .line 759
    iget v0, p0, Lorg/jdom2/ContentList$CLListIterator;->expectedmod:I

    iget-object v1, p0, Lorg/jdom2/ContentList$CLListIterator;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v1}, Lorg/jdom2/ContentList;->access$100(Lorg/jdom2/ContentList;)I

    move-result v1

    if-ne v0, v1, :cond_0

    return-void

    .line 760
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    const-string v1, "The ContentList supporting this iterator has been modified bysomething other than this Iterator."

    invoke-direct {v0, v1}, Ljava/util/ConcurrentModificationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 726
    check-cast p1, Lorg/jdom2/Content;

    invoke-virtual {p0, p1}, Lorg/jdom2/ContentList$CLListIterator;->add(Lorg/jdom2/Content;)V

    return-void
.end method

.method public add(Lorg/jdom2/Content;)V
    .locals 3

    .line 845
    invoke-direct {p0}, Lorg/jdom2/ContentList$CLListIterator;->checkConcurrent()V

    .line 847
    iget-boolean v0, p0, Lorg/jdom2/ContentList$CLListIterator;->forward:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    .line 849
    :goto_0
    iget-object v2, p0, Lorg/jdom2/ContentList$CLListIterator;->this$0:Lorg/jdom2/ContentList;

    invoke-virtual {v2, v0, p1}, Lorg/jdom2/ContentList;->add(ILorg/jdom2/Content;)V

    .line 851
    iget-object p1, p0, Lorg/jdom2/ContentList$CLListIterator;->this$0:Lorg/jdom2/ContentList;

    invoke-static {p1}, Lorg/jdom2/ContentList;->access$100(Lorg/jdom2/ContentList;)I

    move-result p1

    iput p1, p0, Lorg/jdom2/ContentList$CLListIterator;->expectedmod:I

    const/4 p1, 0x0

    .line 853
    iput-boolean p1, p0, Lorg/jdom2/ContentList$CLListIterator;->canset:Z

    iput-boolean p1, p0, Lorg/jdom2/ContentList$CLListIterator;->canremove:Z

    .line 860
    iput v0, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    .line 861
    iput-boolean v1, p0, Lorg/jdom2/ContentList$CLListIterator;->forward:Z

    return-void
.end method

.method public hasNext()Z
    .locals 3

    .line 771
    iget-boolean v0, p0, Lorg/jdom2/ContentList$CLListIterator;->forward:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    :goto_0
    iget-object v2, p0, Lorg/jdom2/ContentList$CLListIterator;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v2}, Lorg/jdom2/ContentList;->access$200(Lorg/jdom2/ContentList;)I

    move-result v2

    if-ge v0, v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public hasPrevious()Z
    .locals 2

    .line 780
    iget-boolean v0, p0, Lorg/jdom2/ContentList$CLListIterator;->forward:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 726
    invoke-virtual {p0}, Lorg/jdom2/ContentList$CLListIterator;->next()Lorg/jdom2/Content;

    move-result-object v0

    return-object v0
.end method

.method public next()Lorg/jdom2/Content;
    .locals 3

    .line 807
    invoke-direct {p0}, Lorg/jdom2/ContentList$CLListIterator;->checkConcurrent()V

    .line 808
    iget-boolean v0, p0, Lorg/jdom2/ContentList$CLListIterator;->forward:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    .line 810
    :goto_0
    iget-object v2, p0, Lorg/jdom2/ContentList$CLListIterator;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v2}, Lorg/jdom2/ContentList;->access$200(Lorg/jdom2/ContentList;)I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 814
    iput v0, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    .line 815
    iput-boolean v1, p0, Lorg/jdom2/ContentList$CLListIterator;->forward:Z

    .line 816
    iput-boolean v1, p0, Lorg/jdom2/ContentList$CLListIterator;->canremove:Z

    .line 817
    iput-boolean v1, p0, Lorg/jdom2/ContentList$CLListIterator;->canset:Z

    .line 818
    iget-object v0, p0, Lorg/jdom2/ContentList$CLListIterator;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v0}, Lorg/jdom2/ContentList;->access$300(Lorg/jdom2/ContentList;)[Lorg/jdom2/Content;

    move-result-object v0

    iget v1, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    aget-object v0, v0, v1

    return-object v0

    .line 811
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "next() is beyond the end of the Iterator"

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public nextIndex()I
    .locals 1

    .line 789
    iget-boolean v0, p0, Lorg/jdom2/ContentList$CLListIterator;->forward:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    :goto_0
    return v0
.end method

.method public bridge synthetic previous()Ljava/lang/Object;
    .locals 1

    .line 726
    invoke-virtual {p0}, Lorg/jdom2/ContentList$CLListIterator;->previous()Lorg/jdom2/Content;

    move-result-object v0

    return-object v0
.end method

.method public previous()Lorg/jdom2/Content;
    .locals 2

    .line 826
    invoke-direct {p0}, Lorg/jdom2/ContentList$CLListIterator;->checkConcurrent()V

    .line 827
    iget-boolean v0, p0, Lorg/jdom2/ContentList$CLListIterator;->forward:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    .line 833
    iput v0, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    const/4 v0, 0x0

    .line 834
    iput-boolean v0, p0, Lorg/jdom2/ContentList$CLListIterator;->forward:Z

    .line 835
    iput-boolean v1, p0, Lorg/jdom2/ContentList$CLListIterator;->canremove:Z

    .line 836
    iput-boolean v1, p0, Lorg/jdom2/ContentList$CLListIterator;->canset:Z

    .line 837
    iget-object v0, p0, Lorg/jdom2/ContentList$CLListIterator;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v0}, Lorg/jdom2/ContentList;->access$300(Lorg/jdom2/ContentList;)[Lorg/jdom2/Content;

    move-result-object v0

    iget v1, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    aget-object v0, v0, v1

    return-object v0

    .line 830
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "previous() is beyond the beginning of the Iterator"

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public previousIndex()I
    .locals 1

    .line 799
    iget-boolean v0, p0, Lorg/jdom2/ContentList$CLListIterator;->forward:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    return v0
.end method

.method public remove()V
    .locals 2

    .line 870
    invoke-direct {p0}, Lorg/jdom2/ContentList$CLListIterator;->checkConcurrent()V

    .line 871
    iget-boolean v0, p0, Lorg/jdom2/ContentList$CLListIterator;->canremove:Z

    if-eqz v0, :cond_0

    .line 881
    iget-object v0, p0, Lorg/jdom2/ContentList$CLListIterator;->this$0:Lorg/jdom2/ContentList;

    iget v1, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    invoke-virtual {v0, v1}, Lorg/jdom2/ContentList;->remove(I)Lorg/jdom2/Content;

    const/4 v0, 0x0

    .line 882
    iput-boolean v0, p0, Lorg/jdom2/ContentList$CLListIterator;->forward:Z

    .line 883
    iget-object v1, p0, Lorg/jdom2/ContentList$CLListIterator;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v1}, Lorg/jdom2/ContentList;->access$100(Lorg/jdom2/ContentList;)I

    move-result v1

    iput v1, p0, Lorg/jdom2/ContentList$CLListIterator;->expectedmod:I

    .line 885
    iput-boolean v0, p0, Lorg/jdom2/ContentList$CLListIterator;->canremove:Z

    .line 886
    iput-boolean v0, p0, Lorg/jdom2/ContentList$CLListIterator;->canset:Z

    return-void

    .line 872
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can not remove an element unless either next() or previous() has been called since the last remove()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic set(Ljava/lang/Object;)V
    .locals 0

    .line 726
    check-cast p1, Lorg/jdom2/Content;

    invoke-virtual {p0, p1}, Lorg/jdom2/ContentList$CLListIterator;->set(Lorg/jdom2/Content;)V

    return-void
.end method

.method public set(Lorg/jdom2/Content;)V
    .locals 2

    .line 895
    invoke-direct {p0}, Lorg/jdom2/ContentList$CLListIterator;->checkConcurrent()V

    .line 896
    iget-boolean v0, p0, Lorg/jdom2/ContentList$CLListIterator;->canset:Z

    if-eqz v0, :cond_0

    .line 902
    iget-object v0, p0, Lorg/jdom2/ContentList$CLListIterator;->this$0:Lorg/jdom2/ContentList;

    iget v1, p0, Lorg/jdom2/ContentList$CLListIterator;->cursor:I

    invoke-virtual {v0, v1, p1}, Lorg/jdom2/ContentList;->set(ILorg/jdom2/Content;)Lorg/jdom2/Content;

    .line 903
    iget-object p1, p0, Lorg/jdom2/ContentList$CLListIterator;->this$0:Lorg/jdom2/ContentList;

    invoke-static {p1}, Lorg/jdom2/ContentList;->access$100(Lorg/jdom2/ContentList;)I

    move-result p1

    iput p1, p0, Lorg/jdom2/ContentList$CLListIterator;->expectedmod:I

    return-void

    .line 897
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Can not set an element unless either next() or previous() has been called since the last remove() or set()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

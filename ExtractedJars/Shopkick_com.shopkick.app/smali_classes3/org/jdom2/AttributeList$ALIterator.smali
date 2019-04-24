.class final Lorg/jdom2/AttributeList$ALIterator;
.super Ljava/lang/Object;
.source "AttributeList.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/AttributeList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "ALIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lorg/jdom2/Attribute;",
        ">;"
    }
.end annotation


# instance fields
.field private canremove:Z

.field private cursor:I

.field private expect:I

.field final synthetic this$0:Lorg/jdom2/AttributeList;


# direct methods
.method private constructor <init>(Lorg/jdom2/AttributeList;)V
    .locals 1

    .line 656
    iput-object p1, p0, Lorg/jdom2/AttributeList$ALIterator;->this$0:Lorg/jdom2/AttributeList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 650
    iput v0, p0, Lorg/jdom2/AttributeList$ALIterator;->expect:I

    const/4 v0, 0x0

    .line 652
    iput v0, p0, Lorg/jdom2/AttributeList$ALIterator;->cursor:I

    .line 654
    iput-boolean v0, p0, Lorg/jdom2/AttributeList$ALIterator;->canremove:Z

    .line 657
    invoke-static {p1}, Lorg/jdom2/AttributeList;->access$100(Lorg/jdom2/AttributeList;)I

    move-result p1

    iput p1, p0, Lorg/jdom2/AttributeList$ALIterator;->expect:I

    return-void
.end method

.method synthetic constructor <init>(Lorg/jdom2/AttributeList;Lorg/jdom2/AttributeList$1;)V
    .locals 0

    .line 648
    invoke-direct {p0, p1}, Lorg/jdom2/AttributeList$ALIterator;-><init>(Lorg/jdom2/AttributeList;)V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    .line 662
    iget v0, p0, Lorg/jdom2/AttributeList$ALIterator;->cursor:I

    iget-object v1, p0, Lorg/jdom2/AttributeList$ALIterator;->this$0:Lorg/jdom2/AttributeList;

    invoke-static {v1}, Lorg/jdom2/AttributeList;->access$200(Lorg/jdom2/AttributeList;)I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 648
    invoke-virtual {p0}, Lorg/jdom2/AttributeList$ALIterator;->next()Lorg/jdom2/Attribute;

    move-result-object v0

    return-object v0
.end method

.method public next()Lorg/jdom2/Attribute;
    .locals 3

    .line 667
    iget-object v0, p0, Lorg/jdom2/AttributeList$ALIterator;->this$0:Lorg/jdom2/AttributeList;

    invoke-static {v0}, Lorg/jdom2/AttributeList;->access$300(Lorg/jdom2/AttributeList;)I

    move-result v0

    iget v1, p0, Lorg/jdom2/AttributeList$ALIterator;->expect:I

    if-ne v0, v1, :cond_1

    .line 671
    iget v0, p0, Lorg/jdom2/AttributeList$ALIterator;->cursor:I

    iget-object v1, p0, Lorg/jdom2/AttributeList$ALIterator;->this$0:Lorg/jdom2/AttributeList;

    invoke-static {v1}, Lorg/jdom2/AttributeList;->access$200(Lorg/jdom2/AttributeList;)I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    .line 675
    iput-boolean v0, p0, Lorg/jdom2/AttributeList$ALIterator;->canremove:Z

    .line 676
    iget-object v0, p0, Lorg/jdom2/AttributeList$ALIterator;->this$0:Lorg/jdom2/AttributeList;

    invoke-static {v0}, Lorg/jdom2/AttributeList;->access$400(Lorg/jdom2/AttributeList;)[Lorg/jdom2/Attribute;

    move-result-object v0

    iget v1, p0, Lorg/jdom2/AttributeList$ALIterator;->cursor:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/jdom2/AttributeList$ALIterator;->cursor:I

    aget-object v0, v0, v1

    return-object v0

    .line 672
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Iterated beyond the end of the ContentList."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 668
    :cond_1
    new-instance v0, Ljava/util/ConcurrentModificationException;

    const-string v1, "ContentList was modified outside of this Iterator"

    invoke-direct {v0, v1}, Ljava/util/ConcurrentModificationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public remove()V
    .locals 2

    .line 681
    iget-object v0, p0, Lorg/jdom2/AttributeList$ALIterator;->this$0:Lorg/jdom2/AttributeList;

    invoke-static {v0}, Lorg/jdom2/AttributeList;->access$500(Lorg/jdom2/AttributeList;)I

    move-result v0

    iget v1, p0, Lorg/jdom2/AttributeList$ALIterator;->expect:I

    if-ne v0, v1, :cond_1

    .line 685
    iget-boolean v0, p0, Lorg/jdom2/AttributeList$ALIterator;->canremove:Z

    if-eqz v0, :cond_0

    .line 689
    iget-object v0, p0, Lorg/jdom2/AttributeList$ALIterator;->this$0:Lorg/jdom2/AttributeList;

    iget v1, p0, Lorg/jdom2/AttributeList$ALIterator;->cursor:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lorg/jdom2/AttributeList$ALIterator;->cursor:I

    invoke-virtual {v0, v1}, Lorg/jdom2/AttributeList;->remove(I)Lorg/jdom2/Attribute;

    .line 690
    iget-object v0, p0, Lorg/jdom2/AttributeList$ALIterator;->this$0:Lorg/jdom2/AttributeList;

    invoke-static {v0}, Lorg/jdom2/AttributeList;->access$600(Lorg/jdom2/AttributeList;)I

    move-result v0

    iput v0, p0, Lorg/jdom2/AttributeList$ALIterator;->expect:I

    const/4 v0, 0x0

    .line 691
    iput-boolean v0, p0, Lorg/jdom2/AttributeList$ALIterator;->canremove:Z

    return-void

    .line 686
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can only remove() content after a call to next()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 682
    :cond_1
    new-instance v0, Ljava/util/ConcurrentModificationException;

    const-string v1, "ContentList was modified outside of this Iterator"

    invoke-direct {v0, v1}, Ljava/util/ConcurrentModificationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

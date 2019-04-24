.class public final Lcom/squareup/haha/trove/THashMap$ValueView;
.super Lcom/squareup/haha/trove/THashMap$MapBackedView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/trove/THashMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ValueView"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/haha/trove/THashMap<TK;TV;>.MapBackedView<TV;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/haha/trove/THashMap;


# direct methods
.method protected constructor <init>(Lcom/squareup/haha/trove/THashMap;)V
    .locals 0

    .line 507
    iput-object p1, p0, Lcom/squareup/haha/trove/THashMap$ValueView;->this$0:Lcom/squareup/haha/trove/THashMap;

    invoke-direct {p0, p1}, Lcom/squareup/haha/trove/THashMap$MapBackedView;-><init>(Lcom/squareup/haha/trove/THashMap;)V

    return-void
.end method


# virtual methods
.method public final containsElement(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    .line 520
    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap$ValueView;->this$0:Lcom/squareup/haha/trove/THashMap;

    invoke-virtual {v0, p1}, Lcom/squareup/haha/trove/THashMap;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<TV;>;"
        }
    .end annotation

    .line 510
    new-instance v0, Lcom/squareup/haha/trove/THashMap$ValueView$1;

    iget-object v1, p0, Lcom/squareup/haha/trove/THashMap$ValueView;->this$0:Lcom/squareup/haha/trove/THashMap;

    invoke-direct {v0, p0, v1}, Lcom/squareup/haha/trove/THashMap$ValueView$1;-><init>(Lcom/squareup/haha/trove/THashMap$ValueView;Lcom/squareup/haha/trove/TObjectHash;)V

    return-object v0
.end method

.method public final removeElement(Ljava/lang/Object;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    .line 525
    const/4 v2, 0x0

    .line 526
    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap$ValueView;->this$0:Lcom/squareup/haha/trove/THashMap;

    iget-object v3, v0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    .line 527
    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap$ValueView;->this$0:Lcom/squareup/haha/trove/THashMap;

    iget-object v4, v0, Lcom/squareup/haha/trove/THashMap;->_set:[Ljava/lang/Object;

    .line 529
    array-length v5, v3

    :cond_0
    :goto_0
    move v0, v5

    add-int/lit8 v5, v5, -0x1

    if-lez v0, :cond_3

    .line 530
    aget-object v0, v4, v5

    if-eqz v0, :cond_1

    aget-object v0, v4, v5

    sget-object v1, Lcom/squareup/haha/trove/TObjectHash;->REMOVED:Ljava/lang/Object;

    if-eq v0, v1, :cond_1

    aget-object v0, v3, v5

    if-eq p1, v0, :cond_2

    :cond_1
    aget-object v0, v3, v5

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    aget-object v0, v3, v5

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 533
    :cond_2
    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap$ValueView;->this$0:Lcom/squareup/haha/trove/THashMap;

    invoke-virtual {v0, v5}, Lcom/squareup/haha/trove/THashMap;->removeAt(I)V

    .line 534
    const/4 v2, 0x1

    goto :goto_0

    .line 537
    :cond_3
    return v2
.end method

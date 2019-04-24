.class public final Lcom/squareup/haha/trove/THashMap$EntryView;
.super Lcom/squareup/haha/trove/THashMap$MapBackedView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/trove/THashMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "EntryView"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/haha/trove/THashMap$EntryView$EntryIterator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/haha/trove/THashMap<TK;TV;>.MapBackedView<Ljava/util/Map$Entry<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/haha/trove/THashMap;


# direct methods
.method constructor <init>(Lcom/squareup/haha/trove/THashMap;)V
    .locals 0

    .line 546
    iput-object p1, p0, Lcom/squareup/haha/trove/THashMap$EntryView;->this$0:Lcom/squareup/haha/trove/THashMap;

    invoke-direct {p0, p1}, Lcom/squareup/haha/trove/THashMap$MapBackedView;-><init>(Lcom/squareup/haha/trove/THashMap;)V

    .line 547
    return-void
.end method


# virtual methods
.method public final synthetic containsElement(Ljava/lang/Object;)Z
    .locals 7

    .line 545
    move-object v3, p1

    check-cast v3, Ljava/util/Map$Entry;

    .line 1592
    move-object v2, p0

    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap$EntryView;->this$0:Lcom/squareup/haha/trove/THashMap;

    .line 1603
    move-object v6, v3

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    .line 1592
    invoke-virtual {v0, v1}, Lcom/squareup/haha/trove/THashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 1593
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    .line 1594
    if-eq v5, v4, :cond_0

    if-eqz v4, :cond_1

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    .line 545
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<Ljava/util/Map$Entry<TK;TV;>;>;"
        }
    .end annotation

    .line 562
    new-instance v0, Lcom/squareup/haha/trove/THashMap$EntryView$EntryIterator;

    iget-object v1, p0, Lcom/squareup/haha/trove/THashMap$EntryView;->this$0:Lcom/squareup/haha/trove/THashMap;

    invoke-direct {v0, p0, v1}, Lcom/squareup/haha/trove/THashMap$EntryView$EntryIterator;-><init>(Lcom/squareup/haha/trove/THashMap$EntryView;Lcom/squareup/haha/trove/THashMap;)V

    return-object v0
.end method

.method public final synthetic removeElement(Ljava/lang/Object;)Z
    .locals 8

    .line 545
    move-object v2, p1

    check-cast v2, Ljava/util/Map$Entry;

    move-object v1, p0

    .line 2577
    .line 2603
    move-object v7, v2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    .line 2577
    .line 2578
    iget-object v0, v1, Lcom/squareup/haha/trove/THashMap$EntryView;->this$0:Lcom/squareup/haha/trove/THashMap;

    invoke-virtual {v0, v3}, Lcom/squareup/haha/trove/THashMap;->index(Ljava/lang/Object;)I

    move-result v0

    .line 2579
    move v4, v0

    if-ltz v0, :cond_1

    .line 2580
    .line 3599
    move-object v6, v2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    .line 2580
    .line 2581
    iget-object v0, v1, Lcom/squareup/haha/trove/THashMap$EntryView;->this$0:Lcom/squareup/haha/trove/THashMap;

    iget-object v0, v0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    aget-object v0, v0, v4

    if-eq v5, v0, :cond_0

    if-eqz v5, :cond_1

    iget-object v0, v1, Lcom/squareup/haha/trove/THashMap$EntryView;->this$0:Lcom/squareup/haha/trove/THashMap;

    iget-object v0, v0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    aget-object v0, v0, v4

    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2583
    :cond_0
    iget-object v0, v1, Lcom/squareup/haha/trove/THashMap$EntryView;->this$0:Lcom/squareup/haha/trove/THashMap;

    invoke-virtual {v0, v4}, Lcom/squareup/haha/trove/THashMap;->removeAt(I)V

    .line 2584
    const/4 v0, 0x1

    return v0

    .line 545
    .line 2587
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

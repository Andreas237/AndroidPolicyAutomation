.class public Lcom/shopkick/app/adapter/ViewDefaults;
.super Ljava/lang/Object;
.source "ViewDefaults.java"


# instance fields
.field private childIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private childViews:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;>;"
        }
    .end annotation
.end field

.field private tagDefaultMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/shopkick/app/util/DefaultsHolder;",
            ">;"
        }
    .end annotation
.end field

.field private topView:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;[I)V
    .locals 3

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/shopkick/app/adapter/ViewDefaults;->topView:Landroid/view/View;

    .line 22
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/adapter/ViewDefaults;->childIds:Ljava/util/Set;

    .line 23
    array-length p1, p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    aget v1, p2, v0

    .line 24
    iget-object v2, p0, Lcom/shopkick/app/adapter/ViewDefaults;->childIds:Ljava/util/Set;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 26
    :cond_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/adapter/ViewDefaults;->childViews:Ljava/util/HashMap;

    .line 27
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/adapter/ViewDefaults;->tagDefaultMap:Ljava/util/HashMap;

    return-void
.end method

.method private findViewsById(Landroid/view/View;I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "I)",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewDefaults;->childViews:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    .line 43
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    instance-of v1, p1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    .line 45
    :goto_0
    move-object v2, p1

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge v1, v3, :cond_3

    .line 46
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 47
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v3

    if-ne v3, p2, :cond_1

    .line 48
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    :cond_1
    invoke-direct {p0, v2, p2}, Lcom/shopkick/app/adapter/ViewDefaults;->findViewsById(Landroid/view/View;I)Ljava/util/List;

    move-result-object v2

    .line 51
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 52
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 56
    :cond_3
    iget-object v1, p0, Lcom/shopkick/app/adapter/ViewDefaults;->topView:Landroid/view/View;

    if-ne p1, v1, :cond_4

    .line 57
    iget-object p1, p0, Lcom/shopkick/app/adapter/ViewDefaults;->childViews:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-object v0
.end method

.method private saveDefaults(Ljava/util/Set;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 71
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 72
    iget-object v1, p0, Lcom/shopkick/app/adapter/ViewDefaults;->topView:Landroid/view/View;

    invoke-direct {p0, v1, v0}, Lcom/shopkick/app/adapter/ViewDefaults;->findViewsById(Landroid/view/View;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    .line 73
    new-instance v3, Lcom/shopkick/app/util/DefaultsHolder;

    invoke-direct {v3, v2}, Lcom/shopkick/app/util/DefaultsHolder;-><init>(Landroid/view/View;)V

    .line 74
    iget-object v2, p0, Lcom/shopkick/app/adapter/ViewDefaults;->tagDefaultMap:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public addDefaults(Lcom/shopkick/app/adapter/ViewDefaults;)V
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewDefaults;->childIds:Ljava/util/Set;

    iget-object p1, p1, Lcom/shopkick/app/adapter/ViewDefaults;->childIds:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public hasSavedDefaults(Lcom/shopkick/app/adapter/ViewDefaults;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewDefaults;->childIds:Ljava/util/Set;

    iget-object p1, p1, Lcom/shopkick/app/adapter/ViewDefaults;->childIds:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected resetDefaults()V
    .locals 6

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewDefaults;->childIds:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 81
    iget-object v2, p0, Lcom/shopkick/app/adapter/ViewDefaults;->topView:Landroid/view/View;

    invoke-direct {p0, v2, v1}, Lcom/shopkick/app/adapter/ViewDefaults;->findViewsById(Landroid/view/View;I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    .line 82
    iget-object v4, p0, Lcom/shopkick/app/adapter/ViewDefaults;->tagDefaultMap:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/util/DefaultsHolder;

    .line 83
    invoke-virtual {v4, v3}, Lcom/shopkick/app/util/DefaultsHolder;->resetDefaults(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method protected resetDefaults([I)V
    .locals 7

    .line 89
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget v2, p1, v1

    .line 90
    iget-object v3, p0, Lcom/shopkick/app/adapter/ViewDefaults;->topView:Landroid/view/View;

    invoke-direct {p0, v3, v2}, Lcom/shopkick/app/adapter/ViewDefaults;->findViewsById(Landroid/view/View;I)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    .line 91
    iget-object v5, p0, Lcom/shopkick/app/adapter/ViewDefaults;->tagDefaultMap:Ljava/util/HashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/util/DefaultsHolder;

    .line 92
    invoke-virtual {v5, v4}, Lcom/shopkick/app/util/DefaultsHolder;->resetDefaults(Landroid/view/View;)V

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method protected saveDefaults()V
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewDefaults;->childIds:Ljava/util/Set;

    invoke-direct {p0, v0}, Lcom/shopkick/app/adapter/ViewDefaults;->saveDefaults(Ljava/util/Set;)V

    return-void
.end method

.method protected saveDefaults(Lcom/shopkick/app/adapter/ViewDefaults;)V
    .locals 0

    .line 67
    iget-object p1, p1, Lcom/shopkick/app/adapter/ViewDefaults;->childIds:Ljava/util/Set;

    invoke-direct {p0, p1}, Lcom/shopkick/app/adapter/ViewDefaults;->saveDefaults(Ljava/util/Set;)V

    return-void
.end method

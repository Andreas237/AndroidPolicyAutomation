.class public Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;
.super Ljava/lang/Object;
.source "UserEventRecyclerViewCoordinator.java"

# interfaces
.implements Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;
.implements Lcom/shopkick/app/logging/IUserEventCoordinator;


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field private static final ACTIVE_VIEW_PREFIX:Ljava/lang/String; = "ActiveRow"


# instance fields
.field private initialized:Z

.field private isShowingPage:Z

.field private recyclerViewRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/view/SKRecyclerView/IUserEventRecyclerView;",
            ">;"
        }
    .end annotation
.end field

.field private viewCoresByChildView:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/view/View;",
            "Ljava/util/WeakHashMap<",
            "Lcom/shopkick/app/logging/UserEventViewCore;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private visibleRowConstraintKey:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ActiveRow"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->visibleRowConstraintKey:Ljava/lang/String;

    .line 35
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->viewCoresByChildView:Ljava/util/WeakHashMap;

    .line 36
    new-instance p1, Ljava/lang/ref/WeakReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->recyclerViewRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private triggerShowScreen()V
    .locals 2

    .line 40
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->recyclerViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/IUserEventRecyclerView;

    if-eqz v0, :cond_1

    .line 41
    iget-boolean v1, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->isShowingPage:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 45
    invoke-interface {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/IUserEventRecyclerView;->setDisableActiveViewMarking(Z)V

    const/4 v0, 0x1

    .line 46
    iput-boolean v0, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->initialized:Z

    return-void

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public onAttach(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 1

    .line 55
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->recyclerViewRef:Ljava/lang/ref/WeakReference;

    const/4 v0, 0x1

    .line 56
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setDisableActiveViewMarking(Z)V

    .line 57
    invoke-direct {p0}, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->triggerShowScreen()V

    return-void
.end method

.method public onHidePage()V
    .locals 4

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->viewCoresByChildView:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/WeakHashMap;

    .line 142
    invoke-virtual {v1}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/logging/UserEventViewCore;

    .line 143
    iget-object v3, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->visibleRowConstraintKey:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/logging/UserEventViewCore;->addImpressionConstraintKey(Ljava/lang/String;)V

    goto :goto_0

    .line 146
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->recyclerViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/IUserEventRecyclerView;

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    .line 148
    invoke-interface {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/IUserEventRecyclerView;->setDisableActiveViewMarking(Z)V

    :cond_2
    const/4 v0, 0x0

    .line 150
    iput-boolean v0, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->isShowingPage:Z

    .line 151
    iput-boolean v0, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->initialized:Z

    return-void
.end method

.method public onItemActive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    .line 72
    iget-object p1, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->viewCoresByChildView:Ljava/util/WeakHashMap;

    invoke-virtual {p1, p2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/WeakHashMap;

    if-eqz p1, :cond_0

    .line 74
    invoke-virtual {p1}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/logging/UserEventViewCore;

    .line 75
    iget-object p3, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->visibleRowConstraintKey:Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/logging/UserEventViewCore;->removeImpressionConstraintKey(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onItemInactive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    .line 82
    iget-object p1, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->viewCoresByChildView:Ljava/util/WeakHashMap;

    invoke-virtual {p1, p2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/WeakHashMap;

    if-eqz p1, :cond_0

    .line 84
    invoke-virtual {p1}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/logging/UserEventViewCore;

    .line 85
    iget-object p3, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->visibleRowConstraintKey:Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/logging/UserEventViewCore;->addImpressionConstraintKey(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;I)V
    .locals 0

    return-void
.end method

.method public onScrolled(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;II)V
    .locals 0

    return-void
.end method

.method public onShowPage()V
    .locals 1

    const/4 v0, 0x1

    .line 135
    iput-boolean v0, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->isShowingPage:Z

    .line 136
    invoke-direct {p0}, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->triggerShowScreen()V

    return-void
.end method

.method public onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->viewCoresByChildView:Ljava/util/WeakHashMap;

    iget-object p1, p1, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/WeakHashMap;

    if-eqz p1, :cond_0

    .line 98
    invoke-virtual {p1}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/UserEventViewCore;

    .line 99
    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventViewCore;->stopMoatTracking()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public registerEventViewCore(Lcom/shopkick/app/logging/UserEventViewCore;Landroid/view/View;)V
    .locals 3

    .line 111
    invoke-virtual {p1}, Lcom/shopkick/app/logging/UserEventViewCore;->getDisplayPos()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 113
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->viewCoresByChildView:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/WeakHashMap;

    if-nez v1, :cond_0

    .line 115
    new-instance v1, Ljava/util/WeakHashMap;

    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    .line 116
    iget-object v2, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->viewCoresByChildView:Ljava/util/WeakHashMap;

    invoke-virtual {v2, p2, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const/4 p2, 0x0

    .line 118
    invoke-virtual {v1, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    iget-object p2, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->recyclerViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/view/SKRecyclerView/IUserEventRecyclerView;

    .line 121
    iget-boolean v1, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->initialized:Z

    if-eqz v1, :cond_1

    if-eqz p2, :cond_1

    invoke-interface {p2, v0}, Lcom/shopkick/app/view/SKRecyclerView/IUserEventRecyclerView;->isIndexActive(I)Z

    move-result p2

    if-nez p2, :cond_2

    .line 122
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;->visibleRowConstraintKey:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/logging/UserEventViewCore;->addImpressionConstraintKey(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public registerEventViewCore(Lcom/shopkick/app/logging/UserEventViewCore;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    return-void
.end method

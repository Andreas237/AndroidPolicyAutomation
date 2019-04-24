.class public Lcom/shopkick/app/logging/SimpleUserEventCoordinator;
.super Ljava/lang/Object;
.source "SimpleUserEventCoordinator.java"

# interfaces
.implements Lcom/shopkick/app/logging/IUserEventCoordinator;


# static fields
.field private static final ACTIVE_PAGE_CONSTRAINT_KEY:Ljava/lang/String; = "PageConstraintKey"


# instance fields
.field private detectedEvents:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private isShowingPage:Z

.field private viewCores:Ljava/util/WeakHashMap;
    .annotation runtime Lcom/google/gson/annotations/Expose;
        deserialize = false
        serialize = false
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Lcom/shopkick/app/logging/UserEventViewCore;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;->viewCores:Ljava/util/WeakHashMap;

    .line 27
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;->detectedEvents:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public onHidePage()V
    .locals 3

    .line 58
    iget-object v0, p0, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;->viewCores:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/logging/UserEventViewCore;

    const-string v2, "PageConstraintKey"

    .line 59
    invoke-virtual {v1, v2}, Lcom/shopkick/app/logging/UserEventViewCore;->addImpressionConstraintKey(Ljava/lang/String;)V

    goto :goto_0

    .line 61
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;->detectedEvents:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    const/4 v0, 0x0

    .line 62
    iput-boolean v0, p0, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;->isShowingPage:Z

    return-void
.end method

.method public onShowPage()V
    .locals 3

    const/4 v0, 0x1

    .line 50
    iput-boolean v0, p0, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;->isShowingPage:Z

    .line 51
    iget-object v0, p0, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;->viewCores:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/logging/UserEventViewCore;

    const-string v2, "PageConstraintKey"

    .line 52
    invoke-virtual {v1, v2}, Lcom/shopkick/app/logging/UserEventViewCore;->removeImpressionConstraintKey(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public registerEventViewCore(Lcom/shopkick/app/logging/UserEventViewCore;Landroid/view/View;)V
    .locals 1

    .line 32
    iget-object p2, p0, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;->viewCores:Ljava/util/WeakHashMap;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    iget-boolean p2, p0, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;->isShowingPage:Z

    if-nez p2, :cond_0

    const-string p2, "PageConstraintKey"

    .line 34
    invoke-virtual {p1, p2}, Lcom/shopkick/app/logging/UserEventViewCore;->addImpressionConstraintKey(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public registerEventViewCore(Lcom/shopkick/app/logging/UserEventViewCore;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 42
    iget-object p2, p0, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;->viewCores:Ljava/util/WeakHashMap;

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    iget-boolean p2, p0, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;->isShowingPage:Z

    if-nez p2, :cond_0

    const-string p2, "PageConstraintKey"

    .line 44
    invoke-virtual {p1, p2}, Lcom/shopkick/app/logging/UserEventViewCore;->addImpressionConstraintKey(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

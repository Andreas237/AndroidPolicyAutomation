.class public Lcom/ibotta/android/view/common/scrollposition/ScrollPositionManager;
.super Ljava/lang/Object;
.source "ScrollPositionManager.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private scrollPositions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "TT;",
            "Lcom/ibotta/android/view/common/scrollposition/ScrollPosition;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/view/common/scrollposition/ScrollPositionManager;->scrollPositions:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Lcom/ibotta/android/view/common/scrollposition/ScrollPosition;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lcom/ibotta/android/view/common/scrollposition/ScrollPosition;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/view/common/scrollposition/ScrollPositionManager;->scrollPositions:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/common/scrollposition/ScrollPosition;

    if-nez v0, :cond_0

    .line 28
    new-instance v0, Lcom/ibotta/android/view/common/scrollposition/ScrollPosition;

    invoke-direct {v0}, Lcom/ibotta/android/view/common/scrollposition/ScrollPosition;-><init>()V

    .line 29
    iget-object v1, p0, Lcom/ibotta/android/view/common/scrollposition/ScrollPositionManager;->scrollPositions:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public save(Ljava/lang/Object;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;II)V"
        }
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/ibotta/android/view/common/scrollposition/ScrollPositionManager;->scrollPositions:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/common/scrollposition/ScrollPosition;

    if-nez v0, :cond_0

    .line 16
    new-instance v0, Lcom/ibotta/android/view/common/scrollposition/ScrollPosition;

    invoke-direct {v0}, Lcom/ibotta/android/view/common/scrollposition/ScrollPosition;-><init>()V

    .line 17
    iget-object v1, p0, Lcom/ibotta/android/view/common/scrollposition/ScrollPositionManager;->scrollPositions:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    :cond_0
    invoke-virtual {v0, p2}, Lcom/ibotta/android/view/common/scrollposition/ScrollPosition;->setScrollIndex(I)V

    .line 21
    invoke-virtual {v0, p3}, Lcom/ibotta/android/view/common/scrollposition/ScrollPosition;->setScrollOffset(I)V

    return-void
.end method

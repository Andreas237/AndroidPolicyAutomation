.class public Lcom/ibotta/android/view/model/content/BonusItem;
.super Lcom/ibotta/android/view/model/content/AbstractContentItem;
.source "BonusItem.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/view/model/content/AbstractContentItem<",
        "Lcom/ibotta/api/model/BonusModel;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/proprietary/event/EventChain;Lcom/ibotta/api/model/BonusModel;)V
    .locals 0

    .line 14
    invoke-direct {p0, p2, p1}, Lcom/ibotta/android/view/model/content/AbstractContentItem;-><init>(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/android/tracking/proprietary/event/EventChain;)V

    return-void
.end method


# virtual methods
.method public contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 19
    invoke-super {p0, p1}, Lcom/ibotta/android/view/model/content/AbstractContentItem;->contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 20
    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/BonusItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 21
    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/BonusItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/BonusModel;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setBonusId(Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic copy()Lcom/ibotta/android/view/model/content/AbstractContentItem;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/BonusItem;->copy()Lcom/ibotta/android/view/model/content/BonusItem;

    move-result-object v0

    return-object v0
.end method

.method public copy()Lcom/ibotta/android/view/model/content/BonusItem;
    .locals 3

    .line 27
    new-instance v0, Lcom/ibotta/android/view/model/content/BonusItem;

    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/BonusItem;->getEventChain()Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/BonusItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/BonusModel;

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/view/model/content/BonusItem;-><init>(Lcom/ibotta/android/tracking/proprietary/event/EventChain;Lcom/ibotta/api/model/BonusModel;)V

    .line 28
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/model/content/BonusItem;->copyContent(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    return-object v0
.end method

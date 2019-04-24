.class public abstract Lcom/ibotta/android/mvp/ui/view/bonus/picker/AbstractBonusPickerRowCreator;
.super Ljava/lang/Object;
.source "AbstractBonusPickerRowCreator.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowCreator;


# instance fields
.field private final bonusPickerReducer:Lcom/ibotta/android/account/bonus/BonusPickerReducer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/account/bonus/BonusPickerReducer;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/AbstractBonusPickerRowCreator;->bonusPickerReducer:Lcom/ibotta/android/account/bonus/BonusPickerReducer;

    return-void
.end method


# virtual methods
.method public buildDataMap()Ljava/util/LinkedHashMap;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/activity/bonus/BonusPickerTab;",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;",
            ">;>;"
        }
    .end annotation

    .line 37
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 38
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/bonus/BonusPickerTab;->values()[Lcom/ibotta/android/mvp/ui/activity/bonus/BonusPickerTab;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v1, v4

    .line 39
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 41
    sget-object v7, Lcom/ibotta/android/mvp/ui/activity/bonus/BonusPickerTab;->AVAILABLE:Lcom/ibotta/android/mvp/ui/activity/bonus/BonusPickerTab;

    if-ne v5, v7, :cond_0

    .line 42
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/AbstractBonusPickerRowCreator;->getFeaturedBonuses()Ljava/util/List;

    move-result-object v7

    invoke-virtual {p0, v7, v3}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/AbstractBonusPickerRowCreator;->createFeaturedBonusRows(Ljava/util/List;I)Ljava/util/List;

    move-result-object v7

    .line 44
    invoke-interface {v6, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 45
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    xor-int/lit8 v7, v7, 0x1

    invoke-virtual {p0, v7}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/AbstractBonusPickerRowCreator;->createTitleBarRow(Z)Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TitleBarRow;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/AbstractBonusPickerRowCreator;->getAvailableBonuses()Ljava/util/List;

    move-result-object v7

    invoke-virtual {p0, v7}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/AbstractBonusPickerRowCreator;->createAvailableBonusRows(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 48
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/AbstractBonusPickerRowCreator;->getCompletedBonuses()Ljava/util/List;

    move-result-object v7

    invoke-virtual {p0, v7}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/AbstractBonusPickerRowCreator;->createCompletedBonusRows(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 51
    :goto_1
    invoke-virtual {v0, v5, v6}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method protected createAvailableBonusRows(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;",
            ">;"
        }
    .end annotation

    .line 88
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 89
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/BonusModel;

    .line 90
    new-instance v2, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;

    invoke-direct {v2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;-><init>()V

    .line 91
    invoke-virtual {v2, v1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;->setBonusModel(Lcom/ibotta/api/model/BonusModel;)V

    .line 93
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method protected createCompletedBonusRows(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;",
            ">;"
        }
    .end annotation

    .line 100
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 102
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 103
    new-instance p1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/EmptyCompletedBonusesRow;

    invoke-direct {p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/EmptyCompletedBonusesRow;-><init>()V

    .line 104
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0

    .line 108
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/BonusModel;

    .line 109
    new-instance v2, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;

    invoke-direct {v2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;-><init>()V

    .line 110
    invoke-virtual {v2, v1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;->setBonusModel(Lcom/ibotta/api/model/BonusModel;)V

    .line 112
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method protected createFeaturedBonusRows(Ljava/util/List;I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;I)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;",
            ">;"
        }
    .end annotation

    .line 58
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 62
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 64
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/BonusModel;

    .line 65
    new-instance v2, Lcom/ibotta/android/view/model/content/BonusItem;

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;-><init>()V

    invoke-direct {v2, v3, v1}, Lcom/ibotta/android/view/model/content/BonusItem;-><init>(Lcom/ibotta/android/tracking/proprietary/event/EventChain;Lcom/ibotta/api/model/BonusModel;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 68
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 69
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/AbstractBonusPickerRowCreator;->bonusPickerReducer:Lcom/ibotta/android/account/bonus/BonusPickerReducer;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/ibotta/android/account/bonus/BonusPickerReducer;->createTitle(Z)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v1

    .line 70
    new-instance v2, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;

    invoke-direct {v2, v1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 71
    invoke-virtual {v2, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;->setBonusItems(Ljava/util/List;)V

    .line 72
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v2, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;->setModuleIndex(Ljava/lang/Integer;)V

    .line 73
    invoke-virtual {v1}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getTitle()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;->setModuleName(Ljava/lang/String;)V

    .line 75
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method protected createTitleBarRow(Z)Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TitleBarRow;
    .locals 3

    .line 81
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TitleBarRow;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/AbstractBonusPickerRowCreator;->bonusPickerReducer:Lcom/ibotta/android/account/bonus/BonusPickerReducer;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/ibotta/android/account/bonus/BonusPickerReducer;->createTitle(Z)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TitleBarRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 82
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TitleBarRow;->setUnderFeaturedBonuses(Z)V

    return-object v0
.end method

.method protected abstract getAvailableBonuses()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation
.end method

.method protected abstract getCompletedBonuses()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation
.end method

.method protected abstract getFeaturedBonuses()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation
.end method

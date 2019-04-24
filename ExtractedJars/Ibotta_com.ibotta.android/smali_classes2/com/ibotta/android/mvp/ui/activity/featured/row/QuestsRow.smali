.class public Lcom/ibotta/android/mvp/ui/activity/featured/row/QuestsRow;
.super Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;
.source "QuestsRow.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/featured/row/ModuleRow;


# instance fields
.field private module:Lcom/ibotta/api/model/base/Module;

.field private final titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 25
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->QUESTS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;)V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/QuestsRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-void
.end method

.method private isValidQuest(Lcom/ibotta/api/model/BonusModel;)Z
    .locals 3

    .line 56
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getQuest()Lcom/ibotta/api/model/QuestModel;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 58
    invoke-interface {p1}, Lcom/ibotta/api/model/QuestModel;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 62
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/QuestModel;->getQuestStateEnum()Lcom/ibotta/api/model/QuestModel$State;

    move-result-object v1

    sget-object v2, Lcom/ibotta/api/model/QuestModel$State;->COMPLETED:Lcom/ibotta/api/model/QuestModel$State;

    if-eq v1, v2, :cond_2

    .line 63
    invoke-interface {p1}, Lcom/ibotta/api/model/QuestModel;->getQuestStateEnum()Lcom/ibotta/api/model/QuestModel$State;

    move-result-object p1

    sget-object v1, Lcom/ibotta/api/model/QuestModel$State;->CONFIRMED_PENDING:Lcom/ibotta/api/model/QuestModel$State;

    if-ne p1, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v0

    :cond_3
    :goto_1
    return v0
.end method


# virtual methods
.method public getModels()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/QuestsRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object v1

    if-nez v1, :cond_0

    return-object v0

    .line 44
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/QuestsRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/base/BaseContent;

    .line 45
    instance-of v3, v2, Lcom/ibotta/api/model/BonusModel;

    if-eqz v3, :cond_1

    .line 46
    check-cast v2, Lcom/ibotta/api/model/BonusModel;

    invoke-direct {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/featured/row/QuestsRow;->isValidQuest(Lcom/ibotta/api/model/BonusModel;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 47
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public getModule()Lcom/ibotta/api/model/base/Module;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/QuestsRow;->module:Lcom/ibotta/api/model/base/Module;

    return-object v0
.end method

.method public getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/QuestsRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method

.method public setModule(Lcom/ibotta/api/model/base/Module;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/QuestsRow;->module:Lcom/ibotta/api/model/base/Module;

    return-void
.end method

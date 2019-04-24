.class public Lcom/shopkick/app/shoppinglists/SLPopularItemsController;
.super Ljava/lang/Object;
.source "SLPopularItemsController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private confirmButton:Lcom/shopkick/app/widget/SKButton;

.field private context:Landroid/content/Context;

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private itemContainerLayout:Landroid/view/ViewGroup;

.field private popularItemMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/view/View;",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;",
            ">;"
        }
    .end annotation
.end field

.field private popularItemsLayout:Landroid/view/View;

.field private selectedListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

.field private shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

.field private simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Landroid/view/View;Lcom/shopkick/app/logging/UserEventLogger;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->popularItemMap:Ljava/util/HashMap;

    .line 44
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    .line 45
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->context:Landroid/content/Context;

    .line 46
    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 48
    new-instance p1, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    invoke-direct {p1}, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    .line 49
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    invoke-virtual {p3, p1}, Lcom/shopkick/app/logging/UserEventLogger;->addUserEventCoordinator(Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    const p1, 0x7f090352

    .line 51
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->itemContainerLayout:Landroid/view/ViewGroup;

    const p1, 0x7f090533

    .line 52
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->popularItemsLayout:Landroid/view/View;

    const p1, 0x7f090192

    .line 53
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->confirmButton:Lcom/shopkick/app/widget/SKButton;

    .line 54
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->confirmButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->confirmButton:Lcom/shopkick/app/widget/SKButton;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    return-void
.end method

.method private addItem(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;)V
    .locals 4

    .line 105
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 106
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->itemContainerLayout:Landroid/view/ViewGroup;

    const/4 v2, 0x0

    const v3, 0x7f0c01ba

    invoke-virtual {v0, v3, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/UserEventFrameLayout;

    const v1, 0x7f090721

    .line 109
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/UserEventFrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->title:Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setTag(Ljava/lang/Object;)V

    .line 112
    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 115
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0xda

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 116
    invoke-virtual {v0}, Lcom/shopkick/app/widget/UserEventFrameLayout;->getTag()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsSelected(Ljava/lang/Boolean;)V

    .line 117
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->keywordId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTaxonomyKeywordId(Ljava/lang/String;)V

    .line 119
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 120
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    const/4 v3, 0x1

    .line 121
    iput-boolean v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressActionUntilManuallyTriggered:Z

    .line 122
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v1, v3, v2}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 124
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->popularItemMap:Ljava/util/HashMap;

    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->itemContainerLayout:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private clearItems()V
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->popularItemMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->itemContainerLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    return-void
.end method

.method private getSelectedItemCount()Ljava/lang/Integer;
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    .line 130
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->itemContainerLayout:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 131
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->itemContainerLayout:Landroid/view/ViewGroup;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 132
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    if-eqz v2, :cond_0

    .line 133
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 138
    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method private initTags()V
    .locals 3

    .line 87
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getPopularItemList()Ljava/util/ArrayList;

    move-result-object v0

    .line 88
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->popularItemsLayout:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 91
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->popularItemsLayout:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 92
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;

    .line 93
    invoke-direct {p0, v1}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->addItem(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private updateConfirmButton()V
    .locals 7

    .line 142
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->getSelectedItemCount()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_0

    .line 145
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->confirmButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0f003b

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    .line 148
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 146
    invoke-virtual {v2, v3, v0, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 145
    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 149
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->confirmButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v6}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    goto :goto_0

    .line 151
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->confirmButton:Lcom/shopkick/app/widget/SKButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public addSelectedItem()V
    .locals 3

    .line 156
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->selectedListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    if-eqz v0, :cond_0

    .line 158
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;->shoppingListId:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->getSelectedItems()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->addShoppingListSuggestions(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_0
    return-void
.end method

.method public destroy()V
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->popularItemMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public getSelectedItems()Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;",
            ">;"
        }
    .end annotation

    .line 164
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->itemContainerLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    .line 165
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 167
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->itemContainerLayout:Landroid/view/ViewGroup;

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 168
    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    if-eqz v4, :cond_0

    .line 169
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 170
    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->popularItemMap:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public hidePopularItems()V
    .locals 2

    .line 79
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->popularItemsLayout:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public initPopularItems()V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->clearItems()V

    .line 70
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->initTags()V

    .line 71
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->updateConfirmButton()V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 183
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 185
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x4

    const v3, 0x7f090722

    if-ne v1, v3, :cond_1

    .line 186
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    .line 188
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 189
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    .line 192
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0xda

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 193
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsSelected(Ljava/lang/Boolean;)V

    .line 194
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->popularItemMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->popularItemMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->keywordId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTaxonomyKeywordId(Ljava/lang/String;)V

    .line 195
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 198
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->updateConfirmButton()V

    goto :goto_2

    .line 200
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7f090192

    if-ne p1, v0, :cond_3

    .line 202
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0xdb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 203
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->getSelectedItemCount()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumSelectedItems(Ljava/lang/Integer;)V

    .line 204
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTaxonomyKeywordIds(Ljava/util/ArrayList;)V

    .line 205
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->getSelectedItems()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;

    .line 206
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getTaxonomyKeywordIds()Ljava/util/ArrayList;

    move-result-object v2

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->keywordId:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 208
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 210
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->addSelectedItem()V

    :cond_3
    :goto_2
    return-void
.end method

.method public setSelectedListInfo(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->selectedListInfo:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListInfo;

    return-void
.end method

.method public showPopularItems()V
    .locals 2

    .line 75
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLPopularItemsController;->popularItemsLayout:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

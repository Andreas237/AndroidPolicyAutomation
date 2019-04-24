.class public Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;
.super Landroid/widget/BaseAdapter;
.source "SLEntryPickerAdapter.java"


# instance fields
.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private numCharactersEntered:I

.field private simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

.field private slEntryPickerController:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

.field private suggestions:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;",
            ">;"
        }
    .end annotation
.end field

.field private taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

.field private taxonomyKeywordIds:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/shoppinglists/SLEntryPickerController;)V
    .locals 1

    .line 33
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->suggestions:Ljava/util/ArrayList;

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->taxonomyKeywordIds:Ljava/util/ArrayList;

    .line 34
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    .line 35
    new-instance p1, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    invoke-direct {p1}, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    .line 36
    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 37
    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->slEntryPickerController:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    .line 38
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventLogger;->addUserEventCoordinator(Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->suggestions:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->suggestions:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 78
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0c01b9

    .line 79
    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 80
    new-instance p3, Lcom/shopkick/app/adapter/ViewHolder;

    invoke-direct {p3}, Lcom/shopkick/app/adapter/ViewHolder;-><init>()V

    .line 81
    invoke-virtual {p3, p2}, Lcom/shopkick/app/adapter/ViewHolder;->populate(Landroid/view/View;)V

    .line 82
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 84
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/adapter/ViewHolder;

    .line 88
    :goto_0
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0xdc

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 89
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSuggestionRankingPosition(Ljava/lang/Integer;)V

    .line 90
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->taxonomyKeywordIds:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTaxonomyKeywordIds(Ljava/util/ArrayList;)V

    .line 91
    iget v2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->numCharactersEntered:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumCharactersEntered(Ljava/lang/Integer;)V

    .line 93
    iget-object v2, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->suggestions:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    .line 95
    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->taxonomyDataSource:Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;

    iget-object v5, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/shopkick/app/shoppinglists/TaxonomyDataSource;->getTaxonomyNode(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;

    move-result-object v4

    .line 98
    iget-object v5, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->title:Ljava/lang/String;

    const-string v6, "TaxonomyNodeIdOther"

    .line 99
    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v6, 0x0

    if-eqz v2, :cond_1

    .line 100
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const v7, 0x7f110694

    new-array v8, v3, [Ljava/lang/Object;

    aput-object v5, v8, v0

    invoke-virtual {v2, v7, v8}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 101
    invoke-virtual {v1, v6}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSuggestionRankingPosition(Ljava/lang/Integer;)V

    :cond_1
    const v0, 0x7f090252

    .line 105
    invoke-virtual {p3, v0}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f090250

    .line 106
    invoke-virtual {p3, v0}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p3

    if-eqz v4, :cond_2

    iget-object v6, v4, Lcom/shopkick/app/fetchers/api/skapi/TaxonomyNode;->name:Ljava/lang/String;

    :cond_2
    invoke-virtual {p3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    :cond_3
    new-instance p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p3}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->simpleUserEventCoordinator:Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    iput-object v0, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 111
    iput-object p2, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListViewCell:Landroid/view/View;

    .line 112
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListDisplayPos:Ljava/lang/Integer;

    .line 113
    iput-boolean v3, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressActionUntilManuallyTriggered:Z

    .line 116
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->slEntryPickerController:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->isShown()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 117
    move-object p1, p2

    check-cast p1, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v1, v0, p3}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    :cond_4
    return-object p2
.end method

.method public setEntryList(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 43
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->suggestions:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 44
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->taxonomyKeywordIds:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    const/4 p1, 0x0

    .line 45
    iput p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->numCharactersEntered:I

    goto :goto_1

    .line 47
    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->suggestions:Ljava/util/ArrayList;

    .line 48
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->taxonomyKeywordIds:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 49
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->slEntryPickerController:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->getSelectedItems()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;

    .line 50
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->keywordId:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 51
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->taxonomyKeywordIds:Ljava/util/ArrayList;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntrySuggestion;->keywordId:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 54
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->slEntryPickerController:Lcom/shopkick/app/shoppinglists/SLEntryPickerController;

    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/SLEntryPickerController;->getEnteredTextLength()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/shoppinglists/SLEntryPickerAdapter;->numCharactersEntered:I

    :goto_1
    return-void
.end method

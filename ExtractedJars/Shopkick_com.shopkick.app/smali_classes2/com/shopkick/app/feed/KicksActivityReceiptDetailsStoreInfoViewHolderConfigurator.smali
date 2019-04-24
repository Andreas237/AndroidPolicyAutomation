.class public Lcom/shopkick/app/feed/KicksActivityReceiptDetailsStoreInfoViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "KicksActivityReceiptDetailsStoreInfoViewHolderConfigurator.java"


# instance fields
.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/shopkick/app/feed/KicksActivityReceiptDetailsStoreInfoViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00f4

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 12

    const v0, 0x7f0900e9

    .line 28
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->occurrenceTimestampMs:Ljava/lang/Long;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    .line 30
    :goto_0
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->completedText:Ljava/lang/String;

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    const v3, 0x7f090759

    const v4, 0x7f09059d

    const v5, 0x7f09064c

    const v6, 0x7f090599

    const/16 v7, 0x8

    if-eqz v0, :cond_2

    .line 32
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8, v2}, Landroid/view/View;->setVisibility(I)V

    .line 33
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8, v2}, Landroid/view/View;->setVisibility(I)V

    const v8, 0x7f0901cd

    .line 34
    invoke-virtual {p1, v8}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v8

    new-instance v9, Ljava/util/Date;

    iget-object v10, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->occurrenceTimestampMs:Ljava/lang/Long;

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    invoke-direct {v9, v10, v11}, Ljava/util/Date;-><init>(J)V

    invoke-static {v9}, Lcom/shopkick/app/util/DateUtils;->dateToMonthAndDay(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    invoke-virtual {p1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/view/View;->setVisibility(I)V

    .line 37
    invoke-virtual {p1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    if-eqz v1, :cond_3

    .line 40
    invoke-virtual {p1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8, v2}, Landroid/view/View;->setVisibility(I)V

    .line 41
    invoke-virtual {p1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8, v2}, Landroid/view/View;->setVisibility(I)V

    const v8, 0x7f090598

    .line 42
    invoke-virtual {p1, v8}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v8

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->completedText:Ljava/lang/String;

    invoke-virtual {v8, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    if-nez v0, :cond_4

    if-nez v1, :cond_4

    .line 45
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 46
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 47
    invoke-virtual {p1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 48
    invoke-virtual {p1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 51
    :cond_4
    iget-object p2, p0, Lcom/shopkick/app/feed/KicksActivityReceiptDetailsStoreInfoViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p2, p2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->hideQuantityInReceiptDetails:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const v0, 0x7f090495

    if-eqz p2, :cond_5

    .line 52
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v7}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 54
    :cond_5
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_2
    return-void
.end method

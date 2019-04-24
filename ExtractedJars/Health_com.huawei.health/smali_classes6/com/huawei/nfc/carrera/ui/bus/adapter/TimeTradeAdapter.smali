.class public Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;
.super Landroid/widget/BaseExpandableListAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;,
        Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolderGroup;
    }
.end annotation


# instance fields
.field private mChildList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/List<Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;>;>;"
        }
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field private mGroupList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private mInflater:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/util/List<Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;>;>;)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Landroid/widget/BaseExpandableListAdapter;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mContext:Landroid/content/Context;

    .line 34
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mGroupList:Ljava/util/List;

    .line 35
    iput-object p3, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mChildList:Ljava/util/List;

    .line 36
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mInflater:Landroid/view/LayoutInflater;

    .line 37
    const-string v0, "********"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TimeTradeAdapter [mGroupList : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mGroupList:Ljava/util/List;

    .line 38
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "], [mChildList : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mChildList:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mChildList:Ljava/util/List;

    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 37
    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    return-void
.end method


# virtual methods
.method public getChild(II)Ljava/lang/Object;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mChildList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getChildId(II)J
    .locals 2

    .line 77
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .line 127
    const/4 v3, 0x0

    .line 129
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mChildList:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 130
    const-string v0, "mChildList is null!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 131
    return-object p4

    .line 133
    :cond_0
    if-ltz p1, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mChildList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_2

    .line 134
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getChildView groupPosition invalid:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 135
    return-object p4

    .line 138
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mChildList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 139
    const-string v0, "mChildList.get(groupPosition) is null!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 140
    return-object p4

    .line 143
    :cond_3
    if-ltz p2, :cond_4

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mChildList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p2, v0, :cond_5

    .line 144
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "childPosition invalid:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 145
    return-object p4

    .line 148
    :cond_5
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mChildList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;

    .line 149
    const/4 v0, 0x0

    if-ne v0, v4, :cond_6

    .line 150
    const-string v0, "tradeInfo is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 151
    return-object p4

    .line 154
    :cond_6
    if-nez p4, :cond_7

    .line 156
    new-instance v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;

    invoke-direct {v3}, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;-><init>()V

    .line 158
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mInflater:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/wallet/R$layout;->nfc_buscard_trade_info_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p4

    .line 159
    sget v0, Lcom/huawei/wallet/R$id;->nfc_trade_info_item_product_name:I

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;->productNameTx:Landroid/widget/TextView;

    .line 160
    sget v0, Lcom/huawei/wallet/R$id;->nfc_trade_info_item_amount:I

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;->amountTx:Landroid/widget/TextView;

    .line 161
    sget v0, Lcom/huawei/wallet/R$id;->nfc_trade_info_item_unit:I

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;->unitTx:Landroid/widget/TextView;

    .line 162
    sget v0, Lcom/huawei/wallet/R$id;->nfc_trade_info_item_status:I

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;->statusTx:Landroid/widget/TextView;

    .line 163
    sget v0, Lcom/huawei/wallet/R$id;->nfc_trade_info_item_listview_line:I

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;->lineImg:Landroid/widget/ImageView;

    .line 164
    sget v0, Lcom/huawei/wallet/R$id;->nfc_trade_info_item_date:I

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;->dateTx:Landroid/widget/TextView;

    .line 165
    invoke-virtual {p4, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 167
    sget v0, Lcom/huawei/wallet/R$id;->trade_hoder_id:I

    invoke-virtual {p4, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    goto :goto_0

    .line 171
    :cond_7
    sget v0, Lcom/huawei/wallet/R$id;->trade_hoder_id:I

    invoke-virtual {p4, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;

    .line 174
    if-nez v3, :cond_8

    .line 176
    const-string v0, "hold is null!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 177
    new-instance v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;

    invoke-direct {v3}, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;-><init>()V

    .line 180
    :cond_8
    :goto_0
    invoke-virtual {p4, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 182
    iget-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;->productNameTx:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->getmTypeDesc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 183
    iget-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;->dateTx:Landroid/widget/TextView;

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->getmDate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->getmStatusDesc()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 186
    iget-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;->statusTx:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 191
    :cond_9
    iget-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;->statusTx:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->getmStatusDesc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 192
    iget-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;->statusTx:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 196
    :goto_1
    iget-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;->amountTx:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->getmAmount()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 197
    iget-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;->unitTx:Landroid/widget/TextView;

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->getUnitText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 198
    iget-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;->unitTx:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 200
    if-eqz p3, :cond_a

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mGroupList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq p1, v0, :cond_a

    .line 202
    iget-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;->lineImg:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 206
    :cond_a
    iget-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolder;->lineImg:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 209
    :goto_2
    return-object p4
.end method

.method public getChildrenCount(I)I
    .locals 3

    .line 51
    const-string v0, "********"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getChildrenCount [child count : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mChildList:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mChildList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getGroup(I)Ljava/lang/Object;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mGroupList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getGroupCount()I
    .locals 3

    .line 64
    const-string v0, "********"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getGroupCount [group count : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mGroupList:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mGroupList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getGroupId(I)J
    .locals 2

    .line 71
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getGroupView(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .line 96
    const-string v3, ""

    .line 97
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mGroupList:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 98
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mGroupList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mGroupList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 103
    :cond_0
    const-string v0, "5943542E55534552"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 104
    new-instance v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    return-object v0

    .line 107
    :cond_1
    if-nez p3, :cond_2

    .line 109
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mInflater:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/wallet/R$layout;->nfc_buscard_trade_title_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p3

    .line 110
    new-instance v4, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolderGroup;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolderGroup;-><init>()V

    .line 111
    sget v0, Lcom/huawei/wallet/R$id;->nfc_time_list_date:I

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v4, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolderGroup;->dateTextView:Landroid/widget/TextView;

    .line 112
    invoke-virtual {p3, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 116
    :cond_2
    invoke-virtual {p3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolderGroup;

    .line 119
    :goto_0
    iget-object v0, v4, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter$ViewHolderGroup;->dateTextView:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    return-object p3
.end method

.method public hasStableIds()Z
    .locals 1

    .line 83
    const/4 v0, 0x0

    return v0
.end method

.method public isChildSelectable(II)Z
    .locals 1

    .line 89
    const/4 v0, 0x0

    return v0
.end method

.method public setData(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/util/List<Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;>;>;)V"
        }
    .end annotation

    .line 235
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/TimeTradeAdapter;->mChildList:Ljava/util/List;

    .line 236
    return-void
.end method

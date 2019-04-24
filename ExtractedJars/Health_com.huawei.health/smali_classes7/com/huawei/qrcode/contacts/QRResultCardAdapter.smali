.class public Lcom/huawei/qrcode/contacts/QRResultCardAdapter;
.super Landroid/widget/BaseAdapter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/contacts/QRResultCardAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private listData:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/qrcode/contacts/QRResultData;>;"
        }
    .end annotation
.end field

.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Lcom/huawei/qrcode/contacts/QRResultData;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/contacts/QRResultCardAdapter;->listData:Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/huawei/qrcode/contacts/QRResultCardAdapter;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/qrcode/contacts/QRResultCardAdapter;->listData:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRResultCardAdapter;->listData:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRResultCardAdapter;->listData:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getItem(I)Lcom/huawei/qrcode/contacts/QRResultData;
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRResultCardAdapter;->listData:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    if-ltz p1, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRResultCardAdapter;->listData:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_2

    :cond_1
    const/4 v0, 0x0

    return-object v0

    :cond_2
    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRResultCardAdapter;->listData:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/qrcode/contacts/QRResultData;

    return-object v0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/huawei/qrcode/contacts/QRResultCardAdapter;->getItem(I)Lcom/huawei/qrcode/contacts/QRResultData;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRResultCardAdapter;->listData:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRResultCardAdapter;->listData:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return-object p2

    :cond_1
    const/4 v0, 0x0

    if-ne v0, p2, :cond_2

    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRResultCardAdapter;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/contacts/QRResultCardAdapter;->mContext:Landroid/content/Context;

    const-string v2, "scanqrcode_sdk_contacts_card_item"

    invoke-static {v1, v2}, Lcom/huawei/qrcode/util/ResourceUtil;->getLayoutId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    new-instance v3, Lcom/huawei/qrcode/contacts/QRResultCardAdapter$ViewHolder;

    invoke-direct {v3}, Lcom/huawei/qrcode/contacts/QRResultCardAdapter$ViewHolder;-><init>()V

    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRResultCardAdapter;->mContext:Landroid/content/Context;

    const-string v1, "sqrcode_list_item_content"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lcom/huawei/qrcode/contacts/QRResultCardAdapter$ViewHolder;->content:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRResultCardAdapter;->mContext:Landroid/content/Context;

    const-string v1, "sqrcode_list_item_tag"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lcom/huawei/qrcode/contacts/QRResultCardAdapter$ViewHolder;->tag:Landroid/widget/TextView;

    invoke-virtual {p2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/qrcode/contacts/QRResultCardAdapter$ViewHolder;

    :goto_0
    iget-object v0, p0, Lcom/huawei/qrcode/contacts/QRResultCardAdapter;->listData:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/qrcode/contacts/QRResultData;

    iget-object v0, v3, Lcom/huawei/qrcode/contacts/QRResultCardAdapter$ViewHolder;->tag:Landroid/widget/TextView;

    invoke-virtual {v4}, Lcom/huawei/qrcode/contacts/QRResultData;->getTag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v4}, Lcom/huawei/qrcode/contacts/QRResultData;->getType()I

    move-result v5

    const/4 v0, 0x2

    if-ne v5, v0, :cond_3

    iget-object v0, v3, Lcom/huawei/qrcode/contacts/QRResultCardAdapter$ViewHolder;->content:Landroid/widget/TextView;

    invoke-virtual {v4}, Lcom/huawei/qrcode/contacts/QRResultData;->getPhoneSpannableString()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_3
    iget-object v0, v3, Lcom/huawei/qrcode/contacts/QRResultCardAdapter$ViewHolder;->content:Landroid/widget/TextView;

    invoke-virtual {v4}, Lcom/huawei/qrcode/contacts/QRResultData;->getContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    return-object p2
.end method

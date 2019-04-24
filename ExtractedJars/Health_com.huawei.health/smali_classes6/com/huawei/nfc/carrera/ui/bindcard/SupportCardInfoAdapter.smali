.class public Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private mContext:Landroid/content/Context;

.field private mSupportBankInfoList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/dtd;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Lo/dtd;>;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 28
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;->mSupportBankInfoList:Ljava/util/ArrayList;

    .line 29
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;->mContext:Landroid/content/Context;

    .line 30
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;->mSupportBankInfoList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;->mSupportBankInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;->mSupportBankInfoList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;->mSupportBankInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dtd;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 47
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 53
    const/4 v2, 0x0

    .line 54
    if-nez p2, :cond_0

    .line 56
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    .line 57
    new-instance v2, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter$ViewHolder;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter$ViewHolder;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter$1;)V

    .line 58
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_support_bank_info_item:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 59
    sget v0, Lcom/huawei/wallet/R$id;->nfc_support_bank_name:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter$ViewHolder;->bankNameTv:Landroid/widget/TextView;

    .line 60
    sget v0, Lcom/huawei/wallet/R$id;->nfc_support_bank_debit_card:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter$ViewHolder;->debitCardImgView:Landroid/widget/ImageView;

    .line 61
    sget v0, Lcom/huawei/wallet/R$id;->nfc_support_bank_credit_card:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter$ViewHolder;->creditCardImgView:Landroid/widget/ImageView;

    .line 62
    invoke-virtual {p2, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 63
    goto :goto_0

    .line 66
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter$ViewHolder;

    .line 68
    :goto_0
    const/4 v3, 0x0

    .line 69
    if-ltz p1, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;->mSupportBankInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 70
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;->mSupportBankInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/dtd;

    .line 73
    :cond_1
    if-eqz v3, :cond_4

    .line 75
    iget-object v0, v2, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter$ViewHolder;->bankNameTv:Landroid/widget/TextView;

    invoke-virtual {v3}, Lo/dtd;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    invoke-virtual {v3}, Lo/dtd;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 78
    iget-object v0, v2, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter$ViewHolder;->debitCardImgView:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 82
    :cond_2
    iget-object v0, v2, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter$ViewHolder;->debitCardImgView:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 85
    :goto_1
    invoke-virtual {v3}, Lo/dtd;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 87
    iget-object v0, v2, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter$ViewHolder;->creditCardImgView:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 91
    :cond_3
    iget-object v0, v2, Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter$ViewHolder;->creditCardImgView:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 94
    :cond_4
    :goto_2
    return-object p2
.end method

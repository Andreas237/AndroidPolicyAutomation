.class public Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private mLayoutInflater:Landroid/view/LayoutInflater;

.field private mSelectPostion:I

.field private payMethodList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 44
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;->mSelectPostion:I

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;->payMethodList:Ljava/util/List;

    .line 45
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;->payMethodList:Ljava/util/List;

    .line 46
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;->mLayoutInflater:Landroid/view/LayoutInflater;

    .line 47
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;->payMethodList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 58
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;->payMethodList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 59
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 61
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;->payMethodList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 67
    int-to-long v0, p1

    return-wide v0
.end method

.method public getSelectPostion()I
    .locals 1

    .line 109
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;->mSelectPostion:I

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .line 73
    const/4 v3, 0x0

    .line 74
    if-nez p2, :cond_0

    .line 76
    new-instance v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter$ViewHolder;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter$ViewHolder;-><init>(Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter$1;)V

    .line 77
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;->mLayoutInflater:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/wallet/R$layout;->hwpay_select_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 78
    sget v0, Lcom/huawei/wallet/R$id;->cardButton:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter$ViewHolder;->payTypeIcon:Landroid/widget/ImageView;

    .line 79
    sget v0, Lcom/huawei/wallet/R$id;->paytype_title:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter$ViewHolder;->payTypeName:Landroid/widget/TextView;

    .line 80
    sget v0, Lcom/huawei/wallet/R$id;->checkbutton1:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter$ViewHolder;->radio:Landroid/widget/CheckBox;

    .line 81
    invoke-virtual {p2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 85
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter$ViewHolder;

    .line 87
    :goto_0
    iget-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter$ViewHolder;->radio:Landroid/widget/CheckBox;

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;->mSelectPostion:I

    if-ne p1, v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 88
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;->payMethodList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 89
    const/4 v0, 0x2

    if-ne v0, v4, :cond_2

    .line 91
    iget-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter$ViewHolder;->payTypeIcon:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/wallet/R$drawable;->huaweipay_selectpage_wechat_pay:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 92
    iget-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter$ViewHolder;->payTypeName:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_wechat_pay:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_2

    .line 94
    :cond_2
    const/4 v0, 0x1

    if-eq v0, v4, :cond_3

    const/4 v0, 0x4

    if-ne v0, v4, :cond_4

    .line 96
    :cond_3
    iget-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter$ViewHolder;->payTypeIcon:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/wallet/R$drawable;->hwpay_apk_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 97
    iget-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter$ViewHolder;->payTypeName:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->hwpay_pay_no_bind_card:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_2

    .line 99
    :cond_4
    const/4 v0, 0x3

    if-ne v0, v4, :cond_5

    .line 101
    iget-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter$ViewHolder;->payTypeIcon:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/wallet/R$drawable;->ic_huawei_pay:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 102
    iget-object v0, v3, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter$ViewHolder;->payTypeName:Landroid/widget/TextView;

    const-string v1, "Huawei Pay"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    :cond_5
    :goto_2
    return-object p2
.end method

.method public setSelectPostion(I)V
    .locals 0

    .line 114
    iput p1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;->mSelectPostion:I

    .line 115
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;->notifyDataSetChanged()V

    .line 116
    return-void
.end method

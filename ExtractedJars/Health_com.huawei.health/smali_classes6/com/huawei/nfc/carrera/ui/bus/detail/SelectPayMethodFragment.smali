.class public Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;
.super Landroid/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment$PayMethodCallback;
    }
.end annotation


# static fields
.field public static final PAY_METHOD_HUAWEIPAY:I = 0x3

.field public static final PAY_METHOD_HWPAY:I = 0x1

.field public static final PAY_METHOD_HW_WALLET:I = 0x4

.field public static final PAY_METHOD_WX:I = 0x2

.field public static final TAG:Ljava/lang/String; = "SelectPayMethodFragment"


# instance fields
.field private amount:Ljava/lang/String;

.field private bMeramount:Landroid/widget/TextView;

.field private bMername:Landroid/widget/TextView;

.field private bMernameTxt:Landroid/widget/TextView;

.field private bPayAmount:Landroid/widget/TextView;

.field private bProductName:Landroid/widget/TextView;

.field private bRroductFullname:Landroid/widget/TextView;

.field private huaweipayRecharge:Lo/egd;

.field private issuerId:Ljava/lang/String;

.field private mListener:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment$PayMethodCallback;

.field private mMerchant:Ljava/lang/String;

.field private mPayListView:Landroid/widget/ListView;

.field private mPayMore_tv:Landroid/widget/TextView;

.field private mPayMore_tv_tip:Landroid/widget/TextView;

.field private mPaytypes:Ljava/lang/String;

.field private mSelectPayMethodAdapter:Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;

.field private mTrafficCardInfo:Ljava/lang/String;

.field private mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

.field private payMethodLists:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private selectPosition:I

.field private sptHwOnline:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->payMethodLists:Ljava/util/List;

    .line 112
    const-string v0, "\u4e0a\u6d77\u516c\u5171\u4ea4\u901a\u5361\u5145\u503c"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mTrafficCardInfo:Ljava/lang/String;

    .line 117
    const-string v0, "\u4e0a\u6d77\u516c\u5171\u4ea4\u901a\u5361\u80a1\u4efd\u6709\u9650\u516c\u53f8"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mMerchant:Ljava/lang/String;

    .line 119
    const-string v0, "0.00"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->amount:Ljava/lang/String;

    .line 125
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->selectPosition:I

    .line 127
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mPaytypes:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;)Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mSelectPayMethodAdapter:Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;

    return-object v0
.end method

.method private getPayList(Ljava/lang/String;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 327
    const-string v0, "&"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 328
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 329
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 330
    const/4 v7, -0x1

    .line 331
    const-string v0, "wechat"

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 332
    const-string v0, "SelectPayMethodFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "newSelectPayMethodFragment getPayList ,wechat"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    const/4 v7, 0x2

    goto :goto_1

    .line 334
    :cond_0
    const-string v0, "huaweipay"

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 335
    const-string v0, "SelectPayMethodFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "newSelectPayMethodFragment getPayList ,huaweipay"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    const/4 v8, 0x0

    .line 338
    nop

    .line 339
    .line 343
    :cond_1
    :goto_1
    const/4 v0, -0x1

    if-le v7, v0, :cond_2

    .line 344
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 329
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 347
    :cond_3
    return-object v5
.end method

.method private initListener()V
    .locals 2

    .line 271
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mPayListView:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment$1;-><init>(Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 277
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->huaweipayRecharge:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 278
    return-void
.end method

.method private initPayLists()V
    .locals 4

    .line 284
    const-string v0, "SelectPayMethodFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "newSelectPayMethodFragment initPayLists ,mPaytypes="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mPaytypes:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->payMethodLists:Ljava/util/List;

    .line 286
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mPaytypes:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 287
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mPaytypes:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->getPayList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->payMethodLists:Ljava/util/List;

    .line 288
    const-string v0, "SelectPayMethodFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "newSelectPayMethodFragment initPayLists ,payMethodLists="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->payMethodLists:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->payMethodLists:Ljava/util/List;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 292
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->payMethodLists:Ljava/util/List;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 293
    const-string v0, "SelectPayMethodFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "newSelectPayMethodFragment initPayLists ,payMethodLists2="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->payMethodLists:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    :cond_1
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->payMethodLists:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mSelectPayMethodAdapter:Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;

    .line 297
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mPayListView:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mSelectPayMethodAdapter:Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 298
    return-void
.end method

.method private initView(Landroid/view/View;)V
    .locals 6

    .line 214
    sget v0, Lcom/huawei/wallet/R$id;->b_product_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->bProductName:Landroid/widget/TextView;

    .line 215
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->bProductName:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_product_name:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 217
    sget v0, Lcom/huawei/wallet/R$id;->b_product_fullname:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->bRroductFullname:Landroid/widget/TextView;

    .line 218
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->bRroductFullname:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mTrafficCardInfo:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    sget v0, Lcom/huawei/wallet/R$id;->ll_b_mername_txt:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->bMernameTxt:Landroid/widget/TextView;

    .line 222
    sget v0, Lcom/huawei/wallet/R$id;->b_mername:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->bMername:Landroid/widget/TextView;

    .line 223
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mMerchant:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 224
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->bMernameTxt:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->hwpay_metchant_name:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 225
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->bMername:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mMerchant:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 227
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->bMernameTxt:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 228
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->bMername:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 232
    :goto_0
    sget v0, Lcom/huawei/wallet/R$id;->b_meramount:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->bMeramount:Landroid/widget/TextView;

    .line 233
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->bMeramount:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_amount:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->amount:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 236
    sget v0, Lcom/huawei/wallet/R$id;->b_pay_amount:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->bPayAmount:Landroid/widget/TextView;

    .line 237
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->bPayAmount:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_amount:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->amount:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 240
    sget v0, Lcom/huawei/wallet/R$id;->huaweipay_recharge:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->huaweipayRecharge:Lo/egd;

    .line 242
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->huaweipayRecharge:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_pay_confirm_amount:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->amount:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 245
    sget v0, Lcom/huawei/wallet/R$id;->huaweipay_select_title_txt:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 246
    sget v0, Lcom/huawei/wallet/R$string;->huaweipay_select_title:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(I)V

    .line 249
    sget v0, Lcom/huawei/wallet/R$id;->hwpay_channel_select_listview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mPayListView:Landroid/widget/ListView;

    .line 251
    sget v0, Lcom/huawei/wallet/R$id;->buscard_pay_more_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mPayMore_tv:Landroid/widget/TextView;

    .line 252
    sget v0, Lcom/huawei/wallet/R$id;->buscard_pay_more_tv_tip:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mPayMore_tv_tip:Landroid/widget/TextView;

    .line 253
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mPayMore_tv:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 254
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mPayMore_tv_tip:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 255
    return-void
.end method

.method public static final newSelectPayMethodFragment(IDLjava/lang/String;)Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;
    .locals 6

    .line 131
    new-instance v4, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;-><init>()V

    .line 132
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 133
    const-string v0, "SelectPayMethodFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "newSelectPayMethodFragment amount "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    const-string v0, "amount"

    invoke-virtual {v5, v0, p1, p2}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    .line 135
    const-string v0, "mode"

    invoke-virtual {v5, v0, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 136
    const-string v0, "issuerId"

    invoke-virtual {v5, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    invoke-virtual {v4, v5}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->setArguments(Landroid/os/Bundle;)V

    .line 138
    return-object v4
.end method

.method public static final newSelectPayMethodFragment(Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;)Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;
    .locals 3

    .line 142
    new-instance v1, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;-><init>()V

    .line 143
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 144
    const-string v0, "trafficPaymentInfo"

    invoke-virtual {v2, v0, p0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 145
    invoke-virtual {v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->setArguments(Landroid/os/Bundle;)V

    .line 146
    return-object v1
.end method


# virtual methods
.method public onAttach(Landroid/app/Activity;)V
    .locals 3

    .line 151
    invoke-super {p0, p1}, Landroid/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 153
    move-object v0, p1

    :try_start_0
    check-cast v0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment$PayMethodCallback;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mListener:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment$PayMethodCallback;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    goto :goto_0

    .line 154
    :catch_0
    move-exception v2

    .line 156
    const-string v0, "ClassCastException."

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lo/dtg;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 158
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 311
    sget v0, Lcom/huawei/wallet/R$id;->huaweipay_recharge:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 312
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mListener:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment$PayMethodCallback;

    if-eqz v0, :cond_1

    .line 314
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->payMethodLists:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mSelectPayMethodAdapter:Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;->getSelectPostion()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 315
    return-void

    .line 317
    :cond_0
    const-string v0, "SelectPayMethodFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "newSelectPayMethodFragment getPayList ,mSelectPayMethodAdapter.getSelectPostion()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mSelectPayMethodAdapter:Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;->getSelectPostion()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->payMethodLists:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mSelectPayMethodAdapter:Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/ui/bus/adapter/SelectPayMethodAdapter;->getSelectPostion()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->selectPosition:I

    .line 319
    const-string v0, "SelectPayMethodFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "newSelectPayMethodFragment getPayList ,mSelectPayMethodAdapter.selectPosition ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->selectPosition:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mListener:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment$PayMethodCallback;

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->selectPosition:I

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment$PayMethodCallback;->onSelectedCallback(I)V

    .line 324
    :cond_1
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .line 162
    sget v0, Lcom/huawei/wallet/R$layout;->hwpay_channel_select_fragment_portrait:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 163
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v4

    .line 164
    const-string v0, "amount"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->amount:Ljava/lang/String;

    .line 165
    const-string v0, "issuerId"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->issuerId:Ljava/lang/String;

    .line 166
    const-string v0, "mode"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 167
    const-string v0, "trafficPaymentInfo"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    .line 168
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 169
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->getPremount()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->amount:Ljava/lang/String;

    .line 170
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->getPreOrderType()I

    move-result v5

    .line 171
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->getPrePaytypes()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mPaytypes:Ljava/lang/String;

    .line 173
    :cond_0
    const/4 v0, 0x1

    if-ne v0, v5, :cond_3

    .line 174
    const-string v0, "t_sh_01"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->issuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 175
    const-string v0, "\u4e0a\u6d77\u590d\u65e6\u5fae\u7535\u5b50"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mMerchant:Ljava/lang/String;

    .line 176
    const-string v0, "\u4e0a\u6d77\u516c\u5171\u4ea4\u901a\u5361\u5f00\u5361\u5145\u503c"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mTrafficCardInfo:Ljava/lang/String;

    goto/16 :goto_0

    .line 177
    :cond_1
    const-string v0, "t_fdw_lingnantong"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->issuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 178
    const-string v0, "\u4e0a\u6d77\u590d\u65e6\u5fae\u7535\u5b50"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mMerchant:Ljava/lang/String;

    .line 179
    const-string v0, "\u5cad\u5357\u901a"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mTrafficCardInfo:Ljava/lang/String;

    goto/16 :goto_0

    .line 181
    :cond_2
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mMerchant:Ljava/lang/String;

    .line 182
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 183
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->getPrename()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u5f00\u5361\u5145\u503c"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mTrafficCardInfo:Ljava/lang/String;

    goto :goto_0

    .line 187
    :cond_3
    const/4 v0, 0x2

    if-ne v0, v5, :cond_6

    .line 188
    const-string v0, "t_sh_01"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->issuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 189
    const-string v0, "\u4e0a\u6d77\u516c\u5171\u4ea4\u901a\u5361\u80a1\u4efd\u6709\u9650\u516c\u53f8"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mMerchant:Ljava/lang/String;

    .line 190
    const-string v0, "\u4e0a\u6d77\u516c\u5171\u4ea4\u901a\u5361\u5145\u503c"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mTrafficCardInfo:Ljava/lang/String;

    goto :goto_0

    .line 191
    :cond_4
    const-string v0, "t_fdw_lingnantong"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->issuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 192
    const-string v0, "\u4e0a\u6d77\u590d\u65e6\u5fae\u7535\u5b50"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mMerchant:Ljava/lang/String;

    .line 193
    const-string v0, "\u5cad\u5357\u901a"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mTrafficCardInfo:Ljava/lang/String;

    goto :goto_0

    .line 195
    :cond_5
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mMerchant:Ljava/lang/String;

    .line 196
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 197
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->getPrename()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u5145\u503c"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->mTrafficCardInfo:Ljava/lang/String;

    .line 201
    :cond_6
    :goto_0
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->initView(Landroid/view/View;)V

    .line 202
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->initListener()V

    .line 203
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->initPayLists()V

    .line 204
    return-object v3
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 302
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 303
    const/4 v0, 0x1

    return v0

    .line 305
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setPayAmount(D)V
    .locals 5

    .line 261
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->amount:Ljava/lang/String;

    .line 262
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->bMeramount:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_amount:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->amount:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 263
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->bPayAmount:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_amount:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->amount:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 264
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->huaweipayRecharge:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_pay_confirm_amount:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->amount:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 265
    return-void
.end method

.method public setSptHwOnline(Z)V
    .locals 1

    .line 351
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->sptHwOnline:Z

    .line 352
    return-void
.end method

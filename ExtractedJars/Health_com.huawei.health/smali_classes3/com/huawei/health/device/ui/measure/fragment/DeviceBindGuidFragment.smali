.class public Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# instance fields
.field private count:I

.field private mProductId:Ljava/lang/String;

.field private mTitle:Ljava/lang/String;

.field private productInfo:Lo/afj;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->count:I

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)I
    .locals 1

    .line 29
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->count:I

    return v0
.end method

.method static synthetic access$008(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)I
    .locals 2

    .line 29
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->count:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->count:I

    return v0
.end method

.method static synthetic access$010(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)I
    .locals 2

    .line 29
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->count:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->count:I

    return v0
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Lo/afj;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->productInfo:Lo/afj;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->mProductId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 29
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 29
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Landroid/app/Activity;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 38
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 39
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->mProductId:Ljava/lang/String;

    .line 40
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->mTitle:Ljava/lang/String;

    .line 41
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->productInfo:Lo/afj;

    .line 42
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 11

    .line 46
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceBindGuidFragment onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/ViewGroup;

    .line 49
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_bind_guide:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v6

    .line 50
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 51
    sget v0, Lcom/huawei/plugindevice/R$id;->device_bind_guid_iv_back:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    .line 52
    sget v0, Lcom/huawei/plugindevice/R$id;->device_bind_guid_iv_next:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    .line 53
    sget v0, Lcom/huawei/plugindevice/R$drawable;->ic_arrows_right_black:I

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 54
    sget v0, Lcom/huawei/plugindevice/R$drawable;->ic_arrows_left_black:I

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 56
    :cond_0
    sget v0, Lcom/huawei/plugindevice/R$id;->device_bind_guid_tv:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 58
    sget v0, Lcom/huawei/plugindevice/R$id;->device_bind_guid_img:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    .line 60
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceBindGuidFragment text:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->productInfo:Lo/afj;

    iget-object v3, v3, Lo/afj;->p:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/afj$b;

    iget-object v3, v3, Lo/afj$b;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " img:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->productInfo:Lo/afj;

    iget-object v3, v3, Lo/afj;->p:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/afj$b;

    invoke-virtual {v3}, Lo/afj$b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->count:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 63
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->mProductId:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->productInfo:Lo/afj;

    iget-object v1, v1, Lo/afj;->p:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/afj$b;

    iget-object v1, v1, Lo/afj$b;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->productInfo:Lo/afj;

    iget-object v2, v2, Lo/afj;->p:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    invoke-virtual {v2}, Lo/afj$b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 65
    invoke-static {v9}, Lo/afo;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 66
    goto/16 :goto_0

    .line 68
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->productInfo:Lo/afj;

    iget-object v0, v0, Lo/afj;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->count:I

    if-gt v0, v1, :cond_2

    .line 69
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->mProductId:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->productInfo:Lo/afj;

    iget-object v1, v1, Lo/afj;->p:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->productInfo:Lo/afj;

    iget-object v2, v2, Lo/afj;->p:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/afj$b;

    iget-object v1, v1, Lo/afj$b;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->productInfo:Lo/afj;

    iget-object v2, v2, Lo/afj;->p:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->productInfo:Lo/afj;

    iget-object v3, v3, Lo/afj;->p:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    invoke-virtual {v2}, Lo/afj$b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 71
    invoke-static {v9}, Lo/afo;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 73
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->productInfo:Lo/afj;

    iget-object v0, v0, Lo/afj;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->count:I

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->mProductId:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->productInfo:Lo/afj;

    iget-object v1, v1, Lo/afj;->p:Ljava/util/ArrayList;

    iget v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->count:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/afj$b;

    iget-object v1, v1, Lo/afj$b;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->productInfo:Lo/afj;

    iget-object v2, v2, Lo/afj;->p:Ljava/util/ArrayList;

    iget v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->count:I

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    invoke-virtual {v2}, Lo/afj$b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 77
    invoke-static {v9}, Lo/afo;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 81
    :goto_0
    sget v0, Lcom/huawei/plugindevice/R$id;->device_bind_guid_ll_next:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/LinearLayout;

    .line 82
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;

    invoke-direct {v0, p0, v7, v8}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;Landroid/widget/TextView;Landroid/widget/ImageView;)V

    invoke-virtual {v9, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 110
    sget v0, Lcom/huawei/plugindevice/R$id;->device_bind_guid_ll_back:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/LinearLayout;

    .line 111
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$2;

    invoke-direct {v0, p0, v7, v8}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;Landroid/widget/TextView;Landroid/widget/ImageView;)V

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 126
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 127
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 129
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->mTitle:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->setTitle(Ljava/lang/String;)V

    .line 130
    return-object v5
.end method

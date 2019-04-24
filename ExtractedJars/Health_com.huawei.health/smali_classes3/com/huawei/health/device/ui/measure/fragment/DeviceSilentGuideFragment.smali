.class public Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# instance fields
.field private button_know:Lo/egd;

.field img1:Landroid/widget/ImageView;

.field img2:Landroid/widget/ImageView;

.field img3:Landroid/widget/ImageView;

.field img4:Landroid/widget/ImageView;

.field private imgViews:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/widget/ImageView;>;"
        }
    .end annotation
.end field

.field private mProductInfo:Lo/afj;

.field private previous_view:Ljava/lang/String;

.field private productId:Ljava/lang/String;

.field textView1:Landroid/widget/TextView;

.field textView2:Landroid/widget/TextView;

.field textView3:Landroid/widget/TextView;

.field textView4:Landroid/widget/TextView;

.field private textviews:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/widget/TextView;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->previous_view:Ljava/lang/String;

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->productId:Ljava/lang/String;

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->mProductInfo:Lo/afj;

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->textviews:Ljava/util/ArrayList;

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->imgViews:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;)Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->previous_view:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->deviceAutoTestSendNoc()V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;)Landroid/app/Activity;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->jumpToProductIntroductionFragment()V

    return-void
.end method

.method private deviceAutoTestSendNoc()V
    .locals 8

    .line 139
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->k()Lo/acl$a;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/agc;->d(Lo/acl$a;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    .line 140
    const-string v5, "com.cn.customview.permissions.MY_BROADCAST"

    .line 141
    const-string v6, "com.huawei.health.action.DEVICE_CONNECTED"

    .line 142
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 143
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 144
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->productId:Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 145
    const-string v0, "kind"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->k()Lo/acl$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 146
    const-string v0, "autotest"

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 147
    const-string v0, "address"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->productId:Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 148
    const-string v0, "healthdata"

    invoke-virtual {v7, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 149
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendBroadcast for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->productId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", kind = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v3}, Lo/afj;->k()Lo/acl$a;

    move-result-object v3

    invoke-virtual {v3}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v7, v5}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 151
    return-void
.end method

.method private jumpToProductIntroductionFragment()V
    .locals 6

    .line 159
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v3

    .line 160
    const-string v0, "isBindSuccess"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 161
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;-><init>()V

    .line 162
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 163
    const-string v0, "productId"

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "productId"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    const-string v0, "isBindSuccess"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 165
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 166
    invoke-virtual {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 167
    goto :goto_0

    .line 168
    :cond_0
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->popupFragment(Ljava/lang/Class;)V

    .line 170
    :goto_0
    return-void
.end method


# virtual methods
.method public onBackPressed()Z
    .locals 2

    .line 131
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->previous_view:Ljava/lang/String;

    const-string v1, "measure"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 134
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->jumpToProductIntroductionFragment()V

    .line 136
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 44
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 45
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "view"

    const-string v2, "bond"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->previous_view:Ljava/lang/String;

    .line 46
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceSilentGuideFragment the productId is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->productId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    const-string v2, "0"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->productId:Ljava/lang/String;

    .line 49
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->mProductInfo:Lo/afj;

    .line 51
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 56
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 57
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_silent_guid:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 58
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceSilentGuideFragment onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_device_silent_text_1:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->textView1:Landroid/widget/TextView;

    .line 60
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->textviews:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->textView1:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_device_silent_text_2:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->textView2:Landroid/widget/TextView;

    .line 62
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->textviews:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->textView2:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_device_silent_text_3:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->textView3:Landroid/widget/TextView;

    .line 64
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->textviews:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->textView3:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_device_silent_text_4:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->textView4:Landroid/widget/TextView;

    .line 66
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->textviews:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->textView4:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_device_silent_img_1:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->img1:Landroid/widget/ImageView;

    .line 68
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->imgViews:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->img1:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_device_silent_img_2:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->img2:Landroid/widget/ImageView;

    .line 70
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->imgViews:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->img2:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_device_silent_img_3:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->img3:Landroid/widget/ImageView;

    .line 72
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->imgViews:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->img3:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_device_silent_img_4:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->img4:Landroid/widget/ImageView;

    .line 74
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->imgViews:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->img4:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->mProductInfo:Lo/afj;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 77
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceSilentGuideFragment mProductInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_2

    .line 79
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceSilentGuideFragment size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->mProductInfo:Lo/afj;

    iget-object v3, v3, Lo/afj;->l:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->mProductInfo:Lo/afj;

    iget-object v0, v0, Lo/afj;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 81
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->mProductInfo:Lo/afj;

    iget-object v0, v0, Lo/afj;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 82
    const/4 v0, 0x4

    if-le v6, v0, :cond_1

    .line 83
    const/4 v6, 0x4

    .line 85
    :cond_1
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_5

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->textviews:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->mProductInfo:Lo/afj;

    iget-object v2, v2, Lo/afj;->l:Ljava/util/ArrayList;

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    invoke-virtual {v2}, Lo/afj$b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->mProductInfo:Lo/afj;

    iget-object v0, v0, Lo/afj;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afj$b;

    invoke-virtual {v0}, Lo/afj$b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->mProductInfo:Lo/afj;

    iget-object v0, v0, Lo/afj;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afj$b;

    invoke-virtual {v0}, Lo/afj$b;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    .line 88
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->imgViews:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 90
    :cond_3
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->mProductInfo:Lo/afj;

    iget-object v2, v2, Lo/afj;->l:Ljava/util/ArrayList;

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    invoke-virtual {v2}, Lo/afj$b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/afo;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v8

    .line 92
    if-eqz v8, :cond_4

    .line 93
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->imgViews:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_1

    .line 95
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->imgViews:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 85
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 102
    :cond_5
    :goto_2
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_device_silent_ok:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->button_know:Lo/egd;

    .line 104
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_auto_read_introduction_title:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/BaseFragment;->setTitle(Ljava/lang/String;)V

    .line 105
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->button_know:Lo/egd;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 123
    const/4 v0, 0x0

    if-eq v0, v4, :cond_6

    .line 124
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 126
    :cond_6
    return-object v4
.end method

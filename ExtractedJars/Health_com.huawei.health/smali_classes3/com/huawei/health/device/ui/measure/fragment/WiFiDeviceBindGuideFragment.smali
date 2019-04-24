.class public Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final TAG:Ljava/lang/String; = "WiFiDeviceBindGuideFragment"


# instance fields
.field private count:I

.field private isStartAnim:Z

.field private mAnimationHandler:Lo/agf;

.field private mCancleButton:Landroid/widget/LinearLayout;

.field private mCancleImage:Landroid/widget/ImageView;

.field private mCurrentImg:I

.field private mGuideImg:Landroid/widget/ImageView;

.field private mGuidePrompt:Landroid/widget/TextView;

.field private mImgArray:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Object;>;"
        }
    .end annotation
.end field

.field private mNextButton:Landroid/widget/LinearLayout;

.field private mNextImage:Landroid/widget/ImageView;

.field private mOuthName:Ljava/lang/String;

.field private mOuthPd:Ljava/lang/String;

.field private mProductId:Ljava/lang/String;

.field private mProductInfo:Lo/afj;

.field private mode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mCurrentImg:I

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->count:I

    .line 45
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mode:I

    .line 46
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->isStartAnim:Z

    .line 47
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mOuthName:Ljava/lang/String;

    .line 48
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mOuthPd:Ljava/lang/String;

    return-void
.end method

.method private cancelGuideImgAnimation()V
    .locals 4

    .line 113
    const-string v0, "WiFiDeviceBindGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " cancelGuideImgAnimation()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 114
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mCurrentImg:I

    .line 115
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mAnimationHandler:Lo/agf;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mAnimationHandler:Lo/agf;

    const/16 v1, 0x3e2

    invoke-virtual {v0, v1}, Lo/agf;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mAnimationHandler:Lo/agf;

    const/16 v1, 0x3e2

    invoke-virtual {v0, v1}, Lo/agf;->removeMessages(I)V

    .line 118
    :cond_0
    return-void
.end method

.method private getBindGuideImage()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/Object;>;"
        }
    .end annotation

    .line 78
    const-string v0, "WiFiDeviceBindGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightMeasureGuideFragment getMeasure()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 79
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 80
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductInfo:Lo/afj;

    iget-object v0, v0, Lo/afj;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 81
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductInfo:Lo/afj;

    iget-object v2, v2, Lo/afj;->p:Ljava/util/ArrayList;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    invoke-virtual {v2}, Lo/afj$b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 83
    :cond_0
    const-string v0, "WiFiDeviceBindGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 84
    return-object v4
.end method

.method private gotoNextView()V
    .locals 6

    .line 187
    const-string v0, "WiFiDeviceBindGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "gotoNextView()...mode == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mode:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 188
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 189
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    const-string v0, "outhName"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mOuthName:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    const-string v0, "outhPd"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mOuthPd:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    const-string v0, "config_mode"

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mode:I

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 193
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mode:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 194
    new-instance v5, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-direct {v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;-><init>()V

    .line 195
    invoke-virtual {v5, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->setArguments(Landroid/os/Bundle;)V

    .line 196
    invoke-virtual {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 197
    goto :goto_0

    .line 198
    :cond_0
    new-instance v5, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;

    invoke-direct {v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;-><init>()V

    .line 199
    invoke-virtual {v5, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->setArguments(Landroid/os/Bundle;)V

    .line 200
    invoke-virtual {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 202
    :goto_0
    return-void
.end method

.method private initData()V
    .locals 4

    .line 122
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 123
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductId:Ljava/lang/String;

    .line 124
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "outhName"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mOuthName:Ljava/lang/String;

    .line 125
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "outhPd"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mOuthPd:Ljava/lang/String;

    .line 126
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "config_mode"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mode:I

    .line 128
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 129
    const-string v0, "WiFiDeviceBindGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData mProductId is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 130
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->onBackPressed()V

    .line 131
    return-void

    .line 133
    :cond_1
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mode:I

    const/4 v1, 0x2

    if-eq v1, v0, :cond_3

    .line 134
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductInfo:Lo/afj;

    .line 135
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductInfo:Lo/afj;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 136
    const-string v0, "WiFiDeviceBindGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData mProductInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 137
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->onBackPressed()V

    .line 138
    return-void

    .line 140
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->getBindGuideImage()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mImgArray:Ljava/util/ArrayList;

    .line 142
    :cond_3
    return-void
.end method

.method private initView()V
    .locals 2

    .line 161
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_bind_guid_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mGuidePrompt:Landroid/widget/TextView;

    .line 162
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_bind_guide_img:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mGuideImg:Landroid/widget/ImageView;

    .line 163
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_bind_cancle:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mCancleButton:Landroid/widget/LinearLayout;

    .line 164
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_bind_next:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mNextButton:Landroid/widget/LinearLayout;

    .line 165
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_guide_next_img:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mNextImage:Landroid/widget/ImageView;

    .line 166
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_guide_cancle_img:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mCancleImage:Landroid/widget/ImageView;

    .line 167
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mCancleButton:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 168
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mNextButton:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 169
    return-void
.end method

.method private initViewData()V
    .locals 6

    .line 145
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/ahf;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mCancleImage:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->wifi_device_arrow_right:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 147
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mNextImage:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->wifi_device_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 149
    :cond_0
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mode:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 150
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mGuidePrompt:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_ap_guide_tip:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 151
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mGuideImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->wifi_device_ap_bind_guide:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_0

    .line 153
    :cond_1
    const-string v0, "WiFiDeviceBindGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initViewData text:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductInfo:Lo/afj;

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

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductInfo:Lo/afj;

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

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductInfo:Lo/afj;

    iget-object v2, v2, Lo/afj;->p:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    iget-object v2, v2, Lo/afj$b;->d:Ljava/lang/String;

    invoke-static {v1, v2}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductInfo:Lo/afj;

    iget-object v2, v2, Lo/afj;->p:Ljava/util/ArrayList;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    iget-object v2, v2, Lo/afj$b;->d:Ljava/lang/String;

    invoke-static {v1, v2}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 155
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mGuidePrompt:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->showGuideImgAnimation()V

    .line 158
    :goto_0
    return-void
.end method

.method private onNextClick()V
    .locals 5

    .line 172
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->isStartAnim:Z

    if-nez v0, :cond_1

    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mode:I

    const/4 v1, 0x2

    if-eq v1, v0, :cond_1

    .line 173
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->count:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->count:I

    .line 174
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->count:I

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductInfo:Lo/afj;

    iget-object v1, v1, Lo/afj;->p:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 175
    const-string v0, "WiFiDeviceBindGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onNextClick mProductId:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 176
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->gotoNextView()V

    goto :goto_0

    .line 178
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mGuidePrompt:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductInfo:Lo/afj;

    iget-object v2, v2, Lo/afj;->p:Ljava/util/ArrayList;

    iget v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->count:I

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    iget-object v2, v2, Lo/afj$b;->d:Ljava/lang/String;

    invoke-static {v1, v2}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mGuideImg:Landroid/widget/ImageView;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductId:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mProductInfo:Lo/afj;

    iget-object v3, v3, Lo/afj;->p:Ljava/util/ArrayList;

    iget v4, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->count:I

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/afj$b;

    iget-object v3, v3, Lo/afj$b;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/afo;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 182
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->gotoNextView()V

    .line 184
    :goto_0
    return-void
.end method

.method private showGuideImgAnimation()V
    .locals 7

    .line 87
    const-string v0, "WiFiDeviceBindGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment showGuideImgAnimation()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 88
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 89
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mImgArray:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mImgArray:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 90
    :cond_0
    return-void

    .line 92
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mImgArray:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mCurrentImg:I

    if-ne v0, v1, :cond_2

    .line 93
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mCurrentImg:I

    .line 95
    :cond_2
    const-string v0, "WiFiDeviceBindGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showGuideImgAnimation() mImgArray size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mImgArray:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 96
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mImgArray:Ljava/util/ArrayList;

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mCurrentImg:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 97
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mCurrentImg:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mCurrentImg:I

    .line 98
    const-string v0, "WiFiDeviceBindGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showGuideImgAnimation() mCurrentImgId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 100
    instance-of v0, v6, Ljava/lang/Integer;

    if-eqz v0, :cond_3

    .line 101
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mGuideImg:Landroid/widget/ImageView;

    move-object v1, v6

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 103
    :cond_3
    instance-of v0, v6, Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 104
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mGuideImg:Landroid/widget/ImageView;

    move-object v1, v6

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lo/afo;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 106
    :cond_4
    new-instance v0, Lo/agf;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mainActivity:Landroid/app/Activity;

    iget v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mCurrentImg:I

    iget-object v4, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mGuideImg:Landroid/widget/ImageView;

    iget-object v5, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mImgArray:Ljava/util/ArrayList;

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lo/agf;-><init>(Landroid/app/Activity;Ljava/lang/Object;ILandroid/widget/ImageView;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mAnimationHandler:Lo/agf;

    .line 107
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mAnimationHandler:Lo/agf;

    const/16 v1, 0x1f4

    invoke-virtual {v0, v1}, Lo/agf;->e(I)V

    .line 108
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mAnimationHandler:Lo/agf;

    const/16 v1, 0x3e2

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Lo/agf;->sendEmptyMessageDelayed(IJ)Z

    .line 109
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->isStartAnim:Z

    .line 110
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 206
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_bind_next:I

    if-ne v0, v1, :cond_0

    .line 207
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->onNextClick()V

    goto :goto_0

    .line 208
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->wifi_device_bind_cancle:I

    if-ne v0, v1, :cond_1

    .line 209
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->onBackPressed()V

    .line 211
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 51
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 52
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 56
    const-string v0, "WiFiDeviceBindGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 57
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 58
    sget v0, Lcom/huawei/plugindevice/R$layout;->wifi_device_bind_guide_layout:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->child:Landroid/view/View;

    .line 59
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_device_pair_guide_note:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->setTitle(Ljava/lang/String;)V

    .line 60
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->initData()V

    .line 61
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->initView()V

    .line 62
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->initViewData()V

    .line 63
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 64
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->child:Landroid/view/View;

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 66
    :cond_0
    return-object v4
.end method

.method public onDestroy()V
    .locals 2

    .line 71
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroy()V

    .line 72
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->mode:I

    const/4 v1, 0x2

    if-eq v1, v0, :cond_0

    .line 73
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindGuideFragment;->cancelGuideImgAnimation()V

    .line 75
    :cond_0
    return-void
.end method

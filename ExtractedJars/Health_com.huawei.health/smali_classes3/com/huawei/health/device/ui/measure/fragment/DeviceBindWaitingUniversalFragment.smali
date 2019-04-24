.class public Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$BindUniversalCallback;
    }
.end annotation


# static fields
.field private static final BIND_STATUS_FAIL:I = 0x3

.field private static final BIND_STATUS_ING:I = 0x1

.field private static final BIND_STATUS_SUCCESS:I = 0x2

.field private static final DEVICE_SCAN_FAIL:I = 0x2

.field private static final DEVICE_SCAN_REFRESH:I = 0x0

.field private static final DEVICE_SCAN_TIMEOUT:I = 0x1


# instance fields
.field private animHonour:Landroid/graphics/drawable/AnimationDrawable;

.field private bind_status:I

.field private bleDeviceHelper:Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;

.field private item:Lcom/huawei/hihealth/device/open/HealthDevice;

.field private mBindFailView:Landroid/view/View;

.field private mBindingLayout:Landroid/view/View;

.field mBindingStatusCallback:Lcom/huawei/hihealth/device/open/IDeviceEventHandler;

.field private mBottomGuideArrowLayout:Landroid/view/View;

.field private mDoneButton:Lo/egd;

.field private mHandler:Landroid/os/Handler;

.field private mHandlerUniversalCallback:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$BindUniversalCallback;

.field mListItems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/hihealth/device/open/HealthDevice;>;"
        }
    .end annotation
.end field

.field private mPairGuideProgressAnim:Landroid/widget/ImageView;

.field private mPairProcessNote:Landroid/widget/TextView;

.field private mPairResultDeviceImg:Landroid/widget/ImageView;

.field private mPairResultDeviceProgressImgFrameLayout:Landroid/widget/FrameLayout;

.field private mPairResultDeviceShowImg:Landroid/widget/ImageView;

.field private mPairResultPrivacyTxt:Landroid/widget/TextView;

.field private mPairResultTxt:Landroid/widget/TextView;

.field private mProductId:Ljava/lang/String;

.field mRun:Ljava/lang/Runnable;

.field private mTitle:Ljava/lang/String;

.field private mViewTreeObserver:Landroid/view/ViewTreeObserver;

.field private position:I

.field private productInfo:Lo/afj;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 67
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->bleDeviceHelper:Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;

    .line 95
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->bind_status:I

    .line 337
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mBindingStatusCallback:Lcom/huawei/hihealth/device/open/IDeviceEventHandler;

    .line 468
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$3;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mRun:Ljava/lang/Runnable;

    .line 543
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$4;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Landroid/widget/ImageView;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultDeviceImg:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->bindSuccess()V

    return-void
.end method

.method static synthetic access$1100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 67
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method static synthetic access$1200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;I)V
    .locals 0

    .line 67
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->bindFail(I)V

    return-void
.end method

.method static synthetic access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 67
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method static synthetic access$1400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$BindUniversalCallback;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mHandlerUniversalCallback:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$BindUniversalCallback;

    return-object v0
.end method

.method static synthetic access$1500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Landroid/os/Handler;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$1600(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;Lcom/huawei/hihealth/device/open/HealthDevice;)Z
    .locals 1

    .line 67
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->isDeviceExistInmListItems(Lcom/huawei/hihealth/device/open/HealthDevice;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$1700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->prepareBind()V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Landroid/widget/FrameLayout;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultDeviceProgressImgFrameLayout:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Landroid/app/Activity;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lcom/huawei/hihealth/device/open/HealthDevice;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->item:Lcom/huawei/hihealth/device/open/HealthDevice;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lo/afj;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->productInfo:Lo/afj;

    return-object v0
.end method

.method static synthetic access$600(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;Lo/acl$a;)V
    .locals 0

    .line 67
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->saveDeviceKind(Lo/acl$a;)V

    return-void
.end method

.method static synthetic access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mProductId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 67
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method private bindFail(I)V
    .locals 2

    .line 293
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->a()V

    .line 294
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->c()V

    .line 295
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->bind_status:I

    .line 296
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairGuideProgressAnim:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 297
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultTxt:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_binding_fail:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 298
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultDeviceShowImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->ic_pairing_result_failure:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 299
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mBindFailView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 300
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mBindingLayout:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 301
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultDeviceShowImg:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 302
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultDeviceShowImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->ic_pairing_result_failure:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 303
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairProcessNote:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 305
    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 306
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairProcessNote:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_am16_bind_fail_tip:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 308
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairProcessNote:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_am16_bind_fail_tip2:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 311
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mBottomGuideArrowLayout:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 312
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultPrivacyTxt:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 313
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mDoneButton:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 314
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->animHonour:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_1

    .line 315
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->animHonour:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 317
    :cond_1
    return-void
.end method

.method private bindSuccess()V
    .locals 4

    .line 265
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->a()V

    .line 266
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->c()V

    .line 267
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->bind_status:I

    .line 268
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairGuideProgressAnim:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 269
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultTxt:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_jabra_bind_success_text:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 270
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mBindFailView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 271
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mBindingLayout:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 272
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultDeviceShowImg:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 273
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultDeviceShowImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->ic_pairing_completed:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 274
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairProcessNote:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 275
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mBottomGuideArrowLayout:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 276
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultPrivacyTxt:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 277
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mDoneButton:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 278
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_sns_compelete:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 279
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mDoneButton:Lo/egd;

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 280
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->animHonour:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_0

    .line 281
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->animHonour:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 284
    :cond_0
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 285
    const-string v0, "com.huawei.plugin_device.am16_bind_success"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 286
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 287
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v3, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 289
    return-void
.end method

.method private initStartView()V
    .locals 2

    .line 251
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->bind_status:I

    .line 252
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultTxt:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_selection_waiting_binding:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 253
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairGuideProgressAnim:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 254
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mBindFailView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 255
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mBindingLayout:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 256
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultDeviceShowImg:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 257
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairProcessNote:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 258
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->animHonour:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 259
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mBottomGuideArrowLayout:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 260
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultPrivacyTxt:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 261
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mDoneButton:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 262
    return-void
.end method

.method private isDeviceExistInmListItems(Lcom/huawei/hihealth/device/open/HealthDevice;)Z
    .locals 4

    .line 579
    const/4 v2, 0x0

    .line 582
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mListItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_2

    .line 583
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mListItems:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/device/open/HealthDevice;

    invoke-virtual {v0}, Lcom/huawei/hihealth/device/open/HealthDevice;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hihealth/device/open/HealthDevice;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mListItems:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/device/open/HealthDevice;

    invoke-virtual {v0}, Lcom/huawei/hihealth/device/open/HealthDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hihealth/device/open/HealthDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 584
    :cond_0
    const/4 v2, 0x1

    .line 585
    return v2

    .line 582
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 589
    :cond_2
    return v2
.end method

.method private prepareBind()V
    .locals 8

    .line 129
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->position:I

    if-ltz v0, :cond_4

    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->position:I

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mListItems:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 130
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mListItems:Ljava/util/ArrayList;

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->position:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/device/open/HealthDevice;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->item:Lcom/huawei/hihealth/device/open/HealthDevice;

    .line 131
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "item_name:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->item:Lcom/huawei/hihealth/device/open/HealthDevice;

    invoke-virtual {v3}, Lcom/huawei/hihealth/device/open/HealthDevice;->getDeviceName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->productInfo:Lo/afj;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 133
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 134
    return-void

    .line 136
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceBindWaitingFragment pair is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->productInfo:Lo/afj;

    iget-object v3, v3, Lo/afj;->f:Lo/acf;

    invoke-virtual {v3}, Lo/acf;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->productInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->i()Lo/acf;

    move-result-object v0

    invoke-virtual {v0}, Lo/acf;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "yes"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 138
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    invoke-virtual {v0}, Lo/agc;->b()Z

    move-result v5

    .line 139
    if-eqz v5, :cond_1

    goto/16 :goto_0

    .line 142
    :cond_1
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->item:Lcom/huawei/hihealth/device/open/HealthDevice;

    invoke-virtual {v1}, Lcom/huawei/hihealth/device/open/HealthDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v6

    .line 143
    invoke-virtual {v6}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_2

    .line 145
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NOT BOND_BONDED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0, v6}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->createBond(Ljava/lang/Class;Landroid/bluetooth/BluetoothDevice;)Z

    .line 148
    new-instance v7, Landroid/content/IntentFilter;

    invoke-direct {v7}, Landroid/content/IntentFilter;-><init>()V

    .line 149
    const-string v0, "android.bluetooth.device.action.BOND_STATE_CHANGED"

    invoke-virtual {v7, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 150
    new-instance v0, Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;

    invoke-direct {v0, v6}, Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->bleDeviceHelper:Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;

    .line 153
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->bleDeviceHelper:Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;

    invoke-virtual {v0, v1, v7}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    goto :goto_0

    .line 155
    :catch_0
    move-exception v7

    .line 156
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setPiN failed!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    goto :goto_0

    .line 159
    :cond_2
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->productInfo:Lo/afj;

    invoke-virtual {v2}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->item:Lcom/huawei/hihealth/device/open/HealthDevice;

    iget-object v4, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mBindingStatusCallback:Lcom/huawei/hihealth/device/open/IDeviceEventHandler;

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/afd;->b(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/IDeviceEventHandler;)Z

    .line 162
    :goto_0
    goto :goto_1

    .line 163
    :cond_3
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->productInfo:Lo/afj;

    invoke-virtual {v2}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->item:Lcom/huawei/hihealth/device/open/HealthDevice;

    iget-object v4, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mBindingStatusCallback:Lcom/huawei/hihealth/device/open/IDeviceEventHandler;

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/afd;->b(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/IDeviceEventHandler;)Z

    .line 166
    :cond_4
    :goto_1
    return-void
.end method

.method private saveDeviceKind(Lo/acl$a;)V
    .locals 5

    .line 446
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDeviceKind"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 449
    sget-object v0, Lo/acl$a;->c:Lo/acl$a;

    invoke-virtual {v0, p1}, Lo/acl$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 450
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "BIND_WEIGHT"

    const-string v3, "1"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 453
    :cond_0
    sget-object v0, Lo/acl$a;->a:Lo/acl$a;

    invoke-virtual {v0, p1}, Lo/acl$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 454
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "BIND_BLOOD_PRESSURE"

    const-string v3, "1"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 457
    :cond_1
    sget-object v0, Lo/acl$a;->d:Lo/acl$a;

    invoke-virtual {v0, p1}, Lo/acl$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 458
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "BIND_BLOOD_SUGAR"

    const-string v3, "1"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 461
    :cond_2
    sget-object v0, Lo/acl$a;->g:Lo/acl$a;

    invoke-virtual {v0, p1}, Lo/acl$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 462
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "BIND_HEART_RATE"

    const-string v3, "1"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 466
    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public createBond(Ljava/lang/Class;Landroid/bluetooth/BluetoothDevice;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 171
    const-string v0, "createBond"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 172
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v2, p2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Boolean;

    .line 173
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public onBackPressed()Z
    .locals 2

    .line 596
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->bind_status:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 597
    const/4 v0, 0x0

    return v0

    .line 598
    :cond_0
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->bind_status:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 599
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mainActivity:Landroid/app/Activity;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setResult(I)V

    .line 600
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 601
    const/4 v0, 0x0

    return v0

    .line 602
    :cond_1
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->bind_status:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 603
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/acd;->a(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 604
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/acd;->c(Ljava/lang/String;)Z

    .line 608
    :cond_2
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onBackPressed()Z

    move-result v0

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 479
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 480
    sget v0, Lcom/huawei/plugindevice/R$id;->pair_guide_right_btn_layout:I

    if-ne v4, v0, :cond_0

    .line 481
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mListItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 482
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->initStartView()V

    .line 483
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mRun:Ljava/lang/Runnable;

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 484
    :cond_0
    sget v0, Lcom/huawei/plugindevice/R$id;->pair_guide_left_cancel_layout:I

    if-ne v4, v0, :cond_2

    .line 485
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/acd;->a(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 486
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/acd;->c(Ljava/lang/String;)Z

    .line 488
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 489
    :cond_2
    sget v0, Lcom/huawei/plugindevice/R$id;->done_button:I

    if-ne v4, v0, :cond_3

    .line 490
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 491
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 492
    const-string v0, "goto"

    const-string v1, "devicebind"

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 493
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mTitle:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 494
    new-instance v6, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-direct {v6}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;-><init>()V

    .line 495
    invoke-virtual {v6, v5}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 496
    invoke-virtual {p0, v6}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 498
    :cond_3
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 104
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceBindWaitingFragment onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 108
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v4

    .line 109
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/device/ui/DeviceMainActivity;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->b()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mListItems:Ljava/util/ArrayList;

    .line 110
    const-string v0, "productId"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mProductId:Ljava/lang/String;

    .line 111
    const-string v0, "position"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->position:I

    .line 112
    const-string v0, "title"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mTitle:Ljava/lang/String;

    .line 113
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->productInfo:Lo/afj;

    .line 114
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$BindUniversalCallback;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$BindUniversalCallback;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$1;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mHandlerUniversalCallback:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$BindUniversalCallback;

    .line 115
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceBindWaitingFragment productId is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceBindWaitingFragment position is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->position:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceBindWaitingFragment mListItems size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mListItems:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mListItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 120
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 121
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceBindWaitingFragment destroy activity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 123
    return-void

    .line 126
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 12

    .line 179
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceBindWaitingFragment onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 181
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_measure_bind_device:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 182
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_device_failed_fragment:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mBindFailView:Landroid/view/View;

    .line 183
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_binding_layout:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mBindingLayout:Landroid/view/View;

    .line 184
    sget v0, Lcom/huawei/plugindevice/R$id;->pair_result_device_show_txt:I

    invoke-static {v5, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultTxt:Landroid/widget/TextView;

    .line 185
    sget v0, Lcom/huawei/plugindevice/R$id;->pair_result_device_show_img:I

    invoke-static {v5, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultDeviceShowImg:Landroid/widget/ImageView;

    .line 186
    sget v0, Lcom/huawei/plugindevice/R$id;->device_pairing_progress_guide_single_note:I

    invoke-static {v5, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairProcessNote:Landroid/widget/TextView;

    .line 187
    sget v0, Lcom/huawei/plugindevice/R$id;->device_pair_guide_progress_anim:I

    invoke-static {v5, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairGuideProgressAnim:Landroid/widget/ImageView;

    .line 188
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairGuideProgressAnim:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->animHonour:Landroid/graphics/drawable/AnimationDrawable;

    .line 189
    sget v0, Lcom/huawei/plugindevice/R$id;->device_pairing_guide_bottom_arrow_layout:I

    invoke-static {v5, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mBottomGuideArrowLayout:Landroid/view/View;

    .line 190
    sget v0, Lcom/huawei/plugindevice/R$id;->pair_result_device_privacy_txt:I

    invoke-static {v5, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultPrivacyTxt:Landroid/widget/TextView;

    .line 191
    sget v0, Lcom/huawei/plugindevice/R$id;->done_button:I

    invoke-static {v5, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mDoneButton:Lo/egd;

    .line 192
    sget v0, Lcom/huawei/plugindevice/R$id;->pair_result_device_img:I

    invoke-static {v5, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultDeviceImg:Landroid/widget/ImageView;

    .line 193
    sget v0, Lcom/huawei/plugindevice/R$id;->pair_result_device_progress_img:I

    invoke-static {v5, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultDeviceProgressImgFrameLayout:Landroid/widget/FrameLayout;

    .line 194
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mPairResultDeviceImg:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mViewTreeObserver:Landroid/view/ViewTreeObserver;

    .line 195
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mViewTreeObserver:Landroid/view/ViewTreeObserver;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 205
    sget v0, Lcom/huawei/plugindevice/R$id;->pair_guide_right_btn_layout:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    .line 206
    sget v0, Lcom/huawei/plugindevice/R$id;->pair_guide_left_cancel_layout:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    .line 207
    invoke-virtual {v6, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 208
    invoke-virtual {v7, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 209
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mDoneButton:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 211
    sget v0, Lcom/huawei/plugindevice/R$id;->device_measure_search_prompt:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    .line 213
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 214
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->initStartView()V

    goto :goto_0

    .line 216
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mBindFailView:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 217
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mBindingLayout:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 218
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_selection_waiting_for_binding:I

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(I)V

    .line 219
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_device_bind_pb:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lhuawei/widget/HwProgressBar;

    .line 220
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 222
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 224
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 225
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mRun:Ljava/lang/Runnable;

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    .line 227
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->prepareBind()V

    .line 230
    :goto_1
    sget v0, Lcom/huawei/plugindevice/R$id;->right_arrow_txt:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    .line 231
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_retry:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 233
    sget v0, Lcom/huawei/plugindevice/R$id;->pair_guide_left_image:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/ImageView;

    .line 234
    sget v0, Lcom/huawei/plugindevice/R$id;->pair_guide_right_image:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/ImageView;

    .line 236
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 237
    sget v0, Lcom/huawei/plugindevice/R$mipmap;->img_common_right:I

    invoke-virtual {v10, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 238
    sget v0, Lcom/huawei/plugindevice/R$mipmap;->img_common_left:I

    invoke-virtual {v11, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    .line 240
    :cond_2
    sget v0, Lcom/huawei/plugindevice/R$mipmap;->img_common_left:I

    invoke-virtual {v10, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 241
    sget v0, Lcom/huawei/plugindevice/R$mipmap;->img_common_right:I

    invoke-virtual {v11, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 243
    :goto_2
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 244
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 246
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->mTitle:Ljava/lang/String;

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/BaseFragment;->setTitle(Ljava/lang/String;)V

    .line 247
    return-object v4
.end method

.method public onDestroy()V
    .locals 2

    .line 321
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->productInfo:Lo/afj;

    if-eqz v0, :cond_0

    .line 322
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->productInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->i()Lo/acf;

    move-result-object v0

    invoke-virtual {v0}, Lo/acf;->e()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 323
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->f()Z

    .line 326
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->bleDeviceHelper:Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;

    if-eqz v0, :cond_1

    .line 327
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->bleDeviceHelper:Lcom/huawei/health/device/connectivity/comm/BleDeviceHelper;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 330
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->animHonour:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_2

    .line 331
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->animHonour:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 334
    :cond_2
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroy()V

    .line 335
    return-void
.end method

.class public Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "WiFiDeviceScanFailFragment"


# instance fields
.field private contextTv:Landroid/widget/TextView;

.field private errorImg:Landroid/widget/ImageView;

.field private failTitle:Landroid/widget/TextView;

.field private mRetryBtn:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->retry()V

    return-void
.end method

.method private initView()V
    .locals 3

    .line 70
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_measure_top_square:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->errorImg:Landroid/widget/ImageView;

    .line 71
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_measure_fail_tip_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->failTitle:Landroid/widget/TextView;

    .line 72
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->bt_device_measure_error_confirm:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->mRetryBtn:Landroid/widget/Button;

    .line 73
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_measure_error_tips_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->contextTv:Landroid/widget/TextView;

    .line 74
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_scan_title:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 75
    invoke-virtual {p0, v2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->setTitle(Ljava/lang/String;)V

    .line 76
    return-void
.end method

.method private initViewData()V
    .locals 2

    .line 40
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->errorImg:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 41
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->setErrorImg()V

    .line 42
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->failTitle:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_scan_fail_tip_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 43
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->mRetryBtn:Landroid/widget/Button;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_retry:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 44
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->contextTv:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_scan_fail_msg:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 45
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->mRetryBtn:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 51
    return-void
.end method

.method private retry()V
    .locals 1

    .line 53
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->popupFragment(Ljava/lang/Class;)V

    .line 54
    return-void
.end method

.method private setErrorImg()V
    .locals 10

    .line 58
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v6

    .line 59
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v7, v0, Landroid/util/DisplayMetrics;->density:F

    .line 60
    int-to-float v0, v6

    div-float/2addr v0, v7

    const/high16 v1, 0x3f000000    # 0.5f

    add-float v8, v0, v1

    .line 61
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "heightInDp is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->errorImg:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$drawable;->ic_health_equipment_bind_failed:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 63
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->errorImg:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 65
    int-to-double v0, v6

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    div-double/2addr v0, v2

    float-to-double v2, v7

    const-wide v4, 0x4052200000000000L    # 72.5

    mul-double/2addr v2, v4

    sub-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, v9, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 66
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->errorImg:Landroid/widget/ImageView;

    invoke-virtual {v0, v9}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 67
    return-void
.end method


# virtual methods
.method public onBackPressed()Z
    .locals 4

    .line 79
    const-string v0, "WiFiDeviceScanFailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onBackPressed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 80
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->popupFragment(Ljava/lang/Class;)V

    .line 81
    const/4 v0, 0x0

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 29
    const-string v0, "WiFiDeviceScanFailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 30
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 31
    sget v0, Lcom/huawei/plugindevice/R$layout;->failed_bind_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->child:Landroid/view/View;

    .line 32
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->initView()V

    .line 33
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->initViewData()V

    .line 34
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 35
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFailFragment;->child:Landroid/view/View;

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 37
    :cond_0
    return-object v4
.end method

.class public Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Lo/emu;

.field private e:Landroid/widget/TextView;

.field private f:Lo/dqi;

.field private h:Lo/enz;

.field private i:Landroid/content/Context;

.field private k:Landroid/widget/CompoundButton$OnCheckedChangeListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 135
    new-instance v0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$3;-><init>(Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->k:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;)Landroid/widget/CompoundButton$OnCheckedChangeListener;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->k:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;)Lo/emu;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->d:Lo/emu;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;)Lo/enz;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->h:Lo/enz;

    return-object v0
.end method

.method private e()V
    .locals 8

    .line 54
    sget v0, Lcom/huawei/ui/device/R$id;->heart_rate_switch_button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->d:Lo/emu;

    .line 55
    sget v0, Lcom/huawei/ui/device/R$id;->heart_rate_content_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->b:Landroid/widget/TextView;

    .line 56
    sget v0, Lcom/huawei/ui/device/R$id;->heart_rate_tip1_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->c:Landroid/widget/TextView;

    .line 57
    sget v0, Lcom/huawei/ui/device/R$id;->heart_rate_tip2_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->e:Landroid/widget/TextView;

    .line 58
    sget v0, Lcom/huawei/ui/device/R$id;->settings_heart_rate_imageView:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->a:Landroid/widget/ImageView;

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->h:Lo/enz;

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->h:Lo/enz;

    invoke-virtual {v0}, Lo/enz;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 62
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 63
    const-string v0, "HeartRateSettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refresh dialog Support deviceInfo is null , return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    return-void

    .line 67
    :cond_0
    const-string v5, ""

    .line 68
    const-string v6, ""

    .line 69
    const-string v7, ""

    .line 72
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, 0x3

    if-eq v1, v0, :cond_1

    .line 73
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xa

    if-eq v1, v0, :cond_1

    .line 74
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0x8

    if-ne v1, v0, :cond_2

    .line 75
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_Settings_heart_rate_watch_content:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 76
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_Settings_heart_rate_watch_tip:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->a:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->home_set_rate_watch_remider_image:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 79
    :cond_2
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xd

    if-eq v1, v0, :cond_3

    .line 80
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0x10

    if-eq v1, v0, :cond_3

    .line 81
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xf

    if-eq v1, v0, :cond_3

    .line 82
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xc

    if-ne v1, v0, :cond_4

    .line 84
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_Settings_heart_rate_band_content:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 85
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_Settings_heart_rate_band_tip:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 87
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->a:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->home_set_rate_band_remider_image:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 90
    :cond_4
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_Settings_heart_rate_watch_or_band_tip:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->b:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v2, 0x18

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->c:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->e:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->f:Lo/dqi;

    const-string v1, "heart_rate_button"

    new-instance v2, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$4;-><init>(Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 130
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 46
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 47
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_heart_rate_settings:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->setContentView(I)V

    .line 48
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->i:Landroid/content/Context;

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->f:Lo/dqi;

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->e()V

    .line 51
    return-void
.end method

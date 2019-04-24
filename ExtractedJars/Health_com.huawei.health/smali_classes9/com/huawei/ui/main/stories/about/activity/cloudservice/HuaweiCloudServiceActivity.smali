.class public Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/Button;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/content/Context;

.field private f:Landroid/support/v4/content/LocalBroadcastManager;

.field private g:Ljava/lang/String;

.field private h:Landroid/content/BroadcastReceiver;

.field private i:Lo/etx;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    const-class v0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 103
    new-instance v0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity$2;-><init>(Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->h:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 4

    .line 74
    sget-object v0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchCloudService() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    const-string v0, "false"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->g:Ljava/lang/String;

    goto :goto_0

    .line 79
    :cond_0
    const-string v0, "true"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->g:Ljava/lang/String;

    .line 82
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->i:Lo/etx;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/etx;->e(Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->i:Lo/etx;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/etx;->a(Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->g:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->c(Ljava/lang/String;)V

    .line 87
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;Ljava/lang/String;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->g:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;)Lo/etx;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->i:Lo/etx;

    return-object v0
.end method

.method private c()V
    .locals 3

    .line 94
    new-instance v2, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CLOUD_SWITCH_CHANGED"

    invoke-direct {v2, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 95
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->f:Landroid/support/v4/content/LocalBroadcastManager;

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->f:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->h:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 98
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .line 124
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_about_huawei_cloud_service_on:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->a:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_about_huawei_cloud_service_on_warn:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 127
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->b:Landroid/widget/Button;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_about_huawei_cloud_service_action_turn_off:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->b:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->settings_weather_report_button_turn_off_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 129
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->common_gray_btn_selector:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 130
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->b:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 131
    goto :goto_0

    .line 132
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_about_huawei_cloud_service_off:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->a:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_about_huawei_cloud_service_off_warn:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 134
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->b:Landroid/widget/Button;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_about_huawei_cloud_service_action_turn_on:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->b:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->settings_weather_report_button_turn_on_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 136
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->common_blue_btn_selector:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->b:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 139
    :goto_0
    return-void
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .line 30
    sget-object v0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;)Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->g:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 63
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    .line 64
    sget v0, Lcom/huawei/ui/main/R$id;->cloud_service_switch_btn:I

    if-ne v1, v0, :cond_0

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->g:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->a(Ljava/lang/String;)V

    .line 67
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 44
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 45
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_cloud_service:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->setContentView(I)V

    .line 46
    iput-object p0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->e:Landroid/content/Context;

    .line 48
    sget v0, Lcom/huawei/ui/main/R$id;->cloud_service_status_text:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->d:Landroid/widget/TextView;

    .line 49
    sget v0, Lcom/huawei/ui/main/R$id;->cloud_service_warn_text:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->a:Landroid/widget/TextView;

    .line 50
    sget v0, Lcom/huawei/ui/main/R$id;->cloud_service_switch_btn:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->b:Landroid/widget/Button;

    .line 51
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->b:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 53
    new-instance v0, Lo/etx;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/etx;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->i:Lo/etx;

    .line 54
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->i:Lo/etx;

    invoke-virtual {v0}, Lo/etx;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->g:Ljava/lang/String;

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->g:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->c(Ljava/lang/String;)V

    .line 58
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->c()V

    .line 59
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 143
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->f:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->h:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 145
    return-void
.end method

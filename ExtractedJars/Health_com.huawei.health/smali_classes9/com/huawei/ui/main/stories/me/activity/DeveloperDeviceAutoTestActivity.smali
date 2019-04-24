.class public Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field private a:Landroid/widget/RelativeLayout;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Landroid/widget/RelativeLayout;

.field private e:Landroid/widget/LinearLayout;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Lo/emu;

.field private k:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 40
    const-string v0, "deviceautotest"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->g:Ljava/lang/String;

    .line 41
    const-string v0, "deviceauto"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->f:Ljava/lang/String;

    return-void
.end method

.method private a()V
    .locals 6

    .line 54
    const-string v0, "DeveloperDeviceAutoTestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_setting_blood_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->a:Landroid/widget/RelativeLayout;

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 59
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_setting_sugar_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->b:Landroid/widget/RelativeLayout;

    .line 60
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_setting_weight_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->c:Landroid/widget/RelativeLayout;

    .line 63
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_heart_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->d:Landroid/widget/RelativeLayout;

    .line 66
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 68
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_device_auto_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->h:Lo/emu;

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->h:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 71
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_setting_device_auto_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->e:Landroid/widget/LinearLayout;

    .line 73
    new-instance v4, Lo/ffz;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->k:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->g:Ljava/lang/String;

    invoke-direct {v4, v0, v1}, Lo/ffz;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->f:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lo/ffz;->a(Ljava/lang/String;)Z

    move-result v5

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->h:Lo/emu;

    invoke-virtual {v0, v5}, Lo/emu;->setChecked(Z)V

    .line 77
    if-eqz v5, :cond_0

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->e:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 80
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->e:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 82
    :goto_0
    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->h:Lo/emu;

    if-ne p1, v0, :cond_1

    .line 108
    new-instance v2, Lo/ffz;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->k:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->g:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lo/ffz;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 109
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->f:Ljava/lang/String;

    invoke-virtual {v2, v0, p2}, Lo/ffz;->e(Ljava/lang/String;Z)V

    .line 110
    if-eqz p2, :cond_0

    .line 111
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->e:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->e:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 116
    :cond_1
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->a:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_0

    .line 87
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 88
    const-string v0, "device"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 89
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->startActivity(Landroid/content/Intent;)V

    .line 90
    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->b:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_1

    .line 91
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 92
    const-string v0, "device"

    const/4 v1, 0x2

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 93
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->startActivity(Landroid/content/Intent;)V

    .line 94
    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->c:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_2

    .line 95
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 96
    const-string v0, "device"

    const/4 v1, 0x3

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 97
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->startActivity(Landroid/content/Intent;)V

    .line 98
    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->d:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_3

    .line 99
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 100
    const-string v0, "device"

    const/4 v1, 0x4

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 101
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->startActivity(Landroid/content/Intent;)V

    .line 103
    :cond_3
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 46
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 47
    const-string v0, "DeveloperDeviceAutoTestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_settings_device_auto_options:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->setContentView(I)V

    .line 49
    iput-object p0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->k:Landroid/content/Context;

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;->a()V

    .line 51
    return-void
.end method

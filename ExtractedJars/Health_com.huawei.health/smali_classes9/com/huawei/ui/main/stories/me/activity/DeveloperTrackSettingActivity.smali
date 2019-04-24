.class public Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private a:Landroid/widget/RelativeLayout;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/widget/RelativeLayout;

.field private e:Landroid/widget/RelativeLayout;

.field private f:Z

.field private g:Lo/emu;

.field private h:Lo/emu;

.field private k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 38
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->k:Z

    .line 41
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->f:Z

    return-void
.end method

.method private a()Z
    .locals 4

    .line 122
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 123
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "dev_3ddis_track"

    .line 122
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 124
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    const-string v0, "true"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    const/4 v0, 0x1

    return v0

    .line 127
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private b()V
    .locals 4

    .line 53
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_setting_auto_track_distance_save:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->c:Landroid/widget/RelativeLayout;

    .line 55
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_setting_timefornopointtosave_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->e:Landroid/widget/RelativeLayout;

    .line 58
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_setting_location_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->a:Landroid/widget/RelativeLayout;

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_indoor_running_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->b:Landroid/widget/RelativeLayout;

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 66
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->e()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->k:Z

    .line 67
    sget v0, Lcom/huawei/ui/main/R$id;->switch_abnormal_track_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->g:Lo/emu;

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->g:Lo/emu;

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->k:Z

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->g:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->a()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->f:Z

    .line 72
    sget v0, Lcom/huawei/ui/main/R$id;->switch_3ddis_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->h:Lo/emu;

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->h:Lo/emu;

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->f:Z

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->h:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 75
    return-void
.end method

.method private c(Z)V
    .locals 5

    .line 131
    new-instance v3, Lo/dcy;

    invoke-direct {v3}, Lo/dcy;-><init>()V

    .line 132
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v4

    .line 133
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 134
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "dev_3ddis_track"

    .line 133
    invoke-static {v0, v1, v2, v4, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 138
    return-void
.end method

.method private e(Z)V
    .locals 5

    .line 112
    new-instance v3, Lo/dcy;

    invoke-direct {v3}, Lo/dcy;-><init>()V

    .line 113
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v4

    .line 114
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 115
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "dev_abnormal_track"

    .line 114
    invoke-static {v0, v1, v2, v4, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 119
    return-void
.end method

.method private e()Z
    .locals 4

    .line 103
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 104
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "dev_abnormal_track"

    .line 103
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 105
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    const-string v0, "false"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    const/4 v0, 0x0

    return v0

    .line 108
    :cond_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->e:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_0

    .line 80
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTimeSettingActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 81
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 82
    goto/16 :goto_2

    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->a:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_1

    .line 83
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLocationSettingActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 84
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 85
    goto/16 :goto_2

    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->c:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_2

    .line 86
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 87
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 88
    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->b:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_3

    .line 89
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 90
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 91
    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->g:Lo/emu;

    if-ne p1, v0, :cond_5

    .line 92
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->k:Z

    if-nez v0, :cond_4

    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->k:Z

    .line 93
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->g:Lo/emu;

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->k:Z

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 94
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->k:Z

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->e(Z)V

    goto :goto_2

    .line 95
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->h:Lo/emu;

    if-ne p1, v0, :cond_7

    .line 96
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->f:Z

    if-nez v0, :cond_6

    const/4 v0, 0x1

    goto :goto_1

    :cond_6
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->f:Z

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->h:Lo/emu;

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->f:Z

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 98
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->f:Z

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->c(Z)V

    .line 100
    :cond_7
    :goto_2
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 45
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 46
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_settings_track_options:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->setContentView(I)V

    .line 49
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;->b()V

    .line 50
    return-void
.end method

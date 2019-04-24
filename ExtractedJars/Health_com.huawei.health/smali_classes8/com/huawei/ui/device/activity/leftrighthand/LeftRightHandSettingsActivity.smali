.class public Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/Button;

.field private b:Z

.field private c:Landroid/content/Context;

.field private d:Lo/enz;

.field private e:Landroid/widget/Button;

.field private h:Lo/dqi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->b:Z

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;Z)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 2

    .line 135
    if-nez p1, :cond_0

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->e:Landroid/widget/Button;

    sget v1, Lcom/huawei/ui/device/R$drawable;->setting_wear_state_on:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->a:Landroid/widget/Button;

    sget v1, Lcom/huawei/ui/device/R$drawable;->setting_wear_state_off:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    goto :goto_0

    .line 140
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->e:Landroid/widget/Button;

    sget v1, Lcom/huawei/ui/device/R$drawable;->setting_wear_state_off:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->a:Landroid/widget/Button;

    sget v1, Lcom/huawei/ui/device/R$drawable;->setting_wear_state_on:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 143
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;Z)Z
    .locals 0

    .line 31
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->b:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;)Z
    .locals 1

    .line 31
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->b:Z

    return v0
.end method

.method private d(Z)V
    .locals 5

    .line 114
    const-string v0, "LeftRightHandSettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clickLeftOrRightBtnProcess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v4

    .line 116
    invoke-virtual {v4}, Lo/env;->i()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 117
    const-string v0, "LeftRightHandSettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoConnectedToast()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    iget-object v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_not_connect:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 120
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->d:Lo/enz;

    new-instance v1, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$1;-><init>(Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;Z)V

    invoke-virtual {v0, p1, v1}, Lo/enz;->c(ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 132
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 96
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    .line 97
    sget v0, Lcom/huawei/ui/device/R$id;->settings_left_btn:I

    if-ne v0, v1, :cond_0

    .line 98
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->b:Z

    if-eqz v0, :cond_1

    .line 99
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->b:Z

    .line 100
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->b:Z

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->a(Z)V

    .line 101
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->b:Z

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->d(Z)V

    goto :goto_0

    .line 104
    :cond_0
    sget v0, Lcom/huawei/ui/device/R$id;->settings_right_btn:I

    if-ne v0, v1, :cond_1

    .line 105
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->b:Z

    if-nez v0, :cond_1

    .line 106
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->b:Z

    .line 107
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->b:Z

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->a(Z)V

    .line 108
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->b:Z

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->d(Z)V

    .line 111
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 44
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 45
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_left_right_hand_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->setContentView(I)V

    .line 46
    iput-object p0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->c:Landroid/content/Context;

    .line 47
    iget-object v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->h:Lo/dqi;

    .line 48
    sget v0, Lcom/huawei/ui/device/R$id;->settings_left_btn:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->e:Landroid/widget/Button;

    .line 49
    sget v0, Lcom/huawei/ui/device/R$id;->settings_right_btn:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->a:Landroid/widget/Button;

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->e:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 51
    iget-object v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->a:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->d:Lo/enz;

    .line 55
    iget-object v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->h:Lo/dqi;

    const-string v1, "left_or_right_hand_wear_status"

    new-instance v2, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5;-><init>(Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 84
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 147
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 148
    const-string v0, "LeftRightHandSettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 88
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 89
    const-string v0, "LeftRightHandSettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    return-void
.end method

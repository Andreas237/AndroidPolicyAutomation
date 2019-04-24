.class public Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Lo/dqi;

.field private b:Lo/egy;

.field private c:Lo/enz;

.field private d:Landroid/content/Context;

.field private e:Lo/emu;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Z

.field private i:Landroid/widget/TextView;

.field private k:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->b:Lo/egy;

    .line 53
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->h:Z

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->b()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)Landroid/content/Context;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->d:Landroid/content/Context;

    return-object v0
.end method

.method private b()V
    .locals 2

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->b:Lo/egy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->b:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 206
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->b:Lo/egy;

    .line 208
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)Lo/emu;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->e:Lo/emu;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)Lo/enz;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->c:Lo/enz;

    return-object v0
.end method

.method private d()V
    .locals 5

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->b:Lo/egy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->b:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    return-void

    .line 165
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_common_enable_button:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 168
    new-instance v0, Lo/egy$b;

    invoke-direct {v0, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_Settings_truSleep_switch_dialog_tip:I

    .line 169
    invoke-virtual {v0, v1}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    .line 170
    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$2;-><init>(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$1;-><init>(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)V

    .line 189
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v4

    .line 198
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->b:Lo/egy;

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->b:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->b:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 201
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;Z)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->e(Z)V

    return-void
.end method

.method private e(Z)V
    .locals 9

    .line 211
    const-string v0, "CORESLEEPMISSON_CoreSleepSelectorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isChecked:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    const-string v4, ""

    .line 215
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 216
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 217
    const-string v0, "action_change_core_sleep_button"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 218
    if-eqz p1, :cond_1

    .line 221
    const-string v4, "1"

    .line 222
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->h:Z

    if-eqz v0, :cond_0

    .line 224
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 225
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 226
    const-string v0, "action_change_core_sleep_button"

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 227
    const-string v0, "status"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->c:Lo/enz;

    const-string v1, "1"

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 228
    const-string v0, "status"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->c:Lo/enz;

    const-string v1, "1"

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->d:Landroid/content/Context;

    invoke-static {v0, v8}, Lo/dbg;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 230
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v7}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->setResult(ILandroid/content/Intent;)V

    .line 231
    goto :goto_0

    .line 232
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->d()V

    goto :goto_0

    .line 235
    :cond_1
    const-string v0, "status"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->c:Lo/enz;

    const-string v1, "0"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 236
    const-string v0, "status"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->c:Lo/enz;

    const-string v1, "0"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 237
    const-string v4, "0"

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->d:Landroid/content/Context;

    invoke-static {v0, v6}, Lo/dbg;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 239
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v5}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->setResult(ILandroid/content/Intent;)V

    .line 242
    :goto_0
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 243
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    const-string v0, "status"

    invoke-interface {v7, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    sget-object v0, Lo/dae;->iG:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v8

    .line 246
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->d:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v8, v7, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 247
    const-string v0, "CORESLEEPMISSON_CoreSleepSelectorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BI save coreSleep click event finish, value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->k:Z

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;Z)Z
    .locals 0

    .line 41
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->k:Z

    return p1
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    .line 62
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 63
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_core_sleep_selector:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->setContentView(I)V

    .line 64
    iput-object p0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->d:Landroid/content/Context;

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->a:Lo/dqi;

    .line 66
    sget v0, Lcom/huawei/ui/device/R$id;->event_core_sleep_switch_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->e:Lo/emu;

    .line 67
    sget v0, Lcom/huawei/ui/device/R$id;->content_2:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->f:Landroid/widget/TextView;

    .line 68
    sget v0, Lcom/huawei/ui/device/R$id;->content_3:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->g:Landroid/widget/TextView;

    .line 69
    sget v0, Lcom/huawei/ui/device/R$id;->core_sleep_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->i:Landroid/widget/TextView;

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->c:Lo/enz;

    .line 71
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDefaultSwitch()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 72
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->h:Z

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 75
    const-string v0, "CORESLEEPMISSON_CoreSleepSelectorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isDefault :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->h:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 77
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->h:Z

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 79
    const-string v0, "CORESLEEPMISSON_CoreSleepSelectorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device support default switch, core sleep not default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 82
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->h:Z

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 85
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->e:Lo/emu;

    new-instance v1, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$4;-><init>(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 95
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->getIntent()Landroid/content/Intent;

    move-result-object v6

    .line 96
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 97
    const-string v0, "CORESLEEPMISSON_CoreSleepSelectorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent != null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    const-string v0, "core_sleep_active_open_control_btn"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->k:Z

    goto :goto_1

    .line 100
    :cond_2
    const-string v0, "CORESLEEPMISSON_CoreSleepSelectorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Intent == null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_core_sleep_content_2:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_core_sleep_content_3:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/16 v4, 0xc8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 252
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->b()V

    .line 253
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 254
    const-string v0, "CORESLEEPMISSON_CoreSleepSelectorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->finish()V

    .line 256
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 108
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 109
    const-string v0, "CORESLEEPMISSON_CoreSleepSelectorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->b:Lo/egy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->b:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 112
    return-void

    .line 115
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->c:Lo/enz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->a:Lo/dqi;

    const-string v1, "core_sleep_button"

    new-instance v2, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;-><init>(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 158
    :cond_1
    return-void
.end method

.class public Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;,
        Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$b;
    }
.end annotation


# instance fields
.field private a:Lo/dqi;

.field private b:Lo/enz;

.field private c:Landroid/content/Context;

.field private d:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;

.field private e:Lo/exv;

.field private f:Z

.field private g:Z

.field private h:Landroid/support/v7/widget/RecyclerView;

.field private i:Landroid/os/Handler;

.field private k:Landroid/widget/Switch;

.field private l:Z

.field private m:Lo/emr;

.field private n:Z

.field private o:Landroid/widget/CompoundButton$OnCheckedChangeListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 63
    new-instance v0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$b;

    invoke-direct {v0, p0, p0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$b;-><init>(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->i:Landroid/os/Handler;

    .line 154
    new-instance v0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$3;-><init>(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->o:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Landroid/widget/Switch;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->k:Landroid/widget/Switch;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;Ljava/lang/Class;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->a(Ljava/lang/Class;)V

    return-void
.end method

.method private a(Ljava/lang/Class;)V
    .locals 5

    .line 423
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->c:Landroid/content/Context;

    invoke-direct {v4, v0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 424
    const-string v0, "PressAutoMonitorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "to card activity = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->n:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 425
    invoke-virtual {p0, v4}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->startActivity(Landroid/content/Intent;)V

    .line 426
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->finish()V

    .line 427
    return-void
.end method

.method private b()V
    .locals 4

    .line 199
    const/4 v2, 0x0

    .line 200
    new-instance v3, Lo/egv$b;

    invoke-direct {v3, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 201
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_hw_pressure_adjust:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    .line 202
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_press_auto_monitor_dialog_explain:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    .line 203
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$5;-><init>(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)V

    invoke-virtual {v3, v0, v1}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 211
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_press_auto_monitor_start:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$2;-><init>(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)V

    invoke-virtual {v3, v0, v1}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 234
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v2

    .line 235
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/egv;->setCancelable(Z)V

    .line 236
    invoke-virtual {v2}, Lo/egv;->show()V

    .line 237
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->b()V

    return-void
.end method

.method private b(Z)V
    .locals 4

    .line 245
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->f:Z

    .line 246
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 247
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;Z)Z
    .locals 0

    .line 50
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->g:Z

    return p1
.end method

.method private c()V
    .locals 5

    .line 132
    sget v0, Lcom/huawei/ui/device/R$id;->setting_device_title_bar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->m:Lo/emr;

    .line 133
    sget v0, Lcom/huawei/ui/device/R$id;->press_auto_recyclerview:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->h:Landroid/support/v7/widget/RecyclerView;

    .line 134
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->h:Landroid/support/v7/widget/RecyclerView;

    if-nez v0, :cond_0

    .line 135
    const-string v0, "PressAutoMonitorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ERROR widget get!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    return-void

    .line 138
    :cond_0
    new-instance v4, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {v4, p0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->h:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 140
    new-instance v0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;-><init>(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->d:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->h:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->d:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$a;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 142
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->m:Lo/emr;

    new-instance v1, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$4;-><init>(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 148
    return-void
.end method

.method private c(I)V
    .locals 5

    .line 268
    const-string v0, "PressAutoMonitorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8c03\u7528getCalibratedStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    new-instance v4, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v4, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->e:Lo/exv;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 271
    new-instance v0, Lo/exv;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/exv;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->e:Lo/exv;

    .line 273
    :cond_0
    const-string v0, "PressAutoMonitorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8c03\u7528isAlreadyDoPressureAdjust"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->e:Lo/exv;

    new-instance v1, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$6;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$6;-><init>(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;I)V

    invoke-virtual {v0, v4, v1}, Lo/exv;->c(Ljava/util/Date;Lo/egg;)V

    .line 302
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->g:Z

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;Z)Z
    .locals 0

    .line 50
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->f:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;Landroid/widget/Switch;)Landroid/widget/Switch;
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->k:Landroid/widget/Switch;

    return-object p1
.end method

.method private d()V
    .locals 5

    .line 97
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 98
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->l:Z

    .line 99
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 100
    const-string v0, "PressAutoMonitorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter intent != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    const-string v0, "pressure_is_have_datas"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->n:Z

    .line 102
    const-string v0, "from_card"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->l:Z

    .line 104
    :cond_0
    const-string v0, "PressAutoMonitorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isFromCard : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->l:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "isHavedDatas : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->n:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->b:Lo/enz;

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->a:Lo/dqi;

    const-string v1, "press_auto_monitor_switch_status"

    new-instance v2, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$1;-><init>(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 128
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->c(I)V

    .line 129
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->c()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Landroid/content/Context;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->c:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;Lo/enz;)Lo/enz;
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->b:Lo/enz;

    return-object p1
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;Z)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->b(Z)V

    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Landroid/os/Handler;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->i:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Lo/enz;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->b:Lo/enz;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->f:Z

    return v0
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Landroid/widget/CompoundButton$OnCheckedChangeListener;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->o:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    return-object v0
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 251
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 252
    const-string v0, "PressAutoMonitorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->k:Landroid/widget/Switch;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->k:Landroid/widget/Switch;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setEnabled(Z)V

    .line 257
    :cond_0
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->c(I)V

    .line 258
    return-void
.end method

.method public onBackPressed()V
    .locals 5

    .line 387
    const-string v0, "PressAutoMonitorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isFromCard : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->l:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "isHavedDatas : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->n:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->l:Z

    if-eqz v0, :cond_2

    .line 389
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->n:Z

    if-eqz v0, :cond_0

    .line 391
    const-class v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDetailActivity;

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->a(Ljava/lang/Class;)V

    goto :goto_0

    .line 394
    :cond_0
    new-instance v4, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v4, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 395
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->e:Lo/exv;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 396
    new-instance v0, Lo/exv;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/exv;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->e:Lo/exv;

    .line 398
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->e:Lo/exv;

    new-instance v1, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$8;-><init>(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)V

    invoke-virtual {v0, v4, v1}, Lo/exv;->c(Ljava/util/Date;Lo/egg;)V

    .line 416
    :goto_0
    return-void

    .line 418
    :cond_2
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 419
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 79
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 80
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_settings_press_auto_monitor:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->setContentView(I)V

    .line 81
    iput-object p0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->c:Landroid/content/Context;

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->a:Lo/dqi;

    .line 83
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->d()V

    .line 84
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 88
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 89
    const-string v0, "PressAutoMonitorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->setResult(ILandroid/content/Intent;)V

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->k:Landroid/widget/Switch;

    .line 92
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 93
    return-void
.end method

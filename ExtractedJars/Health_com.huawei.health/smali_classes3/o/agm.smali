.class public Lo/agm;
.super Lo/ago;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/agm$c;,
        Lo/agm$a;,
        Lo/agm$d;
    }
.end annotation


# instance fields
.field private final a:Landroid/app/Activity;

.field private b:Landroid/widget/ImageView;

.field private final c:Ljava/lang/String;

.field private d:Landroid/widget/TextView;

.field e:Lo/abx;

.field private f:Ljava/util/Timer;

.field private g:Lo/egw;

.field private h:Z

.field private i:Lo/agm$a;

.field private k:Landroid/app/Dialog;

.field private l:I

.field private m:Z

.field private n:Landroid/os/Handler;

.field private o:Z

.field private p:Ljava/util/Timer;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 83
    invoke-direct {p0}, Lo/ago;-><init>()V

    .line 69
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/agm;->h:Z

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lo/agm;->f:Ljava/util/Timer;

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lo/agm;->p:Ljava/util/Timer;

    .line 73
    const/high16 v0, -0x80000000

    iput v0, p0, Lo/agm;->l:I

    .line 74
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/agm;->o:Z

    .line 75
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/agm;->m:Z

    .line 329
    new-instance v0, Lo/agm$4;

    invoke-direct {v0, p0}, Lo/agm$4;-><init>(Lo/agm;)V

    iput-object v0, p0, Lo/agm;->e:Lo/abx;

    .line 84
    iput-object p1, p0, Lo/agm;->a:Landroid/app/Activity;

    .line 85
    iput-object p2, p0, Lo/agm;->c:Ljava/lang/String;

    .line 86
    invoke-direct {p0}, Lo/agm;->m()Z

    move-result v0

    if-nez v0, :cond_0

    .line 87
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/agm;->d(I)V

    .line 89
    :cond_0
    return-void
.end method

.method static synthetic a(Lo/agm;I)I
    .locals 0

    .line 55
    iput p1, p0, Lo/agm;->l:I

    return p1
.end method

.method static synthetic a(Lo/agm;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lo/agm;->h()V

    return-void
.end method

.method private declared-synchronized a(Z)V
    .locals 4

    monitor-enter p0

    .line 249
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cancel user info task. is start: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 250
    iget-object v0, p0, Lo/agm;->p:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 251
    iget-object v0, p0, Lo/agm;->p:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 252
    const/4 v0, 0x0

    iput-object v0, p0, Lo/agm;->p:Ljava/util/Timer;

    .line 254
    :cond_0
    if-eqz p1, :cond_1

    .line 256
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lo/agm;->p:Ljava/util/Timer;

    .line 257
    iget-object v0, p0, Lo/agm;->p:Ljava/util/Timer;

    new-instance v1, Lo/agm$1;

    invoke-direct {v1, p0}, Lo/agm$1;-><init>(Lo/agm;)V

    const-wide/16 v2, 0x3a98

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 264
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized a(ZZ)Z
    .locals 1

    monitor-enter p0

    .line 285
    if-eqz p2, :cond_0

    .line 286
    :try_start_0
    iput-boolean p1, p0, Lo/agm;->o:Z

    .line 288
    :cond_0
    iget-boolean v0, p0, Lo/agm;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private b()V
    .locals 4

    .line 149
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter Fail to connect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    iget-object v0, p0, Lo/agm;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agm;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_myfitnesspal_logout:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 151
    iget-object v0, p0, Lo/agm;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->ic_bluetooth_disconnected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 152
    invoke-direct {p0}, Lo/agm;->i()V

    .line 154
    invoke-direct {p0}, Lo/agm;->p()V

    .line 155
    return-void
.end method

.method static synthetic b(Lo/agm;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lo/agm;->b()V

    return-void
.end method

.method static synthetic b(Lo/agm;Z)Z
    .locals 0

    .line 55
    iput-boolean p1, p0, Lo/agm;->m:Z

    return p1
.end method

.method static synthetic c(Lo/agm;)Lo/egw;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/agm;->g:Lo/egw;

    return-object v0
.end method

.method static synthetic c(Lo/agm;ZZ)Z
    .locals 1

    .line 55
    invoke-direct {p0, p1, p2}, Lo/agm;->a(ZZ)Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lo/agm;)Landroid/app/Activity;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/agm;->a:Landroid/app/Activity;

    return-object v0
.end method

.method private d(I)V
    .locals 7

    .line 506
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "show open bluetooth dialog..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 507
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 508
    new-instance v4, Lo/egv$b;

    iget-object v0, p0, Lo/agm;->a:Landroid/app/Activity;

    invoke-direct {v4, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 509
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_bluetooth_open:I

    invoke-virtual {v4, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 510
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_bluetooth_open_request:I

    invoke-virtual {v4, v0}, Lo/egv$b;->e(I)Lo/egv$b;

    .line 511
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_no:I

    new-instance v1, Lo/agm$7;

    invoke-direct {v1, p0}, Lo/agm$7;-><init>(Lo/agm;)V

    invoke-virtual {v4, v0, v1}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_yes:I

    new-instance v2, Lo/agm$3;

    invoke-direct {v2, p0}, Lo/agm$3;-><init>(Lo/agm;)V

    .line 515
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 521
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lo/agm;->k:Landroid/app/Dialog;

    .line 522
    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 523
    iget-object v0, p0, Lo/agm;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_app_name_health:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 524
    iget-object v0, p0, Lo/agm;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_bt_open_request_info:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 525
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lo/agm;->a:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    .line 526
    invoke-static {v5, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v6

    .line 527
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_bt_left_btn_info:I

    new-instance v1, Lo/agm$9;

    invoke-direct {v1, p0}, Lo/agm$9;-><init>(Lo/agm;)V

    invoke-virtual {v6, v0, v1}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_bt_right_btn_info:I

    new-instance v2, Lo/agm$8;

    invoke-direct {v2, p0}, Lo/agm$8;-><init>(Lo/agm;)V

    .line 531
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 537
    invoke-virtual {v6}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lo/agm;->k:Landroid/app/Dialog;

    .line 540
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/agm;->k:Landroid/app/Dialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 541
    iget-object v0, p0, Lo/agm;->k:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 542
    return-void
.end method

.method static synthetic d(Lo/agm;Z)V
    .locals 0

    .line 55
    invoke-direct {p0, p1}, Lo/agm;->d(Z)V

    return-void
.end method

.method private d(Z)V
    .locals 5

    .line 438
    invoke-direct {p0}, Lo/agm;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 441
    if-eqz p1, :cond_0

    .line 442
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lo/agm;->c:Ljava/lang/String;

    const/4 v2, -0x6

    invoke-virtual {v0, v1, v2}, Lo/afd;->e(Ljava/lang/String;I)V

    .line 445
    :cond_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 446
    const-string v0, "type"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 447
    const-string v0, "productId"

    iget-object v1, p0, Lo/agm;->c:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 448
    const-string v0, "clearData"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 449
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lo/agm;->c:Ljava/lang/String;

    iget-object v2, p0, Lo/agm;->e:Lo/abx;

    invoke-virtual {v0, v1, v2, v4, p1}, Lo/afd;->c(Ljava/lang/String;Lo/abx;Landroid/os/Bundle;Z)Z

    .line 450
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "connect..."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    goto :goto_0

    .line 452
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bluetooth is off"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/agm;)I
    .locals 1

    .line 55
    iget v0, p0, Lo/agm;->l:I

    return v0
.end method

.method static synthetic e(Lo/agm;Z)V
    .locals 0

    .line 55
    invoke-direct {p0, p1}, Lo/agm;->a(Z)V

    return-void
.end method

.method private f()V
    .locals 6

    .line 227
    iget-object v0, p0, Lo/agm;->g:Lo/egw;

    if-nez v0, :cond_0

    .line 228
    new-instance v3, Lo/egw$c;

    iget-object v0, p0, Lo/agm;->a:Landroid/app/Activity;

    invoke-direct {v3, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 229
    iget-object v0, p0, Lo/agm;->a:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$layout;->dialog_weight_device_clear_user_data_progress:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 230
    sget v0, Lcom/huawei/plugindevice/R$id;->iv_clear_user_data_anim:I

    invoke-static {v4, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 232
    invoke-virtual {v5}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 233
    invoke-virtual {v3, v4}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    .line 234
    invoke-virtual {v3}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lo/agm;->g:Lo/egw;

    .line 235
    iget-object v0, p0, Lo/agm;->g:Lo/egw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw;->setCancelable(Z)V

    .line 236
    iget-object v0, p0, Lo/agm;->g:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 237
    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/agm;->g:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 238
    iget-object v0, p0, Lo/agm;->g:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 241
    :cond_1
    :goto_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/agm;->a(Z)V

    .line 242
    return-void
.end method

.method static synthetic f(Lo/agm;)Z
    .locals 1

    .line 55
    iget-boolean v0, p0, Lo/agm;->m:Z

    return v0
.end method

.method static synthetic g(Lo/agm;)Landroid/os/Handler;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/agm;->n:Landroid/os/Handler;

    return-object v0
.end method

.method private g()V
    .locals 4

    .line 193
    new-instance v3, Lo/egv$b;

    iget-object v0, p0, Lo/agm;->a:Landroid/app/Activity;

    invoke-direct {v3, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 194
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_plugin_device_clear_user_data:I

    invoke-virtual {v3, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 195
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_plugin_device_weight_device_clear_dialog_tip:I

    invoke-virtual {v3, v0}, Lo/egv$b;->e(I)Lo/egv$b;

    .line 196
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_yes:I

    new-instance v1, Lo/agm$2;

    invoke-direct {v1, p0}, Lo/agm$2;-><init>(Lo/agm;)V

    invoke-virtual {v3, v0, v1}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 207
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_no:I

    new-instance v1, Lo/agm$5;

    invoke-direct {v1, p0}, Lo/agm$5;-><init>(Lo/agm;)V

    invoke-virtual {v3, v0, v1}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 214
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v2

    .line 215
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/egv;->setCancelable(Z)V

    .line 216
    invoke-virtual {v2}, Lo/egv;->show()V

    .line 217
    return-void
.end method

.method private h()V
    .locals 4

    .line 158
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter Try to connect ***"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    iget-object v0, p0, Lo/agm;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agm;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_myfitnesspal_login:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 160
    iget-object v0, p0, Lo/agm;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->ic_bluetooth_connected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 162
    invoke-direct {p0}, Lo/agm;->o()V

    .line 163
    return-void
.end method

.method static synthetic h(Lo/agm;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lo/agm;->i()V

    return-void
.end method

.method private declared-synchronized i()V
    .locals 5

    monitor-enter p0

    .line 270
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Body fat scales to remove user data timeout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/agm;->a(Z)V

    .line 272
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/agm;->a(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 273
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lo/agm;->a(ZZ)Z

    .line 274
    iget-object v0, p0, Lo/agm;->n:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 276
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method static synthetic i(Lo/agm;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lo/agm;->n()V

    return-void
.end method

.method private k()V
    .locals 4

    .line 220
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send clear user data command"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lo/agm;->a(ZZ)Z

    .line 222
    invoke-direct {p0}, Lo/agm;->f()V

    .line 223
    new-instance v0, Lo/ahi$a;

    const-string v1, "weight_device_clear_user_data"

    invoke-direct {v0, v1}, Lo/ahi$a;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lo/ahi;->e(Lo/ahi$a;)V

    .line 224
    return-void
.end method

.method static synthetic k(Lo/agm;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lo/agm;->k()V

    return-void
.end method

.method static synthetic l(Lo/agm;)Landroid/app/Dialog;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/agm;->k:Landroid/app/Dialog;

    return-object v0
.end method

.method private l()Z
    .locals 5

    .line 550
    :try_start_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->enable()Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 551
    :catch_0
    move-exception v4

    .line 552
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "user choose open BT error :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 554
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic m(Lo/agm;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lo/agm;->p()V

    return-void
.end method

.method private m()Z
    .locals 6

    .line 313
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v4

    .line 314
    if-eqz v4, :cond_1

    .line 316
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v5

    .line 317
    if-eqz v5, :cond_0

    .line 318
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bluetooth is open"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    const/4 v0, 0x1

    return v0

    .line 321
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bluetooth is close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    goto :goto_0

    .line 324
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bluetooth is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private n()V
    .locals 5

    .line 559
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 560
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 561
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->gj:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 562
    return-void
.end method

.method static synthetic n(Lo/agm;)Z
    .locals 1

    .line 55
    invoke-direct {p0}, Lo/agm;->l()Z

    move-result v0

    return v0
.end method

.method private declared-synchronized o()V
    .locals 5

    monitor-enter p0

    .line 460
    :try_start_0
    iget-object v0, p0, Lo/agm;->f:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 461
    iget-object v0, p0, Lo/agm;->f:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 462
    const/4 v0, 0x0

    iput-object v0, p0, Lo/agm;->f:Ljava/util/Timer;

    .line 463
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cancel the timer connected devices"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 465
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Connection timer has been canceled"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 467
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method static synthetic o(Lo/agm;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lo/agm;->o()V

    return-void
.end method

.method private declared-synchronized p()V
    .locals 7

    monitor-enter p0

    .line 473
    :try_start_0
    iget-object v0, p0, Lo/agm;->f:Ljava/util/Timer;

    if-nez v0, :cond_0

    .line 474
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lo/agm;->f:Ljava/util/Timer;

    .line 475
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Start the timer connected devices"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 476
    iget-object v0, p0, Lo/agm;->f:Ljava/util/Timer;

    new-instance v1, Lo/agm$c;

    invoke-direct {v1, p0}, Lo/agm$c;-><init>(Lo/agm;)V

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1388

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 478
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v6

    monitor-exit p0

    throw v6
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 293
    iget-boolean v0, p0, Lo/agm;->h:Z

    if-nez v0, :cond_0

    .line 294
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 295
    const-string v0, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 296
    new-instance v0, Lo/agm$a;

    invoke-direct {v0, p0}, Lo/agm$a;-><init>(Lo/agm;)V

    iput-object v0, p0, Lo/agm;->i:Lo/agm$a;

    .line 297
    iget-object v0, p0, Lo/agm;->a:Landroid/app/Activity;

    iget-object v1, p0, Lo/agm;->i:Lo/agm$a;

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 298
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/agm;->h:Z

    .line 300
    :cond_0
    invoke-direct {p0}, Lo/agm;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 302
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/agm;->d(Z)V

    goto :goto_0

    .line 304
    :cond_1
    invoke-direct {p0}, Lo/agm;->p()V

    .line 306
    :goto_0
    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 3

    .line 140
    sget v0, Lcom/huawei/plugindevice/R$id;->battery_image:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/agm;->b:Landroid/widget/ImageView;

    .line 141
    sget v0, Lcom/huawei/plugindevice/R$id;->weight_battery_level_text:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/agm;->d:Landroid/widget/TextView;

    .line 142
    iget-object v0, p0, Lo/agm;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agm;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_myfitnesspal_logout:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    iget-object v0, p0, Lo/agm;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->ic_bluetooth_connected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 144
    sget v0, Lcom/huawei/plugindevice/R$id;->card_heart_rate_view_parent:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 145
    new-instance v0, Lo/agm$d;

    invoke-direct {v0, p0}, Lo/agm$d;-><init>(Lo/agm;)V

    iput-object v0, p0, Lo/agm;->n:Landroid/os/Handler;

    .line 146
    return-void
.end method

.method public c()V
    .locals 8

    .line 370
    iget-object v0, p0, Lo/agm;->c:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 371
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lo/agm;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v3

    .line 372
    if-eqz v3, :cond_0

    .line 373
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lo/agm;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v4

    .line 374
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/afd;->a(Ljava/lang/String;)Lo/afx;

    move-result-object v5

    .line 375
    invoke-virtual {v5}, Lo/afx;->e()Lo/afv;

    move-result-object v6

    .line 376
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 377
    const-string v0, "type"

    const/4 v1, -0x6

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 378
    const-string v0, "productId"

    iget-object v1, p0, Lo/agm;->c:Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 379
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 380
    const/4 v0, 0x0

    invoke-virtual {v6, v3, v0, v7}, Lo/afv;->a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z

    .line 384
    :cond_0
    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v0

    iget-object v1, p0, Lo/agm;->e:Lo/abx;

    invoke-virtual {v0, v1}, Lo/adn;->b(Lo/abx;)V

    .line 385
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lo/agm;->c:Ljava/lang/String;

    const/4 v2, -0x6

    invoke-virtual {v0, v1, v2}, Lo/afd;->e(Ljava/lang/String;I)V

    .line 386
    invoke-virtual {p0}, Lo/agm;->e()V

    .line 387
    return-void
.end method

.method public d()Z
    .locals 1

    .line 566
    iget-boolean v0, p0, Lo/agm;->m:Z

    return v0
.end method

.method public e()V
    .locals 2

    .line 391
    iget-boolean v0, p0, Lo/agm;->h:Z

    if-eqz v0, :cond_0

    .line 392
    iget-object v0, p0, Lo/agm;->a:Landroid/app/Activity;

    iget-object v1, p0, Lo/agm;->i:Lo/agm$a;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 393
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/agm;->h:Z

    .line 395
    :cond_0
    invoke-direct {p0}, Lo/agm;->o()V

    .line 396
    return-void
.end method

.method public e(ILjava/lang/Object;)V
    .locals 3

    .line 167
    const/4 v0, 0x5

    if-ne v0, p1, :cond_2

    .line 168
    invoke-direct {p0}, Lo/agm;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 169
    iget-boolean v0, p0, Lo/agm;->m:Z

    if-eqz v0, :cond_0

    .line 170
    invoke-direct {p0}, Lo/agm;->g()V

    goto :goto_0

    .line 172
    :cond_0
    iget-object v0, p0, Lo/agm;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_plugin_device_weight_device_not_connect:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    goto :goto_0

    .line 175
    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/agm;->d(I)V

    goto :goto_0

    .line 177
    :cond_2
    const/4 v0, 0x6

    if-ne v0, p1, :cond_4

    .line 178
    iget-boolean v0, p0, Lo/agm;->m:Z

    if-eqz v0, :cond_3

    .line 179
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 180
    const-string v0, "productId"

    iget-object v1, p0, Lo/agm;->c:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 181
    const-string v0, "com.huawei.health"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 182
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.device.activity.update.WeightUpdateVersionActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 183
    iget-object v0, p0, Lo/agm;->a:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 184
    goto :goto_0

    .line 185
    :cond_3
    iget-object v0, p0, Lo/agm;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_plugin_device_weight_device_not_connect:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 189
    :cond_4
    :goto_0
    return-void
.end method

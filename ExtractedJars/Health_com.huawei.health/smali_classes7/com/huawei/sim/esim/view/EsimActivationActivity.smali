.class public Lcom/huawei/sim/esim/view/EsimActivationActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Landroid/view/View;

.field private c:Landroid/view/View;

.field private d:Landroid/view/View;

.field private e:Lo/egd;

.field private f:Lo/ecx;

.field private g:Landroid/view/View;

.field private h:Z

.field private i:Landroid/view/View;

.field private k:Landroid/widget/ImageView;

.field private l:Landroid/widget/TextView;

.field private m:Lo/emr;

.field private n:Landroid/widget/ImageView;

.field private o:Landroid/widget/ImageView;

.field private p:Landroid/content/Context;

.field private s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private u:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 50
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->a:I

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->h:Z

    .line 225
    new-instance v0, Lcom/huawei/sim/esim/view/EsimActivationActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/EsimActivationActivity$2;-><init>(Lcom/huawei/sim/esim/view/EsimActivationActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 281
    new-instance v0, Lcom/huawei/sim/esim/view/EsimActivationActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/EsimActivationActivity$5;-><init>(Lcom/huawei/sim/esim/view/EsimActivationActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->u:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 2

    .line 250
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 251
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->b:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 252
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->g:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 253
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->e:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 256
    return-void
.end method

.method static synthetic a(Lcom/huawei/sim/esim/view/EsimActivationActivity;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->e()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/sim/esim/view/EsimActivationActivity;)Landroid/os/Handler;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->u:Landroid/os/Handler;

    return-object v0
.end method

.method private b()V
    .locals 3

    .line 266
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 267
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 268
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->b:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 269
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->e:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 270
    sget v0, Lcom/huawei/sim/R$anim;->bt_connecting:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v2

    .line 272
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 277
    return-void
.end method

.method private c()V
    .locals 7

    .line 79
    sget v0, Lcom/huawei/sim/R$id;->permission_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->b:Landroid/view/View;

    .line 80
    sget v0, Lcom/huawei/sim/R$id;->set_permission_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->c:Landroid/view/View;

    .line 81
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->c:Landroid/view/View;

    new-instance v1, Lcom/huawei/sim/esim/view/EsimActivationActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/EsimActivationActivity$3;-><init>(Lcom/huawei/sim/esim/view/EsimActivationActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    sget v0, Lcom/huawei/sim/R$id;->wirless_manager_title_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->m:Lo/emr;

    .line 89
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->m:Lo/emr;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Lo/emr;->setTitleSize(F)V

    .line 94
    :cond_0
    sget v0, Lcom/huawei/sim/R$id;->open_esim_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->e:Lo/egd;

    .line 96
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->e:Lo/egd;

    new-instance v1, Lcom/huawei/sim/esim/view/EsimActivationActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/EsimActivationActivity$1;-><init>(Lcom/huawei/sim/esim/view/EsimActivationActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 109
    sget v0, Lcom/huawei/sim/R$id;->bt_disconnect:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->g:Landroid/view/View;

    .line 110
    sget v0, Lcom/huawei/sim/R$id;->set_bt_reconnect:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->d:Landroid/view/View;

    .line 111
    const-string v0, "EsimActivationActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mSetBtReconnect.setOnClickListener"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->d:Landroid/view/View;

    new-instance v1, Lcom/huawei/sim/esim/view/EsimActivationActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/EsimActivationActivity$4;-><init>(Lcom/huawei/sim/esim/view/EsimActivationActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 125
    sget v0, Lcom/huawei/sim/R$id;->bt_connecting:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->i:Landroid/view/View;

    .line 126
    sget v0, Lcom/huawei/sim/R$id;->bt_connecting_imgage:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->k:Landroid/widget/ImageView;

    .line 128
    sget v0, Lcom/huawei/sim/R$id;->launch_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->l:Landroid/widget/TextView;

    .line 129
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->l:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_sim_open_tip_list:I

    invoke-virtual {p0, v1}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const-wide/high16 v3, 0x403e000000000000L    # 30.0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    sget v0, Lcom/huawei/sim/R$id;->bt_reconnect_set_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->n:Landroid/widget/ImageView;

    .line 131
    sget v0, Lcom/huawei/sim/R$id;->permission_set_imgage:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->o:Landroid/widget/ImageView;

    .line 133
    invoke-static {p0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 134
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_direction_left_black_tip_image:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 135
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->o:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_direction_left_black_tip_image:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 138
    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/sim/esim/view/EsimActivationActivity;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->a()V

    return-void
.end method

.method private d()V
    .locals 2

    .line 259
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 260
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 262
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->f()V

    .line 263
    return-void
.end method

.method static synthetic d(Lcom/huawei/sim/esim/view/EsimActivationActivity;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->d()V

    return-void
.end method

.method private e()V
    .locals 5

    .line 215
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 216
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "package:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 217
    invoke-virtual {p0, v4}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->startActivity(Landroid/content/Intent;)V

    .line 218
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->h:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 222
    goto :goto_0

    .line 219
    :catch_0
    move-exception v4

    .line 220
    const-string v0, "EsimActivationActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAppSettings failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->h:Z

    .line 223
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/sim/esim/view/EsimActivationActivity;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->b()V

    return-void
.end method

.method private f()V
    .locals 4

    .line 307
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->f:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 308
    const-string v0, "EsimActivationActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == pluginSimAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->a:I

    goto :goto_0

    .line 312
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->f:Lo/ecx;

    invoke-interface {v0}, Lo/ecx;->a()I

    move-result v0

    iput v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->a:I

    .line 314
    :goto_0
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->a:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 315
    iget-boolean v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->h:Z

    if-eqz v0, :cond_1

    .line 316
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->b:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 317
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->e:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    goto :goto_1

    .line 321
    :cond_1
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->b:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 322
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->e:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 327
    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 64
    const-string v0, "EsimActivationActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EsimActivationActivity enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 66
    sget v0, Lcom/huawei/sim/R$layout;->layout_activate_esim:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->setContentView(I)V

    .line 67
    iput-object p0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->p:Landroid/content/Context;

    .line 68
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->c()V

    .line 69
    invoke-static {p0}, Lo/ecy;->c(Landroid/content/Context;)Lo/ecy;

    move-result-object v0

    invoke-virtual {v0}, Lo/ecy;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lo/ecx;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->f:Lo/ecx;

    .line 70
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->f:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 71
    const-string v0, "EsimActivationActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == pluginSimAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    return-void

    .line 74
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->f:Lo/ecx;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Lo/ecx;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 75
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->f:Lo/ecx;

    invoke-interface {v0}, Lo/ecx;->a()I

    move-result v0

    iput v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->a:I

    .line 76
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 174
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 175
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->f:Lo/ecx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 176
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->f:Lo/ecx;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Lo/ecx;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 178
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->h:Z

    .line 179
    return-void
.end method

.method public onPause()V
    .locals 0

    .line 169
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 170
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 6

    .line 194
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 195
    const/4 v0, 0x0

    :try_start_0
    aget v0, p3, v0

    if-nez v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 196
    :goto_0
    if-eqz v4, :cond_1

    .line 197
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 198
    invoke-virtual {p0, v5}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->startActivity(Landroid/content/Intent;)V

    .line 199
    goto :goto_1

    .line 201
    :cond_1
    const-string v0, "android.permission.CAMERA"

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 202
    const-string v0, "EsimActivationActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "#############"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->h:Z

    .line 204
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->f()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 210
    :cond_2
    :goto_1
    goto :goto_2

    .line 208
    :catch_0
    move-exception v4

    .line 209
    const-string v0, "EsimActivationActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "exception "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    :goto_2
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 142
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 143
    const-string v0, "EsimActivationActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->f:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 145
    const-string v0, "EsimActivationActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pluginSimAdapter == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->a:I

    goto :goto_0

    .line 149
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->f:Lo/ecx;

    invoke-interface {v0}, Lo/ecx;->a()I

    move-result v0

    iput v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->a:I

    .line 151
    :goto_0
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->a:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 152
    const-string v0, "EsimActivationActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "btConnectView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->d()V

    goto :goto_1

    .line 155
    :cond_1
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimActivationActivity;->a:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 156
    const-string v0, "EsimActivationActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "btConnectingView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->b()V

    goto :goto_1

    .line 160
    :cond_2
    const-string v0, "EsimActivationActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "btDisconnectView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimActivationActivity;->a()V

    .line 165
    :goto_1
    return-void
.end method

.method public onStart()V
    .locals 0

    .line 183
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStart()V

    .line 184
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 188
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStop()V

    .line 189
    return-void
.end method

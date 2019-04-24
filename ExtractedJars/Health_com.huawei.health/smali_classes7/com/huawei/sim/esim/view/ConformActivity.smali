.class public Lcom/huawei/sim/esim/view/ConformActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Lo/eha;

.field private c:Ljava/lang/String;

.field d:Landroid/text/TextWatcher;

.field private e:Lo/egn;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/view/View;

.field private i:Landroid/widget/ImageView;

.field private k:I

.field private l:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private m:Lo/emr;

.field private n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private o:Lo/ecx;

.field private p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private q:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->e:Lo/egn;

    .line 211
    new-instance v0, Lcom/huawei/sim/esim/view/ConformActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/ConformActivity$2;-><init>(Lcom/huawei/sim/esim/view/ConformActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->l:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 272
    new-instance v0, Lcom/huawei/sim/esim/view/ConformActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/ConformActivity$5;-><init>(Lcom/huawei/sim/esim/view/ConformActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 281
    new-instance v0, Lcom/huawei/sim/esim/view/ConformActivity$7;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/ConformActivity$7;-><init>(Lcom/huawei/sim/esim/view/ConformActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->d:Landroid/text/TextWatcher;

    .line 382
    new-instance v0, Lcom/huawei/sim/esim/view/ConformActivity$9;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/ConformActivity$9;-><init>(Lcom/huawei/sim/esim/view/ConformActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 395
    new-instance v0, Lcom/huawei/sim/esim/view/ConformActivity$8;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/ConformActivity$8;-><init>(Lcom/huawei/sim/esim/view/ConformActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->q:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/sim/esim/view/ConformActivity;)Lo/eha;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->b:Lo/eha;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/sim/esim/view/ConformActivity;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->l:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private b()V
    .locals 2

    .line 72
    sget v0, Lcom/huawei/sim/R$id;->conform_invilid_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/ConformActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->a:Landroid/widget/TextView;

    .line 73
    sget v0, Lcom/huawei/sim/R$id;->conform_code:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/ConformActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eha;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->b:Lo/eha;

    .line 75
    sget v0, Lcom/huawei/sim/R$id;->wirless_manager_title_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/ConformActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->m:Lo/emr;

    .line 76
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->m:Lo/emr;

    new-instance v1, Lcom/huawei/sim/esim/view/ConformActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/ConformActivity$1;-><init>(Lcom/huawei/sim/esim/view/ConformActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    sget v0, Lcom/huawei/sim/R$id;->back_button_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/ConformActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->h:Landroid/view/View;

    .line 88
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->h:Landroid/view/View;

    new-instance v1, Lcom/huawei/sim/esim/view/ConformActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/ConformActivity$4;-><init>(Lcom/huawei/sim/esim/view/ConformActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    sget v0, Lcom/huawei/sim/R$id;->next_button_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/ConformActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->g:Landroid/widget/TextView;

    .line 99
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->g:Landroid/widget/TextView;

    new-instance v1, Lcom/huawei/sim/esim/view/ConformActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/ConformActivity$3;-><init>(Lcom/huawei/sim/esim/view/ConformActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 123
    sget v0, Lcom/huawei/sim/R$id;->next_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/ConformActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->i:Landroid/widget/ImageView;

    .line 124
    sget v0, Lcom/huawei/sim/R$id;->back_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/ConformActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->f:Landroid/widget/ImageView;

    .line 125
    invoke-static {p0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_back_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 127
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->f:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_next_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 129
    :cond_0
    return-void
.end method

.method private b(I)V
    .locals 5

    .line 266
    const-string v0, "ConformActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the error code is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 268
    const-string v0, "conform_error"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 269
    invoke-virtual {p0, v4}, Lcom/huawei/sim/esim/view/ConformActivity;->startActivity(Landroid/content/Intent;)V

    .line 270
    return-void
.end method

.method static synthetic b(Lcom/huawei/sim/esim/view/ConformActivity;I)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/huawei/sim/esim/view/ConformActivity;->e(I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/sim/esim/view/ConformActivity;)Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/sim/esim/view/ConformActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/huawei/sim/esim/view/ConformActivity;->c:Ljava/lang/String;

    return-object p1
.end method

.method private c()V
    .locals 4

    .line 371
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/ConformActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 372
    return-void

    .line 374
    :cond_0
    const-string v0, "ConformActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter dismissLoadingDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->e:Lo/egn;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->e:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 376
    const-string v0, "ConformActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dismissLoadingDialog()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->e:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 378
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->e:Lo/egn;

    .line 380
    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/sim/esim/view/ConformActivity;I)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/huawei/sim/esim/view/ConformActivity;->b(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/sim/esim/view/ConformActivity;I)I
    .locals 0

    .line 33
    iput p1, p0, Lcom/huawei/sim/esim/view/ConformActivity;->k:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/sim/esim/view/ConformActivity;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/sim/esim/view/ConformActivity;)Lo/ecx;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->o:Lo/ecx;

    return-object v0
.end method

.method private e()V
    .locals 3

    .line 448
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 449
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->a:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_conform_code_auth_error_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 450
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->b:Lo/eha;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_edit_input_error:I

    invoke-virtual {v0, v1}, Lo/eha;->setBackgroundResource(I)V

    .line 451
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 452
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/ConformActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$color;->IDS_plugin_sim_ext_back_color_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 453
    invoke-static {p0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 454
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_back_arrow_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 457
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_next_arrow_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 459
    :goto_0
    return-void
.end method

.method private e(I)V
    .locals 4

    .line 348
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->e:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 349
    const-string v0, "ConformActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingUserInformationDialog is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    new-instance v0, Lo/egn;

    sget v1, Lcom/huawei/sim/R$style;->common_dialog21:I

    invoke-direct {v0, p0, v1}, Lo/egn;-><init>(Landroid/content/Context;I)V

    invoke-static {p0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->e:Lo/egn;

    .line 351
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->e:Lo/egn;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/ConformActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 352
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->e:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    goto :goto_0

    .line 355
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->e:Lo/egn;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/ConformActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 359
    :goto_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->e:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 360
    const-string v0, "ConformActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingUserInformationDialog  show"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    return-void
.end method

.method static synthetic f(Lcom/huawei/sim/esim/view/ConformActivity;)Landroid/widget/TextView;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->a:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/sim/esim/view/ConformActivity;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/ConformActivity;->e()V

    return-void
.end method

.method static synthetic h(Lcom/huawei/sim/esim/view/ConformActivity;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/ConformActivity;->c()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/sim/esim/view/ConformActivity;)Landroid/os/Handler;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->q:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/sim/esim/view/ConformActivity;)Lo/egn;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->e:Lo/egn;

    return-object v0
.end method

.method static synthetic n(Lcom/huawei/sim/esim/view/ConformActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->i:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/sim/esim/view/ConformActivity;)Landroid/widget/TextView;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->g:Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 416
    const-string v0, "ConformActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestCode "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " resultCode "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 418
    const/4 v0, 0x1

    if-ne v0, p2, :cond_3

    const/4 v0, 0x0

    if-eq v0, p3, :cond_3

    .line 419
    const-string v0, "conform_report"

    const/4 v1, 0x1

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->k:I

    .line 420
    iget v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->k:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 421
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 422
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/ConformActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$color;->IDS_plugin_sim_ext_back_color_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 423
    invoke-static {p0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 424
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_back_arrow_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 427
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_next_arrow_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 429
    :goto_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->b:Lo/eha;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_edit_input_error:I

    invoke-virtual {v0, v1}, Lo/eha;->setBackgroundResource(I)V

    .line 430
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 431
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->a:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_conform_code_auth_error_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_2

    .line 433
    :cond_1
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->g:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 434
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/ConformActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$color;->IDS_plugin_sim_next_back_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 435
    invoke-static {p0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 436
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_back_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 439
    :cond_2
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_next_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 441
    :goto_1
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->a:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 442
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->b:Lo/eha;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_edit_input:I

    invoke-virtual {v0, v1}, Lo/eha;->setBackgroundResource(I)V

    .line 445
    :cond_3
    :goto_2
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 55
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 56
    sget v0, Lcom/huawei/sim/R$layout;->activity_conform:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/ConformActivity;->setContentView(I)V

    .line 57
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/ConformActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 58
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 59
    const-string v0, "conform_code"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->c:Ljava/lang/String;

    .line 62
    :cond_0
    invoke-static {p0}, Lo/ecy;->c(Landroid/content/Context;)Lo/ecy;

    move-result-object v0

    invoke-virtual {v0}, Lo/ecy;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lo/ecx;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->o:Lo/ecx;

    .line 63
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->o:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 64
    const-string v0, "ConformActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHWDeviceConfigManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    return-void

    .line 67
    :cond_1
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/ConformActivity;->b()V

    .line 68
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->o:Lo/ecx;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/ConformActivity;->n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Lo/ecx;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 69
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 190
    const-string v0, "ConformActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/ConformActivity;->c()V

    .line 192
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 193
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->o:Lo/ecx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 194
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->o:Lo/ecx;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/ConformActivity;->n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Lo/ecx;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 196
    :cond_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 6

    .line 463
    const-string v0, "ConformActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ConformActivity onKeyDown"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 466
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->o:Lo/ecx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 467
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->o:Lo/ecx;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/ConformActivity;->p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lo/ecx;->b(Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 469
    :cond_0
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 470
    invoke-virtual {p0, v5}, Lcom/huawei/sim/esim/view/ConformActivity;->startActivity(Landroid/content/Intent;)V

    .line 471
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/ConformActivity;->finish()V

    .line 473
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/commonui/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onPause()V
    .locals 0

    .line 185
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 186
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 132
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 133
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->o:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 134
    const-string v0, "ConformActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume mHWDeviceConfigManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    return-void

    .line 137
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->b:Lo/eha;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/ConformActivity;->d:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Lo/eha;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 138
    const-string v0, "ConformActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResume conformcode "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/esim/view/ConformActivity;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->c:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 140
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->b:Lo/eha;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/ConformActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eha;->setText(Ljava/lang/CharSequence;)V

    .line 141
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->b:Lo/eha;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/ConformActivity;->b:Lo/eha;

    invoke-virtual {v1}, Lo/eha;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eha;->setSelection(I)V

    .line 144
    :cond_1
    const-string v0, "ConformActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CharSequence "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/sim/esim/view/ConformActivity;->k:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    iget v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->k:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 146
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 147
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/ConformActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$color;->IDS_plugin_sim_ext_back_color_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 148
    invoke-static {p0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 149
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_back_arrow_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 152
    :cond_2
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_next_arrow_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 154
    :goto_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->b:Lo/eha;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_edit_input_error:I

    invoke-virtual {v0, v1}, Lo/eha;->setBackgroundResource(I)V

    .line 155
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 156
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->a:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_conform_code_auth_error_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_2

    .line 158
    :cond_3
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->b:Lo/eha;

    invoke-virtual {v0}, Lo/eha;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 159
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 160
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/ConformActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$color;->IDS_plugin_sim_ext_back_color_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 161
    invoke-static {p0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 162
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_back_arrow_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 165
    :cond_4
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_next_arrow_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 169
    :cond_5
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->g:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 170
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/ConformActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$color;->IDS_plugin_sim_next_back_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 171
    invoke-static {p0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 172
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_back_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 175
    :cond_6
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_next_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 178
    :goto_1
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->a:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 179
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity;->b:Lo/eha;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_edit_input:I

    invoke-virtual {v0, v1}, Lo/eha;->setBackgroundResource(I)V

    .line 181
    :goto_2
    return-void
.end method

.method public onStart()V
    .locals 0

    .line 200
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStart()V

    .line 201
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 206
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStop()V

    .line 207
    return-void
.end method

.class public Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/Button;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/Button;

.field private d:Landroid/view/View;

.field private e:Lo/emr;

.field private f:I

.field private g:Landroid/widget/ImageView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/ImageView;

.field private k:Ljava/lang/String;

.field private l:Landroid/view/View;

.field private m:Lo/ecx;

.field private n:Landroid/view/View;

.field private o:Landroid/widget/ImageView;

.field private p:Landroid/widget/ImageView;

.field private q:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private r:Lo/egn;

.field private s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private t:Ljava/lang/String;

.field private u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private v:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 41
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->f:I

    .line 175
    new-instance v0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;-><init>(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 222
    new-instance v0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$1;-><init>(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 230
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->r:Lo/egn;

    .line 320
    new-instance v0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$4;-><init>(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->q:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 345
    new-instance v0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$3;-><init>(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->v:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 4

    .line 260
    const-string v0, "ConformReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter dismissLoadingDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 262
    return-void

    .line 264
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->r:Lo/egn;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->r:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 265
    const-string v0, "ConformReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dismissLoadingDialog()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->r:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 267
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->r:Lo/egn;

    .line 269
    :cond_1
    return-void
.end method

.method private a(I)V
    .locals 5

    .line 215
    const-string v0, "ConformReportActivity"

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

    .line 216
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 217
    const-string v0, "conform_error"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 218
    invoke-virtual {p0, v4}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->startActivity(Landroid/content/Intent;)V

    .line 219
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->finish()V

    .line 220
    return-void
.end method

.method static synthetic a(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->e()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->c()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->t:Ljava/lang/String;

    return-object p1
.end method

.method private c()V
    .locals 3

    .line 272
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->l:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 273
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->n:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 274
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->a:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 275
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 276
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->b:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_conform_fail_tips:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 277
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->g:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 278
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->h:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 279
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 280
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->a:Landroid/widget/Button;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_btn_two_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 281
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->a:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$color;->IDS_plugin_sim_ext_back_color_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 282
    return-void
.end method

.method private c(I)V
    .locals 4

    .line 238
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->r:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 239
    new-instance v0, Lo/egn;

    sget v1, Lcom/huawei/sim/R$style;->common_dialog21:I

    invoke-direct {v0, p0, v1}, Lo/egn;-><init>(Landroid/content/Context;I)V

    invoke-static {p0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->r:Lo/egn;

    .line 240
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->r:Lo/egn;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 241
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->r:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    goto :goto_0

    .line 244
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->r:Lo/egn;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 248
    :goto_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->r:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 249
    const-string v0, "ConformReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingUserInformationDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    return-void
.end method

.method static synthetic c(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->a()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;I)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->a(I)V

    return-void
.end method

.method private d()V
    .locals 3

    .line 285
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->l:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 286
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->n:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 287
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->a:Landroid/widget/Button;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 288
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->t:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, "network_failed"

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->t:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 289
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 290
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->b:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_esim_conform_network_failed_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 291
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->g:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 292
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->h:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 293
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 295
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->b:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 296
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->g:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 297
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->h:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 298
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->i:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 300
    :goto_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->a:Landroid/widget/Button;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_btn_two:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 301
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->a:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$color;->IDS_plugin_sim_next_back_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 302
    return-void
.end method

.method static synthetic d(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->d()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)Landroid/os/Handler;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->v:Landroid/os/Handler;

    return-object v0
.end method

.method private e()V
    .locals 4

    .line 305
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->l:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 306
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->n:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 307
    sget v0, Lcom/huawei/sim/R$anim;->bt_connecting:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v3

    .line 309
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 310
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 311
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->b:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_conform_fail_tips:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 312
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->g:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 313
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->h:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 314
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 315
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->a:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 316
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->a:Landroid/widget/Button;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_btn_two_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 317
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->a:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$color;->IDS_plugin_sim_ext_back_color_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 318
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 155
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/sim/R$id;->esim_profile_cancel:I

    if-ne v0, v1, :cond_0

    .line 156
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 157
    invoke-virtual {p0, v5}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->startActivity(Landroid/content/Intent;)V

    .line 158
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->finish()V

    .line 159
    goto :goto_0

    .line 160
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/sim/R$id;->esim_profile_retry:I

    if-ne v0, v1, :cond_2

    .line 162
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->m:Lo/ecx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 163
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_conform_code_auth:I

    invoke-direct {p0, v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->c(I)V

    .line 164
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->m:Lo/ecx;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->k:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iget-object v3, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v4, 0x0

    invoke-interface {v0, v1, v4, v2, v3}, Lo/ecx;->b(Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 167
    :cond_1
    const-string v0, "ConformReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == pluginSimAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    :cond_2
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 54
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 55
    sget v0, Lcom/huawei/sim/R$layout;->activity_conform_bt_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->setContentView(I)V

    .line 56
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 57
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 58
    return-void

    .line 60
    :cond_0
    const-string v0, "conform_error"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->t:Ljava/lang/String;

    .line 61
    const-string v0, "ConformReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mErrorCode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->t:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    const-string v0, "conform_code"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->k:Ljava/lang/String;

    .line 63
    sget v0, Lcom/huawei/sim/R$id;->esim_profile_cancel:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->c:Landroid/widget/Button;

    .line 64
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->c:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    sget v0, Lcom/huawei/sim/R$id;->esim_profile_retry:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->a:Landroid/widget/Button;

    .line 66
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->a:Landroid/widget/Button;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_button_retry:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 67
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->a:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 68
    sget v0, Lcom/huawei/sim/R$id;->profile_BT_fail_title_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->e:Lo/emr;

    .line 69
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->e:Lo/emr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonClickable(Z)V

    .line 72
    sget v0, Lcom/huawei/sim/R$id;->esim_failed_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->b:Landroid/widget/TextView;

    .line 73
    sget v0, Lcom/huawei/sim/R$id;->esim_success_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->h:Landroid/widget/TextView;

    .line 76
    sget v0, Lcom/huawei/sim/R$id;->esim_status_success_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->i:Landroid/widget/ImageView;

    .line 77
    sget v0, Lcom/huawei/sim/R$id;->esim_status_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->g:Landroid/widget/ImageView;

    .line 78
    sget v0, Lcom/huawei/sim/R$id;->bt_disconnect:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->n:Landroid/view/View;

    .line 79
    sget v0, Lcom/huawei/sim/R$id;->set_bt_reconnect:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->d:Landroid/view/View;

    .line 80
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->d:Landroid/view/View;

    new-instance v1, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$2;-><init>(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    sget v0, Lcom/huawei/sim/R$id;->bt_reconnect_set_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->p:Landroid/widget/ImageView;

    .line 93
    invoke-static {p0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->p:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_direction_left_black_tip_image:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 96
    :cond_1
    sget v0, Lcom/huawei/sim/R$id;->bt_connecting_imgage:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->o:Landroid/widget/ImageView;

    .line 97
    sget v0, Lcom/huawei/sim/R$id;->bt_connecting:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->l:Landroid/view/View;

    .line 99
    invoke-static {p0}, Lo/ecy;->c(Landroid/content/Context;)Lo/ecy;

    move-result-object v0

    invoke-virtual {v0}, Lo/ecy;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lo/ecx;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->m:Lo/ecx;

    .line 100
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->m:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 101
    const-string v0, "ConformReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == pluginSimAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    return-void

    .line 104
    :cond_2
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->m:Lo/ecx;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->q:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Lo/ecx;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 105
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 135
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->a()V

    .line 136
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 137
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->m:Lo/ecx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 138
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->m:Lo/ecx;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->q:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Lo/ecx;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 141
    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 0

    .line 130
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 131
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 109
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 110
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->m:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 111
    const-string v0, "ConformReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == pluginSimAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->f:I

    goto :goto_0

    .line 115
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->m:Lo/ecx;

    invoke-interface {v0}, Lo/ecx;->a()I

    move-result v0

    iput v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->f:I

    .line 117
    :goto_0
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->f:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 118
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->d()V

    goto :goto_1

    .line 120
    :cond_1
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->f:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 121
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->e()V

    goto :goto_1

    .line 124
    :cond_2
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->c()V

    .line 126
    :goto_1
    return-void
.end method

.method public onStart()V
    .locals 0

    .line 145
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStart()V

    .line 146
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 150
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStop()V

    .line 151
    return-void
.end method

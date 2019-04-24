.class public Lo/agn;
.super Lo/ago;
.source "SourceFile"


# static fields
.field private static e:I

.field private static g:I


# instance fields
.field a:Landroid/os/Handler;

.field private b:Z

.field private c:I

.field d:Ljava/lang/Runnable;

.field private final f:Ljava/lang/String;

.field private h:Landroid/content/Context;

.field private i:I

.field private final k:Landroid/view/View;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/ImageView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/graphics/drawable/AnimationDrawable;

.field private q:Landroid/view/View;

.field private t:Lo/agp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 72
    const/4 v0, -0x4

    sput v0, Lo/agn;->e:I

    .line 73
    const/16 v0, 0x14

    sput v0, Lo/agn;->g:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;Lo/agp;)V
    .locals 2

    .line 87
    invoke-direct {p0}, Lo/ago;-><init>()V

    .line 59
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/agn;->b:Z

    .line 67
    const/4 v0, 0x0

    iput v0, p0, Lo/agn;->c:I

    .line 76
    const/4 v0, 0x0

    iput v0, p0, Lo/agn;->i:I

    .line 122
    new-instance v0, Lo/agn$5;

    invoke-direct {v0, p0}, Lo/agn$5;-><init>(Lo/agn;)V

    iput-object v0, p0, Lo/agn;->a:Landroid/os/Handler;

    .line 222
    new-instance v0, Lo/agn$2;

    invoke-direct {v0, p0}, Lo/agn$2;-><init>(Lo/agn;)V

    iput-object v0, p0, Lo/agn;->d:Ljava/lang/Runnable;

    .line 88
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/agn;->b:Z

    .line 89
    iput-object p1, p0, Lo/agn;->h:Landroid/content/Context;

    .line 90
    iput-object p2, p0, Lo/agn;->k:Landroid/view/View;

    .line 91
    iput-object p3, p0, Lo/agn;->f:Ljava/lang/String;

    .line 92
    iget-object v0, p0, Lo/agn;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$drawable;->heart_rate_measuring:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lo/agn;->p:Landroid/graphics/drawable/AnimationDrawable;

    .line 93
    iput-object p4, p0, Lo/agn;->t:Lo/agp;

    .line 94
    invoke-direct {p0}, Lo/agn;->h()V

    .line 95
    invoke-direct {p0}, Lo/agn;->g()V

    .line 96
    invoke-direct {p0}, Lo/agn;->i()V

    .line 97
    return-void
.end method

.method private a(I)V
    .locals 3

    .line 483
    const v0, 0x186a0

    if-ne p1, v0, :cond_0

    .line 484
    const/4 v0, -0x2

    sput v0, Lo/agn;->e:I

    .line 485
    iget-object v0, p0, Lo/agn;->a:Landroid/os/Handler;

    iget-object v1, p0, Lo/agn;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 486
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 487
    const/16 v0, 0x3ea

    iput v0, v2, Landroid/os/Message;->what:I

    .line 488
    iget-object v0, p0, Lo/agn;->a:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 490
    :cond_0
    return-void
.end method

.method static synthetic a(Lo/agn;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lo/agn;->l()V

    return-void
.end method

.method static synthetic a(Lo/agn;I)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lo/agn;->c(I)V

    return-void
.end method

.method static synthetic b(I)I
    .locals 0

    .line 46
    sput p0, Lo/agn;->e:I

    return p0
.end method

.method static synthetic b(Lo/agn;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lo/agn;->o()V

    return-void
.end method

.method static synthetic b(Lo/agn;I)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lo/agn;->a(I)V

    return-void
.end method

.method private c(I)V
    .locals 3

    .line 253
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/agn;->b:Z

    .line 254
    iget-object v0, p0, Lo/agn;->q:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 255
    iget-object v0, p0, Lo/agn;->p:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    move-result v0

    if-nez v0, :cond_0

    .line 256
    iget-object v0, p0, Lo/agn;->m:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/agn;->p:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 257
    iget-object v0, p0, Lo/agn;->p:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 259
    :cond_0
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agn;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->common_black_90alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 260
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 261
    if-nez p1, :cond_1

    .line 262
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 264
    :cond_1
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 266
    :goto_0
    iget-object v0, p0, Lo/agn;->o:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 267
    return-void
.end method

.method static synthetic c(Lo/agn;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lo/agn;->f()V

    return-void
.end method

.method static synthetic d()I
    .locals 1

    .line 46
    sget v0, Lo/agn;->e:I

    return v0
.end method

.method static synthetic d(I)I
    .locals 0

    .line 46
    sput p0, Lo/agn;->g:I

    return p0
.end method

.method static synthetic d(Lo/agn;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lo/agn;->k()V

    return-void
.end method

.method static synthetic d(Lo/agn;I)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lo/agn;->f(I)V

    return-void
.end method

.method static synthetic e(Lo/agn;I)I
    .locals 0

    .line 46
    iput p1, p0, Lo/agn;->c:I

    return p1
.end method

.method private e(I)V
    .locals 2

    .line 521
    const v0, 0x186a0

    if-ne p1, v0, :cond_0

    .line 522
    const/4 v0, -0x4

    sput v0, Lo/agn;->e:I

    .line 523
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 524
    const/16 v0, 0x3eb

    iput v0, v1, Landroid/os/Message;->what:I

    .line 525
    iget-object v0, p0, Lo/agn;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 527
    :cond_0
    return-void
.end method

.method static synthetic e(Lo/agn;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lo/agn;->n()V

    return-void
.end method

.method private f()V
    .locals 4

    .line 204
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/agn;->b:Z

    .line 205
    const/4 v0, -0x2

    sput v0, Lo/agn;->e:I

    .line 206
    const/4 v0, 0x0

    iput v0, p0, Lo/agn;->i:I

    .line 207
    iget-object v0, p0, Lo/agn;->a:Landroid/os/Handler;

    iget-object v1, p0, Lo/agn;->d:Ljava/lang/Runnable;

    const-wide/16 v2, 0x3a98

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 208
    iget-object v0, p0, Lo/agn;->a:Landroid/os/Handler;

    iget-object v1, p0, Lo/agn;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 209
    iget-object v0, p0, Lo/agn;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agn;->h:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_myfitnesspal_login:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 210
    invoke-direct {p0}, Lo/agn;->r()V

    .line 211
    iget-object v0, p0, Lo/agn;->q:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 212
    iget-object v0, p0, Lo/agn;->p:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    move-result v0

    if-nez v0, :cond_0

    .line 213
    iget-object v0, p0, Lo/agn;->m:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/agn;->p:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 214
    iget-object v0, p0, Lo/agn;->p:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 216
    :cond_0
    iget-object v0, p0, Lo/agn;->o:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 217
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agn;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->common_black_90alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 218
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    const/high16 v1, 0x41880000    # 17.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 219
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agn;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_heart_rate_measuring_status_measuring:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    return-void
.end method

.method private f(I)V
    .locals 5

    .line 530
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/agn;->b:Z

    .line 531
    iget-object v0, p0, Lo/agn;->a:Landroid/os/Handler;

    iget-object v1, p0, Lo/agn;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 532
    iget-object v0, p0, Lo/agn;->a:Landroid/os/Handler;

    iget-object v1, p0, Lo/agn;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 533
    iget-object v0, p0, Lo/agn;->a:Landroid/os/Handler;

    iget-object v1, p0, Lo/agn;->d:Ljava/lang/Runnable;

    const-wide/16 v2, 0x3a98

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 536
    if-nez p1, :cond_0

    .line 537
    iget v0, p0, Lo/agn;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/agn;->i:I

    .line 538
    iget v0, p0, Lo/agn;->i:I

    sget v1, Lo/agn;->g:I

    if-le v0, v1, :cond_1

    .line 539
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 540
    const/16 v0, 0x3ee

    iput v0, v4, Landroid/os/Message;->what:I

    .line 541
    iget-object v0, p0, Lo/agn;->a:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 542
    return-void

    .line 545
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/agn;->i:I

    .line 546
    const/16 v0, 0xf

    sput v0, Lo/agn;->g:I

    .line 548
    :cond_1
    const-string v0, "HonourRateStatus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "heartRateStatus === "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lo/agn;->e:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 549
    if-nez p1, :cond_2

    sget v0, Lo/agn;->e:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_2

    goto :goto_0

    .line 551
    :cond_2
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 552
    const/16 v0, 0x3e8

    iput v0, v4, Landroid/os/Message;->what:I

    .line 553
    iput p1, v4, Landroid/os/Message;->arg1:I

    .line 554
    iget-object v0, p0, Lo/agn;->a:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 555
    const/4 v0, -0x3

    sput v0, Lo/agn;->e:I

    .line 558
    :goto_0
    return-void
.end method

.method static synthetic f(Lo/agn;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lo/agn;->u()V

    return-void
.end method

.method private g()V
    .locals 2

    .line 106
    iget-object v0, p0, Lo/agn;->q:Landroid/view/View;

    new-instance v1, Lo/agn$4;

    invoke-direct {v1, p0}, Lo/agn$4;-><init>(Lo/agn;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 120
    return-void
.end method

.method static synthetic g(Lo/agn;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lo/agn;->p()V

    return-void
.end method

.method static synthetic h(Lo/agn;)Landroid/widget/TextView;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/agn;->l:Landroid/widget/TextView;

    return-object v0
.end method

.method private h()V
    .locals 3

    .line 171
    iget-object v0, p0, Lo/agn;->k:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->card_heart_rate_view:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/agn;->q:Landroid/view/View;

    .line 172
    iget-object v0, p0, Lo/agn;->k:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->heart_rate_measuring_status_img:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/agn;->m:Landroid/widget/ImageView;

    .line 173
    iget-object v0, p0, Lo/agn;->k:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->heart_rate_measuring_status_tv:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    .line 174
    iget-object v0, p0, Lo/agn;->k:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->heart_rate_measuring_unit_tv:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/agn;->o:Landroid/widget/TextView;

    .line 175
    iget-object v0, p0, Lo/agn;->k:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->weight_battery_level_text:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/agn;->l:Landroid/widget/TextView;

    .line 176
    iget-object v0, p0, Lo/agn;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agn;->h:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_myfitnesspal_logout:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 177
    iget-object v0, p0, Lo/agn;->o:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 178
    invoke-direct {p0}, Lo/agn;->u()V

    .line 179
    return-void
.end method

.method static synthetic i(Lo/agn;)Landroid/content/Context;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/agn;->h:Landroid/content/Context;

    return-object v0
.end method

.method private i()V
    .locals 5

    .line 100
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 101
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->fZ:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 103
    return-void
.end method

.method private k()V
    .locals 3

    .line 185
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/agn;->b:Z

    .line 186
    const/4 v0, 0x0

    iput v0, p0, Lo/agn;->i:I

    .line 187
    iget-object v0, p0, Lo/agn;->a:Landroid/os/Handler;

    iget-object v1, p0, Lo/agn;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 188
    iget-object v0, p0, Lo/agn;->q:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 189
    iget-object v0, p0, Lo/agn;->m:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->heart_rate_measuring_connected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 191
    iget-object v0, p0, Lo/agn;->m:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/agn;->p:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 192
    iget-object v0, p0, Lo/agn;->p:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 194
    iget-object v0, p0, Lo/agn;->o:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 195
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agn;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->common_black_90alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 196
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    const/high16 v1, 0x41880000    # 17.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 197
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agn;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_heart_rate_measuring_status_start:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 198
    return-void
.end method

.method static synthetic k(Lo/agn;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lo/agn;->r()V

    return-void
.end method

.method static synthetic l(Lo/agn;)I
    .locals 1

    .line 46
    iget v0, p0, Lo/agn;->c:I

    return v0
.end method

.method private l()V
    .locals 3

    .line 273
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/agn;->b:Z

    .line 274
    const/4 v0, 0x0

    iput v0, p0, Lo/agn;->i:I

    .line 275
    const/16 v0, 0x14

    sput v0, Lo/agn;->g:I

    .line 276
    iget-object v0, p0, Lo/agn;->a:Landroid/os/Handler;

    iget-object v1, p0, Lo/agn;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 277
    iget-object v0, p0, Lo/agn;->q:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 278
    iget-object v0, p0, Lo/agn;->o:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 279
    iget-object v0, p0, Lo/agn;->p:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 280
    iget-object v0, p0, Lo/agn;->m:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->heart_rate_measuring_disconnected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 281
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agn;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->common_black_30alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 282
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    const/high16 v1, 0x41880000    # 17.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 283
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agn;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_main_watch_heart_rate_string:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 284
    iget-object v0, p0, Lo/agn;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agn;->h:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_myfitnesspal_logout:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 285
    invoke-direct {p0}, Lo/agn;->u()V

    .line 286
    return-void
.end method

.method static synthetic m(Lo/agn;)Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/agn;->f:Ljava/lang/String;

    return-object v0
.end method

.method private m()V
    .locals 3

    .line 233
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/agn;->b:Z

    .line 234
    iget-object v0, p0, Lo/agn;->q:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 235
    const/16 v0, 0x14

    sput v0, Lo/agn;->g:I

    .line 236
    sget v0, Lo/agn;->e:I

    const/4 v1, -0x5

    if-ne v0, v1, :cond_0

    .line 237
    const/4 v0, -0x6

    sput v0, Lo/agn;->e:I

    .line 238
    return-void

    .line 240
    :cond_0
    const/4 v0, -0x6

    sput v0, Lo/agn;->e:I

    .line 241
    iget-object v0, p0, Lo/agn;->o:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 242
    iget-object v0, p0, Lo/agn;->p:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 243
    iget-object v0, p0, Lo/agn;->m:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->heart_rate_measuring_connected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 244
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agn;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->common_black_90alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 245
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    const/high16 v1, 0x41880000    # 17.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 246
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agn;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_heart_rate_measuring_status_data_fail:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 247
    return-void
.end method

.method private n()V
    .locals 4

    .line 292
    const-string v0, "HonourRateStatus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeHeartRateStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    const/4 v0, 0x0

    iput v0, p0, Lo/agn;->i:I

    .line 294
    const/16 v0, 0x14

    sput v0, Lo/agn;->g:I

    .line 295
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/agn;->b:Z

    .line 296
    iget-object v0, p0, Lo/agn;->a:Landroid/os/Handler;

    iget-object v1, p0, Lo/agn;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 297
    iget-object v0, p0, Lo/agn;->q:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 298
    iget-object v0, p0, Lo/agn;->o:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 299
    iget-object v0, p0, Lo/agn;->p:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 300
    iget-object v0, p0, Lo/agn;->m:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->heart_rate_measuring_connected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 301
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agn;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->common_black_90alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 302
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    const/high16 v1, 0x41880000    # 17.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 303
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agn;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_main_watch_heart_rate_string:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 304
    return-void
.end method

.method static synthetic n(Lo/agn;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lo/agn;->q()V

    return-void
.end method

.method private o()V
    .locals 7

    .line 354
    const-string v0, "HonourRateStatus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter openHeartRateRunningForeground"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    const/16 v0, 0x14

    sput v0, Lo/agn;->g:I

    .line 357
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    iget-object v1, p0, Lo/agn;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/acd;->a(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v4

    .line 358
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v0

    const-string v1, "54C9739F-CA5C-4347-9F00-75B9DDF2C649"

    invoke-virtual {v0, v1}, Lo/acq;->b(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/MeasureKit;

    move-result-object v5

    .line 359
    if-nez v5, :cond_0

    .line 360
    return-void

    .line 362
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hihealth/device/open/MeasureKit;->getMeasureController()Lcom/huawei/hihealth/device/open/MeasureController;

    move-result-object v6

    .line 363
    if-eqz v6, :cond_1

    .line 364
    new-instance v0, Lo/agn$1;

    invoke-direct {v0, p0}, Lo/agn$1;-><init>(Lo/agn;)V

    .line 396
    invoke-static {}, Lo/ahd;->e()Landroid/os/Bundle;

    move-result-object v1

    .line 364
    invoke-interface {v6, v4, v0, v1}, Lcom/huawei/hihealth/device/open/MeasureController;->prepare(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;Landroid/os/Bundle;)Z

    .line 398
    :cond_1
    return-void
.end method

.method static synthetic o(Lo/agn;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lo/agn;->m()V

    return-void
.end method

.method private p()V
    .locals 3

    .line 310
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/agn;->b:Z

    .line 311
    iget-object v0, p0, Lo/agn;->q:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 312
    sget v0, Lo/agn;->e:I

    const/4 v1, -0x5

    if-eq v0, v1, :cond_0

    .line 313
    const/4 v0, -0x5

    sput v0, Lo/agn;->e:I

    .line 314
    iget-object v0, p0, Lo/agn;->o:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 315
    iget-object v0, p0, Lo/agn;->p:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 316
    iget-object v0, p0, Lo/agn;->m:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->heart_rate_measuring_connected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 317
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agn;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->common_black_90alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 318
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    const/high16 v1, 0x41880000    # 17.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 319
    iget-object v0, p0, Lo/agn;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agn;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_heart_rate_measuring_status_data_zero:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 321
    :cond_0
    return-void
.end method

.method static synthetic p(Lo/agn;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lo/agn;->s()V

    return-void
.end method

.method private q()V
    .locals 4

    .line 515
    const-string v0, "HonourRateStatus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter closeHeartRate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 516
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lo/agn;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->l(Ljava/lang/String;)V

    .line 517
    const v0, 0x186a0

    invoke-direct {p0, v0}, Lo/agn;->e(I)V

    .line 518
    return-void
.end method

.method private r()V
    .locals 2

    .line 573
    iget-object v0, p0, Lo/agn;->t:Lo/agp;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/agp;->a(I)Lo/agy;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/agy;->b(Z)V

    .line 574
    iget-object v0, p0, Lo/agn;->t:Lo/agp;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/agp;->a(I)Lo/agy;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/agy;->b(Z)V

    .line 575
    iget-object v0, p0, Lo/agn;->t:Lo/agp;

    invoke-virtual {v0}, Lo/agp;->notifyDataSetChanged()V

    .line 576
    return-void
.end method

.method private s()V
    .locals 5

    .line 401
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter openHeartRate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    iget-object v0, p0, Lo/agn;->a:Landroid/os/Handler;

    iget-object v1, p0, Lo/agn;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 403
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/agn;->b:Z

    .line 404
    const/4 v0, -0x1

    sput v0, Lo/agn;->e:I

    .line 405
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 406
    const/16 v0, 0x3e9

    iput v0, v4, Landroid/os/Message;->what:I

    .line 407
    iget-object v0, p0, Lo/agn;->a:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 408
    iget-object v0, p0, Lo/agn;->a:Landroid/os/Handler;

    iget-object v1, p0, Lo/agn;->d:Ljava/lang/Runnable;

    const-wide/16 v2, 0x3a98

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 410
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lo/agn;->f:Ljava/lang/String;

    new-instance v2, Lo/agn$3;

    invoke-direct {v2, p0}, Lo/agn$3;-><init>(Lo/agn;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/afd;->a(Ljava/lang/String;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;Landroid/os/Bundle;)Z

    .line 467
    return-void
.end method

.method private u()V
    .locals 2

    .line 564
    iget-object v0, p0, Lo/agn;->t:Lo/agp;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/agp;->a(I)Lo/agy;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/agy;->b(Z)V

    .line 565
    iget-object v0, p0, Lo/agn;->t:Lo/agp;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/agp;->a(I)Lo/agy;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/agy;->b(Z)V

    .line 566
    iget-object v0, p0, Lo/agn;->t:Lo/agp;

    invoke-virtual {v0}, Lo/agp;->notifyDataSetChanged()V

    .line 567
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 343
    const-string v0, "HonourRateStatus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onResume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    iget-boolean v0, p0, Lo/agn;->b:Z

    if-eqz v0, :cond_0

    .line 345
    invoke-direct {p0}, Lo/agn;->o()V

    .line 348
    :cond_0
    return-void
.end method

.method public b()V
    .locals 4

    .line 497
    const-string v0, "HonourRateStatus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter closeHeartRateRunningForeground"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 498
    invoke-direct {p0}, Lo/agn;->q()V

    .line 499
    return-void
.end method

.method public c()V
    .locals 4

    .line 327
    const-string v0, "HonourRateStatus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    invoke-virtual {p0}, Lo/agn;->b()V

    .line 329
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lo/agn;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->m(Ljava/lang/String;)V

    .line 330
    return-void
.end method

.method public e()V
    .locals 0

    .line 335
    return-void
.end method

.method public e(ILjava/lang/Object;)V
    .locals 0

    .line 340
    return-void
.end method

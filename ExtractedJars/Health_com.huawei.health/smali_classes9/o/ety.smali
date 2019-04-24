.class public Lo/ety;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:I

.field private static c:I


# instance fields
.field a:Ljava/lang/Runnable;

.field d:Ljava/lang/Runnable;

.field e:Landroid/os/Handler;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/content/Context;

.field private final h:Landroid/view/View;

.field private i:I

.field private k:Landroid/widget/ImageView;

.field private l:Landroid/graphics/drawable/AnimationDrawable;

.field private m:Landroid/content/BroadcastReceiver;

.field private final n:Landroid/content/BroadcastReceiver;

.field private o:Landroid/view/View;

.field private p:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 58
    const/4 v0, -0x4

    sput v0, Lo/ety;->b:I

    .line 59
    const/16 v0, 0xc

    sput v0, Lo/ety;->c:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 2

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    const/4 v0, 0x0

    iput v0, p0, Lo/ety;->i:I

    .line 97
    new-instance v0, Lo/ety$2;

    invoke-direct {v0, p0}, Lo/ety$2;-><init>(Lo/ety;)V

    iput-object v0, p0, Lo/ety;->e:Landroid/os/Handler;

    .line 180
    new-instance v0, Lo/ety$4;

    invoke-direct {v0, p0}, Lo/ety$4;-><init>(Lo/ety;)V

    iput-object v0, p0, Lo/ety;->d:Ljava/lang/Runnable;

    .line 361
    new-instance v0, Lo/ety$5;

    invoke-direct {v0, p0}, Lo/ety$5;-><init>(Lo/ety;)V

    iput-object v0, p0, Lo/ety;->a:Ljava/lang/Runnable;

    .line 460
    new-instance v0, Lo/ety$3;

    invoke-direct {v0, p0}, Lo/ety$3;-><init>(Lo/ety;)V

    iput-object v0, p0, Lo/ety;->n:Landroid/content/BroadcastReceiver;

    .line 511
    new-instance v0, Lo/ety$7;

    invoke-direct {v0, p0}, Lo/ety$7;-><init>(Lo/ety;)V

    iput-object v0, p0, Lo/ety;->m:Landroid/content/BroadcastReceiver;

    .line 72
    iput-object p1, p0, Lo/ety;->g:Landroid/content/Context;

    .line 73
    iput-object p2, p0, Lo/ety;->h:Landroid/view/View;

    .line 74
    iget-object v0, p0, Lo/ety;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$drawable;->heart_rate_measuring:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lo/ety;->l:Landroid/graphics/drawable/AnimationDrawable;

    .line 75
    invoke-direct {p0}, Lo/ety;->n()V

    .line 76
    invoke-direct {p0}, Lo/ety;->i()V

    .line 77
    invoke-direct {p0}, Lo/ety;->e()V

    .line 78
    return-void
.end method

.method static synthetic a(Lo/ety;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lo/ety;->h()V

    return-void
.end method

.method static synthetic b(Lo/ety;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lo/ety;->p()V

    return-void
.end method

.method static synthetic c()I
    .locals 1

    .line 35
    sget v0, Lo/ety;->b:I

    return v0
.end method

.method static synthetic c(Lo/ety;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lo/ety;->o()V

    return-void
.end method

.method private d(I)V
    .locals 3

    .line 210
    iget-object v0, p0, Lo/ety;->o:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 211
    iget-object v0, p0, Lo/ety;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    move-result v0

    if-nez v0, :cond_0

    .line 212
    iget-object v0, p0, Lo/ety;->k:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/ety;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 213
    iget-object v0, p0, Lo/ety;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 215
    :cond_0
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ety;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$color;->common_white_90alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 216
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 217
    if-nez p1, :cond_1

    .line 218
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 220
    :cond_1
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    :goto_0
    iget-object v0, p0, Lo/ety;->p:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 223
    return-void
.end method

.method static synthetic d(Lo/ety;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lo/ety;->g()V

    return-void
.end method

.method static synthetic e(I)I
    .locals 0

    .line 35
    sput p0, Lo/ety;->c:I

    return p0
.end method

.method private e()V
    .locals 2

    .line 81
    iget-object v0, p0, Lo/ety;->o:Landroid/view/View;

    new-instance v1, Lo/ety$1;

    invoke-direct {v1, p0}, Lo/ety$1;-><init>(Lo/ety;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 95
    return-void
.end method

.method static synthetic e(Lo/ety;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lo/ety;->k()V

    return-void
.end method

.method static synthetic e(Lo/ety;I)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lo/ety;->d(I)V

    return-void
.end method

.method private f()V
    .locals 3

    .line 191
    iget-object v0, p0, Lo/ety;->o:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 192
    const/16 v0, 0xc

    sput v0, Lo/ety;->c:I

    .line 193
    sget v0, Lo/ety;->b:I

    const/4 v1, -0x5

    if-ne v0, v1, :cond_0

    .line 194
    const/4 v0, -0x6

    sput v0, Lo/ety;->b:I

    .line 195
    return-void

    .line 197
    :cond_0
    const/4 v0, -0x6

    sput v0, Lo/ety;->b:I

    .line 198
    iget-object v0, p0, Lo/ety;->p:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 199
    iget-object v0, p0, Lo/ety;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 200
    iget-object v0, p0, Lo/ety;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homewear21/R$mipmap;->heart_rate_measuring_connected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 201
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ety;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$color;->common_white_90alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 202
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    const/high16 v1, 0x41880000    # 17.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 203
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ety;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_heart_rate_measuring_status_data_fail:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 204
    return-void
.end method

.method private g()V
    .locals 4

    .line 164
    const/4 v0, -0x2

    sput v0, Lo/ety;->b:I

    .line 165
    const/4 v0, 0x0

    iput v0, p0, Lo/ety;->i:I

    .line 166
    iget-object v0, p0, Lo/ety;->e:Landroid/os/Handler;

    iget-object v1, p0, Lo/ety;->d:Ljava/lang/Runnable;

    const-wide/16 v2, 0x1f40

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 167
    iget-object v0, p0, Lo/ety;->e:Landroid/os/Handler;

    iget-object v1, p0, Lo/ety;->a:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 169
    iget-object v0, p0, Lo/ety;->o:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 170
    iget-object v0, p0, Lo/ety;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    move-result v0

    if-nez v0, :cond_0

    .line 171
    iget-object v0, p0, Lo/ety;->k:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/ety;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 172
    iget-object v0, p0, Lo/ety;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 174
    :cond_0
    iget-object v0, p0, Lo/ety;->p:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 175
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ety;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$color;->common_white_90alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 176
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    const/high16 v1, 0x41880000    # 17.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 177
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ety;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_heart_rate_measuring_status_measuring:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    return-void
.end method

.method static synthetic g(Lo/ety;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lo/ety;->f()V

    return-void
.end method

.method private h()V
    .locals 3

    .line 146
    const/4 v0, 0x0

    iput v0, p0, Lo/ety;->i:I

    .line 147
    iget-object v0, p0, Lo/ety;->e:Landroid/os/Handler;

    iget-object v1, p0, Lo/ety;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 148
    iget-object v0, p0, Lo/ety;->o:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 149
    iget-object v0, p0, Lo/ety;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homewear21/R$mipmap;->heart_rate_measuring_connected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 151
    iget-object v0, p0, Lo/ety;->k:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/ety;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 152
    iget-object v0, p0, Lo/ety;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 154
    iget-object v0, p0, Lo/ety;->p:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 155
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ety;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$color;->common_white_90alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 156
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    const/high16 v1, 0x41880000    # 17.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 157
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ety;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_heart_rate_measuring_status_start:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    return-void
.end method

.method private i()V
    .locals 2

    .line 135
    iget-object v0, p0, Lo/ety;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homewear21/R$id;->card_heart_rate_view:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/ety;->o:Landroid/view/View;

    .line 136
    iget-object v0, p0, Lo/ety;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homewear21/R$id;->heart_rate_measuring_status_img:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/ety;->k:Landroid/widget/ImageView;

    .line 137
    iget-object v0, p0, Lo/ety;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homewear21/R$id;->heart_rate_measuring_status_tv:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    .line 138
    iget-object v0, p0, Lo/ety;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homewear21/R$id;->heart_rate_measuring_unit_tv:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ety;->p:Landroid/widget/TextView;

    .line 139
    iget-object v0, p0, Lo/ety;->p:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 140
    return-void
.end method

.method static synthetic i(Lo/ety;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lo/ety;->m()V

    return-void
.end method

.method static synthetic k(Lo/ety;)Landroid/content/Context;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/ety;->g:Landroid/content/Context;

    return-object v0
.end method

.method private k()V
    .locals 3

    .line 229
    const/4 v0, 0x0

    iput v0, p0, Lo/ety;->i:I

    .line 230
    const/16 v0, 0xc

    sput v0, Lo/ety;->c:I

    .line 231
    iget-object v0, p0, Lo/ety;->e:Landroid/os/Handler;

    iget-object v1, p0, Lo/ety;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 232
    iget-object v0, p0, Lo/ety;->o:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 233
    iget-object v0, p0, Lo/ety;->p:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 234
    iget-object v0, p0, Lo/ety;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 235
    iget-object v0, p0, Lo/ety;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homewear21/R$mipmap;->heart_rate_measuring_disconnected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 236
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ety;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$color;->common_white_30alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 237
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    const/high16 v1, 0x41880000    # 17.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 238
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ety;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_health_show_healthdata_heart_bmp:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 239
    return-void
.end method

.method private l()V
    .locals 5

    .line 324
    const-string v0, "HeartRateStatusInteractors"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter unregisterDeviceConnectStatusBroadcast()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    iget-object v0, p0, Lo/ety;->g:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 326
    iget-object v0, p0, Lo/ety;->g:Landroid/content/Context;

    iget-object v1, p0, Lo/ety;->m:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 332
    :cond_0
    goto :goto_0

    .line 328
    :catch_0
    move-exception v4

    .line 329
    const-string v0, "HeartRateStatusInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    goto :goto_0

    .line 330
    :catch_1
    move-exception v4

    .line 331
    const-string v0, "HeartRateStatusInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    :goto_0
    return-void
.end method

.method private m()V
    .locals 3

    .line 261
    iget-object v0, p0, Lo/ety;->o:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 262
    sget v0, Lo/ety;->b:I

    const/4 v1, -0x5

    if-eq v0, v1, :cond_0

    .line 263
    const/4 v0, -0x5

    sput v0, Lo/ety;->b:I

    .line 264
    iget-object v0, p0, Lo/ety;->p:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 265
    iget-object v0, p0, Lo/ety;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 266
    iget-object v0, p0, Lo/ety;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homewear21/R$mipmap;->heart_rate_measuring_connected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 267
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ety;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$color;->common_white_90alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 268
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    const/high16 v1, 0x41880000    # 17.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 269
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ety;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_heart_rate_measuring_status_data_zero:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 271
    :cond_0
    return-void
.end method

.method private n()V
    .locals 5

    .line 315
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 316
    iget-object v0, p0, Lo/ety;->g:Landroid/content/Context;

    iget-object v1, p0, Lo/ety;->m:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 317
    return-void
.end method

.method private o()V
    .locals 3

    .line 245
    const/4 v0, 0x0

    iput v0, p0, Lo/ety;->i:I

    .line 246
    const/16 v0, 0xc

    sput v0, Lo/ety;->c:I

    .line 247
    iget-object v0, p0, Lo/ety;->e:Landroid/os/Handler;

    iget-object v1, p0, Lo/ety;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 248
    iget-object v0, p0, Lo/ety;->o:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 249
    iget-object v0, p0, Lo/ety;->p:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 250
    iget-object v0, p0, Lo/ety;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 251
    iget-object v0, p0, Lo/ety;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homewear21/R$mipmap;->heart_rate_measuring_connected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 252
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ety;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$color;->common_white_90alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 253
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    const/high16 v1, 0x41880000    # 17.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 254
    iget-object v0, p0, Lo/ety;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ety;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_health_show_healthdata_heart_bmp:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 255
    return-void
.end method

.method private p()V
    .locals 5

    .line 347
    const-string v0, "HeartRateStatusInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter openHeartRateRunningForeground"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    iget-object v0, p0, Lo/ety;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 349
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xb

    if-ne v1, v0, :cond_0

    .line 350
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    sget v0, Lo/ety;->b:I

    const/4 v1, -0x4

    if-eq v0, v1, :cond_0

    sget v0, Lo/ety;->b:I

    .line 359
    :cond_0
    return-void
.end method

.method private q()V
    .locals 5

    .line 411
    const-string v0, "HeartRateStatusInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter closeHeartRateRunningForeground"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    iget-object v0, p0, Lo/ety;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 414
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xb

    if-ne v1, v0, :cond_0

    .line 415
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    .line 423
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 300
    const-string v0, "HeartRateStatusInteractors"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter unRegisterHeartRateBroadcast()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    iget-object v0, p0, Lo/ety;->g:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 302
    iget-object v0, p0, Lo/ety;->g:Landroid/content/Context;

    iget-object v1, p0, Lo/ety;->n:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 308
    :cond_0
    goto :goto_0

    .line 304
    :catch_0
    move-exception v4

    .line 305
    const-string v0, "HeartRateStatusInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    goto :goto_0

    .line 306
    :catch_1
    move-exception v4

    .line 307
    const-string v0, "HeartRateStatusInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    :goto_0
    return-void
.end method

.method public b()V
    .locals 4

    .line 336
    const-string v0, "HeartRateStatusInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onResume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    return-void
.end method

.method public d()V
    .locals 4

    .line 277
    const-string v0, "HeartRateStatusInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    invoke-direct {p0}, Lo/ety;->q()V

    .line 279
    invoke-direct {p0}, Lo/ety;->l()V

    .line 280
    invoke-virtual {p0}, Lo/ety;->a()V

    .line 281
    return-void
.end method

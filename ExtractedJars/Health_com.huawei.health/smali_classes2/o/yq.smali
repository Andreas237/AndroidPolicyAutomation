.class public Lo/yq;
.super Landroid/app/Dialog;
.source "SourceFile"

# interfaces
.implements Lo/yw;


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:Z

.field private C:Landroid/os/Handler;

.field private D:Ljava/text/NumberFormat;

.field private a:Landroid/widget/ProgressBar;

.field private b:Z

.field private c:Landroid/widget/TextView;

.field private d:Landroid/content/Context;

.field private e:Z

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/LinearLayout;

.field private j:Z

.field private k:Landroid/widget/Button;

.field private l:Landroid/graphics/drawable/Drawable;

.field private m:Landroid/graphics/drawable/Drawable;

.field private n:Landroid/widget/Button;

.field private o:Landroid/view/LayoutInflater;

.field private p:Landroid/widget/TextView;

.field private q:Z

.field private r:I

.field private s:Ljava/lang/CharSequence;

.field private t:I

.field private u:I

.field private v:I

.field private w:I

.field private x:Landroid/widget/TextView;

.field private y:I

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 2

    .line 116
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 56
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/yq;->b:Z

    .line 58
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/yq;->e:Z

    .line 89
    const/4 v0, 0x0

    iput v0, p0, Lo/yq;->v:I

    .line 92
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/yq;->j:Z

    .line 117
    const-string v0, "HwProgressDialog"

    const-string v1, "HwProgressDialog "

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    iput-object p1, p0, Lo/yq;->d:Landroid/content/Context;

    .line 119
    const-string v0, "layout_inflater"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lo/yq;->o:Landroid/view/LayoutInflater;

    .line 120
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/yq;->requestWindowFeature(I)Z

    .line 121
    invoke-direct {p0}, Lo/yq;->e()V

    .line 123
    invoke-direct {p0}, Lo/yq;->d()V

    .line 125
    return-void
.end method

.method static synthetic a(Lo/yq;)Landroid/widget/TextView;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/yq;->x:Landroid/widget/TextView;

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 149
    const-string v0, "HwProgressDialog"

    const-string v1, "enter init_Content_view"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    iget v0, p0, Lo/yq;->v:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 151
    const-string v0, "HwProgressDialog"

    const-string v1, "judge mProgressStyle is STYLE_HORIZONTAL"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 152
    new-instance v0, Lo/yq$5;

    invoke-direct {v0, p0}, Lo/yq$5;-><init>(Lo/yq;)V

    iput-object v0, p0, Lo/yq;->C:Landroid/os/Handler;

    .line 185
    iget-object v0, p0, Lo/yq;->o:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/cp3/R$layout;->cp3_custom_alert_progress_dlg:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 186
    sget v0, Lcom/huawei/cp3/R$id;->progress_percent:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/yq;->A:Landroid/widget/TextView;

    .line 187
    sget v0, Lcom/huawei/cp3/R$id;->progress:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lo/yq;->a:Landroid/widget/ProgressBar;

    .line 188
    sget v0, Lcom/huawei/cp3/R$id;->progress_number:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/yq;->x:Landroid/widget/TextView;

    .line 189
    invoke-virtual {p0, v3}, Lo/yq;->a(Landroid/view/View;)V

    .line 190
    const-string v0, "HwProgressDialog"

    const-string v1, "finish judge"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 191
    goto :goto_0

    .line 192
    :cond_0
    const-string v0, "HwProgressDialog"

    const-string v1, "enter else"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 193
    iget-object v0, p0, Lo/yq;->o:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/cp3/R$layout;->cp3_custom_progress_dlg:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 194
    sget v0, Lcom/huawei/cp3/R$id;->message:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/yq;->c:Landroid/widget/TextView;

    .line 195
    sget v0, Lcom/huawei/cp3/R$id;->progress:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lo/yq;->a:Landroid/widget/ProgressBar;

    .line 196
    invoke-virtual {p0, v3}, Lo/yq;->a(Landroid/view/View;)V

    .line 197
    const-string v0, "HwProgressDialog"

    const-string v1, "finish else judge"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 199
    :goto_0
    iget-object v0, p0, Lo/yq;->s:Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    .line 200
    const-string v0, "HwProgressDialog"

    const-string v1, "mMessage not null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 201
    iget-object v0, p0, Lo/yq;->s:Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Lo/yq;->a(Ljava/lang/CharSequence;)V

    .line 202
    const-string v0, "HwProgressDialog"

    const-string v1, "mMessage not null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 204
    :cond_1
    iget v0, p0, Lo/yq;->w:I

    const/4 v1, 0x0

    if-ge v1, v0, :cond_2

    .line 205
    const-string v0, "HwProgressDialog"

    const-string v1, "mIncrementSecondaryBy than 0"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    iget v0, p0, Lo/yq;->w:I

    invoke-virtual {p0, v0}, Lo/yq;->g(I)V

    .line 207
    const-string v0, "HwProgressDialog"

    const-string v1, "mIncrementSecondaryBy than 0 finish"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 209
    :cond_2
    iget v0, p0, Lo/yq;->y:I

    const/4 v1, 0x0

    if-ge v1, v0, :cond_3

    .line 210
    const-string v0, "HwProgressDialog"

    const-string v1, "mIncrementBy than 0"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 211
    iget v0, p0, Lo/yq;->y:I

    invoke-virtual {p0, v0}, Lo/yq;->d(I)V

    .line 212
    const-string v0, "HwProgressDialog"

    const-string v1, "mIncrementBy than 0 finish"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    :cond_3
    iget-object v0, p0, Lo/yq;->m:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_4

    .line 215
    const-string v0, "HwProgressDialog"

    const-string v1, "mProgressDrawable not null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 216
    iget-object v0, p0, Lo/yq;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lo/yq;->e(Landroid/graphics/drawable/Drawable;)V

    .line 217
    const-string v0, "HwProgressDialog"

    const-string v1, "mProgressDrawable not null finish"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    :cond_4
    iget-object v0, p0, Lo/yq;->l:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_5

    .line 221
    const-string v0, "HwProgressDialog"

    const-string v1, "mIndeterminateDrawable not null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 222
    iget-object v0, p0, Lo/yq;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lo/yq;->a(Landroid/graphics/drawable/Drawable;)V

    .line 223
    const-string v0, "HwProgressDialog"

    const-string v1, "mIndeterminateDrawable not null finish"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 225
    :cond_5
    iget v0, p0, Lo/yq;->t:I

    const/4 v1, 0x0

    if-ge v1, v0, :cond_6

    .line 226
    const-string v0, "HwProgressDialog"

    const-string v1, "mProgressVal than 0"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 227
    iget v0, p0, Lo/yq;->t:I

    invoke-virtual {p0, v0}, Lo/yq;->e(I)V

    .line 228
    const-string v0, "HwProgressDialog"

    const-string v1, "mProgressVal than 0 finish"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 230
    :cond_6
    iget v0, p0, Lo/yq;->r:I

    const/4 v1, 0x0

    if-ge v1, v0, :cond_7

    .line 231
    const-string v0, "HwProgressDialog"

    const-string v1, "mSecondaryProgressVal than 0"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 232
    iget v0, p0, Lo/yq;->r:I

    invoke-virtual {p0, v0}, Lo/yq;->a(I)V

    .line 233
    const-string v0, "HwProgressDialog"

    const-string v1, "mSecondaryProgressVal than 0 finish"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 235
    :cond_7
    iget v0, p0, Lo/yq;->u:I

    const/4 v1, 0x0

    if-ge v1, v0, :cond_8

    .line 236
    const-string v0, "HwProgressDialog"

    const-string v1, "mMax than 0"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 237
    iget v0, p0, Lo/yq;->u:I

    invoke-virtual {p0, v0}, Lo/yq;->c(I)V

    .line 238
    const-string v0, "HwProgressDialog"

    const-string v1, "mMax than 0 finish"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 240
    :cond_8
    iget-boolean v0, p0, Lo/yq;->q:Z

    invoke-virtual {p0, v0}, Lo/yq;->e(Z)V

    .line 241
    invoke-direct {p0}, Lo/yq;->c()V

    .line 242
    return-void
.end method

.method static synthetic b(Lo/yq;)Landroid/widget/TextView;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/yq;->A:Landroid/widget/TextView;

    return-object v0
.end method

.method private declared-synchronized b(D)Ljava/lang/String;
    .locals 1

    monitor-enter p0

    .line 285
    :try_start_0
    iget-object v0, p0, Lo/yq;->D:Ljava/text/NumberFormat;

    invoke-virtual {v0, p1, p2}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic b(Lo/yq;D)Ljava/lang/String;
    .locals 1

    .line 48
    invoke-direct {p0, p1, p2}, Lo/yq;->b(D)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/yq;)Landroid/widget/ProgressBar;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/yq;->a:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method private c()V
    .locals 2

    .line 594
    const-string v0, "HwProgressDialog"

    const-string v1, " onProgressChanged."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 595
    iget v0, p0, Lo/yq;->v:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 596
    iget-object v0, p0, Lo/yq;->C:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/yq;->C:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 597
    iget-object v0, p0, Lo/yq;->C:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 600
    :cond_0
    return-void
.end method

.method static synthetic d(Lo/yq;)Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/yq;->z:Ljava/lang/String;

    return-object v0
.end method

.method private declared-synchronized d()V
    .locals 3

    monitor-enter p0

    .line 290
    const-string v0, "%1d/%2d"

    :try_start_0
    iput-object v0, p0, Lo/yq;->z:Ljava/lang/String;

    .line 291
    invoke-static {}, Ljava/text/NumberFormat;->getPercentInstance()Ljava/text/NumberFormat;

    move-result-object v0

    iput-object v0, p0, Lo/yq;->D:Ljava/text/NumberFormat;

    .line 292
    iget-object v0, p0, Lo/yq;->D:Ljava/text/NumberFormat;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 294
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method static synthetic e(Lo/yq;)Ljava/text/NumberFormat;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/yq;->D:Ljava/text/NumberFormat;

    return-object v0
.end method

.method private e()V
    .locals 1

    .line 128
    sget v0, Lcom/huawei/cp3/R$layout;->cp3_custom_dialog_layout:I

    invoke-virtual {p0, v0}, Lo/yq;->setContentView(I)V

    .line 129
    sget v0, Lcom/huawei/cp3/R$id;->dialog_layout:I

    invoke-virtual {p0, v0}, Lo/yq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/yq;->f:Landroid/widget/LinearLayout;

    .line 130
    sget v0, Lcom/huawei/cp3/R$id;->title:I

    invoke-virtual {p0, v0}, Lo/yq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/yq;->p:Landroid/widget/TextView;

    .line 131
    sget v0, Lcom/huawei/cp3/R$id;->content:I

    invoke-virtual {p0, v0}, Lo/yq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/yq;->i:Landroid/widget/LinearLayout;

    .line 132
    sget v0, Lcom/huawei/cp3/R$id;->msg:I

    invoke-virtual {p0, v0}, Lo/yq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/yq;->h:Landroid/widget/TextView;

    .line 133
    sget v0, Lcom/huawei/cp3/R$id;->button_layout:I

    invoke-virtual {p0, v0}, Lo/yq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/yq;->g:Landroid/widget/LinearLayout;

    .line 134
    sget v0, Lcom/huawei/cp3/R$id;->ok:I

    invoke-virtual {p0, v0}, Lo/yq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lo/yq;->k:Landroid/widget/Button;

    .line 135
    sget v0, Lcom/huawei/cp3/R$id;->cancel:I

    invoke-virtual {p0, v0}, Lo/yq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lo/yq;->n:Landroid/widget/Button;

    .line 136
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 445
    iget-object v0, p0, Lo/yq;->a:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    .line 446
    iget-object v0, p0, Lo/yq;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setSecondaryProgress(I)V

    .line 447
    invoke-direct {p0}, Lo/yq;->c()V

    goto :goto_0

    .line 449
    :cond_0
    iput p1, p0, Lo/yq;->r:I

    .line 452
    :goto_0
    return-void
.end method

.method public a(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 561
    iget-object v0, p0, Lo/yq;->a:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    .line 562
    iget-object v0, p0, Lo/yq;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 564
    :cond_0
    iput-object p1, p0, Lo/yq;->l:Landroid/graphics/drawable/Drawable;

    .line 567
    :goto_0
    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 5

    .line 583
    iget-object v0, p0, Lo/yq;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 584
    iget-object v0, p0, Lo/yq;->i:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 585
    iget-object v0, p0, Lo/yq;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 586
    iget-object v0, p0, Lo/yq;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 587
    iget-object v0, p0, Lo/yq;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 588
    iget-object v0, p0, Lo/yq;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 591
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 2

    .line 316
    iget-object v0, p0, Lo/yq;->a:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_1

    .line 317
    iget v0, p0, Lo/yq;->v:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 318
    iget-object v0, p0, Lo/yq;->h:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 319
    iget-object v0, p0, Lo/yq;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 321
    :cond_0
    iget-object v0, p0, Lo/yq;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 322
    iget-object v0, p0, Lo/yq;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 325
    :cond_1
    iput-object p1, p0, Lo/yq;->s:Ljava/lang/CharSequence;

    .line 327
    :goto_0
    return-void
.end method

.method public b(I)V
    .locals 2

    .line 391
    const-string v0, "HwProgressDialog"

    const-string v1, "setProgressStyle "

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 392
    iput p1, p0, Lo/yq;->v:I

    .line 394
    return-void
.end method

.method public c(I)V
    .locals 2

    .line 518
    const-string v0, "HwProgressDialog"

    const-string v1, "enter setMax"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 519
    iget-object v0, p0, Lo/yq;->a:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    .line 520
    const-string v0, "HwProgressDialog"

    const-string v1, "enter mProgress not null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 521
    iget-object v0, p0, Lo/yq;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 522
    invoke-direct {p0}, Lo/yq;->c()V

    goto :goto_0

    .line 524
    :cond_0
    const-string v0, "HwProgressDialog"

    const-string v1, "enter mProgress is null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 526
    iput p1, p0, Lo/yq;->u:I

    .line 528
    :goto_0
    const-string v0, "HwProgressDialog"

    const-string v1, "exit setMax"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 530
    return-void
.end method

.method public cancel()V
    .locals 3

    .line 642
    :try_start_0
    invoke-super {p0}, Landroid/app/Dialog;->cancel()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 645
    goto :goto_0

    .line 643
    :catch_0
    move-exception v2

    .line 644
    const-string v0, "HwProgressDialog"

    const-string v1, "cancel failed."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 646
    :goto_0
    return-void
.end method

.method public d(I)V
    .locals 2

    .line 486
    const-string v0, "HwProgressDialog"

    const-string v1, "enter incrementProgressBy"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 488
    iget-object v0, p0, Lo/yq;->a:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    .line 489
    const-string v0, "HwProgressDialog"

    const-string v1, "enter mProgress not null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 491
    iget-object v0, p0, Lo/yq;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->incrementProgressBy(I)V

    .line 492
    invoke-direct {p0}, Lo/yq;->c()V

    goto :goto_0

    .line 494
    :cond_0
    const-string v0, "HwProgressDialog"

    const-string v1, "enter mProgress is null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 496
    iget v0, p0, Lo/yq;->y:I

    add-int/2addr v0, p1

    iput v0, p0, Lo/yq;->y:I

    .line 498
    :goto_0
    const-string v0, "HwProgressDialog"

    const-string v1, "exit incrementProgressBy"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 499
    return-void
.end method

.method public dismiss()V
    .locals 3

    .line 633
    :try_start_0
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 636
    goto :goto_0

    .line 634
    :catch_0
    move-exception v2

    .line 635
    const-string v0, "HwProgressDialog"

    const-string v1, "dismiss failed."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 637
    :goto_0
    return-void
.end method

.method public e(I)V
    .locals 2

    .line 431
    iget-boolean v0, p0, Lo/yq;->B:Z

    if-eqz v0, :cond_0

    .line 432
    const-string v0, "HwProgressDialog"

    const-string v1, "setProgress "

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 433
    iget-object v0, p0, Lo/yq;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 434
    invoke-direct {p0}, Lo/yq;->c()V

    goto :goto_0

    .line 436
    :cond_0
    iput p1, p0, Lo/yq;->t:I

    .line 439
    :goto_0
    return-void
.end method

.method public e(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 549
    iget-object v0, p0, Lo/yq;->a:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    .line 550
    iget-object v0, p0, Lo/yq;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 552
    :cond_0
    iput-object p1, p0, Lo/yq;->m:Landroid/graphics/drawable/Drawable;

    .line 555
    :goto_0
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    .line 300
    iget-object v0, p0, Lo/yq;->p:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 301
    iget-object v0, p0, Lo/yq;->p:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 302
    iget-object v0, p0, Lo/yq;->p:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 304
    :cond_0
    return-void
.end method

.method public e(Z)V
    .locals 2

    .line 400
    const-string v0, "HwProgressDialog"

    const-string v1, "setIndeterminate "

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 401
    iget-object v0, p0, Lo/yq;->a:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    .line 402
    iget-object v0, p0, Lo/yq;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    goto :goto_0

    .line 404
    :cond_0
    iput-boolean p1, p0, Lo/yq;->q:Z

    .line 407
    :goto_0
    return-void
.end method

.method public g(I)V
    .locals 1

    .line 536
    iget-object v0, p0, Lo/yq;->a:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    .line 537
    iget-object v0, p0, Lo/yq;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->incrementSecondaryProgressBy(I)V

    .line 538
    invoke-direct {p0}, Lo/yq;->c()V

    goto :goto_0

    .line 540
    :cond_0
    iget v0, p0, Lo/yq;->w:I

    add-int/2addr v0, p1

    iput v0, p0, Lo/yq;->w:I

    .line 543
    :goto_0
    return-void
.end method

.method public getWindow()Landroid/view/Window;
    .locals 1

    .line 650
    invoke-super {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    return-object v0
.end method

.method public onContentChanged()V
    .locals 8

    .line 258
    invoke-super {p0}, Landroid/app/Dialog;->onContentChanged()V

    .line 260
    invoke-virtual {p0}, Lo/yq;->getWindow()Landroid/view/Window;

    move-result-object v4

    .line 261
    if-eqz v4, :cond_1

    .line 262
    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v5

    .line 265
    invoke-virtual {p0}, Lo/yq;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/yp;->b(Landroid/content/Context;)I

    move-result v6

    .line 266
    invoke-virtual {p0}, Lo/yq;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/yp;->c(Landroid/content/Context;)I

    move-result v7

    .line 267
    if-le v6, v7, :cond_0

    .line 268
    int-to-double v0, v7

    const-wide v2, 0x3feb333333333333L    # 0.85

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    goto :goto_0

    .line 270
    :cond_0
    int-to-double v0, v6

    const-wide v2, 0x3feb333333333333L    # 0.85

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 272
    :goto_0
    invoke-virtual {v4, v5}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 275
    :cond_1
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 142
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 143
    const-string v0, "HwProgressDialog"

    const-string v1, "onCreate "

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 144
    invoke-direct {p0}, Lo/yq;->a()V

    .line 145
    return-void
.end method

.method public onSearchRequested()Z
    .locals 1

    .line 664
    iget-boolean v0, p0, Lo/yq;->e:Z

    if-eqz v0, :cond_0

    .line 665
    iget-boolean v0, p0, Lo/yq;->b:Z

    return v0

    .line 667
    :cond_0
    invoke-super {p0}, Landroid/app/Dialog;->onSearchRequested()Z

    move-result v0

    return v0
.end method

.method public onStart()V
    .locals 1

    .line 246
    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    .line 247
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/yq;->B:Z

    .line 248
    return-void
.end method

.method protected onStop()V
    .locals 1

    .line 252
    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    .line 253
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/yq;->B:Z

    .line 254
    return-void
.end method

.method public setTitle(I)V
    .locals 2

    .line 308
    iget-object v0, p0, Lo/yq;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 309
    invoke-virtual {p0, v1}, Lo/yq;->e(Ljava/lang/String;)V

    .line 310
    return-void
.end method

.method public show()V
    .locals 3

    .line 623
    :try_start_0
    invoke-super {p0}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 626
    goto :goto_0

    .line 624
    :catch_0
    move-exception v2

    .line 625
    const-string v0, "HwProgressDialog"

    const-string v1, "showDialog failed."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 628
    :goto_0
    return-void
.end method

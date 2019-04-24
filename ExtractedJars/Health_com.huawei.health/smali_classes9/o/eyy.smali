.class public abstract Lo/eyy;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ChartT:Lo/eih;>Landroid/widget/LinearLayout;"
    }
.end annotation


# instance fields
.field protected a:Landroid/widget/LinearLayout;

.field private b:Landroid/view/View;

.field protected c:Landroid/widget/TextView;

.field protected d:Lo/eyz;

.field private e:Landroid/view/View;

.field private f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private g:Landroid/widget/TextView;

.field private h:Lo/eih;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TChartT;"
        }
    .end annotation
.end field

.field private i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private k:Ljava/lang/String;

.field private l:Landroid/widget/LinearLayout;

.field private n:Landroid/widget/LinearLayout;

.field private p:Lo/ezh;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 69
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 44
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/eyy;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 45
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/eyy;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 48
    const-string v0, "--"

    iput-object v0, p0, Lo/eyy;->k:Ljava/lang/String;

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyy;->c:Landroid/widget/TextView;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyy;->a:Landroid/widget/LinearLayout;

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyy;->d:Lo/eyz;

    .line 70
    invoke-direct {p0}, Lo/eyy;->d()V

    .line 71
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 74
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 44
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/eyy;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 45
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/eyy;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 48
    const-string v0, "--"

    iput-object v0, p0, Lo/eyy;->k:Ljava/lang/String;

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyy;->c:Landroid/widget/TextView;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyy;->a:Landroid/widget/LinearLayout;

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyy;->d:Lo/eyz;

    .line 75
    invoke-direct {p0}, Lo/eyy;->d()V

    .line 76
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 79
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 44
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/eyy;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 45
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/eyy;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 48
    const-string v0, "--"

    iput-object v0, p0, Lo/eyy;->k:Ljava/lang/String;

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyy;->c:Landroid/widget/TextView;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyy;->a:Landroid/widget/LinearLayout;

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyy;->d:Lo/eyz;

    .line 80
    invoke-direct {p0}, Lo/eyy;->d()V

    .line 81
    return-void
.end method

.method static synthetic a(Lo/eyy;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 37
    iput-object p1, p0, Lo/eyy;->k:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lo/eyy;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lo/eyy;->i()V

    return-void
.end method

.method static synthetic b(Lo/eyy;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/eyy;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic c(Lo/eyy;)Lo/eih;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/eyy;->h:Lo/eih;

    return-object v0
.end method

.method private c(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 1

    .line 229
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 230
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    :cond_0
    return-void
.end method

.method static synthetic d(Lo/eyy;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/eyy;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method private d()V
    .locals 6

    .line 89
    invoke-virtual {p0}, Lo/eyy;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->jump_table_chart:I

    invoke-static {v0, v1, p0}, Lo/eyy;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 90
    sget v0, Lcom/huawei/ui/main/R$id;->older_switch_btn:I

    invoke-virtual {p0, v0}, Lo/eyy;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/eyy;->e:Landroid/view/View;

    .line 91
    sget v0, Lcom/huawei/ui/main/R$id;->newer_switch_btn:I

    invoke-virtual {p0, v0}, Lo/eyy;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/eyy;->b:Landroid/view/View;

    .line 92
    sget v0, Lcom/huawei/ui/main/R$id;->time_area:I

    invoke-virtual {p0, v0}, Lo/eyy;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/eyy;->g:Landroid/widget/TextView;

    .line 93
    sget v0, Lcom/huawei/ui/main/R$id;->barlinechart_container:I

    invoke-virtual {p0, v0}, Lo/eyy;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/eyy;->l:Landroid/widget/LinearLayout;

    .line 94
    sget v0, Lcom/huawei/ui/main/R$id;->marker_view_root_place_holder:I

    invoke-virtual {p0, v0}, Lo/eyy;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/eyy;->n:Landroid/widget/LinearLayout;

    .line 95
    invoke-virtual {p0}, Lo/eyy;->c()Lo/eih;

    move-result-object v0

    iput-object v0, p0, Lo/eyy;->h:Lo/eih;

    .line 97
    iget-object v0, p0, Lo/eyy;->h:Lo/eih;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/eih;->setLayerType(ILandroid/graphics/Paint;)V

    .line 98
    iget-object v0, p0, Lo/eyy;->h:Lo/eih;

    iget-object v1, p0, Lo/eyy;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Lo/eih;->e(Landroid/view/View;)V

    .line 99
    iget-object v0, p0, Lo/eyy;->l:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/eyy;->h:Lo/eih;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;II)V

    .line 102
    sget v0, Lcom/huawei/ui/main/R$id;->detail_markview_time:I

    invoke-virtual {p0, v0}, Lo/eyy;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/eyy;->c:Landroid/widget/TextView;

    .line 103
    sget v0, Lcom/huawei/ui/main/R$id;->marker_textview_place_holder:I

    invoke-virtual {p0, v0}, Lo/eyy;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/eyy;->a:Landroid/widget/LinearLayout;

    .line 104
    new-instance v0, Lo/eyz;

    invoke-virtual {p0}, Lo/eyy;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/eyz;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/eyy;->d:Lo/eyz;

    .line 105
    iget-object v0, p0, Lo/eyy;->a:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/eyy;->d:Lo/eyz;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;II)V

    .line 110
    sget v0, Lcom/huawei/ui/main/R$id;->older_switch_btn_outer_rect:I

    invoke-virtual {p0, v0}, Lo/eyy;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 111
    sget v0, Lcom/huawei/ui/main/R$id;->newer_switch_btn_outer_rect:I

    invoke-virtual {p0, v0}, Lo/eyy;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 112
    new-instance v0, Lo/eyy$3;

    invoke-direct {v0, p0}, Lo/eyy$3;-><init>(Lo/eyy;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/view/View;->setClickable(Z)V

    .line 132
    new-instance v0, Lo/eyy$5;

    invoke-direct {v0, p0}, Lo/eyy$5;-><init>(Lo/eyy;)V

    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 150
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/view/View;->setClickable(Z)V

    .line 152
    invoke-direct {p0}, Lo/eyy;->h()V

    .line 153
    invoke-direct {p0}, Lo/eyy;->k()V

    .line 154
    invoke-direct {p0}, Lo/eyy;->g()V

    .line 155
    invoke-direct {p0}, Lo/eyy;->f()V

    .line 156
    return-void
.end method

.method static synthetic d(Lo/eyy;Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Lo/eyy;->c(Landroid/widget/TextView;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lo/eyy;)Lo/ezh;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/eyy;->p:Lo/ezh;

    return-object v0
.end method

.method private f()V
    .locals 2

    .line 159
    iget-object v0, p0, Lo/eyy;->h:Lo/eih;

    new-instance v1, Lo/eyy$1;

    invoke-direct {v1, p0}, Lo/eyy$1;-><init>(Lo/eyy;)V

    invoke-virtual {v0, v1}, Lo/eih;->setPagerNoMoreListener(Lo/eih$p;)V

    .line 170
    return-void
.end method

.method private g()V
    .locals 2

    .line 173
    iget-object v0, p0, Lo/eyy;->h:Lo/eih;

    new-instance v1, Lo/eyy$4;

    invoke-direct {v1, p0}, Lo/eyy$4;-><init>(Lo/eyy;)V

    invoke-virtual {v0, v1}, Lo/eih;->setOnMarkViewTextNotify(Lo/elc$c;)V

    .line 208
    return-void
.end method

.method static synthetic h(Lo/eyy;)Landroid/widget/TextView;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/eyy;->g:Landroid/widget/TextView;

    return-object v0
.end method

.method private h()V
    .locals 2

    .line 255
    invoke-virtual {p0}, Lo/eyy;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 257
    iget-object v0, p0, Lo/eyy;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 258
    iget-object v0, p0, Lo/eyy;->b:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$drawable;->arrow_left_normal:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 262
    :cond_0
    iget-object v0, p0, Lo/eyy;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$drawable;->arrow_left_normal:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 263
    iget-object v0, p0, Lo/eyy;->b:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 267
    :goto_0
    return-void
.end method

.method private i()V
    .locals 6

    .line 270
    sget v0, Lcom/huawei/ui/main/R$id;->older_switch_btn_outer_rect:I

    invoke-virtual {p0, v0}, Lo/eyy;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 271
    sget v0, Lcom/huawei/ui/main/R$id;->newer_switch_btn_outer_rect:I

    invoke-virtual {p0, v0}, Lo/eyy;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 273
    invoke-direct {p0}, Lo/eyy;->l()Z

    move-result v4

    .line 274
    if-eqz v4, :cond_0

    .line 275
    iget-object v0, p0, Lo/eyy;->e:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 276
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/view/View;->setClickable(Z)V

    .line 277
    iget-object v0, p0, Lo/eyy;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    .line 279
    :cond_0
    iget-object v0, p0, Lo/eyy;->e:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 280
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/view/View;->setClickable(Z)V

    .line 281
    iget-object v0, p0, Lo/eyy;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 284
    :goto_0
    invoke-direct {p0}, Lo/eyy;->n()Z

    move-result v5

    .line 285
    if-eqz v5, :cond_1

    .line 286
    iget-object v0, p0, Lo/eyy;->b:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 287
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/view/View;->setClickable(Z)V

    .line 288
    iget-object v0, p0, Lo/eyy;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_1

    .line 290
    :cond_1
    iget-object v0, p0, Lo/eyy;->b:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 291
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/view/View;->setClickable(Z)V

    .line 292
    iget-object v0, p0, Lo/eyy;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 294
    :goto_1
    return-void
.end method

.method private k()V
    .locals 2

    .line 242
    iget-object v0, p0, Lo/eyy;->h:Lo/eih;

    new-instance v1, Lo/eyy$2;

    invoke-direct {v1, p0}, Lo/eyy$2;-><init>(Lo/eyy;)V

    invoke-virtual {v0, v1}, Lo/eih;->d(Lo/eih$m;)V

    .line 249
    return-void
.end method

.method private l()Z
    .locals 1

    .line 297
    iget-object v0, p0, Lo/eyy;->h:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->ad()Z

    move-result v0

    return v0
.end method

.method private n()Z
    .locals 1

    .line 301
    iget-object v0, p0, Lo/eyy;->h:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->aj()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 330
    iget-object v0, p0, Lo/eyy;->k:Ljava/lang/String;

    return-object v0
.end method

.method public a(Lo/eic;)V
    .locals 3

    .line 334
    invoke-virtual {p1}, Lo/eic;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 335
    return-void

    .line 337
    :cond_0
    iget-object v0, p0, Lo/eyy;->h:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->G()Lo/ehi;

    move-result-object v2

    .line 338
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    invoke-virtual {v2, v0}, Lo/ehi;->a(F)Lo/ehi;

    move-result-object v0

    .line 339
    const/high16 v1, 0x42000000    # 32.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    invoke-virtual {v0, v1}, Lo/ehi;->d(F)Lo/ehi;

    move-result-object v0

    .line 340
    const/high16 v1, 0x42000000    # 32.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    invoke-virtual {v0, v1}, Lo/ehi;->c(F)Lo/ehi;

    move-result-object v0

    .line 341
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ehi;->h(F)Lo/ehi;

    .line 342
    iget-object v0, p0, Lo/eyy;->h:Lo/eih;

    invoke-virtual {v0, v2}, Lo/eih;->d(Lo/ehi;)V

    .line 343
    return-void
.end method

.method public b()Landroid/graphics/Bitmap;
    .locals 6

    .line 318
    iget-object v1, p0, Lo/eyy;->h:Lo/eih;

    .line 319
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v2

    .line 320
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v3

    .line 322
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 324
    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 325
    invoke-virtual {v1, v5}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 326
    return-object v4
.end method

.method protected abstract c()Lo/eih;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TChartT;"
        }
    .end annotation
.end method

.method public e()Lo/eih;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TChartT;"
        }
    .end annotation

    .line 305
    iget-object v0, p0, Lo/eyy;->h:Lo/eih;

    return-object v0
.end method

.method public setDataTextViewOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 235
    iget-object v0, p0, Lo/eyy;->d:Lo/eyz;

    invoke-virtual {v0, p1}, Lo/eyz;->setContentOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 236
    return-void
.end method

.method public setHost(Lo/ezh;)V
    .locals 0

    .line 310
    iput-object p1, p0, Lo/eyy;->p:Lo/ezh;

    .line 311
    return-void
.end method

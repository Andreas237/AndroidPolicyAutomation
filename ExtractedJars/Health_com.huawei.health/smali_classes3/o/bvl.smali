.class public Lo/bvl;
.super Landroid/support/v4/view/PagerAdapter;
.source "SourceFile"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bvl$d;
    }
.end annotation


# instance fields
.field private A:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

.field private C:Lo/bvl$d;

.field private D:Landroid/os/Handler;

.field private a:I

.field private b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private c:Landroid/widget/LinearLayout;

.field private d:Lo/bvu;

.field private e:Ljava/util/List;

.field private f:Lo/efy;

.field private g:Landroid/widget/ImageView;

.field private h:Lo/efy;

.field private i:Landroid/view/TextureView;

.field private k:Lo/efy;

.field private l:Lo/efy;

.field private m:Landroid/widget/LinearLayout;

.field private n:Lo/efy;

.field private o:Landroid/widget/LinearLayout;

.field private p:Lo/efy;

.field private q:Landroid/widget/ImageView;

.field private r:Lo/efy;

.field private s:Lo/efy;

.field private t:Landroid/widget/RelativeLayout;

.field private u:Lo/efy;

.field private v:Z

.field private w:Lo/efy;

.field private x:Ljava/lang/String;

.field private y:Landroid/view/Surface;

.field private z:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Ljava/util/List;I)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 80
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 73
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bvl;->v:Z

    .line 78
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/bvl;->D:Landroid/os/Handler;

    .line 81
    iput-object p1, p0, Lo/bvl;->e:Ljava/util/List;

    .line 82
    iput p2, p0, Lo/bvl;->a:I

    .line 83
    new-instance v0, Landroid/util/SparseArray;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    iput-object v0, p0, Lo/bvl;->b:Landroid/util/SparseArray;

    .line 84
    return-void
.end method

.method static synthetic b(Lo/bvl;)Landroid/widget/ImageView;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/bvl;->z:Landroid/widget/ImageView;

    return-object v0
.end method

.method private b()V
    .locals 3

    .line 342
    new-instance v2, Landroid/view/animation/AlphaAnimation;

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-direct {v2, v0, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 343
    new-instance v0, Lo/bvl$3;

    invoke-direct {v0, p0}, Lo/bvl$3;-><init>(Lo/bvl;)V

    invoke-virtual {v2, v0}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 358
    const-wide/16 v0, 0x96

    invoke-virtual {v2, v0, v1}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 359
    iget-object v0, p0, Lo/bvl;->t:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 360
    return-void
.end method

.method private b(Landroid/view/View;)V
    .locals 4

    .line 182
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachi_iv_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bvl;->z:Landroid/widget/ImageView;

    .line 183
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_iv_coach_intro_orign:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bvl;->g:Landroid/widget/ImageView;

    .line 184
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_intro_orign_new_textview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bvl;->k:Lo/efy;

    .line 186
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_ll_first:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bvl;->c:Landroid/widget/LinearLayout;

    .line 187
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachi_sv_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/TextureView;

    iput-object v0, p0, Lo/bvl;->i:Landroid/view/TextureView;

    .line 188
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachi_tv_actiontitle:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bvl;->h:Lo/efy;

    .line 189
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachi_tv_traindif:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bvl;->f:Lo/efy;

    .line 190
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_trainpoint:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bvl;->u:Lo/efy;

    .line 192
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachi_tv_trainpoint:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bvl;->p:Lo/efy;

    .line 193
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachi_tv_equipment:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bvl;->n:Lo/efy;

    .line 194
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachi_tv_des:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bvl;->l:Lo/efy;

    .line 195
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_downloading:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bvl;->m:Landroid/widget/LinearLayout;

    .line 196
    sget v0, Lcom/huawei/health/suggestion/R$id;->ll_nowifi:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bvl;->o:Landroid/widget/LinearLayout;

    .line 197
    sget v0, Lcom/huawei/health/suggestion/R$id;->iv_download:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bvl;->q:Landroid/widget/ImageView;

    .line 198
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_headView:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/bvl;->t:Landroid/widget/RelativeLayout;

    .line 199
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_downloading_progress:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bvl;->s:Lo/efy;

    .line 200
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_audio_size:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bvl;->r:Lo/efy;

    .line 201
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_no_wifi_msg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bvl;->w:Lo/efy;

    .line 203
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 204
    iget-object v0, p0, Lo/bvl;->z:Landroid/widget/ImageView;

    new-instance v1, Lo/bzb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {v2, v3}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    invoke-direct {v1, v2}, Lo/bzb;-><init>(F)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 205
    iget-object v0, p0, Lo/bvl;->z:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setClipToOutline(Z)V

    .line 206
    iget-object v0, p0, Lo/bvl;->t:Landroid/widget/RelativeLayout;

    new-instance v1, Lo/bzb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {v2, v3}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    invoke-direct {v1, v2}, Lo/bzb;-><init>(F)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 207
    iget-object v0, p0, Lo/bvl;->t:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClipToOutline(Z)V

    .line 209
    :cond_0
    return-void
.end method

.method static synthetic d(Lo/bvl;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/bvl;->t:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic e(Lo/bvl;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lo/bvl;->b()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 251
    iput-boolean p1, p0, Lo/bvl;->v:Z

    .line 252
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 255
    iput-object p1, p0, Lo/bvl;->x:Ljava/lang/String;

    .line 256
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .line 336
    iget-object v0, p0, Lo/bvl;->r:Lo/efy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 337
    iget-object v0, p0, Lo/bvl;->r:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 339
    :cond_0
    return-void
.end method

.method public c(Lo/bvl$d;)V
    .locals 0

    .line 311
    iput-object p1, p0, Lo/bvl;->C:Lo/bvl$d;

    .line 312
    return-void
.end method

.method public d(I)V
    .locals 4

    .line 259
    if-nez p1, :cond_0

    .line 260
    iget-object v0, p0, Lo/bvl;->t:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 261
    iget-object v0, p0, Lo/bvl;->t:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 263
    iget-object v0, p0, Lo/bvl;->m:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 264
    iget-object v0, p0, Lo/bvl;->o:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 265
    iget-object v0, p0, Lo/bvl;->z:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_0

    .line 267
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 268
    iget-object v0, p0, Lo/bvl;->t:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 269
    iget-object v0, p0, Lo/bvl;->t:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 271
    iget-object v0, p0, Lo/bvl;->m:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 272
    iget-object v0, p0, Lo/bvl;->o:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 273
    iget-object v0, p0, Lo/bvl;->w:Lo/efy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 274
    iget-object v0, p0, Lo/bvl;->z:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_0

    .line 276
    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    .line 277
    iget-object v0, p0, Lo/bvl;->m:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 278
    iget-object v0, p0, Lo/bvl;->m:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 279
    iget-object v0, p0, Lo/bvl;->o:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 281
    :cond_2
    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    .line 282
    iget-object v0, p0, Lo/bvl;->t:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 283
    iget-object v0, p0, Lo/bvl;->t:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 284
    iget-object v0, p0, Lo/bvl;->m:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 285
    iget-object v0, p0, Lo/bvl;->o:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 286
    iget-object v0, p0, Lo/bvl;->w:Lo/efy;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 287
    iget-object v0, p0, Lo/bvl;->z:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 289
    :cond_3
    const/4 v0, 0x4

    if-ne p1, v0, :cond_4

    .line 290
    iget-object v0, p0, Lo/bvl;->t:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 291
    iget-object v0, p0, Lo/bvl;->t:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 292
    iget-object v0, p0, Lo/bvl;->z:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 293
    iget-object v0, p0, Lo/bvl;->z:Landroid/widget/ImageView;

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/huawei/health/suggestion/R$color;->color_normal_titlebar_title:I

    invoke-static {v2, v3}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 296
    :cond_4
    :goto_0
    return-void
.end method

.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 2

    .line 175
    iget-object v0, p0, Lo/bvl;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/view/View;

    .line 176
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 177
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 179
    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    .line 330
    iget-object v0, p0, Lo/bvl;->s:Lo/efy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 331
    iget-object v0, p0, Lo/bvl;->s:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 333
    :cond_0
    return-void
.end method

.method public getCount()I
    .locals 2

    .line 88
    iget-object v0, p0, Lo/bvl;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/bvl;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public getItemPosition(Ljava/lang/Object;)I
    .locals 1

    .line 94
    const/4 v0, -0x2

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 9

    .line 104
    iget-object v0, p0, Lo/bvl;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/View;

    .line 105
    if-nez v5, :cond_0

    .line 106
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lo/bvl;->a:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 107
    invoke-direct {p0, v5}, Lo/bvl;->b(Landroid/view/View;)V

    .line 109
    :cond_0
    if-nez p2, :cond_6

    .line 110
    iget-object v0, p0, Lo/bvl;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    iput-object v0, p0, Lo/bvl;->A:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    .line 111
    iget-boolean v0, p0, Lo/bvl;->v:Z

    if-eqz v0, :cond_3

    .line 112
    iget-object v0, p0, Lo/bvl;->i:Landroid/view/TextureView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setVisibility(I)V

    .line 113
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    .line 114
    iget-object v0, p0, Lo/bvl;->i:Landroid/view/TextureView;

    new-instance v1, Lo/bzb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {v2, v3}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    invoke-direct {v1, v2}, Lo/bzb;-><init>(F)V

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 115
    iget-object v0, p0, Lo/bvl;->i:Landroid/view/TextureView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setClipToOutline(Z)V

    .line 117
    :cond_1
    iget-object v0, p0, Lo/bvl;->i:Landroid/view/TextureView;

    invoke-virtual {v0, p0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 118
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 119
    new-instance v0, Lo/bvu;

    iget-object v1, p0, Lo/bvl;->i:Landroid/view/TextureView;

    invoke-virtual {v1}, Landroid/view/TextureView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bvu;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/bvl;->d:Lo/bvu;

    goto :goto_0

    .line 121
    :cond_2
    new-instance v0, Lo/bvu;

    invoke-direct {v0}, Lo/bvu;-><init>()V

    iput-object v0, p0, Lo/bvl;->d:Lo/bvu;

    .line 123
    :goto_0
    iget-object v0, p0, Lo/bvl;->d:Lo/bvu;

    iget-object v1, p0, Lo/bvl;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bvu;->e(Ljava/lang/String;)V

    .line 124
    iget-object v0, p0, Lo/bvl;->d:Lo/bvu;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    iget-object v2, p0, Lo/bvl;->A:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionPath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lo/bvu;->b([Ljava/lang/String;)Lo/bvz;

    goto :goto_1

    .line 127
    :cond_3
    iget-object v0, p0, Lo/bvl;->i:Landroid/view/TextureView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setVisibility(I)V

    .line 128
    iget-object v0, p0, Lo/bvl;->z:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 129
    iget-object v0, p0, Lo/bvl;->A:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquirePicUrl()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bvl;->z:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lo/cam;->e(Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 130
    const-string v0, "IntroPagerAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "instantiateItem2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    :goto_1
    const-string v0, ""

    iget-object v1, p0, Lo/bvl;->A:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireComeFrom(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 136
    iget-object v0, p0, Lo/bvl;->k:Lo/efy;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_coach_intro_orign_new_other:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 138
    :cond_4
    iget-object v0, p0, Lo/bvl;->k:Lo/efy;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_coach_intro_orign_new:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 141
    :goto_2
    iget-object v0, p0, Lo/bvl;->A:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->getOrignLog()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bvl;->g:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lo/cam;->e(Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 142
    iget-object v0, p0, Lo/bvl;->h:Lo/efy;

    iget-object v1, p0, Lo/bvl;->A:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 143
    iget-object v0, p0, Lo/bvl;->f:Lo/efy;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/bvl;->A:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireDifficulty()I

    move-result v2

    invoke-static {v1, v2}, Lo/buk;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 144
    iget-object v0, p0, Lo/bvl;->p:Lo/efy;

    iget-object v1, p0, Lo/bvl;->A:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->getTrainingpoints()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lo/buk;->d(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 145
    iget-object v0, p0, Lo/bvl;->u:Lo/efy;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/health/suggestion/R$string;->sug_coach_intro_poing:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bvl;->A:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->getTrainingpoints()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lo/buk;->d(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 146
    iget-object v0, p0, Lo/bvl;->A:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->getEquipments()Ljava/util/List;

    move-result-object v6

    .line 147
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_5

    .line 148
    iget-object v0, p0, Lo/bvl;->n:Lo/efy;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_intro_qixie:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 150
    :cond_5
    iget-object v0, p0, Lo/bvl;->n:Lo/efy;

    invoke-static {v6}, Lo/buk;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 152
    :goto_3
    iget-object v0, p0, Lo/bvl;->l:Lo/efy;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/bvl;->A:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->getDescription()Ljava/lang/String;

    move-result-object v2

    const-string v3, "-"

    sget v4, Lcom/huawei/health/suggestion/R$drawable;->sug_coach_intro_point:I

    invoke-static {v1, v2, v3, v4}, Lo/buk;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 153
    goto/16 :goto_5

    .line 154
    :cond_6
    iget-object v0, p0, Lo/bvl;->i:Landroid/view/TextureView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setVisibility(I)V

    .line 155
    iget-object v0, p0, Lo/bvl;->z:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 156
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/bvl;->e:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginFitnessAdvice/Cover;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/Cover;->getUrl()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/bvl;->z:Landroid/widget/ImageView;

    invoke-static {v0, v1, v2}, Lo/cam;->c(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 157
    iget-object v0, p0, Lo/bvl;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 158
    iget-object v0, p0, Lo/bvl;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/Cover;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/Cover;->getCoordinates()Ljava/util/List;

    move-result-object v6

    .line 159
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 160
    const/4 v8, 0x0

    :goto_4
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_7

    .line 161
    add-int/lit8 v0, v8, 0x1

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginFitnessAdvice/Coordinate;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/Coordinate;->getTip()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "/n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 160
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    .line 163
    :cond_7
    iget-object v0, p0, Lo/bvl;->l:Lo/efy;

    invoke-virtual {v0, v7}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 165
    :goto_5
    iget-object v0, p0, Lo/bvl;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p2, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 166
    iget-object v0, p0, Lo/bvl;->q:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 167
    iget-object v0, p0, Lo/bvl;->q:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 169
    :cond_8
    invoke-virtual {p1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 170
    return-object v5
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    .line 99
    if-ne p1, p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 300
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 301
    iget-object v0, p0, Lo/bvl;->q:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/bvl;->q:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getId()I

    move-result v0

    if-ne v2, v0, :cond_0

    .line 302
    iget-object v0, p0, Lo/bvl;->C:Lo/bvl$d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 303
    iget-object v0, p0, Lo/bvl;->C:Lo/bvl$d;

    invoke-interface {v0}, Lo/bvl$d;->d()V

    .line 306
    :cond_0
    return-void
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 4

    .line 213
    const-string v0, "IntroPagerAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSurfaceTextureAvailable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object v0, p0, Lo/bvl;->y:Landroid/view/Surface;

    .line 215
    iget-object v0, p0, Lo/bvl;->d:Lo/bvu;

    iget-object v1, p0, Lo/bvl;->y:Landroid/view/Surface;

    invoke-virtual {v0, v1}, Lo/bvu;->b(Landroid/view/Surface;)Lo/bvz;

    .line 216
    iget-object v0, p0, Lo/bvl;->d:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->i()Lo/bvz;

    .line 217
    iget-object v0, p0, Lo/bvl;->D:Landroid/os/Handler;

    new-instance v1, Lo/bvl$4;

    invoke-direct {v1, p0}, Lo/bvl$4;-><init>(Lo/bvl;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 227
    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 4

    .line 236
    const-string v0, "IntroPagerAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSurfaceTextureDestroyed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    iget-object v0, p0, Lo/bvl;->d:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->d()Lo/bvz;

    .line 242
    const/4 v0, 0x0

    return v0
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    .line 232
    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    .line 248
    return-void
.end method

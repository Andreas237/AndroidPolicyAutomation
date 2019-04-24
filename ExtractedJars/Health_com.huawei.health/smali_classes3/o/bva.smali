.class public Lo/bva;
.super Landroid/support/v4/view/PagerAdapter;
.source "SourceFile"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# instance fields
.field private a:Landroid/widget/LinearLayout;

.field private b:Lo/bvu;

.field private c:I

.field private d:Ljava/util/List;

.field private e:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private f:Lo/efy;

.field private g:Lo/efy;

.field private h:Landroid/view/TextureView;

.field private i:Landroid/widget/ImageView;

.field private k:Lo/efy;

.field private l:Lo/efy;

.field private m:Lo/efy;

.field private n:Lo/efy;

.field private o:Landroid/widget/ImageView;

.field private p:Lo/efy;

.field private q:Ljava/lang/String;

.field private r:Landroid/view/Surface;

.field private s:Landroid/os/Handler;

.field private t:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

.field private u:Z


# direct methods
.method public constructor <init>(Ljava/util/List;I)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 66
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 59
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bva;->u:Z

    .line 64
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/bva;->s:Landroid/os/Handler;

    .line 67
    iput-object p1, p0, Lo/bva;->d:Ljava/util/List;

    .line 68
    iput p2, p0, Lo/bva;->c:I

    .line 69
    new-instance v0, Landroid/util/SparseArray;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    iput-object v0, p0, Lo/bva;->e:Landroid/util/SparseArray;

    .line 70
    return-void
.end method

.method static synthetic c(Lo/bva;)Landroid/widget/ImageView;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/bva;->o:Landroid/widget/ImageView;

    return-object v0
.end method

.method private d(Landroid/view/View;)V
    .locals 4

    .line 161
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachi_iv_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bva;->o:Landroid/widget/ImageView;

    .line 162
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_iv_coach_intro_orign:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bva;->i:Landroid/widget/ImageView;

    .line 163
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_intro_orign_new_textview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bva;->k:Lo/efy;

    .line 165
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_ll_first:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bva;->a:Landroid/widget/LinearLayout;

    .line 166
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachi_sv_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/TextureView;

    iput-object v0, p0, Lo/bva;->h:Landroid/view/TextureView;

    .line 167
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachi_tv_actiontitle:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bva;->f:Lo/efy;

    .line 168
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachi_tv_traindif:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bva;->g:Lo/efy;

    .line 169
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_trainpoint:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bva;->n:Lo/efy;

    .line 171
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachi_tv_trainpoint:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bva;->m:Lo/efy;

    .line 172
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachi_tv_equipment:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bva;->p:Lo/efy;

    .line 173
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachi_tv_des:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bva;->l:Lo/efy;

    .line 175
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 176
    iget-object v0, p0, Lo/bva;->o:Landroid/widget/ImageView;

    new-instance v1, Lo/bzb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {v2, v3}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    invoke-direct {v1, v2}, Lo/bzb;-><init>(F)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 177
    iget-object v0, p0, Lo/bva;->o:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setClipToOutline(Z)V

    .line 179
    :cond_0
    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 2

    .line 154
    iget-object v0, p0, Lo/bva;->e:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/view/View;

    .line 155
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 156
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 158
    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lo/bva;->q:Ljava/lang/String;

    .line 215
    return-void
.end method

.method public getCount()I
    .locals 2

    .line 74
    iget-object v0, p0, Lo/bva;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/bva;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public getItemPosition(Ljava/lang/Object;)I
    .locals 1

    .line 80
    const/4 v0, -0x2

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 9

    .line 90
    iget-object v0, p0, Lo/bva;->e:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/View;

    .line 91
    if-nez v5, :cond_0

    .line 92
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lo/bva;->c:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 93
    invoke-direct {p0, v5}, Lo/bva;->d(Landroid/view/View;)V

    .line 95
    :cond_0
    if-nez p2, :cond_5

    .line 96
    iget-object v0, p0, Lo/bva;->d:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    iput-object v0, p0, Lo/bva;->t:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    .line 97
    iget-boolean v0, p0, Lo/bva;->u:Z

    if-eqz v0, :cond_2

    .line 98
    iget-object v0, p0, Lo/bva;->h:Landroid/view/TextureView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setVisibility(I)V

    .line 99
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    .line 100
    iget-object v0, p0, Lo/bva;->h:Landroid/view/TextureView;

    new-instance v1, Lo/bzb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {v2, v3}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    invoke-direct {v1, v2}, Lo/bzb;-><init>(F)V

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 101
    iget-object v0, p0, Lo/bva;->h:Landroid/view/TextureView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setClipToOutline(Z)V

    .line 103
    :cond_1
    iget-object v0, p0, Lo/bva;->h:Landroid/view/TextureView;

    invoke-virtual {v0, p0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 104
    new-instance v0, Lo/bvu;

    invoke-direct {v0}, Lo/bvu;-><init>()V

    iput-object v0, p0, Lo/bva;->b:Lo/bvu;

    .line 105
    iget-object v0, p0, Lo/bva;->b:Lo/bvu;

    iget-object v1, p0, Lo/bva;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bvu;->e(Ljava/lang/String;)V

    .line 106
    iget-object v0, p0, Lo/bva;->b:Lo/bvu;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    iget-object v2, p0, Lo/bva;->t:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionPath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lo/bvu;->b([Ljava/lang/String;)Lo/bvz;

    goto :goto_0

    .line 109
    :cond_2
    iget-object v0, p0, Lo/bva;->h:Landroid/view/TextureView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setVisibility(I)V

    .line 110
    iget-object v0, p0, Lo/bva;->o:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 111
    iget-object v0, p0, Lo/bva;->t:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquirePicUrl()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bva;->o:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lo/cam;->e(Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 112
    const-string v0, "CoachVedioPlayPageAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "instantiateItem2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    :goto_0
    const-string v0, ""

    iget-object v1, p0, Lo/bva;->t:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireComeFrom(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 118
    iget-object v0, p0, Lo/bva;->k:Lo/efy;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_coach_intro_orign_new_other:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 120
    :cond_3
    iget-object v0, p0, Lo/bva;->k:Lo/efy;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_coach_intro_orign_new:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 123
    :goto_1
    iget-object v0, p0, Lo/bva;->t:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->getOrignLog()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bva;->i:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lo/cam;->e(Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 124
    iget-object v0, p0, Lo/bva;->f:Lo/efy;

    iget-object v1, p0, Lo/bva;->t:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 125
    iget-object v0, p0, Lo/bva;->g:Lo/efy;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/bva;->t:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireDifficulty()I

    move-result v2

    invoke-static {v1, v2}, Lo/buk;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 126
    iget-object v0, p0, Lo/bva;->m:Lo/efy;

    iget-object v1, p0, Lo/bva;->t:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->getTrainingpoints()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lo/buk;->d(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 127
    iget-object v0, p0, Lo/bva;->n:Lo/efy;

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

    iget-object v2, p0, Lo/bva;->t:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->getTrainingpoints()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lo/buk;->d(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 128
    iget-object v0, p0, Lo/bva;->t:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->getEquipments()Ljava/util/List;

    move-result-object v6

    .line 129
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 130
    iget-object v0, p0, Lo/bva;->p:Lo/efy;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_intro_qixie:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 132
    :cond_4
    iget-object v0, p0, Lo/bva;->p:Lo/efy;

    invoke-static {v6}, Lo/buk;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 134
    :goto_2
    iget-object v0, p0, Lo/bva;->l:Lo/efy;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/bva;->t:Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->getDescription()Ljava/lang/String;

    move-result-object v2

    const-string v3, "-"

    sget v4, Lcom/huawei/health/suggestion/R$drawable;->sug_coach_intro_point:I

    invoke-static {v1, v2, v3, v4}, Lo/buk;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 135
    goto/16 :goto_4

    .line 136
    :cond_5
    iget-object v0, p0, Lo/bva;->h:Landroid/view/TextureView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setVisibility(I)V

    .line 137
    iget-object v0, p0, Lo/bva;->o:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 138
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/bva;->d:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginFitnessAdvice/Cover;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/Cover;->getUrl()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/bva;->o:Landroid/widget/ImageView;

    invoke-static {v0, v1, v2}, Lo/cam;->c(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 139
    iget-object v0, p0, Lo/bva;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 140
    iget-object v0, p0, Lo/bva;->d:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/Cover;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/Cover;->getCoordinates()Ljava/util/List;

    move-result-object v6

    .line 141
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 142
    const/4 v8, 0x0

    :goto_3
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_6

    .line 143
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

    .line 142
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 145
    :cond_6
    iget-object v0, p0, Lo/bva;->l:Lo/efy;

    invoke-virtual {v0, v7}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 147
    :goto_4
    iget-object v0, p0, Lo/bva;->e:Landroid/util/SparseArray;

    invoke-virtual {v0, p2, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 148
    invoke-virtual {p1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 149
    return-object v5
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    .line 85
    if-ne p1, p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 4

    .line 183
    const-string v0, "CoachVedioPlayPageAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSurfaceTextureAvailable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object v0, p0, Lo/bva;->r:Landroid/view/Surface;

    .line 185
    iget-object v0, p0, Lo/bva;->b:Lo/bvu;

    iget-object v1, p0, Lo/bva;->r:Landroid/view/Surface;

    invoke-virtual {v0, v1}, Lo/bvu;->b(Landroid/view/Surface;)Lo/bvz;

    .line 186
    iget-object v0, p0, Lo/bva;->b:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->i()Lo/bvz;

    .line 187
    iget-object v0, p0, Lo/bva;->s:Landroid/os/Handler;

    new-instance v1, Lo/bva$5;

    invoke-direct {v1, p0}, Lo/bva$5;-><init>(Lo/bva;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 194
    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 4

    .line 203
    const-string v0, "CoachVedioPlayPageAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSurfaceTextureDestroyed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    iget-object v0, p0, Lo/bva;->b:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->d()Lo/bvz;

    .line 205
    const/4 v0, 0x0

    return v0
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    .line 199
    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    .line 211
    return-void
.end method

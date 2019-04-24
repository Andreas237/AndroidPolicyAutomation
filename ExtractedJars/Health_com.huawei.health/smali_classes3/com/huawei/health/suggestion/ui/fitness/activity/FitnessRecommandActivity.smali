.class public Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;
.super Lcom/huawei/health/suggestion/ui/BaseStateActivity;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Attribute;>;"
        }
    .end annotation
.end field

.field private g:Lcom/huawei/health/suggestion/model/Filter;

.field private h:Ljava/lang/String;

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Attribute;>;"
        }
    .end annotation
.end field

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Attribute;>;"
        }
    .end annotation
.end field

.field private l:I

.field private m:I

.field private n:Lcom/huawei/pluginFitnessAdvice/Attribute;

.field private o:I

.field private p:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/efy;>;"
        }
    .end annotation
.end field

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/widget/LinearLayout;>;"
        }
    .end annotation
.end field

.field private t:Lcom/huawei/pluginFitnessAdvice/Attribute;

.field private u:Lcom/huawei/pluginFitnessAdvice/Attribute;

.field private v:Landroid/content/Context;

.field private x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/widget/PopupWindow;>;"
        }
    .end annotation
.end field

.field private z:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 51
    const-class v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 49
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;-><init>()V

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->l:I

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->r:Ljava/util/List;

    .line 70
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->q:Ljava/util/List;

    .line 72
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->s:Ljava/util/List;

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->x:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)Ljava/util/List;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->q:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)Ljava/util/List;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->x:Ljava/util/List;

    return-object v0
.end method

.method private b(I[Ljava/lang/String;)V
    .locals 7

    .line 264
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->r:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/efy;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->q:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget-object v1, p2, v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 266
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->v:Landroid/content/Context;

    move-object v1, p2

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->s:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v4

    new-instance v5, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$1;

    invoke-direct {v5, p0, p1, p2}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$1;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;I[Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/PopupWindowSpinnerCreator;->createSpinnerPopupWindow(Landroid/content/Context;[Ljava/lang/String;IZILandroid/widget/RadioGroup$OnCheckedChangeListener;)Landroid/widget/PopupWindow;

    move-result-object v6

    .line 285
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->x:Ljava/util/List;

    invoke-interface {v0, p1, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 286
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)Ljava/util/List;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->s:Ljava/util/List;

    return-object v0
.end method

.method private c(I)V
    .locals 5

    .line 369
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->x:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/PopupWindow;

    .line 370
    if-nez v4, :cond_0

    .line 371
    sget-object v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mPopSportType == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    return-void

    .line 374
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 375
    invoke-virtual {v4}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 376
    invoke-virtual {v4}, Landroid/widget/PopupWindow;->dismiss()V

    goto :goto_0

    .line 378
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->s:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 380
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->h:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->h:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->p:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;I)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->c(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;Ljava/lang/String;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->e(Ljava/lang/String;)V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 4

    .line 208
    if-eqz p1, :cond_1

    .line 209
    const-class v0, Lcom/huawei/health/suggestion/model/Filter;

    invoke-static {p1, v0}, Lo/cae;->d(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/Filter;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->g:Lcom/huawei/health/suggestion/model/Filter;

    .line 211
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->g:Lcom/huawei/health/suggestion/model/Filter;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Filter;->getClasses()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->k:Ljava/util/List;

    .line 213
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->g:Lcom/huawei/health/suggestion/model/Filter;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Filter;->getParts()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->f:Ljava/util/List;

    .line 215
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->g:Lcom/huawei/health/suggestion/model/Filter;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Filter;->getLevels()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->i:Ljava/util/List;

    .line 217
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->i:Ljava/util/List;

    invoke-static {v0}, Lo/buk;->c(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 218
    sget-object v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "---filter data have no levels ,,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->i:Ljava/util/List;

    .line 220
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/huawei/pluginFitnessAdvice/Attribute;

    const/4 v2, 0x6

    invoke-static {v2}, Lo/bsn;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x6

    invoke-direct {v1, v3, v2}, Lcom/huawei/pluginFitnessAdvice/Attribute;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 222
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/huawei/pluginFitnessAdvice/Attribute;

    const/4 v2, 0x0

    invoke-static {v2}, Lo/bsn;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2}, Lcom/huawei/pluginFitnessAdvice/Attribute;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 223
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/huawei/pluginFitnessAdvice/Attribute;

    const/4 v2, 0x1

    invoke-static {v2}, Lo/bsn;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v3, v2}, Lcom/huawei/pluginFitnessAdvice/Attribute;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 224
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->i:Ljava/util/List;

    new-instance v1, Lcom/huawei/pluginFitnessAdvice/Attribute;

    const/4 v2, 0x2

    invoke-static {v2}, Lo/bsn;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {v1, v3, v2}, Lcom/huawei/pluginFitnessAdvice/Attribute;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 227
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->k:Ljava/util/List;

    invoke-static {v0}, Lo/bvq;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->k:Ljava/util/List;

    .line 228
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->f:Ljava/util/List;

    invoke-static {v0}, Lo/bvq;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->f:Ljava/util/List;

    .line 230
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->k:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->u:Lcom/huawei/pluginFitnessAdvice/Attribute;

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 231
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->f:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->n:Lcom/huawei/pluginFitnessAdvice/Attribute;

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 232
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->i:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->t:Lcom/huawei/pluginFitnessAdvice/Attribute;

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 235
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->f:Ljava/util/List;

    invoke-static {v0}, Lo/bvq;->c(Ljava/util/List;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->b(I[Ljava/lang/String;)V

    .line 236
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->k:Ljava/util/List;

    invoke-static {v0}, Lo/bvq;->c(Ljava/util/List;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->b(I[Ljava/lang/String;)V

    .line 237
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->i:Ljava/util/List;

    invoke-static {v0}, Lo/bvq;->c(Ljava/util/List;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {p0, v1, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->b(I[Ljava/lang/String;)V

    .line 255
    :cond_1
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)Ljava/util/List;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->r:Ljava/util/List;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->n()V

    return-void
.end method

.method private l()V
    .locals 10

    .line 329
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->l:I

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->k:Ljava/util/List;

    invoke-static {v0, v1}, Lo/bvq;->d(ILjava/util/List;)[Ljava/lang/Integer;

    move-result-object v6

    .line 330
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->o:I

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->i:Ljava/util/List;

    invoke-static {v0, v1}, Lo/bvq;->d(ILjava/util/List;)[Ljava/lang/Integer;

    move-result-object v7

    .line 331
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->m:I

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->f:Ljava/util/List;

    invoke-static {v0, v1}, Lo/bvq;->d(ILjava/util/List;)[Ljava/lang/Integer;

    move-result-object v8

    .line 332
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->p:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    move-object v1, v6

    move-object v2, v7

    move-object v3, v8

    const/4 v4, -0x1

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->b([Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;)V

    .line 334
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 335
    if-eqz v6, :cond_0

    .line 336
    const-string v0, "types"

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    :cond_0
    if-eqz v7, :cond_1

    .line 339
    const-string v0, "levels"

    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    :cond_1
    if-eqz v8, :cond_2

    .line 343
    const-string v0, "parts"

    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    :cond_2
    const-string v0, "1130009"

    invoke-static {v0, v9}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 346
    return-void
.end method

.method private m()V
    .locals 2

    .line 180
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$5;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)V

    invoke-interface {v0, v1}, Lo/bsp;->c(Lo/bui;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->h:Ljava/lang/String;

    .line 205
    return-void
.end method

.method private n()V
    .locals 7

    .line 289
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->c:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 291
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->q:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->m:I

    .line 292
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->f:Ljava/util/List;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->m:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/pluginFitnessAdvice/Attribute;

    .line 293
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->q:Ljava/util/List;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->l:I

    .line 294
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->k:Ljava/util/List;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->l:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginFitnessAdvice/Attribute;

    .line 295
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->q:Ljava/util/List;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->o:I

    .line 296
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->k:Ljava/util/List;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->o:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/pluginFitnessAdvice/Attribute;

    .line 298
    sget-object v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8bad\u7ec3\u7b49\u7ea7: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/pluginFitnessAdvice/Attribute;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/pluginFitnessAdvice/Attribute;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n\u8bad\u7ec3\u7c7b\u578b: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 299
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/Attribute;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/Attribute;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n\u8bad\u7ec3\u90e8\u4f4d: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 300
    invoke-virtual {v4}, Lcom/huawei/pluginFitnessAdvice/Attribute;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/pluginFitnessAdvice/Attribute;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 298
    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->l()V

    .line 302
    return-void
.end method

.method static synthetic p()Ljava/lang/String;
    .locals 1

    .line 49
    sget-object v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->d:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public d()I
    .locals 1

    .line 98
    const/4 v0, 0x0

    return v0
.end method

.method public g()V
    .locals 1

    .line 103
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_activity_recoall:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->setContentView(I)V

    .line 104
    return-void
.end method

.method public h()I
    .locals 1

    .line 93
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_loading_layout:I

    return v0
.end method

.method public i()V
    .locals 4

    .line 167
    new-instance v0, Lcom/huawei/pluginFitnessAdvice/Attribute;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_hwh_sug_fitness_recom_body:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Lcom/huawei/pluginFitnessAdvice/Attribute;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->n:Lcom/huawei/pluginFitnessAdvice/Attribute;

    .line 168
    new-instance v0, Lcom/huawei/pluginFitnessAdvice/Attribute;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_hwh_sug_fitness_recom_type:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Lcom/huawei/pluginFitnessAdvice/Attribute;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->u:Lcom/huawei/pluginFitnessAdvice/Attribute;

    .line 169
    new-instance v0, Lcom/huawei/pluginFitnessAdvice/Attribute;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_hwh_sug_fitness_recom_level:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Lcom/huawei/pluginFitnessAdvice/Attribute;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->t:Lcom/huawei/pluginFitnessAdvice/Attribute;

    .line 171
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->p:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    .line 172
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 173
    const-string v0, "type"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 174
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->p:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    invoke-virtual {v0, v3}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->setArguments(Landroid/os/Bundle;)V

    .line 175
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->c:Landroid/view/View;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 176
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->m()V

    .line 177
    return-void
.end method

.method public k()V
    .locals 6

    .line 112
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->e:Lo/emr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setDoubleClickEnable(Z)V

    .line 113
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->e:Lo/emr;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$2;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setBackToTopListener(Lo/emr$a;)V

    .line 120
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->s:Ljava/util/List;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_fitness_bodypart:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->s:Ljava/util/List;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_fitness_traintype:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->s:Ljava/util/List;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_fitness_trainlevel:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitness_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/emr;

    .line 131
    new-instance v3, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$3;

    invoke-direct {v3, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$3;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout;

    .line 144
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->r:Ljava/util/List;

    sget v1, Lcom/huawei/health/suggestion/R$id;->text1:I

    invoke-virtual {v5, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lo/efy;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->x:Ljava/util/List;

    new-instance v1, Landroid/widget/PopupWindow;

    invoke-direct {v1}, Landroid/widget/PopupWindow;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->q:Ljava/util/List;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 147
    invoke-virtual {v5, v3}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 148
    goto :goto_0

    .line 155
    :cond_0
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$4;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)V

    invoke-virtual {v2, v0}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 163
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 83
    invoke-super {p0, p1}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onCreate(Landroid/os/Bundle;)V

    .line 84
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x1000000

    const/high16 v2, 0x1000000

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 85
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->z:J

    .line 86
    iput-object p0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->v:Landroid/content/Context;

    .line 88
    return-void
.end method

.method public onDestroy()V
    .locals 7

    .line 350
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onDestroy()V

    .line 351
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_0

    .line 352
    return-void

    .line 354
    :cond_0
    const/4 v5, 0x0

    .line 355
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "entrance"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 356
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "entrance"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 358
    :cond_1
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 359
    const-string v5, "otherModel"

    .line 361
    :cond_2
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 362
    const-string v0, "entrance"

    invoke-interface {v6, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    const-string v0, "stay_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->z:J

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    const-string v0, "1130016"

    invoke-static {v0, v6}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 365
    return-void
.end method

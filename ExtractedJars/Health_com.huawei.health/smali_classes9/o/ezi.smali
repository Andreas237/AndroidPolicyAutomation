.class public Lo/ezi;
.super Lo/ezj;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ezi$f;,
        Lo/ezi$d;,
        Lo/ezi$i;,
        Lo/ezi$g;,
        Lo/ezi$a;,
        Lo/ezi$b;,
        Lo/ezi$c;,
        Lo/ezi$e;
    }
.end annotation


# static fields
.field public static final c:Lo/ehe$a;


# instance fields
.field protected a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ezj;>;"
        }
    .end annotation
.end field

.field protected b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lo/ehe$a;Lo/eii;>;"
        }
    .end annotation
.end field

.field protected d:Lo/ezi$d;

.field protected e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ehe$a;>;"
        }
    .end annotation
.end field

.field protected g:Z

.field private h:Landroid/view/View;

.field protected k:Lo/ezj;

.field private l:Lo/ezi$e;

.field private m:Landroid/view/View;

.field private n:Landroid/support/v7/widget/RecyclerView;

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ezi$i;>;"
        }
    .end annotation
.end field

.field private p:Lo/ezi$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Lo/ehe$a;

    invoke-direct {v0}, Lo/ehe$a;-><init>()V

    sput-object v0, Lo/ezi;->c:Lo/ehe$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/ezh;)V
    .locals 2

    .line 52
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lo/ezj;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ezi;->e:Ljava/util/List;

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ezi;->a:Ljava/util/List;

    .line 41
    new-instance v0, Lo/ezi$d;

    invoke-direct {v0}, Lo/ezi$d;-><init>()V

    iput-object v0, p0, Lo/ezi;->d:Lo/ezi$d;

    .line 42
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/ezi;->b:Ljava/util/Map;

    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ezi;->g:Z

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezi;->k:Lo/ezj;

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ezi;->o:Ljava/util/List;

    .line 53
    invoke-direct {p0}, Lo/ezi;->e()V

    .line 54
    return-void
.end method

.method static synthetic a(Lo/ezi;)Landroid/view/View;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/ezi;->m:Landroid/view/View;

    return-object v0
.end method

.method static synthetic b(Lo/ezi;)Lo/ezi$g;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/ezi;->p:Lo/ezi$g;

    return-object v0
.end method

.method static synthetic c(Lo/ezi;)Landroid/view/View;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/ezi;->h:Landroid/view/View;

    return-object v0
.end method

.method private d(Z)V
    .locals 0

    .line 350
    iput-boolean p1, p0, Lo/ezi;->g:Z

    .line 351
    return-void
.end method

.method static synthetic e(Lo/ezi;)Ljava/util/List;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/ezi;->o:Ljava/util/List;

    return-object v0
.end method

.method private e()V
    .locals 5

    .line 57
    invoke-virtual {p0}, Lo/ezi;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->multi_view_data_observer_view:I

    invoke-static {v0, v1, p0}, Lo/ezi;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ezi;->a:Ljava/util/List;

    .line 63
    new-instance v0, Lo/ezi$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/ezi$e;-><init>(Lo/ezi;Lo/ezi$2;)V

    iput-object v0, p0, Lo/ezi;->l:Lo/ezi$e;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezi;->p:Lo/ezi$g;

    .line 66
    new-instance v0, Landroid/view/View;

    invoke-virtual {p0}, Lo/ezi;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ezi;->m:Landroid/view/View;

    .line 67
    iget-object v0, p0, Lo/ezi;->m:Landroid/view/View;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setMinimumWidth(I)V

    .line 68
    iget-object v0, p0, Lo/ezi;->m:Landroid/view/View;

    const/high16 v1, 0x42000000    # 32.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 70
    new-instance v0, Landroid/view/View;

    invoke-virtual {p0}, Lo/ezi;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ezi;->h:Landroid/view/View;

    .line 71
    iget-object v0, p0, Lo/ezi;->h:Landroid/view/View;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setMinimumWidth(I)V

    .line 72
    iget-object v0, p0, Lo/ezi;->h:Landroid/view/View;

    const/high16 v1, 0x42000000    # 32.0f

    invoke-static {v1}, Lo/oc;->b(F)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 75
    sget v0, Lcom/huawei/ui/main/R$id;->observer_view_container:I

    invoke-virtual {p0, v0}, Lo/ezi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lo/ezi;->n:Landroid/support/v7/widget/RecyclerView;

    .line 76
    iget-object v0, p0, Lo/ezi;->n:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lo/ezi;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 77
    iget-object v0, p0, Lo/ezi;->n:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lo/ezi;->l:Lo/ezi$e;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 79
    return-void
.end method

.method private h()V
    .locals 2

    .line 354
    iget-boolean v0, p0, Lo/ezi;->g:Z

    if-eqz v0, :cond_0

    .line 355
    iget-object v0, p0, Lo/ezi;->a:Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/ezi;->b(Ljava/util/List;)Lo/ezi$g;

    move-result-object v0

    iput-object v0, p0, Lo/ezi;->p:Lo/ezi$g;

    .line 356
    iget-object v0, p0, Lo/ezi;->p:Lo/ezi$g;

    invoke-virtual {v0}, Lo/ezi$g;->d()V

    .line 358
    iget-object v0, p0, Lo/ezi;->p:Lo/ezi$g;

    new-instance v1, Lo/ezi$2;

    invoke-direct {v1, p0}, Lo/ezi$2;-><init>(Lo/ezi;)V

    invoke-virtual {v0, v1}, Lo/ezi$g;->a(Lo/ezi$i;)V

    .line 377
    iget-object v0, p0, Lo/ezi;->p:Lo/ezi$g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ezi$g;->e(I)V

    .line 378
    new-instance v0, Lo/ezi$d;

    invoke-direct {v0}, Lo/ezi$d;-><init>()V

    iput-object v0, p0, Lo/ezi;->d:Lo/ezi$d;

    .line 379
    iget-object v0, p0, Lo/ezi;->d:Lo/ezi$d;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/ezi$d;->e:Z

    .line 380
    iget-object v0, p0, Lo/ezi;->d:Lo/ezi$d;

    const/4 v1, 0x0

    iput-object v1, v0, Lo/ezi$d;->c:Lo/ezi$d$c;

    .line 382
    :cond_0
    return-void
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 1

    .line 329
    iget-object v0, p0, Lo/ezi;->h:Landroid/view/View;

    return-object v0
.end method

.method public a(Lo/eih;II)V
    .locals 3

    .line 319
    iget-object v0, p0, Lo/ezi;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ezj;

    .line 320
    invoke-virtual {v2, p1, p2, p3}, Lo/ezj;->a(Lo/eih;II)V

    .line 321
    goto :goto_0

    .line 322
    :cond_0
    return-void
.end method

.method public a(Lo/ezi$i;)V
    .locals 1

    .line 400
    iget-object v0, p0, Lo/ezi;->o:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 401
    return-void
.end method

.method protected b(Ljava/util/List;)Lo/ezi$g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ezj;>;)Lo/ezi$g;"
        }
    .end annotation

    .line 385
    new-instance v0, Lo/ezi$g;

    invoke-direct {v0, p0, p1}, Lo/ezi$g;-><init>(Lo/ezi;Ljava/util/List;)V

    return-object v0
.end method

.method public b()V
    .locals 0

    .line 390
    invoke-direct {p0}, Lo/ezi;->h()V

    .line 391
    return-void
.end method

.method public b(Ljava/util/List;Ljava/util/List;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ezj;>;Ljava/util/List<Lo/ehe$a;>;Z)V"
        }
    .end annotation

    .line 297
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ezj;

    .line 298
    instance-of v0, v3, Lo/ezt;

    if-nez v0, :cond_0

    .line 299
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "enableObserverView give to multiView need impls IFocusObserverItem"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 301
    :cond_0
    goto :goto_0

    .line 303
    :cond_1
    iget-object v0, p0, Lo/ezi;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 304
    iget-object v0, p0, Lo/ezi;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 306
    iget-object v0, p0, Lo/ezi;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 307
    iget-object v0, p0, Lo/ezi;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 309
    iget-object v0, p0, Lo/ezi;->l:Lo/ezi$e;

    invoke-virtual {v0}, Lo/ezi$e;->notifyDataSetChanged()V

    .line 310
    invoke-direct {p0, p3}, Lo/ezi;->d(Z)V

    .line 311
    return-void
.end method

.method public c()Lo/ezt;
    .locals 1

    .line 396
    iget-object v0, p0, Lo/ezi;->k:Lo/ezj;

    check-cast v0, Lo/ezt;

    return-object v0
.end method

.method public d()Landroid/view/View;
    .locals 1

    .line 325
    iget-object v0, p0, Lo/ezi;->m:Landroid/view/View;

    return-object v0
.end method

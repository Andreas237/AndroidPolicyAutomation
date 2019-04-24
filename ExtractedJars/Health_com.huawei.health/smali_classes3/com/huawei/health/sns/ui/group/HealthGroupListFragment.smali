.class public Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$e;
    }
.end annotation


# static fields
.field private static final l:Ljava/lang/Object;


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/support/v7/widget/RecyclerView;

.field private c:Landroid/app/Activity;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/group/Group;>;"
        }
    .end annotation
.end field

.field private e:Lo/bhl;

.field private f:Lo/ems;

.field private g:Landroid/view/View;

.field private h:Landroid/view/View;

.field private i:Landroid/view/View;

.field private k:Landroid/view/View;

.field private m:Lo/egn;

.field private n:Landroid/view/View;

.field private o:Landroid/view/View;

.field private p:Z

.field private q:Z

.field private r:Lo/atd;

.field private s:Lo/bgp;

.field private t:Landroid/os/Handler;

.field private u:Lo/asz;

.field private v:Z

.field private x:Z

.field private z:Lo/ems$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 81
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 63
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->d:Ljava/util/List;

    .line 86
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->p:Z

    .line 117
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->r:Lo/atd;

    .line 119
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->u:Lo/asz;

    .line 134
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->q:Z

    .line 139
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$e;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$e;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->t:Landroid/os/Handler;

    .line 144
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->x:Z

    .line 153
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->v:Z

    .line 326
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$5;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->z:Lo/ems$d;

    return-void
.end method

.method static synthetic a()Ljava/lang/Object;
    .locals 1

    .line 63
    sget-object v0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->l:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->n()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;Z)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->e(Z)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Landroid/view/View;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->h:Landroid/view/View;

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 356
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$4;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 362
    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Long;>;)V"
        }
    .end annotation

    .line 561
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$1;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)V

    invoke-static {p1, v0}, Lo/anz;->a(Ljava/util/List;Lo/aog;)V

    .line 609
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Z
    .locals 1

    .line 63
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->h()Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Ljava/util/List;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->d:Ljava/util/List;

    return-object v0
.end method

.method private d()Lo/asz;
    .locals 2

    .line 370
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->u:Lo/asz;

    if-nez v0, :cond_0

    .line 371
    new-instance v0, Lo/asz;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->t:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/asz;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->u:Lo/asz;

    .line 373
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->u:Lo/asz;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;Z)Z
    .locals 0

    .line 63
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->q:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Landroid/view/View;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->k:Landroid/view/View;

    return-object v0
.end method

.method private e()V
    .locals 1

    .line 380
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->p:Z

    .line 381
    return-void
.end method

.method private e(Landroid/view/View;)V
    .locals 6

    .line 277
    sget v0, Lcom/huawei/android/sns/R$id;->health_group_list_recyclerview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->b:Landroid/support/v7/widget/RecyclerView;

    .line 278
    sget v0, Lcom/huawei/android/sns/R$id;->group_tips1_txt:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->a:Landroid/widget/TextView;

    .line 279
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_no_group_tips1:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_no_group_tips2:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 280
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->d:Ljava/util/List;

    .line 281
    new-instance v0, Lo/bhl;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->d:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c:Landroid/app/Activity;

    invoke-direct {v0, v1, v2}, Lo/bhl;-><init>(Ljava/util/List;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->e:Lo/bhl;

    .line 282
    new-instance v4, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c:Landroid/app/Activity;

    invoke-direct {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 283
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 284
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 285
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->b:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->e:Lo/bhl;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 287
    sget v0, Lcom/huawei/android/sns/R$id;->create_group_btn_no_group:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->n:Landroid/view/View;

    .line 288
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->n:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 289
    sget v0, Lcom/huawei/android/sns/R$id;->scan_qr_btn_no_group:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->o:Landroid/view/View;

    .line 290
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->o:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 292
    sget v0, Lcom/huawei/android/sns/R$id;->group_lly:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->h:Landroid/view/View;

    .line 293
    sget v0, Lcom/huawei/android/sns/R$id;->no_group_rlt:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->k:Landroid/view/View;

    .line 294
    sget v0, Lcom/huawei/android/sns/R$id;->container_group_china:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->i:Landroid/view/View;

    .line 295
    sget v0, Lcom/huawei/android/sns/R$id;->not_china_llt:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->g:Landroid/view/View;

    .line 297
    sget v0, Lcom/huawei/android/sns/R$id;->health_group_list_toolbar:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ems;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->f:Lo/ems;

    .line 298
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$layout;->hw_toolbar_bottomview:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 299
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->f:Lo/ems;

    invoke-virtual {v0, v5}, Lo/ems;->d(Landroid/view/View;)V

    .line 300
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->f:Lo/ems;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->z:Lo/ems$d;

    invoke-virtual {v0, v1}, Lo/ems;->setOnSingleTapListener(Lo/ems$d;)V

    .line 302
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->f:Lo/ems;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_addition_create_group:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIcon(II)V

    .line 303
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->f:Lo/ems;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_create:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIconTitle(ILjava/lang/CharSequence;)V

    .line 305
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->f:Lo/ems;

    sget v1, Lcom/huawei/android/sns/R$drawable;->scan_qr:I

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIcon(II)V

    .line 306
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->f:Lo/ems;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_scan:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIconTitle(ILjava/lang/CharSequence;)V

    .line 308
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->f:Lo/ems;

    const/4 v1, 0x2

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Lo/ems;->setIconVisible(II)V

    .line 310
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->f:Lo/ems;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lo/ems;->a(Landroid/app/Activity;)V

    .line 312
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->i()V

    .line 314
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c()V

    .line 316
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->t:Landroid/os/Handler;

    const/16 v1, 0x1001

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 318
    return-void
.end method

.method private e(Z)V
    .locals 3

    .line 440
    const/16 v2, 0x32

    .line 441
    if-eqz p1, :cond_0

    .line 442
    const/16 v2, 0x31

    .line 444
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->g()Lo/atd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Lo/atd;->a(II)V

    .line 445
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;Z)Z
    .locals 0

    .line 63
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->x:Z

    return p1
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Lo/bhl;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->e:Lo/bhl;

    return-object v0
.end method

.method private f()Z
    .locals 4

    .line 500
    const/4 v0, 0x3

    new-array v3, v0, [Ljava/lang/String;

    const-string v0, "android.permission.CAMERA"

    const/4 v1, 0x0

    aput-object v0, v3, v1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x2

    aput-object v0, v3, v1

    .line 513
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_healthshop_permission_str:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v3, v1}, Lo/bhq;->d(Landroid/app/Activity;[Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private g()Lo/atd;
    .locals 2

    .line 453
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->r:Lo/atd;

    if-nez v0, :cond_0

    .line 454
    new-instance v0, Lo/atd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->t:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atd;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->r:Lo/atd;

    .line 456
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->r:Lo/atd;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Z
    .locals 1

    .line 63
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->f()Z

    move-result v0

    return v0
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->e()V

    return-void
.end method

.method private h()Z
    .locals 1

    .line 433
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->p:Z

    return v0
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Landroid/app/Activity;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c:Landroid/app/Activity;

    return-object v0
.end method

.method private i()V
    .locals 4

    .line 387
    new-instance v0, Lo/bgp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->t:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgp;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->s:Lo/bgp;

    .line 388
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->s:Lo/bgp;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 389
    return-void
.end method

.method private k()V
    .locals 4

    .line 396
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->m:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 397
    new-instance v0, Lo/egn;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, v1, v2}, Lo/egn;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->m:Lo/egn;

    .line 398
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->m:Lo/egn;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_sns_waiting:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 399
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->m:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 400
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->m:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 407
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 408
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->m:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 409
    const-string v0, "Group_HealthGroupListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    :cond_1
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->k()V

    return-void
.end method

.method static synthetic l(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Lo/asz;
    .locals 1

    .line 63
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->d()Lo/asz;

    move-result-object v0

    return-object v0
.end method

.method private n()V
    .locals 9

    .line 520
    const/4 v4, 0x1

    .line 521
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->d:Ljava/util/List;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 522
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 523
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 524
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->d:Ljava/util/List;

    invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 526
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    rem-int/lit8 v0, v0, 0x64

    if-nez v0, :cond_0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    div-int/lit8 v7, v0, 0x64

    goto :goto_0

    :cond_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    div-int/lit8 v0, v0, 0x64

    add-int/lit8 v7, v0, 0x1

    .line 530
    :goto_0
    const-string v0, "Group_HealthGroupListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "totalTimes = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 532
    const/4 v8, 0x0

    :goto_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_5

    .line 533
    if-ne v4, v7, :cond_2

    .line 534
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 535
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v8, v0, :cond_1

    .line 536
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->v:Z

    goto :goto_2

    .line 538
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->v:Z

    .line 540
    :goto_2
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->v:Z

    if-eqz v0, :cond_4

    .line 541
    invoke-direct {p0, v6}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c(Ljava/util/List;)V

    .line 542
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->v:Z

    .line 543
    const/4 v4, 0x1

    goto :goto_3

    .line 546
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->v:Z

    .line 547
    add-int/lit8 v0, v8, 0x1

    rem-int/lit8 v0, v0, 0x64

    if-eqz v0, :cond_3

    .line 548
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 550
    :cond_3
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 551
    invoke-direct {p0, v6}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c(Ljava/util/List;)V

    .line 552
    invoke-interface {v6}, Ljava/util/List;->clear()V

    .line 553
    add-int/lit8 v4, v4, 0x1

    .line 532
    :cond_4
    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_1

    .line 558
    :cond_5
    return-void
.end method

.method static synthetic o(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Landroid/os/Handler;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->t:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Z
    .locals 1

    .line 63
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->q:Z

    return v0
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 417
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->t:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->t:Landroid/os/Handler;

    const/16 v1, 0x1001

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 418
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->t:Landroid/os/Handler;

    const/16 v1, 0x1001

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 420
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->m:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 421
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->m:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 422
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->m:Lo/egn;

    .line 423
    const-string v0, "Group_HealthGroupListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroy mLoadingDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 425
    :cond_1
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 483
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->n:Landroid/view/View;

    if-ne p1, v0, :cond_0

    .line 484
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 485
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->startActivity(Landroid/content/Intent;)V

    .line 486
    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->o:Landroid/view/View;

    if-ne p1, v0, :cond_1

    .line 487
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 488
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeProxyActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 489
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->startActivity(Landroid/content/Intent;)V

    .line 492
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 270
    sget v0, Lcom/huawei/android/sns/R$layout;->fragment_health_group_list:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 271
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c:Landroid/app/Activity;

    .line 272
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->e(Landroid/view/View;)V

    .line 273
    return-object v2
.end method

.method public onDestroy()V
    .locals 0

    .line 322
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->b()V

    .line 323
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 324
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 462
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 464
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/dbf;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 465
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 466
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->g:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 468
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->i:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 469
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->g:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 475
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->x:Z

    if-eqz v0, :cond_1

    .line 476
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->x:Z

    .line 477
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->n()V

    .line 479
    :cond_1
    return-void
.end method

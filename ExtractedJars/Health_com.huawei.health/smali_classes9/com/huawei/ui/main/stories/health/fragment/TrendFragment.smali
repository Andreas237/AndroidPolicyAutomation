.class public Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;
.super Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;,
        Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$b;
    }
.end annotation


# instance fields
.field private A:Landroid/widget/LinearLayout;

.field private B:Landroid/widget/LinearLayout;

.field private C:Landroid/widget/LinearLayout;

.field private D:Lo/fde;

.field private E:Landroid/widget/LinearLayout;

.field private F:Landroid/widget/LinearLayout;

.field private G:Landroid/widget/ScrollView;

.field private H:Landroid/widget/LinearLayout;

.field private I:Landroid/widget/TextView;

.field private J:Landroid/widget/TextView;

.field private K:Lhuawei/widget/HwProgressBar;

.field private L:Ljava/util/Date;

.field private M:Landroid/widget/LinearLayout;

.field private N:Lo/fci;

.field private O:Landroid/widget/TextView;

.field private P:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private Q:Landroid/widget/TextView;

.field private R:Landroid/widget/TextView;

.field private S:Lo/fch;

.field private T:Landroid/widget/TextView;

.field private U:Lo/acu;

.field private V:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fel;>;"
        }
    .end annotation
.end field

.field private W:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/acn;>;"
        }
    .end annotation
.end field

.field private X:Landroid/widget/TextView;

.field private Y:Landroid/widget/TextView;

.field private Z:Landroid/widget/TextView;

.field private aA:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private aB:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private aC:Landroid/widget/LinearLayout;

.field private aD:Landroid/widget/TextView;

.field private aE:Landroid/widget/ImageView;

.field private aF:Landroid/os/Handler;

.field private aa:Landroid/widget/TextView;

.field private ab:Landroid/widget/TextView;

.field private ac:Landroid/widget/TextView;

.field private ad:Landroid/widget/TextView;

.field private ae:Landroid/widget/TextView;

.field private af:Landroid/widget/TextView;

.field private ag:Landroid/widget/TextView;

.field private ah:Landroid/widget/TextView;

.field private ai:Landroid/widget/LinearLayout;

.field private aj:Landroid/widget/LinearLayout;

.field private ak:Lo/fet;

.field private al:I

.field private am:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/HiGoalInfo;>;"
        }
    .end annotation
.end field

.field private an:I

.field private ao:Lo/fdn;

.field private ap:J

.field private aq:Lo/fei;

.field private ar:F

.field private as:F

.field private at:F

.field private au:F

.field private av:F

.field private aw:F

.field private ax:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

.field private ay:Landroid/widget/LinearLayout;

.field private az:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

.field protected f:Lo/fdo;

.field g:Ljava/util/concurrent/ExecutorService;

.field h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/acn;>;"
        }
    .end annotation
.end field

.field i:Lo/ejk;

.field private j:Landroid/widget/TextView;

.field protected k:Lo/fdo;

.field private l:Z

.field m:Lo/ehe$a;

.field n:Lo/ehe$a;

.field protected o:Lo/fdo;

.field p:Lo/ehe$a;

.field private q:Landroid/widget/ImageView;

.field private r:I

.field private s:Landroid/widget/TextView;

.field private t:Landroid/content/Context;

.field private u:Landroid/widget/ImageView;

.field private v:Landroid/widget/TextView;

.field private w:Landroid/widget/TextView;

.field private x:Landroid/widget/TextView;

.field private y:Landroid/widget/TextView;

.field private z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 579
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;-><init>()V

    .line 122
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->l:Z

    .line 151
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->g:Ljava/util/concurrent/ExecutorService;

    .line 165
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->L:Ljava/util/Date;

    .line 188
    const/4 v0, 0x4

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->al:I

    .line 197
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->an:I

    .line 198
    const/high16 v0, 0x437a0000    # 250.0f

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ar:F

    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->as:F

    const/high16 v0, 0x43160000    # 150.0f

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aw:F

    .line 201
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->at:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->av:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->au:F

    .line 209
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aB:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 210
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aA:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 220
    new-instance v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aF:Landroid/os/Handler;

    .line 831
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->h:Ljava/util/List;

    .line 1212
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->f:Lo/fdo;

    .line 1213
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->k:Lo/fdo;

    .line 1214
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o:Lo/fdo;

    .line 1215
    new-instance v0, Lo/ehe$a;

    invoke-direct {v0}, Lo/ehe$a;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->p:Lo/ehe$a;

    .line 1216
    new-instance v0, Lo/ehe$a;

    invoke-direct {v0}, Lo/ehe$a;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->n:Lo/ehe$a;

    .line 1217
    new-instance v0, Lo/ehe$a;

    invoke-direct {v0}, Lo/ehe$a;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->m:Lo/ehe$a;

    .line 580
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t:Landroid/content/Context;

    .line 582
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "new TrendFragment is created"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 583
    return-void
.end method

.method static synthetic A(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->I:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic B(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->af:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic C(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->F:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic D(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->H:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic E(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->Z:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic F(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ah:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic G(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aa:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic H(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ac:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic I(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ae:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic J(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/acu;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->U:Lo/acu;

    return-object v0
.end method

.method static synthetic K(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)F
    .locals 1

    .line 115
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->av:F

    return v0
.end method

.method static synthetic L(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I
    .locals 1

    .line 115
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->r:I

    return v0
.end method

.method static synthetic M(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)F
    .locals 1

    .line 115
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->as:F

    return v0
.end method

.method static synthetic N(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)V
    .locals 0

    .line 115
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->r()V

    return-void
.end method

.method static synthetic O(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)F
    .locals 1

    .line 115
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->au:F

    return v0
.end method

.method static synthetic P(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)F
    .locals 1

    .line 115
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aw:F

    return v0
.end method

.method static synthetic Q(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/Date;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->L:Ljava/util/Date;

    return-object v0
.end method

.method static synthetic R(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)V
    .locals 0

    .line 115
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->k()V

    return-void
.end method

.method static synthetic S(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->s:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic T(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->Q:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic U(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aD:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/ImageView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aE:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic W(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/os/Handler;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aF:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic X(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->O:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)F
    .locals 1

    .line 115
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ar:F

    return v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;F)F
    .locals 0

    .line 115
    iput p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ar:F

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;I)I
    .locals 0

    .line 115
    iput p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->an:I

    return p1
.end method

.method private a(Lcom/huawei/hihealth/HiHealthData;)Lo/acn;
    .locals 5

    .line 819
    const-string v0, "weight"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 820
    new-instance v4, Lo/acn;

    invoke-direct {v4}, Lo/acn;-><init>()V

    .line 821
    const-string v0, "weight"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->e(D)V

    .line 822
    const-string v0, "weight_bodyfat"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->c(D)V

    .line 823
    const-string v0, "weight_muscles"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->p(D)V

    .line 824
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->a(J)V

    .line 825
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->c(J)V

    .line 826
    return-object v4

    .line 828
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private a(Ljava/util/Date;I)V
    .locals 21

    .line 630
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procceedValue  start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    move/from16 v0, p2

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->al:I

    .line 632
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->V:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 634
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 636
    :sswitch_0
    const/4 v0, -0x6

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v4

    .line 637
    goto :goto_1

    .line 639
    :goto_0
    const/4 v4, 0x0

    .line 643
    :goto_1
    const-string v5, ""

    .line 656
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 657
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->W:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 658
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->W:Ljava/util/List;

    move-object/from16 v1, v16

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 660
    :cond_0
    move/from16 v17, v4

    :goto_2
    if-ltz v17, :cond_e

    .line 661
    new-instance v18, Lo/fel;

    invoke-direct/range {v18 .. v18}, Lo/fel;-><init>()V

    .line 662
    const/4 v12, 0x0

    .line 663
    const/4 v13, 0x0

    .line 664
    const/4 v14, 0x0

    .line 665
    const/4 v6, 0x0

    .line 666
    const/4 v7, 0x0

    .line 667
    const/4 v8, 0x0

    .line 668
    const/16 v19, 0x0

    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v19

    if-ge v1, v0, :cond_5

    .line 669
    new-instance v0, Ljava/util/Date;

    move-object/from16 v1, v16

    move/from16 v2, v19

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/acn;

    invoke-virtual {v1}, Lo/acn;->p()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    move-object v15, v0

    .line 670
    invoke-virtual/range {p1 .. p1}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v5

    .line 671
    move-object/from16 v0, p1

    invoke-static {v15, v0}, Lo/dbu;->b(Ljava/util/Date;Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 673
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 674
    const/16 v20, 0x228

    goto :goto_4

    .line 677
    :cond_1
    const/16 v20, 0xfa

    .line 680
    :goto_4
    move-object/from16 v0, v16

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->d()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_2

    move-object/from16 v0, v16

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->d()D

    move-result-wide v0

    move/from16 v2, v20

    int-to-double v2, v2

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_2

    .line 681
    float-to-double v0, v6

    move-object/from16 v2, v16

    move/from16 v3, v19

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/acn;

    invoke-virtual {v2}, Lo/acn;->d()D

    move-result-wide v2

    add-double/2addr v0, v2

    double-to-float v6, v0

    .line 682
    add-int/lit8 v12, v12, 0x1

    .line 684
    :cond_2
    move-object/from16 v0, v16

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_3

    move-object/from16 v0, v16

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    const-wide/high16 v2, 0x4049000000000000L    # 50.0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_3

    .line 685
    float-to-double v0, v7

    move-object/from16 v2, v16

    move/from16 v3, v19

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/acn;

    invoke-virtual {v2}, Lo/acn;->b()D

    move-result-wide v2

    add-double/2addr v0, v2

    double-to-float v7, v0

    .line 686
    add-int/lit8 v13, v13, 0x1

    .line 688
    :cond_3
    move-object/from16 v0, v16

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_4

    move-object/from16 v0, v16

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    const-wide v2, 0x4062c00000000000L    # 150.0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_4

    .line 689
    float-to-double v0, v8

    move-object/from16 v2, v16

    move/from16 v3, v19

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/acn;

    invoke-virtual {v2}, Lo/acn;->g()D

    move-result-wide v2

    add-double/2addr v0, v2

    double-to-float v8, v0

    .line 690
    add-int/lit8 v14, v14, 0x1

    .line 668
    :cond_4
    add-int/lit8 v19, v19, 0x1

    goto/16 :goto_3

    .line 694
    :cond_5
    if-eqz v12, :cond_6

    int-to-float v0, v12

    div-float v9, v6, v0

    goto :goto_5

    :cond_6
    const/4 v9, 0x0

    .line 695
    :goto_5
    if-eqz v13, :cond_7

    int-to-float v0, v13

    div-float v10, v7, v0

    goto :goto_6

    :cond_7
    const/4 v10, 0x0

    .line 696
    :goto_6
    if-eqz v14, :cond_8

    int-to-float v0, v14

    div-float v11, v8, v0

    goto :goto_7

    :cond_8
    const/4 v11, 0x0

    .line 697
    :goto_7
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 698
    float-to-double v0, v9

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-float v9, v0

    .line 699
    float-to-double v0, v11

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-float v11, v0

    .line 701
    :cond_9
    const/4 v0, 0x0

    if-eq v0, v5, :cond_b

    const-string v0, ""

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 702
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->al:I

    const/4 v1, 0x3

    if-eq v1, v0, :cond_a

    .line 703
    invoke-static/range {p1 .. p1}, Lo/dbu;->n(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lo/fel;->a(Ljava/lang/String;)V

    goto :goto_8

    .line 706
    :cond_a
    move-object/from16 v0, v18

    invoke-virtual {v0, v5}, Lo/fel;->a(Ljava/lang/String;)V

    .line 708
    :goto_8
    move-object/from16 v0, v18

    invoke-virtual {v0, v9}, Lo/fel;->e(F)V

    .line 709
    move-object/from16 v0, v18

    invoke-virtual {v0, v10}, Lo/fel;->b(F)V

    .line 710
    move-object/from16 v0, v18

    invoke-virtual {v0, v11}, Lo/fel;->d(F)V

    .line 711
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->V:Ljava/util/List;

    move-object/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 713
    :cond_b
    const/4 v0, 0x5

    move/from16 v1, p2

    if-eq v0, v1, :cond_c

    const/4 v0, 0x4

    move/from16 v1, p2

    if-ne v0, v1, :cond_d

    .line 714
    :cond_c
    invoke-static/range {p1 .. p1}, Lo/dbu;->k(Ljava/util/Date;)Ljava/util/Date;

    move-result-object p1

    .line 660
    :cond_d
    add-int/lit8 v17, v17, -0x1

    goto/16 :goto_2

    .line 718
    :cond_e
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procceedValue  end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 719
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_0
    .end sparse-switch
.end method

.method static synthetic aa(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/List;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->V:Ljava/util/List;

    return-object v0
.end method

.method static synthetic ab(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/List;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->W:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->R:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/lang/String;IF)Ljava/lang/String;
    .locals 1

    .line 115
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->b(Ljava/lang/String;IF)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/lang/String;IF)Ljava/lang/String;
    .locals 4

    .line 1341
    const/4 v3, 0x0

    .line 1342
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 1344
    :pswitch_0
    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->af:Landroid/widget/TextView;

    .line 1345
    goto :goto_1

    .line 1347
    :pswitch_1
    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ae:Landroid/widget/TextView;

    .line 1348
    goto :goto_1

    .line 1350
    :pswitch_2
    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ah:Landroid/widget/TextView;

    .line 1351
    goto :goto_1

    .line 1353
    :goto_0
    new-instance v3, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t:Landroid/content/Context;

    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1356
    :goto_1
    const/4 v0, 0x0

    cmpl-float v0, p3, v0

    if-lez v0, :cond_0

    .line 1357
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1358
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 1359
    :cond_0
    const/4 v0, 0x0

    cmpg-float v0, p3, v0

    if-gez v0, :cond_1

    .line 1360
    move-object v2, p1

    .line 1361
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 1363
    :cond_1
    const-string v2, "--"

    .line 1364
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1366
    :goto_2
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0xc8
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 115
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->am:Ljava/util/List;

    return-object p1
.end method

.method private b(Landroid/view/View;)V
    .locals 4

    .line 951
    sget v0, Lcom/huawei/ui/main/R$id;->weight_no_more:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->F:Landroid/widget/LinearLayout;

    .line 952
    sget v0, Lcom/huawei/ui/main/R$id;->weight_more:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->H:Landroid/widget/LinearLayout;

    .line 953
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_data_more:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->I:Landroid/widget/TextView;

    .line 954
    sget v0, Lcom/huawei/ui/main/R$id;->trend_scrollview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->G:Landroid/widget/ScrollView;

    .line 955
    sget v0, Lcom/huawei/ui/main/R$id;->trend_avg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->J:Landroid/widget/TextView;

    .line 956
    sget v0, Lcom/huawei/ui/main/R$id;->weight_message_service:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ay:Landroid/widget/LinearLayout;

    .line 957
    sget v0, Lcom/huawei/ui/main/R$id;->weight_reduce_fat:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aC:Landroid/widget/LinearLayout;

    .line 958
    sget v0, Lcom/huawei/ui/main/R$id;->im_right_jump:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aE:Landroid/widget/ImageView;

    .line 959
    sget v0, Lcom/huawei/ui/main/R$id;->avg_weight:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aD:Landroid/widget/TextView;

    .line 960
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aD:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_average:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 961
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 962
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aE:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_weight_enter2:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 964
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aE:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_enter_blue:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 967
    :goto_0
    sget v0, Lcom/huawei/ui/main/R$id;->time_l:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->O:Landroid/widget/TextView;

    .line 968
    sget v0, Lcom/huawei/ui/main/R$id;->time_now:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->R:Landroid/widget/TextView;

    .line 969
    sget v0, Lcom/huawei/ui/main/R$id;->time_now_uint:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->Q:Landroid/widget/TextView;

    .line 970
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_horizontal_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fde;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->D:Lo/fde;

    .line 971
    sget v0, Lcom/huawei/ui/main/R$id;->navigation_spots:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->B:Landroid/widget/LinearLayout;

    .line 972
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 973
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->B:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 975
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->B:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 977
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->D:Lo/fde;

    new-instance v1, Lo/fcw;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->B:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t:Landroid/content/Context;

    invoke-direct {v1, v2, v3}, Lo/fcw;-><init>(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lo/fde;->setScrollViewListener(Lo/fcw;)V

    .line 978
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_weight_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->C:Landroid/widget/LinearLayout;

    .line 979
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_weight_bodyfat_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->A:Landroid/widget/LinearLayout;

    .line 980
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_deep_weight_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->E:Landroid/widget/LinearLayout;

    .line 981
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_data:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->v:Landroid/widget/TextView;

    .line 983
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->A:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 984
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->E:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 985
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->C:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 986
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_data_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->y:Landroid/widget/TextView;

    .line 987
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_bodyfat_data:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->w:Landroid/widget/TextView;

    .line 988
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_bodyfat_uint:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->z:Landroid/widget/TextView;

    .line 989
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_muscle_data:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->x:Landroid/widget/TextView;

    .line 990
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_muscle_uint:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->j:Landroid/widget/TextView;

    .line 991
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->y:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 992
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->z:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 993
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->j:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 994
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_up_arrow_left:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->q:Landroid/widget/ImageView;

    .line 995
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_up_arrow_right:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->u:Landroid/widget/ImageView;

    .line 996
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_time_date_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->s:Landroid/widget/TextView;

    .line 998
    sget v0, Lcom/huawei/ui/main/R$id;->tv_fat_avg_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->X:Landroid/widget/TextView;

    .line 999
    sget v0, Lcom/huawei/ui/main/R$id;->tv_fat_avg_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ab:Landroid/widget/TextView;

    .line 1001
    sget v0, Lcom/huawei/ui/main/R$id;->tv_weight_avg_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->T:Landroid/widget/TextView;

    .line 1002
    sget v0, Lcom/huawei/ui/main/R$id;->tv_weight_avg_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ag:Landroid/widget/TextView;

    .line 1004
    sget v0, Lcom/huawei/ui/main/R$id;->tv_muscle_avg_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->Y:Landroid/widget/TextView;

    .line 1005
    sget v0, Lcom/huawei/ui/main/R$id;->tv_muscle_avg_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ad:Landroid/widget/TextView;

    .line 1007
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ab:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 1008
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ag:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 1009
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ad:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 1012
    sget v0, Lcom/huawei/ui/main/R$id;->tv_weight_change_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ac:Landroid/widget/TextView;

    .line 1013
    sget v0, Lcom/huawei/ui/main/R$id;->tv_weight_change_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->af:Landroid/widget/TextView;

    .line 1015
    sget v0, Lcom/huawei/ui/main/R$id;->tv_fat_change_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->Z:Landroid/widget/TextView;

    .line 1016
    sget v0, Lcom/huawei/ui/main/R$id;->tv_fat_change_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ae:Landroid/widget/TextView;

    .line 1018
    sget v0, Lcom/huawei/ui/main/R$id;->tv_muscle_change_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aa:Landroid/widget/TextView;

    .line 1019
    sget v0, Lcom/huawei/ui/main/R$id;->tv_muscle_change_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ah:Landroid/widget/TextView;

    .line 1021
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->af:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 1022
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ae:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 1023
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ah:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 1024
    sget v0, Lcom/huawei/ui/main/R$id;->left_arrow_iv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ai:Landroid/widget/LinearLayout;

    .line 1025
    sget v0, Lcom/huawei/ui/main/R$id;->right_arrow_iv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aj:Landroid/widget/LinearLayout;

    .line 1029
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1030
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->q:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_right_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1031
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->u:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_left_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 1033
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->q:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_left_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1034
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->u:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_right_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1037
    :goto_2
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1038
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->p()V

    .line 1040
    :cond_3
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->m()V

    .line 1041
    return-void
.end method

.method private b(Lo/acn;)V
    .locals 1

    .line 833
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->h:Ljava/util/List;

    if-nez v0, :cond_0

    .line 834
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->h:Ljava/util/List;

    .line 836
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 837
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 839
    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)F
    .locals 1

    .line 115
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->at:F

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;
    .locals 1

    .line 115
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e(Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method private c(Ljava/lang/String;FII)Landroid/text/SpannableStringBuilder;
    .locals 3

    .line 1512
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 1513
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t:Landroid/content/Context;

    invoke-static {v1, p2}, Lo/fef;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    const/16 v1, 0x11

    invoke-virtual {v2, v0, p3, p4, v1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 1514
    return-object v2
.end method

.method private c(FFFFFF)V
    .locals 4

    .line 1310
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 1311
    const/16 v0, 0xb

    iput v0, v2, Landroid/os/Message;->what:I

    .line 1312
    new-instance v3, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;)V

    .line 1313
    invoke-virtual {v3, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->b(F)V

    .line 1314
    invoke-virtual {v3, p2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->d(F)V

    .line 1315
    invoke-virtual {v3, p3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->a(F)V

    .line 1316
    invoke-virtual {v3, p4}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->e(F)V

    .line 1317
    invoke-virtual {v3, p5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->c(F)V

    .line 1318
    invoke-virtual {v3, p6}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$a;->f(F)V

    .line 1319
    iput-object v3, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1320
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aF:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1321
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aF:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1323
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;FFF)V
    .locals 0

    .line 115
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e(FFF)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/util/Date;I)V
    .locals 0

    .line 115
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Ljava/util/Date;I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/util/List;)V
    .locals 0

    .line 115
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->c(Ljava/util/List;)V

    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 801
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 802
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "testReadWeightData return datas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 803
    return-void

    .line 805
    :cond_0
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "testReadWeightData datas.size="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 807
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 808
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 809
    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Lcom/huawei/hihealth/HiHealthData;)Lo/acn;

    move-result-object v6

    .line 810
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 811
    invoke-direct {p0, v6}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->b(Lo/acn;)V

    .line 813
    :cond_1
    goto :goto_0

    .line 814
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->h:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e(Ljava/util/List;)V

    .line 817
    :cond_3
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;F)F
    .locals 0

    .line 115
    iput p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->at:F

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    .line 115
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->L:Ljava/util/Date;

    return-object p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/List;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->am:Ljava/util/List;

    return-object v0
.end method

.method private d(I)V
    .locals 4

    .line 1370
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procceedData() dataType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1371
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->g:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1401
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I
    .locals 1

    .line 115
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->an:I

    return v0
.end method

.method private e(Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;
    .locals 4

    .line 1518
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1519
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 1520
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "%"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    .line 1521
    const/4 v0, -0x1

    if-eq v3, v0, :cond_0

    .line 1522
    add-int/lit8 v0, v3, 0x1

    invoke-direct {p0, p1, p2, v3, v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->c(Ljava/lang/String;FII)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 1524
    :cond_0
    return-object v2

    .line 1526
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private e(FFF)V
    .locals 4

    .line 1298
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 1299
    const/16 v0, 0x9

    iput v0, v2, Landroid/os/Message;->what:I

    .line 1300
    new-instance v3, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$b;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$b;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$5;)V

    .line 1301
    invoke-virtual {v3, p3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$b;->d(F)V

    .line 1302
    invoke-virtual {v3, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$b;->b(F)V

    .line 1303
    invoke-virtual {v3, p2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$b;->c(F)V

    .line 1304
    iput-object v3, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aF:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aF:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1308
    :cond_0
    return-void
.end method

.method private e(Landroid/view/View;)V
    .locals 3

    .line 1093
    sget v0, Lcom/huawei/ui/main/R$id;->weight_loading_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->M:Landroid/widget/LinearLayout;

    .line 1094
    sget v0, Lcom/huawei/ui/main/R$id;->loading_iv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->K:Lhuawei/widget/HwProgressBar;

    .line 1095
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->K:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 1096
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->M:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1097
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_viewpager:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fci;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->N:Lo/fci;

    .line 1098
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;FFFFFF)V
    .locals 0

    .line 115
    invoke-direct/range {p0 .. p6}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->c(FFFFFF)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;I)V
    .locals 0

    .line 115
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->d(I)V

    return-void
.end method

.method private e(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/acn;>;)V"
        }
    .end annotation

    .line 841
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initvalue = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 842
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 843
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 844
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 845
    const/4 v7, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 846
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 847
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->d()D

    move-result-wide v0

    double-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 848
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 849
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    double-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 851
    :cond_0
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 852
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    double-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 845
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 856
    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 857
    invoke-static {v4}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->at:F

    .line 858
    invoke-static {v4}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ar:F

    .line 860
    :cond_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 862
    invoke-static {v5}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->av:F

    .line 863
    invoke-static {v5}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->as:F

    .line 865
    :cond_4
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 867
    invoke-static {v6}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->au:F

    .line 868
    invoke-static {v6}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aw:F

    .line 870
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aF:Landroid/os/Handler;

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 871
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initvalue = end "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 872
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->C:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/fet;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    return-object v0
.end method

.method private g()V
    .locals 7

    .line 761
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->U:Lo/acu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 762
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 763
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 765
    :cond_0
    return-void

    .line 767
    :cond_1
    const/4 v4, 0x1

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    .line 768
    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    const-string v0, "test"

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 769
    new-instance v6, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 770
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-virtual {v6, v2, v3, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setTimeRange(JJ)V

    .line 771
    invoke-virtual {v6, v4}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 772
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 773
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 774
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 775
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->U:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 776
    :cond_2
    const-string v0, "NULL"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    goto :goto_0

    .line 778
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->U:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 779
    const-string v0, "NULL"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    goto :goto_0

    .line 781
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->U:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    .line 785
    :goto_0
    invoke-virtual {v6, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 786
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$3;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)V

    invoke-interface {v0, v6, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 799
    return-void

    :array_0
    .array-data 4
        0x2716
    .end array-data
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->A:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private h()V
    .locals 2

    .line 521
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$1;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)V

    invoke-virtual {v0, v1}, Lo/fet;->setPagerNoMoreListener(Lo/eih$p;)V

    .line 532
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/fdn;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    return-object v0
.end method

.method static synthetic j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->w:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->E:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private k()V
    .locals 4

    .line 535
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ad()Z

    move-result v2

    .line 536
    if-eqz v2, :cond_0

    .line 537
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ai:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 538
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aB:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    .line 540
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ai:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 541
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aB:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 544
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->aj()Z

    move-result v3

    .line 545
    if-eqz v3, :cond_1

    .line 546
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aj:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 547
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aA:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_1

    .line 549
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aj:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 550
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aA:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 552
    :goto_1
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)I
    .locals 1

    .line 115
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->al:I

    return v0
.end method

.method private l()V
    .locals 4

    .line 1429
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aA:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1430
    return-void

    .line 1432
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ah()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1433
    return-void

    .line 1435
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$6;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$6;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Lo/fet;)V

    invoke-virtual {v0, v1}, Lo/fet;->a(Lo/eih$k;)V

    .line 1440
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5411\u5de6\u6ed1\u52a8"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1443
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/LinearLayout;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->M:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private m()V
    .locals 6

    .line 1064
    new-instance v3, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t:Landroid/content/Context;

    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1065
    sget v0, Lcom/huawei/ui/main/R$id;->weight_week_reduce_fat:I

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setId(I)V

    .line 1066
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1067
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1068
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aC:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 1069
    new-instance v0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ax:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    .line 1070
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v4

    .line 1071
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v5

    .line 1072
    sget v0, Lcom/huawei/ui/main/R$id;->weight_week_reduce_fat:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ax:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    invoke-virtual {v5, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 1073
    invoke-virtual {v5}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 1074
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ag:Landroid/widget/TextView;

    return-object v0
.end method

.method private n()V
    .locals 1

    .line 1080
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ai:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1081
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aj:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1082
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->E:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1083
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->A:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1084
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1086
    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/content/Context;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t:Landroid/content/Context;

    return-object v0
.end method

.method private o()V
    .locals 4

    .line 1407
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aB:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1408
    return-void

    .line 1410
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ah()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1411
    return-void

    .line 1413
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$10;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$10;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Lo/fet;)V

    invoke-virtual {v0, v1}, Lo/fet;->b(Lo/eih$k;)V

    .line 1418
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5411\u53f3\u6ed1\u52a8\uff0ctimeType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->al:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1419
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->R:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1422
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->J:Landroid/widget/TextView;

    return-object v0
.end method

.method private p()V
    .locals 7

    .line 1044
    new-instance v3, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t:Landroid/content/Context;

    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1045
    sget v0, Lcom/huawei/ui/main/R$id;->weight_week_detail:I

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setId(I)V

    .line 1046
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1047
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1048
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ay:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 1049
    new-instance v0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->az:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    .line 1050
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 1051
    const-string v0, "PAGE_TYPE"

    const/4 v1, 0x2

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1052
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->az:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->setArguments(Landroid/os/Bundle;)V

    .line 1054
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v5

    .line 1055
    invoke-virtual {v5}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v6

    .line 1056
    sget v0, Lcom/huawei/ui/main/R$id;->weight_week_detail:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->az:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-virtual {v6, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 1057
    invoke-virtual {v6}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 1058
    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ad:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->X:Landroid/widget/TextView;

    return-object v0
.end method

.method private r()V
    .locals 4

    .line 1474
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGoalData(),begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1475
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->U:Lo/acu;

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 1476
    return-void

    .line 1478
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$7;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$7;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3, v1}, Lo/clt;->d(IILo/clz;)V

    .line 1503
    return-void
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->Y:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ab:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->T:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic v(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->y:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic w(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->x:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic x(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->j:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->v:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Landroid/widget/TextView;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->z:Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method protected a()V
    .locals 4

    .line 612
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadDataSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    return-void
.end method

.method protected a(Landroid/view/View;)V
    .locals 4

    .line 1541
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setEmptyView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1542
    return-void
.end method

.method public a(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V
    .locals 2

    .line 1202
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    .line 1203
    if-nez v0, :cond_0

    .line 1204
    return-void

    .line 1206
    :cond_0
    invoke-virtual {v0}, Lo/eih;->aa()Lo/eih$h;

    move-result-object v1

    .line 1207
    if-nez v1, :cond_1

    .line 1208
    return-void

    .line 1210
    :cond_1
    invoke-interface {v1, p1, p2, p3, p4}, Lo/eih$h;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1211
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 1547
    return-void
.end method

.method protected c(Landroid/view/View;)V
    .locals 2

    .line 590
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->b(Landroid/view/View;)V

    .line 591
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e(Landroid/view/View;)V

    .line 592
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->n()V

    .line 595
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 596
    const/4 v0, 0x6

    iput v0, v1, Landroid/os/Message;->what:I

    .line 597
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$e;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$e;->sendMessage(Landroid/os/Message;)Z

    .line 598
    return-void
.end method

.method public c(Z)V
    .locals 4

    .line 728
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData resumeFlag = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->l:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " isScroll = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 729
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->l:Z

    if-nez v0, :cond_0

    if-eqz p1, :cond_3

    .line 730
    :cond_0
    if-nez p1, :cond_1

    .line 731
    const/16 v0, 0xc8

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->r:I

    .line 732
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ai:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 733
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aj:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 734
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->R:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 736
    :cond_1
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->U:Lo/acu;

    .line 737
    sget-object v0, Lo/acs;->c:Lo/acs;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->U:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/acs;->e(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->W:Ljava/util/List;

    .line 738
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 739
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 740
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->f()V

    .line 741
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->g()V

    goto :goto_0

    .line 743
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aq:Lo/fei;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 744
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aq:Lo/fei;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-interface {v0, v1}, Lo/fei;->d(Ljava/util/Date;)V

    .line 745
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 746
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->f()V

    .line 752
    :cond_3
    :goto_0
    return-void
.end method

.method protected d(Landroid/view/View;)Landroid/view/View;
    .locals 1

    .line 942
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fel;>;)V"
        }
    .end annotation

    .line 1331
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 1332
    const/16 v0, 0xa

    iput v0, v2, Landroid/os/Message;->what:I

    .line 1333
    iput-object p1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1334
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aF:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aF:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1337
    :cond_0
    return-void
.end method

.method public d(Lo/fei;)V
    .locals 2

    .line 573
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aq:Lo/fei;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 574
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aq:Lo/fei;

    .line 576
    :cond_0
    return-void
.end method

.method protected e()I
    .locals 1

    .line 607
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_trend:I

    return v0
.end method

.method public f()V
    .locals 4

    .line 1104
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initChartView startweek"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1105
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    .line 1106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->P:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->P:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->P:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1109
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    .line 1110
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->S:Lo/fch;

    .line 1111
    const/16 v0, 0xc8

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->r:I

    .line 1112
    new-instance v0, Lo/fet;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fet;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    .line 1113
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/fet;->setLayerType(ILandroid/graphics/Paint;)V

    .line 1114
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->P:Ljava/util/ArrayList;

    .line 1115
    new-instance v0, Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/eic;->S:Lo/eic;

    invoke-direct {v0, v1, v2}, Lo/fdn;-><init>(Landroid/content/Context;Lo/eic;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    .line 1116
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->C:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->A:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1118
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->E:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1119
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->h()V

    .line 1120
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    sget-object v2, Lo/eic;->S:Lo/eic;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/eih;Lo/eic;)Lo/eii;

    .line 1121
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->P:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1122
    new-instance v0, Lo/fch;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->P:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lo/fch;-><init>(Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->S:Lo/fch;

    .line 1123
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->N:Lo/fci;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->S:Lo/fch;

    invoke-virtual {v0, v1}, Lo/fci;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 1124
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->N:Lo/fci;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fci;->setScanScroll(Z)V

    .line 1125
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$4;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)V

    invoke-virtual {v0, v1}, Lo/fet;->d(Lo/eih$m;)V

    .line 1136
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$2;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)V

    invoke-virtual {v0, v1}, Lo/fet;->setOnMarkViewTextNotify(Lo/elc$c;)V

    .line 1180
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->n:Lo/ehe$a;

    sget-object v1, Lo/eic;->S:Lo/eic;

    invoke-virtual {v0, v1}, Lo/ehe$a;->c(Lo/eic;)Lo/ehe$a;

    .line 1181
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->n:Lo/ehe$a;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/ehe$a;->c(I)Lo/ehe$a;

    .line 1182
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->n:Lo/ehe$a;

    invoke-virtual {v0, v1}, Lo/fdn;->e(Lo/ehe$a;)Lo/fdo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->f:Lo/fdo;

    .line 1183
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->m:Lo/ehe$a;

    sget-object v1, Lo/eic;->S:Lo/eic;

    invoke-virtual {v0, v1}, Lo/ehe$a;->c(Lo/eic;)Lo/ehe$a;

    .line 1184
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->m:Lo/ehe$a;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/ehe$a;->c(I)Lo/ehe$a;

    .line 1185
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->m:Lo/ehe$a;

    invoke-virtual {v0, v1}, Lo/fdn;->e(Lo/ehe$a;)Lo/fdo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o:Lo/fdo;

    .line 1186
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->p:Lo/ehe$a;

    sget-object v1, Lo/eic;->S:Lo/eic;

    invoke-virtual {v0, v1}, Lo/ehe$a;->c(Lo/eic;)Lo/ehe$a;

    .line 1187
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->p:Lo/ehe$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ehe$a;->c(I)Lo/ehe$a;

    .line 1188
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->p:Lo/ehe$a;

    invoke-virtual {v0, v1}, Lo/fdn;->e(Lo/ehe$a;)Lo/fdo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->k:Lo/fdo;

    .line 1189
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    invoke-virtual {v0}, Lo/ehl;->d()Lo/ejk;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->i:Lo/ejk;

    .line 1190
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->i:Lo/ejk;

    sget-object v2, Lo/eic;->S:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->m:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1191
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->k:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->i:Lo/ejk;

    sget-object v2, Lo/eic;->S:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->p:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1192
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->f:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->i:Lo/ejk;

    sget-object v2, Lo/eic;->S:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->n:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1193
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aF:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1194
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aF:Landroid/os/Handler;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1196
    :cond_1
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initChartView end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1197
    return-void
.end method

.method protected i()V
    .locals 1

    .line 625
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->V:Ljava/util/List;

    .line 626
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->am:Ljava/util/List;

    .line 627
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1223
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 1224
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->l:Z

    .line 1225
    sget v0, Lcom/huawei/ui/main/R$id;->left_arrow_iv:I

    if-ne v4, v0, :cond_0

    .line 1226
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o()V

    goto/16 :goto_0

    .line 1227
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->right_arrow_iv:I

    if-ne v4, v0, :cond_1

    .line 1228
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->l()V

    goto/16 :goto_0

    .line 1229
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_weight_layout:I

    if-ne v4, v0, :cond_2

    .line 1230
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->C:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1231
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->A:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->E:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1233
    const/16 v0, 0xc8

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->r:I

    .line 1234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ar:F

    iget v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->at:F

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->r:I

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 1235
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->k:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1236
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1237
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->f:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->f:Lo/fdo;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->n:Lo/ehe$a;

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->a(Lo/eih;Lo/eii;Lo/ehe$a;)Lo/eii;

    .line 1239
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->i:Lo/ejk;

    sget-object v2, Lo/eic;->S:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->m:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1240
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->k:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->i:Lo/ejk;

    sget-object v2, Lo/eic;->S:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->p:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1241
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->f:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->e(Lo/fet;Lo/fdo;)V

    .line 1242
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 1243
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->U:Lo/acu;

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    if-ne v0, v1, :cond_5

    .line 1244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    iget v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->an:I

    invoke-virtual {v0, v1}, Lo/fet;->i(I)V

    goto/16 :goto_0

    .line 1247
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_weight_bodyfat_layout:I

    if-ne v4, v0, :cond_3

    .line 1248
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->C:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1249
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->A:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1250
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->E:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1251
    const/16 v0, 0xc9

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->r:I

    .line 1252
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->as:F

    iget v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->av:F

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->r:I

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 1253
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->k:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1254
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1255
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->f:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1256
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->k:Lo/fdo;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->p:Lo/ehe$a;

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->a(Lo/eih;Lo/eii;Lo/ehe$a;)Lo/eii;

    .line 1257
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->i:Lo/ejk;

    sget-object v2, Lo/eic;->S:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->m:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1258
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->f:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->i:Lo/ejk;

    sget-object v2, Lo/eic;->S:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->n:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->k:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->e(Lo/fet;Lo/fdo;)V

    .line 1260
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 1261
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->D()V

    goto/16 :goto_0

    .line 1263
    :cond_3
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_deep_weight_layout:I

    if-ne v4, v0, :cond_4

    .line 1264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->C:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->A:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->E:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1267
    const/16 v0, 0xca

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->r:I

    .line 1268
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aw:F

    iget v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->au:F

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->r:I

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 1269
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->k:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1270
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1271
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->f:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1272
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o:Lo/fdo;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->m:Lo/ehe$a;

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->a(Lo/eih;Lo/eii;Lo/ehe$a;)Lo/eii;

    .line 1273
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->k:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->i:Lo/ejk;

    sget-object v2, Lo/eic;->S:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->p:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1274
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->f:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->i:Lo/ejk;

    sget-object v2, Lo/eic;->S:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->n:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->a(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1275
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ao:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->o:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->e(Lo/fet;Lo/fdo;)V

    .line 1276
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 1277
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->D()V

    goto :goto_0

    .line 1278
    :cond_4
    sget v0, Lcom/huawei/ui/main/R$id;->ly_click_data:I

    if-ne v4, v0, :cond_5

    .line 1279
    const-string v0, "--"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->R:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1280
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aq:Lo/fei;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 1281
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ak:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->J()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ap:J

    .line 1282
    new-instance v5, Ljava/util/Date;

    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ap:J

    invoke-direct {v5, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 1283
    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    .line 1284
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aq:Lo/fei;

    invoke-interface {v0, v5}, Lo/fei;->d(Ljava/util/Date;)V

    .line 1289
    :cond_5
    :goto_0
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1532
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->onDestroy()V

    .line 1533
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->V:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->V:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1534
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->V:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1536
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->t:Landroid/content/Context;

    .line 1537
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 617
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->onPause()V

    .line 618
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause called!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 619
    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 3

    .line 755
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->setUserVisibleHint(Z)V

    .line 756
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->G:Landroid/widget/ScrollView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 757
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->G:Landroid/widget/ScrollView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 759
    :cond_0
    return-void
.end method

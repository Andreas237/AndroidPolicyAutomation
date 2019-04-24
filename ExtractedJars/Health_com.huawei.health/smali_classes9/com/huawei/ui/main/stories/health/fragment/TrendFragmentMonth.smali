.class public Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;
.super Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;,
        Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$e;
    }
.end annotation


# instance fields
.field private A:Landroid/widget/LinearLayout;

.field private B:Landroid/widget/TextView;

.field private C:Landroid/widget/TextView;

.field private D:Lo/fde;

.field private E:J

.field private F:Landroid/widget/LinearLayout;

.field private G:Lo/fei;

.field private H:Landroid/widget/LinearLayout;

.field private I:Landroid/widget/LinearLayout;

.field private J:Landroid/widget/TextView;

.field private K:Landroid/widget/LinearLayout;

.field private L:Landroid/widget/LinearLayout;

.field private M:Landroid/widget/TextView;

.field private N:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

.field private O:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private P:Ljava/util/Date;

.field private Q:Lhuawei/widget/HwProgressBar;

.field private R:Lo/fci;

.field private S:Landroid/widget/LinearLayout;

.field private T:Landroid/widget/TextView;

.field private U:Landroid/widget/TextView;

.field private V:Lo/acu;

.field private W:Landroid/widget/TextView;

.field private X:Lo/fch;

.field private Y:Landroid/widget/TextView;

.field private Z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/acn;>;"
        }
    .end annotation
.end field

.field private aA:F

.field private aB:F

.field private aC:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

.field private aD:Landroid/widget/LinearLayout;

.field private aE:Landroid/widget/ScrollView;

.field private aF:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private aG:Landroid/os/Handler;

.field private aa:Landroid/widget/TextView;

.field private ab:Landroid/widget/TextView;

.field private ac:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fel;>;"
        }
    .end annotation
.end field

.field private ad:Landroid/widget/TextView;

.field private ae:Landroid/widget/TextView;

.field private af:Landroid/widget/TextView;

.field private ag:Landroid/widget/TextView;

.field private ah:Landroid/widget/TextView;

.field private ai:Landroid/widget/TextView;

.field private aj:Landroid/widget/TextView;

.field private ak:I

.field private al:Landroid/widget/TextView;

.field private am:Landroid/widget/TextView;

.field private an:Landroid/widget/LinearLayout;

.field private ao:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/HiGoalInfo;>;"
        }
    .end annotation
.end field

.field private ap:Landroid/widget/ImageView;

.field private aq:Landroid/widget/LinearLayout;

.field private ar:Lo/fdn;

.field private as:I

.field private at:I

.field private au:Landroid/widget/TextView;

.field private av:F

.field private aw:F

.field private ax:F

.field private ay:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private az:F

.field protected f:Lo/fdo;

.field g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/acn;>;"
        }
    .end annotation
.end field

.field h:Lo/ejk;

.field protected i:Lo/fet;

.field private j:Landroid/widget/LinearLayout;

.field k:Ljava/util/concurrent/ExecutorService;

.field protected l:Lo/fdo;

.field protected m:Lo/fdo;

.field n:Lo/ehe$a;

.field o:Lo/ehe$a;

.field p:Lo/ehe$a;

.field private q:Landroid/content/Context;

.field private r:Z

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/ImageView;

.field private u:Landroid/widget/ImageView;

.field private v:I

.field private w:Landroid/widget/TextView;

.field private x:Landroid/widget/TextView;

.field private y:Landroid/widget/TextView;

.field private z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 551
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;-><init>()V

    .line 113
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->r:Z

    .line 185
    const/4 v0, 0x5

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ak:I

    .line 197
    const/4 v0, 0x5

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->at:I

    .line 198
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->k:Ljava/util/concurrent/ExecutorService;

    .line 199
    const/high16 v0, 0x437a0000    # 250.0f

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aw:F

    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->av:F

    const/high16 v0, 0x43160000    # 150.0f

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->az:F

    .line 202
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aB:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aA:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ax:F

    .line 203
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ay:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 204
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aF:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 215
    new-instance v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aG:Landroid/os/Handler;

    .line 815
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->g:Ljava/util/List;

    .line 1185
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->f:Lo/fdo;

    .line 1186
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->m:Lo/fdo;

    .line 1187
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l:Lo/fdo;

    .line 1188
    new-instance v0, Lo/ehe$a;

    invoke-direct {v0}, Lo/ehe$a;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->n:Lo/ehe$a;

    .line 1189
    new-instance v0, Lo/ehe$a;

    invoke-direct {v0}, Lo/ehe$a;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->o:Lo/ehe$a;

    .line 1190
    new-instance v0, Lo/ehe$a;

    invoke-direct {v0}, Lo/ehe$a;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->p:Lo/ehe$a;

    .line 552
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q:Landroid/content/Context;

    .line 554
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "new TrendFragment is created"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 555
    return-void
.end method

.method static synthetic A(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->L:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic B(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->y:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic C(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->M:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic D(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aj:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic E(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->am:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic F(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ah:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic G(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ae:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic H(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ad:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic I(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->al:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic J(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q()V

    return-void
.end method

.method static synthetic K(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)F
    .locals 1

    .line 104
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->av:F

    return v0
.end method

.method static synthetic L(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Lo/acu;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->V:Lo/acu;

    return-object v0
.end method

.method static synthetic M(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I
    .locals 1

    .line 104
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->v:I

    return v0
.end method

.method static synthetic N(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)F
    .locals 1

    .line 104
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aA:F

    return v0
.end method

.method static synthetic O(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->s:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic P(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/os/Handler;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aG:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic Q(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->W:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic R(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)F
    .locals 1

    .line 104
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->az:F

    return v0
.end method

.method static synthetic S(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)F
    .locals 1

    .line 104
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ax:F

    return v0
.end method

.method static synthetic T(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->au:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic U(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/ImageView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ap:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->U:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic W(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Ljava/util/Date;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->P:Ljava/util/Date;

    return-object v0
.end method

.method static synthetic X(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->o()V

    return-void
.end method

.method static synthetic Z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Ljava/util/List;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ac:Ljava/util/List;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->P:Ljava/util/Date;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Ljava/util/List;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ao:Ljava/util/List;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ao:Ljava/util/List;

    return-object p1
.end method

.method private a(FFFFFF)V
    .locals 4

    .line 1367
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 1368
    const/16 v0, 0xb

    iput v0, v2, Landroid/os/Message;->what:I

    .line 1369
    new-instance v3, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;)V

    .line 1370
    invoke-virtual {v3, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->d(F)V

    .line 1371
    invoke-virtual {v3, p2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->e(F)V

    .line 1372
    invoke-virtual {v3, p3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->b(F)V

    .line 1373
    invoke-virtual {v3, p4}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->a(F)V

    .line 1374
    invoke-virtual {v3, p5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->c(F)V

    .line 1375
    invoke-virtual {v3, p6}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$d;->g(F)V

    .line 1376
    iput-object v3, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1377
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aG:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1378
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aG:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1380
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;FFFFFF)V
    .locals 0

    .line 104
    invoke-direct/range {p0 .. p6}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->a(FFFFFF)V

    return-void
.end method

.method static synthetic aa(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Ljava/util/List;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->Z:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;I)I
    .locals 0

    .line 104
    iput p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->as:I

    return p1
.end method

.method private b(Ljava/lang/String;FII)Landroid/text/SpannableStringBuilder;
    .locals 3

    .line 1546
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 1547
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q:Landroid/content/Context;

    invoke-static {v1, p2}, Lo/fef;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    const/16 v1, 0x11

    invoke-virtual {v2, v0, p3, p4, v1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 1548
    return-object v2
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->T:Landroid/widget/TextView;

    return-object v0
.end method

.method private b(FFF)V
    .locals 4

    .line 1355
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 1356
    const/16 v0, 0x9

    iput v0, v2, Landroid/os/Message;->what:I

    .line 1357
    new-instance v3, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$e;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$e;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$4;)V

    .line 1358
    invoke-virtual {v3, p3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$e;->a(F)V

    .line 1359
    invoke-virtual {v3, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$e;->e(F)V

    .line 1360
    invoke-virtual {v3, p2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$e;->c(F)V

    .line 1361
    iput-object v3, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1362
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aG:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1363
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aG:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1365
    :cond_0
    return-void
.end method

.method private b(I)V
    .locals 4

    .line 1427
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

    .line 1428
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->k:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$6;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$6;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1460
    return-void
.end method

.method private b(Landroid/view/View;)V
    .locals 3

    .line 1072
    sget v0, Lcom/huawei/ui/main/R$id;->weight_loading_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->S:Landroid/widget/LinearLayout;

    .line 1073
    sget v0, Lcom/huawei/ui/main/R$id;->loading_iv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->Q:Lhuawei/widget/HwProgressBar;

    .line 1074
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->Q:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 1075
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->S:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1076
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_viewpager:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fci;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->R:Lo/fci;

    .line 1077
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/util/Date;I)V
    .locals 0

    .line 104
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Ljava/util/Date;I)V

    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/acn;>;)V"
        }
    .end annotation

    .line 825
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initvalue = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 826
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 827
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 828
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 829
    const/4 v7, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 830
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 831
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->d()D

    move-result-wide v0

    double-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 832
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 833
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    double-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 835
    :cond_0
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 836
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    double-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 829
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 840
    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 841
    invoke-static {v4}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aB:F

    .line 842
    invoke-static {v4}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aw:F

    .line 844
    :cond_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 846
    invoke-static {v5}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aA:F

    .line 847
    invoke-static {v5}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->av:F

    .line 849
    :cond_4
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 851
    invoke-static {v6}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ax:F

    .line 852
    invoke-static {v6}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->az:F

    .line 854
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aG:Landroid/os/Handler;

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 855
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;F)F
    .locals 0

    .line 104
    iput p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aB:F

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I
    .locals 1

    .line 104
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->at:I

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;
    .locals 1

    .line 104
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->d(Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;FFF)V
    .locals 0

    .line 104
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->b(FFF)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/util/List;)V
    .locals 0

    .line 104
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->d(Ljava/util/List;)V

    return-void
.end method

.method private c(Ljava/util/Date;I)V
    .locals 23

    .line 603
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procceedValue  start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 604
    move/from16 v0, p2

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ak:I

    .line 605
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ac:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 607
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 612
    :sswitch_0
    const/16 v0, -0x1d

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v4

    .line 613
    goto :goto_1

    .line 615
    :goto_0
    const/4 v4, 0x0

    .line 619
    :goto_1
    const-string v5, ""

    .line 633
    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    .line 634
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->Z:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->Z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 635
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->Z:Ljava/util/List;

    move-object/from16 v1, v17

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 637
    :cond_0
    move/from16 v18, v4

    :goto_2
    if-ltz v18, :cond_10

    .line 638
    new-instance v19, Lo/fel;

    invoke-direct/range {v19 .. v19}, Lo/fel;-><init>()V

    .line 639
    const/4 v12, 0x0

    .line 640
    const/4 v13, 0x0

    .line 641
    const/4 v14, 0x0

    .line 642
    const/4 v6, 0x0

    .line 643
    const/4 v7, 0x0

    .line 644
    const/4 v8, 0x0

    .line 645
    const/16 v20, 0x0

    :goto_3
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v20

    if-ge v1, v0, :cond_7

    .line 646
    new-instance v0, Ljava/util/Date;

    move-object/from16 v1, v17

    move/from16 v2, v20

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/acn;

    invoke-virtual {v1}, Lo/acn;->p()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    move-object v15, v0

    .line 647
    const/4 v0, 0x3

    move/from16 v1, p2

    if-ne v0, v1, :cond_2

    .line 648
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v21

    .line 649
    move-object/from16 v0, v17

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->p()J

    move-result-wide v0

    move-object/from16 v2, v21

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 650
    move-object/from16 v0, v21

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v22

    .line 651
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":00"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 652
    move/from16 v0, v22

    move/from16 v1, v18

    if-ne v0, v1, :cond_1

    const/16 v16, 0x1

    goto :goto_4

    :cond_1
    const/16 v16, 0x0

    .line 653
    :goto_4
    goto :goto_5

    .line 655
    :cond_2
    invoke-virtual/range {p1 .. p1}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v5

    .line 656
    const/16 v16, 0x1

    .line 658
    :goto_5
    if-eqz v16, :cond_6

    .line 659
    move-object/from16 v0, p1

    invoke-static {v15, v0}, Lo/dbu;->b(Ljava/util/Date;Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 661
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 662
    const/16 v21, 0x228

    goto :goto_6

    .line 665
    :cond_3
    const/16 v21, 0xfa

    .line 668
    :goto_6
    move-object/from16 v0, v17

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->d()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_4

    move-object/from16 v0, v17

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->d()D

    move-result-wide v0

    move/from16 v2, v21

    int-to-double v2, v2

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_4

    .line 669
    float-to-double v0, v6

    move-object/from16 v2, v17

    move/from16 v3, v20

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/acn;

    invoke-virtual {v2}, Lo/acn;->d()D

    move-result-wide v2

    add-double/2addr v0, v2

    double-to-float v6, v0

    .line 671
    add-int/lit8 v12, v12, 0x1

    .line 673
    :cond_4
    move-object/from16 v0, v17

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_5

    move-object/from16 v0, v17

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    const-wide/high16 v2, 0x4049000000000000L    # 50.0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_5

    .line 674
    float-to-double v0, v7

    move-object/from16 v2, v17

    move/from16 v3, v20

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/acn;

    invoke-virtual {v2}, Lo/acn;->b()D

    move-result-wide v2

    add-double/2addr v0, v2

    double-to-float v7, v0

    .line 675
    add-int/lit8 v13, v13, 0x1

    .line 677
    :cond_5
    move-object/from16 v0, v17

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_6

    move-object/from16 v0, v17

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    const-wide v2, 0x4062c00000000000L    # 150.0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_6

    .line 678
    float-to-double v0, v8

    move-object/from16 v2, v17

    move/from16 v3, v20

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/acn;

    invoke-virtual {v2}, Lo/acn;->g()D

    move-result-wide v2

    add-double/2addr v0, v2

    double-to-float v8, v0

    .line 679
    add-int/lit8 v14, v14, 0x1

    .line 645
    :cond_6
    add-int/lit8 v20, v20, 0x1

    goto/16 :goto_3

    .line 686
    :cond_7
    if-eqz v12, :cond_8

    int-to-float v0, v12

    div-float v9, v6, v0

    goto :goto_7

    :cond_8
    const/4 v9, 0x0

    .line 687
    :goto_7
    if-eqz v13, :cond_9

    int-to-float v0, v13

    div-float v10, v7, v0

    goto :goto_8

    :cond_9
    const/4 v10, 0x0

    .line 688
    :goto_8
    if-eqz v14, :cond_a

    int-to-float v0, v14

    div-float v11, v8, v0

    goto :goto_9

    :cond_a
    const/4 v11, 0x0

    .line 689
    :goto_9
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 690
    float-to-double v0, v9

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-float v9, v0

    .line 691
    float-to-double v0, v11

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-float v11, v0

    .line 693
    :cond_b
    const/4 v0, 0x0

    if-eq v0, v5, :cond_d

    const-string v0, ""

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 694
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ak:I

    const/4 v1, 0x3

    if-eq v1, v0, :cond_c

    .line 695
    invoke-static/range {p1 .. p1}, Lo/dbu;->n(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lo/fel;->a(Ljava/lang/String;)V

    goto :goto_a

    .line 698
    :cond_c
    move-object/from16 v0, v19

    invoke-virtual {v0, v5}, Lo/fel;->a(Ljava/lang/String;)V

    .line 700
    :goto_a
    move-object/from16 v0, v19

    invoke-virtual {v0, v9}, Lo/fel;->e(F)V

    .line 701
    move-object/from16 v0, v19

    invoke-virtual {v0, v10}, Lo/fel;->b(F)V

    .line 702
    move-object/from16 v0, v19

    invoke-virtual {v0, v11}, Lo/fel;->d(F)V

    .line 703
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ac:Ljava/util/List;

    move-object/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 705
    :cond_d
    const/4 v0, 0x5

    move/from16 v1, p2

    if-eq v0, v1, :cond_e

    const/4 v0, 0x4

    move/from16 v1, p2

    if-ne v0, v1, :cond_f

    .line 706
    :cond_e
    invoke-static/range {p1 .. p1}, Lo/dbu;->k(Ljava/util/Date;)Ljava/util/Date;

    move-result-object p1

    .line 637
    :cond_f
    add-int/lit8 v18, v18, -0x1

    goto/16 :goto_2

    .line 710
    :cond_10
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procceedValue  end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 711
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_0
    .end sparse-switch
.end method

.method private c(Lo/acn;)V
    .locals 1

    .line 817
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->g:Ljava/util/List;

    if-nez v0, :cond_0

    .line 818
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->g:Ljava/util/List;

    .line 820
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 821
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 823
    :cond_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)F
    .locals 1

    .line 104
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aw:F

    return v0
.end method

.method private d(Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;
    .locals 4

    .line 1552
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1553
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 1554
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "%"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    .line 1555
    const/4 v0, -0x1

    if-eq v3, v0, :cond_0

    .line 1556
    add-int/lit8 v0, v3, 0x1

    invoke-direct {p0, p1, p2, v3, v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->b(Ljava/lang/String;FII)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 1558
    :cond_0
    return-object v2

    .line 1560
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Ljava/lang/String;IF)Ljava/lang/String;
    .locals 1

    .line 104
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->d(Ljava/lang/String;IF)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Ljava/lang/String;IF)Ljava/lang/String;
    .locals 4

    .line 1398
    const/4 v3, 0x0

    .line 1399
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 1401
    :pswitch_0
    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aj:Landroid/widget/TextView;

    .line 1402
    goto :goto_1

    .line 1404
    :pswitch_1
    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->al:Landroid/widget/TextView;

    .line 1405
    goto :goto_1

    .line 1407
    :pswitch_2
    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->am:Landroid/widget/TextView;

    .line 1408
    goto :goto_1

    .line 1410
    :goto_0
    new-instance v3, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q:Landroid/content/Context;

    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1413
    :goto_1
    const/4 v0, 0x0

    cmpl-float v0, p3, v0

    if-lez v0, :cond_0

    .line 1414
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1415
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 1416
    :cond_0
    const/4 v0, 0x0

    cmpg-float v0, p3, v0

    if-gez v0, :cond_1

    .line 1417
    move-object v2, p1

    .line 1418
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 1420
    :cond_1
    const-string v2, "--"

    .line 1421
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1423
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

.method static synthetic d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;I)V
    .locals 0

    .line 104
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->b(I)V

    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 785
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 786
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "testReadWeightData return datas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 787
    return-void

    .line 789
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

    .line 791
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 792
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

    .line 793
    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->e(Lcom/huawei/hihealth/HiHealthData;)Lo/acn;

    move-result-object v6

    .line 794
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 795
    invoke-direct {p0, v6}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lo/acn;)V

    .line 797
    :cond_1
    goto :goto_0

    .line 798
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->g:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->b(Ljava/util/List;)V

    .line 801
    :cond_3
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;F)F
    .locals 0

    .line 104
    iput p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aw:F

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I
    .locals 1

    .line 104
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->as:I

    return v0
.end method

.method private e(Lcom/huawei/hihealth/HiHealthData;)Lo/acn;
    .locals 5

    .line 803
    const-string v0, "weight"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 804
    new-instance v4, Lo/acn;

    invoke-direct {v4}, Lo/acn;-><init>()V

    .line 805
    const-string v0, "weight"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->e(D)V

    .line 806
    const-string v0, "weight_bodyfat"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->c(D)V

    .line 807
    const-string v0, "weight_muscles"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->p(D)V

    .line 808
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->a(J)V

    .line 809
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->c(J)V

    .line 810
    return-object v4

    .line 812
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private e(Landroid/view/View;)V
    .locals 4

    .line 933
    sget v0, Lcom/huawei/ui/main/R$id;->weight_no_more:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->K:Landroid/widget/LinearLayout;

    .line 934
    sget v0, Lcom/huawei/ui/main/R$id;->weight_more:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->L:Landroid/widget/LinearLayout;

    .line 935
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_data_more:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->M:Landroid/widget/TextView;

    .line 936
    sget v0, Lcom/huawei/ui/main/R$id;->trend_scrollview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aE:Landroid/widget/ScrollView;

    .line 937
    sget v0, Lcom/huawei/ui/main/R$id;->trend_avg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->J:Landroid/widget/TextView;

    .line 938
    sget v0, Lcom/huawei/ui/main/R$id;->weight_message_service:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->F:Landroid/widget/LinearLayout;

    .line 939
    sget v0, Lcom/huawei/ui/main/R$id;->weight_reduce_fat:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aD:Landroid/widget/LinearLayout;

    .line 940
    sget v0, Lcom/huawei/ui/main/R$id;->im_right_jump:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ap:Landroid/widget/ImageView;

    .line 941
    sget v0, Lcom/huawei/ui/main/R$id;->avg_weight:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->au:Landroid/widget/TextView;

    .line 942
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->au:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_average:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 943
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 944
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ap:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_weight_enter2:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 946
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ap:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_enter_blue:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 949
    :goto_0
    sget v0, Lcom/huawei/ui/main/R$id;->time_l:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->W:Landroid/widget/TextView;

    .line 950
    sget v0, Lcom/huawei/ui/main/R$id;->time_now:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->T:Landroid/widget/TextView;

    .line 951
    sget v0, Lcom/huawei/ui/main/R$id;->time_now_uint:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->U:Landroid/widget/TextView;

    .line 952
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_horizontal_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fde;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->D:Lo/fde;

    .line 953
    sget v0, Lcom/huawei/ui/main/R$id;->navigation_spots:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->A:Landroid/widget/LinearLayout;

    .line 954
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 955
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->A:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 957
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->A:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 959
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->D:Lo/fde;

    new-instance v1, Lo/fcw;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->A:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q:Landroid/content/Context;

    invoke-direct {v1, v2, v3}, Lo/fcw;-><init>(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lo/fde;->setScrollViewListener(Lo/fcw;)V

    .line 960
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_weight_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->j:Landroid/widget/LinearLayout;

    .line 961
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_weight_bodyfat_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->I:Landroid/widget/LinearLayout;

    .line 962
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_deep_weight_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->H:Landroid/widget/LinearLayout;

    .line 964
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->I:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 965
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->H:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 966
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->j:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 967
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_data:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->x:Landroid/widget/TextView;

    .line 968
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_data_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->w:Landroid/widget/TextView;

    .line 969
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_bodyfat_data:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->y:Landroid/widget/TextView;

    .line 970
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_bodyfat_uint:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->C:Landroid/widget/TextView;

    .line 971
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_muscle_data:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->z:Landroid/widget/TextView;

    .line 972
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_muscle_uint:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->B:Landroid/widget/TextView;

    .line 973
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->w:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 974
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->C:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 975
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->B:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 976
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_up_arrow_left:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->t:Landroid/widget/ImageView;

    .line 977
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_up_arrow_right:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->u:Landroid/widget/ImageView;

    .line 978
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_time_date_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->s:Landroid/widget/TextView;

    .line 979
    sget v0, Lcom/huawei/ui/main/R$id;->tv_fat_avg_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->Y:Landroid/widget/TextView;

    .line 980
    sget v0, Lcom/huawei/ui/main/R$id;->tv_fat_avg_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->af:Landroid/widget/TextView;

    .line 982
    sget v0, Lcom/huawei/ui/main/R$id;->tv_weight_avg_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ab:Landroid/widget/TextView;

    .line 983
    sget v0, Lcom/huawei/ui/main/R$id;->tv_weight_avg_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ag:Landroid/widget/TextView;

    .line 985
    sget v0, Lcom/huawei/ui/main/R$id;->tv_muscle_avg_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aa:Landroid/widget/TextView;

    .line 986
    sget v0, Lcom/huawei/ui/main/R$id;->tv_muscle_avg_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ai:Landroid/widget/TextView;

    .line 988
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->af:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 989
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ag:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 990
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ai:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 993
    sget v0, Lcom/huawei/ui/main/R$id;->tv_weight_change_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ad:Landroid/widget/TextView;

    .line 994
    sget v0, Lcom/huawei/ui/main/R$id;->tv_weight_change_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aj:Landroid/widget/TextView;

    .line 996
    sget v0, Lcom/huawei/ui/main/R$id;->tv_fat_change_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ae:Landroid/widget/TextView;

    .line 997
    sget v0, Lcom/huawei/ui/main/R$id;->tv_fat_change_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->al:Landroid/widget/TextView;

    .line 999
    sget v0, Lcom/huawei/ui/main/R$id;->tv_muscle_change_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ah:Landroid/widget/TextView;

    .line 1000
    sget v0, Lcom/huawei/ui/main/R$id;->tv_muscle_change_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->am:Landroid/widget/TextView;

    .line 1002
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aj:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 1003
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->al:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 1004
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->am:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 1005
    sget v0, Lcom/huawei/ui/main/R$id;->left_arrow_iv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aq:Landroid/widget/LinearLayout;

    .line 1006
    sget v0, Lcom/huawei/ui/main/R$id;->right_arrow_iv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->an:Landroid/widget/LinearLayout;

    .line 1008
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1009
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->t:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_right_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1010
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->u:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_left_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 1012
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->t:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_left_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1013
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->u:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_right_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1015
    :goto_2
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1016
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->k()V

    .line 1018
    :cond_3
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->f()V

    .line 1019
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->I:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private f()V
    .locals 6

    .line 1042
    new-instance v3, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q:Landroid/content/Context;

    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1043
    sget v0, Lcom/huawei/ui/main/R$id;->weight_month_reduce_fat:I

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setId(I)V

    .line 1044
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1045
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1046
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aD:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 1047
    new-instance v0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aC:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    .line 1048
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v4

    .line 1049
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v5

    .line 1050
    sget v0, Lcom/huawei/ui/main/R$id;->weight_month_reduce_fat:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aC:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    invoke-virtual {v5, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 1051
    invoke-virtual {v5}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 1052
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Lo/fdn;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    return-object v0
.end method

.method private g()V
    .locals 7

    .line 745
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->V:Lo/acu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 746
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 747
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 749
    :cond_0
    return-void

    .line 751
    :cond_1
    const/4 v4, 0x1

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    .line 752
    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    const-string v0, "test"

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 753
    new-instance v6, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 754
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-virtual {v6, v2, v3, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setTimeRange(JJ)V

    .line 755
    invoke-virtual {v6, v4}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 756
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 757
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 758
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 759
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->V:Lo/acu;

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

    .line 760
    :cond_2
    const-string v0, "NULL"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    goto :goto_0

    .line 762
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->V:Lo/acu;

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

    .line 763
    const-string v0, "NULL"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    goto :goto_0

    .line 765
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->V:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    .line 769
    :goto_0
    invoke-virtual {v6, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 770
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$5;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)V

    invoke-interface {v0, v6, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 783
    return-void

    :array_0
    .array-data 4
        0x2716
    .end array-data
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->j:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->H:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->K:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)F
    .locals 1

    .line 104
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aB:F

    return v0
.end method

.method private k()V
    .locals 7

    .line 1022
    new-instance v3, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q:Landroid/content/Context;

    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1023
    sget v0, Lcom/huawei/ui/main/R$id;->weight_month_detail:I

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setId(I)V

    .line 1024
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1025
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1026
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->F:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 1027
    new-instance v0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->N:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    .line 1028
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 1029
    const-string v0, "PAGE_TYPE"

    const/4 v1, 0x2

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1030
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->N:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->setArguments(Landroid/os/Bundle;)V

    .line 1032
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v5

    .line 1033
    invoke-virtual {v5}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v6

    .line 1034
    sget v0, Lcom/huawei/ui/main/R$id;->weight_month_detail:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->N:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-virtual {v6, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 1035
    invoke-virtual {v6}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 1036
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/content/Context;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q:Landroid/content/Context;

    return-object v0
.end method

.method private l()V
    .locals 4

    .line 1289
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->j:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1290
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->I:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1291
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->H:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1292
    const/16 v0, 0xc8

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->v:I

    .line 1293
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aw:F

    iget v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aB:F

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->v:I

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 1294
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->m:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1296
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->f:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1297
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->f:Lo/fdo;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->o:Lo/ehe$a;

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->a(Lo/eih;Lo/eii;Lo/ehe$a;)Lo/eii;

    .line 1298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->h:Lo/ejk;

    sget-object v2, Lo/eic;->T:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->p:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->m:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->h:Lo/ejk;

    sget-object v2, Lo/eic;->T:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->n:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->f:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->e(Lo/fet;Lo/fdo;)V

    .line 1301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->V:Lo/acu;

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 1302
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    iget v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->as:I

    invoke-virtual {v0, v1}, Lo/fet;->i(I)V

    .line 1304
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 1306
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)I
    .locals 1

    .line 104
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ak:I

    return v0
.end method

.method private m()V
    .locals 4

    .line 1312
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->j:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->I:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->H:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1315
    const/16 v0, 0xc9

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->v:I

    .line 1316
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->av:F

    iget v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aA:F

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->v:I

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 1317
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->m:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1318
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1319
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->f:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1320
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->m:Lo/fdo;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->n:Lo/ehe$a;

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->a(Lo/eih;Lo/eii;Lo/ehe$a;)Lo/eii;

    .line 1321
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->h:Lo/ejk;

    sget-object v2, Lo/eic;->T:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->p:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1322
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->f:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->h:Lo/ejk;

    sget-object v2, Lo/eic;->T:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->o:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1323
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->m:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->e(Lo/fet;Lo/fdo;)V

    .line 1324
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->D()V

    .line 1325
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 1326
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->J:Landroid/widget/TextView;

    return-object v0
.end method

.method private n()V
    .locals 1

    .line 1058
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aq:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1059
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->an:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1060
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->H:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1061
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->I:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1062
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1064
    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ag:Landroid/widget/TextView;

    return-object v0
.end method

.method private o()V
    .locals 4

    .line 1209
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ad()Z

    move-result v2

    .line 1210
    if-eqz v2, :cond_0

    .line 1211
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aq:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1212
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ay:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    .line 1214
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aq:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1215
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ay:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1218
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->aj()Z

    move-result v3

    .line 1219
    if-eqz v3, :cond_1

    .line 1220
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->an:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aF:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_1

    .line 1223
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->an:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1224
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aF:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1226
    :goto_1
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/LinearLayout;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->S:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private p()V
    .locals 2

    .line 1195
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$1;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)V

    invoke-virtual {v0, v1}, Lo/fet;->setPagerNoMoreListener(Lo/eih$p;)V

    .line 1206
    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->Y:Landroid/widget/TextView;

    return-object v0
.end method

.method private q()V
    .locals 4

    .line 1508
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGoalData(),begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1509
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->V:Lo/acu;

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 1510
    return-void

    .line 1512
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$10;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$10;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3, v1}, Lo/clt;->d(IILo/clz;)V

    .line 1537
    return-void
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ab:Landroid/widget/TextView;

    return-object v0
.end method

.method private r()V
    .locals 4

    .line 1487
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5411\u5de6\u6ed1\u52a8"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aF:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1489
    return-void

    .line 1491
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ah()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1492
    return-void

    .line 1494
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$9;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$9;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Lo/fet;)V

    invoke-virtual {v0, v1}, Lo/fet;->a(Lo/eih$k;)V

    .line 1500
    return-void
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ai:Landroid/widget/TextView;

    return-object v0
.end method

.method private s()V
    .locals 4

    .line 1466
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5411\u53f3\u6ed1\u52a8\uff0ctimeType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ak:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1467
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ay:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1468
    return-void

    .line 1470
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ah()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1471
    return-void

    .line 1473
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$8;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$8;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;Lo/fet;)V

    invoke-virtual {v0, v1}, Lo/fet;->b(Lo/eih$k;)V

    .line 1480
    return-void
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->af:Landroid/widget/TextView;

    return-object v0
.end method

.method private t()V
    .locals 4

    .line 1332
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->j:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1333
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->I:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1334
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->H:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1335
    const/16 v0, 0xca

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->v:I

    .line 1336
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->az:F

    iget v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ax:F

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->v:I

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 1337
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->m:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1338
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1339
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->f:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1340
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l:Lo/fdo;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->p:Lo/ehe$a;

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->a(Lo/eih;Lo/eii;Lo/ehe$a;)Lo/eii;

    .line 1341
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->m:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->h:Lo/ejk;

    sget-object v2, Lo/eic;->T:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->n:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1342
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->f:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->h:Lo/ejk;

    sget-object v2, Lo/eic;->T:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->o:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1343
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->e(Lo/fet;Lo/fdo;)V

    .line 1344
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->D()V

    .line 1345
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 1346
    return-void
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aa:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic v(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->B:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic w(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->z:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic x(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->w:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->x:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->C:Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method protected a()V
    .locals 4

    .line 584
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadDataSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    return-void
.end method

.method protected a(Landroid/view/View;)V
    .locals 4

    .line 1575
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setEmptyView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1576
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 1581
    return-void
.end method

.method protected c(Landroid/view/View;)V
    .locals 2

    .line 562
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->e(Landroid/view/View;)V

    .line 563
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->b(Landroid/view/View;)V

    .line 564
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->n()V

    .line 567
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 568
    const/4 v0, 0x6

    iput v0, v1, Landroid/os/Message;->what:I

    .line 569
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$e;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$e;->sendMessage(Landroid/os/Message;)Z

    .line 570
    return-void
.end method

.method public c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V
    .locals 2

    .line 1175
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    .line 1176
    if-nez v0, :cond_0

    .line 1177
    return-void

    .line 1179
    :cond_0
    invoke-virtual {v0}, Lo/eih;->aa()Lo/eih$h;

    move-result-object v1

    .line 1180
    if-nez v1, :cond_1

    .line 1181
    return-void

    .line 1183
    :cond_1
    invoke-interface {v1, p1, p2, p3, p4}, Lo/eih$h;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1184
    return-void
.end method

.method public c(Z)V
    .locals 4

    .line 720
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData resumeFlag = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->r:Z

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

    .line 721
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->r:Z

    if-nez v0, :cond_0

    if-eqz p1, :cond_3

    .line 722
    :cond_0
    if-nez p1, :cond_1

    .line 723
    const/16 v0, 0xc8

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->v:I

    .line 724
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aq:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 725
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->an:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 726
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->T:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 728
    :cond_1
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->V:Lo/acu;

    .line 729
    sget-object v0, Lo/acs;->c:Lo/acs;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->V:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/acs;->e(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->Z:Ljava/util/List;

    .line 730
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->Z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 731
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 732
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->h()V

    .line 733
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->g()V

    goto :goto_0

    .line 735
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->G:Lo/fei;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 736
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->G:Lo/fei;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-interface {v0, v1}, Lo/fei;->d(Ljava/util/Date;)V

    .line 737
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 738
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->h()V

    .line 743
    :cond_3
    :goto_0
    return-void
.end method

.method protected d(Landroid/view/View;)Landroid/view/View;
    .locals 1

    .line 924
    const/4 v0, 0x0

    return-object v0
.end method

.method protected e()I
    .locals 1

    .line 579
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_trend:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 1270
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1272
    :pswitch_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l()V

    .line 1273
    goto :goto_0

    .line 1275
    :pswitch_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->m()V

    .line 1276
    goto :goto_0

    .line 1278
    :pswitch_2
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->t()V

    .line 1279
    .line 1283
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0xc8
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public e(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fel;>;)V"
        }
    .end annotation

    .line 1388
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 1389
    const/16 v0, 0xa

    iput v0, v2, Landroid/os/Message;->what:I

    .line 1390
    iput-object p1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1391
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aG:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1392
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aG:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1394
    :cond_0
    return-void
.end method

.method public e(Lo/fei;)V
    .locals 2

    .line 1260
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->G:Lo/fei;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1261
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->G:Lo/fei;

    .line 1263
    :cond_0
    return-void
.end method

.method public h()V
    .locals 4

    .line 1082
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initChartView start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1083
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    .line 1084
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->O:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->O:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1085
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->O:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1087
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    .line 1088
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->X:Lo/fch;

    .line 1089
    const/16 v0, 0xc8

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->v:I

    .line 1090
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->j:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1091
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->I:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1092
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->H:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1093
    new-instance v0, Lo/fet;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fet;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    .line 1094
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/fet;->setLayerType(ILandroid/graphics/Paint;)V

    .line 1095
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->O:Ljava/util/ArrayList;

    .line 1096
    new-instance v0, Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/eic;->T:Lo/eic;

    invoke-direct {v0, v1, v2}, Lo/fdn;-><init>(Landroid/content/Context;Lo/eic;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    .line 1097
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->p()V

    .line 1098
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    sget-object v2, Lo/eic;->T:Lo/eic;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/eih;Lo/eic;)Lo/eii;

    .line 1099
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->O:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1100
    new-instance v0, Lo/fch;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->O:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lo/fch;-><init>(Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->X:Lo/fch;

    .line 1101
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->R:Lo/fci;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->X:Lo/fch;

    invoke-virtual {v0, v1}, Lo/fci;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 1102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->R:Lo/fci;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fci;->setScanScroll(Z)V

    .line 1103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$2;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)V

    invoke-virtual {v0, v1}, Lo/fet;->d(Lo/eih$m;)V

    .line 1113
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth$3;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;)V

    invoke-virtual {v0, v1}, Lo/fet;->setOnMarkViewTextNotify(Lo/elc$c;)V

    .line 1153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->o:Lo/ehe$a;

    sget-object v1, Lo/eic;->T:Lo/eic;

    invoke-virtual {v0, v1}, Lo/ehe$a;->c(Lo/eic;)Lo/ehe$a;

    .line 1154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->o:Lo/ehe$a;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/ehe$a;->c(I)Lo/ehe$a;

    .line 1155
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->o:Lo/ehe$a;

    invoke-virtual {v0, v1}, Lo/fdn;->e(Lo/ehe$a;)Lo/fdo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->f:Lo/fdo;

    .line 1156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->p:Lo/ehe$a;

    sget-object v1, Lo/eic;->T:Lo/eic;

    invoke-virtual {v0, v1}, Lo/ehe$a;->c(Lo/eic;)Lo/ehe$a;

    .line 1157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->p:Lo/ehe$a;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/ehe$a;->c(I)Lo/ehe$a;

    .line 1158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->p:Lo/ehe$a;

    invoke-virtual {v0, v1}, Lo/fdn;->e(Lo/ehe$a;)Lo/fdo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l:Lo/fdo;

    .line 1159
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->n:Lo/ehe$a;

    sget-object v1, Lo/eic;->T:Lo/eic;

    invoke-virtual {v0, v1}, Lo/ehe$a;->c(Lo/eic;)Lo/ehe$a;

    .line 1160
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->n:Lo/ehe$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ehe$a;->c(I)Lo/ehe$a;

    .line 1161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->n:Lo/ehe$a;

    invoke-virtual {v0, v1}, Lo/fdn;->e(Lo/ehe$a;)Lo/fdo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->m:Lo/fdo;

    .line 1162
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ar:Lo/fdn;

    invoke-virtual {v0}, Lo/ehl;->d()Lo/ejk;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->h:Lo/ejk;

    .line 1163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->h:Lo/ejk;

    sget-object v2, Lo/eic;->T:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->p:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->m:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->h:Lo/ejk;

    sget-object v2, Lo/eic;->T:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->n:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->f:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->h:Lo/ejk;

    sget-object v2, Lo/eic;->T:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->o:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aG:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1167
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aG:Landroid/os/Handler;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1169
    :cond_1
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initChartView end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1170
    return-void
.end method

.method protected i()V
    .locals 1

    .line 597
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->P:Ljava/util/Date;

    .line 598
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ac:Ljava/util/List;

    .line 599
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ao:Ljava/util/List;

    .line 600
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1234
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 1235
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->r:Z

    .line 1236
    sget v0, Lcom/huawei/ui/main/R$id;->left_arrow_iv:I

    if-ne v2, v0, :cond_0

    .line 1237
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->s()V

    goto :goto_0

    .line 1238
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->right_arrow_iv:I

    if-ne v2, v0, :cond_1

    .line 1239
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->r()V

    goto :goto_0

    .line 1240
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_weight_layout:I

    if-ne v2, v0, :cond_2

    .line 1241
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->l()V

    goto :goto_0

    .line 1242
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_weight_bodyfat_layout:I

    if-ne v2, v0, :cond_3

    .line 1243
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->m()V

    goto :goto_0

    .line 1244
    :cond_3
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_deep_weight_layout:I

    if-ne v2, v0, :cond_4

    .line 1245
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->t()V

    goto :goto_0

    .line 1247
    :cond_4
    sget v0, Lcom/huawei/ui/main/R$id;->ly_click_data:I

    if-ne v2, v0, :cond_5

    .line 1248
    const-string v0, "--"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->T:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1249
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->G:Lo/fei;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 1250
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->J()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->E:J

    .line 1251
    new-instance v3, Ljava/util/Date;

    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->E:J

    invoke-direct {v3, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 1252
    const/4 v0, 0x0

    if-eq v0, v3, :cond_5

    .line 1253
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->G:Lo/fei;

    invoke-interface {v0, v3}, Lo/fei;->d(Ljava/util/Date;)V

    .line 1258
    :cond_5
    :goto_0
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1566
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->onDestroy()V

    .line 1567
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ac:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ac:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1568
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->ac:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1570
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->q:Landroid/content/Context;

    .line 1571
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 589
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->onPause()V

    .line 590
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause called!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 591
    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 3

    .line 884
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->setUserVisibleHint(Z)V

    .line 885
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aE:Landroid/widget/ScrollView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 886
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->aE:Landroid/widget/ScrollView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 888
    :cond_0
    return-void
.end method

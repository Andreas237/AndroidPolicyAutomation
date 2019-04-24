.class public Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;
.super Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;,
        Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;
    }
.end annotation


# instance fields
.field private A:Landroid/widget/LinearLayout;

.field private B:Landroid/widget/LinearLayout;

.field private C:Landroid/widget/LinearLayout;

.field private D:Lo/fde;

.field private E:Lo/fei;

.field private F:Landroid/widget/LinearLayout;

.field private G:Landroid/widget/LinearLayout;

.field private H:Ljava/util/Date;

.field private I:Landroid/widget/TextView;

.field private J:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private K:Lo/fch;

.field private L:Lo/fci;

.field private M:Landroid/widget/TextView;

.field private N:Lhuawei/widget/HwProgressBar;

.field private O:Lo/acu;

.field private P:Landroid/widget/TextView;

.field private Q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/acn;>;"
        }
    .end annotation
.end field

.field private R:Landroid/widget/TextView;

.field private S:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fel;>;"
        }
    .end annotation
.end field

.field private T:Landroid/widget/TextView;

.field private U:Landroid/widget/TextView;

.field private V:Landroid/widget/TextView;

.field private W:Landroid/widget/TextView;

.field private X:Landroid/widget/TextView;

.field private Y:Landroid/widget/TextView;

.field private Z:Landroid/widget/TextView;

.field private aA:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private aB:Landroid/widget/LinearLayout;

.field private aC:Landroid/os/Handler;

.field private aD:Landroid/widget/LinearLayout;

.field private aE:Landroid/widget/TextView;

.field private aG:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

.field private aa:Landroid/widget/TextView;

.field private ab:Landroid/widget/TextView;

.field private ac:Landroid/widget/TextView;

.field private ad:Landroid/widget/TextView;

.field private ae:Landroid/widget/LinearLayout;

.field private af:Landroid/widget/TextView;

.field private ag:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/HiGoalInfo;>;"
        }
    .end annotation
.end field

.field private ah:I

.field private ai:Lo/fet;

.field private aj:Lo/fdn;

.field private ak:Landroid/widget/TextView;

.field private al:Landroid/widget/LinearLayout;

.field private am:Landroid/widget/ImageView;

.field private an:F

.field private ao:I

.field private ap:F

.field private aq:I

.field private ar:F

.field private as:F

.field private at:F

.field private au:F

.field private av:Landroid/widget/LinearLayout;

.field private aw:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

.field private ax:Landroid/widget/LinearLayout;

.field private ay:Landroid/widget/ScrollView;

.field private az:Ljava/util/concurrent/atomic/AtomicBoolean;

.field protected f:Lo/fdo;

.field g:Lo/ejk;

.field h:Ljava/util/concurrent/ExecutorService;

.field i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/acn;>;"
        }
    .end annotation
.end field

.field private j:Landroid/widget/TextView;

.field protected k:Lo/fdo;

.field protected l:Lo/fdo;

.field m:Lo/ehe$a;

.field n:Lo/ehe$a;

.field o:Lo/ehe$a;

.field private p:Z

.field private q:Landroid/widget/ImageView;

.field private r:Landroid/widget/ImageView;

.field private s:Landroid/content/Context;

.field private t:Landroid/widget/TextView;

.field private u:I

.field private v:Landroid/widget/TextView;

.field private w:Landroid/widget/TextView;

.field private x:Landroid/widget/TextView;

.field private y:Landroid/widget/TextView;

.field private z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 531
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;-><init>()V

    .line 116
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p:Z

    .line 175
    const/4 v0, 0x6

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ah:I

    .line 187
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aq:I

    .line 188
    const/4 v0, 0x5

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ao:I

    .line 189
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->h:Ljava/util/concurrent/ExecutorService;

    .line 190
    const/high16 v0, 0x437a0000    # 250.0f

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->an:F

    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ar:F

    const/high16 v0, 0x43160000    # 150.0f

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ap:F

    .line 193
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->at:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->au:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->as:F

    .line 201
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->az:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 202
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aA:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 217
    new-instance v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aC:Landroid/os/Handler;

    .line 793
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->i:Ljava/util/List;

    .line 1135
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->k:Lo/fdo;

    .line 1136
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->f:Lo/fdo;

    .line 1137
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->l:Lo/fdo;

    .line 1138
    new-instance v0, Lo/ehe$a;

    invoke-direct {v0}, Lo/ehe$a;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->n:Lo/ehe$a;

    .line 1139
    new-instance v0, Lo/ehe$a;

    invoke-direct {v0}, Lo/ehe$a;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->m:Lo/ehe$a;

    .line 1140
    new-instance v0, Lo/ehe$a;

    invoke-direct {v0}, Lo/ehe$a;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->o:Lo/ehe$a;

    .line 532
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s:Landroid/content/Context;

    .line 534
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "new TrendFragment is created"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 535
    return-void
.end method

.method static synthetic A(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ax:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic B(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aB:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic C(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->z:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic D(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aE:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic E(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->W:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic F(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ad:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic G(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Z:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic H(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ac:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic I(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->V:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic J(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->af:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic K(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/acu;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->O:Lo/acu;

    return-object v0
.end method

.method static synthetic L(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I
    .locals 1

    .line 106
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->u:I

    return v0
.end method

.method static synthetic M(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->q()V

    return-void
.end method

.method static synthetic N(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)F
    .locals 1

    .line 106
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ar:F

    return v0
.end method

.method static synthetic O(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)F
    .locals 1

    .line 106
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ap:F

    return v0
.end method

.method static synthetic P(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->t:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic Q(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)F
    .locals 1

    .line 106
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->as:F

    return v0
.end method

.method static synthetic R(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)F
    .locals 1

    .line 106
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->au:F

    return v0
.end method

.method static synthetic S(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/os/Handler;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aC:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic T(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/Date;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->H:Ljava/util/Date;

    return-object v0
.end method

.method static synthetic U(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/ImageView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->am:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic V(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->P:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic W(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ak:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic X(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->R:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic Y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/List;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->S:Ljava/util/List;

    return-object v0
.end method

.method static synthetic Z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/List;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Q:Ljava/util/List;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;F)F
    .locals 0

    .line 106
    iput p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->at:F

    return p1
.end method

.method private a(Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;
    .locals 4

    .line 1484
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1485
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 1486
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "%"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    .line 1487
    const/4 v0, -0x1

    if-eq v3, v0, :cond_0

    .line 1488
    add-int/lit8 v0, v3, 0x1

    invoke-direct {p0, p1, p2, v3, v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Ljava/lang/String;FII)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 1490
    :cond_0
    return-object v2

    .line 1492
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->M:Landroid/widget/TextView;

    return-object v0
.end method

.method private a(Ljava/lang/String;IF)Ljava/lang/String;
    .locals 4

    .line 1266
    const/4 v3, 0x0

    .line 1267
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 1269
    :pswitch_0
    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ac:Landroid/widget/TextView;

    .line 1270
    goto :goto_1

    .line 1272
    :pswitch_1
    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->af:Landroid/widget/TextView;

    .line 1273
    goto :goto_1

    .line 1275
    :pswitch_2
    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ad:Landroid/widget/TextView;

    .line 1276
    goto :goto_1

    .line 1278
    :goto_0
    new-instance v3, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s:Landroid/content/Context;

    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1292
    :goto_1
    const/4 v0, 0x0

    cmpl-float v0, p3, v0

    if-lez v0, :cond_0

    .line 1293
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1294
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 1295
    :cond_0
    const/4 v0, 0x0

    cmpg-float v0, p3, v0

    if-gez v0, :cond_1

    .line 1296
    move-object v2, p1

    .line 1297
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 1299
    :cond_1
    const-string v2, "--"

    .line 1300
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1302
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

.method static synthetic a(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->H:Ljava/util/Date;

    return-object p1
.end method

.method private a(FFFFFF)V
    .locals 4

    .line 1235
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 1236
    const/16 v0, 0xb

    iput v0, v2, Landroid/os/Message;->what:I

    .line 1237
    new-instance v3, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;)V

    .line 1238
    invoke-virtual {v3, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->c(F)V

    .line 1239
    invoke-virtual {v3, p2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->e(F)V

    .line 1240
    invoke-virtual {v3, p3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->a(F)V

    .line 1241
    invoke-virtual {v3, p4}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->b(F)V

    .line 1242
    invoke-virtual {v3, p5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->d(F)V

    .line 1243
    invoke-virtual {v3, p6}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$e;->g(F)V

    .line 1244
    iput-object v3, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1245
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aC:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1246
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aC:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1248
    :cond_0
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 763
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 764
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "testReadWeightData return datas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 765
    return-void

    .line 767
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

    .line 769
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 770
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

    .line 771
    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->d(Lcom/huawei/hihealth/HiHealthData;)Lo/acn;

    move-result-object v6

    .line 772
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 773
    invoke-direct {p0, v6}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->a(Lo/acn;)V

    .line 775
    :cond_1
    goto :goto_0

    .line 776
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->i:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Ljava/util/List;)V

    .line 779
    :cond_3
    return-void
.end method

.method private a(Lo/acn;)V
    .locals 1

    .line 795
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->i:Ljava/util/List;

    if-nez v0, :cond_0

    .line 796
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->i:Ljava/util/List;

    .line 798
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 799
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 801
    :cond_1
    return-void
.end method

.method static synthetic aa(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I
    .locals 1

    .line 106
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ao:I

    return v0
.end method

.method private b(Landroid/view/View;)V
    .locals 3

    .line 1020
    sget v0, Lcom/huawei/ui/main/R$id;->weight_loading_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->G:Landroid/widget/LinearLayout;

    .line 1021
    sget v0, Lcom/huawei/ui/main/R$id;->loading_iv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->N:Lhuawei/widget/HwProgressBar;

    .line 1022
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->N:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 1023
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->G:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1024
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_viewpager:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fci;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->L:Lo/fci;

    .line 1025
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/util/List;)V
    .locals 0

    .line 106
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->a(Ljava/util/List;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;
    .locals 1

    .line 106
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->a(Ljava/lang/String;F)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method private c(Ljava/lang/String;FII)Landroid/text/SpannableStringBuilder;
    .locals 3

    .line 1478
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 1479
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s:Landroid/content/Context;

    invoke-static {v1, p2}, Lo/fef;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    const/16 v1, 0x11

    invoke-virtual {v2, v0, p3, p4, v1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 1480
    return-object v2
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Ljava/util/List;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ag:Ljava/util/List;

    return-object v0
.end method

.method private c(FFF)V
    .locals 4

    .line 1223
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 1224
    const/16 v0, 0x9

    iput v0, v2, Landroid/os/Message;->what:I

    .line 1225
    new-instance v3, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$5;)V

    .line 1226
    invoke-virtual {v3, p3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;->e(F)V

    .line 1227
    invoke-virtual {v3, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;->c(F)V

    .line 1228
    invoke-virtual {v3, p2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$a;->d(F)V

    .line 1229
    iput-object v3, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1230
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aC:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1231
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aC:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1233
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;FFF)V
    .locals 0

    .line 106
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(FFF)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;FFFFFF)V
    .locals 0

    .line 106
    invoke-direct/range {p0 .. p6}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->a(FFFFFF)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/util/Date;I)V
    .locals 0

    .line 106
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->d(Ljava/util/Date;I)V

    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/acn;>;)V"
        }
    .end annotation

    .line 803
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initvalue = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 804
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 805
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 806
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 807
    const/4 v7, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 808
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 809
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->d()D

    move-result-wide v0

    double-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 810
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 811
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    double-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 813
    :cond_0
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 814
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    double-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 807
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 818
    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 819
    invoke-static {v4}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->at:F

    .line 820
    invoke-static {v4}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->an:F

    .line 822
    :cond_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 824
    invoke-static {v5}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->au:F

    .line 825
    invoke-static {v5}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ar:F

    .line 827
    :cond_4
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 829
    invoke-static {v6}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->as:F

    .line 830
    invoke-static {v6}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ap:F

    .line 832
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aC:Landroid/os/Handler;

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 833
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)F
    .locals 1

    .line 106
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->an:F

    return v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;F)F
    .locals 0

    .line 106
    iput p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->an:F

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;I)I
    .locals 0

    .line 106
    iput p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aq:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/lang/String;IF)Ljava/lang/String;
    .locals 1

    .line 106
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->a(Ljava/lang/String;IF)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Lcom/huawei/hihealth/HiHealthData;)Lo/acn;
    .locals 5

    .line 781
    const-string v0, "weight"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 782
    new-instance v4, Lo/acn;

    invoke-direct {v4}, Lo/acn;-><init>()V

    .line 783
    const-string v0, "weight"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->e(D)V

    .line 784
    const-string v0, "weight_bodyfat"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->c(D)V

    .line 785
    const-string v0, "weight_muscles"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->p(D)V

    .line 786
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->a(J)V

    .line 787
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->c(J)V

    .line 788
    return-object v4

    .line 790
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private d(Ljava/util/Date;I)V
    .locals 22

    .line 588
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procceedValue  start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 589
    move/from16 v0, p2

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ah:I

    .line 590
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->S:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 592
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 594
    :sswitch_0
    const/16 v0, -0xb

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v4

    .line 595
    goto :goto_1

    .line 597
    :goto_0
    const/4 v4, 0x0

    .line 601
    :goto_1
    const-string v5, ""

    .line 615
    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    .line 616
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Q:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 617
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Q:Ljava/util/List;

    move-object/from16 v1, v17

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 619
    :cond_0
    move/from16 v18, v4

    :goto_2
    if-ltz v18, :cond_d

    .line 620
    new-instance v19, Lo/fel;

    invoke-direct/range {v19 .. v19}, Lo/fel;-><init>()V

    .line 621
    const/4 v12, 0x0

    .line 622
    const/4 v13, 0x0

    .line 623
    const/4 v14, 0x0

    .line 624
    const/4 v6, 0x0

    .line 625
    const/4 v7, 0x0

    .line 626
    const/4 v8, 0x0

    .line 627
    const/16 v20, 0x0

    :goto_3
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v20

    if-ge v1, v0, :cond_5

    .line 628
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

    .line 629
    invoke-virtual/range {p1 .. p1}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v5

    .line 630
    const/16 v16, 0x1

    .line 631
    if-eqz v16, :cond_4

    .line 632
    const/4 v0, 0x6

    move/from16 v1, p2

    if-ne v0, v1, :cond_4

    .line 633
    move-object/from16 v0, p1

    invoke-static {v15, v0}, Lo/fec;->d(Ljava/util/Date;Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 635
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 636
    const/16 v21, 0x228

    goto :goto_4

    .line 639
    :cond_1
    const/16 v21, 0xfa

    .line 642
    :goto_4
    move-object/from16 v0, v17

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->d()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_2

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

    if-gtz v0, :cond_2

    .line 643
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

    .line 645
    add-int/lit8 v12, v12, 0x1

    .line 647
    :cond_2
    move-object/from16 v0, v17

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_3

    move-object/from16 v0, v17

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    const-wide/high16 v2, 0x4049000000000000L    # 50.0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_3

    .line 648
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

    .line 649
    add-int/lit8 v13, v13, 0x1

    .line 651
    :cond_3
    move-object/from16 v0, v17

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_4

    move-object/from16 v0, v17

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    const-wide v2, 0x4062c00000000000L    # 150.0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_4

    .line 652
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

    .line 653
    add-int/lit8 v14, v14, 0x1

    .line 627
    :cond_4
    add-int/lit8 v20, v20, 0x1

    goto/16 :goto_3

    .line 661
    :cond_5
    if-eqz v12, :cond_6

    int-to-float v0, v12

    div-float v9, v6, v0

    goto :goto_5

    :cond_6
    const/4 v9, 0x0

    .line 662
    :goto_5
    if-eqz v13, :cond_7

    int-to-float v0, v13

    div-float v10, v7, v0

    goto :goto_6

    :cond_7
    const/4 v10, 0x0

    .line 663
    :goto_6
    if-eqz v14, :cond_8

    int-to-float v0, v14

    div-float v11, v8, v0

    goto :goto_7

    :cond_8
    const/4 v11, 0x0

    .line 664
    :goto_7
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 665
    float-to-double v0, v9

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-float v9, v0

    .line 666
    float-to-double v0, v11

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-float v11, v0

    .line 668
    :cond_9
    const/4 v0, 0x0

    if-eq v0, v5, :cond_b

    const-string v0, ""

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 669
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ah:I

    const/4 v1, 0x3

    if-eq v1, v0, :cond_a

    .line 670
    invoke-static/range {p1 .. p1}, Lo/dbu;->n(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lo/fel;->a(Ljava/lang/String;)V

    goto :goto_8

    .line 673
    :cond_a
    move-object/from16 v0, v19

    invoke-virtual {v0, v5}, Lo/fel;->a(Ljava/lang/String;)V

    .line 675
    :goto_8
    move-object/from16 v0, v19

    invoke-virtual {v0, v9}, Lo/fel;->e(F)V

    .line 676
    move-object/from16 v0, v19

    invoke-virtual {v0, v10}, Lo/fel;->b(F)V

    .line 677
    move-object/from16 v0, v19

    invoke-virtual {v0, v11}, Lo/fel;->d(F)V

    .line 678
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->S:Ljava/util/List;

    move-object/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 680
    :cond_b
    const/4 v0, 0x6

    move/from16 v1, p2

    if-ne v0, v1, :cond_c

    .line 681
    invoke-static/range {p1 .. p1}, Lo/fec;->c(Ljava/util/Date;)Ljava/util/Date;

    move-result-object p1

    .line 619
    :cond_c
    add-int/lit8 v18, v18, -0x1

    goto/16 :goto_2

    .line 685
    :cond_d
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procceedValue  end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 686
    return-void

    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_0
    .end sparse-switch
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I
    .locals 1

    .line 106
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aq:I

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ag:Ljava/util/List;

    return-object p1
.end method

.method private e(I)V
    .locals 4

    .line 1306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$4;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1335
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

    .line 1337
    return-void
.end method

.method private e(Landroid/view/View;)V
    .locals 4

    .line 881
    sget v0, Lcom/huawei/ui/main/R$id;->weight_no_more:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ax:Landroid/widget/LinearLayout;

    .line 882
    sget v0, Lcom/huawei/ui/main/R$id;->weight_more:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aB:Landroid/widget/LinearLayout;

    .line 883
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_data_more:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aE:Landroid/widget/TextView;

    .line 884
    sget v0, Lcom/huawei/ui/main/R$id;->trend_scrollview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ay:Landroid/widget/ScrollView;

    .line 885
    sget v0, Lcom/huawei/ui/main/R$id;->trend_avg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->I:Landroid/widget/TextView;

    .line 886
    sget v0, Lcom/huawei/ui/main/R$id;->weight_message_service:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->av:Landroid/widget/LinearLayout;

    .line 887
    sget v0, Lcom/huawei/ui/main/R$id;->weight_reduce_fat:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aD:Landroid/widget/LinearLayout;

    .line 888
    sget v0, Lcom/huawei/ui/main/R$id;->im_right_jump:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->am:Landroid/widget/ImageView;

    .line 889
    sget v0, Lcom/huawei/ui/main/R$id;->avg_weight:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ak:Landroid/widget/TextView;

    .line 890
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ak:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_health_vo2max_level_average:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 891
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 892
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->am:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_weight_enter2:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 894
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->am:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_enter_blue:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 897
    :goto_0
    sget v0, Lcom/huawei/ui/main/R$id;->time_l:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->R:Landroid/widget/TextView;

    .line 898
    sget v0, Lcom/huawei/ui/main/R$id;->time_now:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->M:Landroid/widget/TextView;

    .line 899
    sget v0, Lcom/huawei/ui/main/R$id;->time_now_uint:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->P:Landroid/widget/TextView;

    .line 900
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_horizontal_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fde;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->D:Lo/fde;

    .line 901
    sget v0, Lcom/huawei/ui/main/R$id;->navigation_spots:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->B:Landroid/widget/LinearLayout;

    .line 902
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 903
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->B:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 905
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->B:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 907
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->D:Lo/fde;

    new-instance v1, Lo/fcw;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->B:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s:Landroid/content/Context;

    invoke-direct {v1, v2, v3}, Lo/fcw;-><init>(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lo/fde;->setScrollViewListener(Lo/fcw;)V

    .line 908
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_weight_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->C:Landroid/widget/LinearLayout;

    .line 909
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_weight_bodyfat_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->A:Landroid/widget/LinearLayout;

    .line 910
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_deep_weight_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->F:Landroid/widget/LinearLayout;

    .line 912
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->A:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 913
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->F:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 914
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->C:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 915
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_data:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->x:Landroid/widget/TextView;

    .line 916
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_data_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->v:Landroid/widget/TextView;

    .line 917
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_bodyfat_data:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->y:Landroid/widget/TextView;

    .line 918
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_bodyfat_uint:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->w:Landroid/widget/TextView;

    .line 919
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_muscle_data:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->z:Landroid/widget/TextView;

    .line 920
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_deep_weight_muscle_uint:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->j:Landroid/widget/TextView;

    .line 921
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->v:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 922
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->w:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 923
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->j:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 924
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_up_arrow_left:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->r:Landroid/widget/ImageView;

    .line 925
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_up_arrow_right:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->q:Landroid/widget/ImageView;

    .line 926
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_time_date_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->t:Landroid/widget/TextView;

    .line 927
    sget v0, Lcom/huawei/ui/main/R$id;->tv_fat_avg_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->U:Landroid/widget/TextView;

    .line 928
    sget v0, Lcom/huawei/ui/main/R$id;->tv_fat_avg_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aa:Landroid/widget/TextView;

    .line 930
    sget v0, Lcom/huawei/ui/main/R$id;->tv_weight_avg_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->X:Landroid/widget/TextView;

    .line 931
    sget v0, Lcom/huawei/ui/main/R$id;->tv_weight_avg_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Y:Landroid/widget/TextView;

    .line 933
    sget v0, Lcom/huawei/ui/main/R$id;->tv_muscle_avg_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->T:Landroid/widget/TextView;

    .line 934
    sget v0, Lcom/huawei/ui/main/R$id;->tv_muscle_avg_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ab:Landroid/widget/TextView;

    .line 936
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aa:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 937
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Y:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 938
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ab:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 941
    sget v0, Lcom/huawei/ui/main/R$id;->tv_weight_change_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->V:Landroid/widget/TextView;

    .line 942
    sget v0, Lcom/huawei/ui/main/R$id;->tv_weight_change_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ac:Landroid/widget/TextView;

    .line 944
    sget v0, Lcom/huawei/ui/main/R$id;->tv_fat_change_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->W:Landroid/widget/TextView;

    .line 945
    sget v0, Lcom/huawei/ui/main/R$id;->tv_fat_change_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->af:Landroid/widget/TextView;

    .line 947
    sget v0, Lcom/huawei/ui/main/R$id;->tv_muscle_change_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Z:Landroid/widget/TextView;

    .line 948
    sget v0, Lcom/huawei/ui/main/R$id;->tv_muscle_change_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ad:Landroid/widget/TextView;

    .line 950
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ac:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 951
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->af:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 952
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ad:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 953
    sget v0, Lcom/huawei/ui/main/R$id;->left_arrow_iv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ae:Landroid/widget/LinearLayout;

    .line 954
    sget v0, Lcom/huawei/ui/main/R$id;->right_arrow_iv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->al:Landroid/widget/LinearLayout;

    .line 956
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 957
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->r:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_right_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 958
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->q:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_left_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 960
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->r:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_left_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 961
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->q:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_right_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 964
    :goto_2
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_3

    .line 965
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->h()V

    .line 968
    :cond_3
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->g()V

    .line 969
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;I)V
    .locals 0

    .line 106
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->e(I)V

    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->A:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/fdn;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    return-object v0
.end method

.method private g()V
    .locals 6

    .line 991
    new-instance v3, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s:Landroid/content/Context;

    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 992
    sget v0, Lcom/huawei/ui/main/R$id;->weight_year_reduce_fat:I

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setId(I)V

    .line 993
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 994
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 995
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aD:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 996
    new-instance v0, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aG:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    .line 997
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v4

    .line 998
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v5

    .line 999
    sget v0, Lcom/huawei/ui/main/R$id;->weight_year_reduce_fat:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aG:Lcom/huawei/ui/main/stories/health/fragment/WeightReduceFatFragment;

    invoke-virtual {v5, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 1000
    invoke-virtual {v5}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 1001
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Lo/fet;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    return-object v0
.end method

.method private h()V
    .locals 7

    .line 971
    new-instance v3, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s:Landroid/content/Context;

    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 972
    sget v0, Lcom/huawei/ui/main/R$id;->weight_year_detail:I

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setId(I)V

    .line 973
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 974
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 975
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->av:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 976
    new-instance v0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aw:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    .line 977
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 978
    const-string v0, "PAGE_TYPE"

    const/4 v1, 0x2

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 979
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aw:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->setArguments(Landroid/os/Bundle;)V

    .line 981
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v5

    .line 982
    invoke-virtual {v5}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v6

    .line 983
    sget v0, Lcom/huawei/ui/main/R$id;->weight_year_detail:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aw:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-virtual {v6, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 984
    invoke-virtual {v6}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 985
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)F
    .locals 1

    .line 106
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->at:F

    return v0
.end method

.method static synthetic j(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->y:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->F:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private k()V
    .locals 7

    .line 723
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->O:Lo/acu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 724
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 725
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 727
    :cond_0
    return-void

    .line 729
    :cond_1
    const/4 v4, 0x1

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    .line 730
    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    const-string v0, "test"

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 731
    new-instance v6, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 732
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-virtual {v6, v2, v3, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setTimeRange(JJ)V

    .line 733
    invoke-virtual {v6, v4}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 734
    const/4 v0, 0x5

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 735
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 736
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 737
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->O:Lo/acu;

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

    .line 738
    :cond_2
    const-string v0, "NULL"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    goto :goto_0

    .line 740
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->O:Lo/acu;

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

    .line 741
    const-string v0, "NULL"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    goto :goto_0

    .line 743
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->O:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    .line 747
    :goto_0
    invoke-virtual {v6, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 748
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$1;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)V

    invoke-interface {v0, v6, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 761
    return-void

    :array_0
    .array-data 4
        0x2716
    .end array-data
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)I
    .locals 1

    .line 106
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ah:I

    return v0
.end method

.method private l()V
    .locals 1

    .line 1007
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ae:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1008
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->al:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1009
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->F:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1010
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->A:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1011
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1012
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->C:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private m()V
    .locals 4

    .line 1363
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aA:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1364
    return-void

    .line 1366
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ah()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1367
    return-void

    .line 1369
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$6;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$6;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Lo/fet;)V

    invoke-virtual {v0, v1}, Lo/fet;->a(Lo/eih$k;)V

    .line 1374
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5411\u5de6\u6ed1\u52a8"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1376
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/LinearLayout;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->G:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private n()V
    .locals 4

    .line 1343
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->az:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1344
    return-void

    .line 1346
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ah()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1347
    return-void

    .line 1349
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$9;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$9;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;Lo/fet;)V

    invoke-virtual {v0, v1}, Lo/fet;->b(Lo/eih$k;)V

    .line 1356
    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->I:Landroid/widget/TextView;

    return-object v0
.end method

.method private o()V
    .locals 2

    .line 1403
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$8;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$8;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)V

    invoke-virtual {v0, v1}, Lo/fet;->setPagerNoMoreListener(Lo/eih$p;)V

    .line 1414
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/content/Context;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s:Landroid/content/Context;

    return-object v0
.end method

.method private p()V
    .locals 4

    .line 1417
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ad()Z

    move-result v2

    .line 1418
    if-eqz v2, :cond_0

    .line 1419
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ae:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1420
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->az:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    .line 1422
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ae:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1423
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->az:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1426
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->aj()Z

    move-result v3

    .line 1427
    if-eqz v3, :cond_1

    .line 1428
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->al:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1429
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aA:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_1

    .line 1431
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->al:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1432
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aA:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1434
    :goto_1
    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->T:Landroid/widget/TextView;

    return-object v0
.end method

.method private q()V
    .locals 4

    .line 1440
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGoalData(),begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1441
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->O:Lo/acu;

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 1442
    return-void

    .line 1444
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$7;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$7;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3, v1}, Lo/clt;->d(IILo/clz;)V

    .line 1469
    return-void
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->X:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ab:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aa:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Y:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic v(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->j:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic w(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->v:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic x(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->x:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic y(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->w:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic z(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)Landroid/widget/TextView;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->U:Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method protected a()V
    .locals 4

    .line 569
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadDataSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 570
    return-void
.end method

.method protected a(Landroid/view/View;)V
    .locals 4

    .line 1507
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setEmptyView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1508
    return-void
.end method

.method public a(Lo/fei;)V
    .locals 2

    .line 537
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->E:Lo/fei;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 538
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->E:Lo/fei;

    .line 540
    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 1513
    return-void
.end method

.method protected c(Landroid/view/View;)V
    .locals 2

    .line 547
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->e(Landroid/view/View;)V

    .line 548
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->b(Landroid/view/View;)V

    .line 549
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->l()V

    .line 552
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 553
    const/4 v0, 0x6

    iput v0, v1, Landroid/os/Message;->what:I

    .line 554
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$e;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$e;->sendMessage(Landroid/os/Message;)Z

    .line 555
    return-void
.end method

.method public c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V
    .locals 2

    .line 1125
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    .line 1126
    if-nez v0, :cond_0

    .line 1127
    return-void

    .line 1129
    :cond_0
    invoke-virtual {v0}, Lo/eih;->aa()Lo/eih$h;

    move-result-object v1

    .line 1130
    if-nez v1, :cond_1

    .line 1131
    return-void

    .line 1133
    :cond_1
    invoke-interface {v1, p1, p2, p3, p4}, Lo/eih$h;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1134
    return-void
.end method

.method public c(Z)V
    .locals 4

    .line 695
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData resumeFlag = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p:Z

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

    .line 696
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p:Z

    if-nez v0, :cond_0

    if-eqz p1, :cond_3

    .line 697
    :cond_0
    if-nez p1, :cond_1

    .line 698
    const/16 v0, 0xc8

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->u:I

    .line 702
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ae:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 703
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->al:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 704
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->M:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 706
    :cond_1
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->O:Lo/acu;

    .line 707
    sget-object v0, Lo/acs;->c:Lo/acs;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->O:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/acs;->e(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Q:Ljava/util/List;

    .line 708
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->Q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 709
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 710
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->f()V

    .line 711
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->k()V

    goto :goto_0

    .line 713
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->E:Lo/fei;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 714
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->E:Lo/fei;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-interface {v0, v1}, Lo/fei;->d(Ljava/util/Date;)V

    .line 715
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 716
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->f()V

    .line 721
    :cond_3
    :goto_0
    return-void
.end method

.method protected d(Landroid/view/View;)Landroid/view/View;
    .locals 1

    .line 865
    const/4 v0, 0x0

    return-object v0
.end method

.method protected e()I
    .locals 1

    .line 564
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_trend:I

    return v0
.end method

.method public e(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fel;>;)V"
        }
    .end annotation

    .line 1256
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 1257
    const/16 v0, 0xa

    iput v0, v2, Landroid/os/Message;->what:I

    .line 1258
    iput-object p1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aC:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1260
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aC:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1262
    :cond_0
    return-void
.end method

.method public f()V
    .locals 7

    .line 1030
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initChartView startweek"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1031
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 1032
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    .line 1033
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->J:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->J:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1034
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->J:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1036
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    .line 1037
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->K:Lo/fch;

    .line 1038
    const/16 v0, 0xc8

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->u:I

    .line 1039
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->C:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1040
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->A:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1041
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->F:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1042
    new-instance v0, Lo/fet;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fet;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    .line 1043
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/fet;->setLayerType(ILandroid/graphics/Paint;)V

    .line 1044
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->J:Ljava/util/ArrayList;

    .line 1045
    new-instance v0, Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/eic;->W:Lo/eic;

    invoke-direct {v0, v1, v2}, Lo/fdn;-><init>(Landroid/content/Context;Lo/eic;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    .line 1046
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->o()V

    .line 1047
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    sget-object v2, Lo/eic;->W:Lo/eic;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/eih;Lo/eic;)Lo/eii;

    .line 1048
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->J:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1049
    new-instance v0, Lo/fch;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->J:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lo/fch;-><init>(Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->K:Lo/fch;

    .line 1050
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->L:Lo/fci;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->K:Lo/fch;

    invoke-virtual {v0, v1}, Lo/fci;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 1051
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->L:Lo/fci;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fci;->setScanScroll(Z)V

    .line 1052
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$2;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)V

    invoke-virtual {v0, v1}, Lo/fet;->d(Lo/eih$m;)V

    .line 1063
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear$3;-><init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;)V

    invoke-virtual {v0, v1}, Lo/fet;->setOnMarkViewTextNotify(Lo/elc$c;)V

    .line 1102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->m:Lo/ehe$a;

    sget-object v1, Lo/eic;->W:Lo/eic;

    invoke-virtual {v0, v1}, Lo/ehe$a;->c(Lo/eic;)Lo/ehe$a;

    .line 1103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->m:Lo/ehe$a;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/ehe$a;->c(I)Lo/ehe$a;

    .line 1104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->m:Lo/ehe$a;

    invoke-virtual {v0, v1}, Lo/fdn;->e(Lo/ehe$a;)Lo/fdo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->k:Lo/fdo;

    .line 1105
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->o:Lo/ehe$a;

    sget-object v1, Lo/eic;->W:Lo/eic;

    invoke-virtual {v0, v1}, Lo/ehe$a;->c(Lo/eic;)Lo/ehe$a;

    .line 1106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->o:Lo/ehe$a;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/ehe$a;->c(I)Lo/ehe$a;

    .line 1107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->o:Lo/ehe$a;

    invoke-virtual {v0, v1}, Lo/fdn;->e(Lo/ehe$a;)Lo/fdo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->l:Lo/fdo;

    .line 1108
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->n:Lo/ehe$a;

    sget-object v1, Lo/eic;->W:Lo/eic;

    invoke-virtual {v0, v1}, Lo/ehe$a;->c(Lo/eic;)Lo/ehe$a;

    .line 1109
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->n:Lo/ehe$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ehe$a;->c(I)Lo/ehe$a;

    .line 1110
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->n:Lo/ehe$a;

    invoke-virtual {v0, v1}, Lo/fdn;->e(Lo/ehe$a;)Lo/fdo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->f:Lo/fdo;

    .line 1111
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    invoke-virtual {v0}, Lo/ehl;->d()Lo/ejk;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->g:Lo/ejk;

    .line 1112
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->l:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->g:Lo/ejk;

    sget-object v2, Lo/eic;->W:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->o:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1113
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->f:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->g:Lo/ejk;

    sget-object v2, Lo/eic;->W:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->n:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1114
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->k:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->g:Lo/ejk;

    sget-object v2, Lo/eic;->W:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->m:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aC:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1116
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aC:Landroid/os/Handler;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1118
    :cond_1
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initChartView end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1119
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8fdb\u53bbChartView"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1120
    return-void
.end method

.method protected i()V
    .locals 1

    .line 583
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->S:Ljava/util/List;

    .line 584
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ag:Ljava/util/List;

    .line 585
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 1148
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 1149
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->p:Z

    .line 1150
    sget v0, Lcom/huawei/ui/main/R$id;->left_arrow_iv:I

    if-ne v4, v0, :cond_0

    .line 1151
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->n()V

    goto/16 :goto_0

    .line 1152
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->right_arrow_iv:I

    if-ne v4, v0, :cond_1

    .line 1153
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->m()V

    goto/16 :goto_0

    .line 1154
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_weight_layout:I

    if-ne v4, v0, :cond_2

    .line 1155
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->C:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->A:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->F:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1158
    const/16 v0, 0xc8

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->u:I

    .line 1159
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->an:F

    iget v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->at:F

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->u:I

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 1160
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->f:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->l:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1162
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->k:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->k:Lo/fdo;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->m:Lo/ehe$a;

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->a(Lo/eih;Lo/eii;Lo/ehe$a;)Lo/eii;

    .line 1164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->l:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->g:Lo/ejk;

    sget-object v2, Lo/eic;->W:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->o:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->f:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->g:Lo/ejk;

    sget-object v2, Lo/eic;->W:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->n:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->k:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->e(Lo/fet;Lo/fdo;)V

    .line 1167
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 1168
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->O:Lo/acu;

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    if-ne v0, v1, :cond_5

    .line 1169
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    iget v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aq:I

    invoke-virtual {v0, v1}, Lo/fet;->i(I)V

    goto/16 :goto_0

    .line 1172
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_weight_bodyfat_layout:I

    if-ne v4, v0, :cond_3

    .line 1173
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->C:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1174
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->A:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1175
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->F:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1176
    const/16 v0, 0xc9

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->u:I

    .line 1177
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ar:F

    iget v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->au:F

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->u:I

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 1178
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->f:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1179
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->l:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1180
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->k:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1181
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->f:Lo/fdo;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->n:Lo/ehe$a;

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->a(Lo/eih;Lo/eii;Lo/ehe$a;)Lo/eii;

    .line 1182
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->l:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->g:Lo/ejk;

    sget-object v2, Lo/eic;->W:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->o:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1183
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->k:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->g:Lo/ejk;

    sget-object v2, Lo/eic;->W:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->m:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1184
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->f:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->e(Lo/fet;Lo/fdo;)V

    .line 1185
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 1186
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->D()V

    goto/16 :goto_0

    .line 1187
    :cond_3
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_deep_weight_layout:I

    if-ne v4, v0, :cond_4

    .line 1188
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->C:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1189
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->A:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_base_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1190
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->F:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_weight_btn_shape:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 1191
    const/16 v0, 0xca

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->u:I

    .line 1192
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ap:F

    iget v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->as:F

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->u:I

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->e(FFI)V

    .line 1193
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->f:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1194
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->l:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1195
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->k:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->a(Lo/fet;Lo/fdo;)V

    .line 1196
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->l:Lo/fdo;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->o:Lo/ehe$a;

    invoke-virtual {v0, v1, v2, v3}, Lo/fdn;->a(Lo/eih;Lo/eii;Lo/ehe$a;)Lo/eii;

    .line 1197
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->f:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->g:Lo/ejk;

    sget-object v2, Lo/eic;->W:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->n:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1198
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->k:Lo/fdo;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->g:Lo/ejk;

    sget-object v2, Lo/eic;->W:Lo/eic;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->m:Lo/ehe$a;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 1199
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->aj:Lo/fdn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->l:Lo/fdo;

    invoke-virtual {v0, v1, v2}, Lo/fdn;->e(Lo/fet;Lo/fdo;)V

    .line 1200
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->ae()V

    .line 1201
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->D()V

    goto/16 :goto_0

    .line 1203
    :cond_4
    sget v0, Lcom/huawei/ui/main/R$id;->ly_click_data:I

    if-ne v4, v0, :cond_5

    .line 1204
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    .line 1205
    const-string v0, "--"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->M:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1206
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ai:Lo/fet;

    invoke-virtual {v0}, Lo/fet;->J()J

    move-result-wide v6

    .line 1207
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, v6, v7}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0}, Lo/dbu;->g(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v8, v0

    .line 1208
    iget-object v0, v5, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->a:Lo/enb;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/enb;->setCurrentItem(I)V

    .line 1209
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dpfcurrentTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1210
    iget-object v0, v5, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->i:Lo/fet;

    invoke-virtual {v0, v8}, Lo/fet;->e(I)Z

    .line 1211
    iget-object v0, v5, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->d:Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;

    iget v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->u:I

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentMonth;->e(I)V

    .line 1214
    :cond_5
    :goto_0
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1498
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->onDestroy()V

    .line 1499
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->S:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->S:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1500
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->S:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1502
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->s:Landroid/content/Context;

    .line 1503
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 574
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->onPause()V

    .line 575
    const-string v0, "WeightActivity_TrendFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause called!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 576
    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 3

    .line 869
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->setUserVisibleHint(Z)V

    .line 870
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ay:Landroid/widget/ScrollView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 871
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragmentYear;->ay:Landroid/widget/ScrollView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 873
    :cond_0
    return-void
.end method

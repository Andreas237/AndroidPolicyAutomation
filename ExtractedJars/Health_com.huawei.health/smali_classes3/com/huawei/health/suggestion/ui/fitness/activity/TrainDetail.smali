.class public Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;
.super Lcom/huawei/health/suggestion/ui/BaseStateActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lo/buu$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;,
        Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;,
        Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;,
        Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$c;,
        Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$g;,
        Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$b;,
        Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$k;,
        Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$f;,
        Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$e;,
        Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$d;
    }
.end annotation


# instance fields
.field private A:Lo/efy;

.field private B:Z

.field private C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

.field private D:Lo/egw;

.field private E:Landroid/widget/LinearLayout;

.field private F:Lo/bwp;

.field private G:Landroid/view/animation/TranslateAnimation;

.field private H:Landroid/view/animation/TranslateAnimation;

.field private I:Landroid/widget/LinearLayout;

.field private J:Lo/bwh;

.field private K:Ljava/util/List;

.field private L:I

.field private M:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation
.end field

.field private N:Lo/bvl;

.field private O:I

.field private P:Lo/bsp;

.field private Q:I

.field private R:I

.field private S:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;

.field private T:F

.field private U:Landroid/widget/ImageView;

.field private V:Landroid/widget/CheckBox;

.field private W:F

.field private X:Z

.field private Y:Z

.field private Z:Z

.field private aA:Lo/efy;

.field private aB:Lo/efy;

.field private aC:Lo/efy;

.field private aD:Lo/efy;

.field private aE:Lo/efy;

.field private aF:Lo/efy;

.field private aG:Lo/efy;

.field private aH:Landroid/widget/PopupWindow;

.field private aI:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;

.field private aJ:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;

.field private aK:Lo/efy;

.field private aL:Lo/efy;

.field private aM:Landroid/widget/LinearLayout;

.field private aN:Landroid/widget/LinearLayout;

.field private aO:Landroid/widget/LinearLayout;

.field private aP:Lo/egy;

.field private aQ:Landroid/widget/LinearLayout;

.field private aR:Lo/efy;

.field private aS:Lo/efy;

.field private aT:Landroid/widget/LinearLayout;

.field private aU:Lo/efy;

.field private aV:Landroid/widget/LinearLayout;

.field private aW:Lo/efy;

.field private aX:Lo/efy;

.field private aY:Lo/efy;

.field private aZ:Landroid/widget/ImageView;

.field private aa:Z

.field private ab:J

.field private ac:Z

.field private ad:[Ljava/lang/String;

.field private ae:[I

.field private af:Lo/emq;

.field private ag:Ljava/lang/String;

.field private ah:Landroid/support/v4/view/ViewPager;

.field private ai:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$f;

.field private aj:Landroid/view/View;

.field private ak:[I

.field private al:Landroid/view/View;

.field private am:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private an:Landroid/widget/LinearLayout;

.field private ao:Landroid/widget/LinearLayout;

.field private ap:Landroid/widget/LinearLayout;

.field private aq:Landroid/widget/LinearLayout;

.field private ar:Landroid/widget/LinearLayout;

.field private as:Landroid/widget/LinearLayout;

.field private at:Lo/efy;

.field private au:Lo/efy;

.field private av:Landroid/widget/LinearLayout;

.field private aw:Landroid/widget/LinearLayout;

.field private ax:Lo/efy;

.field private ay:Lo/efy;

.field private az:Lo/efy;

.field private ba:Lo/emr;

.field private bb:Ljava/lang/String;

.field private bc:Z

.field private bd:Z

.field private be:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$c;

.field private bf:Z

.field private bh:Lo/buu;

.field private bi:Landroid/os/Handler;

.field public d:Z

.field private f:Landroid/content/Context;

.field g:Lo/byf;

.field private h:Lo/efy;

.field private i:Lo/buv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/buv<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;"
        }
    .end annotation
.end field

.field private j:Lo/bvb;

.field private k:I

.field private l:Lo/efy;

.field private m:Lo/efy;

.field private n:Lo/efy;

.field private o:Lo/efy;

.field private p:Lo/efy;

.field private q:Landroid/widget/Button;

.field private r:Lo/byp;

.field private s:Landroid/widget/RelativeLayout;

.field private t:Landroid/widget/LinearLayout;

.field private u:Lo/efy;

.field private v:Landroid/support/v7/widget/RecyclerView;

.field private w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

.field private x:Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;

.field private y:Landroid/support/v7/widget/RecyclerView;

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 152
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;-><init>()V

    .line 169
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->k:I

    .line 199
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B:Z

    .line 205
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->K:Ljava/util/List;

    .line 214
    const/16 v0, 0xa

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->Q:I

    .line 216
    const v0, -0xffff01

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->R:I

    .line 225
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->Z:Z

    .line 226
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->Y:Z

    .line 227
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aa:Z

    .line 237
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->am:Ljava/util/ArrayList;

    .line 239
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$f;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$f;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ai:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$f;

    .line 245
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aP:Lo/egy;

    .line 271
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bb:Ljava/lang/String;

    .line 276
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bd:Z

    .line 277
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bc:Z

    .line 279
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bf:Z

    .line 283
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$4;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bi:Landroid/os/Handler;

    return-void
.end method

.method static synthetic A(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/health/suggestion/model/WorkoutRecord;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    return-object v0
.end method

.method private A()V
    .locals 2

    .line 1532
    invoke-static {}, Lo/bzy;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1533
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/bzy;->b(Landroid/content/Context;)V

    goto :goto_0

    .line 1536
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1537
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->j()V

    goto :goto_0

    .line 1539
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B()Z

    move-result v1

    invoke-static {v0, v1}, Lo/bzy;->d(Landroid/content/Context;Z)Z

    move-result v0

    invoke-static {}, Lo/bzy;->c()Z

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->e(ZZ)V

    .line 1542
    :goto_0
    return-void
.end method

.method static synthetic B(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 152
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ag()V

    return-void
.end method

.method private B()Z
    .locals 2

    .line 1478
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1479
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    return v0

    .line 1481
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private C()V
    .locals 4

    .line 1455
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->n()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1456
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->D()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1457
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBindedDeviceLayout()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "isHaveOrtherHeartRateDevice() = true"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1458
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1459
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->j()V

    .line 1461
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->s:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 1463
    :cond_1
    invoke-static {}, Lo/bzy;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1464
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBindedDeviceLayout() isBindedHeartRateDeviceWear = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1465
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B()Z

    move-result v1

    invoke-static {v0, v1}, Lo/bzy;->c(Landroid/content/Context;Z)Z

    move-result v0

    invoke-static {}, Lo/bzy;->c()Z

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->e(ZZ)V

    .line 1466
    return-void

    .line 1468
    :cond_2
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBindedDeviceLayout()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "isBindedHeartRateDeviceWear() = false"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1469
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B()Z

    move-result v1

    invoke-static {v0, v1}, Lo/bzy;->d(Landroid/content/Context;Z)Z

    move-result v0

    invoke-static {}, Lo/bzy;->c()Z

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->e(ZZ)V

    goto :goto_0

    .line 1472
    :cond_3
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBindedDeviceLayout()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "isRunWorkoutOfHeartRate() = false"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1473
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->s:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1475
    :goto_0
    return-void
.end method

.method static synthetic C(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 152
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w()V

    return-void
.end method

.method static synthetic D(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Ljava/lang/String;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z:Ljava/lang/String;

    return-object v0
.end method

.method private D()Z
    .locals 5

    .line 1449
    invoke-static {}, Lo/bzy;->e()Z

    move-result v4

    .line 1450
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHaveOrtherHeartRateDevice() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1451
    return v4
.end method

.method private E()V
    .locals 11

    .line 1617
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireExtendSeaMap()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bso;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    .line 1619
    if-eqz v4, :cond_4

    .line 1620
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutBeanMap "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1621
    const-string v0, "courseDesc"

    invoke-interface {v4, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1622
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ar:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1623
    const-string v0, "courseDesc"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;

    .line 1624
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->at:Lo/efy;

    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;->acquireTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1625
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->au:Lo/efy;

    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;->acquireContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1628
    :cond_0
    const-string v0, "trainingSuggest"

    invoke-interface {v4, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1629
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ap:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1630
    const-string v0, "trainingSuggest"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;

    .line 1631
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ax:Lo/efy;

    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;->acquireTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1632
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aG:Lo/efy;

    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;->acquireContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1635
    :cond_1
    const-string v0, "suitPeople"

    invoke-interface {v4, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1636
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aw:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1637
    const-string v0, "suitPeople"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;

    .line 1638
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aD:Lo/efy;

    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;->acquireTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1639
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aC:Lo/efy;

    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;->acquireContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1642
    :cond_2
    const-string v0, "bannerPeople"

    invoke-interface {v4, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1643
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->as:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1644
    const-string v0, "bannerPeople"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;

    .line 1645
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aF:Lo/efy;

    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;->acquireTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1646
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aE:Lo/efy;

    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;->acquireContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1649
    :cond_3
    const-string v0, "attention"

    invoke-interface {v4, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 1650
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->av:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1651
    const-string v0, "attention"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;

    .line 1652
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aK:Lo/efy;

    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;->acquireTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1653
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aL:Lo/efy;

    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/WorkoutExtendBean;->acquireContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1654
    goto/16 :goto_3

    .line 1657
    :cond_4
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "use old map "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1665
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireNarrowDesc()Ljava/lang/String;

    move-result-object v5

    .line 1666
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1668
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1669
    const-string v0, "extendMap"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    const-string v0, "extendMap"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 1670
    new-instance v8, Lorg/json/JSONObject;

    const-string v0, "extendMap"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1671
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonObject:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1672
    const-string v0, "\u8bfe\u7a0b\u8bf4\u660e"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 1673
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ar:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1674
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->at:Lo/efy;

    const-string v1, "\u8bfe\u7a0b\u8bf4\u660e"

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1676
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->l()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->n()Z

    move-result v0

    .line 1679
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->au:Lo/efy;

    const-string v1, "\u8bfe\u7a0b\u8bf4\u660e"

    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1681
    :cond_6
    const-string v0, "\u8bad\u7ec3\u5efa\u8bae"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 1682
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ap:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1683
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ax:Lo/efy;

    const-string v1, "\u8bad\u7ec3\u5efa\u8bae"

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1684
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aG:Lo/efy;

    const-string v1, "\u8bad\u7ec3\u5efa\u8bae"

    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1686
    :cond_7
    const-string v0, "\u9002\u7528\u4eba\u7fa4"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 1687
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aw:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1688
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aD:Lo/efy;

    const-string v1, "\u9002\u7528\u4eba\u7fa4"

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1689
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aC:Lo/efy;

    const-string v1, "\u9002\u7528\u4eba\u7fa4"

    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1691
    :cond_8
    const-string v0, "\u7981\u5fcc\u4eba\u7fa4"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 1692
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->as:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1693
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aF:Lo/efy;

    const-string v1, "\u7981\u5fcc\u4eba\u7fa4"

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1694
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aE:Lo/efy;

    const-string v1, "\u7981\u5fcc\u4eba\u7fa4"

    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1696
    :cond_9
    const-string v0, "\u6ce8\u610f\u4e8b\u9879"

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 1697
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->av:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1698
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aK:Lo/efy;

    const-string v1, "\u6ce8\u610f\u4e8b\u9879"

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1699
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aL:Lo/efy;

    const-string v1, "\u6ce8\u610f\u4e8b\u9879"

    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1701
    :cond_a
    goto :goto_0

    .line 1702
    :cond_b
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no has JsonObject"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1704
    :goto_0
    const-string v0, "recommendCourses"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1705
    new-instance v8, Lorg/json/JSONArray;

    const-string v0, "recommendCourses"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 1706
    const/4 v9, 0x0

    :goto_1
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v9, v0, :cond_c

    .line 1707
    invoke-virtual {v8, v9}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v10

    .line 1708
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P:Lo/bsp;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$10;

    invoke-direct {v1, p0, v6}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$10;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Ljava/util/List;)V

    const/4 v2, 0x0

    invoke-interface {v0, v10, v2, v1}, Lo/bsp;->c(Ljava/lang/String;Ljava/lang/String;Lo/bui;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 1706
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 1726
    :cond_c
    goto :goto_2

    .line 1727
    :cond_d
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no has jsonarray"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1731
    :goto_2
    goto :goto_3

    .line 1729
    :catch_0
    move-exception v7

    .line 1730
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "detailInfo JSONException:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1734
    :cond_e
    :goto_3
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireListRelativeWorkouts()Ljava/util/List;

    move-result-object v5

    .line 1735
    if-eqz v5, :cond_f

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_12

    .line 1736
    :cond_f
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user old extendmap"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1737
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1738
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireNarrowDesc()Ljava/lang/String;

    move-result-object v6

    .line 1739
    const/4 v7, 0x0

    .line 1741
    :try_start_1
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1742
    const-string v0, "recommendCourses"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 1743
    new-instance v8, Lorg/json/JSONArray;

    const-string v0, "recommendCourses"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 1744
    const/4 v9, 0x0

    :goto_4
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v9, v0, :cond_11

    .line 1745
    invoke-virtual {v8, v9}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v10

    .line 1746
    if-eqz v10, :cond_10

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_10

    .line 1747
    invoke-interface {v5, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1744
    :cond_10
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    .line 1753
    :cond_11
    goto :goto_5

    .line 1751
    :catch_1
    move-exception v8

    .line 1752
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRelativeCourses "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1757
    :cond_12
    :goto_5
    if-eqz v5, :cond_13

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_14

    .line 1758
    :cond_13
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no relative courses"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1759
    return-void

    .line 1761
    :cond_14
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1762
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 1763
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P:Lo/bsp;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$8;

    invoke-direct {v1, p0, v6}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$8;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Ljava/util/List;)V

    const/4 v2, 0x0

    invoke-interface {v0, v8, v2, v1}, Lo/bsp;->c(Ljava/lang/String;Ljava/lang/String;Lo/bui;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 1780
    goto :goto_6

    .line 1781
    :cond_15
    return-void
.end method

.method static synthetic E(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 152
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->v()V

    return-void
.end method

.method private F()Landroid/text/SpannableString;
    .locals 8

    .line 1584
    const-string v0, "\\d|[/]"

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->IDS_plugin_fitnessadvice_min:I

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 1586
    invoke-virtual {v2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDuration()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x42700000    # 60.0f

    div-float/2addr v2, v3

    float-to-int v2, v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 1587
    invoke-virtual {v4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDuration()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x42700000    # 60.0f

    div-float/2addr v4, v5

    float-to-double v4, v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 1586
    invoke-static {v1, v2, v3}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_detail_bigsize:I

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_detail_smasize:I

    .line 1584
    invoke-static {p0, v0, v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v0

    return-object v0
.end method

.method static synthetic F(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 152
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->K()V

    return-void
.end method

.method private G()Ljava/lang/String;
    .locals 7

    .line 1601
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1602
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUsers_mFitWorkout_null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1603
    const-string v0, ""

    return-object v0

    .line 1605
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->sug_fitness_personjoin:I

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireUsers()I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireUsers()I

    move-result v3

    int-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic G(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bsp;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P:Lo/bsp;

    return-object v0
.end method

.method private H()Landroid/text/SpannableString;
    .locals 8

    .line 1593
    const-string v0, "\\d|[/]"

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_km:I

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 1595
    invoke-virtual {v2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDistance()D

    move-result-wide v2

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v2, v4

    double-to-int v2, v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 1596
    invoke-virtual {v4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDistance()D

    move-result-wide v4

    const-wide v6, 0x408f400000000000L    # 1000.0

    div-double/2addr v4, v6

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 1595
    invoke-static {v1, v2, v3}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_detail_bigsize:I

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_detail_smasize:I

    .line 1593
    invoke-static {p0, v0, v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v0

    return-object v0
.end method

.method static synthetic H(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Ljava/util/ArrayList;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->M:Ljava/util/ArrayList;

    return-object v0
.end method

.method private I()Ljava/lang/String;
    .locals 5

    .line 1609
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1610
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getExerciseTimes_mFitWorkout_null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1611
    const-string v0, ""

    return-object v0

    .line 1613
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->sug_fit_finish:I

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireExerciseTimes()I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireExerciseTimes()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic I(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/efy;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->l:Lo/efy;

    return-object v0
.end method

.method private J()F
    .locals 10

    .line 1861
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "workoutid_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1862
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1863
    const/4 v4, 0x0

    .line 1864
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDownloadedProgress oldData == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 1866
    :cond_0
    const-string v0, "_"

    invoke-virtual {v5, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 1867
    array-length v0, v6

    if-lez v0, :cond_3

    .line 1868
    const/4 v0, 0x0

    aget-object v7, v6, v0

    .line 1869
    const/4 v8, 0x0

    .line 1870
    array-length v0, v6

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    .line 1871
    const/4 v0, 0x1

    aget-object v0, v6, v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v8

    .line 1873
    :cond_1
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "clear_version"

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v9

    .line 1874
    if-ge v8, v9, :cond_2

    .line 1875
    const/4 v4, 0x0

    goto :goto_0

    .line 1877
    :cond_2
    invoke-static {v7}, Lo/caj;->d(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v4

    .line 1879
    :goto_0
    const-string v0, "TrainDetail"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDownloadedProgress oldClearVersion:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "- newClearVersion:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "-invalidProgress:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1880
    goto :goto_1

    .line 1881
    :cond_3
    const/4 v4, 0x0

    .line 1882
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDownloadedProgress split.length <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1886
    :goto_1
    return v4
.end method

.method static synthetic J(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/widget/LinearLayout;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->I:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic K(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/efy;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->m:Lo/efy;

    return-object v0
.end method

.method private K()V
    .locals 4

    .line 1968
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 1969
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v3

    .line 1970
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lo/bvs;->c(Lcom/huawei/health/suggestion/model/Plan;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1971
    const-string v0, "type"

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1973
    :cond_0
    const-string v0, "1130006"

    invoke-static {v0, v2}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 1974
    return-void
.end method

.method static synthetic L(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/egy;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aP:Lo/egy;

    return-object v0
.end method

.method private L()V
    .locals 6

    .line 1977
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 1978
    const/4 v4, 0x0

    .line 1979
    if-eqz v3, :cond_0

    .line 1980
    const-string v0, "entrance"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1982
    :cond_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1983
    const-string v4, "otherModel"

    .line 1985
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    if-nez v0, :cond_2

    .line 1986
    return-void

    .line 1988
    :cond_2
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 1989
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1990
    const-string v0, "entrance"

    invoke-interface {v5, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1991
    const-string v0, "topic_version"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1992
    const-string v0, "workout_name"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1993
    const-string v0, "course_type"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireClasses()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lo/buk;->e(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1994
    const-string v0, "body_position"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireTrainingpoints()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lo/buk;->d(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1995
    const-string v0, "course_rate"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDifficulty()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1996
    const-string v0, "course_time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDuration()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1997
    const-string v0, "workout_id"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1998
    const-string v0, "1130017"

    invoke-static {v0, v5}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 1999
    return-void
.end method

.method static synthetic M(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/efy;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->n:Lo/efy;

    return-object v0
.end method

.method private M()V
    .locals 4

    .line 1910
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1911
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u83b7\u53d6\u63a8\u8350\u5217\u8868\u52a8\u4f5c"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1913
    :cond_0
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u83b7\u53d6\u8ba1\u5212\u4e2d\u5355\u6b21\u8bad\u7ec3 \u52a8\u4f5c\u5217\u8868"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1915
    :goto_0
    return-void
.end method

.method static synthetic N(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/efy;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->h:Lo/efy;

    return-object v0
.end method

.method private N()Z
    .locals 4

    .line 1919
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1920
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z:Ljava/lang/String;

    .line 1921
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->N:Lo/bvl;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireComeFrom(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bvl;->b(Ljava/lang/String;)V

    .line 1922
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1923
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mWorkid==null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1924
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->finish()V

    .line 1925
    const/4 v0, 0x1

    return v0

    .line 1928
    :cond_0
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mRecord==null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1929
    const/4 v0, 0x1

    return v0

    .line 1931
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic O(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)F
    .locals 1

    .line 152
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J()F

    move-result v0

    return v0
.end method

.method private O()V
    .locals 4

    .line 2175
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$13;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$13;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-virtual {v0, v1}, Lo/dge;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2198
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dge;->a(I)V

    .line 2199
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    invoke-virtual {v0}, Lo/dge;->d()V

    .line 2200
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isConnect:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v2}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v2

    invoke-virtual {v2}, Lo/dge;->b()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2201
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSupport:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v2}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v2

    invoke-virtual {v2}, Lo/dge;->e()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2202
    return-void
.end method

.method private P()V
    .locals 8

    .line 2222
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_push_course_dialog:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 2223
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_dialog_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/efy;

    .line 2224
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_push_course_to_watch:I

    invoke-virtual {v4, v0}, Lo/efy;->setText(I)V

    .line 2225
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_privacy_dialog_box:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/CheckBox;

    .line 2226
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$14;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$14;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-virtual {v5, v0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 2235
    new-instance v7, Lo/egw$c;

    invoke-direct {v7, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 2236
    invoke-virtual {v7, v3}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_cancal:I

    .line 2237
    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$17;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$17;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_ok:I

    .line 2241
    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$12;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$12;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    .line 2269
    invoke-virtual {v7}, Lo/egw$c;->e()Lo/egw;

    move-result-object v6

    .line 2270
    invoke-virtual {v6}, Lo/egw;->show()V

    .line 2271
    return-void
.end method

.method static synthetic P(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Z
    .locals 1

    .line 152
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B:Z

    return v0
.end method

.method static synthetic Q(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/widget/LinearLayout;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ao:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private Q()V
    .locals 3

    .line 2128
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B:Z

    if-eqz v0, :cond_1

    .line 2130
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2131
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->o:Lo/efy;

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->I()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 2132
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->o:Lo/efy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    goto :goto_0

    .line 2134
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->o:Lo/efy;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 2136
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->V:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    .line 2137
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->V:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 2138
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A:Lo/efy;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lo/efy;->setTextColor(I)V

    .line 2139
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A:Lo/efy;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_start_train:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 2140
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J:Lo/bwh;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bwh;->setVisibility(I)V

    .line 2141
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J:Lo/bwh;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lo/bwh;->setProgress(F)V

    goto :goto_2

    .line 2143
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A:Lo/efy;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_start_train:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 2144
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J:Lo/bwh;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bwh;->setProgress(F)V

    .line 2145
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J:Lo/bwh;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bwh;->setVisibility(I)V

    .line 2146
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->V:Landroid/widget/CheckBox;

    invoke-static {p0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    .line 2148
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2149
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->o:Lo/efy;

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->G()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 2150
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->o:Lo/efy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    goto :goto_1

    .line 2152
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->o:Lo/efy;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 2154
    :goto_1
    invoke-static {p0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 2155
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_motiontrack_offlinemap_connectting_error:I

    invoke-static {p0, v0}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 2159
    :cond_3
    :goto_2
    return-void
.end method

.method static synthetic R(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)F
    .locals 1

    .line 152
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->W:F

    return v0
.end method

.method private R()V
    .locals 2

    .line 2034
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ao:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2035
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ar:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2036
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->an:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2037
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aq:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2038
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ap:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2039
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aw:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2040
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->as:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2041
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->av:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2042
    return-void
.end method

.method static synthetic S(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)F
    .locals 1

    .line 152
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->T:F

    return v0
.end method

.method private S()Z
    .locals 3

    .line 2110
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->X:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J:Lo/bwh;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->o:Lo/efy;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A:Lo/efy;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J:Lo/bwh;

    invoke-virtual {v0}, Lo/bwh;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private T()V
    .locals 4

    .line 2468
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startTrackActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2469
    invoke-static {}, Lo/bxa;->a()Lo/bxa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0, v1, p0}, Lo/bxa;->e(Lcom/huawei/pluginFitnessAdvice/FitWorkout;Landroid/content/Context;)V

    .line 2470
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->finish()V

    .line 2471
    return-void
.end method

.method static synthetic T(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 152
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->e()V

    return-void
.end method

.method static synthetic U(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/widget/CheckBox;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->V:Landroid/widget/CheckBox;

    return-object v0
.end method

.method private U()V
    .locals 7

    .line 2358
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downLoadCourseMedias is downloaded "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2359
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 2360
    const-string v5, "otherModel"

    .line 2361
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2362
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "entrance"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 2363
    if-eqz v5, :cond_0

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2364
    :cond_0
    const-string v5, "otherModel"

    .line 2368
    :cond_1
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2369
    const-string v0, "workout_name"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2370
    const-string v0, "entrance"

    invoke-interface {v4, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2371
    const-string v0, "workout_id"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z:Ljava/lang/String;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2372
    const-string v0, "course_version"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2374
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B:Z

    if-eqz v0, :cond_3

    .line 2375
    const-string v0, "1130008"

    invoke-static {v0, v4}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 2376
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_RUN_START_2050005:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v0, v2, v1}, Lcom/huawei/operation/OpAnalyticsUtil;->setEventWithActionType(ILjava/lang/String;)V

    .line 2377
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2378
    const-string v0, "actiontype"

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2379
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_PVUV_85050001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v6}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I

    .line 2380
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2381
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->T()V

    goto :goto_0

    .line 2383
    :cond_2
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->a(I)V

    .line 2386
    :goto_0
    goto :goto_1

    .line 2387
    :cond_3
    const-string v0, "course_time"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDuration()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2388
    const-string v0, "1130007"

    invoke-static {v0, v4}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 2389
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->X()V

    .line 2391
    :goto_1
    return-void
.end method

.method static synthetic V(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bwh;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J:Lo/bwh;

    return-object v0
.end method

.method private V()V
    .locals 4

    .line 2329
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startordownload"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2330
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2331
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startordownload isRunWorkout():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "showDeviceDialog(CONNECT_OR_BINDING_TYPE)"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2335
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->n()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2337
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startordownload is heartrate workout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2338
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2339
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startordownload bluetooth is disable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2340
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->j()V

    goto :goto_0

    .line 2341
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->D()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2342
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startordownload has no nonwear device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2343
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->W()V

    goto :goto_0

    .line 2345
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->U()V

    .line 2347
    :goto_0
    return-void

    .line 2350
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->U()V

    .line 2352
    return-void
.end method

.method static synthetic W(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/efy;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A:Lo/efy;

    return-object v0
.end method

.method private W()V
    .locals 3

    .line 2460
    invoke-static {}, Lo/bzy;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2461
    invoke-static {}, Lo/bzy;->c()Z

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B()Z

    move-result v2

    invoke-static {v1, v2}, Lo/bzy;->c(Landroid/content/Context;Z)Z

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->b(ZZ)V

    .line 2462
    return-void

    .line 2464
    :cond_0
    invoke-static {}, Lo/bzy;->c()Z

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B()Z

    move-result v2

    invoke-static {v1, v2}, Lo/bzy;->d(Landroid/content/Context;Z)Z

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->b(ZZ)V

    .line 2465
    return-void
.end method

.method private X()V
    .locals 2

    .line 2474
    invoke-static {}, Lo/cad;->b()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 2475
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->Y()V

    goto :goto_0

    .line 2478
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->Z()V

    .line 2480
    :goto_0
    return-void
.end method

.method static synthetic X(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 152
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->e()V

    return-void
.end method

.method private Y()V
    .locals 8

    .line 2557
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2558
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doInWifi download in mobile network"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2559
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P:Lo/bsp;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireVersion()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/bsp;->c(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x49800000    # 1048576.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 2561
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 2562
    if-gtz v4, :cond_0

    .line 2563
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_fitness_less1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 2566
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_coach_dialog_mediasize:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    invoke-static {p0, v0, v1}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 2567
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_coach_dialog_new_netmsg:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    invoke-static {p0, v0, v1}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 2569
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->j:Lo/bvb;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_coach_dialog_yse:I

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_coach_dialog_confirm:I

    invoke-virtual {v0, v1, v2}, Lo/bvb;->a(II)Lo/bvb;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_fitness_content:I

    .line 2570
    invoke-virtual {v0, v1, v7}, Lo/bvb;->e(ILjava/lang/String;)Lo/bvb;

    move-result-object v0

    .line 2571
    invoke-virtual {v0}, Lo/bvb;->d()Lo/bvb;

    .line 2572
    goto :goto_0

    .line 2573
    :cond_1
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doInWifi not connect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2574
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->j:Lo/bvb;

    invoke-virtual {v0}, Lo/bvb;->c()Lo/bvb;

    .line 2576
    :goto_0
    return-void
.end method

.method static synthetic Y(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Z
    .locals 1

    .line 152
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->Z:Z

    return v0
.end method

.method static synthetic Z(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bvb;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->j:Lo/bvb;

    return-object v0
.end method

.method private Z()V
    .locals 5

    .line 2580
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J:Lo/bwh;

    invoke-virtual {v0}, Lo/bwh;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2581
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "open down--"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2582
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J:Lo/bwh;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bwh;->setVisibility(I)V

    .line 2583
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->V:Landroid/widget/CheckBox;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 2584
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J:Lo/bwh;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bwh;->setTag(Ljava/lang/Object;)V

    .line 2585
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J:Lo/bwh;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->W:F

    const v2, 0x3727c5ac    # 1.0E-5f

    add-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lo/bwh;->setProgress(F)V

    .line 2586
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A:Lo/efy;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->R:I

    invoke-virtual {v0, v1}, Lo/efy;->setTextColor(I)V

    .line 2588
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A:Lo/efy;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->W:F

    const v2, 0x3727c5ac    # 1.0E-5f

    add-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    mul-float/2addr v1, v2

    float-to-double v1, v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 2589
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aJ:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;

    .line 2590
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P:Lo/bsp;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireVersion()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aJ:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;

    invoke-interface {v0, v1, v2, v3}, Lo/bsp;->a(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V

    .line 2592
    :cond_0
    return-void
.end method

.method private a(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Ljava/util/ArrayList<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;"
        }
    .end annotation

    .line 1935
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 1936
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1937
    const/4 v5, 0x0

    .line 1938
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveVersion(Ljava/lang/String;)V

    .line 1939
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1940
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutName(Ljava/lang/String;)V

    .line 1942
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireCalorie()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveCalorie(F)V

    .line 1943
    const/4 v6, 0x1

    .line 1944
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->getType()I

    move-result v7

    .line 1945
    const/4 v0, 0x3

    if-ne v0, v7, :cond_1

    .line 1946
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireRepeatTimes()I

    move-result v6

    .line 1948
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireWorkoutActions()Ljava/util/List;

    move-result-object v5

    .line 1949
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v6, :cond_3

    .line 1950
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    .line 1951
    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1952
    goto :goto_1

    .line 1949
    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 1956
    :cond_3
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 1957
    invoke-direct {p0, v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->c(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v8

    .line 1958
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    return-object v8

    .line 1960
    :cond_4
    goto :goto_2

    .line 1961
    :cond_5
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutActionListAll.size is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1963
    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method

.method private a(I)V
    .locals 5

    .line 2279
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->x:Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2280
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Fitwork isSupportDevices:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireIsSupportDevice()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2281
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireIsSupportDevice()I

    move-result v0

    if-nez v0, :cond_2

    .line 2282
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->O()V

    .line 2283
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    invoke-virtual {v0}, Lo/dge;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2284
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device is not connect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 2286
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    invoke-virtual {v0}, Lo/dge;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2287
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device is not support posture"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2291
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    invoke-virtual {v0}, Lo/dge;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2292
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    invoke-virtual {v0}, Lo/dge;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2293
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aa:Z

    .line 2297
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    invoke-virtual {v0}, Lo/dge;->c()V

    .line 2298
    invoke-static {}, Lo/bvp;->a()Lo/bvp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0, v1}, Lo/bvp;->b(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Lo/bvp;

    .line 2299
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExerciseTime(J)V

    .line 2300
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2301
    const-string v0, "islinkedfitness"

    iget-boolean v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aa:Z

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2302
    const-string v0, "isafterrun"

    iget-boolean v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ac:Z

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2303
    const-string v0, "motions"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->x:Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 2304
    const-string v0, "coachstartposition"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 2305
    const-string v0, "havenexttrain"

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->O:I

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->M:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-eq v1, v2, :cond_3

    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2306
    const-string v0, "workoutrecord"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 2307
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 2308
    const-string v0, "bundlekey"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "bundlekey"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 2309
    const-string v0, "topic_name"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "topic_name"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2310
    const-string v0, "entrance"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "entrance"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2311
    const-string v0, "ISPLANFIT"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "ISPLANFIT"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2313
    :cond_4
    invoke-virtual {p0, v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->startActivity(Landroid/content/Intent;)V

    .line 2315
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P:Lo/bsp;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {v0, v1, v2, v3}, Lo/bsp;->e(Ljava/lang/String;Ljava/lang/String;I)V

    .line 2316
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->O:I

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->M:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_5

    .line 2317
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->finish()V

    .line 2319
    :cond_5
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->O:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->O:I

    .line 2320
    goto :goto_2

    .line 2321
    :cond_6
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startCoachActivity mCoachData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2323
    :goto_2
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;I)V
    .locals 0

    .line 152
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->c(I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Ljava/lang/String;)V
    .locals 0

    .line 152
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 5

    .line 2713
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2714
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_fitness_dialog_failmsg:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 2715
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->j:Lo/bvb;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_coach_dialog_yse:I

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/health/suggestion/R$string;->sug_fitness_dialog_tryagain:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bvb;->d(ILjava/lang/String;)Lo/bvb;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_fitness_content:I

    .line 2717
    invoke-virtual {v0, v1, v4}, Lo/bvb;->e(ILjava/lang/String;)Lo/bvb;

    move-result-object v0

    .line 2718
    invoke-virtual {v0}, Lo/bvb;->d()Lo/bvb;

    .line 2720
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Z
    .locals 1

    .line 152
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bc:Z

    return v0
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Z)Z
    .locals 0

    .line 152
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B:Z

    return p1
.end method

.method private aa()V
    .locals 4

    .line 2484
    invoke-static {}, Lo/bzy;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2486
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDeviceSportStatus connect wear device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2487
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/bzy;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2488
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDeviceSportStatus isIndependentSportDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2489
    invoke-static {}, Lo/bvc;->c()Lo/bvc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->be:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$c;

    invoke-virtual {v0, v1}, Lo/bvc;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 2491
    :cond_0
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDeviceSportStatus is not IndependentSportDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2492
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->U()V

    goto :goto_0

    .line 2495
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->V()V

    .line 2496
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Not HW device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2499
    :goto_0
    return-void
.end method

.method static synthetic aa(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 152
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->T()V

    return-void
.end method

.method private ab()V
    .locals 5

    .line 2698
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J:Lo/bwh;

    invoke-virtual {v0}, Lo/bwh;->a()F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->W:F

    .line 2699
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B:Z

    if-eqz v0, :cond_0

    .line 2700
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->W:F

    goto :goto_0

    .line 2702
    :cond_0
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->W:F

    const v1, 0x3a83126f    # 0.001f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 2703
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save download progress: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->W:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2704
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->W:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v0, v1, v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->T:F

    .line 2707
    :cond_1
    :goto_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "clear_version"

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v4

    .line 2708
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "workoutid_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->W:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2709
    return-void
.end method

.method static synthetic ab(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 152
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->c()V

    return-void
.end method

.method static synthetic ac(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)I
    .locals 1

    .line 152
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->R:I

    return v0
.end method

.method private ac()V
    .locals 3

    .line 2506
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_notify:I

    .line 2507
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_remind_user_to_stop_sport_in_device:I

    .line 2508
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_dialog_yes:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$24;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$24;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    .line 2509
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    .line 2514
    invoke-virtual {v0}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    .line 2515
    invoke-virtual {v0}, Lo/egv;->show()V

    .line 2517
    return-void
.end method

.method private ad()V
    .locals 3

    .line 2838
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->L:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->L:I

    .line 2839
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aI:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2840
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aI:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;->e:Z

    .line 2842
    :cond_0
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->L:I

    if-ltz v0, :cond_1

    .line 2843
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ag()V

    .line 2844
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->L:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lo/bwp;->setCurrentIndex(I)V

    .line 2845
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->L:I

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->c(I)V

    .line 2846
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->L:I

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d(I)V

    goto :goto_0

    .line 2848
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->L:I

    .line 2850
    :goto_0
    return-void
.end method

.method private ae()V
    .locals 3

    .line 2817
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->L:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->L:I

    .line 2818
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aI:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2819
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aI:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;->e:Z

    .line 2821
    :cond_0
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->L:I

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i:Lo/buv;

    invoke-virtual {v1}, Lo/buv;->getItemCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 2822
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ag()V

    .line 2823
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->L:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lo/bwp;->setCurrentIndex(I)V

    .line 2824
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->L:I

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->c(I)V

    .line 2825
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->L:I

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d(I)V

    goto :goto_0

    .line 2827
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i:Lo/buv;

    invoke-virtual {v0}, Lo/buv;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->L:I

    .line 2829
    :goto_0
    return-void
.end method

.method private af()V
    .locals 3

    .line 2853
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->j:Lo/bvb;

    invoke-virtual {v0}, Lo/bvb;->c()Lo/bvb;

    .line 2854
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_coach_dialog_confirm:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 2855
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->j:Lo/bvb;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_coach_dialog_yse:I

    invoke-virtual {v0, v1}, Lo/bvb;->b(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2857
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->Z()V

    goto :goto_0

    .line 2860
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->X()V

    .line 2862
    :goto_0
    return-void
.end method

.method static synthetic ag(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/egw;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->D:Lo/egw;

    return-object v0
.end method

.method private ag()V
    .locals 2

    .line 2833
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->N:Lo/bvl;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bvl;->d(I)V

    .line 2834
    return-void
.end method

.method static synthetic ah(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aI:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;

    return-object v0
.end method

.method private ah()V
    .locals 7

    .line 2742
    const-string v0, "COLLECT_FIST_KEY"

    invoke-static {v0}, Lo/cag;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 2743
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->isFinishing()Z

    move-result v5

    .line 2744
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "collectFist isFinishing = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2745
    const-string v0, "1"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez v5, :cond_0

    .line 2746
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_collecte_toast:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 2747
    new-instance v0, Landroid/widget/PopupWindow;

    const/4 v1, -0x2

    const/4 v2, -0x2

    const/4 v3, 0x1

    invoke-direct {v0, v6, v1, v2, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aH:Landroid/widget/PopupWindow;

    .line 2749
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aH:Landroid/widget/PopupWindow;

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2750
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aH:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ba:Lo/emr;

    sget v2, Lcom/huawei/health/suggestion/R$id;->btn_right_layout:I

    invoke-virtual {v1, v2}, Lo/emr;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;)V

    .line 2752
    const-string v0, "COLLECT_FIST_KEY"

    const-string v1, "1"

    invoke-static {v0, v1}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 2754
    :cond_0
    return-void
.end method

.method private aj()V
    .locals 8

    .line 3042
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 3043
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_after_run_dialog:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 3044
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitness_not_remind_box:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/CheckBox;

    .line 3045
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitness_sketch_tip:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/efy;

    .line 3046
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3047
    invoke-static {}, Lo/bxb;->b()Lo/bxb;

    move-result-object v0

    invoke-virtual {v0}, Lo/bxb;->d()V

    .line 3048
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->finish()V

    .line 3049
    return-void

    .line 3051
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3052
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_afterrun_dialog_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 3054
    :cond_1
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_afterrun_dialog_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 3056
    :goto_0
    new-instance v0, Lo/egw$c;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_notify:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_afterrun_dialog_exit:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$28;

    invoke-direct {v2, p0, v6}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$28;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Landroid/widget/CheckBox;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_cancal:I

    .line 3067
    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$23;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$23;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 3072
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->D:Lo/egw;

    .line 3073
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->D:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 3074
    return-void
.end method

.method private ak()Z
    .locals 4

    .line 2894
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B:Z

    if-eqz v0, :cond_0

    .line 2895
    const/4 v0, 0x1

    return v0

    .line 2897
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P:Lo/bsp;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireVersion()Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->L:I

    invoke-interface {v0, v1, v2, v3}, Lo/bsp;->b(Ljava/lang/String;Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method

.method private al()Z
    .locals 5

    .line 2883
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ak()Z

    move-result v4

    .line 2884
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHasDownLoaded:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2885
    if-eqz v4, :cond_0

    .line 2886
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->N:Lo/bvl;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bvl;->a(Z)V

    .line 2887
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->N:Lo/bvl;

    invoke-virtual {v0}, Lo/bvl;->notifyDataSetChanged()V

    .line 2888
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->N:Lo/bvl;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/bvl;->d(I)V

    .line 2890
    :cond_0
    return v4
.end method

.method private am()V
    .locals 7

    .line 2921
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2922
    return-void

    .line 2924
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "entrance"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 2925
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2926
    const-string v5, "otherModel"

    .line 2928
    :cond_1
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 2929
    const-string v0, "entrance"

    invoke-interface {v6, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2930
    const-string v0, "stay_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ab:J

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2931
    const-string v0, "1130016"

    invoke-static {v0, v6}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 2932
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ag:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 152
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ah()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;I)V
    .locals 0

    .line 152
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->a(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;ZZ)V
    .locals 0

    .line 152
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->e(ZZ)V

    return-void
.end method

.method private b(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 4

    .line 1817
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "-----refreshHeadUI:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1818
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->K()V

    .line 1819
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->L()V

    .line 1820
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->c(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 1821
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->I:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1822
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 1857
    return-void
.end method

.method private b(ZZ)V
    .locals 4

    .line 2417
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDeviceDialog:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2418
    if-eqz p1, :cond_0

    if-nez p2, :cond_0

    .line 2419
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_connect_device:I

    .line 2420
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_connect_msg:I

    .line 2421
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_connect_go:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$20;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$20;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    .line 2422
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_cancal:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$18;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$18;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    .line 2428
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    .line 2433
    invoke-virtual {v0}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    .line 2434
    invoke-virtual {v0}, Lo/egv;->show()V

    goto :goto_0

    .line 2435
    :cond_0
    if-nez p1, :cond_1

    .line 2436
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_binding_device:I

    .line 2437
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_need_device:I

    .line 2438
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_binding_go:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$16;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$16;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    .line 2439
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_cancal:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$19;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$19;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    .line 2445
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    .line 2450
    invoke-virtual {v0}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    .line 2451
    invoke-virtual {v0}, Lo/egv;->show()V

    goto :goto_0

    .line 2452
    :cond_1
    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    .line 2455
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aa()V

    .line 2457
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Z)Z
    .locals 0

    .line 152
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->Y:Z

    return p1
.end method

.method private c(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/WorkoutAction;>;)Ljava/util/ArrayList<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;"
        }
    .end annotation

    .line 2052
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2053
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2054
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2056
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    .line 2057
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "suggestion"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "files_runcourse"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "audios"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 2058
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0, v6, v5}, Lo/bzw;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 2060
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "suggestion"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "files_runcourse"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "audiosBase"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 2061
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0, v7, v5}, Lo/bzw;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 2063
    :cond_0
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->k:I

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1, v4}, Lo/bvs;->e(Ljava/util/List;ILjava/lang/String;Ljava/util/ArrayList;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2064
    const/4 v0, 0x0

    return-object v0

    .line 2067
    :cond_1
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->k:I

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1, v4}, Lo/bvs;->a(Ljava/util/List;ILjava/lang/String;Ljava/util/ArrayList;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2068
    const/4 v0, 0x0

    return-object v0

    .line 2071
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->x:Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;

    invoke-virtual {v0, v4}, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->saveMotions(Ljava/util/List;)V

    .line 2072
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->x:Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDuration()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->saveDuration(I)V

    .line 2073
    const-string v0, "FitWorkout.acquireDuration"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDuration()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2074
    return-object v4
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Lo/egy;)Lo/egy;
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aP:Lo/egy;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/emr;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ba:Lo/emr;

    return-object v0
.end method

.method private c(I)V
    .locals 3

    .line 2870
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i:Lo/buv;

    invoke-virtual {v0, p1}, Lo/buv;->a(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    .line 2871
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->K:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2872
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->K:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2873
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireCovers()Lcom/huawei/pluginFitnessAdvice/Cover;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2874
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->K:Ljava/util/List;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireCovers()Lcom/huawei/pluginFitnessAdvice/Cover;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2876
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->al()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2877
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i(I)V

    .line 2879
    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;I)V
    .locals 0

    .line 152
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->e(I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 0

    .line 152
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->b(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    return-void
.end method

.method private c(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 11

    .line 1295
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1296
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ba:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setRightSoftkeyVisibility(I)V

    goto :goto_1

    .line 1298
    :cond_2
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->Y:Z

    if-eqz v0, :cond_3

    .line 1299
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ba:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$drawable;->ic_collect_press:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightSoftkeyBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 1301
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ba:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$drawable;->ic_collect_normal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightSoftkeyBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1303
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ba:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightSoftkeyVisibility(I)V

    .line 1306
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1307
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireStage()I

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireIsSupportDevice()I

    move-result v0

    if-nez v0, :cond_5

    .line 1308
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->U:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_corner_new_watchwear:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1309
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->U:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 1310
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireStage()I

    move-result v0

    if-nez v0, :cond_6

    .line 1311
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->U:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_corner_new:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1312
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->U:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 1313
    :cond_6
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireIsSupportDevice()I

    move-result v0

    if-nez v0, :cond_7

    .line 1314
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->U:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_corner_watchwear:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1315
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->U:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 1317
    :cond_7
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->U:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1322
    :cond_8
    :goto_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P:Lo/bsp;

    invoke-interface {v0}, Lo/bsp;->g()Lcom/huawei/health/suggestion/model/Userinfo;

    move-result-object v7

    .line 1323
    invoke-static {v7}, Lo/bvs;->b(Lcom/huawei/health/suggestion/model/Userinfo;)F

    move-result v8

    .line 1324
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireMeasurementType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_9

    .line 1325
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->p:Lo/efy;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_coach_duration:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1326
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->n:Lo/efy;

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F()Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 1327
    :cond_9
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireMeasurementType()I

    move-result v0

    if-nez v0, :cond_a

    .line 1328
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->p:Lo/efy;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_unit_KM:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1329
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->n:Lo/efy;

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->H()Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 1331
    :cond_a
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WorkoutAction.MEASUREMENTTYPE_TIME:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireMeasurementType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1332
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->p:Lo/efy;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_coach_duration:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1333
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->n:Lo/efy;

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F()Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1336
    :goto_3
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C()V

    .line 1339
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->l()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 1340
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aM:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1341
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aO:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1342
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aQ:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1343
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aT:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1344
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aV:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1345
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->y()V

    .line 1346
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z()V

    goto :goto_4

    .line 1348
    :cond_b
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isRunWorkout()==false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1349
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aM:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1350
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aO:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1351
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aQ:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1352
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aT:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1353
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aV:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1355
    :goto_4
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->m:Lo/efy;

    const-string v1, "\\d|[/]"

    sget v2, Lcom/huawei/health/suggestion/R$plurals;->sug_chart_kcals:I

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireWorkoutActions()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireCalorie()F

    move-result v5

    mul-float/2addr v5, v8

    invoke-static {v5}, Lo/bzr;->d(F)F

    move-result v5

    invoke-static {v5}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v2, v3, v4}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_detail_bigsize:I

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_detail_smasize:I

    invoke-static {p0, v1, v2, v3, v4}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1356
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->l:Lo/efy;

    const-string v1, "L[1-4]{1}"

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDifficulty()I

    move-result v2

    invoke-static {v2}, Lo/bsn;->b(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_detail_bigsize:I

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_detail_smasize:I

    invoke-static {p0, v1, v2, v3, v4}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1358
    sget v0, Lcom/huawei/health/suggestion/R$id;->auto_fill_color_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/byf;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->g:Lo/byf;

    .line 1361
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireMidPicture()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquirePicture()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->g:Lo/byf;

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->e(Ljava/lang/String;Ljava/lang/String;Lo/byf;)V

    .line 1362
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 1364
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ba:Lo/emr;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    goto :goto_5

    .line 1367
    :cond_c
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ba:Lo/emr;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 1369
    :goto_5
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->h:Lo/efy;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1371
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireEquipments()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/buk;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v9

    .line 1372
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireClasses()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/buk;->e(Ljava/util/List;)Ljava/lang/String;

    move-result-object v10

    .line 1373
    const-string v0, ""

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 1374
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aq:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1375
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ay:Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_run_workout_workout_equipments:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    .line 1376
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aB:Lo/efy;

    invoke-virtual {v0, v9}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1378
    :cond_d
    const-string v0, ""

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 1379
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->an:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1380
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->az:Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_run_workout_workout_type:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    .line 1381
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aA:Lo/efy;

    invoke-virtual {v0, v10}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1383
    :cond_e
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->E()V

    .line 1384
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Z)Z
    .locals 0

    .line 152
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->Z:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;F)F
    .locals 0

    .line 152
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->W:F

    return p1
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;I)I
    .locals 0

    .line 152
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->L:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;III)Ljava/lang/String;
    .locals 1

    .line 152
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->e(III)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Ljava/util/ArrayList;
    .locals 1

    .line 152
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->a(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->M:Ljava/util/ArrayList;

    return-object p1
.end method

.method private d(I)V
    .locals 2

    .line 2162
    if-nez p1, :cond_0

    .line 2163
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getPreAction()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2164
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getNextAction()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 2165
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i:Lo/buv;

    invoke-virtual {v0}, Lo/buv;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    .line 2166
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getPreAction()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2167
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getNextAction()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 2169
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getPreAction()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2170
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getNextAction()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2172
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 152
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ac()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Z)Z
    .locals 0

    .line 152
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bd:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;F)F
    .locals 0

    .line 152
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->T:F

    return p1
.end method

.method private e(III)Ljava/lang/String;
    .locals 12

    .line 895
    const-string v7, ""

    .line 896
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 898
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_fitness_grop_sec_rtl:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    int-to-float v3, p2

    const/high16 v4, 0x3f800000    # 1.0f

    mul-float/2addr v3, v4

    const/high16 v4, 0x447a0000    # 1000.0f

    div-float/2addr v3, v4

    .line 899
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    int-to-double v3, p1

    .line 900
    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 898
    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_2

    .line 903
    :cond_0
    if-nez p3, :cond_3

    .line 904
    move v8, p2

    .line 905
    rem-int/lit16 v9, v8, 0x1f4

    .line 906
    const-string v10, ""

    .line 907
    const/16 v0, 0x3e8

    if-ge v8, v0, :cond_1

    .line 908
    int-to-double v0, v8

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 909
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_fitness_grop_sec_more_distance_m:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    int-to-double v3, p1

    .line 910
    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v10, v2, v3

    .line 909
    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 912
    :cond_1
    if-nez v9, :cond_2

    .line 913
    int-to-float v0, v8

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x43fa0000    # 500.0f

    div-float v11, v0, v1

    .line 914
    float-to-double v0, v11

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 915
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_fitness_grop_sec_more_distance_km:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    int-to-double v3, p1

    .line 916
    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v10, v2, v3

    .line 915
    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 920
    :cond_2
    :goto_0
    goto/16 :goto_2

    :cond_3
    const/4 v0, 0x1

    if-ne p3, v0, :cond_5

    .line 921
    int-to-float v0, p2

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v8

    .line 922
    div-int/lit8 v9, v8, 0x3c

    .line 923
    const/4 v0, 0x1

    if-lt v9, v0, :cond_4

    .line 924
    rem-int/lit8 v10, v8, 0x3c

    .line 925
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_fitness_grop_sec_more:I

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    int-to-double v3, p1

    .line 926
    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    int-to-double v3, v9

    .line 927
    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    int-to-double v3, v10

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    .line 925
    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 929
    goto :goto_1

    .line 930
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_fitness_grop_sec:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    int-to-double v3, p1

    .line 931
    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    int-to-double v3, v8

    .line 932
    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 930
    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 935
    :goto_1
    goto :goto_2

    .line 936
    :cond_5
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_fitness_grop_sec:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    int-to-double v3, p1

    .line 937
    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    int-to-float v3, p2

    const/high16 v4, 0x3f800000    # 1.0f

    mul-float/2addr v3, v4

    const/high16 v4, 0x447a0000    # 1000.0f

    div-float/2addr v3, v4

    .line 938
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 936
    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 943
    :goto_2
    return-object v7
.end method

.method private e(I)V
    .locals 5

    .line 465
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bb:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 466
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 467
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bb:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    const-string v0, "_"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 469
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 470
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "device_support_run_course_key"

    .line 471
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 470
    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/health/suggestion/data/DBFactory;->a(Ljava/lang/String;Ljava/lang/String;I)I

    .line 472
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "record device ability "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 474
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;I)V
    .locals 0

    .line 152
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;ZLjava/util/ArrayList;)V
    .locals 0

    .line 152
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->e(ZLjava/util/ArrayList;)V

    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;Lo/byf;)V
    .locals 2

    .line 3162
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 3163
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 3164
    const-string v0, "http"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3165
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    invoke-virtual {p3, p1, v0}, Lo/byf;->a(Ljava/lang/String;Z)V

    goto :goto_1

    .line 3167
    :cond_1
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3169
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "file:///android_asset/suggestion/img/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v1

    invoke-virtual {p3, v0, v1}, Lo/byf;->a(Ljava/lang/String;Z)V

    .line 3170
    return-void

    .line 3172
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "file:///android_asset/img/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v1

    invoke-virtual {p3, v0, v1}, Lo/byf;->a(Ljava/lang/String;Z)V

    .line 3175
    :cond_3
    :goto_1
    return-void
.end method

.method private e(ZLjava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZLjava/util/ArrayList<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;)V"
        }
    .end annotation

    .line 1890
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$9;

    invoke-direct {v0, p0, p1, p2}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$9;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;ZLjava/util/ArrayList;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1907
    return-void
.end method

.method private e(ZZ)V
    .locals 4

    .line 1485
    const-string v0, "TrainDetail"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBindedDeviceLayoutHeartRate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Connected = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " Binded = "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1486
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->s:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1487
    if-eqz p1, :cond_0

    .line 1488
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->s:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 1490
    :cond_0
    if-eqz p2, :cond_1

    .line 1491
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->u:Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_connect_msg:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    .line 1492
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->q:Landroid/widget/Button;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_connect_device:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 1493
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->q:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$3;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 1500
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->u:Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_need_device:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    .line 1501
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->q:Landroid/widget/Button;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_undestance_device:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 1502
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->q:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$1;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1520
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Z
    .locals 1

    .line 152
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bd:Z

    return v0
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Z)Z
    .locals 0

    .line 152
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bc:Z

    return p1
.end method

.method static synthetic f(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/content/Context;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic f(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;I)V
    .locals 0

    .line 152
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->g(I)V

    return-void
.end method

.method private g(I)V
    .locals 5

    .line 3146
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "position:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3148
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aI:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 3149
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aI:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;

    iget v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;->b:I

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aI:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;

    iget-boolean v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;->e:Z

    if-nez v0, :cond_0

    .line 3150
    return-void

    .line 3153
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->N:Lo/bvl;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bvl;->d(I)V

    .line 3154
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->N:Lo/bvl;

    const-wide/16 v1, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bvl;->e(Ljava/lang/String;)V

    .line 3155
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aI:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;

    .line 3156
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aI:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;

    iput p1, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;->b:I

    .line 3157
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P:Lo/bsp;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireVersion()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aI:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$h;

    invoke-interface {v0, v1, v2, v3, p1}, Lo/bsp;->b(Ljava/lang/String;Ljava/lang/String;Lo/bui;I)V

    .line 3159
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Z
    .locals 1

    .line 152
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B()Z

    move-result v0

    return v0
.end method

.method static synthetic h(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 152
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->U()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/os/Handler;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bi:Landroid/os/Handler;

    return-object v0
.end method

.method private i(I)V
    .locals 8

    .line 3078
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->N:Lo/bvl;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bvl;->a(Z)V

    .line 3079
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->N:Lo/bvl;

    invoke-virtual {v0}, Lo/bvl;->notifyDataSetChanged()V

    .line 3080
    invoke-static {}, Lo/cad;->b()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-static {}, Lo/cad;->b()I

    move-result v0

    if-eqz v0, :cond_0

    .line 3081
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "yidong"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3082
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->N:Lo/bvl;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bvl;->d(I)V

    .line 3083
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P:Lo/bsp;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireVersion()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, Lo/bsp;->c(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v5

    .line 3084
    int-to-float v0, v5

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x49800000    # 1048576.0f

    div-float v6, v0, v1

    .line 3085
    float-to-double v0, v6

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 3086
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->N:Lo/bvl;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_device_upgrade_file_size_mb:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v7, v3, v4

    invoke-static {v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bvl;->c(Ljava/lang/String;)V

    .line 3087
    goto :goto_0

    .line 3088
    :cond_0
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wifi"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3089
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->N:Lo/bvl;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bvl;->d(I)V

    .line 3090
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->g(I)V

    .line 3092
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->N:Lo/bvl;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$29;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$29;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;I)V

    invoke-virtual {v0, v1}, Lo/bvl;->c(Lo/bvl$d;)V

    .line 3098
    return-void
.end method

.method static synthetic j(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)I
    .locals 1

    .line 152
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->L:I

    return v0
.end method

.method private j()V
    .locals 4

    .line 1545
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    .line 1546
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_device_bluetooth_open_request:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_device_bt_right_btn_info:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$7;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$7;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    .line 1548
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_device_bt_left_btn_info:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$2;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    .line 1561
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v3

    .line 1571
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aP:Lo/egy;

    .line 1572
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aP:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 1573
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aP:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 1574
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    return-object v0
.end method

.method static synthetic l(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/widget/LinearLayout;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->E:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic m(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bwp;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    return-object v0
.end method

.method static synthetic n(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)[Ljava/lang/String;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ad:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 152
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A()V

    return-void
.end method

.method static synthetic p(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 152
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P()V

    return-void
.end method

.method static synthetic q(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/buu;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bh:Lo/buu;

    return-object v0
.end method

.method private q()Z
    .locals 10

    .line 497
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 498
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 499
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bb:Ljava/lang/String;

    .line 500
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bb:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 501
    const/4 v0, 0x0

    return v0

    .line 504
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "device_support_run_course_key"

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 505
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 506
    const/4 v0, 0x0

    return v0

    .line 509
    :cond_1
    const-string v6, ""

    .line 510
    const/4 v7, -0x1

    .line 511
    const-string v0, "_"

    invoke-virtual {v5, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 513
    if-eqz v8, :cond_2

    array-length v0, v8

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 515
    const/4 v0, 0x0

    aget-object v6, v8, v0

    .line 517
    const/4 v0, 0x1

    :try_start_0
    aget-object v0, v8, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v7, v0

    .line 520
    goto :goto_0

    .line 518
    :catch_0
    move-exception v9

    .line 519
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parse value failed "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bb:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 525
    const/4 v0, 0x1

    if-ne v7, v0, :cond_3

    .line 527
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bi:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v9

    .line 528
    const/4 v0, 0x1

    iput v0, v9, Landroid/os/Message;->arg1:I

    .line 529
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bi:Landroid/os/Handler;

    invoke-virtual {v0, v9}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 530
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bc:Z

    .line 532
    :cond_3
    const/4 v0, 0x1

    return v0

    .line 535
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic r(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/view/View;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    return-object v0
.end method

.method private r()V
    .locals 2

    .line 479
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 480
    return-void

    .line 484
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B()Z

    move-result v1

    invoke-static {v0, v1}, Lo/bzy;->c(Landroid/content/Context;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 485
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/deo;->d(Landroid/content/Context;)Lo/deo;

    move-result-object v0

    invoke-virtual {v0}, Lo/deo;->a()V

    .line 487
    :cond_1
    return-void
.end method

.method static synthetic s(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Ljava/util/ArrayList;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->am:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic t(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/view/View;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->al:Landroid/view/View;

    return-object v0
.end method

.method private t()V
    .locals 3

    .line 948
    invoke-static {p0}, Lo/bvb;->c(Landroid/app/Activity;)Lo/bvb;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->j:Lo/bvb;

    .line 950
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->j:Lo/bvb;

    invoke-virtual {v0}, Lo/bvb;->a()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 951
    const/16 v0, 0x50

    invoke-virtual {v2, v0}, Landroid/view/Window;->setGravity(I)V

    .line 953
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->j:Lo/bvb;

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_dialog_download:I

    invoke-virtual {v0, v1}, Lo/bvb;->e(I)Lo/bvb;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_coach_dialog_No:I

    .line 954
    invoke-virtual {v0, v1, p0}, Lo/bvb;->d(ILandroid/view/View$OnClickListener;)Lo/bvb;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_coach_dialog_yse:I

    .line 955
    invoke-virtual {v0, v1, p0}, Lo/bvb;->d(ILandroid/view/View$OnClickListener;)Lo/bvb;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvb;->a()Landroid/app/Dialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 957
    return-void
.end method

.method static synthetic u(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/emq;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->af:Lo/emq;

    return-object v0
.end method

.method static synthetic v(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$f;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ai:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$f;

    return-object v0
.end method

.method private v()V
    .locals 1

    .line 1263
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1291
    return-void
.end method

.method static synthetic w(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bvl;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->N:Lo/bvl;

    return-object v0
.end method

.method private w()V
    .locals 4

    .line 1120
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->M:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->O:I

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->M:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->O:I

    if-gez v0, :cond_1

    .line 1121
    :cond_0
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent.getParcelableArrayListExtra(Constants.WORKOUTRECODER)\u4e3a\u7a7a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1122
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->finish()V

    .line 1123
    return-void

    .line 1125
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->M:Ljava/util/ArrayList;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->O:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 1126
    const-string v0, "TrainDetail"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "id:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "-workoutname:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1127
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->N()Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 1128
    :cond_2
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->x:Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;

    .line 1129
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->x:Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->saveWorkId(Ljava/lang/String;)V

    .line 1130
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->x:Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->savePlanId(Ljava/lang/String;)V

    .line 1131
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->M()V

    .line 1133
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P:Lo/bsp;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z:Ljava/lang/String;

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$b;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$b;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(Ljava/lang/String;Lo/bui;)V

    .line 1134
    return-void
.end method

.method static synthetic x(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/support/v7/widget/RecyclerView;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->v:Landroid/support/v7/widget/RecyclerView;

    return-object v0
.end method

.method private x()V
    .locals 7

    .line 1050
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 1051
    if-eqz v4, :cond_0

    .line 1052
    const-string v0, "workoutrecord"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->M:Ljava/util/ArrayList;

    .line 1053
    const-string v0, "isafterrun"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ac:Z

    .line 1054
    const-string v0, "ISFROMSCHEME"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bf:Z

    .line 1058
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bf:Z

    if-eqz v0, :cond_3

    if-eqz v4, :cond_3

    .line 1059
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "havePermission2getData from scheme"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1060
    const-string v0, "version"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1061
    const-string v0, "workoutid"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1062
    if-eqz v6, :cond_2

    .line 1063
    if-nez v5, :cond_1

    .line 1064
    const-string v5, ""

    .line 1066
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P:Lo/bsp;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$k;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$k;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-interface {v0, v6, v5, v1}, Lo/bsp;->c(Ljava/lang/String;Ljava/lang/String;Lo/bui;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    goto :goto_0

    .line 1068
    :cond_2
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "havePermission2getData from scheme and workid is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1070
    :goto_0
    goto :goto_1

    .line 1071
    :cond_3
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "havePermission2getData from others"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1072
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w()V

    .line 1074
    :goto_1
    return-void
.end method

.method static synthetic y(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/support/v4/view/ViewPager;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ah:Landroid/support/v4/view/ViewPager;

    return-object v0
.end method

.method private y()V
    .locals 14

    .line 1418
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireWarmUpRunAction()Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    move-result-object v7

    .line 1419
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v7, v0, v1

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1420
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getAction()Lcom/huawei/pluginFitnessAdvice/Action;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/Action;->getName()Ljava/lang/String;

    move-result-object v8

    .line 1421
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getGroup()I

    move-result v9

    .line 1422
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementValue()I

    move-result v0

    mul-int/lit16 v10, v0, 0x3e8

    .line 1423
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementType()I

    move-result v11

    .line 1424
    const-string v0, "TrainDetail"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "groups:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "measurementValue:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "measurementType"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1425
    invoke-direct {p0, v9, v10, v11}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->e(III)Ljava/lang/String;

    move-result-object v12

    .line 1426
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->IDS_plugin_fitnessadvice_second_nogap:I

    .line 1427
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getGap()I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getGap()I

    move-result v3

    int-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 1426
    invoke-static {v0, v1, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 1435
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aR:Lo/efy;

    invoke-virtual {v0, v8}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1436
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aU:Lo/efy;

    invoke-virtual {v0, v12}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1437
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aS:Lo/efy;

    invoke-virtual {v0, v13}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1438
    goto :goto_0

    .line 1439
    :cond_0
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "warmUpRunAction==null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1440
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aM:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1441
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aO:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1442
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aQ:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1443
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aT:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1444
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aV:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1446
    :goto_0
    return-void
.end method

.method static synthetic z(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/buv;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i:Lo/buv;

    return-object v0
.end method

.method private z()V
    .locals 14

    .line 1387
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireCoolDownRunAction()Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    move-result-object v7

    .line 1388
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v7, v0, v1

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1389
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getAction()Lcom/huawei/pluginFitnessAdvice/Action;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/Action;->getName()Ljava/lang/String;

    move-result-object v8

    .line 1390
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getGroup()I

    move-result v9

    .line 1391
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementValue()I

    move-result v0

    mul-int/lit16 v10, v0, 0x3e8

    .line 1392
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementType()I

    move-result v11

    .line 1393
    const-string v0, "TrainDetail"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "groups:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "measurementValue:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "measurementType"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1394
    invoke-direct {p0, v9, v10, v11}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->e(III)Ljava/lang/String;

    move-result-object v12

    .line 1395
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->IDS_plugin_fitnessadvice_second_nogap:I

    .line 1396
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getGap()I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getGap()I

    move-result v3

    int-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 1395
    invoke-static {v0, v1, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 1404
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aY:Lo/efy;

    invoke-virtual {v0, v8}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1405
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aX:Lo/efy;

    invoke-virtual {v0, v12}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1406
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aW:Lo/efy;

    invoke-virtual {v0, v13}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1407
    goto :goto_0

    .line 1408
    :cond_0
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "coolDownRunAction==null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1409
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aM:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1410
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aO:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1411
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aQ:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1412
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aT:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1413
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aV:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1415
    :goto_0
    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 0

    .line 389
    return-void
.end method

.method public d()I
    .locals 1

    .line 553
    const/4 v0, 0x0

    return v0
.end method

.method public downDismiss(Landroid/view/View;)V
    .locals 9

    .line 2978
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->G:Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 2979
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->G:Landroid/view/animation/TranslateAnimation;

    .line 2981
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->G:Landroid/view/animation/TranslateAnimation;

    const-wide/16 v1, 0x190

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 2982
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->G:Landroid/view/animation/TranslateAnimation;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 2983
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->G:Landroid/view/animation/TranslateAnimation;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$22;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$22;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    goto :goto_0

    .line 3000
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->G:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v0}, Landroid/view/animation/TranslateAnimation;->hasEnded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3001
    return-void

    .line 3005
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->G:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 3006
    return-void
.end method

.method public g()V
    .locals 7

    .line 559
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [I

    sget v2, Lcom/huawei/health/suggestion/R$attr;->sug_theme_fitness_color:I

    const/4 v3, 0x0

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v4

    .line 560
    if-eqz v4, :cond_0

    .line 561
    const/4 v0, 0x0

    const/high16 v1, -0x10000

    invoke-virtual {v4, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->R:I

    .line 562
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 564
    :cond_0
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->S:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;

    .line 565
    new-instance v5, Landroid/content/IntentFilter;

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v5, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 566
    const v0, 0x7fffffff

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->setPriority(I)V

    .line 567
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->S:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;

    invoke-virtual {p0, v0, v5}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 568
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_activity_train_detail:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->setContentView(I)V

    .line 574
    sget v0, Lcom/huawei/health/suggestion/R$id;->titlebar_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ba:Lo/emr;

    .line 575
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ba:Lo/emr;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 576
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P:Lo/bsp;

    .line 577
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->t()V

    .line 579
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ba:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$drawable;->sug_push_to_watch:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonBackBackground(Landroid/graphics/drawable/Drawable;)V

    .line 580
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ba:Lo/emr;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$21;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$21;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 615
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ba:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$drawable;->ic_collect_normal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightSoftkeyBackground(Landroid/graphics/drawable/Drawable;)V

    .line 616
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ba:Lo/emr;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$26;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$26;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightSoftkeyOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 623
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 624
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ba:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setRightSoftkeyVisibility(I)V

    .line 627
    :cond_2
    sget v0, Lcom/huawei/health/suggestion/R$id;->btn_left:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aZ:Landroid/widget/ImageView;

    .line 628
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aZ:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 629
    sget v0, Lcom/huawei/health/suggestion/R$id;->train_detail_loading:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->c:Landroid/view/View;

    .line 630
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->c:Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 631
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_detail_tab:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emq;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->af:Lo/emq;

    .line 632
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_detail_vp:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ah:Landroid/support/v4/view/ViewPager;

    .line 633
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_detail_action:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_detail_explain:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ad:[Ljava/lang/String;

    .line 635
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 636
    const/4 v0, 0x2

    new-array v0, v0, [I

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_event_right:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_event_left:I

    const/4 v2, 0x1

    aput v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ae:[I

    .line 637
    const/4 v0, 0x2

    new-array v0, v0, [I

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_event_rightn:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_event_leftn:I

    const/4 v2, 0x1

    aput v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ak:[I

    goto :goto_0

    .line 639
    :cond_3
    const/4 v0, 0x2

    new-array v0, v0, [I

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_event_left:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_event_right:I

    const/4 v2, 0x1

    aput v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ae:[I

    .line 640
    const/4 v0, 0x2

    new-array v0, v0, [I

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_event_leftn:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_event_rightn:I

    const/4 v2, 0x1

    aput v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ak:[I

    .line 642
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ah:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ad:[Ljava/lang/String;

    array-length v1, v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    .line 643
    new-instance v0, Lo/buu;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ah:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->af:Lo/emq;

    invoke-direct {v0, p0, v1, v2}, Lo/buu;-><init>(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/view/ViewPager;Lo/emq;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bh:Lo/buu;

    .line 644
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bh:Lo/buu;

    invoke-virtual {v0, p0}, Lo/buu;->e(Lo/buu$b;)V

    .line 645
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_activity_detail_action:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->al:Landroid/view/View;

    .line 646
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_activity_detail_info:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    .line 647
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_re_course_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ao:Landroid/widget/LinearLayout;

    .line 648
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_layout0:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ar:Landroid/widget/LinearLayout;

    .line 649
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_layout1:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->an:Landroid/widget/LinearLayout;

    .line 650
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_layout2:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aq:Landroid/widget/LinearLayout;

    .line 651
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_layout3:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ap:Landroid/widget/LinearLayout;

    .line 652
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_layout4:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aw:Landroid/widget/LinearLayout;

    .line 653
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_layout5:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->as:Landroid/widget/LinearLayout;

    .line 654
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_layout6:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->av:Landroid/widget/LinearLayout;

    .line 655
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_texttitle0:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->at:Lo/efy;

    .line 656
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_texttitle1:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->az:Lo/efy;

    .line 657
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_texttitle2:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ay:Lo/efy;

    .line 658
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_texttitle3:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ax:Lo/efy;

    .line 659
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_texttitle4:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aD:Lo/efy;

    .line 660
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_texttitle5:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aF:Lo/efy;

    .line 661
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_texttitle6:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aK:Lo/efy;

    .line 662
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_text0:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->au:Lo/efy;

    .line 663
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_text1:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aA:Lo/efy;

    .line 664
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_text2:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aB:Lo/efy;

    .line 665
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_text3:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aG:Lo/efy;

    .line 666
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_text4:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aC:Lo/efy;

    .line 667
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_text5:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aE:Lo/efy;

    .line 668
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_text6:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aL:Lo/efy;

    .line 669
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_detail_info_chart:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/byp;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->r:Lo/byp;

    .line 670
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_run_detail_charts:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->t:Landroid/widget/LinearLayout;

    .line 672
    sget v0, Lcom/huawei/health/suggestion/R$id;->new_imageView:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->U:Landroid/widget/ImageView;

    .line 675
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->al:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->recv_train_detail:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->y:Landroid/support/v7/widget/RecyclerView;

    .line 676
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->y:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 678
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->al:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_action_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aN:Landroid/widget/LinearLayout;

    .line 679
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->al:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_run_workout_warm_up:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aM:Landroid/widget/LinearLayout;

    .line 680
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->al:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_run_workout_adjustment:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aO:Landroid/widget/LinearLayout;

    .line 681
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->al:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->layout_warm_up:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aQ:Landroid/widget/LinearLayout;

    .line 682
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->al:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->layout_action_list:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aT:Landroid/widget/LinearLayout;

    .line 683
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->al:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->layout_cooldown:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aV:Landroid/widget/LinearLayout;

    .line 686
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aM:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/health/suggestion/R$id;->tv_train_title_adv:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aR:Lo/efy;

    .line 687
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aM:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/health/suggestion/R$id;->tv_train_n_adv:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aU:Lo/efy;

    .line 688
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aM:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_fitness_rec_gap:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aS:Lo/efy;

    .line 691
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aO:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/health/suggestion/R$id;->tv_train_title_adv:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aY:Lo/efy;

    .line 692
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aO:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/health/suggestion/R$id;->tv_train_n_adv:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aX:Lo/efy;

    .line 693
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aO:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_fitness_rec_gap:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aW:Lo/efy;

    .line 695
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_recycleview_relative_course:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->v:Landroid/support/v7/widget/RecyclerView;

    .line 698
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_pb_progress:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bwh;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J:Lo/bwh;

    .line 699
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J:Lo/bwh;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bwh;->setTag(Ljava/lang/Object;)V

    .line 700
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_train_action_intro:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bwp;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    .line 702
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_tv_train_desc:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->h:Lo/efy;

    .line 703
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_train_tv_complete_num:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->o:Lo/efy;

    .line 706
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_duration:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->p:Lo/efy;

    .line 707
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitness_times:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->n:Lo/efy;

    .line 708
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_cb_download:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->V:Landroid/widget/CheckBox;

    .line 709
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->V:Landroid/widget/CheckBox;

    invoke-virtual {v0, p0}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 710
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitness_kcals:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->m:Lo/efy;

    .line 711
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitness_level:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->l:Lo/efy;

    .line 712
    sget v0, Lcom/huawei/health/suggestion/R$id;->layout_connect_binding:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->s:Landroid/widget/RelativeLayout;

    .line 713
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_connect_binding:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->u:Lo/efy;

    .line 714
    sget v0, Lcom/huawei/health/suggestion/R$id;->but_connect_binding:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->q:Landroid/widget/Button;

    .line 715
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitness_traind_download:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A:Lo/efy;

    .line 716
    sget v0, Lcom/huawei/health/suggestion/R$id;->ll_fitness_getdata_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->I:Landroid/widget/LinearLayout;

    .line 717
    sget v0, Lcom/huawei/health/suggestion/R$id;->ll_train_detail_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->E:Landroid/widget/LinearLayout;

    .line 718
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    iget-object v0, v0, Lo/bwp;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 719
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->I:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 720
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getPreAction()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 721
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getNextAction()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 722
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$30;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$30;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-virtual {v0, v1}, Lo/bwp;->setOnSlidingListener(Lo/bwf;)V

    .line 784
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->y:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 785
    new-instance v6, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 786
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 787
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->v:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v6}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 788
    new-instance v0, Lo/bvl;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->K:Ljava/util/List;

    sget v2, Lcom/huawei/health/suggestion/R$layout;->sug_traindetail_vp_intro:I

    invoke-direct {v0, v1, v2}, Lo/bvl;-><init>(Ljava/util/List;I)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->N:Lo/bvl;

    .line 789
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->N:Lo/bvl;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bvl;->a(Z)V

    .line 791
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$27;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$27;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 809
    return-void
.end method

.method public i()V
    .locals 4

    .line 1045
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData1:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1046
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->x()V

    .line 1047
    return-void
.end method

.method public k()V
    .locals 4

    .line 961
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewController()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 962
    return-void
.end method

.method public l()Z
    .locals 2

    .line 880
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->getType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->getType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m()V
    .locals 5

    .line 351
    const-string v0, "TrainDetail"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device language is: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ag:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " app language is: "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Lo/dbf;->g()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ag:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {}, Lo/dbf;->g()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 353
    const-string v0, "TrainDetail"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get device language fitworkout workid: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "version: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "devicefont: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ag:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P:Lo/bsp;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireVersion()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ag:Ljava/lang/String;

    new-instance v4, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$11;

    invoke-direct {v4, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$11;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-interface {v0, v1, v2, v3, v4}, Lo/bsp;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/bui;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    goto :goto_0

    .line 381
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/deo;->d(Landroid/content/Context;)Lo/deo;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0, v1}, Lo/deo;->c(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 384
    :goto_0
    return-void
.end method

.method public n()Z
    .locals 4

    .line 884
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 885
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mFitWorkout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 886
    const/4 v0, 0x0

    return v0

    .line 888
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-static {v0}, Lo/bxa;->c(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Z

    move-result v0

    return v0
.end method

.method public o()V
    .locals 4

    .line 2115
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->Q()V

    .line 2116
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A:Lo/efy;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lo/efy;->setTextColor(I)V

    .line 2117
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->p()V

    .line 2118
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i:Lo/buv;

    invoke-virtual {v0}, Lo/buv;->notifyDataSetChanged()V

    .line 2119
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->N:Lo/bvl;

    invoke-virtual {v0}, Lo/bvl;->notifyDataSetChanged()V

    .line 2120
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->X:Z

    .line 2121
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2122
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 1524
    const/16 v0, 0x3e9

    if-ne p1, v0, :cond_0

    .line 1525
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B()Z

    move-result v1

    invoke-static {v0, v1}, Lo/bzy;->c(Landroid/content/Context;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1526
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/deo;->d(Landroid/content/Context;)Lo/deo;

    move-result-object v0

    invoke-virtual {v0}, Lo/deo;->a()V

    .line 1529
    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 2936
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 2937
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->downDismiss(Landroid/view/View;)V

    goto :goto_0

    .line 2939
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ac:Z

    if-eqz v0, :cond_1

    .line 2940
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj()V

    goto :goto_0

    .line 2942
    :cond_1
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onBackPressed()V

    .line 2945
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 2758
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    .line 2759
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_dialog_No:I

    if-ne v1, v0, :cond_0

    .line 2760
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->j:Lo/bvb;

    invoke-virtual {v0}, Lo/bvb;->c()Lo/bvb;

    goto :goto_0

    .line 2761
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_dialog_yse:I

    if-ne v1, v0, :cond_1

    .line 2762
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->af()V

    goto :goto_0

    .line 2763
    :cond_1
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_iv_action_pre:I

    if-ne v1, v0, :cond_2

    .line 2764
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ad()V

    goto :goto_0

    .line 2765
    :cond_2
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_iv_action_nex:I

    if-ne v1, v0, :cond_3

    .line 2766
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ae()V

    goto :goto_0

    .line 2767
    :cond_3
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachiv_close:I

    if-ne v1, v0, :cond_4

    .line 2768
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->downDismiss(Landroid/view/View;)V

    goto :goto_0

    .line 2769
    :cond_4
    sget v0, Lcom/huawei/health/suggestion/R$id;->btn_left:I

    if-ne v1, v0, :cond_6

    .line 2770
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ac:Z

    if-eqz v0, :cond_5

    .line 2771
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aj()V

    goto :goto_0

    .line 2773
    :cond_5
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->finish()V

    goto :goto_0

    .line 2775
    :cond_6
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_cb_download:I

    if-ne v1, v0, :cond_7

    .line 2776
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->V()V

    goto :goto_0

    .line 2777
    :cond_7
    sget v0, Lcom/huawei/health/suggestion/R$id;->ll_fitness_getdata_error:I

    if-ne v1, v0, :cond_8

    .line 2778
    invoke-static {p0}, Lo/dbf;->i(Landroid/content/Context;)V

    .line 2813
    :cond_8
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 321
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x1000000

    const/high16 v2, 0x1000000

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 323
    iput-object p0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    .line 324
    invoke-super {p0, p1}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onCreate(Landroid/os/Bundle;)V

    .line 325
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 326
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 327
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate enter getAccountInfo() == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.intent.action.MAIN"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 329
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.MainActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 330
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 331
    const-string v0, "isFromTrainDetail"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 332
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 333
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->finish()V

    .line 334
    return-void

    .line 336
    :cond_0
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$c;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->be:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$c;

    .line 338
    invoke-static {}, Lo/dbf;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ag:Ljava/lang/String;

    .line 339
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ab:J

    .line 340
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/deo;->d(Landroid/content/Context;)Lo/deo;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$d;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$d;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-virtual {v0, v1}, Lo/deo;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 341
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/ddd;->c(Landroid/content/Context;)Lo/ddd;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$d;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$d;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-virtual {v0, v1}, Lo/ddd;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 343
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->r()V

    .line 344
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 2903
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onDestroy()V

    .line 2905
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aJ:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2906
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aJ:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;->e:Z

    .line 2908
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aH:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 2909
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aH:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 2910
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aH:Landroid/widget/PopupWindow;

    .line 2912
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->S:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$WifiReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2913
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/deo;->d(Landroid/content/Context;)Lo/deo;

    move-result-object v0

    invoke-virtual {v0}, Lo/deo;->d()V

    .line 2914
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P:Lo/bsp;

    invoke-interface {v0}, Lo/bsp;->e()V

    .line 2915
    invoke-static {}, Lo/bvp;->a()Lo/bvp;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvp;->b()Lo/bvp;

    .line 2916
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ab()V

    .line 2917
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->am()V

    .line 2918
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 3

    .line 2004
    invoke-super {p0, p1}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 2005
    const-string v0, "finish"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2006
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->finish()V

    .line 2008
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aJ:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 2009
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->aJ:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$a;->e:Z

    .line 2011
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P:Lo/bsp;

    invoke-interface {v0}, Lo/bsp;->e()V

    .line 2012
    invoke-static {}, Lo/bvp;->a()Lo/bvp;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvp;->b()Lo/bvp;

    .line 2013
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J:Lo/bwh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 2014
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ab()V

    .line 2015
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->V:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A:Lo/efy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 2016
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J:Lo/bwh;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bwh;->setVisibility(I)V

    .line 2017
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J:Lo/bwh;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bwh;->setTag(Ljava/lang/Object;)V

    .line 2018
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->V:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 2019
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A:Lo/efy;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_start_train:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 2020
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A:Lo/efy;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lo/efy;->setTextColor(I)V

    .line 2025
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->c()V

    .line 2026
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->R()V

    .line 2027
    const-string v0, "workoutrecord"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 2028
    const-string v0, "workoutrecord"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->M:Ljava/util/ArrayList;

    .line 2030
    :cond_3
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->w()V

    .line 2031
    return-void
.end method

.method protected onRestart()V
    .locals 0

    .line 1578
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onRestart()V

    .line 1579
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C()V

    .line 1580
    return-void
.end method

.method public onResume()V
    .locals 5

    .line 2079
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onResume()V

    .line 2080
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d:Z

    .line 2081
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->S()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2082
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume to refreshProgessButton"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2084
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 2085
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P:Lo/bsp;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireVersion()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/bsp;->c(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B:Z

    .line 2086
    const-string v0, "TrainDetail"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "-----refreshProgessButton----"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->B:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "true is down"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 2092
    :cond_1
    goto :goto_1

    .line 2088
    :catch_0
    move-exception v4

    .line 2089
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "true is down  error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2092
    goto :goto_1

    .line 2090
    :catch_1
    move-exception v4

    .line 2091
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "true is down  error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2093
    :goto_1
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->Q()V

    .line 2094
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    .line 2095
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ag()V

    .line 2096
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->al()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2097
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->L:I

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i(I)V

    .line 2101
    :cond_2
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 4

    .line 541
    invoke-super {p0, p1}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 542
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSaveInstanceState enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 543
    return-void
.end method

.method public onStop()V
    .locals 1

    .line 2105
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onStop()V

    .line 2106
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d:Z

    .line 2107
    return-void
.end method

.method public p()V
    .locals 5

    .line 817
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->bd:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 818
    :cond_0
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$31;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x1

    new-array v2, v2, [I

    sget v3, Lcom/huawei/health/suggestion/R$layout;->sug_run_rec_train_detail:I

    const/4 v4, 0x0

    aput v3, v2, v4

    invoke-direct {v0, p0, v1, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$31;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Ljava/util/List;[I)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i:Lo/buv;

    goto :goto_0

    .line 833
    :cond_1
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$35;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x1

    new-array v2, v2, [I

    sget v3, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_rec_train_detail:I

    const/4 v4, 0x0

    aput v3, v2, v4

    invoke-direct {v0, p0, v1, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$35;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Ljava/util/List;[I)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i:Lo/buv;

    .line 860
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i:Lo/buv;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$33;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$33;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-virtual {v0, v1}, Lo/buv;->e(Lo/buv$b;)V

    .line 876
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->y:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i:Lo/buv;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 877
    return-void
.end method

.method public s()V
    .locals 4

    .line 2723
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->C:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v3

    .line 2724
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->Y:Z

    if-eqz v0, :cond_0

    .line 2725
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0, v3}, Lo/bsp;->k(Ljava/lang/String;)V

    .line 2726
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ba:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$drawable;->ic_collect_normal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightSoftkeyBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2727
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->Y:Z

    .line 2728
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_collected_no_toast:I

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 2729
    const-string v0, "1130023"

    const/4 v1, 0x2

    invoke-static {v0, v1, v3}, Lo/bzm;->e(Ljava/lang/String;ILjava/lang/String;)V

    goto :goto_0

    .line 2731
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0, v3}, Lo/bsp;->b(Ljava/lang/String;)V

    .line 2732
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->ba:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$drawable;->ic_collect_press:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightSoftkeyBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2733
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->Y:Z

    .line 2734
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_collected_ok_toast2:I

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 2735
    const-string v0, "1130023"

    const/4 v1, 0x1

    invoke-static {v0, v1, v3}, Lo/bzm;->e(Ljava/lang/String;ILjava/lang/String;)V

    .line 2738
    :goto_0
    return-void
.end method

.method public u()V
    .locals 8

    .line 2205
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showSendResultDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2206
    const-string v0, "layout_inflater"

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 2207
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_activity_push_fail:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 2209
    new-instance v7, Lo/egw$c;

    invoke-direct {v7, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 2210
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_push_course_to_watch_fail:I

    invoke-virtual {v7, v0}, Lo/egw$c;->e(I)Lo/egw$c;

    move-result-object v0

    .line 2211
    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->feedback_advanced_success_confirm:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$15;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$15;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    .line 2212
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 2217
    invoke-virtual {v7}, Lo/egw$c;->e()Lo/egw;

    move-result-object v6

    .line 2218
    invoke-virtual {v6}, Lo/egw;->show()V

    .line 2219
    return-void
.end method

.method public upShow(Landroid/view/View;)V
    .locals 9

    .line 3014
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->H:Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 3015
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->H:Landroid/view/animation/TranslateAnimation;

    .line 3017
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->H:Landroid/view/animation/TranslateAnimation;

    const-wide/16 v1, 0x190

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 3018
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->H:Landroid/view/animation/TranslateAnimation;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 3019
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->H:Landroid/view/animation/TranslateAnimation;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$25;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$25;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 3037
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->H:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 3038
    return-void
.end method

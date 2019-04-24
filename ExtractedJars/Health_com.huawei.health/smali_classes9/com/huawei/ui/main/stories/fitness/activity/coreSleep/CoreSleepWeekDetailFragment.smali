.class public Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$b;
    }
.end annotation


# static fields
.field private static b:I

.field private static e:I


# instance fields
.field private A:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private B:Landroid/widget/LinearLayout;

.field private C:Landroid/widget/LinearLayout;

.field private D:Lo/fah;

.field private E:Landroid/widget/TextView;

.field private F:Lo/fac;

.field private G:Lo/fab;

.field private H:Landroid/widget/TextView;

.field private I:Lo/faj;

.field private J:I

.field private K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

.field private L:Landroid/widget/TextView;

.field private M:I

.field private N:Z

.field private O:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private P:Ljava/lang/String;

.field private Q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private R:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private S:Lo/exp;

.field private T:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private U:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$b;

.field private V:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private W:F

.field private X:F

.field private Y:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private a:I

.field private aa:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private ac:Landroid/os/Handler;

.field private c:Ljava/util/Date;

.field private d:Ljava/util/Date;

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/view/View;

.field private i:Landroid/widget/ImageView;

.field private j:Lo/eye;

.field private k:Landroid/content/Context;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/ImageView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/LinearLayout;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/widget/LinearLayout;

.field private w:Landroid/widget/LinearLayout;

.field private x:Landroid/widget/TextView;

.field private y:Landroid/widget/LinearLayout;

.field private z:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 91
    const/4 v0, 0x0

    sput v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->e:I

    .line 93
    const/4 v0, 0x1

    sput v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 61
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 89
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->a:I

    .line 154
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->j:Lo/eye;

    .line 156
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->A:Ljava/util/ArrayList;

    .line 173
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->N:Z

    .line 181
    new-instance v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    .line 185
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->P:Ljava/lang/String;

    .line 199
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->W:F

    .line 201
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->X:F

    .line 206
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->aa:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 208
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->Y:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 211
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->ac:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a()I
    .locals 1

    .line 61
    sget v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->b:I

    return v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->P:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->l()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;I)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->b(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;F)F
    .locals 0

    .line 61
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->W:F

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;I)I
    .locals 0

    .line 61
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->M:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)Landroid/widget/TextView;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->l:Landroid/widget/TextView;

    return-object v0
.end method

.method private b(I)V
    .locals 8

    .line 720
    div-int/lit8 v4, p1, 0x3c

    .line 721
    rem-int/lit8 v5, p1, 0x3c

    .line 722
    if-nez v4, :cond_1

    .line 723
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->o:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 724
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->m:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 726
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 727
    const-string v6, "--"

    goto :goto_0

    .line 729
    :cond_0
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 731
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->r:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 732
    goto :goto_1

    .line 733
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->o:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 734
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->m:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 735
    int-to-double v0, v4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 736
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 737
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 738
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->r:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 740
    :goto_1
    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<*>;)V"
        }
    .end annotation

    .line 651
    if-eqz p1, :cond_0

    .line 652
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 654
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;F)F
    .locals 0

    .line 61
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->X:F

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;I)I
    .locals 0

    .line 61
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->J:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)Landroid/widget/LinearLayout;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->t:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private c(Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;)Z
    .locals 4

    .line 832
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyNoonSleepTime()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyShallowSleepTime()I

    move-result v0

    if-nez v0, :cond_0

    .line 833
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyDeepSleepTime()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailySlumberTime()I

    move-result v0

    if-nez v0, :cond_0

    .line 834
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyTotalSleepTime()I

    move-result v0

    if-eqz v0, :cond_1

    .line 835
    :cond_0
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDataValid  true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 836
    const/4 v0, 0x1

    return v0

    .line 838
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;Z)Z
    .locals 0

    .line 61
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->N:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)Lo/exp;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    return-object v0
.end method

.method private d(JJ)V
    .locals 10

    .line 749
    const-wide/16 v0, 0x3c

    mul-long v4, p1, v0

    .line 750
    const-wide/16 v0, 0x3c

    mul-long/2addr v0, p3

    const-wide/16 v2, 0x1

    sub-long v6, v0, v2

    .line 751
    new-instance v8, Ljava/util/Date;

    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, v4

    invoke-direct {v8, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 752
    new-instance v9, Ljava/util/Date;

    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, v6

    invoke-direct {v9, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 753
    invoke-static {v8}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v4

    .line 754
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startDate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "---endDate ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 755
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 756
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$5;

    invoke-direct {v1, p0, v9}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;Ljava/util/Date;)V

    const/4 v2, 0x2

    invoke-virtual {v0, v4, v5, v2, v1}, Lo/exp;->b(JILo/egg;)V

    .line 771
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;JJ)V
    .locals 0

    .line 61
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->d(JJ)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;I)I
    .locals 0

    .line 61
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->a:I

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->c:Ljava/util/Date;

    return-object p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->m()V

    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)I
    .locals 1

    .line 61
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->M:I

    return v0
.end method

.method private f()V
    .locals 2

    .line 366
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->g:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 376
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->f:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$6;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$6;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 386
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$9;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$9;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/fah;->setPagerNoMoreListener(Lo/eih$p;)V

    .line 415
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$10;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$10;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/fah;->d(Lo/eih$m;)V

    .line 430
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$7;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$7;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/fah;->setOnBarChartViewDataChangedListener(Lo/fah$d;)V

    .line 438
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$8;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$8;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/fah;->setOnMarkViewTextNotify(Lo/elc$c;)V

    .line 477
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->F:Lo/fac;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$11;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$11;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/fac;->setOnViewPagerTouchEventListener(Lo/fac$c;)V

    .line 504
    return-void
.end method

.method private g()V
    .locals 4

    .line 693
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    invoke-virtual {v0}, Lo/fah;->ad()Z

    move-result v2

    .line 694
    if-eqz v2, :cond_0

    .line 695
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 696
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 697
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->aa:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    .line 699
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 700
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 701
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->aa:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 704
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    invoke-virtual {v0}, Lo/fah;->aj()Z

    move-result v3

    .line 705
    if-eqz v3, :cond_1

    .line 706
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 707
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 708
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->Y:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_1

    .line 710
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 711
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 712
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->Y:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 714
    :goto_1
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->o()V

    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)I
    .locals 1

    .line 61
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->J:I

    return v0
.end method

.method private h()V
    .locals 8

    .line 510
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 511
    :cond_0
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isoversea , ConfiguredPageFragment gone... "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 513
    :cond_1
    new-instance v4, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-direct {v4}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;-><init>()V

    .line 514
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 515
    const-string v0, "PAGE_TYPE"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 516
    invoke-virtual {v4, v5}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->setArguments(Landroid/os/Bundle;)V

    .line 518
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v6

    .line 519
    invoke-virtual {v6}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v7

    .line 520
    sget v0, Lcom/huawei/ui/main/R$id;->sleep_week_layout:I

    invoke-virtual {v7, v0, v4}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 521
    invoke-virtual {v7}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 523
    :goto_0
    return-void
.end method

.method static synthetic i()I
    .locals 1

    .line 61
    sget v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->e:I

    return v0
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->n()V

    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->ac:Landroid/os/Handler;

    return-object v0
.end method

.method private k()V
    .locals 5

    .line 530
    new-instance v4, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v4, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 531
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->a(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->d:Ljava/util/Date;

    .line 532
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->d(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->c:Ljava/util/Date;

    .line 533
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "week showCurrentDate mStartDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->c:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mEndDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->d:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->Y:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method private l()V
    .locals 4

    .line 777
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "week Enter CoreSleepWeekDetailFragment updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 779
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v0}, Lo/exp;->w()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/fiy;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->R:Ljava/util/List;

    .line 780
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v0}, Lo/exp;->x()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/fiy;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->Q:Ljava/util/List;

    .line 781
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v0}, Lo/exp;->z()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/fiy;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->V:Ljava/util/List;

    .line 782
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v0}, Lo/exp;->v()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/fiy;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->O:Ljava/util/List;

    .line 783
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v0}, Lo/exp;->y()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/fiy;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->T:Ljava/util/List;

    .line 785
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->Q:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->R:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->V:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->O:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 786
    :cond_0
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI: Data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 787
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->E:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 788
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->b(I)V

    .line 789
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fah;->g(Z)V

    .line 790
    return-void

    .line 792
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->E:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 793
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fah;->g(Z)V

    .line 794
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "week Leave updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 795
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->aa:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method private m()V
    .locals 24

    .line 845
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter updateTotalDatasUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 846
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->newInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

    move-result-object v7

    .line 847
    const-string v0, "0"

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->getCoreSleepServiceData(Ljava/lang/String;Z)Ljava/util/List;

    .line 848
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->w:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 849
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->B:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 850
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->y:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 851
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->l:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 852
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->t:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 854
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->y:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 855
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->l:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 856
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->t:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 858
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v0}, Lo/exp;->j()I

    move-result v8

    .line 859
    div-int/lit8 v9, v8, 0x3c

    .line 860
    rem-int/lit8 v10, v8, 0x3c

    .line 861
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v0}, Lo/exp;->L()I

    move-result v11

    .line 862
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v0}, Lo/exp;->O()I

    move-result v12

    .line 863
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v0}, Lo/exp;->P()I

    move-result v13

    .line 865
    const-string v0, "CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mInteractor.getDailyDeepSleepTime() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v3}, Lo/exp;->D()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mInteractor.getDailyShallowSleepTime() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    .line 866
    invoke-virtual {v3}, Lo/exp;->A()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "mInteractor.getDailySlumberTime() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    .line 867
    invoke-virtual {v3}, Lo/exp;->B()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 865
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 869
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v0}, Lo/exp;->G()I

    move-result v14

    .line 870
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v0}, Lo/exp;->K()I

    move-result v15

    .line 871
    rem-int/lit16 v15, v15, 0x5a0

    .line 872
    div-int/lit8 v16, v15, 0x3c

    .line 873
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "%02d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%02d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    rem-int/lit8 v3, v15, 0x3c

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 874
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v0}, Lo/exp;->N()I

    move-result v18

    .line 875
    move/from16 v0, v18

    rem-int/lit16 v0, v0, 0x5a0

    move/from16 v18, v0

    .line 876
    div-int/lit8 v19, v18, 0x3c

    .line 877
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "%02d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%02d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    rem-int/lit8 v3, v18, 0x3c

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    .line 879
    const-string v0, "CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mInteractor.getDailyFallTime() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v3}, Lo/exp;->K()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mInteractor.getDailyWakeUpTime() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    .line 880
    invoke-virtual {v3}, Lo/exp;->N()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " fallTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v17

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " wakeUpTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 879
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 884
    const/16 v21, 0x0

    .line 885
    const/16 v22, 0x0

    .line 886
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v0}, Lo/exp;->U()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 888
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v0}, Lo/exp;->M()I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-static {v0}, Lo/fiy;->e(I)I

    move-result v21

    .line 889
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v0}, Lo/exp;->J()I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-static {v0}, Lo/fiy;->e(I)I

    move-result v22

    .line 891
    :cond_0
    const-string v0, "CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fallScore = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v21

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",wakeUpScore = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v22

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 893
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_h_min_unit:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    int-to-double v3, v9

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    int-to-double v3, v10

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v23

    .line 894
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->L:Landroid/widget/TextView;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 897
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->clear()V

    .line 898
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v1}, Lo/exp;->I()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDailyWakeupTimes(I)V

    .line 899
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v1}, Lo/exp;->D()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDailyDeepSleepTime(I)V

    .line 900
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v1}, Lo/exp;->A()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDailyShallowSleepTime(I)V

    .line 901
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v1}, Lo/exp;->B()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDailySlumberTime(I)V

    .line 902
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v1}, Lo/exp;->K()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDailyFallTime(I)V

    .line 903
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v1}, Lo/exp;->N()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDailyWakeUpTime(I)V

    .line 904
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0, v14}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDailySleepPart(I)V

    .line 905
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v1}, Lo/exp;->S()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSuggestContent(Ljava/lang/String;)V

    .line 906
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v1}, Lo/exp;->R()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSuggestTitle(Ljava/lang/String;)V

    .line 907
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDailyFallScore(I)V

    .line 908
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDailyWakeUpScore(I)V

    .line 909
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v1}, Lo/exp;->H()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDailyScore(I)V

    .line 910
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v1}, Lo/exp;->F()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDailyNoonSleepTime(I)V

    .line 911
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0, v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDeepSleepRatenum(I)V

    .line 912
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0, v12}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setLightSleepRatenum(I)V

    .line 913
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0, v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSlumSleepRatenum(I)V

    .line 914
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v1}, Lo/exp;->E()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDailyBreathQuality(I)V

    .line 915
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "recommend id :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->P:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 916
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->P:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setRecommendId(Ljava/lang/String;)V

    .line 917
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v1}, Lo/exp;->B()I

    move-result v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v2}, Lo/exp;->A()I

    move-result v2

    add-int/2addr v1, v2

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v2}, Lo/exp;->D()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDailyTotalSleepTime(I)V

    .line 919
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->I:Lo/faj;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/faj;->setSleepData(Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;IZ)V

    .line 920
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->y:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 921
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->l:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 922
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->t:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 923
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave updateTotalDatasUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 924
    return-void
.end method

.method private n()V
    .locals 8

    .line 930
    const-string v7, ""

    .line 931
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 932
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mInteractor:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v3}, Lo/exp;->R()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " content:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v3}, Lo/exp;->S()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 933
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v0}, Lo/exp;->R()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v0}, Lo/exp;->S()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 934
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SuggestTitle and content is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 935
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v1}, Lo/exp;->R()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSuggestTitle(Ljava/lang/String;)V

    .line 936
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v1}, Lo/exp;->S()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSuggestContent(Ljava/lang/String;)V

    .line 937
    return-void

    .line 941
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_suggesttion_nullstatus_tital:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSuggestTitle(Ljava/lang/String;)V

    .line 942
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v0}, Lo/exp;->C()I

    move-result v0

    const/16 v1, 0xb4

    if-le v0, v1, :cond_1

    .line 943
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_suggesttion_nullstatus_content2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 944
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_suggesttion_nullstatus_content2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSuggestContent(Ljava/lang/String;)V

    goto :goto_0

    .line 946
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_hour_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide/high16 v3, 0x4008000000000000L    # 3.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x3

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 947
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_suggesttion_nullstatus_content:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v7, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 948
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_suggesttion_nullstatus_content:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v7, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSuggestContent(Ljava/lang/String;)V

    .line 953
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->g()V

    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)Landroid/widget/TextView;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->p:Landroid/widget/TextView;

    return-object v0
.end method

.method private o()V
    .locals 4

    .line 801
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter updateCommonTotalDatasUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 802
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->clear()V

    .line 803
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v1}, Lo/exp;->D()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDailyDeepSleepTime(I)V

    .line 804
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v1}, Lo/exp;->A()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDailyShallowSleepTime(I)V

    .line 805
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v1}, Lo/exp;->I()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDailyWakeupTimes(I)V

    .line 806
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v1}, Lo/exp;->B()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v2}, Lo/exp;->A()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    invoke-virtual {v2}, Lo/exp;->D()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setTotalSleepDuration(I)V

    .line 807
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->c(Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 808
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->l:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 809
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->t:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 810
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->y:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 811
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->I:Lo/faj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/faj;->setHasSleepData(Z)V

    goto :goto_0

    .line 813
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->l:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 814
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->t:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 815
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->I:Lo/faj;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/faj;->setHasSleepData(Z)V

    .line 816
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->w:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 817
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->B:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 818
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->y:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 821
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->I:Lo/faj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->K:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/faj;->setSleepData(Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;IZ)V

    .line 822
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave updateCommonTotalDatasUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 823
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)Lo/fah;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    return-object v0
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)F
    .locals 1

    .line 61
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->W:F

    return v0
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)F
    .locals 1

    .line 61
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->X:F

    return v0
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)I
    .locals 1

    .line 61
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->a:I

    return v0
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)Lo/eye;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->j:Lo/eye;

    return-object v0
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)Z
    .locals 1

    .line 61
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->N:Z

    return v0
.end method

.method static synthetic v(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$b;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->U:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$b;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/Date;)Ljava/util/Date;
    .locals 6

    .line 543
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 544
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 545
    invoke-virtual {v2, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 546
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 547
    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 548
    invoke-virtual {v3, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 549
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 550
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 551
    invoke-virtual {v4, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 552
    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    .line 553
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {v3, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 554
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {v4, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 556
    :cond_0
    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 557
    const/4 v0, 0x3

    invoke-virtual {v4, v0, v5}, Ljava/util/Calendar;->set(II)V

    .line 558
    const/4 v0, 0x7

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 559
    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 4

    .line 279
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k:Landroid/content/Context;

    .line 280
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$b;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$b;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->U:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$b;

    .line 281
    new-instance v0, Lo/exp;

    invoke-direct {v0}, Lo/exp;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->left_arrow_iv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->g:Landroid/widget/LinearLayout;

    .line 285
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->right_arrow_iv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->f:Landroid/widget/LinearLayout;

    .line 286
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->fitness_detail_up_arrow_left:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->i:Landroid/widget/ImageView;

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->fitness_detail_up_arrow_right:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->n:Landroid/widget/ImageView;

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->fitness_detail_time_date_tv:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->p:Landroid/widget/TextView;

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->core_sleep_bar_chart_date_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->l:Landroid/widget/TextView;

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->common_sleep_sleep_hour_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->o:Landroid/widget/TextView;

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->common_sleep_sleep_hour_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->m:Landroid/widget/TextView;

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->common_sleep_sleep_minute_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->r:Landroid/widget/TextView;

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->core_sleep_bar_chart_sleep_time_layout:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->t:Landroid/widget/LinearLayout;

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->deep_sleep_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->s:Landroid/widget/TextView;

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->light_sleep_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->u:Landroid/widget/TextView;

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->rem_sleep_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->q:Landroid/widget/TextView;

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->wake_sleep_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->x:Landroid/widget/TextView;

    .line 303
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->true_sleep_noon_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->z:Landroid/widget/TextView;

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->sleep_color_block:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->y:Landroid/widget/LinearLayout;

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->light_sleep_ll:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->v:Landroid/widget/LinearLayout;

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->core_sleep_layout_rem_sleep:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->w:Landroid/widget/LinearLayout;

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->wake_sleep_ll:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->C:Landroid/widget/LinearLayout;

    .line 308
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->core_sleep_layout_noon_sleep:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->B:Landroid/widget/LinearLayout;

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 312
    new-instance v0, Lo/fah;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fah;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/fah;->setLayerType(ILandroid/graphics/Paint;)V

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->A:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 316
    :cond_0
    new-instance v0, Lo/eye;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/eye;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->j:Lo/eye;

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->j:Lo/eye;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    sget-object v2, Lo/eic;->M:Lo/eic;

    invoke-virtual {v0, v1, v2}, Lo/eye;->a(Lo/eih;Lo/eic;)Lo/eii;

    .line 319
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->calorie_day_detail_viewpager:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fac;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->F:Lo/fac;

    .line 320
    new-instance v0, Lo/fab;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->A:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lo/fab;-><init>(Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->G:Lo/fab;

    .line 321
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->F:Lo/fac;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->G:Lo/fab;

    invoke-virtual {v0, v1}, Lo/fac;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 324
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->processDialog_title_text:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->E:Landroid/widget/TextView;

    .line 327
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->core_sleep_service_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/faj;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->I:Lo/faj;

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->suggest_title_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->H:Landroid/widget/TextView;

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->total_sleep_duration_hour:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->L:Landroid/widget/TextView;

    .line 332
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->N:Z

    .line 334
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->i:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_right_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 336
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->n:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_left_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 338
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->i:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_left_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 339
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->n:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_right_arrow_click_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 341
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 342
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 345
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 346
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v3, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 347
    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v0}, Lo/fiu;->e(F)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->s:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->s:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/high16 v2, 0x40c00000    # 6.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->v:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->u:Landroid/widget/TextView;

    invoke-static {v0, v1, v2}, Lo/fiu;->a(Landroid/content/Context;Landroid/widget/LinearLayout;Landroid/widget/TextView;)V

    .line 352
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->w:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->q:Landroid/widget/TextView;

    invoke-static {v0, v1, v2}, Lo/fiu;->a(Landroid/content/Context;Landroid/widget/LinearLayout;Landroid/widget/TextView;)V

    .line 353
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->C:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->x:Landroid/widget/TextView;

    invoke-static {v0, v1, v2}, Lo/fiu;->a(Landroid/content/Context;Landroid/widget/LinearLayout;Landroid/widget/TextView;)V

    .line 354
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->B:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->z:Landroid/widget/TextView;

    invoke-static {v0, v1, v2}, Lo/fiu;->a(Landroid/content/Context;Landroid/widget/LinearLayout;Landroid/widget/TextView;)V

    .line 358
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k()V

    .line 359
    return-void
.end method

.method public c()V
    .locals 6

    .line 660
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->N:Z

    .line 661
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "week SleepWeekDetail enter requestDatas,mStartDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->c:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 662
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->c:Ljava/util/Date;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 663
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->k()V

    .line 665
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->c:Ljava/util/Date;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 666
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->c:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v4

    .line 667
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 668
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->S:Lo/exp;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;)V

    const/4 v2, 0x2

    invoke-virtual {v0, v4, v5, v2, v1}, Lo/exp;->b(JILo/egg;)V

    goto :goto_0

    .line 683
    :cond_1
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mInteractor is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 684
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->N:Z

    .line 687
    :cond_2
    :goto_0
    return-void
.end method

.method public d(Ljava/util/Date;)Ljava/util/Date;
    .locals 6

    .line 569
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 570
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 571
    invoke-virtual {v2, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 572
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 573
    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 574
    invoke-virtual {v3, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 575
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 576
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 577
    invoke-virtual {v4, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 578
    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    .line 579
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {v3, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 580
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {v4, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 582
    :cond_0
    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 583
    const/4 v0, 0x3

    invoke-virtual {v3, v0, v5}, Ljava/util/Calendar;->set(II)V

    .line 584
    const/4 v0, 0x7

    const/4 v1, 0x2

    invoke-virtual {v3, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 585
    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public d()V
    .locals 9

    .line 619
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    invoke-virtual {v0}, Lo/fah;->ah()Z

    move-result v4

    .line 620
    if-eqz v4, :cond_0

    .line 621
    return-void

    .line 623
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->E:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 624
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->c:Ljava/util/Date;

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v5

    .line 625
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v5

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->c:Ljava/util/Date;

    .line 626
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->d:Ljava/util/Date;

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v7

    .line 627
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v7

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->d:Ljava/util/Date;

    .line 629
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->Q:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->b(Ljava/util/List;)V

    .line 630
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->R:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->b(Ljava/util/List;)V

    .line 631
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->O:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->b(Ljava/util/List;)V

    .line 632
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->T:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->b(Ljava/util/List;)V

    .line 633
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->V:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->b(Ljava/util/List;)V

    .line 634
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->I:Lo/faj;

    invoke-virtual {v0}, Lo/faj;->c()V

    .line 635
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->c()V

    .line 636
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$3;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;Lo/fah;)V

    invoke-virtual {v0, v1}, Lo/fah;->a(Lo/eih$k;)V

    .line 641
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mChart.isAnimating:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 643
    return-void
.end method

.method public e()V
    .locals 9

    .line 592
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    invoke-virtual {v0}, Lo/fah;->ah()Z

    move-result v4

    .line 593
    if-eqz v4, :cond_0

    .line 594
    return-void

    .line 596
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->E:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 597
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->c:Ljava/util/Date;

    const/4 v1, -0x7

    invoke-static {v0, v1}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v5

    .line 598
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v5

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->c:Ljava/util/Date;

    .line 599
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->d:Ljava/util/Date;

    const/4 v1, -0x7

    invoke-static {v0, v1}, Lo/dbu;->b(Ljava/util/Date;I)J

    move-result-wide v7

    .line 600
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v7

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->d:Ljava/util/Date;

    .line 601
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->Q:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->b(Ljava/util/List;)V

    .line 602
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->R:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->b(Ljava/util/List;)V

    .line 603
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->O:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->b(Ljava/util/List;)V

    .line 604
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->T:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->b(Ljava/util/List;)V

    .line 605
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->V:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->b(Ljava/util/List;)V

    .line 606
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->I:Lo/faj;

    invoke-virtual {v0}, Lo/faj;->c()V

    .line 607
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$15;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->D:Lo/fah;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment$15;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;Lo/fah;)V

    invoke-virtual {v0, v1}, Lo/fah;->b(Lo/eih$k;)V

    .line 612
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->c()V

    .line 613
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4
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

    .line 261
    const-string v0, "UIHLH_CoreSleepWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter onCreateView():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 263
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_fitness_core_sleep_week_detail:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    .line 266
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->b()V

    .line 268
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->f()V

    .line 270
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h()V

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->h:Landroid/view/View;

    return-object v0
.end method

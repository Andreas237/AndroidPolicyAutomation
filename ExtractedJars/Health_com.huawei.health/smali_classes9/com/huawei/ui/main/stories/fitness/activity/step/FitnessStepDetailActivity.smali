.class public Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;
.super Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$a;,
        Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$e;,
        Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$b;,
        Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$c;
    }
.end annotation


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:Landroid/widget/TextView;

.field private C:Landroid/widget/TextView;

.field private D:Landroid/widget/TextView;

.field private E:Landroid/widget/TextView;

.field private F:Landroid/widget/TextView;

.field private G:Landroid/widget/TextView;

.field private H:Landroid/widget/TextView;

.field private I:Landroid/widget/TextView;

.field private J:D

.field private K:D

.field private L:Lo/eyf;

.field private M:Landroid/widget/ImageView;

.field private N:Landroid/widget/TextView;

.field private O:Ljava/util/Date;

.field private P:D

.field private Q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private R:Landroid/graphics/Bitmap;

.field private S:Lo/cmj;

.field private T:Ljava/util/Date;

.field private U:Lcom/huawei/up/model/UserInfomation;

.field private V:Ljava/util/Date;

.field private W:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

.field private X:Landroid/os/Handler;

.field a:Lo/dav;

.field b:Landroid/view/View;

.field e:Landroid/view/View;

.field private j:Lo/fbs;

.field private l:J

.field private m:I

.field private n:I

.field private o:Landroid/content/Context;

.field private p:I

.field private q:J

.field private r:I

.field private s:I

.field private t:Landroid/os/Handler;

.field private u:Lo/exs;

.field private v:Lo/ezf;

.field private w:Lo/ezf$c;

.field private x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ezf$c;>;"
        }
    .end annotation
.end field

.field private y:Lo/ezf$c;

.field private z:Lo/ezf$c;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 98
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;-><init>()V

    .line 119
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->n:I

    .line 132
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->m:I

    .line 133
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->p:I

    .line 134
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->o:Landroid/content/Context;

    .line 137
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->r:I

    .line 138
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s:I

    .line 139
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$e;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$2;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->t:Landroid/os/Handler;

    .line 140
    new-instance v0, Lo/exs;

    invoke-direct {v0, p0}, Lo/exs;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->u:Lo/exs;

    .line 142
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->v:Lo/ezf;

    .line 143
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->x:Ljava/util/List;

    .line 144
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->y:Lo/ezf$c;

    .line 145
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->z:Lo/ezf$c;

    .line 146
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->w:Lo/ezf$c;

    .line 150
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b:Landroid/view/View;

    .line 151
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e:Landroid/view/View;

    .line 167
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->J:D

    .line 168
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->K:D

    .line 169
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->P:D

    .line 173
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->R:Landroid/graphics/Bitmap;

    .line 179
    new-instance v0, Lo/dav;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo/dav;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a:Lo/dav;

    .line 364
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$9;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->X:Landroid/os/Handler;

    .line 902
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$6;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$6;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->W:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;D)D
    .locals 0

    .line 98
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->P:D

    return-wide p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)I
    .locals 1

    .line 98
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->n:I

    return v0
.end method

.method private a(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;)Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 1114
    if-nez p1, :cond_0

    .line 1115
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wrong data "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1117
    move-object v0, p0

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s:I

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->l:J

    iget-wide v4, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->q:J

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b(IJJLjava/util/List;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    .line 1121
    :cond_0
    :try_start_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 1122
    move-object v7, p1

    check-cast v7, Ljava/util/List;

    .line 1123
    move-object v0, p0

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s:I

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->l:J

    iget-wide v4, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->q:J

    move-object v6, v7

    invoke-direct/range {v0 .. v6}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b(IJJLjava/util/List;)Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 1125
    :cond_1
    move-object v7, p1

    :try_start_1
    check-cast v7, Landroid/util/SparseArray;

    .line 1126
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 1127
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "triggered but the data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1129
    move-object v0, p0

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s:I

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->l:J

    iget-wide v4, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->q:J

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b(IJJLjava/util/List;)Ljava/util/ArrayList;
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    return-object v0

    .line 1131
    :cond_2
    const v0, 0x9c42

    :try_start_2
    invoke-virtual {v7, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 1133
    move-object v9, v8

    check-cast v9, Ljava/util/List;

    .line 1135
    move-object v0, p0

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s:I

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->l:J

    iget-wide v4, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->q:J

    move-object v6, v9

    invoke-direct/range {v0 .. v6}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b(IJJLjava/util/List;)Ljava/util/ArrayList;
    :try_end_2
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    return-object v0

    .line 1137
    :catch_0
    move-exception v7

    .line 1138
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1139
    move-object v0, p0

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s:I

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->l:J

    iget-wide v4, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->q:J

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b(IJJLjava/util/List;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    .line 1140
    :catch_1
    move-exception v7

    .line 1141
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1142
    move-object v0, p0

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s:I

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->l:J

    iget-wide v4, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->q:J

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b(IJJLjava/util/List;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method private static a(J)Ljava/util/Date;
    .locals 8

    .line 891
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 892
    invoke-virtual {v7, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 893
    move-object v0, v7

    const/4 v1, 0x1

    invoke-virtual {v7, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/4 v2, 0x2

    invoke-virtual {v7, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/4 v3, 0x5

    invoke-virtual {v7, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    invoke-virtual/range {v0 .. v6}, Ljava/util/Calendar;->set(IIIIII)V

    .line 894
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/content/Context;Ljava/util/Date;Ljava/util/Date;)V
    .locals 9

    .line 713
    new-instance v4, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 714
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e(J)J

    move-result-wide v5

    .line 715
    invoke-virtual {p3}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e(J)J

    move-result-wide v7

    .line 716
    invoke-virtual {v4, v5, v6}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 717
    invoke-virtual {v4, v7, v8}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 718
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 719
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "step_max"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 720
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDayMaxStepsOfYear..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 721
    const/4 v0, 0x4

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 722
    const/4 v0, 0x7

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 723
    invoke-static {p1}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$b;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;I)V

    invoke-virtual {v0, v4, v1}, Lo/clq;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 725
    return-void

    nop

    :array_0
    .array-data 4
        0x9c42
    .end array-data
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;I)V
    .locals 0

    .line 98
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d(I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;Ljava/lang/Object;)V
    .locals 0

    .line 98
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;I)I
    .locals 0

    .line 98
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->r:I

    return p1
.end method

.method private b(J)J
    .locals 2

    .line 1201
    const-wide v0, 0x9fa52400L

    add-long/2addr v0, p1

    return-wide v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->B:Landroid/widget/TextView;

    return-object v0
.end method

.method private b(IJJLjava/util/List;)Ljava/util/ArrayList;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJLjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 1148
    const/4 v6, 0x0

    .line 1149
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 1150
    const/4 v6, 0x7

    goto :goto_0

    .line 1151
    :cond_0
    const/4 v0, 0x6

    if-ne p1, v0, :cond_1

    .line 1152
    const/16 v6, 0xc

    goto :goto_0

    .line 1153
    :cond_1
    const/4 v0, 0x5

    if-ne p1, v0, :cond_2

    .line 1154
    sub-long v7, p4, p2

    .line 1155
    const-wide/32 v0, 0xea60

    div-long v0, v7, v0

    long-to-int v9, v0

    .line 1156
    int-to-float v0, v9

    const/high16 v1, 0x44b40000    # 1440.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v6

    .line 1158
    :cond_2
    :goto_0
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1159
    move-wide/from16 v8, p2

    .line 1160
    const/4 v10, 0x0

    .line 1162
    if-eqz p6, :cond_7

    invoke-interface/range {p6 .. p6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_7

    .line 1163
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/HiHealthData;

    .line 1164
    move v13, v10

    :goto_2
    if-ge v13, v6, :cond_6

    .line 1165
    move-object v0, p0

    move-wide v1, v8

    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v3

    move v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b(JJI)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1167
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_3

    .line 1168
    const-string v0, "content"

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1169
    invoke-direct {p0, v8, v9}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b(J)J

    move-result-wide v8

    goto :goto_3

    .line 1171
    :cond_3
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getFloatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1172
    invoke-direct {p0, v8, v9}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->c(J)J

    move-result-wide v8

    .line 1174
    :goto_3
    add-int/lit8 v10, v10, 0x1

    .line 1175
    goto :goto_5

    .line 1177
    :cond_4
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1178
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_5

    .line 1179
    invoke-direct {p0, v8, v9}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b(J)J

    move-result-wide v8

    goto :goto_4

    .line 1181
    :cond_5
    invoke-direct {p0, v8, v9}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->c(J)J

    move-result-wide v8

    .line 1183
    :goto_4
    add-int/lit8 v10, v10, 0x1

    .line 1164
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_2

    .line 1185
    :cond_6
    :goto_5
    goto/16 :goto_1

    .line 1188
    :cond_7
    move v11, v10

    :goto_6
    if-ge v11, v6, :cond_8

    .line 1189
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1188
    add-int/lit8 v11, v11, 0x1

    goto :goto_6

    .line 1191
    :cond_8
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataBar is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1192
    return-object v7
.end method

.method private b(Landroid/content/Context;)V
    .locals 4

    .line 1343
    invoke-static {p1}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$a;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$a;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;I)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-virtual {v0, v2, v3, v1}, Lo/clq;->d(IILo/clz;)V

    .line 1346
    return-void
.end method

.method private b(Lo/eic;IILo/eie;)V
    .locals 9

    .line 1092
    mul-int/lit8 v0, p2, 0x3c

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long v4, v0, v2

    .line 1093
    mul-int/lit8 v0, p3, 0x3c

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long v6, v0, v2

    .line 1096
    invoke-virtual {p1}, Lo/eic;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1097
    const/4 v8, 0x5

    goto :goto_0

    .line 1098
    :cond_0
    invoke-virtual {p1}, Lo/eic;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1099
    const/4 v8, 0x6

    goto :goto_0

    .line 1100
    :cond_1
    invoke-virtual {p1}, Lo/eic;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1101
    const/4 v8, 0x4

    goto :goto_0

    .line 1103
    :cond_2
    const/4 v8, 0x3

    .line 1106
    :goto_0
    iput-wide v4, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->l:J

    .line 1108
    const-wide/16 v0, 0x3e8

    sub-long v0, v6, v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->q:J

    .line 1109
    iput v8, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s:I

    .line 1111
    return-void
.end method

.method private b(JJI)Z
    .locals 7

    .line 1207
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 1208
    invoke-virtual {v2, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 1210
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 1211
    invoke-virtual {v3, p3, p4}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 1213
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v3, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 1215
    :goto_0
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x2

    invoke-virtual {v3, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 1217
    :goto_1
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x5

    invoke-virtual {v3, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_2

    const/4 v6, 0x1

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    .line 1219
    :goto_2
    const/4 v0, 0x4

    if-eq p5, v0, :cond_3

    const/4 v0, 0x5

    if-ne p5, v0, :cond_5

    .line 1221
    :cond_3
    if-eqz v4, :cond_4

    if-eqz v5, :cond_4

    if-eqz v6, :cond_4

    const/4 v0, 0x1

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    return v0

    .line 1222
    :cond_5
    const/4 v0, 0x6

    if-ne p5, v0, :cond_7

    .line 1224
    if-eqz v4, :cond_6

    if-eqz v5, :cond_6

    const/4 v0, 0x1

    goto :goto_4

    :cond_6
    const/4 v0, 0x0

    :goto_4
    return v0

    .line 1226
    :cond_7
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;D)D
    .locals 0

    .line 98
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->K:D

    return-wide p1
.end method

.method private c(J)J
    .locals 2

    .line 1197
    const-wide/32 v0, 0x5265c00

    add-long/2addr v0, p1

    return-wide v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->H:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/up/model/UserInfomation;
    .locals 0

    .line 98
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->U:Lcom/huawei/up/model/UserInfomation;

    return-object p1
.end method

.method private c(Landroid/content/Context;JJ)V
    .locals 4

    .line 1239
    new-instance v2, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 1240
    invoke-virtual {v2, p2, p3, p4, p5}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 1241
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setSortOrder(I)V

    .line 1242
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 1243
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 1245
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V

    invoke-interface {v0, v2, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 1264
    return-void

    :array_0
    .array-data 4
        0x9c42
    .end array-data
.end method

.method private c(Landroid/content/Context;Ljava/util/Date;)V
    .locals 6

    .line 697
    new-instance v3, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v3}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 698
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e(J)J

    move-result-wide v4

    .line 699
    invoke-virtual {v3, v4, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 700
    const-wide/32 v0, 0x5265bff

    add-long/2addr v0, v4

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 701
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 704
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "step_sum"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "calorie_sum"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "distance_sum"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 705
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 706
    const/4 v0, 0x3

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 707
    invoke-static {p1}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$b;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$b;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;I)V

    invoke-virtual {v0, v3, v1}, Lo/clq;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 708
    return-void

    nop

    :array_0
    .array-data 4
        0x9c42
        0x9c43
        0x9c44
    .end array-data
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;Landroid/content/Context;JJI)V
    .locals 0

    .line 98
    invoke-direct/range {p0 .. p6}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e(Landroid/content/Context;JJI)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;Lo/eih;Lo/eic;)V
    .locals 0

    .line 98
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d(Lo/eih;Lo/eic;)V

    return-void
.end method

.method private c(Lo/ezk;Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)V
    .locals 3

    .line 936
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$10;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$10;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->j:Lo/fbs;

    .line 945
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->j:Lo/fbs;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$15;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$15;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/fbs;->d(Lo/fbs$d;)V

    .line 958
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->j:Lo/fbs;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$11;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$11;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;Lo/ezk;Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)V

    invoke-virtual {v0, v1}, Lo/fbs;->d(Lo/fbs$d;)V

    .line 994
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->j:Lo/fbs;

    invoke-virtual {v0}, Lo/fbs;->b()V

    .line 995
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)D
    .locals 2

    .line 98
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->J:D

    return-wide v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;D)D
    .locals 0

    .line 98
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->J:D

    return-wide p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;I)I
    .locals 0

    .line 98
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->p:I

    return p1
.end method

.method public static d(J)Ljava/util/Date;
    .locals 8

    .line 878
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 879
    invoke-virtual {v7, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 880
    move-object v0, v7

    const/4 v1, 0x1

    invoke-virtual {v7, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/4 v2, 0x2

    invoke-virtual {v7, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/4 v3, 0x5

    invoke-virtual {v7, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Ljava/util/Calendar;->set(IIIIII)V

    .line 881
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method private d(I)V
    .locals 4

    .line 466
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    .line 468
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->A:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_home_page_step_today_step:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 469
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->C:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_start_track_target_type_calorie:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 470
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->G:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_sport_distance:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 471
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->F:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_kcal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 472
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 473
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->E:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 475
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->E:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 478
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->O:Ljava/util/Date;

    if-nez v0, :cond_1

    .line 479
    return-void

    .line 481
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->D:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->O:Ljava/util/Date;

    const v2, 0x10018

    invoke-static {v1, v2}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 483
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCurrentDay="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->O:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " System.currentTimeMillis()="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->O:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/fiy;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 486
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->t()V

    goto/16 :goto_1

    .line 488
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->O:Ljava/util/Date;

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->c(Landroid/content/Context;Ljava/util/Date;)V

    .line 491
    goto/16 :goto_1

    .line 493
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->A:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_steps_share_week_average:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 494
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->C:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_steps_share_daily_max:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 495
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->G:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_step_data_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 496
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->F:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 497
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->E:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 500
    const/high16 v0, 0x41300000    # 11.0f

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e(F)V

    .line 502
    goto/16 :goto_1

    .line 504
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->A:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_steps_share_month_average:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 505
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->C:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_steps_share_daily_max:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 506
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->G:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_step_data_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 507
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->F:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 508
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->E:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 510
    const/high16 v0, 0x40a00000    # 5.0f

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e(F)V

    .line 512
    goto :goto_1

    .line 514
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->A:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_steps_share_year_average:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 515
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->C:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_steps_share_daily_max:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 516
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->G:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_step_data_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 517
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->F:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 518
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->E:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 520
    const/high16 v0, 0x41100000    # 9.0f

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e(F)V

    .line 522
    .line 526
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private d(Ljava/lang/Object;)V
    .locals 9

    .line 836
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 837
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 838
    const-string v6, ""

    .line 840
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s:I

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_6

    .line 841
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a(Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v7

    .line 843
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->Q:Ljava/util/List;

    .line 844
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v8, v0, :cond_2

    .line 845
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->Q:Ljava/util/List;

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->doubleValue()D

    move-result-wide v1

    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    cmpl-double v1, v1, v3

    if-nez v1, :cond_1

    const-wide/16 v1, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->doubleValue()D

    move-result-wide v1

    :goto_1
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 844
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 847
    :cond_2
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->l:J

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d(J)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->T:Ljava/util/Date;

    .line 848
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->q:J

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a(J)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->V:Ljava/util/Date;

    .line 849
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mGoalValue is  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 850
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 851
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->n:I

    .line 852
    sget-object v0, Lo/dae;->gI:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    .line 853
    :cond_3
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_4

    .line 854
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->n:I

    .line 855
    sget-object v0, Lo/dae;->gG:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    .line 856
    :cond_4
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_5

    .line 857
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->n:I

    .line 858
    sget-object v0, Lo/dae;->gF:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 860
    :cond_5
    :goto_2
    goto :goto_3

    .line 861
    :cond_6
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->n:I

    .line 862
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->l:J

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d(J)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->O:Ljava/util/Date;

    .line 863
    sget-object v0, Lo/dae;->gE:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 865
    :goto_3
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v6, v5, v1}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 866
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->X:Landroid/os/Handler;

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v7

    .line 867
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->X:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 868
    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Double;>;)V"
        }
    .end annotation

    .line 684
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 686
    invoke-static {p1}, Lo/fiy;->e(Ljava/util/List;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->K:D

    .line 687
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->P:D

    .line 688
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 689
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->P:D

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    add-double/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->P:D

    .line 688
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 691
    :cond_0
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->P:D

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    int-to-double v2, v2

    div-double/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->J:D

    .line 693
    :cond_1
    return-void
.end method

.method private d(Lo/eih;Lo/eic;)V
    .locals 4

    .line 282
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->g:Lo/eyd;

    invoke-virtual {v0}, Lo/eyd;->a()Lo/eyu;

    move-result-object v3

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->z:Lo/ezf$c;

    sget-object v1, Lo/eiv;->d:Lo/eiv;

    invoke-interface {v3, p1, p2, v1}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v1

    sget-object v2, Lo/eiv;->a:Lo/eiv;

    .line 285
    invoke-interface {v3, p1, p2, v2}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v2

    sub-float/2addr v1, v2

    sget-object v2, Lo/eiv;->e:Lo/eiv;

    .line 286
    invoke-interface {v3, p1, p2, v2}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v2

    sub-float/2addr v1, v2

    .line 284
    invoke-interface {v0, v1}, Lo/ezf$c;->e(F)V

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->y:Lo/ezf$c;

    sget-object v1, Lo/eiv;->a:Lo/eiv;

    invoke-interface {v3, p1, p2, v1}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v1

    invoke-interface {v0, v1}, Lo/ezf$c;->e(F)V

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->w:Lo/ezf$c;

    sget-object v1, Lo/eiv;->e:Lo/eiv;

    invoke-interface {v3, p1, p2, v1}, Lo/eyu;->c(Lo/eih;Lo/eic;Lo/eiv;)F

    move-result v1

    invoke-interface {v0, v1}, Lo/ezf$c;->e(F)V

    .line 289
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->v:Lo/ezf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->x:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/ezf;->a(Ljava/util/List;)V

    .line 290
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)D
    .locals 2

    .line 98
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->K:D

    return-wide v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;I)I
    .locals 0

    .line 98
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->m:I

    return p1
.end method

.method public static e(J)J
    .locals 3

    .line 602
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 603
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 604
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 605
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 606
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 607
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 608
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private e(F)V
    .locals 14

    .line 616
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->Q:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->Q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 617
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->X:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 618
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->X:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 619
    return-void

    .line 621
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->Q:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d(Ljava/util/List;)V

    .line 622
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI barData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->Q:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 624
    iget v5, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->p:I

    .line 626
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->Q:Ljava/util/List;

    invoke-static {v0}, Lo/fiy;->e(Ljava/util/List;)D

    move-result-wide v6

    .line 627
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI 1 maxData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mGoalValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 628
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->p:I

    int-to-double v0, v0

    const-wide v2, 0x3fe9c18fa0000000L    # 0.8048780560493469

    mul-double/2addr v0, v2

    cmpg-double v0, v6, v0

    if-gez v0, :cond_2

    .line 629
    const/4 v5, 0x0

    .line 632
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->L:Lo/eyf;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 634
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->L:Lo/eyf;

    const/4 v1, 0x1

    invoke-static {v1, p1}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(F)V

    .line 636
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->L:Lo/eyf;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->white:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 637
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->white:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 636
    invoke-virtual {v0, v1, v2}, Lo/eyf;->setBarColor(II)V

    .line 638
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->L:Lo/eyf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eyf;->a(Z)V

    .line 641
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 642
    const/4 v0, 0x2

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 643
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->T:Ljava/util/Date;

    const/16 v1, 0x18

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v9

    .line 644
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v9, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v8, v1}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v10

    .line 645
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    const-string v1, "00000"

    invoke-virtual {v0, v8, v1}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v11

    .line 646
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->L:Lo/eyf;

    invoke-virtual {v0, v10, v11}, Lo/eyf;->setPadding(FF)V

    .line 648
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->L:Lo/eyf;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(Ljava/lang/String;)V

    .line 650
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->L:Lo/eyf;

    double-to-int v1, v6

    int-to-double v1, v1

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->p:I

    int-to-double v3, v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/eyf;->a(DD)D

    move-result-wide v6

    .line 651
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI 2 maxData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mGoalValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  targetValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 652
    invoke-static {v6, v7}, Lo/exj;->e(D)D

    move-result-wide v6

    .line 653
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI 3 maxData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mGoalValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  targetValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 654
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->L:Lo/eyf;

    invoke-virtual {v0, v6, v7}, Lo/eyf;->a(D)V

    .line 655
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 656
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 657
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 658
    int-to-double v0, v5

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 660
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->L:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->Q:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/eyf;->e(Ljava/util/List;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v0, v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->J:D

    .line 662
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->L:Lo/eyf;

    invoke-virtual {v0, v12}, Lo/eyf;->c(Ljava/util/ArrayList;)V

    .line 663
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->L:Lo/eyf;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 665
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->n:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    .line 666
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->m:I

    int-to-double v0, v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->P:D

    .line 667
    iget v13, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->r:I

    .line 668
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "validSize is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 669
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->J:D

    .line 670
    if-lez v13, :cond_4

    .line 671
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->P:D

    int-to-double v2, v13

    div-double/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->J:D

    .line 673
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->T:Ljava/util/Date;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->V:Ljava/util/Date;

    invoke-direct {p0, p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a(Landroid/content/Context;Ljava/util/Date;Ljava/util/Date;)V

    .line 674
    goto :goto_0

    .line 675
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->X:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v13

    .line 676
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->X:Landroid/os/Handler;

    invoke-virtual {v0, v13}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 678
    :goto_0
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "end of updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 680
    :cond_6
    return-void
.end method

.method private e(Landroid/content/Context;JJI)V
    .locals 1

    .line 1230
    const/4 v0, 0x6

    if-ne p6, v0, :cond_0

    .line 1231
    invoke-virtual/range {p0 .. p5}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e(Landroid/content/Context;JJ)V

    goto :goto_0

    .line 1233
    :cond_0
    invoke-direct/range {p0 .. p5}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->c(Landroid/content/Context;JJ)V

    .line 1235
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;Lo/eic;IILo/eie;)V
    .locals 0

    .line 98
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b(Lo/eic;IILo/eie;)V

    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Lo/eyf;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->L:Lo/eyf;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Ljava/util/Date;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->T:Ljava/util/Date;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Ljava/util/Date;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->V:Ljava/util/Date;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)D
    .locals 2

    .line 98
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->P:D

    return-wide v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->I:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/widget/TextView;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->D:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V
    .locals 0

    .line 98
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->u()V

    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/os/Handler;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->X:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Ljava/util/List;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->Q:Ljava/util/List;

    return-object v0
.end method

.method private o()V
    .locals 4

    .line 452
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a:Lo/dav;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dav;->d(Z)V

    .line 453
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a:Lo/dav;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->R:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lo/dav;->e(Landroid/graphics/Bitmap;)V

    .line 454
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a:Lo/dav;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/dav;->a(I)V

    .line 456
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a:Lo/dav;

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s:I

    invoke-static {v1}, Lo/fiy;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dav;->d(Ljava/lang/String;)V

    .line 457
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 458
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->o:Landroid/content/Context;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->c(Landroid/content/Context;[Ljava/lang/String;)V

    goto :goto_0

    .line 460
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a:Lo/dav;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 462
    :goto_0
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Lcom/huawei/up/model/UserInfomation;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->U:Lcom/huawei/up/model/UserInfomation;

    return-object v0
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)J
    .locals 2

    .line 98
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->q:J

    return-wide v0
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Lo/fbs;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->j:Lo/fbs;

    return-object v0
.end method

.method private r()V
    .locals 8

    .line 1078
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 1079
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 1080
    move-object v0, v7

    const/4 v1, 0x1

    invoke-virtual {v7, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/4 v2, 0x2

    invoke-virtual {v7, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/4 v3, 0x5

    invoke-virtual {v7, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Ljava/util/Calendar;->set(IIIIII)V

    .line 1082
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->l:J

    .line 1084
    invoke-virtual {v7}, Ljava/util/Calendar;->clear()V

    .line 1085
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 1086
    move-object v0, v7

    const/4 v1, 0x1

    invoke-virtual {v7, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/4 v2, 0x2

    invoke-virtual {v7, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/4 v3, 0x5

    invoke-virtual {v7, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    invoke-virtual/range {v0 .. v6}, Ljava/util/Calendar;->set(IIIIII)V

    .line 1088
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->q:J

    .line 1089
    return-void
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/content/Context;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->o:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)I
    .locals 1

    .line 98
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s:I

    return v0
.end method

.method private t()V
    .locals 5

    .line 530
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->S:Lo/cmj;

    if-eqz v0, :cond_0

    .line 531
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->S:Lo/cmj;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$c;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$c;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/cmj;->e(Lo/cmo;)Z

    goto :goto_0

    .line 533
    :cond_0
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHealthOpenSDK ==null ,get data failed!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->X:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 535
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->X:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 537
    :goto_0
    return-void
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)J
    .locals 2

    .line 98
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->l:J

    return-wide v0
.end method

.method private u()V
    .locals 2

    .line 831
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->t:Landroid/os/Handler;

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 832
    return-void
.end method

.method static synthetic v(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)I
    .locals 1

    .line 98
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->r:I

    return v0
.end method

.method static synthetic w(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)I
    .locals 1

    .line 98
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->m:I

    return v0
.end method

.method static synthetic y(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/os/Handler;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->t:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;
    .locals 1

    .line 899
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->W:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

    return-object v0
.end method

.method public a(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 8

    .line 1021
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->a(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v7

    .line 1022
    move-object v0, p0

    move-object v1, v7

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_step_data_title:I

    .line 1023
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    .line 1024
    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$1;

    invoke-direct {v4, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_step_data_title:I

    .line 1037
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    .line 1038
    invoke-virtual {p0, v6}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 1022
    invoke-virtual/range {v0 .. v6}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Lo/eih$e;Ljava/lang/String;Ljava/lang/String;)V

    .line 1039
    return-object v7
.end method

.method public a(Landroid/content/Context;)V
    .locals 4

    .line 435
    sget v0, Lcom/huawei/ui/main/R$id;->step_root_share:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e:Landroid/view/View;

    .line 436
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e:Landroid/view/View;

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    .line 437
    :cond_0
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mapSuccessCutScreen mRelativeLayout is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    return-void

    .line 441
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e:Landroid/view/View;

    invoke-static {v0}, Lo/cdz;->c(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->R:Landroid/graphics/Bitmap;

    .line 442
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->R:Landroid/graphics/Bitmap;

    if-nez v0, :cond_2

    .line 443
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share mBitmap is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    return-void

    .line 446
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->o()V

    .line 448
    return-void
.end method

.method public a(Landroid/content/Intent;)V
    .locals 2

    .line 295
    if-nez p1, :cond_0

    .line 296
    return-void

    .line 299
    :cond_0
    const-string v0, "today_current_steps_total"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 300
    const-string v0, "today_current_steps_total"

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->m:I

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->m:I

    .line 304
    :cond_1
    return-void
.end method

.method public b(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 7

    .line 999
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->b(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v6

    .line 1000
    move-object v0, p0

    move-object v1, v6

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_step_data_title:I

    .line 1001
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    .line 1002
    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_step_data_title:I

    .line 1003
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    .line 1004
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 1000
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1005
    return-object v6
.end method

.method public b()V
    .locals 3

    .line 811
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_steps:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 813
    invoke-static {p0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 814
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_nav_share_black_rt:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 816
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_nav_share_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 818
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d:Lo/emr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonClickable(Z)V

    .line 819
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 820
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$7;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 827
    return-void
.end method

.method public c(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 7

    .line 1010
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->c(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v6

    .line 1011
    move-object v0, p0

    move-object v1, v6

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_step_data_title:I

    .line 1012
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    .line 1013
    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_step_data_title:I

    .line 1014
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    .line 1015
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 1011
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1016
    return-object v6
.end method

.method public c()V
    .locals 1

    .line 308
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->o:Landroid/content/Context;

    .line 309
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->o:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b(Landroid/content/Context;)V

    .line 310
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->r()V

    .line 311
    return-void
.end method

.method public c(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 5

    .line 327
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkWritePermission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 329
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a:Lo/dav;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 330
    return-void

    .line 332
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_5

    .line 333
    invoke-static {p1, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 334
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkWritePermission isnotHasPermissions"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 336
    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    .line 337
    :goto_0
    if-nez v4, :cond_3

    .line 338
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/ene;->b(Landroid/content/Context;Z)V

    .line 339
    return-void

    .line 342
    :cond_3
    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->requestPermissions([Ljava/lang/String;I)V

    .line 343
    goto :goto_1

    .line 344
    :cond_4
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkWritePermission choosePic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a:Lo/dav;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 348
    :cond_5
    :goto_1
    return-void
.end method

.method public d()V
    .locals 2

    .line 254
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->c:Lo/eyk;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/eyk;->d(Lo/ezv;)V

    .line 266
    return-void

    .line 268
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->c:Lo/eyk;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/eyk;->d(Lo/ezv;)V

    .line 279
    return-void
.end method

.method public d(Lo/ejf;)V
    .locals 2

    .line 315
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$8;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$8;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    .line 323
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 315
    invoke-interface {p1, v0, v1}, Lo/ejf;->b(Lo/ejf$b;Ljava/lang/String;)V

    .line 324
    return-void
.end method

.method public e()Landroid/view/View;
    .locals 5

    .line 232
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 233
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->step_detail_extension:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0

    .line 235
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->v:Lo/ezf;

    if-eqz v0, :cond_1

    .line 236
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->v:Lo/ezf;

    return-object v0

    .line 238
    :cond_1
    new-instance v0, Lo/ezf;

    invoke-direct {v0, p0}, Lo/ezf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->v:Lo/ezf;

    .line 239
    new-instance v0, Lo/ezf$g;

    const/16 v1, 0xff

    const/16 v2, 0x91

    const/16 v3, 0xbd

    const/16 v4, 0xff

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-direct {v0, p0, v1}, Lo/ezf$g;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->y:Lo/ezf$c;

    .line 240
    new-instance v0, Lo/ezf$f;

    const/16 v1, 0xff

    const/16 v2, 0x5f

    const/16 v3, 0x9b

    const/16 v4, 0xff

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-direct {v0, p0, v1}, Lo/ezf$f;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->z:Lo/ezf$c;

    .line 241
    new-instance v0, Lo/ezf$a;

    const/16 v1, 0xff

    const/16 v2, 0x35

    const/16 v3, 0x7e

    const/16 v4, 0xff

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-direct {v0, p0, v1}, Lo/ezf$a;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->w:Lo/ezf$c;

    .line 243
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->x:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->y:Lo/ezf$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->x:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->z:Lo/ezf$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 245
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->x:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->w:Lo/ezf$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 247
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->v:Lo/ezf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->x:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/ezf;->a(Ljava/util/List;)V

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->v:Lo/ezf;

    return-object v0
.end method

.method public e(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;
    .locals 8

    .line 912
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->e(Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)Lo/ezh;

    move-result-object v4

    .line 913
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_step_data_title:I

    .line 914
    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    .line 915
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 913
    invoke-virtual {p0, v4, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d(Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 916
    invoke-virtual {v4}, Lo/ezh;->d()Lo/ezj;

    move-result-object v5

    .line 918
    instance-of v0, v5, Lo/ezr;

    if-nez v0, :cond_0

    .line 919
    return-object v4

    .line 921
    :cond_0
    move-object v0, v5

    check-cast v0, Lo/ezr;

    invoke-virtual {v0}, Lo/ezr;->d()Lo/ezj;

    move-result-object v6

    .line 922
    instance-of v0, v6, Lo/ezk;

    if-nez v0, :cond_1

    .line 923
    return-object v4

    .line 925
    :cond_1
    move-object v7, v6

    check-cast v7, Lo/ezk;

    .line 926
    new-instance v0, Lo/ezk$c;

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->m:I

    int-to-float v1, v1

    .line 928
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->i()Lo/ehy;

    move-result-object v2

    sget-object v3, Lo/eif;->b:Lo/eif;

    invoke-static {v2, v3}, Lo/eic;->d(Lo/ehy;Lo/eif;)Lo/eic;

    move-result-object v2

    const v3, 0x9c42

    invoke-direct {v0, p0, v1, v3, v2}, Lo/ezk$c;-><init>(Landroid/content/Context;FILo/eic;)V

    .line 926
    invoke-virtual {v7, v0}, Lo/ezk;->b(Lo/ezk$b;)V

    .line 930
    invoke-direct {p0, v7, p1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->c(Lo/ezk;Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)V

    .line 931
    return-object v4
.end method

.method public e(Landroid/content/Context;JJ)V
    .locals 9

    .line 1268
    new-instance v4, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 1269
    invoke-virtual {v4, p2, p3}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 1270
    invoke-virtual {v4, p4, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 1271
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 1273
    const/4 v5, 0x5

    .line 1274
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "content"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 1275
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 1276
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 1277
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 1278
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 1279
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFitnessDataDetail aggregateOption="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiAggregateOption;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1281
    new-instance v6, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 1282
    invoke-virtual {v6, p2, p3}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 1283
    invoke-virtual {v6, p4, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 1284
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "sum"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 1285
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 1286
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 1287
    invoke-virtual {v6, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 1288
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 1290
    new-instance v7, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v7}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 1291
    invoke-virtual {v7, p2, p3}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 1292
    invoke-virtual {v7, p4, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 1293
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "size"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 1294
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 1297
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1298
    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1299
    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1300
    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1302
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V

    invoke-interface {v0, v8, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V

    .line 1336
    return-void

    nop

    :array_0
    .array-data 4
        0x9c42
    .end array-data

    :array_1
    .array-data 4
        0x9c42
    .end array-data

    :array_2
    .array-data 4
        0x9c42
    .end array-data
.end method

.method protected g()V
    .locals 2

    .line 201
    sget v0, Lcom/huawei/ui/main/R$id;->step_root_share:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e:Landroid/view/View;

    .line 205
    sget v0, Lcom/huawei/ui/main/R$id;->tv_share_steps_title_avg:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->A:Landroid/widget/TextView;

    .line 206
    sget v0, Lcom/huawei/ui/main/R$id;->tv_share_steps_content_avg:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->B:Landroid/widget/TextView;

    .line 207
    sget v0, Lcom/huawei/ui/main/R$id;->tv_share_content_time:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->D:Landroid/widget/TextView;

    .line 208
    sget v0, Lcom/huawei/ui/main/R$id;->tv_share_title_calories:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->C:Landroid/widget/TextView;

    .line 209
    sget v0, Lcom/huawei/ui/main/R$id;->tv_share_content_calories:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->H:Landroid/widget/TextView;

    .line 210
    sget v0, Lcom/huawei/ui/main/R$id;->tv_share_content_calories_unit:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->F:Landroid/widget/TextView;

    .line 211
    sget v0, Lcom/huawei/ui/main/R$id;->tv_share_title_distance:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->G:Landroid/widget/TextView;

    .line 212
    sget v0, Lcom/huawei/ui/main/R$id;->tv_share_content_distance:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->I:Landroid/widget/TextView;

    .line 213
    sget v0, Lcom/huawei/ui/main/R$id;->tv_share_content_distance_unit:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->E:Landroid/widget/TextView;

    .line 215
    sget v0, Lcom/huawei/ui/main/R$id;->view_share_barchart:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eyf;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->L:Lo/eyf;

    .line 217
    sget v0, Lcom/huawei/ui/main/R$id;->tv_share_username:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->N:Landroid/widget/TextView;

    .line 218
    sget v0, Lcom/huawei/ui/main/R$id;->img_share_userphoto:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->M:Landroid/widget/ImageView;

    .line 220
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->N:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 222
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->M:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 223
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->N:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->M:Landroid/widget/ImageView;

    invoke-static {p0, v0, v1}, Lo/fiy;->b(Landroid/content/Context;Landroid/widget/TextView;Landroid/widget/ImageView;)V

    goto :goto_0

    .line 225
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->N:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->M:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 228
    :goto_0
    return-void
.end method

.method public i()Lo/ehy;
    .locals 1

    .line 1044
    sget-object v0, Lo/ehy;->b:Lo/ehy;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 184
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->onCreate(Landroid/os/Bundle;)V

    .line 185
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->u:Lo/exs;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->l()Z

    move-result v1

    invoke-virtual {v0, p0, v1}, Lo/exs;->e(Landroid/app/Activity;Z)V

    .line 186
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->m()V

    .line 187
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->g()V

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->S:Lo/cmj;

    if-nez v0, :cond_0

    .line 189
    invoke-static {p0}, Lo/fgb;->b(Landroid/content/Context;)Lo/fgb;

    move-result-object v0

    invoke-virtual {v0}, Lo/fgb;->c()Lo/cmj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->S:Lo/cmj;

    .line 191
    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 195
    invoke-super {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity;->onDestroy()V

    .line 196
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->u:Lo/exs;

    invoke-virtual {v0}, Lo/exs;->a()V

    .line 197
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4

    .line 352
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCode=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 354
    array-length v0, p2

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_0

    .line 355
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "choosePic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Write Permission success"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a:Lo/dav;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 358
    :cond_0
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "choosePic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Write Permission Failed"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 361
    :cond_1
    :goto_0
    return-void
.end method

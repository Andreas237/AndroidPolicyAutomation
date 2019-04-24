.class public Lo/faj;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# static fields
.field private static C:Ljava/lang/String;

.field private static I:Ljava/lang/String;


# instance fields
.field private A:Landroid/view/LayoutInflater;

.field private B:Landroid/widget/TextView;

.field private D:Landroid/widget/TextView;

.field private E:Landroid/widget/TextView;

.field private F:Landroid/widget/TextView;

.field private G:Landroid/widget/TextView;

.field private H:Landroid/widget/TextView;

.field private J:Z

.field private K:Landroid/widget/LinearLayout;

.field private L:Lo/exp;

.field private M:Landroid/widget/LinearLayout;

.field private N:Landroid/widget/LinearLayout;

.field private O:Landroid/widget/LinearLayout;

.field private P:Landroid/widget/LinearLayout;

.field private Q:Landroid/widget/LinearLayout;

.field private R:Landroid/widget/LinearLayout;

.field private S:Landroid/widget/LinearLayout;

.field private T:Landroid/widget/LinearLayout;

.field private U:Landroid/widget/LinearLayout;

.field private V:Landroid/widget/LinearLayout;

.field private W:Landroid/widget/LinearLayout;

.field private a:Landroid/widget/LinearLayout;

.field private aA:Landroid/widget/TextView;

.field private aB:Landroid/widget/TextView;

.field private aC:Landroid/widget/TextView;

.field private aD:Landroid/widget/TextView;

.field private aE:Landroid/widget/TextView;

.field private aF:Landroid/widget/TextView;

.field private aG:Landroid/widget/TextView;

.field private aH:Landroid/widget/TextView;

.field private aI:Landroid/widget/TextView;

.field private aJ:Landroid/widget/TextView;

.field private aK:Landroid/widget/TextView;

.field private aL:Landroid/widget/TextView;

.field private aM:Landroid/widget/TextView;

.field private aN:Landroid/widget/TextView;

.field private aO:Landroid/widget/TextView;

.field private aP:Landroid/widget/TextView;

.field private aQ:Landroid/widget/TextView;

.field private aR:I

.field private aS:Landroid/widget/TextView;

.field private aT:Landroid/widget/TextView;

.field private aU:I

.field private aV:Landroid/widget/TextView;

.field private aW:I

.field private aX:I

.field private aY:I

.field private aZ:I

.field private aa:Landroid/widget/ImageView;

.field private ab:Landroid/widget/ImageView;

.field private ac:Landroid/widget/ImageView;

.field private ad:Landroid/widget/ImageView;

.field private ae:Landroid/widget/ImageView;

.field private af:Landroid/widget/ImageView;

.field private ag:Landroid/widget/ImageView;

.field private ah:Landroid/widget/ImageView;

.field private ai:Landroid/widget/ImageView;

.field private aj:Landroid/widget/TextView;

.field private ak:Landroid/widget/TextView;

.field private al:Landroid/widget/ImageView;

.field private am:Landroid/widget/ImageView;

.field private an:Landroid/widget/TextView;

.field private ao:Landroid/widget/TextView;

.field private ap:Landroid/widget/TextView;

.field private aq:Landroid/widget/TextView;

.field private ar:Landroid/widget/TextView;

.field private as:Landroid/widget/TextView;

.field private at:Landroid/widget/TextView;

.field private au:Landroid/widget/TextView;

.field private av:Landroid/widget/TextView;

.field private aw:Landroid/widget/TextView;

.field private ax:Landroid/widget/TextView;

.field private ay:Landroid/widget/TextView;

.field private az:Landroid/widget/TextView;

.field private b:Landroid/widget/LinearLayout;

.field private ba:I

.field private bb:I

.field private bc:I

.field private bd:I

.field private be:I

.field private bf:I

.field private bg:I

.field private bh:Landroid/widget/TextView;

.field private bi:I

.field private bj:I

.field private bk:Landroid/widget/TextView;

.field private bl:Landroid/widget/TextView;

.field private bm:Landroid/widget/LinearLayout;

.field private bn:Landroid/widget/TextView;

.field private bo:Landroid/widget/LinearLayout;

.field private bp:Landroid/widget/TextView;

.field private bq:Landroid/widget/TextView;

.field private br:Landroid/widget/TextView;

.field private bs:Landroid/widget/TextView;

.field private bt:Landroid/widget/TextView;

.field private bu:Landroid/widget/TextView;

.field private bv:I

.field private bw:Landroid/widget/TextView;

.field private bx:Lo/fiy;

.field private by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

.field private bz:Landroid/widget/TextView;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/content/Context;

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/view/View;

.field private h:Landroid/view/View;

.field private i:Landroid/view/View;

.field private j:Landroid/widget/TextView;

.field private k:Landroid/widget/LinearLayout;

.field private l:Landroid/support/v7/widget/RecyclerView;

.field private m:Lo/fao;

.field private n:Lo/fao;

.field private o:Landroid/widget/LinearLayout;

.field private p:Landroid/view/View;

.field private q:Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

.field private r:Landroid/view/View;

.field private s:Lo/ewc;

.field private t:Landroid/widget/LinearLayout;

.field private u:Landroid/widget/LinearLayout;

.field private v:Landroid/widget/TextView;

.field private w:Landroid/widget/TextView;

.field private x:Landroid/widget/TextView;

.field private y:Landroid/widget/LinearLayout;

.field private z:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 99
    const-string v0, "CoreSleepServiceView"

    sput-object v0, Lo/faj;->C:Ljava/lang/String;

    .line 100
    const-string v0, "UIHLH_CoreSleepServiceView"

    sput-object v0, Lo/faj;->I:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 190
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 113
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/faj;->J:Z

    .line 137
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->aR:I

    .line 140
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->aU:I

    .line 143
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->aX:I

    .line 148
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->ba:I

    .line 149
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->aW:I

    .line 150
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->aZ:I

    .line 151
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->aY:I

    .line 152
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->be:I

    .line 153
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->bb:I

    .line 154
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->bc:I

    .line 155
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->bf:I

    .line 158
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->bd:I

    .line 159
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->bj:I

    .line 160
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->bg:I

    .line 161
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->bi:I

    .line 187
    new-instance v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;-><init>()V

    iput-object v0, p0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    .line 438
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->bv:I

    .line 191
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 194
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 113
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/faj;->J:Z

    .line 137
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->aR:I

    .line 140
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->aU:I

    .line 143
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->aX:I

    .line 148
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->ba:I

    .line 149
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->aW:I

    .line 150
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->aZ:I

    .line 151
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->aY:I

    .line 152
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->be:I

    .line 153
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->bb:I

    .line 154
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->bc:I

    .line 155
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->bf:I

    .line 158
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->bd:I

    .line 159
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->bj:I

    .line 160
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->bg:I

    .line 161
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->bi:I

    .line 187
    new-instance v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;-><init>()V

    iput-object v0, p0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    .line 438
    const/4 v0, 0x0

    iput v0, p0, Lo/faj;->bv:I

    .line 195
    iput-object p1, p0, Lo/faj;->e:Landroid/content/Context;

    .line 196
    iget-object v0, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/faj;->A:Landroid/view/LayoutInflater;

    .line 197
    iget-object v0, p0, Lo/faj;->q:Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

    if-nez v0, :cond_0

    .line 198
    iget-object v0, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->newInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

    move-result-object v0

    iput-object v0, p0, Lo/faj;->q:Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

    .line 200
    :cond_0
    new-instance v0, Lo/exp;

    invoke-direct {v0}, Lo/exp;-><init>()V

    iput-object v0, p0, Lo/faj;->L:Lo/exp;

    .line 201
    new-instance v0, Lo/fiy;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fiy;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/faj;->bx:Lo/fiy;

    .line 202
    iget-object v0, p0, Lo/faj;->A:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/main/R$layout;->layout_sleep_service_info_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 203
    invoke-virtual {p0, v3}, Lo/faj;->addView(Landroid/view/View;)V

    .line 204
    invoke-direct {p0, v3}, Lo/faj;->e(Landroid/view/View;)V

    .line 205
    invoke-direct {p0}, Lo/faj;->b()V

    .line 206
    invoke-direct {p0}, Lo/faj;->d()V

    .line 207
    return-void
.end method

.method static synthetic a(Lo/faj;)I
    .locals 1

    .line 65
    iget v0, p0, Lo/faj;->aU:I

    return v0
.end method

.method private a()V
    .locals 5

    .line 986
    sget-object v0, Lo/faj;->I:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter updateNoDataTotalDatasUI():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 987
    iget-object v0, p0, Lo/faj;->q:Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

    const-string v1, "0"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->getCoreSleepServiceData(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v4

    .line 988
    iget-object v0, p0, Lo/faj;->s:Lo/ewc;

    invoke-virtual {v0, v4}, Lo/ewc;->c(Ljava/util/List;)V

    .line 989
    iget-object v0, p0, Lo/faj;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 990
    iget-object v0, p0, Lo/faj;->b:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 992
    return-void
.end method

.method static synthetic b(Lo/faj;)Landroid/content/Context;
    .locals 1

    .line 65
    iget-object v0, p0, Lo/faj;->e:Landroid/content/Context;

    return-object v0
.end method

.method private b()V
    .locals 4

    .line 1374
    iget-object v0, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1375
    sget-object v0, Lo/faj;->C:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isEnglish  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1377
    :cond_0
    return-void
.end method

.method private b(Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;I)V
    .locals 8

    .line 1000
    sget-object v0, Lo/faj;->I:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter updateCommonTotalDatasUI():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1001
    iget-object v0, p0, Lo/faj;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1002
    iget-object v0, p0, Lo/faj;->q:Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

    const-string v1, "0"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->getCoreSleepServiceData(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v6

    .line 1003
    iget-object v0, p0, Lo/faj;->s:Lo/ewc;

    invoke-virtual {v0, v6}, Lo/ewc;->c(Ljava/util/List;)V

    .line 1004
    iget-object v0, p0, Lo/faj;->F:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1005
    iget-object v0, p0, Lo/faj;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1006
    iget-object v0, p0, Lo/faj;->b:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1007
    iget-object v0, p0, Lo/faj;->h:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1008
    iget-object v0, p0, Lo/faj;->u:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1009
    iget-object v0, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_awake_times:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 1010
    const/4 v0, 0x3

    if-eq v0, p2, :cond_0

    const/4 v0, 0x2

    if-ne v0, p2, :cond_1

    .line 1011
    :cond_0
    iget-object v0, p0, Lo/faj;->Q:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1012
    iget-object v0, p0, Lo/faj;->G:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1013
    iget-object v0, p0, Lo/faj;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1014
    iget-object v0, p0, Lo/faj;->w:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_sleep_data_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1015
    iget-object v0, p0, Lo/faj;->aG:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_sleep_avg_latency_time:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1016
    iget-object v0, p0, Lo/faj;->av:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyWakeupTimes()I

    move-result v2

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1017
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyDeepSleepTime()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyShallowSleepTime()I

    move-result v1

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Lo/faj;->setSleepDataToCommonSleep(I)V

    goto/16 :goto_0

    .line 1018
    :cond_1
    const/4 v0, 0x4

    if-ne v0, p2, :cond_2

    .line 1019
    iget-object v0, p0, Lo/faj;->Q:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1020
    iget-object v0, p0, Lo/faj;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1021
    iget-object v0, p0, Lo/faj;->w:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_daily_average_sleep_data_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1022
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyDeepSleepTime()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyShallowSleepTime()I

    move-result v1

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Lo/faj;->setSleepDataToCommonSleep(I)V

    goto :goto_0

    .line 1024
    :cond_2
    iget-object v0, p0, Lo/faj;->Q:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1025
    iget-object v0, p0, Lo/faj;->G:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1026
    iget-object v0, p0, Lo/faj;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1027
    iget-object v0, p0, Lo/faj;->aG:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_sleep_latency_time:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1028
    iget-object v0, p0, Lo/faj;->av:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getWakeupTimes()I

    move-result v2

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1029
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDeepSleepTime()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getShallowSleepTime()I

    move-result v1

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Lo/faj;->setSleepDataToCommonSleep(I)V

    .line 1031
    :goto_0
    return-void
.end method

.method private c(Ljava/lang/String;)I
    .locals 4

    .line 978
    const-string v0, ":"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 979
    const/4 v0, 0x0

    aget-object v0, v3, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x3c

    mul-int/lit8 v0, v0, 0x3c

    const/4 v1, 0x1

    aget-object v1, v3, v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    mul-int/lit8 v1, v1, 0x3c

    add-int/2addr v0, v1

    return v0
.end method

.method static synthetic c(Lo/faj;)I
    .locals 1

    .line 65
    iget v0, p0, Lo/faj;->aR:I

    return v0
.end method

.method private c(Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;I)V
    .locals 19

    .line 268
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->q:Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getRecommendId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->getCoreSleepServiceData(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v7

    .line 269
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->s:Lo/ewc;

    invoke-virtual {v0, v7}, Lo/ewc;->c(Ljava/util/List;)V

    .line 271
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 272
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 273
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->h:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 274
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->Q:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 277
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->L:Lo/exp;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/exp;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 278
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 280
    :cond_0
    sget-object v0, Lo/faj;->C:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SleepDayDetail requestSleepDetailUIData mTotalSleepData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    const/4 v0, 0x1

    move/from16 v1, p2

    if-ne v0, v1, :cond_5

    .line 284
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->r:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 285
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 286
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getNoonSleepTime()I

    move-result v8

    .line 287
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDeepSleepTime()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getShallowSleepTime()I

    move-result v1

    add-int/2addr v0, v1

    .line 288
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getSlumberSleepTime()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getNoonSleepTime()I

    move-result v1

    add-int v9, v0, v1

    .line 289
    if-ne v8, v9, :cond_2

    if-eqz v9, :cond_2

    .line 290
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->E:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 291
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->F:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 292
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 293
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 294
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->G:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 295
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 296
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->p:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 297
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 298
    const/16 v0, 0xb4

    if-le v8, v0, :cond_1

    .line 299
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->G:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_suggesttion_nullstatus_content2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 301
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

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

    move-result-object v10

    .line 302
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->G:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_suggesttion_nullstatus_content:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v10, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 304
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->u:Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->croe_sleep_day_card_gradual:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_2

    .line 306
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->G:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 307
    if-nez v8, :cond_3

    .line 308
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 310
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->g:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 312
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 313
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->H:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_home_page_sleep_score:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 314
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->p:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 317
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->p:Landroid/view/View;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ffffff:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 318
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->a:Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ffffff:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 319
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->u:Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ffffff:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 320
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 323
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDeepSleepTime()I

    move-result v10

    .line 324
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getShallowSleepTime()I

    move-result v11

    .line 325
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getSlumberSleepTime()I

    move-result v12

    .line 327
    if-lez v11, :cond_4

    if-nez v10, :cond_4

    if-nez v12, :cond_4

    .line 328
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->j:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_suggesttion_novalidData_tital:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 329
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->B:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_suggesttion_novalidData_content:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 332
    :cond_4
    goto/16 :goto_9

    :cond_5
    const/4 v0, 0x3

    move/from16 v1, p2

    if-eq v0, v1, :cond_6

    const/4 v0, 0x2

    move/from16 v1, p2

    if-ne v0, v1, :cond_d

    .line 334
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyNoonSleepTime()I

    move-result v8

    .line 336
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyDeepSleepTime()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyShallowSleepTime()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailySlumberTime()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyNoonSleepTime()I

    move-result v1

    add-int v9, v0, v1

    .line 338
    const/16 v0, 0x2d

    if-le v8, v0, :cond_7

    .line 339
    const/16 v0, 0x47

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->bv:I

    goto :goto_3

    .line 341
    :cond_7
    const/16 v0, 0x49

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->bv:I

    .line 344
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->L:Lo/exp;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/exp;->a(Landroid/content/Context;)Z

    move-result v10

    .line 345
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v11

    .line 347
    if-eqz v8, :cond_c

    .line 348
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/LinearLayout;

    .line 349
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v12, v0}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 350
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->t:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 351
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->layout_core_sleep_noon_sleep:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v13

    .line 352
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->t:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v13}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 353
    sget v0, Lcom/huawei/ui/main/R$id;->total_day_sleep_duration_hour:I

    invoke-virtual {v13, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Landroid/widget/TextView;

    .line 354
    sget v0, Lcom/huawei/ui/main/R$id;->total_day_sleep_name_tv:I

    invoke-virtual {v13, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Landroid/widget/TextView;

    .line 355
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_daysleep_arrow:I

    invoke-virtual {v13, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Landroid/widget/ImageView;

    .line 356
    sget v0, Lcom/huawei/ui/main/R$id;->list_day_sleep_item_divider:I

    invoke-virtual {v13, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v17

    .line 357
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_avg_noontime_sleep:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 358
    move-object/from16 v0, v17

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 359
    if-eqz v11, :cond_8

    .line 360
    sget v0, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 362
    :cond_8
    if-nez v10, :cond_9

    .line 363
    move-object/from16 v0, v16

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_4

    .line 365
    :cond_9
    new-instance v0, Lo/faj$4;

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v8}, Lo/faj$4;-><init>(Lo/faj;I)V

    invoke-virtual {v13, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 371
    :goto_4
    move-object/from16 v0, p0

    const/16 v1, 0xd

    const/16 v2, 0xd

    invoke-direct {v0, v14, v8, v1, v2}, Lo/faj;->d(Landroid/widget/TextView;III)V

    .line 373
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 374
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->u:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 375
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->r:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 376
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->y:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 377
    if-ne v8, v9, :cond_b

    .line 378
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->G:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 379
    const/16 v0, 0xb4

    if-le v8, v0, :cond_a

    .line 380
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->G:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_suggesttion_nullstatus_content2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 382
    :cond_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

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

    move-result-object v18

    .line 383
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->G:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_suggesttion_nullstatus_content:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v18, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 385
    :goto_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 386
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 387
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->p:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 388
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 389
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->u:Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->croe_sleep_day_card_gradual:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_6

    .line 391
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->G:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 392
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->g:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 393
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 394
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->H:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_avg_sleep_score:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 395
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->p:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 396
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->p:Landroid/view/View;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ffffff:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 397
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->a:Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ffffff:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 398
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 399
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->u:Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ffffff:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 401
    :goto_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v12, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 403
    goto :goto_7

    .line 404
    :cond_c
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->u:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 405
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->r:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 406
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->y:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 407
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->G:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 408
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 409
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 410
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->H:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_avg_sleep_score:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 411
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->p:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 414
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->p:Landroid/view/View;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ffffff:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 415
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->a:Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->color_ffffff:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 416
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 422
    :goto_7
    goto :goto_9

    :cond_d
    const/4 v0, 0x4

    move/from16 v1, p2

    if-ne v0, v1, :cond_f

    .line 423
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyDeepSleepTime()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyShallowSleepTime()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailySlumberTime()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyNoonSleepTime()I

    move-result v1

    add-int v8, v0, v1

    .line 424
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyNoonSleepTime()I

    move-result v9

    .line 425
    if-ne v8, v9, :cond_e

    if-eqz v9, :cond_e

    .line 426
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_8

    .line 428
    :cond_e
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 430
    :goto_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->u:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 431
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->b:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 432
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->w:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_average_nightly_sleep:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 433
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyDeepSleepTime()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyShallowSleepTime()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailySlumberTime()I

    move-result v1

    add-int/2addr v0, v1

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/faj;->setSleepDataToCommonSleep(I)V

    .line 435
    :cond_f
    :goto_9
    sget-object v0, Lo/faj;->C:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mTotalSleepData  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 436
    return-void
.end method

.method static synthetic d(Lo/faj;)I
    .locals 1

    .line 65
    iget v0, p0, Lo/faj;->aX:I

    return v0
.end method

.method private d()V
    .locals 4

    .line 1442
    iget-object v0, p0, Lo/faj;->L:Lo/exp;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/exp;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1443
    iget-object v0, p0, Lo/faj;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 1445
    :cond_0
    sget-object v0, Lo/faj;->C:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "language is not 42."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1446
    iget-object v0, p0, Lo/faj;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1448
    :goto_0
    return-void
.end method

.method private d(I)V
    .locals 7

    .line 448
    rem-int/lit8 v0, p1, 0x3c

    sub-int v0, p1, v0

    int-to-float v0, v0

    const/high16 v1, 0x42700000    # 60.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 449
    rem-int/lit8 v0, p1, 0x3c

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 450
    iget-object v0, p0, Lo/faj;->L:Lo/exp;

    invoke-virtual {v0}, Lo/exp;->c()Ljava/util/List;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/ArrayList;

    .line 451
    iget-object v0, p0, Lo/faj;->e:Landroid/content/Context;

    iget v1, p0, Lo/faj;->bv:I

    invoke-static {v0, v4, v5, v1, v6}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/DaySleepActivity;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 452
    return-void
.end method

.method private d(Landroid/widget/TextView;III)V
    .locals 12

    .line 1405
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 1406
    const-string v0, ""

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1407
    return-void

    .line 1409
    :cond_0
    div-int/lit8 v4, p2, 0x3c

    .line 1410
    rem-int/lit8 v5, p2, 0x3c

    .line 1411
    if-nez v4, :cond_1

    .line 1412
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 1413
    iget-object v0, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_target_sport_time_unit:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 1414
    new-instance v8, Landroid/text/SpannableString;

    invoke-direct {v8, v7}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 1415
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    const/4 v1, 0x1

    invoke-direct {v0, p3, v1}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x11

    invoke-virtual {v8, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1416
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    move/from16 v1, p4

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x11

    invoke-virtual {v8, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1417
    const-string v0, "HwChinese-medium"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x11

    invoke-virtual {v8, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1418
    invoke-virtual {p1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1420
    goto/16 :goto_0

    .line 1421
    :cond_1
    int-to-double v0, v4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 1422
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 1424
    iget-object v0, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_h_min_unit:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    const/4 v3, 0x1

    aput-object v7, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 1425
    new-instance v9, Landroid/text/SpannableString;

    invoke-direct {v9, v8}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 1426
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    const/4 v1, 0x1

    invoke-direct {v0, p3, v1}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x11

    invoke-virtual {v9, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1427
    invoke-virtual {v9}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    .line 1428
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    move/from16 v1, p4

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v10

    const/16 v2, 0x11

    invoke-virtual {v9, v0, v10, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1429
    const-string v0, "HwChinese-medium"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v10

    const/16 v2, 0x11

    invoke-virtual {v9, v0, v10, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1430
    invoke-virtual {v9}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v10

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v7, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v11

    .line 1432
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    move/from16 v1, p4

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v11

    const/16 v2, 0x11

    invoke-virtual {v9, v0, v11, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1433
    const-string v0, "HwChinese-medium"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v11

    const/16 v2, 0x11

    invoke-virtual {v9, v0, v11, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1434
    invoke-virtual {p1, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1437
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/faj;I)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lo/faj;->d(I)V

    return-void
.end method

.method static synthetic e(Lo/faj;)I
    .locals 1

    .line 65
    iget v0, p0, Lo/faj;->bc:I

    return v0
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    .line 65
    sget-object v0, Lo/faj;->C:Ljava/lang/String;

    return-object v0
.end method

.method private e(IZ)V
    .locals 11

    .line 1253
    sget-object v0, Lo/faj;->I:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshPieChart, isCoreSleep = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1254
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1255
    iget-object v0, p0, Lo/faj;->n:Lo/fao;

    invoke-virtual {v0, p2}, Lo/fao;->a(Z)V

    .line 1256
    iget-object v0, p0, Lo/faj;->m:Lo/fao;

    invoke-virtual {v0, p2}, Lo/fao;->a(Z)V

    .line 1258
    const/4 v5, 0x0

    .line 1260
    const/4 v6, 0x0

    .line 1262
    const/4 v7, 0x0

    .line 1264
    const/4 v8, 0x0

    .line 1266
    const/4 v9, 0x0

    .line 1268
    const/4 v10, 0x0

    .line 1270
    const/4 v0, 0x2

    if-eq v0, p1, :cond_0

    const/4 v0, 0x3

    if-eq v0, p1, :cond_0

    const/4 v0, 0x4

    if-ne v0, p1, :cond_2

    .line 1271
    :cond_0
    const/4 v0, 0x4

    if-ne v0, p1, :cond_1

    .line 1272
    iget-object v0, p0, Lo/faj;->bk:Landroid/widget/TextView;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_avg_deep_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1273
    iget-object v0, p0, Lo/faj;->bn:Landroid/widget/TextView;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_avg_light_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1274
    iget-object v0, p0, Lo/faj;->bl:Landroid/widget/TextView;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_avg_rem_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1276
    iget-object v0, p0, Lo/faj;->bu:Landroid/widget/TextView;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_avg_deep_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1277
    iget-object v0, p0, Lo/faj;->br:Landroid/widget/TextView;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_avg_light_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1278
    iget-object v0, p0, Lo/faj;->bw:Landroid/widget/TextView;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_avg_rem_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1280
    :cond_1
    iget-object v0, p0, Lo/faj;->bk:Landroid/widget/TextView;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_average_deep_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1281
    iget-object v0, p0, Lo/faj;->bn:Landroid/widget/TextView;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_average_light_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1282
    iget-object v0, p0, Lo/faj;->bl:Landroid/widget/TextView;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_average_eye_movement:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1283
    iget-object v0, p0, Lo/faj;->bu:Landroid/widget/TextView;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_average_deep_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1284
    iget-object v0, p0, Lo/faj;->br:Landroid/widget/TextView;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_average_light_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1285
    iget-object v0, p0, Lo/faj;->bw:Landroid/widget/TextView;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_core_sleep_average_eye_movement:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1287
    :goto_0
    iget-object v0, p0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyDeepSleepTime()I

    move-result v5

    .line 1288
    iget-object v0, p0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyShallowSleepTime()I

    move-result v6

    .line 1289
    iget-object v0, p0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailySlumberTime()I

    move-result v7

    .line 1290
    int-to-float v0, v5

    const/high16 v1, 0x3f800000    # 1.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v8

    .line 1291
    int-to-float v0, v6

    const/high16 v1, 0x3f800000    # 1.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v9

    .line 1292
    int-to-float v0, v7

    const/high16 v1, 0x3f800000    # 1.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v10

    goto/16 :goto_1

    .line 1294
    :cond_2
    iget-object v0, p0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDeepSleepTime()I

    move-result v5

    .line 1295
    iget-object v0, p0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getShallowSleepTime()I

    move-result v6

    .line 1296
    iget-object v0, p0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getSlumberSleepTime()I

    move-result v7

    .line 1297
    int-to-float v0, v5

    const/high16 v1, 0x3f800000    # 1.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v8

    .line 1298
    int-to-float v0, v6

    const/high16 v1, 0x3f800000    # 1.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v9

    .line 1299
    int-to-float v0, v7

    const/high16 v1, 0x3f800000    # 1.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v10

    .line 1300
    iget-object v0, p0, Lo/faj;->bk:Landroid/widget/TextView;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_sleep_deepsleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1301
    iget-object v0, p0, Lo/faj;->bn:Landroid/widget/TextView;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_sleep_shallowsleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1302
    iget-object v0, p0, Lo/faj;->bl:Landroid/widget/TextView;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_rem_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1304
    iget-object v0, p0, Lo/faj;->bu:Landroid/widget/TextView;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_sleep_deepsleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1305
    iget-object v0, p0, Lo/faj;->br:Landroid/widget/TextView;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_sleep_shallowsleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1306
    iget-object v0, p0, Lo/faj;->bw:Landroid/widget/TextView;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_rem_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1309
    :goto_1
    if-eqz p2, :cond_4

    .line 1311
    iget-object v0, p0, Lo/faj;->bw:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1312
    iget-object v0, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1313
    iget-object v0, p0, Lo/faj;->bo:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_2

    .line 1315
    :cond_3
    iget-object v0, p0, Lo/faj;->bm:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1317
    :goto_2
    iget-object v0, p0, Lo/faj;->bt:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1318
    sget-object v0, Lo/faj;->C:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deepSleepMins = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1319
    sget-object v0, Lo/faj;->C:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lightSleepMins = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1320
    sget-object v0, Lo/faj;->C:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "remSleepMins = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1321
    iget-object v0, p0, Lo/faj;->bs:Landroid/widget/TextView;

    invoke-direct {p0, v0, v5}, Lo/faj;->e(Landroid/widget/TextView;I)V

    .line 1322
    iget-object v0, p0, Lo/faj;->bq:Landroid/widget/TextView;

    invoke-direct {p0, v0, v6}, Lo/faj;->e(Landroid/widget/TextView;I)V

    .line 1323
    iget-object v0, p0, Lo/faj;->bz:Landroid/widget/TextView;

    invoke-direct {p0, v0, v7}, Lo/faj;->e(Landroid/widget/TextView;I)V

    .line 1325
    iget-object v0, p0, Lo/faj;->bh:Landroid/widget/TextView;

    invoke-direct {p0, v0, v5}, Lo/faj;->e(Landroid/widget/TextView;I)V

    .line 1326
    iget-object v0, p0, Lo/faj;->bp:Landroid/widget/TextView;

    invoke-direct {p0, v0, v6}, Lo/faj;->e(Landroid/widget/TextView;I)V

    .line 1327
    iget-object v0, p0, Lo/faj;->bt:Landroid/widget/TextView;

    invoke-direct {p0, v0, v7}, Lo/faj;->e(Landroid/widget/TextView;I)V

    .line 1329
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1330
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1331
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1332
    iget-object v0, p0, Lo/faj;->m:Lo/fao;

    invoke-virtual {v0, v4}, Lo/fao;->setTime(Ljava/util/ArrayList;)V

    goto :goto_4

    .line 1335
    :cond_4
    iget-object v0, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1336
    iget-object v0, p0, Lo/faj;->bo:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_3

    .line 1338
    :cond_5
    iget-object v0, p0, Lo/faj;->bm:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1340
    :goto_3
    iget-object v0, p0, Lo/faj;->bt:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1341
    iget-object v0, p0, Lo/faj;->bh:Landroid/widget/TextView;

    invoke-direct {p0, v0, v5}, Lo/faj;->e(Landroid/widget/TextView;I)V

    .line 1342
    iget-object v0, p0, Lo/faj;->bp:Landroid/widget/TextView;

    invoke-direct {p0, v0, v6}, Lo/faj;->e(Landroid/widget/TextView;I)V

    .line 1343
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1344
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1346
    :goto_4
    iget-object v0, p0, Lo/faj;->n:Lo/fao;

    invoke-virtual {v0, v4}, Lo/fao;->setTime(Ljava/util/ArrayList;)V

    .line 1348
    return-void
.end method

.method private e(Landroid/view/View;)V
    .locals 7

    .line 1034
    iget-object v0, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1035
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_pie_chart_daxidi:I

    invoke-static {p1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/faj;->i:Landroid/view/View;

    .line 1036
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_core_pie_chart_daxidi:I

    invoke-static {p1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/faj;->p:Landroid/view/View;

    goto :goto_0

    .line 1038
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_pie_chart:I

    invoke-static {p1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/faj;->i:Landroid/view/View;

    .line 1039
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_core_pie_chart:I

    invoke-static {p1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/faj;->p:Landroid/view/View;

    .line 1041
    :goto_0
    iget-object v0, p0, Lo/faj;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1042
    iget-object v0, p0, Lo/faj;->p:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1044
    iget-object v0, p0, Lo/faj;->i:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->day_detail_sleep_rate_recycle:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fao;

    iput-object v0, p0, Lo/faj;->n:Lo/fao;

    .line 1045
    iget-object v0, p0, Lo/faj;->i:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->deep_legend_text_view:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->bk:Landroid/widget/TextView;

    .line 1046
    iget-object v0, p0, Lo/faj;->i:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->deep_sleep_detail_value:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->bh:Landroid/widget/TextView;

    .line 1047
    iget-object v0, p0, Lo/faj;->i:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->light_legend_text_view:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->bn:Landroid/widget/TextView;

    .line 1048
    iget-object v0, p0, Lo/faj;->i:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->light_sleep_detail_value:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->bp:Landroid/widget/TextView;

    .line 1049
    iget-object v0, p0, Lo/faj;->i:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->rem_sleep_pie_legend_area:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->bo:Landroid/widget/LinearLayout;

    .line 1050
    iget-object v0, p0, Lo/faj;->i:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->pie_rem_layout:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->bm:Landroid/widget/LinearLayout;

    .line 1051
    iget-object v0, p0, Lo/faj;->i:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->rem_legend_text_view:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->bl:Landroid/widget/TextView;

    .line 1052
    iget-object v0, p0, Lo/faj;->i:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->rem_sleep_detail_value:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->bt:Landroid/widget/TextView;

    .line 1054
    iget-object v0, p0, Lo/faj;->p:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->core_day_detail_sleep_rate_recycle:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fao;

    iput-object v0, p0, Lo/faj;->m:Lo/fao;

    .line 1055
    iget-object v0, p0, Lo/faj;->p:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->core_deep_legend_text_view:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->bu:Landroid/widget/TextView;

    .line 1056
    iget-object v0, p0, Lo/faj;->p:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->core_deep_sleep_detail_value:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->bs:Landroid/widget/TextView;

    .line 1057
    iget-object v0, p0, Lo/faj;->p:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->core_light_legend_text_view:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->br:Landroid/widget/TextView;

    .line 1058
    iget-object v0, p0, Lo/faj;->p:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->core_light_sleep_detail_value:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->bq:Landroid/widget/TextView;

    .line 1059
    iget-object v0, p0, Lo/faj;->p:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->core_rem_legend_text_view:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->bw:Landroid/widget/TextView;

    .line 1060
    iget-object v0, p0, Lo/faj;->p:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->core_rem_sleep_detail_value:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->bz:Landroid/widget/TextView;

    .line 1063
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_suggest_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->c:Landroid/widget/LinearLayout;

    .line 1064
    sget v0, Lcom/huawei/ui/main/R$id;->sleep_core_sleep_data_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->b:Landroid/widget/LinearLayout;

    .line 1065
    sget v0, Lcom/huawei/ui/main/R$id;->sleep_common_sleep_total_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->d:Landroid/widget/LinearLayout;

    .line 1066
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_list_month_items:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->k:Landroid/widget/LinearLayout;

    .line 1067
    sget v0, Lcom/huawei/ui/main/R$id;->sleep_core_sleep_suggest_content:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->f:Landroid/widget/LinearLayout;

    .line 1070
    sget v0, Lcom/huawei/ui/main/R$id;->sleep_scoring:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->z:Landroid/widget/TextView;

    .line 1072
    sget v0, Lcom/huawei/ui/main/R$id;->common_sleep_sleep_hour_time:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->x:Landroid/widget/TextView;

    .line 1073
    sget v0, Lcom/huawei/ui/main/R$id;->common_sleep_sleep_hour_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->v:Landroid/widget/TextView;

    .line 1074
    sget v0, Lcom/huawei/ui/main/R$id;->common_sleep_sleep_minute_time:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->D:Landroid/widget/TextView;

    .line 1075
    sget v0, Lcom/huawei/ui/main/R$id;->common_sleep_total_sleep_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->w:Landroid/widget/TextView;

    .line 1077
    sget v0, Lcom/huawei/ui/main/R$id;->suggest_title_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->j:Landroid/widget/TextView;

    .line 1078
    sget v0, Lcom/huawei/ui/main/R$id;->suggest_content_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->B:Landroid/widget/TextView;

    .line 1079
    sget v0, Lcom/huawei/ui/main/R$id;->noon_sleep_suggest_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->G:Landroid/widget/TextView;

    .line 1081
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_noon_layout_list_divider:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/faj;->g:Landroid/view/View;

    .line 1082
    sget v0, Lcom/huawei/ui/main/R$id;->list_sleep_item_listdivider_image_up:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/faj;->h:Landroid/view/View;

    .line 1084
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_list_items:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->a:Landroid/widget/LinearLayout;

    .line 1086
    sget v0, Lcom/huawei/ui/main/R$id;->total_sleep_layout_item:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->K:Landroid/widget/LinearLayout;

    .line 1087
    sget v0, Lcom/huawei/ui/main/R$id;->deep_sleep_layout_item:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->N:Landroid/widget/LinearLayout;

    .line 1088
    sget v0, Lcom/huawei/ui/main/R$id;->light_sleep_layout_item:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->M:Landroid/widget/LinearLayout;

    .line 1089
    sget v0, Lcom/huawei/ui/main/R$id;->dream_sleep_layout_item:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->R:Landroid/widget/LinearLayout;

    .line 1090
    sget v0, Lcom/huawei/ui/main/R$id;->list_sleep_part_item:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->O:Landroid/widget/LinearLayout;

    .line 1091
    sget v0, Lcom/huawei/ui/main/R$id;->list_wake_times_item:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->P:Landroid/widget/LinearLayout;

    .line 1092
    sget v0, Lcom/huawei/ui/main/R$id;->list_breath_quality_item:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->S:Landroid/widget/LinearLayout;

    .line 1093
    sget v0, Lcom/huawei/ui/main/R$id;->list_wake_up_times_item:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->Q:Landroid/widget/LinearLayout;

    .line 1095
    sget v0, Lcom/huawei/ui/main/R$id;->list_fall_asleep_regularity_item:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->V:Landroid/widget/LinearLayout;

    .line 1096
    sget v0, Lcom/huawei/ui/main/R$id;->list_fall_asleep_time_item:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->T:Landroid/widget/LinearLayout;

    .line 1097
    sget v0, Lcom/huawei/ui/main/R$id;->list_wake_up_regularity_item:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->W:Landroid/widget/LinearLayout;

    .line 1098
    sget v0, Lcom/huawei/ui/main/R$id;->list_wake_up_time_item:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->U:Landroid/widget/LinearLayout;

    .line 1102
    sget v0, Lcom/huawei/ui/main/R$id;->total_sleep_level_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->ak:Landroid/widget/TextView;

    .line 1103
    sget v0, Lcom/huawei/ui/main/R$id;->deep_sleep_level_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aj:Landroid/widget/TextView;

    .line 1104
    sget v0, Lcom/huawei/ui/main/R$id;->light_sleep_level_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aq:Landroid/widget/TextView;

    .line 1105
    sget v0, Lcom/huawei/ui/main/R$id;->dream_sleep_level_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->ar:Landroid/widget/TextView;

    .line 1106
    sget v0, Lcom/huawei/ui/main/R$id;->deep_sleep_continuity_level_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->ao:Landroid/widget/TextView;

    .line 1107
    sget v0, Lcom/huawei/ui/main/R$id;->wakeup_time_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->ap:Landroid/widget/TextView;

    .line 1108
    sget v0, Lcom/huawei/ui/main/R$id;->breath_quality_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->an:Landroid/widget/TextView;

    .line 1109
    sget v0, Lcom/huawei/ui/main/R$id;->list_wake_up_times_item_level:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->av:Landroid/widget/TextView;

    .line 1111
    sget v0, Lcom/huawei/ui/main/R$id;->fall_score_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->at:Landroid/widget/TextView;

    .line 1112
    sget v0, Lcom/huawei/ui/main/R$id;->daily_fall_time_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->as:Landroid/widget/TextView;

    .line 1113
    sget v0, Lcom/huawei/ui/main/R$id;->wake_up_regular_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->au:Landroid/widget/TextView;

    .line 1114
    sget v0, Lcom/huawei/ui/main/R$id;->wake_up_time_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aw:Landroid/widget/TextView;

    .line 1119
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_total_sleep_level_arrow:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/faj;->ab:Landroid/widget/ImageView;

    .line 1120
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_deep_sleep_level_arrow:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/faj;->ac:Landroid/widget/ImageView;

    .line 1121
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_light_sleep_level_arrow:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/faj;->aa:Landroid/widget/ImageView;

    .line 1122
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_dream_sleep_level_arrow:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/faj;->af:Landroid/widget/ImageView;

    .line 1123
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_deep_sleep_continuity_level_arrow:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/faj;->ah:Landroid/widget/ImageView;

    .line 1124
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_wake_up_time_arrow:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/faj;->ae:Landroid/widget/ImageView;

    .line 1125
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_breath_arrow:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/faj;->ag:Landroid/widget/ImageView;

    .line 1127
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_fall_score_arrow:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/faj;->ad:Landroid/widget/ImageView;

    .line 1128
    sget v0, Lcom/huawei/ui/main/R$id;->fall_asleep_time_arrow:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/faj;->ai:Landroid/widget/ImageView;

    .line 1129
    sget v0, Lcom/huawei/ui/main/R$id;->wake_up_regularity_arrow:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/faj;->al:Landroid/widget/ImageView;

    .line 1130
    sget v0, Lcom/huawei/ui/main/R$id;->wake_up_time_arrow:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/faj;->am:Landroid/widget/ImageView;

    .line 1133
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_total_sleep_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->ax:Landroid/widget/TextView;

    .line 1134
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_deep_sleep_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->az:Landroid/widget/TextView;

    .line 1135
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_light_sleep_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aA:Landroid/widget/TextView;

    .line 1136
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_dream_sleep_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->ay:Landroid/widget/TextView;

    .line 1137
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_deep_sleep_continuity_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aB:Landroid/widget/TextView;

    .line 1138
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_wake_up_times_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aE:Landroid/widget/TextView;

    .line 1139
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_rdi_score_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aF:Landroid/widget/TextView;

    .line 1140
    sget v0, Lcom/huawei/ui/main/R$id;->list_wake_up_times_item_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aG:Landroid/widget/TextView;

    .line 1143
    sget v0, Lcom/huawei/ui/main/R$id;->list_fall_asleep_regularity_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aC:Landroid/widget/TextView;

    .line 1144
    sget v0, Lcom/huawei/ui/main/R$id;->list_fall_asleep_time_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aL:Landroid/widget/TextView;

    .line 1145
    sget v0, Lcom/huawei/ui/main/R$id;->list_wake_up_regularity_item_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aD:Landroid/widget/TextView;

    .line 1146
    sget v0, Lcom/huawei/ui/main/R$id;->list_wake_up_time_item_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aJ:Landroid/widget/TextView;

    .line 1149
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_total_sleep_beyond_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aI:Landroid/widget/TextView;

    .line 1150
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_deep_sleep_beyond_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aH:Landroid/widget/TextView;

    .line 1151
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_light_sleep_beyond_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aK:Landroid/widget/TextView;

    .line 1152
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_dream_sleep_beyond_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aN:Landroid/widget/TextView;

    .line 1153
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_deep_sleep_continuity_beyond_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aO:Landroid/widget/TextView;

    .line 1154
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_wake_up_times_beyond_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aM:Landroid/widget/TextView;

    .line 1155
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_rdi_score_beyond_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aQ:Landroid/widget/TextView;

    .line 1157
    sget v0, Lcom/huawei/ui/main/R$id;->list_fall_asleep_regularity_beyond_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aP:Landroid/widget/TextView;

    .line 1158
    sget v0, Lcom/huawei/ui/main/R$id;->list_fall_asleep_time_beyond_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aS:Landroid/widget/TextView;

    .line 1159
    sget v0, Lcom/huawei/ui/main/R$id;->list_wake_up_regularity_item_beyond_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aT:Landroid/widget/TextView;

    .line 1160
    sget v0, Lcom/huawei/ui/main/R$id;->list_wake_up_time_item_beyond_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->aV:Landroid/widget/TextView;

    .line 1162
    iget-object v0, p0, Lo/faj;->bx:Lo/fiy;

    const/16 v1, 0xb

    new-array v1, v1, [Landroid/widget/ImageView;

    iget-object v2, p0, Lo/faj;->ab:Landroid/widget/ImageView;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/faj;->ac:Landroid/widget/ImageView;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/faj;->aa:Landroid/widget/ImageView;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/faj;->af:Landroid/widget/ImageView;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/faj;->ah:Landroid/widget/ImageView;

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/faj;->ae:Landroid/widget/ImageView;

    const/4 v3, 0x5

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/faj;->ag:Landroid/widget/ImageView;

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/faj;->ad:Landroid/widget/ImageView;

    const/4 v3, 0x7

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/faj;->al:Landroid/widget/ImageView;

    const/16 v3, 0x8

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/faj;->ai:Landroid/widget/ImageView;

    const/16 v3, 0x9

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/faj;->am:Landroid/widget/ImageView;

    const/16 v3, 0xa

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lo/fiy;->c([Landroid/widget/ImageView;)V

    .line 1166
    iget-object v0, p0, Lo/faj;->L:Lo/exp;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/exp;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1168
    iget-object v0, p0, Lo/faj;->ab:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1169
    iget-object v0, p0, Lo/faj;->ac:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1170
    iget-object v0, p0, Lo/faj;->aa:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1171
    iget-object v0, p0, Lo/faj;->af:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1172
    iget-object v0, p0, Lo/faj;->ah:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1173
    iget-object v0, p0, Lo/faj;->ae:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1174
    iget-object v0, p0, Lo/faj;->ag:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1176
    iget-object v0, p0, Lo/faj;->ad:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1177
    iget-object v0, p0, Lo/faj;->al:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1178
    iget-object v0, p0, Lo/faj;->ai:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1179
    iget-object v0, p0, Lo/faj;->am:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1182
    iget-object v0, p0, Lo/faj;->K:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1183
    iget-object v0, p0, Lo/faj;->N:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1184
    iget-object v0, p0, Lo/faj;->M:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1185
    iget-object v0, p0, Lo/faj;->R:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1186
    iget-object v0, p0, Lo/faj;->O:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1187
    iget-object v0, p0, Lo/faj;->P:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1188
    iget-object v0, p0, Lo/faj;->S:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1190
    iget-object v0, p0, Lo/faj;->V:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1191
    iget-object v0, p0, Lo/faj;->W:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1192
    iget-object v0, p0, Lo/faj;->T:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1193
    iget-object v0, p0, Lo/faj;->U:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    goto/16 :goto_1

    .line 1197
    :cond_1
    iget-object v0, p0, Lo/faj;->ab:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1198
    iget-object v0, p0, Lo/faj;->ac:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1199
    iget-object v0, p0, Lo/faj;->aa:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1200
    iget-object v0, p0, Lo/faj;->af:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1201
    iget-object v0, p0, Lo/faj;->ah:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1202
    iget-object v0, p0, Lo/faj;->ae:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1203
    iget-object v0, p0, Lo/faj;->ag:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1205
    iget-object v0, p0, Lo/faj;->ad:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1206
    iget-object v0, p0, Lo/faj;->al:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1207
    iget-object v0, p0, Lo/faj;->ai:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1208
    iget-object v0, p0, Lo/faj;->am:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1211
    iget-object v0, p0, Lo/faj;->K:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1212
    iget-object v0, p0, Lo/faj;->N:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1213
    iget-object v0, p0, Lo/faj;->M:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1214
    iget-object v0, p0, Lo/faj;->R:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1215
    iget-object v0, p0, Lo/faj;->O:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1216
    iget-object v0, p0, Lo/faj;->P:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1217
    iget-object v0, p0, Lo/faj;->S:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1218
    iget-object v0, p0, Lo/faj;->V:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1219
    iget-object v0, p0, Lo/faj;->W:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1220
    iget-object v0, p0, Lo/faj;->T:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1221
    iget-object v0, p0, Lo/faj;->U:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 1224
    :goto_1
    sget v0, Lcom/huawei/ui/main/R$id;->sleep_recommend_data_recycle:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lo/faj;->l:Landroid/support/v7/widget/RecyclerView;

    .line 1225
    sget v0, Lcom/huawei/ui/main/R$id;->sleep_recommend_service_linear:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->o:Landroid/widget/LinearLayout;

    .line 1227
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1228
    new-instance v0, Lo/ewc;

    iget-object v1, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-direct {v0, v1, v5}, Lo/ewc;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lo/faj;->s:Lo/ewc;

    .line 1229
    iget-object v0, p0, Lo/faj;->l:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v2, p0, Lo/faj;->e:Landroid/content/Context;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 1230
    iget-object v0, p0, Lo/faj;->l:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lo/faj;->s:Lo/ewc;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 1232
    iget-object v0, p0, Lo/faj;->e:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "sleepServiceConfig_ver"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1233
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1234
    :cond_2
    iget-object v0, p0, Lo/faj;->o:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_2

    .line 1236
    :cond_3
    iget-object v0, p0, Lo/faj;->o:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1238
    :goto_2
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_noon_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->u:Landroid/widget/LinearLayout;

    .line 1239
    sget v0, Lcom/huawei/ui/main/R$id;->list_day_sleep_item:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->t:Landroid/widget/LinearLayout;

    .line 1240
    sget v0, Lcom/huawei/ui/main/R$id;->core_sleep_noon_v:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/faj;->r:Landroid/view/View;

    .line 1241
    sget v0, Lcom/huawei/ui/main/R$id;->list_total_sleep_item:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/faj;->y:Landroid/widget/LinearLayout;

    .line 1243
    sget v0, Lcom/huawei/ui/main/R$id;->sleep_scoring:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->E:Landroid/widget/TextView;

    .line 1244
    sget v0, Lcom/huawei/ui/main/R$id;->sleep_core_sleep_data_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->H:Landroid/widget/TextView;

    .line 1245
    sget v0, Lcom/huawei/ui/main/R$id;->sleep_scoring_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/faj;->F:Landroid/widget/TextView;

    .line 1247
    return-void
.end method

.method private e(Landroid/widget/TextView;I)V
    .locals 9

    .line 1357
    div-int/lit8 v4, p2, 0x3c

    .line 1358
    rem-int/lit8 v5, p2, 0x3c

    .line 1360
    if-nez v4, :cond_0

    .line 1361
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 1362
    iget-object v0, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_target_sport_time_unit:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 1363
    invoke-virtual {p1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1364
    goto :goto_0

    .line 1365
    :cond_0
    int-to-double v0, v4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 1366
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 1367
    iget-object v0, p0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_h_min_unit:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    const/4 v3, 0x1

    aput-object v7, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 1368
    invoke-virtual {p1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1371
    :goto_0
    return-void
.end method

.method static synthetic f(Lo/faj;)Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;
    .locals 1

    .line 65
    iget-object v0, p0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    return-object v0
.end method

.method static synthetic g(Lo/faj;)I
    .locals 1

    .line 65
    iget v0, p0, Lo/faj;->bd:I

    return v0
.end method

.method static synthetic h(Lo/faj;)I
    .locals 1

    .line 65
    iget v0, p0, Lo/faj;->bf:I

    return v0
.end method

.method static synthetic i(Lo/faj;)I
    .locals 1

    .line 65
    iget v0, p0, Lo/faj;->be:I

    return v0
.end method

.method static synthetic k(Lo/faj;)I
    .locals 1

    .line 65
    iget v0, p0, Lo/faj;->bb:I

    return v0
.end method

.method static synthetic l(Lo/faj;)I
    .locals 1

    .line 65
    iget v0, p0, Lo/faj;->bg:I

    return v0
.end method

.method static synthetic m(Lo/faj;)I
    .locals 1

    .line 65
    iget v0, p0, Lo/faj;->bi:I

    return v0
.end method

.method static synthetic o(Lo/faj;)I
    .locals 1

    .line 65
    iget v0, p0, Lo/faj;->bj:I

    return v0
.end method

.method private setCoreSleepData(I)V
    .locals 74

    .line 456
    sget-object v0, Lo/faj;->I:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter setCoreSleepData."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    const/4 v8, 0x0

    .line 458
    const/4 v9, 0x0

    .line 459
    const/4 v10, 0x0

    .line 460
    const/4 v11, 0x0

    .line 461
    const/4 v12, 0x0

    .line 462
    const-string v13, ""

    .line 463
    const-string v14, ""

    .line 464
    const-string v15, ""

    .line 465
    const-string v16, ""

    .line 466
    const-string v17, ""

    .line 467
    const-string v18, ""

    .line 468
    const-string v19, ""

    .line 469
    const/4 v0, 0x1

    move/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 470
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getTotalSleepTime()I

    move-result v8

    .line 471
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDeepSleepPart()I

    move-result v9

    .line 472
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getBreathQualityData()I

    move-result v10

    .line 473
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getScore()I

    move-result v11

    .line 474
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getWakeupTimes()I

    move-result v12

    .line 476
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_night_sleep:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 477
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_deep_sleep_percent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 478
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_light_sleep_percent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 479
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_rem_sleep_percent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v16

    .line 480
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_deep_sleep_continuity:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v17

    .line 481
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_sleep_latency_time:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v18

    .line 482
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_rdi_score:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v19

    goto/16 :goto_0

    .line 484
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyTotalSleepTime()I

    move-result v8

    .line 485
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailySleepPart()I

    move-result v9

    .line 486
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyBreathQuality()I

    move-result v10

    .line 487
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyScore()I

    move-result v11

    .line 488
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyWakeupTimes()I

    move-result v12

    .line 489
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_avg_night_sleep:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 490
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_avg_deep_sleep_percent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 491
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_avg_light_sleep_percent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 492
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_avg_rem_sleep_percent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v16

    .line 493
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_avg_deep_sleep_continuity:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v17

    .line 494
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_sleep_avg_latency_time:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v18

    .line 495
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_avg_rdi_score:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v19

    .line 497
    :goto_0
    div-int/lit8 v0, v8, 0x3c

    invoke-static {v0}, Lo/fiu;->c(I)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->ba:I

    .line 498
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDeepSleepRatenum()I

    move-result v0

    invoke-static {v0}, Lo/fiu;->a(I)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->aW:I

    .line 499
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getLightSleepRatenum()I

    move-result v0

    invoke-static {v0}, Lo/fiu;->d(I)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->aY:I

    .line 500
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getSlumSleepRatenum()I

    move-result v0

    invoke-static {v0}, Lo/fiu;->b(I)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->aZ:I

    .line 502
    invoke-static {v9}, Lo/fiu;->e(I)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->be:I

    .line 503
    invoke-static {v10}, Lo/fiu;->h(I)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->bb:I

    .line 505
    div-int/lit8 v0, v8, 0x3c

    if-ltz v0, :cond_1

    div-int/lit8 v0, v8, 0x3c

    const/4 v1, 0x6

    if-ge v0, v1, :cond_1

    .line 506
    const/16 v0, 0x48

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->aR:I

    goto :goto_1

    .line 507
    :cond_1
    div-int/lit8 v0, v8, 0x3c

    const/16 v1, 0xa

    if-lt v0, v1, :cond_2

    .line 508
    const/16 v0, 0x47

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->aR:I

    goto :goto_1

    .line 510
    :cond_2
    const/16 v0, 0x49

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->aR:I

    .line 513
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->core_sleep_normal_tip_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v20

    .line 514
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->weight_tips_color_5:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v21

    .line 515
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->weight_tips_color_1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v22

    .line 517
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getSlumSleepRatenum()I

    move-result v23

    .line 518
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDeepSleepRatenum()I

    move-result v24

    .line 519
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getLightSleepRatenum()I

    move-result v25

    .line 520
    move/from16 v26, v8

    .line 521
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_sleep_referece_title_string:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v27

    .line 522
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->z:Landroid/widget/TextView;

    int-to-double v1, v11

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 523
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->F:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_sleep_referece_title_score_string_unit:I

    invoke-virtual {v1, v2, v11}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 524
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->F:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 525
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->j:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getSuggestTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 526
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->B:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getSuggestContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 528
    if-ltz v24, :cond_3

    move/from16 v0, v24

    const/16 v1, 0x14

    if-ge v0, v1, :cond_3

    .line 529
    const/16 v0, 0x48

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->aU:I

    goto :goto_2

    .line 530
    :cond_3
    move/from16 v0, v24

    const/16 v1, 0x3c

    if-le v0, v1, :cond_4

    .line 531
    const/16 v0, 0x47

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->aU:I

    goto :goto_2

    .line 533
    :cond_4
    const/16 v0, 0x49

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->aU:I

    .line 536
    :goto_2
    if-ltz v25, :cond_5

    move/from16 v0, v25

    const/16 v1, 0x37

    if-ge v0, v1, :cond_5

    .line 537
    const/16 v0, 0x49

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->bc:I

    goto :goto_3

    .line 539
    :cond_5
    const/16 v0, 0x47

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->bc:I

    .line 542
    :goto_3
    if-lez v23, :cond_6

    move/from16 v0, v23

    const/16 v1, 0xa

    if-ge v0, v1, :cond_6

    .line 543
    const/16 v0, 0x48

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->aX:I

    goto :goto_4

    .line 544
    :cond_6
    move/from16 v0, v23

    const/16 v1, 0x1e

    if-le v0, v1, :cond_7

    .line 545
    const/16 v0, 0x47

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->aX:I

    goto :goto_4

    .line 547
    :cond_7
    const/16 v0, 0x49

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->aX:I

    .line 550
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->L:Lo/exp;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/exp;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 551
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->j:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 552
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->B:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_5

    .line 554
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->j:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 555
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->B:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 558
    :goto_5
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->ba:I

    const/16 v1, 0x47

    if-ne v0, v1, :cond_9

    .line 559
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ak:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_high:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 560
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ak:Landroid/widget/TextView;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 562
    :cond_9
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->ba:I

    const/16 v1, 0x48

    if-ne v0, v1, :cond_a

    .line 563
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ak:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_low:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 564
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ak:Landroid/widget/TextView;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 566
    :cond_a
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->ba:I

    const/16 v1, 0x49

    if-ne v0, v1, :cond_b

    .line 567
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ak:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 568
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ak:Landroid/widget/TextView;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 571
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/high16 v1, 0x4018000000000000L    # 6.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    .line 573
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->o(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 574
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, v27

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v28, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    .line 575
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_messagecenter_time_hour_value:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v29

    goto :goto_6

    .line 577
    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v28, v1, v2

    move-object/from16 v2, v27

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    .line 578
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_messagecenter_time_hour_value:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v29

    .line 580
    :goto_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aI:Landroid/widget/TextView;

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 581
    sget-object v0, Lo/faj;->C:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " nightSleepTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v26

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 582
    div-int/lit8 v30, v26, 0x3c

    .line 583
    rem-int/lit8 v31, v26, 0x3c

    .line 585
    if-nez v30, :cond_d

    .line 586
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    .line 587
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_target_sport_time_unit:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    move/from16 v4, v31

    int-to-double v4, v4

    .line 588
    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 587
    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v32

    goto :goto_7

    .line 590
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    .line 591
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_h_min_unit:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    move/from16 v4, v30

    int-to-double v4, v4

    .line 592
    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    move/from16 v4, v31

    int-to-double v4, v4

    .line 593
    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    .line 591
    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v32

    .line 595
    :goto_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ax:Landroid/widget/TextView;

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 597
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->K:Landroid/widget/LinearLayout;

    new-instance v1, Lo/faj$3;

    move-object/from16 v2, p0

    move/from16 v3, v26

    invoke-direct {v1, v2, v3}, Lo/faj$3;-><init>(Lo/faj;I)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 607
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->aW:I

    const/16 v1, 0x47

    if-ne v0, v1, :cond_e

    .line 608
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aj:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_high:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 609
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aj:Landroid/widget/TextView;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 611
    :cond_e
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->aW:I

    const/16 v1, 0x48

    if-ne v0, v1, :cond_f

    .line 612
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aj:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_low:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 613
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aj:Landroid/widget/TextView;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 615
    :cond_f
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->aW:I

    const/16 v1, 0x49

    if-ne v0, v1, :cond_10

    .line 616
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aj:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 617
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aj:Landroid/widget/TextView;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 621
    :cond_10
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v33

    .line 622
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/high16 v1, 0x4034000000000000L    # 20.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v34

    .line 623
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v34, v0, v1

    move-object/from16 v1, v27

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v35

    .line 624
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aH:Landroid/widget/TextView;

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 627
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v24

    int-to-double v1, v1

    .line 628
    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v36

    .line 629
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->az:Landroid/widget/TextView;

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 631
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->N:Landroid/widget/LinearLayout;

    new-instance v1, Lo/faj$9;

    move-object/from16 v2, p0

    move/from16 v3, v24

    invoke-direct {v1, v2, v3}, Lo/faj$9;-><init>(Lo/faj;I)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 640
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->aY:I

    const/16 v1, 0x47

    if-ne v0, v1, :cond_11

    .line 641
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aq:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_high:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 642
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aq:Landroid/widget/TextView;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 644
    :cond_11
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->aY:I

    const/16 v1, 0x48

    if-ne v0, v1, :cond_12

    .line 645
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aq:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_low:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 646
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aq:Landroid/widget/TextView;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 648
    :cond_12
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->aY:I

    const/16 v1, 0x49

    if-ne v0, v1, :cond_13

    .line 649
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aq:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 650
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aq:Landroid/widget/TextView;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 653
    :cond_13
    const-wide v0, 0x404b800000000000L    # 55.0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v37

    .line 654
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v38

    .line 655
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v38, v0, v1

    move-object/from16 v1, v27

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v39

    .line 656
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aK:Landroid/widget/TextView;

    move-object/from16 v1, v39

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 659
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v25

    int-to-double v1, v1

    .line 660
    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v40

    .line 661
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aA:Landroid/widget/TextView;

    move-object/from16 v1, v40

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 663
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->M:Landroid/widget/LinearLayout;

    new-instance v1, Lo/faj$6;

    move-object/from16 v2, p0

    move/from16 v3, v25

    invoke-direct {v1, v2, v3}, Lo/faj$6;-><init>(Lo/faj;I)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 672
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->aZ:I

    const/16 v1, 0x47

    if-ne v0, v1, :cond_14

    .line 673
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ar:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_high:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 674
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ar:Landroid/widget/TextView;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 676
    :cond_14
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->aZ:I

    const/16 v1, 0x48

    if-ne v0, v1, :cond_15

    .line 677
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ar:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_low:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 678
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ar:Landroid/widget/TextView;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 680
    :cond_15
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->aZ:I

    const/16 v1, 0x49

    if-ne v0, v1, :cond_16

    .line 681
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ar:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 682
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ar:Landroid/widget/TextView;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 685
    :cond_16
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v41

    .line 686
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v41

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v42

    .line 687
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v42, v0, v1

    move-object/from16 v1, v27

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v43

    .line 688
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aN:Landroid/widget/TextView;

    move-object/from16 v1, v43

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 691
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v23

    int-to-double v1, v1

    .line 692
    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v44

    .line 693
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ay:Landroid/widget/TextView;

    move-object/from16 v1, v44

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 695
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->R:Landroid/widget/LinearLayout;

    new-instance v1, Lo/faj$8;

    move-object/from16 v2, p0

    move/from16 v3, v23

    invoke-direct {v1, v2, v3}, Lo/faj$8;-><init>(Lo/faj;I)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 703
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->be:I

    const/16 v1, 0x51

    if-ne v0, v1, :cond_17

    .line 704
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ao:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_high:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 705
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ao:Landroid/widget/TextView;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 707
    :cond_17
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->be:I

    const/16 v1, 0x52

    if-ne v0, v1, :cond_18

    .line 708
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ao:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_low:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 709
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ao:Landroid/widget/TextView;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 711
    :cond_18
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->be:I

    const/16 v1, 0x53

    if-ne v0, v1, :cond_19

    .line 712
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ao:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 713
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ao:Landroid/widget/TextView;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 717
    :cond_19
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, 0x4051800000000000L    # 70.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-wide/high16 v1, 0x4059000000000000L    # 100.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v45

    .line 718
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_sleep_referece_title_score_string_unit:I

    const/16 v2, 0x64

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v46

    .line 719
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v45, v0, v1

    move-object/from16 v1, v27

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v47

    .line 720
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v47

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v46

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v48

    .line 721
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aO:Landroid/widget/TextView;

    move-object/from16 v1, v48

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 724
    move/from16 v49, v9

    .line 725
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_sleep_referece_title_score_string_unit:I

    invoke-virtual {v0, v1, v9}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v50

    .line 726
    const/16 v0, 0x14

    if-ge v9, v0, :cond_1a

    .line 727
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aB:Landroid/widget/TextView;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_8

    .line 729
    :cond_1a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    int-to-double v1, v9

    .line 730
    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v50

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v51

    .line 731
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aB:Landroid/widget/TextView;

    move-object/from16 v1, v51

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 733
    :goto_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->O:Landroid/widget/LinearLayout;

    new-instance v1, Lo/faj$10;

    move-object/from16 v2, p0

    move/from16 v3, v49

    invoke-direct {v1, v2, v3}, Lo/faj$10;-><init>(Lo/faj;I)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 742
    const/4 v0, 0x2

    if-le v12, v0, :cond_1b

    .line 743
    const/16 v0, 0x47

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->bf:I

    .line 744
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ap:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_high:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 745
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ap:Landroid/widget/TextView;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_9

    .line 747
    :cond_1b
    const/16 v0, 0x49

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->bf:I

    .line 748
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ap:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 749
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->ap:Landroid/widget/TextView;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 752
    :goto_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_details_sleep_latency_times:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    int-to-double v3, v12

    .line 753
    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 752
    const/4 v3, 0x2

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v51

    .line 754
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_details_sleep_latency_times:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 755
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 754
    const/4 v4, 0x2

    invoke-virtual {v1, v2, v4, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v52

    .line 756
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v52, v0, v1

    move-object/from16 v1, v27

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v53

    .line 757
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aM:Landroid/widget/TextView;

    move-object/from16 v1, v53

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 760
    move/from16 v54, v12

    .line 761
    sget-object v0, Lo/faj;->C:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " wakeTimes:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v54

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 762
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v51

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v55

    .line 763
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aE:Landroid/widget/TextView;

    move-object/from16 v1, v55

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 765
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->P:Landroid/widget/LinearLayout;

    new-instance v1, Lo/faj$7;

    move-object/from16 v2, p0

    move/from16 v3, v54

    invoke-direct {v1, v2, v3}, Lo/faj$7;-><init>(Lo/faj;I)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 773
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->bb:I

    const/16 v1, 0x47

    if-ne v0, v1, :cond_1c

    .line 774
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->an:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_high:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 775
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->an:Landroid/widget/TextView;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 777
    :cond_1c
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->bb:I

    const/16 v1, 0x48

    if-ne v0, v1, :cond_1d

    .line 778
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->an:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_low:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 779
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->an:Landroid/widget/TextView;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 781
    :cond_1d
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->bb:I

    const/16 v1, 0x49

    if-ne v0, v1, :cond_1e

    .line 782
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->an:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 783
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->an:Landroid/widget/TextView;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 786
    :cond_1e
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aQ:Landroid/widget/TextView;

    move-object/from16 v1, v48

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 788
    move/from16 v56, v10

    .line 789
    move/from16 v0, v56

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v57

    .line 790
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Ljava/text/NumberFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v58

    .line 792
    const/16 v59, 0x0

    .line 793
    const/4 v0, 0x0

    move-object/from16 v1, v57

    if-eq v0, v1, :cond_1f

    .line 794
    move-object/from16 v0, v58

    move-object/from16 v1, v57

    :try_start_0
    invoke-virtual {v0, v1}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v59

    .line 796
    :cond_1f
    const-string v60, ""

    .line 797
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_sleep_referece_title_score_string_unit:I

    move/from16 v2, v59

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v46

    .line 798
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->o(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_20

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->n(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_21

    .line 799
    :cond_20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v57

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v46

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v60

    goto :goto_a

    .line 801
    :cond_21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v57

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v46

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v60

    .line 803
    :goto_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aF:Landroid/widget/TextView;

    move-object/from16 v1, v60

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 806
    goto :goto_b

    .line 804
    :catch_0
    move-exception v59

    .line 805
    sget-object v0, Lo/faj;->C:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " breath ParseException"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v59 .. v59}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 808
    :goto_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->S:Landroid/widget/LinearLayout;

    new-instance v1, Lo/faj$14;

    move-object/from16 v2, p0

    move/from16 v3, v56

    invoke-direct {v1, v2, v3}, Lo/faj$14;-><init>(Lo/faj;I)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 816
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyFallScore()I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-static {v0}, Lo/fiy;->e(I)I

    move-result v59

    .line 817
    invoke-static/range {v59 .. v59}, Lo/fiu;->i(I)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->bd:I

    .line 818
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyFallTime()I

    move-result v0

    rem-int/lit16 v0, v0, 0x5a0

    invoke-static {v0}, Lo/fiu;->f(I)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->bj:I

    .line 819
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyWakeUpScore()I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-static {v0}, Lo/fiy;->e(I)I

    move-result v0

    invoke-static {v0}, Lo/fiu;->k(I)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->bg:I

    .line 820
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyWakeUpTime()I

    move-result v0

    rem-int/lit16 v0, v0, 0x5a0

    invoke-static {v0}, Lo/fiu;->g(I)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/faj;->bi:I

    .line 821
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->bj:I

    const/16 v1, 0x51

    if-ne v0, v1, :cond_22

    .line 822
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->as:Landroid/widget/TextView;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 823
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->as:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_late:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 825
    :cond_22
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->bj:I

    const/16 v1, 0x52

    if-ne v0, v1, :cond_23

    .line 826
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->as:Landroid/widget/TextView;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 827
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->as:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_early:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 830
    :cond_23
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->bj:I

    const/16 v1, 0x53

    if-ne v0, v1, :cond_24

    .line 831
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->as:Landroid/widget/TextView;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 832
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->as:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 835
    :cond_24
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->bi:I

    const/16 v1, 0x51

    if-ne v0, v1, :cond_25

    .line 836
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aw:Landroid/widget/TextView;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 837
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aw:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_late:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 839
    :cond_25
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->bi:I

    const/16 v1, 0x52

    if-ne v0, v1, :cond_26

    .line 840
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aw:Landroid/widget/TextView;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 841
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aw:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_early:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 844
    :cond_26
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->bi:I

    const/16 v1, 0x53

    if-ne v0, v1, :cond_27

    .line 845
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aw:Landroid/widget/TextView;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 846
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aw:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 849
    :cond_27
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->bd:I

    const/16 v1, 0x51

    if-ne v0, v1, :cond_28

    .line 850
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->at:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_high:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 851
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->at:Landroid/widget/TextView;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 853
    :cond_28
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->bd:I

    const/16 v1, 0x52

    if-ne v0, v1, :cond_29

    .line 854
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->at:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_low:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 855
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->at:Landroid/widget/TextView;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 857
    :cond_29
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->bd:I

    const/16 v1, 0x53

    if-ne v0, v1, :cond_2a

    .line 858
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->at:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 859
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->at:Landroid/widget/TextView;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 863
    :cond_2a
    const-string v60, ""

    .line 864
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_sleep_referece_title_score_string_unit:I

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyFallScore()I

    move-result v2

    int-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-static {v2}, Lo/fiy;->e(I)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v46

    .line 865
    move/from16 v0, v59

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v61

    .line 866
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->o(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2b

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->n(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 867
    :cond_2b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_start_sleep_regularity:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v61

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v46

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v60

    goto :goto_c

    .line 869
    :cond_2c
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_start_sleep_regularity:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v61

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v46

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v60

    .line 871
    :goto_c
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aC:Landroid/widget/TextView;

    move-object/from16 v1, v60

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 873
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aP:Landroid/widget/TextView;

    move-object/from16 v1, v48

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 875
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->V:Landroid/widget/LinearLayout;

    new-instance v1, Lo/faj$11;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lo/faj$11;-><init>(Lo/faj;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 887
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyFallTime()I

    move-result v0

    rem-int/lit16 v0, v0, 0x5a0

    div-int/lit8 v62, v0, 0x3c

    .line 888
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "%02d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static/range {v62 .. v62}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

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

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyFallTime()I

    move-result v3

    rem-int/lit16 v3, v3, 0x5a0

    rem-int/lit8 v3, v3, 0x3c

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v63

    .line 889
    const-string v64, ""

    .line 890
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2d

    .line 891
    const-string v64, "< 00:00"

    goto :goto_d

    .line 893
    :cond_2d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v2, "%1$s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "<"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Lo/cxh;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v64

    .line 895
    :goto_d
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v64, v0, v1

    move-object/from16 v1, v27

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v65

    .line 896
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aS:Landroid/widget/TextView;

    move-object/from16 v1, v65

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 897
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_avg_start_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    move-object/from16 v2, v63

    invoke-direct {v1, v2}, Lo/faj;->c(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lo/cxh;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v66

    .line 898
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aL:Landroid/widget/TextView;

    move-object/from16 v1, v66

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 901
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v2, "%1$s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, ">"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "6:0"

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lo/faj;->c(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lo/cxh;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v67

    .line 902
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v67, v0, v1

    move-object/from16 v1, v27

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v68

    .line 903
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aV:Landroid/widget/TextView;

    move-object/from16 v1, v68

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 905
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->T:Landroid/widget/LinearLayout;

    new-instance v1, Lo/faj$5;

    move-object/from16 v2, p0

    move-object/from16 v3, v63

    invoke-direct {v1, v2, v3}, Lo/faj$5;-><init>(Lo/faj;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 915
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->bg:I

    const/16 v1, 0x51

    if-ne v0, v1, :cond_2e

    .line 916
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->au:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_high:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 917
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->au:Landroid/widget/TextView;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 920
    :cond_2e
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->bg:I

    const/16 v1, 0x52

    if-ne v0, v1, :cond_2f

    .line 921
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->au:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_low:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 922
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->au:Landroid/widget/TextView;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 925
    :cond_2f
    move-object/from16 v0, p0

    iget v0, v0, Lo/faj;->bg:I

    const/16 v1, 0x53

    if-ne v0, v1, :cond_30

    .line 926
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->au:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_grade_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 927
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->au:Landroid/widget/TextView;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 929
    :cond_30
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyWakeUpScore()I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-static {v0}, Lo/fiy;->e(I)I

    move-result v69

    .line 930
    const-string v70, ""

    .line 931
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_sleep_referece_title_score_string_unit:I

    move/from16 v2, v69

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v46

    .line 932
    move/from16 v0, v69

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v71

    .line 933
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->o(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_31

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->n(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_32

    .line 934
    :cond_31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_end_sleep_regularity:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v71

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v46

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v70, v0

    goto :goto_e

    .line 936
    :cond_32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/faj;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_end_sleep_regularity:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v71

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v46

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v70, v0

    .line 938
    :goto_e
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aD:Landroid/widget/TextView;

    move-object/from16 v1, v70

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 939
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aT:Landroid/widget/TextView;

    move-object/from16 v1, v48

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 941
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyWakeUpTime()I

    move-result v0

    div-int/lit8 v72, v0, 0x3c

    .line 942
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "%02d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static/range {v72 .. v72}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

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

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    .line 943
    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyWakeUpTime()I

    move-result v3

    rem-int/lit8 v3, v3, 0x3c

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v73

    .line 945
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->aJ:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/faj;->e:Landroid/content/Context;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_avg_end_sleep:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    move-object/from16 v3, v73

    invoke-direct {v2, v3}, Lo/faj;->c(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Lo/cxh;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 947
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->W:Landroid/widget/LinearLayout;

    new-instance v1, Lo/faj$2;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lo/faj$2;-><init>(Lo/faj;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 959
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/faj;->U:Landroid/widget/LinearLayout;

    new-instance v1, Lo/faj$1;

    move-object/from16 v2, p0

    move-object/from16 v3, v73

    invoke-direct {v1, v2, v3}, Lo/faj$1;-><init>(Lo/faj;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 970
    return-void
.end method

.method private setSleepDataToCommonSleep(I)V
    .locals 8

    .line 1384
    div-int/lit8 v4, p1, 0x3c

    .line 1385
    rem-int/lit8 v5, p1, 0x3c

    .line 1386
    if-nez v4, :cond_0

    .line 1387
    iget-object v0, p0, Lo/faj;->x:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1388
    iget-object v0, p0, Lo/faj;->v:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1389
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 1390
    iget-object v0, p0, Lo/faj;->D:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1391
    goto :goto_0

    .line 1392
    :cond_0
    iget-object v0, p0, Lo/faj;->x:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1393
    iget-object v0, p0, Lo/faj;->v:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1394
    int-to-double v0, v4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 1395
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 1396
    iget-object v0, p0, Lo/faj;->x:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1397
    iget-object v0, p0, Lo/faj;->D:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1400
    :goto_0
    return-void
.end method


# virtual methods
.method public c()V
    .locals 4

    .line 245
    sget-object v0, Lo/faj;->I:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepData clearData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    return-void
.end method

.method public setHasSleepData(Z)V
    .locals 1

    .line 237
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lo/faj;->J:Z

    .line 238
    return-void
.end method

.method public setSleepData(Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;IZ)V
    .locals 4

    .line 217
    sget-object v0, Lo/faj;->I:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter setSleepData() isCoreSleep:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    sget-object v0, Lo/faj;->C:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sleepData:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    iput-object p1, p0, Lo/faj;->by:Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    .line 220
    if-eqz p3, :cond_0

    .line 221
    invoke-direct {p0, p2}, Lo/faj;->setCoreSleepData(I)V

    .line 222
    invoke-direct {p0, p1, p2}, Lo/faj;->c(Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;I)V

    .line 223
    invoke-direct {p0, p2, p3}, Lo/faj;->e(IZ)V

    goto :goto_0

    .line 225
    :cond_0
    sget-object v0, Lo/faj;->C:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isHasSleepData"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/faj;->J:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    iget-boolean v0, p0, Lo/faj;->J:Z

    if-eqz v0, :cond_1

    .line 227
    invoke-direct {p0, p1, p2}, Lo/faj;->b(Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;I)V

    .line 228
    invoke-direct {p0, p2, p3}, Lo/faj;->e(IZ)V

    goto :goto_0

    .line 230
    :cond_1
    invoke-direct {p0}, Lo/faj;->a()V

    .line 234
    :goto_0
    return-void
.end method

.class public Lo/etm;
.super Lo/etj;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/etm$c;,
        Lo/etm$a;
    }
.end annotation


# instance fields
.field protected a:Lo/eto;

.field protected d:Landroid/os/Handler;

.field protected e:I

.field protected f:Ljava/lang/String;

.field protected g:J

.field protected h:Ljava/lang/String;

.field protected k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/github/mikephil/charting/data/BarEntry;>;"
        }
    .end annotation
.end field

.field protected l:F

.field protected m:Ljava/lang/String;

.field protected n:Ljava/lang/String;

.field protected o:Ljava/lang/String;

.field protected p:Ljava/lang/String;

.field private q:Landroid/content/BroadcastReceiver;

.field private r:Ljava/util/concurrent/ExecutorService;

.field protected t:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 91
    invoke-direct {p0, p1}, Lo/etj;-><init>(Landroid/content/Context;)V

    .line 65
    const/16 v0, 0x102

    iput v0, p0, Lo/etm;->e:I

    .line 384
    new-instance v0, Lo/etm$3;

    invoke-direct {v0, p0}, Lo/etm$3;-><init>(Lo/etm;)V

    iput-object v0, p0, Lo/etm;->q:Landroid/content/BroadcastReceiver;

    .line 92
    new-instance v0, Lo/etm$a;

    invoke-direct {v0, p0}, Lo/etm$a;-><init>(Lo/etm;)V

    iput-object v0, p0, Lo/etm;->d:Landroid/os/Handler;

    .line 93
    return-void
.end method

.method static synthetic c(Lo/etm;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lo/etm;->n()V

    return-void
.end method

.method private g()V
    .locals 4

    .line 185
    const-string v0, "PLGACHIEVE_TrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getReportData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    iget-object v0, p0, Lo/etm;->r:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 187
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/etm;->r:Ljava/util/concurrent/ExecutorService;

    .line 189
    :cond_0
    iget-object v0, p0, Lo/etm;->r:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_1

    .line 190
    iget-object v0, p0, Lo/etm;->r:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/etm$1;

    invoke-direct {v1, p0}, Lo/etm$1;-><init>(Lo/etm;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 197
    :cond_1
    return-void
.end method

.method private i()V
    .locals 5

    .line 114
    iget-object v0, p0, Lo/etm;->q:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 116
    :try_start_0
    iget-object v0, p0, Lo/etm;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v4

    .line 117
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 118
    iget-object v0, p0, Lo/etm;->q:Landroid/content/BroadcastReceiver;

    invoke-virtual {v4, v0}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 119
    const-string v0, "PLGACHIEVE_TrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiBroadcasetReceiver unregister"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 121
    :cond_0
    const-string v0, "PLGACHIEVE_TrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiBroadcasetReceiver unregister fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 125
    :goto_0
    goto :goto_1

    .line 123
    :catch_0
    move-exception v4

    .line 124
    const-string v0, "PLGACHIEVE_TrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IllegalArgumentException  mHiBroadcasetReceiver unregister"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    :cond_1
    :goto_1
    return-void
.end method

.method private k()V
    .locals 6

    .line 99
    iget-object v0, p0, Lo/etm;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v4

    .line 100
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 101
    const-string v0, "com.huawei.hihealth.action_data_refresh"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 102
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 103
    iget-object v0, p0, Lo/etm;->q:Landroid/content/BroadcastReceiver;

    invoke-virtual {v4, v0, v5}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 104
    const-string v0, "PLGACHIEVE_TrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiBroadcasetReceiver  registe success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 106
    :cond_0
    const-string v0, "PLGACHIEVE_TrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiBroadcasetReceiver  registe fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    :goto_0
    return-void
.end method

.method private n()V
    .locals 4

    .line 216
    const-string v0, "PLGACHIEVE_TrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hideCard"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    iget-object v0, p0, Lo/etm;->a:Lo/eto;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 218
    iget-object v0, p0, Lo/etm;->a:Lo/eto;

    invoke-virtual {v0}, Lo/eto;->b()V

    .line 220
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 164
    invoke-direct {p0}, Lo/etm;->i()V

    .line 166
    iget-object v0, p0, Lo/etm;->r:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 167
    iget-object v0, p0, Lo/etm;->r:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 168
    const/4 v0, 0x0

    iput-object v0, p0, Lo/etm;->r:Ljava/util/concurrent/ExecutorService;

    .line 171
    :cond_0
    iget-object v0, p0, Lo/etm;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 172
    iget-object v0, p0, Lo/etm;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 173
    const/4 v0, 0x0

    iput-object v0, p0, Lo/etm;->d:Landroid/os/Handler;

    .line 176
    :cond_1
    iget-object v0, p0, Lo/etm;->a:Lo/eto;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 177
    iget-object v0, p0, Lo/etm;->a:Lo/eto;

    invoke-virtual {v0}, Lo/eto;->a()V

    .line 178
    const/4 v0, 0x0

    iput-object v0, p0, Lo/etm;->a:Lo/eto;

    .line 181
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lo/etm;->q:Landroid/content/BroadcastReceiver;

    .line 182
    return-void
.end method

.method protected a(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Long;Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 381
    return-void
.end method

.method public b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 2

    .line 135
    const-string v0, "PLGACHIEVE_TrendCardData"

    const-string v1, "-getCardViewHolder enter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    invoke-super {p0, p1, p2}, Lo/etj;->b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object v0

    check-cast v0, Lo/eto;

    iput-object v0, p0, Lo/etm;->a:Lo/eto;

    .line 137
    iget-object v0, p0, Lo/etm;->a:Lo/eto;

    iget v1, p0, Lo/etm;->e:I

    invoke-virtual {v0, v1}, Lo/eto;->e(I)V

    .line 138
    iget-object v0, p0, Lo/etm;->a:Lo/eto;

    iget-object v0, v0, Lo/eto;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 139
    invoke-virtual {p0}, Lo/etm;->e()V

    .line 140
    invoke-direct {p0}, Lo/etm;->k()V

    .line 141
    invoke-virtual {p0}, Lo/etm;->c()V

    .line 142
    const-string v0, "PLGACHIEVE_TrendCardData"

    const-string v1, "-getCardViewHolder end"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    iget-object v0, p0, Lo/etm;->a:Lo/eto;

    return-object v0
.end method

.method public b(JI)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 269
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 270
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 271
    invoke-virtual {v4, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 272
    const/4 v5, 0x6

    .line 273
    const/4 v6, 0x0

    :goto_0
    add-int/lit8 v0, p3, -0x1

    if-ge v6, v0, :cond_2

    .line 274
    iget-wide v0, p0, Lo/etm;->g:J

    invoke-static {v0, v1, v6}, Lo/ffk;->c(JI)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 275
    const/4 v0, 0x6

    if-ne v5, v0, :cond_0

    .line 276
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dzr;->a(JI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 278
    :cond_0
    const-string v0, ""

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    :goto_1
    add-int/lit8 v5, v5, -0x1

    .line 281
    if-nez v5, :cond_1

    .line 282
    const/4 v5, 0x6

    .line 273
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 285
    :cond_2
    iget-object v0, p0, Lo/etm;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lo/etm;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 286
    :cond_3
    iget-object v0, p0, Lo/etm;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_detail_sleep_bottom_btu_day_txt:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 288
    :cond_4
    iget-wide v0, p0, Lo/etm;->g:J

    add-int/lit8 v2, p3, -0x1

    invoke-static {v0, v1, v2}, Lo/ffk;->c(JI)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 289
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dzr;->a(JI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 292
    :goto_2
    iget-object v0, p0, Lo/etm;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 293
    invoke-static {v3}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 295
    :cond_5
    return-object v3
.end method

.method protected b()V
    .locals 0

    .line 209
    return-void
.end method

.method protected b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 377
    return-void
.end method

.method protected c()V
    .locals 0

    .line 147
    return-void
.end method

.method protected d(Lcom/huawei/hihealth/HiHealthData;)F
    .locals 2

    .line 264
    iget-object v0, p0, Lo/etm;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/etm;->e(D)F

    move-result v0

    return v0
.end method

.method public d()V
    .locals 4

    .line 151
    invoke-super {p0}, Lo/etj;->d()V

    .line 152
    const-string v0, "PLGACHIEVE_TrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====onResume===="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    invoke-virtual {p0}, Lo/etm;->e()V

    .line 154
    return-void
.end method

.method protected e(D)F
    .locals 8

    .line 299
    const/4 v4, 0x0

    .line 301
    const/4 v6, 0x0

    .line 302
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 303
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double v0, p1, v0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 305
    :cond_0
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double v0, p1, v0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 308
    :goto_0
    :try_start_0
    invoke-static {}, Ljava/text/NumberFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v7

    .line 309
    invoke-virtual {v7, v5}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v4

    .line 310
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    .line 314
    goto :goto_1

    .line 311
    :catch_0
    move-exception v7

    .line 312
    const-string v0, "PLGACHIEVE_TrendCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ParseException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    const/4 v0, 0x0

    return v0

    .line 315
    :goto_1
    return v6
.end method

.method public e()V
    .locals 4

    .line 158
    const-string v0, "PLGACHIEVE_TrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshCardData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    invoke-direct {p0}, Lo/etm;->g()V

    .line 160
    return-void
.end method

.method protected f()V
    .locals 6

    .line 226
    const-string v0, "PLGACHIEVE_TrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update card"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    iget-object v0, p0, Lo/etm;->a:Lo/eto;

    if-eqz v0, :cond_1

    .line 228
    iget-object v0, p0, Lo/etm;->k:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/etm;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 229
    iget-object v0, p0, Lo/etm;->a:Lo/eto;

    iget-object v1, p0, Lo/etm;->k:Ljava/util/List;

    iget-wide v2, p0, Lo/etm;->g:J

    const/16 v4, 0x1e

    invoke-virtual {p0, v2, v3, v4}, Lo/etm;->b(JI)Ljava/util/ArrayList;

    move-result-object v2

    iget v3, p0, Lo/etm;->t:I

    iget v4, p0, Lo/etm;->l:F

    iget-object v5, p0, Lo/etm;->o:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lo/eto;->a(Ljava/util/List;Ljava/util/ArrayList;IFLjava/lang/String;)V

    .line 230
    iget-object v0, p0, Lo/etm;->a:Lo/eto;

    iget-object v1, p0, Lo/etm;->m:Ljava/lang/String;

    iget-object v2, p0, Lo/etm;->p:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/eto;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 232
    :cond_0
    invoke-direct {p0}, Lo/etm;->n()V

    .line 235
    :cond_1
    :goto_0
    return-void
.end method

.method protected h()V
    .locals 10

    .line 200
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 202
    const/16 v0, -0x1d

    invoke-static {v8, v9, v0}, Lo/ffk;->c(JI)J

    move-result-wide v0

    iput-wide v0, p0, Lo/etm;->g:J

    .line 203
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-wide v1, p0, Lo/etm;->g:J

    .line 204
    invoke-static {v8, v9}, Lo/ffk;->a(J)J

    move-result-wide v3

    iget v6, p0, Lo/etm;->e:I

    new-instance v7, Lo/etm$c;

    invoke-direct {v7, p0}, Lo/etm$c;-><init>(Lo/etm;)V

    .line 203
    const/4 v5, 0x5

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->c(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 206
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 131
    return-void
.end method

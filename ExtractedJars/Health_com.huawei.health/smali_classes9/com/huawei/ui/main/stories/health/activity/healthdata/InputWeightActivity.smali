.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lo/fdt;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$d;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$a;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$e;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$b;
    }
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private C:Z

.field private D:Z

.field private E:Ljava/util/Date;

.field private F:Ljava/util/Date;

.field private G:Lo/egd;

.field private H:I

.field private I:I

.field private J:Z

.field private K:Lo/fes;

.field private L:Landroid/widget/TextView;

.field private M:Lo/ego;

.field private N:Lo/fes;

.field private O:J

.field private P:Landroid/os/Handler;

.field private Q:Lo/agk;

.field private R:Ljava/text/SimpleDateFormat;

.field private S:J

.field private T:Lo/emp;

.field private U:Lo/fcj;

.field private V:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$d;

.field private W:Lo/emp;

.field private X:Lo/fcl;

.field private a:Landroid/widget/LinearLayout;

.field private aa:Landroid/support/v7/widget/LinearLayoutManager;

.field private b:I

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/content/Context;

.field private e:Landroid/widget/LinearLayout;

.field private f:Lo/emr;

.field private g:Landroid/widget/ImageView;

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/widget/TextView;

.field private j:I

.field private k:Landroid/widget/ImageView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:D

.field private r:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$a;

.field private s:Lo/fdj;

.field private t:D

.field private u:D

.field private v:J

.field private w:Z

.field private x:D

.field private y:J

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 81
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 89
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->b:I

    .line 108
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->u:D

    .line 109
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->q:D

    .line 110
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->t:D

    .line 111
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->x:D

    .line 114
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->w:Z

    .line 115
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->z:Z

    .line 116
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->D:Z

    .line 117
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->C:Z

    .line 139
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$e;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->P:Landroid/os/Handler;

    return-void
.end method

.method static synthetic A(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->i()V

    return-void
.end method

.method static synthetic B(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Ljava/util/Date;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->F:Ljava/util/Date;

    return-object v0
.end method

.method static synthetic C(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->c()V

    return-void
.end method

.method static synthetic D(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)D
    .locals 2

    .line 81
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->x:D

    return-wide v0
.end method

.method static synthetic E(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->m()V

    return-void
.end method

.method static synthetic F(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->k()V

    return-void
.end method

.method static synthetic G(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Z
    .locals 1

    .line 81
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->J:Z

    return v0
.end method

.method static synthetic H(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/os/Handler;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->P:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic I(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$d;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->V:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$d;

    return-object v0
.end method

.method static synthetic L(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d()V

    return-void
.end method

.method static synthetic M(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->h()V

    return-void
.end method

.method static synthetic N(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)I
    .locals 1

    .line 81
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->b:I

    return v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;D)D
    .locals 0

    .line 81
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->q:D

    return-wide p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)I
    .locals 1

    .line 81
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->j:I

    return v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;I)I
    .locals 0

    .line 81
    iput p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->j:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    .line 81
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->b(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;Z)Z
    .locals 0

    .line 81
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->w:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)I
    .locals 1

    .line 81
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->A:I

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;I)I
    .locals 0

    .line 81
    iput p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->I:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;J)J
    .locals 0

    .line 81
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->v:J

    return-wide p1
.end method

.method private b(Ljava/util/Date;)Ljava/lang/String;
    .locals 3

    .line 937
    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->R:Ljava/text/SimpleDateFormat;

    monitor-enter v1

    .line 938
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->R:Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 939
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->E:Ljava/util/Date;

    return-object p1
.end method

.method private b()V
    .locals 9

    .line 440
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 441
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->v:J

    invoke-virtual {v3, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 442
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 443
    sget v0, Lcom/huawei/ui/main/R$layout;->userinfo_date_select:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 444
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_datepicker:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fgi;

    .line 446
    new-instance v8, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    invoke-direct {v8, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 447
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_string_date:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 448
    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;

    invoke-direct {v2, p0, v6, v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$2;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;Lo/fgi;Ljava/util/Calendar;)V

    .line 449
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$4;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V

    .line 465
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 471
    invoke-virtual {v8}, Lo/egw$c;->e()Lo/egw;

    move-result-object v7

    .line 472
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->A:I

    invoke-virtual {v6, v0}, Lo/fgi;->setSelectedYear(I)V

    .line 473
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->B:I

    invoke-virtual {v6, v0}, Lo/fgi;->setSelectedMonth(I)V

    .line 474
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->j:I

    invoke-virtual {v6, v0}, Lo/fgi;->setSelectedDay(I)V

    .line 475
    invoke-virtual {v7}, Lo/egw;->show()V

    .line 476
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;Z)Z
    .locals 0

    .line 81
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->C:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;D)D
    .locals 0

    .line 81
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->t:D

    return-wide p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)I
    .locals 1

    .line 81
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->B:I

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;I)I
    .locals 0

    .line 81
    iput p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->A:I

    return p1
.end method

.method private c()V
    .locals 16

    .line 360
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "BI_Tag"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v7

    .line 361
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->s:Lo/fdj;

    if-eqz v0, :cond_6

    .line 362
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->w:Z

    if-nez v0, :cond_0

    .line 363
    const-wide/16 v0, 0x0

    move-object/from16 v2, p0

    iput-wide v0, v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->q:D

    .line 365
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 366
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->v:J

    cmp-long v0, v8, v0

    if-gez v0, :cond_2

    .line 368
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_timeerror:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 369
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->b:I

    if-nez v0, :cond_1

    .line 370
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->i()V

    .line 372
    :cond_1
    return-void

    .line 374
    :cond_2
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 375
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    const/4 v0, 0x1

    if-ne v7, v0, :cond_3

    .line 377
    const-string v0, "type"

    const-string v1, "1"

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 379
    :cond_3
    const-string v0, "type"

    const-string v1, "2"

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    :goto_0
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 388
    const/4 v0, 0x1

    if-ne v7, v0, :cond_4

    .line 389
    const-string v0, "type"

    const-string v1, "1"

    invoke-interface {v11, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 391
    :cond_4
    const-string v0, "type"

    const-string v1, "2"

    invoke-interface {v11, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    :goto_1
    const/16 v0, 0x4ba

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v12

    .line 394
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    invoke-virtual {v0, v1, v12, v11}, Lo/dth;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)I

    .line 395
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->cQ:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v10, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 396
    invoke-static {}, Lo/agl;->e()Lo/agl;

    move-result-object v0

    invoke-virtual {v0}, Lo/agl;->d()V

    .line 397
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->y:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_5

    .line 399
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v13

    .line 400
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 401
    new-instance v15, Lo/acn;

    invoke-direct {v15}, Lo/acn;-><init>()V

    .line 402
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->y:J

    invoke-virtual {v15, v0, v1}, Lo/acn;->a(J)V

    .line 403
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->S:J

    invoke-virtual {v15, v0, v1}, Lo/acn;->c(J)V

    .line 404
    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 406
    sget-object v0, Lo/acs;->c:Lo/acs;

    invoke-virtual {v0, v13, v14}, Lo/acs;->c(Ljava/lang/String;Ljava/util/List;)V

    .line 408
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->s:Lo/fdj;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->y:J

    move-object/from16 v4, p0

    iget-wide v4, v4, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->S:J

    move-object/from16 v6, p0

    iget-object v6, v6, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->r:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$a;

    invoke-virtual/range {v0 .. v6}, Lo/fdj;->b(Landroid/content/Context;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 409
    const-string v0, "UIHLH_InputWeightActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delete data: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-wide v3, v3, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->y:J

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    goto :goto_2

    .line 411
    :cond_5
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d()V

    .line 416
    :cond_6
    :goto_2
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;Z)Z
    .locals 0

    .line 81
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->D:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)I
    .locals 1

    .line 81
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->I:I

    return v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;I)I
    .locals 0

    .line 81
    iput p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->B:I

    return p1
.end method

.method private d()V
    .locals 5

    .line 419
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->J:Z

    .line 420
    new-instance v4, Lo/agg;

    invoke-direct {v4}, Lo/agg;-><init>()V

    .line 421
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->q:D

    double-to-float v0, v0

    invoke-virtual {v4, v0}, Lo/agg;->b(F)V

    .line 422
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->u:D

    double-to-float v0, v0

    invoke-virtual {v4, v0}, Lo/agg;->e(F)V

    .line 423
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->v:J

    invoke-virtual {v4, v0, v1}, Lo/agg;->e(J)V

    .line 424
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/agg;->a(Z)V

    .line 426
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->y:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 427
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->O:J

    invoke-virtual {v4, v0, v1}, Lo/agg;->d(J)V

    goto :goto_0

    .line 429
    :cond_0
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->v:J

    invoke-virtual {v4, v0, v1}, Lo/agg;->d(J)V

    .line 432
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->Q:Lo/agk;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$b;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->P:Landroid/os/Handler;

    check-cast v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$e;

    invoke-direct {v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$b;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$e;)V

    invoke-virtual {v0, v1}, Lo/agk;->a(Lo/abz;)V

    .line 434
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->Q:Lo/agk;

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->n()Lo/acl;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lo/agk;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 436
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;D)D
    .locals 0

    .line 81
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->u:D

    return-wide p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)I
    .locals 1

    .line 81
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->H:I

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;I)I
    .locals 0

    .line 81
    iput p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->H:I

    return p1
.end method

.method private e()V
    .locals 15

    .line 179
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getIntent()Landroid/content/Intent;

    move-result-object v5

    .line 180
    if-nez v5, :cond_0

    .line 181
    const-string v0, "UIHLH_InputWeightActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    return-void

    .line 184
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "weight"

    const-wide v2, 0x4050400000000000L    # 65.0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->u:D

    .line 185
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "bodyfat"

    const-wide/high16 v2, 0x4034000000000000L    # 20.0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->q:D

    .line 186
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->u:D

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->t:D

    .line 187
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->q:D

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->x:D

    .line 188
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "isshowbodyfat"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->w:Z

    .line 189
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "isShowInput"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->z:Z

    .line 190
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->z:Z

    if-eqz v0, :cond_2

    .line 191
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->N:Lo/fes;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 192
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->K:Lo/fes;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 195
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$mipmap;->ic_health_rtl_back_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 197
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->health_navbar_back_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 199
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_input:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->G:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->h:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->L:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_2

    .line 206
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->N:Lo/fes;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->K:Lo/fes;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 209
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$mipmap;->ic_health_rtl_back_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 211
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->health_navbar_back_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 213
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_public_edit_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 215
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_base_health_data_history_record:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 216
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->G:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 217
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->k:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 218
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->h:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->L:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 221
    :goto_2
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->w:Z

    if-eqz v0, :cond_4

    .line 222
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 224
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->g:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_list_delete:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_3

    .line 226
    :cond_4
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->z:Z

    if-nez v0, :cond_5

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->T:Lo/emp;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emp;->setVisibility(I)V

    .line 229
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 231
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->g:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_list_added:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 233
    :goto_3
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "deletetime"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->y:J

    .line 234
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "delete_end_time"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->S:J

    .line 236
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->q:D

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpg-double v0, v0, v2

    if-gez v0, :cond_6

    .line 237
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->q:D

    .line 239
    :cond_6
    const/4 v6, 0x0

    .line 240
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Ljava/text/NumberFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v7

    .line 242
    :try_start_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 243
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->u:D

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v0

    const-wide/16 v1, 0x16

    invoke-static {v1, v2}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    move v6, v0

    .line 244
    const/16 v0, 0x14aa

    if-le v6, v0, :cond_8

    .line 245
    const/16 v6, 0x14aa

    goto :goto_4

    .line 248
    :cond_7
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->u:D

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v0

    const-wide/16 v1, 0xa

    invoke-static {v1, v2}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    move v6, v0

    .line 252
    :cond_8
    :goto_4
    goto :goto_5

    .line 250
    :catch_0
    move-exception v8

    .line 251
    const-string v0, "UIHLH_InputWeightActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    :goto_5
    new-instance v8, Ljava/math/BigDecimal;

    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->q:D

    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 256
    sget-object v0, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    const/4 v1, 0x1

    invoke-virtual {v8, v1, v0}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, v2

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    mul-double/2addr v0, v2

    double-to-int v9, v0

    .line 257
    const-string v0, "UIHLH_InputWeightActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bodyfatposition == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->N:Lo/fes;

    invoke-virtual {v0, v6}, Lo/fes;->setSelectedPosition(I)V

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->K:Lo/fes;

    invoke-virtual {v0, v9}, Lo/fes;->setSelectedPosition(I)V

    .line 260
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->y:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_9

    .line 261
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->y:J

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->v:J

    .line 262
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->S:J

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->O:J

    goto :goto_6

    .line 264
    :cond_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->v:J

    .line 266
    :goto_6
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v10

    .line 267
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->v:J

    invoke-virtual {v10, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 268
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->A:I

    .line 269
    const/4 v0, 0x2

    invoke-virtual {v10, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->B:I

    .line 270
    const/4 v0, 0x5

    invoke-virtual {v10, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->j:I

    .line 271
    const/16 v0, 0xb

    invoke-virtual {v10, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->I:I

    .line 272
    const/16 v0, 0xc

    invoke-virtual {v10, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->H:I

    .line 273
    invoke-static {}, Lo/fdj;->e()Lo/fdj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->s:Lo/fdj;

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->s:Lo/fdj;

    invoke-virtual {v0}, Lo/fdj;->c()V

    .line 276
    invoke-virtual {v10}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->E:Ljava/util/Date;

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->E:Ljava/util/Date;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->F:Ljava/util/Date;

    .line 280
    const-string v11, ""

    .line 281
    const-string v12, ""

    .line 282
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->E:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->b(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v13

    .line 283
    const-string v0, " "

    invoke-virtual {v13, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v14

    .line 284
    array-length v0, v14

    const/4 v1, 0x1

    if-le v0, v1, :cond_a

    .line 285
    const/4 v0, 0x0

    aget-object v11, v14, v0

    .line 286
    const/4 v0, 0x1

    aget-object v12, v14, v0

    goto :goto_7

    .line 288
    :cond_a
    const-string v0, "UIHLH_InputWeightActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dateArray is size less than 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    :goto_7
    const-string v0, "UIHLH_InputWeightActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dateString"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v11, v1, v2

    const-string v2, "timeString"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v12, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 293
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->o:Landroid/widget/TextView;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->u:D

    invoke-static {v1, v2}, Lo/cxh;->e(D)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_8

    .line 297
    :cond_b
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->o:Landroid/widget/TextView;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->u:D

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 299
    :goto_8
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->q:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_c

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->m:Landroid/widget/TextView;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->q:D

    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 303
    :cond_c
    new-instance v0, Lo/fcj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    iget-boolean v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->w:Z

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lo/fcj;-><init>(Landroid/content/Context;IZ)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->U:Lo/fcj;

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->T:Lo/emp;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->aa:Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0, v1}, Lo/emp;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->U:Lo/fcj;

    invoke-virtual {v0, p0}, Lo/fcj;->b(Lo/fdt;)V

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->T:Lo/emp;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->U:Lo/fcj;

    invoke-virtual {v0, v1}, Lo/emp;->setAdapter(Lo/flg$a;)V

    .line 307
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/content/Context;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    return-object v0
.end method

.method private f()V
    .locals 8

    .line 479
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 480
    new-instance v0, Lo/fey$c;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fey$c;-><init>(Landroid/content/Context;)V

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$1;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V

    .line 481
    invoke-virtual {v0, v1}, Lo/fey$c;->c(Lo/fey$b;)Lo/fey$c;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$3;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V

    .line 506
    invoke-virtual {v0, v1}, Lo/fey$c;->d(Lo/fey$b;)Lo/fey$c;

    move-result-object v0

    .line 513
    const/16 v1, 0xa

    invoke-virtual {v5, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/16 v2, 0xc

    invoke-virtual {v5, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    .line 514
    invoke-static {v3}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v3

    const/16 v4, 0x9

    invoke-virtual {v5, v4}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 513
    invoke-virtual {v0, v1, v2, v3, v4}, Lo/fey$c;->d(IIZI)Lo/fey$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_string_time:I

    .line 515
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fey$c;->a(Ljava/lang/String;)Lo/fey$c;

    move-result-object v6

    .line 516
    invoke-virtual {v6}, Lo/fey$c;->b()Lo/fey;

    move-result-object v7

    .line 517
    invoke-virtual {v7}, Lo/fey;->show()V

    .line 518
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Ljava/util/Date;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->E:Ljava/util/Date;

    return-object v0
.end method

.method private g()V
    .locals 7

    .line 526
    sget v0, Lcom/huawei/ui/main/R$id;->weight_hwSubHeader:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emp;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->W:Lo/emp;

    .line 527
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->aa:Landroid/support/v7/widget/LinearLayoutManager;

    .line 528
    new-instance v0, Lo/fcl;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/fcl;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->X:Lo/fcl;

    .line 529
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->W:Lo/emp;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->aa:Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0, v1}, Lo/emp;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 530
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->W:Lo/emp;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->X:Lo/fcl;

    invoke-virtual {v0, v1}, Lo/emp;->setAdapter(Lo/flg$a;)V

    .line 531
    sget v0, Lcom/huawei/ui/main/R$id;->fat_hwSubHeader:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emp;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->T:Lo/emp;

    .line 532
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->aa:Landroid/support/v7/widget/LinearLayoutManager;

    .line 534
    sget v0, Lcom/huawei/ui/main/R$id;->health_healthdata_inputweight_title_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f:Lo/emr;

    .line 535
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputweight_top_datelayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->c:Landroid/widget/LinearLayout;

    .line 536
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputweight_top_timelayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->e:Landroid/widget/LinearLayout;

    .line 537
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputweight_mid_bodyfatlayout_desc:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->a:Landroid/widget/LinearLayout;

    .line 538
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputweight_mid_add_bodyfat_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->g:Landroid/widget/ImageView;

    .line 539
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_input_weight_date:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->k:Landroid/widget/ImageView;

    .line 540
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_input_weight_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->h:Landroid/widget/ImageView;

    .line 542
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 543
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->arrow_left_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 544
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->h:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->arrow_left_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 546
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 547
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->h:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 552
    :goto_0
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputweight_top_date:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->i:Landroid/widget/TextView;

    .line 553
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputweight_top_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->p:Landroid/widget/TextView;

    .line 558
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputweight_bady_fat_rata_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->l:Landroid/widget/TextView;

    .line 559
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->l:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_bodyfat_rate:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 561
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputweight_mid_weight:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->o:Landroid/widget/TextView;

    .line 562
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputweight_mid_weight_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->n:Landroid/widget/TextView;

    .line 563
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->n:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 565
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputweight_mid_bodyfat:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->m:Landroid/widget/TextView;

    .line 567
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputweight_bind_device:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->L:Landroid/widget/TextView;

    .line 568
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputweight_confirm:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->G:Lo/egd;

    .line 569
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->G:Lo/egd;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_confirm:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 571
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 572
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 573
    const/16 v5, 0x16

    :goto_1
    const/16 v0, 0x228

    if-ge v5, v0, :cond_1

    .line 574
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 573
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    goto :goto_3

    .line 577
    :cond_2
    const/16 v5, 0xa

    :goto_2
    const/16 v0, 0xfb

    if-ge v5, v0, :cond_3

    .line 578
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 577
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 581
    :cond_3
    :goto_3
    sget v0, Lcom/huawei/ui/main/R$id;->health_healthdata_imputweight_weight_scale:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fes;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->N:Lo/fes;

    .line 582
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->N:Lo/fes;

    const/16 v1, 0xa

    const/16 v2, 0x28

    invoke-virtual {v0, v4, v1, v2}, Lo/fes;->setData(Ljava/util/List;II)V

    .line 583
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->N:Lo/fes;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$5;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V

    invoke-virtual {v0, v1}, Lo/fes;->setOnSelectedListener(Lo/fes$a;)V

    .line 609
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 610
    const/4 v6, 0x1

    :goto_4
    const/16 v0, 0x32

    if-ge v6, v0, :cond_4

    .line 611
    int-to-double v0, v6

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 610
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    .line 613
    :cond_4
    sget v0, Lcom/huawei/ui/main/R$id;->health_healthdata_imputweight_bodyfat_scale:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fes;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->K:Lo/fes;

    .line 614
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->K:Lo/fes;

    const/16 v1, 0xa

    const/16 v2, 0x28

    invoke-virtual {v0, v5, v1, v2}, Lo/fes;->setData(Ljava/util/List;II)V

    .line 615
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->K:Lo/fes;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$7;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V

    invoke-virtual {v0, v1}, Lo/fes;->setOnSelectedListener(Lo/fes$a;)V

    .line 632
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 633
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 634
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->g:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 635
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->G:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 636
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->L:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 640
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 731
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 787
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;I)I
    .locals 0

    .line 81
    iput p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->b:I

    return p1
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->i:Landroid/widget/TextView;

    return-object v0
.end method

.method private h()V
    .locals 3

    .line 859
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->M:Lo/ego;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->isFinishing()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/fej;->a(Landroid/content/Context;Lo/ego;Ljava/lang/Boolean;)V

    .line 860
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->p:Landroid/widget/TextView;

    return-object v0
.end method

.method private i()V
    .locals 3

    .line 792
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->T:Lo/emp;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emp;->setVisibility(I)V

    .line 793
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 794
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->h:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 795
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->N:Lo/fes;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 796
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->K:Lo/fes;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 797
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_public_cancel_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 798
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_public_ok:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 799
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->D:Z

    .line 800
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->C:Z

    if-eqz v0, :cond_0

    .line 801
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 802
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->w:Z

    .line 803
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->C:Z

    .line 805
    :cond_0
    return-void
.end method

.method static synthetic j(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->a:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)D
    .locals 2

    .line 81
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->u:D

    return-wide v0
.end method

.method private k()V
    .locals 0

    .line 522
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->m:Landroid/widget/TextView;

    return-object v0
.end method

.method private m()V
    .locals 2

    .line 864
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->M:Lo/ego;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->isFinishing()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fej;->d(Lo/ego;Ljava/lang/Boolean;)V

    .line 865
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Z
    .locals 1

    .line 81
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->D:Z

    return v0
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)D
    .locals 2

    .line 81
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->q:D

    return-wide v0
.end method

.method private n()Lo/acl;
    .locals 1

    .line 894
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$8;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$8;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V

    .line 910
    return-object v0
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->n:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->o:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Z
    .locals 1

    .line 81
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->z:Z

    return v0
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->k:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/emr;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f:Lo/emr;

    return-object v0
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->h:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->L:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic v(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/emp;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->T:Lo/emp;

    return-object v0
.end method

.method static synthetic w(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Z
    .locals 1

    .line 81
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->w:Z

    return v0
.end method

.method static synthetic x(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/fes;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->N:Lo/fes;

    return-object v0
.end method

.method static synthetic y(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/fes;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->K:Lo/fes;

    return-object v0
.end method

.method static synthetic z(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)D
    .locals 2

    .line 81
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->t:D

    return-wide v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 808
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->w:Z

    if-eqz v0, :cond_0

    .line 809
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 810
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->w:Z

    goto :goto_0

    .line 812
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 813
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->w:Z

    .line 815
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->c:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_1

    .line 312
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->z:Z

    if-eqz v0, :cond_0

    .line 313
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->b()V

    goto/16 :goto_0

    .line 315
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->D:Z

    if-eqz v0, :cond_7

    .line 316
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->b()V

    goto/16 :goto_0

    .line 319
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->e:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_3

    .line 320
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->z:Z

    if-eqz v0, :cond_2

    .line 321
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f()V

    goto/16 :goto_0

    .line 323
    :cond_2
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->D:Z

    if-eqz v0, :cond_7

    .line 324
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f()V

    goto/16 :goto_0

    .line 327
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->g:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_5

    .line 328
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->w:Z

    if-eqz v0, :cond_4

    .line 331
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->g:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_list_added:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->g:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_talkback_add_bodyfat_rate:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 333
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 334
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->w:Z

    goto/16 :goto_0

    .line 338
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->g:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_talkback_cancel_add_bodyfat_rate:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 339
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->g:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_list_delete:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 340
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 341
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->w:Z

    goto :goto_0

    .line 343
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->G:Lo/egd;

    if-ne p1, v0, :cond_6

    .line 344
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->b:I

    .line 345
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->c()V

    goto :goto_0

    .line 346
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->L:Landroid/widget/TextView;

    if-ne p1, v0, :cond_7

    .line 347
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 348
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 349
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 350
    const-string v0, "kind"

    const-string v1, "HDK_WEIGHT"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 351
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 352
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->cO:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 354
    const-string v0, "view"

    const-string v1, "BondDevice"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 355
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->startActivity(Landroid/content/Intent;)V

    .line 357
    :cond_7
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 167
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 168
    sget v0, Lcom/huawei/ui/main/R$layout;->health_data_inputweight:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->setContentView(I)V

    .line 169
    iput-object p0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->d:Landroid/content/Context;

    .line 170
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$a;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->r:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$a;

    .line 171
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v2, "yyyyMd HH:mm"

    invoke-static {v1, v2}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->R:Ljava/text/SimpleDateFormat;

    .line 172
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$d;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->V:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$d;

    .line 173
    new-instance v0, Lo/agk;

    const/16 v1, 0x2716

    invoke-direct {v0, v1}, Lo/agk;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->Q:Lo/agk;

    .line 174
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->g()V

    .line 175
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->e()V

    .line 176
    return-void
.end method

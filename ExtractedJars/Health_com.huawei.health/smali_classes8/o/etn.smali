.class public Lo/etn;
.super Lo/etm;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/etn$b;,
        Lo/etn$c;,
        Lo/etn$d;,
        Lo/etn$a;
    }
.end annotation


# instance fields
.field private q:Lo/etn$d;

.field private r:Lo/cmo;

.field private s:Landroid/os/Handler;

.field private u:Lo/cmj;

.field private v:I

.field private w:Z

.field private x:I

.field private y:Lo/etn$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 71
    invoke-direct {p0, p1}, Lo/etm;-><init>(Landroid/content/Context;)V

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lo/etn;->u:Lo/cmj;

    .line 60
    const/4 v0, 0x0

    iput v0, p0, Lo/etn;->x:I

    .line 62
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/etn;->w:Z

    .line 68
    const/4 v0, 0x0

    iput v0, p0, Lo/etn;->v:I

    .line 233
    new-instance v0, Lo/etn$a;

    invoke-direct {v0, p0}, Lo/etn$a;-><init>(Lo/etn;)V

    iput-object v0, p0, Lo/etn;->y:Lo/etn$a;

    .line 73
    const/4 v0, 0x0

    iput v0, p0, Lo/etn;->e:I

    .line 74
    const-string v0, "sport_step_sum"

    iput-object v0, p0, Lo/etn;->h:Ljava/lang/String;

    .line 75
    const-string v0, "sport_step_sum"

    iput-object v0, p0, Lo/etn;->f:Ljava/lang/String;

    .line 76
    const-string v0, "sport_step_sum"

    iput-object v0, p0, Lo/etn;->n:Ljava/lang/String;

    .line 77
    return-void
.end method

.method static synthetic a(Lo/etn;I)I
    .locals 0

    .line 41
    iput p1, p0, Lo/etn;->v:I

    return p1
.end method

.method static synthetic a(Lo/etn;)Landroid/os/Handler;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/etn;->s:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic b(Lo/etn;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Lo/etn;->n()V

    return-void
.end method

.method static synthetic c(Lo/etn;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Lo/etn;->t()V

    return-void
.end method

.method static synthetic d(Lo/etn;)I
    .locals 1

    .line 41
    iget v0, p0, Lo/etn;->v:I

    return v0
.end method

.method static synthetic e(Lo/etn;)Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lo/etn;->w:Z

    return v0
.end method

.method static synthetic f(Lo/etn;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Lo/etn;->q()V

    return-void
.end method

.method private g()V
    .locals 4

    .line 95
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "register StepReport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    iget-object v0, p0, Lo/etn;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/fgb;->b(Landroid/content/Context;)Lo/fgb;

    move-result-object v0

    invoke-virtual {v0}, Lo/fgb;->c()Lo/cmj;

    move-result-object v0

    iput-object v0, p0, Lo/etn;->u:Lo/cmj;

    .line 98
    iget-object v0, p0, Lo/etn;->u:Lo/cmj;

    if-nez v0, :cond_0

    .line 99
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHealthOpenSDk null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    return-void

    .line 102
    :cond_0
    iget-object v0, p0, Lo/etn;->q:Lo/etn$d;

    if-eqz v0, :cond_1

    .line 103
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init but mStepCallback not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    return-void

    .line 106
    :cond_1
    new-instance v0, Lo/etn$b;

    invoke-direct {v0, p0}, Lo/etn$b;-><init>(Lo/etn;)V

    iput-object v0, p0, Lo/etn;->s:Landroid/os/Handler;

    .line 107
    new-instance v0, Lo/etn$d;

    invoke-direct {v0, p0}, Lo/etn$d;-><init>(Lo/etn;)V

    iput-object v0, p0, Lo/etn;->q:Lo/etn$d;

    .line 108
    new-instance v0, Lo/etn$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/etn$c;-><init>(Lo/etn;Lo/etn$4;)V

    iput-object v0, p0, Lo/etn;->r:Lo/cmo;

    .line 109
    iget-object v0, p0, Lo/etn;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/fgb;->b(Landroid/content/Context;)Lo/fgb;

    move-result-object v0

    iget-object v1, p0, Lo/etn;->r:Lo/cmo;

    invoke-virtual {v0, v1}, Lo/fgb;->b(Lo/cmo;)V

    .line 110
    iget-object v0, p0, Lo/etn;->u:Lo/cmj;

    iget-object v1, p0, Lo/etn;->q:Lo/etn$d;

    iget-object v2, p0, Lo/etn;->r:Lo/cmo;

    invoke-virtual {v0, v1, v2}, Lo/cmj;->e(Lo/cmq;Lo/cmo;)Z

    .line 111
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "register mStepCallback:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/etn;->q:Lo/etn$d;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    return-void
.end method

.method private i()V
    .locals 4

    .line 129
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegister mStepCallback:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/etn;->q:Lo/etn$d;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    iget-object v0, p0, Lo/etn;->u:Lo/cmj;

    if-nez v0, :cond_0

    .line 131
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy mHealthOpenSDK null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    return-void

    .line 135
    :cond_0
    iget-object v0, p0, Lo/etn;->q:Lo/etn$d;

    if-nez v0, :cond_1

    .line 136
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy mStepCallback null!!!why?"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    return-void

    .line 140
    :cond_1
    iget-object v0, p0, Lo/etn;->u:Lo/cmj;

    iget-object v1, p0, Lo/etn;->q:Lo/etn$d;

    invoke-virtual {v0, v1}, Lo/cmj;->a(Lo/cmq;)V

    .line 141
    iget-object v0, p0, Lo/etn;->r:Lo/cmo;

    if-eqz v0, :cond_2

    .line 142
    iget-object v0, p0, Lo/etn;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/fgb;->b(Landroid/content/Context;)Lo/fgb;

    move-result-object v0

    iget-object v1, p0, Lo/etn;->r:Lo/cmo;

    invoke-virtual {v0, v1}, Lo/fgb;->a(Lo/cmo;)V

    .line 144
    :cond_2
    return-void
.end method

.method private m()V
    .locals 4

    .line 288
    iget-object v0, p0, Lo/etn;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    iget-object v1, p0, Lo/etn;->y:Lo/etn$a;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-interface {v0, v2, v3, v1}, Lo/clt;->d(IILo/clz;)V

    .line 289
    return-void
.end method

.method private n()V
    .locals 4

    .line 345
    iget-object v0, p0, Lo/etn;->s:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 346
    iget-object v0, p0, Lo/etn;->s:Landroid/os/Handler;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 347
    iget v0, p0, Lo/etn;->x:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/etn;->x:I

    .line 348
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "retryRegister  mRegisterTimes="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/etn;->x:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    iget v0, p0, Lo/etn;->x:I

    const/16 v1, 0xa

    if-gt v0, v1, :cond_0

    .line 350
    iget-object v0, p0, Lo/etn;->s:Landroid/os/Handler;

    const/16 v1, 0x10

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 354
    :cond_0
    return-void
.end method

.method private q()V
    .locals 6

    .line 363
    iget-object v0, p0, Lo/etn;->u:Lo/cmj;

    if-eqz v0, :cond_0

    .line 364
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/etn;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/manager/DaemonService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 366
    :try_start_0
    iget-object v0, p0, Lo/etn;->b:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 369
    goto :goto_0

    .line 367
    :catch_0
    move-exception v5

    .line 368
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_REBIND_OPENSDK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    :goto_0
    iget-object v0, p0, Lo/etn;->u:Lo/cmj;

    iget-object v1, p0, Lo/etn;->q:Lo/etn$d;

    iget-object v2, p0, Lo/etn;->r:Lo/cmo;

    invoke-virtual {v0, v1, v2}, Lo/cmj;->e(Lo/cmq;Lo/cmo;)Z

    .line 372
    :cond_0
    return-void
.end method

.method private t()V
    .locals 3

    .line 357
    iget-object v0, p0, Lo/etn;->u:Lo/cmj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/etn;->q:Lo/etn$d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/etn;->r:Lo/cmo;

    if-eqz v0, :cond_0

    .line 358
    iget-object v0, p0, Lo/etn;->u:Lo/cmj;

    iget-object v1, p0, Lo/etn;->q:Lo/etn$d;

    iget-object v2, p0, Lo/etn;->r:Lo/cmo;

    invoke-virtual {v0, v1, v2}, Lo/cmj;->e(Lo/cmq;Lo/cmo;)Z

    .line 360
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 121
    invoke-super {p0}, Lo/etm;->a()V

    .line 122
    invoke-direct {p0}, Lo/etn;->i()V

    .line 123
    return-void
.end method

.method protected a(I)V
    .locals 9

    .line 185
    int-to-double v0, p1

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x403e000000000000L    # 30.0

    div-double v7, v0, v2

    .line 186
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    cmpg-double v0, v7, v0

    if-gez v0, :cond_0

    .line 187
    iget-object v0, p0, Lo/etn;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_sport_trend_steps_achievementtarget_bad:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x1e

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-wide/high16 v3, 0x4049000000000000L    # 50.0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/etn;->o:Ljava/lang/String;

    goto :goto_0

    .line 188
    :cond_0
    const-wide v0, 0x3fe6666666666666L    # 0.7

    cmpl-double v0, v7, v0

    if-ltz v0, :cond_1

    .line 189
    iget-object v0, p0, Lo/etn;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_sport_trend_steps_achievementtarget_better:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x1e

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-wide v3, 0x4051800000000000L    # 70.0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/etn;->o:Ljava/lang/String;

    goto :goto_0

    .line 191
    :cond_1
    iget-object v0, p0, Lo/etn;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_sport_trend_steps_achievementtarget_good:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x1e

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-wide/high16 v3, 0x4049000000000000L    # 50.0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/etn;->o:Ljava/lang/String;

    .line 194
    :goto_0
    return-void
.end method

.method protected a(Ljava/util/Map;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Long;Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 148
    new-instance v4, Ljava/util/ArrayList;

    const/16 v0, 0x1e

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 149
    const/4 v6, 0x0

    .line 150
    const/4 v8, 0x0

    .line 151
    const/4 v9, 0x0

    :goto_0
    const/16 v0, 0x1e

    if-ge v9, v0, :cond_5

    .line 152
    iget-object v0, p0, Lo/etn;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 153
    rsub-int/lit8 v0, v9, 0x1e

    add-int/lit8 v7, v0, -0x1

    goto :goto_1

    .line 155
    :cond_0
    move v7, v9

    .line 157
    :goto_1
    const/4 v5, 0x0

    .line 158
    iget-wide v0, p0, Lo/etn;->g:J

    invoke-static {v0, v1, v9}, Lo/ffk;->c(JI)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 159
    if-eqz v10, :cond_1

    .line 160
    invoke-virtual {p0, v10}, Lo/etn;->d(Lcom/huawei/hihealth/HiHealthData;)F

    move-result v5

    .line 163
    :cond_1
    const/16 v0, 0x1d

    if-ne v9, v0, :cond_2

    iget v0, p0, Lo/etn;->v:I

    if-eqz v0, :cond_2

    .line 164
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "today steps:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "statistics steps="

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "opensdk steps="

    const/4 v3, 0x3

    aput-object v2, v1, v3

    iget v2, p0, Lo/etn;->v:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    iget v0, p0, Lo/etn;->v:I

    int-to-float v5, v0

    .line 167
    :cond_2
    cmpg-float v0, v6, v5

    if-gez v0, :cond_3

    .line 168
    move v6, v5

    .line 170
    :cond_3
    iget v0, p0, Lo/etn;->t:I

    int-to-float v0, v0

    cmpl-float v0, v5, v0

    if-ltz v0, :cond_4

    .line 171
    add-int/lit8 v8, v8, 0x1

    .line 173
    :cond_4
    new-instance v0, Lcom/github/mikephil/charting/data/BarEntry;

    int-to-float v1, v7

    invoke-direct {v0, v1, v5}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(FF)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 175
    :cond_5
    invoke-virtual {p0, v8}, Lo/etn;->a(I)V

    .line 176
    int-to-double v0, v8

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/etn;->m:Ljava/lang/String;

    .line 177
    iput v6, p0, Lo/etn;->l:F

    .line 178
    iget-object v0, p0, Lo/etn;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 179
    invoke-static {v4}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 181
    :cond_6
    iput-object v4, p0, Lo/etn;->k:Ljava/util/List;

    .line 182
    return-void
.end method

.method protected b()V
    .locals 0

    .line 226
    invoke-direct {p0}, Lo/etn;->m()V

    .line 227
    return-void
.end method

.method protected b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 217
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 218
    .line 219
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    iget-object v1, p0, Lo/etn;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    long-to-double v0, v0

    .line 218
    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/etn;->p:Ljava/lang/String;

    .line 223
    :cond_0
    return-void
.end method

.method protected c()V
    .locals 0

    .line 87
    invoke-super {p0}, Lo/etm;->c()V

    .line 88
    invoke-direct {p0}, Lo/etn;->g()V

    .line 89
    return-void
.end method

.method protected d(Lcom/huawei/hihealth/HiHealthData;)F
    .locals 1

    .line 230
    iget-object v0, p0, Lo/etn;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    return v0
.end method

.method public d()V
    .locals 1

    .line 81
    invoke-super {p0}, Lo/etm;->d()V

    .line 82
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/etn;->w:Z

    .line 83
    return-void
.end method

.method public k()V
    .locals 4

    .line 115
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====onPause===="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/etn;->w:Z

    .line 117
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 198
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->home_item_layout_trend:I

    if-ne v0, v1, :cond_1

    .line 199
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "show detail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    new-instance v4, Landroid/content/Intent;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 201
    const-string v0, "sportPageIndex"

    const/4 v1, 0x2

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 202
    iget v0, p0, Lo/etn;->v:I

    if-lez v0, :cond_0

    .line 203
    const-string v0, "today_current_steps_total"

    iget v1, p0, Lo/etn;->v:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 206
    :cond_0
    iget-object v0, p0, Lo/etn;->u:Lo/cmj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cmj;->b(Lo/cms;)V

    .line 207
    iget-object v0, p0, Lo/etn;->b:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 208
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 209
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/etn;->b:Landroid/content/Context;

    sget-object v2, Lo/dae;->bZ:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 213
    :cond_1
    return-void
.end method

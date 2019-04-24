.class public Lo/dmv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dmv$d;,
        Lo/dmv$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String;

.field private static f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lorg/json/JSONObject;>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field c:Lo/egw;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<[F>;"
        }
    .end annotation
.end field

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private final k:Lo/dmv$a;

.field private l:I

.field private m:Z

.field private n:I

.field private o:J

.field private p:[F

.field private q:[F

.field private r:Lo/flc;

.field private s:I

.field private t:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private u:I

.field private v:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 61
    const-class v0, Lo/dmv;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dmv;->a:Ljava/lang/String;

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/dmv;->f:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dmv;->b:Ljava/util/List;

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dmv;->d:Ljava/util/List;

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dmv;->e:Ljava/util/List;

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dmv;->g:Ljava/util/List;

    .line 93
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dmv;->h:Ljava/util/List;

    .line 94
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dmv;->i:Ljava/util/List;

    .line 96
    const/4 v0, 0x0

    iput v0, p0, Lo/dmv;->l:I

    .line 97
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dmv;->p:[F

    .line 98
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dmv;->m:Z

    .line 99
    const/4 v0, -0x1

    iput v0, p0, Lo/dmv;->n:I

    .line 101
    const/16 v0, 0x12

    new-array v0, v0, [F

    iput-object v0, p0, Lo/dmv;->q:[F

    .line 103
    const/4 v0, 0x3

    iput v0, p0, Lo/dmv;->u:I

    .line 104
    const/4 v0, 0x0

    iput v0, p0, Lo/dmv;->s:I

    .line 207
    new-instance v0, Lo/dmv$2;

    invoke-direct {v0, p0}, Lo/dmv$2;-><init>(Lo/dmv;)V

    iput-object v0, p0, Lo/dmv;->v:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 107
    new-instance v3, Landroid/os/HandlerThread;

    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    invoke-direct {v3, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 108
    invoke-virtual {v3}, Landroid/os/HandlerThread;->start()V

    .line 109
    new-instance v0, Lo/dmv$a;

    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lo/dmv$a;-><init>(Landroid/os/Looper;Lo/dmv;Lo/dmv$5;)V

    iput-object v0, p0, Lo/dmv;->k:Lo/dmv$a;

    .line 110
    invoke-static {}, Lcom/huawei/hwstressmgr/BreatheDataProvider;->c()Lcom/huawei/hwstressmgr/BreatheDataProvider;

    .line 111
    invoke-static {}, Lcom/huawei/hwstressmgr/PressureCalibrate;->c()Lcom/huawei/hwstressmgr/PressureCalibrate;

    .line 112
    return-void
.end method

.method synthetic constructor <init>(Lo/dmv$5;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Lo/dmv;-><init>()V

    return-void
.end method

.method static synthetic a(Lo/dmv;)I
    .locals 1

    .line 59
    iget v0, p0, Lo/dmv;->l:I

    return v0
.end method

.method private a()V
    .locals 4

    .line 666
    iget-object v0, p0, Lo/dmv;->k:Lo/dmv$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 668
    iget-object v0, p0, Lo/dmv;->k:Lo/dmv$a;

    const/16 v1, 0x2711

    invoke-virtual {v0, v1}, Lo/dmv$a;->removeMessages(I)V

    goto :goto_0

    .line 670
    :cond_0
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelStressTimeOutWaiting(), mStressErrorHandler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 673
    :goto_0
    return-void
.end method

.method private a(II)V
    .locals 2

    .line 288
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 289
    iget-object v0, p0, Lo/dmv;->b:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 290
    iget-object v0, p0, Lo/dmv;->d:Ljava/util/List;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 292
    :cond_0
    return-void
.end method

.method private a(Lorg/json/JSONObject;)V
    .locals 5

    .line 257
    const-string v0, "rri_list"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 258
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 259
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object p1

    .line 260
    const-string v0, "rri_value"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v3

    .line 261
    const-string v0, "rri_sqi"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v4

    .line 262
    invoke-direct {p0, v3, v4}, Lo/dmv;->a(II)V

    .line 258
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 264
    :cond_0
    return-void
.end method

.method static synthetic b(Lo/dmv;J)J
    .locals 0

    .line 59
    iput-wide p1, p0, Lo/dmv;->o:J

    return-wide p1
.end method

.method static synthetic b(Lo/dmv;)Ljava/util/List;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/dmv;->b:Ljava/util/List;

    return-object v0
.end method

.method private b()V
    .locals 7

    .line 268
    iget-object v0, p0, Lo/dmv;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 269
    sget-object v0, Lo/dmv;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    .line 270
    :goto_0
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getDataResult mDuration   "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dmv;->l:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   mRRIValueList.size() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dmv;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "firstData  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    iget v1, p0, Lo/dmv;->l:I

    iget-object v0, p0, Lo/dmv;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    iget-object v0, p0, Lo/dmv;->b:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/dmv;->e(Ljava/util/List;)[I

    move-result-object v3

    iget-object v0, p0, Lo/dmv;->d:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/dmv;->e(Ljava/util/List;)[I

    move-result-object v4

    move v5, v6

    const/4 v0, 0x0

    invoke-static/range {v0 .. v5}, Lcom/huawei/hwstressmgr/BreatheDataProvider;->getBreatheResultFromAlgorithm(III[I[II)[F

    move-result-object v0

    iput-object v0, p0, Lo/dmv;->p:[F

    .line 272
    iget-object v0, p0, Lo/dmv;->p:[F

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/dmv;->p:[F

    const/16 v1, 0x9

    aget v0, v0, v1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    .line 273
    iget-object v0, p0, Lo/dmv;->e:Ljava/util/List;

    iget-object v1, p0, Lo/dmv;->p:[F

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 276
    :cond_1
    return-void
.end method

.method private b(I)V
    .locals 2

    .line 250
    iget-object v0, p0, Lo/dmv;->p:[F

    if-eqz v0, :cond_0

    .line 251
    iget-object v0, p0, Lo/dmv;->g:Ljava/util/List;

    iget-object v1, p0, Lo/dmv;->p:[F

    aget v1, v1, p1

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 253
    :cond_0
    return-void
.end method

.method private b(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 617
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "breatheOpen = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 618
    invoke-direct {p0, p1}, Lo/dmv;->e(I)V

    .line 619
    iget-object v0, p0, Lo/dmv;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 620
    iget-object v0, p0, Lo/dmv;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 621
    iget-object v0, p0, Lo/dmv;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 622
    iget-object v0, p0, Lo/dmv;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 623
    iget-object v0, p0, Lo/dmv;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 624
    sget-object v0, Lo/dmv;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 625
    iget-object v0, p0, Lo/dmv;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 626
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dmv;->p:[F

    .line 627
    if-nez p1, :cond_0

    const/16 v0, 0x3c

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    iput v0, p0, Lo/dmv;->l:I

    .line 628
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 630
    const-string v0, "status"

    const/4 v1, 0x3

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 633
    goto :goto_1

    .line 631
    :catch_0
    move-exception v5

    .line 632
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " breatheOpen "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 634
    :goto_1
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "breatheOpen  jsonObject = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 636
    iget-object v0, p0, Lo/dmv;->r:Lo/flc;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/dmv;->r:Lo/flc;

    invoke-interface {v0}, Lo/flc;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 637
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " breatheOpen send message"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 638
    iget-object v0, p0, Lo/dmv;->r:Lo/flc;

    new-instance v1, Lo/dmv$1;

    invoke-direct {v1, p0, p1}, Lo/dmv$1;-><init>(Lo/dmv;I)V

    invoke-interface {v0, v4, v1}, Lo/flc;->b(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 656
    :cond_1
    return-void
.end method

.method private b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 337
    iget v0, p0, Lo/dmv;->n:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    if-nez p1, :cond_1

    iget v0, p0, Lo/dmv;->l:I

    if-eqz v0, :cond_1

    .line 339
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 340
    const-string v0, "keeptime"

    iget v1, p0, Lo/dmv;->l:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    iget v0, p0, Lo/dmv;->s:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 342
    const-string v0, "serviceSuccess"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 344
    :cond_0
    const-string v0, "serviceSuccess"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    :goto_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->fy:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 347
    const/4 v0, 0x0

    iput v0, p0, Lo/dmv;->l:I

    .line 349
    :cond_1
    const-string v0, "ZXJ"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BI --  P3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    iget-object v0, p0, Lo/dmv;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 351
    iget-object v0, p0, Lo/dmv;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 352
    iget-object v0, p0, Lo/dmv;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 353
    iget-object v0, p0, Lo/dmv;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 354
    iget-object v0, p0, Lo/dmv;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 355
    sget-object v0, Lo/dmv;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 356
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dmv;->p:[F

    .line 357
    invoke-direct {p0, p1}, Lo/dmv;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 358
    invoke-direct {p0}, Lo/dmv;->a()V

    .line 359
    iget v0, p0, Lo/dmv;->n:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget v0, p0, Lo/dmv;->l:I

    if-eqz v0, :cond_2

    .line 360
    const/4 v0, 0x1

    iput v0, p0, Lo/dmv;->s:I

    goto :goto_1

    .line 362
    :cond_2
    const/4 v0, 0x0

    iput v0, p0, Lo/dmv;->s:I

    .line 364
    :goto_1
    return-void
.end method

.method static synthetic b(Lo/dmv;I)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lo/dmv;->c(I)V

    return-void
.end method

.method static synthetic c(Lo/dmv;)Ljava/util/List;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/dmv;->d:Ljava/util/List;

    return-object v0
.end method

.method private c(I)V
    .locals 2

    .line 244
    iget-object v0, p0, Lo/dmv;->p:[F

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dmv;->p:[F

    aget v0, v0, p1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 245
    iget-object v0, p0, Lo/dmv;->h:Ljava/util/List;

    iget-object v1, p0, Lo/dmv;->p:[F

    aget v1, v1, p1

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 247
    :cond_0
    return-void
.end method

.method private c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 367
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 369
    const-string v0, "status"

    const/4 v1, 0x4

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 370
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "breatheClose  jsonObject = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 373
    goto :goto_0

    .line 371
    :catch_0
    move-exception v5

    .line 372
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "breatheClose "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    :goto_0
    iget-object v0, p0, Lo/dmv;->r:Lo/flc;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/dmv;->m:Z

    if-eqz v0, :cond_0

    .line 376
    iget-object v0, p0, Lo/dmv;->r:Lo/flc;

    new-instance v1, Lo/dmv$3;

    invoke-direct {v1, p0}, Lo/dmv$3;-><init>(Lo/dmv;)V

    invoke-interface {v0, v4, v1}, Lo/flc;->b(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 393
    :cond_0
    const/4 v0, 0x3

    iput v0, p0, Lo/dmv;->u:I

    .line 394
    invoke-virtual {p0}, Lo/dmv;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 395
    iget-object v0, p0, Lo/dmv;->p:[F

    if-eqz v0, :cond_1

    .line 396
    const/4 v0, 0x1

    iput v0, p0, Lo/dmv;->u:I

    goto :goto_1

    .line 398
    :cond_1
    const/4 v0, 0x2

    iput v0, p0, Lo/dmv;->u:I

    goto :goto_1

    .line 401
    :cond_2
    iget-object v0, p0, Lo/dmv;->p:[F

    if-eqz v0, :cond_3

    .line 402
    const/4 v0, 0x1

    iput v0, p0, Lo/dmv;->u:I

    .line 406
    :cond_3
    :goto_1
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 407
    if-eqz p1, :cond_7

    iget-object v0, p0, Lo/dmv;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_7

    .line 409
    :try_start_1
    iget-object v0, p0, Lo/dmv;->e:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, [F

    .line 410
    iget-object v0, p0, Lo/dmv;->e:Ljava/util/List;

    iget-object v1, p0, Lo/dmv;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, [F

    .line 411
    const-string v0, "breathe_max_heartrate"

    const/4 v1, 0x7

    aget v1, v7, v1

    float-to-double v1, v1

    invoke-virtual {v5, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 412
    const-string v0, "breathe_min_heartrate"

    const/16 v1, 0x8

    aget v1, v7, v1

    float-to-double v1, v1

    invoke-virtual {v5, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 413
    const-string v0, "breathe_mean_heartrate"

    const/16 v1, 0x9

    aget v1, v7, v1

    float-to-double v1, v1

    invoke-virtual {v5, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 414
    const-string v0, "breathe_front_pressure"

    const/16 v1, 0x28

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 415
    const-string v0, "breathe_rear_pressure"

    const/16 v1, 0x14

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 416
    const-string v0, "breathe_delta_pressure"

    const/16 v1, 0x14

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 417
    const-string v0, "breathe_algorithm_ver"

    const/16 v1, 0xa

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 418
    const-string v0, "breathe_total_score"

    const/4 v1, 0x0

    aget v1, v7, v1

    float-to-double v1, v1

    invoke-virtual {v5, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 419
    const-string v0, "breathe_total_grade"

    const/4 v1, 0x1

    aget v1, v7, v1

    float-to-double v1, v1

    invoke-virtual {v5, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 420
    const-string v0, "before_heartrate"

    const/16 v1, 0x9

    aget v1, v6, v1

    float-to-double v1, v1

    invoke-virtual {v5, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 421
    const-string v0, "after_heartrate"

    const/16 v1, 0x9

    aget v1, v7, v1

    float-to-double v1, v1

    invoke-virtual {v5, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 423
    const/16 v0, 0x9

    aget v0, v6, v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_4

    const/16 v0, 0x9

    aget v0, v7, v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    aget v0, v7, v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_6

    .line 424
    :cond_4
    invoke-virtual {p0}, Lo/dmv;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 425
    const/4 v0, 0x2

    iput v0, p0, Lo/dmv;->u:I

    goto :goto_2

    .line 427
    :cond_5
    const/4 v0, 0x3

    iput v0, p0, Lo/dmv;->u:I

    .line 431
    :cond_6
    :goto_2
    iget v0, p0, Lo/dmv;->u:I

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 432
    invoke-direct {p0}, Lo/dmv;->a()V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 437
    goto :goto_3

    .line 435
    :catch_1
    move-exception v6

    .line 436
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "breatheClose "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 437
    goto :goto_3

    .line 439
    :cond_7
    if-eqz p1, :cond_8

    .line 440
    iget v0, p0, Lo/dmv;->u:I

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 442
    :cond_8
    invoke-direct {p0}, Lo/dmv;->a()V

    .line 445
    :goto_3
    return-void
.end method

.method static synthetic c(Lo/dmv;I)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lo/dmv;->b(I)V

    return-void
.end method

.method static synthetic c(Lo/dmv;Lorg/json/JSONObject;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lo/dmv;->a(Lorg/json/JSONObject;)V

    return-void
.end method

.method static synthetic d(Lo/dmv;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/dmv;->v:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method static synthetic d()Ljava/util/List;
    .locals 1

    .line 59
    sget-object v0, Lo/dmv;->f:Ljava/util/List;

    return-object v0
.end method

.method private d(I)V
    .locals 2

    .line 535
    iget-object v0, p0, Lo/dmv;->p:[F

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dmv;->p:[F

    aget v0, v0, p1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 536
    iget-object v0, p0, Lo/dmv;->i:Ljava/util/List;

    iget-object v1, p0, Lo/dmv;->p:[F

    aget v1, v1, p1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 538
    :cond_0
    return-void
.end method

.method private d(Landroid/app/Activity;)V
    .locals 1

    .line 132
    iget-object v0, p0, Lo/dmv;->c:Lo/egw;

    if-nez v0, :cond_0

    .line 133
    invoke-virtual {p0, p1}, Lo/dmv;->b(Landroid/app/Activity;)V

    .line 135
    :cond_0
    iget-object v0, p0, Lo/dmv;->c:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 136
    iget-object v0, p0, Lo/dmv;->c:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 138
    :cond_1
    return-void
.end method

.method public static e()Lo/dmv;
    .locals 1

    .line 198
    invoke-static {}, Lo/dmv$d;->a()Lo/dmv;

    move-result-object v0

    return-object v0
.end method

.method private e(I)V
    .locals 5

    .line 659
    add-int/lit8 v4, p1, 0x8

    .line 660
    iget-object v0, p0, Lo/dmv;->k:Lo/dmv$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 661
    iget-object v0, p0, Lo/dmv;->k:Lo/dmv$a;

    mul-int/lit16 v1, v4, 0x3e8

    int-to-long v1, v1

    const/16 v3, 0x2711

    invoke-virtual {v0, v3, v1, v2}, Lo/dmv$a;->sendEmptyMessageDelayed(IJ)Z

    .line 663
    :cond_0
    return-void
.end method

.method static synthetic e(Lo/dmv;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Lo/dmv;->b()V

    return-void
.end method

.method static synthetic e(Lo/dmv;I)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lo/dmv;->d(I)V

    return-void
.end method

.method static synthetic e(Lo/dmv;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lo/dmv;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method static synthetic e(Lo/dmv;Z)Z
    .locals 0

    .line 59
    iput-boolean p1, p0, Lo/dmv;->m:Z

    return p1
.end method

.method private e(Ljava/util/List;)[I
    .locals 3

    .line 280
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [I

    .line 281
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 282
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v1, v2

    .line 281
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 284
    :cond_0
    return-object v1
.end method

.method static synthetic i(Lo/dmv;)Lo/flc;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/dmv;->r:Lo/flc;

    return-object v0
.end method


# virtual methods
.method public b(Landroid/app/Activity;)V
    .locals 6

    .line 141
    sget v0, Lcom/huawei/hwstressmgr/R$layout;->pressure_device_connect:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 142
    sget v0, Lcom/huawei/hwstressmgr/R$id;->pressure_device_no_connect:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 143
    sget v0, Lcom/huawei/hwstressmgr/R$string;->IDS_plugin_breathe_stop_tip:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    sget v0, Lcom/huawei/hwstressmgr/R$id;->hw_health_agree_dialog_pressure:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout;

    .line 145
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 146
    new-instance v0, Lo/egw$c;

    invoke-direct {v0, p1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 147
    invoke-virtual {v0, v3}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/hwstressmgr/R$string;->IDS_settings_button_ok:I

    .line 148
    invoke-virtual {p1, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/dmv$4;

    invoke-direct {v2, p0, p1}, Lo/dmv$4;-><init>(Lo/dmv;Landroid/app/Activity;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/hwstressmgr/R$string;->IDS_settings_button_cancal:I

    .line 155
    invoke-virtual {p1, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/dmv$5;

    invoke-direct {v2, p0}, Lo/dmv$5;-><init>(Lo/dmv;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 160
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lo/dmv;->c:Lo/egw;

    .line 161
    return-void
.end method

.method public c()I
    .locals 5

    .line 296
    iget-object v0, p0, Lo/dmv;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 297
    iget-object v0, p0, Lo/dmv;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 298
    const/4 v4, 0x0

    .line 299
    iget-object v0, p0, Lo/dmv;->r:Lo/flc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 300
    iget-object v0, p0, Lo/dmv;->r:Lo/flc;

    invoke-interface {v0}, Lo/flc;->c()Z

    move-result v4

    .line 302
    :cond_0
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "janus device connected "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    if-eqz v4, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c(Landroid/app/Activity;)I
    .locals 4

    .line 115
    iget v0, p0, Lo/dmv;->n:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 116
    const/4 v0, 0x1

    return v0

    .line 117
    :cond_0
    iget v0, p0, Lo/dmv;->n:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 118
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "show stop breathe_dialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    if-eqz p1, :cond_1

    .line 121
    invoke-direct {p0, p1}, Lo/dmv;->d(Landroid/app/Activity;)V

    .line 124
    :cond_1
    const/4 v0, 0x2

    return v0

    .line 126
    :cond_2
    const/4 v0, 0x3

    return v0
.end method

.method public c(IIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 308
    iput p1, p0, Lo/dmv;->n:I

    .line 309
    iput-object p4, p0, Lo/dmv;->t:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 310
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dmv;->c:Lo/egw;

    .line 311
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 313
    :pswitch_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/dmv;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 314
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dmv;->m:Z

    .line 315
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dmv;->p:[F

    .line 316
    goto :goto_1

    .line 318
    :pswitch_1
    invoke-direct {p0, p2, p3, p4}, Lo/dmv;->b(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 319
    goto :goto_1

    .line 321
    :pswitch_2
    invoke-direct {p0, p4}, Lo/dmv;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 322
    goto :goto_1

    .line 324
    :pswitch_3
    invoke-direct {p0, p4}, Lo/dmv;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 325
    goto :goto_1

    .line 327
    :goto_0
    invoke-direct {p0, p4}, Lo/dmv;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 328
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "breathControl default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public e(Lo/flc;)V
    .locals 4

    .line 202
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerBreatheCallback() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    iput-object p1, p0, Lo/dmv;->r:Lo/flc;

    .line 204
    return-void
.end method

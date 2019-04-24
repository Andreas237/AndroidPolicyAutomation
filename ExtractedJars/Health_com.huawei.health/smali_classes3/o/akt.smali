.class public Lo/akt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/akt$e;
    }
.end annotation


# instance fields
.field private C:Lo/dnd;

.field private a:I

.field private b:Ljava/lang/String;

.field private c:I

.field private d:I

.field private e:I

.field private f:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private g:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private h:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private i:I

.field private k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private l:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private m:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private o:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private q:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private t:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private v:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private w:Lo/flc;

.field private x:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private y:Lo/bvm;

.field private z:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    const/4 v0, -0x1

    iput v0, p0, Lo/akt;->c:I

    .line 63
    const/4 v0, 0x0

    iput v0, p0, Lo/akt;->d:I

    .line 64
    const/4 v0, 0x1

    iput v0, p0, Lo/akt;->a:I

    .line 65
    const/4 v0, 0x2

    iput v0, p0, Lo/akt;->e:I

    .line 67
    const-string v0, ""

    iput-object v0, p0, Lo/akt;->b:Ljava/lang/String;

    .line 77
    const/4 v0, -0x2

    iput v0, p0, Lo/akt;->i:I

    .line 99
    new-instance v0, Lo/akt$5;

    invoke-direct {v0, p0}, Lo/akt$5;-><init>(Lo/akt;)V

    iput-object v0, p0, Lo/akt;->k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 136
    new-instance v0, Lo/akt$12;

    invoke-direct {v0, p0}, Lo/akt$12;-><init>(Lo/akt;)V

    iput-object v0, p0, Lo/akt;->f:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 162
    new-instance v0, Lo/akt$13;

    invoke-direct {v0, p0}, Lo/akt$13;-><init>(Lo/akt;)V

    iput-object v0, p0, Lo/akt;->h:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 245
    new-instance v0, Lo/akt$15;

    invoke-direct {v0, p0}, Lo/akt$15;-><init>(Lo/akt;)V

    iput-object v0, p0, Lo/akt;->g:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 265
    new-instance v0, Lo/akt$11;

    invoke-direct {v0, p0}, Lo/akt$11;-><init>(Lo/akt;)V

    iput-object v0, p0, Lo/akt;->p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 421
    new-instance v0, Lo/akt$16;

    invoke-direct {v0, p0}, Lo/akt$16;-><init>(Lo/akt;)V

    iput-object v0, p0, Lo/akt;->o:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 433
    new-instance v0, Lo/akt$20;

    invoke-direct {v0, p0}, Lo/akt$20;-><init>(Lo/akt;)V

    iput-object v0, p0, Lo/akt;->l:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 500
    new-instance v0, Lo/akt$19;

    invoke-direct {v0, p0}, Lo/akt$19;-><init>(Lo/akt;)V

    iput-object v0, p0, Lo/akt;->m:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 517
    new-instance v0, Lo/akt$17;

    invoke-direct {v0, p0}, Lo/akt$17;-><init>(Lo/akt;)V

    iput-object v0, p0, Lo/akt;->n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 533
    new-instance v0, Lo/akt$2;

    invoke-direct {v0, p0}, Lo/akt$2;-><init>(Lo/akt;)V

    iput-object v0, p0, Lo/akt;->s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 592
    new-instance v0, Lo/akt$4;

    invoke-direct {v0, p0}, Lo/akt$4;-><init>(Lo/akt;)V

    iput-object v0, p0, Lo/akt;->t:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 636
    new-instance v0, Lo/akt$1;

    invoke-direct {v0, p0}, Lo/akt$1;-><init>(Lo/akt;)V

    iput-object v0, p0, Lo/akt;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 667
    new-instance v0, Lo/akt$3;

    invoke-direct {v0, p0}, Lo/akt$3;-><init>(Lo/akt;)V

    iput-object v0, p0, Lo/akt;->x:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 675
    new-instance v0, Lo/akt$10;

    invoke-direct {v0, p0}, Lo/akt$10;-><init>(Lo/akt;)V

    iput-object v0, p0, Lo/akt;->v:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 683
    new-instance v0, Lo/akt$6;

    invoke-direct {v0, p0}, Lo/akt$6;-><init>(Lo/akt;)V

    iput-object v0, p0, Lo/akt;->z:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    .line 743
    new-instance v0, Lo/akt$9;

    invoke-direct {v0, p0}, Lo/akt$9;-><init>(Lo/akt;)V

    iput-object v0, p0, Lo/akt;->y:Lo/bvm;

    .line 765
    new-instance v0, Lo/akt$7;

    invoke-direct {v0, p0}, Lo/akt$7;-><init>(Lo/akt;)V

    iput-object v0, p0, Lo/akt;->w:Lo/flc;

    .line 809
    new-instance v0, Lo/akt$8;

    invoke-direct {v0, p0}, Lo/akt$8;-><init>(Lo/akt;)V

    iput-object v0, p0, Lo/akt;->C:Lo/dnd;

    .line 84
    return-void
.end method

.method synthetic constructor <init>(Lo/akt$5;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lo/akt;-><init>()V

    return-void
.end method

.method private a(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)I
    .locals 6

    .line 566
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "switchRunPostureReportStatus, 1 means open while 2 means close, sportStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 568
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchRunPostureReportStatus null == callback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 569
    const/4 v0, -0x2

    return v0

    .line 572
    :cond_0
    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    .line 573
    :cond_1
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchRunPostureReportStatus open"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 574
    :cond_2
    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x4

    if-ne p1, v0, :cond_4

    .line 575
    :cond_3
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchRunPostureReportStatus close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 578
    :cond_4
    :goto_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 580
    const-string v0, "status"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 583
    goto :goto_1

    .line 581
    :catch_0
    move-exception v5

    .line 582
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchRunPostureReportStatus = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 584
    :goto_1
    iput-object p2, p0, Lo/akt;->q:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 585
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/akt;->s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v4, v1}, Lo/aks;->b(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 587
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic a(Lo/akt;)Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lo/akt;->b:Ljava/lang/String;

    return-object v0
.end method

.method private a(Ljava/lang/Object;)V
    .locals 6

    .line 186
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 188
    const-string v0, "operator_type"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 193
    packed-switch v5, :pswitch_data_0

    goto :goto_0

    .line 195
    :pswitch_0
    invoke-direct {p0}, Lo/akt;->p()V

    .line 196
    goto :goto_0

    .line 198
    :pswitch_1
    invoke-direct {p0}, Lo/akt;->n()V

    .line 199
    goto :goto_0

    .line 201
    :pswitch_2
    invoke-direct {p0}, Lo/akt;->l()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 202
    .line 208
    :goto_0
    goto :goto_1

    .line 206
    :catch_0
    move-exception v4

    .line 207
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic b(Lo/akt;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lo/akt;->t()V

    return-void
.end method

.method static synthetic b(Lo/akt;Ljava/lang/Object;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lo/akt;->a(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic c(Lo/akt;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 51
    iput-object p1, p0, Lo/akt;->b:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lo/akt;)Z
    .locals 1

    .line 51
    invoke-direct {p0}, Lo/akt;->s()Z

    move-result v0

    return v0
.end method

.method public static final d()Lo/akt;
    .locals 1

    .line 87
    invoke-static {}, Lo/akt$e;->b()Lo/akt;

    move-result-object v0

    return-object v0
.end method

.method private d(I)V
    .locals 6

    .line 254
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 256
    const-string v0, "notification_status_response"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 259
    goto :goto_0

    .line 257
    :catch_0
    move-exception v5

    .line 258
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    :goto_0
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/akt;->g:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v4, v1}, Lo/aks;->h(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 262
    return-void
.end method

.method static synthetic d(Lo/akt;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lo/akt;->u()V

    return-void
.end method

.method static synthetic e(Lo/akt;)Z
    .locals 1

    .line 51
    invoke-direct {p0}, Lo/akt;->q()Z

    move-result v0

    return v0
.end method

.method static synthetic f(Lo/akt;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 51
    iget-object v0, p0, Lo/akt;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method static synthetic h(Lo/akt;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lo/akt;->r()V

    return-void
.end method

.method static synthetic k(Lo/akt;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 51
    iget-object v0, p0, Lo/akt;->q:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private l()V
    .locals 2

    .line 213
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cbl;->b(Lo/ceu;)I

    move-result v0

    if-nez v0, :cond_0

    .line 215
    invoke-static {}, Lo/akq;->a()Lo/akq;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/akq;->c(Z)V

    .line 216
    const v0, 0x186a0

    invoke-direct {p0, v0}, Lo/akt;->d(I)V

    goto :goto_0

    .line 218
    :cond_0
    const v0, 0x1e07a

    invoke-direct {p0, v0}, Lo/akt;->d(I)V

    .line 219
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/akv;->b(Z)V

    .line 221
    :goto_0
    return-void
.end method

.method private n()V
    .locals 2

    .line 224
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->d()I

    move-result v0

    if-nez v0, :cond_0

    .line 226
    invoke-static {}, Lo/akq;->a()Lo/akq;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/akq;->c(Z)V

    .line 227
    const v0, 0x186a0

    invoke-direct {p0, v0}, Lo/akt;->d(I)V

    goto :goto_0

    .line 229
    :cond_0
    const v0, 0x1e07a

    invoke-direct {p0, v0}, Lo/akt;->d(I)V

    .line 230
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/akv;->b(Z)V

    .line 232
    :goto_0
    return-void
.end method

.method private p()V
    .locals 2

    .line 235
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->h()I

    move-result v0

    if-nez v0, :cond_0

    .line 237
    invoke-static {}, Lo/akq;->a()Lo/akq;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/akq;->c(Z)V

    .line 238
    const v0, 0x186a0

    invoke-direct {p0, v0}, Lo/akt;->d(I)V

    goto :goto_0

    .line 240
    :cond_0
    const v0, 0x1e07a

    invoke-direct {p0, v0}, Lo/akt;->d(I)V

    .line 241
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/akv;->b(Z)V

    .line 243
    :goto_0
    return-void
.end method

.method private q()Z
    .locals 8

    .line 359
    const/4 v4, 0x0

    .line 360
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0}, Lo/aks;->b()Ljava/util/List;

    move-result-object v5

    .line 361
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 362
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 363
    if-eqz v7, :cond_0

    .line 364
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 365
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 366
    const/4 v4, 0x1

    .line 369
    :cond_0
    goto :goto_0

    .line 371
    :cond_1
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isHuaweiHealthDeviceConnected res:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    return v4
.end method

.method private r()V
    .locals 6

    .line 646
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyDeviceHeartRateReportException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 648
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 650
    const-string v0, "heart_rate_response"

    const v1, 0x1e84a

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 653
    goto :goto_0

    .line 651
    :catch_0
    move-exception v5

    .line 652
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 655
    :goto_0
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/akt;->u:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v4, v1}, Lo/aks;->i(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 656
    return-void
.end method

.method private s()Z
    .locals 8

    .line 342
    const/4 v4, 0x0

    .line 343
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0}, Lo/aks;->a()Ljava/util/List;

    move-result-object v5

    .line 344
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 345
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 346
    if-eqz v7, :cond_0

    .line 347
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 348
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 349
    const/4 v4, 0x1

    .line 352
    :cond_0
    goto :goto_0

    .line 354
    :cond_1
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isHuaweiWearDeviceConnected res:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    return v4
.end method

.method private t()V
    .locals 4

    .line 407
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/akv;->a(I)V

    .line 409
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "--------------before delete----------------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v2

    invoke-virtual {v2}, Lo/akv;->k()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Lo/akr;->b()Lo/akr;

    move-result-object v2

    invoke-virtual {v2}, Lo/akr;->d()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    invoke-static {}, Lo/akr;->b()Lo/akr;

    move-result-object v0

    invoke-virtual {v0}, Lo/akr;->f()V

    .line 415
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "--------------after delete----------------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v2

    invoke-virtual {v2}, Lo/akv;->k()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Lo/akr;->b()Lo/akr;

    move-result-object v2

    invoke-virtual {v2}, Lo/akr;->d()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    return-void
.end method

.method private u()V
    .locals 4

    .line 393
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/akv;->a(I)V

    .line 395
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "--------------before add----------------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v2

    invoke-virtual {v2}, Lo/akv;->k()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Lo/akr;->b()Lo/akr;

    move-result-object v2

    invoke-virtual {v2}, Lo/akr;->d()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 399
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    invoke-virtual {v0}, Lo/akv;->f()V

    .line 401
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "--------------after add----------------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v2

    invoke-virtual {v2}, Lo/akv;->k()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Lo/akr;->b()Lo/akr;

    move-result-object v2

    invoke-virtual {v2}, Lo/akr;->d()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 4

    .line 529
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeRunPostureReport enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 530
    iget-object v0, p0, Lo/akt;->n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0, p1, v0}, Lo/akt;->a(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)I

    .line 531
    return-void
.end method

.method public a(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 389
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/aks;->g(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 390
    return-void
.end method

.method public a()Z
    .locals 4

    .line 377
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerBluetoothStateListener enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/akt;->p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/aks;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 380
    const/4 v0, 0x0

    return v0
.end method

.method public b(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 385
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/aks;->c(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 386
    return-void
.end method

.method public b()Z
    .locals 4

    .line 92
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerRealTimeGuidanceCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/akt;->k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/aks;->f(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 96
    const/4 v0, 0x0

    return v0
.end method

.method public c(I)I
    .locals 2

    .line 903
    const/4 v1, -0x1

    .line 904
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 906
    :pswitch_0
    const/16 v1, 0xa

    .line 907
    goto :goto_0

    .line 909
    :pswitch_1
    const/16 v1, 0x8

    .line 910
    goto :goto_0

    .line 912
    :pswitch_2
    const/16 v1, 0xe

    .line 913
    goto :goto_0

    .line 915
    :pswitch_3
    const/16 v1, 0x10

    .line 916
    goto :goto_0

    .line 918
    :pswitch_4
    const/16 v1, 0xf

    .line 919
    goto :goto_0

    .line 921
    :pswitch_5
    const/16 v1, 0xd

    .line 922
    goto :goto_0

    .line 924
    :pswitch_6
    const/16 v1, 0xc

    .line 925
    goto :goto_0

    .line 927
    :pswitch_7
    const/4 v1, 0x7

    .line 928
    goto :goto_0

    .line 930
    :pswitch_8
    const/4 v1, 0x1

    .line 931
    goto :goto_0

    .line 933
    :pswitch_9
    const/16 v1, 0xb

    .line 934
    goto :goto_0

    .line 936
    :pswitch_a
    const/4 v1, 0x0

    .line 937
    goto :goto_0

    .line 939
    :pswitch_b
    const/4 v1, 0x5

    .line 940
    goto :goto_0

    .line 942
    :pswitch_c
    const/4 v1, 0x3

    .line 943
    goto :goto_0

    .line 945
    :pswitch_d
    const/4 v1, -0x2

    .line 946
    .line 950
    :goto_0
    :pswitch_e
    return v1

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_a
        :pswitch_8
        :pswitch_d
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_b
        :pswitch_c
        :pswitch_e
        :pswitch_e
        :pswitch_7
        :pswitch_e
        :pswitch_1
        :pswitch_5
        :pswitch_9
        :pswitch_6
        :pswitch_2
        :pswitch_0
        :pswitch_4
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_3
    .end packed-switch
.end method

.method public c(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)I
    .locals 9

    .line 457
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "switchHeartRateReport, 1 means open while 2 means close, hearRateSwitch = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 460
    invoke-static {}, Lo/akr;->b()Lo/akr;

    move-result-object v0

    invoke-virtual {v0}, Lo/akr;->a()Lo/acl;

    move-result-object v0

    if-nez v0, :cond_0

    .line 461
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchHeartRateReport NO_AVAILABLE_DEVICE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    iget v0, p0, Lo/akt;->c:I

    return v0

    .line 465
    :cond_0
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    invoke-virtual {v0}, Lo/akv;->a()Z

    move-result v4

    .line 468
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    invoke-virtual {v0}, Lo/akv;->d()Z

    move-result v5

    .line 469
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    invoke-virtual {v0}, Lo/akv;->h()Z

    move-result v6

    .line 471
    if-nez v6, :cond_1

    .line 472
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current device not support heart rate report"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    iget v0, p0, Lo/akt;->d:I

    return v0

    .line 475
    :cond_1
    if-eqz v5, :cond_2

    .line 477
    if-nez v4, :cond_2

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 478
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current status is not linking"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    iget v0, p0, Lo/akt;->a:I

    return v0

    .line 484
    :cond_2
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchHeartRateReport is linking"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 486
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 488
    const-string v0, "status"

    :try_start_0
    invoke-virtual {v7, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 491
    goto :goto_0

    .line 489
    :catch_0
    move-exception v8

    .line 490
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 493
    :goto_0
    iput-object p2, p0, Lo/akt;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 494
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/akt;->t:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v7, v1}, Lo/aks;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 497
    iget v0, p0, Lo/akt;->e:I

    return v0
.end method

.method public c()Z
    .locals 2

    .line 158
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/akt;->h:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/aks;->k(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 159
    const/4 v0, 0x1

    return v0
.end method

.method public d(Ljava/lang/String;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 883
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 884
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 885
    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 886
    array-length v0, v5

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 887
    return-object v4

    .line 890
    :cond_0
    move-object v6, v5

    :try_start_0
    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    .line 891
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    .line 892
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 893
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unbind devicetype:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 890
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 897
    :cond_1
    goto :goto_1

    .line 895
    :catch_0
    move-exception v6

    .line 896
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "number exception,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 899
    :cond_2
    :goto_1
    return-object v4
.end method

.method public d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 9

    .line 827
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHuaweiWearDeviceListForV2 enter, types:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 828
    invoke-virtual {p0, p1}, Lo/akt;->d(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 830
    :try_start_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 831
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->C(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 832
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0}, Lo/aks;->c()Ljava/util/List;

    move-result-object v6

    .line 833
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 834
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 835
    return-void

    .line 837
    :cond_0
    :try_start_1
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 838
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    .line 839
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/akt;->c(I)I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setProductType(I)V

    .line 840
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHuaweiWearDeviceListForV2 dev type is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 841
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 842
    const/4 v0, 0x3

    invoke-virtual {v8, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 843
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 844
    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 847
    :cond_1
    goto :goto_0

    .line 848
    :cond_2
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHuaweiWearDeviceListForV2 dev size is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 849
    const/4 v0, 0x0

    invoke-interface {p2, v0, v5}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 850
    goto :goto_1

    .line 851
    :cond_3
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    new-instance v1, Lo/akt$14;

    invoke-direct {v1, p0, v4, v5, p2}, Lo/akt$14;-><init>(Lo/akt;Ljava/util/List;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/aks;->g(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 879
    :goto_1
    goto :goto_2

    .line 877
    :catch_0
    move-exception v5

    .line 878
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 880
    :goto_2
    return-void
.end method

.method public e(I)V
    .locals 4

    .line 514
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openRunPostureReport enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 515
    iget-object v0, p0, Lo/akt;->m:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0, p1, v0}, Lo/akt;->a(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)I

    .line 516
    return-void
.end method

.method public e()Z
    .locals 4

    .line 129
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerVoicePlayCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/akt;->f:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/aks;->m(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 133
    const/4 v0, 0x0

    return v0
.end method

.method public f()V
    .locals 2

    .line 443
    iget-object v0, p0, Lo/akt;->o:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lo/akt;->c(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)I

    move-result v0

    iput v0, p0, Lo/akt;->i:I

    .line 444
    return-void
.end method

.method public g()I
    .locals 1

    .line 452
    iget v0, p0, Lo/akt;->i:I

    return v0
.end method

.method public h()V
    .locals 2

    .line 659
    invoke-static {}, Lo/yy;->b()Lo/yy;

    move-result-object v0

    iget-object v1, p0, Lo/akt;->z:Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    invoke-virtual {v0, v1}, Lo/yy;->e(Lcom/huawei/exercise/modle/IExerciseAdviceCallback;)V

    .line 660
    return-void
.end method

.method public i()V
    .locals 2

    .line 447
    const/4 v0, -0x2

    iput v0, p0, Lo/akt;->i:I

    .line 448
    iget-object v0, p0, Lo/akt;->l:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x2

    invoke-virtual {p0, v1, v0}, Lo/akt;->c(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)I

    .line 449
    return-void
.end method

.method public k()V
    .locals 2

    .line 663
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/akt;->x:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/aks;->p(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 664
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/akt;->v:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/aks;->o(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 665
    return-void
.end method

.method public m()V
    .locals 2

    .line 734
    invoke-static {}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a()Lcom/huawei/hwstressmgr/StressAppInteractor;

    move-result-object v0

    iget-object v1, p0, Lo/akt;->C:Lo/dnd;

    invoke-virtual {v0, v1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->c(Lo/dnd;)V

    .line 735
    invoke-static {}, Lo/dmv;->e()Lo/dmv;

    move-result-object v0

    iget-object v1, p0, Lo/akt;->w:Lo/flc;

    invoke-virtual {v0, v1}, Lo/dmv;->e(Lo/flc;)V

    .line 736
    return-void
.end method

.method public o()V
    .locals 4

    .line 739
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerFitnessCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 740
    invoke-static {}, Lo/bvc;->c()Lo/bvc;

    move-result-object v0

    iget-object v1, p0, Lo/akt;->y:Lo/bvm;

    invoke-virtual {v0, v1}, Lo/bvc;->c(Lo/bvm;)V

    .line 741
    return-void
.end method

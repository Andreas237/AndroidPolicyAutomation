.class public Lo/ccc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:J

.field private c:Lo/dcy;

.field private d:I

.field private e:I

.field private f:Lo/cee;

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:I

.field private k:I

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:J

.field private q:I

.field private r:Z

.field private s:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Float;>;>;"
        }
    .end annotation
.end field

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Z


# direct methods
.method public constructor <init>(II)V
    .locals 5

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const/16 v0, 0x102

    iput v0, p0, Lo/ccc;->a:I

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lo/ccc;->e:I

    .line 41
    const/16 v0, 0x3e8

    iput v0, p0, Lo/ccc;->d:I

    .line 43
    const-wide/32 v0, 0x493e0

    iput-wide v0, p0, Lo/ccc;->b:J

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/ccc;->k:I

    .line 54
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccc;->g:Z

    .line 55
    const/16 v0, 0xb0

    iput v0, p0, Lo/ccc;->i:I

    .line 56
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ccc;->p:J

    .line 57
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccc;->n:Z

    .line 58
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccc;->o:Z

    .line 61
    const/4 v0, -0x1

    iput v0, p0, Lo/ccc;->q:I

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    .line 66
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccc;->u:Z

    .line 67
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccc;->t:Z

    .line 68
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccc;->r:Z

    .line 69
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccc;->v:Z

    .line 70
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccc;->w:Z

    .line 77
    const-string v0, "Track_TrackVoiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "new TrackVoiceManager"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    iput p1, p0, Lo/ccc;->a:I

    .line 79
    iput p2, p0, Lo/ccc;->q:I

    .line 80
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ccc;->l:Z

    .line 81
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ccc;->m:Z

    .line 83
    new-instance v0, Lo/dcy;

    invoke-direct {v0}, Lo/dcy;-><init>()V

    iput-object v0, p0, Lo/ccc;->c:Lo/dcy;

    .line 84
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ccc;->h:Ljava/lang/String;

    .line 85
    new-instance v0, Lo/cee;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/ccc;->c:Lo/dcy;

    iget-object v3, p0, Lo/ccc;->h:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lo/cee;-><init>(Landroid/content/Context;Lo/dcy;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ccc;->f:Lo/cee;

    .line 86
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->c()Lo/cbp;

    move-result-object v4

    .line 87
    if-eqz v4, :cond_0

    .line 88
    invoke-interface {v4}, Lo/cbp;->i()Z

    move-result v0

    iput-boolean v0, p0, Lo/ccc;->g:Z

    .line 89
    invoke-interface {v4}, Lo/cbp;->g()I

    move-result v0

    iput v0, p0, Lo/ccc;->i:I

    .line 90
    const-string v0, "Track_TrackVoiceManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TrackVoiceManager isWarningEnble is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/ccc;->g:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", warningLimit is  "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/ccc;->i:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    :cond_0
    return-void
.end method

.method private a(FFI)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFI)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 507
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 508
    const-string v0, "countDownDistance"

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 509
    const-string v0, "distance"

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    const-string v0, "intelligent"

    int-to-float v1, p3

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 511
    return-object v2
.end method

.method private a(FLjava/util/ArrayList;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FLjava/util/ArrayList<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Float;>;>;)Z"
        }
    .end annotation

    .line 515
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const-string v1, "countDownDistance"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 516
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const-string v1, "countDownDistance"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 517
    const/4 v0, 0x1

    return v0

    .line 519
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private a(J)Z
    .locals 3

    .line 270
    invoke-virtual {p0, p1, p2}, Lo/ccc;->c(J)F

    move-result v2

    .line 271
    iget v0, p0, Lo/ccc;->a:I

    const/16 v1, 0x103

    if-ne v0, v1, :cond_0

    const/high16 v0, 0x41f00000    # 30.0f

    cmpl-float v0, v2, v0

    if-lez v0, :cond_0

    .line 272
    const/4 v0, 0x1

    return v0

    .line 273
    :cond_0
    iget v0, p0, Lo/ccc;->a:I

    const/16 v1, 0x102

    if-eq v0, v1, :cond_1

    iget v0, p0, Lo/ccc;->a:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_2

    :cond_1
    const/high16 v0, 0x41400000    # 12.0f

    cmpl-float v0, v2, v0

    if-lez v0, :cond_2

    .line 275
    const/4 v0, 0x1

    return v0

    .line 276
    :cond_2
    iget v0, p0, Lo/ccc;->a:I

    const/16 v1, 0x101

    if-ne v0, v1, :cond_3

    const/high16 v0, 0x40e00000    # 7.0f

    cmpl-float v0, v2, v0

    if-lez v0, :cond_3

    .line 277
    const/4 v0, 0x1

    return v0

    .line 280
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method private b(FLjava/util/Map;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FLjava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;)Z"
        }
    .end annotation

    .line 383
    iget-boolean v0, p0, Lo/ccc;->o:Z

    if-nez v0, :cond_1

    const v0, 0x46a4d300    # 21097.5f

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_1

    .line 384
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccc;->o:Z

    .line 385
    const v0, 0x46ad10bf

    cmpg-float v0, p1, v0

    if-gez v0, :cond_1

    .line 386
    const-wide/16 v4, -0x1

    .line 387
    const-wide v0, 0x403518f5c28f5c29L    # 21.0975

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 388
    const-wide v0, 0x403518f5c28f5c29L    # 21.0975

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    double-to-long v4, v0

    .line 390
    :cond_0
    const-string v0, "Track_TrackVoiceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "playMarathonFinish marathonDuration is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    invoke-virtual {p0, v4, v5}, Lo/ccc;->b(J)V

    .line 392
    const/4 v0, 0x1

    return v0

    .line 395
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private c(I)F
    .locals 2

    .line 358
    int-to-float v0, p1

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    return v0
.end method

.method private c(IJJZI)Landroid/os/Bundle;
    .locals 3

    .line 335
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 336
    const-string v0, "sportType"

    iget v1, p0, Lo/ccc;->a:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 337
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 338
    const-string v0, "distance"

    invoke-direct {p0, p1}, Lo/ccc;->h(I)F

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    goto :goto_0

    .line 340
    :cond_0
    const-string v0, "distance"

    invoke-direct {p0, p1}, Lo/ccc;->c(I)F

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 343
    :goto_0
    const-string v0, "duration"

    invoke-virtual {v2, v0, p2, p3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 344
    const-string v0, "pace"

    invoke-virtual {v2, v0, p4, p5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 345
    if-eqz p6, :cond_1

    .line 346
    const-string v0, "paceTip"

    invoke-direct {p0, p4, p5}, Lo/ccc;->a(J)Z

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 348
    :cond_1
    const-string v0, "heartRate"

    invoke-virtual {v2, v0, p7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 350
    const-string v0, "voice_distance"

    iget-boolean v1, p0, Lo/ccc;->u:Z

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 351
    const-string v0, "voice_speed_time"

    iget-boolean v1, p0, Lo/ccc;->t:Z

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 352
    const-string v0, "voice_pace"

    iget-boolean v1, p0, Lo/ccc;->r:Z

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 353
    const-string v0, "voice_heart_rate"

    iget-boolean v1, p0, Lo/ccc;->v:Z

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 354
    return-object v2
.end method

.method private d(FLjava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FLjava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;)V"
        }
    .end annotation

    .line 401
    iget-boolean v0, p0, Lo/ccc;->n:Z

    if-nez v0, :cond_1

    const v0, 0x4724d300    # 42195.0f

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_1

    .line 402
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccc;->n:Z

    .line 404
    const v0, 0x472d10bf

    cmpg-float v0, p1, v0

    if-gez v0, :cond_1

    .line 405
    const-wide/16 v4, -0x1

    .line 406
    const-wide v0, 0x403518f5c28f5c29L    # 21.0975

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 407
    const-wide v0, 0x403518f5c28f5c29L    # 21.0975

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    double-to-long v4, v0

    .line 409
    :cond_0
    const-string v0, "Track_TrackVoiceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "playMarathonFinish marathonDuration is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    invoke-virtual {p0, v4, v5}, Lo/ccc;->e(J)V

    .line 413
    :cond_1
    return-void
.end method

.method private d(I)V
    .locals 2

    .line 238
    iget-boolean v0, p0, Lo/ccc;->w:Z

    if-eqz v0, :cond_1

    .line 239
    const/16 v0, 0x102

    if-ne p1, v0, :cond_0

    .line 240
    const/16 v0, 0x15

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ccc;->e(ILjava/io/Serializable;)V

    goto :goto_0

    .line 242
    :cond_0
    const/16 v0, 0x16

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ccc;->e(ILjava/io/Serializable;)V

    .line 245
    :cond_1
    :goto_0
    return-void
.end method

.method private d(Ljava/lang/String;)Z
    .locals 4

    .line 157
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 158
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 157
    invoke-static {v0, v1, p1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 159
    if-eqz v2, :cond_0

    const-string v0, ""

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 160
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 164
    :cond_1
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 165
    const/4 v0, 0x1

    return v0

    .line 169
    :cond_2
    goto :goto_0

    .line 167
    :catch_0
    move-exception v3

    .line 168
    const/4 v0, 0x1

    return v0

    .line 170
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private e(ILjava/io/Serializable;)V
    .locals 3

    .line 289
    iget-object v0, p0, Lo/ccc;->f:Lo/cee;

    invoke-virtual {v0}, Lo/cee;->b()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 290
    new-instance v2, Landroid/content/Intent;

    const-string v0, "action_play_voice"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 291
    const-string v0, "SPEAK_TYPE"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 292
    const-string v0, "SPEAK_PARAMETER"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 293
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v2}, Lo/ccd;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 295
    :cond_0
    return-void
.end method

.method private g(I)F
    .locals 3

    .line 523
    invoke-direct {p0, p1}, Lo/ccc;->k(I)V

    .line 524
    iget-object v0, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 525
    iget-object v0, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const-string v1, "distance"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    return v0

    .line 527
    :cond_0
    const/high16 v0, -0x40800000    # -1.0f

    return v0
.end method

.method private h(I)F
    .locals 4

    .line 362
    int-to-double v0, p1

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method private k()V
    .locals 4

    .line 142
    const-string v0, "voice_distance"

    invoke-direct {p0, v0}, Lo/ccc;->d(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lo/ccc;->u:Z

    .line 143
    const-string v0, "voice_speed_time"

    invoke-direct {p0, v0}, Lo/ccc;->d(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lo/ccc;->t:Z

    .line 144
    const-string v0, "voice_pace"

    invoke-direct {p0, v0}, Lo/ccc;->d(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lo/ccc;->r:Z

    .line 145
    const-string v0, "voice_heart_rate"

    invoke-direct {p0, v0}, Lo/ccc;->d(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lo/ccc;->v:Z

    .line 146
    const-string v0, "voice_intelligent"

    invoke-direct {p0, v0}, Lo/ccc;->d(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lo/ccc;->w:Z

    .line 147
    const-string v0, "Track_TrackVoiceManager"

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mVoiceDistance = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/ccc;->u:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mVoiceSpeedTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/ccc;->t:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " mVoicePace = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/ccc;->r:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, "mVoiceHeartRate = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/ccc;->v:Z

    .line 148
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, " mVoiceEncourage = "

    const/16 v3, 0x8

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/ccc;->w:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    .line 147
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    return-void
.end method

.method private k(I)V
    .locals 4

    .line 532
    iget-object v0, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 533
    iget-object v0, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_0
    if-lez v2, :cond_1

    .line 534
    iget-object v0, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    add-int/lit8 v1, v2, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const-string v1, "distance"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float v3, v0, v1

    .line 535
    int-to-float v0, p1

    const/high16 v1, 0x42c80000    # 100.0f

    add-float/2addr v1, v3

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 536
    iget-object v0, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    add-int/lit8 v1, v2, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 533
    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 540
    :cond_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 176
    iget v0, p0, Lo/ccc;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 178
    :pswitch_0
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ccc;->e(ILjava/io/Serializable;)V

    .line 179
    goto :goto_1

    .line 181
    :pswitch_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ccc;->e(ILjava/io/Serializable;)V

    .line 182
    goto :goto_1

    .line 187
    :goto_0
    :pswitch_2
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ccc;->e(ILjava/io/Serializable;)V

    .line 190
    :goto_1
    iget v0, p0, Lo/ccc;->a:I

    invoke-direct {p0, v0}, Lo/ccc;->d(I)V

    .line 191
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public a(Z)V
    .locals 0

    .line 458
    iput-boolean p1, p0, Lo/ccc;->l:Z

    .line 459
    return-void
.end method

.method public a(I)Z
    .locals 1

    .line 451
    const/16 v0, 0x64

    if-lt p1, v0, :cond_0

    iget-boolean v0, p0, Lo/ccc;->l:Z

    if-nez v0, :cond_0

    .line 452
    const/4 v0, 0x1

    return v0

    .line 454
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()V
    .locals 2

    .line 213
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ccc;->e(ILjava/io/Serializable;)V

    .line 214
    return-void
.end method

.method public b(I)V
    .locals 10

    .line 543
    iget-object v0, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 544
    return-void

    .line 547
    :cond_0
    iget v0, p0, Lo/ccc;->a:I

    const/16 v1, 0x102

    if-eq v0, v1, :cond_1

    iget v0, p0, Lo/ccc;->a:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_3

    .line 548
    :cond_1
    invoke-direct {p0, p1}, Lo/ccc;->g(I)F

    move-result v6

    .line 549
    const/4 v0, 0x0

    cmpl-float v0, v6, v0

    if-lez v0, :cond_3

    int-to-float v0, p1

    cmpl-float v0, v0, v6

    if-ltz v0, :cond_3

    .line 550
    iget-object v0, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v7, v0, -0x1

    .line 551
    iget-object v0, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 553
    iget-object v0, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map;

    .line 554
    iget-object v0, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 555
    new-instance v0, Lo/cek;

    const-string v1, "countDownDistance"

    invoke-interface {v8, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const-string v2, "distance"

    .line 556
    invoke-interface {v8, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    const-string v3, "intelligent"

    invoke-interface {v8, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v5

    const-wide/16 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/cek;-><init>(FFJI)V

    move-object v9, v0

    .line 557
    const/16 v0, 0x12

    invoke-direct {p0, v0, v9}, Lo/ccc;->e(ILjava/io/Serializable;)V

    .line 558
    goto :goto_0

    :cond_2
    iget-object v0, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_3

    .line 559
    iget-object v0, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map;

    .line 560
    iget-object v0, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 561
    new-instance v0, Lo/cek;

    const-string v1, "countDownDistance"

    invoke-interface {v8, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const-string v2, "distance"

    .line 562
    invoke-interface {v8, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    const-string v3, "intelligent"

    invoke-interface {v8, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v5

    const-wide/16 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/cek;-><init>(FFJI)V

    move-object v9, v0

    .line 563
    const/16 v0, 0x11

    invoke-direct {p0, v0, v9}, Lo/ccc;->e(ILjava/io/Serializable;)V

    .line 567
    :cond_3
    :goto_0
    return-void
.end method

.method public b(J)V
    .locals 7

    .line 227
    new-instance v0, Lo/cek;

    move-wide v3, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/cek;-><init>(FFJI)V

    move-object v6, v0

    .line 228
    const/16 v0, 0xd

    invoke-direct {p0, v0, v6}, Lo/ccc;->e(ILjava/io/Serializable;)V

    .line 229
    return-void
.end method

.method public b(JI)V
    .locals 4

    .line 100
    iget v0, p0, Lo/ccc;->q:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 101
    const/4 v0, 0x2

    iput v0, p0, Lo/ccc;->e:I

    .line 102
    const/16 v0, 0x3e8

    iput v0, p0, Lo/ccc;->d:I

    .line 103
    iget v0, p0, Lo/ccc;->d:I

    div-int v0, p3, v0

    iput v0, p0, Lo/ccc;->k:I

    .line 104
    const-string v0, "Track_TrackVoiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "useDefaultInterval = 1km"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    return-void

    .line 107
    :cond_0
    iget v0, p0, Lo/ccc;->a:I

    const/16 v1, 0x102

    if-ne v0, v1, :cond_2

    .line 108
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ccc;->o:Z

    .line 109
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ccc;->n:Z

    .line 110
    const/16 v0, 0x5269

    if-lt p3, v0, :cond_1

    .line 111
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccc;->o:Z

    .line 113
    :cond_1
    const v0, 0xa4d3

    if-lt p3, v0, :cond_2

    .line 114
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccc;->n:Z

    .line 118
    :cond_2
    iget-object v0, p0, Lo/ccc;->f:Lo/cee;

    invoke-virtual {v0}, Lo/cee;->k()I

    move-result v0

    iput v0, p0, Lo/ccc;->e:I

    .line 119
    iget v0, p0, Lo/ccc;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 120
    iget-object v0, p0, Lo/ccc;->f:Lo/cee;

    invoke-virtual {v0}, Lo/cee;->h()I

    move-result v0

    int-to-long v0, v0

    const-wide/32 v2, 0xea60

    mul-long/2addr v0, v2

    iput-wide v0, p0, Lo/ccc;->b:J

    .line 121
    iget-wide v0, p0, Lo/ccc;->b:J

    const-wide/32 v2, 0x493e0

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    .line 122
    const-wide/32 v0, 0x493e0

    iput-wide v0, p0, Lo/ccc;->b:J

    .line 124
    :cond_3
    iget-wide v0, p0, Lo/ccc;->b:J

    div-long v0, p1, v0

    long-to-int v0, v0

    iput v0, p0, Lo/ccc;->k:I

    goto :goto_0

    .line 125
    :cond_4
    iget v0, p0, Lo/ccc;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    .line 126
    iget-object v0, p0, Lo/ccc;->f:Lo/cee;

    invoke-virtual {v0}, Lo/cee;->f()I

    move-result v0

    iput v0, p0, Lo/ccc;->d:I

    .line 127
    iget v0, p0, Lo/ccc;->d:I

    const/16 v1, 0x1f4

    if-ge v0, v1, :cond_5

    .line 128
    const/16 v0, 0x1f4

    iput v0, p0, Lo/ccc;->d:I

    .line 130
    :cond_5
    iget v0, p0, Lo/ccc;->d:I

    div-int v0, p3, v0

    iput v0, p0, Lo/ccc;->k:I

    goto :goto_0

    .line 132
    :cond_6
    const/16 v0, 0x3e8

    iput v0, p0, Lo/ccc;->d:I

    .line 133
    iget v0, p0, Lo/ccc;->d:I

    div-int v0, p3, v0

    iput v0, p0, Lo/ccc;->k:I

    .line 136
    :goto_0
    invoke-direct {p0}, Lo/ccc;->k()V

    .line 138
    const-string v0, "Track_TrackVoiceManager"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ccc;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " distance = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/ccc;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " time = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/ccc;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " mPlayCount = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget v2, p0, Lo/ccc;->k:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    return-void
.end method

.method public c(J)F
    .locals 6

    .line 253
    const-string v0, "Track_TrackVoiceManager"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pace"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " mLastKiloTime speed="

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    long-to-float v0, p1

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float v4, v1, v0

    .line 255
    float-to-double v0, v4

    const-wide v2, 0x400ccccccccccccdL    # 3.6

    mul-double/2addr v0, v2

    double-to-float v5, v0

    .line 258
    const/high16 v0, 0x41200000    # 10.0f

    mul-float/2addr v0, v5

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float v5, v0, v1

    .line 260
    const-string v0, "Track_TrackVoiceManager"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pace"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " getLastKilSpeed speed kmph="

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    return v5
.end method

.method public c()V
    .locals 2

    .line 205
    iget v0, p0, Lo/ccc;->a:I

    const/16 v1, 0x108

    if-eq v0, v1, :cond_0

    iget v0, p0, Lo/ccc;->a:I

    const/16 v1, 0x102

    if-ne v0, v1, :cond_1

    .line 206
    :cond_0
    const/16 v0, 0x10

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ccc;->e(ILjava/io/Serializable;)V

    goto :goto_0

    .line 208
    :cond_1
    const/16 v0, 0xf

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ccc;->e(ILjava/io/Serializable;)V

    .line 211
    :goto_0
    return-void
.end method

.method public d()V
    .locals 2

    .line 198
    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ccc;->e(ILjava/io/Serializable;)V

    .line 199
    return-void
.end method

.method public d(FF)V
    .locals 8

    .line 472
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 473
    const/high16 v0, 0x447a0000    # 1000.0f

    div-float v5, p1, v0

    .line 474
    const/high16 v0, 0x40400000    # 3.0f

    cmpg-float v0, v5, v0

    if-gez v0, :cond_0

    .line 475
    const-string v0, "Track_TrackVoiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "targetCountDownList target is less than 3km"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 476
    return-void

    .line 478
    :cond_0
    iget v0, p0, Lo/ccc;->a:I

    const/16 v1, 0x102

    if-eq v0, v1, :cond_1

    iget v0, p0, Lo/ccc;->a:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_8

    .line 479
    :cond_1
    const/high16 v0, 0x3f000000    # 0.5f

    sub-float v0, v5, v0

    const/high16 v1, 0x3f000000    # 0.5f

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Lo/ccc;->a(FFI)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 480
    const/4 v6, 0x1

    :goto_0
    const/4 v0, 0x3

    if-gt v6, v0, :cond_3

    .line 481
    int-to-float v0, v6

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v5, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 482
    int-to-float v0, v6

    int-to-float v1, v6

    sub-float v1, v5, v1

    invoke-direct {p0, v0, v1, v6}, Lo/ccc;->a(FFI)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 480
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 485
    :cond_3
    const/high16 v0, 0x41200000    # 10.0f

    cmpl-float v0, v5, v0

    if-lez v0, :cond_5

    .line 486
    const/16 v6, 0x5a

    :goto_1
    const/16 v0, 0x32

    if-le v6, v0, :cond_5

    .line 487
    int-to-float v0, v6

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v0, v1, v0

    mul-float/2addr v0, v5

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v7, v0

    .line 488
    invoke-direct {p0, v7, v4}, Lo/ccc;->a(FLjava/util/ArrayList;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 489
    sub-float v0, v5, v7

    invoke-direct {p0, v7, v0, v6}, Lo/ccc;->a(FFI)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 486
    :cond_4
    add-int/lit8 v6, v6, -0xa

    goto :goto_1

    .line 493
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    .line 494
    const/4 v6, 0x0

    :goto_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_7

    .line 495
    const/high16 v0, 0x447a0000    # 1000.0f

    div-float v7, p2, v0

    .line 496
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const-string v1, "distance"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    cmpg-float v0, v7, v0

    if-gez v0, :cond_6

    .line 497
    iget-object v0, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 494
    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 501
    :cond_7
    const-string v0, "Track_TrackVoiceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "targetCountDownList is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ccc;->s:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 504
    :cond_8
    return-void
.end method

.method public d(FILjava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FILjava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;)V"
        }
    .end annotation

    .line 375
    invoke-direct {p0, p1, p3}, Lo/ccc;->b(FLjava/util/Map;)Z

    .line 376
    invoke-virtual {p0, p2}, Lo/ccc;->e(I)V

    .line 377
    invoke-direct {p0, p1, p3}, Lo/ccc;->d(FLjava/util/Map;)V

    .line 378
    float-to-int v0, p1

    invoke-virtual {p0, v0}, Lo/ccc;->b(I)V

    .line 379
    return-void
.end method

.method public d(Lo/cev;)V
    .locals 4

    .line 367
    iget-boolean v0, p0, Lo/ccc;->g:Z

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lo/cev;->e()J

    move-result-wide v0

    iget-wide v2, p0, Lo/ccc;->p:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3a98

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 368
    invoke-virtual {p1}, Lo/cev;->c()I

    move-result v0

    iget v1, p0, Lo/ccc;->i:I

    if-le v0, v1, :cond_0

    .line 369
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/ccc;->p:J

    .line 370
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ccc;->e(ILjava/io/Serializable;)V

    .line 372
    :cond_0
    return-void
.end method

.method public e()V
    .locals 2

    .line 194
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ccc;->e(ILjava/io/Serializable;)V

    .line 195
    return-void
.end method

.method public e(I)V
    .locals 1

    .line 463
    const/16 v0, 0x32

    if-lt p1, v0, :cond_0

    iget-boolean v0, p0, Lo/ccc;->m:Z

    if-nez v0, :cond_0

    .line 464
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccc;->m:Z

    .line 465
    const/16 v0, 0x37

    if-ge p1, v0, :cond_0

    .line 466
    invoke-virtual {p0}, Lo/ccc;->i()V

    .line 469
    :cond_0
    return-void
.end method

.method public e(IFFJF)V
    .locals 4

    .line 418
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 420
    :pswitch_0
    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr v0, p6

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_0

    .line 421
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccc;->l:Z

    .line 423
    :cond_0
    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr v0, p6

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_3

    .line 424
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccc;->m:Z

    goto :goto_0

    .line 428
    :pswitch_1
    const/high16 v0, 0x447a0000    # 1000.0f

    div-float v0, p6, v0

    cmpl-float v0, p3, v0

    if-ltz v0, :cond_1

    .line 429
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccc;->l:Z

    .line 431
    :cond_1
    const/high16 v0, 0x447a0000    # 1000.0f

    div-float v0, p6, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    cmpl-float v0, p3, v0

    if-ltz v0, :cond_3

    .line 432
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccc;->m:Z

    goto :goto_0

    .line 436
    :pswitch_2
    long-to-float v0, p4

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v1, p6

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_2

    .line 437
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccc;->l:Z

    .line 439
    :cond_2
    long-to-float v0, p4

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v1, p6

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_3

    .line 440
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccc;->m:Z

    .line 446
    :cond_3
    :goto_0
    const-string v0, "Track_TrackVoiceManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGoalStatus mGoalFinish is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/ccc;->l:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ,mHalfGoalFinish is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/ccc;->m:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 447
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public e(J)V
    .locals 7

    .line 232
    new-instance v0, Lo/cek;

    move-wide v3, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/cek;-><init>(FFJI)V

    move-object v6, v0

    .line 233
    const/16 v0, 0xc

    invoke-direct {p0, v0, v6}, Lo/ccc;->e(ILjava/io/Serializable;)V

    .line 234
    return-void
.end method

.method public e(JIJI)V
    .locals 11

    .line 298
    iget v0, p0, Lo/ccc;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 299
    iget-wide v0, p0, Lo/ccc;->b:J

    div-long v0, p1, v0

    iget v2, p0, Lo/ccc;->k:I

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_5

    .line 300
    iget-wide v0, p0, Lo/ccc;->b:J

    div-long v0, p1, v0

    long-to-int v0, v0

    iput v0, p0, Lo/ccc;->k:I

    .line 301
    move-object v0, p0

    move v1, p3

    iget-wide v2, p0, Lo/ccc;->b:J

    iget v4, p0, Lo/ccc;->k:I

    int-to-long v4, v4

    mul-long/2addr v2, v4

    move/from16 v7, p6

    const-wide/16 v4, -0x1

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v7}, Lo/ccc;->c(IJJZI)Landroid/os/Bundle;

    move-result-object v8

    .line 302
    new-instance v9, Lo/cem;

    invoke-direct {v9, v8}, Lo/cem;-><init>(Landroid/os/Bundle;)V

    .line 303
    const/16 v0, 0xb

    invoke-direct {p0, v0, v9}, Lo/ccc;->e(ILjava/io/Serializable;)V

    .line 304
    goto/16 :goto_0

    .line 306
    :cond_0
    iget v0, p0, Lo/ccc;->d:I

    div-int v0, p3, v0

    iget v1, p0, Lo/ccc;->k:I

    if-le v0, v1, :cond_5

    .line 308
    iget v0, p0, Lo/ccc;->d:I

    div-int v0, p3, v0

    iput v0, p0, Lo/ccc;->k:I

    .line 309
    const/16 v0, 0x3e8

    if-lt p3, v0, :cond_1

    iget v0, p0, Lo/ccc;->d:I

    const/16 v1, 0x1f4

    if-ne v0, v1, :cond_2

    iget v0, p0, Lo/ccc;->k:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    .line 311
    :cond_1
    const-wide/16 p4, -0x1

    .line 312
    new-instance v8, Lo/cem;

    move-object v0, p0

    iget v1, p0, Lo/ccc;->d:I

    iget v2, p0, Lo/ccc;->k:I

    mul-int/2addr v1, v2

    move-wide v2, p1

    move-wide v4, p4

    move/from16 v7, p6

    .line 313
    const-wide/16 v4, -0x1

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v7}, Lo/ccc;->c(IJJZI)Landroid/os/Bundle;

    move-result-object v0

    invoke-direct {v8, v0}, Lo/cem;-><init>(Landroid/os/Bundle;)V

    .line 314
    const/16 v0, 0xb

    invoke-direct {p0, v0, v8}, Lo/ccc;->e(ILjava/io/Serializable;)V

    .line 315
    goto :goto_0

    .line 316
    :cond_2
    move-wide v0, p4

    invoke-direct {p0, v0, v1}, Lo/ccc;->a(J)Z

    move-result v8

    .line 317
    div-int/lit16 v0, p3, 0x3e8

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 320
    iget-boolean v0, p0, Lo/ccc;->r:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lo/ccc;->t:Z

    if-eqz v0, :cond_4

    .line 321
    :cond_3
    const-wide/16 p4, -0x1

    .line 325
    :cond_4
    move-object v0, p0

    move v1, p3

    move-wide v2, p1

    move-wide v4, p4

    move v6, v8

    move/from16 v7, p6

    invoke-direct/range {v0 .. v7}, Lo/ccc;->c(IJJZI)Landroid/os/Bundle;

    move-result-object v9

    .line 326
    new-instance v10, Lo/cem;

    invoke-direct {v10, v9}, Lo/cem;-><init>(Landroid/os/Bundle;)V

    .line 328
    const/16 v0, 0x9

    invoke-direct {p0, v0, v10}, Lo/ccc;->e(ILjava/io/Serializable;)V

    .line 332
    :cond_5
    :goto_0
    return-void
.end method

.method public g()V
    .locals 2

    .line 217
    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ccc;->e(ILjava/io/Serializable;)V

    .line 218
    return-void
.end method

.method public i()V
    .locals 2

    .line 221
    const/16 v0, 0x13

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ccc;->e(ILjava/io/Serializable;)V

    .line 222
    return-void
.end method

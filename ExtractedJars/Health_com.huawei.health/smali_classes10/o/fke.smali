.class public Lo/fke;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fke$d;
    }
.end annotation


# instance fields
.field a:Lo/eey;

.field private b:Lo/fkh;

.field private c:Lo/cmx;

.field private d:Lo/eex;

.field private e:Lo/fkg;

.field private f:I

.field private g:Landroid/os/HandlerThread;

.field private h:I

.field private i:Lo/fke$d;

.field private k:Lcom/huawei/exercise/modle/ITreadmillStyleCallback;

.field private m:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fke;->c:Lo/cmx;

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fke;->k:Lcom/huawei/exercise/modle/ITreadmillStyleCallback;

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fke;->g:Landroid/os/HandlerThread;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fke;->i:Lo/fke$d;

    .line 40
    const/4 v0, 0x3

    iput v0, p0, Lo/fke;->f:I

    .line 41
    const/16 v0, 0x3e8

    iput v0, p0, Lo/fke;->h:I

    .line 42
    const/4 v0, 0x1

    iput v0, p0, Lo/fke;->m:I

    .line 90
    new-instance v0, Lo/fke$1;

    invoke-direct {v0, p0}, Lo/fke$1;-><init>(Lo/fke;)V

    iput-object v0, p0, Lo/fke;->a:Lo/eey;

    .line 53
    const-string v0, "Track_TreadmillManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " new TreadmillManager"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    iget-object v0, p0, Lo/fke;->b:Lo/fkh;

    if-nez v0, :cond_2

    .line 55
    invoke-static {p1}, Lo/fkh;->a(Landroid/content/Context;)Lo/fkh;

    move-result-object v0

    iput-object v0, p0, Lo/fke;->b:Lo/fkh;

    .line 56
    iget-object v0, p0, Lo/fke;->b:Lo/fkh;

    if-eqz v0, :cond_1

    .line 57
    new-instance v0, Lo/eex;

    invoke-direct {v0}, Lo/eex;-><init>()V

    iput-object v0, p0, Lo/fke;->d:Lo/eex;

    .line 58
    invoke-direct {p0}, Lo/fke;->d()V

    .line 59
    iget-object v0, p0, Lo/fke;->b:Lo/fkh;

    iget-object v1, p0, Lo/fke;->d:Lo/eex;

    iget-object v2, p0, Lo/fke;->a:Lo/eey;

    const/16 v3, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lo/fkh;->e(Lo/eex;Lo/eey;I)Z

    move-result v4

    .line 60
    if-eqz v4, :cond_0

    .line 62
    iget-object v0, p0, Lo/fke;->b:Lo/fkh;

    const/16 v1, 0x7530

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/fkh;->c(III)Z

    move-result v5

    .line 63
    const-string v0, "Track_TreadmillManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " TreadmillManager result of refreshWorkoutParameters:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    :cond_0
    const-string v0, "Track_TreadmillManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " TreadmillManager result of initAndStartVibraStepCount:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const-string v0, "Track_TreadmillManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance of VibraStepCounterHelper failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    :cond_2
    :goto_0
    new-instance v0, Lo/fkg;

    invoke-direct {v0}, Lo/fkg;-><init>()V

    iput-object v0, p0, Lo/fke;->e:Lo/fkg;

    .line 72
    iget-object v0, p0, Lo/fke;->e:Lo/fkg;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lo/fkg;->e(Landroid/content/Context;J)V

    .line 73
    const/4 v0, 0x1

    iput v0, p0, Lo/fke;->m:I

    .line 75
    return-void
.end method

.method static synthetic a(Lo/fke;)I
    .locals 1

    .line 27
    iget v0, p0, Lo/fke;->h:I

    return v0
.end method

.method private a()V
    .locals 5

    .line 159
    iget-object v0, p0, Lo/fke;->b:Lo/fkh;

    if-nez v0, :cond_0

    .line 160
    const-string v0, "Track_TreadmillManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "report2Callback vibraStepCounterHelper is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    return-void

    .line 166
    :cond_0
    iget-object v0, p0, Lo/fke;->c:Lo/cmx;

    if-eqz v0, :cond_1

    .line 169
    :try_start_0
    iget-object v0, p0, Lo/fke;->b:Lo/fkh;

    invoke-virtual {v0}, Lo/fkh;->d()I

    move-result v4

    .line 170
    const-string v0, "Track_TreadmillManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "report2Callback getCurrentsteps :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    iget-object v0, p0, Lo/fke;->c:Lo/cmx;

    iget v1, p0, Lo/fke;->f:I

    invoke-interface {v0, v4, v1}, Lo/cmx;->c(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    goto :goto_0

    .line 172
    :catch_0
    move-exception v4

    .line 173
    const-string v0, "Track_TreadmillManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic b(Lo/fke;)Lo/fkg;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/fke;->e:Lo/fkg;

    return-object v0
.end method

.method static synthetic b(Lo/fke;I)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lo/fke;->c(I)V

    return-void
.end method

.method private c(I)V
    .locals 5

    .line 180
    iget-object v0, p0, Lo/fke;->k:Lcom/huawei/exercise/modle/ITreadmillStyleCallback;

    if-eqz v0, :cond_0

    .line 183
    :try_start_0
    iget-object v0, p0, Lo/fke;->k:Lcom/huawei/exercise/modle/ITreadmillStyleCallback;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-interface {v0, p1, v1, v2}, Lcom/huawei/exercise/modle/ITreadmillStyleCallback;->onTreadmillStyleChange(IJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    goto :goto_0

    .line 184
    :catch_0
    move-exception v4

    .line 185
    const-string v0, "Track_TreadmillManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    goto :goto_0

    .line 188
    :cond_0
    const-string v0, "Track_TreadmillManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reportToTreadmillStyleCallback mTreadmillStyleCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/fke;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lo/fke;->a()V

    return-void
.end method

.method private d()V
    .locals 7

    .line 261
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/djl;->c(Landroid/content/Context;)Lo/dao;

    move-result-object v2

    .line 265
    const/4 v3, 0x1

    .line 267
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lo/dao;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 268
    const/4 v3, 0x0

    .line 271
    :cond_0
    const/16 v4, 0x3c

    .line 272
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lo/dao;->a()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 273
    invoke-virtual {v2}, Lo/dao;->a()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 276
    :cond_1
    const/16 v5, 0xaa

    .line 277
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lo/dao;->e()I

    move-result v0

    if-lez v0, :cond_2

    .line 278
    invoke-virtual {v2}, Lo/dao;->e()I

    move-result v5

    .line 280
    :cond_2
    iget-object v0, p0, Lo/fke;->d:Lo/eex;

    if-eqz v0, :cond_3

    .line 281
    iget-object v0, p0, Lo/fke;->d:Lo/eex;

    invoke-virtual {v0, v3, v4, v5}, Lo/eex;->b(III)Z

    .line 283
    const/4 v0, 0x5

    new-array v6, v0, [I

    .line 284
    const/16 v0, 0x5000

    const/4 v1, 0x0

    aput v0, v6, v1

    .line 285
    const/16 v0, 0x6e

    const/4 v1, 0x1

    aput v0, v6, v1

    .line 286
    const/16 v0, 0x2d0

    const/4 v1, 0x2

    aput v0, v6, v1

    .line 287
    const/4 v0, 0x5

    const/4 v1, 0x3

    aput v0, v6, v1

    .line 288
    const/16 v0, 0x14

    const/4 v1, 0x4

    aput v0, v6, v1

    .line 289
    iget-object v0, p0, Lo/fke;->d:Lo/eex;

    invoke-virtual {v0, v6}, Lo/eex;->b([I)Z

    .line 292
    :cond_3
    return-void
.end method

.method static synthetic e(Lo/fke;)Lo/fke$d;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/fke;->i:Lo/fke$d;

    return-object v0
.end method

.method private e(I)Z
    .locals 1

    .line 295
    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 296
    const/4 v0, 0x0

    return v0

    .line 298
    :cond_0
    iget v0, p0, Lo/fke;->m:I

    if-ne p1, v0, :cond_1

    .line 299
    const/4 v0, 0x0

    return v0

    .line 301
    :cond_1
    iput p1, p0, Lo/fke;->m:I

    .line 302
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic e(Lo/fke;I)Z
    .locals 1

    .line 27
    invoke-direct {p0, p1}, Lo/fke;->e(I)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a(Lo/cmo;)Z
    .locals 5

    .line 109
    const-string v0, "Track_TreadmillManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStandSteps callback:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    iget-object v0, p0, Lo/fke;->b:Lo/fkh;

    if-nez v0, :cond_0

    .line 111
    const-string v0, "Track_TreadmillManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "report2Callback vibraStepCounterHelper is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    const/4 v0, 0x0

    return v0

    .line 114
    :cond_0
    if-eqz p1, :cond_1

    .line 116
    const-string v0, "Track_TreadmillManager"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStandSteps "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fke;->b:Lo/fkh;

    invoke-virtual {v2}, Lo/fkh;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 118
    const-string v0, "standSteps"

    iget-object v1, p0, Lo/fke;->b:Lo/fkh;

    invoke-virtual {v1}, Lo/fkh;->d()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 119
    invoke-interface {p1, v4}, Lo/cmo;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    goto :goto_0

    .line 120
    :catch_0
    move-exception v4

    .line 121
    const-string v0, "Track_TreadmillManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStandSteps "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public a(Lo/cmx;I)Z
    .locals 3

    .line 218
    if-eqz p1, :cond_0

    const/16 v0, 0x3e8

    if-ge p2, v0, :cond_1

    .line 219
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 222
    :cond_1
    iput-object p1, p0, Lo/fke;->c:Lo/cmx;

    .line 223
    iput p2, p0, Lo/fke;->h:I

    .line 226
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "flush_worker_thread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/fke;->g:Landroid/os/HandlerThread;

    .line 227
    iget-object v0, p0, Lo/fke;->g:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 228
    new-instance v0, Lo/fke$d;

    iget-object v1, p0, Lo/fke;->g:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/fke$d;-><init>(Lo/fke;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/fke;->i:Lo/fke$d;

    .line 231
    iget-object v0, p0, Lo/fke;->i:Lo/fke$d;

    const-string v1, "refresh"

    const/16 v2, 0x3e8

    invoke-virtual {v0, v2, v1}, Lo/fke$d;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 233
    const/4 v0, 0x1

    return v0
.end method

.method public b()Z
    .locals 4

    .line 205
    const-string v0, "Track_TreadmillManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterFreeIndoorRunninngStyle "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fke;->k:Lcom/huawei/exercise/modle/ITreadmillStyleCallback;

    .line 207
    const/4 v0, 0x1

    return v0
.end method

.method public c()V
    .locals 4

    .line 78
    const-string v0, "Track_TreadmillManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " stopTreadmillStep"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    iget-object v0, p0, Lo/fke;->b:Lo/fkh;

    if-eqz v0, :cond_0

    .line 80
    iget-object v0, p0, Lo/fke;->b:Lo/fkh;

    invoke-virtual {v0}, Lo/fkh;->a()V

    .line 81
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fke;->b:Lo/fkh;

    .line 83
    :cond_0
    iget-object v0, p0, Lo/fke;->e:Lo/fkg;

    if-eqz v0, :cond_1

    .line 84
    iget-object v0, p0, Lo/fke;->e:Lo/fkg;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/fkg;->b(J)V

    .line 85
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fke;->e:Lo/fkg;

    .line 88
    :cond_1
    return-void
.end method

.method public c(Lcom/huawei/exercise/modle/ITreadmillStyleCallback;)Z
    .locals 4

    .line 193
    const-string v0, "Track_TreadmillManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerFreeIndoorRunninngStyle "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    if-nez p1, :cond_0

    .line 195
    const-string v0, "Track_TreadmillManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerFreeIndoorRunninngStyle callback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    const/4 v0, 0x0

    return v0

    .line 199
    :cond_0
    iput-object p1, p0, Lo/fke;->k:Lcom/huawei/exercise/modle/ITreadmillStyleCallback;

    .line 200
    const/4 v0, 0x1

    return v0
.end method

.method public e()Z
    .locals 2

    .line 242
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fke;->c:Lo/cmx;

    .line 243
    iget-object v0, p0, Lo/fke;->i:Lo/fke$d;

    if-eqz v0, :cond_0

    .line 245
    iget-object v0, p0, Lo/fke;->i:Lo/fke$d;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Lo/fke$d;->removeMessages(I)V

    .line 250
    :cond_0
    iget-object v0, p0, Lo/fke;->g:Landroid/os/HandlerThread;

    if-eqz v0, :cond_1

    .line 251
    iget-object v0, p0, Lo/fke;->g:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 252
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fke;->g:Landroid/os/HandlerThread;

    .line 255
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

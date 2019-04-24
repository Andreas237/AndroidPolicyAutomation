.class public Lo/foa;
.super Lo/fnl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/foa$b;
    }
.end annotation


# static fields
.field protected static final e:Lo/fty;


# instance fields
.field private final a:Ljava/util/Random;

.field private final b:F

.field private final c:I

.field private final g:I

.field private final i:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 57
    const-class v0, Lo/foa;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/foa;->e:Lo/fty;

    return-void
.end method

.method public constructor <init>(Lo/fmw;)V
    .locals 5

    .line 73
    invoke-direct {p0}, Lo/fnl;-><init>()V

    .line 60
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lo/foa;->a:Ljava/util/Random;

    .line 74
    const-string v0, "ACK_TIMEOUT"

    invoke-virtual {p1, v0}, Lo/fmw;->e(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/foa;->c:I

    .line 75
    const-string v0, "ACK_RANDOM_FACTOR"

    invoke-virtual {p1, v0}, Lo/fmw;->a(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lo/foa;->b:F

    .line 76
    const-string v0, "ACK_TIMEOUT_SCALE"

    invoke-virtual {p1, v0}, Lo/fmw;->a(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lo/foa;->i:F

    .line 77
    const-string v0, "MAX_RETRANSMIT"

    invoke-virtual {p1, v0}, Lo/fmw;->e(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/foa;->g:I

    .line 79
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "ReliabilityLayer uses ACK_TIMEOUT={}, ACK_RANDOM_FACTOR={}, and ACK_TIMEOUT_SCALE={}"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lo/foa;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lo/foa;->b:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget v3, p0, Lo/foa;->i:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    return-void
.end method

.method static synthetic a(Lo/foa;)I
    .locals 1

    .line 54
    iget v0, p0, Lo/foa;->g:I

    return v0
.end method

.method private d(Lo/fmb;Lo/foa$b;)V
    .locals 2

    .line 166
    iget-object v0, p0, Lo/foa;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 167
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "Endpoint is being destroyed: skipping retransmission"

    invoke-interface {v0, v1}, Lo/fty;->e(Ljava/lang/String;)V

    .line 168
    return-void

    .line 171
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/fmb;->c(Ljava/util/concurrent/ScheduledFuture;)V

    .line 172
    invoke-virtual {p0, p1}, Lo/foa;->c(Lo/fmb;)V

    .line 174
    invoke-static {p2}, Lo/foa$b;->c(Lo/foa$b;)Lo/flq;

    move-result-object v0

    new-instance v1, Lo/foa$1;

    invoke-direct {v1, p0, p2}, Lo/foa$1;-><init>(Lo/foa;Lo/foa$b;)V

    invoke-virtual {v0, v1}, Lo/flq;->c(Lo/fls;)V

    .line 183
    return-void
.end method


# virtual methods
.method public a(Lo/fmb;Lo/fly;)V
    .locals 8

    .line 114
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "Send response, failed transmissions: {}"

    invoke-virtual {p1}, Lo/fmb;->g()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 119
    invoke-virtual {p2}, Lo/fly;->b()Lo/flj$e;

    move-result-object v6

    .line 120
    if-nez v6, :cond_2

    .line 121
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->b()Lo/flj$e;

    move-result-object v7

    .line 122
    sget-object v0, Lo/flj$e;->c:Lo/flj$e;

    if-ne v7, v0, :cond_1

    .line 123
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    sget-object v0, Lo/flj$e;->c:Lo/flj$e;

    invoke-virtual {p2, v0}, Lo/fly;->d(Lo/flj$e;)Lo/flq;

    goto :goto_0

    .line 127
    :cond_0
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fma;->b(Z)V

    .line 129
    sget-object v0, Lo/flj$e;->d:Lo/flj$e;

    invoke-virtual {p2, v0}, Lo/fly;->d(Lo/flj$e;)Lo/flq;

    .line 130
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->a()I

    move-result v0

    invoke-virtual {p2, v0}, Lo/fly;->d(I)Lo/flq;

    goto :goto_0

    .line 134
    :cond_1
    sget-object v0, Lo/flj$e;->e:Lo/flj$e;

    invoke-virtual {p2, v0}, Lo/fly;->d(Lo/flj$e;)Lo/flq;

    .line 137
    :goto_0
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "switched response message type from {} to {} (request was {})"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-virtual {p2}, Lo/fly;->b()Lo/flj$e;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x2

    aput-object v7, v2, v3

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    goto :goto_1

    :cond_2
    sget-object v0, Lo/flj$e;->d:Lo/flj$e;

    if-eq v6, v0, :cond_3

    sget-object v0, Lo/flj$e;->b:Lo/flj$e;

    if-ne v6, v0, :cond_4

    .line 141
    :cond_3
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->a()I

    move-result v0

    invoke-virtual {p2, v0}, Lo/fly;->d(I)Lo/flq;

    .line 144
    :cond_4
    :goto_1
    invoke-virtual {p2}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->c:Lo/flj$e;

    if-ne v0, v1, :cond_5

    .line 145
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "scheduling retransmission for {}"

    invoke-interface {v0, v1, p2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 146
    new-instance v0, Lo/foa$5;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lo/foa$5;-><init>(Lo/foa;Lo/fmb;Lo/flq;Lo/fmb;Lo/fly;)V

    invoke-direct {p0, p1, v0}, Lo/foa;->d(Lo/fmb;Lo/foa$b;)V

    .line 153
    :cond_5
    invoke-virtual {p0}, Lo/foa;->b()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->a(Lo/fmb;Lo/fly;)V

    .line 154
    return-void
.end method

.method public a(Lo/fmb;Lo/fma;)V
    .locals 3

    .line 197
    invoke-virtual {p2}, Lo/fma;->D()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 199
    invoke-virtual {p1}, Lo/fmb;->h()Lo/fly;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 200
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "respond with the current response to the duplicate request"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 202
    invoke-virtual {p0}, Lo/foa;->b()Lo/fod;

    move-result-object v0

    invoke-virtual {p1}, Lo/fmb;->h()Lo/fly;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/fod;->a(Lo/fmb;Lo/fly;)V

    goto :goto_0

    .line 204
    :cond_0
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->t()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 205
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "duplicate request was acknowledged but no response computed yet. Retransmit ACK"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 206
    invoke-static {p2}, Lo/flo;->b(Lo/flq;)Lo/flo;

    move-result-object v2

    .line 207
    invoke-virtual {p0, p1, v2}, Lo/foa;->c(Lo/fmb;Lo/flo;)V

    .line 209
    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->w()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 210
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "duplicate request was rejected. Reject again"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 211
    invoke-static {p2}, Lo/flo;->d(Lo/flq;)Lo/flo;

    move-result-object v2

    .line 212
    invoke-virtual {p0, p1, v2}, Lo/foa;->c(Lo/fmb;Lo/flo;)V

    .line 214
    goto :goto_0

    .line 215
    :cond_2
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "server has not yet decided what to do with the request. We ignore the duplicate."

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 223
    :cond_3
    invoke-virtual {p1, p2}, Lo/fmb;->e(Lo/fma;)V

    .line 224
    invoke-virtual {p0}, Lo/foa;->c()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->a(Lo/fmb;Lo/fma;)V

    .line 226
    :goto_0
    return-void
.end method

.method protected c(Lo/fmb;)V
    .locals 6

    .line 298
    move-object v3, p1

    monitor-enter v3

    .line 300
    :try_start_0
    invoke-virtual {p1}, Lo/fmb;->g()I

    move-result v0

    if-nez v0, :cond_0

    .line 306
    iget v0, p0, Lo/foa;->c:I

    iget v1, p0, Lo/foa;->c:I

    int-to-float v1, v1

    iget v2, p0, Lo/foa;->b:F

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {p0, v0, v1}, Lo/foa;->d(II)I

    move-result v4

    goto :goto_0

    .line 308
    :cond_0
    iget v0, p0, Lo/foa;->i:F

    invoke-virtual {p1}, Lo/fmb;->f()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    float-to-int v4, v0

    .line 310
    :goto_0
    invoke-virtual {p1, v4}, Lo/fmb;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 311
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5

    .line 312
    :goto_1
    return-void
.end method

.method protected d(II)I
    .locals 5

    .line 322
    if-lt p1, p2, :cond_0

    .line 323
    return p1

    .line 325
    :cond_0
    iget-object v3, p0, Lo/foa;->a:Ljava/util/Random;

    monitor-enter v3

    .line 326
    :try_start_0
    iget-object v0, p0, Lo/foa;->a:Ljava/util/Random;

    sub-int v1, p2, p1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    add-int/2addr v0, p1

    monitor-exit v3

    return v0

    .line 327
    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public d(Lo/fmb;Lo/flo;)V
    .locals 2

    .line 260
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/fmb;->e(I)V

    .line 265
    invoke-virtual {p2}, Lo/flo;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->d:Lo/flj$e;

    if-ne v0, v1, :cond_1

    .line 266
    invoke-virtual {p1}, Lo/fmb;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 267
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fma;->b(Z)V

    goto :goto_0

    .line 269
    :cond_0
    invoke-virtual {p1}, Lo/fmb;->h()Lo/fly;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fly;->b(Z)V

    goto :goto_0

    .line 271
    :cond_1
    invoke-virtual {p2}, Lo/flo;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->b:Lo/flj$e;

    if-ne v0, v1, :cond_3

    .line 272
    invoke-virtual {p1}, Lo/fmb;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 273
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fma;->c(Z)V

    goto :goto_0

    .line 275
    :cond_2
    invoke-virtual {p1}, Lo/fmb;->h()Lo/fly;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fly;->c(Z)V

    goto :goto_0

    .line 278
    :cond_3
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "received empty message that is neither ACK nor RST: {}"

    invoke-interface {v0, v1, p2}, Lo/fty;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 281
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/fmb;->c(Ljava/util/concurrent/ScheduledFuture;)V

    .line 283
    invoke-virtual {p0}, Lo/foa;->c()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->d(Lo/fmb;Lo/flo;)V

    .line 284
    return-void
.end method

.method public d(Lo/fmb;Lo/fly;)V
    .locals 3

    .line 236
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/fmb;->e(I)V

    .line 237
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fma;->b(Z)V

    .line 238
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/fmb;->c(Ljava/util/concurrent/ScheduledFuture;)V

    .line 240
    invoke-virtual {p2}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->c:Lo/flj$e;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->y()Z

    move-result v0

    if-nez v0, :cond_0

    .line 241
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "acknowledging CON response"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 242
    invoke-static {p2}, Lo/flo;->b(Lo/flq;)Lo/flo;

    move-result-object v2

    .line 243
    invoke-virtual {p0, p1, v2}, Lo/foa;->c(Lo/fmb;Lo/flo;)V

    .line 246
    :cond_0
    invoke-virtual {p2}, Lo/fly;->D()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 247
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "ignoring duplicate response"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 249
    :cond_1
    invoke-virtual {p0}, Lo/foa;->c()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->d(Lo/fmb;Lo/fly;)V

    .line 251
    :goto_0
    return-void
.end method

.method public e(Lo/fmb;Lo/fma;)V
    .locals 6

    .line 89
    sget-object v0, Lo/foa;->e:Lo/fty;

    const-string v1, "Send request, failed transmissions: {}"

    invoke-virtual {p1}, Lo/fmb;->g()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 91
    invoke-virtual {p2}, Lo/fma;->b()Lo/flj$e;

    move-result-object v0

    if-nez v0, :cond_0

    .line 92
    sget-object v0, Lo/flj$e;->c:Lo/flj$e;

    invoke-virtual {p2, v0}, Lo/fma;->d(Lo/flj$e;)Lo/flq;

    .line 94
    :cond_0
    invoke-virtual {p2}, Lo/fma;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->c:Lo/flj$e;

    if-ne v0, v1, :cond_1

    .line 95
    new-instance v0, Lo/foa$4;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lo/foa$4;-><init>(Lo/foa;Lo/fmb;Lo/flq;Lo/fmb;Lo/fma;)V

    invoke-direct {p0, p1, v0}, Lo/foa;->d(Lo/fmb;Lo/foa$b;)V

    .line 102
    :cond_1
    invoke-virtual {p0}, Lo/foa;->b()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->e(Lo/fmb;Lo/fma;)V

    .line 103
    return-void
.end method

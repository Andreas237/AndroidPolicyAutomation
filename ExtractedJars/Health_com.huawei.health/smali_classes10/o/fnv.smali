.class public abstract Lo/fnv;
.super Lo/foa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fnv$d;,
        Lo/fnv$b;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Lo/fms;

.field protected c:Lo/fmw;


# direct methods
.method public constructor <init>(Lo/fmw;)V
    .locals 1

    .line 84
    invoke-direct {p0, p1}, Lo/foa;-><init>(Lo/fmw;)V

    .line 85
    iput-object p1, p0, Lo/fnv;->c:Lo/fmw;

    .line 86
    new-instance v0, Lo/fms;

    invoke-direct {v0, p1}, Lo/fms;-><init>(Lo/fmw;)V

    iput-object v0, p0, Lo/fnv;->b:Lo/fms;

    .line 87
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fnv;->b(Z)V

    .line 88
    return-void
.end method

.method public static a(Lo/fmw;)Lo/fnv;
    .locals 6

    .line 471
    const-string v0, "CONGESTION_CONTROL_ALGORITHM"

    const-string v1, "Cocoa"

    invoke-virtual {p0, v0, v1}, Lo/fmw;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 472
    move-object v4, v3

    const/4 v5, -0x1

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "Cocoa"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x0

    goto :goto_0

    :sswitch_1
    const-string v0, "CocoaStrong"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "BasicRto"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x2

    goto :goto_0

    :sswitch_3
    const-string v0, "LinuxRto"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x3

    goto :goto_0

    :sswitch_4
    const-string v0, "PeakhopperRto"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x4

    :cond_0
    :goto_0
    packed-switch v5, :pswitch_data_0

    goto :goto_1

    .line 474
    :pswitch_0
    new-instance v0, Lo/foi;

    invoke-direct {v0, p0}, Lo/foi;-><init>(Lo/fmw;)V

    return-object v0

    .line 476
    :pswitch_1
    new-instance v0, Lo/foe;

    invoke-direct {v0, p0}, Lo/foe;-><init>(Lo/fmw;)V

    return-object v0

    .line 478
    :pswitch_2
    new-instance v0, Lo/foh;

    invoke-direct {v0, p0}, Lo/foh;-><init>(Lo/fmw;)V

    return-object v0

    .line 480
    :pswitch_3
    new-instance v0, Lo/fog;

    invoke-direct {v0, p0}, Lo/fog;-><init>(Lo/fmw;)V

    return-object v0

    .line 482
    :pswitch_4
    new-instance v0, Lo/fol;

    invoke-direct {v0, p0}, Lo/fol;-><init>(Lo/fmw;)V

    return-object v0

    .line 484
    :goto_1
    sget-object v0, Lo/fnv;->e:Lo/fty;

    const-string v1, "configuration contains unsupported {}, using Cocoa"

    const-string v2, "CONGESTION_CONTROL_ALGORITHM"

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 487
    new-instance v0, Lo/foi;

    invoke-direct {v0, p0}, Lo/foi;-><init>(Lo/fmw;)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x6282c481 -> :sswitch_2
        -0x1bbcf2a0 -> :sswitch_1
        0x3e41d69 -> :sswitch_0
        0x476ee37a -> :sswitch_4
        0x4ba540f9 -> :sswitch_3
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private a(Lo/fmb;)V
    .locals 6

    .line 209
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/fmu;->b(Lo/fmb;)J

    move-result-wide v2

    .line 210
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    .line 211
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v4, v0, v2

    .line 213
    invoke-virtual {p1}, Lo/fmb;->g()I

    move-result v0

    invoke-virtual {p0, v4, v5, p1, v0}, Lo/fnv;->b(JLo/fmb;I)V

    .line 214
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/fmu;->d(Lo/fmb;)Z

    .line 216
    :cond_0
    return-void
.end method

.method static synthetic b(Lo/fnv;Lo/fmb;)V
    .locals 0

    .line 56
    invoke-direct {p0, p1}, Lo/fnv;->k(Lo/fmb;)V

    return-void
.end method

.method private b(Lo/fmb;)Z
    .locals 5

    .line 168
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->m()V

    .line 169
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/fmu;->g(Lo/fmb;)I

    move-result v0

    iget-object v1, p0, Lo/fnv;->c:Lo/fmw;

    const-string v2, "NSTART"

    invoke-virtual {v1, v2}, Lo/fmw;->e(Ljava/lang/String;)I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 174
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v1

    invoke-virtual {v1}, Lo/fmu;->i()J

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, Lo/fnv;->a(J)D

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lo/fmu;->a(Lo/fmb;D)V

    .line 179
    iget-object v0, p0, Lo/fnv;->d:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lo/fnv$d;

    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v2

    invoke-direct {v1, p0, v2, p1}, Lo/fnv$d;-><init>(Lo/fnv;Lo/fmu;Lo/fmb;)V

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/32 v3, 0x3e418

    invoke-interface {v0, v1, v3, v4, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 182
    const/4 v0, 0x1

    return v0

    .line 190
    :cond_0
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->f()Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v0

    const/16 v1, 0x32

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 197
    :cond_1
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->f()Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 201
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private d(Lo/fmb;Lo/flq;)Z
    .locals 6

    .line 119
    invoke-virtual {p2}, Lo/flq;->b()Lo/flj$e;

    move-result-object v5

    .line 122
    sget-object v0, Lo/flj$e;->c:Lo/flj$e;

    if-ne v5, v0, :cond_0

    .line 123
    invoke-direct {p0, p1}, Lo/fnv;->b(Lo/fmb;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 125
    const/4 v0, 0x0

    return v0

    .line 127
    :cond_0
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->e()I

    move-result v0

    const/4 v1, 0x7

    if-le v0, v1, :cond_3

    .line 130
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->m()I

    move-result v0

    if-eqz v0, :cond_1

    .line 131
    invoke-virtual {p1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    sget-object v1, Lo/flj$e;->c:Lo/flj$e;

    invoke-virtual {v0, v1}, Lo/fma;->d(Lo/flj$e;)Lo/flq;

    goto :goto_0

    .line 132
    :cond_1
    invoke-virtual {p1}, Lo/fmb;->h()Lo/fly;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 133
    invoke-virtual {p1}, Lo/fmb;->h()Lo/fly;

    move-result-object v0

    sget-object v1, Lo/flj$e;->c:Lo/flj$e;

    invoke-virtual {v0, v1}, Lo/fly;->d(Lo/flj$e;)Lo/flq;

    .line 135
    :cond_2
    :goto_0
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->c()V

    .line 138
    invoke-direct {p0, p1}, Lo/fnv;->b(Lo/fmb;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 139
    const/4 v0, 0x0

    return v0

    .line 143
    :cond_3
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->h()Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v0

    const/16 v1, 0x32

    if-ne v0, v1, :cond_4

    goto :goto_1

    .line 147
    :cond_4
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->h()Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 152
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->k()Z

    move-result v0

    if-nez v0, :cond_5

    .line 153
    iget-object v0, p0, Lo/fnv;->d:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lo/fnv$b;

    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lo/fnv$b;-><init>(Lo/fnv;Lo/fmu;)V

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 158
    :cond_5
    :goto_1
    const/4 v0, 0x0

    return v0

    .line 160
    :cond_6
    const/4 v0, 0x1

    return v0
.end method

.method private k(Lo/fmb;)V
    .locals 2

    .line 280
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->f()Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 283
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->f()Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/fmb;

    .line 284
    invoke-virtual {v1}, Lo/fmb;->h()Lo/fly;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 286
    invoke-virtual {v1}, Lo/fmb;->h()Lo/fly;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lo/fnv;->a(Lo/fmb;Lo/fly;)V

    goto :goto_0

    .line 287
    :cond_0
    invoke-virtual {v1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 289
    invoke-virtual {v1}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lo/fnv;->e(Lo/fmb;Lo/fma;)V

    .line 292
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method protected a(J)D
    .locals 2

    .line 272
    iget-object v0, p0, Lo/fnv;->c:Lo/fmw;

    const-string v1, "ACK_TIMEOUT_SCALE"

    invoke-virtual {v0, v1}, Lo/fmw;->a(Ljava/lang/String;)F

    move-result v0

    float-to-double v0, v0

    return-wide v0
.end method

.method protected a(JILo/fmu;)V
    .locals 4

    .line 246
    iget-object v0, p0, Lo/fnv;->c:Lo/fmw;

    const-string v1, "ACK_TIMEOUT"

    invoke-virtual {v0, v1}, Lo/fmw;->e(Ljava/lang/String;)I

    move-result v0

    int-to-long v2, v0

    .line 248
    invoke-virtual {p4, v2, v3}, Lo/fmu;->e(J)V

    .line 249
    return-void
.end method

.method public a(Lo/fmb;Lo/fly;)V
    .locals 1

    .line 320
    invoke-virtual {p1}, Lo/fmb;->g()I

    move-result v0

    if-lez v0, :cond_0

    .line 322
    invoke-super {p0, p1, p2}, Lo/foa;->a(Lo/fmb;Lo/fly;)V

    goto :goto_0

    .line 323
    :cond_0
    invoke-direct {p0, p1, p2}, Lo/fnv;->d(Lo/fmb;Lo/flq;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 324
    invoke-virtual {p0, p1}, Lo/fnv;->d(Lo/fmb;)V

    .line 325
    invoke-super {p0, p1, p2}, Lo/foa;->a(Lo/fmb;Lo/fly;)V

    .line 327
    :cond_1
    :goto_0
    return-void
.end method

.method protected b(JLo/fmb;I)V
    .locals 0

    .line 227
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 99
    iput-boolean p1, p0, Lo/fnv;->a:Z

    .line 100
    return-void
.end method

.method protected c(Lo/fmb;)V
    .locals 6

    .line 333
    invoke-virtual {p1}, Lo/fmb;->g()I

    move-result v0

    if-nez v0, :cond_0

    .line 334
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->i()J

    move-result-wide v0

    long-to-int v4, v0

    .line 335
    invoke-virtual {p0}, Lo/fnv;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 338
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->g()V

    .line 339
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->i()J

    move-result-wide v0

    long-to-int v4, v0

    .line 341
    iget-object v0, p0, Lo/fnv;->c:Lo/fmw;

    const-string v1, "ACK_RANDOM_FACTOR"

    invoke-virtual {v0, v1}, Lo/fmw;->a(Ljava/lang/String;)F

    move-result v5

    .line 342
    int-to-float v0, v4

    mul-float/2addr v0, v5

    float-to-int v0, v0

    invoke-virtual {p0, v4, v0}, Lo/fnv;->d(II)I

    move-result v4

    .line 343
    goto :goto_1

    .line 346
    :cond_0
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/fmu;->e(Lo/fmb;)D

    move-result-wide v0

    invoke-virtual {p1}, Lo/fmb;->f()I

    move-result v2

    int-to-double v2, v2

    mul-double/2addr v0, v2

    double-to-int v5, v0

    .line 347
    const v0, 0xea60

    if-ge v5, v0, :cond_1

    move v4, v5

    goto :goto_0

    :cond_1
    const v4, 0xea60

    .line 348
    :goto_0
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    int-to-long v1, v4

    invoke-virtual {v0, v1, v2}, Lo/fmu;->a(J)V

    .line 351
    :cond_2
    :goto_1
    invoke-virtual {p1, v4}, Lo/fmb;->b(I)V

    .line 354
    return-void
.end method

.method protected d(JILo/fmu;)V
    .locals 4

    .line 261
    iget-object v0, p0, Lo/fnv;->c:Lo/fmw;

    const-string v1, "ACK_TIMEOUT"

    invoke-virtual {v0, v1}, Lo/fmw;->e(Ljava/lang/String;)I

    move-result v0

    int-to-long v2, v0

    .line 262
    invoke-virtual {p4, v2, v3}, Lo/fmu;->e(J)V

    .line 263
    return-void
.end method

.method protected d(Lo/fmb;)V
    .locals 0

    .line 235
    return-void
.end method

.method public d(Lo/fmb;Lo/flo;)V
    .locals 1

    .line 374
    invoke-virtual {p1}, Lo/fmb;->g()I

    move-result v0

    if-eqz v0, :cond_0

    .line 375
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/fmu;->a(Lo/fmb;)V

    .line 377
    :cond_0
    invoke-super {p0, p1, p2}, Lo/foa;->d(Lo/fmb;Lo/flo;)V

    .line 379
    invoke-direct {p0, p1}, Lo/fnv;->a(Lo/fmb;)V

    .line 380
    invoke-direct {p0, p1}, Lo/fnv;->k(Lo/fmb;)V

    .line 381
    return-void
.end method

.method public d(Lo/fmb;Lo/fly;)V
    .locals 1

    .line 359
    invoke-virtual {p1}, Lo/fmb;->g()I

    move-result v0

    if-eqz v0, :cond_0

    .line 360
    invoke-virtual {p0, p1}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/fmu;->a(Lo/fmb;)V

    .line 362
    :cond_0
    invoke-super {p0, p1, p2}, Lo/foa;->d(Lo/fmb;Lo/fly;)V

    .line 364
    invoke-direct {p0, p1}, Lo/fnv;->a(Lo/fmb;)V

    .line 365
    invoke-direct {p0, p1}, Lo/fnv;->k(Lo/fmb;)V

    .line 366
    return-void
.end method

.method public d(Lo/fmb;Lo/fma;)V
    .locals 0

    .line 390
    invoke-super {p0, p1, p2}, Lo/foa;->e(Lo/fmb;Lo/fma;)V

    .line 391
    return-void
.end method

.method public d()Z
    .locals 1

    .line 95
    iget-boolean v0, p0, Lo/fnv;->a:Z

    return v0
.end method

.method protected e(Lo/fmb;)Lo/fmu;
    .locals 1

    .line 91
    iget-object v0, p0, Lo/fnv;->b:Lo/fms;

    invoke-virtual {v0, p1}, Lo/fms;->c(Lo/fmb;)Lo/fmu;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/fmb;Lo/fly;)V
    .locals 0

    .line 400
    invoke-super {p0, p1, p2}, Lo/foa;->a(Lo/fmb;Lo/fly;)V

    .line 401
    return-void
.end method

.method public e(Lo/fmb;Lo/fma;)V
    .locals 1

    .line 302
    invoke-virtual {p1}, Lo/fmb;->g()I

    move-result v0

    if-lez v0, :cond_0

    .line 304
    invoke-super {p0, p1, p2}, Lo/foa;->e(Lo/fmb;Lo/fma;)V

    goto :goto_0

    .line 305
    :cond_0
    invoke-direct {p0, p1, p2}, Lo/fnv;->d(Lo/fmb;Lo/flq;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 306
    invoke-virtual {p0, p1}, Lo/fnv;->d(Lo/fmb;)V

    .line 308
    invoke-super {p0, p1, p2}, Lo/foa;->e(Lo/fmb;Lo/fma;)V

    .line 310
    :cond_1
    :goto_0
    return-void
.end method

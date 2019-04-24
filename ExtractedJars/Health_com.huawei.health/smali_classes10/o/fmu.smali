.class public Lo/fmu;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fmu$d;
    }
.end annotation


# instance fields
.field private A:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<Lo/fmb;>;"
        }
    .end annotation
.end field

.field private D:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<Lo/fmb;>;"
        }
    .end annotation
.end field

.field public a:J

.field public b:J

.field public c:J

.field public d:D

.field public e:J

.field public f:J

.field public g:[J

.field public h:D

.field public i:J

.field private j:Z

.field public k:J

.field private l:I

.field private m:Ljava/net/InetAddress;

.field private n:[J

.field private o:[J

.field private p:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<Lo/fmb;Lo/fmu$d;>;"
        }
    .end annotation
.end field

.field private q:J

.field private r:[J

.field private s:[J

.field private t:J

.field private u:[J

.field private v:Z

.field private w:Z

.field private x:I

.field private y:I

.field private z:Z


# direct methods
.method public constructor <init>(ILjava/net/InetAddress;Lo/fmw;)V
    .locals 9

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    const/4 v0, 0x2

    new-array v0, v0, [J

    iput-object v0, p0, Lo/fmu;->g:[J

    .line 91
    iput-object p2, p0, Lo/fmu;->m:Ljava/net/InetAddress;

    .line 92
    iput p1, p0, Lo/fmu;->l:I

    .line 95
    const/4 v0, 0x1

    new-array v0, v0, [J

    iput-object v0, p0, Lo/fmu;->n:[J

    .line 96
    const/4 v8, 0x0

    :goto_0
    const/4 v0, 0x1

    if-ge v8, v0, :cond_0

    .line 97
    iget-object v0, p0, Lo/fmu;->n:[J

    const-string v1, "ACK_TIMEOUT"

    invoke-virtual {p3, v1}, Lo/fmw;->e(Ljava/lang/String;)I

    move-result v1

    int-to-long v1, v1

    aput-wide v1, v0, v8

    .line 96
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 99
    :cond_0
    const-string v0, "ACK_TIMEOUT"

    invoke-virtual {p3, v0}, Lo/fmw;->e(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lo/fmu;->t:J

    .line 101
    const/4 v0, 0x3

    new-array v0, v0, [J

    iput-object v0, p0, Lo/fmu;->u:[J

    .line 102
    const/4 v0, 0x3

    new-array v0, v0, [J

    iput-object v0, p0, Lo/fmu;->r:[J

    .line 103
    const/4 v0, 0x3

    new-array v0, v0, [J

    iput-object v0, p0, Lo/fmu;->s:[J

    .line 104
    const/4 v0, 0x3

    new-array v0, v0, [J

    iput-object v0, p0, Lo/fmu;->o:[J

    .line 106
    const/4 v8, 0x0

    :goto_1
    const/4 v0, 0x2

    if-gt v8, v0, :cond_1

    .line 107
    move-object v0, p0

    const-string v1, "ACK_TIMEOUT"

    invoke-virtual {p3, v1}, Lo/fmw;->e(Ljava/lang/String;)I

    move-result v1

    int-to-long v1, v1

    move v7, v8

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/fmu;->a(JJJI)V

    .line 108
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, v8}, Lo/fmu;->c(JI)V

    .line 106
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 110
    :cond_1
    const-string v0, "ACK_TIMEOUT"

    invoke-virtual {p3, v0}, Lo/fmw;->e(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lo/fmu;->q:J

    .line 112
    const/4 v0, 0x0

    iput v0, p0, Lo/fmu;->x:I

    .line 113
    const/4 v0, 0x7

    iput v0, p0, Lo/fmu;->y:I

    .line 115
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fmu;->z:Z

    .line 116
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fmu;->v:Z

    .line 117
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fmu;->w:Z

    .line 119
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fmu;->j:Z

    .line 121
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 123
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/fmu;->D:Ljava/util/Queue;

    .line 124
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/fmu;->A:Ljava/util/Queue;

    .line 125
    return-void
.end method

.method private s()V
    .locals 5

    .line 206
    const-wide/16 v2, 0x0

    .line 208
    const/4 v4, 0x0

    :goto_0
    const/4 v0, 0x1

    if-ge v4, v0, :cond_0

    .line 209
    iget-object v0, p0, Lo/fmu;->n:[J

    aget-wide v0, v0, v4

    add-long/2addr v2, v0

    .line 208
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 211
    :cond_0
    const-wide/16 v0, 0x1

    div-long v0, v2, v0

    iput-wide v0, p0, Lo/fmu;->q:J

    .line 212
    return-void
.end method


# virtual methods
.method public a(I)J
    .locals 2

    .line 148
    iget-object v0, p0, Lo/fmu;->o:[J

    aget-wide v0, v0, p1

    return-wide v0
.end method

.method public a(J)V
    .locals 0

    .line 215
    iput-wide p1, p0, Lo/fmu;->t:J

    .line 216
    return-void
.end method

.method public a(JJJI)V
    .locals 1

    .line 188
    iget-object v0, p0, Lo/fmu;->u:[J

    aput-wide p1, v0, p7

    .line 189
    iget-object v0, p0, Lo/fmu;->r:[J

    aput-wide p3, v0, p7

    .line 190
    iget-object v0, p0, Lo/fmu;->s:[J

    aput-wide p5, v0, p7

    .line 191
    return-void
.end method

.method public a(Lo/fmb;)V
    .locals 2

    .line 292
    iget-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 293
    return-void

    .line 301
    :cond_0
    invoke-virtual {p1}, Lo/fmb;->g()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lo/fmb;->g()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 304
    :cond_1
    iget-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fmu$d;

    invoke-virtual {v0}, Lo/fmu$d;->c()V

    goto :goto_0

    .line 308
    :cond_2
    iget-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fmu$d;

    invoke-virtual {v0}, Lo/fmu$d;->b()V

    .line 310
    :goto_0
    return-void
.end method

.method public a(Lo/fmb;D)V
    .locals 7

    .line 318
    new-instance v0, Lo/fmu$d;

    move-object v1, p0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    move-wide v4, p2

    invoke-direct/range {v0 .. v5}, Lo/fmu$d;-><init>(Lo/fmu;JD)V

    move-object v6, v0

    .line 319
    iget-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    return-void
.end method

.method public a()Z
    .locals 1

    .line 180
    iget-boolean v0, p0, Lo/fmu;->v:Z

    return v0
.end method

.method public b(I)J
    .locals 2

    .line 160
    iget-object v0, p0, Lo/fmu;->r:[J

    aget-wide v0, v0, p1

    return-wide v0
.end method

.method public b(Lo/fmb;)J
    .locals 4

    .line 328
    const-wide/16 v2, 0x0

    .line 329
    iget-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 330
    const-wide/16 v0, 0x0

    return-wide v0

    .line 333
    :cond_0
    iget-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 334
    iget-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fmu$d;

    invoke-virtual {v0}, Lo/fmu$d;->d()J

    move-result-wide v2

    .line 336
    :cond_1
    return-wide v2
.end method

.method public b()V
    .locals 2

    .line 136
    iget v0, p0, Lo/fmu;->y:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fmu;->y:I

    .line 137
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 184
    iput-boolean p1, p0, Lo/fmu;->v:Z

    .line 185
    return-void
.end method

.method public c(Lo/fmb;)I
    .locals 1

    .line 362
    iget-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0

    .line 366
    iget-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 367
    iget-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fmu$d;

    invoke-virtual {v0}, Lo/fmu$d;->e()I

    move-result v0

    return v0

    .line 369
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()V
    .locals 1

    .line 144
    const/4 v0, 0x0

    iput v0, p0, Lo/fmu;->y:I

    .line 145
    return-void
.end method

.method public c(JI)V
    .locals 1

    .line 152
    iget-object v0, p0, Lo/fmu;->o:[J

    aput-wide p1, v0, p3

    .line 153
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 176
    iput-boolean p1, p0, Lo/fmu;->w:Z

    .line 177
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 227
    iput-boolean p1, p0, Lo/fmu;->j:Z

    .line 228
    return-void
.end method

.method public d()Z
    .locals 1

    .line 172
    iget-boolean v0, p0, Lo/fmu;->w:Z

    return v0
.end method

.method public d(Lo/fmb;)Z
    .locals 1

    .line 377
    iget-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 378
    const/4 v0, 0x0

    return v0

    .line 381
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public e(Lo/fmb;)D
    .locals 4

    .line 345
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 346
    iget-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 347
    const-wide/16 v0, 0x0

    return-wide v0

    .line 350
    :cond_0
    iget-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 351
    iget-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fmu$d;

    invoke-virtual {v0}, Lo/fmu$d;->a()D

    move-result-wide v2

    .line 353
    :cond_1
    return-wide v2
.end method

.method public e()I
    .locals 1

    .line 140
    iget v0, p0, Lo/fmu;->y:I

    return v0
.end method

.method public e(I)J
    .locals 2

    .line 164
    iget-object v0, p0, Lo/fmu;->s:[J

    aget-wide v0, v0, p1

    return-wide v0
.end method

.method public e(J)V
    .locals 2

    .line 280
    iget-object v0, p0, Lo/fmu;->n:[J

    iget v1, p0, Lo/fmu;->x:I

    aput-wide p1, v0, v1

    .line 281
    iget v0, p0, Lo/fmu;->x:I

    add-int/lit8 v0, v0, 0x1

    rem-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fmu;->x:I

    .line 282
    invoke-direct {p0}, Lo/fmu;->s()V

    .line 283
    invoke-virtual {p0, p1, p2}, Lo/fmu;->a(J)V

    .line 284
    return-void
.end method

.method public f()Ljava/util/Queue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Queue<Lo/fmb;>;"
        }
    .end annotation

    .line 194
    iget-object v0, p0, Lo/fmu;->D:Ljava/util/Queue;

    return-object v0
.end method

.method public g(Lo/fmb;)I
    .locals 1

    .line 405
    iget-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    return v0
.end method

.method public g()V
    .locals 2

    .line 224
    iget-wide v0, p0, Lo/fmu;->q:J

    iput-wide v0, p0, Lo/fmu;->t:J

    .line 225
    return-void
.end method

.method public h()Ljava/util/Queue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Queue<Lo/fmb;>;"
        }
    .end annotation

    .line 198
    iget-object v0, p0, Lo/fmu;->A:Ljava/util/Queue;

    return-object v0
.end method

.method public i()J
    .locals 6

    .line 240
    iget-boolean v0, p0, Lo/fmu;->z:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/fmu;->v:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/fmu;->w:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 244
    iget-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x7d0

    mul-long v4, v0, v2

    goto :goto_0

    .line 246
    :cond_0
    iget-wide v0, p0, Lo/fmu;->q:J

    iget-wide v2, p0, Lo/fmu;->t:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 250
    iget-wide v4, p0, Lo/fmu;->t:J

    goto :goto_0

    .line 252
    :cond_1
    iget-wide v4, p0, Lo/fmu;->q:J

    .line 255
    :goto_0
    const-wide/16 v0, 0x7d00

    cmp-long v0, v4, v0

    if-gez v0, :cond_2

    move-wide v0, v4

    goto :goto_1

    :cond_2
    const-wide/16 v0, 0x7d00

    :goto_1
    return-wide v0
.end method

.method public k()Z
    .locals 1

    .line 231
    iget-boolean v0, p0, Lo/fmu;->j:Z

    return v0
.end method

.method public l()V
    .locals 4

    .line 413
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Delta: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lo/fmu;->d:D

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " D: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-wide v2, 0x3feeaaaaaaaaaaabL    # 0.9583333333333334

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " B: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lo/fmu;->h:D

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " RTT_max: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lo/fmu;->i:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 414
    return-void
.end method

.method public m()V
    .locals 3

    .line 390
    iget-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 391
    if-nez v2, :cond_0

    .line 393
    iget-object v0, p0, Lo/fmu;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    :cond_0
    goto :goto_0

    .line 396
    :cond_1
    return-void
.end method

.method public n()V
    .locals 4

    .line 409
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SRTT: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lo/fmu;->b:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " RTTVAR: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lo/fmu;->e:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " mdev: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lo/fmu;->c:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " mdev_max: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lo/fmu;->a:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 410
    return-void
.end method

.method public o()V
    .locals 4

    .line 271
    iget-wide v0, p0, Lo/fmu;->q:J

    long-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v0, v2

    const-wide v2, 0x408f400000000000L    # 1000.0

    add-double/2addr v0, v2

    double-to-long v0, v0

    iput-wide v0, p0, Lo/fmu;->q:J

    .line 272
    return-void
.end method

.method public p()V
    .locals 4

    .line 263
    iget-wide v0, p0, Lo/fmu;->q:J

    const-wide/16 v2, 0x2

    mul-long/2addr v0, v2

    iput-wide v0, p0, Lo/fmu;->q:J

    .line 264
    return-void
.end method

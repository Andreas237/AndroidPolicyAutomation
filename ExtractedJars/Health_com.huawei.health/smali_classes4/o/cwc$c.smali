.class Lo/cwc$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cwc$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cwc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:J

.field private d:J

.field final synthetic e:Lo/cwc;

.field private f:J

.field private g:Z

.field private h:J

.field private i:J

.field private k:I


# direct methods
.method public constructor <init>(Lo/cwc;JI)V
    .locals 1

    .line 187
    iput-object p1, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 185
    const/4 v0, 0x0

    iput v0, p0, Lo/cwc$c;->k:I

    .line 188
    iput-wide p2, p0, Lo/cwc$c;->d:J

    .line 189
    iput p4, p0, Lo/cwc$c;->k:I

    .line 191
    return-void
.end method

.method private a(IJII)V
    .locals 9

    .line 365
    sub-int v6, p5, p1

    .line 366
    add-int/2addr v6, p4

    .line 367
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 369
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "reportCurrentStepInter "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " start : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " end: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->f(Lo/cwc;)Lo/ces;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 371
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->f(Lo/cwc;)Lo/ces;

    move-result-object v0

    move v1, v6

    move-wide v2, v7

    move-wide v4, v7

    invoke-interface/range {v0 .. v5}, Lo/ces;->c(IJJ)V

    .line 373
    :cond_0
    return-void
.end method

.method private b(IJII)V
    .locals 9

    .line 353
    sub-int v6, p5, p1

    .line 354
    add-int/2addr v6, p4

    .line 355
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 356
    iput p5, p0, Lo/cwc$c;->b:I

    .line 358
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "reportStepFrequencyInter "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " start : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " end: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->c(Lo/cwc;)Lo/ces;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 360
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->c(Lo/cwc;)Lo/ces;

    move-result-object v0

    move v1, v6

    move-wide v2, p2

    move-wide v4, v7

    invoke-interface/range {v0 .. v5}, Lo/ces;->c(IJJ)V

    .line 362
    :cond_0
    return-void
.end method

.method private c(J)Z
    .locals 6

    .line 249
    iget-wide v0, p0, Lo/cwc$c;->f:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 250
    const-wide/16 v0, 0x3e8

    sub-long v0, p1, v0

    iput-wide v0, p0, Lo/cwc$c;->f:J

    .line 253
    :cond_0
    iget-wide v0, p0, Lo/cwc$c;->i:J

    iget-wide v2, p0, Lo/cwc$c;->f:J

    sub-long v2, p1, v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/cwc$c;->i:J

    .line 254
    iput-wide p1, p0, Lo/cwc$c;->f:J

    .line 257
    iget-wide v0, p0, Lo/cwc$c;->h:J

    iget-wide v2, p0, Lo/cwc$c;->d:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    iget-wide v0, p0, Lo/cwc$c;->i:J

    iget-wide v2, p0, Lo/cwc$c;->d:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    .line 258
    :cond_1
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isTimeOver "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/cwc$c;->h:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "  mUsedTime "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/cwc$c;->i:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    const/4 v0, 0x1

    return v0

    .line 262
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private e(I)V
    .locals 5

    .line 322
    iget v0, p0, Lo/cwc$c;->b:I

    sub-int v4, p1, v0

    .line 323
    iget v0, p0, Lo/cwc$c;->a:I

    add-int/2addr v0, v4

    iput v0, p0, Lo/cwc$c;->a:I

    .line 324
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calcuteCache "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/cwc$c;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " totalStep "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    return-void
.end method


# virtual methods
.method public a()V
    .locals 8

    .line 195
    iget v0, p0, Lo/cwc$c;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 196
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->a(Lo/cwc;)Lo/fke;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 197
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->a(Lo/cwc;)Lo/fke;

    move-result-object v0

    new-instance v1, Lo/cwc$e;

    iget v2, p0, Lo/cwc$c;->b:I

    iget-wide v4, p0, Lo/cwc$c;->c:J

    sget-object v6, Lo/cwc$b;->d:Lo/cwc$b;

    const/4 v3, 0x0

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Lo/cwc$e;-><init>(IIJLo/cwc$b;Lo/cwc$d;)V

    invoke-virtual {v0, v1}, Lo/fke;->a(Lo/cmo;)Z

    .line 199
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/cwc$c;->c:J

    goto :goto_0

    .line 201
    :cond_0
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mTreadmillManager = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 204
    :cond_1
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->b(Lo/cwc;)Lo/cmj;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 205
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->b(Lo/cwc;)Lo/cmj;

    move-result-object v0

    new-instance v1, Lo/cwc$e;

    iget v2, p0, Lo/cwc$c;->b:I

    iget-wide v4, p0, Lo/cwc$c;->c:J

    sget-object v6, Lo/cwc$b;->d:Lo/cwc$b;

    const/4 v3, 0x0

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Lo/cwc$e;-><init>(IIJLo/cwc$b;Lo/cwc$d;)V

    invoke-virtual {v0, v1}, Lo/cmj;->b(Lo/cmo;)Z

    .line 207
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/cwc$c;->c:J

    goto :goto_0

    .line 209
    :cond_2
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHealthOpenSDk = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    :goto_0
    return-void
.end method

.method public b()V
    .locals 8

    .line 283
    iget v0, p0, Lo/cwc$c;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 284
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->a(Lo/cwc;)Lo/fke;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 285
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->a(Lo/cwc;)Lo/fke;

    move-result-object v0

    new-instance v1, Lo/cwc$e;

    iget v2, p0, Lo/cwc$c;->b:I

    iget v3, p0, Lo/cwc$c;->a:I

    iget-wide v4, p0, Lo/cwc$c;->c:J

    sget-object v6, Lo/cwc$b;->b:Lo/cwc$b;

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Lo/cwc$e;-><init>(IIJLo/cwc$b;Lo/cwc$d;)V

    invoke-virtual {v0, v1}, Lo/fke;->a(Lo/cmo;)Z

    goto :goto_0

    .line 289
    :cond_0
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->b(Lo/cwc;)Lo/cmj;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 290
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->b(Lo/cwc;)Lo/cmj;

    move-result-object v0

    new-instance v1, Lo/cwc$e;

    iget v2, p0, Lo/cwc$c;->b:I

    iget v3, p0, Lo/cwc$c;->a:I

    iget-wide v4, p0, Lo/cwc$c;->c:J

    sget-object v6, Lo/cwc$b;->b:Lo/cwc$b;

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Lo/cwc$e;-><init>(IIJLo/cwc$b;Lo/cwc$d;)V

    invoke-virtual {v0, v1}, Lo/cmj;->b(Lo/cmo;)Z

    .line 294
    :cond_1
    :goto_0
    return-void
.end method

.method public c(IJIILo/cwc$b;)V
    .locals 6

    .line 331
    sget-object v0, Lo/cwc$b;->d:Lo/cwc$b;

    if-ne p6, v0, :cond_0

    .line 332
    iput p5, p0, Lo/cwc$c;->b:I

    .line 333
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resume "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 334
    :cond_0
    sget-object v0, Lo/cwc$b;->a:Lo/cwc$b;

    if-ne p6, v0, :cond_1

    .line 335
    invoke-direct {p0, p5}, Lo/cwc$c;->e(I)V

    .line 336
    iput p5, p0, Lo/cwc$c;->b:I

    .line 337
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pause "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 338
    :cond_1
    sget-object v0, Lo/cwc$b;->e:Lo/cwc$b;

    if-ne p6, v0, :cond_2

    .line 339
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stop "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    move-object v0, p0

    move v1, p5

    move-wide v2, p2

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lo/cwc$c;->b(IJII)V

    .line 341
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cwc;->a(Lo/cwc;Lo/ces;)Lo/ces;

    goto :goto_0

    .line 343
    :cond_2
    sget-object v0, Lo/cwc$b;->b:Lo/cwc$b;

    if-ne p6, v0, :cond_3

    .line 344
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "report current step "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    invoke-direct/range {p0 .. p5}, Lo/cwc$c;->a(IJII)V

    goto :goto_0

    .line 348
    :cond_3
    invoke-direct/range {p0 .. p5}, Lo/cwc$c;->b(IJII)V

    .line 350
    :goto_0
    return-void
.end method

.method public d()V
    .locals 10

    .line 216
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onTick "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/cwc$c;->h:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mPause "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/cwc$c;->g:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    iget-boolean v0, p0, Lo/cwc$c;->g:Z

    if-eqz v0, :cond_0

    .line 219
    return-void

    .line 222
    :cond_0
    iget-wide v0, p0, Lo/cwc$c;->h:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/cwc$c;->h:J

    .line 224
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 226
    invoke-direct {p0, v8, v9}, Lo/cwc$c;->c(J)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 228
    iget v0, p0, Lo/cwc$c;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 229
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->a(Lo/cwc;)Lo/fke;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 230
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->a(Lo/cwc;)Lo/fke;

    move-result-object v0

    new-instance v1, Lo/cwc$e;

    iget v2, p0, Lo/cwc$c;->b:I

    iget v3, p0, Lo/cwc$c;->a:I

    iget-wide v4, p0, Lo/cwc$c;->c:J

    sget-object v6, Lo/cwc$b;->c:Lo/cwc$b;

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Lo/cwc$e;-><init>(IIJLo/cwc$b;Lo/cwc$d;)V

    invoke-virtual {v0, v1}, Lo/fke;->a(Lo/cmo;)Z

    goto :goto_0

    .line 234
    :cond_1
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->b(Lo/cwc;)Lo/cmj;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 235
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->b(Lo/cwc;)Lo/cmj;

    move-result-object v0

    new-instance v1, Lo/cwc$e;

    iget v2, p0, Lo/cwc$c;->b:I

    iget v3, p0, Lo/cwc$c;->a:I

    iget-wide v4, p0, Lo/cwc$c;->c:J

    sget-object v6, Lo/cwc$b;->c:Lo/cwc$b;

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Lo/cwc$e;-><init>(IIJLo/cwc$b;Lo/cwc$d;)V

    invoke-virtual {v0, v1}, Lo/cmj;->b(Lo/cmo;)Z

    .line 239
    :cond_2
    :goto_0
    iput-wide v8, p0, Lo/cwc$c;->c:J

    .line 240
    const/4 v0, 0x0

    iput v0, p0, Lo/cwc$c;->a:I

    .line 241
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cwc$c;->h:J

    .line 242
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cwc$c;->f:J

    .line 243
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cwc$c;->i:J

    .line 245
    :cond_3
    return-void
.end method

.method public d(Z)V
    .locals 9

    .line 298
    iput-boolean p1, p0, Lo/cwc$c;->g:Z

    .line 300
    sget-object v8, Lo/cwc$b;->a:Lo/cwc$b;

    .line 302
    if-nez p1, :cond_0

    .line 303
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/cwc$c;->f:J

    .line 304
    sget-object v8, Lo/cwc$b;->d:Lo/cwc$b;

    .line 306
    :cond_0
    iget v0, p0, Lo/cwc$c;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 307
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->a(Lo/cwc;)Lo/fke;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 308
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->a(Lo/cwc;)Lo/fke;

    move-result-object v0

    new-instance v1, Lo/cwc$e;

    iget v2, p0, Lo/cwc$c;->b:I

    iget v3, p0, Lo/cwc$c;->a:I

    iget-wide v4, p0, Lo/cwc$c;->c:J

    move-object v6, v8

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Lo/cwc$e;-><init>(IIJLo/cwc$b;Lo/cwc$d;)V

    invoke-virtual {v0, v1}, Lo/fke;->a(Lo/cmo;)Z

    goto :goto_0

    .line 312
    :cond_1
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->b(Lo/cwc;)Lo/cmj;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 314
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->b(Lo/cwc;)Lo/cmj;

    move-result-object v0

    new-instance v1, Lo/cwc$e;

    iget v2, p0, Lo/cwc$c;->b:I

    iget v3, p0, Lo/cwc$c;->a:I

    iget-wide v4, p0, Lo/cwc$c;->c:J

    move-object v6, v8

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Lo/cwc$e;-><init>(IIJLo/cwc$b;Lo/cwc$d;)V

    invoke-virtual {v0, v1}, Lo/cmj;->b(Lo/cmo;)Z

    .line 318
    :cond_2
    :goto_0
    return-void
.end method

.method public e()V
    .locals 8

    .line 268
    iget v0, p0, Lo/cwc$c;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 269
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->a(Lo/cwc;)Lo/fke;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 270
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->a(Lo/cwc;)Lo/fke;

    move-result-object v0

    new-instance v1, Lo/cwc$e;

    iget v2, p0, Lo/cwc$c;->b:I

    iget v3, p0, Lo/cwc$c;->a:I

    iget-wide v4, p0, Lo/cwc$c;->c:J

    sget-object v6, Lo/cwc$b;->e:Lo/cwc$b;

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Lo/cwc$e;-><init>(IIJLo/cwc$b;Lo/cwc$d;)V

    invoke-virtual {v0, v1}, Lo/fke;->a(Lo/cmo;)Z

    goto :goto_0

    .line 274
    :cond_0
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->b(Lo/cwc;)Lo/cmj;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 275
    iget-object v0, p0, Lo/cwc$c;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->b(Lo/cwc;)Lo/cmj;

    move-result-object v0

    new-instance v1, Lo/cwc$e;

    iget v2, p0, Lo/cwc$c;->b:I

    iget v3, p0, Lo/cwc$c;->a:I

    iget-wide v4, p0, Lo/cwc$c;->c:J

    sget-object v6, Lo/cwc$b;->e:Lo/cwc$b;

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Lo/cwc$e;-><init>(IIJLo/cwc$b;Lo/cwc$d;)V

    invoke-virtual {v0, v1}, Lo/cmj;->b(Lo/cmo;)Z

    .line 279
    :cond_1
    :goto_0
    return-void
.end method

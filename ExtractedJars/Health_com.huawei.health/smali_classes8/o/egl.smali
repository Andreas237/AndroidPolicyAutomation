.class public Lo/egl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/egl$c;,
        Lo/egl$e;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eih;>;"
        }
    .end annotation
.end field

.field private b:Lo/egl$c;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lo/egl$c;Lo/eih;>;"
        }
    .end annotation
.end field

.field private d:Lo/egl$e;

.field private e:Lo/ekj;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    sget-object v0, Lo/egl$c;->k:Lo/egl$c;

    iput-object v0, p0, Lo/egl;->b:Lo/egl$c;

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/egl;->a:Ljava/util/List;

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/egl;->c:Ljava/util/Map;

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egl;->d:Lo/egl$e;

    .line 43
    new-instance v0, Lo/ekj;

    invoke-direct {v0}, Lo/ekj;-><init>()V

    iput-object v0, p0, Lo/egl;->e:Lo/ekj;

    .line 59
    return-void
.end method

.method private a(JLo/egl$c;)J
    .locals 2

    .line 285
    sget-object v0, Lo/egl$c;->a:Lo/egl$c;

    if-ne p3, v0, :cond_0

    .line 287
    invoke-static {p1, p2}, Lo/ekg;->d(J)J

    move-result-wide v0

    return-wide v0

    .line 288
    :cond_0
    sget-object v0, Lo/egl$c;->d:Lo/egl$c;

    if-ne p3, v0, :cond_1

    .line 289
    invoke-static {p1, p2}, Lo/ekg;->b(J)J

    move-result-wide v0

    return-wide v0

    .line 290
    :cond_1
    sget-object v0, Lo/egl$c;->b:Lo/egl$c;

    if-ne p3, v0, :cond_2

    .line 291
    invoke-static {p1, p2}, Lo/ekg;->i(J)J

    move-result-wide v0

    return-wide v0

    .line 292
    :cond_2
    sget-object v0, Lo/egl$c;->e:Lo/egl$c;

    if-ne p3, v0, :cond_3

    .line 293
    invoke-static {p1, p2}, Lo/ekg;->u(J)J

    move-result-wide v0

    return-wide v0

    .line 294
    :cond_3
    sget-object v0, Lo/egl$c;->c:Lo/egl$c;

    if-ne p3, v0, :cond_4

    .line 296
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "unsupport showMode in computeSpecifiedLevelTimeBoarder"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 298
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "unsupport showMode in computeSpecifiedLevelTimeBoarder"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static synthetic a(Lo/egl;Lo/eih;Lo/eih;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Lo/egl;->a(Lo/eih;Lo/eih;)V

    return-void
.end method

.method private a(Lo/eih;Lo/eih;)V
    .locals 2

    .line 316
    invoke-virtual {p1}, Lo/eih;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lo/eih;->R()Z

    move-result v0

    if-nez v0, :cond_1

    .line 317
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "TweenAnimatiionMgr base on markerview,error markerview disable!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 322
    :cond_1
    invoke-virtual {p1}, Lo/eih;->K()Z

    move-result v0

    if-nez v0, :cond_2

    .line 323
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "TweenAnimatiionMgr base on markerview,error not contains markerview!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 326
    :cond_2
    invoke-virtual {p1}, Lo/eih;->M()Z

    move-result v0

    if-nez v0, :cond_3

    .line 327
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "TweenAnimatiionMgr base on markerview,error markerview time not validate!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 330
    :cond_3
    return-void
.end method

.method static synthetic b(Lo/egl;)Lo/ekj;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/egl;->e:Lo/ekj;

    return-object v0
.end method

.method static synthetic c(Lo/egl;Lo/egl$c;)Lo/egl$c;
    .locals 0

    .line 31
    iput-object p1, p0, Lo/egl;->b:Lo/egl$c;

    return-object p1
.end method

.method static synthetic d(Lo/egl;Lo/egl$c;Lo/egl$c;F)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2, p3}, Lo/egl;->e(Lo/egl$c;Lo/egl$c;F)V

    return-void
.end method

.method private e(Lo/egl$c;)Lo/eih;
    .locals 4

    .line 303
    iget-object v0, p0, Lo/egl;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/eih;

    .line 304
    if-nez v3, :cond_0

    .line 305
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "level unknown,queryLevelChart error:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 307
    :cond_0
    return-object v3
.end method

.method private e()V
    .locals 7

    .line 337
    iget-object v0, p0, Lo/egl;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    .line 338
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "checkViewPosition charts size less than one,error"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 340
    :cond_0
    iget-object v0, p0, Lo/egl;->a:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/eih;

    .line 341
    const/4 v0, 0x2

    new-array v3, v0, [I

    .line 342
    invoke-virtual {v2, v3}, Lo/eih;->getLocationInWindow([I)V

    .line 344
    const/4 v0, 0x2

    new-array v4, v0, [I

    .line 346
    const/4 v0, 0x0

    aget v0, v3, v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    aget v0, v3, v0

    if-nez v0, :cond_1

    .line 348
    return-void

    .line 352
    :cond_1
    iget-object v0, p0, Lo/egl;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/eih;

    .line 353
    invoke-virtual {v6, v4}, Lo/eih;->getLocationInWindow([I)V

    .line 354
    const/4 v0, 0x0

    aget v0, v4, v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    aget v0, v4, v0

    if-nez v0, :cond_2

    .line 355
    goto :goto_0

    .line 357
    :cond_2
    const/4 v0, 0x0

    aget v0, v3, v0

    const/4 v1, 0x0

    aget v1, v4, v1

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    aget v0, v3, v0

    const/4 v1, 0x1

    aget v1, v4, v1

    if-eq v0, v1, :cond_4

    .line 359
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "charts\'s LocationInWindow not same,error"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 361
    :cond_4
    goto :goto_0

    .line 362
    :cond_5
    return-void
.end method

.method private e(Lo/egl$c;Lo/egl$c;F)V
    .locals 1

    .line 311
    iget-object v0, p0, Lo/egl;->d:Lo/egl$e;

    invoke-interface {v0, p1, p2, p3}, Lo/egl$e;->c(Lo/egl$c;Lo/egl$c;F)V

    .line 312
    return-void
.end method


# virtual methods
.method public a(Lo/egl$c;)Z
    .locals 1

    .line 70
    iget-object v0, p0, Lo/egl;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 71
    const/4 v0, 0x1

    return v0

    .line 73
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()Lo/eih;
    .locals 3

    .line 365
    iget-object v0, p0, Lo/egl;->c:Ljava/util/Map;

    iget-object v1, p0, Lo/egl;->b:Lo/egl$c;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/eih;

    .line 366
    if-nez v2, :cond_0

    .line 367
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "level unknown,getCurrentLevelChart error"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 369
    :cond_0
    return-object v2
.end method

.method public b(Lo/egl$c;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lo/egl;->b:Lo/egl$c;

    .line 67
    return-void
.end method

.method public b(Lo/egl$c;Lo/eih;)V
    .locals 1

    .line 48
    iget-object v0, p0, Lo/egl;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    iget-object v0, p0, Lo/egl;->c:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    return-void
.end method

.method public b(Lo/egl$e;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lo/egl;->d:Lo/egl$e;

    .line 63
    return-void
.end method

.method public c(Lo/egl$c;)V
    .locals 18

    .line 159
    invoke-direct/range {p0 .. p0}, Lo/egl;->e()V

    .line 160
    move-object/from16 v0, p0

    iget-object v9, v0, Lo/egl;->b:Lo/egl$c;

    .line 161
    move-object/from16 v10, p1

    .line 163
    invoke-virtual/range {p0 .. p0}, Lo/egl;->b()Lo/eih;

    move-result-object v11

    .line 164
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lo/egl;->e(Lo/egl$c;)Lo/eih;

    move-result-object v12

    .line 177
    invoke-virtual {v11}, Lo/eih;->J()J

    move-result-wide v13

    .line 178
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v13, v14, v1}, Lo/egl;->a(JLo/egl$c;)J

    move-result-wide v15

    .line 181
    new-instance v0, Lo/egl$3;

    move-object/from16 v1, p0

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v0, v1, v2}, Lo/egl$3;-><init>(Lo/egl;Landroid/os/Handler;)V

    move-object/from16 v17, v0

    .line 216
    new-instance v0, Lo/egl$5;

    move-object/from16 v1, p0

    move-object v2, v11

    move-object v3, v12

    move-wide v4, v15

    move-object v6, v10

    move-object v7, v9

    move-object/from16 v8, v17

    invoke-direct/range {v0 .. v8}, Lo/egl$5;-><init>(Lo/egl;Lo/eih;Lo/eih;JLo/egl$c;Lo/egl$c;Lo/ekh;)V

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lo/ekh;->b(Lo/ekh$e;)V

    .line 280
    invoke-virtual/range {v17 .. v17}, Lo/ekh;->d()V

    .line 282
    return-void
.end method

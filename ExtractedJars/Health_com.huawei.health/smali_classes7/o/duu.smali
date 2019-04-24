.class public Lo/duu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dup;


# instance fields
.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Lo/duu;->e:Landroid/content/Context;

    .line 70
    return-void
.end method

.method private static a(II)I
    .locals 1

    .line 447
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 448
    return p0

    .line 450
    :cond_0
    return p1
.end method

.method private a(Lo/dvf;Lo/dvu;)I
    .locals 7

    .line 243
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 244
    invoke-direct {p0, v3, p2, p1}, Lo/duu;->a(Landroid/content/ContentValues;Lo/dvu;Lo/dvf;)Z

    move-result v4

    .line 245
    if-nez v4, :cond_0

    .line 246
    const/4 v0, -0x1

    return v0

    .line 248
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "medalID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\' and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "huid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lo/dvu;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 249
    const-string v0, "PLGACHIEVE_MedalConfigInfoDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "update selection="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    iget-object v0, p0, Lo/duu;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "medal_config_info_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v3, v5}, Lo/duk;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I

    move-result v6

    .line 251
    const-string v0, "PLGACHIEVE_MedalConfigInfoDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "update result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    return v6
.end method

.method private static a(JJ)J
    .locals 2

    .line 457
    cmp-long v0, p0, p2

    if-lez v0, :cond_0

    move-wide v0, p0

    goto :goto_0

    :cond_0
    move-wide v0, p2

    :goto_0
    return-wide v0
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 463
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 430
    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 431
    :cond_0
    return-object p0

    .line 433
    :cond_1
    return-object p1
.end method

.method private a(Landroid/content/ContentValues;Lo/dvu;Lo/dvf;)Z
    .locals 6

    .line 256
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 257
    const/4 v0, 0x0

    return v0

    .line 259
    :cond_0
    const/4 v5, 0x0

    .line 260
    instance-of v0, p3, Lo/dvu;

    if-eqz v0, :cond_1

    .line 261
    move-object v5, p3

    check-cast v5, Lo/dvu;

    .line 264
    :cond_1
    if-nez v5, :cond_2

    .line 265
    const/4 v0, 0x0

    return v0

    .line 267
    :cond_2
    const-string v0, "huid"

    invoke-virtual {p2}, Lo/dvu;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    const-string v0, "medalName"

    invoke-virtual {v5}, Lo/dvu;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvu;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duu;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    const-string v0, "medalID"

    invoke-virtual {p2}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    const-string v0, "medalType"

    invoke-virtual {v5}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duu;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    const-string v0, "activityId"

    invoke-virtual {v5}, Lo/dvu;->r()I

    move-result v1

    invoke-virtual {p2}, Lo/dvu;->r()I

    move-result v2

    invoke-static {v1, v2}, Lo/duu;->b(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 272
    const-string v0, "message"

    invoke-virtual {v5}, Lo/dvu;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvu;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duu;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    const-string v0, "grayDescription"

    invoke-virtual {v5}, Lo/dvu;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvu;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duu;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    const-string v0, "lightDescription"

    invoke-virtual {v5}, Lo/dvu;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvu;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duu;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    const-string v0, "grayDetailStyle"

    invoke-virtual {v5}, Lo/dvu;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvu;->n()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duu;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    const-string v0, "lightDetailStyle"

    invoke-virtual {v5}, Lo/dvu;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvu;->l()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duu;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    const-string v0, "grayPromotionName"

    invoke-virtual {v5}, Lo/dvu;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvu;->k()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duu;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    const-string v0, "lightPromotionName"

    invoke-virtual {v5}, Lo/dvu;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvu;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duu;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    const-string v0, "grayPromotionUrl"

    invoke-virtual {v5}, Lo/dvu;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvu;->g()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duu;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    const-string v0, "lightPromotionUrl"

    invoke-virtual {v5}, Lo/dvu;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvu;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duu;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    const-string v0, "grayListStyle"

    invoke-virtual {v5}, Lo/dvu;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvu;->h()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duu;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    const-string v0, "lightListStyle"

    invoke-virtual {v5}, Lo/dvu;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvu;->p()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duu;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    const-string v0, "shareImageUrl"

    invoke-virtual {v5}, Lo/dvu;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvu;->m()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duu;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    const-string v0, "location"

    invoke-virtual {v5}, Lo/dvu;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvu;->t()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duu;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    const-string v0, "actionType"

    invoke-virtual {v5}, Lo/dvu;->j()I

    move-result v1

    invoke-virtual {p2}, Lo/dvu;->j()I

    move-result v2

    invoke-static {v1, v2}, Lo/duu;->b(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 289
    const-string v0, "goal"

    invoke-virtual {v5}, Lo/dvu;->o()I

    move-result v1

    invoke-virtual {p2}, Lo/dvu;->o()I

    move-result v2

    invoke-static {v1, v2}, Lo/duu;->b(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 290
    const-string v0, "startTime"

    invoke-virtual {v5}, Lo/dvu;->q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvu;->q()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duu;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    const-string v0, "endTime"

    invoke-virtual {v5}, Lo/dvu;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvu;->u()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duu;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    const-string v0, "medalLevel"

    invoke-virtual {v5}, Lo/dvu;->C()I

    move-result v1

    invoke-virtual {p2}, Lo/dvu;->C()I

    move-result v2

    invoke-static {v1, v2}, Lo/duu;->b(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 294
    const-string v0, "medalLabel"

    invoke-virtual {v5}, Lo/dvu;->A()I

    move-result v1

    invoke-virtual {p2}, Lo/dvu;->A()I

    move-result v2

    invoke-static {v1, v2}, Lo/duu;->b(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 295
    const-string v0, "medalUnit"

    invoke-virtual {v5}, Lo/dvu;->B()I

    move-result v1

    invoke-virtual {p2}, Lo/dvu;->B()I

    move-result v2

    invoke-static {v1, v2}, Lo/duu;->b(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 297
    const-string v0, "takeEffectTime"

    invoke-virtual {v5}, Lo/dvu;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvu;->s()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duu;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    const-string v0, "isNewConfig"

    invoke-virtual {v5}, Lo/dvu;->x()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p2}, Lo/dvu;->x()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Lo/duu;->a(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 299
    const-string v0, "repeatable"

    invoke-virtual {v5}, Lo/dvu;->z()I

    move-result v1

    invoke-virtual {p2}, Lo/dvu;->z()I

    move-result v2

    invoke-static {v1, v2}, Lo/duu;->b(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 300
    const-string v0, "timestamp"

    invoke-virtual {v5}, Lo/dvu;->y()J

    move-result-wide v1

    invoke-virtual {p2}, Lo/dvu;->y()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Lo/duu;->a(JJ)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 302
    const-string v0, "reachStatus"

    invoke-virtual {v5}, Lo/dvu;->w()I

    move-result v1

    invoke-virtual {p2}, Lo/dvu;->w()I

    move-result v2

    invoke-static {v1, v2}, Lo/duu;->b(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 303
    const-string v0, "eventStatus"

    invoke-virtual {v5}, Lo/dvu;->v()I

    move-result v1

    invoke-virtual {p2}, Lo/dvu;->v()I

    move-result v2

    invoke-static {v1, v2}, Lo/duo;->c(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 304
    const/4 v0, 0x1

    return v0
.end method

.method private static b(II)I
    .locals 1

    .line 438
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 439
    return p0

    .line 441
    :cond_0
    return p1
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)Lo/dvf;
    .locals 7

    .line 83
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 84
    const-string v0, "PLGACHIEVE_MedalConfigInfoDBMgr"

    const-string v1, "MedalConfigInfoDBMgr, query ,id is null!return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    const/4 v0, 0x0

    return-object v0

    .line 88
    :cond_0
    const/4 v4, 0x0

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select *  from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/duu;->e:Landroid/content/Context;

    invoke-static {v1}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v1

    const-string v2, "medal_config_info_record"

    invoke-virtual {v1, v2}, Lo/duk;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "medalID"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "huid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 91
    const-string v0, "PLGACHIEVE_MedalConfigInfoDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query selection="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    iget-object v0, p0, Lo/duu;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    .line 93
    invoke-static {p1}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 92
    const/4 v2, 0x1

    invoke-virtual {v0, v2, v5, v1}, Lo/duk;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 95
    if-eqz v6, :cond_3

    .line 96
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 97
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 98
    new-instance v4, Lo/dvu;

    invoke-direct {v4}, Lo/dvu;-><init>()V

    .line 100
    :cond_1
    invoke-direct {p0, v6, v4}, Lo/duu;->d(Landroid/database/Cursor;Lo/dvu;)V

    goto :goto_0

    .line 102
    :cond_2
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 104
    :cond_3
    const-string v0, "PLGACHIEVE_MedalConfigInfoDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query MedalConfigInfoDBMgr="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v4, :cond_4

    const-string v2, "null"

    goto :goto_1

    :cond_4
    move-object v2, v4

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    return-object v4
.end method

.method private c(Landroid/content/ContentValues;Lo/dvu;)Z
    .locals 3

    .line 308
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-virtual {p2}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 309
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 311
    :cond_1
    const-string v0, "huid"

    invoke-virtual {p2}, Lo/dvu;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    const-string v0, "medalName"

    invoke-virtual {p2}, Lo/dvu;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/duu;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    const-string v0, "medalID"

    invoke-virtual {p2}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    const-string v0, "medalType"

    invoke-virtual {p2}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    const-string v0, "medalLevel"

    invoke-virtual {p2}, Lo/dvu;->C()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 316
    const-string v0, "medalUnit"

    invoke-virtual {p2}, Lo/dvu;->B()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 317
    const-string v0, "medalLabel"

    invoke-virtual {p2}, Lo/dvu;->A()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 319
    const-string v0, "activityId"

    invoke-virtual {p2}, Lo/dvu;->r()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 320
    const-string v0, "message"

    invoke-virtual {p2}, Lo/dvu;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    const-string v0, "grayDescription"

    invoke-virtual {p2}, Lo/dvu;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    const-string v0, "lightDescription"

    invoke-virtual {p2}, Lo/dvu;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    const-string v0, "grayDetailStyle"

    invoke-virtual {p2}, Lo/dvu;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    const-string v0, "lightDetailStyle"

    invoke-virtual {p2}, Lo/dvu;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    const-string v0, "grayPromotionName"

    invoke-virtual {p2}, Lo/dvu;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 326
    const-string v0, "lightPromotionName"

    invoke-virtual {p2}, Lo/dvu;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 327
    const-string v0, "grayPromotionUrl"

    invoke-virtual {p2}, Lo/dvu;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    const-string v0, "lightPromotionUrl"

    invoke-virtual {p2}, Lo/dvu;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    const-string v0, "grayListStyle"

    invoke-virtual {p2}, Lo/dvu;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    const-string v0, "lightListStyle"

    invoke-virtual {p2}, Lo/dvu;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    const-string v0, "shareImageUrl"

    invoke-virtual {p2}, Lo/dvu;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    const-string v0, "location"

    invoke-virtual {p2}, Lo/dvu;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    const-string v0, "actionType"

    invoke-virtual {p2}, Lo/dvu;->j()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 336
    const-string v0, "goal"

    invoke-virtual {p2}, Lo/dvu;->o()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 337
    const-string v0, "startTime"

    invoke-virtual {p2}, Lo/dvu;->q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    const-string v0, "endTime"

    invoke-virtual {p2}, Lo/dvu;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 340
    const-string v0, "takeEffectTime"

    invoke-virtual {p2}, Lo/dvu;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    const-string v0, "isNewConfig"

    invoke-virtual {p2}, Lo/dvu;->x()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 342
    const-string v0, "repeatable"

    invoke-virtual {p2}, Lo/dvu;->z()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 343
    const-string v0, "timestamp"

    invoke-virtual {p2}, Lo/dvu;->y()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 345
    const-string v0, "reachStatus"

    invoke-virtual {p2}, Lo/dvu;->w()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 346
    const-string v0, "eventStatus"

    invoke-virtual {p2}, Lo/dvu;->v()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 347
    const/4 v0, 0x1

    return v0
.end method

.method private d(Lo/dvu;)J
    .locals 7

    .line 166
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 167
    invoke-direct {p0, v3, p1}, Lo/duu;->c(Landroid/content/ContentValues;Lo/dvu;)Z

    move-result v4

    .line 168
    if-nez v4, :cond_0

    .line 169
    const-wide/16 v0, -0x1

    return-wide v0

    .line 171
    :cond_0
    iget-object v0, p0, Lo/duu;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "medal_config_info_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/duk;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide v5

    .line 172
    const-string v0, "PLGACHIEVE_MedalConfigInfoDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "insert result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    return-wide v5
.end method

.method private d(Ljava/lang/String;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lo/dvf;>;"
        }
    .end annotation

    .line 110
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 111
    const-string v0, "PLGACHIEVE_MedalConfigInfoDBMgr"

    const-string v1, "MedalLocationDBMgr, query ,id is null!return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    const/4 v0, 0x0

    return-object v0

    .line 115
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select *  from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/duu;->e:Landroid/content/Context;

    invoke-static {v1}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v1

    const-string v2, "medal_config_info_record"

    invoke-virtual {v1, v2}, Lo/duk;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "huid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 118
    const-string v0, "PLGACHIEVE_MedalConfigInfoDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query selection="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    iget-object v0, p0, Lo/duu;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    .line 120
    invoke-static {p1}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 119
    const/4 v2, 0x1

    invoke-virtual {v0, v2, v5, v1}, Lo/duk;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 122
    if-eqz v6, :cond_2

    .line 123
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 124
    new-instance v7, Lo/dvu;

    invoke-direct {v7}, Lo/dvu;-><init>()V

    .line 125
    invoke-direct {p0, v6, v7}, Lo/duu;->d(Landroid/database/Cursor;Lo/dvu;)V

    .line 126
    const-string v0, "PLGACHIEVE_MedalConfigInfoDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "medalConfigInfo="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Lo/dvu;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 128
    goto :goto_0

    .line 129
    :cond_1
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 131
    :cond_2
    const-string v0, "PLGACHIEVE_MedalConfigInfoDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query medalConfigInfoList="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    return-object v4
.end method

.method private d(Landroid/database/Cursor;Lo/dvu;)V
    .locals 34

    .line 351
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 352
    return-void

    .line 354
    :cond_0
    const-string v0, "huid"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lo/dvu;->setHuid(Ljava/lang/String;)V

    .line 355
    const-string v0, "medalName"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 356
    const-string v0, "medalID"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 357
    const-string v0, "medalType"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 358
    const-string v0, "message"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 360
    const-string v0, "grayDescription"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 361
    const-string v0, "lightDescription"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 363
    const-string v0, "grayPromotionName"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 364
    const-string v0, "grayPromotionUrl"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 366
    const-string v0, "lightPromotionName"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 367
    const-string v0, "lightPromotionUrl"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 369
    const-string v0, "grayListStyle"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 370
    const-string v0, "lightListStyle"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 372
    const-string v0, "grayDetailStyle"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 373
    const-string v0, "lightDetailStyle"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v16

    .line 375
    const-string v0, "shareImageUrl"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v17

    .line 376
    const-string v0, "goal"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v18

    .line 378
    const-string v0, "actionType"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v19

    .line 379
    const-string v0, "location"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v20

    .line 380
    const-string v0, "activityId"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v21

    .line 382
    const-string v0, "startTime"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v22

    .line 383
    const-string v0, "endTime"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v23

    .line 385
    const-string v0, "takeEffectTime"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v24

    .line 386
    const-string v0, "repeatable"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v25

    .line 387
    const-string v0, "isNewConfig"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v26

    .line 388
    const-string v0, "timestamp"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v27

    .line 390
    const-string v0, "medalLevel"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v29

    .line 391
    const-string v0, "medalLabel"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v30

    .line 392
    const-string v0, "medalUnit"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v31

    .line 394
    const-string v0, "reachStatus"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v32

    .line 395
    const-string v0, "eventStatus"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v33

    .line 396
    move-object/from16 v0, p2

    invoke-virtual {v0, v3}, Lo/dvu;->e(Ljava/lang/String;)V

    .line 397
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lo/dvu;->b(Ljava/lang/String;)V

    .line 398
    move-object/from16 v0, p2

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Lo/dvu;->e(I)V

    .line 399
    move-object/from16 v0, p2

    invoke-virtual {v0, v6}, Lo/dvu;->d(Ljava/lang/String;)V

    .line 400
    move-object/from16 v0, p2

    invoke-virtual {v0, v7}, Lo/dvu;->c(Ljava/lang/String;)V

    .line 401
    move-object/from16 v0, p2

    invoke-virtual {v0, v8}, Lo/dvu;->a(Ljava/lang/String;)V

    .line 402
    move-object/from16 v0, p2

    invoke-virtual {v0, v15}, Lo/dvu;->m(Ljava/lang/String;)V

    .line 403
    move-object/from16 v0, p2

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lo/dvu;->p(Ljava/lang/String;)V

    .line 404
    move-object/from16 v0, p2

    invoke-virtual {v0, v9}, Lo/dvu;->f(Ljava/lang/String;)V

    .line 405
    move-object/from16 v0, p2

    invoke-virtual {v0, v11}, Lo/dvu;->i(Ljava/lang/String;)V

    .line 406
    move-object/from16 v0, p2

    invoke-virtual {v0, v10}, Lo/dvu;->h(Ljava/lang/String;)V

    .line 407
    move-object/from16 v0, p2

    invoke-virtual {v0, v12}, Lo/dvu;->g(Ljava/lang/String;)V

    .line 408
    move-object/from16 v0, p2

    invoke-virtual {v0, v13}, Lo/dvu;->k(Ljava/lang/String;)V

    .line 409
    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Lo/dvu;->n(Ljava/lang/String;)V

    .line 410
    move-object/from16 v0, p2

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/dvu;->o(Ljava/lang/String;)V

    .line 411
    move-object/from16 v0, p2

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lo/dvu;->l(Ljava/lang/String;)V

    .line 412
    move-object/from16 v0, p2

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Lo/dvu;->g(I)V

    .line 413
    move-object/from16 v0, p2

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Lo/dvu;->a(I)V

    .line 414
    move-object/from16 v0, p2

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lo/dvu;->r(Ljava/lang/String;)V

    .line 415
    move-object/from16 v0, p2

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Lo/dvu;->u(Ljava/lang/String;)V

    .line 416
    move-object/from16 v0, p2

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Lo/dvu;->t(Ljava/lang/String;)V

    .line 417
    move-object/from16 v0, p2

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Lo/dvu;->c(I)V

    .line 418
    move-object/from16 v0, p2

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Lo/dvu;->b(I)V

    .line 419
    move-object/from16 v0, p2

    move-wide/from16 v1, v27

    invoke-virtual {v0, v1, v2}, Lo/dvu;->c(J)V

    .line 420
    move-object/from16 v0, p2

    move/from16 v1, v32

    invoke-virtual {v0, v1}, Lo/dvu;->h(I)V

    .line 421
    move-object/from16 v0, p2

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Lo/dvu;->d(I)V

    .line 422
    move-object/from16 v0, p2

    invoke-virtual {v0, v5}, Lo/dvu;->q(Ljava/lang/String;)V

    .line 423
    move-object/from16 v0, p2

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Lo/dvu;->i(I)V

    .line 424
    move-object/from16 v0, p2

    move/from16 v1, v30

    invoke-virtual {v0, v1}, Lo/dvu;->f(I)V

    .line 425
    move-object/from16 v0, p2

    move/from16 v1, v31

    invoke-virtual {v0, v1}, Lo/dvu;->k(I)V

    .line 426
    return-void
.end method


# virtual methods
.method public a(Lo/dvf;)I
    .locals 6

    .line 178
    const/4 v3, -0x1

    .line 179
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 180
    return v3

    .line 183
    :cond_0
    const/4 v4, 0x0

    .line 184
    instance-of v0, p1, Lo/dvu;

    if-eqz v0, :cond_1

    .line 185
    move-object v4, p1

    check-cast v4, Lo/dvu;

    .line 187
    :cond_1
    if-nez v4, :cond_2

    .line 188
    return v3

    .line 191
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "medalID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\' and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "huid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Lo/dvu;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 192
    const-string v0, "PLGACHIEVE_MedalConfigInfoDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "delete selection="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    iget-object v0, p0, Lo/duu;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "medal_config_info_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v5}, Lo/duk;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;)I

    move-result v3

    .line 194
    const-string v0, "PLGACHIEVE_MedalConfigInfoDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "delete result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    return v3
.end method

.method public a(Ljava/util/Map;)Lo/dvf;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lo/dvf;"
        }
    .end annotation

    .line 74
    const-string v0, "medalID"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "huid"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/duu;->c(Ljava/lang/String;Ljava/lang/String;)Lo/dvf;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/dvf;)I
    .locals 6

    .line 199
    const/4 v3, -0x1

    .line 200
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 201
    return v3

    .line 204
    :cond_0
    const/4 v4, 0x0

    .line 205
    instance-of v0, p1, Lo/dvu;

    if-eqz v0, :cond_1

    .line 206
    move-object v4, p1

    check-cast v4, Lo/dvu;

    .line 209
    :cond_1
    if-nez v4, :cond_2

    .line 210
    return v3

    .line 212
    :cond_2
    const-string v0, "PLGACHIEVE_MedalConfigInfoDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "medalConfigInfo="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lo/dvu;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    invoke-virtual {v4}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lo/dvu;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/duu;->c(Ljava/lang/String;Ljava/lang/String;)Lo/dvf;

    move-result-object v5

    .line 215
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 216
    invoke-virtual {p0, v5, p1}, Lo/duu;->e(Lo/dvf;Lo/dvf;)I

    move-result v0

    return v0

    .line 218
    :cond_3
    const/4 v0, -0x1

    return v0
.end method

.method public e(Lo/dvf;Lo/dvf;)I
    .locals 3

    .line 222
    const/4 v1, -0x1

    .line 223
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 224
    return v1

    .line 227
    :cond_0
    const/4 v2, 0x0

    .line 228
    instance-of v0, p2, Lo/dvu;

    if-eqz v0, :cond_1

    .line 229
    move-object v2, p2

    check-cast v2, Lo/dvu;

    .line 231
    :cond_1
    if-nez v2, :cond_2

    .line 232
    return v1

    .line 235
    :cond_2
    invoke-direct {p0, p1, v2}, Lo/duu;->a(Lo/dvf;Lo/dvu;)I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    .line 238
    return v1
.end method

.method public e(Lo/dvf;)J
    .locals 7

    .line 137
    const-wide/16 v3, -0x1

    .line 138
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 139
    return-wide v3

    .line 142
    :cond_0
    const/4 v5, 0x0

    .line 143
    instance-of v0, p1, Lo/dvu;

    if-eqz v0, :cond_1

    .line 144
    move-object v5, p1

    check-cast v5, Lo/dvu;

    .line 147
    :cond_1
    const-string v0, "PLGACHIEVE_MedalConfigInfoDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "medalConfigInfo="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x0

    if-eq v2, v5, :cond_2

    invoke-virtual {v5}, Lo/dvu;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    const-string v2, "null"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    if-nez v5, :cond_3

    .line 149
    return-wide v3

    .line 153
    :cond_3
    invoke-virtual {v5}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Lo/dvu;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/duu;->c(Ljava/lang/String;Ljava/lang/String;)Lo/dvf;

    move-result-object v6

    .line 154
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 155
    invoke-virtual {p0, v6, p1}, Lo/duu;->e(Lo/dvf;Lo/dvf;)I

    move-result v0

    int-to-long v0, v0

    return-wide v0

    .line 158
    :cond_4
    invoke-direct {p0, v5}, Lo/duu;->d(Lo/dvu;)J

    move-result-wide v0

    add-long/2addr v3, v0

    .line 160
    return-wide v3
.end method

.method public e(Ljava/util/Map;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/List<Lo/dvf;>;"
        }
    .end annotation

    .line 78
    const-string v0, "huid"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/duu;->d(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

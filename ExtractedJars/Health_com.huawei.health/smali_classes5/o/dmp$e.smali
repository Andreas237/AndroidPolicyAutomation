.class Lo/dmp$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dmi;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dmp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic d:Lo/dmp;


# direct methods
.method private constructor <init>(Lo/dmp;)V
    .locals 0

    .line 332
    iput-object p1, p0, Lo/dmp$e;->d:Lo/dmp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/dmp;Lo/dmp$3;)V
    .locals 0

    .line 332
    invoke-direct {p0, p1}, Lo/dmp$e;-><init>(Lo/dmp;)V

    return-void
.end method


# virtual methods
.method public d(Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;)V
    .locals 12

    .line 336
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter onDataChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    iget-object v0, p0, Lo/dmp$e;->d:Lo/dmp;

    invoke-static {v0}, Lo/dmp;->b(Lo/dmp;)Lo/dmk;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p0}, Lo/dmk;->b(ILo/dmi;)V

    .line 341
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 342
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDataChanged wrapper is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    return-void

    .line 346
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->getResponseCode()I

    move-result v4

    .line 347
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    const/16 v0, 0x65

    if-eq v0, v4, :cond_1

    .line 348
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "http connection success, response abnormal code is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    return-void

    .line 353
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->getResponse()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 354
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "labels  from notify "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    iget-object v0, p0, Lo/dmp$e;->d:Lo/dmp;

    invoke-static {v0}, Lo/dmp;->d(Lo/dmp;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v6

    .line 359
    iget-object v0, p0, Lo/dmp$e;->d:Lo/dmp;

    invoke-static {v0}, Lo/dmp;->c(Lo/dmp;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 360
    iget-object v0, p0, Lo/dmp$e;->d:Lo/dmp;

    const-string v1, "_userLabel_key"

    invoke-static {v0, v1, v6}, Lo/dmp;->c(Lo/dmp;Ljava/lang/String;Lo/cwz;)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 362
    :cond_2
    iget-object v0, p0, Lo/dmp$e;->d:Lo/dmp;

    invoke-static {v0}, Lo/dmp;->c(Lo/dmp;)Ljava/lang/String;

    move-result-object v7

    .line 364
    :goto_0
    iget-object v0, p0, Lo/dmp$e;->d:Lo/dmp;

    invoke-static {v0, v7}, Lo/dmp;->a(Lo/dmp;Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    .line 365
    iget-object v0, p0, Lo/dmp$e;->d:Lo/dmp;

    invoke-static {v0, v8, v5}, Lo/dmp;->b(Lo/dmp;Ljava/util/List;Ljava/util/List;)Ljava/util/Map;

    move-result-object v9

    .line 368
    iget-object v0, p0, Lo/dmp$e;->d:Lo/dmp;

    invoke-static {v0, v5}, Lo/dmp;->c(Lo/dmp;Ljava/util/List;)Ljava/lang/String;

    move-result-object v10

    .line 370
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "labelStr = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 374
    const-string v0, "_userLabel_key"

    invoke-interface {v11, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    const-string v0, "_cacheTime_key"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v11, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    iget-object v0, p0, Lo/dmp$e;->d:Lo/dmp;

    invoke-static {v0, v11, v6}, Lo/dmp;->e(Lo/dmp;Ljava/util/Map;Lo/cwz;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 379
    iget-object v0, p0, Lo/dmp$e;->d:Lo/dmp;

    invoke-static {v0, v10}, Lo/dmp;->b(Lo/dmp;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1

    .line 381
    :cond_3
    iget-object v0, p0, Lo/dmp$e;->d:Lo/dmp;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dmp;->b(Lo/dmp;Ljava/lang/String;)Ljava/lang/String;

    .line 385
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v9, :cond_4

    .line 386
    iget-object v0, p0, Lo/dmp$e;->d:Lo/dmp;

    invoke-static {v0, v9}, Lo/dmp;->a(Lo/dmp;Ljava/util/Map;)V

    .line 388
    :cond_4
    return-void
.end method

.class Lo/dgr$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dhj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dgr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dgr;


# direct methods
.method constructor <init>(Lo/dgr;)V
    .locals 0

    .line 417
    iput-object p1, p0, Lo/dgr$4;->c:Lo/dgr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/location/Location;)V
    .locals 18

    .line 423
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onLocationChanged enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgr$4;->c:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->c(Lo/dgr;)Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 425
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    :try_start_0
    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 426
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onLocationChanged loacation is not gps location,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 427
    monitor-exit v6

    return-void

    .line 429
    :cond_0
    move-object/from16 v0, p0

    :try_start_1
    iget-object v0, v0, Lo/dgr$4;->c:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->b(Lo/dgr;)Lcom/huawei/datatype/GpsParameter;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 430
    new-instance v7, Lcom/huawei/datatype/GPSStruct;

    invoke-direct {v7}, Lcom/huawei/datatype/GPSStruct;-><init>()V

    .line 431
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgr$4;->c:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->b(Lo/dgr;)Lcom/huawei/datatype/GpsParameter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/datatype/GpsParameter;->getGps_info_bitmap()I

    move-result v8

    .line 432
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-static {v8}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->reverse()Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v9

    .line 433
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgr$4;->c:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->a(Lo/dgr;)Landroid/location/Location;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-static {v0, v1}, Lo/dhr;->c(Landroid/location/Location;Landroid/location/Location;)F

    move-result v10

    .line 434
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_5

    const/4 v0, 0x0

    cmpg-float v0, v0, v10

    if-gtz v0, :cond_5

    .line 435
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgr$4;->c:Lo/dgr;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dgr$4;->c:Lo/dgr;

    invoke-static {v1}, Lo/dgr;->f(Lo/dgr;)J

    move-result-wide v1

    const/high16 v3, 0x41200000    # 10.0f

    mul-float/2addr v3, v10

    float-to-int v3, v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    invoke-static {v0, v1, v2}, Lo/dgr;->a(Lo/dgr;J)J

    .line 436
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onLocationChanged speed="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getSpeed()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",distance="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",altitude="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getAltitude()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",totaldistance="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/dgr$4;->c:Lo/dgr;

    invoke-static {v3}, Lo/dgr;->f(Lo/dgr;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",longitude="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",latitude="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 437
    const/4 v0, 0x0

    if-eq v0, v9, :cond_5

    .line 438
    const/4 v11, 0x0

    :goto_0
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v11, v0, :cond_2

    .line 439
    invoke-virtual {v9, v11}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x31

    if-ne v1, v0, :cond_1

    .line 440
    move v0, v11

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dgr$4;->c:Lo/dgr;

    invoke-static {v1}, Lo/dgr;->f(Lo/dgr;)J

    move-result-wide v1

    move-object/from16 v3, p1

    move v4, v10

    move-object v5, v7

    invoke-static/range {v0 .. v5}, Lo/dgo;->e(IJLandroid/location/Location;FLcom/huawei/datatype/GPSStruct;)V

    .line 438
    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 443
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    .line 444
    const-wide/16 v13, 0x0

    .line 445
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgr$4;->c:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->a(Lo/dgr;)Landroid/location/Location;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 446
    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getTime()J

    move-result-wide v0

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/dgr$4;->c:Lo/dgr;

    invoke-static {v2}, Lo/dgr;->a(Lo/dgr;)Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v2}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    sub-long v13, v0, v2

    .line 448
    :cond_3
    sub-long v15, v11, v13

    .line 449
    const-wide/16 v0, 0x3e8

    div-long v0, v15, v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/datatype/GPSStruct;->setGps_start_time(J)V

    .line 450
    const-wide/16 v0, 0x3e8

    div-long v0, v11, v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/datatype/GPSStruct;->setGps_end_time(J)V

    .line 451
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgr$4;->c:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->h(Lo/dgr;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 452
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgr$4;->c:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->b(Lo/dgr;)Lcom/huawei/datatype/GpsParameter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/datatype/GpsParameter;->getGps_para_format()I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_4

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgr$4;->c:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->b(Lo/dgr;)Lcom/huawei/datatype/GpsParameter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/datatype/GpsParameter;->getGps_para_format()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_5

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgr$4;->c:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->h(Lo/dgr;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dgr$4;->c:Lo/dgr;

    invoke-static {v1}, Lo/dgr;->b(Lo/dgr;)Lcom/huawei/datatype/GpsParameter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/datatype/GpsParameter;->getGps_para_element_num()I

    move-result v1

    if-ne v0, v1, :cond_5

    .line 454
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgr$4;->c:Lo/dgr;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dgr$4;->c:Lo/dgr;

    invoke-static {v1}, Lo/dgr;->h(Lo/dgr;)Ljava/util/List;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/dgr$4;->c:Lo/dgr;

    iget-object v2, v2, Lo/dgr;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->hasSpeed()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/dgr;->c(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 455
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgr$4;->c:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->h(Lo/dgr;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 459
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgr$4;->c:Lo/dgr;

    move-object/from16 v1, p1

    invoke-static {v0, v1}, Lo/dgr;->b(Lo/dgr;Landroid/location/Location;)Landroid/location/Location;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 461
    :cond_6
    monitor-exit v6

    goto :goto_1

    :catchall_0
    move-exception v17

    monitor-exit v6

    throw v17

    .line 462
    :goto_1
    return-void
.end method

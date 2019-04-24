.class public Lcom/huawei/hihealthservice/old/model/SportData;
.super Lcom/huawei/hihealthservice/old/model/HealthData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/model/SportData$MetValue;,
        Lcom/huawei/hihealthservice/old/model/SportData$SportCoefficient;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x2bc19800d29e4e48L


# instance fields
.field private calories:[I

.field private distances:[I

.field private steps:[I

.field private storeys:[I

.field private totalCalories:J

.field private totalDistance:J

.field private totalSteps:J

.field private totalStoreys:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 327
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;-><init>()V

    .line 328
    return-void
.end method

.method public constructor <init>([I[I[I)V
    .locals 1

    .line 330
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;-><init>()V

    .line 331
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 332
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/model/SportData;->steps:[I

    .line 334
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 335
    invoke-virtual {p2}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/model/SportData;->calories:[I

    .line 337
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p3, :cond_2

    .line 338
    invoke-virtual {p3}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/model/SportData;->distances:[I

    .line 340
    :cond_2
    return-void
.end method

.method public static getCaloriesWithDistance(FFI)F
    .locals 4

    .line 400
    const/high16 v0, 0x42700000    # 60.0f

    div-float v0, p0, v0

    float-to-double v0, v0

    const-wide v2, 0x400ccccccccccccdL    # 3.6

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x400c000000000000L    # 3.5

    mul-double/2addr v0, v2

    float-to-double v2, p1

    mul-double/2addr v0, v2

    invoke-static {p2}, Lcom/huawei/hihealthservice/old/model/SportData;->getSportCoefficientBySportType(I)F

    move-result v2

    float-to-double v2, v2

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x4069000000000000L    # 200.0

    div-double/2addr v0, v2

    double-to-float v0, v0

    return v0
.end method

.method public static getCaloriesWithFloor(FI)F
    .locals 2

    .line 447
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/model/SportData;->getFloorWeigthCoefficient(F)F

    move-result v0

    int-to-float v1, p1

    mul-float/2addr v0, v1

    const v1, 0x3f95c28f    # 1.17f

    mul-float/2addr v0, v1

    return v0
.end method

.method public static getCaloriesWithSpeed(FFFI)F
    .locals 6

    .line 420
    const/high16 v0, 0x42700000    # 60.0f

    mul-float/2addr v0, p1

    div-float v0, p0, v0

    float-to-double v0, v0

    const-wide v2, 0x400ccccccccccccdL    # 3.6

    mul-double/2addr v0, v2

    double-to-float v4, v0

    .line 421
    const/high16 v5, 0x40000000    # 2.0f

    .line 422
    packed-switch p3, :pswitch_data_0

    goto :goto_0

    .line 426
    :pswitch_0
    invoke-static {v4}, Lcom/huawei/hihealthservice/old/model/SportData$MetValue;->getMetByWalkSpeed(F)F

    move-result v5

    .line 427
    goto :goto_0

    .line 430
    :pswitch_1
    invoke-static {v4}, Lcom/huawei/hihealthservice/old/model/SportData$MetValue;->getMetByCycleSpeed(F)F

    move-result v5

    .line 431
    .line 435
    :goto_0
    float-to-double v0, v5

    const-wide/high16 v2, 0x400c000000000000L    # 3.5

    mul-double/2addr v0, v2

    float-to-double v2, p2

    mul-double/2addr v0, v2

    float-to-double v2, p1

    mul-double/2addr v0, v2

    invoke-static {p3}, Lcom/huawei/hihealthservice/old/model/SportData;->getSportCoefficientBySportType(I)F

    move-result v2

    float-to-double v2, v2

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x4069000000000000L    # 200.0

    div-double/2addr v0, v2

    double-to-float v0, v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static getCaloriesWithSteps(I)F
    .locals 2

    .line 383
    int-to-float v0, p0

    const v1, 0x3cf5c28f    # 0.03f

    mul-float/2addr v0, v1

    return v0
.end method

.method public static getDistanceWithSteps(I)F
    .locals 2

    .line 356
    int-to-float v0, p0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    return v0
.end method

.method public static getDistanceWithSteps(IF)F
    .locals 2

    .line 370
    int-to-float v0, p0

    mul-float/2addr v0, p1

    const v1, 0x3ed70a3d    # 0.42f

    mul-float/2addr v0, v1

    return v0
.end method

.method private static getFloorWeigthCoefficient(F)F
    .locals 3

    .line 451
    const/high16 v2, 0x3f800000    # 1.0f

    .line 452
    const/high16 v0, 0x42480000    # 50.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_0

    .line 453
    return v2

    .line 455
    :cond_0
    const/high16 v0, 0x42480000    # 50.0f

    sub-float v0, p0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const v1, 0x3e4ccccd    # 0.2f

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    add-float v2, v0, v1

    .line 456
    return v2
.end method

.method public static getSportCoefficientBySportType(I)F
    .locals 2

    .line 467
    const/high16 v1, 0x3f800000    # 1.0f

    .line 468
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 471
    :pswitch_0
    const/high16 v1, 0x3f800000    # 1.0f

    .line 472
    goto :goto_0

    .line 474
    :pswitch_1
    const/high16 v1, 0x3f800000    # 1.0f

    .line 475
    goto :goto_0

    .line 477
    :pswitch_2
    const/high16 v1, 0x3f800000    # 1.0f

    .line 478
    goto :goto_0

    .line 480
    :pswitch_3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 481
    .line 486
    :goto_0
    return v1

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public bridge synthetic clone()Lcom/huawei/hihealthservice/old/model/HealthData;
    .locals 1

    .line 22
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/model/SportData;->clone()Lcom/huawei/hihealthservice/old/model/SportData;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/model/SportData;
    .locals 1

    .line 343
    invoke-super {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;->clone()Lcom/huawei/hihealthservice/old/model/HealthData;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/model/SportData;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 22
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/model/SportData;->clone()Lcom/huawei/hihealthservice/old/model/SportData;

    move-result-object v0

    return-object v0
.end method

.method public getCalories()[I
    .locals 2

    .line 297
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/SportData;->calories:[I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 298
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0

    .line 300
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/SportData;->calories:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method public getDistances()[I
    .locals 2

    .line 314
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/SportData;->distances:[I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 315
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0

    .line 317
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/SportData;->distances:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method public getSteps()[I
    .locals 2

    .line 279
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/SportData;->steps:[I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 280
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0

    .line 282
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/SportData;->steps:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method public getStoreys()[I
    .locals 2

    .line 261
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/SportData;->storeys:[I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 262
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0

    .line 264
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/SportData;->storeys:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method public getTotalCalories()J
    .locals 2

    .line 530
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/SportData;->totalCalories:J

    return-wide v0
.end method

.method public getTotalDistance()J
    .locals 2

    .line 517
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/SportData;->totalDistance:J

    return-wide v0
.end method

.method public getTotalSteps()J
    .locals 2

    .line 504
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/SportData;->totalSteps:J

    return-wide v0
.end method

.method public getTotalStoreys()J
    .locals 2

    .line 491
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/SportData;->totalStoreys:J

    return-wide v0
.end method

.method public setCalories([I)V
    .locals 1

    .line 304
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 305
    return-void

    .line 307
    :cond_0
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/model/SportData;->calories:[I

    .line 308
    return-void
.end method

.method public setDistances([I)V
    .locals 1

    .line 321
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 322
    return-void

    .line 324
    :cond_0
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/model/SportData;->distances:[I

    .line 325
    return-void
.end method

.method public setSteps([I)V
    .locals 1

    .line 287
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 288
    return-void

    .line 290
    :cond_0
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/model/SportData;->steps:[I

    .line 291
    return-void
.end method

.method public setStoreys([I)V
    .locals 1

    .line 269
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 270
    return-void

    .line 272
    :cond_0
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/model/SportData;->storeys:[I

    .line 273
    return-void
.end method

.method public setTotalCalories(J)V
    .locals 0

    .line 535
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/model/SportData;->totalCalories:J

    .line 536
    return-void
.end method

.method public setTotalDistance(J)V
    .locals 0

    .line 522
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/model/SportData;->totalDistance:J

    .line 523
    return-void
.end method

.method public setTotalSteps(J)V
    .locals 0

    .line 509
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/model/SportData;->totalSteps:J

    .line 510
    return-void
.end method

.method public setTotalStoreys(J)V
    .locals 0

    .line 496
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/model/SportData;->totalStoreys:J

    .line 497
    return-void
.end method

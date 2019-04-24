.class public Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String;

.field private static instance:Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;


# instance fields
.field private calibrationResultArr:[F

.field private gameScore:I

.field private mCalibData:[F

.field private mCalibrationScore:I

.field private mCallBack:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private mMaxDuration:I

.field private mRealCalibScore:F

.field private mSignalTime:I

.field private maxScore:F

.field private minScore:F

.field private reserve_1:I

.field private reserve_2:I

.field private reserve_3:I

.field private singleThreadPool:Ljava/util/concurrent/ExecutorService;

.field private type:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 31
    const-class v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    .line 38
    const-string v0, "DetailStressJni"

    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 39
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "load .so success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    goto :goto_0

    .line 40
    :catch_0
    move-exception v4

    .line 41
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "load .so fail"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/UnsatisfiedLinkError;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    :goto_0
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const/16 v0, 0x12

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibData:[F

    .line 55
    const/16 v0, 0xa

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->calibrationResultArr:[F

    .line 56
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mMaxDuration:I

    .line 57
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibrationScore:I

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->maxScore:F

    .line 59
    const/high16 v0, 0x42c80000    # 100.0f

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->minScore:F

    .line 60
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mRealCalibScore:F

    .line 65
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->singleThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 69
    return-void
.end method

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    .line 28
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;)I
    .locals 1

    .line 28
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->type:I

    return v0
.end method

.method static synthetic access$200(Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;I[I[I)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->stressCloseProcess(I[I[I)V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;I[I[I)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->stressCalibrationCloseProcess(I[I[I)V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;I[I[I)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->relaxCloseProcessNew(I[I[I)V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;I[I[I)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->gameCloseProcess(I[I[I)V

    return-void
.end method

.method private gameClosePreProcess(Lorg/json/JSONObject;)V
    .locals 5

    .line 234
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 236
    const-string v0, "duration"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mSignalTime:I

    .line 237
    const-string v0, "score"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->gameScore:I

    .line 238
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(), mSignalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mSignalTime:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(), gameScore: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->gameScore:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 242
    goto :goto_0

    .line 240
    :catch_0
    move-exception v4

    .line 241
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(),"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    :cond_0
    :goto_0
    return-void
.end method

.method private gameCloseProcess(I[I[I)V
    .locals 11

    .line 422
    move-object v0, p0

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->reserve_1:I

    iget v2, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->reserve_2:I

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mSignalTime:I

    move v4, p1

    iget v5, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->gameScore:I

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v0 .. v7}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->isValidGameParam(IIIII[I[I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 425
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->reserve_1:I

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->reserve_2:I

    iget v2, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mSignalTime:I

    move v3, p1

    iget v4, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->gameScore:I

    move-object v5, p2

    move-object v6, p3

    invoke-static/range {v0 .. v6}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getGameResultFromAlgorithm(IIIII[I[I)[F

    move-result-object v8

    .line 427
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 430
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    array-length v0, v8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    .line 431
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), resultFromAlgorithm.length : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v8

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    const-string v0, "type"

    const/16 v1, 0xd

    :try_start_0
    invoke-virtual {v9, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 436
    const-string v0, "flag"

    const/4 v1, 0x7

    aget v1, v8, v1

    float-to-double v1, v1

    invoke-virtual {v9, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 437
    const-string v0, "final_score"

    const/4 v1, 0x5

    aget v1, v8, v1

    float-to-double v1, v1

    invoke-virtual {v9, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 438
    const-string v0, "p_score"

    const/4 v1, 0x4

    aget v1, v8, v1

    float-to-double v1, v1

    invoke-virtual {v9, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 439
    const-string v0, "d_score"

    const/4 v1, 0x3

    aget v1, v8, v1

    float-to-double v1, v1

    invoke-virtual {v9, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 440
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), type, flag, final_score, p_score, d_score:13 ,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x7

    aget v3, v8, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x5

    aget v3, v8, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x4

    aget v3, v8, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x3

    aget v3, v8, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 442
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCallBack:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 443
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCallBack:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v9}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 447
    :cond_0
    goto :goto_0

    .line 445
    :catch_0
    move-exception v10

    .line 446
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    :goto_0
    const/4 v10, 0x0

    :goto_1
    array-length v0, v8

    if-ge v10, v0, :cond_1

    .line 449
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), gameFromAlgorithm["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "]: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget v3, v8, v10

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_1
    goto :goto_2

    .line 452
    :cond_2
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processRRData(), resultFromAlgorithm is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    const/16 v0, 0x65

    invoke-direct {p0, v0}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->inValidCallBackProcess(I)V

    .line 455
    :goto_2
    goto :goto_3

    .line 457
    :cond_3
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalid gameParam!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 458
    const/16 v0, 0x64

    invoke-direct {p0, v0}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->inValidCallBackProcess(I)V

    .line 460
    :goto_3
    return-void
.end method

.method private gameOpenPreProcess(Lorg/json/JSONObject;)V
    .locals 5

    .line 247
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 249
    const-string v0, "max_duration"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mMaxDuration:I

    .line 250
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(), mMaxDuration: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mMaxDuration:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 253
    goto :goto_0

    .line 251
    :catch_0
    move-exception v4

    .line 252
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(),"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    :cond_0
    :goto_0
    return-void
.end method

.method public static native getGameResultFromAlgorithm(IIIII[I[I)[F
.end method

.method public static getInstance()Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;
    .locals 2

    .line 74
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->instance:Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 75
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    invoke-direct {v0}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->instance:Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    .line 77
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->instance:Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    return-object v0
.end method

.method public static native getRelaxResultFromAlgorithm(IIIII[I[I)[F
.end method

.method public static native getStressResultFromAlgorithm([FII[I[I)[F
.end method

.method private inValidCallBackProcess(I)V
    .locals 7

    .line 650
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "inValidCallBackProcess(), errorFlagCode :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 651
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "inValidCallBackProcess(), type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->type:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 652
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 654
    const-string v0, "type"

    :try_start_0
    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->type:I

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 655
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->type:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 659
    :sswitch_0
    const-string v0, "flag"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 660
    const-string v0, "score"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 661
    const-string v0, "grade"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 662
    goto/16 :goto_0

    .line 664
    :sswitch_1
    const-string v0, "flag"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 665
    const-string v0, "grade"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 666
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 667
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 668
    const-string v0, "bar_count"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 669
    const-string v0, "codex_1"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 670
    const-string v0, "codex_2"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 671
    const-string v0, "codex_3"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 672
    const-string v0, "codex_4"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 673
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 674
    const-string v0, "bar_codex"

    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 675
    goto :goto_0

    .line 677
    :sswitch_2
    const-string v0, "flag"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 678
    const-string v0, "final_score"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 679
    const-string v0, "p_score"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 680
    const-string v0, "d_score"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 681
    .line 685
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCallBack:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 686
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "inValidCallBackProcess(), "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 687
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCallBack:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 691
    :cond_0
    goto :goto_1

    .line 689
    :catch_0
    move-exception v5

    .line 690
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "inValidCallBackProcess(), "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 692
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x5 -> :sswitch_0
        0xa -> :sswitch_1
        0xd -> :sswitch_2
    .end sparse-switch
.end method

.method private isValidGameParam(IIIII[I[I)Z
    .locals 2

    .line 463
    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    if-ltz p3, :cond_0

    if-ltz p4, :cond_0

    if-ltz p5, :cond_0

    array-length v0, p6

    array-length v1, p7

    if-eq v0, v1, :cond_1

    .line 465
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 467
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private isValidRelaxParam(IIIII[I[I)Z
    .locals 2

    .line 519
    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    if-ltz p3, :cond_0

    if-ltz p4, :cond_0

    if-ltz p5, :cond_0

    array-length v0, p6

    array-length v1, p7

    if-eq v0, v1, :cond_1

    .line 521
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 523
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private isValidStressParam([FII[I[I)Z
    .locals 2

    .line 695
    array-length v0, p1

    const/16 v1, 0x12

    if-ne v0, v1, :cond_0

    if-ltz p2, :cond_0

    if-ltz p3, :cond_0

    array-length v0, p4

    array-length v1, p5

    if-eq v0, v1, :cond_1

    .line 697
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 699
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private relaxClosePreProcess(Lorg/json/JSONObject;)V
    .locals 5

    .line 259
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 261
    const-string v0, "duration"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mSignalTime:I

    .line 262
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(), mSignalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mSignalTime:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 265
    goto :goto_0

    .line 263
    :catch_0
    move-exception v4

    .line 264
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(),"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    :cond_0
    :goto_0
    return-void
.end method

.method private relaxCloseProcessNew(I[I[I)V
    .locals 12

    .line 473
    move-object v0, p0

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->reserve_1:I

    iget v2, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->reserve_2:I

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->reserve_3:I

    iget v4, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mSignalTime:I

    move v5, p1

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v0 .. v7}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->isValidRelaxParam(IIIII[I[I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 476
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->reserve_1:I

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->reserve_2:I

    iget v2, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->reserve_3:I

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mSignalTime:I

    move v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-static/range {v0 .. v6}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getRelaxResultFromAlgorithm(IIIII[I[I)[F

    move-result-object v8

    .line 478
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 480
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    array-length v0, v8

    const/16 v1, 0x17

    if-ne v0, v1, :cond_2

    .line 481
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), resultFromAlgorithm.length : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v8

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    const-string v0, "type"

    const/16 v1, 0xa

    :try_start_0
    invoke-virtual {v9, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 486
    const-string v0, "flag"

    const/16 v1, 0x14

    aget v1, v8, v1

    float-to-double v1, v1

    invoke-virtual {v9, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 487
    const-string v0, "grade"

    const/16 v1, 0xe

    aget v1, v8, v1

    float-to-double v1, v1

    invoke-virtual {v9, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 488
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), type, flag, grade :10 ,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0x14

    aget v3, v8, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0xe

    aget v3, v8, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 489
    new-instance v10, Lorg/json/JSONArray;

    invoke-direct {v10}, Lorg/json/JSONArray;-><init>()V

    .line 490
    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 491
    const-string v0, "bar_count"

    const/16 v1, 0x8

    aget v1, v8, v1

    float-to-double v1, v1

    invoke-virtual {v11, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 492
    const-string v0, "codex_1"

    const/16 v1, 0x9

    aget v1, v8, v1

    float-to-double v1, v1

    invoke-virtual {v11, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 493
    const-string v0, "codex_2"

    const/16 v1, 0xa

    aget v1, v8, v1

    float-to-double v1, v1

    invoke-virtual {v11, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 494
    const-string v0, "codex_3"

    const/16 v1, 0xb

    aget v1, v8, v1

    float-to-double v1, v1

    invoke-virtual {v11, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 495
    const-string v0, "codex_4"

    const/16 v1, 0xc

    aget v1, v8, v1

    float-to-double v1, v1

    invoke-virtual {v11, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 496
    invoke-virtual {v10, v11}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 497
    const-string v0, "bar_codex"

    invoke-virtual {v9, v0, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 498
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCallBack:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 499
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCallBack:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v9}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 503
    :cond_0
    goto :goto_0

    .line 501
    :catch_0
    move-exception v10

    .line 502
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 504
    :goto_0
    const/4 v10, 0x0

    :goto_1
    array-length v0, v8

    if-ge v10, v0, :cond_1

    .line 505
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), relaxResultFromAlgorithm["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "]: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget v3, v8, v10

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 504
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_1
    goto :goto_2

    .line 508
    :cond_2
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processRRData(), resultFromAlgorithm is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 509
    const/16 v0, 0x65

    invoke-direct {p0, v0}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->inValidCallBackProcess(I)V

    .line 511
    :goto_2
    goto :goto_3

    .line 513
    :cond_3
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalid relaxParam!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 514
    const/16 v0, 0x64

    invoke-direct {p0, v0}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->inValidCallBackProcess(I)V

    .line 516
    :goto_3
    return-void
.end method

.method private relaxOpenPreProcess(Lorg/json/JSONObject;)V
    .locals 5

    .line 270
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 272
    const-string v0, "max_duration"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mMaxDuration:I

    .line 273
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(), mMaxDuration: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mMaxDuration:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 276
    goto :goto_0

    .line 274
    :catch_0
    move-exception v4

    .line 275
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(), "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    :cond_0
    :goto_0
    return-void
.end method

.method private stressCalibrationClosePreProcess(Lorg/json/JSONObject;)V
    .locals 5

    .line 313
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 315
    const-string v0, "duration"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mSignalTime:I

    .line 316
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(), mSignalTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mSignalTime:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 319
    goto :goto_0

    .line 317
    :catch_0
    move-exception v4

    .line 318
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(), "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    :cond_0
    :goto_0
    const/4 v4, 0x0

    :goto_1
    const/16 v0, 0x10

    if-ge v4, v0, :cond_1

    .line 322
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibData:[F

    const/4 v1, 0x0

    aput v1, v0, v4

    .line 321
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 324
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibData:[F

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibrationScore:I

    int-to-float v1, v1

    const/16 v2, 0x10

    aput v1, v0, v2

    .line 325
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibData:[F

    const/high16 v1, 0x40000000    # 2.0f

    const/16 v2, 0x11

    aput v1, v0, v2

    .line 327
    return-void
.end method

.method private stressCalibrationCloseProcess(I[I[I)V
    .locals 10

    .line 529
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibData:[F

    iget v2, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mSignalTime:I

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->isValidStressParam([FII[I[I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 532
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibData:[F

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mSignalTime:I

    invoke-static {v0, v1, p1, p2, p3}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getStressResultFromAlgorithm([FII[I[I)[F

    move-result-object v6

    .line 534
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 536
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    array-length v0, v6

    const/16 v1, 0x13

    if-ne v0, v1, :cond_4

    .line 537
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), resultFromAlgorithm.length : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v6

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 539
    const/4 v8, 0x0

    :goto_0
    const/16 v0, 0xa

    if-ge v8, v0, :cond_0

    .line 540
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->calibrationResultArr:[F

    aget v1, v6, v8

    aput v1, v0, v8

    .line 539
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 543
    :cond_0
    const/16 v0, 0x12

    aget v0, v6, v0

    float-to-int v8, v0

    .line 544
    const/4 v0, 0x1

    if-ne v0, v8, :cond_1

    .line 546
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 547
    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "calibration_flag"

    .line 548
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 546
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 552
    :cond_1
    const/16 v0, 0xe

    aget v0, v6, v0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mRealCalibScore:F

    .line 553
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 554
    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "calibration_result"

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->calibrationResultArr:[F

    .line 555
    invoke-static {v3}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 553
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 556
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 557
    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "real_calib_score"

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mRealCalibScore:F

    .line 558
    invoke-static {v3}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 556
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 563
    const-string v0, "type"

    const/4 v1, 0x5

    :try_start_0
    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 564
    const-string v0, "flag"

    const/16 v1, 0x12

    aget v1, v6, v1

    float-to-double v1, v1

    invoke-virtual {v7, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 565
    const-string v0, "score"

    const/16 v1, 0xf

    aget v1, v6, v1

    float-to-double v1, v1

    invoke-virtual {v7, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 566
    const-string v0, "grade"

    const/16 v1, 0x10

    aget v1, v6, v1

    float-to-double v1, v1

    invoke-virtual {v7, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 567
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), type, flag, score, grade :5 ,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0x12

    aget v3, v6, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0xf

    aget v3, v6, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0x10

    aget v3, v6, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 569
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCallBack:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 570
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCallBack:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 574
    :cond_2
    goto :goto_1

    .line 572
    :catch_0
    move-exception v9

    .line 573
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 575
    :goto_1
    const/4 v9, 0x0

    :goto_2
    array-length v0, v6

    if-ge v9, v0, :cond_3

    .line 576
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), stressCalibrationResultFromAlgorithm["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "]: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget v3, v6, v9

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 575
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 578
    :cond_3
    goto :goto_3

    .line 579
    :cond_4
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processRRData(), resultFromAlgorithm is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 580
    const/16 v0, 0x65

    invoke-direct {p0, v0}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->inValidCallBackProcess(I)V

    .line 582
    :goto_3
    goto :goto_4

    .line 584
    :cond_5
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalid stressCalibParam!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    const/16 v0, 0x64

    invoke-direct {p0, v0}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->inValidCallBackProcess(I)V

    .line 587
    :goto_4
    return-void
.end method

.method private stressCalibrationOpenPreProcess(Lorg/json/JSONObject;)V
    .locals 5

    .line 330
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 332
    const-string v0, "score"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibrationScore:I

    .line 333
    const-string v0, "max_duration"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mMaxDuration:I

    .line 334
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(), mCalibrationScore: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibrationScore:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(), mMaxDuration: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mMaxDuration:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 338
    goto :goto_0

    .line 336
    :catch_0
    move-exception v4

    .line 337
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(), "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    :cond_0
    :goto_0
    return-void
.end method

.method private stressCalibrationResetPreProcess()V
    .locals 8

    .line 282
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 283
    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "calibration_flag"

    .line 282
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 284
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 285
    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "calibration_result"

    .line 284
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 287
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 289
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 290
    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "calibration_flag"

    .line 289
    invoke-static {v0, v1, v2}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 292
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 294
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 295
    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "calibration_result"

    .line 294
    invoke-static {v0, v1, v2}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 298
    :cond_1
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 300
    const-string v0, "type"

    const/16 v1, 0x8

    :try_start_0
    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 301
    const-string v0, "result_code"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 304
    goto :goto_0

    .line 302
    :catch_0
    move-exception v7

    .line 303
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(), "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCallBack:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 308
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stressCalibrationResetPreProcess(), success! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    return-void
.end method

.method private stressClosePreProcess(Lorg/json/JSONObject;)V
    .locals 8

    .line 343
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 345
    const-string v0, "duration"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mSignalTime:I

    .line 346
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(), duration: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mSignalTime:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 349
    goto :goto_0

    .line 347
    :catch_0
    move-exception v4

    .line 348
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(),"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    :cond_0
    :goto_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "calibration_result"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 354
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 355
    const-string v0, "["

    const-string v1, ""

    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    .line 356
    const-string v0, "]"

    const-string v1, ""

    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    .line 357
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(), calibrationResultString: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    const-string v0, ","

    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 360
    const/4 v6, 0x0

    :goto_1
    const/16 v0, 0xa

    if-ge v6, v0, :cond_1

    .line 361
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibData:[F

    aget-object v1, v5, v6

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    aput v1, v0, v6

    .line 362
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(), mCalibData: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibData:[F

    aget v3, v3, v6

    invoke-static {v3}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 365
    :cond_1
    const/16 v6, 0xa

    :goto_2
    const/16 v0, 0xe

    if-ge v6, v0, :cond_2

    .line 366
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibData:[F

    const/4 v1, 0x0

    aput v1, v0, v6

    .line 365
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 368
    :cond_2
    goto :goto_4

    .line 369
    :cond_3
    const/4 v5, 0x0

    :goto_3
    const/16 v0, 0xe

    if-ge v5, v0, :cond_4

    .line 370
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibData:[F

    const/4 v1, 0x0

    aput v1, v0, v5

    .line 371
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(), mCalibData: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibData:[F

    aget v3, v3, v5

    invoke-static {v3}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 375
    :cond_4
    :goto_4
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 376
    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "real_calib_score"

    .line 375
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 377
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 378
    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "max_score"

    .line 377
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 379
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 380
    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "min_score"

    .line 379
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 382
    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 384
    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mRealCalibScore:F

    goto :goto_5

    .line 386
    :cond_5
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mRealCalibScore:F

    .line 389
    :goto_5
    const/4 v0, 0x0

    if-eq v0, v6, :cond_6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 391
    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->maxScore:F

    goto :goto_6

    .line 393
    :cond_6
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->maxScore:F

    .line 396
    :goto_6
    const/4 v0, 0x0

    if-eq v0, v7, :cond_7

    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 398
    invoke-static {v7}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->minScore:F

    goto :goto_7

    .line 400
    :cond_7
    const/high16 v0, 0x42c80000    # 100.0f

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->minScore:F

    .line 403
    :goto_7
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibData:[F

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->maxScore:F

    const/16 v2, 0xe

    aput v1, v0, v2

    .line 404
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibData:[F

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->minScore:F

    const/16 v2, 0xf

    aput v1, v0, v2

    .line 405
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibData:[F

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mRealCalibScore:F

    const/16 v2, 0x10

    aput v1, v0, v2

    .line 406
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibData:[F

    const/4 v1, 0x0

    const/16 v2, 0x11

    aput v1, v0, v2

    .line 407
    return-void
.end method

.method private stressCloseProcess(I[I[I)V
    .locals 10

    .line 591
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibData:[F

    iget v2, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mSignalTime:I

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->isValidStressParam([FII[I[I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 594
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCalibData:[F

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mSignalTime:I

    invoke-static {v0, v1, p1, p2, p3}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getStressResultFromAlgorithm([FII[I[I)[F

    move-result-object v6

    .line 596
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 599
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    array-length v0, v6

    const/16 v1, 0x13

    if-ne v0, v1, :cond_4

    .line 600
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), resultFromAlgorithm.length : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v6

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    const/16 v0, 0x12

    aget v0, v6, v0

    float-to-int v8, v0

    .line 604
    const/4 v0, 0x1

    if-ne v0, v8, :cond_1

    .line 605
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processRRData(), Stress Algorithm Success!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 606
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->maxScore:F

    const/16 v1, 0xe

    aget v1, v6, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 607
    const/16 v0, 0xe

    aget v0, v6, v0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->maxScore:F

    .line 608
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 609
    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "max_score"

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->maxScore:F

    .line 610
    invoke-static {v3}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 608
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 612
    :cond_0
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->minScore:F

    const/16 v1, 0xe

    aget v1, v6, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 613
    const/16 v0, 0xe

    aget v0, v6, v0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->minScore:F

    .line 614
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 615
    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "min_score"

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->minScore:F

    .line 616
    invoke-static {v3}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 614
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 622
    :cond_1
    const-string v0, "type"

    const/4 v1, 0x2

    :try_start_0
    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 623
    const-string v0, "flag"

    const/16 v1, 0x12

    aget v1, v6, v1

    float-to-double v1, v1

    invoke-virtual {v7, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 624
    const-string v0, "score"

    const/16 v1, 0xf

    aget v1, v6, v1

    float-to-double v1, v1

    invoke-virtual {v7, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 625
    const-string v0, "grade"

    const/16 v1, 0x10

    aget v1, v6, v1

    float-to-double v1, v1

    invoke-virtual {v7, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 626
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), type, flag, score, grade :2 ,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0x12

    aget v3, v6, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0xf

    aget v3, v6, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0x10

    aget v3, v6, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 628
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCallBack:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 629
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCallBack:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 633
    :cond_2
    goto :goto_0

    .line 631
    :catch_0
    move-exception v9

    .line 632
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 634
    :goto_0
    const/4 v9, 0x0

    :goto_1
    array-length v0, v6

    if-ge v9, v0, :cond_3

    .line 635
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), StressResultFromAlgorithm["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "]: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget v3, v6, v9

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 634
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 637
    :cond_3
    goto :goto_2

    .line 638
    :cond_4
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processRRData(), resultFromAlgorithm is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 639
    const/16 v0, 0x65

    invoke-direct {p0, v0}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->inValidCallBackProcess(I)V

    .line 641
    :goto_2
    goto :goto_3

    .line 643
    :cond_5
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalid stressParam!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 644
    const/16 v0, 0x64

    invoke-direct {p0, v0}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->inValidCallBackProcess(I)V

    .line 647
    :goto_3
    return-void
.end method

.method private stressOpenPreProcess(Lorg/json/JSONObject;)V
    .locals 5

    .line 410
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 412
    const-string v0, "max_duration"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mMaxDuration:I

    .line 413
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(), mMaxDuration: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mMaxDuration:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 416
    goto :goto_0

    .line 414
    :catch_0
    move-exception v4

    .line 415
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(),"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public getStressResult(ILorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 126
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStressResult(), enter getStressResult()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    iput p1, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->type:I

    .line 128
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressResult(), type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    iput-object p3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->mCallBack:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 130
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 132
    :pswitch_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStressResult(), enter STRESS_OPEN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    invoke-direct {p0, p2}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->stressOpenPreProcess(Lorg/json/JSONObject;)V

    .line 134
    goto/16 :goto_0

    .line 137
    :pswitch_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStressResult(), enter STRESS_CLOSE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    invoke-direct {p0, p2}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->stressClosePreProcess(Lorg/json/JSONObject;)V

    .line 139
    goto/16 :goto_0

    .line 142
    :pswitch_2
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStressResult(), enter STRESS_CALIBRATION_OPEN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    invoke-direct {p0, p2}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->stressCalibrationOpenPreProcess(Lorg/json/JSONObject;)V

    .line 144
    goto/16 :goto_0

    .line 147
    :pswitch_3
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStressResult(), enter STRESS_CALIBRATION_CLOSE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    invoke-direct {p0, p2}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->stressCalibrationClosePreProcess(Lorg/json/JSONObject;)V

    .line 149
    goto :goto_0

    .line 152
    :pswitch_4
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStressResult(), enter STRESS_CALIBRATION_RESET"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->stressCalibrationResetPreProcess()V

    .line 154
    goto :goto_0

    .line 157
    :pswitch_5
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStressResult(), enter RELAX_OPEN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    invoke-direct {p0, p2}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->relaxOpenPreProcess(Lorg/json/JSONObject;)V

    .line 159
    goto :goto_0

    .line 162
    :pswitch_6
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStressResult(), enter RELAX_CLOSE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    invoke-direct {p0, p2}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->relaxClosePreProcess(Lorg/json/JSONObject;)V

    .line 164
    goto :goto_0

    .line 167
    :pswitch_7
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStressResult(), enter GAME_OPEN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    invoke-direct {p0, p2}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->gameOpenPreProcess(Lorg/json/JSONObject;)V

    .line 169
    goto :goto_0

    .line 171
    :pswitch_8
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStressResult(), enter GAME_CLOSE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    invoke-direct {p0, p2}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->gameClosePreProcess(Lorg/json/JSONObject;)V

    .line 173
    .line 178
    :goto_0
    :pswitch_9
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_9
        :pswitch_2
        :pswitch_3
        :pswitch_9
        :pswitch_9
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_9
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method public processRRData([I[I)V
    .locals 5

    .line 186
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processRRData(), enter processRRData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    array-length v0, p1

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    array-length v0, p2

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 188
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processRRData(), rrData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    const/16 v0, 0x64

    invoke-direct {p0, v0}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->inValidCallBackProcess(I)V

    goto/16 :goto_0

    .line 191
    :cond_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processRRData(), enter else"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    array-length v4, p1

    .line 193
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), rrLength: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), rrData[0]:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    aget v3, p1, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), rrData[rrLength-1]:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    add-int/lit8 v3, v4, -0x1

    aget v3, p1, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->singleThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;

    invoke-direct {v1, p0, v4, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;-><init>(Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;I[I[I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 230
    :goto_0
    return-void
.end method

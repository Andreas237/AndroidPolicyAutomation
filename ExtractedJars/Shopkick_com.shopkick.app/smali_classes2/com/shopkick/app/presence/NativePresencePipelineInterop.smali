.class public Lcom/shopkick/app/presence/NativePresencePipelineInterop;
.super Ljava/lang/Object;
.source "NativePresencePipelineInterop.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/presence/NativePresencePipelineInterop$CRCMatchedCodeCallback;,
        Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;
    }
.end annotation


# static fields
.field public static final LOCATION_LIST_BUNDLE_FILE:Ljava/lang/String; = "pd_location.png"

.field private static jni:Lcom/shopkick/app/presence/NativePresencePipeline; = null

.field public static final kDefaultPdEventLogLevel:I = 0x0

.field public static final kDefaultPdEventTimeLimit:D = 10.0


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private bundleFiles:Lcom/shopkick/app/application/BundleFiles;

.field private debugMode:Z

.field private firstSigDetectionTime:J

.field protected handler:Lcom/shopkick/app/util/SKHandler;

.field private lastPipelineParams:Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;

.field private lastPipelineResult:Lcom/shopkick/app/presence/MainPipelineResult;

.field private lastRandomNumGenerator:Ljava/util/Random;

.field protected listeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/presence/IPresenceListener;",
            ">;"
        }
    .end annotation
.end field

.field pdEventLogLevel:I

.field pdEventTimeLimit:D

.field private pdEventsLogger:Lcom/shopkick/app/presenceLogger/PDEventsLogger;

.field private pipelineStatePtr:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 52
    new-instance v0, Lcom/shopkick/app/presence/NativePresencePipeline;

    invoke-direct {v0}, Lcom/shopkick/app/presence/NativePresencePipeline;-><init>()V

    sput-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/application/BundleFiles;ZLcom/shopkick/app/application/AppActivityManager;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->bundleFiles:Lcom/shopkick/app/application/BundleFiles;

    .line 59
    iput-boolean p2, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->debugMode:Z

    .line 60
    iput-object p3, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 61
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->listeners:Ljava/util/List;

    return-void
.end method

.method private destroy()V
    .locals 4

    .line 464
    iget-wide v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    .line 465
    sget-object v2, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    invoke-virtual {v2, v0, v1}, Lcom/shopkick/app/presence/NativePresencePipeline;->destroyPipeline(J)V

    :cond_0
    return-void
.end method

.method private getLocation(JLcom/shopkick/app/presence/MainPipelineResult;)Lcom/shopkick/app/presence/PresenceResult;
    .locals 7

    .line 456
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-object v3, p3, Lcom/shopkick/app/presence/MainPipelineResult;->code:Ljava/lang/String;

    iget v4, p3, Lcom/shopkick/app/presence/MainPipelineResult;->crc:I

    iget-object v5, p3, Lcom/shopkick/app/presence/MainPipelineResult;->presenceFactors:[D

    iget-boolean v6, p3, Lcom/shopkick/app/presence/MainPipelineResult;->prefixMatch:Z

    move-wide v1, p1

    invoke-virtual/range {v0 .. v6}, Lcom/shopkick/app/presence/NativePresencePipeline;->getLocation(JLjava/lang/String;I[DZ)Lcom/shopkick/app/presence/PresenceResult;

    move-result-object p1

    return-object p1
.end method

.method private initializeLocationLists()V
    .locals 7

    .line 119
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->bundleFiles:Lcom/shopkick/app/application/BundleFiles;

    if-eqz v0, :cond_1

    .line 120
    iget-object v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->bundleFiles:Lcom/shopkick/app/application/BundleFiles;

    const-string v1, "pd_location.png"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/BundleFiles;->getFileDescriptor(Ljava/lang/String;)Lcom/shopkick/app/application/BundleFiles$BundleFileDescriptor;

    move-result-object v0

    if-nez v0, :cond_0

    .line 122
    sget-object v1, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/app/presence/NativePresencePipeline;->initializeLocationLists(Ljava/lang/String;JJ)V

    .line 123
    const-class v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "The location list file is missing."

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 125
    :cond_0
    sget-object v1, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    invoke-virtual {v0}, Lcom/shopkick/app/application/BundleFiles$BundleFileDescriptor;->getFilePath()Ljava/lang/String;

    move-result-object v2

    .line 126
    invoke-virtual {v0}, Lcom/shopkick/app/application/BundleFiles$BundleFileDescriptor;->getOffset()J

    move-result-wide v3

    .line 127
    invoke-virtual {v0}, Lcom/shopkick/app/application/BundleFiles$BundleFileDescriptor;->getLength()J

    move-result-wide v5

    .line 125
    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/app/presence/NativePresencePipeline;->initializeLocationLists(Ljava/lang/String;JJ)V

    .line 128
    const-class v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Initialized location list bundle files."

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 132
    const-class v1, Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to initialize location lists:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 132
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 134
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method private maybeGetPresenceFFTData(Z)[B
    .locals 6

    if-eqz p1, :cond_0

    .line 283
    iget-object p1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->lastPipelineParams:Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;

    iget-object p1, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->presenceDetectorRandomDataReturnRate:Ljava/lang/Double;

    goto :goto_0

    .line 285
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->lastPipelineParams:Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;

    iget-object p1, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->presenceDetectorFftDataReturnRateForFailures:Ljava/lang/Double;

    .line 288
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->lastRandomNumGenerator:Ljava/util/Random;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    int-to-double v0, v0

    .line 289
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    mul-double/2addr v2, v4

    cmpg-double p1, v0, v2

    if-gez p1, :cond_1

    .line 290
    sget-object p1, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/presence/NativePresencePipeline;->getFFTDataForServer(J)[B

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private setParameters(Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;)V
    .locals 3

    .line 97
    iput-object p1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->lastPipelineParams:Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;

    .line 99
    invoke-direct {p0, p1}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->setParams(Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;)V

    if-eqz p1, :cond_1

    .line 103
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->waitTimeUntilServerRequest:Ljava/lang/Double;

    if-eqz v0, :cond_0

    .line 105
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->waitTimeUntilServerRequest:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pdEventTimeLimit:D

    .line 107
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    if-eqz v0, :cond_1

    .line 108
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->pdEventLogLevel:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 109
    iget-object p1, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    iget-object p1, p1, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->pdEventLogLevel:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pdEventLogLevel:I

    .line 114
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pdEventsLogger:Lcom/shopkick/app/presenceLogger/PDEventsLogger;

    iget-wide v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pdEventTimeLimit:D

    iget v2, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pdEventLogLevel:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->resetTimeLimitAndLogLevel(DI)V

    return-void
.end method

.method private setParams(Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;)V
    .locals 5

    .line 470
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->dopplerCorrectionEnabled:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 471
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->dopplerCorrectionEnabled:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setDopplerCorrectionEnabledParam(JZ)V

    .line 473
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->highPassFilterEnabled:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    .line 474
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->highPassFilterEnabled:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setHighPassFilterEnabledParam(JZ)V

    .line 476
    :cond_1
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->deptCodesEnabled:Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    .line 477
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->deptCodesEnabled:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setDeptCodesEnabledParam(JZ)V

    .line 479
    :cond_2
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->wideBandPresenceDetectEnabled:Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    .line 480
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->wideBandPresenceDetectEnabled:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setWideBandDetectEnabledParam(JZ)V

    .line 482
    :cond_3
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->crcDisabled:Ljava/lang/Boolean;

    if-eqz v0, :cond_4

    .line 483
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->crcDisabled:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setCrcDisabledParam(JZ)V

    .line 485
    :cond_4
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->useAutoEqualizerIfNoFR:Ljava/lang/Boolean;

    if-eqz v0, :cond_5

    .line 486
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->useAutoEqualizerIfNoFR:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setUseAutoEqualizerIfNoFRParam(JZ)V

    .line 488
    :cond_5
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->useLocationsInClient:Ljava/lang/Boolean;

    if-eqz v0, :cond_6

    .line 489
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->useLocationsInClient:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setUseLocationsInClientParam(JZ)V

    .line 491
    :cond_6
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->usePrefixCandidatesInClient:Ljava/lang/Boolean;

    if-eqz v0, :cond_7

    .line 492
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->usePrefixCandidatesInClient:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setUsePrefixCandidatesInClientParam(JZ)V

    .line 494
    :cond_7
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->useScoringForLocationFinder:Ljava/lang/Boolean;

    if-eqz v0, :cond_8

    .line 495
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->useScoringForLocationFinder:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setUseScoringForLocationFinderParam(JZ)V

    .line 497
    :cond_8
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->serverHighestReturnFrequency:Ljava/lang/Double;

    if-eqz v0, :cond_9

    .line 498
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->serverHighestReturnFrequency:Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/app/presence/NativePresencePipeline;->setServerHighestReturnFreqParam(JD)V

    .line 500
    :cond_9
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->serverLowestReturnFrequency:Ljava/lang/Double;

    if-eqz v0, :cond_a

    .line 501
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->serverLowestReturnFrequency:Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/app/presence/NativePresencePipeline;->setServerLowestReturnFreqParam(JD)V

    .line 503
    :cond_a
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->maxOldFFTs:Ljava/lang/Integer;

    if-eqz v0, :cond_b

    .line 505
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->maxOldFFTs:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setMaxOldFFtsParam(JI)V

    .line 507
    :cond_b
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->numPrefixBitsRequired:Ljava/lang/Integer;

    if-eqz v0, :cond_c

    .line 509
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->numPrefixBitsRequired:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setNumPrefixBitsRequiredParam(JI)V

    .line 511
    :cond_c
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->waitTimeUntilServerRequest:Ljava/lang/Double;

    if-eqz v0, :cond_d

    .line 512
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->waitTimeUntilServerRequest:Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/app/presence/NativePresencePipeline;->setWaitTimeUntilServerRequestParam(JD)V

    .line 514
    :cond_d
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    if-eqz v0, :cond_1e

    .line 515
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->wideBandPresenceDetectEnabled:Ljava/lang/Boolean;

    if-eqz v0, :cond_e

    .line 516
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->wideBandPresenceDetectEnabled:Ljava/lang/Boolean;

    .line 517
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    .line 516
    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setWideBandDetectEnabledFCParam(JZ)V

    .line 519
    :cond_e
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->bitDetectThreshold:Ljava/lang/Double;

    if-eqz v0, :cond_f

    .line 520
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->bitDetectThreshold:Ljava/lang/Double;

    .line 521
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    .line 520
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/app/presence/NativePresencePipeline;->setBitDetectThresholdFCParam(JD)V

    .line 523
    :cond_f
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->gapInSamplesBetweenLowFreqAndCalibration:Ljava/lang/Integer;

    if-eqz v0, :cond_10

    .line 524
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->gapInSamplesBetweenLowFreqAndCalibration:Ljava/lang/Integer;

    .line 525
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 524
    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setGapInSamplesBtwLowFreqAndCalibFCParam(JI)V

    .line 527
    :cond_10
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->maxFracOfAvgForOne:Ljava/lang/Double;

    if-eqz v0, :cond_11

    .line 528
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->maxFracOfAvgForOne:Ljava/lang/Double;

    .line 529
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    .line 528
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/app/presence/NativePresencePipeline;->setMaxFracOfAvgForOneFCParam(JD)V

    .line 531
    :cond_11
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->numSamplesToCalibrateWith:Ljava/lang/Integer;

    if-eqz v0, :cond_12

    .line 532
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->numSamplesToCalibrateWith:Ljava/lang/Integer;

    .line 533
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 532
    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setNumSamplesCalibrateWithFCParam(JI)V

    .line 535
    :cond_12
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->presenceDetectMinBits:Ljava/lang/Integer;

    if-eqz v0, :cond_13

    .line 536
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->presenceDetectMinBits:Ljava/lang/Integer;

    .line 537
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 536
    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setPresenceDetectMinBitsFCParam(JI)V

    .line 539
    :cond_13
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->presenceNarrowBandDetectThreshold:Ljava/lang/Double;

    if-eqz v0, :cond_14

    .line 540
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->presenceNarrowBandDetectThreshold:Ljava/lang/Double;

    .line 541
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    .line 540
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/app/presence/NativePresencePipeline;->setPresenceDetectNarrowBandDetectThresholdFCParam(JD)V

    .line 543
    :cond_14
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->presenceStrengthRatioThreshold:Ljava/lang/Double;

    if-eqz v0, :cond_15

    .line 544
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->presenceStrengthRatioThreshold:Ljava/lang/Double;

    .line 545
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    .line 544
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/app/presence/NativePresencePipeline;->setPresenceStrengthRatioThresholdFCParam(JD)V

    .line 547
    :cond_15
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->presenceWideBandDetectThreshold:Ljava/lang/Double;

    if-eqz v0, :cond_16

    .line 548
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->presenceWideBandDetectThreshold:Ljava/lang/Double;

    .line 549
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    .line 548
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/app/presence/NativePresencePipeline;->setWideBandThresholdFCParam(JD)V

    .line 551
    :cond_16
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->useErrorCorrection:Ljava/lang/Boolean;

    if-eqz v0, :cond_17

    .line 552
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->useErrorCorrection:Ljava/lang/Boolean;

    .line 553
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    .line 552
    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setUseErrorCorrectionFCParam(JZ)V

    .line 555
    :cond_17
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->frFactors:Ljava/lang/String;

    if-eqz v0, :cond_18

    .line 556
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->frFactors:Ljava/lang/String;

    invoke-static {v3}, Lorg/bouncycastle/util/encoders/Base64;->decode(Ljava/lang/String;)[B

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setFrFactorsParam(J[B)V

    .line 558
    :cond_18
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->numPrefixBitsRequired:Ljava/lang/Integer;

    if-eqz v0, :cond_19

    .line 559
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->numPrefixBitsRequired:Ljava/lang/Integer;

    .line 560
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 559
    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setNumPrefixBitsRequiredFCParam(JI)V

    .line 562
    :cond_19
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->minCarriers:Ljava/lang/Integer;

    if-eqz v0, :cond_1a

    .line 563
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->minCarriers:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setMinCarriersFCParam(JI)V

    .line 565
    :cond_1a
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->maxIntermediates:Ljava/lang/Integer;

    if-eqz v0, :cond_1b

    .line 566
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->maxIntermediates:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setMaxIntermediatesFCParam(JI)V

    .line 568
    :cond_1b
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->carrierThreshold:Ljava/lang/Double;

    if-eqz v0, :cond_1c

    .line 569
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->carrierThreshold:Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/app/presence/NativePresencePipeline;->setCarrierThresholdFCParam(JD)V

    .line 571
    :cond_1c
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->detectThreshold:Ljava/lang/Double;

    if-eqz v0, :cond_1d

    .line 572
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->detectThreshold:Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/app/presence/NativePresencePipeline;->setDetectThresholdFCParam(JD)V

    .line 574
    :cond_1d
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->noiseThreshold:Ljava/lang/Double;

    if-eqz v0, :cond_1e

    .line 575
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->noiseThreshold:Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/app/presence/NativePresencePipeline;->setNoiseThresholdFCParam(JD)V

    .line 578
    :cond_1e
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->useFFTWindowing:Ljava/lang/Boolean;

    if-eqz v0, :cond_1f

    .line 579
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->useFFTWindowing:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setUseWindowing(JZ)V

    .line 582
    :cond_1f
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->deptCodesParams:Lcom/shopkick/app/presence/NativePresencePipeline$DeptCodesParams;

    if-eqz v0, :cond_20

    .line 583
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->deptCodesParams:Lcom/shopkick/app/presence/NativePresencePipeline$DeptCodesParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$DeptCodesParams;->samplesUntilExpiration:Ljava/lang/Integer;

    if-eqz v0, :cond_20

    .line 584
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->deptCodesParams:Lcom/shopkick/app/presence/NativePresencePipeline$DeptCodesParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$DeptCodesParams;->samplesUntilExpiration:Ljava/lang/Integer;

    .line 585
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 584
    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setSamplesUntilExpirationDCParam(JI)V

    .line 589
    :cond_20
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->highPassFilterParams:Lcom/shopkick/app/presence/NativePresencePipeline$HighPassFilterParams;

    if-eqz v0, :cond_21

    .line 590
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->highPassFilterParams:Lcom/shopkick/app/presence/NativePresencePipeline$HighPassFilterParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$HighPassFilterParams;->highPassFilterType:Ljava/lang/Integer;

    if-eqz v0, :cond_21

    .line 591
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->highPassFilterParams:Lcom/shopkick/app/presence/NativePresencePipeline$HighPassFilterParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$HighPassFilterParams;->highPassFilterType:Ljava/lang/Integer;

    .line 592
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 591
    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setHighPassFilterTypeHPFParam(JI)V

    .line 596
    :cond_21
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    if-eqz v0, :cond_29

    .line 597
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->useLocationsInClient:Ljava/lang/Boolean;

    if-eqz v0, :cond_22

    .line 598
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->useLocationsInClient:Ljava/lang/Boolean;

    .line 599
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    .line 598
    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setUseLocationsInClientLocationParam(JZ)V

    .line 601
    :cond_22
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->useScoringForLocationFinder:Ljava/lang/Boolean;

    if-eqz v0, :cond_23

    .line 602
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->useScoringForLocationFinder:Ljava/lang/Boolean;

    .line 603
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    .line 602
    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setUseScoringForLocationFinderLocationParam(JZ)V

    .line 605
    :cond_23
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->distanceRecalcThresholdMeters:Ljava/lang/Integer;

    if-eqz v0, :cond_24

    .line 606
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->distanceRecalcThresholdMeters:Ljava/lang/Integer;

    .line 607
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 606
    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setDistanceRecalcThresholdMetersLocationParam(JI)V

    .line 609
    :cond_24
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->presenceDetectCheckinRadiusMeters:Ljava/lang/Integer;

    if-eqz v0, :cond_25

    .line 610
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->presenceDetectCheckinRadiusMeters:Ljava/lang/Integer;

    .line 611
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 610
    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setPresenceDetectCheckinRadiusMetersLocationParam(JI)V

    .line 613
    :cond_25
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->bingErrorRadiusMeters:Ljava/lang/Integer;

    if-eqz v0, :cond_26

    .line 614
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->bingErrorRadiusMeters:Ljava/lang/Integer;

    .line 615
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 614
    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setBingErrorRadiusMetersLocationParam(JI)V

    .line 617
    :cond_26
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->bitsToIgnore:Ljava/lang/Integer;

    if-eqz v0, :cond_27

    .line 618
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->bitsToIgnore:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setBitsToIgnoreLocationParam(JI)V

    .line 620
    :cond_27
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->accuracyThresholdForErrorCorrectionMeters:Ljava/lang/Integer;

    if-eqz v0, :cond_28

    .line 621
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object v3, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    iget-object v3, v3, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->accuracyThresholdForErrorCorrectionMeters:Ljava/lang/Integer;

    .line 622
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 621
    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->setAccuracyThresholdForErrorCorrectionMetersLocationParam(JI)V

    .line 624
    :cond_28
    iget-object v0, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    iget-object v0, v0, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->shouldTryErrorCorrection:Ljava/lang/Boolean;

    if-eqz v0, :cond_29

    .line 625
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    iget-object p1, p1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    iget-object p1, p1, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->shouldTryErrorCorrection:Ljava/lang/Boolean;

    .line 626
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 625
    invoke-virtual {v0, v1, v2, p1}, Lcom/shopkick/app/presence/NativePresencePipeline;->setShouldTryErrorCorrectionLocationParam(JZ)V

    :cond_29
    return-void
.end method


# virtual methods
.method public addPresenceListener(Lcom/shopkick/app/presence/IPresenceListener;)V
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public audioReceived([SIZ)V
    .locals 24

    move-object/from16 v15, p0

    const/4 v14, 0x0

    .line 161
    :try_start_0
    sget-object v1, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v2, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    move-object/from16 v4, p1

    move/from16 v5, p2

    move/from16 v6, p3

    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/app/presence/NativePresencePipeline;->consumeAudio(J[SIZ)V

    .line 164
    :goto_0
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/presence/NativePresencePipeline;->stepPipeline(J)Lcom/shopkick/app/presence/MainPipelineResult;

    move-result-object v0

    .line 166
    iget-boolean v1, v0, Lcom/shopkick/app/presence/MainPipelineResult;->stepSuccessful:Z

    if-nez v1, :cond_0

    return-void

    .line 170
    :cond_0
    iget-boolean v1, v0, Lcom/shopkick/app/presence/MainPipelineResult;->newSignalDetected:Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_5

    if-eqz v1, :cond_2

    .line 173
    :try_start_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "Native to Java interop [newSignalDetected]"

    new-array v5, v14, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->i(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 181
    iget-wide v1, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->firstSigDetectionTime:J
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_1

    .line 182
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->firstSigDetectionTime:J
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_5

    .line 184
    :cond_1
    :try_start_3
    iget-object v13, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->handler:Lcom/shopkick/app/util/SKHandler;

    new-instance v12, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;

    iget-object v3, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->listeners:Ljava/util/List;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1

    iget v2, v0, Lcom/shopkick/app/presence/MainPipelineResult;->stepsSincePresenceFound:I
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    move-object v1, v12

    move/from16 v19, v2

    move-object/from16 v2, p0

    move-object/from16 v20, v12

    move-object/from16 v12, v16

    move-object/from16 v21, v13

    move/from16 v13, v17

    move/from16 v14, v18

    move/from16 v15, v19

    :try_start_4
    invoke-direct/range {v1 .. v15}, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;-><init>(Lcom/shopkick/app/presence/NativePresencePipelineInterop;Ljava/util/List;Ljava/lang/String;I[B[BJZLjava/util/ArrayList;[IIII)V

    move-object/from16 v2, v20

    move-object/from16 v1, v21

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/SKHandler;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    :catch_0
    move-exception v0

    move v5, v14

    :goto_1
    move-object/from16 v1, p0

    goto/16 :goto_7

    .line 197
    :cond_2
    :goto_2
    iget-boolean v1, v0, Lcom/shopkick/app/presence/MainPipelineResult;->signalLost:Z

    if-eqz v1, :cond_3

    .line 200
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "Native to Java interop [signalLost]"
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_4

    const/4 v15, 0x0

    :try_start_5
    new-array v5, v15, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->i(JLjava/lang/String;[Ljava/lang/Object;)V

    move-object/from16 v14, p0

    .line 205
    iget-object v13, v14, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->handler:Lcom/shopkick/app/util/SKHandler;

    new-instance v12, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;

    iget-object v3, v14, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->listeners:Ljava/util/List;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x2

    iget v2, v0, Lcom/shopkick/app/presence/MainPipelineResult;->stepsSincePresenceFound:I
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_1

    move-object v1, v12

    move/from16 v19, v2

    move-object/from16 v2, p0

    move-object/from16 v22, v12

    move-object/from16 v12, v16

    move-object/from16 v23, v13

    move/from16 v13, v17

    move/from16 v14, v18

    move/from16 v15, v19

    :try_start_6
    invoke-direct/range {v1 .. v15}, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;-><init>(Lcom/shopkick/app/presence/NativePresencePipelineInterop;Ljava/util/List;Ljava/lang/String;I[B[BJZLjava/util/ArrayList;[IIII)V

    move-object/from16 v2, v22

    move-object/from16 v1, v23

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/SKHandler;->post(Ljava/lang/Runnable;)Z

    goto :goto_3

    :catch_1
    move-exception v0

    move v5, v15

    goto :goto_1

    .line 218
    :cond_3
    :goto_3
    iget-boolean v1, v0, Lcom/shopkick/app/presence/MainPipelineResult;->crcMatched:Z
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_4

    if-eqz v1, :cond_4

    move-object/from16 v1, p0

    .line 220
    :try_start_7
    iget-object v2, v1, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->handler:Lcom/shopkick/app/util/SKHandler;

    new-instance v3, Lcom/shopkick/app/presence/NativePresencePipelineInterop$CRCMatchedCodeCallback;

    iget-object v4, v1, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->listeners:Ljava/util/List;

    invoke-direct {v3, v1, v4}, Lcom/shopkick/app/presence/NativePresencePipelineInterop$CRCMatchedCodeCallback;-><init>(Lcom/shopkick/app/presence/NativePresencePipelineInterop;Ljava/util/List;)V

    invoke-virtual {v2, v3}, Lcom/shopkick/app/util/SKHandler;->post(Ljava/lang/Runnable;)Z

    goto :goto_4

    :cond_4
    move-object/from16 v1, p0

    .line 226
    :goto_4
    iget-boolean v2, v0, Lcom/shopkick/app/presence/MainPipelineResult;->newCodeFound:Z

    if-nez v2, :cond_5

    iget-boolean v2, v0, Lcom/shopkick/app/presence/MainPipelineResult;->sendServerData:Z

    if-eqz v2, :cond_6

    .line 227
    :cond_5
    iput-object v0, v1, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->lastPipelineResult:Lcom/shopkick/app/presence/MainPipelineResult;

    .line 230
    :cond_6
    iget-boolean v2, v0, Lcom/shopkick/app/presence/MainPipelineResult;->newCodeFound:Z

    if-eqz v2, :cond_7

    .line 233
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "Native to Java interop [newCodeFound]"
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_3

    const/4 v5, 0x0

    :try_start_8
    new-array v6, v5, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v4, v6}, Lcom/shopkick/logging/DiagnosticLogger;->i(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 237
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->triggerLocationFinder()V

    goto :goto_5

    :cond_7
    const/4 v5, 0x0

    .line 238
    iget-boolean v0, v0, Lcom/shopkick/app/presence/MainPipelineResult;->sendServerData:Z

    if-eqz v0, :cond_8

    .line 242
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->sendServerData()V
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_2

    :cond_8
    :goto_5
    move-object v15, v1

    move v14, v5

    goto/16 :goto_0

    :catch_2
    move-exception v0

    goto :goto_7

    :catch_3
    move-exception v0

    goto :goto_6

    :catch_4
    move-exception v0

    move-object/from16 v1, p0

    :goto_6
    const/4 v5, 0x0

    goto :goto_7

    :catch_5
    move-exception v0

    move v5, v14

    move-object v1, v15

    .line 249
    :goto_7
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v6

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v7

    new-array v11, v5, [Ljava/lang/Object;

    const-string v10, "audioReceived() failed"

    move-object v9, v0

    invoke-virtual/range {v6 .. v11}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 250
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
.end method

.method public clearWalkinHistory()V
    .locals 3

    .line 750
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/presence/NativePresencePipeline;->clearWalkinHistory(J)V

    return-void
.end method

.method protected finalize()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 66
    invoke-direct {p0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->destroy()V

    .line 67
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void
.end method

.method public getFFTDataForServer()[B
    .locals 3

    .line 746
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/presence/NativePresencePipeline;->getFFTDataForServer(J)[B

    move-result-object v0

    return-object v0
.end method

.method public getLocationListVersion()I
    .locals 1

    .line 762
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/NativePresencePipeline;->getLocationListVersion()I

    move-result v0

    return v0
.end method

.method public getPdEvents()Ljava/lang/String;
    .locals 1

    .line 429
    iget-object v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pdEventsLogger:Lcom/shopkick/app/presenceLogger/PDEventsLogger;

    invoke-virtual {v0}, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getPresenceFactorsForServer([D)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([D)",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 718
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 719
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-wide v3, p1, v2

    .line 720
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public getWalkinHistory()Ljava/lang/String;
    .locals 3

    .line 742
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/presence/NativePresencePipeline;->getWalkinHistory(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public initialize(DLcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;Ljava/lang/String;)V
    .locals 5

    .line 71
    iget-wide v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 72
    sget-object v4, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    invoke-virtual {v4, v0, v1}, Lcom/shopkick/app/presence/NativePresencePipeline;->destroyPipeline(J)V

    .line 74
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->initializeLocationLists()V

    .line 75
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/shopkick/app/presence/NativePresencePipeline;->initPipeline(DLcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;Ljava/lang/String;)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    const-wide/high16 p1, 0x4024000000000000L    # 10.0

    .line 76
    iput-wide p1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pdEventTimeLimit:D

    const/4 p1, 0x0

    .line 77
    iput p1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pdEventLogLevel:I

    .line 84
    iget-object p1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pdEventsLogger:Lcom/shopkick/app/presenceLogger/PDEventsLogger;

    if-nez p1, :cond_1

    .line 85
    new-instance p1, Lcom/shopkick/app/presenceLogger/PDEventsLogger;

    iget-wide v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pdEventTimeLimit:D

    iget p2, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pdEventLogLevel:I

    iget-boolean p4, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->debugMode:Z

    invoke-direct {p1, v0, v1, p2, p4}, Lcom/shopkick/app/presenceLogger/PDEventsLogger;-><init>(DIZ)V

    iput-object p1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pdEventsLogger:Lcom/shopkick/app/presenceLogger/PDEventsLogger;

    .line 89
    :cond_1
    invoke-direct {p0, p3}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->setParameters(Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;)V

    .line 90
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->lastRandomNumGenerator:Ljava/util/Random;

    .line 91
    iput-wide v2, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->firstSigDetectionTime:J

    const/4 p1, 0x0

    .line 92
    iput-object p1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->lastPipelineResult:Lcom/shopkick/app/presence/MainPipelineResult;

    return-void
.end method

.method public isBackgroundMode()Z
    .locals 1

    .line 734
    iget-object v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->isAppBackgrounded()Z

    move-result v0

    return v0
.end method

.method public postBack(Ljava/lang/Runnable;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 154
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->handler:Lcom/shopkick/app/util/SKHandler;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/util/SKHandler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public recordWalkin(Ljava/lang/String;J)V
    .locals 6

    .line 730
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    move-object v3, p1

    move-wide v4, p2

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/app/presence/NativePresencePipeline;->recordWalkin(JLjava/lang/String;J)V

    return-void
.end method

.method public removePresenceListener(Lcom/shopkick/app/presence/IPresenceListener;)V
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public reset()V
    .locals 3

    .line 255
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/presence/NativePresencePipeline;->resetPipeline(J)V

    return-void
.end method

.method public resetPdEvents()V
    .locals 1

    .line 433
    iget-object v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pdEventsLogger:Lcom/shopkick/app/presenceLogger/PDEventsLogger;

    invoke-virtual {v0}, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->reset()V

    return-void
.end method

.method public sendServerData()V
    .locals 4

    .line 389
    iget-object v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->lastPipelineResult:Lcom/shopkick/app/presence/MainPipelineResult;

    .line 392
    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    invoke-direct {p0, v1, v2, v0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->getLocation(JLcom/shopkick/app/presence/MainPipelineResult;)Lcom/shopkick/app/presence/PresenceResult;

    move-result-object v1

    .line 393
    iget v1, v1, Lcom/shopkick/app/presence/PresenceResult;->resultCode:I

    const/16 v2, 0x1f

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 401
    iget-object v2, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->lastPipelineParams:Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;

    iget-object v2, v2, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->useLocationsInClient:Ljava/lang/Boolean;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->lastPipelineParams:Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;

    iget-object v2, v2, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->useLocationsInClient:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 402
    iget-object v1, v0, Lcom/shopkick/app/presence/MainPipelineResult;->code:Ljava/lang/String;

    .line 405
    :cond_1
    iget-object v0, v0, Lcom/shopkick/app/presence/MainPipelineResult;->presenceFactors:[D

    invoke-virtual {p0, v0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->getPresenceFactorsForServer([D)Ljava/util/ArrayList;

    .line 406
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v2, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    invoke-virtual {v0, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->getCurrentLocation(J)Lcom/shopkick/app/location/SKLocation;

    move-result-object v0

    .line 407
    sget-object v2, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    invoke-virtual {v2}, Lcom/shopkick/app/presence/NativePresencePipeline;->getLocationListVersion()I

    const/16 v2, 0x18

    .line 408
    invoke-virtual {p0, v2, v1, v0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->storePdEvent(ILjava/lang/String;Lcom/shopkick/app/location/SKLocation;)V

    .line 412
    iget-boolean v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->debugMode:Z

    if-nez v0, :cond_2

    .line 413
    invoke-virtual {p0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->getPdEvents()Ljava/lang/String;

    .line 416
    invoke-virtual {p0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->resetPdEvents()V

    :cond_2
    const/4 v0, 0x0

    .line 418
    invoke-direct {p0, v0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->maybeGetPresenceFFTData(Z)[B

    return-void
.end method

.method public setCurrentLocation(DDDJ)V
    .locals 12

    .line 726
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    move-object v11, p0

    iget-wide v1, v11, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    move-wide v3, p1

    move-wide v5, p3

    move-wide/from16 v7, p5

    move-wide/from16 v9, p7

    invoke-virtual/range {v0 .. v10}, Lcom/shopkick/app/presence/NativePresencePipeline;->setCurrentLocation(JDDDJ)Z

    return-void
.end method

.method public setCurrentUser(Ljava/lang/String;)V
    .locals 3

    .line 738
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    invoke-virtual {v0, v1, v2, p1}, Lcom/shopkick/app/presence/NativePresencePipeline;->setCurrentUser(JLjava/lang/String;)V

    return-void
.end method

.method public setHandler(Lcom/shopkick/app/util/SKHandler;)V
    .locals 0

    .line 139
    iput-object p1, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->handler:Lcom/shopkick/app/util/SKHandler;

    return-void
.end method

.method public simulatePresence(Ljava/lang/String;Z)V
    .locals 15

    .line 260
    new-instance v14, Lcom/shopkick/app/presence/MainPipelineResult;

    const/4 v1, 0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v0, v14

    move-object/from16 v9, p1

    invoke-direct/range {v0 .. v13}, Lcom/shopkick/app/presence/MainPipelineResult;-><init>(ZZZZZZZILjava/lang/String;II[D[B)V

    move-object v0, p0

    iput-object v14, v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->lastPipelineResult:Lcom/shopkick/app/presence/MainPipelineResult;

    if-eqz p2, :cond_0

    .line 274
    invoke-virtual {p0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->sendServerData()V

    goto :goto_0

    .line 276
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->triggerLocationFinder()V

    :goto_0
    return-void
.end method

.method public storePdEvent(ILjava/lang/String;Lcom/shopkick/app/location/SKLocation;)V
    .locals 1

    .line 447
    iget-boolean v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->debugMode:Z

    if-nez v0, :cond_0

    iget v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pdEventLogLevel:I

    if-lt p1, v0, :cond_0

    return-void

    .line 450
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pdEventsLogger:Lcom/shopkick/app/presenceLogger/PDEventsLogger;

    if-eqz v0, :cond_1

    .line 451
    invoke-virtual {v0, p1, p2, p3}, Lcom/shopkick/app/presenceLogger/PDEventsLogger;->recordPdEvent(ILjava/lang/String;Lcom/shopkick/app/location/SKLocation;)V

    :cond_1
    return-void
.end method

.method public triggerLocationFinder()V
    .locals 18

    move-object/from16 v15, p0

    .line 297
    iget-object v0, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->lastPipelineResult:Lcom/shopkick/app/presence/MainPipelineResult;

    if-eqz v0, :cond_8

    .line 298
    iget-object v1, v0, Lcom/shopkick/app/presence/MainPipelineResult;->code:Ljava/lang/String;

    if-eqz v1, :cond_8

    iget-object v1, v0, Lcom/shopkick/app/presence/MainPipelineResult;->code:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_4

    .line 304
    :cond_0
    sget-object v1, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v2, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    invoke-virtual {v1, v2, v3}, Lcom/shopkick/app/presence/NativePresencePipeline;->getPresenceStatus(J)I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    return-void

    .line 316
    :cond_1
    iget-object v3, v0, Lcom/shopkick/app/presence/MainPipelineResult;->code:Ljava/lang/String;

    .line 317
    iget-boolean v1, v0, Lcom/shopkick/app/presence/MainPipelineResult;->prefixMatch:Z

    .line 318
    iget v2, v0, Lcom/shopkick/app/presence/MainPipelineResult;->correctedBits:I

    .line 319
    new-instance v4, Lcom/shopkick/app/presence/PresenceResult;

    invoke-direct {v4}, Lcom/shopkick/app/presence/PresenceResult;-><init>()V

    .line 320
    iget-object v5, v0, Lcom/shopkick/app/presence/MainPipelineResult;->code:Ljava/lang/String;

    iput-object v5, v4, Lcom/shopkick/app/presence/PresenceResult;->presenceCode:Ljava/lang/String;

    .line 324
    iget-object v4, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->lastPipelineParams:Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;

    iget-object v4, v4, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->useLocationsInClient:Ljava/lang/Boolean;

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    iget-object v4, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->lastPipelineParams:Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;

    iget-object v4, v4, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->useLocationsInClient:Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 325
    sget-object v1, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v6, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    invoke-virtual {v1, v6, v7}, Lcom/shopkick/app/presence/NativePresencePipeline;->getCurrentLocation(J)Lcom/shopkick/app/location/SKLocation;

    move-result-object v1

    .line 326
    iget-wide v6, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    invoke-direct {v15, v6, v7, v0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->getLocation(JLcom/shopkick/app/presence/MainPipelineResult;)Lcom/shopkick/app/presence/PresenceResult;

    move-result-object v2

    .line 328
    iget v4, v2, Lcom/shopkick/app/presence/PresenceResult;->resultCode:I

    const/16 v6, 0x1f

    if-ne v4, v6, :cond_2

    .line 330
    iget v4, v2, Lcom/shopkick/app/presence/PresenceResult;->resultCode:I

    iget-object v7, v2, Lcom/shopkick/app/presence/PresenceResult;->presenceCode:Ljava/lang/String;

    invoke-virtual {v15, v4, v7, v1}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->storePdEvent(ILjava/lang/String;Lcom/shopkick/app/location/SKLocation;)V

    goto :goto_0

    .line 332
    :cond_2
    iget v4, v2, Lcom/shopkick/app/presence/PresenceResult;->resultCode:I

    invoke-virtual {v15, v4, v3, v1}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->storePdEvent(ILjava/lang/String;Lcom/shopkick/app/location/SKLocation;)V

    .line 334
    :goto_0
    iget v1, v2, Lcom/shopkick/app/presence/PresenceResult;->resultCode:I

    if-eq v1, v6, :cond_3

    return-void

    :cond_3
    move v4, v5

    move v9, v4

    goto :goto_1

    :cond_4
    move v9, v1

    move v4, v2

    .line 345
    :goto_1
    iget-object v1, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->lastPipelineParams:Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;

    iget-object v1, v1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->usePrefixCandidatesInClient:Ljava/lang/Boolean;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    iget-object v1, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->lastPipelineParams:Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;

    iget-object v1, v1, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->usePrefixCandidatesInClient:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 346
    sget-object v1, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v5, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    invoke-virtual {v1, v5, v6}, Lcom/shopkick/app/presence/NativePresencePipeline;->getLastPrefixCandidates(J)[I

    move-result-object v1

    move-object v11, v1

    goto :goto_2

    :cond_5
    move-object v11, v2

    .line 348
    :goto_2
    sget-object v1, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v5, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    invoke-virtual {v1, v5, v6}, Lcom/shopkick/app/presence/NativePresencePipeline;->getPrefixMask(J)I

    move-result v12

    .line 350
    iget-boolean v1, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->debugMode:Z

    if-nez v1, :cond_6

    .line 353
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->resetPdEvents()V

    .line 357
    :cond_6
    sget-object v1, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v5, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    const/4 v7, 0x1

    invoke-virtual {v1, v5, v6, v7}, Lcom/shopkick/app/presence/NativePresencePipeline;->setLocationFoundSincePresenceFound(JZ)V

    .line 366
    iget-object v1, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->lastRandomNumGenerator:Ljava/util/Random;

    const/16 v5, 0x64

    invoke-virtual {v1, v5}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    .line 367
    iget-object v5, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->lastPipelineParams:Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;

    iget-object v5, v5, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->presenceDetectorRandomDataReturnRate:Ljava/lang/Double;

    int-to-double v13, v1

    .line 368
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    const-wide/high16 v16, 0x4059000000000000L    # 100.0

    mul-double v5, v5, v16

    cmpg-double v1, v13, v5

    if-gez v1, :cond_7

    .line 369
    sget-object v1, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    iget-wide v5, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->pipelineStatePtr:J

    invoke-virtual {v1, v5, v6}, Lcom/shopkick/app/presence/NativePresencePipeline;->getDataForServer(J)[B

    move-result-object v1

    move-object v5, v1

    goto :goto_3

    :cond_7
    move-object v5, v2

    .line 371
    :goto_3
    invoke-direct {v15, v7}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->maybeGetPresenceFFTData(Z)[B

    move-result-object v6

    .line 372
    iget-object v1, v0, Lcom/shopkick/app/presence/MainPipelineResult;->presenceFactors:[D

    invoke-virtual {v15, v1}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->getPresenceFactorsForServer([D)Ljava/util/ArrayList;

    move-result-object v10

    .line 373
    sget-object v1, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    invoke-virtual {v1}, Lcom/shopkick/app/presence/NativePresencePipeline;->getLocationListVersion()I

    .line 374
    iget-object v14, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->handler:Lcom/shopkick/app/util/SKHandler;

    new-instance v13, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;

    iget-object v2, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->listeners:Ljava/util/List;

    iget-wide v7, v15, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->firstSigDetectionTime:J

    const/16 v16, 0x3

    iget v1, v0, Lcom/shopkick/app/presence/MainPipelineResult;->stepsSincePresenceFound:I

    move-object v0, v13

    move/from16 v17, v1

    move-object/from16 v1, p0

    move-object v15, v13

    move/from16 v13, v16

    move-object/from16 v16, v15

    move-object v15, v14

    move/from16 v14, v17

    invoke-direct/range {v0 .. v14}, Lcom/shopkick/app/presence/NativePresencePipelineInterop$PresenceCallback;-><init>(Lcom/shopkick/app/presence/NativePresencePipelineInterop;Ljava/util/List;Ljava/lang/String;I[B[BJZLjava/util/ArrayList;[IIII)V

    move-object/from16 v0, v16

    invoke-virtual {v15, v0}, Lcom/shopkick/app/util/SKHandler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_8
    :goto_4
    return-void
.end method

.method public updateDistances(Z)V
    .locals 1

    .line 758
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/presence/NativePresencePipeline;->updateDistances(Z)V

    return-void
.end method

.method public updateLocationList(Ljava/lang/String;)V
    .locals 1

    .line 754
    sget-object v0, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->jni:Lcom/shopkick/app/presence/NativePresencePipeline;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/presence/NativePresencePipeline;->updateLocationList(Ljava/lang/String;)V

    return-void
.end method

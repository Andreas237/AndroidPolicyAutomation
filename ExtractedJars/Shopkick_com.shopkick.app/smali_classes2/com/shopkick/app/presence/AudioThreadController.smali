.class public Lcom/shopkick/app/presence/AudioThreadController;
.super Ljava/lang/Object;
.source "AudioThreadController.java"

# interfaces
.implements Lcom/shopkick/app/telephony/IPhoneCallStateCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/presence/AudioThreadController$TriggerPresenceUpdate;,
        Lcom/shopkick/app/presence/AudioThreadController$AudioThread;,
        Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;
    }
.end annotation


# static fields
.field public static final AUDIO_FORMAT:I = 0x2

.field public static final CHANNEL_CONFIG:I = 0x10

.field private static final DEBUG_READ_FILE:Z = false

.field private static final DEBUG_WRITE_FILE:Z = false

.field public static final PREFERRED_BUFFER_SIZE:I = 0x2000

.field public static final SAMPLE_RATE:I = 0xac44


# instance fields
.field private ar:Lcom/shopkick/app/presence/SKAudioRecord;

.field private audioThread:Lcom/shopkick/app/presence/AudioThreadController$AudioThread;

.field private audioThreadEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Landroid/os/Message;",
            ">;"
        }
    .end annotation
.end field

.field private buffer:[S

.field private bufferSize:I

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private errorRecording:Z

.field private factory:Lcom/shopkick/app/presence/AudioRecordFactory;

.field private fileName:Ljava/lang/String;

.field private initialized:Z

.field private lastCallState:I

.field private nativeLoggingFilename:Ljava/lang/String;

.field private phoneStateNotifier:Lcom/shopkick/app/telephony/PhoneCallStateNotifier;

.field private pipeline:Lcom/shopkick/app/presence/NativePresencePipelineInterop;

.field private pipelineParams:Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;

.field private readBufferSize:I

.field private root:Ljava/io/File;

.field private shouldRun:Z

.field private sizeSoFar:I

.field private started:Z

.field private wasStarted:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/presence/NativePresencePipelineInterop;Lcom/shopkick/app/telephony/PhoneCallStateNotifier;Lcom/shopkick/app/presence/AudioRecordFactory;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 4

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 61
    iput-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->buffer:[S

    const/4 v1, 0x1

    .line 69
    iput-boolean v1, p0, Lcom/shopkick/app/presence/AudioThreadController;->shouldRun:Z

    const/4 v2, 0x0

    .line 70
    iput v2, p0, Lcom/shopkick/app/presence/AudioThreadController;->sizeSoFar:I

    const-string v3, "evoRawRecording"

    .line 71
    iput-object v3, p0, Lcom/shopkick/app/presence/AudioThreadController;->fileName:Ljava/lang/String;

    .line 72
    iput-boolean v2, p0, Lcom/shopkick/app/presence/AudioThreadController;->errorRecording:Z

    .line 74
    iput-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->nativeLoggingFilename:Ljava/lang/String;

    const/4 v3, -0x1

    .line 80
    iput v3, p0, Lcom/shopkick/app/presence/AudioThreadController;->lastCallState:I

    .line 81
    iput-boolean v2, p0, Lcom/shopkick/app/presence/AudioThreadController;->wasStarted:Z

    .line 101
    invoke-virtual {p1, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->root:Ljava/io/File;

    .line 102
    iput-object p2, p0, Lcom/shopkick/app/presence/AudioThreadController;->pipeline:Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    .line 103
    iput-object p3, p0, Lcom/shopkick/app/presence/AudioThreadController;->phoneStateNotifier:Lcom/shopkick/app/telephony/PhoneCallStateNotifier;

    .line 104
    iput-object p4, p0, Lcom/shopkick/app/presence/AudioThreadController;->factory:Lcom/shopkick/app/presence/AudioRecordFactory;

    .line 105
    iput-object p5, p0, Lcom/shopkick/app/presence/AudioThreadController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 107
    iget-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->phoneStateNotifier:Lcom/shopkick/app/telephony/PhoneCallStateNotifier;

    if-eqz p1, :cond_0

    .line 108
    invoke-virtual {p1, p0}, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->registerListener(Lcom/shopkick/app/telephony/IPhoneCallStateCallback;)V

    :cond_0
    if-eqz p2, :cond_1

    .line 112
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->audioThreadEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 113
    new-instance p1, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;

    invoke-direct {p1, p0}, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;-><init>(Lcom/shopkick/app/presence/AudioThreadController;)V

    iput-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->audioThread:Lcom/shopkick/app/presence/AudioThreadController$AudioThread;

    .line 114
    iget-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->audioThread:Lcom/shopkick/app/presence/AudioThreadController$AudioThread;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->setPriority(I)V

    .line 115
    iget-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->audioThread:Lcom/shopkick/app/presence/AudioThreadController$AudioThread;

    invoke-virtual {p1}, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->start()V

    :cond_1
    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/presence/AudioThreadController;->pipeline:Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/shopkick/app/presence/AudioThreadController;)I
    .locals 0

    .line 40
    iget p0, p0, Lcom/shopkick/app/presence/AudioThreadController;->readBufferSize:I

    return p0
.end method

.method static synthetic access$1002(Lcom/shopkick/app/presence/AudioThreadController;I)I
    .locals 0

    .line 40
    iput p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->readBufferSize:I

    return p1
.end method

.method static synthetic access$1100(Lcom/shopkick/app/presence/AudioThreadController;)[S
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/presence/AudioThreadController;->buffer:[S

    return-object p0
.end method

.method static synthetic access$1102(Lcom/shopkick/app/presence/AudioThreadController;[S)[S
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->buffer:[S

    return-object p1
.end method

.method static synthetic access$1200(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/presence/AudioThreadController;->pipelineParams:Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;

    return-object p0
.end method

.method static synthetic access$1300(Lcom/shopkick/app/presence/AudioThreadController;)Ljava/lang/String;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/presence/AudioThreadController;->nativeLoggingFilename:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1400(Lcom/shopkick/app/presence/AudioThreadController;)Ljava/util/concurrent/ConcurrentLinkedQueue;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/presence/AudioThreadController;->audioThreadEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    return-object p0
.end method

.method static synthetic access$1500(Lcom/shopkick/app/presence/AudioThreadController;)Ljava/io/File;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/presence/AudioThreadController;->root:Ljava/io/File;

    return-object p0
.end method

.method static synthetic access$1600(Lcom/shopkick/app/presence/AudioThreadController;)I
    .locals 0

    .line 40
    iget p0, p0, Lcom/shopkick/app/presence/AudioThreadController;->sizeSoFar:I

    return p0
.end method

.method static synthetic access$1602(Lcom/shopkick/app/presence/AudioThreadController;I)I
    .locals 0

    .line 40
    iput p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->sizeSoFar:I

    return p1
.end method

.method static synthetic access$1700(Lcom/shopkick/app/presence/AudioThreadController;)Ljava/lang/String;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/presence/AudioThreadController;->fileName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/presence/AudioThreadController;)Z
    .locals 0

    .line 40
    iget-boolean p0, p0, Lcom/shopkick/app/presence/AudioThreadController;->shouldRun:Z

    return p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/presence/AudioThreadController;)Z
    .locals 0

    .line 40
    iget-boolean p0, p0, Lcom/shopkick/app/presence/AudioThreadController;->started:Z

    return p0
.end method

.method static synthetic access$302(Lcom/shopkick/app/presence/AudioThreadController;Z)Z
    .locals 0

    .line 40
    iput-boolean p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->started:Z

    return p1
.end method

.method static synthetic access$400(Lcom/shopkick/app/presence/AudioThreadController;)Z
    .locals 0

    .line 40
    iget-boolean p0, p0, Lcom/shopkick/app/presence/AudioThreadController;->initialized:Z

    return p0
.end method

.method static synthetic access$402(Lcom/shopkick/app/presence/AudioThreadController;Z)Z
    .locals 0

    .line 40
    iput-boolean p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->initialized:Z

    return p1
.end method

.method static synthetic access$502(Lcom/shopkick/app/presence/AudioThreadController;Z)Z
    .locals 0

    .line 40
    iput-boolean p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->errorRecording:Z

    return p1
.end method

.method static synthetic access$600(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/application/ClientFlagsManager;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/presence/AudioThreadController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/AudioRecordFactory;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/presence/AudioThreadController;->factory:Lcom/shopkick/app/presence/AudioRecordFactory;

    return-object p0
.end method

.method static synthetic access$800(Lcom/shopkick/app/presence/AudioThreadController;)Lcom/shopkick/app/presence/SKAudioRecord;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/shopkick/app/presence/AudioThreadController;->ar:Lcom/shopkick/app/presence/SKAudioRecord;

    return-object p0
.end method

.method static synthetic access$802(Lcom/shopkick/app/presence/AudioThreadController;Lcom/shopkick/app/presence/SKAudioRecord;)Lcom/shopkick/app/presence/SKAudioRecord;
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->ar:Lcom/shopkick/app/presence/SKAudioRecord;

    return-object p1
.end method

.method static synthetic access$900(Lcom/shopkick/app/presence/AudioThreadController;)I
    .locals 0

    .line 40
    iget p0, p0, Lcom/shopkick/app/presence/AudioThreadController;->bufferSize:I

    return p0
.end method

.method static synthetic access$902(Lcom/shopkick/app/presence/AudioThreadController;I)I
    .locals 0

    .line 40
    iput p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->bufferSize:I

    return p1
.end method

.method private generateDeptCodesParamsFromClientFlags(Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;)Lcom/shopkick/app/presence/NativePresencePipeline$DeptCodesParams;
    .locals 1

    .line 510
    new-instance v0, Lcom/shopkick/app/presence/NativePresencePipeline$DeptCodesParams;

    invoke-direct {v0}, Lcom/shopkick/app/presence/NativePresencePipeline$DeptCodesParams;-><init>()V

    .line 511
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdSmoothingSamplesUntilExpires:Ljava/lang/Integer;

    iput-object p1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$DeptCodesParams;->samplesUntilExpiration:Ljava/lang/Integer;

    return-object v0
.end method

.method private generateFreqCodingParamsFromClientFlags(Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;)Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;
    .locals 2

    .line 487
    new-instance v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    invoke-direct {v0}, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;-><init>()V

    .line 489
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingBitDetectThreshold:Ljava/lang/Double;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->bitDetectThreshold:Ljava/lang/Double;

    .line 490
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingGapInSamplesBetweenLowFreqAndCalibration:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->gapInSamplesBetweenLowFreqAndCalibration:Ljava/lang/Integer;

    .line 491
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingMaxFreqOfAvgForOne:Ljava/lang/Double;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->maxFracOfAvgForOne:Ljava/lang/Double;

    .line 492
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingNumSamplesToCalibrateWith:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->numSamplesToCalibrateWith:Ljava/lang/Integer;

    .line 493
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingPresenceDetectMinBits:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->presenceDetectMinBits:Ljava/lang/Integer;

    .line 494
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingPresenceNarrowBandDetectThreshold:Ljava/lang/Double;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->presenceNarrowBandDetectThreshold:Ljava/lang/Double;

    .line 495
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingPresenceStrengthRatioThreshold:Ljava/lang/Double;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->presenceStrengthRatioThreshold:Ljava/lang/Double;

    .line 496
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingPresenceWideBandDetectThreshold:Ljava/lang/Double;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->presenceWideBandDetectThreshold:Ljava/lang/Double;

    .line 497
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdWideBandDetectEnabled:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->wideBandPresenceDetectEnabled:Ljava/lang/Boolean;

    .line 498
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingUseErrorCorrection:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->useErrorCorrection:Ljava/lang/Boolean;

    .line 499
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingFrFactors:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->frFactors:Ljava/lang/String;

    .line 500
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdPrefixBitsRequired:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->numPrefixBitsRequired:Ljava/lang/Integer;

    .line 501
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingMinCarriers:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->minCarriers:Ljava/lang/Integer;

    .line 502
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingMaxIntermediate:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->maxIntermediates:Ljava/lang/Integer;

    .line 503
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingCarrierThreshold:Ljava/lang/Double;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->carrierThreshold:Ljava/lang/Double;

    .line 504
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingDetectThreshold:Ljava/lang/Double;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->detectThreshold:Ljava/lang/Double;

    .line 505
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFreqCodingNoiseThreshold:Ljava/lang/Double;

    iput-object p1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;->noiseThreshold:Ljava/lang/Double;

    return-object v0
.end method

.method private generateHighPassFilterParamsFromClientFlags(Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;)Lcom/shopkick/app/presence/NativePresencePipeline$HighPassFilterParams;
    .locals 1

    .line 516
    new-instance v0, Lcom/shopkick/app/presence/NativePresencePipeline$HighPassFilterParams;

    invoke-direct {v0}, Lcom/shopkick/app/presence/NativePresencePipeline$HighPassFilterParams;-><init>()V

    .line 517
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdHighPassFilterType:Ljava/lang/Integer;

    iput-object p1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$HighPassFilterParams;->highPassFilterType:Ljava/lang/Integer;

    return-object v0
.end method

.method private generateLocationParamsFromClientFlags(Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;)Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;
    .locals 2

    .line 522
    new-instance v0, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    invoke-direct {v0}, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;-><init>()V

    .line 523
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useLocationsInClient:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->useLocationsInClient:Ljava/lang/Boolean;

    .line 524
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdUseScoringForLocationFinder:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->useScoringForLocationFinder:Ljava/lang/Boolean;

    .line 525
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocDistanceRecalcThresholdMeters:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->distanceRecalcThresholdMeters:Ljava/lang/Integer;

    .line 526
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocPresenceDetectCheckinRadiusMeters:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->presenceDetectCheckinRadiusMeters:Ljava/lang/Integer;

    .line 527
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocBingErrorRadiusMeters:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->bingErrorRadiusMeters:Ljava/lang/Integer;

    .line 528
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocBitsToIgnore:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->bitsToIgnore:Ljava/lang/Integer;

    .line 529
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocAccuracyThresholdForErrorCorrectionMeters:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->accuracyThresholdForErrorCorrectionMeters:Ljava/lang/Integer;

    .line 530
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocShouldTryErrorCorrection:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->shouldTryErrorCorrection:Ljava/lang/Boolean;

    .line 531
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdEventLogLevel:Ljava/lang/Integer;

    iput-object p1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;->pdEventLogLevel:Ljava/lang/Integer;

    return-object v0
.end method

.method private generateParamsFromClientFlags(Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;)Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;
    .locals 2

    .line 458
    new-instance v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;

    invoke-direct {v0}, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;-><init>()V

    .line 460
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdDeptCodesEnabled:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->deptCodesEnabled:Ljava/lang/Boolean;

    .line 461
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdDopplerCorrectionEnabled:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->dopplerCorrectionEnabled:Ljava/lang/Boolean;

    .line 463
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdMaxOldFfts:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->maxOldFFTs:Ljava/lang/Integer;

    .line 464
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdUseWindowing:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->useFFTWindowing:Ljava/lang/Boolean;

    .line 465
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdWaitTimeUntilServerRequest:Ljava/lang/Double;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->waitTimeUntilServerRequest:Ljava/lang/Double;

    .line 466
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdServerHighestReturnFrequency:Ljava/lang/Double;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->serverHighestReturnFrequency:Ljava/lang/Double;

    .line 467
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdServerLowestReturnFrequency:Ljava/lang/Double;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->serverLowestReturnFrequency:Ljava/lang/Double;

    .line 468
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdWideBandDetectEnabled:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->wideBandPresenceDetectEnabled:Ljava/lang/Boolean;

    .line 469
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdPresenceDetectorRandomDataReturnRate:Ljava/lang/Double;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->presenceDetectorRandomDataReturnRate:Ljava/lang/Double;

    .line 470
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdFftDataReturnRateForFailures:Ljava/lang/Double;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->presenceDetectorFftDataReturnRateForFailures:Ljava/lang/Double;

    .line 471
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdHighPassFilterEnabled:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->highPassFilterEnabled:Ljava/lang/Boolean;

    .line 472
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdCrcCheckDisabled:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->crcDisabled:Ljava/lang/Boolean;

    .line 473
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdUseAutoEqualizerIfNoFr:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->useAutoEqualizerIfNoFR:Ljava/lang/Boolean;

    .line 474
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useLocationsInClient:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->useLocationsInClient:Ljava/lang/Boolean;

    .line 475
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->useNearbyLocationsForPresence:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->usePrefixCandidatesInClient:Ljava/lang/Boolean;

    .line 476
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdUseScoringForLocationFinder:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->useScoringForLocationFinder:Ljava/lang/Boolean;

    .line 477
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdPrefixBitsRequired:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->numPrefixBitsRequired:Ljava/lang/Integer;

    .line 478
    invoke-direct {p0, p1}, Lcom/shopkick/app/presence/AudioThreadController;->generateFreqCodingParamsFromClientFlags(Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;)Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

    .line 479
    invoke-direct {p0, p1}, Lcom/shopkick/app/presence/AudioThreadController;->generateDeptCodesParamsFromClientFlags(Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;)Lcom/shopkick/app/presence/NativePresencePipeline$DeptCodesParams;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->deptCodesParams:Lcom/shopkick/app/presence/NativePresencePipeline$DeptCodesParams;

    .line 480
    invoke-direct {p0, p1}, Lcom/shopkick/app/presence/AudioThreadController;->generateHighPassFilterParamsFromClientFlags(Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;)Lcom/shopkick/app/presence/NativePresencePipeline$HighPassFilterParams;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->highPassFilterParams:Lcom/shopkick/app/presence/NativePresencePipeline$HighPassFilterParams;

    .line 481
    invoke-direct {p0, p1}, Lcom/shopkick/app/presence/AudioThreadController;->generateLocationParamsFromClientFlags(Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;)Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;->locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

    return-object v0
.end method


# virtual methods
.method public callCallback(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Ljava/util/concurrent/Future<",
            "TT;>;"
        }
    .end annotation

    .line 218
    new-instance v0, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;

    invoke-direct {v0, p0}, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;-><init>(Lcom/shopkick/app/presence/AudioThreadController;)V

    .line 219
    new-instance v1, Lcom/shopkick/app/presence/AudioThreadController$2;

    invoke-direct {v1, p0, v0, p1}, Lcom/shopkick/app/presence/AudioThreadController$2;-><init>(Lcom/shopkick/app/presence/AudioThreadController;Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;Ljava/util/concurrent/Callable;)V

    invoke-virtual {p0, v1}, Lcom/shopkick/app/presence/AudioThreadController;->postCallback(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public hadErrorRecording()Z
    .locals 1

    .line 565
    iget-boolean v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->errorRecording:Z

    return v0
.end method

.method public isInitialized()Z
    .locals 3

    .line 576
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->audioThread:Lcom/shopkick/app/presence/AudioThreadController$AudioThread;

    if-eqz v0, :cond_0

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->isReady(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public declared-synchronized isThreadAlive()Z
    .locals 1

    monitor-enter p0

    .line 583
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->audioThread:Lcom/shopkick/app/presence/AudioThreadController$AudioThread;

    if-eqz v0, :cond_0

    .line 584
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->audioThread:Lcom/shopkick/app/presence/AudioThreadController$AudioThread;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/AudioThreadController$AudioThread;->isAlive()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    .line 586
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized killAudioThread()V
    .locals 2

    monitor-enter p0

    .line 591
    :try_start_0
    iget-boolean v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->initialized:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->started:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->audioThread:Lcom/shopkick/app/presence/AudioThreadController$AudioThread;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 592
    iput-boolean v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->shouldRun:Z

    .line 593
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->audioThread:Lcom/shopkick/app/presence/AudioThreadController$AudioThread;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 594
    :try_start_1
    iget-object v1, p0, Lcom/shopkick/app/presence/AudioThreadController;->audioThread:Lcom/shopkick/app/presence/AudioThreadController$AudioThread;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 595
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 597
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public onPhoneCallStateChanged(I)V
    .locals 2

    .line 614
    iget v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->lastCallState:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    if-eq p1, v1, :cond_0

    .line 615
    iget-boolean v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->wasStarted:Z

    if-eqz v0, :cond_1

    .line 616
    invoke-virtual {p0}, Lcom/shopkick/app/presence/AudioThreadController;->startRecording()V

    const/4 v0, 0x0

    .line 617
    iput-boolean v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->wasStarted:Z

    goto :goto_0

    :cond_0
    if-ne p1, v1, :cond_1

    .line 620
    iget-boolean v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->started:Z

    if-eqz v0, :cond_1

    .line 621
    invoke-virtual {p0}, Lcom/shopkick/app/presence/AudioThreadController;->stopRecording()V

    const/4 v0, 0x1

    .line 622
    iput-boolean v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->wasStarted:Z

    .line 625
    :cond_1
    :goto_0
    iput p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->lastCallState:I

    return-void
.end method

.method public postCallback(Ljava/lang/Runnable;)V
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->audioThread:Lcom/shopkick/app/presence/AudioThreadController$AudioThread;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->audioThreadEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 142
    invoke-static {v0, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;Ljava/lang/Runnable;)Landroid/os/Message;

    move-result-object p1

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->audioThreadEventQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    .line 144
    iget-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->audioThread:Lcom/shopkick/app/presence/AudioThreadController$AudioThread;

    monitor-enter p1

    .line 145
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->audioThread:Lcom/shopkick/app/presence/AudioThreadController$AudioThread;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 146
    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method printAudioRecording(I)V
    .locals 3

    .line 603
    iget-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->buffer:[S

    if-eqz p1, :cond_1

    .line 604
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, "FIRST 10 SHORTS IN BUFFER:"

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 p1, 0x0

    :goto_0
    const/16 v0, 0xa

    if-ge p1, v0, :cond_0

    .line 606
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/shopkick/app/presence/AudioThreadController;->buffer:[S

    aget-short v2, v2, p1

    invoke-static {v2}, Ljava/lang/Short;->toString(S)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 608
    :cond_0
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, "\n----------------------\n"

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public repostCallback(Ljava/lang/Runnable;)V
    .locals 1

    .line 151
    new-instance v0, Lcom/shopkick/app/presence/AudioThreadController$1;

    invoke-direct {v0, p0, p1}, Lcom/shopkick/app/presence/AudioThreadController$1;-><init>(Lcom/shopkick/app/presence/AudioThreadController;Ljava/lang/Runnable;)V

    invoke-virtual {p0, v0}, Lcom/shopkick/app/presence/AudioThreadController;->postCallback(Ljava/lang/Runnable;)V

    return-void
.end method

.method public declared-synchronized startRecording()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 536
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/shopkick/app/presence/AudioThreadController;->startRecording(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 537
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized startRecording(Ljava/lang/String;)V
    .locals 2

    monitor-enter p0

    .line 540
    :try_start_0
    iget-boolean v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->started:Z

    if-nez v0, :cond_4

    .line 541
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->phoneStateNotifier:Lcom/shopkick/app/telephony/PhoneCallStateNotifier;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->audioThread:Lcom/shopkick/app/presence/AudioThreadController$AudioThread;

    if-nez v0, :cond_0

    goto :goto_0

    .line 546
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->phoneStateNotifier:Lcom/shopkick/app/telephony/PhoneCallStateNotifier;

    invoke-virtual {v0}, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->getCallState()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 547
    monitor-exit p0

    return-void

    :cond_1
    const/4 v0, 0x1

    .line 549
    :try_start_1
    iput-boolean v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->started:Z

    .line 550
    iput-boolean v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->shouldRun:Z

    .line 552
    iput-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->nativeLoggingFilename:Ljava/lang/String;

    .line 555
    iget-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    if-eqz p1, :cond_2

    .line 556
    iget-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    invoke-direct {p0, p1}, Lcom/shopkick/app/presence/AudioThreadController;->generateParamsFromClientFlags(Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;)Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->pipelineParams:Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;

    .line 558
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController;->audioThread:Lcom/shopkick/app/presence/AudioThreadController$AudioThread;

    monitor-enter p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 559
    :try_start_2
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->audioThread:Lcom/shopkick/app/presence/AudioThreadController$AudioThread;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 560
    monitor-exit p1

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 542
    :cond_3
    :goto_0
    monitor-exit p0

    return-void

    .line 562
    :cond_4
    :goto_1
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized stopRecording()V
    .locals 1

    monitor-enter p0

    .line 569
    :try_start_0
    iget-boolean v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->initialized:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->started:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 571
    iput-boolean v0, p0, Lcom/shopkick/app/presence/AudioThreadController;->started:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 573
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public triggerSendPresenceCode()V
    .locals 2

    .line 120
    new-instance v0, Lcom/shopkick/app/presence/AudioThreadController$TriggerPresenceUpdate;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/shopkick/app/presence/AudioThreadController$TriggerPresenceUpdate;-><init>(Lcom/shopkick/app/presence/AudioThreadController;Lcom/shopkick/app/presence/AudioThreadController$1;)V

    .line 121
    invoke-virtual {p0, v0}, Lcom/shopkick/app/presence/AudioThreadController;->postCallback(Ljava/lang/Runnable;)V

    return-void
.end method

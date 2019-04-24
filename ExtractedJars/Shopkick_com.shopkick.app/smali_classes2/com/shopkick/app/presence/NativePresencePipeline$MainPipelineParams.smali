.class public Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;
.super Ljava/lang/Object;
.source "NativePresencePipeline.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/presence/NativePresencePipeline;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MainPipelineParams"
.end annotation


# instance fields
.field crcDisabled:Ljava/lang/Boolean;

.field deptCodesEnabled:Ljava/lang/Boolean;

.field deptCodesParams:Lcom/shopkick/app/presence/NativePresencePipeline$DeptCodesParams;

.field dopplerCorrectionEnabled:Ljava/lang/Boolean;

.field enabled:Ljava/lang/Boolean;

.field freqCodingParams:Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;

.field highPassFilterEnabled:Ljava/lang/Boolean;

.field highPassFilterParams:Lcom/shopkick/app/presence/NativePresencePipeline$HighPassFilterParams;

.field highestFrequency:Ljava/lang/Double;

.field hzBetweenBuckets:Ljava/lang/Double;

.field hzBetweenSignalFreqs:Ljava/lang/Double;

.field locationParams:Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;

.field lowPowerMode:Ljava/lang/Boolean;

.field lowestFrequency:Ljava/lang/Double;

.field maxDopplerCorrectionHz:Ljava/lang/Double;

.field maxOldFFTs:Ljava/lang/Integer;

.field numCRCBits:Ljava/lang/Integer;

.field numDataBits:Ljava/lang/Integer;

.field numDeptBits:Ljava/lang/Integer;

.field numFrequencies:Ljava/lang/Integer;

.field numPrefixBitsRequired:Ljava/lang/Integer;

.field numTimesToAcceptCorrectedCode:Ljava/lang/Integer;

.field presenceDetectorFftDataReturnRateForFailures:Ljava/lang/Double;

.field presenceDetectorRandomDataReturnRate:Ljava/lang/Double;

.field serverHighestReturnFrequency:Ljava/lang/Double;

.field serverLowestReturnFrequency:Ljava/lang/Double;

.field statsEnabled:Ljava/lang/Boolean;

.field useAutoEqualizerIfNoFR:Ljava/lang/Boolean;

.field useFFTWindowing:Ljava/lang/Boolean;

.field useLocationsInClient:Ljava/lang/Boolean;

.field usePrefixCandidatesInClient:Ljava/lang/Boolean;

.field useScoringForLocationFinder:Ljava/lang/Boolean;

.field waitTimeUntilServerRequest:Ljava/lang/Double;

.field wideBandPresenceDetectEnabled:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 206
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

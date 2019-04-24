.class public Lcom/shopkick/app/presence/NativePresencePipeline;
.super Ljava/lang/Object;
.source "NativePresencePipeline.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;,
        Lcom/shopkick/app/presence/NativePresencePipeline$HighPassFilterParams;,
        Lcom/shopkick/app/presence/NativePresencePipeline$DeptCodesParams;,
        Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;,
        Lcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "native-lib-audio"

    .line 11
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 12
    invoke-static {}, Lcom/shopkick/app/presence/NativePresencePipeline;->initIds()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native initIds()V
.end method


# virtual methods
.method public native clearWalkinHistory(J)V
.end method

.method public native consumeAudio(J[SIZ)V
.end method

.method public native destroyPipeline(J)V
.end method

.method public native getCurrentLocation(J)Lcom/shopkick/app/location/SKLocation;
.end method

.method public native getDataForServer(J)[B
.end method

.method public native getFFTDataForServer(J)[B
.end method

.method public native getLastPrefixCandidates(J)[I
.end method

.method public native getLocation(JLjava/lang/String;I[DZ)Lcom/shopkick/app/presence/PresenceResult;
.end method

.method public native getLocationListVersion()I
.end method

.method public native getPrefixMask(J)I
.end method

.method public native getPresenceStatus(J)I
.end method

.method public native getWalkinHistory(J)Ljava/lang/String;
.end method

.method public native initPipeline(DLcom/shopkick/app/presence/NativePresencePipeline$MainPipelineParams;Ljava/lang/String;)J
.end method

.method public native initializeLocationLists(Ljava/lang/String;JJ)V
.end method

.method public native recordWalkin(JLjava/lang/String;J)V
.end method

.method public native resetPipeline(J)V
.end method

.method public native setAccuracyThresholdForErrorCorrectionMetersLocationParam(JI)V
.end method

.method public native setBingErrorRadiusMetersLocationParam(JI)V
.end method

.method public native setBitDetectThresholdFCParam(JD)V
.end method

.method public native setBitsToIgnoreLocationParam(JI)V
.end method

.method public native setCarrierThresholdFCParam(JD)V
.end method

.method public native setCrcDisabledParam(JZ)V
.end method

.method public native setCurrentLocation(JDDDJ)Z
.end method

.method public native setCurrentUser(JLjava/lang/String;)V
.end method

.method public native setDeptCodesEnabledParam(JZ)V
.end method

.method public native setDetectThresholdFCParam(JD)V
.end method

.method public native setDistanceRecalcThresholdMetersLocationParam(JI)V
.end method

.method public native setDopplerCorrectionEnabledParam(JZ)V
.end method

.method public native setFrFactorsParam(J[B)V
.end method

.method public native setGapInSamplesBtwLowFreqAndCalibFCParam(JI)V
.end method

.method public native setHighPassFilterEnabledParam(JZ)V
.end method

.method public native setHighPassFilterTypeHPFParam(JI)V
.end method

.method public native setLocationFoundSincePresenceFound(JZ)V
.end method

.method public native setMaxFracOfAvgForOneFCParam(JD)V
.end method

.method public native setMaxIntermediatesFCParam(JI)V
.end method

.method public native setMaxOldFFtsParam(JI)V
.end method

.method public native setMinCarriersFCParam(JI)V
.end method

.method public native setNoiseThresholdFCParam(JD)V
.end method

.method public native setNumPrefixBitsRequiredFCParam(JI)V
.end method

.method public native setNumPrefixBitsRequiredParam(JI)V
.end method

.method public native setNumSamplesCalibrateWithFCParam(JI)V
.end method

.method public native setPresenceDetectCheckinRadiusMetersLocationParam(JI)V
.end method

.method public native setPresenceDetectMinBitsFCParam(JI)V
.end method

.method public native setPresenceDetectNarrowBandDetectThresholdFCParam(JD)V
.end method

.method public native setPresenceStrengthRatioThresholdFCParam(JD)V
.end method

.method public native setSamplesUntilExpirationDCParam(JI)V
.end method

.method public native setServerHighestReturnFreqParam(JD)V
.end method

.method public native setServerLowestReturnFreqParam(JD)V
.end method

.method public native setShouldTryErrorCorrectionLocationParam(JZ)V
.end method

.method public native setUseAutoEqualizerIfNoFRParam(JZ)V
.end method

.method public native setUseErrorCorrectionFCParam(JZ)V
.end method

.method public native setUseLocationsInClientLocationParam(JZ)V
.end method

.method public native setUseLocationsInClientParam(JZ)V
.end method

.method public native setUsePrefixCandidatesInClientParam(JZ)V
.end method

.method public native setUseScoringForLocationFinderLocationParam(JZ)V
.end method

.method public native setUseScoringForLocationFinderParam(JZ)V
.end method

.method public native setUseWindowing(JZ)V
.end method

.method public native setWaitTimeUntilServerRequestParam(JD)V
.end method

.method public native setWideBandDetectEnabledFCParam(JZ)V
.end method

.method public native setWideBandDetectEnabledParam(JZ)V
.end method

.method public native setWideBandThresholdFCParam(JD)V
.end method

.method public native stepPipeline(J)Lcom/shopkick/app/presence/MainPipelineResult;
.end method

.method public native updateDistances(Z)V
.end method

.method public native updateLocationList(Ljava/lang/String;)V
.end method

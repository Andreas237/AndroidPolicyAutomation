.class public Lcom/shopkick/app/presence/NativePresencePipeline$FreqCodingParams;
.super Ljava/lang/Object;
.source "NativePresencePipeline.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/presence/NativePresencePipeline;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FreqCodingParams"
.end annotation


# instance fields
.field bitDetectThreshold:Ljava/lang/Double;

.field carrierThreshold:Ljava/lang/Double;

.field detectThreshold:Ljava/lang/Double;

.field frFactors:Ljava/lang/String;

.field gapInSamplesBetweenLowFreqAndCalibration:Ljava/lang/Integer;

.field maxFracOfAvgForOne:Ljava/lang/Double;

.field maxIntermediates:Ljava/lang/Integer;

.field minCarriers:Ljava/lang/Integer;

.field noiseThreshold:Ljava/lang/Double;

.field numPrefixBitsRequired:Ljava/lang/Integer;

.field numSamplesToCalibrateWith:Ljava/lang/Integer;

.field presenceDetectMinBits:Ljava/lang/Integer;

.field presenceNarrowBandDetectThreshold:Ljava/lang/Double;

.field presenceStrengthRatioThreshold:Ljava/lang/Double;

.field presenceWideBandDetectThreshold:Ljava/lang/Double;

.field useErrorCorrection:Ljava/lang/Boolean;

.field wideBandPresenceDetectEnabled:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 251
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

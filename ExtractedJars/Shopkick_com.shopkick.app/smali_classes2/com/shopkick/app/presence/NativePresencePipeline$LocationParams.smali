.class public Lcom/shopkick/app/presence/NativePresencePipeline$LocationParams;
.super Ljava/lang/Object;
.source "NativePresencePipeline.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/presence/NativePresencePipeline;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LocationParams"
.end annotation


# instance fields
.field accuracyThresholdForErrorCorrectionMeters:Ljava/lang/Integer;

.field bingErrorRadiusMeters:Ljava/lang/Integer;

.field bitsToIgnore:Ljava/lang/Integer;

.field distanceRecalcThresholdMeters:Ljava/lang/Integer;

.field pdEventLogLevel:Ljava/lang/Integer;

.field presenceDetectCheckinRadiusMeters:Ljava/lang/Integer;

.field shouldTryErrorCorrection:Ljava/lang/Boolean;

.field useLocationsInClient:Ljava/lang/Boolean;

.field useScoringForLocationFinder:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 279
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

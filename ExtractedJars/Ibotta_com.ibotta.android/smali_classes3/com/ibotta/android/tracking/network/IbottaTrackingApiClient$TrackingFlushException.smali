.class final Lcom/ibotta/android/tracking/network/IbottaTrackingApiClient$TrackingFlushException;
.super Ljava/lang/Exception;
.source "IbottaTrackingApiClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/tracking/network/IbottaTrackingApiClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "TrackingFlushException"
.end annotation


# direct methods
.method private constructor <init>(Ljava/lang/Exception;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Exception;Lcom/ibotta/android/tracking/network/IbottaTrackingApiClient$1;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/network/IbottaTrackingApiClient$TrackingFlushException;-><init>(Ljava/lang/Exception;)V

    return-void
.end method

.class public Lcom/ibotta/android/tracking/network/IbottaTrackingApiClient;
.super Ljava/lang/Object;
.source "IbottaTrackingApiClient.java"

# interfaces
.implements Lcom/ibotta/android/tracking/network/TrackingApiClient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/network/IbottaTrackingApiClient$TrackingFlushException;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/tracking/network/TrackingApiClient<",
        "Lcom/ibotta/tracking/generated/model/Body;",
        ">;"
    }
.end annotation


# instance fields
.field private final defaultApi:Lcom/ibotta/tracking/generated/api/DefaultApi;


# direct methods
.method public constructor <init>(Lcom/ibotta/tracking/generated/api/DefaultApi;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/tracking/network/IbottaTrackingApiClient;->defaultApi:Lcom/ibotta/tracking/generated/api/DefaultApi;

    return-void
.end method


# virtual methods
.method public sendTrackingEvents(Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 26
    :try_start_0
    iget-object v2, p0, Lcom/ibotta/android/tracking/network/IbottaTrackingApiClient;->defaultApi:Lcom/ibotta/tracking/generated/api/DefaultApi;

    invoke-virtual {v2, p1}, Lcom/ibotta/tracking/generated/api/DefaultApi;->eventsTrackPostWithHttpInfo(Ljava/util/List;)Lcom/ibotta/tracking/generated/invoker/ApiResponse;

    move-result-object v1
    :try_end_0
    .catch Lcom/ibotta/tracking/generated/invoker/ApiException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 28
    invoke-virtual {p1}, Lcom/ibotta/tracking/generated/invoker/ApiException;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {p1, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object v2

    new-instance v3, Lcom/ibotta/android/tracking/network/IbottaTrackingApiClient$TrackingFlushException;

    invoke-direct {v3, p1, v1}, Lcom/ibotta/android/tracking/network/IbottaTrackingApiClient$TrackingFlushException;-><init>(Ljava/lang/Exception;Lcom/ibotta/android/tracking/network/IbottaTrackingApiClient$1;)V

    invoke-interface {v2, v3}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V

    :goto_0
    if-eqz v1, :cond_0

    .line 32
    invoke-virtual {v1}, Lcom/ibotta/tracking/generated/invoker/ApiResponse;->getStatusCode()I

    move-result p1

    const/16 v1, 0xc8

    if-ne p1, v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

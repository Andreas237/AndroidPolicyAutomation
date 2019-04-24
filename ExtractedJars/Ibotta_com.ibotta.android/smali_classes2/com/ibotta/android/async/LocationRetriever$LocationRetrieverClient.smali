.class public interface abstract Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;
.super Ljava/lang/Object;
.source "LocationRetriever.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/async/LocationRetriever;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "LocationRetrieverClient"
.end annotation


# virtual methods
.method public abstract getApiCall()Lcom/ibotta/api/ApiCall;
.end method

.method public abstract getLocationIntervalWaitTime()J
.end method

.method public abstract getLocationWaitTime()J
.end method

.method public abstract getMaxLocationAge()J
.end method

.method public abstract makeApiCall()Lcom/ibotta/api/ApiCall;
.end method

.method public abstract onLocationReady(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V
.end method

.method public abstract setApiCall(Lcom/ibotta/api/ApiCall;)V
.end method

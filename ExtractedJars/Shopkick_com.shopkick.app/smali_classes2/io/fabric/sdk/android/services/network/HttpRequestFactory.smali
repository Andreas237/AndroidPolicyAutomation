.class public interface abstract Lio/fabric/sdk/android/services/network/HttpRequestFactory;
.super Ljava/lang/Object;
.source "HttpRequestFactory.java"


# virtual methods
.method public abstract buildHttpRequest(Lio/fabric/sdk/android/services/network/HttpMethod;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;
.end method

.method public abstract buildHttpRequest(Lio/fabric/sdk/android/services/network/HttpMethod;Ljava/lang/String;Ljava/util/Map;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/fabric/sdk/android/services/network/HttpMethod;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/fabric/sdk/android/services/network/HttpRequest;"
        }
    .end annotation
.end method

.method public abstract getPinningInfoProvider()Lio/fabric/sdk/android/services/network/PinningInfoProvider;
.end method

.method public abstract setPinningInfoProvider(Lio/fabric/sdk/android/services/network/PinningInfoProvider;)V
.end method

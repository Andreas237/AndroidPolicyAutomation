.class public Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;
.super Lcom/shopkick/app/fetchers/api/IAPIResponseObject;
.source "GetLoggingConfigsResponse.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public amplitudeLogConfig:Lcom/shopkick/app/fetchers/api/skapi/LogConfig;

.field public appboyLogConfig:Lcom/shopkick/app/fetchers/api/skapi/LogConfig;

.field public branchLogConfig:Lcom/shopkick/app/fetchers/api/skapi/LogConfig;

.field public common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIResponseObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;
    .locals 2

    .line 37
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;

    if-eqz p1, :cond_0

    .line 38
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;
    .locals 1

    .line 32
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;

    move-result-object p1

    return-object p1
.end method

.method public commonResponseData()Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    return-object v0
.end method

.method public postProcess()V
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->postProcess()V

    .line 49
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;->amplitudeLogConfig:Lcom/shopkick/app/fetchers/api/skapi/LogConfig;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/LogConfig;->postProcess()V

    .line 50
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;->appboyLogConfig:Lcom/shopkick/app/fetchers/api/skapi/LogConfig;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/LogConfig;->postProcess()V

    .line 51
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetLoggingConfigsResponse;->branchLogConfig:Lcom/shopkick/app/fetchers/api/skapi/LogConfig;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/LogConfig;->postProcess()V

    :cond_3
    return-void
.end method

.class public Lcom/ibotta/android/api/flags/FlagsCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "FlagsCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/EmptyResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private final flagsApi:Lcom/ibotta/android/features/FlagsApi;

.field private final flagsUserFactory:Lcom/ibotta/android/features/variant/FlagsUserFactory;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/features/FlagsApi;Lcom/ibotta/android/features/variant/FlagsUserFactory;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/api/flags/FlagsCall;->flagsApi:Lcom/ibotta/android/features/FlagsApi;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/api/flags/FlagsCall;->flagsUserFactory:Lcom/ibotta/android/features/variant/FlagsUserFactory;

    return-void
.end method


# virtual methods
.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 16
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/api/flags/FlagsCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 44
    new-instance p1, Lcom/ibotta/api/EmptyResponse;

    invoke-direct {p1}, Lcom/ibotta/api/EmptyResponse;-><init>()V

    return-object p1
.end method

.method public getApiExecution()Lcom/ibotta/api/execution/ApiExecution;
    .locals 3

    .line 49
    new-instance v0, Lcom/ibotta/android/api/flags/FlagsApiExecution;

    iget-object v1, p0, Lcom/ibotta/android/api/flags/FlagsCall;->flagsApi:Lcom/ibotta/android/features/FlagsApi;

    iget-object v2, p0, Lcom/ibotta/android/api/flags/FlagsCall;->flagsUserFactory:Lcom/ibotta/android/features/variant/FlagsUserFactory;

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/api/flags/FlagsApiExecution;-><init>(Lcom/ibotta/android/features/FlagsApi;Lcom/ibotta/android/features/variant/FlagsUserFactory;)V

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/EmptyResponse;",
            ">;"
        }
    .end annotation

    .line 27
    const-class v0, Lcom/ibotta/api/EmptyResponse;

    return-object v0
.end method

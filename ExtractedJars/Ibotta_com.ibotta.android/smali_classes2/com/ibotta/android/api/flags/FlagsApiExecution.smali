.class public Lcom/ibotta/android/api/flags/FlagsApiExecution;
.super Ljava/lang/Object;
.source "FlagsApiExecution.java"

# interfaces
.implements Lcom/ibotta/api/execution/ApiExecution;


# instance fields
.field private final flagsApi:Lcom/ibotta/android/features/FlagsApi;

.field private final flagsUserFactory:Lcom/ibotta/android/features/variant/FlagsUserFactory;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/features/FlagsApi;Lcom/ibotta/android/features/variant/FlagsUserFactory;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/api/flags/FlagsApiExecution;->flagsApi:Lcom/ibotta/android/features/FlagsApi;

    .line 17
    iput-object p2, p0, Lcom/ibotta/android/api/flags/FlagsApiExecution;->flagsUserFactory:Lcom/ibotta/android/features/variant/FlagsUserFactory;

    return-void
.end method


# virtual methods
.method public abort()V
    .locals 0

    return-void
.end method

.method public executeApiCall(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/api/ApiResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 23
    :try_start_0
    iget-object p1, p0, Lcom/ibotta/android/api/flags/FlagsApiExecution;->flagsApi:Lcom/ibotta/android/features/FlagsApi;

    iget-object v0, p0, Lcom/ibotta/android/api/flags/FlagsApiExecution;->flagsUserFactory:Lcom/ibotta/android/features/variant/FlagsUserFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/features/variant/FlagsUserFactory;->create()Lcom/ibotta/android/features/FlagsUser;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/features/FlagsApi;->initUser(Lcom/ibotta/android/features/FlagsUser;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 28
    :goto_0
    new-instance p1, Lcom/ibotta/api/EmptyResponse;

    invoke-direct {p1}, Lcom/ibotta/api/EmptyResponse;-><init>()V

    return-object p1
.end method

.method public getEndpoint(Lcom/ibotta/api/ApiCall;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public isAborted()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

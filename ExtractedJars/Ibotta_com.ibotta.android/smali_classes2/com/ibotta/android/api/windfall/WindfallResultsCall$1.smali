.class Lcom/ibotta/android/api/windfall/WindfallResultsCall$1;
.super Ljava/lang/Object;
.source "WindfallResultsCall.java"

# interfaces
.implements Lcom/ibotta/api/execution/ApiExecution;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/api/windfall/WindfallResultsCall;->getApiExecution()Lcom/ibotta/api/execution/ApiExecution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/api/windfall/WindfallResultsCall;


# direct methods
.method constructor <init>(Lcom/ibotta/android/api/windfall/WindfallResultsCall;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/ibotta/android/api/windfall/WindfallResultsCall$1;->this$0:Lcom/ibotta/android/api/windfall/WindfallResultsCall;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

    .line 67
    new-instance p1, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;

    invoke-direct {p1}, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;-><init>()V

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/api/windfall/WindfallResultsCall$1;->this$0:Lcom/ibotta/android/api/windfall/WindfallResultsCall;

    invoke-static {v0}, Lcom/ibotta/android/api/windfall/WindfallResultsCall;->access$000(Lcom/ibotta/android/api/windfall/WindfallResultsCall;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;->setWindfallResultsJson(Ljava/lang/String;)V

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

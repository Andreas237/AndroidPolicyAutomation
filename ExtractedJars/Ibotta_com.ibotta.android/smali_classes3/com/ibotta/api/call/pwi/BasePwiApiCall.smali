.class public abstract Lcom/ibotta/api/call/pwi/BasePwiApiCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "BasePwiApiCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/ibotta/api/ApiResponse;",
        ">",
        "Lcom/ibotta/api/BaseApiCall<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    return-void
.end method


# virtual methods
.method public buildApiExecution()V
    .locals 1

    .line 10
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getApiExecutionFactory()Lcom/ibotta/api/execution/ApiExecutionFactory;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/execution/ApiExecutionFactory;->newIbottaPwiInstance()Lcom/ibotta/api/execution/ApiExecution;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/call/pwi/BasePwiApiCall;->apiExecution:Lcom/ibotta/api/execution/ApiExecution;

    return-void
.end method

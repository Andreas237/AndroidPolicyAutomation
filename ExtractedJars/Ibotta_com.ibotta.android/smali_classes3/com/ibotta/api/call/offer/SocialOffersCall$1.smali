.class Lcom/ibotta/api/call/offer/SocialOffersCall$1;
.super Ljava/lang/Object;
.source "SocialOffersCall.java"

# interfaces
.implements Lcom/ibotta/api/execution/ApiExecution;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/api/call/offer/SocialOffersCall;->getApiExecution()Lcom/ibotta/api/execution/ApiExecution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/api/call/offer/SocialOffersCall;


# direct methods
.method constructor <init>(Lcom/ibotta/api/call/offer/SocialOffersCall;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/ibotta/api/call/offer/SocialOffersCall$1;->this$0:Lcom/ibotta/api/call/offer/SocialOffersCall;

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

    .line 56
    new-instance p1, Lcom/ibotta/api/ApiException;

    const-string v0, "DO NOT INVOKE THIS API CALL. This is a no-op call, and only exists to provide symmetry for the cache layer. All social offers retrieved independently can be cleared from cache using this class."

    invoke-direct {p1, v0}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;)V

    throw p1
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

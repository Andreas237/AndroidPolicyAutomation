.class public Lcom/shopkick/fetchers/AsyncRequestDetails;
.super Ljava/lang/Object;
.source "AsyncRequestDetails.java"

# interfaces
.implements Lcom/shopkick/fetchers/RequestDetails;


# instance fields
.field private final networkWork:Lnet/toddm/comm/SubmittableWork;


# direct methods
.method public constructor <init>(Lnet/toddm/comm/SubmittableWork;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/shopkick/fetchers/AsyncRequestDetails;->networkWork:Lnet/toddm/comm/SubmittableWork;

    return-void
.end method


# virtual methods
.method public getDataResponse()Lcom/shopkick/fetchers/DataResponse;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getRequestWork()Lnet/toddm/comm/SubmittableWork;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/shopkick/fetchers/AsyncRequestDetails;->networkWork:Lnet/toddm/comm/SubmittableWork;

    return-object v0
.end method

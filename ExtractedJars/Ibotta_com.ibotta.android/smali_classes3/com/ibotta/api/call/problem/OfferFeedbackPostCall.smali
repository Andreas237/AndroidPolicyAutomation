.class public Lcom/ibotta/api/call/problem/OfferFeedbackPostCall;
.super Lcom/ibotta/api/call/problem/ProblemsPostCall;
.source "OfferFeedbackPostCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/problem/OfferFeedbackPostCall$CallParams;
    }
.end annotation


# instance fields
.field private callParams:Lcom/ibotta/api/call/problem/OfferFeedbackPostCall$CallParams;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/problem/OfferFeedbackPostCall$CallParams;)V
    .locals 1

    .line 10
    invoke-direct {p0, p1}, Lcom/ibotta/api/call/problem/ProblemsPostCall;-><init>(Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;)V

    const/4 v0, 0x1

    .line 11
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/problem/OfferFeedbackPostCall;->setRequiresAuthToken(Z)V

    .line 12
    iput-object p1, p0, Lcom/ibotta/api/call/problem/OfferFeedbackPostCall;->callParams:Lcom/ibotta/api/call/problem/OfferFeedbackPostCall$CallParams;

    return-void
.end method


# virtual methods
.method public buildParams()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 17
    invoke-super {p0}, Lcom/ibotta/api/call/problem/ProblemsPostCall;->buildParams()V

    .line 19
    iget-object v0, p0, Lcom/ibotta/api/call/problem/OfferFeedbackPostCall;->params:Ljava/util/Map;

    const-string v1, "problem_report[feedback_option_id]"

    iget-object v2, p0, Lcom/ibotta/api/call/problem/OfferFeedbackPostCall;->callParams:Lcom/ibotta/api/call/problem/OfferFeedbackPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/problem/OfferFeedbackPostCall$CallParams;->getFeedbackOptionId()Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

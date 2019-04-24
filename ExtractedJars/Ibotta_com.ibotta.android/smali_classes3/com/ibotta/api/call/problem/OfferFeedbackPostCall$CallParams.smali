.class public Lcom/ibotta/api/call/problem/OfferFeedbackPostCall$CallParams;
.super Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;
.source "OfferFeedbackPostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/problem/OfferFeedbackPostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private feedbackOptionId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;-><init>()V

    const-string v0, "Offer"

    .line 27
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/problem/OfferFeedbackPostCall$CallParams;->setItemType(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getFeedbackOptionId()Ljava/lang/Integer;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/ibotta/api/call/problem/OfferFeedbackPostCall$CallParams;->feedbackOptionId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getItemType()Ljava/lang/String;
    .locals 1

    const-string v0, "Offer"

    return-object v0
.end method

.method public getOfferId()J
    .locals 2

    .line 31
    invoke-super {p0}, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->getItemId()J

    move-result-wide v0

    return-wide v0
.end method

.method public setFeedbackOptionId(Ljava/lang/Integer;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/ibotta/api/call/problem/OfferFeedbackPostCall$CallParams;->feedbackOptionId:Ljava/lang/Integer;

    return-void
.end method

.method public setItemType(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public setOfferId(J)V
    .locals 0

    .line 35
    invoke-super {p0, p1, p2}, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->setItemId(J)V

    return-void
.end method

.class public Lcom/ibotta/api/model/offer/Suggestion;
.super Ljava/lang/Object;
.source "Suggestion.java"


# instance fields
.field private campaignId:I

.field private id:I

.field private score:F

.field private term:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCampaignId()I
    .locals 1

    .line 37
    iget v0, p0, Lcom/ibotta/api/model/offer/Suggestion;->campaignId:I

    return v0
.end method

.method public getId()I
    .locals 1

    .line 13
    iget v0, p0, Lcom/ibotta/api/model/offer/Suggestion;->id:I

    return v0
.end method

.method public getScore()F
    .locals 1

    .line 29
    iget v0, p0, Lcom/ibotta/api/model/offer/Suggestion;->score:F

    return v0
.end method

.method public getTerm()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Suggestion;->term:Ljava/lang/String;

    return-object v0
.end method

.method public setCampaignId(I)V
    .locals 0

    .line 41
    iput p1, p0, Lcom/ibotta/api/model/offer/Suggestion;->campaignId:I

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 17
    iput p1, p0, Lcom/ibotta/api/model/offer/Suggestion;->id:I

    return-void
.end method

.method public setScore(F)V
    .locals 0

    .line 33
    iput p1, p0, Lcom/ibotta/api/model/offer/Suggestion;->score:F

    return-void
.end method

.method public setTerm(Ljava/lang/String;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Suggestion;->term:Ljava/lang/String;

    return-void
.end method

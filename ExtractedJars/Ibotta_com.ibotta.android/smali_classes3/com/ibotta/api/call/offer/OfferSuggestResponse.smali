.class public Lcom/ibotta/api/call/offer/OfferSuggestResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "OfferSuggestResponse.java"


# instance fields
.field private suggestions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Suggestion;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/offer/OfferSuggestResponse;->suggestions:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getSuggestions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Suggestion;",
            ">;"
        }
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/ibotta/api/call/offer/OfferSuggestResponse;->suggestions:Ljava/util/List;

    return-object v0
.end method

.method public setSuggestions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Suggestion;",
            ">;)V"
        }
    .end annotation

    .line 17
    iput-object p1, p0, Lcom/ibotta/api/call/offer/OfferSuggestResponse;->suggestions:Ljava/util/List;

    return-void
.end method

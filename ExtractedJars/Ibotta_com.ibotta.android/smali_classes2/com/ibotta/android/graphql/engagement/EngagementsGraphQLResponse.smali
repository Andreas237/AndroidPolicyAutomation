.class public Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "EngagementsGraphQLResponse.java"


# instance fields
.field private engagements:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/EngagementContent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getEngagements()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/EngagementContent;",
            ">;"
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLResponse;->engagements:Ljava/util/List;

    return-object v0
.end method

.method public setEngagements(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/EngagementContent;",
            ">;)V"
        }
    .end annotation

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLResponse;->engagements:Ljava/util/List;

    return-void
.end method

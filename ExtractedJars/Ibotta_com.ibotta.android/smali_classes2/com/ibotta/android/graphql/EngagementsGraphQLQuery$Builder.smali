.class public final Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Builder;
.super Ljava/lang/Object;
.source "EngagementsGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/EngagementsGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private rewardIds:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Builder;->rewardIds:Lcom/apollographql/apollo/api/Input;

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/EngagementsGraphQLQuery;
    .locals 2

    .line 115
    new-instance v0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery;

    iget-object v1, p0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Builder;->rewardIds:Lcom/apollographql/apollo/api/Input;

    invoke-direct {v0, v1}, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery;-><init>(Lcom/apollographql/apollo/api/Input;)V

    return-object v0
.end method

.method public rewardIds(Ljava/util/List;)Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Builder;"
        }
    .end annotation

    .line 105
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Builder;->rewardIds:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public rewardIdsInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Builder;
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;)",
            "Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "rewardIds == null"

    .line 110
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/EngagementsGraphQLQuery$Builder;->rewardIds:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

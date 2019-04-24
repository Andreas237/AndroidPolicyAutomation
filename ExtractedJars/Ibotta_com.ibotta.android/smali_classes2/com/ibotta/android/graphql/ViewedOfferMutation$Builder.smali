.class public final Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;
.super Ljava/lang/Object;
.source "ViewedOfferMutation.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/ViewedOfferMutation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private includeAvailableRetailers:Z

.field private limit:J

.field private limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field private offerGroupId:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private offerId:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private products:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->offerId:Lcom/apollographql/apollo/api/Input;

    .line 113
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->offerGroupId:Lcom/apollographql/apollo/api/Input;

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/ViewedOfferMutation;
    .locals 10

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;

    const-string v1, "limitStrategy == null"

    invoke-static {v0, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    new-instance v0, Lcom/ibotta/android/graphql/ViewedOfferMutation;

    iget-object v3, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->offerId:Lcom/apollographql/apollo/api/Input;

    iget-object v4, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->offerGroupId:Lcom/apollographql/apollo/api/Input;

    iget-wide v5, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->limit:J

    iget-object v7, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;

    iget-boolean v8, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->products:Z

    iget-boolean v9, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->includeAvailableRetailers:Z

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Lcom/ibotta/android/graphql/ViewedOfferMutation;-><init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;JLcom/ibotta/android/graphql/type/LimitStrategy;ZZ)V

    return-object v0
.end method

.method public includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;
    .locals 0

    .line 152
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->includeAvailableRetailers:Z

    return-object p0
.end method

.method public limit(J)Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;
    .locals 0

    .line 137
    iput-wide p1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->limit:J

    return-object p0
.end method

.method public limitStrategy(Lcom/ibotta/android/graphql/type/LimitStrategy;)Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;
    .locals 0
    .param p1    # Lcom/ibotta/android/graphql/type/LimitStrategy;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 142
    iput-object p1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->limitStrategy:Lcom/ibotta/android/graphql/type/LimitStrategy;

    return-object p0
.end method

.method public offerGroupId(Ljava/lang/String;)Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 132
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->offerGroupId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public offerGroupIdInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;"
        }
    .end annotation

    const-string v0, "offerGroupId == null"

    .line 162
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->offerGroupId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public offerId(Ljava/lang/String;)Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 127
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->offerId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public offerIdInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;"
        }
    .end annotation

    const-string v0, "offerId == null"

    .line 157
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->offerId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public products(Z)Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;
    .locals 0

    .line 147
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/ViewedOfferMutation$Builder;->products:Z

    return-object p0
.end method

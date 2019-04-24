.class public Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "ModulesGraphQLResponse.java"

# interfaces
.implements Lcom/ibotta/android/api/ResponseOfferContainer;


# instance fields
.field private modules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/BaseModule;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getContainerOffers()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;->modules:Ljava/util/List;

    if-nez v0, :cond_0

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 34
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 35
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;->modules:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/base/BaseModule;

    if-eqz v2, :cond_1

    .line 36
    invoke-virtual {v2}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_0

    .line 40
    :cond_2
    invoke-virtual {v2}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/model/base/BaseContent;

    .line 41
    instance-of v4, v3, Lcom/ibotta/api/model/content/OfferContent;

    if-eqz v4, :cond_3

    .line 42
    check-cast v3, Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    return-object v0
.end method

.method public getModules()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/BaseModule;",
            ">;"
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;->modules:Ljava/util/List;

    return-object v0
.end method

.method public removeContainerOffer(Lcom/ibotta/api/model/OfferModel;)V
    .locals 3

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;->modules:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    .line 56
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/base/BaseModule;

    if-eqz v1, :cond_1

    .line 57
    invoke-virtual {v1}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 58
    invoke-virtual {v1}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-void
.end method

.method public setModules(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/BaseModule;",
            ">;)V"
        }
    .end annotation

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;->modules:Ljava/util/List;

    return-void
.end method

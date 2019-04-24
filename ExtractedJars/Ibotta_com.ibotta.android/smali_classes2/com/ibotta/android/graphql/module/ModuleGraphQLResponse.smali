.class public Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "ModuleGraphQLResponse.java"

# interfaces
.implements Lcom/ibotta/android/api/ResponseOfferContainer;


# instance fields
.field private module:Lcom/ibotta/api/model/base/BaseModule;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getContainerOffers()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;->module:Lcom/ibotta/api/model/base/BaseModule;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 36
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;->module:Lcom/ibotta/api/model/base/BaseModule;

    invoke-virtual {v1}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/base/BaseContent;

    .line 38
    instance-of v3, v2, Lcom/ibotta/api/model/content/OfferContent;

    if-eqz v3, :cond_1

    .line 39
    check-cast v2, Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0

    .line 33
    :cond_3
    :goto_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public getModule()Lcom/ibotta/api/model/base/BaseModule;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;->module:Lcom/ibotta/api/model/base/BaseModule;

    return-object v0
.end method

.method public removeContainerOffer(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;->module:Lcom/ibotta/api/model/base/BaseModule;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;->module:Lcom/ibotta/api/model/base/BaseModule;

    invoke-virtual {v0}, Lcom/ibotta/api/model/base/BaseModule;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public setModule(Lcom/ibotta/api/model/base/BaseModule;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;->module:Lcom/ibotta/api/model/base/BaseModule;

    return-void
.end method

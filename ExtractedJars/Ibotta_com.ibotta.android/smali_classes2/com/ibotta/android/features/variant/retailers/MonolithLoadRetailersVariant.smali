.class public Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant;
.super Ljava/lang/Object;
.source "MonolithLoadRetailersVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/ControlVariant;
.implements Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;


# instance fields
.field private apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant;)V

    return-void
.end method


# virtual methods
.method public getRetailerModels(Lcom/ibotta/api/ApiResponse;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/ApiResponse;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 46
    instance-of v0, p1, Lcom/ibotta/api/call/home/HomeResponse;

    if-nez v0, :cond_0

    .line 47
    invoke-static {}, Ljava9/util/Lists;->of()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 50
    :cond_0
    check-cast p1, Lcom/ibotta/api/call/home/HomeResponse;

    invoke-virtual {p1}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getRetailersApiJob(Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 1

    .line 41
    iget-object p1, p0, Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createHomeApiJob(I)Lcom/ibotta/android/service/api/job/HomeApiJob;

    move-result-object p1

    return-object p1
.end method

.method init(Lcom/ibotta/android/service/api/job/ApiJobFactory;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    return-void
.end method

.method public isGraphQlVariant()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isRetailersApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)Z
    .locals 0

    .line 55
    instance-of p1, p1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    return p1
.end method

.class final Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;
.super Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;
.source "AutoValue_EngagementPresenterData.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData$Builder;
    }
.end annotation


# instance fields
.field private final instantTasks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/TaskModel;",
            ">;"
        }
    .end annotation
.end field

.field private final offerModel:Lcom/ibotta/api/model/OfferModel;

.field private final retailerModel:Lcom/ibotta/api/model/RetailerModel;

.field private final standardTasks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/TaskModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/OfferModel;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/RetailerModel;",
            "Lcom/ibotta/api/model/OfferModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/TaskModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/TaskModel;",
            ">;)V"
        }
    .end annotation

    .line 24
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 26
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->offerModel:Lcom/ibotta/api/model/OfferModel;

    .line 27
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->standardTasks:Ljava/util/List;

    .line 28
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->instantTasks:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/OfferModel;Ljava/util/List;Ljava/util/List;Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData$1;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;-><init>(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/OfferModel;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 67
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 68
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    .line 69
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->offerModel:Lcom/ibotta/api/model/OfferModel;

    .line 70
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->standardTasks:Ljava/util/List;

    .line 71
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getStandardTasks()Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->instantTasks:Ljava/util/List;

    .line 72
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getInstantTasks()Ljava/util/List;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0

    :cond_3
    return v2
.end method

.method public getInstantTasks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/TaskModel;",
            ">;"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->instantTasks:Ljava/util/List;

    return-object v0
.end method

.method public getOfferModel()Lcom/ibotta/api/model/OfferModel;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->offerModel:Lcom/ibotta/api/model/OfferModel;

    return-object v0
.end method

.method public getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-object v0
.end method

.method public getStandardTasks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/TaskModel;",
            ">;"
        }
    .end annotation

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->standardTasks:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 83
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 85
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->standardTasks:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 87
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->instantTasks:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EngagementPresenterData{retailerModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offerModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", standardTasks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->standardTasks:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", instantTasks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;->instantTasks:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

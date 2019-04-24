.class final Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData$Builder;
.super Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;
.source "AutoValue_EngagementPresenterData.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private instantTasks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/TaskModel;",
            ">;"
        }
    .end annotation
.end field

.field private offerModel:Lcom/ibotta/api/model/OfferModel;

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;

.field private standardTasks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/TaskModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .line 96
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;
    .locals 8

    const-string v0, ""

    .line 130
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData$Builder;->offerModel:Lcom/ibotta/api/model/OfferModel;

    if-nez v1, :cond_0

    .line 131
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " offerModel"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 133
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData$Builder;->standardTasks:Ljava/util/List;

    if-nez v1, :cond_1

    .line 134
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " standardTasks"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 136
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData$Builder;->instantTasks:Ljava/util/List;

    if-nez v1, :cond_2

    .line 137
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " instantTasks"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 139
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 142
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData$Builder;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData$Builder;->offerModel:Lcom/ibotta/api/model/OfferModel;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData$Builder;->standardTasks:Ljava/util/List;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData$Builder;->instantTasks:Ljava/util/List;

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData;-><init>(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/OfferModel;Ljava/util/List;Ljava/util/List;Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData$1;)V

    return-object v0

    .line 140
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public instantTasks(Ljava/util/List;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/TaskModel;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 124
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData$Builder;->instantTasks:Ljava/util/List;

    return-object p0

    .line 122
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null instantTasks"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public offerModel(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 108
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData$Builder;->offerModel:Lcom/ibotta/api/model/OfferModel;

    return-object p0

    .line 106
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null offerModel"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public retailerModel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;
    .locals 0
    .param p1    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 100
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData$Builder;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-object p0
.end method

.method public standardTasks(Ljava/util/List;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/TaskModel;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 116
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData$Builder;->standardTasks:Ljava/util/List;

    return-object p0

    .line 114
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null standardTasks"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

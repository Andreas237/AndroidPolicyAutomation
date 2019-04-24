.class public abstract Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;
.super Ljava/lang/Object;
.source "EngagementPresenterData.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;
.end method

.method public abstract instantTasks(Ljava/util/List;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/TaskModel;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;"
        }
    .end annotation
.end method

.method public abstract offerModel(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;
.end method

.method public abstract retailerModel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;
    .param p1    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract standardTasks(Ljava/util/List;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/TaskModel;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;"
        }
    .end annotation
.end method

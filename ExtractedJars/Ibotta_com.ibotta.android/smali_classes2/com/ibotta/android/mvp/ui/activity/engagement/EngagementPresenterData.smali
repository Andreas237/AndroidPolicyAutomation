.class public abstract Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;
.super Ljava/lang/Object;
.source "EngagementPresenterData.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;
    }
.end annotation


# static fields
.field public static final EMPTY:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 17
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->builder()Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;

    move-result-object v0

    new-instance v1, Lcom/ibotta/api/model/content/OfferContent;

    invoke-direct {v1}, Lcom/ibotta/api/model/content/OfferContent;-><init>()V

    .line 18
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;->offerModel(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;->retailerModel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;

    move-result-object v0

    .line 20
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;->standardTasks(Ljava/util/List;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;

    move-result-object v0

    .line 21
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;->instantTasks(Ljava/util/List;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;

    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;
    .locals 1

    .line 25
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/AutoValue_EngagementPresenterData$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public getAllTasks()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/TaskModel;",
            ">;"
        }
    .end annotation

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getStandardTasks()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getInstantTasks()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public abstract getInstantTasks()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/TaskModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getOfferModel()Lcom/ibotta/api/model/OfferModel;
.end method

.method public abstract getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getStandardTasks()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/TaskModel;",
            ">;"
        }
    .end annotation
.end method

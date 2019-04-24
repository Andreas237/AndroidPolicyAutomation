.class public Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;
.super Ljava/lang/Object;
.source "OfferAnomalyDetector.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;
    }
.end annotation


# instance fields
.field private asyncTask:Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;

.field private gallerySections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/GallerySection;",
            ">;"
        }
    .end annotation
.end field

.field private retailerId:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;)Ljava/util/List;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;->gallerySections:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;Ljava/util/Set;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;->onSearchFinished(Ljava/util/Set;)V

    return-void
.end method

.method static synthetic access$300(Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;)I
    .locals 0

    .line 31
    iget p0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;->retailerId:I

    return p0
.end method

.method private onSearchFinished(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 59
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string p1, "No Offer anomalies found."

    .line 60
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 64
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Offers detected in the Gallery that are not associated with the Retailer: retailerId: "

    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;->retailerId:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\n\nofferIds: "

    .line 67
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 70
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 71
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 72
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, ", "

    .line 75
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 79
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    sget-object p1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyException;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public start(ILjava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/GallerySection;",
            ">;)V"
        }
    .end annotation

    .line 37
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;->stop()V

    if-eqz p2, :cond_2

    .line 39
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "Start: retailerId=%1$d, # of Gallery sections to check=%2$d"

    const/4 v1, 0x2

    .line 43
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;->retailerId:I

    .line 46
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;->gallerySections:Ljava/util/List;

    .line 48
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;-><init>(Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$1;)V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;->asyncTask:Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;

    .line 49
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;->asyncTask:Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;

    new-array p2, v3, [Ljava/lang/Void;

    instance-of v0, p1, Landroid/os/AsyncTask;

    if-nez v0, :cond_1

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_1
    check-cast p1, Landroid/os/AsyncTask;

    invoke-static {p1, p2}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method public stop()V
    .locals 2

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;->asyncTask:Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 54
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;->cancel(Z)Z

    :cond_0
    return-void
.end method

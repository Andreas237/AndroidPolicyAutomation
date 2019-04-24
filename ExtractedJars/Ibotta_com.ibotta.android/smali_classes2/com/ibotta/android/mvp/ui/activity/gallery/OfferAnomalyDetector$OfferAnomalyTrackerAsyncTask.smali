.class Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;
.super Landroid/os/AsyncTask;
.source "OfferAnomalyDetector.java"

# interfaces
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "OfferAnomalyTrackerAsyncTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/util/Set<",
        "Ljava/lang/Integer;",
        ">;>;"
    }
.end annotation


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;->this$0:Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$1;)V
    .locals 0

    .line 83
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;-><init>(Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;)V

    return-void
.end method

.method static synthetic lambda$doInBackground$0(Lcom/ibotta/android/view/model/GallerySection;)V
    .locals 4

    const-string v0, "Checking Gallery section: name=%1$s, offer count=%2$d"

    const/4 v1, 0x2

    .line 87
    new-array v1, v1, [Ljava/lang/Object;

    .line 89
    invoke-virtual {p0}, Lcom/ibotta/android/view/model/GallerySection;->getOfferCategoryModel()Lcom/ibotta/api/model/OfferCategoryModel;

    move-result-object v2

    invoke-interface {v2}, Lcom/ibotta/api/model/OfferCategoryModel;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 90
    invoke-virtual {p0}, Lcom/ibotta/android/view/model/GallerySection;->getContentModels()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v2, 0x1

    aput-object p0, v1, v2

    .line 87
    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic lambda$doInBackground$1(Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;Lcom/ibotta/api/model/OfferModel;)Z
    .locals 1

    .line 96
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getRetailers()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getRetailers()Ljava/util/Set;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;->this$0:Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;->access$300(Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public _nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 0

    :try_start_0
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask#doInBackground"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask#doInBackground"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    :goto_0
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;->doInBackground([Ljava/lang/Void;)Ljava/util/Set;

    move-result-object p1

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->unloadTraceContext(Ljava/lang/Object;)V

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Void;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 86
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;->this$0:Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;->access$100(Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask$SWv2s_r3lkukabHo3pcFL3LYJLI;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask$SWv2s_r3lkukabHo3pcFL3LYJLI;

    .line 87
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->peek(Ljava9/util/function/Consumer;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$Ve1qwqJFSz9GE0ai-7v3xCEelvA;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$Ve1qwqJFSz9GE0ai-7v3xCEelvA;

    .line 91
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$lnpN99Q7KybQyzGDZRSLPMAPS4c;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$lnpN99Q7KybQyzGDZRSLPMAPS4c;

    .line 92
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->flatMap(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    const-class v0, Lcom/ibotta/api/model/OfferModel;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$nYZv83cll07Tbe7gx7zUhqAUC2w;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$nYZv83cll07Tbe7gx7zUhqAUC2w;-><init>(Ljava/lang/Class;)V

    .line 93
    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    const-class v0, Lcom/ibotta/api/model/OfferModel;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$elHEw8NfYf6GuXpfd9TiSXebkqw;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$elHEw8NfYf6GuXpfd9TiSXebkqw;-><init>(Ljava/lang/Class;)V

    .line 94
    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask$eFkBAVUC7b-0q9D4iEwMwvohAxA;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask$eFkBAVUC7b-0q9D4iEwMwvohAxA;-><init>(Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;)V

    .line 95
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$b2jwgv6nD3iFiLkl5RSLYPohNmY;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$b2jwgv6nD3iFiLkl5RSLYPohNmY;

    .line 97
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 98
    invoke-static {}, Ljava9/util/stream/Collectors;->toSet()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask#onPostExecute"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask#onPostExecute"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    :goto_0
    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;->onPostExecute(Ljava/util/Set;)V

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method protected onPostExecute(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 103
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;->this$0:Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;

    invoke-static {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;->access$200(Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;Ljava/util/Set;)V

    return-void
.end method

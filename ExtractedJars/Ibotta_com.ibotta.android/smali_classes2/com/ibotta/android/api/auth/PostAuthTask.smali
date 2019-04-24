.class public Lcom/ibotta/android/api/auth/PostAuthTask;
.super Ljava/lang/Object;
.source "PostAuthTask.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final criticalDependency:Lcom/ibotta/android/api/critical/CriticalDependency;


# direct methods
.method constructor <init>(Lcom/ibotta/android/api/critical/CriticalDependency;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/api/auth/PostAuthTask;->criticalDependency:Lcom/ibotta/android/api/critical/CriticalDependency;

    return-void
.end method

.method static synthetic lambda$run$0(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 2

    .line 27
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->call()Lcom/ibotta/android/service/api/job/SingleApiJob;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string v0, "Failed to execute post auth task API call"

    const/4 v1, 0x0

    .line 30
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/api/auth/PostAuthTask;->criticalDependency:Lcom/ibotta/android/api/critical/CriticalDependency;

    invoke-interface {v0}, Lcom/ibotta/android/api/critical/CriticalDependency;->getApiJobs()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/api/auth/-$$Lambda$PostAuthTask$BTCMRfFC6r1OwcHQmoSTL42eGvs;->INSTANCE:Lcom/ibotta/android/api/auth/-$$Lambda$PostAuthTask$BTCMRfFC6r1OwcHQmoSTL42eGvs;

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->forEach(Ljava9/util/function/Consumer;)V

    return-void
.end method

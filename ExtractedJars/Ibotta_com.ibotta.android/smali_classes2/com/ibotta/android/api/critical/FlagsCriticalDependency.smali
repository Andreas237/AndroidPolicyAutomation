.class public Lcom/ibotta/android/api/critical/FlagsCriticalDependency;
.super Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;
.source "FlagsCriticalDependency.java"


# instance fields
.field private final flagsApi:Lcom/ibotta/android/features/FlagsApi;

.field private final flagsUserFactory:Lcom/ibotta/android/features/variant/FlagsUserFactory;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/features/FlagsApi;Lcom/ibotta/android/features/variant/FlagsUserFactory;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/api/critical/FrontDoorMonitoringCriticalDependency;-><init>(Lcom/ibotta/android/appcache/AppCache;)V

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/api/critical/FlagsCriticalDependency;->flagsApi:Lcom/ibotta/android/features/FlagsApi;

    .line 25
    iput-object p3, p0, Lcom/ibotta/android/api/critical/FlagsCriticalDependency;->flagsUserFactory:Lcom/ibotta/android/features/variant/FlagsUserFactory;

    return-void
.end method


# virtual methods
.method public getApiJobs()Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            ">;"
        }
    .end annotation

    .line 30
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 32
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/android/api/flags/FlagsCall;

    iget-object v3, p0, Lcom/ibotta/android/api/critical/FlagsCriticalDependency;->flagsApi:Lcom/ibotta/android/features/FlagsApi;

    iget-object v4, p0, Lcom/ibotta/android/api/critical/FlagsCriticalDependency;->flagsUserFactory:Lcom/ibotta/android/features/variant/FlagsUserFactory;

    invoke-direct {v2, v3, v4}, Lcom/ibotta/android/api/flags/FlagsCall;-><init>(Lcom/ibotta/android/features/FlagsApi;Lcom/ibotta/android/features/variant/FlagsUserFactory;)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.class public final Lcom/ibotta/android/service/work/ScheduledWorkService_MembersInjector;
.super Ljava/lang/Object;
.source "ScheduledWorkService_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/service/work/ScheduledWorkService;",
        ">;"
    }
.end annotation


# instance fields
.field private final scheduledWorkersProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/work/ScheduledWorker;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/work/ScheduledWorker;",
            ">;>;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/service/work/ScheduledWorkService_MembersInjector;->scheduledWorkersProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/work/ScheduledWorker;",
            ">;>;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/service/work/ScheduledWorkService;",
            ">;"
        }
    .end annotation

    .line 23
    new-instance v0, Lcom/ibotta/android/service/work/ScheduledWorkService_MembersInjector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/service/work/ScheduledWorkService_MembersInjector;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectScheduledWorkers(Lcom/ibotta/android/service/work/ScheduledWorkService;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/work/ScheduledWorkService;",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/work/ScheduledWorker;",
            ">;)V"
        }
    .end annotation

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/service/work/ScheduledWorkService;->scheduledWorkers:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/service/work/ScheduledWorkService;)V
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/service/work/ScheduledWorkService_MembersInjector;->scheduledWorkersProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-static {p1, v0}, Lcom/ibotta/android/service/work/ScheduledWorkService_MembersInjector;->injectScheduledWorkers(Lcom/ibotta/android/service/work/ScheduledWorkService;Ljava/util/Set;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/android/service/work/ScheduledWorkService;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/work/ScheduledWorkService_MembersInjector;->injectMembers(Lcom/ibotta/android/service/work/ScheduledWorkService;)V

    return-void
.end method

.class public final Lcom/ibotta/android/service/api/InForegroundApiWorkService_MembersInjector;
.super Ljava/lang/Object;
.source "InForegroundApiWorkService_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/service/api/InForegroundApiWorkService;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiWorkExecutorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkExecutor;",
            ">;"
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
            "Lcom/ibotta/android/service/api/ApiWorkExecutor;",
            ">;)V"
        }
    .end annotation

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/service/api/InForegroundApiWorkService_MembersInjector;->apiWorkExecutorProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkExecutor;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/service/api/InForegroundApiWorkService;",
            ">;"
        }
    .end annotation

    .line 22
    new-instance v0, Lcom/ibotta/android/service/api/InForegroundApiWorkService_MembersInjector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/service/api/InForegroundApiWorkService_MembersInjector;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectApiWorkExecutor(Lcom/ibotta/android/service/api/InForegroundApiWorkService;Lcom/ibotta/android/service/api/ApiWorkExecutor;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/service/api/InForegroundApiWorkService;->apiWorkExecutor:Lcom/ibotta/android/service/api/ApiWorkExecutor;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/service/api/InForegroundApiWorkService;)V
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/service/api/InForegroundApiWorkService_MembersInjector;->apiWorkExecutorProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/ApiWorkExecutor;

    invoke-static {p1, v0}, Lcom/ibotta/android/service/api/InForegroundApiWorkService_MembersInjector;->injectApiWorkExecutor(Lcom/ibotta/android/service/api/InForegroundApiWorkService;Lcom/ibotta/android/service/api/ApiWorkExecutor;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 7
    check-cast p1, Lcom/ibotta/android/service/api/InForegroundApiWorkService;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/InForegroundApiWorkService_MembersInjector;->injectMembers(Lcom/ibotta/android/service/api/InForegroundApiWorkService;)V

    return-void
.end method

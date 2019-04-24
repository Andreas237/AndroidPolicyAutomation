.class public abstract Lcom/twitter/sdk/android/core/internal/SessionProvider;
.super Ljava/lang/Object;
.source "SessionProvider.java"


# instance fields
.field private final sessionManagers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/twitter/sdk/android/core/SessionManager<",
            "+",
            "Lcom/twitter/sdk/android/core/Session;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/twitter/sdk/android/core/SessionManager<",
            "+",
            "Lcom/twitter/sdk/android/core/Session;",
            ">;>;)V"
        }
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/SessionProvider;->sessionManagers:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getActiveSession()Lcom/twitter/sdk/android/core/Session;
    .locals 3

    .line 35
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/SessionProvider;->sessionManagers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/twitter/sdk/android/core/SessionManager;

    .line 36
    invoke-interface {v1}, Lcom/twitter/sdk/android/core/SessionManager;->getActiveSession()Lcom/twitter/sdk/android/core/Session;

    move-result-object v1

    if-eqz v1, :cond_0

    :cond_1
    return-object v1
.end method

.method public abstract requestAuth(Lcom/twitter/sdk/android/core/Callback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/twitter/sdk/android/core/Callback<",
            "Lcom/twitter/sdk/android/core/Session;",
            ">;)V"
        }
    .end annotation
.end method

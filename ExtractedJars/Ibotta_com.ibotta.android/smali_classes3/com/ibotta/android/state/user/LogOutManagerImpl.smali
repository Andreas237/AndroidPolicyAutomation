.class public Lcom/ibotta/android/state/user/LogOutManagerImpl;
.super Ljava/lang/Object;
.source "LogOutManagerImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/user/LogOutManager;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

.field private logOutListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/user/LogOutListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/user/auth/AuthManager;)V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/state/user/LogOutManagerImpl;->logOutListeners:Ljava/util/List;

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/state/user/LogOutManagerImpl;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    return-void
.end method


# virtual methods
.method public logOut(Z)V
    .locals 6

    const-string v0, "logOut: Logging out of everything!"

    const/4 v1, 0x0

    .line 33
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/state/user/LogOutManagerImpl;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "User is already logged out."

    .line 35
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/state/user/LogOutManagerImpl;->logOutListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/state/user/LogOutListener;

    const-string v3, "Logging out of: %s"

    const/4 v4, 0x1

    .line 41
    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-static {v3, v4}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    invoke-interface {v2, p1}, Lcom/ibotta/android/state/user/LogOutListener;->onLogOut(Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setLogOutListeners(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/user/LogOutListener;",
            ">;)V"
        }
    .end annotation

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/state/user/LogOutManagerImpl;->logOutListeners:Ljava/util/List;

    return-void
.end method

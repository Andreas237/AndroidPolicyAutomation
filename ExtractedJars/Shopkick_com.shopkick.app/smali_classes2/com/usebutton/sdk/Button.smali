.class public final Lcom/usebutton/sdk/Button;
.super Ljava/lang/Object;
.source "Button.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/Button$InvalidAppIdException;,
        Lcom/usebutton/sdk/Button$OnConfigureListener;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static actions()Lcom/usebutton/sdk/action/ButtonActionsInterface;
    .locals 1

    .line 139
    invoke-static {}, Lcom/usebutton/sdk/Button;->button()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 140
    :cond_0
    new-instance v0, Lcom/usebutton/sdk/internal/NoOpButtonActions;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/NoOpButtonActions;-><init>()V

    :goto_0
    return-object v0
.end method

.method private static declared-synchronized button()Lcom/usebutton/sdk/internal/ButtonPrivate;
    .locals 2

    const-class v0, Lcom/usebutton/sdk/Button;

    monitor-enter v0

    .line 281
    :try_start_0
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static clearAllData()V
    .locals 1

    .line 187
    invoke-static {}, Lcom/usebutton/sdk/Button;->button()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->clearAllData()V

    return-void
.end method

.method public static configure(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 47
    invoke-static {p0, p1, v0}, Lcom/usebutton/sdk/Button;->configure(Landroid/content/Context;Ljava/lang/String;Lcom/usebutton/sdk/Button$OnConfigureListener;)V

    return-void
.end method

.method public static configure(Landroid/content/Context;Ljava/lang/String;Lcom/usebutton/sdk/Button$OnConfigureListener;)V
    .locals 2
    .param p2    # Lcom/usebutton/sdk/Button$OnConfigureListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 61
    invoke-static {}, Lcom/usebutton/sdk/Button;->button()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    const/4 p0, 0x0

    .line 63
    invoke-interface {p2, p0}, Lcom/usebutton/sdk/Button$OnConfigureListener;->onComplete(Ljava/lang/Throwable;)V

    :cond_0
    return-void

    .line 70
    :cond_1
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->isApplicationIdValid(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string p0, "Button App ID \'%s\' is not valid. You can find your App ID in the dashboard by logging in at https://app.usebutton.com/"

    const/4 v0, 0x1

    .line 71
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    if-eqz p2, :cond_2

    .line 77
    new-instance p1, Lcom/usebutton/sdk/Button$InvalidAppIdException;

    invoke-direct {p1, p0}, Lcom/usebutton/sdk/Button$InvalidAppIdException;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/usebutton/sdk/Button$OnConfigureListener;->onComplete(Ljava/lang/Throwable;)V

    :cond_2
    return-void

    .line 84
    :cond_3
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/usebutton/sdk/Button;->initializeCore(Landroid/content/Context;Ljava/lang/String;)V

    .line 85
    invoke-static {}, Lcom/usebutton/sdk/Button;->button()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object p1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->setContext(Landroid/content/Context;)V

    .line 88
    invoke-static {}, Lcom/usebutton/sdk/Button;->button()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/usebutton/sdk/internal/ButtonPrivate;->configure(Lcom/usebutton/sdk/Button$OnConfigureListener;)V

    return-void
.end method

.method public static debug()Lcom/usebutton/sdk/debug/DebugInterface;
    .locals 1

    .line 178
    invoke-static {}, Lcom/usebutton/sdk/internal/util/DebugProxy;->getInstance()Lcom/usebutton/sdk/debug/DebugInterface;

    move-result-object v0

    return-object v0
.end method

.method private static initializeCore(Landroid/content/Context;Ljava/lang/String;)V
    .locals 13

    .line 218
    new-instance v0, Lcom/usebutton/sdk/internal/api/HostInformation;

    invoke-direct {v0, p0, p1}, Lcom/usebutton/sdk/internal/api/HostInformation;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 221
    new-instance v3, Lcom/usebutton/sdk/internal/core/Storage;

    invoke-direct {v3, p0, p1}, Lcom/usebutton/sdk/internal/core/Storage;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 224
    new-instance v2, Lcom/usebutton/sdk/internal/api/ButtonApi;

    new-instance p1, Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;

    invoke-direct {p1, p0}, Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;-><init>(Landroid/content/Context;)V

    new-instance v1, Lcom/usebutton/sdk/internal/api/RequestShepherd;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/api/RequestShepherd;-><init>(Landroid/content/Context;)V

    invoke-direct {v2, v0, p1, v1}, Lcom/usebutton/sdk/internal/api/ButtonApi;-><init>(Lcom/usebutton/sdk/internal/api/HostInformation;Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;Lcom/usebutton/sdk/internal/api/RequestShepherd;)V

    .line 228
    new-instance v4, Lcom/usebutton/sdk/internal/events/EventTracker;

    invoke-direct {v4, p0, v3}, Lcom/usebutton/sdk/internal/events/EventTracker;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/core/Storage;)V

    .line 231
    new-instance v6, Lcom/usebutton/sdk/internal/util/PackageObserver;

    invoke-direct {v6, p0}, Lcom/usebutton/sdk/internal/util/PackageObserver;-><init>(Landroid/content/Context;)V

    .line 234
    new-instance v7, Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    .line 235
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-direct {v7, p1, v4}, Lcom/usebutton/sdk/internal/core/ApplicationHooks;-><init>(Landroid/app/Application;Lcom/usebutton/sdk/internal/events/EventTracker;)V

    .line 238
    new-instance v8, Lcom/usebutton/sdk/internal/api/ActionCache;

    invoke-direct {v8}, Lcom/usebutton/sdk/internal/api/ActionCache;-><init>()V

    .line 241
    new-instance p1, Lcom/usebutton/sdk/Button$1;

    invoke-direct {p1, v3}, Lcom/usebutton/sdk/Button$1;-><init>(Lcom/usebutton/sdk/internal/core/Storage;)V

    .line 250
    new-instance v9, Lcom/usebutton/sdk/internal/ImageLoader;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getHttp()Lcom/usebutton/sdk/internal/api/Http;

    move-result-object v0

    invoke-direct {v9, p0, p1, v0}, Lcom/usebutton/sdk/internal/ImageLoader;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/functional/Getter;Lcom/usebutton/sdk/internal/api/Http;)V

    .line 253
    new-instance v10, Lcom/usebutton/sdk/internal/models/UrlMatcher;

    invoke-direct {v10, p1}, Lcom/usebutton/sdk/internal/models/UrlMatcher;-><init>(Lcom/usebutton/sdk/internal/functional/Getter;)V

    .line 256
    invoke-static {}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->defaultExecutor()Lcom/usebutton/sdk/internal/core/CommandExecutor;

    move-result-object v5

    .line 259
    new-instance v11, Lcom/usebutton/sdk/internal/secure/SecureStore;

    invoke-direct {v11, p0}, Lcom/usebutton/sdk/internal/secure/SecureStore;-><init>(Landroid/content/Context;)V

    .line 262
    invoke-static {v11}, Lcom/usebutton/sdk/internal/user/UserImpl;->getInstance(Lcom/usebutton/sdk/internal/secure/SecureStore;)Lcom/usebutton/sdk/internal/user/UserImpl;

    move-result-object p0

    .line 265
    new-instance v12, Lcom/usebutton/sdk/internal/ButtonRepository;

    invoke-direct {v12, v2, v3, v5, p0}, Lcom/usebutton/sdk/internal/ButtonRepository;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/core/CommandExecutor;Lcom/usebutton/sdk/internal/user/UserImpl;)V

    .line 269
    new-instance p0, Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-object v1, p0

    invoke-direct/range {v1 .. v12}, Lcom/usebutton/sdk/internal/ButtonPrivate;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/events/EventTracker;Lcom/usebutton/sdk/internal/core/CommandExecutor;Lcom/usebutton/sdk/internal/util/PackageObserver;Lcom/usebutton/sdk/internal/core/ApplicationHooks;Lcom/usebutton/sdk/internal/api/ActionCache;Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/models/UrlMatcher;Lcom/usebutton/sdk/internal/secure/SecureStore;Lcom/usebutton/sdk/internal/ButtonRepository;)V

    invoke-static {p0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->setButton(Lcom/usebutton/sdk/internal/ButtonPrivate;)V

    return-void
.end method

.method public static onLocaleChanged(Landroid/content/Context;)V
    .locals 1

    .line 196
    invoke-static {}, Lcom/usebutton/sdk/Button;->button()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->doOnLocaleChanged(Landroid/content/Context;)V

    return-void
.end method

.method public static purchasePath()Lcom/usebutton/sdk/purchasepath/PurchasePathInterface;
    .locals 1

    .line 113
    invoke-static {}, Lcom/usebutton/sdk/Button;->button()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 114
    :cond_0
    new-instance v0, Lcom/usebutton/sdk/internal/NoOpPurchasePath;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/NoOpPurchasePath;-><init>()V

    :goto_0
    return-object v0
.end method

.method public static user()Lcom/usebutton/sdk/user/User;
    .locals 1

    .line 159
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 160
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getSecureStore()Lcom/usebutton/sdk/internal/secure/SecureStore;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 161
    :goto_0
    invoke-static {v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->getInstance(Lcom/usebutton/sdk/internal/secure/SecureStore;)Lcom/usebutton/sdk/internal/user/UserImpl;

    move-result-object v0

    return-object v0
.end method

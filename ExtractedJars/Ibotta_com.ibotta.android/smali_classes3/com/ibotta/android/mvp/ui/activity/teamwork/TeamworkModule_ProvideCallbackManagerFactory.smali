.class public final Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideCallbackManagerFactory;
.super Ljava/lang/Object;
.source "TeamworkModule_ProvideCallbackManagerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/facebook/CallbackManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideCallbackManagerFactory;->module:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideCallbackManagerFactory;
    .locals 1

    .line 30
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideCallbackManagerFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideCallbackManagerFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;)Lcom/facebook/CallbackManager;
    .locals 0

    .line 26
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideCallbackManagerFactory;->proxyProvideCallbackManager(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;)Lcom/facebook/CallbackManager;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideCallbackManager(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;)Lcom/facebook/CallbackManager;
    .locals 1

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;->provideCallbackManager()Lcom/facebook/CallbackManager;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 34
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/facebook/CallbackManager;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/facebook/CallbackManager;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideCallbackManagerFactory;->module:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideCallbackManagerFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;)Lcom/facebook/CallbackManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideCallbackManagerFactory;->get()Lcom/facebook/CallbackManager;

    move-result-object v0

    return-object v0
.end method

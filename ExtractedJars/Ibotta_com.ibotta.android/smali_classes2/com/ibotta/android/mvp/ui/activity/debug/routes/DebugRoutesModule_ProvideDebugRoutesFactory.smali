.class public final Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule_ProvideDebugRoutesFactory;
.super Ljava/lang/Object;
.source "DebugRoutesModule_ProvideDebugRoutesFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule_ProvideDebugRoutesFactory;->module:Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule;)Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule_ProvideDebugRoutesFactory;
    .locals 1

    .line 28
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule_ProvideDebugRoutesFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule_ProvideDebugRoutesFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule;)Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;
    .locals 0

    .line 24
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule_ProvideDebugRoutesFactory;->proxyProvideDebugRoutes(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule;)Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideDebugRoutes(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule;)Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;
    .locals 1

    .line 33
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule;->provideDebugRoutes()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 32
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule_ProvideDebugRoutesFactory;->module:Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule_ProvideDebugRoutesFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule;)Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 7
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule_ProvideDebugRoutesFactory;->get()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;

    move-result-object v0

    return-object v0
.end method

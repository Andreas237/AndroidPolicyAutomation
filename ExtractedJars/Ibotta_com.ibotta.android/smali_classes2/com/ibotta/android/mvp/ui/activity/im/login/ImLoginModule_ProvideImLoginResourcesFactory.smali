.class public final Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvideImLoginResourcesFactory;
.super Ljava/lang/Object;
.source "ImLoginModule_ProvideImLoginResourcesFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvideImLoginResourcesFactory;->module:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvideImLoginResourcesFactory;
    .locals 1

    .line 29
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvideImLoginResourcesFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvideImLoginResourcesFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;
    .locals 0

    .line 25
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvideImLoginResourcesFactory;->proxyProvideImLoginResources(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideImLoginResources(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;
    .locals 1

    .line 34
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;->provideImLoginResources()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 33
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvideImLoginResourcesFactory;->module:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvideImLoginResourcesFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 7
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvideImLoginResourcesFactory;->get()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;

    move-result-object v0

    return-object v0
.end method

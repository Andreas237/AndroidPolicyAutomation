.class public final Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvidePermissionsHelperFactory;
.super Ljava/lang/Object;
.source "FeaturedModule_ProvidePermissionsHelperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/permissions/PermissionsHelper;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;

.field private final permissionsHelperFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionsHelperFactory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionsHelperFactory;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvidePermissionsHelperFactory;->module:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvidePermissionsHelperFactory;->permissionsHelperFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvidePermissionsHelperFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionsHelperFactory;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvidePermissionsHelperFactory;"
        }
    .end annotation

    .line 38
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvidePermissionsHelperFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvidePermissionsHelperFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Ljavax/inject/Provider;)Lcom/ibotta/android/permissions/PermissionsHelper;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionsHelperFactory;",
            ">;)",
            "Lcom/ibotta/android/permissions/PermissionsHelper;"
        }
    .end annotation

    .line 33
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvidePermissionsHelperFactory;->proxyProvidePermissionsHelper(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Lcom/ibotta/android/permissions/PermissionsHelperFactory;)Lcom/ibotta/android/permissions/PermissionsHelper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePermissionsHelper(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Lcom/ibotta/android/permissions/PermissionsHelperFactory;)Lcom/ibotta/android/permissions/PermissionsHelper;
    .locals 0

    .line 45
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;->providePermissionsHelper(Lcom/ibotta/android/permissions/PermissionsHelperFactory;)Lcom/ibotta/android/permissions/PermissionsHelper;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 44
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/permissions/PermissionsHelper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/permissions/PermissionsHelper;
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvidePermissionsHelperFactory;->module:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvidePermissionsHelperFactory;->permissionsHelperFactoryProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvidePermissionsHelperFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Ljavax/inject/Provider;)Lcom/ibotta/android/permissions/PermissionsHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvidePermissionsHelperFactory;->get()Lcom/ibotta/android/permissions/PermissionsHelper;

    move-result-object v0

    return-object v0
.end method

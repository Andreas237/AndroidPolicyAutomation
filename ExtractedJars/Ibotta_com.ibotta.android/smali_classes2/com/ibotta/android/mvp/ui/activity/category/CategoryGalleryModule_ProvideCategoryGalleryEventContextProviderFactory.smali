.class public final Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideCategoryGalleryEventContextProviderFactory;
.super Ljava/lang/Object;
.source "CategoryGalleryModule_ProvideCategoryGalleryEventContextProviderFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/tracking/EventContextProvider;",
        ">;"
    }
.end annotation


# instance fields
.field private final categoryEventContextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideCategoryGalleryEventContextProviderFactory;->module:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideCategoryGalleryEventContextProviderFactory;->categoryEventContextProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideCategoryGalleryEventContextProviderFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideCategoryGalleryEventContextProviderFactory;"
        }
    .end annotation

    .line 38
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideCategoryGalleryEventContextProviderFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideCategoryGalleryEventContextProviderFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;)",
            "Lcom/ibotta/android/tracking/EventContextProvider;"
        }
    .end annotation

    .line 33
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/tracking/EventContextProvider;

    .line 32
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideCategoryGalleryEventContextProviderFactory;->proxyProvideCategoryGalleryEventContextProvider(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;Lcom/ibotta/android/tracking/EventContextProvider;)Lcom/ibotta/android/tracking/EventContextProvider;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideCategoryGalleryEventContextProvider(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;Lcom/ibotta/android/tracking/EventContextProvider;)Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 0

    .line 45
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;->provideCategoryGalleryEventContextProvider(Lcom/ibotta/android/tracking/EventContextProvider;)Lcom/ibotta/android/tracking/EventContextProvider;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 44
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/EventContextProvider;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 2

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideCategoryGalleryEventContextProviderFactory;->module:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideCategoryGalleryEventContextProviderFactory;->categoryEventContextProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideCategoryGalleryEventContextProviderFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/EventContextProvider;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryModule_ProvideCategoryGalleryEventContextProviderFactory;->get()Lcom/ibotta/android/tracking/EventContextProvider;

    move-result-object v0

    return-object v0
.end method

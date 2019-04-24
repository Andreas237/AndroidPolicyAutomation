.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureBreadcrumbManagerFactory;
.super Ljava/lang/Object;
.source "ReceiptCaptureModule_ProvideReceiptCaptureBreadcrumbManagerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final breadcrumbStorageProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureBreadcrumbManagerFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureBreadcrumbManagerFactory;->breadcrumbStorageProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureBreadcrumbManagerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureBreadcrumbManagerFactory;"
        }
    .end annotation

    .line 37
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureBreadcrumbManagerFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureBreadcrumbManagerFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;"
        }
    .end annotation

    .line 32
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;

    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureBreadcrumbManagerFactory;->proxyProvideReceiptCaptureBreadcrumbManager(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideReceiptCaptureBreadcrumbManager(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;
    .locals 0

    .line 44
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;->provideReceiptCaptureBreadcrumbManager(Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 43
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;
    .locals 2

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureBreadcrumbManagerFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureBreadcrumbManagerFactory;->breadcrumbStorageProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureBreadcrumbManagerFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureBreadcrumbManagerFactory;->get()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;

    move-result-object v0

    return-object v0
.end method

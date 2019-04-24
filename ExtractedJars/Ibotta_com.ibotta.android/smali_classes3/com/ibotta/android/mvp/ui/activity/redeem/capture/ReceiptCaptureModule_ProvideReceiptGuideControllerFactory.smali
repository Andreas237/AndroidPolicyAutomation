.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptGuideControllerFactory;
.super Ljava/lang/Object;
.source "ReceiptCaptureModule_ProvideReceiptGuideControllerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;

.field private final storageProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptGuideControllerFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;

    .line 21
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptGuideControllerFactory;->storageProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptGuideControllerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptGuideControllerFactory;"
        }
    .end annotation

    .line 36
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptGuideControllerFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptGuideControllerFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;"
        }
    .end annotation

    .line 31
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptGuideControllerFactory;->proxyProvideReceiptGuideController(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideReceiptGuideController(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;
    .locals 0

    .line 42
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;->provideReceiptGuideController(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 41
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;
    .locals 2

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptGuideControllerFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptGuideControllerFactory;->storageProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptGuideControllerFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptGuideControllerFactory;->get()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;

    move-result-object v0

    return-object v0
.end method

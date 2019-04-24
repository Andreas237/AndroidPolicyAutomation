.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;
.super Ljava/lang/Object;
.source "ReceiptCaptureModule_ProvideReceiptCaptureStorageFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;
    .locals 1

    .line 30
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;
    .locals 0

    .line 25
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;->proxyProvideReceiptCaptureStorage(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideReceiptCaptureStorage(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;
    .locals 1

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;->provideReceiptCaptureStorage()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 35
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 7
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;->get()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    move-result-object v0

    return-object v0
.end method

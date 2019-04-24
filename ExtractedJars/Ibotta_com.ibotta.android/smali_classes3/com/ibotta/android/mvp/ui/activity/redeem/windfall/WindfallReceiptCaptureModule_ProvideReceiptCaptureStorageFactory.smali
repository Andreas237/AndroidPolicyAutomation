.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;
.super Ljava/lang/Object;
.source "WindfallReceiptCaptureModule_ProvideReceiptCaptureStorageFactory.java"

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
.field private final module:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;
    .locals 1

    .line 32
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;
    .locals 0

    .line 27
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;->proxyProvideReceiptCaptureStorage(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideReceiptCaptureStorage(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;
    .locals 1

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;->provideReceiptCaptureStorage()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 37
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideReceiptCaptureStorageFactory;->get()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    move-result-object v0

    return-object v0
.end method

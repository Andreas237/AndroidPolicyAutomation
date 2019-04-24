.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideWindfallReceiptImageSaverFactory;
.super Ljava/lang/Object;
.source "WindfallReceiptCaptureModule_ProvideWindfallReceiptImageSaverFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaver;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideWindfallReceiptImageSaverFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideWindfallReceiptImageSaverFactory;
    .locals 1

    .line 31
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideWindfallReceiptImageSaverFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideWindfallReceiptImageSaverFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaver;
    .locals 0

    .line 26
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideWindfallReceiptImageSaverFactory;->proxyProvideWindfallReceiptImageSaver(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaver;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideWindfallReceiptImageSaver(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaver;
    .locals 1

    .line 37
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;->provideWindfallReceiptImageSaver()Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaver;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 36
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaver;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaver;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideWindfallReceiptImageSaverFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideWindfallReceiptImageSaverFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaver;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 7
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule_ProvideWindfallReceiptImageSaverFactory;->get()Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptImageSaver;

    move-result-object v0

    return-object v0
.end method

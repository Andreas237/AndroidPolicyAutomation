.class public final Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule_ProvideBarcodeMatcherFactory;
.super Ljava/lang/Object;
.source "VerifyScanModule_ProvideBarcodeMatcherFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/verification/BarcodeMatcher;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule_ProvideBarcodeMatcherFactory;->module:Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;)Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule_ProvideBarcodeMatcherFactory;
    .locals 1

    .line 30
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule_ProvideBarcodeMatcherFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule_ProvideBarcodeMatcherFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;)Lcom/ibotta/android/verification/BarcodeMatcher;
    .locals 0

    .line 26
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule_ProvideBarcodeMatcherFactory;->proxyProvideBarcodeMatcher(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;)Lcom/ibotta/android/verification/BarcodeMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideBarcodeMatcher(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;)Lcom/ibotta/android/verification/BarcodeMatcher;
    .locals 1

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;->provideBarcodeMatcher()Lcom/ibotta/android/verification/BarcodeMatcher;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 34
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/verification/BarcodeMatcher;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/verification/BarcodeMatcher;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule_ProvideBarcodeMatcherFactory;->module:Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule_ProvideBarcodeMatcherFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule;)Lcom/ibotta/android/verification/BarcodeMatcher;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanModule_ProvideBarcodeMatcherFactory;->get()Lcom/ibotta/android/verification/BarcodeMatcher;

    move-result-object v0

    return-object v0
.end method

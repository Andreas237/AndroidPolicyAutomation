.class public final Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppDetectorFactory;
.super Ljava/lang/Object;
.source "PartnerAppTrackingModule_ProvidePartnerAppDetectorFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;",
        ">;"
    }
.end annotation


# instance fields
.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppDetectorFactory;->appHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppDetectorFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppDetectorFactory;"
        }
    .end annotation

    .line 34
    new-instance v0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppDetectorFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppDetectorFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;"
        }
    .end annotation

    .line 29
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p0}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppDetectorFactory;->proxyProvidePartnerAppDetector(Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePartnerAppDetector(Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;
    .locals 1

    .line 39
    invoke-static {p0}, Lcom/ibotta/android/di/PartnerAppTrackingModule;->providePartnerAppDetector(Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 38
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppDetectorFactory;->appHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppDetectorFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppDetectorFactory;->get()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;

    move-result-object v0

    return-object v0
.end method

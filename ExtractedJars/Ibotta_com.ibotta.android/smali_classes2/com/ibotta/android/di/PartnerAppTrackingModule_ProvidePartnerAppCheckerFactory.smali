.class public final Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;
.super Ljava/lang/Object;
.source "PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;",
        ">;"
    }
.end annotation


# instance fields
.field private final appConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final authManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;"
        }
    .end annotation
.end field

.field private final partnerAppDetectorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;",
            ">;"
        }
    .end annotation
.end field

.field private final partnerAppTrackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;",
            ">;"
        }
    .end annotation
.end field

.field private final prefsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 37
    iput-object p2, p0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;->authManagerProvider:Ljavax/inject/Provider;

    .line 38
    iput-object p3, p0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;->partnerAppDetectorProvider:Ljavax/inject/Provider;

    .line 39
    iput-object p4, p0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;->partnerAppTrackerProvider:Ljavax/inject/Provider;

    .line 40
    iput-object p5, p0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;->prefsProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;)",
            "Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;"
        }
    .end annotation

    .line 73
    new-instance v6, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v6
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/auth/AuthManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;)",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;"
        }
    .end annotation

    .line 60
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 61
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 62
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;

    .line 63
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;

    .line 64
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/content/SharedPreferences;

    .line 59
    invoke-static {p0, p1, p2, p3, p4}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;->proxyProvidePartnerAppChecker(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;Landroid/content/SharedPreferences;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePartnerAppChecker(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;Landroid/content/SharedPreferences;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;
    .locals 0

    .line 88
    invoke-static {p0, p1, p2, p3, p4}, Lcom/ibotta/android/di/PartnerAppTrackingModule;->providePartnerAppChecker(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppDetector;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTracker;Landroid/content/SharedPreferences;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 87
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;
    .locals 5

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;->authManagerProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;->partnerAppDetectorProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;->partnerAppTrackerProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;->prefsProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppCheckerFactory;->get()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;

    move-result-object v0

    return-object v0
.end method

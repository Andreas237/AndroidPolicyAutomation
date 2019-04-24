.class public final Lcom/ibotta/android/di/VerificationModule_ProvideVerificationManagerFactory;
.super Ljava/lang/Object;
.source "VerificationModule_ProvideVerificationManagerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/verification/VerificationManager;",
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

.field private final contextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final offerQuantityDatabaseProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/OfferQuantityDatabase;",
            ">;"
        }
    .end annotation
.end field

.field private final scanRulesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/rules/ScanRules;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/OfferQuantityDatabase;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/rules/ScanRules;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/di/VerificationModule_ProvideVerificationManagerFactory;->contextProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/di/VerificationModule_ProvideVerificationManagerFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/di/VerificationModule_ProvideVerificationManagerFactory;->offerQuantityDatabaseProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p4, p0, Lcom/ibotta/android/di/VerificationModule_ProvideVerificationManagerFactory;->scanRulesProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/VerificationModule_ProvideVerificationManagerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/OfferQuantityDatabase;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/rules/ScanRules;",
            ">;)",
            "Lcom/ibotta/android/di/VerificationModule_ProvideVerificationManagerFactory;"
        }
    .end annotation

    .line 61
    new-instance v0, Lcom/ibotta/android/di/VerificationModule_ProvideVerificationManagerFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/di/VerificationModule_ProvideVerificationManagerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/verification/VerificationManager;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/verification/OfferQuantityDatabase;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/rules/ScanRules;",
            ">;)",
            "Lcom/ibotta/android/verification/VerificationManager;"
        }
    .end annotation

    .line 50
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    .line 51
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 52
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/verification/OfferQuantityDatabase;

    .line 53
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/api/rules/ScanRules;

    .line 49
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/VerificationModule_ProvideVerificationManagerFactory;->proxyProvideVerificationManager(Landroid/content/Context;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/verification/OfferQuantityDatabase;Lcom/ibotta/api/rules/ScanRules;)Lcom/ibotta/android/verification/VerificationManager;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideVerificationManager(Landroid/content/Context;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/verification/OfferQuantityDatabase;Lcom/ibotta/api/rules/ScanRules;)Lcom/ibotta/android/verification/VerificationManager;
    .locals 0

    .line 71
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/VerificationModule;->provideVerificationManager(Landroid/content/Context;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/verification/OfferQuantityDatabase;Lcom/ibotta/api/rules/ScanRules;)Lcom/ibotta/android/verification/VerificationManager;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 70
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/verification/VerificationManager;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/verification/VerificationManager;
    .locals 4

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/di/VerificationModule_ProvideVerificationManagerFactory;->contextProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/VerificationModule_ProvideVerificationManagerFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/VerificationModule_ProvideVerificationManagerFactory;->offerQuantityDatabaseProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/VerificationModule_ProvideVerificationManagerFactory;->scanRulesProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/VerificationModule_ProvideVerificationManagerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/verification/VerificationManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/di/VerificationModule_ProvideVerificationManagerFactory;->get()Lcom/ibotta/android/verification/VerificationManager;

    move-result-object v0

    return-object v0
.end method

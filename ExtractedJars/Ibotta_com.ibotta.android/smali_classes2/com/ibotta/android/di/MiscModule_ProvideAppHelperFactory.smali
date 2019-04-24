.class public final Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;
.super Ljava/lang/Object;
.source "MiscModule_ProvideAppHelperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/util/AppHelper;",
        ">;"
    }
.end annotation


# instance fields
.field private final contextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final expirationRulesSupplierProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/ExpirationRulesSupplier;",
            ">;"
        }
    .end annotation
.end field

.field private final handlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field private final hardwareProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
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
            "Lcom/ibotta/android/util/ExpirationRulesSupplier;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)V"
        }
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;->contextProvider:Ljavax/inject/Provider;

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;->expirationRulesSupplierProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p3, p0, Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;->hardwareProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p4, p0, Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;->handlerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/ExpirationRulesSupplier;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)",
            "Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;"
        }
    .end annotation

    .line 60
    new-instance v0, Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/util/AppHelper;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/ExpirationRulesSupplier;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;)",
            "Lcom/ibotta/android/util/AppHelper;"
        }
    .end annotation

    .line 49
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    .line 50
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/util/ExpirationRulesSupplier;

    .line 51
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/hardware/Hardware;

    .line 52
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/os/Handler;

    .line 48
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;->proxyProvideAppHelper(Landroid/content/Context;Lcom/ibotta/android/util/ExpirationRulesSupplier;Lcom/ibotta/android/hardware/Hardware;Landroid/os/Handler;)Lcom/ibotta/android/util/AppHelper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideAppHelper(Landroid/content/Context;Lcom/ibotta/android/util/ExpirationRulesSupplier;Lcom/ibotta/android/hardware/Hardware;Landroid/os/Handler;)Lcom/ibotta/android/util/AppHelper;
    .locals 0

    .line 70
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/MiscModule;->provideAppHelper(Landroid/content/Context;Lcom/ibotta/android/util/ExpirationRulesSupplier;Lcom/ibotta/android/hardware/Hardware;Landroid/os/Handler;)Lcom/ibotta/android/util/AppHelper;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 69
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/AppHelper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/util/AppHelper;
    .locals 4

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;->contextProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;->expirationRulesSupplierProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;->hardwareProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;->handlerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/di/MiscModule_ProvideAppHelperFactory;->get()Lcom/ibotta/android/util/AppHelper;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/ibotta/android/di/AppModule_ProvideLocaleFactory;
.super Ljava/lang/Object;
.source "AppModule_ProvideLocaleFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Ljava/util/Locale;",
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/di/AppModule_ProvideLocaleFactory;->contextProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideLocaleFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/ibotta/android/di/AppModule_ProvideLocaleFactory;"
        }
    .end annotation

    .line 31
    new-instance v0, Lcom/ibotta/android/di/AppModule_ProvideLocaleFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/AppModule_ProvideLocaleFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Ljava/util/Locale;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Ljava/util/Locale;"
        }
    .end annotation

    .line 27
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lcom/ibotta/android/di/AppModule_ProvideLocaleFactory;->proxyProvideLocale(Landroid/content/Context;)Ljava/util/Locale;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideLocale(Landroid/content/Context;)Ljava/util/Locale;
    .locals 1

    .line 36
    invoke-static {p0}, Lcom/ibotta/android/di/AppModule;->provideLocale(Landroid/content/Context;)Ljava/util/Locale;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 35
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Locale;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppModule_ProvideLocaleFactory;->get()Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/Locale;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/di/AppModule_ProvideLocaleFactory;->contextProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/AppModule_ProvideLocaleFactory;->provideInstance(Ljavax/inject/Provider;)Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method

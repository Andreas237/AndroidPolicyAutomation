.class public final Lcom/ibotta/android/di/AppModule_ProvideDebugStateSharedPrefsFactory;
.super Ljava/lang/Object;
.source "AppModule_ProvideDebugStateSharedPrefsFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Landroid/content/SharedPreferences;",
        ">;"
    }
.end annotation


# instance fields
.field private final appProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
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
            "Lcom/ibotta/android/App;",
            ">;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/di/AppModule_ProvideDebugStateSharedPrefsFactory;->appProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppModule_ProvideDebugStateSharedPrefsFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;)",
            "Lcom/ibotta/android/di/AppModule_ProvideDebugStateSharedPrefsFactory;"
        }
    .end annotation

    .line 32
    new-instance v0, Lcom/ibotta/android/di/AppModule_ProvideDebugStateSharedPrefsFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/AppModule_ProvideDebugStateSharedPrefsFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Landroid/content/SharedPreferences;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;)",
            "Landroid/content/SharedPreferences;"
        }
    .end annotation

    .line 28
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/App;

    invoke-static {p0}, Lcom/ibotta/android/di/AppModule_ProvideDebugStateSharedPrefsFactory;->proxyProvideDebugStateSharedPrefs(Lcom/ibotta/android/App;)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideDebugStateSharedPrefs(Lcom/ibotta/android/App;)Landroid/content/SharedPreferences;
    .locals 1

    .line 37
    invoke-static {p0}, Lcom/ibotta/android/di/AppModule;->provideDebugStateSharedPrefs(Lcom/ibotta/android/App;)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 36
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/SharedPreferences;

    return-object p0
.end method


# virtual methods
.method public get()Landroid/content/SharedPreferences;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/di/AppModule_ProvideDebugStateSharedPrefsFactory;->appProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/AppModule_ProvideDebugStateSharedPrefsFactory;->provideInstance(Ljavax/inject/Provider;)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppModule_ProvideDebugStateSharedPrefsFactory;->get()Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method

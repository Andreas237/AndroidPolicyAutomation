.class public final Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideGoogleSignInClientFactory;
.super Ljava/lang/Object;
.source "LaunchModule_ProvideGoogleSignInClientFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;",
        ">;"
    }
.end annotation


# instance fields
.field private final googleSignInOptionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;",
            "Ljavax/inject/Provider<",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideGoogleSignInClientFactory;->module:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideGoogleSignInClientFactory;->googleSignInOptionsProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideGoogleSignInClientFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;",
            "Ljavax/inject/Provider<",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideGoogleSignInClientFactory;"
        }
    .end annotation

    .line 38
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideGoogleSignInClientFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideGoogleSignInClientFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;)Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;",
            "Ljavax/inject/Provider<",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;",
            ">;)",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;"
        }
    .end annotation

    .line 33
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideGoogleSignInClientFactory;->proxyProvideGoogleSignInClient(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideGoogleSignInClient(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;
    .locals 0

    .line 44
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;->provideGoogleSignInClient(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 43
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideGoogleSignInClientFactory;->module:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideGoogleSignInClientFactory;->googleSignInOptionsProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideGoogleSignInClientFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;Ljavax/inject/Provider;)Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvideGoogleSignInClientFactory;->get()Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

    move-result-object v0

    return-object v0
.end method

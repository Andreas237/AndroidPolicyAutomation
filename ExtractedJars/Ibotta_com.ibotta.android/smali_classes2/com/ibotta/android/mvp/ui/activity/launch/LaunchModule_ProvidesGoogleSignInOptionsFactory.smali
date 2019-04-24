.class public final Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvidesGoogleSignInOptionsFactory;
.super Ljava/lang/Object;
.source "LaunchModule_ProvidesGoogleSignInOptionsFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvidesGoogleSignInOptionsFactory;->module:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;)Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvidesGoogleSignInOptionsFactory;
    .locals 1

    .line 30
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvidesGoogleSignInOptionsFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvidesGoogleSignInOptionsFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    .locals 0

    .line 26
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvidesGoogleSignInOptionsFactory;->proxyProvidesGoogleSignInOptions(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidesGoogleSignInOptions(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    .locals 1

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;->providesGoogleSignInOptions()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 34
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvidesGoogleSignInOptionsFactory;->module:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvidesGoogleSignInOptionsFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchModule_ProvidesGoogleSignInOptionsFactory;->get()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object v0

    return-object v0
.end method

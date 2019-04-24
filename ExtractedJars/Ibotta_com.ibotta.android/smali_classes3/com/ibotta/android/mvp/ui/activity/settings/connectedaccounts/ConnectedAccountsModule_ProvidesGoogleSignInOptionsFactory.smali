.class public final Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvidesGoogleSignInOptionsFactory;
.super Ljava/lang/Object;
.source "ConnectedAccountsModule_ProvidesGoogleSignInOptionsFactory.java"

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
.field private final module:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvidesGoogleSignInOptionsFactory;->module:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvidesGoogleSignInOptionsFactory;
    .locals 1

    .line 32
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvidesGoogleSignInOptionsFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvidesGoogleSignInOptionsFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    .locals 0

    .line 27
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvidesGoogleSignInOptionsFactory;->proxyProvidesGoogleSignInOptions(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidesGoogleSignInOptions(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    .locals 1

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;->providesGoogleSignInOptions()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 37
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvidesGoogleSignInOptionsFactory;->module:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvidesGoogleSignInOptionsFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule_ProvidesGoogleSignInOptionsFactory;->get()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object v0

    return-object v0
.end method

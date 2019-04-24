.class public final Lcom/ibotta/android/di/StateModule_ProvidePermissionsStateFactory;
.super Ljava/lang/Object;
.source "StateModule_ProvidePermissionsStateFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/state/app/permissions/PermissionsState;",
        ">;"
    }
.end annotation


# instance fields
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
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/di/StateModule_ProvidePermissionsStateFactory;->prefsProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvidePermissionsStateFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;)",
            "Lcom/ibotta/android/di/StateModule_ProvidePermissionsStateFactory;"
        }
    .end annotation

    .line 32
    new-instance v0, Lcom/ibotta/android/di/StateModule_ProvidePermissionsStateFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/StateModule_ProvidePermissionsStateFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/state/app/permissions/PermissionsState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;)",
            "Lcom/ibotta/android/state/app/permissions/PermissionsState;"
        }
    .end annotation

    .line 27
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/SharedPreferences;

    invoke-static {p0}, Lcom/ibotta/android/di/StateModule_ProvidePermissionsStateFactory;->proxyProvidePermissionsState(Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/permissions/PermissionsState;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePermissionsState(Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/permissions/PermissionsState;
    .locals 1

    .line 37
    invoke-static {p0}, Lcom/ibotta/android/di/StateModule;->providePermissionsState(Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/permissions/PermissionsState;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 36
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/permissions/PermissionsState;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/state/app/permissions/PermissionsState;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule_ProvidePermissionsStateFactory;->prefsProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/StateModule_ProvidePermissionsStateFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/state/app/permissions/PermissionsState;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/StateModule_ProvidePermissionsStateFactory;->get()Lcom/ibotta/android/state/app/permissions/PermissionsState;

    move-result-object v0

    return-object v0
.end method

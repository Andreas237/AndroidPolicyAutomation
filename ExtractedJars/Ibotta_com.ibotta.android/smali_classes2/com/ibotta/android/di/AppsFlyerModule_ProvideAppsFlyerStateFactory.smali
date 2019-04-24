.class public final Lcom/ibotta/android/di/AppsFlyerModule_ProvideAppsFlyerStateFactory;
.super Ljava/lang/Object;
.source "AppsFlyerModule_ProvideAppsFlyerStateFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/state/app/pojo/AppsFlyerState;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/android/di/AppsFlyerModule_ProvideAppsFlyerStateFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    new-instance v0, Lcom/ibotta/android/di/AppsFlyerModule_ProvideAppsFlyerStateFactory;

    invoke-direct {v0}, Lcom/ibotta/android/di/AppsFlyerModule_ProvideAppsFlyerStateFactory;-><init>()V

    sput-object v0, Lcom/ibotta/android/di/AppsFlyerModule_ProvideAppsFlyerStateFactory;->INSTANCE:Lcom/ibotta/android/di/AppsFlyerModule_ProvideAppsFlyerStateFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/android/di/AppsFlyerModule_ProvideAppsFlyerStateFactory;
    .locals 1

    .line 26
    sget-object v0, Lcom/ibotta/android/di/AppsFlyerModule_ProvideAppsFlyerStateFactory;->INSTANCE:Lcom/ibotta/android/di/AppsFlyerModule_ProvideAppsFlyerStateFactory;

    return-object v0
.end method

.method public static provideInstance()Lcom/ibotta/android/state/app/pojo/AppsFlyerState;
    .locals 1

    .line 22
    invoke-static {}, Lcom/ibotta/android/di/AppsFlyerModule_ProvideAppsFlyerStateFactory;->proxyProvideAppsFlyerState()Lcom/ibotta/android/state/app/pojo/AppsFlyerState;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideAppsFlyerState()Lcom/ibotta/android/state/app/pojo/AppsFlyerState;
    .locals 2

    .line 31
    invoke-static {}, Lcom/ibotta/android/di/AppsFlyerModule;->provideAppsFlyerState()Lcom/ibotta/android/state/app/pojo/AppsFlyerState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 30
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/pojo/AppsFlyerState;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/state/app/pojo/AppsFlyerState;
    .locals 1

    .line 18
    invoke-static {}, Lcom/ibotta/android/di/AppsFlyerModule_ProvideAppsFlyerStateFactory;->provideInstance()Lcom/ibotta/android/state/app/pojo/AppsFlyerState;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppsFlyerModule_ProvideAppsFlyerStateFactory;->get()Lcom/ibotta/android/state/app/pojo/AppsFlyerState;

    move-result-object v0

    return-object v0
.end method

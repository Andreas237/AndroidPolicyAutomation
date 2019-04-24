.class public final Lcom/ibotta/android/di/BlacklistModule_ProvideAppVersionHelperFactory;
.super Ljava/lang/Object;
.source "BlacklistModule_ProvideAppVersionHelperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/android/di/BlacklistModule_ProvideAppVersionHelperFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lcom/ibotta/android/di/BlacklistModule_ProvideAppVersionHelperFactory;

    invoke-direct {v0}, Lcom/ibotta/android/di/BlacklistModule_ProvideAppVersionHelperFactory;-><init>()V

    sput-object v0, Lcom/ibotta/android/di/BlacklistModule_ProvideAppVersionHelperFactory;->INSTANCE:Lcom/ibotta/android/di/BlacklistModule_ProvideAppVersionHelperFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/android/di/BlacklistModule_ProvideAppVersionHelperFactory;
    .locals 1

    .line 27
    sget-object v0, Lcom/ibotta/android/di/BlacklistModule_ProvideAppVersionHelperFactory;->INSTANCE:Lcom/ibotta/android/di/BlacklistModule_ProvideAppVersionHelperFactory;

    return-object v0
.end method

.method public static provideInstance()Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;
    .locals 1

    .line 23
    invoke-static {}, Lcom/ibotta/android/di/BlacklistModule_ProvideAppVersionHelperFactory;->proxyProvideAppVersionHelper()Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideAppVersionHelper()Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;
    .locals 2

    .line 32
    invoke-static {}, Lcom/ibotta/android/di/BlacklistModule;->provideAppVersionHelper()Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 31
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;
    .locals 1

    .line 19
    invoke-static {}, Lcom/ibotta/android/di/BlacklistModule_ProvideAppVersionHelperFactory;->provideInstance()Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/di/BlacklistModule_ProvideAppVersionHelperFactory;->get()Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    move-result-object v0

    return-object v0
.end method

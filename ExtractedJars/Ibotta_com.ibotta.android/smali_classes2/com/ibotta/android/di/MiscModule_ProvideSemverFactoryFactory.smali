.class public final Lcom/ibotta/android/di/MiscModule_ProvideSemverFactoryFactory;
.super Ljava/lang/Object;
.source "MiscModule_ProvideSemverFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/util/SemverFactory;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/android/di/MiscModule_ProvideSemverFactoryFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    new-instance v0, Lcom/ibotta/android/di/MiscModule_ProvideSemverFactoryFactory;

    invoke-direct {v0}, Lcom/ibotta/android/di/MiscModule_ProvideSemverFactoryFactory;-><init>()V

    sput-object v0, Lcom/ibotta/android/di/MiscModule_ProvideSemverFactoryFactory;->INSTANCE:Lcom/ibotta/android/di/MiscModule_ProvideSemverFactoryFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/android/di/MiscModule_ProvideSemverFactoryFactory;
    .locals 1

    .line 26
    sget-object v0, Lcom/ibotta/android/di/MiscModule_ProvideSemverFactoryFactory;->INSTANCE:Lcom/ibotta/android/di/MiscModule_ProvideSemverFactoryFactory;

    return-object v0
.end method

.method public static provideInstance()Lcom/ibotta/android/util/SemverFactory;
    .locals 1

    .line 22
    invoke-static {}, Lcom/ibotta/android/di/MiscModule_ProvideSemverFactoryFactory;->proxyProvideSemverFactory()Lcom/ibotta/android/util/SemverFactory;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideSemverFactory()Lcom/ibotta/android/util/SemverFactory;
    .locals 2

    .line 31
    invoke-static {}, Lcom/ibotta/android/di/MiscModule;->provideSemverFactory()Lcom/ibotta/android/util/SemverFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 30
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/SemverFactory;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/util/SemverFactory;
    .locals 1

    .line 18
    invoke-static {}, Lcom/ibotta/android/di/MiscModule_ProvideSemverFactoryFactory;->provideInstance()Lcom/ibotta/android/util/SemverFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/di/MiscModule_ProvideSemverFactoryFactory;->get()Lcom/ibotta/android/util/SemverFactory;

    move-result-object v0

    return-object v0
.end method

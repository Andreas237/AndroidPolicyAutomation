.class public final Lcom/ibotta/android/tracking/di/JsonModule_ProvideIbottaJsonFactory;
.super Ljava/lang/Object;
.source "JsonModule_ProvideIbottaJsonFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/json/IbottaJson;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/tracking/di/JsonModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/di/JsonModule;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/ibotta/android/tracking/di/JsonModule_ProvideIbottaJsonFactory;->module:Lcom/ibotta/android/tracking/di/JsonModule;

    return-void
.end method

.method public static create(Lcom/ibotta/android/tracking/di/JsonModule;)Lcom/ibotta/android/tracking/di/JsonModule_ProvideIbottaJsonFactory;
    .locals 1

    .line 25
    new-instance v0, Lcom/ibotta/android/tracking/di/JsonModule_ProvideIbottaJsonFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/tracking/di/JsonModule_ProvideIbottaJsonFactory;-><init>(Lcom/ibotta/android/tracking/di/JsonModule;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/tracking/di/JsonModule;)Lcom/ibotta/android/json/IbottaJson;
    .locals 0

    .line 21
    invoke-static {p0}, Lcom/ibotta/android/tracking/di/JsonModule_ProvideIbottaJsonFactory;->proxyProvideIbottaJson(Lcom/ibotta/android/tracking/di/JsonModule;)Lcom/ibotta/android/json/IbottaJson;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideIbottaJson(Lcom/ibotta/android/tracking/di/JsonModule;)Lcom/ibotta/android/json/IbottaJson;
    .locals 1

    .line 30
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/di/JsonModule;->provideIbottaJson()Lcom/ibotta/android/json/IbottaJson;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 29
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/json/IbottaJson;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/json/IbottaJson;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/ibotta/android/tracking/di/JsonModule_ProvideIbottaJsonFactory;->module:Lcom/ibotta/android/tracking/di/JsonModule;

    invoke-static {v0}, Lcom/ibotta/android/tracking/di/JsonModule_ProvideIbottaJsonFactory;->provideInstance(Lcom/ibotta/android/tracking/di/JsonModule;)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/di/JsonModule_ProvideIbottaJsonFactory;->get()Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    return-object v0
.end method

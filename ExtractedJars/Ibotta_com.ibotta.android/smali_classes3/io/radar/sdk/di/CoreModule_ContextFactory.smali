.class public final Lio/radar/sdk/di/CoreModule_ContextFactory;
.super Ljava/lang/Object;
.source "CoreModule_ContextFactory.java"

# interfaces
.implements Lio/radar/shadow/dagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/radar/shadow/dagger/internal/Factory<",
        "Landroid/content/Context;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lio/radar/sdk/di/CoreModule;


# direct methods
.method public constructor <init>(Lio/radar/sdk/di/CoreModule;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lio/radar/sdk/di/CoreModule_ContextFactory;->module:Lio/radar/sdk/di/CoreModule;

    return-void
.end method

.method public static create(Lio/radar/sdk/di/CoreModule;)Lio/radar/sdk/di/CoreModule_ContextFactory;
    .locals 1

    .line 25
    new-instance v0, Lio/radar/sdk/di/CoreModule_ContextFactory;

    invoke-direct {v0, p0}, Lio/radar/sdk/di/CoreModule_ContextFactory;-><init>(Lio/radar/sdk/di/CoreModule;)V

    return-object v0
.end method

.method public static provideInstance(Lio/radar/sdk/di/CoreModule;)Landroid/content/Context;
    .locals 0

    .line 21
    invoke-static {p0}, Lio/radar/sdk/di/CoreModule_ContextFactory;->proxyContext(Lio/radar/sdk/di/CoreModule;)Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method public static proxyContext(Lio/radar/sdk/di/CoreModule;)Landroid/content/Context;
    .locals 1

    .line 30
    invoke-virtual {p0}, Lio/radar/sdk/di/CoreModule;->context()Landroid/content/Context;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 29
    invoke-static {p0, v0}, Lio/radar/shadow/dagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public get()Landroid/content/Context;
    .locals 1

    .line 17
    iget-object v0, p0, Lio/radar/sdk/di/CoreModule_ContextFactory;->module:Lio/radar/sdk/di/CoreModule;

    invoke-static {v0}, Lio/radar/sdk/di/CoreModule_ContextFactory;->provideInstance(Lio/radar/sdk/di/CoreModule;)Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lio/radar/sdk/di/CoreModule_ContextFactory;->get()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

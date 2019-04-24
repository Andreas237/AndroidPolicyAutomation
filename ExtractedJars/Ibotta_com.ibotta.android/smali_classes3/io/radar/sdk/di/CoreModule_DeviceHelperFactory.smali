.class public final Lio/radar/sdk/di/CoreModule_DeviceHelperFactory;
.super Ljava/lang/Object;
.source "CoreModule_DeviceHelperFactory.java"

# interfaces
.implements Lio/radar/shadow/dagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/radar/shadow/dagger/internal/Factory<",
        "Lio/radar/sdk/util/DeviceHelper;",
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
    iput-object p1, p0, Lio/radar/sdk/di/CoreModule_DeviceHelperFactory;->module:Lio/radar/sdk/di/CoreModule;

    return-void
.end method

.method public static create(Lio/radar/sdk/di/CoreModule;)Lio/radar/sdk/di/CoreModule_DeviceHelperFactory;
    .locals 1

    .line 25
    new-instance v0, Lio/radar/sdk/di/CoreModule_DeviceHelperFactory;

    invoke-direct {v0, p0}, Lio/radar/sdk/di/CoreModule_DeviceHelperFactory;-><init>(Lio/radar/sdk/di/CoreModule;)V

    return-object v0
.end method

.method public static provideInstance(Lio/radar/sdk/di/CoreModule;)Lio/radar/sdk/util/DeviceHelper;
    .locals 0

    .line 21
    invoke-static {p0}, Lio/radar/sdk/di/CoreModule_DeviceHelperFactory;->proxyDeviceHelper(Lio/radar/sdk/di/CoreModule;)Lio/radar/sdk/util/DeviceHelper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyDeviceHelper(Lio/radar/sdk/di/CoreModule;)Lio/radar/sdk/util/DeviceHelper;
    .locals 1

    .line 30
    invoke-virtual {p0}, Lio/radar/sdk/di/CoreModule;->deviceHelper()Lio/radar/sdk/util/DeviceHelper;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 29
    invoke-static {p0, v0}, Lio/radar/shadow/dagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/radar/sdk/util/DeviceHelper;

    return-object p0
.end method


# virtual methods
.method public get()Lio/radar/sdk/util/DeviceHelper;
    .locals 1

    .line 17
    iget-object v0, p0, Lio/radar/sdk/di/CoreModule_DeviceHelperFactory;->module:Lio/radar/sdk/di/CoreModule;

    invoke-static {v0}, Lio/radar/sdk/di/CoreModule_DeviceHelperFactory;->provideInstance(Lio/radar/sdk/di/CoreModule;)Lio/radar/sdk/util/DeviceHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lio/radar/sdk/di/CoreModule_DeviceHelperFactory;->get()Lio/radar/sdk/util/DeviceHelper;

    move-result-object v0

    return-object v0
.end method

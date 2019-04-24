.class public abstract Lcom/ibotta/android/di/HardwareModule;
.super Ljava/lang/Object;
.source "HardwareModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideDeviceSecurity(Landroid/content/Context;)Lcom/ibotta/android/security/DeviceSecurity;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 28
    new-instance v0, Lcom/ibotta/android/security/DeviceSecurityImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/security/DeviceSecurityImpl;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static provideHardware(Lcom/ibotta/android/App;)Lcom/ibotta/android/hardware/Hardware;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 23
    new-instance v0, Lcom/ibotta/android/hardware/HardwareImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/hardware/HardwareImpl;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

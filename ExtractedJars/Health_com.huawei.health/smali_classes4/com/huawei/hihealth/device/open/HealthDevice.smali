.class public abstract Lcom/huawei/hihealth/device/open/HealthDevice;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealth/device/open/HealthDevice$BOND_STATE;,
        Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;
    }
.end annotation


# static fields
.field public static final CONN_MODE_AUDIO_PLUG:I = 0x4

.field public static final CONN_MODE_BT_CLASSIC:I = 0x2

.field public static final CONN_MODE_BT_LE:I = 0x1

.field public static final CONN_MODE_UNKNOWN:I = 0x10

.field public static final CONN_MODE_WIFI:I = 0x8


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract doCreatePair(Lcom/huawei/hihealth/device/open/IDeviceEventHandler;)Z
.end method

.method public abstract doRemovePair()Z
.end method

.method public abstract getAddress()Ljava/lang/String;
.end method

.method public abstract getDeviceName()Ljava/lang/String;
.end method

.method public abstract getUniqueId()Ljava/lang/String;
.end method

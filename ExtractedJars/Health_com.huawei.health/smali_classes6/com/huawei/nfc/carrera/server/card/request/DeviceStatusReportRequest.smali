.class public Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;
.source "SourceFile"


# static fields
.field public static final HANDLE_DEVICE_LOST_STATUE:Ljava/lang/String; = "2"

.field public static final HANDLE_DEVICE_REPAIR_STATUE:Ljava/lang/String; = "4"

.field public static final HANDLE_REPAIR_INFO_STATUS_NORMAL:Ljava/lang/String; = "0"

.field public static final HANDLE_REPAIR_INFO_STATUS_REJECT:Ljava/lang/String; = "01"


# instance fields
.field public reportDeviceInfo:Ljava/lang/String;

.field public status:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    return-void
.end method

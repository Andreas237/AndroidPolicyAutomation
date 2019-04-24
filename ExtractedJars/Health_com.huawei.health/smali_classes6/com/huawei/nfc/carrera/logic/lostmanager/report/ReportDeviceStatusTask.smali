.class public Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportDeviceStatusTask;
.super Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final KEY_DEVICE_STATUS:Ljava/lang/String; = "device_status"


# instance fields
.field private deviceStatus:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;-><init>(Landroid/content/Context;)V

    .line 25
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportDeviceStatusTask;->deviceStatus:Ljava/lang/String;

    .line 26
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportDeviceStatusTask;->deviceStatus:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportDeviceStatusTask;->updateDeviceStatus(Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportDeviceStatusTask;->deviceStatus:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportDeviceStatusTask;->reportStatusToServer(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportDeviceStatusTask;->removeDeviceStatus()V

    .line 39
    :cond_0
    return-void
.end method

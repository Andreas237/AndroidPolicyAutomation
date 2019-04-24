.class Lcom/huawei/nfc/NFCOpenApiImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/lostmanager/callback/CheckDeviceStatusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/NFCOpenApiImpl;->checkAndHandleDeviceStatus(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/NFCOpenApiImpl;

.field final synthetic val$activity:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/NFCOpenApiImpl;Landroid/app/Activity;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/huawei/nfc/NFCOpenApiImpl$1;->this$0:Lcom/huawei/nfc/NFCOpenApiImpl;

    iput-object p2, p0, Lcom/huawei/nfc/NFCOpenApiImpl$1;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public checkDeviceStatusCallback(Ljava/lang/String;)V
    .locals 2

    .line 140
    const-string v0, "4"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 142
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl$1;->val$activity:Landroid/app/Activity;

    new-instance v1, Lcom/huawei/nfc/NFCOpenApiImpl$1$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/NFCOpenApiImpl$1$1;-><init>(Lcom/huawei/nfc/NFCOpenApiImpl$1;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 151
    :cond_0
    return-void
.end method

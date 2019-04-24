.class Lcom/huawei/nfc/NFCOpenApiImpl$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeviceRepairCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/NFCOpenApiImpl$4;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/nfc/NFCOpenApiImpl$4;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/NFCOpenApiImpl$4;)V
    .locals 0

    .line 248
    iput-object p1, p0, Lcom/huawei/nfc/NFCOpenApiImpl$4$1;->this$1:Lcom/huawei/nfc/NFCOpenApiImpl$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleDeviceRepairCallback(Z)V
    .locals 2

    .line 253
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl$4$1;->this$1:Lcom/huawei/nfc/NFCOpenApiImpl$4;

    iget-object v0, v0, Lcom/huawei/nfc/NFCOpenApiImpl$4;->val$activity:Landroid/app/Activity;

    new-instance v1, Lcom/huawei/nfc/NFCOpenApiImpl$4$1$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/nfc/NFCOpenApiImpl$4$1$1;-><init>(Lcom/huawei/nfc/NFCOpenApiImpl$4$1;Z)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 259
    return-void
.end method

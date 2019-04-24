.class Lcom/huawei/nfc/NFCOpenApiImpl$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/NFCOpenApiImpl$1;->checkDeviceStatusCallback(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/nfc/NFCOpenApiImpl$1;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/NFCOpenApiImpl$1;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lcom/huawei/nfc/NFCOpenApiImpl$1$1;->this$1:Lcom/huawei/nfc/NFCOpenApiImpl$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 147
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl$1$1;->this$1:Lcom/huawei/nfc/NFCOpenApiImpl$1;

    iget-object v0, v0, Lcom/huawei/nfc/NFCOpenApiImpl$1;->this$0:Lcom/huawei/nfc/NFCOpenApiImpl;

    iget-object v1, p0, Lcom/huawei/nfc/NFCOpenApiImpl$1$1;->this$1:Lcom/huawei/nfc/NFCOpenApiImpl$1;

    iget-object v1, v1, Lcom/huawei/nfc/NFCOpenApiImpl$1;->val$activity:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/NFCOpenApiImpl;->showRepairDeviceDlgJudgeByUser(Landroid/app/Activity;)V

    .line 148
    return-void
.end method

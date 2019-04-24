.class Lcom/huawei/nfc/NFCOpenApiImpl$4$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/NFCOpenApiImpl$4$1;->handleDeviceRepairCallback(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/huawei/nfc/NFCOpenApiImpl$4$1;

.field final synthetic val$isSuccess:Z


# direct methods
.method constructor <init>(Lcom/huawei/nfc/NFCOpenApiImpl$4$1;Z)V
    .locals 0

    .line 253
    iput-object p1, p0, Lcom/huawei/nfc/NFCOpenApiImpl$4$1$1;->this$2:Lcom/huawei/nfc/NFCOpenApiImpl$4$1;

    iput-boolean p2, p0, Lcom/huawei/nfc/NFCOpenApiImpl$4$1$1;->val$isSuccess:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 256
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl$4$1$1;->this$2:Lcom/huawei/nfc/NFCOpenApiImpl$4$1;

    iget-object v0, v0, Lcom/huawei/nfc/NFCOpenApiImpl$4$1;->this$1:Lcom/huawei/nfc/NFCOpenApiImpl$4;

    iget-object v0, v0, Lcom/huawei/nfc/NFCOpenApiImpl$4;->this$0:Lcom/huawei/nfc/NFCOpenApiImpl;

    iget-boolean v1, p0, Lcom/huawei/nfc/NFCOpenApiImpl$4$1$1;->val$isSuccess:Z

    iget-object v2, p0, Lcom/huawei/nfc/NFCOpenApiImpl$4$1$1;->this$2:Lcom/huawei/nfc/NFCOpenApiImpl$4$1;

    iget-object v2, v2, Lcom/huawei/nfc/NFCOpenApiImpl$4$1;->this$1:Lcom/huawei/nfc/NFCOpenApiImpl$4;

    iget-object v2, v2, Lcom/huawei/nfc/NFCOpenApiImpl$4;->val$activity:Landroid/app/Activity;

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/NFCOpenApiImpl;->access$000(Lcom/huawei/nfc/NFCOpenApiImpl;ZLandroid/app/Activity;)V

    .line 257
    return-void
.end method

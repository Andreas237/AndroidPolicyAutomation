.class Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->showDialogUnlock(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V
    .locals 0

    .line 438
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$7;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 441
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$7;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$1500(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 442
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$7;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$1502(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;Lo/egy;)Lo/egy;

    .line 443
    return-void
.end method

.class Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$6;
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

    .line 445
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 448
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$1500(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 449
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$1400(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V

    .line 450
    return-void
.end method

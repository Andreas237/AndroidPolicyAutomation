.class Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dsx$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->skipToBankCardCaptureActivity()V
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

    .line 462
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$8;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRequestPermissionsResult([I)V
    .locals 4

    .line 465
    const-string v0, "CardLockScreenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestPermissionsResult "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget v0, p1, v0

    if-nez v0, :cond_0

    .line 468
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$8;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$1600(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V

    .line 469
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$8;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->finish()V

    goto :goto_0

    .line 471
    :cond_0
    const-string v0, "CardLockScreenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no CAMERA permission start Camera"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    :goto_0
    return-void
.end method

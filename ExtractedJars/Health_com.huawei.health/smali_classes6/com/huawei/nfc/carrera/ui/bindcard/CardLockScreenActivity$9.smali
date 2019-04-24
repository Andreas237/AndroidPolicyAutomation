.class Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->goToBankCardCaptureActivity()V
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

    .line 484
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$9;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCardBackPressed()V
    .locals 0

    .line 504
    return-void
.end method

.method public onIndetify(Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;)V
    .locals 4

    .line 487
    const-string v0, "CardLockScreenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goToBankCardCaptureActivity onIndetify"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 488
    if-eqz p1, :cond_0

    .line 489
    const-string v0, "CardLockScreenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onIndetify cardIdentifyInfo in not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$9;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$1700(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;)V

    .line 492
    :cond_0
    return-void
.end method

.method public onSwitch2Input()V
    .locals 4

    .line 496
    const-string v0, "CardLockScreenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goToBankCardCaptureActivity onSwitch2Input"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$9;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$1700(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;)V

    .line 498
    return-void
.end method

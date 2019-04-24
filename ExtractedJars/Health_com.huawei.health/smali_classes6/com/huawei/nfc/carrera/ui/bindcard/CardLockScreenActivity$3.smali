.class Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$3;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;
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

    .line 362
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public dispatchMessage(Landroid/os/Message;)V
    .locals 2

    .line 365
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 366
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_loading:I

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$500(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;I)V

    goto :goto_0

    .line 367
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 368
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$600(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V

    goto :goto_0

    .line 369
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_2

    .line 371
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget v1, v1, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockscreenStatus:I

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$700(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;I)V

    goto :goto_0

    .line 372
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x4

    if-ne v1, v0, :cond_3

    .line 373
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$800(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V

    goto :goto_0

    .line 374
    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x5

    if-ne v1, v0, :cond_4

    .line 375
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_nullify_card_nullifying:I

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$900(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;I)V

    goto :goto_0

    .line 376
    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x6

    if-ne v1, v0, :cond_5

    .line 377
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$1000(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$1100(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;Ljava/lang/String;)V

    goto :goto_0

    .line 378
    :cond_5
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x7

    if-ne v1, v0, :cond_6

    .line 379
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$1200(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V

    .line 381
    :cond_6
    :goto_0
    return-void
.end method

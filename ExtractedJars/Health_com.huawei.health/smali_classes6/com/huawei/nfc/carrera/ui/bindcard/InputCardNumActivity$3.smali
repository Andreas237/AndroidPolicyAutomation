.class Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->initKeyBroardView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)V
    .locals 0

    .line 365
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 369
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lcom/huawei/pay/ui/widget/ClearEditText;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/huawei/pay/ui/widget/ClearEditText;->isTouchRightImg(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 372
    const/4 v0, 0x0

    return v0

    .line 374
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$300(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 376
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$300(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/HwPayKeyBoardView;->setVisibility(I)V

    .line 379
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 381
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$200(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lo/egd;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 385
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)Lcom/huawei/pay/ui/widget/ClearEditText;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/huawei/pay/ui/widget/ClearEditText;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 386
    const/4 v0, 0x1

    return v0
.end method

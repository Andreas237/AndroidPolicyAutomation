.class Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->initKeyBoard(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$1;->this$0:Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 138
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 140
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText$1;->this$0:Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/ui/widget/CUPEditText;->showSafeKeyboard(Landroid/view/View;)V

    .line 142
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

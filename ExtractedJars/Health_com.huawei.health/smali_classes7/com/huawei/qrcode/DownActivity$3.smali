.class Lcom/huawei/qrcode/DownActivity$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/qrcode/DownActivity;->showDownAppRemindDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/DownActivity;


# direct methods
.method constructor <init>(Lcom/huawei/qrcode/DownActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/DownActivity$3;->this$0:Lcom/huawei/qrcode/DownActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 2

    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity$3;->this$0:Lcom/huawei/qrcode/DownActivity;

    invoke-virtual {v0}, Lcom/huawei/qrcode/DownActivity;->finish()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.class Lcom/huawei/qrcode/DownActivity$DialogOnKeyListener;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/qrcode/DownActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "DialogOnKeyListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/DownActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/qrcode/DownActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/DownActivity$DialogOnKeyListener;->this$0:Lcom/huawei/qrcode/DownActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/qrcode/DownActivity;Lcom/huawei/qrcode/DownActivity$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/DownActivity$DialogOnKeyListener;-><init>(Lcom/huawei/qrcode/DownActivity;)V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity$DialogOnKeyListener;->this$0:Lcom/huawei/qrcode/DownActivity;

    invoke-static {v0}, Lcom/huawei/qrcode/DownActivity;->access$500(Lcom/huawei/qrcode/DownActivity;)V

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

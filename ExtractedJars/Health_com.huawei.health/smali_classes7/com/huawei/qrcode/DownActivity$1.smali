.class Lcom/huawei/qrcode/DownActivity$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


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

    iput-object p1, p0, Lcom/huawei/qrcode/DownActivity$1;->this$0:Lcom/huawei/qrcode/DownActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity$1;->this$0:Lcom/huawei/qrcode/DownActivity;

    invoke-static {v0}, Lcom/huawei/qrcode/DownActivity;->access$100(Lcom/huawei/qrcode/DownActivity;)V

    return-void
.end method

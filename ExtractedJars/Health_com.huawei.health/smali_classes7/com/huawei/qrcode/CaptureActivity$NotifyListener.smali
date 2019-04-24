.class Lcom/huawei/qrcode/CaptureActivity$NotifyListener;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/qrcode/logic/INotifyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/qrcode/CaptureActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "NotifyListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/CaptureActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/qrcode/CaptureActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/CaptureActivity$NotifyListener;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/qrcode/CaptureActivity;Lcom/huawei/qrcode/CaptureActivity$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/CaptureActivity$NotifyListener;-><init>(Lcom/huawei/qrcode/CaptureActivity;)V

    return-void
.end method


# virtual methods
.method public onNotifyCallBack()V
    .locals 2

    const-string v0, "CaptureActivity NotifyListener notifyCallApp."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity$NotifyListener;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-static {v0}, Lcom/huawei/qrcode/CaptureActivity;->access$300(Lcom/huawei/qrcode/CaptureActivity;)V

    return-void
.end method

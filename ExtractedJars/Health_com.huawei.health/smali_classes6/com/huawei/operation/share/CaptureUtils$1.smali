.class Lcom/huawei/operation/share/CaptureUtils$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/share/CaptureUtils;->capture(Landroid/webkit/WebView;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/share/CaptureUtils;


# direct methods
.method constructor <init>(Lcom/huawei/operation/share/CaptureUtils;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/operation/share/CaptureUtils$1;->this$0:Lcom/huawei/operation/share/CaptureUtils;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 61
    iget-object v0, p0, Lcom/huawei/operation/share/CaptureUtils$1;->this$0:Lcom/huawei/operation/share/CaptureUtils;

    invoke-static {v0}, Lcom/huawei/operation/share/CaptureUtils;->access$000(Lcom/huawei/operation/share/CaptureUtils;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 62
    iget-object v0, p0, Lcom/huawei/operation/share/CaptureUtils$1;->this$0:Lcom/huawei/operation/share/CaptureUtils;

    invoke-static {v0}, Lcom/huawei/operation/share/CaptureUtils;->access$100(Lcom/huawei/operation/share/CaptureUtils;)Landroid/widget/Toast;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 63
    iget-object v0, p0, Lcom/huawei/operation/share/CaptureUtils$1;->this$0:Lcom/huawei/operation/share/CaptureUtils;

    iget-object v1, p0, Lcom/huawei/operation/share/CaptureUtils$1;->this$0:Lcom/huawei/operation/share/CaptureUtils;

    invoke-static {v1}, Lcom/huawei/operation/share/CaptureUtils;->access$000(Lcom/huawei/operation/share/CaptureUtils;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/operation/share/CaptureUtils$1;->this$0:Lcom/huawei/operation/share/CaptureUtils;

    invoke-static {v2}, Lcom/huawei/operation/share/CaptureUtils;->access$000(Lcom/huawei/operation/share/CaptureUtils;)Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/huawei/ui/commonui/R$string;->IDS_sns_waiting:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/operation/share/CaptureUtils;->access$102(Lcom/huawei/operation/share/CaptureUtils;Landroid/widget/Toast;)Landroid/widget/Toast;

    .line 65
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/share/CaptureUtils$1;->this$0:Lcom/huawei/operation/share/CaptureUtils;

    invoke-static {v0}, Lcom/huawei/operation/share/CaptureUtils;->access$100(Lcom/huawei/operation/share/CaptureUtils;)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 67
    :cond_1
    return-void
.end method

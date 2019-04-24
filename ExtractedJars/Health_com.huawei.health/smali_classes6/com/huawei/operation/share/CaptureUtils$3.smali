.class Lcom/huawei/operation/share/CaptureUtils$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/share/CaptureUtils;->doResponse(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V
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

    .line 226
    iput-object p1, p0, Lcom/huawei/operation/share/CaptureUtils$3;->this$0:Lcom/huawei/operation/share/CaptureUtils;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 229
    iget-object v0, p0, Lcom/huawei/operation/share/CaptureUtils$3;->this$0:Lcom/huawei/operation/share/CaptureUtils;

    invoke-static {v0}, Lcom/huawei/operation/share/CaptureUtils;->access$100(Lcom/huawei/operation/share/CaptureUtils;)Landroid/widget/Toast;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 230
    iget-object v0, p0, Lcom/huawei/operation/share/CaptureUtils$3;->this$0:Lcom/huawei/operation/share/CaptureUtils;

    invoke-static {v0}, Lcom/huawei/operation/share/CaptureUtils;->access$100(Lcom/huawei/operation/share/CaptureUtils;)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    .line 231
    :cond_0
    return-void
.end method

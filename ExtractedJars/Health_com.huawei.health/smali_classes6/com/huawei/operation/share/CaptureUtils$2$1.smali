.class Lcom/huawei/operation/share/CaptureUtils$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/share/CaptureUtils$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/operation/share/CaptureUtils$2;


# direct methods
.method constructor <init>(Lcom/huawei/operation/share/CaptureUtils$2;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/operation/share/CaptureUtils$2$1;->this$1:Lcom/huawei/operation/share/CaptureUtils$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 75
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/huawei/operation/share/CaptureUtils$2$1;->this$1:Lcom/huawei/operation/share/CaptureUtils$2;

    iget-object v0, v0, Lcom/huawei/operation/share/CaptureUtils$2;->this$0:Lcom/huawei/operation/share/CaptureUtils;

    iget-object v1, p0, Lcom/huawei/operation/share/CaptureUtils$2$1;->this$1:Lcom/huawei/operation/share/CaptureUtils$2;

    iget-object v1, v1, Lcom/huawei/operation/share/CaptureUtils$2;->val$webView:Landroid/webkit/WebView;

    iget-object v2, p0, Lcom/huawei/operation/share/CaptureUtils$2$1;->this$1:Lcom/huawei/operation/share/CaptureUtils$2;

    iget-object v2, v2, Lcom/huawei/operation/share/CaptureUtils$2;->val$functionRes:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, p1, v3}, Lcom/huawei/operation/share/CaptureUtils;->access$200(Lcom/huawei/operation/share/CaptureUtils;Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V

    goto :goto_0

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/share/CaptureUtils$2$1;->this$1:Lcom/huawei/operation/share/CaptureUtils$2;

    iget-object v0, v0, Lcom/huawei/operation/share/CaptureUtils$2;->this$0:Lcom/huawei/operation/share/CaptureUtils;

    iget-object v1, p0, Lcom/huawei/operation/share/CaptureUtils$2$1;->this$1:Lcom/huawei/operation/share/CaptureUtils$2;

    iget-object v1, v1, Lcom/huawei/operation/share/CaptureUtils$2;->val$webView:Landroid/webkit/WebView;

    move-object v2, p2

    check-cast v2, Landroid/graphics/Bitmap;

    iget-object v3, p0, Lcom/huawei/operation/share/CaptureUtils$2$1;->this$1:Lcom/huawei/operation/share/CaptureUtils$2;

    iget-object v3, v3, Lcom/huawei/operation/share/CaptureUtils$2;->val$functionRes:Ljava/lang/String;

    invoke-static {v0, v1, p1, v2, v3}, Lcom/huawei/operation/share/CaptureUtils;->access$300(Lcom/huawei/operation/share/CaptureUtils;Landroid/webkit/WebView;ILandroid/graphics/Bitmap;Ljava/lang/String;)V

    .line 80
    :goto_0
    return-void
.end method

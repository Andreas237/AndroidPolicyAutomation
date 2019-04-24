.class Lcom/huawei/operation/share/CaptureUtils$2;
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

.field final synthetic val$functionRes:Ljava/lang/String;

.field final synthetic val$webView:Landroid/webkit/WebView;


# direct methods
.method constructor <init>(Lcom/huawei/operation/share/CaptureUtils;Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/operation/share/CaptureUtils$2;->this$0:Lcom/huawei/operation/share/CaptureUtils;

    iput-object p2, p0, Lcom/huawei/operation/share/CaptureUtils$2;->val$webView:Landroid/webkit/WebView;

    iput-object p3, p0, Lcom/huawei/operation/share/CaptureUtils$2;->val$functionRes:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 72
    iget-object v0, p0, Lcom/huawei/operation/share/CaptureUtils$2;->this$0:Lcom/huawei/operation/share/CaptureUtils;

    iget-object v1, p0, Lcom/huawei/operation/share/CaptureUtils$2;->val$webView:Landroid/webkit/WebView;

    new-instance v2, Lcom/huawei/operation/share/CaptureUtils$2$1;

    invoke-direct {v2, p0}, Lcom/huawei/operation/share/CaptureUtils$2$1;-><init>(Lcom/huawei/operation/share/CaptureUtils$2;)V

    invoke-static {v0, v1, v2}, Lcom/huawei/operation/share/CaptureUtils;->access$400(Lcom/huawei/operation/share/CaptureUtils;Landroid/webkit/WebView;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 82
    return-void
.end method

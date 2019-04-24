.class Lcom/huawei/operation/js/JsInteraction$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/js/JsInteraction;->dealCapture(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/js/JsInteraction;

.field final synthetic val$functionRes:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/operation/js/JsInteraction;Ljava/lang/String;)V
    .locals 0

    .line 1822
    iput-object p1, p0, Lcom/huawei/operation/js/JsInteraction$2;->this$0:Lcom/huawei/operation/js/JsInteraction;

    iput-object p2, p0, Lcom/huawei/operation/js/JsInteraction$2;->val$functionRes:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1825
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction$2;->this$0:Lcom/huawei/operation/js/JsInteraction;

    invoke-static {v0}, Lcom/huawei/operation/js/JsInteraction;->access$100(Lcom/huawei/operation/js/JsInteraction;)Lcom/huawei/operation/adapter/OnCaptureCallback;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/js/JsInteraction$2;->val$functionRes:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/operation/adapter/OnCaptureCallback;->onCapture(Ljava/lang/String;)V

    .line 1826
    return-void
.end method

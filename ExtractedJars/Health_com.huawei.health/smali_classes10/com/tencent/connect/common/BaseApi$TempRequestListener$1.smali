.class Lcom/tencent/connect/common/BaseApi$TempRequestListener$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/tencent/connect/common/BaseApi$TempRequestListener;

.field final synthetic val$this$0:Lcom/tencent/connect/common/BaseApi;


# direct methods
.method constructor <init>(Lcom/tencent/connect/common/BaseApi$TempRequestListener;Landroid/os/Looper;Lcom/tencent/connect/common/BaseApi;)V
    .locals 0

    .line 422
    iput-object p1, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener$1;->this$1:Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    iput-object p3, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener$1;->val$this$0:Lcom/tencent/connect/common/BaseApi;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 425
    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_0

    .line 426
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener$1;->this$1:Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    invoke-static {v0}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->access$000(Lcom/tencent/connect/common/BaseApi$TempRequestListener;)Lcom/tencent/tauth/IUiListener;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V

    goto :goto_0

    .line 428
    :cond_0
    iget-object v0, p0, Lcom/tencent/connect/common/BaseApi$TempRequestListener$1;->this$1:Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    invoke-static {v0}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->access$000(Lcom/tencent/connect/common/BaseApi$TempRequestListener;)Lcom/tencent/tauth/IUiListener;

    move-result-object v0

    new-instance v1, Lcom/tencent/tauth/UiError;

    iget v2, p1, Landroid/os/Message;->what:I

    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 430
    :goto_0
    return-void
.end method

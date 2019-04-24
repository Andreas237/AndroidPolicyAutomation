.class Lcom/huawei/operation/view/CustomWebView$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/operation/view/CustomWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/view/CustomWebView;


# direct methods
.method constructor <init>(Lcom/huawei/operation/view/CustomWebView;)V
    .locals 0

    .line 334
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView$1;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 337
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 338
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 340
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$1;->this$0:Lcom/huawei/operation/view/CustomWebView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->access$002(Lcom/huawei/operation/view/CustomWebView;Z)Z

    .line 341
    .line 345
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0xfa1 -> :sswitch_0
    .end sparse-switch
.end method

.class Lcom/tencent/open/PKDialog$THandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/open/PKDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "THandler"
.end annotation


# instance fields
.field private mL:Lcom/tencent/open/PKDialog$OnTimeListener;

.field final synthetic this$0:Lcom/tencent/open/PKDialog;


# direct methods
.method public constructor <init>(Lcom/tencent/open/PKDialog;Lcom/tencent/open/PKDialog$OnTimeListener;Landroid/os/Looper;)V
    .locals 0

    .line 393
    iput-object p1, p0, Lcom/tencent/open/PKDialog$THandler;->this$0:Lcom/tencent/open/PKDialog;

    .line 394
    invoke-direct {p0, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 395
    iput-object p2, p0, Lcom/tencent/open/PKDialog$THandler;->mL:Lcom/tencent/open/PKDialog$OnTimeListener;

    .line 396
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 400
    const-string v0, "PKDialog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "msg = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 401
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 403
    :pswitch_0
    iget-object v0, p0, Lcom/tencent/open/PKDialog$THandler;->mL:Lcom/tencent/open/PKDialog$OnTimeListener;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/tencent/open/PKDialog$OnTimeListener;->access$700(Lcom/tencent/open/PKDialog$OnTimeListener;Ljava/lang/String;)V

    .line 404
    goto :goto_0

    .line 407
    :pswitch_1
    iget-object v0, p0, Lcom/tencent/open/PKDialog$THandler;->mL:Lcom/tencent/open/PKDialog$OnTimeListener;

    invoke-virtual {v0}, Lcom/tencent/open/PKDialog$OnTimeListener;->onCancel()V

    .line 408
    goto :goto_0

    .line 413
    :pswitch_2
    iget-object v0, p0, Lcom/tencent/open/PKDialog$THandler;->this$0:Lcom/tencent/open/PKDialog;

    invoke-static {v0}, Lcom/tencent/open/PKDialog;->access$400(Lcom/tencent/open/PKDialog;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/open/PKDialog$THandler;->this$0:Lcom/tencent/open/PKDialog;

    invoke-static {v0}, Lcom/tencent/open/PKDialog;->access$400(Lcom/tencent/open/PKDialog;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 414
    iget-object v0, p0, Lcom/tencent/open/PKDialog$THandler;->this$0:Lcom/tencent/open/PKDialog;

    invoke-static {v0}, Lcom/tencent/open/PKDialog;->access$400(Lcom/tencent/open/PKDialog;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/tencent/open/PKDialog;->access$800(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 423
    :pswitch_3
    goto :goto_0

    .line 425
    :pswitch_4
    iget-object v0, p0, Lcom/tencent/open/PKDialog$THandler;->this$0:Lcom/tencent/open/PKDialog;

    invoke-static {v0}, Lcom/tencent/open/PKDialog;->access$400(Lcom/tencent/open/PKDialog;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/open/PKDialog$THandler;->this$0:Lcom/tencent/open/PKDialog;

    invoke-static {v0}, Lcom/tencent/open/PKDialog;->access$400(Lcom/tencent/open/PKDialog;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 426
    iget-object v0, p0, Lcom/tencent/open/PKDialog$THandler;->this$0:Lcom/tencent/open/PKDialog;

    invoke-static {v0}, Lcom/tencent/open/PKDialog;->access$400(Lcom/tencent/open/PKDialog;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/tencent/open/PKDialog;->access$900(Landroid/content/Context;Ljava/lang/String;)V

    .line 433
    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

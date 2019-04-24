.class Lcom/tencent/connect/auth/AuthDialog$THandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/connect/auth/AuthDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "THandler"
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/connect/auth/AuthDialog;

.field private b:Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;


# direct methods
.method public constructor <init>(Lcom/tencent/connect/auth/AuthDialog;Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;Landroid/os/Looper;)V
    .locals 0

    .line 168
    iput-object p1, p0, Lcom/tencent/connect/auth/AuthDialog$THandler;->a:Lcom/tencent/connect/auth/AuthDialog;

    .line 169
    invoke-direct {p0, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 170
    iput-object p2, p0, Lcom/tencent/connect/auth/AuthDialog$THandler;->b:Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;

    .line 171
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 175
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 177
    :pswitch_0
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$THandler;->b:Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->a(Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;Ljava/lang/String;)V

    .line 178
    goto :goto_0

    .line 181
    :pswitch_1
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$THandler;->b:Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->onCancel()V

    .line 182
    goto :goto_0

    .line 187
    :pswitch_2
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$THandler;->a:Lcom/tencent/connect/auth/AuthDialog;

    invoke-static {v0}, Lcom/tencent/connect/auth/AuthDialog;->a(Lcom/tencent/connect/auth/AuthDialog;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/tencent/connect/auth/AuthDialog;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 188
    .line 192
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

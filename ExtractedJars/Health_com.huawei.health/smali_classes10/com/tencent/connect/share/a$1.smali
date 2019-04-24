.class final Lcom/tencent/connect/share/a$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/connect/share/a;->a(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/open/utils/AsynLoadImgBack;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/open/utils/AsynLoadImgBack;


# direct methods
.method constructor <init>(Landroid/os/Looper;Lcom/tencent/open/utils/AsynLoadImgBack;)V
    .locals 0

    .line 58
    iput-object p2, p0, Lcom/tencent/connect/share/a$1;->a:Lcom/tencent/open/utils/AsynLoadImgBack;

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 62
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 64
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 65
    iget-object v0, p0, Lcom/tencent/connect/share/a$1;->a:Lcom/tencent/open/utils/AsynLoadImgBack;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v2}, Lcom/tencent/open/utils/AsynLoadImgBack;->saved(ILjava/lang/String;)V

    .line 66
    return-void

    .line 68
    :sswitch_1
    iget v3, p1, Landroid/os/Message;->arg1:I

    .line 69
    iget-object v0, p0, Lcom/tencent/connect/share/a$1;->a:Lcom/tencent/open/utils/AsynLoadImgBack;

    const/4 v1, 0x0

    invoke-interface {v0, v3, v1}, Lcom/tencent/open/utils/AsynLoadImgBack;->saved(ILjava/lang/String;)V

    .line 70
    return-void

    .line 72
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 73
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x66 -> :sswitch_1
    .end sparse-switch
.end method

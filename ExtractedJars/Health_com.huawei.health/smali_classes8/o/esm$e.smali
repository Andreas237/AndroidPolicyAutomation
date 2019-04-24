.class Lo/esm$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/esm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/esm;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/esm;)V
    .locals 1

    .line 236
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 237
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/esm$e;->b:Ljava/lang/ref/WeakReference;

    .line 238
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 248
    iget-object v0, p0, Lo/esm$e;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/esm;

    .line 249
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 250
    return-void

    .line 253
    :cond_0
    invoke-static {v1}, Lo/esm;->e(Lo/esm;)Lo/esm$a;

    move-result-object v2

    .line 254
    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    .line 255
    return-void

    .line 258
    :cond_1
    new-instance v3, Landroid/os/Message;

    invoke-direct {v3}, Landroid/os/Message;-><init>()V

    .line 259
    if-nez p1, :cond_2

    .line 260
    const/4 v0, 0x1

    iput v0, v3, Landroid/os/Message;->what:I

    .line 261
    iput-object p2, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    goto :goto_0

    .line 263
    :cond_2
    const/4 v0, 0x4

    iput v0, v3, Landroid/os/Message;->what:I

    .line 265
    :goto_0
    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 266
    return-void
.end method

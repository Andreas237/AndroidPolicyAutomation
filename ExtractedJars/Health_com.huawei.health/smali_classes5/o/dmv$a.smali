.class Lo/dmv$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dmv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/dmv;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/os/Looper;Lo/dmv;)V
    .locals 1

    .line 169
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 170
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/dmv$a;->a:Ljava/lang/ref/WeakReference;

    .line 171
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Looper;Lo/dmv;Lo/dmv$5;)V
    .locals 0

    .line 164
    invoke-direct {p0, p1, p2}, Lo/dmv$a;-><init>(Landroid/os/Looper;Lo/dmv;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 175
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 177
    iget-object v0, p0, Lo/dmv$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dmv;

    .line 179
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 181
    :sswitch_0
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lo/dmv;->e(Lo/dmv;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 182
    goto :goto_1

    .line 184
    :goto_0
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStressErrorHandler, unknown error code"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2711 -> :sswitch_0
    .end sparse-switch
.end method

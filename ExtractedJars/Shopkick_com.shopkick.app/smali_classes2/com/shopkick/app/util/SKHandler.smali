.class public Lcom/shopkick/app/util/SKHandler;
.super Ljava/lang/Object;
.source "SKHandler.java"


# instance fields
.field handler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/shopkick/app/util/SKHandler;->handler:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public post(Ljava/lang/Runnable;)Z
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/shopkick/app/util/SKHandler;->handler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 20
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public postDelayed(Ljava/lang/Runnable;J)Z
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/shopkick/app/util/SKHandler;->handler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 28
    invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

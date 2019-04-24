.class Lcom/huawei/android/quickaction/ActionIcon$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/android/quickaction/ActionIcon;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final a:Landroid/content/Context;

.field final synthetic c:Lcom/huawei/android/quickaction/ActionIcon;

.field final d:Landroid/os/Message;


# direct methods
.method public constructor <init>(Lcom/huawei/android/quickaction/ActionIcon;Landroid/content/Context;Landroid/os/Handler;Lcom/huawei/android/quickaction/ActionIcon$e;)V
    .locals 1

    .line 461
    iput-object p1, p0, Lcom/huawei/android/quickaction/ActionIcon$a;->c:Lcom/huawei/android/quickaction/ActionIcon;

    .line 460
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 462
    iput-object p2, p0, Lcom/huawei/android/quickaction/ActionIcon$a;->a:Landroid/content/Context;

    .line 463
    new-instance v0, Lcom/huawei/android/quickaction/ActionIcon$a$4;

    invoke-direct {v0, p0, p4}, Lcom/huawei/android/quickaction/ActionIcon$a$4;-><init>(Lcom/huawei/android/quickaction/ActionIcon$a;Lcom/huawei/android/quickaction/ActionIcon$e;)V

    invoke-static {p3, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;Ljava/lang/Runnable;)Landroid/os/Message;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/android/quickaction/ActionIcon$a;->d:Landroid/os/Message;

    .line 469
    return-void
.end method

.method public constructor <init>(Lcom/huawei/android/quickaction/ActionIcon;Landroid/content/Context;Landroid/os/Message;)V
    .locals 0

    .line 471
    iput-object p1, p0, Lcom/huawei/android/quickaction/ActionIcon$a;->c:Lcom/huawei/android/quickaction/ActionIcon;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 472
    iput-object p2, p0, Lcom/huawei/android/quickaction/ActionIcon$a;->a:Landroid/content/Context;

    .line 473
    iput-object p3, p0, Lcom/huawei/android/quickaction/ActionIcon$a;->d:Landroid/os/Message;

    .line 474
    return-void
.end method


# virtual methods
.method public e()V
    .locals 1

    .line 483
    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 484
    return-void
.end method

.method public run()V
    .locals 3

    .line 478
    iget-object v0, p0, Lcom/huawei/android/quickaction/ActionIcon$a;->d:Landroid/os/Message;

    iget-object v1, p0, Lcom/huawei/android/quickaction/ActionIcon$a;->c:Lcom/huawei/android/quickaction/ActionIcon;

    iget-object v2, p0, Lcom/huawei/android/quickaction/ActionIcon$a;->a:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/huawei/android/quickaction/ActionIcon;->loadDrawable(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 479
    iget-object v0, p0, Lcom/huawei/android/quickaction/ActionIcon$a;->d:Landroid/os/Message;

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 480
    return-void
.end method

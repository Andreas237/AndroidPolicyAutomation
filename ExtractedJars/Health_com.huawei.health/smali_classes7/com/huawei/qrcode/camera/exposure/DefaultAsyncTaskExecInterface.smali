.class public final Lcom/huawei/qrcode/camera/exposure/DefaultAsyncTaskExecInterface;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/qrcode/camera/exposure/AsyncTaskExecInterface;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Landroid/os/AsyncTask<TT;**>;[TT;)V"
        }
    .end annotation

    invoke-virtual {p1, p2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.class Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)V
    .locals 1

    .line 116
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 117
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$d;->a:Ljava/lang/ref/WeakReference;

    .line 118
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 122
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 123
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$d;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    .line 124
    if-nez v1, :cond_0

    .line 125
    return-void

    .line 128
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 130
    :sswitch_0
    invoke-static {v1}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->e(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)V

    .line 131
    goto :goto_0

    .line 134
    :sswitch_1
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->e(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;Landroid/os/Message;)V

    .line 135
    goto :goto_0

    .line 138
    :sswitch_2
    invoke-static {v1}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->a(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)V

    .line 139
    .line 144
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x109 -> :sswitch_1
        0x123 -> :sswitch_0
        0x199 -> :sswitch_2
    .end sparse-switch
.end method

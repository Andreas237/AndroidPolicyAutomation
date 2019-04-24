.class Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)V
    .locals 1

    .line 141
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 142
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity$c;->e:Ljava/lang/ref/WeakReference;

    .line 143
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 148
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 149
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity$c;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;

    .line 150
    if-nez v1, :cond_0

    .line 152
    return-void

    .line 155
    :cond_0
    invoke-static {v1, p1, v1}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->a(Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;Landroid/os/Message;Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 158
    return-void

    .line 161
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 165
    :sswitch_0
    invoke-static {v1, p1, v1}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b(Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;Landroid/os/Message;Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)V

    .line 166
    goto :goto_0

    .line 170
    :sswitch_1
    invoke-static {v1, p1, v1}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->c(Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;Landroid/os/Message;Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)V

    .line 171
    goto :goto_0

    .line 175
    :sswitch_2
    invoke-static {v1}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b(Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)V

    .line 176
    goto :goto_0

    .line 180
    :sswitch_3
    invoke-static {v1}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->e(Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)V

    .line 181
    goto :goto_0

    .line 185
    :sswitch_4
    invoke-static {v1}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->c(Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)V

    .line 186
    goto :goto_0

    .line 190
    :sswitch_5
    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->finish()V

    .line 191
    .line 196
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x81 -> :sswitch_3
        0x106 -> :sswitch_5
        0x107 -> :sswitch_0
        0x109 -> :sswitch_1
        0x121 -> :sswitch_2
        0x123 -> :sswitch_4
    .end sparse-switch
.end method

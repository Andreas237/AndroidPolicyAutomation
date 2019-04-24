.class Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V
    .locals 1

    .line 1172
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 1173
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$c;->a:Ljava/lang/ref/WeakReference;

    .line 1174
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 1179
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1181
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$c;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    .line 1182
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1184
    :cond_0
    return-void

    .line 1186
    :cond_1
    invoke-virtual {v1, v1, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;Landroid/os/Message;)Z

    move-result v2

    .line 1187
    if-eqz v2, :cond_2

    .line 1189
    return-void

    .line 1191
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1200
    :sswitch_0
    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->b(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V

    .line 1201
    goto :goto_0

    .line 1206
    :sswitch_1
    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->a(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V

    .line 1207
    .line 1212
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x259 -> :sswitch_1
        0x7e5 -> :sswitch_0
    .end sparse-switch
.end method

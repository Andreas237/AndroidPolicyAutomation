.class Lcom/huawei/hwid/api/common/a$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/api/common/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/api/common/a;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/api/common/a;Landroid/os/Looper;)V
    .locals 0

    .line 155
    iput-object p1, p0, Lcom/huawei/hwid/api/common/a$1;->a:Lcom/huawei/hwid/api/common/a;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 158
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 159
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xbb9

    if-ne v0, v1, :cond_1

    .line 160
    const-string v0, "AIDLClientManager"

    const-string v1, "msg.what=MSG_ADD_TASK"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a$1;->a:Lcom/huawei/hwid/api/common/a;

    iget-object v0, v0, Lcom/huawei/hwid/api/common/a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 164
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a$1;->a:Lcom/huawei/hwid/api/common/a;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/a;->a(Lcom/huawei/hwid/api/common/a;)V

    goto/16 :goto_0

    .line 165
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a$1;->a:Lcom/huawei/hwid/api/common/a;

    iget-object v0, v0, Lcom/huawei/hwid/api/common/a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-nez v0, :cond_5

    .line 167
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a$1;->a:Lcom/huawei/hwid/api/common/a;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/a;->b(Lcom/huawei/hwid/api/common/a;)V

    goto/16 :goto_0

    .line 169
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xbba

    if-ne v0, v1, :cond_2

    .line 171
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a$1;->a:Lcom/huawei/hwid/api/common/a;

    iget-object v0, v0, Lcom/huawei/hwid/api/common/a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 172
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a$1;->a:Lcom/huawei/hwid/api/common/a;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/a;->a(Lcom/huawei/hwid/api/common/a;)V

    goto :goto_0

    .line 173
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xbbb

    if-ne v0, v1, :cond_3

    .line 174
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a$1;->a:Lcom/huawei/hwid/api/common/a;

    iget-object v0, v0, Lcom/huawei/hwid/api/common/a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 175
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a$1;->a:Lcom/huawei/hwid/api/common/a;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/a;->c(Lcom/huawei/hwid/api/common/a;)V

    goto :goto_0

    .line 176
    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xbbc

    if-ne v0, v1, :cond_4

    .line 178
    const-string v0, "AIDLClientManager"

    const-string v1, "MSG_FINISH_TASK, unbind"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a$1;->a:Lcom/huawei/hwid/api/common/a;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/a;->d(Lcom/huawei/hwid/api/common/a;)V

    .line 180
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a$1;->a:Lcom/huawei/hwid/api/common/a;

    iget-object v0, v0, Lcom/huawei/hwid/api/common/a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    goto :goto_0

    .line 181
    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xbbd

    if-ne v0, v1, :cond_5

    .line 183
    const-string v0, "AIDLClientManager"

    const-string v1, "MSG_START_SERVICE_FAILED all login return failed"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a$1;->a:Lcom/huawei/hwid/api/common/a;

    iget-object v0, v0, Lcom/huawei/hwid/api/common/a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 185
    iget-object v0, p0, Lcom/huawei/hwid/api/common/a$1;->a:Lcom/huawei/hwid/api/common/a;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/a;->e(Lcom/huawei/hwid/api/common/a;)V

    .line 187
    :cond_5
    :goto_0
    return-void
.end method

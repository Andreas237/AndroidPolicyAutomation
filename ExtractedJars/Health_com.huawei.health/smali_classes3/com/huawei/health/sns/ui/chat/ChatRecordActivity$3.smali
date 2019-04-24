.class Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)V
    .locals 0

    .line 290
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$3;->a:Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 290
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$3;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 294
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$3;->a:Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->e(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/apm;->b(J)Ljava/util/ArrayList;

    move-result-object v3

    .line 296
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 298
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 301
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$3;->a:Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->c(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 302
    const/4 v0, 0x1

    iput v0, v4, Landroid/os/Message;->what:I

    .line 303
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 304
    const-string v0, "bundleKeyRecordMessageList"

    invoke-virtual {v5, v0, v3}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 305
    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 306
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity$3;->a:Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;->c(Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 307
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

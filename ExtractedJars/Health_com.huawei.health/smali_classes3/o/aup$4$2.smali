.class Lo/aup$4$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aup$4;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Ljava/lang/Integer;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/aup$4;


# direct methods
.method constructor <init>(Lo/aup$4;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lo/aup$4$2;->a:Lo/aup$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 104
    invoke-interface {p1}, Lo/bqy;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 105
    invoke-static {}, Lo/aup;->b()I

    move-result v0

    if-ne v0, v4, :cond_1

    .line 108
    iget-object v0, p0, Lo/aup$4$2;->a:Lo/aup$4;

    iget-object v0, v0, Lo/aup$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 110
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    iget-object v1, p0, Lo/aup$4$2;->a:Lo/aup$4;

    iget-object v1, v1, Lo/aup$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v1}, Lo/apz;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_0

    .line 114
    :cond_0
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    iget-object v1, p0, Lo/aup$4$2;->a:Lo/aup$4;

    iget-object v1, v1, Lo/aup$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v1}, Lo/apz;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 118
    :goto_0
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/aup$4$2;->a:Lo/aup$4;

    iget-object v1, v1, Lo/aup$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v1}, Lo/apm;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 119
    return-void

    .line 121
    :cond_1
    invoke-static {}, Lo/aup;->d()I

    move-result v0

    if-ne v0, v4, :cond_2

    .line 124
    iget-object v0, p0, Lo/aup$4$2;->a:Lo/aup$4;

    iget-object v0, v0, Lo/aup$4;->c:Lo/aup;

    invoke-static {v0}, Lo/aup;->c(Lo/aup;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 126
    return-void

    .line 130
    :cond_2
    iget-object v0, p0, Lo/aup$4$2;->a:Lo/aup$4;

    iget-object v0, v0, Lo/aup$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v5

    .line 131
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "http"

    invoke-virtual {v5, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 133
    :cond_3
    iget-object v0, p0, Lo/aup$4$2;->a:Lo/aup$4;

    iget-object v0, v0, Lo/aup$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaThumbnail()Ljava/lang/String;

    move-result-object v5

    .line 134
    iget-object v0, p0, Lo/aup$4$2;->a:Lo/aup$4;

    iget-object v0, v0, Lo/aup$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v5}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaUrl(Ljava/lang/String;)V

    .line 137
    :cond_4
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 140
    iget-object v0, p0, Lo/aup$4$2;->a:Lo/aup$4;

    iget-object v0, v0, Lo/aup$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 141
    iget-object v0, p0, Lo/aup$4$2;->a:Lo/aup$4;

    iget-object v0, v0, Lo/aup$4;->c:Lo/aup;

    invoke-static {v0}, Lo/aup;->a(Lo/aup;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/aup$4$2;->a:Lo/aup$4;

    iget-object v1, v1, Lo/aup$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/aup$4$2;->a:Lo/aup$4;

    iget-object v2, v2, Lo/aup$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 143
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/aup$4$2;->a:Lo/aup$4;

    iget-object v1, v1, Lo/aup$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v1}, Lo/apm;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_1

    .line 148
    :cond_5
    iget-object v0, p0, Lo/aup$4$2;->a:Lo/aup$4;

    iget-object v0, v0, Lo/aup$4;->c:Lo/aup;

    invoke-static {v0}, Lo/aup;->a(Lo/aup;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/aup$4$2;->a:Lo/aup$4;

    iget-object v1, v1, Lo/aup$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-interface {v0, v1}, Lo/aur;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 150
    :goto_1
    return-void
.end method

.class Lo/aum$a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aum$a;->a()V
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
.field final synthetic d:Lo/aum$a;


# direct methods
.method constructor <init>(Lo/aum$a;)V
    .locals 0

    .line 207
    iput-object p1, p0, Lo/aum$a$1;->d:Lo/aum$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 207
    invoke-virtual {p0, p1}, Lo/aum$a$1;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 8

    .line 211
    const-string v0, "MediaDownload"

    const-string v1, "begin download"

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    iget-object v0, p0, Lo/aum$a$1;->d:Lo/aum$a;

    invoke-static {v0}, Lo/aum$a;->e(Lo/aum$a;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 215
    :sswitch_0
    new-instance v0, Lo/aqy;

    iget-object v1, p0, Lo/aum$a$1;->d:Lo/aum$a;

    invoke-static {v1}, Lo/aum$a;->e(Lo/aum$a;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/aum$a$1;->d:Lo/aum$a;

    invoke-static {v2}, Lo/aum$a;->e(Lo/aum$a;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    iget-object v4, p0, Lo/aum$a$1;->d:Lo/aum$a;

    invoke-static {v4}, Lo/aum$a;->e(Lo/aum$a;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaMtsUrl()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lo/aum$a$1;->d:Lo/aum$a;

    invoke-static {v5}, Lo/aum$a;->e(Lo/aum$a;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v5

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v5

    invoke-direct/range {v0 .. v5}, Lo/aqy;-><init>(Ljava/lang/String;JLjava/lang/String;I)V

    move-object v6, v0

    .line 216
    iget-object v0, p0, Lo/aum$a$1;->d:Lo/aum$a;

    invoke-static {v0}, Lo/aum$a;->e(Lo/aum$a;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaThumbFlag()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/aum$a$1;->d:Lo/aum$a;

    invoke-static {v1}, Lo/aum$a;->e(Lo/aum$a;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getProgress()I

    move-result v1

    invoke-virtual {v6, v0, v1}, Lo/aqy;->e(Ljava/lang/String;I)V

    .line 217
    invoke-static {}, Lo/aqs;->d()Lo/aqs;

    move-result-object v0

    iget-object v1, p0, Lo/aum$a$1;->d:Lo/aum$a;

    invoke-static {v1}, Lo/aum$a;->b(Lo/aum$a;)Z

    move-result v1

    iget-object v2, p0, Lo/aum$a$1;->d:Lo/aum$a;

    invoke-static {v2}, Lo/aum$a;->a(Lo/aum$a;)Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    move-result-object v2

    invoke-virtual {v0, v6, v1, v2}, Lo/aqs;->e(Lo/aqy;ZLcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;)V

    .line 218
    goto :goto_0

    .line 220
    :sswitch_1
    new-instance v0, Lo/aqy;

    iget-object v1, p0, Lo/aum$a$1;->d:Lo/aum$a;

    invoke-static {v1}, Lo/aum$a;->e(Lo/aum$a;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/aum$a$1;->d:Lo/aum$a;

    invoke-static {v2}, Lo/aum$a;->e(Lo/aum$a;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    iget-object v4, p0, Lo/aum$a$1;->d:Lo/aum$a;

    invoke-static {v4}, Lo/aum$a;->e(Lo/aum$a;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaMtsUrl()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lo/aum$a$1;->d:Lo/aum$a;

    invoke-static {v5}, Lo/aum$a;->e(Lo/aum$a;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v5

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v5

    invoke-direct/range {v0 .. v5}, Lo/aqy;-><init>(Ljava/lang/String;JLjava/lang/String;I)V

    move-object v7, v0

    .line 221
    invoke-static {}, Lo/aqs;->d()Lo/aqs;

    move-result-object v0

    iget-object v1, p0, Lo/aum$a$1;->d:Lo/aum$a;

    invoke-static {v1}, Lo/aum$a;->b(Lo/aum$a;)Z

    move-result v1

    iget-object v2, p0, Lo/aum$a$1;->d:Lo/aum$a;

    invoke-static {v2}, Lo/aum$a;->a(Lo/aum$a;)Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    move-result-object v2

    invoke-virtual {v0, v7, v1, v2}, Lo/aqs;->a(Lo/aqy;ZLcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;)V

    .line 222
    .line 225
    :goto_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0xf -> :sswitch_1
    .end sparse-switch
.end method

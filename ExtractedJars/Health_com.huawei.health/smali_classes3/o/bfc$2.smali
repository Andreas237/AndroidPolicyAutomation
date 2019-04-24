.class Lo/bfc$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bfc;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bfc$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bfc;

.field final synthetic c:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic e:Lo/bfc$a;


# direct methods
.method constructor <init>(Lo/bfc;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bfc$a;)V
    .locals 0

    .line 270
    iput-object p1, p0, Lo/bfc$2;->a:Lo/bfc;

    iput-object p2, p0, Lo/bfc$2;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object p3, p0, Lo/bfc$2;->e:Lo/bfc$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 8

    .line 274
    iget-object v0, p0, Lo/bfc$2;->a:Lo/bfc;

    iget-object v0, v0, Lo/bfc;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-boolean v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    if-eqz v0, :cond_2

    .line 276
    iget-object v0, p0, Lo/bfc$2;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgTypeData()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v5

    .line 277
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->f:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_1

    .line 279
    move-object v6, v5

    check-cast v6, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 280
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkType()I

    move-result v7

    .line 281
    const-string v0, "ShareLinkView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "OnClick LinkMessage type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",url isEmpty:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 283
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 281
    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    if-nez v7, :cond_0

    .line 287
    iget-object v0, p0, Lo/bfc$2;->a:Lo/bfc;

    iget-object v0, v0, Lo/bfc;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkAppPackage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkReqVerCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkAppID()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 289
    :cond_0
    const/4 v0, 0x1

    if-ne v7, v0, :cond_1

    .line 291
    iget-object v0, p0, Lo/bfc$2;->a:Lo/bfc;

    invoke-static {v0, v6}, Lo/bfc;->c(Lo/bfc;Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)V

    .line 294
    :cond_1
    :goto_0
    goto :goto_1

    .line 297
    :cond_2
    iget-object v0, p0, Lo/bfc$2;->a:Lo/bfc;

    iget-object v1, p0, Lo/bfc$2;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/bfc$2;->e:Lo/bfc$a;

    invoke-virtual {v0, v1, v2}, Lo/bfc;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 299
    :goto_1
    return-void
.end method

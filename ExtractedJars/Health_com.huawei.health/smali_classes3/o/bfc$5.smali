.class Lo/bfc$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bfc;->b(Ljava/lang/String;ILcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

.field final synthetic e:Lo/bfc;


# direct methods
.method constructor <init>(Lo/bfc;Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)V
    .locals 0

    .line 395
    iput-object p1, p0, Lo/bfc$5;->e:Lo/bfc;

    iput-object p2, p0, Lo/bfc$5;->d:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 400
    iget-object v0, p0, Lo/bfc$5;->e:Lo/bfc;

    iget-object v1, p0, Lo/bfc$5;->d:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-virtual {v0, v1}, Lo/bfc;->b(Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)V

    .line 401
    return-void
.end method

.method public d()V
    .locals 2

    .line 406
    const-string v0, "ShareLinkView"

    const-string v1, "checkClickListener performCancel"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 407
    return-void
.end method

.class Lo/apz$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/apz;->c(JLcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;Ljava/lang/String;I)V
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
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

.field final synthetic c:J

.field final synthetic d:Lo/apz;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/apz;JLcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;ILjava/lang/String;)V
    .locals 0

    .line 432
    iput-object p1, p0, Lo/apz$3;->d:Lo/apz;

    iput-wide p2, p0, Lo/apz$3;->c:J

    iput-object p4, p0, Lo/apz$3;->b:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    iput p5, p0, Lo/apz$3;->e:I

    iput-object p6, p0, Lo/apz$3;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 432
    invoke-virtual {p0, p1}, Lo/apz$3;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 7

    .line 436
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/apz$3;->c:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->g(J)Z

    move-result v6

    .line 437
    iget-object v0, p0, Lo/apz$3;->d:Lo/apz;

    invoke-static {v0}, Lo/apz;->d(Lo/apz;)Lo/aqb;

    move-result-object v0

    iget-wide v1, p0, Lo/apz$3;->c:J

    iget-object v3, p0, Lo/apz$3;->b:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    iget v4, p0, Lo/apz$3;->e:I

    move v5, v6

    invoke-virtual/range {v0 .. v5}, Lo/aqb;->e(JLcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;IZ)V

    .line 438
    iget-object v0, p0, Lo/apz$3;->d:Lo/apz;

    iget-wide v1, p0, Lo/apz$3;->c:J

    iget v3, p0, Lo/apz$3;->e:I

    iget-object v4, p0, Lo/apz$3;->a:Ljava/lang/String;

    move v5, v6

    invoke-virtual/range {v0 .. v5}, Lo/apz;->b(JILjava/lang/String;Z)V

    .line 439
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

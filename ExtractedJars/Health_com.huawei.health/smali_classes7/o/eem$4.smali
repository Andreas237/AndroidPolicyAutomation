.class Lo/eem$4;
.super Lo/eei$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eem;->b(Lcom/huawei/sns/sdk/modelmsg/CommonReq;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/sns/sdk/modelmsg/CommonReq;

.field final synthetic d:Lo/eem;


# direct methods
.method constructor <init>(Lo/eem;Lcom/huawei/sns/sdk/modelmsg/CommonReq;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lo/eem$4;->d:Lo/eem;

    iput-object p2, p0, Lo/eem$4;->c:Lcom/huawei/sns/sdk/modelmsg/CommonReq;

    invoke-direct {p0}, Lo/eei$c;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lcom/huawei/sns/sdk/modelmsg/UnreadMsgResp;)V
    .locals 1

    .line 151
    iget-object v0, p0, Lo/eem$4;->c:Lcom/huawei/sns/sdk/modelmsg/CommonReq;

    iget-object v0, v0, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->handler:Lo/eeh;

    if-eqz v0, :cond_0

    .line 153
    iget-object v0, p0, Lo/eem$4;->c:Lcom/huawei/sns/sdk/modelmsg/CommonReq;

    iget-object v0, v0, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->handler:Lo/eeh;

    invoke-interface {v0, p1}, Lo/eeh;->a(Lo/edv;)V

    .line 155
    :cond_0
    return-void
.end method

.class Lo/eem$5;
.super Lo/eee$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eem;->d(Lcom/huawei/sns/sdk/modelmsg/CommonReq;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/sns/sdk/modelmsg/CommonReq;

.field final synthetic e:Lo/eem;


# direct methods
.method constructor <init>(Lo/eem;Lcom/huawei/sns/sdk/modelmsg/CommonReq;)V
    .locals 0

    .line 244
    iput-object p1, p0, Lo/eem$5;->e:Lo/eem;

    iput-object p2, p0, Lo/eem$5;->c:Lcom/huawei/sns/sdk/modelmsg/CommonReq;

    invoke-direct {p0}, Lo/eee$c;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/sns/sdk/modelmsg/FriendListResp;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 248
    iget-object v0, p0, Lo/eem$5;->c:Lcom/huawei/sns/sdk/modelmsg/CommonReq;

    iget-object v0, v0, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->handler:Lo/eeh;

    if-eqz v0, :cond_0

    .line 250
    iget-object v0, p0, Lo/eem$5;->c:Lcom/huawei/sns/sdk/modelmsg/CommonReq;

    iget-object v0, v0, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->handler:Lo/eeh;

    invoke-interface {v0, p1}, Lo/eeh;->a(Lo/edv;)V

    .line 252
    :cond_0
    return-void
.end method

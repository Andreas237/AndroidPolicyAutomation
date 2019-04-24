.class Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->k()V
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
.field final synthetic e:Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;)V
    .locals 0

    .line 339
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$5;->e:Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 339
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$5;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 343
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$5;->e:Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->c(Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;)Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->getJson()Ljava/lang/String;

    move-result-object v3

    .line 344
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$5;->e:Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->e(Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;)I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lo/apm;->i(J)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v4

    .line 345
    if-eqz v4, :cond_0

    .line 347
    invoke-virtual {v4, v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 348
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/apm;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 349
    const/4 v0, 0x1

    const/16 v1, 0x2710

    invoke-static {v0, v1, v4}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 352
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

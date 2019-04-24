.class public Lo/asw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private e:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/asw;->e:Landroid/os/Handler;

    .line 49
    iput-object p1, p0, Lo/asw;->e:Landroid/os/Handler;

    .line 50
    return-void
.end method

.method private a(ILcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/group/GroupMember;Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;)V
    .locals 3

    .line 123
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_2

    .line 126
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_0

    .line 128
    invoke-direct {p0, p3}, Lo/asw;->d(Lcom/huawei/health/sns/model/group/GroupMember;)V

    .line 130
    new-instance v0, Lo/atg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p4, Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;->grpID_:J

    invoke-virtual {v0, v1, v2}, Lo/atg;->b(J)Ljava/util/ArrayList;

    .line 131
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lo/asw;->c(III)V

    goto :goto_1

    .line 135
    :cond_0
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3f2

    if-ne v0, v1, :cond_1

    .line 137
    invoke-direct {p0, p3}, Lo/asw;->d(Lcom/huawei/health/sns/model/group/GroupMember;)V

    .line 139
    new-instance v0, Lo/atg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p4, Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;->grpID_:J

    invoke-virtual {v0, v1, v2}, Lo/atg;->b(J)Ljava/util/ArrayList;

    .line 140
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lo/asw;->c(III)V

    goto :goto_0

    .line 144
    :cond_1
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0xe2

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0}, Lo/asw;->c(III)V

    .line 146
    :goto_0
    const-string v0, "DelGroupMemberTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteGroupMember error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 151
    :cond_2
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v1, 0xaaa

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Lo/asw;->c(III)V

    .line 152
    const-string v0, "DelGroupMemberTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteGroupMember error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    :goto_1
    return-void
.end method

.method static synthetic b(Lo/asw;III)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2, p3}, Lo/asw;->c(III)V

    return-void
.end method

.method static synthetic b(Lo/asw;Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lo/asw;->d(Lcom/huawei/health/sns/model/group/GroupMember;)V

    return-void
.end method

.method private c(III)V
    .locals 2

    .line 273
    iget-object v0, p0, Lo/asw;->e:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 275
    iget-object v0, p0, Lo/asw;->e:Landroid/os/Handler;

    iget-object v1, p0, Lo/asw;->e:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 277
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/asw;ILcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/group/GroupMember;Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2, p3, p4}, Lo/asw;->a(ILcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/group/GroupMember;Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;)V

    return-void
.end method

.method private d(ILjava/util/ArrayList;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;)V"
        }
    .end annotation

    .line 222
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_4

    .line 225
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_1

    .line 227
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 229
    invoke-direct {p0, v4}, Lo/asw;->d(Lcom/huawei/health/sns/model/group/GroupMember;)V

    .line 230
    goto :goto_0

    .line 232
    :cond_0
    new-instance v0, Lo/atg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p4, Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;->grpID_:J

    invoke-virtual {v0, v1, v2}, Lo/atg;->b(J)Ljava/util/ArrayList;

    .line 233
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lo/asw;->c(III)V

    goto/16 :goto_1

    .line 237
    :cond_1
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3f2

    if-ne v0, v1, :cond_3

    .line 240
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 242
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {p0, v0}, Lo/asw;->d(Lcom/huawei/health/sns/model/group/GroupMember;)V

    .line 244
    new-instance v0, Lo/atg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p4, Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;->grpID_:J

    invoke-virtual {v0, v1, v2}, Lo/atg;->b(J)Ljava/util/ArrayList;

    .line 245
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lo/asw;->c(III)V

    .line 246
    return-void

    .line 249
    :cond_2
    new-instance v0, Lo/atg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p4, Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;->grpID_:J

    invoke-virtual {v0, v1, v2}, Lo/atg;->b(J)Ljava/util/ArrayList;

    .line 253
    :cond_3
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0xe2

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0}, Lo/asw;->c(III)V

    .line 254
    const-string v0, "DelGroupMemberTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteGroupMember error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 259
    :cond_4
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    iget v1, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v2, 0xaaa

    invoke-direct {p0, v2, v0, v1}, Lo/asw;->c(III)V

    .line 260
    const-string v0, "DelGroupMemberTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteGroupMember error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    :goto_1
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 5

    .line 163
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ath;->d(JJ)Z

    .line 164
    return-void
.end method

.method static synthetic e(Lo/asw;ILjava/util/ArrayList;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2, p3, p4}, Lo/asw;->d(ILjava/util/ArrayList;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;ILcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 1

    .line 61
    new-instance v0, Lo/asw$3;

    invoke-direct {v0, p0, p3, p2, p1}, Lo/asw$3;-><init>(Lo/asw;Lcom/huawei/health/sns/model/group/GroupMember;ILandroid/content/Context;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 110
    return-void
.end method

.method public a(Landroid/content/Context;ILjava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;ILjava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 175
    new-instance v0, Lo/asw$4;

    invoke-direct {v0, p0, p3, p2}, Lo/asw$4;-><init>(Lo/asw;Ljava/util/ArrayList;I)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 209
    return-void
.end method

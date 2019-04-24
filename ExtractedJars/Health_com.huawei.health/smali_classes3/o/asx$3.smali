.class Lo/asx$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asx;->d(JJLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:J

.field final synthetic d:Lo/asx;

.field final synthetic e:J


# direct methods
.method constructor <init>(Lo/asx;JJLjava/lang/String;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lo/asx$3;->d:Lo/asx;

    iput-wide p2, p0, Lo/asx$3;->e:J

    iput-wide p4, p0, Lo/asx$3;->b:J

    iput-object p6, p0, Lo/asx$3;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 11

    .line 120
    iget-object v0, p0, Lo/asx$3;->d:Lo/asx;

    iget-wide v1, p0, Lo/asx$3;->e:J

    invoke-static {v0, v1, v2}, Lo/asx;->b(Lo/asx;J)Lcom/huawei/health/sns/server/group/FindGroupResponse$FindGroupRsp;

    move-result-object v6

    .line 121
    if-eqz v6, :cond_1

    .line 123
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/group/FindGroupResponse$FindGroupRsp;->getGroup_()Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;

    move-result-object v7

    .line 124
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/group/FindGroupResponse$FindGroupRsp;->getFirstMemberList_()Ljava/util/List;

    move-result-object v8

    .line 125
    if-nez v7, :cond_0

    .line 127
    const-string v0, "FoundGroupTask"

    const-string v1, " syncFindGroupRequest rspGroup is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    return-void

    .line 130
    :cond_0
    iget-object v0, p0, Lo/asx$3;->d:Lo/asx;

    invoke-static {v0, v7}, Lo/asx;->a(Lo/asx;Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v9

    .line 131
    iget-object v0, p0, Lo/asx$3;->d:Lo/asx;

    iget-wide v1, p0, Lo/asx$3;->e:J

    invoke-static {v0, v1, v2, v8}, Lo/asx;->a(Lo/asx;JLjava/util/List;)Ljava/util/ArrayList;

    move-result-object v10

    .line 133
    new-instance v0, Lo/axy;

    invoke-direct {v0}, Lo/axy;-><init>()V

    iget-wide v1, p0, Lo/asx$3;->b:J

    iget-object v3, p0, Lo/asx$3;->a:Ljava/lang/String;

    move-object v4, v9

    move-object v5, v10

    invoke-virtual/range {v0 .. v5}, Lo/axy;->a(JLjava/lang/String;Lcom/huawei/health/sns/model/group/Group;Ljava/util/ArrayList;)V

    .line 135
    :cond_1
    return-void
.end method

.method public e(II)V
    .locals 3

    .line 140
    const-string v0, "FoundGroupTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " syncFindGroupRequest login error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "rtnCode "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    return-void
.end method

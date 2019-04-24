.class public Lo/boz;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 97
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lo/boz;->d(Ljava/util/ArrayList;Ljava/lang/StringBuffer;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/StringBuffer;Lcom/huawei/health/sns/model/group/Group;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/StringBuffer;Lcom/huawei/health/sns/model/group/Group;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 36
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/ath;->d(Lcom/huawei/health/sns/model/group/Group;)Ljava/util/ArrayList;

    move-result-object v3

    .line 37
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 39
    if-nez v4, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v0

    if-nez v0, :cond_0

    .line 41
    invoke-static {}, Lo/ata;->d()Lo/ata;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/ata;->c(J)V

    .line 42
    const-string v0, "GrpMemUtil"

    const-string v1, "getComposeMemberList member size is 0"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    new-instance v0, Lo/atg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atg;->e(J)V

    .line 44
    const/4 v0, 0x0

    return-object v0

    .line 47
    :cond_0
    invoke-static {v3, p0}, Lo/boz;->d(Ljava/util/ArrayList;Ljava/lang/StringBuffer;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/util/ArrayList;Ljava/lang/StringBuffer;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;Ljava/lang/StringBuffer;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 59
    if-nez p0, :cond_0

    .line 61
    const/4 v0, 0x0

    return-object v0

    .line 64
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 67
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 70
    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    if-nez v0, :cond_4

    .line 72
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 73
    const/4 v0, 0x3

    if-le v4, v0, :cond_1

    .line 75
    goto :goto_2

    .line 77
    :cond_1
    if-eqz p1, :cond_3

    .line 79
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v5

    .line 80
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "null_image;"

    goto :goto_1

    :cond_2
    move-object v0, v5

    :goto_1
    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 82
    :cond_3
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    :cond_4
    goto :goto_0

    .line 85
    :cond_5
    :goto_2
    return-object v1
.end method

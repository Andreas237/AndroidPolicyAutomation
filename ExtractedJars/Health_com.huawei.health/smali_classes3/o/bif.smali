.class public Lo/bif;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/group/Group;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 54
    invoke-virtual {p1, p2}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageUrl(Ljava/lang/String;)V

    .line 55
    invoke-virtual {p1, p3}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageDownloadUrl(Ljava/lang/String;)V

    .line 56
    return-void
.end method


# virtual methods
.method public e(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 6

    .line 21
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupName(Ljava/lang/String;)V

    .line 23
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v1

    .line 24
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v2

    .line 26
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 29
    invoke-direct {p0, p1, v2, v1}, Lo/bif;->d(Lcom/huawei/health/sns/model/group/Group;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    return-void

    .line 33
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v3

    .line 34
    new-instance v5, Lo/ayc;

    invoke-direct {v5}, Lo/ayc;-><init>()V

    .line 35
    invoke-virtual {v5, v3, v4}, Lo/ayc;->e(J)V

    .line 36
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/ayc;->e(Z)V

    .line 37
    invoke-virtual {v5, v2}, Lo/ayc;->c(Ljava/lang/String;)V

    .line 38
    invoke-virtual {v5, v2}, Lo/ayc;->d(Ljava/lang/String;)V

    .line 39
    invoke-virtual {v5, v1}, Lo/ayc;->b(Ljava/lang/String;)V

    .line 40
    invoke-static {}, Lo/ata;->d()Lo/ata;

    move-result-object v0

    invoke-virtual {v0, v3, v4, v5}, Lo/ata;->b(JLo/ayc;)V

    .line 42
    invoke-direct {p0, p1, v2, v1}, Lo/bif;->d(Lcom/huawei/health/sns/model/group/Group;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    return-void
.end method

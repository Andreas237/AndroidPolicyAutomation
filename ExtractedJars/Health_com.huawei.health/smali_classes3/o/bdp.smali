.class public Lo/bdp;
.super Lo/bfq;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1}, Lo/bfq;-><init>(Landroid/content/Context;)V

    .line 49
    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/health/sns/model/user/User;)V
    .locals 13

    .line 58
    iget-object v0, p0, Lo/bdp;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 60
    new-instance v3, Lo/ayb;

    invoke-direct {v3}, Lo/ayb;-><init>()V

    .line 62
    new-instance v4, Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {v4}, Lcom/huawei/health/sns/model/group/GroupMember;-><init>()V

    .line 63
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserId(J)V

    .line 66
    const-wide/16 v0, 0x0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setGroupId(J)V

    .line 67
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getOldImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setOldUserImageUrl(Ljava/lang/String;)V

    .line 68
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageUrl(Ljava/lang/String;)V

    .line 69
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageDownloadUrl(Ljava/lang/String;)V

    .line 70
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserRemarkName(Ljava/lang/String;)V

    .line 71
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserNickname(Ljava/lang/String;)V

    .line 72
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setContactName(Ljava/lang/String;)V

    .line 73
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setState(I)V

    .line 74
    invoke-virtual {v3, v4}, Lo/ayb;->c(Lo/bfh;)V

    .line 76
    new-instance v5, Lo/axx;

    invoke-direct {v5}, Lo/axx;-><init>()V

    .line 77
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/axx;->setChatType(I)V

    .line 78
    invoke-virtual {v3, v5}, Lo/ayb;->c(Lo/bfh;)V

    .line 80
    const/4 v6, 0x0

    .line 82
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 83
    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v3}, Lo/ayb;->getCardType()I

    move-result v1

    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2, v7}, Lo/bdp;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 87
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 88
    new-instance v8, Lo/axz;

    invoke-direct {v8}, Lo/axz;-><init>()V

    .line 89
    const/16 v0, 0x26

    invoke-virtual {v8, v0}, Lo/axz;->setCardType(I)V

    .line 90
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lo/axz;->setNeedHideDivider(Z)V

    .line 91
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v8}, Lo/axz;->getCardType()I

    move-result v1

    const/4 v0, 0x1

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2, v7}, Lo/bdp;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 95
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 96
    new-instance v9, Lo/ayh;

    invoke-direct {v9}, Lo/ayh;-><init>()V

    .line 98
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lo/ayh;->e(Z)V

    .line 99
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lo/ayh;->c(J)V

    .line 101
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getStickTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    const/4 v10, 0x0

    goto :goto_0

    .line 107
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getStickTime()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v10, 0x1

    goto :goto_0

    :cond_1
    const/4 v10, 0x0

    .line 110
    :goto_0
    if-eqz v10, :cond_2

    .line 112
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lo/ayh;->b(I)V

    goto :goto_1

    .line 116
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lo/ayh;->b(I)V

    .line 118
    :goto_1
    const/4 v0, 0x3

    invoke-virtual {v9, v0}, Lo/ayh;->e(I)V

    .line 119
    const/16 v0, 0x2c

    invoke-virtual {v9, v0}, Lo/ayh;->setCardType(I)V

    .line 120
    sget-object v0, Lo/bfp$c;->v:Lo/bfp$c;

    invoke-virtual {v9, v0}, Lo/ayh;->setEventType(Lo/bfp$c;)V

    .line 121
    invoke-interface {v7, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v9}, Lo/ayh;->getCardType()I

    move-result v1

    const/4 v0, 0x2

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2, v7}, Lo/bdp;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 125
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 126
    new-instance v9, Lo/ayh;

    invoke-direct {v9}, Lo/ayh;-><init>()V

    .line 127
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lo/ayh;->e(Z)V

    .line 128
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lo/ayh;->c(J)V

    .line 130
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSetFlags()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 132
    const/4 v11, 0x0

    goto :goto_2

    .line 136
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUndisturbStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    const/4 v11, 0x1

    goto :goto_2

    :cond_4
    const/4 v11, 0x0

    .line 138
    :goto_2
    if-eqz v11, :cond_5

    .line 140
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lo/ayh;->b(I)V

    goto :goto_3

    .line 144
    :cond_5
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lo/ayh;->b(I)V

    .line 146
    :goto_3
    const/4 v0, 0x4

    invoke-virtual {v9, v0}, Lo/ayh;->e(I)V

    .line 147
    const/16 v0, 0x2d

    invoke-virtual {v9, v0}, Lo/ayh;->setCardType(I)V

    .line 148
    sget-object v0, Lo/bfp$c;->w:Lo/bfp$c;

    invoke-virtual {v9, v0}, Lo/ayh;->setEventType(Lo/bfp$c;)V

    .line 149
    invoke-interface {v7, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v9}, Lo/ayh;->getCardType()I

    move-result v1

    const/4 v0, 0x3

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2, v7}, Lo/bdp;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 153
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 154
    new-instance v12, Lo/ayg;

    invoke-direct {v12}, Lo/ayg;-><init>()V

    .line 155
    const/4 v0, 0x1

    iput v0, v12, Lo/ayg;->c:I

    .line 156
    const/16 v0, 0x2e

    invoke-virtual {v12, v0}, Lo/ayg;->setCardType(I)V

    .line 157
    sget-object v0, Lo/bfp$c;->x:Lo/bfp$c;

    invoke-virtual {v12, v0}, Lo/ayg;->setEventType(Lo/bfp$c;)V

    .line 158
    invoke-interface {v7, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 159
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v12}, Lo/ayg;->getCardType()I

    move-result v1

    const/4 v0, 0x4

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2, v7}, Lo/bdp;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 162
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 163
    new-instance v12, Lo/ayg;

    invoke-direct {v12}, Lo/ayg;-><init>()V

    .line 164
    const/4 v0, 0x2

    iput v0, v12, Lo/ayg;->c:I

    .line 165
    const/16 v0, 0x2f

    invoke-virtual {v12, v0}, Lo/ayg;->setCardType(I)V

    .line 166
    sget-object v0, Lo/bfp$c;->y:Lo/bfp$c;

    invoke-virtual {v12, v0}, Lo/ayg;->setEventType(Lo/bfp$c;)V

    .line 167
    invoke-interface {v7, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 168
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v12}, Lo/ayg;->getCardType()I

    move-result v1

    const/4 v0, 0x5

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2, v7}, Lo/bdp;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 171
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 172
    new-instance v12, Lo/ayg;

    invoke-direct {v12}, Lo/ayg;-><init>()V

    .line 173
    const/4 v0, 0x4

    iput v0, v12, Lo/ayg;->c:I

    .line 174
    const/16 v0, 0x34

    invoke-virtual {v12, v0}, Lo/ayg;->setCardType(I)V

    .line 175
    sget-object v0, Lo/bfp$c;->j:Lo/bfp$c;

    invoke-virtual {v12, v0}, Lo/ayg;->setEventType(Lo/bfp$c;)V

    .line 176
    invoke-interface {v7, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 177
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v12}, Lo/ayg;->getCardType()I

    move-result v1

    const/4 v0, 0x6

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2, v7}, Lo/bdp;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 178
    return-void
.end method

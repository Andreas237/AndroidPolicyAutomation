.class Lo/axd$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axd;->d(IJJZ)V
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
.field final synthetic a:Lo/axd;

.field final synthetic b:J

.field final synthetic c:Z

.field final synthetic d:I

.field final synthetic e:J


# direct methods
.method constructor <init>(Lo/axd;JJIZ)V
    .locals 0

    .line 133
    iput-object p1, p0, Lo/axd$4;->a:Lo/axd;

    iput-wide p2, p0, Lo/axd$4;->b:J

    iput-wide p4, p0, Lo/axd$4;->e:J

    iput p6, p0, Lo/axd$4;->d:I

    iput-boolean p7, p0, Lo/axd$4;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 133
    invoke-virtual {p0, p1}, Lo/axd$4;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 13

    .line 137
    const/4 v7, 0x0

    .line 138
    const/4 v8, -0x1

    .line 139
    const/4 v9, 0x0

    .line 140
    iget-wide v0, p0, Lo/axd$4;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 142
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-wide v1, p0, Lo/axd$4;->b:J

    invoke-virtual {v0, v1, v2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v10

    .line 143
    if-eqz v10, :cond_0

    .line 145
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    iget-wide v1, p0, Lo/axd$4;->b:J

    iget-wide v3, p0, Lo/axd$4;->e:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ath;->a(JJ)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v11

    .line 146
    if-eqz v11, :cond_0

    .line 148
    invoke-virtual {v11}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserGroupNickname()Ljava/lang/String;

    move-result-object v9

    .line 149
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v8

    .line 154
    :cond_0
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/axd$4;->e:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v7

    .line 155
    if-eqz v7, :cond_2

    .line 157
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getIsFriend()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 159
    iget-object v0, p0, Lo/axd$4;->a:Lo/axd;

    iget-object v0, v0, Lo/axd;->d:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 161
    iget-object v0, p0, Lo/axd$4;->a:Lo/axd;

    move-object v1, v7

    iget v2, p0, Lo/axd$4;->d:I

    move v5, v8

    move-object v6, v9

    const/4 v3, -0x1

    const/4 v4, -0x1

    invoke-virtual/range {v0 .. v6}, Lo/axd;->d(Lcom/huawei/health/sns/model/user/User;IIIILjava/lang/String;)Landroid/os/Message;

    move-result-object v10

    .line 163
    iget-object v0, p0, Lo/axd$4;->a:Lo/axd;

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-static {v0, v10, v1, v2}, Lo/axd;->d(Lo/axd;Landroid/os/Message;J)Landroid/os/Message;

    .line 164
    iget-object v0, p0, Lo/axd$4;->a:Lo/axd;

    iget-object v0, v0, Lo/axd;->d:Landroid/os/Handler;

    invoke-virtual {v0, v10}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 166
    :cond_1
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 170
    :cond_2
    const/4 v10, -0x1

    .line 171
    const/4 v11, -0x1

    .line 172
    iget-boolean v0, p0, Lo/axd$4;->c:Z

    if-eqz v0, :cond_5

    .line 174
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    iget-wide v1, p0, Lo/axd$4;->e:J

    invoke-virtual {v0, v1, v2}, Lo/axi;->c(J)Lcom/huawei/health/sns/model/user/UserNotify;

    move-result-object v12

    .line 175
    if-eqz v12, :cond_5

    .line 177
    new-instance v7, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v7}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 178
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/health/sns/model/user/User;->setUserId(J)V

    .line 179
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->setImageUrl(Ljava/lang/String;)V

    .line 180
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getUrlDownload()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->setImageURLDownload(Ljava/lang/String;)V

    .line 181
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 182
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getPhoneDigest()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->setPhoneDigest(Ljava/lang/String;)V

    .line 183
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getIsFriend()I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->setIsFriend(I)V

    .line 184
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->setContactName(Ljava/lang/String;)V

    .line 185
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->setPhoneNumber(Ljava/lang/String;)V

    .line 186
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getRemarkName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->setRemarkName(Ljava/lang/String;)V

    .line 187
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getAccount()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->setAccount(Ljava/lang/String;)V

    .line 188
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getGender()I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->setGender(I)V

    .line 189
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getProvince()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->setProvince(Ljava/lang/String;)V

    .line 190
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getCity()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->setCity(Ljava/lang/String;)V

    .line 191
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getSignature()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->setSignature(Ljava/lang/String;)V

    .line 192
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 193
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getFrdOrigin()Lcom/huawei/health/sns/server/user/Origin;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 195
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getFrdOrigin()Lcom/huawei/health/sns/server/user/Origin;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/Origin;->getType_()I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->setOriginType(I)V

    .line 196
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getFrdOrigin()Lcom/huawei/health/sns/server/user/Origin;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/Origin;->getDesc_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->setOriginDesc(Ljava/lang/String;)V

    .line 198
    :cond_3
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getNotifiedSide()I

    move-result v10

    .line 199
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    if-nez v0, :cond_4

    const/4 v11, -0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v12}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/UserNotify$b;->c()I

    move-result v11

    .line 203
    :cond_5
    :goto_0
    iget-object v0, p0, Lo/axd$4;->a:Lo/axd;

    iget-object v0, v0, Lo/axd;->d:Landroid/os/Handler;

    if-eqz v0, :cond_7

    .line 205
    iget-object v0, p0, Lo/axd$4;->a:Lo/axd;

    move-object v1, v7

    iget v2, p0, Lo/axd$4;->d:I

    move v3, v10

    move v4, v11

    move v5, v8

    move-object v6, v9

    invoke-virtual/range {v0 .. v6}, Lo/axd;->d(Lcom/huawei/health/sns/model/user/User;IIIILjava/lang/String;)Landroid/os/Message;

    move-result-object v12

    .line 206
    if-eqz v7, :cond_6

    .line 208
    iget-object v0, p0, Lo/axd$4;->a:Lo/axd;

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-static {v0, v12, v1, v2}, Lo/axd;->d(Lo/axd;Landroid/os/Message;J)Landroid/os/Message;

    .line 210
    :cond_6
    iget-object v0, p0, Lo/axd$4;->a:Lo/axd;

    iget-object v0, v0, Lo/axd;->d:Landroid/os/Handler;

    invoke-virtual {v0, v12}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 213
    :cond_7
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

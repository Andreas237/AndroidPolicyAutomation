.class Lcom/huawei/bone/social/manager/util/SocialReceiver$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eeh;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/bone/social/manager/util/SocialReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/bone/social/manager/util/SocialReceiver;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/bone/social/manager/util/SocialReceiver;)V
    .locals 1

    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 182
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver$a;->d:Ljava/lang/ref/WeakReference;

    .line 183
    return-void
.end method


# virtual methods
.method public a(Lo/edv;)V
    .locals 12

    .line 187
    const-string v0, "Enter mCallBackEventHandler"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver$a;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/bone/social/manager/util/SocialReceiver;

    .line 190
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 191
    return-void

    .line 194
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    iget v0, p1, Lo/edv;->errorCode:I

    if-nez v0, :cond_4

    .line 196
    invoke-virtual {p1}, Lo/edv;->getType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 197
    invoke-static {}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BaseResp.TYPE_UNREAD_MSG"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    move-object v5, p1

    check-cast v5, Lcom/huawei/sns/sdk/modelmsg/UnreadMsgResp;

    .line 199
    iget v6, v5, Lcom/huawei/sns/sdk/modelmsg/UnreadMsgResp;->friendInvitation:I

    .line 200
    invoke-static {}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "respData.friendInvitation:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    if-lez v6, :cond_1

    .line 203
    invoke-static {}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notification size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    const-wide/16 v0, 0x0

    invoke-static {v4, v0, v1}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->a(Lcom/huawei/bone/social/manager/util/SocialReceiver;J)V

    .line 205
    invoke-static {v4}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->b(Lcom/huawei/bone/social/manager/util/SocialReceiver;)V

    goto :goto_0

    .line 207
    :cond_1
    invoke-static {}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notification size is null or size is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    const-wide/16 v0, 0x0

    invoke-static {v4, v0, v1}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->b(Lcom/huawei/bone/social/manager/util/SocialReceiver;J)V

    .line 210
    :goto_0
    goto/16 :goto_1

    :cond_2
    invoke-virtual {p1}, Lo/edv;->getType()I

    move-result v0

    const/4 v1, 0x5

    if-ne v1, v0, :cond_4

    .line 211
    invoke-static {}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter  BaseResp.TYPE_FRIEND_LIST"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    move-object v5, p1

    check-cast v5, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;

    .line 213
    iget-object v6, v5, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;->friendList:Ljava/util/List;

    .line 214
    invoke-static {}, Lo/xo;->e()Lo/xo;

    move-result-object v7

    .line 215
    new-instance v8, Lo/wq;

    invoke-static {v4}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d(Lcom/huawei/bone/social/manager/util/SocialReceiver;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {v8, v0}, Lo/wq;-><init>(Landroid/content/Context;)V

    .line 216
    const/4 v0, 0x0

    if-ne v0, v6, :cond_3

    .line 217
    invoke-static {}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "friendInfos is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 220
    :cond_3
    new-instance v9, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;

    invoke-direct {v9}, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;-><init>()V

    .line 221
    invoke-static {v4}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d(Lcom/huawei/bone/social/manager/util/SocialReceiver;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->b(Landroid/content/Context;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v10

    .line 222
    invoke-virtual {v10}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v9, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->displayName:Ljava/lang/String;

    .line 223
    invoke-virtual {v10}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v9, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->imagePath:Ljava/lang/String;

    .line 224
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    invoke-virtual {v0}, Lo/vu;->c()Ljava/lang/String;

    move-result-object v11

    .line 225
    invoke-static {v11}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, v9, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->userId:J

    .line 227
    invoke-static {}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "friendInfos size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 235
    invoke-virtual {v7, v6}, Lo/xo;->b(Ljava/util/List;)V

    .line 236
    invoke-virtual {v7}, Lo/xo;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->c(Lcom/huawei/bone/social/manager/util/SocialReceiver;)Lo/wo;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v8, v0, v1, v2}, Lo/wq;->a(Ljava/util/ArrayList;Lo/wo;Landroid/os/Bundle;)V

    .line 240
    :cond_4
    :goto_1
    return-void
.end method

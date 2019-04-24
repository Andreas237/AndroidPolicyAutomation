.class Lo/xo$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/xo;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/xo;


# direct methods
.method constructor <init>(Lo/xo;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lo/xo$4;->e:Lo/xo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 89
    invoke-static {}, Lo/vs;->a()Lo/vs;

    move-result-object v4

    .line 90
    new-instance v5, Lcom/huawei/sns/sdk/modelmsg/CommonReq;

    invoke-direct {v5}, Lcom/huawei/sns/sdk/modelmsg/CommonReq;-><init>()V

    .line 91
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->transaction:Ljava/lang/String;

    .line 92
    invoke-static {}, Lo/xo;->d()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Lo/vs;->e(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Landroid/content/Context;)Lcom/huawei/sns/sdk/modelmsg/FriendListResp;

    move-result-object v6

    .line 93
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    iget-object v0, v6, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;->friendList:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 94
    invoke-static {}, Lo/xo;->d()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 96
    iget-object v0, p0, Lo/xo$4;->e:Lo/xo;

    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v1

    invoke-virtual {v1}, Lo/wr;->b()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lo/xo;->a(Lo/xo;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    goto :goto_0

    .line 98
    :cond_0
    invoke-static {}, Lo/xo;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    :goto_0
    iget-object v7, v6, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;->friendList:Ljava/util/List;

    .line 101
    new-instance v8, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;

    invoke-direct {v8}, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;-><init>()V

    .line 102
    iget-object v0, p0, Lo/xo$4;->e:Lo/xo;

    invoke-static {}, Lo/xo;->d()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/xo;->c(Landroid/content/Context;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v9

    .line 104
    invoke-virtual {v9}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v8, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->displayName:Ljava/lang/String;

    .line 105
    invoke-virtual {v9}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v8, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->imagePath:Ljava/lang/String;

    .line 106
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    invoke-virtual {v0}, Lo/vu;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, v8, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->userId:J

    .line 107
    invoke-static {}, Lo/xo;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "friendInfos size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    iget-object v0, p0, Lo/xo$4;->e:Lo/xo;

    invoke-virtual {v0, v7}, Lo/xo;->b(Ljava/util/List;)V

    .line 111
    :cond_1
    return-void
.end method

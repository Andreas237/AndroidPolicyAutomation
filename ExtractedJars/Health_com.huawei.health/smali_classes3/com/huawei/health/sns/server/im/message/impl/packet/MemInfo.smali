.class public Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private nickName:Ljava/lang/String;

.field private noFriend:Ljava/lang/String;

.field private userId:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getNickName()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->nickName:Ljava/lang/String;

    .line 42
    return-object v0
.end method

.method public getNoFriend()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->noFriend:Ljava/lang/String;

    return-object v0
.end method

.method public getUserId()J
    .locals 2

    .line 30
    iget-wide v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->userId:J

    .line 31
    return-wide v0
.end method

.method public setNickName(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->nickName:Ljava/lang/String;

    .line 58
    return-void
.end method

.method public setNoFriend(Ljava/lang/String;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->noFriend:Ljava/lang/String;

    .line 53
    return-void
.end method

.method public setUserId(J)V
    .locals 0

    .line 36
    iput-wide p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->userId:J

    .line 37
    return-void
.end method

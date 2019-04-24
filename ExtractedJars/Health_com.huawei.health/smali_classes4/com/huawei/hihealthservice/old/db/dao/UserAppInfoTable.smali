.class public Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private appId:I

.field private authority:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private cloudUserAppCode:J

.field private createTime:J

.field private lastModifyVersion:J

.field private localUserAppCode:I

.field private localUserCode:J

.field private priority:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppId()I
    .locals 1

    .line 55
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->appId:I

    return v0
.end method

.method public getAuthority()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->authority:Ljava/util/HashMap;

    return-object v0
.end method

.method public getCloudUserAppCode()J
    .locals 2

    .line 35
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->cloudUserAppCode:J

    return-wide v0
.end method

.method public getCreateTime()J
    .locals 2

    .line 86
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->createTime:J

    return-wide v0
.end method

.method public getLastModifyVersion()J
    .locals 2

    .line 96
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->lastModifyVersion:J

    return-wide v0
.end method

.method public getLocalUserAppCode()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->localUserAppCode:I

    return v0
.end method

.method public getLocalUserCode()J
    .locals 2

    .line 45
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->localUserCode:J

    return-wide v0
.end method

.method public getPriority()I
    .locals 1

    .line 76
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->priority:I

    return v0
.end method

.method public initFunctionAv()V
    .locals 0

    .line 109
    return-void
.end method

.method public initFunctionBv()V
    .locals 0

    .line 113
    return-void
.end method

.method public setAppId(I)V
    .locals 0

    .line 60
    iput p1, p0, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->appId:I

    .line 61
    return-void
.end method

.method public setAuthority(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 71
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->authority:Ljava/util/HashMap;

    .line 72
    return-void
.end method

.method public setCloudUserAppCode(J)V
    .locals 0

    .line 40
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->cloudUserAppCode:J

    .line 41
    return-void
.end method

.method public setCreateTime(J)V
    .locals 0

    .line 91
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->createTime:J

    .line 92
    return-void
.end method

.method public setLastModifyVersion(J)V
    .locals 0

    .line 101
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->lastModifyVersion:J

    .line 102
    return-void
.end method

.method public setLocalUserAppCode(I)V
    .locals 0

    .line 30
    iput p1, p0, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->localUserAppCode:I

    .line 31
    return-void
.end method

.method public setLocalUserCode(J)V
    .locals 0

    .line 50
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->localUserCode:J

    .line 51
    return-void
.end method

.method public setPriority(I)V
    .locals 0

    .line 81
    iput p1, p0, Lcom/huawei/hihealthservice/old/db/dao/UserAppInfoTable;->priority:I

    .line 82
    return-void
.end method

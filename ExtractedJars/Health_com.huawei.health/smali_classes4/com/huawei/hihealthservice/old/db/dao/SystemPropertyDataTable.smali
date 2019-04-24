.class public Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ACCOUNT_KEY:Ljava/lang/String; = "Account"

.field public static final AES_CBC_KEY:Ljava/lang/String; = "AES_CBC"

.field public static final AES_KEY:Ljava/lang/String; = "CBC"

.field public static final ANDROID_ID_KEY:Ljava/lang/String; = "v5"

.field public static final APP_VERSION_KEY:Ljava/lang/String; = "upgradeappversion"

.field public static final APP_VERSION_VALUE_BASE:Ljava/lang/String; = "0"

.field public static final BLUETOOTH_MAC_KEY:Ljava/lang/String; = "v3"

.field public static final WIFI_MAC_KEY:Ljava/lang/String; = "v2"


# instance fields
.field private createTime:J

.field private data:Ljava/lang/String;

.field private key:Ljava/lang/String;

.field private lastModifyTime:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCreateTime()J
    .locals 2

    .line 93
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->createTime:J

    return-wide v0
.end method

.method public getData()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->data:Ljava/lang/String;

    return-object v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->key:Ljava/lang/String;

    return-object v0
.end method

.method public getLastModifyTime()J
    .locals 2

    .line 83
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->lastModifyTime:J

    return-wide v0
.end method

.method public initFunctionAb()V
    .locals 0

    .line 122
    return-void
.end method

.method public initFunctionBb()V
    .locals 0

    .line 126
    return-void
.end method

.method public initFunctionCb()V
    .locals 0

    .line 130
    return-void
.end method

.method public setCreateTime(J)V
    .locals 0

    .line 98
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->createTime:J

    .line 99
    return-void
.end method

.method public setData(Ljava/lang/String;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->data:Ljava/lang/String;

    .line 78
    return-void
.end method

.method public setKey(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->key:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public setLastModifyTime(J)V
    .locals 0

    .line 88
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->lastModifyTime:J

    .line 89
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 104
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    const-string v0, "SystemPropertyDataTable [key="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->key:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    const-string v0, ", data="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->data:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    const-string v0, ", createTime="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->createTime:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 111
    const-string v0, ", lastModifyTime="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;->lastModifyTime:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 113
    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

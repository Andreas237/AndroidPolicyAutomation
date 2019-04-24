.class public Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private database:Landroid/database/sqlite/SQLiteDatabase;

.field private desEncrypt:Ljava/lang/String;

.field private encryptKey:Ljava/lang/String;

.field private mContext:Landroid/content/Context;

.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public configDatabase(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->database:Landroid/database/sqlite/SQLiteDatabase;

    .line 39
    return-void
.end method

.method public configDesEncrypt(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->desEncrypt:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public configEncryptKey(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->encryptKey:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public configName(Ljava/lang/String;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->name:Ljava/lang/String;

    .line 23
    return-void
.end method

.method public configmContext(Landroid/content/Context;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->mContext:Landroid/content/Context;

    .line 31
    return-void
.end method

.method public fetchDatabase()Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->database:Landroid/database/sqlite/SQLiteDatabase;

    return-object v0
.end method

.method public fetchDesEncrypt()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->desEncrypt:Ljava/lang/String;

    return-object v0
.end method

.method public fetchEncryptKey()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->encryptKey:Ljava/lang/String;

    return-object v0
.end method

.method public fetchName()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->name:Ljava/lang/String;

    return-object v0
.end method

.method public fetchmContext()Landroid/content/Context;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tableNameEncryptSwitch{name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", database="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/upgrade/TableNameEncryptSwitch;->database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public Lcom/huawei/common/GuardianAccount;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field guardianUserAccount:Ljava/lang/String;

.field guardianUserID:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public configGuardianUserAccount(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/common/GuardianAccount;->guardianUserAccount:Ljava/lang/String;

    .line 25
    return-void
.end method

.method public configGuardianUserID(Ljava/lang/String;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/huawei/common/GuardianAccount;->guardianUserID:Ljava/lang/String;

    .line 17
    return-void
.end method

.method public fetchGuardianUserAccount()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/common/GuardianAccount;->guardianUserAccount:Ljava/lang/String;

    return-object v0
.end method

.method public fetchGuardianUserID()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/huawei/common/GuardianAccount;->guardianUserID:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GuardianAccount:[guardianUserID = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/common/GuardianAccount;->guardianUserID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "guardianUserAccount = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/common/GuardianAccount;->guardianUserAccount:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class interface abstract Lcom/huawei/hihealthservice/auth/IAuth;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract checkDeleteAuth(II[I)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/hihealthservice/auth/HiAuthException;
        }
    .end annotation
.end method

.method public abstract checkInsertAuth(IILjava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/hihealthservice/auth/HiAuthException;
        }
    .end annotation
.end method

.method public abstract checkReadAuth(II[I)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/hihealthservice/auth/HiAuthException;
        }
    .end annotation
.end method

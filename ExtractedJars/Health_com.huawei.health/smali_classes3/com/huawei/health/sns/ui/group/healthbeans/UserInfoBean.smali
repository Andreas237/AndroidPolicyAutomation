.class public Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private huid:Ljava/lang/Long;

.field private nickName:Ljava/lang/String;

.field private photo:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getHuid()Ljava/lang/Long;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->huid:Ljava/lang/Long;

    return-object v0
.end method

.method public getNickName()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->nickName:Ljava/lang/String;

    return-object v0
.end method

.method public getPhoto()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->photo:Ljava/lang/String;

    return-object v0
.end method

.method public setHuid(Ljava/lang/Long;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->huid:Ljava/lang/Long;

    .line 30
    return-void
.end method

.method public setNickName(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->nickName:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public setPhoto(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->photo:Ljava/lang/String;

    .line 46
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UserInfoBean{huid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->huid:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", nickName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->nickName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", photo=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->photo:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

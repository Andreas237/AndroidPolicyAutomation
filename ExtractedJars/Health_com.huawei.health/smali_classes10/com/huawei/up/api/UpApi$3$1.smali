.class Lcom/huawei/up/api/UpApi$3$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/up/callback/CommonCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/up/api/UpApi$3;->onProcessed(Lo/ddb;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/up/api/UpApi$3;


# direct methods
.method constructor <init>(Lcom/huawei/up/api/UpApi$3;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/huawei/up/api/UpApi$3$1;->this$1:Lcom/huawei/up/api/UpApi$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFail(I)V
    .locals 4

    .line 190
    iget-object v0, p0, Lcom/huawei/up/api/UpApi$3$1;->this$1:Lcom/huawei/up/api/UpApi$3;

    iget-object v0, v0, Lcom/huawei/up/api/UpApi$3;->val$handler:Lcom/huawei/cloudservice/CloudRequestHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "unknown error"

    invoke-direct {v1, p1, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 191
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUserInfo failure, errcode is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    return-void
.end method

.method public onSuccess(Landroid/os/Bundle;)V
    .locals 4

    .line 175
    const-string v0, "getUserInfoTag"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/hwid/core/datatype/UserInfo;

    .line 176
    new-instance v2, Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-direct {v2}, Lcom/huawei/hwid/core/datatype/UserInfo;-><init>()V

    .line 177
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 178
    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getBirthDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setBirthDate(Ljava/lang/String;)V

    .line 179
    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getGender()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setGender(Ljava/lang/String;)V

    .line 180
    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getHeadPictureURL()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setHeadPictureURL(Ljava/lang/String;)V

    .line 181
    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setNickName(Ljava/lang/String;)V

    .line 183
    :cond_0
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 184
    const-string v0, "userInfo"

    invoke-virtual {v3, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 185
    iget-object v0, p0, Lcom/huawei/up/api/UpApi$3$1;->this$1:Lcom/huawei/up/api/UpApi$3;

    iget-object v0, v0, Lcom/huawei/up/api/UpApi$3;->val$handler:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, v3}, Lcom/huawei/cloudservice/CloudRequestHandler;->onFinish(Landroid/os/Bundle;)V

    .line 186
    return-void
.end method

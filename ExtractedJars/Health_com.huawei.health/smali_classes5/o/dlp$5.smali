.class Lo/dlp$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/cloudservice/CloudRequestHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlp;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dlp;


# direct methods
.method constructor <init>(Lo/dlp;)V
    .locals 0

    .line 173
    iput-object p1, p0, Lo/dlp$5;->d:Lo/dlp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    .locals 4

    .line 192
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfo.onError, errorStatus =="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    return-void
.end method

.method public onFinish(Landroid/os/Bundle;)V
    .locals 4

    .line 176
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 177
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getUserInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    iget-object v0, p0, Lo/dlp$5;->d:Lo/dlp;

    const-string v1, "userInfo"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-static {v0, v1}, Lo/dlp;->b(Lo/dlp;Lcom/huawei/hwid/core/datatype/UserInfo;)Lcom/huawei/hwid/core/datatype/UserInfo;

    .line 179
    iget-object v0, p0, Lo/dlp$5;->d:Lo/dlp;

    invoke-static {v0}, Lo/dlp;->a(Lo/dlp;)Lcom/huawei/hwid/core/datatype/UserInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/dlp$5;->d:Lo/dlp;

    invoke-static {v0}, Lo/dlp;->a(Lo/dlp;)Lcom/huawei/hwid/core/datatype/UserInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->getBirthDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter set by b"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    iget-object v0, p0, Lo/dlp$5;->d:Lo/dlp;

    invoke-virtual {v0}, Lo/dlp;->b()V

    .line 183
    :cond_0
    iget-object v0, p0, Lo/dlp$5;->d:Lo/dlp;

    invoke-static {v0}, Lo/dlp;->a(Lo/dlp;)Lcom/huawei/hwid/core/datatype/UserInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const-string v0, "0"

    iget-object v1, p0, Lo/dlp$5;->d:Lo/dlp;

    invoke-static {v1}, Lo/dlp;->a(Lo/dlp;)Lcom/huawei/hwid/core/datatype/UserInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getGender()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "1"

    iget-object v1, p0, Lo/dlp$5;->d:Lo/dlp;

    invoke-static {v1}, Lo/dlp;->a(Lo/dlp;)Lcom/huawei/hwid/core/datatype/UserInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getGender()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 184
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter set by g"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    iget-object v0, p0, Lo/dlp$5;->d:Lo/dlp;

    invoke-virtual {v0}, Lo/dlp;->b()V

    .line 188
    :cond_1
    return-void
.end method

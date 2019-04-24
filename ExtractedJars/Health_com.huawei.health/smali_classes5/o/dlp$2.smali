.class Lo/dlp$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlp;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/dlp;


# direct methods
.method constructor <init>(Lo/dlp;)V
    .locals 0

    .line 204
    iput-object p1, p0, Lo/dlp$2;->e:Lo/dlp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 236
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 6

    .line 207
    if-eqz p2, :cond_2

    .line 208
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 209
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 210
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    iget-object v0, p0, Lo/dlp$2;->e:Lo/dlp;

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiUserInfo;

    invoke-static {v0, v1}, Lo/dlp;->a(Lo/dlp;Lcom/huawei/hihealth/HiUserInfo;)Lcom/huawei/hihealth/HiUserInfo;

    .line 212
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "height=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dlp$2;->e:Lo/dlp;

    invoke-static {v2}, Lo/dlp;->b(Lo/dlp;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "weight=="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dlp$2;->e:Lo/dlp;

    invoke-static {v2}, Lo/dlp;->b(Lo/dlp;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "birthday=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dlp$2;->e:Lo/dlp;

    invoke-static {v2}, Lo/dlp;->b(Lo/dlp;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getBirthday()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "gender=="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dlp$2;->e:Lo/dlp;

    invoke-static {v2}, Lo/dlp;->b(Lo/dlp;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    iget-object v0, p0, Lo/dlp$2;->e:Lo/dlp;

    invoke-static {v0}, Lo/dlp;->b(Lo/dlp;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v0

    const/16 v1, 0xaa

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lo/dlp$2;->e:Lo/dlp;

    invoke-static {v0}, Lo/dlp;->b(Lo/dlp;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    const/16 v1, 0x3c

    if-ne v1, v0, :cond_0

    .line 215
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter set by hw"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    iget-object v0, p0, Lo/dlp$2;->e:Lo/dlp;

    invoke-virtual {v0}, Lo/dlp;->b()V

    .line 218
    :cond_0
    iget-object v0, p0, Lo/dlp$2;->e:Lo/dlp;

    invoke-static {v0}, Lo/dlp;->e(Lo/dlp;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_app_third_login"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 219
    const-string v0, "1"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 220
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "third"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    iget-object v0, p0, Lo/dlp$2;->e:Lo/dlp;

    invoke-static {v0}, Lo/dlp;->b(Lo/dlp;)Lcom/huawei/hihealth/HiUserInfo;

    iget-object v0, p0, Lo/dlp$2;->e:Lo/dlp;

    invoke-static {v0}, Lo/dlp;->b(Lo/dlp;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dlp$2;->e:Lo/dlp;

    invoke-static {v0}, Lo/dlp;->b(Lo/dlp;)Lcom/huawei/hihealth/HiUserInfo;

    iget-object v0, p0, Lo/dlp$2;->e:Lo/dlp;

    invoke-static {v0}, Lo/dlp;->b(Lo/dlp;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 222
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter set by ge"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    iget-object v0, p0, Lo/dlp$2;->e:Lo/dlp;

    invoke-virtual {v0}, Lo/dlp;->b()V

    .line 225
    :cond_1
    iget-object v0, p0, Lo/dlp$2;->e:Lo/dlp;

    invoke-static {v0}, Lo/dlp;->b(Lo/dlp;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getBirthday()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 226
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter set by bir"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    iget-object v0, p0, Lo/dlp$2;->e:Lo/dlp;

    invoke-virtual {v0}, Lo/dlp;->b()V

    .line 232
    :cond_2
    return-void
.end method

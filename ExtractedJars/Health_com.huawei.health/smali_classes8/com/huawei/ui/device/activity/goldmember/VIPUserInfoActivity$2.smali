.class Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V
    .locals 0

    .line 245
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public callback(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;)V
    .locals 9

    .line 248
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "retCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", retMsg = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 250
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "memberStatus is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    return-void

    .line 254
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-virtual {p3}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->getMemAdLevel()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lo/dbf;->c(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->c(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;I)I

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-virtual {p3}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->getMemLevel()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->d(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;I)I

    .line 258
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-virtual {p3}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->getExpireTime()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->e:Ljava/lang/String;

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-virtual {p3}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->getLevelName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->c(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-virtual {p3}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->getLevelIconUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->a(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-virtual {p3}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->getIntentLevelName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->e(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->n(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->n(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    .line 269
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_gold:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 273
    :goto_0
    const-string v0, "300001"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->f(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_1

    .line 276
    :cond_2
    const-string v0, "L300001"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->f(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_1

    .line 279
    :cond_3
    const-string v0, "0"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->f(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_1

    .line 283
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->f(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 284
    return-void

    .line 287
    :goto_1
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "retCode1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", retMsg = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",memLevel ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->l(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", memAdLevel = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    .line 288
    invoke-static {v3}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->m(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", expireTime ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    iget-object v3, v3, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", curTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 289
    invoke-virtual {p3}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->getCurTime()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",levelName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->n(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "levelIconUrl="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->o(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 287
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    invoke-virtual {p3}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->getCurTime()Ljava/lang/String;

    move-result-object v5

    .line 293
    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    .line 294
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy/MM/dd"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 296
    const/4 v7, 0x0

    .line 298
    :try_start_0
    invoke-virtual {v6, v5}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v7

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->a:J

    .line 300
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "curTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    iget-wide v3, v3, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->a:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 303
    goto :goto_2

    .line 301
    :catch_0
    move-exception v8

    .line 302
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ParseException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->h(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->p(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dnm;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$2;->c:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->f(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 308
    return-void
.end method

.class public Lo/axm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lo/axm;->a:Landroid/content/ContentResolver;

    .line 42
    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/health/sns/model/user/User;)Landroid/content/ContentProviderOperation;
    .locals 7

    .line 155
    const/4 v5, 0x0

    .line 157
    new-instance v0, Lo/axl;

    invoke-direct {v0}, Lo/axl;-><init>()V

    invoke-virtual {v0, p1}, Lo/axl;->c(Lcom/huawei/health/sns/model/user/User;)Landroid/content/ContentValues;

    move-result-object v6

    .line 159
    sget-object v0, Lo/bbz$p;->c:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newUpdate(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    const-string v1, "user_id = ? "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    .line 161
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 160
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentProviderOperation$Builder;->withSelection(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 161
    invoke-virtual {v0, v6}, Landroid/content/ContentProviderOperation$Builder;->withValues(Landroid/content/ContentValues;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v5

    .line 163
    return-object v5
.end method

.method public c(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/model/user/UserNotify;)Lcom/huawei/health/sns/model/user/User;
    .locals 2

    .line 52
    if-eqz p1, :cond_8

    if-eqz p2, :cond_8

    .line 54
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 56
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 62
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getPhoneDigest()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 63
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 64
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bqz;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 65
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 66
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bqz;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 68
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getPhoneDigest()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setPhoneDigest(Ljava/lang/String;)V

    .line 69
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setPhoneNumber(Ljava/lang/String;)V

    .line 72
    :cond_2
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 74
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setContactName(Ljava/lang/String;)V

    .line 75
    invoke-static {}, Lo/bpm;->b()Lo/bpp;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bpp;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setContactSortPinYin(Ljava/lang/String;)V

    .line 77
    :cond_3
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 79
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setImageUrl(Ljava/lang/String;)V

    .line 81
    :cond_4
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getUrlDownload()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 83
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getUrlDownload()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setImageURLDownload(Ljava/lang/String;)V

    .line 85
    :cond_5
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->a:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq v0, v1, :cond_6

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->b:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_7

    .line 87
    :cond_6
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setIsFriend(I)V

    .line 90
    :cond_7
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 92
    :cond_8
    return-object p1
.end method

.method public d(Lcom/huawei/health/sns/model/user/User;)Landroid/content/ContentProviderOperation;
    .locals 3

    .line 137
    const/4 v1, 0x0

    .line 139
    new-instance v0, Lo/axl;

    invoke-direct {v0}, Lo/axl;-><init>()V

    invoke-virtual {v0, p1}, Lo/axl;->e(Lcom/huawei/health/sns/model/user/User;)Landroid/content/ContentValues;

    move-result-object v2

    .line 141
    sget-object v0, Lo/bbz$p;->c:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/ContentProviderOperation$Builder;->withValues(Landroid/content/ContentValues;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v1

    .line 143
    return-object v1
.end method

.method public e(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Landroid/content/ContentProviderOperation;>;)[Landroid/content/ContentProviderResult;"
        }
    .end annotation

    .line 103
    const/4 v3, 0x0

    .line 104
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 106
    :cond_0
    const-string v0, "UserBatchHandler"

    const-string v1, "applyOperationBatch failed! operations is Empty! "

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    return-object v3

    .line 110
    :cond_1
    const-string v0, "UserBatchHandler"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "applyOperationBatch begin! operations : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    :try_start_0
    iget-object v0, p0, Lo/axm;->a:Landroid/content/ContentResolver;

    const-string v1, "com.huawei.health.sns.provider"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentResolver;->applyBatch(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/OperationApplicationException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v3, v0

    .line 123
    goto :goto_0

    .line 116
    :catch_0
    move-exception v4

    .line 118
    const-string v0, "UserBatchHandler"

    const-string v1, "applyOperationBatch Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    goto :goto_0

    .line 120
    :catch_1
    move-exception v4

    .line 122
    const-string v0, "UserBatchHandler"

    const-string v1, "applyOperationBatch Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    :goto_0
    return-object v3
.end method

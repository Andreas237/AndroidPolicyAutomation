.class public Lo/axt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Landroid/content/ContentResolver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const-class v0, Lo/axt;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/axt;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/axt;->b:Landroid/content/ContentResolver;

    .line 44
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/user/UserNotify;)Landroid/content/ContentProviderOperation;
    .locals 6

    .line 524
    const/4 v5, 0x0

    .line 526
    sget-object v0, Lo/bbz$o;->e:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newDelete(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    const-string v1, "user_id = ? "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    .line 528
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 527
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentProviderOperation$Builder;->withSelection(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 528
    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v5

    .line 530
    return-object v5
.end method

.method private b()[Ljava/lang/String;
    .locals 3

    .line 190
    const/16 v0, 0x19

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "t_user_notify.user_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "t_user_notify.image_url"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "t_user_notify.image_download_url"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "t_user_notify.nick_name"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "t_user.display_name"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "t_user_notify.phone_digest"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "t_user_notify.newly_recieved_notify"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "t_user_notify.type"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "t_user_notify.send_time"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "t_user_notify.note"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "t_user_notify.state"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "t_user_notify.notifiedSide"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "t_user.is_friend"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "t_user_notify.old_image_url"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "t_user.remark_name"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "t_user.phone_number"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "t_user.account"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "t_user.gender"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "t_user.province"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const-string v1, "t_user.city"

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-string v1, "t_user.signature"

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const-string v1, "t_user_notify.frd_origin_type"

    const/16 v2, 0x15

    aput-object v1, v0, v2

    const-string v1, "t_user_notify.frd_origin_desc"

    const/16 v2, 0x16

    aput-object v1, v0, v2

    const-string v1, "t_user_notify.my_origin_type"

    const/16 v2, 0x17

    aput-object v1, v0, v2

    const-string v1, "t_user_notify.my_origin_desc"

    const/16 v2, 0x18

    aput-object v1, v0, v2

    return-object v0
.end method

.method private c(Lcom/huawei/health/sns/model/user/UserNotify;)Landroid/content/ContentProviderOperation;
    .locals 3

    .line 489
    const/4 v1, 0x0

    .line 491
    new-instance v0, Lo/axp;

    invoke-direct {v0}, Lo/axp;-><init>()V

    invoke-virtual {v0, p1}, Lo/axp;->a(Lcom/huawei/health/sns/model/user/UserNotify;)Landroid/content/ContentValues;

    move-result-object v2

    .line 493
    sget-object v0, Lo/bbz$o;->e:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/ContentProviderOperation$Builder;->withValues(Landroid/content/ContentValues;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v1

    .line 495
    return-object v1
.end method

.method private c(Lcom/huawei/health/sns/model/user/UserNotifyNote;)Landroid/content/ContentProviderOperation;
    .locals 3

    .line 506
    const/4 v1, 0x0

    .line 508
    new-instance v0, Lo/axp;

    invoke-direct {v0}, Lo/axp;-><init>()V

    invoke-virtual {v0, p1}, Lo/axp;->b(Lcom/huawei/health/sns/model/user/UserNotifyNote;)Landroid/content/ContentValues;

    move-result-object v2

    .line 510
    sget-object v0, Lo/bbz$l;->b:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/ContentProviderOperation$Builder;->withValues(Landroid/content/ContentValues;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 511
    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v1

    .line 513
    return-object v1
.end method

.method private c(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;)Z"
        }
    .end annotation

    .line 383
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    if-eqz p2, :cond_1

    .line 384
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    if-eqz p3, :cond_2

    .line 385
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    .line 383
    :goto_0
    return v0
.end method

.method private c(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Landroid/content/ContentProviderOperation;>;)[Landroid/content/ContentProviderResult;"
        }
    .end annotation

    .line 455
    const/4 v3, 0x0

    .line 456
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 458
    :cond_0
    sget-object v0, Lo/axt;->a:Ljava/lang/String;

    const-string v1, "applyOperationBatch failed! operations is Empty! "

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 459
    return-object v3

    .line 462
    :cond_1
    sget-object v0, Lo/axt;->a:Ljava/lang/String;

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

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 466
    :try_start_0
    iget-object v0, p0, Lo/axt;->b:Landroid/content/ContentResolver;

    const-string v1, "com.huawei.health.sns.provider"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentResolver;->applyBatch(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/OperationApplicationException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v3, v0

    .line 475
    goto :goto_0

    .line 468
    :catch_0
    move-exception v4

    .line 470
    sget-object v0, Lo/axt;->a:Ljava/lang/String;

    const-string v1, "applyOperationBatch Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 475
    goto :goto_0

    .line 472
    :catch_1
    move-exception v4

    .line 474
    sget-object v0, Lo/axt;->a:Ljava/lang/String;

    const-string v1, "applyOperationBatch Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 476
    :goto_0
    sget-object v0, Lo/axt;->a:Ljava/lang/String;

    const-string v1, "applyOperationBatch end!"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 478
    return-object v3
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/user/UserNotifyNote;)Z
    .locals 5

    .line 313
    const/4 v3, 0x0

    .line 316
    :try_start_0
    iget-object v0, p0, Lo/axt;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$l;->b:Landroid/net/Uri;

    new-instance v2, Lo/axp;

    invoke-direct {v2}, Lo/axp;-><init>()V

    .line 317
    invoke-virtual {v2, p1}, Lo/axp;->b(Lcom/huawei/health/sns/model/user/UserNotifyNote;)Landroid/content/ContentValues;

    move-result-object v2

    .line 316
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v4

    .line 318
    if-eqz v4, :cond_0

    .line 320
    iget-object v0, p0, Lo/axt;->b:Landroid/content/ContentResolver;

    invoke-static {v4, v0}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 321
    const/4 v3, 0x1

    .line 327
    :cond_0
    goto :goto_0

    .line 324
    :catch_0
    move-exception v4

    .line 326
    sget-object v0, Lo/axt;->a:Ljava/lang/String;

    const-string v1, "insertUserNotifyNote SQLException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    :goto_0
    return v3
.end method

.method public c()Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;"
        }
    .end annotation

    .line 53
    const/4 v6, 0x0

    .line 55
    const-string v7, "newly_recieved_notify = ? and type <>? "

    .line 56
    const/4 v0, 0x2

    new-array v8, v0, [Ljava/lang/String;

    .line 57
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->e:Lcom/huawei/health/sns/model/user/UserNotify$b;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/UserNotify$b;->c()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 58
    const/4 v9, 0x0

    .line 59
    new-instance v10, Lo/axp;

    invoke-direct {v10}, Lo/axp;-><init>()V

    .line 62
    :try_start_0
    iget-object v0, p0, Lo/axt;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$o;->e:Landroid/net/Uri;

    move-object v3, v7

    move-object v4, v8

    const-string v5, "send_time DESC"

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v9, v0

    .line 64
    if-eqz v9, :cond_0

    invoke-interface {v9}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 66
    const/4 v11, 0x0

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v6, v0

    .line 68
    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    invoke-virtual {v10, v9}, Lo/axp;->a(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/user/UserNotify;

    move-result-object v11

    .line 71
    invoke-interface {v6, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 81
    :cond_0
    if-eqz v9, :cond_2

    .line 83
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 75
    :catch_0
    move-exception v11

    .line 77
    :try_start_1
    sget-object v0, Lo/axt;->a:Ljava/lang/String;

    const-string v1, "getAllUnReadUserNotify SQLException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    if-eqz v9, :cond_2

    .line 83
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 81
    :catchall_0
    move-exception v12

    if-eqz v9, :cond_1

    .line 83
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 85
    :cond_1
    throw v12

    .line 86
    :cond_2
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 87
    sget-object v0, Lo/axt;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getAllUnReadUserNotify size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    :cond_3
    return-object v6
.end method

.method public c(Z)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;"
        }
    .end annotation

    .line 226
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 227
    new-instance v7, Lo/axp;

    invoke-direct {v7}, Lo/axp;-><init>()V

    .line 228
    const/4 v8, 0x0

    .line 230
    const/4 v9, 0x0

    .line 231
    const/4 v10, 0x0

    .line 232
    if-nez p1, :cond_0

    .line 234
    const-string v9, "type <>? "

    .line 235
    const/4 v0, 0x1

    new-array v10, v0, [Ljava/lang/String;

    .line 236
    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->e:Lcom/huawei/health/sns/model/user/UserNotify$b;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/UserNotify$b;->c()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v10, v1

    .line 240
    :cond_0
    :try_start_0
    iget-object v0, p0, Lo/axt;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$o;->b:Landroid/net/Uri;

    invoke-direct {p0}, Lo/axt;->b()[Ljava/lang/String;

    move-result-object v2

    move-object v3, v9

    move-object v4, v10

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v8, v0

    .line 242
    if-eqz v8, :cond_1

    .line 244
    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 246
    const/4 v11, 0x0

    .line 247
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 249
    invoke-virtual {v7, v8}, Lo/axp;->d(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/user/UserNotify;

    move-result-object v11

    .line 250
    invoke-interface {v6, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 261
    :cond_1
    if-eqz v8, :cond_3

    .line 263
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 255
    :catch_0
    move-exception v11

    .line 257
    :try_start_1
    sget-object v0, Lo/axt;->a:Ljava/lang/String;

    const-string v1, "getUserNotifyList SQLException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 261
    if-eqz v8, :cond_3

    .line 263
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 261
    :catchall_0
    move-exception v12

    if-eqz v8, :cond_2

    .line 263
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 265
    :cond_2
    throw v12

    .line 266
    :cond_3
    :goto_1
    return-object v6
.end method

.method public d(J)Lcom/huawei/health/sns/model/user/UserNotify;
    .locals 13

    .line 100
    const/4 v6, 0x0

    .line 101
    new-instance v7, Lo/axp;

    invoke-direct {v7}, Lo/axp;-><init>()V

    .line 103
    const-string v8, "t_user_notify.user_id = ? and type <>? "

    .line 104
    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    .line 105
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->e:Lcom/huawei/health/sns/model/user/UserNotify$b;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/UserNotify$b;->c()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 107
    const/4 v10, 0x0

    .line 110
    :try_start_0
    iget-object v0, p0, Lo/axt;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$o;->b:Landroid/net/Uri;

    invoke-direct {p0}, Lo/axt;->b()[Ljava/lang/String;

    move-result-object v2

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v10, v0

    .line 112
    if-nez v10, :cond_1

    .line 114
    const/4 v11, 0x0

    .line 128
    const/4 v0, 0x0

    if-eq v0, v10, :cond_0

    .line 130
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 131
    const/4 v10, 0x0

    .line 114
    :cond_0
    return-object v11

    .line 116
    :cond_1
    :try_start_1
    invoke-interface {v10}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_2

    .line 118
    invoke-interface {v10}, Landroid/database/Cursor;->moveToFirst()Z

    .line 119
    invoke-virtual {v7, v10}, Lo/axp;->d(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/user/UserNotify;
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 128
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v10, :cond_4

    .line 130
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 131
    const/4 v10, 0x0

    goto :goto_0

    .line 122
    :catch_0
    move-exception v11

    .line 124
    :try_start_2
    sget-object v0, Lo/axt;->a:Ljava/lang/String;

    const-string v1, "getUserNotifyById SQLException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 128
    const/4 v0, 0x0

    if-eq v0, v10, :cond_4

    .line 130
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 131
    const/4 v10, 0x0

    goto :goto_0

    .line 128
    :catchall_0
    move-exception v12

    const/4 v0, 0x0

    if-eq v0, v10, :cond_3

    .line 130
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 131
    const/4 v10, 0x0

    .line 133
    :cond_3
    throw v12

    .line 134
    :cond_4
    :goto_0
    return-object v6
.end method

.method public d(Lcom/huawei/health/sns/model/user/UserNotify;Ljava/util/List;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/user/UserNotify;Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;)Z"
        }
    .end annotation

    .line 341
    const/4 v5, 0x0

    .line 343
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 344
    sget-object v0, Lo/bbz$o;->e:Landroid/net/Uri;

    .line 345
    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newDelete(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    const-string v1, "user_id = ? "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    .line 347
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 346
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentProviderOperation$Builder;->withSelection(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 347
    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v7

    .line 348
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 352
    sget-object v0, Lo/bbz$l;->b:Landroid/net/Uri;

    .line 353
    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newDelete(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    const-string v1, "user_id = ? "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    .line 355
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 354
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentProviderOperation$Builder;->withSelection(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 355
    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v8

    .line 356
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 359
    :cond_0
    invoke-direct {p0, v6}, Lo/axt;->c(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;

    move-result-object v8

    .line 360
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    .line 362
    array-length v0, v8

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    .line 363
    :goto_0
    sget-object v0, Lo/axt;->a:Ljava/lang/String;

    const-string v1, "deleteUserNotify :: after deleteUserNotify results"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 367
    :cond_2
    sget-object v0, Lo/axt;->a:Ljava/lang/String;

    const-string v1, "deleteUserNotify :: after deleteUserNotify is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    :goto_1
    return v5
.end method

.method public d(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;)Z"
        }
    .end annotation

    .line 399
    const/4 v2, 0x0

    .line 400
    invoke-direct {p0, p1, p2, p3}, Lo/axt;->c(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 402
    sget-object v0, Lo/axt;->a:Ljava/lang/String;

    const-string v1, "insertNotifyList and updateNotifyList and notifyNoteList is null or size =0, batchInsertOrUpdateNotify is fail."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 403
    return v2

    .line 406
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 408
    if-eqz p1, :cond_1

    .line 410
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 412
    invoke-direct {p0, v5}, Lo/axt;->c(Lcom/huawei/health/sns/model/user/UserNotify;)Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 413
    goto :goto_0

    .line 416
    :cond_1
    if-eqz p2, :cond_2

    .line 418
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 421
    invoke-direct {p0, v5}, Lo/axt;->b(Lcom/huawei/health/sns/model/user/UserNotify;)Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 422
    invoke-direct {p0, v5}, Lo/axt;->c(Lcom/huawei/health/sns/model/user/UserNotify;)Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 423
    goto :goto_1

    .line 426
    :cond_2
    if-eqz p3, :cond_3

    .line 428
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/user/UserNotifyNote;

    .line 430
    invoke-direct {p0, v5}, Lo/axt;->c(Lcom/huawei/health/sns/model/user/UserNotifyNote;)Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 431
    goto :goto_2

    .line 434
    :cond_3
    invoke-direct {p0, v3}, Lo/axt;->c(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;

    move-result-object v4

    .line 435
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    .line 437
    array-length v0, v4

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    goto :goto_4

    .line 441
    :cond_5
    sget-object v0, Lo/axt;->a:Ljava/lang/String;

    const-string v1, "batchInsertOrUpdateNotify :: after batchInsertOrUpdateNotify is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 444
    :goto_4
    return v2
.end method

.method public e(J)Ljava/util/ArrayList;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;"
        }
    .end annotation

    .line 145
    const/4 v6, 0x0

    .line 146
    const-string v7, "user_id=?"

    .line 147
    const/4 v0, 0x1

    new-array v8, v0, [Ljava/lang/String;

    .line 148
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 149
    new-instance v9, Lo/axp;

    invoke-direct {v9}, Lo/axp;-><init>()V

    .line 150
    const/4 v10, 0x0

    .line 153
    :try_start_0
    iget-object v0, p0, Lo/axt;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$l;->b:Landroid/net/Uri;

    move-object v3, v7

    move-object v4, v8

    const-string v5, "id DESC"

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v10, v0

    .line 155
    if-eqz v10, :cond_0

    .line 157
    invoke-interface {v10}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 159
    const/4 v11, 0x0

    .line 160
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v6, v0

    .line 161
    :goto_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    invoke-virtual {v9, v10}, Lo/axp;->b(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/user/UserNotifyNote;

    move-result-object v11

    .line 164
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 175
    :cond_0
    if-eqz v10, :cond_2

    .line 177
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 169
    :catch_0
    move-exception v11

    .line 171
    :try_start_1
    sget-object v0, Lo/axt;->a:Ljava/lang/String;

    const-string v1, "getUserNotifyNote SQLException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 175
    if-eqz v10, :cond_2

    .line 177
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 175
    :catchall_0
    move-exception v12

    if-eqz v10, :cond_1

    .line 177
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 179
    :cond_1
    throw v12

    .line 180
    :cond_2
    :goto_1
    return-object v6
.end method

.method public e(Lcom/huawei/health/sns/model/user/UserNotify;)Z
    .locals 9

    .line 277
    const/4 v6, 0x0

    .line 279
    if-eqz p1, :cond_1

    .line 283
    :try_start_0
    new-instance v0, Lo/axp;

    invoke-direct {v0}, Lo/axp;-><init>()V

    invoke-virtual {v0, p1}, Lo/axp;->d(Lcom/huawei/health/sns/model/user/UserNotify;)Landroid/content/ContentValues;

    move-result-object v7

    .line 284
    iget-object v0, p0, Lo/axt;->b:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$o;->e:Landroid/net/Uri;

    const-string v2, "user_id =? "

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    .line 286
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 284
    invoke-virtual {v0, v1, v7, v2, v3}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v8

    .line 287
    if-lez v8, :cond_0

    .line 289
    const/4 v6, 0x1

    .line 290
    sget-object v0, Lo/bbz$o;->e:Landroid/net/Uri;

    iget-object v1, p0, Lo/axt;->b:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V

    goto :goto_0

    .line 294
    :cond_0
    const-string v0, "UserDBHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isUpdateSucc = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 300
    :goto_0
    goto :goto_1

    .line 297
    :catch_0
    move-exception v7

    .line 299
    sget-object v0, Lo/axt;->a:Ljava/lang/String;

    const-string v1, "updateUserNotify SQLException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    :cond_1
    :goto_1
    return v6
.end method

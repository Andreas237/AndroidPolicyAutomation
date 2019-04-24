.class public Lcom/huawei/bone/social/manager/service/SocialSyncService;
.super Landroid/app/IntentService;
.source "SourceFile"


# static fields
.field private static d:I


# instance fields
.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 38
    const/16 v0, 0x65

    sput v0, Lcom/huawei/bone/social/manager/service/SocialSyncService;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 57
    const-string v0, "SocialSyncService"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService;->c:I

    .line 58
    return-void
.end method

.method static synthetic a()I
    .locals 1

    .line 34
    sget v0, Lcom/huawei/bone/social/manager/service/SocialSyncService;->d:I

    return v0
.end method

.method private b()V
    .locals 5

    .line 100
    sget v0, Lcom/huawei/bone/social/manager/service/SocialSyncService;->d:I

    const/16 v1, 0x65

    if-eq v0, v1, :cond_0

    .line 101
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "forceSync mSyncStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lcom/huawei/bone/social/manager/service/SocialSyncService;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mSyncStatus != STATUS_FORCE_SYNC_FINISHED return!"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    return-void

    .line 105
    :cond_0
    invoke-static {p0}, Lo/xp;->g(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 106
    invoke-direct {p0}, Lcom/huawei/bone/social/manager/service/SocialSyncService;->e()Landroid/database/Cursor;

    move-result-object v4

    .line 107
    if-eqz v4, :cond_1

    invoke-interface {v4}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 108
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "forceSync Has dirty Posts."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    invoke-direct {p0, v4}, Lcom/huawei/bone/social/manager/service/SocialSyncService;->b(Landroid/database/Cursor;)V

    goto :goto_0

    .line 111
    :cond_1
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "forceSync No dirty Posts."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 115
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 117
    :cond_2
    goto :goto_1

    .line 118
    :cond_3
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "forceSync isNetworkConnected offline !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    :goto_1
    return-void
.end method

.method private b(Landroid/database/Cursor;)V
    .locals 9

    .line 129
    if-eqz p1, :cond_6

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_6

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 130
    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v4

    .line 131
    const/16 v0, 0x64

    sput v0, Lcom/huawei/bone/social/manager/service/SocialSyncService;->d:I

    .line 132
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "uploadAll mSyncStatus is STATUS_FORCE_SYNC_RUNNING = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lcom/huawei/bone/social/manager/service/SocialSyncService;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   syncCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    :cond_0
    const-string v0, "actId"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v5

    .line 136
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "uploadAll dirty post id :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 138
    const-string v0, "MOMENT_ID"

    invoke-virtual {v7, v0, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 139
    const-string v0, "type"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 142
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 143
    sget-object v0, Lo/xx$c;->a:Lo/xx$c;

    invoke-virtual {v0}, Lo/xx$c;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lo/xx$c;->k:Lo/xx$c;

    .line 144
    invoke-virtual {v0}, Lo/xx$c;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 145
    :cond_1
    new-instance v0, Lcom/huawei/bone/social/manager/service/SocialSyncService$3;

    invoke-direct {v0, p0, v4}, Lcom/huawei/bone/social/manager/service/SocialSyncService$3;-><init>(Lcom/huawei/bone/social/manager/service/SocialSyncService;I)V

    invoke-direct {p0, v7, v0}, Lcom/huawei/bone/social/manager/service/SocialSyncService;->e(Landroid/content/Intent;Lo/wo;)V

    goto/16 :goto_0

    .line 177
    :cond_2
    iget v0, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService;->c:I

    .line 178
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "uploadAll sync type is other type mSyncFinshCount: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    iget v0, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService;->c:I

    if-ne v0, v4, :cond_3

    .line 180
    const/16 v0, 0x65

    sput v0, Lcom/huawei/bone/social/manager/service/SocialSyncService;->d:I

    .line 182
    :cond_3
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "uploadAll sync type is other type onFail sync status: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lcom/huawei/bone/social/manager/service/SocialSyncService;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 185
    :cond_4
    iget v0, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService;->c:I

    .line 186
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "uploadAll the type is empety mSyncFinshCount: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    iget v0, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService;->c:I

    if-ne v0, v4, :cond_5

    .line 188
    const/16 v0, 0x65

    sput v0, Lcom/huawei/bone/social/manager/service/SocialSyncService;->d:I

    .line 190
    :cond_5
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "uploadAll the type is empty onFail sync status: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lcom/huawei/bone/social/manager/service/SocialSyncService;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 194
    :cond_6
    return-void
.end method

.method static synthetic d(Lcom/huawei/bone/social/manager/service/SocialSyncService;)I
    .locals 2

    .line 34
    iget v0, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService;->c:I

    return v0
.end method

.method private d(Landroid/content/Intent;)V
    .locals 4

    .line 197
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter syncTypeSyncLikeProcess !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    invoke-static {p0}, Lo/xu;->a(Landroid/content/Context;)Lo/xu;

    move-result-object v0

    invoke-virtual {v0}, Lo/xu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 199
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncTypeSyncLikeProcess syncLikeById !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    new-instance v0, Lcom/huawei/bone/social/manager/service/SocialSyncService$1;

    invoke-direct {v0, p0}, Lcom/huawei/bone/social/manager/service/SocialSyncService$1;-><init>(Lcom/huawei/bone/social/manager/service/SocialSyncService;)V

    invoke-direct {p0, p1, v0}, Lcom/huawei/bone/social/manager/service/SocialSyncService;->e(Landroid/content/Intent;Lo/wo;)V

    .line 222
    :cond_0
    return-void
.end method

.method static synthetic e(I)I
    .locals 0

    .line 34
    sput p0, Lcom/huawei/bone/social/manager/service/SocialSyncService;->d:I

    return p0
.end method

.method static synthetic e(Lcom/huawei/bone/social/manager/service/SocialSyncService;)I
    .locals 1

    .line 34
    iget v0, p0, Lcom/huawei/bone/social/manager/service/SocialSyncService;->c:I

    return v0
.end method

.method private e()Landroid/database/Cursor;
    .locals 2

    .line 124
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0}, Lo/wr;->g()Landroid/database/Cursor;

    move-result-object v1

    .line 125
    return-object v1
.end method

.method private e(Landroid/content/Intent;Lo/wo;)V
    .locals 13

    .line 226
    const-string v0, "MOMENT_ID"

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v6

    .line 227
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter syncLikeById moment Id :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-gez v0, :cond_5

    .line 229
    sget-object v0, Lo/wk;->c:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "post_id"

    .line 230
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v8

    .line 231
    invoke-virtual {p0}, Lcom/huawei/bone/social/manager/service/SocialSyncService;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object v1, v8

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 233
    const/4 v0, 0x0

    if-eq v0, v9, :cond_2

    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 234
    const-string v0, "actParentId"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v10

    .line 235
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "syncLikeById postId :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    const-string v0, "type"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 238
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 239
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncLikeById fail 2222 !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 242
    :cond_0
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncLikeById fail 1111 !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 244
    invoke-interface {p2}, Lo/wo;->e()V

    .line 249
    :cond_1
    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 251
    goto :goto_1

    .line 252
    :cond_2
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncLikeById fail 2222 !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    const/4 v0, 0x0

    if-eq v0, v9, :cond_3

    .line 255
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 257
    :cond_3
    const/4 v0, 0x0

    if-eq v0, p2, :cond_4

    .line 258
    invoke-interface {p2}, Lo/wo;->e()V

    .line 261
    :cond_4
    :goto_1
    goto :goto_2

    .line 262
    :cond_5
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncLikeById fail 3333 !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    const/4 v0, 0x0

    if-eq v0, p2, :cond_6

    .line 264
    invoke-interface {p2}, Lo/wo;->e()V

    .line 267
    :cond_6
    :goto_2
    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 0

    .line 62
    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    .line 64
    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 9

    .line 68
    const-string v0, "SYNC_TYPE"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 70
    const-string v0, "SocialSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SocialSyncService onHandleIntent syncType "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    if-nez v4, :cond_0

    .line 73
    const-string v4, "RETRY_SYNC_ALL"

    .line 76
    :cond_0
    move-object v5, v4

    const/4 v6, -0x1

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "RETRY_SYNC_FORCED"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v6, 0x0

    goto :goto_0

    :sswitch_1
    const-string v0, "SYNC_LIKE"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "CLEANUP_POST"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v6, 0x2

    goto :goto_0

    :sswitch_3
    const-string v0, "CLEANUP_OFFLINE_POST"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v6, 0x3

    :cond_1
    :goto_0
    packed-switch v6, :pswitch_data_0

    goto :goto_1

    .line 78
    :pswitch_0
    invoke-direct {p0}, Lcom/huawei/bone/social/manager/service/SocialSyncService;->b()V

    .line 79
    goto :goto_1

    .line 82
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/huawei/bone/social/manager/service/SocialSyncService;->d(Landroid/content/Intent;)V

    .line 83
    goto :goto_1

    .line 86
    :pswitch_2
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0}, Lo/wr;->f()V

    .line 87
    goto :goto_1

    .line 89
    :pswitch_3
    invoke-static {}, Lo/xp;->e()J

    move-result-wide v0

    const-wide/32 v2, 0x15180

    sub-long v7, v0, v2

    .line 91
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, v7, v8}, Lo/wr;->a(J)V

    .line 92
    .line 97
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x3aae4945 -> :sswitch_1
        -0x1426f089 -> :sswitch_3
        -0x13e9663a -> :sswitch_0
        0x7980597b -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

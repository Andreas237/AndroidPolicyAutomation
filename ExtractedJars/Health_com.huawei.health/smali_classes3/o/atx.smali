.class public Lo/atx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private d:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lo/atx;->d:Landroid/content/ContentResolver;

    .line 56
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/atx;->d:Landroid/content/ContentResolver;

    .line 57
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/group/GroupMember;)Landroid/content/ContentProviderOperation;
    .locals 6

    .line 360
    const/4 v2, 0x0

    .line 362
    const-string v3, "group_id =? and user_id =? "

    .line 364
    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/String;

    .line 365
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 367
    new-instance v0, Lo/atz;

    invoke-direct {v0}, Lo/atz;-><init>()V

    invoke-virtual {v0, p1}, Lo/atz;->a(Lcom/huawei/health/sns/model/group/GroupMember;)Landroid/content/ContentValues;

    move-result-object v5

    .line 369
    sget-object v0, Lo/bbz$g;->a:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newUpdate(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 370
    invoke-virtual {v0, v3, v4}, Landroid/content/ContentProviderOperation$Builder;->withSelection(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/ContentProviderOperation$Builder;->withValues(Landroid/content/ContentValues;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v2

    .line 372
    return-object v2
.end method

.method private b(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;)I"
        }
    .end annotation

    .line 111
    const/4 v3, 0x0

    .line 112
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 115
    invoke-direct {p0, v5, p1}, Lo/atx;->b(Lcom/huawei/health/sns/model/group/GroupMember;Ljava/util/List;)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v6

    .line 118
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 120
    if-eqz v6, :cond_0

    .line 123
    const-string v0, "GroupMemberBatchDBHelper"

    const-string v1, "enter splitMemberList add delete"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    invoke-interface {p5, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 129
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 131
    goto :goto_0

    .line 134
    :cond_1
    if-nez v6, :cond_2

    .line 136
    invoke-interface {p3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 140
    :cond_2
    invoke-interface {p4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 142
    :goto_1
    goto :goto_0

    .line 143
    :cond_3
    const-string v0, "GroupMemberBatchDBHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "splitMemberList return "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    return v3
.end method

.method private b(Lcom/huawei/health/sns/model/group/GroupMember;Ljava/util/List;)Lcom/huawei/health/sns/model/group/GroupMember;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/group/GroupMember;Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;)Lcom/huawei/health/sns/model/group/GroupMember;"
        }
    .end annotation

    .line 156
    const/4 v4, 0x0

    .line 157
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 159
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 161
    move-object v4, v6

    .line 162
    goto :goto_1

    .line 164
    :cond_0
    goto :goto_0

    .line 165
    :cond_1
    :goto_1
    return-object v4
.end method

.method private c(Ljava/util/List;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;)I"
        }
    .end annotation

    .line 176
    const/4 v3, 0x0

    .line 178
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 180
    :cond_0
    return v3

    .line 184
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 186
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 188
    invoke-direct {p0, v6}, Lo/atx;->d(Lcom/huawei/health/sns/model/group/GroupMember;)Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    goto :goto_0

    .line 190
    :cond_2
    invoke-direct {p0, v4}, Lo/atx;->e(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;

    move-result-object v5

    .line 191
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 193
    array-length v3, v5

    .line 194
    const-string v0, "GroupMemberBatchDBHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "batchInsertGroupMember insertCount "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 198
    :cond_3
    const/4 v3, 0x0

    .line 199
    const-string v0, "GroupMemberBatchDBHelper"

    const-string v1, "batchInsertGroupMember insertCount is 0"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    :goto_1
    return v3
.end method

.method private d(Lcom/huawei/health/sns/model/group/GroupMember;)Landroid/content/ContentProviderOperation;
    .locals 3

    .line 325
    const/4 v1, 0x0

    .line 326
    new-instance v0, Lo/atz;

    invoke-direct {v0}, Lo/atz;-><init>()V

    invoke-virtual {v0, p1}, Lo/atz;->a(Lcom/huawei/health/sns/model/group/GroupMember;)Landroid/content/ContentValues;

    move-result-object v2

    .line 328
    sget-object v0, Lo/bbz$g;->a:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/ContentProviderOperation$Builder;->withValues(Landroid/content/ContentValues;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v1

    .line 329
    return-object v1
.end method

.method private e(Lcom/huawei/health/sns/model/group/GroupMember;)Landroid/content/ContentProviderOperation;
    .locals 5

    .line 340
    const/4 v2, 0x0

    .line 341
    const-string v3, "group_id =? and user_id =? "

    .line 343
    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/String;

    .line 344
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 346
    sget-object v0, Lo/bbz$g;->a:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newDelete(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 347
    invoke-virtual {v0, v3, v4}, Landroid/content/ContentProviderOperation$Builder;->withSelection(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v2

    .line 349
    return-object v2
.end method

.method private e(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 383
    const-string v0, "GroupMemberBatchDBHelper"

    const-string v1, "sendMemberInfoChangeBroadcast."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    new-instance v2, Landroid/content/Intent;

    const-string v0, "user_groupmember_info_change"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 385
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 386
    instance-of v0, p1, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 388
    const-string v0, "bundleKeyMemberList"

    move-object v1, p1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 390
    :cond_0
    invoke-virtual {v2, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 391
    invoke-static {v2}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 392
    return-void
.end method

.method private e(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Landroid/content/ContentProviderOperation;>;)[Landroid/content/ContentProviderResult;"
        }
    .end annotation

    .line 292
    const/4 v3, 0x0

    .line 293
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 295
    :cond_0
    const-string v0, "GroupMemberBatchDBHelper"

    const-string v1, "applyOperationBatch failed! operations is Empty! "

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    return-object v3

    .line 299
    :cond_1
    const-string v0, "GroupMemberBatchDBHelper"

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

    .line 303
    :try_start_0
    iget-object v0, p0, Lo/atx;->d:Landroid/content/ContentResolver;

    const-string v1, "com.huawei.health.sns.provider"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentResolver;->applyBatch(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/OperationApplicationException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v3, v0

    .line 312
    goto :goto_0

    .line 305
    :catch_0
    move-exception v4

    .line 307
    const-string v0, "GroupMemberBatchDBHelper"

    const-string v1, "applyOperationBatch RemoteException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    goto :goto_0

    .line 309
    :catch_1
    move-exception v4

    .line 311
    const-string v0, "GroupMemberBatchDBHelper"

    const-string v1, "applyOperationBatch OperationApplicationException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    :goto_0
    return-object v3
.end method


# virtual methods
.method public b(Ljava/util/List;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;)I"
        }
    .end annotation

    .line 250
    const/4 v3, 0x0

    .line 252
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 254
    :cond_0
    return v3

    .line 258
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 260
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 262
    invoke-direct {p0, v6}, Lo/atx;->a(Lcom/huawei/health/sns/model/group/GroupMember;)Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    goto :goto_0

    .line 264
    :cond_2
    invoke-direct {p0, v4}, Lo/atx;->e(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;

    move-result-object v5

    .line 265
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 267
    array-length v3, v5

    .line 268
    const-string v0, "GroupMemberBatchDBHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "batchUpdateGroupMember updateCount "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 272
    :cond_3
    const/4 v3, 0x0

    .line 273
    const-string v0, "GroupMemberBatchDBHelper"

    const-string v1, "batchUpdateGroupMember updateCount is 0"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    :goto_1
    if-lez v3, :cond_4

    .line 279
    invoke-direct {p0, p1}, Lo/atx;->e(Ljava/util/List;)V

    .line 281
    :cond_4
    return v3
.end method

.method public d(Ljava/util/List;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;)I"
        }
    .end annotation

    .line 212
    const/4 v3, 0x0

    .line 214
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 216
    :cond_0
    const-string v0, "GroupMemberBatchDBHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "batchDeleteGroupMember return"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    return v3

    .line 221
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 223
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 225
    invoke-direct {p0, v6}, Lo/atx;->e(Lcom/huawei/health/sns/model/group/GroupMember;)Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    goto :goto_0

    .line 227
    :cond_2
    invoke-direct {p0, v4}, Lo/atx;->e(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;

    move-result-object v5

    .line 228
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 230
    array-length v3, v5

    .line 231
    const-string v0, "GroupMemberBatchDBHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "batchDeleteGroupMember deleteCount "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 235
    :cond_3
    const/4 v3, 0x0

    .line 236
    const-string v0, "GroupMemberBatchDBHelper"

    const-string v1, "batchDeleteGroupMember deleteCount is 0"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    :goto_1
    return v3
.end method

.method public e(Ljava/util/List;Ljava/util/List;)Z
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;)Z"
        }
    .end annotation

    .line 68
    const-string v0, "GroupMemberBatchDBHelper"

    const-string v1, "enter batchUpdateMemberList"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 70
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 71
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 74
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v9

    .line 76
    move-object v0, p0

    move-object/from16 v1, p2

    move-object v2, p1

    move-object v3, v6

    move-object v4, v7

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lo/atx;->b(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)I

    move-result v10

    .line 77
    sub-int/2addr v9, v10

    .line 79
    invoke-direct {p0, v6}, Lo/atx;->c(Ljava/util/List;)I

    move-result v11

    .line 80
    invoke-virtual {p0, v7}, Lo/atx;->b(Ljava/util/List;)I

    move-result v12

    .line 81
    invoke-virtual {p0, v8}, Lo/atx;->d(Ljava/util/List;)I

    move-result v13

    .line 83
    add-int v0, v11, v12

    add-int/2addr v0, v13

    if-ne v9, v0, :cond_0

    .line 85
    const/4 v0, 0x1

    return v0

    .line 89
    :cond_0
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 91
    const-string v0, "GroupMemberBatchDBHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "opreateCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " insertSize="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " updateSize="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " deleteSize="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.class public Lo/atw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/atw;->b:Landroid/content/ContentResolver;

    .line 58
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/atw;->b:Landroid/content/ContentResolver;

    .line 59
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/group/Group;)Landroid/content/ContentProviderOperation;
    .locals 6

    .line 251
    const/4 v2, 0x0

    .line 252
    const-string v3, "group_id =? "

    .line 254
    new-instance v0, Lo/att;

    invoke-direct {v0}, Lo/att;-><init>()V

    invoke-virtual {v0, p1}, Lo/att;->a(Lcom/huawei/health/sns/model/group/Group;)Landroid/content/ContentValues;

    move-result-object v4

    .line 256
    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    .line 257
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 259
    sget-object v0, Lo/bbz$a;->b:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newUpdate(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 260
    invoke-virtual {v0, v3, v5}, Landroid/content/ContentProviderOperation$Builder;->withSelection(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/ContentProviderOperation$Builder;->withValues(Landroid/content/ContentValues;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v2

    .line 262
    return-object v2
.end method

.method private a(Ljava/util/ArrayList;Ljava/util/List;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Landroid/content/ContentProviderOperation;>;Ljava/util/List<Lcom/huawei/health/sns/model/group/Group;>;I)V"
        }
    .end annotation

    .line 163
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 165
    :cond_0
    return-void

    .line 167
    :cond_1
    const/4 v1, 0x0

    .line 168
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/group/Group;

    .line 170
    invoke-direct {p0, v3, p3}, Lo/atw;->b(Lcom/huawei/health/sns/model/group/Group;I)Landroid/content/ContentProviderOperation;

    move-result-object v1

    .line 171
    if-eqz v1, :cond_2

    .line 173
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    :cond_2
    goto :goto_0

    .line 176
    :cond_3
    return-void
.end method

.method private a(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Landroid/content/ContentProviderOperation;>;)[Landroid/content/ContentProviderResult;"
        }
    .end annotation

    .line 69
    const/4 v3, 0x0

    .line 70
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 72
    :cond_0
    const-string v0, "GroupBatchDBHelper"

    const-string v1, "applyOperationBatch failed! operations is Empty! "

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    return-object v3

    .line 76
    :cond_1
    const-string v0, "GroupBatchDBHelper"

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

    .line 79
    :try_start_0
    iget-object v0, p0, Lo/atw;->b:Landroid/content/ContentResolver;

    const-string v1, "com.huawei.health.sns.provider"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentResolver;->applyBatch(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/OperationApplicationException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v3, v0

    .line 88
    goto :goto_0

    .line 81
    :catch_0
    move-exception v4

    .line 83
    const-string v0, "GroupBatchDBHelper"

    const-string v1, "applyOperationBatch RemoteException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    goto :goto_0

    .line 85
    :catch_1
    move-exception v4

    .line 87
    const-string v0, "GroupBatchDBHelper"

    const-string v1, "applyOperationBatch OperationApplicationException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    :goto_0
    return-object v3
.end method

.method private b(Ljava/util/ArrayList;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Landroid/content/ContentProviderOperation;>;)I"
        }
    .end annotation

    .line 213
    const/4 v3, 0x0

    .line 214
    invoke-direct {p0, p1}, Lo/atw;->a(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;

    move-result-object v4

    .line 215
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 217
    array-length v3, v4

    .line 218
    const-string v0, "GroupBatchDBHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doApplyBatch grpCount "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 222
    :cond_0
    const/4 v3, 0x0

    .line 223
    const-string v0, "GroupBatchDBHelper"

    const-string v1, "doApplyBatch grpCount is 0"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    :goto_0
    return v3
.end method

.method private b(Ljava/util/List;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/group/Group;>;I)I"
        }
    .end annotation

    .line 140
    const/4 v1, 0x0

    .line 142
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 144
    :cond_0
    return v1

    .line 147
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 148
    invoke-direct {p0, v2, p1, p2}, Lo/atw;->a(Ljava/util/ArrayList;Ljava/util/List;I)V

    .line 150
    invoke-direct {p0, v2}, Lo/atw;->b(Ljava/util/ArrayList;)I

    move-result v0

    return v0
.end method

.method private b(Lcom/huawei/health/sns/model/group/Group;I)Landroid/content/ContentProviderOperation;
    .locals 2

    .line 187
    const/4 v1, 0x0

    .line 188
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 191
    :pswitch_0
    invoke-direct {p0, p1}, Lo/atw;->c(Lcom/huawei/health/sns/model/group/Group;)Landroid/content/ContentProviderOperation;

    move-result-object v1

    .line 192
    goto :goto_0

    .line 194
    :pswitch_1
    invoke-direct {p0, p1}, Lo/atw;->a(Lcom/huawei/health/sns/model/group/Group;)Landroid/content/ContentProviderOperation;

    move-result-object v1

    .line 195
    goto :goto_0

    .line 197
    :pswitch_2
    invoke-direct {p0, p1}, Lo/atw;->e(Lcom/huawei/health/sns/model/group/Group;)Landroid/content/ContentProviderOperation;

    move-result-object v1

    .line 198
    .line 202
    :goto_0
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private c(Lcom/huawei/health/sns/model/group/Group;)Landroid/content/ContentProviderOperation;
    .locals 3

    .line 236
    const/4 v1, 0x0

    .line 237
    new-instance v0, Lo/att;

    invoke-direct {v0}, Lo/att;-><init>()V

    invoke-virtual {v0, p1}, Lo/att;->a(Lcom/huawei/health/sns/model/group/Group;)Landroid/content/ContentValues;

    move-result-object v2

    .line 239
    sget-object v0, Lo/bbz$a;->b:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/ContentProviderOperation$Builder;->withValues(Landroid/content/ContentValues;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v1

    .line 240
    return-object v1
.end method

.method private e(Lcom/huawei/health/sns/model/group/Group;)Landroid/content/ContentProviderOperation;
    .locals 6

    .line 273
    const/4 v2, 0x0

    .line 274
    const-string v3, "group_id =? "

    .line 276
    new-instance v0, Lo/att;

    invoke-direct {v0}, Lo/att;-><init>()V

    invoke-virtual {v0, p1}, Lo/att;->d(Lcom/huawei/health/sns/model/group/Group;)Landroid/content/ContentValues;

    move-result-object v4

    .line 278
    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    .line 279
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 281
    sget-object v0, Lo/bbz$a;->b:Landroid/net/Uri;

    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newUpdate(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 282
    invoke-virtual {v0, v3, v5}, Landroid/content/ContentProviderOperation$Builder;->withSelection(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/ContentProviderOperation$Builder;->withValues(Landroid/content/ContentValues;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v2

    .line 284
    return-object v2
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/util/List;Ljava/util/List;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/group/Group;>;Ljava/util/List<Lcom/huawei/health/sns/model/group/Group;>;Ljava/util/List<Lcom/huawei/health/sns/model/group/Group;>;)I"
        }
    .end annotation

    .line 114
    const/4 v1, 0x0

    .line 117
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    if-eqz p2, :cond_1

    .line 118
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    if-eqz p3, :cond_2

    .line 119
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 121
    :cond_2
    return v1

    .line 124
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 125
    const/4 v0, 0x1

    invoke-direct {p0, v2, p1, v0}, Lo/atw;->a(Ljava/util/ArrayList;Ljava/util/List;I)V

    .line 126
    const/4 v0, 0x2

    invoke-direct {p0, v2, p2, v0}, Lo/atw;->a(Ljava/util/ArrayList;Ljava/util/List;I)V

    .line 127
    const/4 v0, 0x3

    invoke-direct {p0, v2, p3, v0}, Lo/atw;->a(Ljava/util/ArrayList;Ljava/util/List;I)V

    .line 129
    invoke-direct {p0, v2}, Lo/atw;->b(Ljava/util/ArrayList;)I

    move-result v0

    return v0
.end method

.method public c(Ljava/util/List;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/group/Group;>;)I"
        }
    .end annotation

    .line 101
    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lo/atw;->b(Ljava/util/List;I)I

    move-result v0

    return v0
.end method

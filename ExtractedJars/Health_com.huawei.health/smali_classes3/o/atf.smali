.class public final Lo/atf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lo/atf;


# instance fields
.field private b:Landroid/support/v4/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LongSparseArray<Ljava/util/List<Ljava/lang/Long;>;>;"
        }
    .end annotation
.end field

.field private e:Lo/aub;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const/4 v0, 0x0

    sput-object v0, Lo/atf;->d:Lo/atf;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/atf;->e:Lo/aub;

    .line 44
    new-instance v0, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v0}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Lo/atf;->b:Landroid/support/v4/util/LongSparseArray;

    .line 51
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 52
    new-instance v0, Lo/aub;

    invoke-direct {v0, v1}, Lo/aub;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/atf;->e:Lo/aub;

    .line 53
    return-void
.end method

.method private static b(Ljava/util/List;)I
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupNotify;>;)I"
        }
    .end annotation

    .line 109
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    .line 110
    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    invoke-virtual {v0}, Lo/ave;->h()Ljava/util/List;

    move-result-object v5

    .line 112
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    .line 113
    if-lez v6, :cond_3

    .line 116
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 117
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/sns/model/group/GroupNotify;

    .line 119
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/avh;

    .line 122
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupId()J

    move-result-wide v0

    invoke-virtual {v11}, Lo/avh;->c()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 124
    invoke-interface {v7, v11}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 125
    goto :goto_2

    .line 127
    :cond_0
    goto :goto_1

    .line 128
    :cond_1
    :goto_2
    goto :goto_0

    .line 130
    :cond_2
    invoke-static {v7}, Lo/avj;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    .line 132
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v4, v0

    .line 134
    :cond_3
    return v4
.end method

.method public static declared-synchronized d()Lo/atf;
    .locals 3

    const-class v1, Lo/atf;

    monitor-enter v1

    .line 62
    :try_start_0
    sget-object v0, Lo/atf;->d:Lo/atf;

    if-nez v0, :cond_0

    .line 64
    new-instance v0, Lo/atf;

    invoke-direct {v0}, Lo/atf;-><init>()V

    sput-object v0, Lo/atf;->d:Lo/atf;

    .line 66
    :cond_0
    sget-object v0, Lo/atf;->d:Lo/atf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public a(JJ)V
    .locals 6

    .line 202
    const/4 v1, 0x0

    .line 203
    iget-object v0, p0, Lo/atf;->b:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/util/LongSparseArray;->indexOfKey(J)I

    move-result v0

    if-ltz v0, :cond_0

    .line 205
    iget-object v0, p0, Lo/atf;->b:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    .line 207
    :cond_0
    if-nez v1, :cond_1

    .line 209
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 210
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 211
    iget-object v0, p0, Lo/atf;->b:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0, p1, p2, v1}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    goto :goto_2

    .line 215
    :cond_1
    const/4 v2, 0x0

    .line 216
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 218
    cmp-long v0, v4, p3

    if-nez v0, :cond_2

    .line 220
    const/4 v2, 0x1

    .line 221
    goto :goto_1

    .line 223
    :cond_2
    goto :goto_0

    .line 224
    :cond_3
    :goto_1
    if-nez v2, :cond_4

    .line 226
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 229
    :cond_4
    :goto_2
    return-void
.end method

.method public b()Landroid/support/v4/util/LongSparseArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Landroid/support/v4/util/LongSparseArray<Ljava/util/List<Ljava/lang/Long;>;>;"
        }
    .end annotation

    .line 238
    iget-object v0, p0, Lo/atf;->b:Landroid/support/v4/util/LongSparseArray;

    return-object v0
.end method

.method public c(Z)I
    .locals 3

    .line 87
    const/4 v1, 0x0

    .line 89
    invoke-virtual {p0}, Lo/atf;->c()Ljava/util/ArrayList;

    move-result-object v2

    .line 90
    if-eqz p1, :cond_0

    .line 92
    invoke-static {v2}, Lo/atf;->b(Ljava/util/List;)I

    move-result v1

    goto :goto_0

    .line 96
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 98
    :goto_0
    return v1
.end method

.method public c()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupNotify;>;"
        }
    .end annotation

    .line 144
    iget-object v0, p0, Lo/atf;->e:Lo/aub;

    invoke-virtual {v0}, Lo/aub;->d()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public c(JJ)Z
    .locals 1

    .line 191
    iget-object v0, p0, Lo/atf;->e:Lo/aub;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/aub;->e(JJ)Z

    move-result v0

    return v0
.end method

.method public c(Lcom/huawei/health/sns/model/group/GroupNotify;)Z
    .locals 5

    .line 155
    if-nez p1, :cond_0

    .line 157
    const/4 v0, 0x0

    return v0

    .line 159
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupId()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupNotify;->getUserId()J

    move-result-wide v2

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/atf;->d(JJ)Lcom/huawei/health/sns/model/group/GroupNotify;

    move-result-object v4

    .line 160
    if-nez v4, :cond_1

    .line 162
    iget-object v0, p0, Lo/atf;->e:Lo/aub;

    invoke-virtual {v0, p1}, Lo/aub;->b(Lcom/huawei/health/sns/model/group/GroupNotify;)Z

    move-result v0

    return v0

    .line 166
    :cond_1
    iget-object v0, p0, Lo/atf;->e:Lo/aub;

    invoke-virtual {v0, p1}, Lo/aub;->e(Lcom/huawei/health/sns/model/group/GroupNotify;)Z

    move-result v0

    return v0
.end method

.method public d(JJ)Lcom/huawei/health/sns/model/group/GroupNotify;
    .locals 1

    .line 179
    iget-object v0, p0, Lo/atf;->e:Lo/aub;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/aub;->a(JJ)Lcom/huawei/health/sns/model/group/GroupNotify;

    move-result-object v0

    return-object v0
.end method

.method public e()I
    .locals 1

    .line 76
    iget-object v0, p0, Lo/atf;->e:Lo/aub;

    invoke-virtual {v0}, Lo/aub;->c()I

    move-result v0

    return v0
.end method

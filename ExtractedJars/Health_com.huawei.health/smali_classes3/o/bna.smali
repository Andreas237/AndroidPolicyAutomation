.class public Lo/bna;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"

# interfaces
.implements Lo/bmv;


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/bmz;>;"
        }
    .end annotation
.end field

.field protected b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation
.end field

.field private c:Z

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation
.end field

.field private e:Z

.field protected i:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Z)V"
        }
    .end annotation

    .line 64
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bna;->a:Ljava/util/ArrayList;

    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bna;->e:Z

    .line 55
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bna;->c:Z

    .line 65
    iput-object p1, p0, Lo/bna;->i:Landroid/content/Context;

    .line 66
    iput-object p2, p0, Lo/bna;->b:Ljava/util/List;

    .line 67
    iput-boolean p3, p0, Lo/bna;->c:Z

    .line 68
    return-void
.end method

.method private c(I)Lcom/huawei/health/sns/model/user/User;
    .locals 3

    .line 140
    const/4 v2, 0x0

    .line 141
    iget-object v0, p0, Lo/bna;->b:Ljava/util/List;

    if-nez v0, :cond_0

    .line 143
    const/4 v0, 0x0

    return-object v0

    .line 145
    :cond_0
    if-ltz p1, :cond_1

    iget-object v0, p0, Lo/bna;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_2

    .line 147
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 149
    :cond_2
    iget-object v0, p0, Lo/bna;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/user/User;

    .line 150
    return-object v2
.end method

.method private d(I)Lcom/huawei/health/sns/model/user/User;
    .locals 3

    .line 119
    const/4 v2, 0x0

    .line 120
    iget-object v0, p0, Lo/bna;->d:Ljava/util/List;

    if-nez v0, :cond_0

    .line 122
    const/4 v0, 0x0

    return-object v0

    .line 124
    :cond_0
    if-ltz p1, :cond_1

    iget-object v0, p0, Lo/bna;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_2

    .line 126
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 128
    :cond_2
    iget-object v0, p0, Lo/bna;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/user/User;

    .line 129
    return-object v2
.end method

.method private declared-synchronized d(Ljava/util/List;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Z)V"
        }
    .end annotation

    monitor-enter p0

    .line 246
    :try_start_0
    iget-object v1, p0, Lo/bna;->a:Ljava/util/ArrayList;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 248
    :try_start_1
    iget-object v0, p0, Lo/bna;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bmz;

    .line 250
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 252
    invoke-interface {v3, p1, p2}, Lo/bmz;->b(Ljava/util/List;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 254
    :cond_0
    goto :goto_0

    .line 255
    :cond_1
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v1

    :try_start_2
    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 256
    :goto_1
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;)V"
        }
    .end annotation

    .line 72
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bna;->e:Z

    .line 73
    iput-object p1, p0, Lo/bna;->d:Ljava/util/List;

    .line 74
    invoke-virtual {p0}, Lo/bna;->notifyDataSetChanged()V

    .line 75
    return-void
.end method

.method public a(Lo/bmz;)V
    .locals 1

    .line 218
    iget-object v0, p0, Lo/bna;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 220
    iget-object v0, p0, Lo/bna;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    :cond_0
    return-void
.end method

.method public b(I)Lcom/huawei/health/sns/model/user/User;
    .locals 1

    .line 156
    iget-boolean v0, p0, Lo/bna;->e:Z

    if-eqz v0, :cond_0

    .line 158
    invoke-direct {p0, p1}, Lo/bna;->d(I)Lcom/huawei/health/sns/model/user/User;

    move-result-object v0

    return-object v0

    .line 162
    :cond_0
    invoke-direct {p0, p1}, Lo/bna;->c(I)Lcom/huawei/health/sns/model/user/User;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 2

    .line 93
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bna;->e:Z

    .line 94
    invoke-virtual {p0}, Lo/bna;->notifyDataSetChanged()V

    .line 95
    iget-object v0, p0, Lo/bna;->b:Ljava/util/List;

    iget-boolean v1, p0, Lo/bna;->c:Z

    invoke-direct {p0, v0, v1}, Lo/bna;->d(Ljava/util/List;Z)V

    .line 96
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 84
    iput-object p1, p0, Lo/bna;->b:Ljava/util/List;

    .line 85
    invoke-virtual {p0}, Lo/bna;->b()V

    .line 86
    return-void
.end method

.method public d(Lo/bmz;)V
    .locals 3

    .line 232
    iget-object v1, p0, Lo/bna;->a:Ljava/util/ArrayList;

    monitor-enter v1

    .line 234
    :try_start_0
    iget-object v0, p0, Lo/bna;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 236
    iget-object v0, p0, Lo/bna;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 238
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 239
    :goto_0
    return-void
.end method

.method public e(I)Lcom/huawei/health/sns/model/user/User;
    .locals 8

    .line 174
    iget-boolean v0, p0, Lo/bna;->e:Z

    if-eqz v0, :cond_3

    .line 176
    invoke-direct {p0, p1}, Lo/bna;->d(I)Lcom/huawei/health/sns/model/user/User;

    move-result-object v4

    .line 177
    if-nez v4, :cond_0

    .line 179
    const/4 v0, 0x0

    return-object v0

    .line 181
    :cond_0
    const/4 v5, 0x0

    .line 182
    iget-object v0, p0, Lo/bna;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/user/User;

    .line 184
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 186
    move-object v5, v7

    .line 187
    goto :goto_1

    .line 189
    :cond_1
    goto :goto_0

    .line 190
    :cond_2
    :goto_1
    return-object v5

    .line 194
    :cond_3
    invoke-direct {p0, p1}, Lo/bna;->c(I)Lcom/huawei/health/sns/model/user/User;

    move-result-object v0

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .line 101
    iget-boolean v0, p0, Lo/bna;->e:Z

    if-eqz v0, :cond_1

    .line 103
    iget-object v0, p0, Lo/bna;->d:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/bna;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    return v0

    .line 107
    :cond_1
    iget-object v0, p0, Lo/bna;->b:Ljava/util/List;

    if-nez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lo/bna;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_1
    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .line 24
    invoke-virtual {p0, p1}, Lo/bna;->b(I)Lcom/huawei/health/sns/model/user/User;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 201
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    .line 207
    return-object p2
.end method

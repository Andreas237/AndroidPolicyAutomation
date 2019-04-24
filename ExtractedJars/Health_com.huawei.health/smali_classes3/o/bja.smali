.class public Lo/bja;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    return-void
.end method

.method private c(Ljava/util/ArrayList;Landroid/support/v4/util/LongSparseArray;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;)V"
        }
    .end annotation

    .line 186
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p2}, Landroid/support/v4/util/LongSparseArray;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 188
    invoke-virtual {p2, v1}, Landroid/support/v4/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 190
    :cond_0
    return-void
.end method

.method private d(Ljava/lang/String;I)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/List<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 65
    const/4 v2, 0x0

    .line 66
    const/4 v3, 0x0

    .line 68
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 71
    invoke-static {}, Lo/avy;->d()Lo/avy;

    move-result-object v0

    invoke-virtual {v0, v4, p2}, Lo/avy;->c(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    .line 74
    invoke-static {v4}, Lo/bqz;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    invoke-static {}, Lo/avy;->d()Lo/avy;

    move-result-object v0

    invoke-virtual {v0, v4, p2}, Lo/avy;->d(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v2

    .line 79
    invoke-static {}, Lo/avy;->d()Lo/avy;

    move-result-object v0

    invoke-virtual {v0, v4, p2}, Lo/avy;->e(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v3

    .line 83
    :cond_0
    if-eqz v2, :cond_1

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 85
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 89
    :cond_1
    if-eqz v3, :cond_2

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 91
    invoke-interface {v1, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 93
    :cond_2
    return-object v1
.end method

.method private e(Ljava/lang/String;I)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 105
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 107
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 110
    new-instance v3, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v3}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    .line 113
    invoke-static {}, Lo/avw;->e()Lo/avw;

    move-result-object v0

    invoke-virtual {v0, v2, p2, v3}, Lo/avw;->a(Ljava/lang/String;ILandroid/support/v4/util/LongSparseArray;)V

    .line 116
    invoke-static {v2}, Lo/bqz;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 119
    invoke-static {}, Lo/avw;->e()Lo/avw;

    move-result-object v0

    invoke-virtual {v0, v2, p2, v3}, Lo/avw;->e(Ljava/lang/String;ILandroid/support/v4/util/LongSparseArray;)V

    .line 121
    invoke-static {}, Lo/avw;->e()Lo/avw;

    move-result-object v0

    invoke-virtual {v0, v2, p2, v3}, Lo/avw;->d(Ljava/lang/String;ILandroid/support/v4/util/LongSparseArray;)V

    .line 125
    :cond_0
    invoke-direct {p0, v1, v3}, Lo/bja;->c(Ljava/util/ArrayList;Landroid/support/v4/util/LongSparseArray;)V

    .line 128
    invoke-virtual {v3}, Landroid/support/v4/util/LongSparseArray;->clear()V

    .line 130
    return-object v1
.end method


# virtual methods
.method public b(Ljava/lang/String;I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/List<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 40
    const/4 v1, 0x0

    .line 41
    const/4 v2, 0x0

    .line 43
    invoke-direct {p0, p1, p2}, Lo/bja;->d(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    .line 45
    invoke-direct {p0, p1, p2}, Lo/bja;->e(Ljava/lang/String;I)Ljava/util/ArrayList;

    move-result-object v2

    .line 48
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 50
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 52
    :cond_0
    return-object v1
.end method

.method public d(Ljava/lang/String;J)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 142
    const/4 v1, 0x0

    .line 143
    const/4 v2, 0x0

    .line 144
    const/4 v3, 0x0

    .line 146
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 149
    invoke-static {}, Lo/avw;->e()Lo/avw;

    move-result-object v0

    invoke-virtual {v0, v4, p2, p3}, Lo/avw;->c(Ljava/lang/String;J)Ljava/util/ArrayList;

    move-result-object v1

    .line 152
    invoke-static {v4}, Lo/bqz;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 155
    invoke-static {}, Lo/avw;->e()Lo/avw;

    move-result-object v0

    invoke-virtual {v0, v4, p2, p3}, Lo/avw;->b(Ljava/lang/String;J)Ljava/util/ArrayList;

    move-result-object v2

    .line 158
    invoke-static {}, Lo/avw;->e()Lo/avw;

    move-result-object v0

    invoke-virtual {v0, v4, p2, p3}, Lo/avw;->a(Ljava/lang/String;J)Ljava/util/ArrayList;

    move-result-object v3

    .line 163
    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 165
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 169
    :cond_1
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 171
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 174
    :cond_2
    return-object v1
.end method

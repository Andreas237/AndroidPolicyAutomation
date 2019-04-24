.class public Lo/xr;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)Ljava/util/ArrayList<Lcom/huawei/bone/social/manager/db/SocialRankingTable;>;"
        }
    .end annotation

    .line 32
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 33
    const-string v0, "PSocial_HwWearSocialUtilHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == context"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    const/4 v0, 0x0

    return-object v0

    .line 39
    :cond_0
    invoke-static {p0}, Lo/xy;->d(Landroid/content/Context;)Lo/xv;

    move-result-object v4

    .line 41
    iget-object v5, v4, Lo/xv;->n:Ljava/lang/String;

    .line 42
    iget-object v6, v4, Lo/xv;->b:Ljava/lang/String;

    .line 43
    invoke-static {p0}, Lo/xp;->a(Landroid/content/Context;)I

    move-result v7

    .line 44
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v1

    invoke-virtual {v1}, Lo/vu;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v7}, Lo/wr;->e(Ljava/lang/String;I)I

    move-result v8

    .line 45
    const-string v0, "PSocial_HwWearSocialUtilHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "socialRankingDB res = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    const/4 v0, 0x0

    if-ne v0, v8, :cond_1

    .line 47
    new-instance v9, Lo/xf;

    invoke-direct {v9}, Lo/xf;-><init>()V

    .line 48
    invoke-static {v6}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lo/xf;->b(J)V

    .line 49
    invoke-virtual {v9, v5}, Lo/xf;->e(Ljava/lang/String;)V

    .line 50
    iget-object v0, v4, Lo/xv;->m:Ljava/lang/String;

    invoke-virtual {v9, v0}, Lo/xf;->b(Ljava/lang/String;)V

    .line 51
    sget-object v0, Lo/xx$b;->b:Lo/xx$b;

    invoke-virtual {v0}, Lo/xx$b;->ordinal()I

    move-result v0

    int-to-short v0, v0

    invoke-virtual {v9, v0}, Lo/xf;->d(S)V

    .line 52
    invoke-virtual {v9, v7}, Lo/xf;->d(I)V

    .line 53
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/wr;->d(Lo/xf;)J

    move-result-wide v10

    .line 54
    const-string v0, "PSocial_HwWearSocialUtilHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "socialRankingDB insert "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    :cond_1
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0}, Lo/wr;->m()Ljava/util/ArrayList;

    move-result-object v9

    .line 59
    if-eqz v9, :cond_4

    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 60
    const-string v0, "PSocial_HwWearSocialUtilHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "socialRankingDB rank size "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    .line 65
    invoke-virtual {v11}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getHuId()J

    move-result-wide v0

    invoke-static {v6}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    .line 69
    sget-object v0, Lo/xx$b;->b:Lo/xx$b;

    invoke-virtual {v0}, Lo/xx$b;->ordinal()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setUserType(I)V

    .line 70
    goto :goto_1

    .line 72
    :cond_2
    goto :goto_0

    .line 73
    :cond_3
    :goto_1
    new-instance v0, Lo/xr$3;

    invoke-direct {v0, p0}, Lo/xr$3;-><init>(Landroid/content/Context;)V

    invoke-static {v9, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 97
    :cond_4
    return-object v9
.end method

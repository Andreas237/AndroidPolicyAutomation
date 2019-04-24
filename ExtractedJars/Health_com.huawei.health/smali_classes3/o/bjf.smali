.class public Lo/bjf;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;IZ)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;IZ)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 37
    const/4 v1, 0x0

    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x0

    .line 41
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 44
    invoke-static {}, Lo/awe;->c()Lo/awe;

    move-result-object v0

    invoke-virtual {v0, v4, p2, p3}, Lo/awe;->a(Ljava/lang/String;IZ)Ljava/util/ArrayList;

    move-result-object v1

    .line 47
    invoke-static {v4}, Lo/bqz;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    invoke-static {}, Lo/awe;->c()Lo/awe;

    move-result-object v0

    invoke-virtual {v0, v4, p2, p3}, Lo/awe;->d(Ljava/lang/String;IZ)Ljava/util/ArrayList;

    move-result-object v2

    .line 53
    invoke-static {}, Lo/awe;->c()Lo/awe;

    move-result-object v0

    invoke-virtual {v0, v4, p2, p3}, Lo/awe;->c(Ljava/lang/String;IZ)Ljava/util/ArrayList;

    move-result-object v3

    .line 58
    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 60
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 64
    :cond_1
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 66
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 68
    :cond_2
    return-object v1
.end method

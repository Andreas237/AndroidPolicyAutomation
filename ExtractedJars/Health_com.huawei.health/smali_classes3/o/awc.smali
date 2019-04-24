.class public final Lo/awc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/awc;


# instance fields
.field private a:Lo/avx;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    new-instance v0, Lo/awc;

    invoke-direct {v0}, Lo/awc;-><init>()V

    sput-object v0, Lo/awc;->b:Lo/awc;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lo/awc;->a:Lo/avx;

    .line 40
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 41
    new-instance v0, Lo/avx;

    invoke-direct {v0, v1}, Lo/avx;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/awc;->a:Lo/avx;

    .line 42
    return-void
.end method

.method public static a()Lo/awc;
    .locals 1

    .line 51
    sget-object v0, Lo/awc;->b:Lo/awc;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 62
    const/4 v1, 0x0

    .line 63
    const/4 v2, 0x0

    .line 64
    const/4 v3, 0x0

    .line 66
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 69
    iget-object v0, p0, Lo/awc;->a:Lo/avx;

    invoke-virtual {v0, v4}, Lo/avx;->e(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    .line 72
    invoke-static {v4}, Lo/bqz;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p0, Lo/awc;->a:Lo/avx;

    invoke-virtual {v0, v4}, Lo/avx;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 77
    iget-object v0, p0, Lo/awc;->a:Lo/avx;

    invoke-virtual {v0, v4}, Lo/avx;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 81
    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 83
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 87
    :cond_1
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 89
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 92
    :cond_2
    return-object v1
.end method

.method public d(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 103
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 104
    invoke-virtual {p0}, Lo/awc;->e()Ljava/util/ArrayList;

    move-result-object v2

    .line 105
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/user/User;

    .line 107
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/bqz;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 109
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    :cond_0
    goto :goto_0

    .line 112
    :cond_1
    return-object v1
.end method

.method public declared-synchronized e()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    monitor-enter p0

    .line 122
    :try_start_0
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0}, Lo/axa;->b()Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

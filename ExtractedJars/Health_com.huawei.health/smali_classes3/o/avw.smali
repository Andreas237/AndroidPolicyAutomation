.class public final Lo/avw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lo/avw;


# instance fields
.field private b:Lo/awa;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    new-instance v0, Lo/avw;

    invoke-direct {v0}, Lo/avw;-><init>()V

    sput-object v0, Lo/avw;->d:Lo/avw;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/avw;->b:Lo/awa;

    .line 30
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 31
    new-instance v0, Lo/awa;

    invoke-direct {v0, v1}, Lo/awa;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/avw;->b:Lo/awa;

    .line 32
    return-void
.end method

.method public static e()Lo/avw;
    .locals 1

    .line 36
    sget-object v0, Lo/avw;->d:Lo/avw;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;J)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 105
    iget-object v0, p0, Lo/avw;->b:Lo/awa;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1, p2, p3}, Lo/awa;->e(ILjava/lang/String;J)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;ILandroid/support/v4/util/LongSparseArray;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;ILandroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;)V"
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lo/avw;->b:Lo/awa;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2, p3}, Lo/awa;->a(ILjava/lang/String;ILandroid/support/v4/util/LongSparseArray;)V

    .line 49
    return-void
.end method

.method public b(Ljava/lang/String;J)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 94
    iget-object v0, p0, Lo/avw;->b:Lo/awa;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1, p2, p3}, Lo/awa;->e(ILjava/lang/String;J)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;J)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 83
    iget-object v0, p0, Lo/avw;->b:Lo/awa;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2, p3}, Lo/awa;->e(ILjava/lang/String;J)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;ILandroid/support/v4/util/LongSparseArray;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;ILandroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;)V"
        }
    .end annotation

    .line 72
    iget-object v0, p0, Lo/avw;->b:Lo/awa;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1, p2, p3}, Lo/awa;->a(ILjava/lang/String;ILandroid/support/v4/util/LongSparseArray;)V

    .line 73
    return-void
.end method

.method public e(Ljava/lang/String;ILandroid/support/v4/util/LongSparseArray;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;ILandroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;)V"
        }
    .end annotation

    .line 60
    iget-object v0, p0, Lo/avw;->b:Lo/awa;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1, p2, p3}, Lo/awa;->a(ILjava/lang/String;ILandroid/support/v4/util/LongSparseArray;)V

    .line 61
    return-void
.end method

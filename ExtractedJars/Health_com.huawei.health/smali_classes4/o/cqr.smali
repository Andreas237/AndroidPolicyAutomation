.class public Lo/cqr;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cqr$e;
    }
.end annotation


# instance fields
.field private d:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<Landroid/util/SparseIntArray;Ljava/util/List<Lo/cnx;>;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Landroid/util/LruCache;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lo/cqr;->d:Landroid/util/LruCache;

    .line 22
    return-void
.end method

.method synthetic constructor <init>(Lo/cqr$5;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Lo/cqr;-><init>()V

    return-void
.end method

.method public static a()Lo/cqr;
    .locals 1

    .line 32
    sget-object v0, Lo/cqr$e;->a:Lo/cqr;

    return-object v0
.end method


# virtual methods
.method public b(II)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<Lo/cnx;>;"
        }
    .end annotation

    .line 36
    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    .line 37
    invoke-virtual {v1, p1, p2}, Landroid/util/SparseIntArray;->put(II)V

    .line 38
    iget-object v0, p0, Lo/cqr;->d:Landroid/util/LruCache;

    invoke-virtual {v0, v1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public c(IILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lo/cnx;>;)V"
        }
    .end annotation

    .line 42
    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    .line 43
    invoke-virtual {v1, p1, p2}, Landroid/util/SparseIntArray;->put(II)V

    .line 44
    iget-object v0, p0, Lo/cqr;->d:Landroid/util/LruCache;

    invoke-virtual {v0, v1, p3}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    return-void
.end method

.method public d(IILjava/lang/String;)Z
    .locals 7

    .line 48
    new-instance v4, Landroid/util/SparseIntArray;

    invoke-direct {v4}, Landroid/util/SparseIntArray;-><init>()V

    .line 49
    invoke-virtual {v4, p1, p2}, Landroid/util/SparseIntArray;->put(II)V

    .line 50
    iget-object v0, p0, Lo/cqr;->d:Landroid/util/LruCache;

    invoke-virtual {v0, v4}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 51
    const-string v0, "Debug_AuthorizationsCache"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkAuth authorizationTables "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 53
    const/4 v0, 0x0

    return v0

    .line 55
    :cond_0
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 56
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cnx;

    invoke-virtual {v0}, Lo/cnx;->c()Lo/coa;

    move-result-object v0

    invoke-virtual {v0}, Lo/coa;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cnx;

    invoke-virtual {v0}, Lo/cnx;->d()I

    move-result v0

    if-ne p1, v0, :cond_1

    .line 57
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cnx;

    invoke-virtual {v0}, Lo/cnx;->e()I

    move-result v0

    if-ne p2, v0, :cond_1

    .line 58
    const/4 v0, 0x1

    return v0

    .line 55
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 61
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public e()V
    .locals 1

    .line 65
    iget-object v0, p0, Lo/cqr;->d:Landroid/util/LruCache;

    invoke-virtual {v0}, Landroid/util/LruCache;->evictAll()V

    .line 66
    return-void
.end method

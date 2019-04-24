.class public Lo/cqq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private e:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<Ljava/lang/String;Lo/crd;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Landroid/util/LruCache;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lo/cqq;->e:Landroid/util/LruCache;

    .line 18
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lo/crd;
    .locals 1

    .line 21
    if-nez p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 22
    :cond_0
    iget-object v0, p0, Lo/cqq;->e:Landroid/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/crd;

    return-object v0
.end method

.method public b()V
    .locals 1

    .line 35
    iget-object v0, p0, Lo/cqq;->e:Landroid/util/LruCache;

    invoke-virtual {v0}, Landroid/util/LruCache;->evictAll()V

    .line 36
    return-void
.end method

.method public b(Ljava/lang/String;Lo/crd;)V
    .locals 1

    .line 30
    if-nez p1, :cond_0

    return-void

    .line 31
    :cond_0
    iget-object v0, p0, Lo/cqq;->e:Landroid/util/LruCache;

    invoke-virtual {v0, p1, p2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    return-void
.end method

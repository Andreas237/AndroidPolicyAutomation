.class public Lo/cqu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<Ljava/lang/Integer;Ljava/lang/Object;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Landroid/util/LruCache;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lo/cqu;->a:Landroid/util/LruCache;

    .line 16
    return-void
.end method


# virtual methods
.method public b(ILjava/lang/Object;)V
    .locals 2

    .line 23
    iget-object v0, p0, Lo/cqu;->a:Landroid/util/LruCache;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    return-void
.end method

.method public d()V
    .locals 1

    .line 27
    iget-object v0, p0, Lo/cqu;->a:Landroid/util/LruCache;

    invoke-virtual {v0}, Landroid/util/LruCache;->evictAll()V

    .line 28
    return-void
.end method

.method public e(I)Ljava/lang/Object;
    .locals 2

    .line 19
    iget-object v0, p0, Lo/cqu;->a:Landroid/util/LruCache;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

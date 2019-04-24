.class public abstract Lcom/huawei/openalliance/ad/c/a;
.super Ljava/lang/Object;


# static fields
.field private static a:Landroid/util/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Pair<Ljava/lang/ref/WeakReference<Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;>;Ljava/lang/ref/WeakReference<Lcom/huawei/openalliance/ad/inter/data/NativeAd;>;>;"
        }
    .end annotation
.end field

.field private static final b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/openalliance/ad/c/a;->b:[B

    return-void
.end method

.method public static a()Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Landroid/util/Pair<Ljava/lang/ref/WeakReference<Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;>;Ljava/lang/ref/WeakReference<Lcom/huawei/openalliance/ad/inter/data/NativeAd;>;>;"
        }
    .end annotation

    sget-object v1, Lcom/huawei/openalliance/ad/c/a;->b:[B

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/c/a;->a:Landroid/util/Pair;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Lcom/huawei/openalliance/ad/inter/data/NativeAd;)V
    .locals 5

    sget-object v3, Lcom/huawei/openalliance/ad/c/a;->b:[B

    monitor-enter v3

    if-nez p1, :cond_0

    const-string v0, "GlobalDataShare"

    const-string v1, "set native ad null"

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/openalliance/ad/c/a;->a:Landroid/util/Pair;

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/util/Pair;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, Lcom/huawei/openalliance/ad/c/a;->a:Landroid/util/Pair;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    :goto_1
    return-void
.end method

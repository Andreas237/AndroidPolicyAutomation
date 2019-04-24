.class public final Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile b:Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;

.field private static d:Ljava/util/concurrent/locks/ReentrantLock;


# instance fields
.field private final c:Lcom/huawei/wallet/utils/bitmap/BitmapCache;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->d:Ljava/util/concurrent/locks/ReentrantLock;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance v0, Lcom/huawei/wallet/utils/bitmap/BitmapCache;

    const/high16 v1, 0x2400000

    invoke-direct {v0, v1}, Lcom/huawei/wallet/utils/bitmap/BitmapCache;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->c:Lcom/huawei/wallet/utils/bitmap/BitmapCache;

    .line 43
    return-void
.end method

.method public static a()Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;
    .locals 2

    .line 52
    sget-object v0, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->b:Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;

    if-nez v0, :cond_1

    .line 54
    sget-object v0, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 57
    :try_start_0
    sget-object v0, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->b:Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;

    if-nez v0, :cond_0

    .line 59
    new-instance v0, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;

    invoke-direct {v0}, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;-><init>()V

    sput-object v0, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->b:Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    :cond_0
    sget-object v0, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 65
    goto :goto_0

    .line 64
    :catchall_0
    move-exception v1

    sget-object v0, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 65
    throw v1

    .line 67
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->b:Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;

    return-object v0
.end method

.method private d(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 2

    .line 79
    sget-object v0, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 83
    :try_start_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 97
    :cond_0
    sget-object v0, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 85
    return-void

    .line 89
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->c:Lcom/huawei/wallet/utils/bitmap/BitmapCache;

    invoke-virtual {v0, p2}, Lcom/huawei/wallet/utils/bitmap/BitmapCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    .line 91
    iget-object v0, p0, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->c:Lcom/huawei/wallet/utils/bitmap/BitmapCache;

    invoke-virtual {v0, p2, p1}, Lcom/huawei/wallet/utils/bitmap/BitmapCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    :cond_2
    sget-object v0, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 98
    goto :goto_0

    .line 97
    :catchall_0
    move-exception v1

    sget-object v0, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 98
    throw v1

    .line 99
    :goto_0
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 1

    .line 152
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 154
    iget-object v0, p0, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->c:Lcom/huawei/wallet/utils/bitmap/BitmapCache;

    invoke-virtual {v0, p1}, Lcom/huawei/wallet/utils/bitmap/BitmapCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 3

    .line 110
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 112
    const/4 v0, 0x0

    return-object v0

    .line 114
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->c:Lcom/huawei/wallet/utils/bitmap/BitmapCache;

    invoke-virtual {v0, p1}, Lcom/huawei/wallet/utils/bitmap/BitmapCache;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 115
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 117
    :cond_1
    const/16 v0, 0x3d8

    const/16 v1, 0x260

    invoke-static {p1, v0, v1}, Lcom/huawei/wallet/utils/bitmap/BpDecodeUtil;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 118
    invoke-direct {p0, v2, p1}, Lcom/huawei/wallet/utils/bitmap/BitmapLruCacheForLocal;->d(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    .line 120
    :cond_2
    return-object v2
.end method

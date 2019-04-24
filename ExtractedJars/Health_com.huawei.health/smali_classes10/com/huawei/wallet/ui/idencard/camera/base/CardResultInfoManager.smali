.class public Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager$ResultInfoInstance;
    }
.end annotation


# instance fields
.field private d:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<Ljava/lang/String;Landroid/graphics/Bitmap;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Landroid/util/LruCache;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->d:Landroid/util/LruCache;

    .line 86
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager$1;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;-><init>()V

    return-void
.end method

.method public static b()Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;
    .locals 1

    .line 90
    sget-object v0, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager$ResultInfoInstance;->a:Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;

    return-object v0
.end method


# virtual methods
.method public a()Landroid/graphics/Bitmap;
    .locals 2

    .line 35
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->d:Landroid/util/LruCache;

    const-string v1, "key_bankcard"

    invoke-virtual {v0, v1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public c()V
    .locals 3

    .line 68
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->b()Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->d()Landroid/graphics/Bitmap;

    move-result-object v2

    .line 69
    if-eqz v2, :cond_1

    .line 71
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 73
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->d:Landroid/util/LruCache;

    const-string v1, "key_hcoincard"

    invoke-virtual {v0, v1}, Landroid/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    :cond_1
    return-void
.end method

.method public d()Landroid/graphics/Bitmap;
    .locals 2

    .line 58
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->d:Landroid/util/LruCache;

    const-string v1, "key_hcoincard"

    invoke-virtual {v0, v1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public d(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 40
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->d:Landroid/util/LruCache;

    const-string v1, "key_bankcard"

    invoke-virtual {v0, v1, p1}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    return-void
.end method

.method public e(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 63
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->d:Landroid/util/LruCache;

    const-string v1, "key_hcoincard"

    invoke-virtual {v0, v1, p1}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    return-void
.end method

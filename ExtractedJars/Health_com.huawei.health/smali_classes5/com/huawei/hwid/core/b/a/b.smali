.class public Lcom/huawei/hwid/core/b/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Landroid/util/SparseIntArray;

.field private static final b:Landroid/util/SparseIntArray;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 257
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/b/a/b;->a:Landroid/util/SparseIntArray;

    .line 260
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/b/a/b;->b:Landroid/util/SparseIntArray;

    .line 265
    sget-object v0, Lcom/huawei/hwid/core/b/a/b;->b:Landroid/util/SparseIntArray;

    const v1, 0x42c2589

    const v2, 0x42c2553

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 271
    sget-object v0, Lcom/huawei/hwid/core/b/a/b;->b:Landroid/util/SparseIntArray;

    const v1, 0x42c258b

    const v2, 0x42c2551

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 273
    sget-object v0, Lcom/huawei/hwid/core/b/a/b;->b:Landroid/util/SparseIntArray;

    const v1, 0x42c258c

    const v2, 0x42c2551

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 275
    return-void
.end method

.method public static a(Landroid/os/Bundle;I)I
    .locals 2

    .line 311
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 312
    :cond_0
    const-string v0, "HttpStatusCode"

    const-string v1, "bundle or errorCode is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    return p1

    .line 316
    :cond_1
    const-string v0, "responseCode"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0xc8

    if-ne v1, v0, :cond_2

    .line 319
    sget-object v0, Lcom/huawei/hwid/core/b/a/b;->b:Landroid/util/SparseIntArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseIntArray;->get(I)I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 321
    sget-object v0, Lcom/huawei/hwid/core/b/a/b;->b:Landroid/util/SparseIntArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseIntArray;->get(I)I

    move-result p1

    .line 322
    const-string v0, "HttpStatusCode"

    const-string v1, "transform errorCode = "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    :cond_2
    return p1
.end method

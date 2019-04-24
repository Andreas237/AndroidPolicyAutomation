.class public Lcom/huawei/wallet/utils/log/LogC;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Z)V
    .locals 1

    .line 207
    const-string v0, "baselib"

    invoke-static {v0, p0, p1}, Lcom/huawei/wallet/utils/log/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 208
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 74
    invoke-static {p0, p1, p2}, Lcom/huawei/wallet/utils/log/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 75
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 1

    .line 270
    const-string v0, "baselib"

    invoke-static {v0, p0, p1, p2}, Lcom/huawei/wallet/utils/log/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 271
    return-void
.end method

.method public static b(Ljava/lang/String;Z)V
    .locals 2

    .line 232
    const-string v0, "baselib"

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, p1}, Lcom/huawei/wallet/utils/log/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 233
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 47
    invoke-static {p0, p1, p2}, Lcom/huawei/wallet/utils/log/LogUtil;->c(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 48
    return-void
.end method

.method public static c(Ljava/lang/String;Z)V
    .locals 1

    .line 182
    const-string v0, "baselib"

    invoke-static {v0, p0, p1}, Lcom/huawei/wallet/utils/log/LogUtil;->c(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 183
    return-void
.end method

.method public static d(Ljava/lang/String;ILjava/util/Map;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;ILjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Z)V"
        }
    .end annotation

    .line 309
    move-object v0, p0

    move v2, p1

    move-object v3, p2

    move v5, p3

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v5}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;ZZ)V

    .line 310
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 128
    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2}, Lcom/huawei/wallet/utils/log/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 129
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 0

    .line 115
    invoke-static {p0, p1, p2, p3}, Lcom/huawei/wallet/utils/log/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 116
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 101
    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2}, Lcom/huawei/wallet/utils/log/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 102
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;ZZ)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;ZZ)V"
        }
    .end annotation

    .line 323
    invoke-static {p2}, Lcom/huawei/wallet/utils/log/LogUtil;->a(I)Lcom/huawei/feedback/bean/MetadataBundle;

    move-result-object v7

    .line 324
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    .line 326
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/util/Map$Entry;

    .line 328
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Lcom/huawei/feedback/bean/MetadataBundle;->putData(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    goto :goto_0

    .line 331
    :cond_0
    const-string v0, "baselib"

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, v7

    move v5, p5

    move v6, p4

    invoke-static/range {v0 .. v6}, Lcom/huawei/wallet/utils/log/LogUtil;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILcom/huawei/feedback/bean/MetadataBundle;ZZ)V

    .line 332
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 1

    .line 245
    const-string v0, "baselib"

    invoke-static {v0, p0, p1, p2}, Lcom/huawei/wallet/utils/log/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 246
    return-void
.end method

.method public static e(Ljava/lang/String;Z)V
    .locals 2

    .line 257
    const-string v0, "baselib"

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, p1}, Lcom/huawei/wallet/utils/log/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 258
    return-void
.end method

.class public Lo/dtg;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Z)V
    .locals 1

    .line 197
    const-string v0, "PluginPay"

    invoke-static {v0, p0, p1}, Lcom/huawei/wallet/utils/log/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 198
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;ZZ)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;ZZ)V"
        }
    .end annotation

    .line 316
    invoke-static {p2}, Lcom/huawei/wallet/utils/log/LogUtil;->a(I)Lcom/huawei/feedback/bean/MetadataBundle;

    move-result-object v7

    .line 317
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    .line 318
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

    .line 319
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Lcom/huawei/feedback/bean/MetadataBundle;->putData(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    goto :goto_0

    .line 322
    :cond_0
    const-string v0, "PluginPay"

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, v7

    move v5, p5

    move v6, p4

    invoke-static/range {v0 .. v6}, Lcom/huawei/wallet/utils/log/LogUtil;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILcom/huawei/feedback/bean/MetadataBundle;ZZ)V

    .line 323
    return-void
.end method

.method public static b(Ljava/lang/String;Z)V
    .locals 2

    .line 221
    const-string v0, "PluginPay"

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, p1}, Lcom/huawei/wallet/utils/log/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 222
    return-void
.end method

.method public static c(Ljava/lang/String;Z)V
    .locals 1

    .line 185
    const-string v0, "PluginPay"

    invoke-static {v0, p0, p1}, Lcom/huawei/wallet/utils/log/LogUtil;->c(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 187
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 58
    invoke-static {p0, p1, p2}, Lcom/huawei/wallet/utils/log/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 59
    return-void
.end method

.method public static e(Ljava/lang/String;ILjava/util/Map;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;ILjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Z)V"
        }
    .end annotation

    .line 302
    move-object v0, p0

    move v2, p1

    move-object v3, p2

    move v5, p3

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v5}, Lo/dtg;->b(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;ZZ)V

    .line 303
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 84
    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2}, Lcom/huawei/wallet/utils/log/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 85
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 2

    .line 256
    const-string v0, "PluginPay"

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, p2}, Lcom/huawei/wallet/utils/log/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 257
    return-void
.end method

.method public static e(Ljava/lang/String;Z)V
    .locals 2

    .line 244
    const-string v0, "PluginPay"

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, p1}, Lcom/huawei/wallet/utils/log/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 245
    return-void
.end method

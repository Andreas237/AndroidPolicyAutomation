.class Lcom/huawei/openalliance/ad/inter/HiAd$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/inter/HiAd;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/huawei/openalliance/ad/inter/HiAd;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/inter/HiAd;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/HiAd$1;->b:Lcom/huawei/openalliance/ad/inter/HiAd;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/inter/HiAd$1;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd$1;->b:Lcom/huawei/openalliance/ad/inter/HiAd;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAd;->a(Lcom/huawei/openalliance/ad/inter/HiAd;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->z()J

    move-result-wide v4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd$1;->b:Lcom/huawei/openalliance/ad/inter/HiAd;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAd;->a(Lcom/huawei/openalliance/ad/inter/HiAd;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->y()I

    move-result v6

    const v0, 0xea60

    mul-int/2addr v6, v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v4

    int-to-long v2, v6

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd$1;->b:Lcom/huawei/openalliance/ad/inter/HiAd;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAd;->b(Lcom/huawei/openalliance/ad/inter/HiAd;)Lcom/huawei/openalliance/ad/e/a/c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/HiAd$1;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/e/a/c;->a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;

    move-result-object v7

    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    iget v0, v7, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->responseCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd$1;->b:Lcom/huawei/openalliance/ad/inter/HiAd;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAd;->a(Lcom/huawei/openalliance/ad/inter/HiAd;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    invoke-interface {v0, v7}, Lcom/huawei/openalliance/ad/e/a/e;->a(Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;)V

    :cond_0
    return-void
.end method

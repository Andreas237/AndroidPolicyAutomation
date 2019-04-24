.class Lcom/huawei/openalliance/ad/k/f$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/k/f;->a(Ljava/lang/String;Lcom/huawei/openalliance/ad/inter/data/NativeAd;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

.field final synthetic b:J

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/huawei/openalliance/ad/k/f;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/k/f;Lcom/huawei/openalliance/ad/inter/data/NativeAd;JLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/k/f$1;->d:Lcom/huawei/openalliance/ad/k/f;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/k/f$1;->a:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    iput-wide p3, p0, Lcom/huawei/openalliance/ad/k/f$1;->b:J

    iput-object p5, p0, Lcom/huawei/openalliance/ad/k/f$1;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f$1;->d:Lcom/huawei/openalliance/ad/k/f;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/f;->a(Lcom/huawei/openalliance/ad/k/f;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->e()J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    add-long/2addr v0, v2

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f$1;->d:Lcom/huawei/openalliance/ad/k/f;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/f;->a(Lcom/huawei/openalliance/ad/k/f;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/e/a/e;->a(J)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f$1;->d:Lcom/huawei/openalliance/ad/k/f;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/f;->b(Lcom/huawei/openalliance/ad/k/f;)Ljava/lang/String;

    move-result-object v0

    const-wide/32 v1, 0x240c8400

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/lang/String;J)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f$1;->a:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getVideoInfo()Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    move-result-object v5

    const/4 v6, 0x0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f$1;->a:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getImageInfos()Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    :cond_1
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    const/4 v0, 0x0

    if-ne v0, v6, :cond_3

    :cond_2
    return-void

    :cond_3
    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoPlayMode()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f$1;->d:Lcom/huawei/openalliance/ad/k/f;

    invoke-static {v0, v5}, Lcom/huawei/openalliance/ad/k/f;->a(Lcom/huawei/openalliance/ad/k/f;Lcom/huawei/openalliance/ad/inter/data/VideoInfo;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {}, Lcom/huawei/openalliance/ad/k/f;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "cache mode video is only allowed to download in network %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getDownloadNetwork()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_4
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f$1;->a:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/e;->a(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v8

    new-instance v9, Lcom/huawei/openalliance/ad/l/c;

    invoke-direct {v9}, Lcom/huawei/openalliance/ad/l/c;-><init>()V

    invoke-virtual {v9, v8}, Lcom/huawei/openalliance/ad/l/c;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/openalliance/ad/l/c;->c(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getFileSizeToCheck()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/openalliance/ad/l/c;->a(J)V

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getSha256()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/openalliance/ad/l/c;->b(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->isCheckSha256()Z

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/openalliance/ad/l/c;->b(Z)V

    const-string v0, "video"

    invoke-virtual {v9, v0}, Lcom/huawei/openalliance/ad/l/c;->a(Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/k/f$1;->b:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/openalliance/ad/l/c;->a(Ljava/lang/Long;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f$1;->d:Lcom/huawei/openalliance/ad/k/f;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/f;->c(Lcom/huawei/openalliance/ad/k/f;)Lcom/huawei/openalliance/ad/e/a/c;

    move-result-object v0

    invoke-interface {v0, v9}, Lcom/huawei/openalliance/ad/e/a/c;->a(Lcom/huawei/openalliance/ad/l/c;)Lcom/huawei/openalliance/ad/l/d;

    move-result-object v10

    if-eqz v10, :cond_5

    invoke-virtual {v10}, Lcom/huawei/openalliance/ad/l/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {v10}, Lcom/huawei/openalliance/ad/l/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->setUrl(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f$1;->d:Lcom/huawei/openalliance/ad/k/f;

    invoke-virtual {v10}, Lcom/huawei/openalliance/ad/l/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v6, v1}, Lcom/huawei/openalliance/ad/k/f;->a(Lcom/huawei/openalliance/ad/k/f;Lcom/huawei/openalliance/ad/inter/data/ImageInfo;Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    invoke-static {}, Lcom/huawei/openalliance/ad/k/f;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "dealVideo, download cover failed!"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :goto_0
    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoPlayMode()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_7

    new-instance v11, Lcom/huawei/openalliance/ad/l/c;

    invoke-direct {v11}, Lcom/huawei/openalliance/ad/l/c;-><init>()V

    invoke-virtual {v11, v8}, Lcom/huawei/openalliance/ad/l/c;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/openalliance/ad/l/c;->c(Ljava/lang/String;)V

    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getFileSizeToCheck()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v11, v0, v1}, Lcom/huawei/openalliance/ad/l/c;->a(J)V

    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getSha256()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/openalliance/ad/l/c;->b(Ljava/lang/String;)V

    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->isCheckSha256()Z

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/openalliance/ad/l/c;->b(Z)V

    const-string v0, "video"

    invoke-virtual {v11, v0}, Lcom/huawei/openalliance/ad/l/c;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lcom/huawei/openalliance/ad/l/c;->a(Z)V

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/k/f$1;->b:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/openalliance/ad/l/c;->a(Ljava/lang/Long;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f$1;->d:Lcom/huawei/openalliance/ad/k/f;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/f;->c(Lcom/huawei/openalliance/ad/k/f;)Lcom/huawei/openalliance/ad/e/a/c;

    move-result-object v0

    invoke-interface {v0, v11}, Lcom/huawei/openalliance/ad/e/a/c;->a(Lcom/huawei/openalliance/ad/l/c;)Lcom/huawei/openalliance/ad/l/d;

    move-result-object v12

    if-eqz v12, :cond_6

    invoke-virtual {v12}, Lcom/huawei/openalliance/ad/l/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v12}, Lcom/huawei/openalliance/ad/l/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->setVideoDownloadUrl(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    invoke-static {}, Lcom/huawei/openalliance/ad/k/f;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "dealVideo, download video failed!"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_7
    :goto_1
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    new-instance v12, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {v12, v0}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f$1;->a:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f$1;->c:Ljava/lang/String;

    invoke-interface {v11, v0, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f$1;->d:Lcom/huawei/openalliance/ad/k/f;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/f;->d(Lcom/huawei/openalliance/ad/k/f;)Lcom/huawei/openalliance/ad/k/f$a;

    move-result-object v0

    invoke-interface {v0, v11}, Lcom/huawei/openalliance/ad/k/f$a;->a(Ljava/util/Map;)V

    return-void
.end method

.class public Lcom/huawei/openalliance/ad/k/f;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/k/b/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/k/f$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;

.field private c:Lcom/huawei/openalliance/ad/k/f$a;

.field private d:Lcom/huawei/openalliance/ad/e/a/c;

.field private e:Lcom/huawei/openalliance/ad/e/a/e;

.field private f:Ljava/lang/String;

.field private g:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/k/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/k/f;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/k/f$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/f;->g:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/k/f;->c:Lcom/huawei/openalliance/ad/k/f$a;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/d;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/c;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/f;->d:Lcom/huawei/openalliance/ad/e/a/c;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/f;->e:Lcom/huawei/openalliance/ad/e/a/e;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/ab;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "hiad"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "video"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/f;->f:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/k/f;)Lcom/huawei/openalliance/ad/e/a/e;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f;->e:Lcom/huawei/openalliance/ad/e/a/e;

    return-object v0
.end method

.method private a(Ljava/lang/String;Lcom/huawei/openalliance/ad/beans/metadata/Content;[B)Lcom/huawei/openalliance/ad/inter/data/NativeAd;
    .locals 1

    invoke-static {p1, p2, p3}, Lcom/huawei/openalliance/ad/k/e;->a(Ljava/lang/String;Lcom/huawei/openalliance/ad/beans/metadata/Content;[B)Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/k/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method private a(J)V
    .locals 14

    sget-object v0, Lcom/huawei/openalliance/ad/k/f;->a:Ljava/lang/String;

    const-string v1, "parser"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f;->b:Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f;->c:Lcom/huawei/openalliance/ad/k/f$a;

    const/16 v1, 0x1f3

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/k/f$a;->a(I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f;->b:Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;->getMultiad__()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f;->c:Lcom/huawei/openalliance/ad/k/f$a;

    const/16 v1, 0x2bc

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/k/f$a;->a(I)V

    return-void

    :cond_1
    new-instance v3, Ljava/util/HashMap;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Ljava/util/HashMap;-><init>(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/y;->b(Landroid/content/Context;)[B

    move-result-object v4

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;->getSlotid__()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;->getContent__()Ljava/util/List;

    move-result-object v8

    invoke-static {v8}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/huawei/openalliance/ad/k/f;->a:Ljava/lang/String;

    const-string v1, "parser, contents is empty"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    new-instance v9, Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/openalliance/ad/beans/metadata/Content;

    const/4 v0, 0x0

    if-ne v0, v11, :cond_3

    sget-object v0, Lcom/huawei/openalliance/ad/k/f;->a:Ljava/lang/String;

    const-string v1, "parser, content is null"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f;->b:Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;->getNoReportAdTypeEventList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v11, v0, v1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->setNoReportEventList(Ljava/util/List;I)V

    invoke-virtual {v11}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getMetaData()Lcom/huawei/openalliance/ad/beans/metadata/MetaData;

    move-result-object v12

    const/4 v0, 0x0

    if-ne v0, v12, :cond_4

    sget-object v0, Lcom/huawei/openalliance/ad/k/f;->a:Ljava/lang/String;

    const-string v1, "parser, metaData is null"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    invoke-direct {p0, v7, v11, v4}, Lcom/huawei/openalliance/ad/k/f;->a(Ljava/lang/String;Lcom/huawei/openalliance/ad/beans/metadata/Content;[B)Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    move-result-object v13

    invoke-direct {p0, v13}, Lcom/huawei/openalliance/ad/k/f;->a(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)Z

    move-result v0

    if-eqz v0, :cond_5

    move-wide v0, p1

    invoke-direct {p0, v7, v13, v0, v1}, Lcom/huawei/openalliance/ad/k/f;->a(Ljava/lang/String;Lcom/huawei/openalliance/ad/inter/data/NativeAd;J)V

    goto :goto_2

    :cond_5
    sget-object v0, Lcom/huawei/openalliance/ad/k/f;->a:Ljava/lang/String;

    const-string v1, "parser, add nativeAd"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v9, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    goto :goto_1

    :cond_6
    invoke-interface {v3, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_7
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Lcom/huawei/openalliance/ad/k/f;->a:Ljava/lang/String;

    const-string v1, "parser, nativeAdsMap is empty"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f;->c:Lcom/huawei/openalliance/ad/k/f$a;

    const/16 v1, 0x2bc

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/k/f$a;->a(I)V

    goto :goto_3

    :cond_8
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f;->c:Lcom/huawei/openalliance/ad/k/f$a;

    invoke-interface {v0, v3}, Lcom/huawei/openalliance/ad/k/f$a;->a(Ljava/util/Map;)V

    :goto_3
    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;Ljava/lang/String;)V
    .locals 4

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getWidth()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getHeight()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    invoke-static {p2}, Lcom/huawei/openalliance/ad/utils/o;->a(Ljava/lang/String;)Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v3

    if-lez v2, :cond_1

    if-lez v3, :cond_1

    invoke-virtual {p1, v2}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->setWidth(I)V

    invoke-virtual {p1, v3}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->setHeight(I)V

    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/k/f;Lcom/huawei/openalliance/ad/inter/data/ImageInfo;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/k/f;->a(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;Lcom/huawei/openalliance/ad/inter/data/NativeAd;J)V
    .locals 6

    sget-object v0, Lcom/huawei/openalliance/ad/k/f;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dealVideo, adId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/openalliance/ad/k/f$1;

    move-object v1, p0

    move-object v2, p2

    move-wide v3, p3

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/huawei/openalliance/ad/k/f$1;-><init>(Lcom/huawei/openalliance/ad/k/f;Lcom/huawei/openalliance/ad/inter/data/NativeAd;JLjava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)Z
    .locals 2

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getVideoInfo()Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    move-result-object v1

    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private a(Lcom/huawei/openalliance/ad/inter/data/VideoInfo;)Z
    .locals 2

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getDownloadNetwork()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getDownloadNetwork()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/k/f;Lcom/huawei/openalliance/ad/inter/data/VideoInfo;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/k/f;->a(Lcom/huawei/openalliance/ad/inter/data/VideoInfo;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/k/f;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f;->f:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/k/f;)Lcom/huawei/openalliance/ad/e/a/c;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f;->d:Lcom/huawei/openalliance/ad/e/a/c;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/k/f;)Lcom/huawei/openalliance/ad/k/f$a;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/f;->c:Lcom/huawei/openalliance/ad/k/f$a;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;J)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/k/f;->b:Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;

    invoke-direct {p0, p2, p3}, Lcom/huawei/openalliance/ad/k/f;->a(J)V

    return-void
.end method

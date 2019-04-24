.class public Lcom/huawei/openalliance/ad/k/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/k/b/c;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/ContentRecord;>;"
        }
    .end annotation
.end field

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private e:I

.field private final f:Z

.field private g:Lcom/huawei/openalliance/ad/e/a/a;

.field private h:Lcom/huawei/openalliance/ad/e/a/c;

.field private i:Lcom/huawei/openalliance/ad/e/a/e;

.field private j:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/k/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/k/b;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/ContentRecord;>;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/k/b;->e:I

    sget-object v0, Lcom/huawei/openalliance/ad/k/b;->a:Ljava/lang/String;

    const-string v1, "ContentProcessor - content records size: %d isPreContent: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->j:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/k/b;->b:Ljava/util/List;

    iput-boolean p3, p0, Lcom/huawei/openalliance/ad/k/b;->f:Z

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/d;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/c;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->h:Lcom/huawei/openalliance/ad/e/a/c;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->i:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/b;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/b;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->g:Lcom/huawei/openalliance/ad/e/a/a;

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;J)Lcom/huawei/openalliance/ad/l/c;
    .locals 3

    if-nez p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v2, Lcom/huawei/openalliance/ad/l/c;

    invoke-direct {v2}, Lcom/huawei/openalliance/ad/l/c;-><init>()V

    invoke-virtual {v2, p2}, Lcom/huawei/openalliance/ad/l/c;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/l/c;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;->getSha256()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/l/c;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;->getCheckSha256Flag()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/l/c;->b(Z)V

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/l/c;->a(Ljava/lang/Long;)V

    const-string v0, "gif"

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;->getImageType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->i:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->p()I

    move-result v0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->i:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->q()I

    move-result v0

    :goto_1
    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/l/c;->a(I)V

    return-object v2
.end method

.method private a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;J)Ljava/lang/String;
    .locals 11

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getContentId_()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, v5}, Lcom/huawei/openalliance/ad/k/b;->f(Ljava/lang/String;)Z

    move-result v6

    sget-object v0, Lcom/huawei/openalliance/ad/k/b;->a:Ljava/lang/String;

    const-string v1, "downContent: %s isExist: %s isPreContent: %s"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v5, v2, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget-boolean v3, p0, Lcom/huawei/openalliance/ad/k/b;->f:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v6, :cond_1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/k/b;->f:Z

    if-nez v0, :cond_1

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const-string v0, "_id"

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, "displayCount"

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, "displayDate"

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, "splashMediaPath"

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, "lastShowTime"

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, "fcCtrlDate"

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget v0, p0, Lcom/huawei/openalliance/ad/k/b;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    const-string v0, "1"

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setContentDownMethod(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->g:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-interface {v0, p1, v7, v5}, Lcom/huawei/openalliance/ad/e/a/a;->b(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Ljava/util/List;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_1
    if-eqz v6, :cond_2

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const-string v0, "updateTime"

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->g:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-interface {v0, p1, v7, v5}, Lcom/huawei/openalliance/ad/e/a/a;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Ljava/util/List;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_2
    iget v0, p0, Lcom/huawei/openalliance/ad/k/b;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_6

    const/4 v7, 0x0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getDefaultImageInfo()Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;

    move-result-object v8

    invoke-direct {p0, v8, p1, p2, p3}, Lcom/huawei/openalliance/ad/k/b;->a(Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;J)Lcom/huawei/openalliance/ad/l/c;

    move-result-object v9

    if-eqz v9, :cond_4

    invoke-virtual {v9, p1}, Lcom/huawei/openalliance/ad/l/c;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->h:Lcom/huawei/openalliance/ad/e/a/c;

    invoke-interface {v0, v9}, Lcom/huawei/openalliance/ad/e/a/c;->a(Lcom/huawei/openalliance/ad/l/c;)Lcom/huawei/openalliance/ad/l/d;

    move-result-object v10

    if-eqz v10, :cond_4

    invoke-virtual {v10}, Lcom/huawei/openalliance/ad/l/d;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "2"

    goto :goto_0

    :cond_3
    const-string v0, "1"

    :goto_0
    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setContentDownMethod(Ljava/lang/String;)V

    invoke-virtual {v10}, Lcom/huawei/openalliance/ad/l/d;->a()Ljava/lang/String;

    move-result-object v7

    :cond_4
    invoke-static {v7}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p1, v7}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setSplashMediaPath(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->g:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getTaskId_()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/e/a/a;->c(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setLastShowTime_(J)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->g:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/e/a/a;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    goto :goto_1

    :cond_5
    const/4 v5, 0x0

    :goto_1
    goto :goto_2

    :cond_6
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->g:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/e/a/a;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    :goto_2
    return-object v5
.end method

.method private a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 4

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/k/b;->a:Ljava/lang/String;

    const-string v1, "fail to delete content, content is null"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getSplashMediaPath()Ljava/lang/String;

    move-result-object v2

    iget v0, p0, Lcom/huawei/openalliance/ad/k/b;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    invoke-static {v2}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/io/File;)Z

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->g:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getContentId_()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/e/a/a;->b(Ljava/lang/String;)V

    return-void
.end method

.method private a(I)Z
    .locals 2

    iget v0, p0, Lcom/huawei/openalliance/ad/k/b;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    const/4 v0, 0x2

    if-eq v0, p1, :cond_0

    const/4 v0, 0x4

    if-ne v0, p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/huawei/openalliance/ad/utils/ae;->a(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x2

    invoke-static {p0, v0}, Lcom/huawei/openalliance/ad/utils/ae;->a(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/huawei/openalliance/ad/utils/ae;->a(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x3

    invoke-static {p0, v0}, Lcom/huawei/openalliance/ad/utils/ae;->a(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private f(Ljava/lang/String;)Z
    .locals 7

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->g:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/e/a/a;->a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v4

    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getSplashMediaPath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->g:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/e/a/a;->b(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_1
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    :cond_2
    invoke-static {v6}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/io/File;)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->g:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/e/a/a;->b(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_3
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a(J)Ljava/lang/String;
    .locals 9

    sget-object v0, Lcom/huawei/openalliance/ad/k/b;->a:Ljava/lang/String;

    const-string v1, "download contents start"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->b:Ljava/util/List;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/k/b;->a:Ljava/lang/String;

    const-string v1, "download contents, content records is empty"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->j:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/y;->b(Landroid/content/Context;)[B

    move-result-object v6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    if-nez v8, :cond_1

    sget-object v0, Lcom/huawei/openalliance/ad/k/b;->a:Ljava/lang/String;

    const-string v1, "contentRecord in null"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/k/b;->f:Z

    if-eqz v0, :cond_2

    invoke-virtual {v8}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getCtrlSwitchs()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/b;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->j:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/huawei/openalliance/ad/k/b;->a:Ljava/lang/String;

    const-string v1, "pre content only download in wifi"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v8}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getCreativeType_()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/k/b;->a(I)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/huawei/openalliance/ad/k/b;->a:Ljava/lang/String;

    const-string v1, "downloadContents - content creativeType %d not supported"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v8}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getCreativeType_()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-virtual {v8, v6}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setKey([B)V

    invoke-direct {p0, v8, p1, p2}, Lcom/huawei/openalliance/ad/k/b;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;J)Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_0

    :cond_4
    sget-object v0, Lcom/huawei/openalliance/ad/k/b;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "download contents end, showContentId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-object v5
.end method

.method public a()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->c:Ljava/util/List;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/k/b;->a:Ljava/lang/String;

    const-string v1, "invalidContentIds is empty"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p0, v3}, Lcom/huawei/openalliance/ad/k/b;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a(III)V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->g:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/openalliance/ad/e/a/a;->a(III)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-direct {p0, v3}, Lcom/huawei/openalliance/ad/k/b;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->g:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/e/a/a;->a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/openalliance/ad/k/b;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/k/b;->c:Ljava/util/List;

    return-void
.end method

.method public b()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->g:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/a;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-direct {p0, v3}, Lcom/huawei/openalliance/ad/k/b;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/k/b;->d:Ljava/util/List;

    return-void
.end method

.method public c()V
    .locals 7

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->d:Ljava/util/List;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/k/b;->a:Ljava/lang/String;

    const-string v1, "todayNoShowContentIds is empty"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v2, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-direct {v2}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;-><init>()V

    const-string v0, "yyyy-MM-dd"

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setFcCtrlDate_(Ljava/lang/String;)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const-string v0, "fcCtrlDate"

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/b;->g:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-interface {v0, v2, v4, v6}, Lcom/huawei/openalliance/ad/e/a/a;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return-void
.end method

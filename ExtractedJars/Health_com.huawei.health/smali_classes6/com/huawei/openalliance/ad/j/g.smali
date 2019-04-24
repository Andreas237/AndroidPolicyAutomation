.class public abstract Lcom/huawei/openalliance/ad/j/g;
.super Lcom/huawei/openalliance/ad/i/a;

# interfaces
.implements Lcom/huawei/openalliance/ad/j/a/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V::Lcom/huawei/openalliance/ad/views/interfaces/e;>Lcom/huawei/openalliance/ad/i/a<TV;>;Lcom/huawei/openalliance/ad/j/a/f<TV;>;"
    }
.end annotation


# instance fields
.field protected a:Landroid/content/Context;

.field private b:Z

.field private c:Lcom/huawei/openalliance/ad/k/b/d;

.field private d:Lcom/huawei/openalliance/ad/e/a/e;

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/views/interfaces/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;TV;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/i/a;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/j/g;->b:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "duration_count"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/j/g;->e:Ljava/lang/String;

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/g;->a:Landroid/content/Context;

    new-instance v0, Lcom/huawei/openalliance/ad/k/c;

    new-instance v1, Lcom/huawei/openalliance/ad/m/a/f;

    invoke-direct {v1, p1}, Lcom/huawei/openalliance/ad/m/a/f;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, p1, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/j/g;->c:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/j/g;->d:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-virtual {p0, p2}, Lcom/huawei/openalliance/ad/j/g;->a(Lcom/huawei/openalliance/ad/i/b;)V

    return-void
.end method

.method private a(IILcom/huawei/openalliance/ad/n/a/a;)V
    .locals 2

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/j/g;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/j/g;->b:Z

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/j/g;->b()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/g;->c:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-virtual {p3}, Lcom/huawei/openalliance/ad/n/a/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, p2, v1}, Lcom/huawei/openalliance/ad/k/b/d;->a(IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 5

    const-string v0, "PPSBaseViewPresenter"

    const-string v1, "startDisplayDurationCountTask duration: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/g;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/openalliance/ad/j/g$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/j/g$2;-><init>(Lcom/huawei/openalliance/ad/j/g;)V

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/g;->e:Ljava/lang/String;

    int-to-long v2, p1

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;Ljava/lang/String;J)V

    return-void
.end method

.method public a(II)V
    .locals 5

    const-string v0, "PPSBaseViewPresenter"

    const-string v1, "skip ad - hasShowFinish: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-boolean v3, p0, Lcom/huawei/openalliance/ad/j/g;->b:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/j/g;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/j/g;->b:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/g;->c:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-interface {v0, p1, p2}, Lcom/huawei/openalliance/ad/k/b/d;->a(II)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/j/g;->b()V

    return-void
.end method

.method public a(IILcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/g;->a:Landroid/content/Context;

    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    invoke-static {v0, p3, v1}, Lcom/huawei/openalliance/ad/n/g;->a(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Ljava/util/Map;)Lcom/huawei/openalliance/ad/n/a/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/n/a/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2, v3}, Lcom/huawei/openalliance/ad/j/g;->a(IILcom/huawei/openalliance/ad/n/a/a;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 19

    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    const-string v0, "PPSBaseViewPresenter"

    const-string v1, "loadAdMaterial contentRecord is null"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/openalliance/ad/j/g;->a()Lcom/huawei/openalliance/ad/i/b;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/interfaces/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/e;->a()V

    return-void

    :cond_0
    const-string v0, "PPSBaseViewPresenter"

    const-string v1, "loadAdMaterial"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getSplashMediaPath()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getDefaultImageInfo()Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;

    move-result-object v8

    const/4 v9, 0x1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/j/g;->d:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getCreativeType_()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/e/a/e;->c(I)J

    move-result-wide v0

    const-wide/16 v2, 0x400

    mul-long v10, v2, v0

    const/4 v12, 0x0

    if-eqz v8, :cond_2

    invoke-virtual {v8}, Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;->getCheckSha256Flag()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v9, 0x1

    goto :goto_0

    :cond_1
    const/4 v9, 0x0

    :goto_0
    invoke-virtual {v8}, Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;->getSha256()Ljava/lang/String;

    move-result-object v12

    :cond_2
    move-wide v13, v10

    move v15, v9

    move-object/from16 v16, v12

    new-instance v0, Lcom/huawei/openalliance/ad/j/g$1;

    move-object/from16 v1, p0

    move-object v2, v7

    move-wide v3, v13

    move v5, v15

    move-object/from16 v6, v16

    invoke-direct/range {v0 .. v6}, Lcom/huawei/openalliance/ad/j/g$1;-><init>(Lcom/huawei/openalliance/ad/j/g;Ljava/lang/String;JZLjava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v17

    const-string v0, "PPSBaseViewPresenter"

    const-string v1, "loadAdMaterial - validCreative: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez v17, :cond_3

    new-instance v0, Lcom/huawei/openalliance/ad/k/b;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/openalliance/ad/j/g;->a:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/k/b;-><init>(Landroid/content/Context;Ljava/util/List;Z)V

    move-object/from16 v18, v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getContentId_()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-interface {v1, v0}, Lcom/huawei/openalliance/ad/k/b/c;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/openalliance/ad/j/g;->a()Lcom/huawei/openalliance/ad/i/b;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/interfaces/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/e;->a()V

    return-void

    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/j/g;->c:Lcom/huawei/openalliance/ad/k/b/d;

    move-object/from16 v1, p1

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/k/b/d;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/huawei/openalliance/ad/j/g;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;JI)V
    .locals 6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/g;->d:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->E()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "PPSBaseViewPresenter"

    const-string v1, "onAdShowEnd - use old adshow event"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "PPSBaseViewPresenter"

    const-string v1, "onAdShowEnd duration: %d showRatio: %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/g;->c:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-interface {v0, p2, p3, p4}, Lcom/huawei/openalliance/ad/k/b/d;->a(JI)V

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getMetaData_()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getMinEffectiveShowTime__()J

    move-result-wide v0

    cmp-long v0, p2, v0

    if-ltz v0, :cond_1

    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getMinEffectiveShowRatio__()I

    move-result v0

    if-lt p4, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/g;->c:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/k/b/d;->a(Ljava/lang/Long;Ljava/lang/Integer;)V

    goto :goto_0

    :cond_1
    const-string v0, "PPSBaseViewPresenter"

    const-string v1, "duration or show ratio is invalid for showId %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getShowId()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    const-string v0, "PPSBaseViewPresenter"

    const-string v1, "onAdShowEnd - metaData is null"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    goto :goto_1

    :cond_3
    const-string v0, "PPSBaseViewPresenter"

    const-string v1, "onAdShowEnd - content record is null"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method protected abstract a(Ljava/lang/String;)V
.end method

.method public b()V
    .locals 2

    const-string v0, "PPSBaseViewPresenter"

    const-string v1, "cancelDisplayDurationCountTask"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/g;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 5

    const-string v0, "PPSBaseViewPresenter"

    const-string v1, "onDisplayTimeUp hasShowFinish: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-boolean v3, p0, Lcom/huawei/openalliance/ad/j/g;->b:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/j/g;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/j/g;->b:Z

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/j/g;->a()Lcom/huawei/openalliance/ad/i/b;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/interfaces/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/e;->c()V

    return-void
.end method

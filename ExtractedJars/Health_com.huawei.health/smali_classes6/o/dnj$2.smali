.class final Lo/dnj$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnj;->a(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 346
    iput-object p1, p0, Lo/dnj$2;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 372
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter generateHeightLabel onFailure, errCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " errMsg = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 13

    .line 349
    const-string v4, "165_170"

    .line 350
    if-eqz p2, :cond_1

    .line 351
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter generateHeightLabel callback onSuccess,data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    move-object v5, p2

    check-cast v5, Ljava/util/List;

    .line 353
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 354
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateHeightLabel, userInfos.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiUserInfo;

    .line 356
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 357
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v0

    int-to-double v7, v0

    .line 358
    invoke-static {}, Lo/dnj;->d()[Lo/dnp;

    move-result-object v9

    array-length v10, v9

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v10, :cond_1

    aget-object v12, v9, v11

    .line 359
    invoke-virtual {v12, v7, v8}, Lo/dnp;->a(D)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 360
    invoke-virtual {v12, v7, v8}, Lo/dnp;->a(D)Ljava/lang/String;

    move-result-object v4

    .line 361
    goto :goto_1

    .line 358
    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 367
    :cond_1
    :goto_1
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateHeightLabel, heightLabel = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 368
    iget-object v0, p0, Lo/dnj$2;->a:Landroid/content/Context;

    const-string v1, "height"

    invoke-static {v0, v1, v4}, Lo/dnj;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    return-void
.end method

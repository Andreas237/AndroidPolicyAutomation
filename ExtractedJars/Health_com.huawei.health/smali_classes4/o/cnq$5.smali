.class Lo/cnq$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cnq;->e(Lcom/huawei/hihealth/HiSyncOption;Lo/cla;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:I

.field final synthetic c:Lo/cnq;

.field final synthetic d:Z

.field final synthetic e:Lcom/huawei/hihealth/HiSyncOption;


# direct methods
.method constructor <init>(Lo/cnq;ZZLcom/huawei/hihealth/HiSyncOption;I)V
    .locals 0

    .line 1238
    iput-object p1, p0, Lo/cnq$5;->c:Lo/cnq;

    iput-boolean p2, p0, Lo/cnq$5;->d:Z

    iput-boolean p3, p0, Lo/cnq$5;->a:Z

    iput-object p4, p0, Lo/cnq$5;->e:Lcom/huawei/hihealth/HiSyncOption;

    iput p5, p0, Lo/cnq$5;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1241
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "synCloud"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1243
    iget-object v0, p0, Lo/cnq$5;->c:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/csf;->c(Landroid/content/Context;)Lo/csf;

    move-result-object v0

    invoke-virtual {v0}, Lo/csf;->e()V

    .line 1244
    iget-boolean v0, p0, Lo/cnq$5;->d:Z

    if-eqz v0, :cond_0

    .line 1245
    iget-object v0, p0, Lo/cnq$5;->c:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cuy;->l(Landroid/content/Context;)I

    move-result v0

    add-int/lit8 v4, v0, 0x1

    .line 1246
    iget-object v0, p0, Lo/cnq$5;->c:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lo/cuy;->p(Landroid/content/Context;I)V

    .line 1247
    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lo/cnq$5;->a:Z

    if-eqz v0, :cond_1

    .line 1248
    iget-object v0, p0, Lo/cnq$5;->c:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cuy;->s(Landroid/content/Context;)I

    move-result v0

    add-int/lit8 v4, v0, 0x1

    .line 1249
    iget-object v0, p0, Lo/cnq$5;->c:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lo/cuy;->r(Landroid/content/Context;I)V

    .line 1251
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/cnq$5;->c:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->e(Lo/cnq;)Lo/csk;

    move-result-object v0

    iget-object v1, p0, Lo/cnq$5;->e:Lcom/huawei/hihealth/HiSyncOption;

    iget v2, p0, Lo/cnq$5;->b:I

    invoke-virtual {v0, v1, v2}, Lo/csk;->d(Lcom/huawei/hihealth/HiSyncOption;I)V

    .line 1252
    return-void
.end method

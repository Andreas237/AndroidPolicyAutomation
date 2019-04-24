.class Lo/dde$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dde;->g(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ear;

.field final synthetic d:Lo/dde;


# direct methods
.method constructor <init>(Lo/dde;Lo/ear;)V
    .locals 0

    .line 4962
    iput-object p1, p0, Lo/dde$14;->d:Lo/dde;

    iput-object p2, p0, Lo/dde$14;->b:Lo/ear;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPullingChange(Lo/eay;Lo/eba;)V
    .locals 4

    .line 4964
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "update Descrption totalsize is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lo/eba;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "pullsize is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lo/eba;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "uuid is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/eay;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4966
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 4967
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u63cf\u8ff0\u6587\u4ef6\u66f4\u65b0\u6210\u529f"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4968
    iget-object v0, p0, Lo/dde$14;->d:Lo/dde;

    iget-object v1, p0, Lo/dde$14;->d:Lo/dde;

    invoke-static {v1}, Lo/dde;->o(Lo/dde;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lo/dde;->e(Lo/dde;I)I

    .line 4969
    iget-object v0, p0, Lo/dde$14;->d:Lo/dde;

    invoke-static {v0}, Lo/dde;->o(Lo/dde;)I

    move-result v0

    iget-object v1, p0, Lo/dde$14;->d:Lo/dde;

    invoke-static {v1}, Lo/dde;->l(Lo/dde;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 4971
    iget-object v0, p0, Lo/dde$14;->d:Lo/dde;

    invoke-static {v0}, Lo/dde;->n(Lo/dde;)V

    goto :goto_0

    .line 4975
    :cond_0
    iget-object v0, p0, Lo/dde$14;->d:Lo/dde;

    iget-object v1, p0, Lo/dde$14;->b:Lo/ear;

    invoke-static {v0, v1}, Lo/dde;->e(Lo/dde;Lo/ear;)V

    .line 4976
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u63cf\u8ff0\u6587\u4ef6\u66f4\u65b0\u5931\u8d25,\u4e0d\u66f4\u65b0UI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4978
    :cond_1
    :goto_0
    return-void
.end method

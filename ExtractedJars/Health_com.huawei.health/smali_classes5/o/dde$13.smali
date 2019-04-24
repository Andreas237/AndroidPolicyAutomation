.class Lo/dde$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dde;->f(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lo/dde;


# direct methods
.method constructor <init>(Lo/dde;Ljava/lang/String;)V
    .locals 0

    .line 4871
    iput-object p1, p0, Lo/dde$13;->e:Lo/dde;

    iput-object p2, p0, Lo/dde$13;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPullingChange(Lo/eay;Lo/eba;)V
    .locals 4

    .line 4874
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u66f4\u65b0index\u6587\u4ef6 status:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p2, Lo/eba;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4875
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 4877
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaw;->a()V

    .line 4879
    iget-object v0, p0, Lo/dde$13;->e:Lo/dde;

    iget-object v1, p0, Lo/dde$13;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dde;->d(Lo/dde;Ljava/lang/String;)V

    goto :goto_0

    .line 4880
    :cond_0
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, -0x1

    if-ne v1, v0, :cond_1

    .line 4882
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u66f4\u65b0index\u672a\u6210\u529f \u4e0d\u66f4\u65b0UI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 4883
    :cond_1
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, -0x5

    if-ne v1, v0, :cond_2

    .line 4884
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u670d\u52a1\u5668\u672a\u627e\u5230\u8d44\u6e90"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4886
    :cond_2
    :goto_0
    return-void
.end method

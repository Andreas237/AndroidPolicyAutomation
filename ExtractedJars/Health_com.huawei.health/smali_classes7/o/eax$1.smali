.class Lo/eax$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eax;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eav;Lo/eaz;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/eaz;

.field final synthetic d:Lo/eax;


# direct methods
.method constructor <init>(Lo/eax;Lo/eaz;)V
    .locals 0

    .line 164
    iput-object p1, p0, Lo/eax$1;->d:Lo/eax;

    iput-object p2, p0, Lo/eax$1;->b:Lo/eaz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPullingChange(Lo/eay;Lo/eba;)V
    .locals 5

    .line 167
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 168
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResult is 200"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    invoke-virtual {p1}, Lo/eay;->e()Ljava/lang/String;

    move-result-object v4

    .line 170
    iget-object v0, p0, Lo/eax$1;->d:Lo/eax;

    iget-object v1, p0, Lo/eax$1;->b:Lo/eaz;

    invoke-static {v0, v4, v1, p1, p2}, Lo/eax;->d(Lo/eax;Ljava/lang/String;Lo/eaz;Lo/eay;Lo/eba;)V

    .line 171
    goto :goto_0

    .line 172
    :cond_0
    iget-object v0, p0, Lo/eax$1;->b:Lo/eaz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 173
    iget-object v0, p0, Lo/eax$1;->b:Lo/eaz;

    invoke-interface {v0, p1, p2}, Lo/eaz;->onPullingChange(Lo/eay;Lo/eba;)V

    .line 176
    :cond_1
    :goto_0
    return-void
.end method
.class Lo/eax$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eax;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eaz;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eax;

.field final synthetic d:Lo/eaz;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/eax;Ljava/lang/String;Lo/eaz;)V
    .locals 0

    .line 194
    iput-object p1, p0, Lo/eax$2;->c:Lo/eax;

    iput-object p2, p0, Lo/eax$2;->e:Ljava/lang/String;

    iput-object p3, p0, Lo/eax$2;->d:Lo/eaz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPullingChange(Lo/eay;Lo/eba;)V
    .locals 6

    .line 197
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 199
    iget-object v0, p0, Lo/eax$2;->c:Lo/eax;

    iget-object v1, p0, Lo/eax$2;->c:Lo/eax;

    invoke-static {v1}, Lo/eax;->c(Lo/eax;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/eax$2;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/eax;->e(Lo/eax;Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 200
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "descriptionJson = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    invoke-static {v4}, Lo/eao;->b(Ljava/lang/String;)Lo/eav;

    move-result-object v5

    .line 204
    invoke-virtual {v5}, Lo/eav;->e()I

    move-result v0

    invoke-virtual {p2, v0}, Lo/eba;->a(I)V

    .line 205
    iget-object v0, p0, Lo/eax$2;->d:Lo/eaz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 206
    iget-object v0, p0, Lo/eax$2;->d:Lo/eaz;

    invoke-interface {v0, p1, p2}, Lo/eaz;->onPullingChange(Lo/eay;Lo/eba;)V

    .line 208
    :cond_0
    goto :goto_0

    :cond_1
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    goto :goto_0

    .line 211
    :cond_2
    iget-object v0, p0, Lo/eax$2;->d:Lo/eaz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 212
    iget-object v0, p0, Lo/eax$2;->d:Lo/eaz;

    invoke-interface {v0, p1, p2}, Lo/eaz;->onPullingChange(Lo/eay;Lo/eba;)V

    .line 215
    :cond_3
    :goto_0
    return-void
.end method

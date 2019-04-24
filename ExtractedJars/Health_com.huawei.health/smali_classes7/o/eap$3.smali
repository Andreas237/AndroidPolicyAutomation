.class Lo/eap$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eap;->a(Ljava/lang/String;Lo/eaz;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eap;

.field final synthetic d:Lo/eaz;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/eap;Ljava/lang/String;Lo/eaz;)V
    .locals 0

    .line 392
    iput-object p1, p0, Lo/eap$3;->c:Lo/eap;

    iput-object p2, p0, Lo/eap$3;->e:Ljava/lang/String;

    iput-object p3, p0, Lo/eap$3;->d:Lo/eaz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPullingChange(Lo/eay;Lo/eba;)V
    .locals 4

    .line 394
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 395
    iget-object v0, p0, Lo/eap$3;->c:Lo/eap;

    iget-object v1, p0, Lo/eap$3;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/eap;->e(Lo/eap;Ljava/lang/String;)Lo/eav;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 396
    iget-object v0, p0, Lo/eap$3;->c:Lo/eap;

    iget-object v1, p0, Lo/eap$3;->e:Ljava/lang/String;

    iget-object v2, p0, Lo/eap$3;->d:Lo/eaz;

    invoke-virtual {v0, v1, v2}, Lo/eap;->a(Ljava/lang/String;Lo/eaz;)V

    goto :goto_0

    .line 398
    :cond_0
    const-string v0, "EzPlugin_EzPluginHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "inform error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 400
    :cond_1
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    goto :goto_0

    .line 403
    :cond_2
    iget-object v0, p0, Lo/eap$3;->d:Lo/eaz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 404
    iget-object v0, p0, Lo/eap$3;->d:Lo/eaz;

    invoke-interface {v0, p1, p2}, Lo/eaz;->onPullingChange(Lo/eay;Lo/eba;)V

    .line 407
    :cond_3
    :goto_0
    return-void
.end method

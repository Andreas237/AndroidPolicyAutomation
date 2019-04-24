.class Lo/eaw$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eaw;->d(Ljava/lang/String;Lo/eaz;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lo/eaz;

.field final synthetic e:Lo/eaw;


# direct methods
.method constructor <init>(Lo/eaw;Ljava/lang/String;Lo/eaz;)V
    .locals 0

    .line 290
    iput-object p1, p0, Lo/eaw$2;->e:Lo/eaw;

    iput-object p2, p0, Lo/eaw$2;->a:Ljava/lang/String;

    iput-object p3, p0, Lo/eaw$2;->b:Lo/eaz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPullingChange(Lo/eay;Lo/eba;)V
    .locals 4

    .line 292
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 293
    iget-object v0, p0, Lo/eaw$2;->e:Lo/eaw;

    iget-object v1, p0, Lo/eaw$2;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eaw;->a(Ljava/lang/String;)Lo/eav;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 294
    iget-object v0, p0, Lo/eaw$2;->e:Lo/eaw;

    iget-object v1, p0, Lo/eaw$2;->a:Ljava/lang/String;

    iget-object v2, p0, Lo/eaw$2;->b:Lo/eaz;

    invoke-virtual {v0, v1, v2}, Lo/eaw;->d(Ljava/lang/String;Lo/eaz;)V

    goto :goto_0

    .line 296
    :cond_0
    const-string v0, "EzPlugin_EzPluginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "inform error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 298
    :cond_1
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    goto :goto_0

    .line 301
    :cond_2
    iget-object v0, p0, Lo/eaw$2;->b:Lo/eaz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 302
    iget-object v0, p0, Lo/eaw$2;->b:Lo/eaz;

    invoke-interface {v0, p1, p2}, Lo/eaz;->onPullingChange(Lo/eay;Lo/eba;)V

    .line 305
    :cond_3
    :goto_0
    return-void
.end method

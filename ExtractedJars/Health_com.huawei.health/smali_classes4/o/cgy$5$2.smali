.class Lo/cgy$5$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amap/api/maps/model/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgy$5;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cgy$5;


# direct methods
.method constructor <init>(Lo/cgy$5;)V
    .locals 0

    .line 1055
    iput-object p1, p0, Lo/cgy$5$2;->a:Lo/cgy$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd()V
    .locals 2

    .line 1063
    iget-object v0, p0, Lo/cgy$5$2;->a:Lo/cgy$5;

    iget-object v0, v0, Lo/cgy$5;->e:Lo/cgy;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cgy;->e(Lo/cgy;Z)Z

    .line 1064
    iget-object v0, p0, Lo/cgy$5$2;->a:Lo/cgy$5;

    iget-object v0, v0, Lo/cgy$5;->e:Lo/cgy;

    invoke-static {v0}, Lo/cgy;->a(Lo/cgy;)Lo/chc$d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1065
    iget-object v0, p0, Lo/cgy$5$2;->a:Lo/cgy$5;

    iget-object v0, v0, Lo/cgy$5;->e:Lo/cgy;

    invoke-static {v0}, Lo/cgy;->a(Lo/cgy;)Lo/chc$d;

    move-result-object v0

    invoke-interface {v0}, Lo/chc$d;->e()V

    .line 1067
    :cond_0
    return-void
.end method

.method public onAnimationStart()V
    .locals 0

    .line 1059
    return-void
.end method

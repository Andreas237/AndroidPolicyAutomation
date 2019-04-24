.class Lo/cgy$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amap/api/maps/model/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgy;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cgy;


# direct methods
.method constructor <init>(Lo/cgy;)V
    .locals 0

    .line 901
    iput-object p1, p0, Lo/cgy$1;->d:Lo/cgy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd()V
    .locals 2

    .line 909
    iget-object v0, p0, Lo/cgy$1;->d:Lo/cgy;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cgy;->c(Lo/cgy;Z)Z

    .line 910
    iget-object v0, p0, Lo/cgy$1;->d:Lo/cgy;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cgy;->e(Lo/cgy;Z)Z

    .line 911
    iget-object v0, p0, Lo/cgy$1;->d:Lo/cgy;

    invoke-static {v0}, Lo/cgy;->e(Lo/cgy;)Lo/cgv;

    move-result-object v0

    invoke-virtual {v0}, Lo/cgv;->c()V

    .line 912
    return-void
.end method

.method public onAnimationStart()V
    .locals 0

    .line 905
    return-void
.end method

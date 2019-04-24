.class Lo/cgy$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cgv$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgy;->e(Lo/cew;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cgy;


# direct methods
.method constructor <init>(Lo/cgy;)V
    .locals 0

    .line 1047
    iput-object p1, p0, Lo/cgy$5;->e:Lo/cgy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 5

    .line 1050
    iget-object v0, p0, Lo/cgy$5;->e:Lo/cgy;

    iget-object v1, p0, Lo/cgy$5;->e:Lo/cgy;

    invoke-static {v1}, Lo/cgy;->c(Lo/cgy;)Lcom/amap/api/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cgy;->e(Lcom/amap/api/maps/model/LatLng;)V

    .line 1051
    new-instance v4, Lcom/amap/api/maps/model/animation/ScaleAnimation;

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/amap/api/maps/model/animation/ScaleAnimation;-><init>(FFFF)V

    .line 1052
    const-wide/16 v0, 0x1f4

    invoke-virtual {v4, v0, v1}, Lcom/amap/api/maps/model/animation/ScaleAnimation;->setDuration(J)V

    .line 1053
    iget-object v0, p0, Lo/cgy$5;->e:Lo/cgy;

    invoke-static {v0}, Lo/cgy;->d(Lo/cgy;)Lcom/amap/api/maps/model/Marker;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/amap/api/maps/model/Marker;->setAnimation(Lcom/amap/api/maps/model/animation/Animation;)V

    .line 1054
    iget-object v0, p0, Lo/cgy$5;->e:Lo/cgy;

    invoke-static {v0}, Lo/cgy;->d(Lo/cgy;)Lcom/amap/api/maps/model/Marker;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amap/api/maps/model/Marker;->startAnimation()Z

    .line 1055
    iget-object v0, p0, Lo/cgy$5;->e:Lo/cgy;

    invoke-static {v0}, Lo/cgy;->d(Lo/cgy;)Lcom/amap/api/maps/model/Marker;

    move-result-object v0

    new-instance v1, Lo/cgy$5$2;

    invoke-direct {v1, p0}, Lo/cgy$5$2;-><init>(Lo/cgy$5;)V

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/Marker;->setAnimationListener(Lcom/amap/api/maps/model/animation/Animation$AnimationListener;)V

    .line 1069
    return-void
.end method

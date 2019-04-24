.class Lo/cgy$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amap/api/maps/AMap$OnMapLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgy;->d()V
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

    .line 1138
    iput-object p1, p0, Lo/cgy$2;->d:Lo/cgy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMapLoaded()V
    .locals 7

    .line 1141
    iget-object v0, p0, Lo/cgy$2;->d:Lo/cgy;

    invoke-static {v0}, Lo/cgy;->b(Lo/cgy;)Lcom/amap/api/maps/AMap;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1142
    return-void

    .line 1144
    :cond_0
    iget-object v0, p0, Lo/cgy$2;->d:Lo/cgy;

    invoke-static {v0}, Lo/cgy;->k(Lo/cgy;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cdr;->d(Landroid/content/Context;)Landroid/location/Location;

    move-result-object v4

    .line 1145
    if-eqz v4, :cond_1

    .line 1146
    iget-object v0, p0, Lo/cgy$2;->d:Lo/cgy;

    invoke-static {v0}, Lo/cgy;->k(Lo/cgy;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lo/cdr;->b(Landroid/content/Context;Landroid/location/Location;)[D

    move-result-object v5

    .line 1147
    new-instance v6, Lcom/amap/api/maps/model/LatLng;

    const/4 v0, 0x0

    aget-wide v0, v5, v0

    const/4 v2, 0x1

    aget-wide v2, v5, v2

    invoke-direct {v6, v0, v1, v2, v3}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    .line 1148
    iget-object v0, p0, Lo/cgy$2;->d:Lo/cgy;

    invoke-static {v0}, Lo/cgy;->b(Lo/cgy;)Lcom/amap/api/maps/AMap;

    move-result-object v0

    invoke-static {v6}, Lcom/amap/api/maps/CameraUpdateFactory;->changeLatLng(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->moveCamera(Lcom/amap/api/maps/CameraUpdate;)V

    .line 1149
    iget-object v0, p0, Lo/cgy$2;->d:Lo/cgy;

    invoke-static {v0}, Lo/cgy;->b(Lo/cgy;)Lcom/amap/api/maps/AMap;

    move-result-object v0

    const/high16 v1, 0x41840000    # 16.5f

    invoke-static {v1}, Lcom/amap/api/maps/CameraUpdateFactory;->zoomTo(F)Lcom/amap/api/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->moveCamera(Lcom/amap/api/maps/CameraUpdate;)V

    .line 1152
    :cond_1
    return-void
.end method

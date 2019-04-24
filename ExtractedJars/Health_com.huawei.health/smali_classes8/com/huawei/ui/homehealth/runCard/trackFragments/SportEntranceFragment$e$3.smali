.class Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;)V
    .locals 0

    .line 1424
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e$3;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1427
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e$3;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;)Lcom/amap/api/maps/model/LatLng;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1428
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e$3;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->s(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/amap/api/maps/model/Marker;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1429
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e$3;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->s(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/amap/api/maps/model/Marker;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amap/api/maps/model/Marker;->remove()V

    .line 1431
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e$3;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e$3;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    iget-object v1, v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/amap/api/maps/AMap;

    move-result-object v1

    new-instance v2, Lcom/amap/api/maps/model/MarkerOptions;

    invoke-direct {v2}, Lcom/amap/api/maps/model/MarkerOptions;-><init>()V

    iget-object v3, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e$3;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    invoke-static {v3}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;)Lcom/amap/api/maps/model/LatLng;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/amap/api/maps/model/MarkerOptions;->position(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v2

    .line 1432
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/amap/api/maps/model/MarkerOptions;->draggable(Z)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v2

    .line 1433
    const/high16 v3, 0x3f000000    # 0.5f

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-virtual {v2, v3, v4}, Lcom/amap/api/maps/model/MarkerOptions;->anchor(FF)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e$3;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    .line 1434
    invoke-static {v3}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;)Ljava/util/ArrayList;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e$3;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;

    invoke-static {v4}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/amap/api/maps/model/BitmapDescriptor;

    invoke-virtual {v2, v3}, Lcom/amap/api/maps/model/MarkerOptions;->icon(Lcom/amap/api/maps/model/BitmapDescriptor;)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v2

    .line 1431
    invoke-virtual {v1, v2}, Lcom/amap/api/maps/AMap;->addMarker(Lcom/amap/api/maps/model/MarkerOptions;)Lcom/amap/api/maps/model/Marker;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;Lcom/amap/api/maps/model/Marker;)Lcom/amap/api/maps/model/Marker;

    .line 1436
    :cond_1
    return-void
.end method

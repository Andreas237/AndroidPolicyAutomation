.class Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;)V
    .locals 0

    .line 1362
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c$2;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1366
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c$2;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->e(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1367
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c$2;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->r(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1368
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c$2;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->r(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    .line 1370
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c$2;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c$2;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    iget-object v1, v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v2}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    iget-object v3, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c$2;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    invoke-static {v3}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->e(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v2

    .line 1371
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->draggable(Z)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v2

    .line 1372
    const/high16 v3, 0x3f000000    # 0.5f

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->anchor(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c$2;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    .line 1373
    invoke-static {v3}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;)Ljava/util/ArrayList;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c$2;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    invoke-static {v4}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/maps/model/BitmapDescriptor;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v2

    .line 1370
    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;Lcom/google/android/gms/maps/model/Marker;)Lcom/google/android/gms/maps/model/Marker;

    .line 1375
    :cond_1
    return-void
.end method

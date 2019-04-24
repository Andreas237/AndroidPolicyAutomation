.class Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e(DD)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

.field final synthetic b:D

.field final synthetic d:D


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;DD)V
    .locals 0

    .line 844
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    iput-wide p2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;->d:D

    iput-wide p4, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;->b:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 847
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->o(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 848
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/amap/api/maps/AMap;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 849
    new-instance v4, Lcom/amap/api/maps/model/LatLng;

    iget-wide v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;->d:D

    iget-wide v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;->b:D

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    .line 850
    const/high16 v0, 0x41840000    # 16.5f

    invoke-static {v0}, Lcom/amap/api/maps/CameraUpdateFactory;->zoomTo(F)Lcom/amap/api/maps/CameraUpdate;

    move-result-object v5

    .line 851
    invoke-static {v4}, Lcom/amap/api/maps/CameraUpdateFactory;->changeLatLng(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/CameraUpdate;

    move-result-object v6

    .line 852
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/amap/api/maps/AMap;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/amap/api/maps/AMap;->moveCamera(Lcom/amap/api/maps/CameraUpdate;)V

    .line 853
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/amap/api/maps/AMap;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/amap/api/maps/AMap;->moveCamera(Lcom/amap/api/maps/CameraUpdate;)V

    .line 854
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0, v4}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;Lcom/amap/api/maps/model/LatLng;)V

    .line 855
    goto :goto_0

    .line 857
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 858
    new-instance v4, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;->d:D

    iget-wide v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;->b:D

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 859
    const/high16 v0, 0x41780000    # 15.5f

    invoke-static {v0}, Lcom/google/android/gms/maps/CameraUpdateFactory;->zoomTo(F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v5

    .line 860
    invoke-static {v4}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLng(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v6

    .line 861
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 862
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    .line 863
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->n(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 864
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->n(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->obtainMessage(I)Landroid/os/Message;

    move-result-object v7

    .line 865
    iput-object v4, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 866
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$2;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->n(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->sendMessage(Landroid/os/Message;)Z

    .line 871
    :cond_1
    :goto_0
    return-void
.end method

.class Lcom/yandex/metrica/impl/ob/hc$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/location/LocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ob/hc;-><init>(Landroid/content/Context;Landroid/os/Looper;Landroid/location/LocationManager;Lcom/yandex/metrica/impl/ob/hc$a;Lcom/yandex/metrica/impl/ob/hh;Lcom/yandex/metrica/impl/ob/gu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/hc;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/hc;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/hc$1;->a:Lcom/yandex/metrica/impl/ob/hc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 1
    .param p1    # Landroid/location/Location;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 98
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hc$1;->a:Lcom/yandex/metrica/impl/ob/hc;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/hc;->a(Lcom/yandex/metrica/impl/ob/hc;)Lcom/yandex/metrica/impl/ob/hh;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/hh;->a(Landroid/location/Location;)V

    :cond_0
    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method

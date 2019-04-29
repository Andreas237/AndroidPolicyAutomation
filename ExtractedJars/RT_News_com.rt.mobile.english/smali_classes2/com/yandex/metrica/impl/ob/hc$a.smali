.class Lcom/yandex/metrica/impl/ob/hc$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/hc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/os/Looper;Landroid/location/LocationManager;Landroid/location/LocationListener;)Lcom/yandex/metrica/impl/ob/hd;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 31
    new-instance v0, Lcom/yandex/metrica/impl/ob/hd;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/yandex/metrica/impl/ob/hd;-><init>(Landroid/content/Context;Landroid/os/Looper;Landroid/location/LocationManager;Landroid/location/LocationListener;)V

    return-object v0
.end method

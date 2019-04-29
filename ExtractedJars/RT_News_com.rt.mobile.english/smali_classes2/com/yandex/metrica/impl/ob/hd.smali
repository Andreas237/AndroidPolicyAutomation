.class Lcom/yandex/metrica/impl/ob/hd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:J


# instance fields
.field private b:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private c:Landroid/os/Looper;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private d:Landroid/location/LocationManager;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private e:Landroid/location/LocationListener;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 27
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/yandex/metrica/impl/ob/hd;->a:J

    .line 28
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Landroid/location/LocationManager;Landroid/location/LocationListener;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Looper;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/location/LocationManager;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Landroid/location/LocationListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/hd;->b:Landroid/content/Context;

    .line 46
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/hd;->c:Landroid/os/Looper;

    .line 47
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/hd;->d:Landroid/location/LocationManager;

    .line 48
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/hd;->e:Landroid/location/LocationListener;

    .line 49
    new-instance p1, Landroid/os/Handler;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/hd;->c:Landroid/os/Looper;

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 8

    .line 54
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hd;->b:Landroid/content/Context;

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    .line 1034
    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ar;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v2, "passive"

    .line 55
    sget-wide v3, Lcom/yandex/metrica/impl/ob/hd;->a:J

    iget-object v6, p0, Lcom/yandex/metrica/impl/ob/hd;->e:Landroid/location/LocationListener;

    iget-object v7, p0, Lcom/yandex/metrica/impl/ob/hd;->c:Landroid/os/Looper;

    .line 1085
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hd;->d:Landroid/location/LocationManager;

    if-eqz v0, :cond_0

    .line 1087
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hd;->d:Landroid/location/LocationManager;

    const/4 v5, 0x0

    invoke-virtual/range {v1 .. v7}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 68
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hd;->d:Landroid/location/LocationManager;

    if-eqz v0, :cond_0

    .line 70
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hd;->d:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hd;->e:Landroid/location/LocationListener;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    :cond_0
    return-void
.end method

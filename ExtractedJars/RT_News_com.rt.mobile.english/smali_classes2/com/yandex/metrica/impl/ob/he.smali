.class Lcom/yandex/metrica/impl/ob/he;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/yandex/metrica/impl/ob/gs$a;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private b:Ljava/lang/Long;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private c:J

.field private d:Landroid/location/Location;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/gs$a;JLandroid/location/Location;)V
    .locals 6
    .param p1    # Lcom/yandex/metrica/impl/ob/gs$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/location/Location;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    .line 27
    invoke-direct/range {v0 .. v5}, Lcom/yandex/metrica/impl/ob/he;-><init>(Lcom/yandex/metrica/impl/ob/gs$a;JLandroid/location/Location;Ljava/lang/Long;)V

    return-void
.end method

.method public constructor <init>(Lcom/yandex/metrica/impl/ob/gs$a;JLandroid/location/Location;Ljava/lang/Long;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/gs$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/location/Location;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Long;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/he;->a:Lcom/yandex/metrica/impl/ob/gs$a;

    .line 34
    iput-object p5, p0, Lcom/yandex/metrica/impl/ob/he;->b:Ljava/lang/Long;

    .line 35
    iput-wide p2, p0, Lcom/yandex/metrica/impl/ob/he;->c:J

    .line 36
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/he;->d:Landroid/location/Location;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Long;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 53
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/he;->b:Ljava/lang/Long;

    return-object v0
.end method

.method public b()J
    .locals 2

    .line 61
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/he;->c:J

    return-wide v0
.end method

.method public c()Landroid/location/Location;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/he;->d:Landroid/location/Location;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LocationWrapper{collectionMode="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/he;->a:Lcom/yandex/metrica/impl/ob/gs$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mIncrementalId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/he;->b:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mReceiveTimestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/he;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mLocation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/he;->d:Landroid/location/Location;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

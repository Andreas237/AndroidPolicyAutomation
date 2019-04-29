.class public Lcom/yandex/metrica/impl/ob/gh;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/gj;

.field private final c:J

.field private final d:Z

.field private final e:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/gj;J)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gh;->a:Ljava/lang/String;

    .line 54
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/gh;->b:Lcom/yandex/metrica/impl/ob/gj;

    .line 55
    iput-wide p3, p0, Lcom/yandex/metrica/impl/ob/gh;->c:J

    .line 56
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/gh;->f()Z

    move-result p1

    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ob/gh;->d:Z

    const-wide/16 p1, -0x1

    .line 57
    iput-wide p1, p0, Lcom/yandex/metrica/impl/ob/gh;->e:J

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;J)V
    .locals 3
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "device_id"

    .line 41
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/gh;->a:Ljava/lang/String;

    const-string v0, "device_snapshot_key"

    .line 42
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    new-instance v0, Lcom/yandex/metrica/impl/ob/gj;

    const-string v1, "device_snapshot_key"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/gj;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/gh;->b:Lcom/yandex/metrica/impl/ob/gj;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/gh;->b:Lcom/yandex/metrica/impl/ob/gj;

    :goto_0
    const-string v0, "last_elections_time"

    const-wide/16 v1, -0x1

    .line 47
    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/gh;->c:J

    .line 48
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/gh;->f()Z

    move-result p1

    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ob/gh;->d:Z

    .line 49
    iput-wide p2, p0, Lcom/yandex/metrica/impl/ob/gh;->e:J

    return-void
.end method

.method private f()Z
    .locals 7

    .line 93
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/gh;->c:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    const/4 v0, 0x0

    if-lez v4, :cond_1

    .line 94
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/yandex/metrica/impl/ob/gh;->c:J

    sub-long v5, v1, v3

    const-wide/32 v1, 0x240c8400

    cmp-long v3, v5, v1

    if-gez v3, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0

    :cond_1
    return v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 61
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "device_id"

    .line 62
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/gh;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 63
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/gh;->b:Lcom/yandex/metrica/impl/ob/gj;

    if-eqz v1, :cond_0

    const-string v1, "device_snapshot_key"

    .line 64
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/gh;->b:Lcom/yandex/metrica/impl/ob/gj;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/gj;->a()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    const-string v1, "last_elections_time"

    .line 66
    iget-wide v2, p0, Lcom/yandex/metrica/impl/ob/gh;->c:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 67
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    .line 102
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 104
    :cond_1
    check-cast p1, Lcom/yandex/metrica/impl/ob/gh;

    .line 106
    iget-boolean v2, p0, Lcom/yandex/metrica/impl/ob/gh;->d:Z

    iget-boolean v3, p1, Lcom/yandex/metrica/impl/ob/gh;->d:Z

    if-eq v2, v3, :cond_2

    return v1

    .line 107
    :cond_2
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/gh;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/yandex/metrica/impl/ob/gh;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    .line 108
    :cond_3
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/gh;->b:Lcom/yandex/metrica/impl/ob/gj;

    if-eqz v2, :cond_4

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gh;->b:Lcom/yandex/metrica/impl/ob/gj;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/gh;->b:Lcom/yandex/metrica/impl/ob/gj;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/gj;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/gh;->b:Lcom/yandex/metrica/impl/ob/gj;

    if-nez p1, :cond_5

    return v0

    :cond_5
    return v1

    :cond_6
    :goto_0
    return v1
.end method

.method public b()Z
    .locals 5

    .line 71
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/gh;->e:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    const/4 v0, 0x0

    if-lez v4, :cond_1

    .line 72
    invoke-static {}, Ljava/util/GregorianCalendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 73
    iget-wide v2, p0, Lcom/yandex/metrica/impl/ob/gh;->e:J

    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/4 v2, 0x1

    .line 74
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/16 v3, 0x7b2

    if-ne v1, v3, :cond_0

    return v2

    :cond_0
    return v0

    :cond_1
    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gh;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lcom/yandex/metrica/impl/ob/gj;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gh;->b:Lcom/yandex/metrica/impl/ob/gj;

    return-object v0
.end method

.method public e()Z
    .locals 1

    .line 89
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/gh;->d:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 114
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Credentials{mFresh="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/gh;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mLastElectionsTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/gh;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mDeviceSnapshot="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/gh;->b:Lcom/yandex/metrica/impl/ob/gj;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mDeviceID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/gh;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/yandex/metrica/impl/ob/gm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gm;->a:Ljava/lang/String;

    .line 38
    iput p2, p0, Lcom/yandex/metrica/impl/ob/gm;->b:I

    .line 39
    iput-boolean p3, p0, Lcom/yandex/metrica/impl/ob/gm;->c:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, -0x1

    .line 43
    invoke-direct {p0, p1, v0, p2}, Lcom/yandex/metrica/impl/ob/gm;-><init>(Ljava/lang/String;IZ)V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 2
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "name"

    .line 31
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/gm;->a:Ljava/lang/String;

    const-string v0, "required"

    .line 32
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/gm;->c:Z

    const-string v0, "version"

    const/4 v1, -0x1

    .line 33
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/yandex/metrica/impl/ob/gm;->b:I

    return-void
.end method


# virtual methods
.method public a()Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 59
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "name"

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/gm;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "required"

    iget-boolean v2, p0, Lcom/yandex/metrica/impl/ob/gm;->c:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v0

    .line 60
    iget v1, p0, Lcom/yandex/metrica/impl/ob/gm;->b:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const-string v1, "version"

    .line 61
    iget v2, p0, Lcom/yandex/metrica/impl/ob/gm;->b:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :cond_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    .line 69
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 71
    :cond_1
    check-cast p1, Lcom/yandex/metrica/impl/ob/gm;

    .line 73
    iget v2, p0, Lcom/yandex/metrica/impl/ob/gm;->b:I

    iget v3, p1, Lcom/yandex/metrica/impl/ob/gm;->b:I

    if-eq v2, v3, :cond_2

    return v1

    .line 74
    :cond_2
    iget-boolean v2, p0, Lcom/yandex/metrica/impl/ob/gm;->c:Z

    iget-boolean v3, p1, Lcom/yandex/metrica/impl/ob/gm;->c:Z

    if-eq v2, v3, :cond_3

    return v1

    .line 75
    :cond_3
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/gm;->a:Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gm;->a:Ljava/lang/String;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/gm;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/gm;->a:Ljava/lang/String;

    if-nez p1, :cond_5

    return v0

    :cond_5
    return v1

    :cond_6
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    .line 81
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gm;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gm;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 82
    iget v1, p0, Lcom/yandex/metrica/impl/ob/gm;->b:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 83
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/gm;->c:Z

    add-int/2addr v0, v1

    return v0
.end method

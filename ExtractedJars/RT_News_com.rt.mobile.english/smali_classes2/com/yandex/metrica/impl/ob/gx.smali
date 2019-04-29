.class public Lcom/yandex/metrica/impl/ob/gx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/Long;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private b:J

.field private c:Lorg/json/JSONArray;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private d:Lorg/json/JSONArray;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Long;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gx;->a:Ljava/lang/Long;

    return-object v0
.end method

.method public a(J)V
    .locals 0

    .line 39
    iput-wide p1, p0, Lcom/yandex/metrica/impl/ob/gx;->b:J

    return-void
.end method

.method public a(Ljava/lang/Long;)V
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 31
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gx;->a:Ljava/lang/Long;

    return-void
.end method

.method public a(Lorg/json/JSONArray;)V
    .locals 0
    .param p1    # Lorg/json/JSONArray;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 48
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gx;->c:Lorg/json/JSONArray;

    return-void
.end method

.method public b()J
    .locals 2

    .line 35
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/gx;->b:J

    return-wide v0
.end method

.method public b(Lorg/json/JSONArray;)V
    .locals 0
    .param p1    # Lorg/json/JSONArray;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 57
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gx;->d:Lorg/json/JSONArray;

    return-void
.end method

.method public c()Lorg/json/JSONArray;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 44
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gx;->c:Lorg/json/JSONArray;

    return-object v0
.end method

.method public d()Lorg/json/JSONArray;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 53
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gx;->d:Lorg/json/JSONArray;

    return-object v0
.end method

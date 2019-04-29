.class public Lcom/yandex/metrica/impl/ob/id;
.super Lcom/yandex/metrica/impl/ob/hz;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final c:Lcom/yandex/metrica/impl/ob/ig;


# instance fields
.field private d:Lcom/yandex/metrica/impl/ob/ig;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 18
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "PREF_KEY_OFFSET"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/id;->c:Lcom/yandex/metrica/impl/ob/ig;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 23
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/hz;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 25
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object p2, Lcom/yandex/metrica/impl/ob/id;->c:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/id;->d:Lcom/yandex/metrica/impl/ob/ig;

    return-void
.end method


# virtual methods
.method public a(I)J
    .locals 4

    .line 34
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/id;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/id;->d:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    int-to-long v2, p1

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public a()V
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/id;->d:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/id;->h(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/hz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hz;->j()V

    return-void
.end method

.method protected f()Ljava/lang/String;
    .locals 1

    const-string v0, "_servertimeoffset"

    return-object v0
.end method

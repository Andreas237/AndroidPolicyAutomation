.class public Lcom/yandex/metrica/impl/ob/ic;
.super Lcom/yandex/metrica/impl/ob/hz;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final c:Lcom/yandex/metrica/impl/ob/ig;

.field private static final d:Lcom/yandex/metrica/impl/ob/ig;


# instance fields
.field private e:Lcom/yandex/metrica/impl/ob/ig;

.field private f:Lcom/yandex/metrica/impl/ob/ig;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 16
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "SERVICE_API_LEVEL"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ic;->c:Lcom/yandex/metrica/impl/ob/ig;

    .line 17
    new-instance v0, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "CLIENT_API_LEVEL"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ic;->d:Lcom/yandex/metrica/impl/ob/ig;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, p1, v0}, Lcom/yandex/metrica/impl/ob/hz;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 26
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object v0, Lcom/yandex/metrica/impl/ob/ic;->c:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ic;->e:Lcom/yandex/metrica/impl/ob/ig;

    .line 27
    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    sget-object v0, Lcom/yandex/metrica/impl/ob/ic;->d:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ic;->f:Lcom/yandex/metrica/impl/ob/ig;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 3

    .line 39
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ic;->b:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ic;->e:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public b()Lcom/yandex/metrica/impl/ob/ic;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ic;->e:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/ic;->h(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/hz;

    return-object p0
.end method

.method public c()Lcom/yandex/metrica/impl/ob/ic;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ic;->f:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/ic;->h(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/hz;

    return-object p0
.end method

.method protected f()Ljava/lang/String;
    .locals 1

    const-string v0, "_migrationpreferences"

    return-object v0
.end method

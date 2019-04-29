.class public Lcom/yandex/metrica/impl/j;
.super Landroid/os/ResultReceiver;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/j$a;
    }
.end annotation


# instance fields
.field private a:Lcom/yandex/metrica/impl/j$a;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    return-void
.end method

.method public static a(Landroid/os/ResultReceiver;Lcom/yandex/metrica/impl/ob/km;)V
    .locals 2

    if-eqz p0, :cond_0

    .line 84
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const/4 v1, 0x2

    .line 85
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/km;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public static a(Landroid/os/ResultReceiver;Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 4
    .param p0    # Landroid/os/ResultReceiver;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p0, :cond_0

    .line 70
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "Uuid"

    .line 71
    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/ks;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "DeviceId"

    .line 72
    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/ks;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "AdUrlGet"

    .line 73
    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/ks;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "AdUrlReport"

    .line 74
    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/ks;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "ServerTimeOffset"

    .line 75
    invoke-static {}, Lcom/yandex/metrica/impl/ob/mb;->a()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 76
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/ks;->i:Ljava/lang/String;

    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/ly;->a(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "Clids"

    .line 77
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/lp;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 78
    invoke-virtual {p0, p1, v0}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    :cond_0
    return-void
.end method


# virtual methods
.method a(Lcom/yandex/metrica/impl/j$a;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/yandex/metrica/impl/j;->a:Lcom/yandex/metrica/impl/j$a;

    return-void
.end method

.method protected onReceiveResult(ILandroid/os/Bundle;)V
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/yandex/metrica/impl/j;->a:Lcom/yandex/metrica/impl/j$a;

    if-eqz v0, :cond_0

    .line 63
    iget-object v0, p0, Lcom/yandex/metrica/impl/j;->a:Lcom/yandex/metrica/impl/j$a;

    invoke-interface {v0, p1, p2}, Lcom/yandex/metrica/impl/j$a;->a(ILandroid/os/Bundle;)V

    :cond_0
    return-void
.end method

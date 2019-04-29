.class public Lcom/yandex/metrica/impl/ay;
.super Lcom/yandex/metrica/impl/ba;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ay$a;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ba;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    return-void
.end method

.method public static G()Lcom/yandex/metrica/impl/az$a;
    .locals 1

    .line 35
    new-instance v0, Lcom/yandex/metrica/impl/ay$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ay$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method protected E()J
    .locals 2

    const-wide/16 v0, -0x2

    return-wide v0
.end method

.method protected F()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public bridge synthetic a()Ljava/lang/String;
    .locals 1

    .line 13
    invoke-super {p0}, Lcom/yandex/metrica/impl/ba;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Z
    .locals 1

    .line 13
    invoke-super {p0}, Lcom/yandex/metrica/impl/ba;->b()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic g()V
    .locals 0

    .line 13
    invoke-super {p0}, Lcom/yandex/metrica/impl/ba;->g()V

    return-void
.end method

.method public bridge synthetic u()Z
    .locals 1

    .line 13
    invoke-super {p0}, Lcom/yandex/metrica/impl/ba;->u()Z

    move-result v0

    return v0
.end method

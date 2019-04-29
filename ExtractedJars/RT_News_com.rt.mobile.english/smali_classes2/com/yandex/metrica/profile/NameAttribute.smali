.class public Lcom/yandex/metrica/profile/NameAttribute;
.super Lcom/yandex/metrica/profile/StringAttribute;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 4

    const-string v0, "appmetrica_name"

    .line 33
    new-instance v1, Lcom/yandex/metrica/impl/ob/na;

    const-string v2, "Name attribute"

    const/16 v3, 0x64

    invoke-direct {v1, v3, v2}, Lcom/yandex/metrica/impl/ob/na;-><init>(ILjava/lang/String;)V

    new-instance v2, Lcom/yandex/metrica/impl/ob/nd;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/nd;-><init>()V

    new-instance v3, Lcom/yandex/metrica/impl/ob/ix;

    invoke-direct {v3}, Lcom/yandex/metrica/impl/ob/ix;-><init>()V

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/yandex/metrica/profile/StringAttribute;-><init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/nc;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ij;)V

    return-void
.end method

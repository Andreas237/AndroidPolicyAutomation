.class public Lcom/yandex/metrica/profile/NotificationsEnabledAttribute;
.super Lcom/yandex/metrica/profile/BooleanAttribute;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 3

    const-string v0, "appmetrica_notifications_enabled"

    .line 30
    new-instance v1, Lcom/yandex/metrica/impl/ob/nd;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/ob/nd;-><init>()V

    new-instance v2, Lcom/yandex/metrica/impl/ob/ix;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/ix;-><init>()V

    invoke-direct {p0, v0, v1, v2}, Lcom/yandex/metrica/profile/BooleanAttribute;-><init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ij;)V

    return-void
.end method

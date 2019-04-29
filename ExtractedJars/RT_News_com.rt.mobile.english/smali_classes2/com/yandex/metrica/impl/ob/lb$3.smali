.class Lcom/yandex/metrica/impl/ob/lb$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ob/lb;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/lb;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/lb;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/lb$3;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 111
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lb$3;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/lb;->a(Lcom/yandex/metrica/impl/ob/lb;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 113
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lb$3;->a:Lcom/yandex/metrica/impl/ob/lb;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/lb;->a(Lcom/yandex/metrica/impl/ob/lb;Z)Z

    .line 115
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v0

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/lb$3;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-virtual {v0, v2}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;)V

    .line 117
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lb$3;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/lb;->b(Lcom/yandex/metrica/impl/ob/lb;)Landroid/telephony/PhoneStateListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lb$3;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/lb;->c(Lcom/yandex/metrica/impl/ob/lb;)Landroid/telephony/TelephonyManager;

    move-result-object v0

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/lb$3;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-static {v2}, Lcom/yandex/metrica/impl/ob/lb;->b(Lcom/yandex/metrica/impl/ob/lb;)Landroid/telephony/PhoneStateListener;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    :cond_1
    return-void
.end method

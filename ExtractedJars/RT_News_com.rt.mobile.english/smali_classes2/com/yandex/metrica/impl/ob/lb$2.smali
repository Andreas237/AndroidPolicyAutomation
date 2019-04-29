.class Lcom/yandex/metrica/impl/ob/lb$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ob/lb;->a()V
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

    .line 79
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/lb$2;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 81
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lb$2;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/lb;->a(Lcom/yandex/metrica/impl/ob/lb;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 83
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lb$2;->a:Lcom/yandex/metrica/impl/ob/lb;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/lb;->a(Lcom/yandex/metrica/impl/ob/lb;Z)Z

    .line 85
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/lb$2;->a:Lcom/yandex/metrica/impl/ob/lb;

    const-class v2, Lcom/yandex/metrica/impl/ob/r;

    new-instance v3, Lcom/yandex/metrica/impl/ob/lb$2$1;

    invoke-direct {v3, p0}, Lcom/yandex/metrica/impl/ob/lb$2$1;-><init>(Lcom/yandex/metrica/impl/ob/lb$2;)V

    .line 87
    invoke-static {v3}, Lcom/yandex/metrica/impl/ob/l;->a(Lcom/yandex/metrica/impl/ob/k;)Lcom/yandex/metrica/impl/ob/l$a;

    move-result-object v3

    .line 93
    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/l$a;->a()Lcom/yandex/metrica/impl/ob/l;

    move-result-object v3

    .line 85
    invoke-virtual {v0, v1, v2, v3}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;Ljava/lang/Class;Lcom/yandex/metrica/impl/ob/l;)V

    .line 97
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lb$2;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/lb;->b(Lcom/yandex/metrica/impl/ob/lb;)Landroid/telephony/PhoneStateListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lb$2;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/lb;->c(Lcom/yandex/metrica/impl/ob/lb;)Landroid/telephony/TelephonyManager;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/lb$2;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/lb;->b(Lcom/yandex/metrica/impl/ob/lb;)Landroid/telephony/PhoneStateListener;

    move-result-object v1

    const/16 v2, 0x100

    invoke-virtual {v0, v1, v2}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    :cond_1
    return-void
.end method

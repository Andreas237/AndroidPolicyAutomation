.class public Lcom/yandex/metrica/impl/ob/lg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/li;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/li<",
        "Ljava/util/List<",
        "Lcom/yandex/metrica/impl/ob/lf;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/lb;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/lb;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/lb;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/lg;->a:Lcom/yandex/metrica/impl/ob/lb;

    return-void
.end method

.method private b()Lcom/yandex/metrica/impl/ob/lf;
    .locals 7

    .line 55
    new-instance v6, Lcom/yandex/metrica/impl/ob/lf;

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/lg;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/lg;->e()Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/lg;->h()Z

    move-result v3

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/lg;->f()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/yandex/metrica/impl/ob/lf;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;)V

    return-object v6
.end method

.method private c()Ljava/lang/Integer;
    .locals 4

    const/4 v0, 0x0

    .line 60
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/lg;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/lb;->c()Landroid/telephony/TelephonyManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 61
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v0

    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    return-object v0
.end method

.method private e()Ljava/lang/Integer;
    .locals 3

    const/4 v0, 0x0

    .line 68
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/lg;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/lb;->c()Landroid/telephony/TelephonyManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 69
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v0

    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    return-object v0
.end method

.method private f()Ljava/lang/String;
    .locals 1

    .line 77
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lg;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/lb;->c()Landroid/telephony/TelephonyManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private g()Ljava/util/List;
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/lf;",
            ">;"
        }
    .end annotation

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 85
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/lg;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/lb;->d()Landroid/content/Context;

    move-result-object v1

    const-string v2, "android.permission.READ_PHONE_STATE"

    .line 1042
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ar;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 87
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/lg;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/lb;->d()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/telephony/SubscriptionManager;->from(Landroid/content/Context;)Landroid/telephony/SubscriptionManager;

    move-result-object v1

    .line 88
    invoke-virtual {v1}, Landroid/telephony/SubscriptionManager;->getActiveSubscriptionInfoList()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 90
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/telephony/SubscriptionInfo;

    .line 91
    new-instance v3, Lcom/yandex/metrica/impl/ob/lf;

    invoke-direct {v3, v2}, Lcom/yandex/metrica/impl/ob/lf;-><init>(Landroid/telephony/SubscriptionInfo;)V

    .line 92
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    return-object v0
.end method

.method private h()Z
    .locals 2

    .line 103
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lg;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/lb;->d()Landroid/content/Context;

    move-result-object v0

    const-string v1, "android.permission.READ_PHONE_STATE"

    .line 2042
    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ar;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lg;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/lb;->c()Landroid/telephony/TelephonyManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->isNetworkRoaming()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/lf;",
            ">;"
        }
    .end annotation

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 39
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/lg;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/lb;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x17

    .line 40
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 41
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/lg;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 42
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_1

    .line 43
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/lg;->b()Lcom/yandex/metrica/impl/ob/lf;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 46
    :cond_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/lg;->b()Lcom/yandex/metrica/impl/ob/lf;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-object v0
.end method

.method public synthetic d()Ljava/lang/Object;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 26
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/lg;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

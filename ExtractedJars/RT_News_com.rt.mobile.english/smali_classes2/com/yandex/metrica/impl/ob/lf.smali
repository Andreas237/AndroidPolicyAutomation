.class public final Lcom/yandex/metrica/impl/ob/lf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Integer;

.field private final b:Ljava/lang/Integer;

.field private final c:Z

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/telephony/SubscriptionInfo;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getMcc()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/lf;->a:Ljava/lang/Integer;

    .line 38
    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getMnc()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/lf;->b:Ljava/lang/Integer;

    .line 39
    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getDataRoaming()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Lcom/yandex/metrica/impl/ob/lf;->c:Z

    .line 40
    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getCarrierName()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/lf;->d:Ljava/lang/String;

    .line 41
    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getIccId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/lf;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/lf;->a:Ljava/lang/Integer;

    .line 29
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/lf;->b:Ljava/lang/Integer;

    .line 30
    iput-boolean p3, p0, Lcom/yandex/metrica/impl/ob/lf;->c:Z

    .line 31
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/lf;->d:Ljava/lang/String;

    .line 32
    iput-object p5, p0, Lcom/yandex/metrica/impl/ob/lf;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lf;->a:Ljava/lang/Integer;

    return-object v0
.end method

.method public b()Ljava/lang/Integer;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lf;->b:Ljava/lang/Integer;

    return-object v0
.end method

.method public c()Z
    .locals 1

    .line 53
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/lf;->c:Z

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lf;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lf;->e:Ljava/lang/String;

    return-object v0
.end method

.class public Lcom/yandex/metrica/impl/ob/la;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/li;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/li<",
        "Lcom/yandex/metrica/impl/ob/ky;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Landroid/util/SparseArray;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlineApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/yandex/metrica/impl/ob/lb;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    new-instance v0, Lcom/yandex/metrica/impl/ob/la$1;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/la$1;-><init>()V

    sput-object v0, Lcom/yandex/metrica/impl/ob/la;->a:Landroid/util/SparseArray;

    return-void
.end method

.method public constructor <init>(Lcom/yandex/metrica/impl/ob/lb;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/lb;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/la;->b:Lcom/yandex/metrica/impl/ob/lb;

    return-void
.end method

.method private e()Ljava/lang/Integer;
    .locals 4

    const/4 v0, 0x0

    .line 83
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/la;->b:Lcom/yandex/metrica/impl/ob/lb;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/lb;->c()Landroid/telephony/TelephonyManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 84
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :cond_0
    return-object v0

    :catch_0
    return-object v0
.end method

.method private f()Ljava/lang/Integer;
    .locals 3

    const/4 v0, 0x0

    .line 94
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/la;->b:Lcom/yandex/metrica/impl/ob/lb;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/lb;->c()Landroid/telephony/TelephonyManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 95
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :cond_0
    return-object v0

    :catch_0
    return-object v0
.end method

.method private g()Ljava/lang/String;
    .locals 3

    const-string v0, "unknown"

    .line 145
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/la;->b:Lcom/yandex/metrica/impl/ob/lb;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/lb;->c()Landroid/telephony/TelephonyManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    move-result v1

    .line 146
    sget-object v2, Lcom/yandex/metrica/impl/ob/la;->a:Landroid/util/SparseArray;

    invoke-virtual {v2, v1, v0}, Landroid/util/SparseArray;->get(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    :catch_0
    return-object v0
.end method

.method private h()Ljava/lang/String;
    .locals 1

    .line 156
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/la;->b:Lcom/yandex/metrica/impl/ob/lb;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/lb;->c()Landroid/telephony/TelephonyManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method


# virtual methods
.method public a()Lcom/yandex/metrica/impl/ob/ky;
    .locals 12
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/la;->b:Lcom/yandex/metrica/impl/ob/lb;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/lb;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    new-instance v0, Lcom/yandex/metrica/impl/ob/ky;

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/la;->e()Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/la;->f()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/la;->c()Ljava/lang/Integer;

    move-result-object v4

    .line 72
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/la;->b()Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/la;->h()Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/la;->g()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Lcom/yandex/metrica/impl/ob/ky;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZILjava/lang/Integer;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method b()Ljava/lang/Integer;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const/4 v0, 0x0

    .line 107
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/la;->b:Lcom/yandex/metrica/impl/ob/lb;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/lb;->j()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 108
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/la;->b:Lcom/yandex/metrica/impl/ob/lb;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/lb;->d()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/yandex/metrica/impl/ar;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 109
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/la;->b:Lcom/yandex/metrica/impl/ob/lb;

    .line 110
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/lb;->c()Landroid/telephony/TelephonyManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getCellLocation()Landroid/telephony/CellLocation;

    move-result-object v1

    check-cast v1, Landroid/telephony/gsm/GsmCellLocation;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 113
    invoke-virtual {v1}, Landroid/telephony/gsm/GsmCellLocation;->getCid()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-eq v2, v1, :cond_1

    .line 115
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :cond_1
    return-object v0

    :catch_0
    :cond_2
    return-object v0
.end method

.method c()Ljava/lang/Integer;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const/4 v0, 0x0

    .line 129
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/la;->b:Lcom/yandex/metrica/impl/ob/lb;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/lb;->j()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 130
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/la;->b:Lcom/yandex/metrica/impl/ob/lb;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/lb;->d()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/yandex/metrica/impl/ar;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 131
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/la;->b:Lcom/yandex/metrica/impl/ob/lb;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/lb;->c()Landroid/telephony/TelephonyManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getCellLocation()Landroid/telephony/CellLocation;

    move-result-object v1

    check-cast v1, Landroid/telephony/gsm/GsmCellLocation;

    invoke-virtual {v1}, Landroid/telephony/gsm/GsmCellLocation;->getLac()I

    move-result v1

    const/4 v2, 0x1

    if-eq v2, v1, :cond_0

    .line 132
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :cond_0
    return-object v0

    :catch_0
    :cond_1
    return-object v0
.end method

.method public synthetic d()Ljava/lang/Object;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 26
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/la;->a()Lcom/yandex/metrica/impl/ob/ky;

    move-result-object v0

    return-object v0
.end method

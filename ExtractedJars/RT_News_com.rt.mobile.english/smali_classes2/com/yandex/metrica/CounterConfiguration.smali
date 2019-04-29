.class public Lcom/yandex/metrica/CounterConfiguration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/CounterConfiguration$a;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/yandex/metrica/CounterConfiguration;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Landroid/content/ContentValues;

.field private b:Landroid/os/ResultReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 407
    new-instance v0, Lcom/yandex/metrica/CounterConfiguration$1;

    invoke-direct {v0}, Lcom/yandex/metrica/CounterConfiguration$1;-><init>()V

    sput-object v0, Lcom/yandex/metrica/CounterConfiguration;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 106
    iput-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->b:Landroid/os/ResultReceiver;

    .line 114
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    return-void
.end method

.method private constructor <init>(Landroid/content/ContentValues;Landroid/os/ResultReceiver;)V
    .locals 1

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 106
    iput-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->b:Landroid/os/ResultReceiver;

    .line 109
    iput-object p1, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    .line 110
    iput-object p2, p0, Lcom/yandex/metrica/CounterConfiguration;->b:Landroid/os/ResultReceiver;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/ContentValues;Landroid/os/ResultReceiver;B)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/CounterConfiguration;-><init>(Landroid/content/ContentValues;Landroid/os/ResultReceiver;)V

    return-void
.end method

.method public constructor <init>(Lcom/yandex/metrica/c;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 135
    invoke-direct {p0}, Lcom/yandex/metrica/CounterConfiguration;-><init>()V

    .line 136
    iget-object v0, p1, Lcom/yandex/metrica/c;->apiKey:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/yandex/metrica/CounterConfiguration;->c(Ljava/lang/String;)V

    .line 137
    iget-object v0, p1, Lcom/yandex/metrica/c;->sessionTimeout:Ljava/lang/Integer;

    invoke-direct {p0, v0}, Lcom/yandex/metrica/CounterConfiguration;->a(Ljava/lang/Integer;)V

    .line 138
    iget-object v0, p1, Lcom/yandex/metrica/c;->a:Ljava/lang/Integer;

    invoke-direct {p0, v0}, Lcom/yandex/metrica/CounterConfiguration;->b(Ljava/lang/Integer;)V

    .line 139
    iget-object p1, p1, Lcom/yandex/metrica/c;->b:Ljava/lang/Integer;

    invoke-direct {p0, p1}, Lcom/yandex/metrica/CounterConfiguration;->c(Ljava/lang/Integer;)V

    return-void
.end method

.method public constructor <init>(Lcom/yandex/metrica/e;)V
    .locals 6

    .line 118
    invoke-direct {p0}, Lcom/yandex/metrica/CounterConfiguration;-><init>()V

    .line 119
    iget-object v0, p1, Lcom/yandex/metrica/e;->apiKey:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/yandex/metrica/CounterConfiguration;->c(Ljava/lang/String;)V

    .line 120
    iget-object v0, p1, Lcom/yandex/metrica/e;->sessionTimeout:Ljava/lang/Integer;

    invoke-direct {p0, v0}, Lcom/yandex/metrica/CounterConfiguration;->a(Ljava/lang/Integer;)V

    .line 1155
    iget-object v0, p1, Lcom/yandex/metrica/e;->location:Landroid/location/Location;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 1156
    iget-object v0, p1, Lcom/yandex/metrica/e;->location:Landroid/location/Location;

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/CounterConfiguration;->a(Landroid/location/Location;)V

    .line 2161
    :cond_1
    iget-object v0, p1, Lcom/yandex/metrica/e;->locationTracking:Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    move v0, v2

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    if-eqz v0, :cond_3

    .line 2162
    iget-object v0, p1, Lcom/yandex/metrica/e;->locationTracking:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/CounterConfiguration;->a(Z)V

    .line 3167
    :cond_3
    iget-object v0, p1, Lcom/yandex/metrica/e;->installedAppCollecting:Ljava/lang/Boolean;

    if-eqz v0, :cond_4

    move v0, v2

    goto :goto_2

    :cond_4
    move v0, v1

    :goto_2
    if-eqz v0, :cond_5

    .line 3168
    iget-object v0, p1, Lcom/yandex/metrica/e;->installedAppCollecting:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/CounterConfiguration;->b(Z)V

    .line 4173
    :cond_5
    iget-object v0, p1, Lcom/yandex/metrica/e;->a:Ljava/lang/String;

    if-eqz v0, :cond_6

    move v0, v2

    goto :goto_3

    :cond_6
    move v0, v1

    :goto_3
    if-eqz v0, :cond_8

    .line 4174
    iget-object v0, p1, Lcom/yandex/metrica/e;->a:Ljava/lang/String;

    .line 5260
    iget-object v3, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v4, "CFG_DEVICE_SIZE_TYPE"

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/4 v0, 0x0

    :cond_7
    invoke-virtual {v3, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    :cond_8
    iget-object v0, p1, Lcom/yandex/metrica/e;->f:Ljava/lang/Integer;

    invoke-direct {p0, v0}, Lcom/yandex/metrica/CounterConfiguration;->b(Ljava/lang/Integer;)V

    .line 126
    iget-object v0, p1, Lcom/yandex/metrica/e;->g:Ljava/lang/Integer;

    invoke-direct {p0, v0}, Lcom/yandex/metrica/CounterConfiguration;->c(Ljava/lang/Integer;)V

    .line 6191
    iget-object v0, p1, Lcom/yandex/metrica/e;->appVersion:Ljava/lang/String;

    .line 6192
    invoke-static {v0}, Lcom/yandex/metrica/impl/bp;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 6193
    iget-object v0, p1, Lcom/yandex/metrica/e;->appVersion:Ljava/lang/String;

    .line 6295
    iget-object v3, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v4, "CFG_APP_VERSION"

    invoke-virtual {v3, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 7198
    :cond_9
    iget-object v0, p1, Lcom/yandex/metrica/e;->e:Ljava/lang/Integer;

    if-eqz v0, :cond_a

    move v0, v2

    goto :goto_4

    :cond_a
    move v0, v1

    :goto_4
    if-eqz v0, :cond_b

    .line 7199
    iget-object v0, p1, Lcom/yandex/metrica/e;->e:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/CounterConfiguration;->d(I)V

    .line 8204
    :cond_b
    iget-object v0, p1, Lcom/yandex/metrica/e;->j:Ljava/lang/Boolean;

    if-eqz v0, :cond_c

    move v0, v2

    goto :goto_5

    :cond_c
    move v0, v1

    :goto_5
    if-eqz v0, :cond_d

    .line 8205
    iget-object v0, p1, Lcom/yandex/metrica/e;->j:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/CounterConfiguration;->d(Z)V

    .line 9210
    :cond_d
    iget-object v0, p1, Lcom/yandex/metrica/e;->k:Ljava/lang/Boolean;

    if-eqz v0, :cond_e

    move v0, v2

    goto :goto_6

    :cond_e
    move v0, v1

    :goto_6
    if-eqz v0, :cond_f

    .line 9211
    iget-object v0, p1, Lcom/yandex/metrica/e;->k:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/CounterConfiguration;->e(Z)V

    .line 10216
    :cond_f
    iget-object v0, p1, Lcom/yandex/metrica/e;->firstActivationAsUpdate:Ljava/lang/Boolean;

    if-eqz v0, :cond_10

    move v1, v2

    :cond_10
    if-eqz v1, :cond_11

    .line 10217
    iget-object p1, p1, Lcom/yandex/metrica/e;->firstActivationAsUpdate:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 10371
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_IS_FIRST_ACTIVATION_AS_UPDATE"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    :cond_11
    return-void
.end method

.method private a(Ljava/lang/Integer;)V
    .locals 1
    .param p1    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 150
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/CounterConfiguration;->c(I)V

    :cond_1
    return-void
.end method

.method private a(Ljava/lang/String;Z)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 561
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    invoke-virtual {v0, p1}, Landroid/content/ContentValues;->getAsBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    if-nez p1, :cond_0

    return p2

    .line 562
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method private b(Ljava/lang/Integer;)V
    .locals 1
    .param p1    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 180
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/CounterConfiguration;->a(I)V

    :cond_1
    return-void
.end method

.method public static c(Landroid/os/Bundle;)Lcom/yandex/metrica/CounterConfiguration;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    :try_start_0
    const-string v1, "COUNTER_CFG_OBJ"

    .line 544
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/yandex/metrica/CounterConfiguration;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    return-object v0

    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 552
    new-instance v0, Lcom/yandex/metrica/CounterConfiguration;

    invoke-direct {v0}, Lcom/yandex/metrica/CounterConfiguration;-><init>()V

    .line 555
    :cond_1
    invoke-virtual {v0, p0}, Lcom/yandex/metrica/CounterConfiguration;->b(Landroid/os/Bundle;)V

    return-object v0
.end method

.method private c(Ljava/lang/Integer;)V
    .locals 1
    .param p1    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 186
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/CounterConfiguration;->b(I)V

    :cond_1
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 144
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/CounterConfiguration;->a(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private g(Z)V
    .locals 2

    .line 428
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_MAIN_REPORTER"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/os/ResultReceiver;
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->b:Landroid/os/ResultReceiver;

    return-object v0
.end method

.method public a(I)V
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 231
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_DISPATCH_PERIOD"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method public final a(Landroid/location/Location;)V
    .locals 2

    .line 334
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_MANUAL_LOCATION"

    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/gy;->a(Landroid/location/Location;)[B

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "COUNTER_CFG_OBJ"

    .line 453
    invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method public a(Landroid/os/ResultReceiver;)V
    .locals 0

    .line 222
    iput-object p1, p0, Lcom/yandex/metrica/CounterConfiguration;->b:Landroid/os/ResultReceiver;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 270
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_API_KEY"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 286
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_LOCATION_TRACKING"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method public b()Ljava/lang/Integer;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 236
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_DISPATCH_PERIOD"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public b(I)V
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 241
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_MAX_REPORTS_COUNT"

    if-gtz p1, :cond_0

    const p1, 0x7fffffff

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "CFG_DISPATCH_PERIOD"

    .line 507
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "CFG_DISPATCH_PERIOD"

    .line 508
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/CounterConfiguration;->a(I)V

    :cond_1
    const-string v0, "CFG_SESSION_TIMEOUT"

    .line 511
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "CFG_SESSION_TIMEOUT"

    .line 512
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/CounterConfiguration;->c(I)V

    :cond_2
    const-string v0, "CFG_MAX_REPORTS_COUNT"

    .line 515
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "CFG_MAX_REPORTS_COUNT"

    .line 516
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/CounterConfiguration;->b(I)V

    :cond_3
    const-string v0, "CFG_API_KEY"

    .line 519
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v0, "-1"

    const-string v1, "CFG_API_KEY"

    .line 520
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "CFG_API_KEY"

    .line 521
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/CounterConfiguration;->a(Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .line 274
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_UUID"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(Z)V
    .locals 2

    .line 312
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_COLLECT_INSTALLED_APPS"

    if-eqz p1, :cond_0

    sget-object p1, Lcom/yandex/metrica/CounterConfiguration$a;->c:Lcom/yandex/metrica/CounterConfiguration$a;

    :goto_0
    iget p1, p1, Lcom/yandex/metrica/CounterConfiguration$a;->d:I

    goto :goto_1

    :cond_0
    sget-object p1, Lcom/yandex/metrica/CounterConfiguration$a;->b:Lcom/yandex/metrica/CounterConfiguration$a;

    goto :goto_0

    .line 313
    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 312
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method public c()Ljava/lang/Integer;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 246
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_MAX_REPORTS_COUNT"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public c(I)V
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 251
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_SESSION_TIMEOUT"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method public c(Z)V
    .locals 2

    .line 338
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_IS_LOG_ENABLED"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method public d()Ljava/lang/Integer;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 256
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_SESSION_TIMEOUT"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public d(I)V
    .locals 2

    .line 303
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_APP_VERSION_CODE"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public d(Z)V
    .locals 2

    .line 363
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_AUTO_PRELOAD_INFO_DETECTION"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 265
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_DEVICE_SIZE_TYPE"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e(Z)V
    .locals 2

    .line 367
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_PERMISSIONS_COLLECTING"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 2

    .line 282
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_API_KEY"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f(Z)V
    .locals 0

    .line 424
    invoke-direct {p0, p1}, Lcom/yandex/metrica/CounterConfiguration;->g(Z)V

    return-void
.end method

.method public g()Ljava/lang/Boolean;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 291
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_LOCATION_TRACKING"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 2

    .line 299
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_APP_VERSION"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 2

    .line 307
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_APP_VERSION_CODE"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public j()Lcom/yandex/metrica/CounterConfiguration$a;
    .locals 2

    .line 329
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_COLLECT_INSTALLED_APPS"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 14527
    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 14528
    check-cast v0, Ljava/lang/Integer;

    .line 14529
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/yandex/metrica/CounterConfiguration$a;->a(I)Lcom/yandex/metrica/CounterConfiguration$a;

    move-result-object v0

    return-object v0

    .line 14531
    :cond_0
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_2

    .line 14532
    check-cast v0, Ljava/lang/Boolean;

    .line 14533
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/yandex/metrica/CounterConfiguration$a;->c:Lcom/yandex/metrica/CounterConfiguration$a;

    return-object v0

    :cond_1
    sget-object v0, Lcom/yandex/metrica/CounterConfiguration$a;->b:Lcom/yandex/metrica/CounterConfiguration$a;

    return-object v0

    .line 14536
    :cond_2
    sget-object v0, Lcom/yandex/metrica/CounterConfiguration$a;->a:Lcom/yandex/metrica/CounterConfiguration$a;

    return-object v0
.end method

.method public k()Ljava/lang/Boolean;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 343
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_IS_LOG_ENABLED"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public l()Landroid/location/Location;
    .locals 2

    .line 347
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_MANUAL_LOCATION"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_MANUAL_LOCATION"

    .line 348
    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsByteArray(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/gy;->a([B)Landroid/location/Location;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public m()Ljava/lang/Boolean;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 354
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_AUTO_PRELOAD_INFO_DETECTION"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public n()Ljava/lang/Boolean;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 376
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_IS_FIRST_ACTIVATION_AS_UPDATE"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public o()V
    .locals 3

    .line 15437
    iget-object v0, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const-string v1, "CFG_COMMUTATION_REPORTER"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    const/4 v0, 0x0

    .line 433
    invoke-direct {p0, v0}, Lcom/yandex/metrica/CounterConfiguration;->g(Z)V

    return-void
.end method

.method public p()Z
    .locals 2

    const-string v0, "CFG_MAIN_REPORTER"

    const/4 v1, 0x1

    .line 441
    invoke-direct {p0, v0, v1}, Lcom/yandex/metrica/CounterConfiguration;->a(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public q()Z
    .locals 2

    const-string v0, "CFG_COMMUTATION_REPORTER"

    const/4 v1, 0x0

    .line 445
    invoke-direct {p0, v0, v1}, Lcom/yandex/metrica/CounterConfiguration;->a(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CounterConfiguration{mParamsMapping="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 403
    iget-object p2, p0, Lcom/yandex/metrica/CounterConfiguration;->a:Landroid/content/ContentValues;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 404
    iget-object p2, p0, Lcom/yandex/metrica/CounterConfiguration;->b:Landroid/os/ResultReceiver;

    .line 15212
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    .line 15213
    invoke-virtual {p2, v1, v0}, Landroid/os/ResultReceiver;->writeToParcel(Landroid/os/Parcel;I)V

    .line 15214
    invoke-virtual {v1, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 15215
    sget-object p2, Landroid/os/ResultReceiver;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/ResultReceiver;

    .line 15216
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 404
    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method

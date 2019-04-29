.class public Lcom/yandex/metrica/e;
.super Lcom/yandex/metrica/YandexMetricaConfig;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/e$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final f:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final g:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final h:Ljava/util/Map;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/util/Map;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Ljava/lang/Boolean;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final k:Ljava/lang/Boolean;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/YandexMetricaConfig;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/YandexMetricaConfig;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 112
    invoke-direct {p0, p1}, Lcom/yandex/metrica/YandexMetricaConfig;-><init>(Lcom/yandex/metrica/YandexMetricaConfig;)V

    const/4 p1, 0x0

    .line 113
    iput-object p1, p0, Lcom/yandex/metrica/e;->a:Ljava/lang/String;

    .line 114
    iput-object p1, p0, Lcom/yandex/metrica/e;->b:Ljava/util/Map;

    .line 115
    iput-object p1, p0, Lcom/yandex/metrica/e;->e:Ljava/lang/Integer;

    .line 116
    iput-object p1, p0, Lcom/yandex/metrica/e;->f:Ljava/lang/Integer;

    .line 117
    iput-object p1, p0, Lcom/yandex/metrica/e;->g:Ljava/lang/Integer;

    .line 118
    iput-object p1, p0, Lcom/yandex/metrica/e;->c:Ljava/lang/String;

    .line 119
    iput-object p1, p0, Lcom/yandex/metrica/e;->i:Ljava/util/Map;

    .line 120
    iput-object p1, p0, Lcom/yandex/metrica/e;->j:Ljava/lang/Boolean;

    .line 121
    iput-object p1, p0, Lcom/yandex/metrica/e;->k:Ljava/lang/Boolean;

    .line 122
    iput-object p1, p0, Lcom/yandex/metrica/e;->d:Ljava/util/List;

    .line 123
    iput-object p1, p0, Lcom/yandex/metrica/e;->h:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Lcom/yandex/metrica/e$a;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/e$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 635
    invoke-static {p1}, Lcom/yandex/metrica/e$a;->a(Lcom/yandex/metrica/e$a;)Lcom/yandex/metrica/YandexMetricaConfig$Builder;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/yandex/metrica/YandexMetricaConfig;-><init>(Lcom/yandex/metrica/YandexMetricaConfig$Builder;)V

    .line 636
    invoke-static {p1}, Lcom/yandex/metrica/e$a;->b(Lcom/yandex/metrica/e$a;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/e;->e:Ljava/lang/Integer;

    .line 638
    invoke-static {p1}, Lcom/yandex/metrica/e$a;->c(Lcom/yandex/metrica/e$a;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    .line 639
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/yandex/metrica/e;->d:Ljava/util/List;

    .line 641
    invoke-static {p1}, Lcom/yandex/metrica/e$a;->d(Lcom/yandex/metrica/e$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/e;->a:Ljava/lang/String;

    .line 642
    invoke-static {p1}, Lcom/yandex/metrica/e$a;->e(Lcom/yandex/metrica/e$a;)Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v0, v1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lcom/yandex/metrica/e$a;->e(Lcom/yandex/metrica/e$a;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lcom/yandex/metrica/e;->b:Ljava/util/Map;

    .line 643
    invoke-static {p1}, Lcom/yandex/metrica/e$a;->f(Lcom/yandex/metrica/e$a;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/e;->g:Ljava/lang/Integer;

    .line 644
    invoke-static {p1}, Lcom/yandex/metrica/e$a;->g(Lcom/yandex/metrica/e$a;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/e;->f:Ljava/lang/Integer;

    .line 645
    iget-object v0, p1, Lcom/yandex/metrica/e$a;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/e;->c:Ljava/lang/String;

    .line 646
    invoke-static {p1}, Lcom/yandex/metrica/e$a;->h(Lcom/yandex/metrica/e$a;)Ljava/util/LinkedHashMap;

    move-result-object v0

    if-nez v0, :cond_2

    move-object v0, v1

    goto :goto_2

    .line 648
    :cond_2
    invoke-static {p1}, Lcom/yandex/metrica/e$a;->h(Lcom/yandex/metrica/e$a;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lcom/yandex/metrica/e;->h:Ljava/util/Map;

    .line 649
    invoke-static {p1}, Lcom/yandex/metrica/e$a;->i(Lcom/yandex/metrica/e$a;)Ljava/util/LinkedHashMap;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {p1}, Lcom/yandex/metrica/e$a;->i(Lcom/yandex/metrica/e$a;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    :goto_3
    iput-object v1, p0, Lcom/yandex/metrica/e;->i:Ljava/util/Map;

    .line 650
    invoke-static {p1}, Lcom/yandex/metrica/e$a;->j(Lcom/yandex/metrica/e$a;)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/e;->j:Ljava/lang/Boolean;

    .line 651
    invoke-static {p1}, Lcom/yandex/metrica/e$a;->k(Lcom/yandex/metrica/e$a;)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/e;->k:Ljava/lang/Boolean;

    return-void
.end method

.method synthetic constructor <init>(Lcom/yandex/metrica/e$a;B)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/yandex/metrica/e;-><init>(Lcom/yandex/metrica/e$a;)V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/yandex/metrica/e$a;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 149
    new-instance v0, Lcom/yandex/metrica/e$a;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/e$a;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static a(Lcom/yandex/metrica/YandexMetricaConfig;)Lcom/yandex/metrica/e;
    .locals 1
    .param p0    # Lcom/yandex/metrica/YandexMetricaConfig;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 128
    instance-of v0, p0, Lcom/yandex/metrica/e;

    if-eqz v0, :cond_0

    .line 129
    check-cast p0, Lcom/yandex/metrica/e;

    return-object p0

    .line 131
    :cond_0
    new-instance v0, Lcom/yandex/metrica/e;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/e;-><init>(Lcom/yandex/metrica/YandexMetricaConfig;)V

    return-object v0
.end method

.method static b(Lcom/yandex/metrica/YandexMetricaConfig;)Lcom/yandex/metrica/e$a;
    .locals 4
    .param p0    # Lcom/yandex/metrica/YandexMetricaConfig;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 171
    iget-object v0, p0, Lcom/yandex/metrica/YandexMetricaConfig;->apiKey:Ljava/lang/String;

    invoke-static {v0}, Lcom/yandex/metrica/e;->a(Ljava/lang/String;)Lcom/yandex/metrica/e$a;

    move-result-object v0

    .line 172
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->appVersion:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-eqz v1, :cond_1

    .line 173
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->appVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->a(Ljava/lang/String;)Lcom/yandex/metrica/e$a;

    .line 175
    :cond_1
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->sessionTimeout:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    move v1, v3

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    if-eqz v1, :cond_3

    .line 176
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->sessionTimeout:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->a(I)Lcom/yandex/metrica/e$a;

    .line 178
    :cond_3
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->crashReporting:Ljava/lang/Boolean;

    if-eqz v1, :cond_4

    move v1, v3

    goto :goto_2

    :cond_4
    move v1, v2

    :goto_2
    if-eqz v1, :cond_5

    .line 179
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->crashReporting:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->a(Z)Lcom/yandex/metrica/e$a;

    .line 181
    :cond_5
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->nativeCrashReporting:Ljava/lang/Boolean;

    if-eqz v1, :cond_6

    move v1, v3

    goto :goto_3

    :cond_6
    move v1, v2

    :goto_3
    if-eqz v1, :cond_7

    .line 182
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->nativeCrashReporting:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->b(Z)Lcom/yandex/metrica/e$a;

    .line 184
    :cond_7
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->location:Landroid/location/Location;

    if-eqz v1, :cond_8

    move v1, v3

    goto :goto_4

    :cond_8
    move v1, v2

    :goto_4
    if-eqz v1, :cond_9

    .line 185
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->location:Landroid/location/Location;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->a(Landroid/location/Location;)Lcom/yandex/metrica/e$a;

    .line 187
    :cond_9
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->locationTracking:Ljava/lang/Boolean;

    if-eqz v1, :cond_a

    move v1, v3

    goto :goto_5

    :cond_a
    move v1, v2

    :goto_5
    if-eqz v1, :cond_b

    .line 188
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->locationTracking:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->c(Z)Lcom/yandex/metrica/e$a;

    .line 190
    :cond_b
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->installedAppCollecting:Ljava/lang/Boolean;

    if-eqz v1, :cond_c

    move v1, v3

    goto :goto_6

    :cond_c
    move v1, v2

    :goto_6
    if-eqz v1, :cond_d

    .line 191
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->installedAppCollecting:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->d(Z)Lcom/yandex/metrica/e$a;

    .line 193
    :cond_d
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->logs:Ljava/lang/Boolean;

    if-eqz v1, :cond_e

    move v1, v3

    goto :goto_7

    :cond_e
    move v1, v2

    :goto_7
    if-eqz v1, :cond_f

    .line 194
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->logs:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_f

    .line 195
    invoke-virtual {v0}, Lcom/yandex/metrica/e$a;->a()Lcom/yandex/metrica/e$a;

    .line 198
    :cond_f
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->preloadInfo:Lcom/yandex/metrica/PreloadInfo;

    if-eqz v1, :cond_10

    move v1, v3

    goto :goto_8

    :cond_10
    move v1, v2

    :goto_8
    if-eqz v1, :cond_11

    .line 199
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->preloadInfo:Lcom/yandex/metrica/PreloadInfo;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->a(Lcom/yandex/metrica/PreloadInfo;)Lcom/yandex/metrica/e$a;

    .line 201
    :cond_11
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->firstActivationAsUpdate:Ljava/lang/Boolean;

    if-eqz v1, :cond_12

    move v1, v3

    goto :goto_9

    :cond_12
    move v1, v2

    :goto_9
    if-eqz v1, :cond_13

    .line 202
    iget-object v1, p0, Lcom/yandex/metrica/YandexMetricaConfig;->firstActivationAsUpdate:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->e(Z)Lcom/yandex/metrica/e$a;

    .line 11211
    :cond_13
    instance-of v1, p0, Lcom/yandex/metrica/e;

    if-eqz v1, :cond_15

    .line 11212
    check-cast p0, Lcom/yandex/metrica/e;

    .line 11213
    iget-object v1, p0, Lcom/yandex/metrica/e;->d:Ljava/util/List;

    if-eqz v1, :cond_14

    move v2, v3

    :cond_14
    if-eqz v2, :cond_15

    .line 11214
    iget-object p0, p0, Lcom/yandex/metrica/e;->d:Ljava/util/List;

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/e$a;->a(Ljava/util/List;)Lcom/yandex/metrica/e$a;

    :cond_15
    return-object v0
.end method

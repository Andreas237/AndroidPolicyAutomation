.class public Lcom/yandex/metrica/impl/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ae;


# instance fields
.field private a:Landroid/location/Location;

.field private b:Ljava/lang/Boolean;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/n;->c:Ljava/util/Map;

    .line 33
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/n;->d:Ljava/util/Map;

    return-void
.end method

.method private static a(Ljava/util/Map;Lcom/yandex/metrica/e$a;)V
    .locals 2
    .param p0    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Lcom/yandex/metrica/e$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/yandex/metrica/e$a;",
            ")V"
        }
    .end annotation

    .line 159
    invoke-static {p0}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Map;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 160
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 161
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/e$a;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/e$a;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static b(Ljava/util/Map;Lcom/yandex/metrica/e$a;)V
    .locals 2
    .param p0    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Lcom/yandex/metrica/e$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/yandex/metrica/e$a;",
            ")V"
        }
    .end annotation

    .line 168
    invoke-static {p0}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Map;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 169
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 170
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/e$a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/e$a;

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Landroid/location/Location;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/yandex/metrica/impl/n;->a:Landroid/location/Location;

    return-object v0
.end method

.method public a(Lcom/yandex/metrica/e;)Lcom/yandex/metrica/e;
    .locals 5

    .line 87
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/n;->f:Z

    if-eqz v0, :cond_0

    return-object p1

    .line 1100
    :cond_0
    iget-object v0, p1, Lcom/yandex/metrica/e;->apiKey:Ljava/lang/String;

    invoke-static {v0}, Lcom/yandex/metrica/e;->a(Ljava/lang/String;)Lcom/yandex/metrica/e$a;

    move-result-object v0

    .line 1101
    iget-object v1, p1, Lcom/yandex/metrica/e;->b:Ljava/util/Map;

    iget-object v2, p1, Lcom/yandex/metrica/e;->j:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/e$a;->a(Ljava/util/Map;Ljava/lang/Boolean;)Lcom/yandex/metrica/e$a;

    .line 1102
    iget-object v1, p1, Lcom/yandex/metrica/e;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->c(Ljava/lang/String;)Lcom/yandex/metrica/e$a;

    .line 1103
    iget-object v1, p1, Lcom/yandex/metrica/e;->preloadInfo:Lcom/yandex/metrica/PreloadInfo;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->a(Lcom/yandex/metrica/PreloadInfo;)Lcom/yandex/metrica/e$a;

    .line 1104
    iget-object v1, p1, Lcom/yandex/metrica/e;->location:Landroid/location/Location;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->a(Landroid/location/Location;)Lcom/yandex/metrica/e$a;

    .line 1116
    iget-object v1, p1, Lcom/yandex/metrica/e;->d:Ljava/util/List;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    if-eqz v1, :cond_2

    .line 1117
    iget-object v1, p1, Lcom/yandex/metrica/e;->d:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->a(Ljava/util/List;)Lcom/yandex/metrica/e$a;

    .line 1119
    :cond_2
    iget-object v1, p1, Lcom/yandex/metrica/e;->appVersion:Ljava/lang/String;

    if-eqz v1, :cond_3

    move v1, v3

    goto :goto_1

    :cond_3
    move v1, v2

    :goto_1
    if-eqz v1, :cond_4

    .line 1120
    iget-object v1, p1, Lcom/yandex/metrica/e;->appVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->a(Ljava/lang/String;)Lcom/yandex/metrica/e$a;

    .line 1122
    :cond_4
    iget-object v1, p1, Lcom/yandex/metrica/e;->f:Ljava/lang/Integer;

    if-eqz v1, :cond_5

    move v1, v3

    goto :goto_2

    :cond_5
    move v1, v2

    :goto_2
    if-eqz v1, :cond_6

    .line 1123
    iget-object v1, p1, Lcom/yandex/metrica/e;->f:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->d(I)Lcom/yandex/metrica/e$a;

    .line 1125
    :cond_6
    iget-object v1, p1, Lcom/yandex/metrica/e;->e:Ljava/lang/Integer;

    if-eqz v1, :cond_7

    move v1, v3

    goto :goto_3

    :cond_7
    move v1, v2

    :goto_3
    if-eqz v1, :cond_8

    .line 1126
    iget-object v1, p1, Lcom/yandex/metrica/e;->e:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->b(I)Lcom/yandex/metrica/e$a;

    .line 1128
    :cond_8
    iget-object v1, p1, Lcom/yandex/metrica/e;->g:Ljava/lang/Integer;

    if-eqz v1, :cond_9

    move v1, v3

    goto :goto_4

    :cond_9
    move v1, v2

    :goto_4
    if-eqz v1, :cond_a

    .line 1129
    iget-object v1, p1, Lcom/yandex/metrica/e;->g:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->c(I)Lcom/yandex/metrica/e$a;

    .line 1131
    :cond_a
    iget-object v1, p1, Lcom/yandex/metrica/e;->logs:Ljava/lang/Boolean;

    if-eqz v1, :cond_b

    move v1, v3

    goto :goto_5

    :cond_b
    move v1, v2

    :goto_5
    if-eqz v1, :cond_c

    iget-object v1, p1, Lcom/yandex/metrica/e;->logs:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_c

    .line 1132
    invoke-virtual {v0}, Lcom/yandex/metrica/e$a;->a()Lcom/yandex/metrica/e$a;

    .line 1134
    :cond_c
    iget-object v1, p1, Lcom/yandex/metrica/e;->sessionTimeout:Ljava/lang/Integer;

    if-eqz v1, :cond_d

    move v1, v3

    goto :goto_6

    :cond_d
    move v1, v2

    :goto_6
    if-eqz v1, :cond_e

    .line 1135
    iget-object v1, p1, Lcom/yandex/metrica/e;->sessionTimeout:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->a(I)Lcom/yandex/metrica/e$a;

    .line 1137
    :cond_e
    iget-object v1, p1, Lcom/yandex/metrica/e;->crashReporting:Ljava/lang/Boolean;

    if-eqz v1, :cond_f

    move v1, v3

    goto :goto_7

    :cond_f
    move v1, v2

    :goto_7
    if-eqz v1, :cond_10

    .line 1138
    iget-object v1, p1, Lcom/yandex/metrica/e;->crashReporting:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->a(Z)Lcom/yandex/metrica/e$a;

    .line 1140
    :cond_10
    iget-object v1, p1, Lcom/yandex/metrica/e;->nativeCrashReporting:Ljava/lang/Boolean;

    if-eqz v1, :cond_11

    move v1, v3

    goto :goto_8

    :cond_11
    move v1, v2

    :goto_8
    if-eqz v1, :cond_12

    .line 1141
    iget-object v1, p1, Lcom/yandex/metrica/e;->nativeCrashReporting:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->b(Z)Lcom/yandex/metrica/e$a;

    .line 1143
    :cond_12
    iget-object v1, p1, Lcom/yandex/metrica/e;->locationTracking:Ljava/lang/Boolean;

    if-eqz v1, :cond_13

    move v1, v3

    goto :goto_9

    :cond_13
    move v1, v2

    :goto_9
    if-eqz v1, :cond_14

    .line 1144
    iget-object v1, p1, Lcom/yandex/metrica/e;->locationTracking:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->c(Z)Lcom/yandex/metrica/e$a;

    .line 1146
    :cond_14
    iget-object v1, p1, Lcom/yandex/metrica/e;->installedAppCollecting:Ljava/lang/Boolean;

    if-eqz v1, :cond_15

    move v1, v3

    goto :goto_a

    :cond_15
    move v1, v2

    :goto_a
    if-eqz v1, :cond_16

    .line 1147
    iget-object v1, p1, Lcom/yandex/metrica/e;->installedAppCollecting:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->d(Z)Lcom/yandex/metrica/e$a;

    .line 1149
    :cond_16
    iget-object v1, p1, Lcom/yandex/metrica/e;->c:Ljava/lang/String;

    if-eqz v1, :cond_17

    move v1, v3

    goto :goto_b

    :cond_17
    move v1, v2

    :goto_b
    if-eqz v1, :cond_18

    .line 1150
    iget-object v1, p1, Lcom/yandex/metrica/e;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->b(Ljava/lang/String;)Lcom/yandex/metrica/e$a;

    .line 1152
    :cond_18
    iget-object v1, p1, Lcom/yandex/metrica/e;->firstActivationAsUpdate:Ljava/lang/Boolean;

    if-eqz v1, :cond_19

    move v1, v3

    goto :goto_c

    :cond_19
    move v1, v2

    :goto_c
    if-eqz v1, :cond_1a

    .line 1153
    iget-object v1, p1, Lcom/yandex/metrica/e;->firstActivationAsUpdate:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->e(Z)Lcom/yandex/metrica/e$a;

    .line 1106
    :cond_1a
    iget-object v1, p0, Lcom/yandex/metrica/impl/n;->c:Ljava/util/Map;

    invoke-static {v1, v0}, Lcom/yandex/metrica/impl/n;->a(Ljava/util/Map;Lcom/yandex/metrica/e$a;)V

    .line 1107
    iget-object v1, p1, Lcom/yandex/metrica/e;->i:Ljava/util/Map;

    invoke-static {v1, v0}, Lcom/yandex/metrica/impl/n;->a(Ljava/util/Map;Lcom/yandex/metrica/e$a;)V

    .line 1108
    iget-object v1, p0, Lcom/yandex/metrica/impl/n;->d:Ljava/util/Map;

    invoke-static {v1, v0}, Lcom/yandex/metrica/impl/n;->b(Ljava/util/Map;Lcom/yandex/metrica/e$a;)V

    .line 1109
    iget-object v1, p1, Lcom/yandex/metrica/e;->h:Ljava/util/Map;

    invoke-static {v1, v0}, Lcom/yandex/metrica/impl/n;->b(Ljava/util/Map;Lcom/yandex/metrica/e$a;)V

    .line 14177
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/n;->b()Ljava/lang/Boolean;

    move-result-object v1

    .line 14178
    iget-object v4, p1, Lcom/yandex/metrica/e;->locationTracking:Ljava/lang/Boolean;

    if-nez v4, :cond_1b

    move v4, v3

    goto :goto_d

    :cond_1b
    move v4, v2

    :goto_d
    if-eqz v4, :cond_1d

    if-eqz v1, :cond_1c

    move v4, v3

    goto :goto_e

    :cond_1c
    move v4, v2

    :goto_e
    if-eqz v4, :cond_1d

    .line 14179
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->c(Z)Lcom/yandex/metrica/e$a;

    .line 14181
    :cond_1d
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/n;->a()Landroid/location/Location;

    move-result-object v1

    .line 14182
    iget-object p1, p1, Lcom/yandex/metrica/e;->location:Landroid/location/Location;

    if-nez p1, :cond_1e

    move p1, v3

    goto :goto_f

    :cond_1e
    move p1, v2

    :goto_f
    if-eqz p1, :cond_20

    if-eqz v1, :cond_1f

    move p1, v3

    goto :goto_10

    :cond_1f
    move p1, v2

    :goto_10
    if-eqz p1, :cond_20

    .line 14183
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/e$a;->a(Landroid/location/Location;)Lcom/yandex/metrica/e$a;

    .line 93
    :cond_20
    iput-boolean v3, p0, Lcom/yandex/metrica/impl/n;->f:Z

    const/4 p1, 0x0

    .line 16078
    iput-object p1, p0, Lcom/yandex/metrica/impl/n;->a:Landroid/location/Location;

    .line 16079
    iput-object p1, p0, Lcom/yandex/metrica/impl/n;->b:Ljava/lang/Boolean;

    .line 16080
    iget-object p1, p0, Lcom/yandex/metrica/impl/n;->c:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 16081
    iget-object p1, p0, Lcom/yandex/metrica/impl/n;->d:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 16083
    iput-boolean v2, p0, Lcom/yandex/metrica/impl/n;->e:Z

    .line 95
    invoke-virtual {v0}, Lcom/yandex/metrica/e$a;->b()Lcom/yandex/metrica/e;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/location/Location;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/yandex/metrica/impl/n;->a:Landroid/location/Location;

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 49
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/n;->b:Ljava/lang/Boolean;

    return-void
.end method

.method public b()Ljava/lang/Boolean;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/yandex/metrica/impl/n;->b:Ljava/lang/Boolean;

    return-object v0
.end method

.method public c()Z
    .locals 1

    .line 69
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/n;->e:Z

    return v0
.end method

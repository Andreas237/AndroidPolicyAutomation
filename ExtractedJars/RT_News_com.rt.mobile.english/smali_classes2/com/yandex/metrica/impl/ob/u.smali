.class public Lcom/yandex/metrica/impl/ob/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# instance fields
.field private final b:Landroid/content/ContentValues;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/ob/u;->a:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/ContentValues;)V
    .locals 0
    .param p1    # Landroid/content/ContentValues;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 76
    new-instance p1, Landroid/content/ContentValues;

    invoke-direct {p1}, Landroid/content/ContentValues;-><init>()V

    :cond_0
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/u;->b:Landroid/content/ContentValues;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/u;->b:Landroid/content/ContentValues;

    .line 69
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/u;->b:Landroid/content/ContentValues;

    const-string v1, "PROCESS_CFG_PROCESS_ID"

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 70
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/u;->b:Landroid/content/ContentValues;

    const-string v1, "PROCESS_CFG_PROCESS_SESSION_ID"

    sget-object v2, Lcom/yandex/metrica/impl/ob/u;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/u;->b:Landroid/content/ContentValues;

    const-string v1, "PROCESS_CFG_SDK_API_LEVEL"

    const/16 v2, 0x43

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 72
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/u;->b:Landroid/content/ContentValues;

    const-string v1, "PROCESS_CFG_PACKAGE_NAME"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/os/Bundle;)Lcom/yandex/metrica/impl/ob/u;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    :try_start_0
    const-string v1, "CFG_KEY_PROCESS_ENVIRONMENT"

    .line 52
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p0

    check-cast p0, Landroid/content/ContentValues;

    if-nez p0, :cond_0

    return-object v0

    .line 56
    :cond_0
    new-instance v1, Lcom/yandex/metrica/impl/ob/u;

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/ob/u;-><init>(Landroid/content/ContentValues;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    return-object v0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/e;)V
    .locals 3
    .param p1    # Lcom/yandex/metrica/e;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_5

    .line 1088
    iget-object v0, p1, Lcom/yandex/metrica/e;->d:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 1089
    iget-object v0, p1, Lcom/yandex/metrica/e;->d:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/u;->a(Ljava/util/List;)V

    .line 2094
    :cond_1
    iget-object v0, p1, Lcom/yandex/metrica/e;->b:Ljava/util/Map;

    if-eqz v0, :cond_2

    move v0, v2

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    if-eqz v0, :cond_3

    .line 2095
    iget-object v0, p1, Lcom/yandex/metrica/e;->b:Ljava/util/Map;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/ly;->c(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/u;->a(Ljava/util/Map;)V

    .line 3100
    :cond_3
    iget-object v0, p1, Lcom/yandex/metrica/e;->c:Ljava/lang/String;

    if-eqz v0, :cond_4

    move v1, v2

    :cond_4
    if-eqz v1, :cond_5

    .line 3101
    iget-object p1, p1, Lcom/yandex/metrica/e;->c:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/u;->a(Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 136
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/u;->b:Landroid/content/ContentValues;

    const-string v1, "PROCESS_CFG_DISTRIBUTION_REFERRER"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 117
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/u;->b:Landroid/content/ContentValues;

    const-string v1, "PROCESS_CFG_CUSTOM_HOSTS"

    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/lp;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 2
    .param p1    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 127
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/u;->b:Landroid/content/ContentValues;

    const-string v1, "PROCESS_CFG_CLIDS"

    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/lp;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a()Z
    .locals 2

    .line 106
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/u;->b:Landroid/content/ContentValues;

    const-string v1, "PROCESS_CFG_CUSTOM_HOSTS"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public b()Ljava/util/List;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 111
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/u;->b:Landroid/content/ContentValues;

    const-string v1, "PROCESS_CFG_CUSTOM_HOSTS"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 112
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/lp;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "CFG_KEY_PROCESS_ENVIRONMENT"

    .line 159
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/u;->b:Landroid/content/ContentValues;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method public c()Ljava/util/Map;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 122
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/u;->b:Landroid/content/ContentValues;

    const-string v1, "PROCESS_CFG_CLIDS"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 123
    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/lp;->a(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 132
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/u;->b:Landroid/content/ContentValues;

    const-string v1, "PROCESS_CFG_DISTRIBUTION_REFERRER"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/Integer;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 141
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/u;->b:Landroid/content/ContentValues;

    const-string v1, "PROCESS_CFG_PROCESS_ID"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 146
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/u;->b:Landroid/content/ContentValues;

    const-string v1, "PROCESS_CFG_PROCESS_SESSION_ID"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()I
    .locals 2

    .line 150
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/u;->b:Landroid/content/ContentValues;

    const-string v1, "PROCESS_CFG_SDK_API_LEVEL"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 155
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/u;->b:Landroid/content/ContentValues;

    const-string v1, "PROCESS_CFG_PACKAGE_NAME"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 164
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ProcessConfiguration{mParamsMapping="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/u;->b:Landroid/content/ContentValues;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

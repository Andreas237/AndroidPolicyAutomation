.class public Lcom/yandex/metrica/impl/ob/dy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/dy$a;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private b:Lcom/yandex/metrica/impl/ob/eb;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private c:Landroid/content/pm/PackageManager;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/eb;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/eb;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 130
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/yandex/metrica/impl/ob/dy;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/eb;Landroid/content/pm/PackageManager;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/eb;Landroid/content/pm/PackageManager;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/eb;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/pm/PackageManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 188
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 189
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dy;->a:Landroid/content/Context;

    .line 190
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/dy;->b:Lcom/yandex/metrica/impl/ob/eb;

    .line 191
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/dy;->c:Landroid/content/pm/PackageManager;

    return-void
.end method

.method private static a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Z
    .locals 3
    .param p0    # Landroid/content/pm/PackageManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 177
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "com.yandex.metrica.configuration.ACTION_START"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    const/16 v1, 0x80

    .line 178
    invoke-virtual {p0, p1, v1}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p0

    const/4 p1, 0x1

    if-eqz p0, :cond_0

    .line 179
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    if-ne p0, p1, :cond_0

    move v0, p1

    :catch_0
    :cond_0
    return v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 6
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 138
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dy;->b:Lcom/yandex/metrica/impl/ob/eb;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/dy;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/eb;->a(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    .line 1159
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1160
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ResolveInfo;

    .line 1161
    iget-object v3, v2, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v3, v3, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 1162
    iget-object v4, v2, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v4, v4, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    const-string v5, "metrica:api:level"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    const/16 v5, 0x35

    if-lt v4, v5, :cond_0

    .line 1163
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/dy;->c:Landroid/content/pm/PackageManager;

    .line 1164
    invoke-static {v4, v3}, Lcom/yandex/metrica/impl/ob/dy;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1165
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/dy;->a:Landroid/content/Context;

    invoke-static {v4}, Lcom/yandex/metrica/impl/ob/ek;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/ek;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/yandex/metrica/impl/ob/ek;->a(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ej;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 1167
    new-instance v4, Lcom/yandex/metrica/impl/ob/dy$a;

    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/dy;->c:Landroid/content/pm/PackageManager;

    invoke-direct {v4, v5, v2, v3}, Lcom/yandex/metrica/impl/ob/dy$a;-><init>(Landroid/content/pm/PackageManager;Landroid/content/pm/ResolveInfo;Lcom/yandex/metrica/impl/ob/ej;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 142
    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 143
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 144
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/dy$a;

    .line 149
    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/dy$a;->b(Lcom/yandex/metrica/impl/ob/dy$a;)I

    move-result v1

    const/16 v2, 0x70

    if-lt v1, v2, :cond_2

    .line 150
    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/dy$a;->c(Lcom/yandex/metrica/impl/ob/dy$a;)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v0, v0, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

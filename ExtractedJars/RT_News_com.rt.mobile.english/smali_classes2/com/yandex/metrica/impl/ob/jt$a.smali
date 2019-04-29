.class public abstract Lcom/yandex/metrica/impl/ob/jt$a;
.super Lcom/yandex/metrica/impl/ob/jq$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40c
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/yandex/metrica/impl/ob/jt;",
        "A:",
        "Lcom/yandex/metrica/impl/ob/jq$a;",
        ">",
        "Lcom/yandex/metrica/impl/ob/jq$b<",
        "TT;TA;>;"
    }
.end annotation


# direct methods
.method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 45
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/jq$b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private static a(Landroid/content/pm/ApplicationInfo;)Ljava/lang/String;
    .locals 0
    .param p0    # Landroid/content/pm/ApplicationInfo;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 78
    iget p0, p0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_0

    const-string p0, "1"

    return-object p0

    :cond_0
    const-string p0, "0"

    return-object p0
.end method


# virtual methods
.method public synthetic a(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jq;
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/jq$c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 41
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jt$a;->c(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jt;

    move-result-object p1

    return-object p1
.end method

.method public synthetic a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/jq;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 41
    check-cast p1, Lcom/yandex/metrica/impl/ob/jq$c;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jt$a;->c(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jt;

    move-result-object p1

    return-object p1
.end method

.method b()Landroid/content/pm/ApplicationInfo;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/pm/PackageManager$NameNotFoundException;
        }
    .end annotation

    .line 73
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jt$a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jt$a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jt;
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/jq$c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/jq$c<",
            "TA;>;)TT;"
        }
    .end annotation

    .line 51
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/jq$b;->a(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jq;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/jt;

    .line 1058
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jt$a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 1060
    :try_start_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jt$a;->b()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/jt$a;->a(Landroid/content/pm/ApplicationInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/jt;->h(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1062
    :catch_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jt$a;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1063
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jt$a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/jt$a;->a(Landroid/content/pm/ApplicationInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/jt;->h(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "0"

    .line 1065
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/jt;->h(Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

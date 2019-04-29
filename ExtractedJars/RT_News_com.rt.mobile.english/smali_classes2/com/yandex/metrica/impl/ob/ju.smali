.class public Lcom/yandex/metrica/impl/ob/ju;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final b:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final c:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final d:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final e:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final f:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final g:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final h:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final i:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final j:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final k:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final l:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final m:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final n:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final o:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 65
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->a:Ljava/lang/String;

    .line 66
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->b:Ljava/lang/String;

    .line 67
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->c:Ljava/lang/String;

    .line 68
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->d:Ljava/lang/String;

    .line 69
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->e:Ljava/lang/String;

    .line 70
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->f:Ljava/lang/String;

    .line 71
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->g:Ljava/lang/String;

    .line 72
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->h:Ljava/lang/String;

    .line 73
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->i:Ljava/lang/String;

    .line 74
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->j:Ljava/lang/String;

    .line 75
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->k:Ljava/lang/String;

    .line 76
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->l:Ljava/lang/String;

    .line 77
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->m:Ljava/lang/String;

    .line 78
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->n:Ljava/lang/String;

    .line 79
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->o:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/yandex/metrica/impl/ob/lp$a;)V
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/ob/lp$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "dId"

    .line 38
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lp$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->a:Ljava/lang/String;

    const-string v0, "uId"

    .line 39
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lp$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->b:Ljava/lang/String;

    const-string v0, "kitVer"

    .line 40
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lp$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->c:Ljava/lang/String;

    const-string v0, "analyticsSdkVersionName"

    .line 42
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lp$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->d:Ljava/lang/String;

    const-string v0, "kitBuildNumber"

    .line 43
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lp$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->e:Ljava/lang/String;

    const-string v0, "kitBuildType"

    .line 44
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lp$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->f:Ljava/lang/String;

    const-string v0, "appVer"

    .line 45
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lp$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->g:Ljava/lang/String;

    const-string v0, "app_debuggable"

    const-string v1, "0"

    .line 46
    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/lp$a;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->h:Ljava/lang/String;

    const-string v0, "appBuild"

    .line 47
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lp$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->i:Ljava/lang/String;

    const-string v0, "osVer"

    .line 48
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lp$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->j:Ljava/lang/String;

    const-string v0, "lang"

    .line 49
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lp$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->l:Ljava/lang/String;

    const-string v0, "root"

    .line 50
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lp$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->m:Ljava/lang/String;

    const-string v0, "app_framework"

    .line 53
    invoke-static {}, Lcom/yandex/metrica/impl/bj;->b()Ljava/lang/String;

    move-result-object v1

    .line 51
    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/lp$a;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->n:Ljava/lang/String;

    const-string v0, "osApiLev"

    const/4 v1, -0x1

    .line 58
    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/lp$a;->optInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    move-object v0, v2

    goto :goto_0

    .line 59
    :cond_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ju;->k:Ljava/lang/String;

    const-string v0, "attribution_id"

    const/4 v1, 0x0

    .line 60
    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/lp$a;->optInt(Ljava/lang/String;I)I

    move-result p1

    if-lez p1, :cond_1

    .line 61
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    :cond_1
    iput-object v2, p0, Lcom/yandex/metrica/impl/ob/ju;->o:Ljava/lang/String;

    return-void
.end method

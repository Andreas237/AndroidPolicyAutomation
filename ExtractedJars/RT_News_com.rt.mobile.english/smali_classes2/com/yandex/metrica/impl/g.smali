.class public Lcom/yandex/metrica/impl/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/g$a;
    }
.end annotation


# static fields
.field private static final j:Ljava/lang/Object;

.field private static volatile k:Lcom/yandex/metrica/impl/g;


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:Lcom/yandex/metrica/impl/g$a;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field public final g:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field public final h:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field public final i:Ljava/util/List;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private l:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private m:Lcom/yandex/metrica/impl/ob/ks;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 51
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/yandex/metrica/impl/g;->j:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v0

    const-class v1, Lcom/yandex/metrica/impl/ob/r;

    new-instance v2, Lcom/yandex/metrica/impl/g$1;

    invoke-direct {v2, p0}, Lcom/yandex/metrica/impl/g$1;-><init>(Lcom/yandex/metrica/impl/g;)V

    .line 81
    invoke-static {v2}, Lcom/yandex/metrica/impl/ob/l;->a(Lcom/yandex/metrica/impl/ob/k;)Lcom/yandex/metrica/impl/ob/l$a;

    move-result-object v2

    .line 87
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/l$a;->a()Lcom/yandex/metrica/impl/ob/l;

    move-result-object v2

    .line 79
    invoke-virtual {v0, p0, v1, v2}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;Ljava/lang/Class;Lcom/yandex/metrica/impl/ob/l;)V

    const-string v0, "android"

    .line 89
    iput-object v0, p0, Lcom/yandex/metrica/impl/g;->a:Ljava/lang/String;

    .line 90
    invoke-direct {p0}, Lcom/yandex/metrica/impl/g;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/yandex/metrica/impl/g;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/yandex/metrica/impl/g;->l:Ljava/lang/String;

    .line 91
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v0

    new-instance v1, Lcom/yandex/metrica/impl/ob/n;

    iget-object v2, p0, Lcom/yandex/metrica/impl/g;->l:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/n;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/h;->b(Lcom/yandex/metrica/impl/ob/j;)V

    .line 93
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/impl/g;->b:Ljava/lang/String;

    .line 94
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/impl/g;->c:Ljava/lang/String;

    .line 95
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/impl/g;->d:Ljava/lang/String;

    .line 96
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iput v0, p0, Lcom/yandex/metrica/impl/g;->e:I

    .line 98
    new-instance v0, Lcom/yandex/metrica/impl/g$a;

    invoke-static {p1}, Lcom/yandex/metrica/impl/as;->b(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v1

    .line 99
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 100
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    invoke-direct {v0, v1, v2, v3}, Lcom/yandex/metrica/impl/g$a;-><init>(Landroid/graphics/Point;IF)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/g;->f:Lcom/yandex/metrica/impl/g$a;

    .line 103
    invoke-static {p1}, Lcom/yandex/metrica/impl/as;->a(Landroid/content/Context;)Lcom/yandex/metrica/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/a;->name()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/g;->g:Ljava/lang/String;

    .line 104
    invoke-static {}, Lcom/yandex/metrica/impl/as$b;->c()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/g;->h:Ljava/lang/String;

    .line 105
    new-instance p1, Lcom/yandex/metrica/impl/g$2;

    invoke-direct {p1}, Lcom/yandex/metrica/impl/g$2;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/g;->i:Ljava/util/List;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/yandex/metrica/impl/g;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 66
    sget-object v0, Lcom/yandex/metrica/impl/g;->k:Lcom/yandex/metrica/impl/g;

    if-nez v0, :cond_1

    .line 67
    sget-object v0, Lcom/yandex/metrica/impl/g;->j:Ljava/lang/Object;

    monitor-enter v0

    .line 68
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/g;->k:Lcom/yandex/metrica/impl/g;

    if-nez v1, :cond_0

    .line 69
    new-instance v1, Lcom/yandex/metrica/impl/g;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/g;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/yandex/metrica/impl/g;->k:Lcom/yandex/metrica/impl/g;

    .line 71
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 73
    :cond_1
    :goto_0
    sget-object p0, Lcom/yandex/metrica/impl/g;->k:Lcom/yandex/metrica/impl/g;

    return-object p0
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/g;Lcom/yandex/metrica/impl/ob/ks;)Lcom/yandex/metrica/impl/ob/ks;
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/yandex/metrica/impl/g;->m:Lcom/yandex/metrica/impl/ob/ks;

    return-object p1
.end method

.method private declared-synchronized a()Z
    .locals 1

    monitor-enter p0

    .line 132
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/g;->m:Lcom/yandex/metrica/impl/ob/ks;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/g;->m:Lcom/yandex/metrica/impl/ob/ks;

    iget-object v0, v0, Lcom/yandex/metrica/impl/ob/ks;->k:Lcom/yandex/metrica/impl/ob/kh;

    iget-boolean v0, v0, Lcom/yandex/metrica/impl/ob/kh;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HardwareIds"
        }
    .end annotation

    .line 119
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string v0, "android_id"

    invoke-static {p0, v0}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b(Landroid/content/Context;)Ljava/lang/String;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 123
    iget-object v0, p0, Lcom/yandex/metrica/impl/g;->l:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 124
    invoke-direct {p0}, Lcom/yandex/metrica/impl/g;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    invoke-static {p1}, Lcom/yandex/metrica/impl/g;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/g;->l:Ljava/lang/String;

    .line 128
    :cond_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/g;->l:Ljava/lang/String;

    return-object p1
.end method

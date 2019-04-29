.class public Lcom/yandex/metrica/impl/ob/ek;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/ek$a;
    }
.end annotation


# static fields
.field private static volatile a:Lcom/yandex/metrica/impl/ob/ek;

.field private static final b:Ljava/lang/Object;


# instance fields
.field private c:Lcom/yandex/metrica/impl/ob/el;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private d:Lcom/yandex/metrica/impl/ob/ek$a;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 67
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ek;->b:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 89
    new-instance v0, Lcom/yandex/metrica/impl/ob/el;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/el;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/ob/ek;-><init>(Lcom/yandex/metrica/impl/ob/el;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/el;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/el;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ek;->c:Lcom/yandex/metrica/impl/ob/el;

    .line 111
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ek;->c:Lcom/yandex/metrica/impl/ob/el;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/el;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 115
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 116
    new-instance p1, Lcom/yandex/metrica/impl/ob/ek$a;

    invoke-direct {p1, v1}, Lcom/yandex/metrica/impl/ob/ek$a;-><init>(Lorg/json/JSONArray;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_1

    .line 122
    new-instance p1, Lcom/yandex/metrica/impl/ob/ek$a;

    invoke-direct {p1}, Lcom/yandex/metrica/impl/ob/ek$a;-><init>()V

    .line 124
    :cond_1
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ek;->d:Lcom/yandex/metrica/impl/ob/ek$a;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/ek;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 72
    sget-object v0, Lcom/yandex/metrica/impl/ob/ek;->a:Lcom/yandex/metrica/impl/ob/ek;

    if-nez v0, :cond_1

    .line 73
    sget-object v0, Lcom/yandex/metrica/impl/ob/ek;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 74
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/ob/ek;->a:Lcom/yandex/metrica/impl/ob/ek;

    if-nez v1, :cond_0

    .line 75
    new-instance v1, Lcom/yandex/metrica/impl/ob/ek;

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/ob/ek;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/yandex/metrica/impl/ob/ek;->a:Lcom/yandex/metrica/impl/ob/ek;

    .line 77
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 79
    :cond_1
    :goto_0
    sget-object p0, Lcom/yandex/metrica/impl/ob/ek;->a:Lcom/yandex/metrica/impl/ob/ek;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ej;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 99
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ek;->d:Lcom/yandex/metrica/impl/ob/ek$a;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/ek$a;->a(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ej;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/ej;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/ej;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 93
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ek;->d:Lcom/yandex/metrica/impl/ob/ek$a;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/ek$a;->a(Lcom/yandex/metrica/impl/ob/ej;)V

    .line 1103
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ek;->d:Lcom/yandex/metrica/impl/ob/ek$a;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ek$a;->a()Lorg/json/JSONArray;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1105
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ek;->c:Lcom/yandex/metrica/impl/ob/el;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/el;->a(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/el;

    return-void
.end method

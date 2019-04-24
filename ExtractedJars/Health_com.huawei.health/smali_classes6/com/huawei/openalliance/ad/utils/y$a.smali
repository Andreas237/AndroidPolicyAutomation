.class Lcom/huawei/openalliance/ad/utils/y$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/utils/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static final c:[B

.field private static d:Lcom/huawei/openalliance/ad/utils/y$a;


# instance fields
.field private a:Landroid/content/SharedPreferences;

.field private final b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/openalliance/ad/utils/y$a;->c:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/utils/y$a;->b:[B

    const-string v0, "hiad_sp_story_book_file"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/utils/y$a;->a:Landroid/content/SharedPreferences;

    return-void
.end method

.method static a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/utils/y$a;
    .locals 3

    sget-object v1, Lcom/huawei/openalliance/ad/utils/y$a;->c:[B

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/utils/y$a;->d:Lcom/huawei/openalliance/ad/utils/y$a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/utils/y$a;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/utils/y$a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/openalliance/ad/utils/y$a;->d:Lcom/huawei/openalliance/ad/utils/y$a;

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/utils/y$a;->d:Lcom/huawei/openalliance/ad/utils/y$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method a()Ljava/lang/String;
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/utils/y$a;->b:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/y$a;->a:Landroid/content/SharedPreferences;

    const-string v1, "get_a_book"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v3

    return-object v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method a(Ljava/lang/String;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ApplySharedPref"
        }
    .end annotation

    iget-object v1, p0, Lcom/huawei/openalliance/ad/utils/y$a;->b:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/y$a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v0, "get_a_book"

    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    :goto_0
    return-void
.end method

.method b()Ljava/lang/String;
    .locals 6

    iget-object v3, p0, Lcom/huawei/openalliance/ad/utils/y$a;->b:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/y$a;->a:Landroid/content/SharedPreferences;

    const-string v1, "catch_a_cat"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/y;->b()[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/l;->a([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/huawei/openalliance/ad/utils/y$a;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v3

    return-object v4

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5
.end method

.method b(Ljava/lang/String;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ApplySharedPref"
        }
    .end annotation

    iget-object v1, p0, Lcom/huawei/openalliance/ad/utils/y$a;->b:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/y$a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v0, "catch_a_cat"

    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    :goto_0
    return-void
.end method

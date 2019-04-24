.class public final Lcom/huawei/hwid/b/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwid/b/b;


# static fields
.field private static a:Lcom/huawei/hwid/b/a/a;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/huawei/hwid/core/datatype/HwAccount;Ljava/lang/String;)Z
    .locals 2

    .line 311
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    invoke-virtual {p2}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 312
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Lcom/huawei/hwid/core/datatype/HwAccount;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 313
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 315
    :cond_1
    const-string v0, "SDKAccountManager"

    const-string v1, "account inValid"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    const/4 v0, 0x0

    return v0
.end method

.method public static declared-synchronized b(Landroid/content/Context;)Lcom/huawei/hwid/b/a/a;
    .locals 3

    const-class v2, Lcom/huawei/hwid/b/a/a;

    monitor-enter v2

    .line 40
    :try_start_0
    sget-object v0, Lcom/huawei/hwid/b/a/a;->a:Lcom/huawei/hwid/b/a/a;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 42
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b/e;->a(Landroid/content/Context;)V

    .line 43
    new-instance v0, Lcom/huawei/hwid/b/a/a;

    invoke-direct {v0}, Lcom/huawei/hwid/b/a/a;-><init>()V

    sput-object v0, Lcom/huawei/hwid/b/a/a;->a:Lcom/huawei/hwid/b/a/a;

    .line 44
    sget-object v0, Lcom/huawei/hwid/b/a/a;->a:Lcom/huawei/hwid/b/a/a;

    invoke-direct {v0, p0}, Lcom/huawei/hwid/b/a/a;->c(Landroid/content/Context;)V

    .line 46
    :cond_0
    sget-object v0, Lcom/huawei/hwid/b/a/a;->a:Lcom/huawei/hwid/b/a/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method private c(Landroid/content/Context;)V
    .locals 2

    .line 50
    const-string v0, "SDKAccountManager"

    const-string v1, "init SDKAccountManager"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    invoke-static {p1}, Lcom/huawei/hwid/core/encrypt/e;->a(Landroid/content/Context;)V

    .line 53
    invoke-static {p1}, Lcom/huawei/hwid/core/d/a/c;->a(Landroid/content/Context;)V

    .line 54
    return-void
.end method

.method private d(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)Ljava/util/ArrayList<Lcom/huawei/hwid/core/datatype/HwAccount;>;"
        }
    .end annotation

    .line 431
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 432
    invoke-static {p1}, Lcom/huawei/hwid/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/c/a;->b()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v3

    .line 433
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 434
    const-string v0, "SDKAccountManager"

    const-string v1, "MemCache has no account,prase from file"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 435
    const-string v0, "accounts.xml"

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lcom/huawei/hwid/b/a/b;->a(Ljava/lang/String;Landroid/content/Context;Z)Ljava/util/ArrayList;

    move-result-object v2

    .line 437
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 438
    invoke-static {p1}, Lcom/huawei/hwid/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/c/a;->a(Lcom/huawei/hwid/core/datatype/HwAccount;)V

    goto :goto_0

    .line 441
    :cond_0
    const-string v0, "SDKAccountManager"

    const-string v1, "use memcache account"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 442
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 445
    :cond_1
    :goto_0
    return-object v2
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hwid/core/datatype/HwAccount;
    .locals 7

    .line 289
    invoke-direct {p0, p1}, Lcom/huawei/hwid/b/a/a;->d(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v2

    .line 290
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 291
    :cond_0
    const-string v0, "SDKAccountManager"

    const-string v1, "there has no account"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    const/4 v0, 0x0

    return-object v0

    .line 297
    :cond_1
    move-object v3, v2

    monitor-enter v3

    .line 298
    :try_start_0
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwid/core/datatype/HwAccount;

    .line 299
    invoke-direct {p0, p2, v5, p3}, Lcom/huawei/hwid/b/a/a;->a(Ljava/lang/String;Lcom/huawei/hwid/core/datatype/HwAccount;Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_2

    .line 300
    monitor-exit v3

    return-object v5

    .line 302
    :cond_2
    goto :goto_0

    .line 303
    :cond_3
    monitor-exit v3

    const/4 v0, 0x0

    return-object v0

    .line 304
    :catchall_0
    move-exception v6

    monitor-exit v3

    throw v6
.end method

.method public a(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)Ljava/util/ArrayList<Lcom/huawei/hwid/core/datatype/HwAccount;>;"
        }
    .end annotation

    .line 121
    const-string v0, "SDKAccountManager"

    const-string v1, "MemCache has no account,prase from file"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    const-string v0, "accounts.xml"

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lcom/huawei/hwid/b/a/b;->a(Ljava/lang/String;Landroid/content/Context;Z)Ljava/util/ArrayList;

    move-result-object v2

    .line 123
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 124
    invoke-static {p1}, Lcom/huawei/hwid/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/c/a;->a(Lcom/huawei/hwid/core/datatype/HwAccount;)V

    .line 127
    :cond_0
    return-object v2
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/ArrayList<Lcom/huawei/hwid/core/datatype/HwAccount;>;"
        }
    .end annotation

    .line 97
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 98
    invoke-direct {p0, p1}, Lcom/huawei/hwid/b/a/a;->d(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v2

    .line 99
    move-object v3, v2

    monitor-enter v3

    .line 100
    :try_start_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 101
    :cond_0
    monitor-exit v3

    return-object v1

    .line 103
    :cond_1
    :try_start_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwid/core/datatype/HwAccount;

    .line 104
    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    invoke-virtual {v5}, Lcom/huawei/hwid/core/datatype/HwAccount;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 105
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    :cond_2
    goto :goto_0

    .line 108
    :cond_3
    monitor-exit v3

    return-object v1

    .line 109
    :catchall_0
    move-exception v6

    monitor-exit v3

    throw v6
.end method

.method public a(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/HwAccount;)Z
    .locals 5

    .line 78
    invoke-static {p2}, Lcom/huawei/hwid/core/d/b;->a(Lcom/huawei/hwid/core/datatype/HwAccount;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 79
    const-string v0, "SDKAccountManager"

    const-string v1, "the account is invalid , cannot be added into file"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    const/4 v0, 0x0

    return v0

    .line 82
    :cond_0
    invoke-static {p1}, Lcom/huawei/hwid/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/huawei/hwid/c/a;->a(Lcom/huawei/hwid/core/datatype/HwAccount;)V

    .line 83
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 84
    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    new-instance v0, Lcom/huawei/hwid/b;

    invoke-static {}, Lcom/huawei/hwid/d;->a()Lcom/huawei/hwid/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hwid/b;-><init>(Lcom/huawei/hwid/c;)V

    new-instance v1, Lcom/huawei/hwid/usecase/WriteHwAccountUseCase;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v4, v2}, Lcom/huawei/hwid/usecase/WriteHwAccountUseCase;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Z)V

    new-instance v2, Lcom/huawei/hwid/usecase/WriteHwAccountUseCase$RequestValues;

    .line 86
    invoke-virtual {p2}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/huawei/hwid/usecase/WriteHwAccountUseCase$RequestValues;-><init>(Ljava/lang/String;)V

    .line 85
    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwid/b;->a(Lcom/huawei/hwid/UseCase;Lcom/huawei/hwid/UseCase$RequestValues;Lcom/huawei/hwid/UseCase$a;)V

    .line 88
    const/4 v0, 0x1

    return v0
.end method

.method public b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 355
    invoke-static {p1}, Lcom/huawei/hwid/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/c/a;->a(Lcom/huawei/hwid/core/datatype/HwAccount;)V

    .line 356
    invoke-static {p1}, Lcom/huawei/hwid/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/c/a;->c()V

    .line 357
    new-instance v0, Lcom/huawei/hwid/b;

    invoke-static {}, Lcom/huawei/hwid/d;->a()Lcom/huawei/hwid/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hwid/b;-><init>(Lcom/huawei/hwid/c;)V

    new-instance v1, Lcom/huawei/hwid/usecase/ClearDataUseCase;

    invoke-direct {v1, p1}, Lcom/huawei/hwid/usecase/ClearDataUseCase;-><init>(Landroid/content/Context;)V

    new-instance v2, Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues;

    invoke-direct {v2}, Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwid/b;->a(Lcom/huawei/hwid/UseCase;Lcom/huawei/hwid/UseCase$RequestValues;Lcom/huawei/hwid/UseCase$a;)V

    .line 359
    return-void
.end method

.method public c(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 7

    .line 268
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 269
    invoke-static {p1}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v1

    .line 270
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v1, v0}, Landroid/accounts/AccountManager;->getAccountsByType(Ljava/lang/String;)[Landroid/accounts/Account;

    move-result-object v2

    .line 271
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    array-length v0, v2

    if-lez v0, :cond_1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 272
    move-object v3, v2

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    .line 273
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    iget-object v0, v6, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 274
    const/4 v0, 0x1

    return v0

    .line 272
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 278
    :cond_1
    goto :goto_1

    .line 279
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 281
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

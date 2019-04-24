.class Lo/bvi$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bwu$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bvi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private d:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 197
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 193
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/bvi$a;->d:Ljava/util/LinkedList;

    .line 198
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/bvi$a;->a:Landroid/content/Context;

    .line 199
    invoke-direct {p0}, Lo/bvi$a;->e()V

    .line 200
    return-void
.end method

.method private declared-synchronized c()Ljava/util/LinkedList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/LinkedList<Ljava/lang/String;>;"
        }
    .end annotation

    monitor-enter p0

    .line 208
    :try_start_0
    iget-object v0, p0, Lo/bvi$a;->d:Ljava/util/LinkedList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method private declared-synchronized d(Ljava/lang/String;)V
    .locals 5

    monitor-enter p0

    .line 228
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 229
    monitor-exit p0

    return-void

    .line 231
    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lo/bvi$a;->d:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-ge v3, v0, :cond_3

    .line 233
    if-nez v3, :cond_1

    .line 234
    iget-object v0, p0, Lo/bvi$a;->d:Ljava/util/LinkedList;

    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 235
    monitor-exit p0

    return-void

    .line 239
    :cond_1
    iget-object v0, p0, Lo/bvi$a;->d:Ljava/util/LinkedList;

    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 240
    iget-object v0, p0, Lo/bvi$a;->d:Ljava/util/LinkedList;

    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    .line 241
    goto :goto_1

    .line 231
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 245
    :cond_3
    :goto_1
    iget-object v0, p0, Lo/bvi$a;->d:Ljava/util/LinkedList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ljava/util/LinkedList;->add(ILjava/lang/Object;)V

    .line 246
    new-instance v3, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 247
    const/4 v4, 0x0

    :goto_2
    iget-object v0, p0, Lo/bvi$a;->d:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-ge v4, v0, :cond_4

    const/16 v0, 0xa

    if-ge v4, v0, :cond_4

    .line 248
    iget-object v0, p0, Lo/bvi$a;->d:Ljava/util/LinkedList;

    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 247
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 250
    :cond_4
    iget-object v0, p0, Lo/bvi$a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.health.suggestion.ui.fragment.SearchAllFowAdapter"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 251
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "flow_layout_key"

    invoke-static {v3}, Lo/cae;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 252
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized e()V
    .locals 7

    monitor-enter p0

    .line 217
    :try_start_0
    iget-object v0, p0, Lo/bvi$a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.health.suggestion.ui.fragment.SearchAllFowAdapter"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 218
    const-string v0, "flow_layout_key"

    const/4 v1, 0x0

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 219
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 220
    const-class v0, [Ljava/lang/String;

    invoke-static {v4, v0}, Lo/cae;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v5

    .line 221
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 222
    iget-object v0, p0, Lo/bvi$a;->d:Ljava/util/LinkedList;

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 225
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    .line 213
    invoke-direct {p0, p1}, Lo/bvi$a;->d(Ljava/lang/String;)V

    .line 214
    return-void
.end method

.method public d()Ljava/util/LinkedList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/LinkedList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 204
    invoke-direct {p0}, Lo/bvi$a;->c()Ljava/util/LinkedList;

    move-result-object v0

    return-object v0
.end method

.class public final Lo/aza;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bip;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aza$c;
    }
.end annotation


# static fields
.field private static final a:Lo/aza;


# instance fields
.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/aza$c;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 77
    new-instance v0, Lo/aza;

    invoke-direct {v0}, Lo/aza;-><init>()V

    sput-object v0, Lo/aza;->a:Lo/aza;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/aza;->d:Ljava/util/List;

    .line 89
    return-void
.end method

.method private a(Landroid/app/Activity;Z)V
    .locals 3

    .line 299
    if-eqz p2, :cond_0

    .line 301
    new-instance v2, Landroid/content/Intent;

    const-string v0, "action_clear_search"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 302
    const-string v0, "refresh_searchView"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 303
    const-string v0, "messageTab"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 304
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 307
    :cond_0
    const-string v0, "activity"

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/app/ActivityManager;

    .line 308
    invoke-virtual {p1}, Landroid/app/Activity;->getTaskId()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/app/ActivityManager;->moveTaskToFront(II)V

    .line 309
    return-void
.end method

.method public static b()Lo/aza;
    .locals 1

    .line 81
    sget-object v0, Lo/aza;->a:Lo/aza;

    return-object v0
.end method

.method private c(Landroid/app/Activity;I)V
    .locals 7

    .line 96
    const/4 v1, 0x0

    .line 97
    new-instance v2, Lo/aza$c;

    invoke-direct {v2, p1, p2}, Lo/aza$c;-><init>(Landroid/app/Activity;I)V

    .line 98
    iget-object v3, p0, Lo/aza;->d:Ljava/util/List;

    monitor-enter v3

    .line 100
    :try_start_0
    iget-object v0, p0, Lo/aza;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/aza$c;

    .line 102
    invoke-virtual {v5, v2}, Lo/aza$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    iget v0, v2, Lo/aza$c;->a:I

    iput v0, v5, Lo/aza$c;->a:I

    .line 105
    const/4 v1, 0x1

    .line 106
    goto :goto_1

    .line 108
    :cond_0
    goto :goto_0

    .line 109
    :cond_1
    :goto_1
    if-nez v1, :cond_2

    .line 111
    iget-object v0, p0, Lo/aza;->d:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    :cond_2
    monitor-exit v3

    goto :goto_2

    :catchall_0
    move-exception v6

    monitor-exit v3

    throw v6

    .line 114
    :goto_2
    return-void
.end method


# virtual methods
.method public a()Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;>;"
        }
    .end annotation

    .line 273
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 274
    const/4 v2, 0x0

    .line 276
    iget-object v3, p0, Lo/aza;->d:Ljava/util/List;

    monitor-enter v3

    .line 278
    :try_start_0
    iget-object v0, p0, Lo/aza;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/aza$c;

    .line 280
    iget-object v0, v5, Lo/aza$c;->b:Landroid/app/Activity;

    instance-of v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    if-eqz v0, :cond_0

    .line 282
    iget-object v0, v5, Lo/aza$c;->b:Landroid/app/Activity;

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    .line 283
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 285
    :cond_0
    goto :goto_0

    .line 286
    :cond_1
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v3

    throw v6

    .line 287
    :goto_1
    return-object v1
.end method

.method public a(Landroid/app/Activity;)V
    .locals 7

    .line 239
    if-nez p1, :cond_0

    .line 241
    return-void

    .line 244
    :cond_0
    const/4 v1, 0x0

    .line 245
    invoke-virtual {p1}, Landroid/app/Activity;->getTaskId()I

    move-result v2

    .line 248
    iget-object v3, p0, Lo/aza;->d:Ljava/util/List;

    monitor-enter v3

    .line 250
    :try_start_0
    iget-object v0, p0, Lo/aza;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/aza$c;

    .line 253
    if-eqz v1, :cond_1

    iget-object v0, v5, Lo/aza$c;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getTaskId()I

    move-result v0

    if-ne v0, v2, :cond_1

    .line 255
    iget-object v0, v5, Lo/aza$c;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 258
    :cond_1
    iget-object v0, v5, Lo/aza$c;->b:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_2

    .line 260
    const/4 v1, 0x1

    .line 262
    :cond_2
    goto :goto_0

    .line 263
    :cond_3
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v3

    throw v6

    .line 264
    :goto_1
    return-void
.end method

.method public a(Landroid/app/Activity;I)V
    .locals 2

    .line 124
    invoke-direct {p0, p1, p2}, Lo/aza;->c(Landroid/app/Activity;I)V

    .line 126
    invoke-virtual {p0}, Lo/aza;->d()Z

    move-result v1

    .line 127
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0, p2, v1}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->b(IZ)V

    .line 128
    return-void
.end method

.method public b(Z)Z
    .locals 10

    .line 199
    const/4 v2, 0x1

    .line 201
    const/4 v3, 0x0

    .line 202
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 204
    iget-object v5, p0, Lo/aza;->d:Ljava/util/List;

    monitor-enter v5

    .line 206
    :try_start_0
    iget-object v0, p0, Lo/aza;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/aza$c;

    .line 208
    iget-object v8, v7, Lo/aza$c;->b:Landroid/app/Activity;

    .line 209
    const-class v0, Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 211
    move-object v3, v8

    goto :goto_1

    .line 215
    :cond_0
    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 217
    :goto_1
    goto :goto_0

    .line 218
    :cond_1
    monitor-exit v5

    goto :goto_2

    :catchall_0
    move-exception v9

    monitor-exit v5

    throw v9

    .line 220
    :goto_2
    if-eqz v3, :cond_2

    .line 222
    invoke-direct {p0, v3, p1}, Lo/aza;->a(Landroid/app/Activity;Z)V

    .line 223
    const/4 v2, 0x0

    .line 225
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/app/Activity;

    .line 227
    invoke-virtual {v6}, Landroid/app/Activity;->finish()V

    .line 228
    goto :goto_3

    .line 230
    :cond_3
    return v2
.end method

.method public c()Landroid/app/Activity;
    .locals 6

    .line 158
    const/4 v1, 0x0

    .line 159
    iget-object v2, p0, Lo/aza;->d:Ljava/util/List;

    monitor-enter v2

    .line 161
    :try_start_0
    iget-object v0, p0, Lo/aza;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aza$c;

    .line 163
    iget v0, v4, Lo/aza$c;->a:I

    if-nez v0, :cond_0

    .line 165
    iget-object v1, v4, Lo/aza$c;->b:Landroid/app/Activity;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 166
    goto :goto_1

    .line 168
    :cond_0
    goto :goto_0

    .line 169
    :cond_1
    :goto_1
    monitor-exit v2

    goto :goto_2

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5

    .line 170
    :goto_2
    return-object v1
.end method

.method public d(Landroid/app/Activity;)V
    .locals 4

    .line 137
    iget-object v2, p0, Lo/aza;->d:Ljava/util/List;

    monitor-enter v2

    .line 139
    :try_start_0
    iget-object v0, p0, Lo/aza;->d:Ljava/util/List;

    new-instance v1, Lo/aza$c;

    invoke-direct {v1, p1}, Lo/aza$c;-><init>(Landroid/app/Activity;)V

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 141
    :goto_0
    return-void
.end method

.method public d()Z
    .locals 1

    .line 150
    invoke-virtual {p0}, Lo/aza;->c()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()Landroid/app/Activity;
    .locals 6

    .line 178
    const/4 v3, 0x0

    .line 179
    iget-object v4, p0, Lo/aza;->d:Ljava/util/List;

    monitor-enter v4

    .line 181
    :try_start_0
    iget-object v0, p0, Lo/aza;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 185
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/aza;->d:Ljava/util/List;

    iget-object v1, p0, Lo/aza;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/aza$c;

    iget-object v3, v0, Lo/aza$c;->b:Landroid/app/Activity;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 187
    :goto_0
    return-object v3
.end method

.method public e(Landroid/app/Activity;)V
    .locals 3

    .line 318
    const-string v0, "activity"

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/app/ActivityManager;

    .line 319
    invoke-virtual {p1}, Landroid/app/Activity;->getTaskId()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/app/ActivityManager;->moveTaskToFront(II)V

    .line 320
    return-void
.end method

.method public h()V
    .locals 5

    .line 329
    iget-object v1, p0, Lo/aza;->d:Ljava/util/List;

    monitor-enter v1

    .line 331
    :try_start_0
    iget-object v0, p0, Lo/aza;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/aza$c;

    .line 333
    iget-object v0, v3, Lo/aza$c;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 334
    goto :goto_0

    .line 335
    :cond_0
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4

    .line 336
    :goto_1
    return-void
.end method

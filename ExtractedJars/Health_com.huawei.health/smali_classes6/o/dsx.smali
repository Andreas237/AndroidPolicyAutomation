.class public Lo/dsx;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dsx$a;
    }
.end annotation


# static fields
.field private static volatile g:Lo/dsx;

.field private static final k:[B


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;>;"
        }
    .end annotation
.end field

.field private c:I

.field private d:Landroid/content/Context;

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Lo/dsx$a;>;"
        }
    .end annotation
.end field

.field private final h:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 61
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lo/dsx;->k:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dsx;->e:Ljava/util/Map;

    .line 45
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dsx;->b:Ljava/util/Map;

    .line 48
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dsx;->a:Ljava/util/Map;

    .line 56
    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lo/dsx;->h:[B

    .line 72
    return-void
.end method

.method private declared-synchronized b()I
    .locals 3

    monitor-enter p0

    .line 116
    :try_start_0
    iget v0, p0, Lo/dsx;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dsx;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method private d([Ljava/lang/String;)[Ljava/lang/String;
    .locals 8

    .line 206
    iget-object v1, p0, Lo/dsx;->h:[B

    monitor-enter v1

    .line 207
    if-eqz p1, :cond_2

    .line 208
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 209
    move-object v3, p1

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    .line 210
    iget-object v0, p0, Lo/dsx;->a:Ljava/util/Map;

    invoke-interface {v0, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 211
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 209
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 214
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 216
    :cond_2
    monitor-exit v1

    return-object p1

    .line 218
    :catchall_0
    move-exception v7

    monitor-exit v1

    throw v7
.end method

.method public static e()Lo/dsx;
    .locals 3

    .line 105
    sget-object v1, Lo/dsx;->k:[B

    monitor-enter v1

    .line 106
    :try_start_0
    sget-object v0, Lo/dsx;->g:Lo/dsx;

    if-nez v0, :cond_0

    .line 107
    new-instance v0, Lo/dsx;

    invoke-direct {v0}, Lo/dsx;-><init>()V

    sput-object v0, Lo/dsx;->g:Lo/dsx;

    .line 109
    :cond_0
    sget-object v0, Lo/dsx;->g:Lo/dsx;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 110
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public varargs c(Lo/dsx$a;[Ljava/lang/String;)V
    .locals 1

    .line 127
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lo/dsx;->e(Lo/dsx$a;Landroid/app/Activity;[Ljava/lang/String;)V

    .line 128
    return-void
.end method

.method public d(Landroid/content/Context;)V
    .locals 2

    .line 81
    iget-object v0, p0, Lo/dsx;->d:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 83
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 85
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dsx;->d:Landroid/content/Context;

    goto :goto_0

    .line 89
    :cond_0
    const-string v0, "initBackGround applicationContext init failed! context==null"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->e(Ljava/lang/String;Z)V

    goto :goto_0

    .line 94
    :cond_1
    const-string v0, "initBackGround applicationContext init not null!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->c(Ljava/lang/String;Z)V

    .line 96
    :goto_0
    return-void
.end method

.method public e(I[Ljava/lang/String;[I)V
    .locals 10

    .line 232
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PermissionsManager onRequestPermissionsResult, requestCode:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    .line 233
    iget-object v4, p0, Lo/dsx;->h:[B

    monitor-enter v4

    .line 236
    :try_start_0
    iget-object v0, p0, Lo/dsx;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map;

    .line 237
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 239
    iget-object v0, p0, Lo/dsx;->d:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/dsy;->e(Landroid/content/Context;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    .line 240
    const/4 v6, 0x0

    :goto_0
    array-length v0, p3

    if-ge v6, v0, :cond_0

    .line 242
    aget-object v0, p2, v6

    aget v1, p3, v6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 244
    :cond_0
    invoke-static {v5}, Lo/dsy;->e(Ljava/util/Map;)[I

    move-result-object p3

    .line 246
    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 248
    iget-object v0, p0, Lo/dsx;->a:Ljava/util/Map;

    invoke-interface {v0, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/dsx;->a:Ljava/util/Map;

    .line 249
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne p1, v0, :cond_1

    .line 251
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PermissionsManager key === "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " remove !"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    .line 252
    iget-object v0, p0, Lo/dsx;->a:Ljava/util/Map;

    invoke-interface {v0, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    :cond_1
    goto :goto_1

    .line 257
    :cond_2
    iget-object v0, p0, Lo/dsx;->e:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/dsx$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 258
    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8

    .line 259
    :goto_2
    const/4 v0, 0x0

    if-ne v0, v3, :cond_3

    .line 261
    const-string v0, "onRequestPermissionsResult permissionsResultsCallback null"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    goto :goto_3

    .line 265
    :cond_3
    iget-object v4, p0, Lo/dsx;->h:[B

    monitor-enter v4

    .line 267
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "callback remove:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dsx;->e:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    .line 268
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "requestMap remove:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dsx;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    .line 269
    invoke-interface {v3, p3}, Lo/dsx$a;->onRequestPermissionsResult([I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 270
    monitor-exit v4

    goto :goto_3

    :catchall_1
    move-exception v9

    monitor-exit v4

    throw v9

    .line 272
    :goto_3
    return-void
.end method

.method public varargs e(Lo/dsx$a;Landroid/app/Activity;[Ljava/lang/String;)V
    .locals 9

    .line 140
    const/4 v2, 0x0

    .line 142
    iget-object v4, p0, Lo/dsx;->h:[B

    monitor-enter v4

    .line 145
    :try_start_0
    iget-object v0, p0, Lo/dsx;->d:Landroid/content/Context;

    invoke-static {v0, p3}, Lo/dsy;->c(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    .line 147
    invoke-static {v5}, Lo/dsy;->c(Ljava/util/Map;)[Ljava/lang/String;

    move-result-object v2

    .line 149
    invoke-direct {p0}, Lo/dsx;->b()I

    move-result v3

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "requestPermissions, requestId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    .line 153
    iget-object v0, p0, Lo/dsx;->e:Ljava/util/Map;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    iget-object v0, p0, Lo/dsx;->b:Ljava/util/Map;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 156
    :goto_0
    invoke-direct {p0, v2}, Lo/dsx;->d([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 159
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    array-length v0, v2

    if-nez v0, :cond_1

    .line 162
    :cond_0
    const-string v0, "PermissionsManager permissionsArray has a permission requesting or null"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    .line 163
    const/4 v0, 0x0

    new-array v0, v0, [I

    invoke-virtual {p0, v3, v2, v0}, Lo/dsx;->e(I[Ljava/lang/String;[I)V

    .line 164
    return-void

    .line 168
    :cond_1
    move-object v4, v2

    array-length v5, v4

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_2

    aget-object v7, v4, v6

    .line 171
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PermissionsManager permission === "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " is requesting"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    .line 172
    iget-object v0, p0, Lo/dsx;->a:Ljava/util/Map;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 177
    :cond_2
    const/4 v0, 0x0

    if-eq v0, p2, :cond_3

    .line 181
    const-string v0, "PermissionsManager requestPermissions startActivityForResult"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    .line 182
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/pay/ui/PermissionsActivity;

    invoke-direct {v4, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 183
    const-string v0, "requested_permissions"

    invoke-virtual {v4, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 184
    const-string v0, "request_code"

    invoke-virtual {v4, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 185
    const/high16 v0, 0x800000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 186
    const/16 v0, 0x44b

    invoke-virtual {p2, v4, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 187
    goto :goto_2

    .line 190
    :cond_3
    iget-object v4, p0, Lo/dsx;->h:[B

    monitor-enter v4

    .line 192
    const-string v0, "PermissionsActivity.run(mApplicationContext, requestId, permissionsArray)"

    const/4 v1, 0x0

    :try_start_1
    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    .line 193
    iget-object v0, p0, Lo/dsx;->d:Landroid/content/Context;

    invoke-static {v0, v3, v2}, Lcom/huawei/pay/ui/PermissionsActivity;->run(Landroid/content/Context;I[Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 194
    monitor-exit v4

    goto :goto_2

    :catchall_1
    move-exception v8

    monitor-exit v4

    throw v8

    .line 196
    :goto_2
    return-void
.end method

.class public Lo/dwu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lo/dwr;

.field private static volatile b:Lo/dwu;

.field private static c:Ljava/lang/String;


# instance fields
.field private e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    const-string v0, "PLGACHIEVE_AchieveLevelManager"

    sput-object v0, Lo/dwu;->c:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dwu;->e:Landroid/content/Context;

    .line 57
    return-void
.end method

.method static synthetic a()Lo/dwr;
    .locals 1

    .line 34
    sget-object v0, Lo/dwu;->a:Lo/dwr;

    return-object v0
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .line 34
    sget-object v0, Lo/dwu;->c:Ljava/lang/String;

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Lo/dwu;
    .locals 4

    .line 44
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    sput-object v0, Lo/dwu;->a:Lo/dwr;

    .line 45
    sget-object v0, Lo/dwu;->b:Lo/dwu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 46
    const-class v2, Lo/dwr;

    monitor-enter v2

    .line 47
    :try_start_0
    sget-object v0, Lo/dwu;->b:Lo/dwu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 48
    new-instance v0, Lo/dwu;

    invoke-direct {v0, p0}, Lo/dwu;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dwu;->b:Lo/dwu;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 52
    :cond_1
    :goto_0
    sget-object v0, Lo/dwu;->b:Lo/dwu;

    return-object v0
.end method


# virtual methods
.method public b(I)V
    .locals 2

    .line 206
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    .line 207
    new-instance v0, Lo/dwu$2;

    invoke-direct {v0, p0, p1}, Lo/dwu$2;-><init>(Lo/dwu;I)V

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 223
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 224
    return-void
.end method

.method public c()V
    .locals 4

    .line 248
    iget-object v0, p0, Lo/dwu;->e:Landroid/content/Context;

    const-string v1, "levelEventKey"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 249
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 250
    sget-object v0, Lo/dwu;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dealNotDealEvent key="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    invoke-virtual {p0, v3}, Lo/dwu;->d(Ljava/lang/String;)V

    .line 253
    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .line 286
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 287
    iget-object v0, p0, Lo/dwu;->e:Landroid/content/Context;

    const-string v1, "levelEventKey"

    invoke-static {v0, v1, p1}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;I)V
    .locals 4

    .line 128
    invoke-static {p1}, Lo/dzo;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 129
    sget-object v0, Lo/dwu;->c:Ljava/lang/String;

    const-string v1, "key is Invalid"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    return-void

    .line 132
    :cond_0
    iget-object v0, p0, Lo/dwu;->e:Landroid/content/Context;

    const-string v1, "levelEventKey"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    .line 134
    new-instance v0, Lo/dwu$3;

    invoke-direct {v0, p0, p1, p2}, Lo/dwu$3;-><init>(Lo/dwu;Ljava/lang/String;I)V

    invoke-interface {v3, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 173
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 174
    return-void
.end method

.method public c(Lo/dvj;)V
    .locals 2

    .line 70
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 71
    sget-object v0, Lo/dwu;->c:Ljava/lang/String;

    const-string v1, "userLevelInfo is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    return-void

    .line 74
    :cond_0
    iget-object v0, p0, Lo/dwu;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 75
    return-void
.end method

.method public d(ILo/dvj;)V
    .locals 2

    .line 234
    invoke-static {p1}, Lo/dzt;->e(I)I

    move-result v0

    .line 235
    invoke-virtual {p2}, Lo/dvj;->d()I

    move-result v1

    .line 236
    if-le v0, v1, :cond_0

    .line 237
    invoke-virtual {p0, v0}, Lo/dwu;->e(I)V

    .line 239
    :cond_0
    invoke-virtual {p2, p1}, Lo/dvj;->b(I)V

    .line 240
    invoke-virtual {p2, v0}, Lo/dvj;->c(I)V

    .line 241
    invoke-virtual {p0, p2}, Lo/dwu;->c(Lo/dvj;)V

    .line 242
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 6

    .line 263
    invoke-static {p1}, Lo/dzo;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 264
    sget-object v0, Lo/dwu;->c:Ljava/lang/String;

    const-string v1, "taskId Not in the effective range"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    return-void

    .line 268
    :cond_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 269
    const-string v0, "taskId"

    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    invoke-static {}, Lo/dzo;->b()Ljava/lang/String;

    move-result-object v4

    .line 271
    sget-object v0, Lo/dwu;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateUserExperience getCurrentTimeZone="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    const-string v0, "timeZone"

    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    invoke-virtual {p0, p1}, Lo/dwu;->c(Ljava/lang/String;)V

    .line 274
    new-instance v5, Lo/dwp;

    iget-object v0, p0, Lo/dwu;->e:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/dwp;-><init>(Landroid/content/Context;)V

    .line 275
    sget-object v0, Lo/dwu;->a:Lo/dwr;

    invoke-virtual {v0, v5}, Lo/dwr;->b(Lo/dui;)V

    .line 276
    sget-object v0, Lo/dwu;->a:Lo/dwr;

    const/16 v1, 0xe

    invoke-virtual {v0, v1, v3}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 277
    return-void
.end method

.method public e()V
    .locals 4

    .line 295
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 296
    invoke-virtual {p0}, Lo/dwu;->c()V

    .line 297
    new-instance v3, Lo/dws;

    iget-object v0, p0, Lo/dwu;->e:Landroid/content/Context;

    invoke-direct {v3, v0}, Lo/dws;-><init>(Landroid/content/Context;)V

    .line 298
    sget-object v0, Lo/dwu;->a:Lo/dwr;

    invoke-virtual {v0, v3}, Lo/dwr;->b(Lo/dui;)V

    .line 299
    sget-object v0, Lo/dwu;->a:Lo/dwr;

    const/16 v1, 0xd

    invoke-virtual {v0, v1, v2}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 300
    return-void
.end method

.method public e(I)V
    .locals 4

    .line 109
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 110
    return-void

    .line 112
    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 113
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 114
    const-string v0, "level"

    invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 115
    iget-object v0, p0, Lo/dwu;->e:Landroid/content/Context;

    const-string v1, "com.huawei.pluginachievement.ui.level.AchieveLevelMessageDialog"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 116
    const-string v0, "tag"

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 117
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 118
    iget-object v0, p0, Lo/dwu;->e:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 119
    return-void
.end method

.method public e(Lo/dve;)V
    .locals 2

    .line 96
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 97
    sget-object v0, Lo/dwu;->c:Ljava/lang/String;

    const-string v1, "achieveLevelEventInfo is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    return-void

    .line 100
    :cond_0
    sget-object v0, Lo/dwu;->a:Lo/dwr;

    invoke-virtual {v0, p1}, Lo/dwr;->d(Lo/dvf;)Z

    .line 101
    return-void
.end method

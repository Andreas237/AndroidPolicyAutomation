.class public Lo/aeu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Ljava/lang/String;

.field private static final d:Lo/acl$a;

.field private static i:Lo/aeu;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lo/acl;

.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/content/Context;>;"
        }
    .end annotation
.end field

.field private f:Lo/abx;

.field private g:Z

.field private h:Z

.field private k:Lo/aew;

.field private l:Lo/ahi$e;

.field private m:Z

.field private n:Z

.field private o:Lo/aby;

.field private p:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lo/aeu;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/aeu;->c:Ljava/lang/String;

    .line 43
    sget-object v0, Lo/acl$a;->c:Lo/acl$a;

    sput-object v0, Lo/aeu;->d:Lo/acl$a;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aeu;->e:Ljava/lang/ref/WeakReference;

    .line 52
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aeu;->g:Z

    .line 53
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aeu;->m:Z

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aeu;->n:Z

    .line 109
    new-instance v0, Lo/aeu$1;

    invoke-direct {v0, p0}, Lo/aeu$1;-><init>(Lo/aeu;)V

    iput-object v0, p0, Lo/aeu;->l:Lo/ahi$e;

    .line 225
    new-instance v0, Lo/aeu$4;

    invoke-direct {v0, p0}, Lo/aeu$4;-><init>(Lo/aeu;)V

    iput-object v0, p0, Lo/aeu;->p:Landroid/os/Handler;

    .line 361
    new-instance v0, Lo/aeu$5;

    invoke-direct {v0, p0}, Lo/aeu$5;-><init>(Lo/aeu;)V

    iput-object v0, p0, Lo/aeu;->o:Lo/aby;

    .line 63
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/aeu;->e:Ljava/lang/ref/WeakReference;

    .line 64
    new-instance v0, Lo/aew;

    iget-object v1, p0, Lo/aeu;->o:Lo/aby;

    iget-object v2, p0, Lo/aeu;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lo/aew;-><init>(Lo/aby;Landroid/content/Context;)V

    iput-object v0, p0, Lo/aeu;->k:Lo/aew;

    .line 65
    invoke-direct {p0}, Lo/aeu;->k()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/aeu;->a:Ljava/lang/String;

    .line 66
    return-void
.end method

.method static synthetic a(Lo/aeu;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lo/aeu;->f()V

    return-void
.end method

.method static synthetic b(Lo/aeu;Landroid/os/Bundle;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lo/aeu;->d(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic b(Lo/aeu;)Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Lo/aeu;->h:Z

    return v0
.end method

.method static synthetic c(Lo/aeu;)Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Lo/aeu;->n:Z

    return v0
.end method

.method private d(Landroid/os/Bundle;)V
    .locals 6

    .line 152
    iget-object v0, p0, Lo/aeu;->e:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 153
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aeu;->h:Z

    .line 154
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 155
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 156
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 157
    const-string v0, "kind"

    const-string v1, "HDK_WEIGHT"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 158
    const-string v0, "view"

    const-string v1, "AutoMeasureDevice"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 159
    const-string v0, "productId"

    invoke-direct {p0}, Lo/aeu;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 160
    const-string v0, "HealthData"

    const-string v1, "weight_data"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 161
    iget-object v0, p0, Lo/aeu;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/content/Context;

    .line 162
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 163
    invoke-virtual {v5, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 165
    :cond_0
    goto :goto_0

    .line 166
    :cond_1
    invoke-static {}, Lo/aeu;->i()V

    .line 167
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Lo/aeu;->c:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "context is null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/aeu;)Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Lo/aeu;->g:Z

    return v0
.end method

.method public static e(Landroid/content/Context;)Lo/aeu;
    .locals 2

    .line 69
    sget-object v0, Lo/aeu;->i:Lo/aeu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 70
    new-instance v0, Lo/aeu;

    invoke-direct {v0, p0}, Lo/aeu;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/aeu;->i:Lo/aeu;

    .line 72
    :cond_0
    sget-object v0, Lo/aeu;->i:Lo/aeu;

    return-object v0
.end method

.method static synthetic e(Lo/aeu;)Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Lo/aeu;->m:Z

    return v0
.end method

.method private f()V
    .locals 5

    .line 252
    iget-boolean v0, p0, Lo/aeu;->g:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lo/aeu;->n:Z

    if-nez v0, :cond_1

    .line 253
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lo/aeu;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "measureWeight onResume"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/aeu;->n:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    return-void

    .line 256
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aeu;->g:Z

    .line 257
    invoke-direct {p0}, Lo/aeu;->k()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 258
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lo/aeu;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\u6ca1\u6709\u7ed1\u5b9a\u7684\u8363\u8000\u4f53\u8102\u79f0\u8bbe\u5907"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aeu;->g:Z

    .line 260
    invoke-direct {p0}, Lo/aeu;->g()V

    .line 261
    return-void

    .line 263
    :cond_2
    iget-boolean v0, p0, Lo/aeu;->m:Z

    if-nez v0, :cond_3

    .line 264
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lo/aeu;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "isVisibleToUser"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/aeu;->m:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aeu;->g:Z

    .line 266
    iget-object v0, p0, Lo/aeu;->p:Landroid/os/Handler;

    const/16 v1, 0x3eb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 267
    return-void

    .line 269
    :cond_3
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-direct {p0}, Lo/aeu;->k()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/aeu$2;

    invoke-direct {v2, p0}, Lo/aeu$2;-><init>(Lo/aeu;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/afd;->a(Ljava/lang/String;Lo/abx;Landroid/os/Bundle;)Z

    move-result v4

    .line 318
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lo/aeu;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "startMeasure isConnect\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    if-nez v4, :cond_4

    .line 320
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aeu;->g:Z

    .line 321
    iget-object v0, p0, Lo/aeu;->p:Landroid/os/Handler;

    const/16 v1, 0x3eb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 323
    :cond_4
    return-void
.end method

.method static synthetic f(Lo/aeu;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lo/aeu;->p()V

    return-void
.end method

.method private g()V
    .locals 1

    .line 245
    iget-object v0, p0, Lo/aeu;->k:Lo/aew;

    invoke-virtual {v0}, Lo/aew;->a()V

    .line 246
    return-void
.end method

.method static synthetic h(Lo/aeu;)Landroid/os/Handler;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/aeu;->p:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic h()Ljava/lang/String;
    .locals 1

    .line 30
    sget-object v0, Lo/aeu;->c:Ljava/lang/String;

    return-object v0
.end method

.method private static i()V
    .locals 1

    .line 222
    const/4 v0, 0x0

    sput-object v0, Lo/aeu;->i:Lo/aeu;

    .line 223
    return-void
.end method

.method private k()Ljava/lang/String;
    .locals 8

    .line 126
    iget-object v0, p0, Lo/aeu;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 127
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Lo/aeu;->c:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHonorWeight honorWeightID is not null"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/aeu;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    iget-object v0, p0, Lo/aeu;->b:Lo/acl;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 129
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Lo/aeu;->c:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getHonorWeight device is null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lo/aeu;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    iput-object v0, p0, Lo/aeu;->b:Lo/acl;

    .line 132
    :cond_0
    iget-object v0, p0, Lo/aeu;->a:Ljava/lang/String;

    return-object v0

    .line 134
    :cond_1
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    sget-object v1, Lo/aeu;->d:Lo/acl$a;

    invoke-virtual {v0, v1}, Lo/afd;->e(Lo/acl$a;)Ljava/util/ArrayList;

    move-result-object v4

    .line 135
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 136
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v7

    .line 137
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    const-string v0, "48"

    invoke-virtual {v7}, Lo/afj;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 138
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Lo/aeu;->c:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHonorWeight productId:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    iput-object v0, p0, Lo/aeu;->b:Lo/acl;

    .line 140
    iput-object v6, p0, Lo/aeu;->a:Ljava/lang/String;

    .line 141
    return-object v6

    .line 143
    :cond_2
    goto :goto_0

    .line 144
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic k(Lo/aeu;)Lo/abx;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/aeu;->f:Lo/abx;

    return-object v0
.end method

.method private p()V
    .locals 4

    .line 350
    iget-object v0, p0, Lo/aeu;->k:Lo/aew;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-boolean v0, p0, Lo/aeu;->n:Z

    if-eqz v0, :cond_0

    .line 351
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lo/aeu;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "startScanner"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    iget-object v0, p0, Lo/aeu;->k:Lo/aew;

    invoke-direct {p0}, Lo/aeu;->k()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/aeu;->b:Lo/acl;

    invoke-virtual {v0, v1, v2}, Lo/aew;->c(Ljava/lang/String;Lo/acl;)V

    goto :goto_0

    .line 354
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lo/aeu;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " scanUtil is null"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 175
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 176
    return-void

    .line 178
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lo/aeu;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "onResume"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aeu;->n:Z

    .line 180
    iget-boolean v0, p0, Lo/aeu;->h:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lo/aeu;->g:Z

    if-eqz v0, :cond_1

    .line 181
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-direct {p0}, Lo/aeu;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->h(Ljava/lang/String;)V

    .line 183
    :cond_1
    iget-object v0, p0, Lo/aeu;->p:Landroid/os/Handler;

    const/16 v1, 0x3eb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 184
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aeu;->h:Z

    .line 185
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aeu;->g:Z

    .line 186
    return-void
.end method

.method public a(Lo/abx;)V
    .locals 1

    .line 56
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/abx;

    iput-object v0, p0, Lo/aeu;->f:Lo/abx;

    .line 57
    return-void
.end method

.method protected a(Lo/acl;I)V
    .locals 4

    .line 331
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lo/aeu;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "handleStatusChanged status"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 334
    :pswitch_0
    goto :goto_1

    .line 337
    :pswitch_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aeu;->g:Z

    .line 338
    iget-object v0, p0, Lo/aeu;->p:Landroid/os/Handler;

    const/16 v1, 0x3eb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 339
    goto :goto_1

    .line 341
    :goto_0
    :pswitch_2
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lo/aeu;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " handleStatusChanged status is error"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public b()V
    .locals 4

    .line 193
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 194
    return-void

    .line 196
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lo/aeu;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "onPause isGoToMeasureView"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/aeu;->h:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aeu;->n:Z

    .line 198
    invoke-direct {p0}, Lo/aeu;->g()V

    .line 199
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aeu;->g:Z

    .line 200
    iget-boolean v0, p0, Lo/aeu;->h:Z

    if-nez v0, :cond_1

    .line 201
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-direct {p0}, Lo/aeu;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->h(Ljava/lang/String;)V

    .line 203
    :cond_1
    return-void
.end method

.method public c()V
    .locals 4

    .line 209
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 210
    return-void

    .line 212
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lo/aeu;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "onDestroy"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    invoke-direct {p0}, Lo/aeu;->g()V

    .line 214
    iget-object v0, p0, Lo/aeu;->k:Lo/aew;

    invoke-virtual {v0}, Lo/aew;->e()V

    .line 215
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aeu;->k:Lo/aew;

    .line 216
    iget-object v0, p0, Lo/aeu;->l:Lo/ahi$e;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "weight_measure_choose_user"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ahi;->a(Lo/ahi$e;[Ljava/lang/String;)V

    .line 217
    iget-object v0, p0, Lo/aeu;->p:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 218
    invoke-static {}, Lo/aeu;->i()V

    .line 219
    return-void
.end method

.method public c(Z)V
    .locals 4

    .line 80
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    return-void

    .line 83
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setUserVisibleHint:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    iput-boolean p1, p0, Lo/aeu;->m:Z

    .line 85
    if-nez p1, :cond_1

    iget-boolean v0, p0, Lo/aeu;->g:Z

    if-eqz v0, :cond_1

    .line 86
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aeu;->g:Z

    .line 87
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-direct {p0}, Lo/aeu;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->h(Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lo/aeu;->p:Landroid/os/Handler;

    const/16 v1, 0x3eb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 90
    :cond_1
    return-void
.end method

.method public d()V
    .locals 4

    .line 96
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    return-void

    .line 99
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lo/aeu;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "onCreate"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    iget-object v0, p0, Lo/aeu;->k:Lo/aew;

    invoke-virtual {v0}, Lo/aew;->d()V

    .line 102
    iget-object v0, p0, Lo/aeu;->l:Lo/ahi$e;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "weight_measure_choose_user"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x2

    invoke-static {v0, v2, v1}, Lo/ahi;->d(Lo/ahi$e;I[Ljava/lang/String;)V

    .line 103
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lo/aeu;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "onCreate End"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    return-void
.end method

.method public e()V
    .locals 1

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aeu;->f:Lo/abx;

    .line 61
    return-void
.end method

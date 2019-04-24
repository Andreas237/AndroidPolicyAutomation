.class public final Lo/aop;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aop$d;
    }
.end annotation


# static fields
.field private static a:Lo/aop;

.field private static d:Z


# instance fields
.field private b:J

.field private c:Landroid/os/Handler;

.field private volatile e:I

.field private f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Lo/aop;

    invoke-direct {v0}, Lo/aop;-><init>()V

    sput-object v0, Lo/aop;->a:Lo/aop;

    .line 69
    const/4 v0, 0x0

    sput-boolean v0, Lo/aop;->d:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/aop;->b:J

    .line 74
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aop;->f:Z

    .line 83
    const/4 v0, 0x0

    iput v0, p0, Lo/aop;->e:I

    .line 85
    new-instance v0, Lo/aop$d;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/aop$d;-><init>(Lo/aop;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/aop;->c:Landroid/os/Handler;

    .line 86
    return-void
.end method

.method private a(I)V
    .locals 3

    .line 248
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 250
    const-string v0, "HwAccountBindStatus"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "change status, old="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/aop;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", new="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    :cond_0
    iget v0, p0, Lo/aop;->e:I

    if-ne p1, v0, :cond_1

    .line 256
    return-void

    .line 261
    :cond_1
    if-nez p1, :cond_2

    .line 263
    return-void

    .line 270
    :cond_2
    iput p1, p0, Lo/aop;->e:I

    .line 271
    return-void
.end method

.method static synthetic a(Lo/aop;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lo/aop;->m()V

    return-void
.end method

.method static synthetic b(Lo/aop;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lo/aop;->n()V

    return-void
.end method

.method static synthetic b(Lo/aop;I)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lo/aop;->a(I)V

    return-void
.end method

.method static synthetic c(Lo/aop;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lo/aop;->g()V

    return-void
.end method

.method private d(I)V
    .locals 4

    .line 162
    iget-object v0, p0, Lo/aop;->c:Landroid/os/Handler;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v3

    .line 163
    iget-object v0, p0, Lo/aop;->c:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 164
    return-void
.end method

.method public static e()Lo/aop;
    .locals 1

    .line 90
    sget-object v0, Lo/aop;->a:Lo/aop;

    return-object v0
.end method

.method private g()V
    .locals 3

    .line 188
    const-string v0, "HwAccountBindStatus"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "init get bind status="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/aop;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    iget v0, p0, Lo/aop;->e:I

    if-eqz v0, :cond_0

    .line 193
    const-string v0, "HwAccountBindStatus"

    const-string v1, "status already initialized, ignore."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    return-void

    .line 198
    :cond_0
    iget-boolean v0, p0, Lo/aop;->f:Z

    if-eqz v0, :cond_1

    .line 200
    const-string v0, "HwAccountBindStatus"

    const-string v1, "request is running."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    return-void

    .line 204
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aop;->f:Z

    .line 206
    invoke-virtual {p0}, Lo/aop;->f()V

    .line 208
    return-void
.end method

.method public static h()V
    .locals 3

    .line 373
    const-string v0, "HwAccountBindStatus"

    const-string v1, "_sns_ show bind info."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 383
    new-instance v2, Landroid/content/Intent;

    const-string v0, "action_show_bind_phone_dlg"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 384
    invoke-static {v2}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 387
    const/4 v0, 0x1

    sput-boolean v0, Lo/aop;->d:Z

    .line 388
    return-void
.end method

.method public static i()V
    .locals 1

    .line 404
    const/4 v0, 0x0

    sput-boolean v0, Lo/aop;->d:Z

    .line 405
    return-void
.end method

.method public static k()Z
    .locals 1

    .line 395
    sget-boolean v0, Lo/aop;->d:Z

    .line 396
    return v0
.end method

.method private m()V
    .locals 2

    .line 278
    const-string v0, "HwAccountBindStatus"

    const-string v1, "reset bind status to unKnow."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    const/4 v0, 0x0

    iput v0, p0, Lo/aop;->e:I

    .line 280
    return-void
.end method

.method private n()V
    .locals 0

    .line 347
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 153
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/aop;->d(I)V

    .line 154
    return-void
.end method

.method public b()Z
    .locals 4

    .line 100
    const/4 v3, 0x0

    .line 102
    const-string v0, "HwAccountBindStatus"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "check hwid bind staus "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/aop;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    iget v0, p0, Lo/aop;->e:I

    if-eqz v0, :cond_0

    iget v0, p0, Lo/aop;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 108
    :cond_0
    const/4 v3, 0x1

    goto :goto_0

    .line 110
    :cond_1
    iget v0, p0, Lo/aop;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 114
    const/4 v3, 0x0

    .line 117
    :cond_2
    :goto_0
    return v3
.end method

.method public c()V
    .locals 2

    .line 171
    iget-object v0, p0, Lo/aop;->c:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 172
    return-void
.end method

.method public d()V
    .locals 6

    .line 125
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    const-string v0, "HwAccountBindStatus"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "check if need request, status="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/aop;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", time="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lo/aop;->b:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    :cond_0
    iget v0, p0, Lo/aop;->e:I

    if-nez v0, :cond_1

    .line 133
    const-string v0, "HwAccountBindStatus"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "last status is unKnow, need check again, status="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/aop;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    invoke-virtual {p0}, Lo/aop;->f()V

    .line 135
    return-void

    .line 139
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lo/aop;->b:J

    sub-long v4, v0, v2

    .line 140
    const-string v0, "HwAccountBindStatus"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "check account bind diff time:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    const-wide/32 v0, 0x5265c00

    cmp-long v0, v4, v0

    if-lez v0, :cond_2

    .line 143
    const-string v0, "HwAccountBindStatus"

    const-string v1, "last check time was too early, need check again"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    invoke-virtual {p0}, Lo/aop;->f()V

    .line 146
    :cond_2
    return-void
.end method

.method public f()V
    .locals 2

    .line 354
    const-string v0, "HwAccountBindStatus"

    const-string v1, "get bind status"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 357
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/aop$3;

    invoke-direct {v1, p0}, Lo/aop$3;-><init>(Lo/aop;)V

    invoke-virtual {v0, v1}, Lo/brb;->d(Ljava/lang/Runnable;)V

    .line 365
    return-void
.end method

.class public Lcom/huawei/hwid/core/d/b/a/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/d/b/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:J

.field private final b:J

.field private final c:J

.field private final d:I

.field private final e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;


# direct methods
.method private constructor <init>(ILjava/lang/String;)V
    .locals 2

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 212
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwid/core/d/b/a/a$a;->a:J

    .line 214
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/huawei/hwid/core/d/b/a/a$a;->b:J

    .line 216
    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/huawei/hwid/core/d/b/a/a$a;->c:J

    .line 218
    iput p1, p0, Lcom/huawei/hwid/core/d/b/a/a$a;->d:I

    .line 220
    iput-object p2, p0, Lcom/huawei/hwid/core/d/b/a/a$a;->e:Ljava/lang/String;

    .line 221
    return-void
.end method

.method synthetic constructor <init>(ILjava/lang/String;Lcom/huawei/hwid/core/d/b/a/a$1;)V
    .locals 0

    .line 185
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwid/core/d/b/a/a$a;-><init>(ILjava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/core/d/b/a/a$a;)J
    .locals 2

    .line 185
    iget-wide v0, p0, Lcom/huawei/hwid/core/d/b/a/a$a;->a:J

    return-wide v0
.end method

.method static synthetic b(Lcom/huawei/hwid/core/d/b/a/a$a;)J
    .locals 2

    .line 185
    iget-wide v0, p0, Lcom/huawei/hwid/core/d/b/a/a$a;->b:J

    return-wide v0
.end method

.method static synthetic c(Lcom/huawei/hwid/core/d/b/a/a$a;)J
    .locals 2

    .line 185
    iget-wide v0, p0, Lcom/huawei/hwid/core/d/b/a/a$a;->c:J

    return-wide v0
.end method

.method static synthetic d(Lcom/huawei/hwid/core/d/b/a/a$a;)I
    .locals 1

    .line 185
    iget v0, p0, Lcom/huawei/hwid/core/d/b/a/a$a;->d:I

    return v0
.end method

.method static synthetic e(Lcom/huawei/hwid/core/d/b/a/a$a;)Ljava/lang/String;
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/a/a$a;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic f(Lcom/huawei/hwid/core/d/b/a/a$a;)Ljava/lang/String;
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/a/a$a;->f:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/hwid/core/d/b/a/a$a;)I
    .locals 1

    .line 185
    iget v0, p0, Lcom/huawei/hwid/core/d/b/a/a$a;->g:I

    return v0
.end method

.method static synthetic h(Lcom/huawei/hwid/core/d/b/a/a$a;)Ljava/lang/String;
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/a/a$a;->h:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/hwid/core/d/b/a/a$a;)Ljava/lang/String;
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/a/a$a;->i:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/huawei/hwid/core/d/b/a/a$a;
    .locals 0

    .line 231
    iput-object p1, p0, Lcom/huawei/hwid/core/d/b/a/a$a;->h:Ljava/lang/String;

    .line 233
    return-object p0
.end method

.method public a(Ljava/lang/Throwable;)Lcom/huawei/hwid/core/d/b/a/a$a;
    .locals 4

    .line 239
    if-eqz p1, :cond_0

    .line 240
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/d/b/a/a$a;->i:Ljava/lang/String;

    .line 241
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v2, v0, v1

    goto :goto_0

    .line 243
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v3

    .line 244
    array-length v0, v3

    const/4 v1, 0x2

    if-le v0, v1, :cond_1

    .line 245
    const/4 v0, 0x2

    aget-object v2, v3, v0

    goto :goto_0

    .line 247
    :cond_1
    const/4 v2, 0x0

    .line 251
    :goto_0
    if-eqz v2, :cond_2

    .line 252
    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/d/b/a/a$a;->f:Ljava/lang/String;

    .line 253
    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/d/b/a/a$a;->g:I

    .line 256
    :cond_2
    return-object p0
.end method

.method public a()Lcom/huawei/hwid/core/d/b/a/a;
    .locals 2

    .line 227
    new-instance v0, Lcom/huawei/hwid/core/d/b/a/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/hwid/core/d/b/a/a;-><init>(Lcom/huawei/hwid/core/d/b/a/a$a;Lcom/huawei/hwid/core/d/b/a/a$1;)V

    return-object v0
.end method

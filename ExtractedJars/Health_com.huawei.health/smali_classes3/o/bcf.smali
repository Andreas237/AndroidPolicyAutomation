.class public final Lo/bcf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Lo/bcf;


# instance fields
.field private a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private d:Lo/bcj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    new-instance v0, Lo/bcf;

    invoke-direct {v0}, Lo/bcf;-><init>()V

    sput-object v0, Lo/bcf;->b:Lo/bcf;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/bcf;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 45
    new-instance v0, Lo/bcj;

    invoke-direct {v0}, Lo/bcj;-><init>()V

    iput-object v0, p0, Lo/bcf;->d:Lo/bcj;

    .line 46
    return-void
.end method

.method public static c()Lo/bcf;
    .locals 1

    .line 55
    sget-object v0, Lo/bcf;->b:Lo/bcf;

    return-object v0
.end method

.method static synthetic d(Lo/bcf;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/bcf;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 4

    .line 131
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "friendListOldVersion"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 132
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    const/4 v0, 0x1

    return v0

    .line 136
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()V
    .locals 2

    .line 63
    invoke-virtual {p0}, Lo/bcf;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lo/bcf;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 66
    return-void

    .line 68
    :cond_0
    iget-object v0, p0, Lo/bcf;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 70
    return-void

    .line 73
    :cond_1
    new-instance v0, Lo/bcf$2;

    invoke-direct {v0, p0}, Lo/bcf$2;-><init>(Lo/bcf;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 106
    return-void
.end method

.method public d()V
    .locals 1

    .line 116
    iget-object v0, p0, Lo/bcf;->d:Lo/bcj;

    invoke-virtual {v0}, Lo/bcj;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    return-void

    .line 121
    :cond_0
    iget-object v0, p0, Lo/bcf;->d:Lo/bcj;

    invoke-virtual {v0}, Lo/bcj;->e()V

    .line 122
    return-void
.end method

.method public e()Z
    .locals 2

    .line 146
    new-instance v0, Lo/atk;

    invoke-direct {v0}, Lo/atk;-><init>()V

    invoke-virtual {v0}, Lo/atk;->a()Ljava/lang/String;

    move-result-object v1

    .line 147
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 149
    const/4 v0, 0x1

    return v0

    .line 151
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

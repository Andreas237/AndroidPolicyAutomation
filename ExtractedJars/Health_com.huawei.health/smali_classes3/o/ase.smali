.class public final Lo/ase;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lo/ase;


# instance fields
.field private a:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<Lo/bbf;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 38
    new-instance v0, Lo/ase;

    invoke-direct {v0}, Lo/ase;-><init>()V

    sput-object v0, Lo/ase;->d:Lo/ase;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/ase;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lo/ase;->a:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 50
    return-void
.end method

.method static synthetic a(Lo/ase;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 18
    iget-object v0, p0, Lo/ase;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method private b()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 110
    new-instance v0, Lo/ase$3;

    invoke-direct {v0, p0}, Lo/ase$3;-><init>(Lo/ase;)V

    return-object v0
.end method

.method static synthetic c(Lo/ase;)Ljava/util/concurrent/LinkedBlockingQueue;
    .locals 1

    .line 18
    iget-object v0, p0, Lo/ase;->a:Ljava/util/concurrent/LinkedBlockingQueue;

    return-object v0
.end method

.method public static d()Lo/ase;
    .locals 1

    .line 59
    sget-object v0, Lo/ase;->d:Lo/ase;

    return-object v0
.end method

.method private d(Lo/bbf;)Z
    .locals 4

    .line 83
    const/4 v2, 0x0

    .line 86
    :try_start_0
    iget-object v0, p0, Lo/ase;->a:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/LinkedBlockingQueue;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2

    move-result v0

    move v2, v0

    .line 99
    goto :goto_0

    .line 88
    :catch_0
    move-exception v3

    .line 90
    const-string v0, "HeadImgDwnldManager"

    const-string v1, "addQueue IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    goto :goto_0

    .line 92
    :catch_1
    move-exception v3

    .line 94
    const-string v0, "HeadImgDwnldManager"

    const-string v1, "addQueue ClassCastException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    goto :goto_0

    .line 96
    :catch_2
    move-exception v3

    .line 98
    const-string v0, "HeadImgDwnldManager"

    const-string v1, "addQueue IllegalArgumentException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    :goto_0
    return v2
.end method


# virtual methods
.method public a(Lo/bbf;)V
    .locals 3

    .line 69
    invoke-direct {p0, p1}, Lo/ase;->d(Lo/bbf;)Z

    move-result v2

    .line 70
    if-eqz v2, :cond_0

    iget-object v0, p0, Lo/ase;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 72
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0}, Lo/ase;->b()Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 74
    :cond_0
    return-void
.end method

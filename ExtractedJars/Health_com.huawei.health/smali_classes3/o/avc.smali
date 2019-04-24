.class public Lo/avc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    const-class v0, Lo/avc;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/avc;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    .line 23
    sget-object v0, Lo/avc;->a:Ljava/lang/String;

    return-object v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 93
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p1}, Lo/avc;->c(Landroid/content/Context;Ljava/lang/String;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 94
    return-void
.end method

.method private static c(Landroid/content/Context;Ljava/lang/String;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;)Lo/brd<Ljava/lang/Void;>;"
        }
    .end annotation

    .line 76
    new-instance v0, Lo/avc$5;

    invoke-direct {v0, p0, p1}, Lo/avc$5;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method

.method private static c(Ljava/lang/String;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Lo/brd<Ljava/lang/Void;>;"
        }
    .end annotation

    .line 58
    new-instance v0, Lo/avc$1;

    invoke-direct {v0, p0}, Lo/avc$1;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public b(Landroid/content/Context;[BLjava/lang/String;)V
    .locals 4

    .line 38
    invoke-static {}, Lo/bch;->a()Lo/bch;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bch;->b(Landroid/content/Context;)V

    .line 39
    const/4 v2, 0x0

    .line 41
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, p2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    .line 44
    goto :goto_0

    .line 42
    :catch_0
    move-exception v3

    .line 43
    sget-object v0, Lo/avc;->a:Ljava/lang/String;

    const-string v1, "onPushMsg UnsupportedEncodingException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    :goto_0
    if-eqz v2, :cond_0

    .line 47
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {v2}, Lo/avc;->c(Ljava/lang/String;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 49
    :cond_0
    return-void
.end method

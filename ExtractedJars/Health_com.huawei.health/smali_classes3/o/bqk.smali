.class Lo/bqk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bqk$d;
    }
.end annotation


# instance fields
.field private final a:Lo/bpv;

.field private final c:Ljava/net/URL;

.field private final d:Ljava/lang/String;

.field private final e:Lo/bqh;


# direct methods
.method private constructor <init>(Lo/bqk$d;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    invoke-static {p1}, Lo/bqk$d;->e(Lo/bqk$d;)Ljava/net/URL;

    move-result-object v0

    iput-object v0, p0, Lo/bqk;->c:Ljava/net/URL;

    .line 22
    invoke-static {p1}, Lo/bqk$d;->c(Lo/bqk$d;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bqk;->d:Ljava/lang/String;

    .line 23
    invoke-static {p1}, Lo/bqk$d;->b(Lo/bqk$d;)Lo/bpv$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/bpv$d;->e()Lo/bpv;

    move-result-object v0

    iput-object v0, p0, Lo/bqk;->a:Lo/bpv;

    .line 24
    invoke-static {p1}, Lo/bqk$d;->d(Lo/bqk$d;)Lo/bqh;

    move-result-object v0

    iput-object v0, p0, Lo/bqk;->e:Lo/bqh;

    .line 25
    return-void
.end method

.method synthetic constructor <init>(Lo/bqk$d;Lo/bqk$2;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lo/bqk;-><init>(Lo/bqk$d;)V

    return-void
.end method

.method static synthetic a(Lo/bqk;)Lo/bqh;
    .locals 1

    .line 12
    iget-object v0, p0, Lo/bqk;->e:Lo/bqh;

    return-object v0
.end method

.method static synthetic b(Lo/bqk;)Lo/bpv;
    .locals 1

    .line 12
    iget-object v0, p0, Lo/bqk;->a:Lo/bpv;

    return-object v0
.end method

.method static synthetic c(Lo/bqk;)Ljava/net/URL;
    .locals 1

    .line 12
    iget-object v0, p0, Lo/bqk;->c:Ljava/net/URL;

    return-object v0
.end method

.method static synthetic e(Lo/bqk;)Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lo/bqk;->d:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a()Lo/bqh;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/bqk;->e:Lo/bqh;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/bqk;->d:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lo/bpv;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/bqk;->a:Lo/bpv;

    return-object v0
.end method

.method public d()Ljava/net/URL;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/bqk;->c:Ljava/net/URL;

    return-object v0
.end method

.method public e()Lo/bqk$d;
    .locals 2

    .line 60
    new-instance v0, Lo/bqk$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/bqk$d;-><init>(Lo/bqk;Lo/bqk$2;)V

    return-object v0
.end method

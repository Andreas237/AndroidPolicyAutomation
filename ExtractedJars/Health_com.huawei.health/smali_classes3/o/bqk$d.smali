.class public Lo/bqk$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bqk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private a:Lo/bpv$d;

.field private c:Ljava/lang/String;

.field private d:Ljava/net/URL;

.field private e:Lo/bqh;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    const-string v0, "GET"

    iput-object v0, p0, Lo/bqk$d;->c:Ljava/lang/String;

    .line 74
    new-instance v0, Lo/bpv$d;

    invoke-direct {v0}, Lo/bpv$d;-><init>()V

    iput-object v0, p0, Lo/bqk$d;->a:Lo/bpv$d;

    .line 75
    return-void
.end method

.method private constructor <init>(Lo/bqk;)V
    .locals 1

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    invoke-static {p1}, Lo/bqk;->c(Lo/bqk;)Ljava/net/URL;

    move-result-object v0

    iput-object v0, p0, Lo/bqk$d;->d:Ljava/net/URL;

    .line 80
    invoke-static {p1}, Lo/bqk;->e(Lo/bqk;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bqk$d;->c:Ljava/lang/String;

    .line 81
    invoke-static {p1}, Lo/bqk;->a(Lo/bqk;)Lo/bqh;

    move-result-object v0

    iput-object v0, p0, Lo/bqk$d;->e:Lo/bqh;

    .line 82
    invoke-static {p1}, Lo/bqk;->b(Lo/bqk;)Lo/bpv;

    move-result-object v0

    invoke-virtual {v0}, Lo/bpv;->d()Lo/bpv$d;

    move-result-object v0

    iput-object v0, p0, Lo/bqk$d;->a:Lo/bpv$d;

    .line 83
    return-void
.end method

.method synthetic constructor <init>(Lo/bqk;Lo/bqk$2;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lo/bqk$d;-><init>(Lo/bqk;)V

    return-void
.end method

.method static synthetic b(Lo/bqk$d;)Lo/bpv$d;
    .locals 1

    .line 64
    iget-object v0, p0, Lo/bqk$d;->a:Lo/bpv$d;

    return-object v0
.end method

.method static synthetic c(Lo/bqk$d;)Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lo/bqk$d;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lo/bqk$d;)Lo/bqh;
    .locals 1

    .line 64
    iget-object v0, p0, Lo/bqk$d;->e:Lo/bqh;

    return-object v0
.end method

.method static synthetic e(Lo/bqk$d;)Ljava/net/URL;
    .locals 1

    .line 64
    iget-object v0, p0, Lo/bqk$d;->d:Ljava/net/URL;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lo/bqk$d;
    .locals 1

    .line 146
    iget-object v0, p0, Lo/bqk$d;->a:Lo/bpv$d;

    invoke-virtual {v0, p1}, Lo/bpv$d;->d(Ljava/lang/String;)Lo/bpv$d;

    .line 147
    return-object p0
.end method

.method public b(Ljava/lang/String;Lo/bqh;)Lo/bqk$d;
    .locals 0

    .line 172
    iput-object p1, p0, Lo/bqk$d;->c:Ljava/lang/String;

    .line 173
    iput-object p2, p0, Lo/bqk$d;->e:Lo/bqh;

    .line 174
    return-object p0
.end method

.method public c()Lo/bqk;
    .locals 2

    .line 179
    iget-object v0, p0, Lo/bqk$d;->d:Ljava/net/URL;

    if-nez v0, :cond_0

    .line 181
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "url == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 183
    :cond_0
    new-instance v0, Lo/bqk;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/bqk;-><init>(Lo/bqk$d;Lo/bqk$2;)V

    return-object v0
.end method

.method public d(Ljava/lang/String;)Lo/bqk$d;
    .locals 5

    .line 102
    if-nez p1, :cond_0

    .line 104
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "url == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 110
    :cond_0
    :try_start_0
    new-instance v3, Ljava/net/URL;

    invoke-direct {v3, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    goto :goto_0

    .line 112
    :catch_0
    move-exception v4

    .line 114
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unexpected url: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 117
    :goto_0
    invoke-virtual {p0, v3}, Lo/bqk$d;->e(Ljava/net/URL;)Lo/bqk$d;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Lo/bqk$d;
    .locals 1

    .line 140
    iget-object v0, p0, Lo/bqk$d;->a:Lo/bpv$d;

    invoke-virtual {v0, p1, p2}, Lo/bpv$d;->a(Ljava/lang/String;Ljava/lang/String;)Lo/bpv$d;

    .line 141
    return-object p0
.end method

.method public d(Lo/bqh;)Lo/bqk$d;
    .locals 1

    .line 166
    const-string v0, "POST"

    invoke-virtual {p0, v0, p1}, Lo/bqk$d;->b(Ljava/lang/String;Lo/bqh;)Lo/bqk$d;

    move-result-object v0

    return-object v0
.end method

.method public e()Lo/bqk$d;
    .locals 2

    .line 161
    const-string v0, "GET"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/bqk$d;->b(Ljava/lang/String;Lo/bqh;)Lo/bqk$d;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/net/URL;)Lo/bqk$d;
    .locals 2

    .line 87
    if-nez p1, :cond_0

    .line 89
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "url == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 91
    :cond_0
    iput-object p1, p0, Lo/bqk$d;->d:Ljava/net/URL;

    .line 92
    return-object p0
.end method

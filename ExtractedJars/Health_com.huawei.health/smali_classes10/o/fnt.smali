.class public abstract Lo/fnt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fnw;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fnt$3;,
        Lo/fnt$d;,
        Lo/fnt$b;
    }
.end annotation


# static fields
.field private static final c:Lo/fty;


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fod;>;"
        }
    .end annotation
.end field

.field private final b:Lo/fnt$b;

.field private final d:Lo/fmt;

.field private final e:Lo/fnt$d;

.field private g:Lo/foq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 47
    const-class v0, Lo/fnt;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fnt;->c:Lo/fty;

    return-void
.end method

.method protected constructor <init>(Lo/fmt;)V
    .locals 2

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Lo/fnt$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/fnt$b;-><init>(Lo/fnt;Lo/fnt$3;)V

    iput-object v0, p0, Lo/fnt;->b:Lo/fnt$b;

    .line 57
    new-instance v0, Lo/fnt$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/fnt$d;-><init>(Lo/fnt;Lo/fnt$3;)V

    iput-object v0, p0, Lo/fnt;->e:Lo/fnt$d;

    .line 58
    iput-object p1, p0, Lo/fnt;->d:Lo/fmt;

    .line 59
    return-void
.end method

.method static synthetic a(Lo/fnt;)Lo/fmt;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/fnt;->d:Lo/fmt;

    return-object v0
.end method

.method static synthetic d()Lo/fty;
    .locals 1

    .line 45
    sget-object v0, Lo/fnt;->c:Lo/fty;

    return-object v0
.end method

.method static synthetic e(Lo/fnt;)Lo/foq;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/fnt;->g:Lo/foq;

    return-object v0
.end method


# virtual methods
.method public a(Lo/fma;)V
    .locals 1

    .line 81
    iget-object v0, p0, Lo/fnt;->b:Lo/fnt$b;

    invoke-virtual {v0, p1}, Lo/fnt$b;->d(Lo/fma;)V

    .line 82
    return-void
.end method

.method public a(Lo/fmb;Lo/fly;)V
    .locals 1

    .line 105
    iget-object v0, p0, Lo/fnt;->e:Lo/fnt$d;

    invoke-virtual {v0, p1, p2}, Lo/fnt$d;->d(Lo/fmb;Lo/fly;)V

    .line 106
    return-void
.end method

.method public b(Lo/fmb;Lo/flo;)V
    .locals 1

    .line 93
    iget-object v0, p0, Lo/fnt;->b:Lo/fnt$b;

    invoke-virtual {v0, p1, p2}, Lo/fnt$b;->c(Lo/fmb;Lo/flo;)V

    .line 94
    return-void
.end method

.method public final c(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 3

    .line 116
    iget-object v0, p0, Lo/fnt;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fod;

    .line 117
    invoke-interface {v2, p1}, Lo/fod;->a(Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 118
    goto :goto_0

    .line 119
    :cond_0
    return-void
.end method

.method public d(Lo/fmb;Lo/flo;)V
    .locals 1

    .line 111
    iget-object v0, p0, Lo/fnt;->e:Lo/fnt$d;

    invoke-virtual {v0, p1, p2}, Lo/fnt$d;->d(Lo/fmb;Lo/flo;)V

    .line 112
    return-void
.end method

.method public final d(Lo/foq;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lo/fnt;->g:Lo/foq;

    .line 124
    return-void
.end method

.method public e(Lo/fmb;Lo/fma;)V
    .locals 1

    .line 99
    iget-object v0, p0, Lo/fnt;->e:Lo/fnt$d;

    invoke-virtual {v0, p1, p2}, Lo/fnt$d;->a(Lo/fmb;Lo/fma;)V

    .line 100
    return-void
.end method

.method protected final e([Lo/fod;)V
    .locals 7

    .line 70
    new-instance v0, Lo/fod$e;

    invoke-direct {v0}, Lo/fod$e;-><init>()V

    iget-object v1, p0, Lo/fnt;->b:Lo/fnt$b;

    invoke-virtual {v0, v1}, Lo/fod$e;->c(Lo/fod;)Lo/fod$e;

    move-result-object v2

    .line 71
    move-object v3, p1

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    aget-object v6, v3, v5

    .line 72
    invoke-virtual {v2, v6}, Lo/fod$e;->c(Lo/fod;)Lo/fod$e;

    .line 71
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 74
    :cond_0
    iget-object v0, p0, Lo/fnt;->e:Lo/fnt$d;

    invoke-virtual {v2, v0}, Lo/fod$e;->c(Lo/fod;)Lo/fod$e;

    .line 75
    invoke-virtual {v2}, Lo/fod$e;->a()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/fnt;->a:Ljava/util/List;

    .line 76
    return-void
.end method

.method public final e()Z
    .locals 1

    .line 128
    iget-object v0, p0, Lo/fnt;->g:Lo/foq;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

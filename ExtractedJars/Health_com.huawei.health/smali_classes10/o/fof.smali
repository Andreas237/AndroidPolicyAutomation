.class public Lo/fof;
.super Lo/fnl;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/Integer;

.field private static final e:Lo/fty;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    const-class v0, Lo/fof;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fof;->e:Lo/fty;

    .line 38
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lo/fof;->b:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Lo/fmw;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lo/fnl;-><init>()V

    .line 47
    return-void
.end method


# virtual methods
.method public a(Lo/fmb;Lo/fly;)V
    .locals 2

    .line 59
    invoke-virtual {p1}, Lo/fmb;->t()Lo/foo;

    move-result-object v1

    .line 60
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lo/foo;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 61
    invoke-virtual {p2}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->L()Z

    move-result v0

    if-nez v0, :cond_0

    .line 63
    invoke-virtual {v1}, Lo/foo;->c()V

    .line 64
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lo/fly;->k(Z)V

    goto :goto_0

    .line 66
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/fly;->k(Z)V

    .line 69
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lo/fof;->b()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->a(Lo/fmb;Lo/fly;)V

    .line 70
    return-void
.end method

.method public d(Lo/fmb;Lo/fly;)V
    .locals 2

    .line 74
    invoke-virtual {p2}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    sget-object v0, Lo/fof;->e:Lo/fty;

    const-string v1, "ignoring notification for canceled TCP Exchange"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 79
    :cond_0
    invoke-virtual {p0}, Lo/fof;->c()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->d(Lo/fmb;Lo/fly;)V

    .line 81
    :goto_0
    return-void
.end method

.method public e(Lo/fmb;Lo/fma;)V
    .locals 2

    .line 51
    sget-object v0, Lo/fof;->b:Ljava/lang/Integer;

    invoke-virtual {p2}, Lo/fma;->f()Lo/flr;

    move-result-object v1

    invoke-virtual {v1}, Lo/flr;->N()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 54
    invoke-virtual {p0}, Lo/fof;->b()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->e(Lo/fmb;Lo/fma;)V

    .line 55
    return-void
.end method

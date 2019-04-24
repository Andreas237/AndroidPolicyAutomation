.class public Lo/fnz;
.super Lo/fnl;
.source "SourceFile"


# static fields
.field private static final a:Lo/fty;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    const-class v0, Lo/fnz;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fnz;->a:Lo/fty;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Lo/fnl;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/fmb;Lo/fma;)V
    .locals 1

    .line 49
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lo/fma;->b(Z)V

    .line 50
    invoke-virtual {p0}, Lo/fnz;->c()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->a(Lo/fmb;Lo/fma;)V

    .line 51
    return-void
.end method

.method public c(Lo/fmb;Lo/flo;)V
    .locals 2

    .line 37
    invoke-virtual {p2}, Lo/flo;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    invoke-virtual {p0}, Lo/fnz;->b()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->c(Lo/fmb;Lo/flo;)V

    goto :goto_0

    .line 43
    :cond_0
    sget-object v0, Lo/fnz;->a:Lo/fty;

    const-string v1, "attempting to send empty message (ACK/RST) in TCP mode {}"

    invoke-interface {v0, v1, p2}, Lo/fty;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    :goto_0
    return-void
.end method

.method public d(Lo/fmb;Lo/flo;)V
    .locals 2

    .line 62
    sget-object v0, Lo/fnz;->a:Lo/fty;

    const-string v1, "discarding empty message received in TCP mode: {}"

    invoke-interface {v0, v1, p2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 63
    return-void
.end method

.method public d(Lo/fmb;Lo/fly;)V
    .locals 1

    .line 55
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lo/fly;->b(Z)V

    .line 56
    invoke-virtual {p0}, Lo/fnz;->c()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->d(Lo/fmb;Lo/fly;)V

    .line 57
    return-void
.end method

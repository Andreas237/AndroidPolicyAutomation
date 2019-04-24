.class public Lo/fnu;
.super Lo/fnt;
.source "SourceFile"


# static fields
.field private static final c:Lo/fty;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 80
    const-class v0, Lo/fnw;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fnu;->c:Lo/fty;

    return-void
.end method

.method public constructor <init>(Lo/fmw;Lo/fmt;)V
    .locals 3

    .line 89
    invoke-direct {p0, p2}, Lo/fnt;-><init>(Lo/fmt;)V

    .line 90
    const/4 v0, 0x4

    new-array v2, v0, [Lo/fod;

    invoke-virtual {p0, p1}, Lo/fnu;->a(Lo/fmw;)Lo/fod;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    invoke-virtual {p0, p1}, Lo/fnu;->d(Lo/fmw;)Lo/fod;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    invoke-virtual {p0, p1}, Lo/fnu;->e(Lo/fmw;)Lo/fod;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v2, v1

    invoke-virtual {p0, p1}, Lo/fnu;->b(Lo/fmw;)Lo/fod;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v2, v1

    .line 96
    invoke-virtual {p0, v2}, Lo/fnu;->e([Lo/fod;)V

    .line 97
    return-void
.end method


# virtual methods
.method protected a(Lo/fmw;)Lo/fod;
    .locals 1

    .line 100
    new-instance v0, Lo/fnx;

    invoke-direct {v0}, Lo/fnx;-><init>()V

    return-object v0
.end method

.method protected b(Lo/fmw;)Lo/fod;
    .locals 4

    .line 113
    const-string v0, "USE_CONGESTION_CONTROL"

    invoke-virtual {p1, v0}, Lo/fmw;->b(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 114
    invoke-static {p1}, Lo/fnv;->a(Lo/fmw;)Lo/fnv;

    move-result-object v3

    .line 115
    sget-object v0, Lo/fnu;->c:Lo/fty;

    const-string v1, "Enabling congestion control: {}"

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 117
    :cond_0
    new-instance v3, Lo/foa;

    invoke-direct {v3, p1}, Lo/foa;-><init>(Lo/fmw;)V

    .line 119
    :goto_0
    return-object v3
.end method

.method protected d(Lo/fmw;)Lo/fod;
    .locals 1

    .line 104
    new-instance v0, Lo/foc;

    invoke-direct {v0, p1}, Lo/foc;-><init>(Lo/fmw;)V

    return-object v0
.end method

.method protected e(Lo/fmw;)Lo/fod;
    .locals 1

    .line 108
    new-instance v0, Lo/fnq;

    invoke-direct {v0, p1}, Lo/fnq;-><init>(Lo/fmw;)V

    return-object v0
.end method

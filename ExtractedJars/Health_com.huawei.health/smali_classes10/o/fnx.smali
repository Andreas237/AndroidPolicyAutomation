.class public Lo/fnx;
.super Lo/fnl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fnx$c;
    }
.end annotation


# static fields
.field private static final c:Lo/fty;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    const-class v0, Lo/fnx;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fnx;->c:Lo/fty;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Lo/fnl;-><init>()V

    .line 47
    return-void
.end method

.method static synthetic d()Lo/fty;
    .locals 1

    .line 29
    sget-object v0, Lo/fnx;->c:Lo/fty;

    return-object v0
.end method


# virtual methods
.method public e(Lo/fmb;Lo/fma;)V
    .locals 1

    .line 43
    new-instance v0, Lo/fnx$c;

    invoke-direct {v0, p1}, Lo/fnx$c;-><init>(Lo/fmb;)V

    invoke-virtual {p2, v0}, Lo/fma;->c(Lo/fls;)V

    .line 44
    invoke-virtual {p0}, Lo/fnx;->b()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->e(Lo/fmb;Lo/fma;)V

    .line 45
    return-void
.end method

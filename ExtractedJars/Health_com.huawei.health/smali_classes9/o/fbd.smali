.class public abstract Lo/fbd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fbd$d;,
        Lo/fbd$e;,
        Lo/fbd$a;,
        Lo/fbd$b;,
        Lo/fbd$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<HistoryModel::Lo/fbm;HistroyModelGroup:THistoryModel;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Lo/fbd$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/fbd<THistoryModel;THistroyModelGroup;>.d;"
        }
    .end annotation
.end field

.field protected e:Lo/fbd$a;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Lo/fbd$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/fbd$d;-><init>(Lo/fbd;Lo/fbd$2;)V

    iput-object v0, p0, Lo/fbd;->a:Lo/fbd$d;

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fbd;->e:Lo/fbd$a;

    return-void
.end method

.method static synthetic d(Lo/fbd;)Lo/fbd$d;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/fbd;->a:Lo/fbd$d;

    return-object v0
.end method

.method static synthetic e(Lo/fbd;Lo/fbh;JJZLo/fbd$b;)V
    .locals 0

    .line 25
    invoke-direct/range {p0 .. p7}, Lo/fbd;->e(Lo/fbh;JJZLo/fbd$b;)V

    return-void
.end method

.method private e(Lo/fbh;JJZLo/fbd$b;)V
    .locals 7

    .line 68
    iget-object v0, p0, Lo/fbd;->e:Lo/fbd$a;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    new-instance v6, Lo/fbd$2;

    invoke-direct {v6, p0, p7, p1, p6}, Lo/fbd$2;-><init>(Lo/fbd;Lo/fbd$b;Lo/fbh;Z)V

    invoke-interface/range {v0 .. v6}, Lo/fbd$a;->e(Lo/fbh;JJLo/fbd$e;)V

    .line 78
    return-void
.end method


# virtual methods
.method public abstract a()Lo/fbd$a;
.end method

.method public a(Lo/fbd$c;)V
    .locals 1

    .line 44
    invoke-virtual {p0}, Lo/fbd;->a()Lo/fbd$a;

    move-result-object v0

    iput-object v0, p0, Lo/fbd;->e:Lo/fbd$a;

    .line 45
    iget-object v0, p0, Lo/fbd;->a:Lo/fbd$d;

    invoke-static {v0}, Lo/fbd$d;->c(Lo/fbd$d;)V

    .line 46
    iget-object v0, p0, Lo/fbd;->a:Lo/fbd$d;

    invoke-virtual {v0, p1}, Lo/fbd$d;->d(Lo/fbd$c;)V

    .line 47
    return-void
.end method

.method protected abstract c()Lo/fbm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()THistroyModelGroup;"
        }
    .end annotation
.end method

.method public c(Lo/fbp;)V
    .locals 0

    .line 55
    invoke-interface {p1}, Lo/fbp;->c()V

    .line 56
    return-void
.end method

.method public c(Lo/fbp;Lo/fbd$b;)V
    .locals 8

    .line 50
    move-object v0, p0

    invoke-interface {p1}, Lo/fbp;->e_()Lo/fbh;

    move-result-object v1

    invoke-virtual {v1}, Lo/fbh;->e()Lo/fbh;

    move-result-object v1

    invoke-interface {p1}, Lo/fbp;->d()J

    move-result-wide v2

    invoke-interface {p1}, Lo/fbp;->b()J

    move-result-wide v4

    move-object v7, p2

    const/4 v6, 0x1

    invoke-direct/range {v0 .. v7}, Lo/fbd;->e(Lo/fbh;JJZLo/fbd$b;)V

    .line 52
    return-void
.end method

.method public d(I)Lo/fbp;
    .locals 1

    .line 85
    iget-object v0, p0, Lo/fbd;->a:Lo/fbd$d;

    invoke-virtual {v0, p1}, Lo/fbd$d;->e(I)Lo/fbp;

    move-result-object v0

    return-object v0
.end method

.method public d()V
    .locals 1

    .line 89
    iget-object v0, p0, Lo/fbd;->a:Lo/fbd$d;

    invoke-virtual {v0}, Lo/fbd$d;->d()V

    .line 90
    return-void
.end method

.method public e()I
    .locals 1

    .line 81
    iget-object v0, p0, Lo/fbd;->a:Lo/fbd$d;

    invoke-virtual {v0}, Lo/fbd$d;->e()I

    move-result v0

    return v0
.end method

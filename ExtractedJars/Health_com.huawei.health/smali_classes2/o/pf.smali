.class public final Lo/pf;
.super Lo/pr;
.source "SourceFile"


# instance fields
.field private final a:[Ljava/lang/String;

.field private final b:[Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:[Ljava/lang/String;

.field private final e:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 6

    .line 31
    move-object v0, p0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/pf;-><init>([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    return-void
.end method

.method constructor <init>([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 39
    sget-object v0, Lo/ps;->d:Lo/ps;

    invoke-direct {p0, v0}, Lo/pr;-><init>(Lo/ps;)V

    .line 40
    iput-object p1, p0, Lo/pf;->d:[Ljava/lang/String;

    .line 41
    iput-object p2, p0, Lo/pf;->a:[Ljava/lang/String;

    .line 42
    iput-object p3, p0, Lo/pf;->b:[Ljava/lang/String;

    .line 43
    iput-object p4, p0, Lo/pf;->e:Ljava/lang/String;

    .line 44
    iput-object p5, p0, Lo/pf;->c:Ljava/lang/String;

    .line 45
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .line 87
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0x1e

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 88
    iget-object v0, p0, Lo/pf;->d:[Ljava/lang/String;

    invoke-static {v0, v1}, Lo/pf;->e([Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 89
    iget-object v0, p0, Lo/pf;->a:[Ljava/lang/String;

    invoke-static {v0, v1}, Lo/pf;->e([Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 90
    iget-object v0, p0, Lo/pf;->b:[Ljava/lang/String;

    invoke-static {v0, v1}, Lo/pf;->e([Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 91
    iget-object v0, p0, Lo/pf;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/pf;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 92
    iget-object v0, p0, Lo/pf;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/pf;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 93
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

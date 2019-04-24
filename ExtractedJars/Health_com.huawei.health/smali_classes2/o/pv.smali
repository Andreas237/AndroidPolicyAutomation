.class public final Lo/pv;
.super Lo/pr;
.source "SourceFile"


# instance fields
.field private final a:[Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 33
    sget-object v0, Lo/ps;->f:Lo/ps;

    invoke-direct {p0, v0}, Lo/pr;-><init>(Lo/ps;)V

    .line 34
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iput-object v0, p0, Lo/pv;->a:[Ljava/lang/String;

    .line 35
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    iput-object v0, p0, Lo/pv;->d:[Ljava/lang/String;

    .line 36
    iput-object p3, p0, Lo/pv;->c:Ljava/lang/String;

    .line 37
    iput-object p4, p0, Lo/pv;->b:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public constructor <init>([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 44
    sget-object v0, Lo/ps;->f:Lo/ps;

    invoke-direct {p0, v0}, Lo/pr;-><init>(Lo/ps;)V

    .line 45
    iput-object p1, p0, Lo/pv;->a:[Ljava/lang/String;

    .line 46
    iput-object p2, p0, Lo/pv;->d:[Ljava/lang/String;

    .line 47
    iput-object p3, p0, Lo/pv;->c:Ljava/lang/String;

    .line 48
    iput-object p4, p0, Lo/pv;->b:Ljava/lang/String;

    .line 49
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .line 104
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0x64

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 105
    iget-object v0, p0, Lo/pv;->a:[Ljava/lang/String;

    invoke-static {v0, v1}, Lo/pv;->e([Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 106
    iget-object v0, p0, Lo/pv;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/pv;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 107
    iget-object v0, p0, Lo/pv;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/pv;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 108
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

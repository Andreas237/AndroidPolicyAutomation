.class public Lo/eds;
.super Lo/dqz;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:Ljava/lang/String;

.field private i:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 16
    invoke-direct {p0}, Lo/dqz;-><init>()V

    .line 9
    const/4 v0, 0x3

    iput v0, p0, Lo/eds;->a:I

    .line 10
    const/4 v0, 0x0

    iput v0, p0, Lo/eds;->d:I

    .line 11
    const-string v0, ""

    iput-object v0, p0, Lo/eds;->c:Ljava/lang/String;

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lo/eds;->e:Ljava/lang/String;

    .line 13
    const-string v0, ""

    iput-object v0, p0, Lo/eds;->b:Ljava/lang/String;

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lo/eds;->i:Ljava/lang/String;

    .line 17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/eds;->a:I

    .line 18
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 39
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/eds;->c:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/eds;->c:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public e()I
    .locals 1

    .line 26
    iget v0, p0, Lo/eds;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

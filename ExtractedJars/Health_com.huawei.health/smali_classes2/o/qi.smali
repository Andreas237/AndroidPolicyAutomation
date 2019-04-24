.class public final Lo/qi;
.super Lo/pr;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Z

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 34
    sget-object v0, Lo/ps;->g:Lo/ps;

    invoke-direct {p0, v0}, Lo/pr;-><init>(Lo/ps;)V

    .line 35
    iput-object p2, p0, Lo/qi;->a:Ljava/lang/String;

    .line 36
    iput-object p1, p0, Lo/qi;->c:Ljava/lang/String;

    .line 37
    iput-object p3, p0, Lo/qi;->d:Ljava/lang/String;

    .line 38
    iput-boolean p4, p0, Lo/qi;->b:Z

    .line 39
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0x50

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 60
    iget-object v0, p0, Lo/qi;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/qi;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 61
    iget-object v0, p0, Lo/qi;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/qi;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 62
    iget-object v0, p0, Lo/qi;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/qi;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 63
    iget-boolean v0, p0, Lo/qi;->b:Z

    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lo/qi;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

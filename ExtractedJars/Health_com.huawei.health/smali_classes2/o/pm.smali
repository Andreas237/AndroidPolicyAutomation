.class public final Lo/pm;
.super Lo/pr;
.source "SourceFile"


# instance fields
.field private final a:D

.field private final c:D

.field private final d:D

.field private final e:Ljava/lang/String;


# direct methods
.method constructor <init>(DDDLjava/lang/String;)V
    .locals 1

    .line 30
    sget-object v0, Lo/ps;->h:Lo/ps;

    invoke-direct {p0, v0}, Lo/pr;-><init>(Lo/ps;)V

    .line 31
    iput-wide p1, p0, Lo/pm;->c:D

    .line 32
    iput-wide p3, p0, Lo/pm;->a:D

    .line 33
    iput-wide p5, p0, Lo/pm;->d:D

    .line 34
    iput-object p7, p0, Lo/pm;->e:Ljava/lang/String;

    .line 35
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 5

    .line 84
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v0, 0x14

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 85
    iget-wide v0, p0, Lo/pm;->c:D

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 86
    const-string v0, ", "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    iget-wide v0, p0, Lo/pm;->a:D

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 88
    iget-wide v0, p0, Lo/pm;->d:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 89
    const-string v0, ", "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    iget-wide v0, p0, Lo/pm;->d:D

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 91
    const/16 v0, 0x6d

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 93
    :cond_0
    iget-object v0, p0, Lo/pm;->e:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 94
    const-string v0, " ("

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    iget-object v0, p0, Lo/pm;->e:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    const/16 v0, 0x29

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 98
    :cond_1
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

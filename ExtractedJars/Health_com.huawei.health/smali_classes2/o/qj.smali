.class public final Lo/qj;
.super Lo/pr;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:I

.field private final k:C


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ICLjava/lang/String;)V
    .locals 1

    .line 42
    sget-object v0, Lo/ps;->o:Lo/ps;

    invoke-direct {p0, v0}, Lo/pr;-><init>(Lo/ps;)V

    .line 43
    iput-object p1, p0, Lo/qj;->e:Ljava/lang/String;

    .line 44
    iput-object p2, p0, Lo/qj;->a:Ljava/lang/String;

    .line 45
    iput-object p3, p0, Lo/qj;->b:Ljava/lang/String;

    .line 46
    iput-object p4, p0, Lo/qj;->d:Ljava/lang/String;

    .line 47
    iput-object p5, p0, Lo/qj;->c:Ljava/lang/String;

    .line 48
    iput-object p6, p0, Lo/qj;->h:Ljava/lang/String;

    .line 49
    iput p7, p0, Lo/qj;->i:I

    .line 50
    iput-char p8, p0, Lo/qj;->k:C

    .line 51
    iput-object p9, p0, Lo/qj;->f:Ljava/lang/String;

    .line 52
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 3

    .line 92
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v0, 0x32

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 93
    iget-object v0, p0, Lo/qj;->a:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    iget-object v0, p0, Lo/qj;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 95
    iget-object v0, p0, Lo/qj;->d:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 96
    iget-object v0, p0, Lo/qj;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lo/qj;->c:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 99
    :cond_0
    iget v0, p0, Lo/qj;->i:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 100
    iget-char v0, p0, Lo/qj;->k:C

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 101
    iget-object v0, p0, Lo/qj;->f:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 102
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

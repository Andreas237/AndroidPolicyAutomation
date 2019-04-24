.class public final Lo/ftk;
.super Lo/ftn;
.source "SourceFile"

# interfaces
.implements Lo/ftc;


# instance fields
.field private final a:Lo/ftp;

.field private final d:Lo/fsz;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 50
    new-instance v0, Lo/ftm;

    invoke-direct {v0, p1}, Lo/ftm;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lo/ftp;->b(Ljava/lang/String;)Lo/ftp;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/ftk;-><init>(Lo/fsz;Lo/ftp;)V

    .line 51
    return-void
.end method

.method constructor <init>(Lo/fsz;Lo/ftp;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Lo/ftn;-><init>()V

    .line 54
    iput-object p1, p0, Lo/ftk;->d:Lo/fsz;

    .line 55
    iput-object p2, p0, Lo/ftk;->a:Lo/ftp;

    .line 56
    return-void
.end method


# virtual methods
.method public c()Lo/fsz;
    .locals 1

    .line 69
    iget-object v0, p0, Lo/ftk;->d:Lo/fsz;

    return-object v0
.end method

.method public e()Lo/ftp;
    .locals 1

    .line 119
    iget-object v0, p0, Lo/ftk;->a:Lo/ftp;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    .line 74
    const/4 v0, 0x0

    return v0
.end method

.method public m()Lo/ftb;
    .locals 1

    .line 124
    invoke-virtual {p0}, Lo/ftk;->c()Lo/fsz;

    move-result-object v0

    return-object v0
.end method

.method public o()Lo/fth;
    .locals 1

    .line 79
    const/4 v0, 0x0

    return-object v0
.end method

.method public p()Lo/fti;
    .locals 1

    .line 84
    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 60
    iget-object v0, p0, Lo/ftk;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lo/ftk;->c:Ljava/lang/String;

    return-object v0

    .line 63
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/ftk;->d:Lo/fsz;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ftk;->a:Lo/ftp;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ftk;->c:Ljava/lang/String;

    .line 64
    iget-object v0, p0, Lo/ftk;->c:Ljava/lang/String;

    return-object v0
.end method

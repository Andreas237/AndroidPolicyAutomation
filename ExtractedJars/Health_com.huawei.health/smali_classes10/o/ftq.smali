.class public final Lo/ftq;
.super Lo/ftn;
.source "SourceFile"

# interfaces
.implements Lo/fti;


# instance fields
.field private final d:Lo/ftp;

.field private final e:Lo/fth;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 44
    new-instance v0, Lo/ftl;

    invoke-direct {v0, p1, p2}, Lo/ftl;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p3}, Lo/ftp;->b(Ljava/lang/String;)Lo/ftp;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/ftq;-><init>(Lo/fth;Lo/ftp;)V

    .line 45
    return-void
.end method

.method constructor <init>(Lo/fth;Lo/ftp;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lo/ftn;-><init>()V

    .line 48
    iput-object p1, p0, Lo/ftq;->e:Lo/fth;

    .line 49
    iput-object p2, p0, Lo/ftq;->d:Lo/ftp;

    .line 50
    return-void
.end method


# virtual methods
.method public c()Lo/ftr;
    .locals 1

    .line 152
    iget-object v0, p0, Lo/ftq;->e:Lo/fth;

    invoke-interface {v0}, Lo/fth;->c()Lo/ftr;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lo/ftp;
    .locals 1

    .line 137
    iget-object v0, p0, Lo/ftq;->d:Lo/ftp;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    .line 82
    const/4 v0, 0x0

    return v0
.end method

.method public l()Lo/fth;
    .locals 1

    .line 72
    iget-object v0, p0, Lo/ftq;->e:Lo/fth;

    return-object v0
.end method

.method public m()Lo/ftb;
    .locals 1

    .line 142
    invoke-virtual {p0}, Lo/ftq;->l()Lo/fth;

    move-result-object v0

    return-object v0
.end method

.method public o()Lo/fth;
    .locals 1

    .line 87
    invoke-virtual {p0}, Lo/ftq;->l()Lo/fth;

    move-result-object v0

    return-object v0
.end method

.method public p()Lo/fti;
    .locals 0

    .line 92
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 54
    iget-object v0, p0, Lo/ftq;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 55
    iget-object v0, p0, Lo/ftq;->c:Ljava/lang/String;

    return-object v0

    .line 57
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/ftq;->e:Lo/fth;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ftq;->d:Lo/ftp;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ftq;->c:Ljava/lang/String;

    .line 58
    iget-object v0, p0, Lo/ftq;->c:Ljava/lang/String;

    return-object v0
.end method

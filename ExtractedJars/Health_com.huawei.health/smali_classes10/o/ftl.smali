.class public final Lo/ftl;
.super Lo/ftn;
.source "SourceFile"

# interfaces
.implements Lo/fth;


# instance fields
.field private final a:Lo/fsz;

.field private final e:Lo/ftr;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 45
    invoke-direct {p0}, Lo/ftn;-><init>()V

    .line 46
    new-instance v0, Lo/ftm;

    invoke-direct {v0, p2}, Lo/ftm;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/ftl;->a:Lo/fsz;

    .line 47
    invoke-static {p1}, Lo/ftr;->c(Ljava/lang/String;)Lo/ftr;

    move-result-object v0

    iput-object v0, p0, Lo/ftl;->e:Lo/ftr;

    .line 48
    return-void
.end method


# virtual methods
.method public final c()Lo/ftr;
    .locals 1

    .line 57
    iget-object v0, p0, Lo/ftl;->e:Lo/ftr;

    return-object v0
.end method

.method public h()Z
    .locals 1

    .line 130
    const/4 v0, 0x1

    return v0
.end method

.method public m()Lo/ftb;
    .locals 0

    .line 125
    return-object p0
.end method

.method public o()Lo/fth;
    .locals 0

    .line 80
    return-object p0
.end method

.method public p()Lo/fti;
    .locals 1

    .line 85
    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 62
    iget-object v0, p0, Lo/ftl;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 63
    iget-object v0, p0, Lo/ftl;->c:Ljava/lang/String;

    return-object v0

    .line 65
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lo/ftl;->c()Lo/ftr;

    move-result-object v1

    invoke-virtual {v1}, Lo/ftr;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ftl;->a:Lo/fsz;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ftl;->c:Ljava/lang/String;

    .line 66
    iget-object v0, p0, Lo/ftl;->c:Ljava/lang/String;

    return-object v0
.end method

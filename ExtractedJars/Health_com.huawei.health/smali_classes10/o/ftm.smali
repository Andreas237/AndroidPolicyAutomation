.class public final Lo/ftm;
.super Lo/ftn;
.source "SourceFile"

# interfaces
.implements Lo/fsz;


# instance fields
.field protected final e:Lo/fto;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 41
    invoke-static {p1}, Lo/fto;->e(Ljava/lang/String;)Lo/fto;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/ftm;-><init>(Lo/fto;)V

    .line 42
    return-void
.end method

.method constructor <init>(Lo/fto;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lo/ftn;-><init>()V

    .line 45
    iput-object p1, p0, Lo/ftm;->e:Lo/fto;

    .line 46
    return-void
.end method


# virtual methods
.method public h()Z
    .locals 1

    .line 78
    const/4 v0, 0x1

    return v0
.end method

.method public m()Lo/ftb;
    .locals 0

    .line 118
    return-object p0
.end method

.method public o()Lo/fth;
    .locals 1

    .line 83
    const/4 v0, 0x0

    return-object v0
.end method

.method public p()Lo/fti;
    .locals 1

    .line 88
    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/ftm;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 59
    iget-object v0, p0, Lo/ftm;->c:Ljava/lang/String;

    return-object v0

    .line 61
    :cond_0
    iget-object v0, p0, Lo/ftm;->e:Lo/fto;

    invoke-virtual {v0}, Lo/fto;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ftm;->c:Ljava/lang/String;

    .line 62
    iget-object v0, p0, Lo/ftm;->c:Ljava/lang/String;

    return-object v0
.end method

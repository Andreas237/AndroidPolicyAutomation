.class public Lo/aiu;
.super Lo/air;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/Integer;

.field private c:Ljava/lang/String;

.field private e:Ljava/lang/Integer;

.field private f:Ljava/lang/Integer;

.field private h:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lo/air;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Long;
    .locals 1

    .line 51
    iget-object v0, p0, Lo/aiu;->h:Ljava/lang/Long;

    return-object v0
.end method

.method public b()Ljava/lang/Integer;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/aiu;->b:Ljava/lang/Integer;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lo/aiu;->a:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/aiu;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/Integer;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lo/aiu;->f:Ljava/lang/Integer;

    .line 84
    return-void
.end method

.method public c(Ljava/lang/Long;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lo/aiu;->h:Ljava/lang/Long;

    .line 56
    return-void
.end method

.method public d()Ljava/lang/Integer;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/aiu;->e:Ljava/lang/Integer;

    return-object v0
.end method

.method public d(Ljava/lang/Integer;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lo/aiu;->b:Ljava/lang/Integer;

    .line 40
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/aiu;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/Integer;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lo/aiu;->e:Ljava/lang/Integer;

    .line 64
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lo/aiu;->c:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public h()Ljava/lang/Integer;
    .locals 1

    .line 79
    iget-object v0, p0, Lo/aiu;->f:Ljava/lang/Integer;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 68
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, "CoapSessionResponseOEntityModel{"

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 69
    const-string v0, "errcode="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/aiu;->e:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 71
    const-string v0, ", modeResp="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/aiu;->b:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 74
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 75
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

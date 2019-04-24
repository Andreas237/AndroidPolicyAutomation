.class public Lo/frh;
.super Lo/frf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/frh$d;
    }
.end annotation


# instance fields
.field private final b:Lo/frh$d;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 39
    invoke-static {p1}, Lo/frh$d;->a(I)Lo/frh$d;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/frh;-><init>(Lo/frh$d;)V

    .line 40
    return-void
.end method

.method public constructor <init>(Lo/frh$d;)V
    .locals 2

    .line 43
    sget-object v0, Lo/frf$b;->c:Lo/frf$b;

    invoke-direct {p0, v0}, Lo/frf;-><init>(Lo/frf$b;)V

    .line 44
    if-nez p1, :cond_0

    .line 45
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Length must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 47
    :cond_0
    iput-object p1, p0, Lo/frh;->b:Lo/frh$d;

    .line 48
    return-void
.end method

.method static final b([BLjava/net/InetSocketAddress;)Lo/frh;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 71
    new-instance v5, Lo/fpq;

    invoke-direct {v5, p0}, Lo/fpq;-><init>([B)V

    .line 72
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Lo/fpq;->c(I)I

    move-result v6

    .line 73
    invoke-static {v6}, Lo/frh$d;->a(I)Lo/frh$d;

    move-result-object v7

    .line 74
    if-eqz v7, :cond_0

    .line 75
    new-instance v0, Lo/frh;

    invoke-direct {v0, v7}, Lo/frh;-><init>(Lo/frh$d;)V

    return-object v0

    .line 77
    :cond_0
    new-instance v0, Lo/fqx;

    const-string v1, "Peer uses unknown code [%d] in %s extension"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, Lo/frf$b;->c:Lo/frf$b;

    invoke-virtual {v3}, Lo/frf$b;->name()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->o:Lo/fqb$b;

    invoke-direct {v2, v3, v4, p1}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 57
    const/4 v0, 0x5

    return v0
.end method

.method public c()Lo/frh$d;
    .locals 1

    .line 51
    iget-object v0, p0, Lo/frh;->b:Lo/frh$d;

    return-object v0
.end method

.method protected e(Lo/fpp;)V
    .locals 2

    .line 90
    const/4 v0, 0x1

    const/16 v1, 0x10

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 91
    iget-object v0, p0, Lo/frh;->b:Lo/frh$d;

    invoke-static {v0}, Lo/frh$d;->a(Lo/frh$d;)I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 92
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 96
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-super {p0}, Lo/frf;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    const-string v0, "\t\t\t\tCode: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frh;->b:Lo/frh$d;

    invoke-virtual {v1}, Lo/frh$d;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frh;->b:Lo/frh$d;

    invoke-virtual {v1}, Lo/frh$d;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " bytes)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

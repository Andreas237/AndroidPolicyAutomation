.class public Lo/axr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:J

.field private f:Z

.field private g:I

.field private h:Ljava/lang/String;

.field private k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    const-string v0, "AccountInfo"

    sput-object v0, Lo/axr;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/axr;->c:Ljava/lang/String;

    .line 29
    const/4 v0, 0x0

    iput v0, p0, Lo/axr;->d:I

    .line 34
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/axr;->e:J

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/axr;->b:Ljava/lang/String;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/axr;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 112
    iget-object v0, p0, Lo/axr;->k:Ljava/lang/String;

    .line 113
    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V
    .locals 3

    .line 71
    sget-object v0, Lo/axr;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setAccountInfo authAccount "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " serviceToken:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " deviceId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " deviceType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " siteId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ita:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    iput-object p1, p0, Lo/axr;->b:Ljava/lang/String;

    .line 73
    iput-object p2, p0, Lo/axr;->c:Ljava/lang/String;

    .line 74
    iput-object p3, p0, Lo/axr;->k:Ljava/lang/String;

    .line 75
    iput p4, p0, Lo/axr;->g:I

    .line 76
    iput p5, p0, Lo/axr;->d:I

    .line 77
    iput-boolean p6, p0, Lo/axr;->f:Z

    .line 78
    return-void
.end method

.method public b()J
    .locals 2

    .line 95
    iget-wide v0, p0, Lo/axr;->e:J

    .line 96
    return-wide v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lo/axr;->h:Ljava/lang/String;

    .line 136
    return-void
.end method

.method public c()I
    .locals 1

    .line 82
    iget v0, p0, Lo/axr;->d:I

    .line 83
    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 4

    .line 88
    iget-object v3, p0, Lo/axr;->c:Ljava/lang/String;

    .line 89
    const-string v0, "AccountInfo"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "st:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    return-object v3
.end method

.method public e()I
    .locals 1

    .line 118
    iget v0, p0, Lo/axr;->g:I

    .line 119
    return v0
.end method

.method public e(J)V
    .locals 0

    .line 101
    iput-wide p1, p0, Lo/axr;->e:J

    .line 102
    return-void
.end method

.method public h()Z
    .locals 1

    .line 124
    iget-boolean v0, p0, Lo/axr;->f:Z

    .line 125
    return v0
.end method

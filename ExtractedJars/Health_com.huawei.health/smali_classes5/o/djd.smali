.class public Lo/djd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:J

.field private c:Ljava/lang/String;

.field private d:J

.field private e:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const/4 v0, 0x0

    iput-object v0, p0, Lo/djd;->c:Ljava/lang/String;

    .line 8
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/djd;->d:J

    .line 9
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/djd;->e:J

    .line 10
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/djd;->b:J

    .line 20
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/djd;->e:J

    .line 21
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/djd;->d:J

    .line 22
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/djd;->b:J

    .line 23
    iput-object p1, p0, Lo/djd;->c:Ljava/lang/String;

    .line 24
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JJJ)V
    .locals 2

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const/4 v0, 0x0

    iput-object v0, p0, Lo/djd;->c:Ljava/lang/String;

    .line 8
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/djd;->d:J

    .line 9
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/djd;->e:J

    .line 10
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/djd;->b:J

    .line 13
    iput-object p1, p0, Lo/djd;->c:Ljava/lang/String;

    .line 14
    iput-wide p4, p0, Lo/djd;->e:J

    .line 15
    iput-wide p2, p0, Lo/djd;->d:J

    .line 16
    iput-wide p6, p0, Lo/djd;->b:J

    .line 17
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/djd;->c:Ljava/lang/String;

    return-object v0
.end method

.method public a(J)V
    .locals 2

    .line 32
    iget-wide v0, p0, Lo/djd;->e:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lo/djd;->e:J

    .line 33
    iget-wide v0, p0, Lo/djd;->b:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lo/djd;->b:J

    .line 34
    return-void
.end method

.method public b()J
    .locals 2

    .line 37
    iget-wide v0, p0, Lo/djd;->e:J

    return-wide v0
.end method

.method public b(J)V
    .locals 0

    .line 58
    iput-wide p1, p0, Lo/djd;->d:J

    .line 59
    return-void
.end method

.method public c(J)V
    .locals 0

    .line 62
    iput-wide p1, p0, Lo/djd;->b:J

    .line 63
    return-void
.end method

.method public d()J
    .locals 2

    .line 41
    iget-wide v0, p0, Lo/djd;->d:J

    return-wide v0
.end method

.method public d(J)V
    .locals 0

    .line 54
    iput-wide p1, p0, Lo/djd;->e:J

    .line 55
    return-void
.end method

.method public e()J
    .locals 2

    .line 45
    iget-wide v0, p0, Lo/djd;->b:J

    return-wide v0
.end method

.method public e(J)V
    .locals 2

    .line 27
    iget-wide v0, p0, Lo/djd;->d:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lo/djd;->d:J

    .line 28
    iget-wide v0, p0, Lo/djd;->b:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lo/djd;->b:J

    .line 29
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 71
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 72
    const-string v0, "date: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 73
    iget-object v0, p0, Lo/djd;->c:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 74
    const-string v0, " received: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 75
    iget-wide v0, p0, Lo/djd;->e:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 76
    const-string v0, " requested: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 77
    iget-wide v0, p0, Lo/djd;->d:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 78
    const-string v0, " total: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 79
    iget-wide v0, p0, Lo/djd;->b:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 80
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public Lo/bag;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bag$c;
    }
.end annotation


# instance fields
.field private a:J

.field private b:J

.field private d:Lo/bag$c;

.field private e:J


# direct methods
.method public constructor <init>(Lo/bag$c;)V
    .locals 2

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lo/bag;->d:Lo/bag$c;

    .line 51
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/bag;->b:J

    .line 52
    return-void
.end method


# virtual methods
.method public a()Lo/bag$c;
    .locals 1

    .line 61
    iget-object v0, p0, Lo/bag;->d:Lo/bag$c;

    return-object v0
.end method

.method public b()V
    .locals 2

    .line 103
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/bag;->b:J

    .line 104
    return-void
.end method

.method public d()J
    .locals 6

    .line 93
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 94
    iget-wide v0, p0, Lo/bag;->b:J

    sub-long v4, v2, v0

    .line 95
    const-wide/16 v0, 0x7530

    cmp-long v0, v0, v4

    if-lez v0, :cond_0

    const-wide/16 v0, 0x7530

    sub-long/2addr v0, v4

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public d(JJ)V
    .locals 0

    .line 82
    iput-wide p1, p0, Lo/bag;->a:J

    .line 83
    iput-wide p3, p0, Lo/bag;->e:J

    .line 84
    return-void
.end method

.method public e()J
    .locals 2

    .line 71
    iget-wide v0, p0, Lo/bag;->e:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 109
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 110
    iget-object v0, p0, Lo/bag;->d:Lo/bag$c;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lo/bag;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lo/bag;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 111
    const-string v0, "}"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 112
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

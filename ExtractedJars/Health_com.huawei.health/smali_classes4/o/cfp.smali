.class public Lo/cfp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Lo/cdx;


# instance fields
.field private b:J

.field private e:D


# direct methods
.method public constructor <init>(JD)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-wide p1, p0, Lo/cfp;->b:J

    .line 20
    iput-wide p3, p0, Lo/cfp;->e:D

    .line 21
    return-void
.end method


# virtual methods
.method public d()D
    .locals 2

    .line 24
    iget-wide v0, p0, Lo/cfp;->e:D

    return-wide v0
.end method

.method public e()J
    .locals 2

    .line 33
    iget-wide v0, p0, Lo/cfp;->b:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, p0, Lo/cfp;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/cfp;->e:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

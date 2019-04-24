.class public Lo/cev;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Lo/cdx;


# instance fields
.field private a:J

.field private d:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    return-void
.end method

.method public constructor <init>(JI)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-wide p1, p0, Lo/cev;->a:J

    .line 30
    iput p3, p0, Lo/cev;->d:I

    .line 31
    return-void
.end method


# virtual methods
.method public b(J)V
    .locals 0

    .line 40
    iput-wide p1, p0, Lo/cev;->a:J

    .line 41
    return-void
.end method

.method public c()I
    .locals 1

    .line 45
    iget v0, p0, Lo/cev;->d:I

    return v0
.end method

.method public e()J
    .locals 2

    .line 35
    iget-wide v0, p0, Lo/cev;->a:J

    return-wide v0
.end method

.method public e(I)V
    .locals 0

    .line 50
    iput p1, p0, Lo/cev;->d:I

    .line 51
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 57
    new-instance v3, Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, p0, Lo/cev;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    invoke-static {}, Lo/dho;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 61
    iget v0, p0, Lo/cev;->d:I

    if-nez v0, :cond_0

    .line 62
    const-string v0, "-"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 64
    :cond_0
    const-string v0, "*"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 67
    :cond_1
    iget v0, p0, Lo/cev;->d:I

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    :goto_0
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

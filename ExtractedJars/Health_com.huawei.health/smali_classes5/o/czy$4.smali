.class final Lo/czy$4;
.super Lo/czy$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/czy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:Z

.field final synthetic d:J

.field final synthetic e:J


# virtual methods
.method public a()Z
    .locals 1

    .line 70
    iget-boolean v0, p0, Lo/czy$4;->b:Z

    return v0
.end method

.method public c()J
    .locals 2

    .line 60
    iget-wide v0, p0, Lo/czy$4;->d:J

    return-wide v0
.end method

.method public d()J
    .locals 2

    .line 55
    iget-wide v0, p0, Lo/czy$4;->e:J

    return-wide v0
.end method

.method public e()F
    .locals 1

    .line 65
    iget v0, p0, Lo/czy$4;->a:F

    return v0
.end method

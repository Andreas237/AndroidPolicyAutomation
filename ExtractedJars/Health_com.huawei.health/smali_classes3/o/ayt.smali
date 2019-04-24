.class public Lo/ayt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private volatile c:Z

.field private volatile d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ayt;->c:Z

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    .line 61
    iput-boolean p1, p0, Lo/ayt;->c:Z

    .line 62
    if-eqz p1, :cond_0

    .line 64
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/ayt;->a:J

    .line 66
    :cond_0
    return-void
.end method

.method public a()Z
    .locals 1

    .line 33
    iget-boolean v0, p0, Lo/ayt;->c:Z

    return v0
.end method

.method public b()Z
    .locals 7

    .line 43
    const/4 v4, 0x0

    .line 44
    iget-boolean v0, p0, Lo/ayt;->c:Z

    if-eqz v0, :cond_1

    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lo/ayt;->a:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xbb8

    add-long v5, v0, v2

    .line 47
    iget v0, p0, Lo/ayt;->d:I

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    cmp-long v0, v5, v0

    if-gez v0, :cond_0

    .line 49
    const/4 v4, 0x1

    goto :goto_0

    .line 53
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ayt;->a(Z)V

    .line 56
    :cond_1
    :goto_0
    return v4
.end method

.method public c(I)V
    .locals 0

    .line 28
    iput p1, p0, Lo/ayt;->d:I

    .line 29
    return-void
.end method

.method public g()V
    .locals 1

    .line 75
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ayt;->a(Z)V

    .line 76
    return-void
.end method

.class public Lo/cab;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:J

.field private e:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-wide p1, p0, Lo/cab;->e:J

    .line 17
    return-void
.end method


# virtual methods
.method public c(J)I
    .locals 4

    .line 24
    iget-wide v0, p0, Lo/cab;->b:J

    sub-long v2, p1, v0

    .line 25
    iget-wide v0, p0, Lo/cab;->e:J

    cmp-long v0, v2, v0

    if-ltz v0, :cond_0

    .line 26
    iput-wide p1, p0, Lo/cab;->b:J

    .line 27
    const/4 v0, 0x1

    return v0

    .line 29
    :cond_0
    const/4 v0, 0x2

    return v0
.end method

.method public e(J)V
    .locals 0

    .line 20
    iput-wide p1, p0, Lo/cab;->b:J

    .line 21
    return-void
.end method

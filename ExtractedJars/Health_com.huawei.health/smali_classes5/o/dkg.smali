.class public Lo/dkg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:I

.field private c:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 26
    iput p1, p0, Lo/dkg;->b:I

    .line 27
    return-void
.end method

.method public b()J
    .locals 2

    .line 38
    iget-wide v0, p0, Lo/dkg;->c:J

    return-wide v0
.end method

.method public b(J)V
    .locals 0

    .line 42
    iput-wide p1, p0, Lo/dkg;->c:J

    .line 43
    return-void
.end method

.method public c()I
    .locals 1

    .line 22
    iget v0, p0, Lo/dkg;->b:I

    return v0
.end method

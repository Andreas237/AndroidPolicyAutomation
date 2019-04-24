.class public Lo/dka;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:[D

.field private e:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()J
    .locals 2

    .line 12
    iget-wide v0, p0, Lo/dka;->e:J

    return-wide v0
.end method

.method public c([D)V
    .locals 1

    .line 24
    invoke-virtual {p1}, [D->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    iput-object v0, p0, Lo/dka;->a:[D

    .line 25
    return-void
.end method

.method public d()[D
    .locals 1

    .line 20
    iget-object v0, p0, Lo/dka;->a:[D

    invoke-virtual {v0}, [D->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    return-object v0
.end method

.method public e(J)V
    .locals 0

    .line 16
    iput-wide p1, p0, Lo/dka;->e:J

    .line 17
    return-void
.end method

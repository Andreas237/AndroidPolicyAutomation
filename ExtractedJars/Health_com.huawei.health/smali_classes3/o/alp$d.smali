.class Lo/alp$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/alp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field c:J

.field d:D


# direct methods
.method constructor <init>()V
    .locals 2

    .line 189
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 190
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/alp$d;->c:J

    .line 191
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/alp$d;->d:D

    return-void
.end method


# virtual methods
.method b()V
    .locals 2

    .line 211
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/alp$d;->c:J

    .line 212
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/alp$d;->d:D

    .line 213
    return-void
.end method

.method c(D)V
    .locals 2

    .line 216
    iget-wide v0, p0, Lo/alp$d;->d:D

    add-double/2addr v0, p1

    iput-wide v0, p0, Lo/alp$d;->d:D

    .line 217
    return-void
.end method

.method d(JD)V
    .locals 2

    .line 204
    invoke-static {p1, p2}, Lo/amz;->c(J)J

    move-result-wide v0

    iput-wide v0, p0, Lo/alp$d;->c:J

    .line 205
    iput-wide p3, p0, Lo/alp$d;->d:D

    .line 206
    return-void
.end method

.method public e()J
    .locals 2

    .line 193
    iget-wide v0, p0, Lo/alp$d;->c:J

    return-wide v0
.end method

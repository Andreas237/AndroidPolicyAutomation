.class final Lo/dzr$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dzr;->b(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/dyx;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 540
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lo/dyx;Lo/dyx;)I
    .locals 4

    .line 542
    invoke-virtual {p1}, Lo/dyx;->c()J

    move-result-wide v0

    invoke-virtual {p2}, Lo/dyx;->c()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 543
    const/4 v0, 0x1

    return v0

    .line 544
    :cond_0
    invoke-virtual {p1}, Lo/dyx;->c()J

    move-result-wide v0

    invoke-virtual {p2}, Lo/dyx;->c()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 545
    const/4 v0, 0x0

    return v0

    .line 547
    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 540
    move-object v0, p1

    check-cast v0, Lo/dyx;

    move-object v1, p2

    check-cast v1, Lo/dyx;

    invoke-virtual {p0, v0, v1}, Lo/dzr$1;->c(Lo/dyx;Lo/dyx;)I

    move-result v0

    return v0
.end method

.class final Lo/fbm$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fbm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/fbm;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 23
    move-object v0, p1

    check-cast v0, Lo/fbm;

    move-object v1, p2

    check-cast v1, Lo/fbm;

    invoke-virtual {p0, v0, v1}, Lo/fbm$3;->e(Lo/fbm;Lo/fbm;)I

    move-result v0

    return v0
.end method

.method public e(Lo/fbm;Lo/fbm;)I
    .locals 6

    .line 26
    invoke-interface {p1}, Lo/fbm;->e_()Lo/fbh;

    move-result-object v4

    .line 27
    invoke-interface {p2}, Lo/fbm;->e_()Lo/fbh;

    move-result-object v5

    .line 28
    if-eq v4, v5, :cond_0

    .line 30
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "userView1 diff userView2"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 33
    :cond_0
    invoke-interface {p1}, Lo/fbm;->d()J

    move-result-wide v0

    invoke-interface {p2}, Lo/fbm;->d()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

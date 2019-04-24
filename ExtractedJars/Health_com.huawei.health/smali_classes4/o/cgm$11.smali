.class final Lo/cgm$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgm;->d(Ljava/util/List;)D
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/cfp;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lo/cfp;Lo/cfp;)I
    .locals 6

    .line 139
    invoke-virtual {p1}, Lo/cfp;->d()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    const-wide v0, 0x41dfffffffc00000L    # 2.147483647E9

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lo/cfp;->d()D

    move-result-wide v0

    .line 140
    :goto_0
    invoke-virtual {p2}, Lo/cfp;->d()D

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmpg-double v2, v2, v4

    if-gtz v2, :cond_1

    const-wide v2, 0x41dfffffffc00000L    # 2.147483647E9

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lo/cfp;->d()D

    move-result-wide v2

    .line 139
    :goto_1
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 136
    move-object v0, p1

    check-cast v0, Lo/cfp;

    move-object v1, p2

    check-cast v1, Lo/cfp;

    invoke-virtual {p0, v0, v1}, Lo/cgm$11;->b(Lo/cfp;Lo/cfp;)I

    move-result v0

    return v0
.end method

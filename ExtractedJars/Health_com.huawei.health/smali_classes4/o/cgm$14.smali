.class final Lo/cgm$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgm;->b(Ljava/util/List;)D
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

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 123
    move-object v0, p1

    check-cast v0, Lo/cfp;

    move-object v1, p2

    check-cast v1, Lo/cfp;

    invoke-virtual {p0, v0, v1}, Lo/cgm$14;->e(Lo/cfp;Lo/cfp;)I

    move-result v0

    return v0
.end method

.method public e(Lo/cfp;Lo/cfp;)I
    .locals 4

    .line 126
    invoke-virtual {p1}, Lo/cfp;->d()D

    move-result-wide v0

    invoke-virtual {p2}, Lo/cfp;->d()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result v0

    return v0
.end method

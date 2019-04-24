.class final Lo/cgm$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgm;->a(Ljava/util/List;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/cfk;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 150
    move-object v0, p1

    check-cast v0, Lo/cfk;

    move-object v1, p2

    check-cast v1, Lo/cfk;

    invoke-virtual {p0, v0, v1}, Lo/cgm$15;->e(Lo/cfk;Lo/cfk;)I

    move-result v0

    return v0
.end method

.method public e(Lo/cfk;Lo/cfk;)I
    .locals 4

    .line 153
    invoke-virtual {p1}, Lo/cfk;->b()I

    move-result v0

    if-gtz v0, :cond_0

    const-wide v0, 0x41dfffffffc00000L    # 2.147483647E9

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lo/cfk;->b()I

    move-result v0

    int-to-double v0, v0

    .line 154
    :goto_0
    invoke-virtual {p2}, Lo/cfk;->b()I

    move-result v2

    if-gtz v2, :cond_1

    const-wide v2, 0x41dfffffffc00000L    # 2.147483647E9

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lo/cfk;->b()I

    move-result v2

    int-to-double v2, v2

    .line 153
    :goto_1
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result v0

    return v0
.end method

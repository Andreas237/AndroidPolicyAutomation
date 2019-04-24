.class final Lo/cgm$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgm;->h(Ljava/util/List;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/cvv;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 190
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lo/cvv;Lo/cvv;)I
    .locals 4

    .line 193
    invoke-virtual {p1}, Lo/cvv;->e()I

    move-result v0

    if-gtz v0, :cond_0

    const-wide v0, 0x41dfffffffc00000L    # 2.147483647E9

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lo/cvv;->e()I

    move-result v0

    int-to-double v0, v0

    .line 194
    :goto_0
    invoke-virtual {p2}, Lo/cvv;->e()I

    move-result v2

    if-gtz v2, :cond_1

    const-wide v2, 0x41dfffffffc00000L    # 2.147483647E9

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lo/cvv;->e()I

    move-result v2

    int-to-double v2, v2

    .line 193
    :goto_1
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 190
    move-object v0, p1

    check-cast v0, Lo/cvv;

    move-object v1, p2

    check-cast v1, Lo/cvv;

    invoke-virtual {p0, v0, v1}, Lo/cgm$3;->b(Lo/cvv;Lo/cvv;)I

    move-result v0

    return v0
.end method

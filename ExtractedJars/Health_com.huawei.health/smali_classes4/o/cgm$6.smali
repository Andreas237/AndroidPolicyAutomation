.class final Lo/cgm$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgm;->e(Ljava/util/List;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/cev;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lo/cev;Lo/cev;)I
    .locals 2

    .line 112
    invoke-virtual {p1}, Lo/cev;->c()I

    move-result v0

    if-gtz v0, :cond_0

    const v0, 0x7fffffff

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lo/cev;->c()I

    move-result v0

    :goto_0
    invoke-virtual {p2}, Lo/cev;->c()I

    move-result v1

    if-gtz v1, :cond_1

    const v1, 0x7fffffff

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lo/cev;->c()I

    move-result v1

    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 109
    move-object v0, p1

    check-cast v0, Lo/cev;

    move-object v1, p2

    check-cast v1, Lo/cev;

    invoke-virtual {p0, v0, v1}, Lo/cgm$6;->c(Lo/cev;Lo/cev;)I

    move-result v0

    return v0
.end method

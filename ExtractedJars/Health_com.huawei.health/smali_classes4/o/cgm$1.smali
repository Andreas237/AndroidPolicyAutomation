.class final Lo/cgm$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgm;->e(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/chr;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 640
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lo/chr;Lo/chr;)I
    .locals 2

    .line 643
    invoke-virtual {p1}, Lo/chr;->b()F

    move-result v0

    invoke-virtual {p2}, Lo/chr;->b()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 640
    move-object v0, p1

    check-cast v0, Lo/chr;

    move-object v1, p2

    check-cast v1, Lo/chr;

    invoke-virtual {p0, v0, v1}, Lo/cgm$1;->c(Lo/chr;Lo/chr;)I

    move-result v0

    return v0
.end method

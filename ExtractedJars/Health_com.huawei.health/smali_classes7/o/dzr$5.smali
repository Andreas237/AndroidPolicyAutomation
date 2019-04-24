.class final Lo/dzr$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dzr;->c(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/dyv;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 554
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/dyv;Lo/dyv;)I
    .locals 4

    .line 556
    invoke-virtual {p1}, Lo/dyv;->c()D

    move-result-wide v0

    invoke-virtual {p2}, Lo/dyv;->c()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/dzr;->e(DD)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 554
    move-object v0, p1

    check-cast v0, Lo/dyv;

    move-object v1, p2

    check-cast v1, Lo/dyv;

    invoke-virtual {p0, v0, v1}, Lo/dzr$5;->a(Lo/dyv;Lo/dyv;)I

    move-result v0

    return v0
.end method

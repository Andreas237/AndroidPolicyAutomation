.class final Lo/up$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/up;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/uo;>;Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field private final a:F


# direct methods
.method private constructor <init>(F)V
    .locals 0

    .line 649
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 650
    iput p1, p0, Lo/up$e;->a:F

    .line 651
    return-void
.end method

.method synthetic constructor <init>(FLo/up$1;)V
    .locals 0

    .line 647
    invoke-direct {p0, p1}, Lo/up$e;-><init>(F)V

    return-void
.end method


# virtual methods
.method public c(Lo/uo;Lo/uo;)I
    .locals 4

    .line 654
    invoke-virtual {p2}, Lo/uo;->d()F

    move-result v0

    iget v1, p0, Lo/up$e;->a:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v2

    .line 655
    invoke-virtual {p1}, Lo/uo;->d()F

    move-result v0

    iget v1, p0, Lo/up$e;->a:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v3

    .line 656
    cmpg-float v0, v2, v3

    if-gez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    cmpl-float v0, v2, v3

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 647
    move-object v0, p1

    check-cast v0, Lo/uo;

    move-object v1, p2

    check-cast v1, Lo/uo;

    invoke-virtual {p0, v0, v1}, Lo/up$e;->c(Lo/uo;Lo/uo;)I

    move-result v0

    return v0
.end method

.class Lo/dhk$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dhk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private a:D

.field private c:D

.field private d:D

.field private e:D


# direct methods
.method constructor <init>(DDDD)V
    .locals 2

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    invoke-static {p3, p4, p7, p8}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lo/dhk$c;->d:D

    .line 70
    invoke-static {p1, p2, p5, p6}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lo/dhk$c;->c:D

    .line 71
    invoke-static {p3, p4, p7, p8}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lo/dhk$c;->e:D

    .line 72
    invoke-static {p1, p2, p5, p6}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lo/dhk$c;->a:D

    .line 73
    return-void
.end method


# virtual methods
.method d(DD)Z
    .locals 2

    .line 76
    iget-wide v0, p0, Lo/dhk$c;->d:D

    cmpg-double v0, v0, p3

    if-gtz v0, :cond_0

    iget-wide v0, p0, Lo/dhk$c;->e:D

    cmpl-double v0, v0, p3

    if-ltz v0, :cond_0

    iget-wide v0, p0, Lo/dhk$c;->c:D

    cmpl-double v0, v0, p1

    if-ltz v0, :cond_0

    iget-wide v0, p0, Lo/dhk$c;->a:D

    cmpg-double v0, v0, p1

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.class public abstract Lo/eih$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eih$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eih;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lo/eih;


# direct methods
.method public constructor <init>(Lo/eih;)V
    .locals 0

    .line 1342
    iput-object p1, p0, Lo/eih$b;->a:Lo/eih;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract b(F)I
.end method

.method public e(I)I
    .locals 3

    .line 1344
    const/4 v0, 0x4

    new-array v2, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v2, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v2, v1

    int-to-float v0, p1

    const/4 v1, 0x2

    aput v0, v2, v1

    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v2, v1

    .line 1345
    iget-object v0, p0, Lo/eih$b;->a:Lo/eih;

    iget-object v0, v0, Lo/eih;->aj:Lo/eim;

    invoke-virtual {v0, v2}, Lo/eim;->e([F)V

    .line 1347
    const/4 v0, 0x2

    aget v0, v2, v0

    const/4 v1, 0x0

    aget v1, v2, v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-virtual {p0, v0}, Lo/eih$b;->b(F)I

    move-result v0

    return v0
.end method

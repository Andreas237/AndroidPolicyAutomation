.class Lo/cwc$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cwc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private a:I

.field private b:J

.field private c:Lo/cwc$d;

.field private d:I

.field private e:Lo/cwc$b;


# direct methods
.method public constructor <init>(IIJLo/cwc$b;Lo/cwc$d;)V
    .locals 0

    .line 401
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 402
    iput p1, p0, Lo/cwc$e;->a:I

    .line 403
    iput p2, p0, Lo/cwc$e;->d:I

    .line 404
    iput-wide p3, p0, Lo/cwc$e;->b:J

    .line 405
    iput-object p6, p0, Lo/cwc$e;->c:Lo/cwc$d;

    .line 406
    iput-object p5, p0, Lo/cwc$e;->e:Lo/cwc$b;

    .line 407
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    .line 431
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 9

    .line 412
    if-eqz p1, :cond_0

    .line 414
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 415
    move-object v7, p1

    check-cast v7, Landroid/os/Bundle;

    .line 416
    const-string v0, "standSteps"

    invoke-virtual {v7, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 417
    iget-object v0, p0, Lo/cwc$e;->c:Lo/cwc$d;

    iget v1, p0, Lo/cwc$e;->a:I

    iget-wide v2, p0, Lo/cwc$e;->b:J

    iget v4, p0, Lo/cwc$e;->d:I

    move v5, v8

    iget-object v6, p0, Lo/cwc$e;->e:Lo/cwc$b;

    invoke-interface/range {v0 .. v6}, Lo/cwc$d;->c(IJIILo/cwc$b;)V

    .line 421
    :cond_0
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 0

    .line 426
    return-void
.end method

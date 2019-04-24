.class public Lo/eld$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eld;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 350
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/mn;Lo/elb;)V
    .locals 2

    .line 402
    invoke-virtual {p2}, Lo/elb;->A()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 403
    const/4 v0, 0x0

    iput v0, p0, Lo/eld$b;->c:I

    .line 404
    const/4 v0, 0x0

    iput v0, p0, Lo/eld$b;->a:I

    .line 405
    const/4 v0, 0x0

    iput v0, p0, Lo/eld$b;->d:I

    .line 406
    return-void

    .line 409
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/eld$b;->c:I

    .line 411
    invoke-virtual {p2}, Lo/elb;->A()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lo/eld$b;->a:I

    .line 412
    iget v0, p0, Lo/eld$b;->a:I

    iget v1, p0, Lo/eld$b;->c:I

    sub-int/2addr v0, v1

    iput v0, p0, Lo/eld$b;->d:I

    .line 413
    return-void
.end method

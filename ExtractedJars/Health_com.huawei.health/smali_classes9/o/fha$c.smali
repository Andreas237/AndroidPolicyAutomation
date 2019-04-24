.class public Lo/fha$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fha;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public h:F

.field public i:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 686
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 677
    const/4 v0, -0x1

    iput v0, p0, Lo/fha$c;->d:I

    .line 678
    const/4 v0, -0x1

    iput v0, p0, Lo/fha$c;->a:I

    .line 679
    const/4 v0, -0x1

    iput v0, p0, Lo/fha$c;->b:I

    .line 680
    const/4 v0, -0x1

    iput v0, p0, Lo/fha$c;->e:I

    .line 681
    const/4 v0, -0x1

    iput v0, p0, Lo/fha$c;->c:I

    .line 682
    const/4 v0, -0x1

    iput v0, p0, Lo/fha$c;->f:I

    .line 683
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lo/fha$c;->h:F

    .line 684
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lo/fha$c;->i:F

    .line 687
    return-void
.end method

.class Lo/eiq$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eiq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field a:F

.field b:F

.field c:Landroid/graphics/Canvas;

.field d:Z

.field e:Lo/nz;

.field f:F

.field g:F


# direct methods
.method constructor <init>()V
    .locals 0

    .line 474
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Landroid/graphics/Canvas;FFLo/nz;ZFF)V
    .locals 0

    .line 477
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 478
    iput-object p1, p0, Lo/eiq$e;->c:Landroid/graphics/Canvas;

    .line 479
    iput p2, p0, Lo/eiq$e;->a:F

    .line 480
    iput p3, p0, Lo/eiq$e;->b:F

    .line 481
    iput-object p4, p0, Lo/eiq$e;->e:Lo/nz;

    .line 482
    iput-boolean p5, p0, Lo/eiq$e;->d:Z

    .line 483
    iput p6, p0, Lo/eiq$e;->f:F

    .line 484
    iput p7, p0, Lo/eiq$e;->g:F

    .line 485
    return-void
.end method

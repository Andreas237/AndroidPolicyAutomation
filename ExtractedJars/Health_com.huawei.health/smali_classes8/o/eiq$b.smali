.class Lo/eiq$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eiq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:F

.field b:Lo/nz;

.field c:Landroid/graphics/Canvas;

.field d:F

.field e:Ljava/lang/String;

.field g:F


# direct methods
.method constructor <init>(Landroid/graphics/Canvas;Ljava/lang/String;FFLo/nz;F)V
    .locals 0

    .line 455
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 456
    iput-object p1, p0, Lo/eiq$b;->c:Landroid/graphics/Canvas;

    .line 457
    iput-object p2, p0, Lo/eiq$b;->e:Ljava/lang/String;

    .line 458
    iput p3, p0, Lo/eiq$b;->d:F

    .line 459
    iput p4, p0, Lo/eiq$b;->a:F

    .line 460
    iput-object p5, p0, Lo/eiq$b;->b:Lo/nz;

    .line 461
    iput p6, p0, Lo/eiq$b;->g:F

    .line 462
    return-void
.end method

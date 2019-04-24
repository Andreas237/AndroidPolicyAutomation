.class Lcom/moat/analytics/mobile/spck/z$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/moat/analytics/mobile/spck/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field a:Landroid/graphics/Rect;

.field b:D

.field c:D


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Rect;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/z$a;->a:Landroid/graphics/Rect;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/moat/analytics/mobile/spck/z$a;->b:D

    iput-wide v0, p0, Lcom/moat/analytics/mobile/spck/z$a;->c:D

    return-void
.end method

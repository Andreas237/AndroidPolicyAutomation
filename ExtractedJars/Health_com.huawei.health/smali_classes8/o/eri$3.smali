.class Lo/eri$3;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eri;->a(Lcom/huawei/pluginFitnessAdvice/FitWorkout;Lcom/huawei/health/suggestion/model/Topic;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic e:Lo/eri;


# direct methods
.method constructor <init>(Lo/eri;I)V
    .locals 0

    .line 138
    iput-object p1, p0, Lo/eri$3;->e:Lo/eri;

    iput p2, p0, Lo/eri$3;->b:I

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 6

    .line 141
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 142
    move-object v0, p2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    iget v1, p0, Lo/eri$3;->b:I

    int-to-float v5, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 144
    :cond_0
    return-void
.end method

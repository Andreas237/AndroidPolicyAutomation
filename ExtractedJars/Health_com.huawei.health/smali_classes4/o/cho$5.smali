.class Lo/cho$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cho;->setImgMap(Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cho;


# direct methods
.method constructor <init>(Lo/cho;)V
    .locals 0

    .line 273
    iput-object p1, p0, Lo/cho$5;->b:Lo/cho;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 276
    iget-object v0, p0, Lo/cho$5;->b:Lo/cho;

    invoke-static {v0}, Lo/cho;->b(Lo/cho;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 277
    iget-object v0, p0, Lo/cho$5;->b:Lo/cho;

    invoke-static {v0}, Lo/cho;->c(Lo/cho;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getHeight()I

    move-result v0

    iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 278
    iget-object v0, p0, Lo/cho$5;->b:Lo/cho;

    invoke-static {v0}, Lo/cho;->b(Lo/cho;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 279
    return-void
.end method

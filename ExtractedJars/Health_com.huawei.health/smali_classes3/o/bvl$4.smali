.class Lo/bvl$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bvl;->onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bvl;


# direct methods
.method constructor <init>(Lo/bvl;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lo/bvl$4;->a:Lo/bvl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 220
    const-string v0, "IntroPagerAdapter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mSugCoachiIvPic.setVisibility(View.GONE);"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    iget-object v0, p0, Lo/bvl$4;->a:Lo/bvl;

    invoke-static {v0}, Lo/bvl;->b(Lo/bvl;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 222
    iget-object v0, p0, Lo/bvl$4;->a:Lo/bvl;

    invoke-static {v0}, Lo/bvl;->d(Lo/bvl;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 223
    iget-object v0, p0, Lo/bvl$4;->a:Lo/bvl;

    invoke-static {v0}, Lo/bvl;->e(Lo/bvl;)V

    .line 225
    :cond_0
    return-void
.end method

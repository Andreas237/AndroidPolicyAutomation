.class Lcom/huawei/openalliance/ad/views/VideoView$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/media/MediaPlayer$OnVideoSizeChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/VideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:F

.field final synthetic b:Lcom/huawei/openalliance/ad/views/VideoView;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/VideoView;)V
    .locals 1

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/VideoView$1;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$1;->a:F

    return-void
.end method

.method private a(F)V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$1$2;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/views/VideoView$1$2;-><init>(Lcom/huawei/openalliance/ad/views/VideoView$1;F)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public onVideoSizeChanged(Landroid/media/MediaPlayer;II)V
    .locals 7

    invoke-static {}, Lcom/huawei/openalliance/ad/views/VideoView;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "video size changed - w: %d h: %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p2, :cond_0

    if-nez p3, :cond_1

    :cond_0
    return-void

    :cond_1
    int-to-float v0, p2

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, p3

    div-float v5, v0, v1

    iget v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$1;->a:F

    sub-float v0, v5, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v6

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/huawei/openalliance/ad/views/VideoView;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "video ratio: %f oldRatio: %f diff: %f"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/huawei/openalliance/ad/views/VideoView$1;->a:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    iput v5, p0, Lcom/huawei/openalliance/ad/views/VideoView$1;->a:F

    const v0, 0x3c23d70a    # 0.01f

    cmpl-float v0, v6, v0

    if-lez v0, :cond_4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$1;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->a(Lcom/huawei/openalliance/ad/views/VideoView;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$1;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setRatio(Ljava/lang/Float;)V

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$1$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$1$1;-><init>(Lcom/huawei/openalliance/ad/views/VideoView$1;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_3
    invoke-direct {p0, v5}, Lcom/huawei/openalliance/ad/views/VideoView$1;->a(F)V

    :cond_4
    :goto_0
    return-void
.end method

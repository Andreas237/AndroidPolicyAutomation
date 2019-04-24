.class Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$PageTransformer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;)V
    .locals 0

    .line 291
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity$5;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/ShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public transformPage(Landroid/view/View;F)V
    .locals 7

    .line 296
    const-string v0, "ShareActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transformPage:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ":"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    const/high16 v0, -0x40800000    # -1.0f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    .line 299
    const/high16 p2, -0x40800000    # -1.0f

    goto :goto_0

    .line 300
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p2, v0

    if-lez v0, :cond_1

    .line 301
    const/high16 p2, 0x3f800000    # 1.0f

    .line 304
    :cond_1
    :goto_0
    const/4 v0, 0x0

    cmpg-float v0, p2, v0

    if-gez v0, :cond_2

    const/high16 v0, 0x3f800000    # 1.0f

    add-float v4, v0, p2

    goto :goto_1

    :cond_2
    const/high16 v0, 0x3f800000    # 1.0f

    sub-float v4, v0, p2

    .line 306
    :goto_1
    const/high16 v5, 0x3e800000    # 0.25f

    .line 308
    mul-float v0, v4, v5

    const/high16 v1, 0x3f800000    # 1.0f

    add-float v6, v1, v0

    .line 309
    invoke-virtual {p1, v6}, Landroid/view/View;->setScaleX(F)V

    .line 310
    invoke-virtual {p1, v6}, Landroid/view/View;->setScaleY(F)V

    .line 311
    return-void
.end method

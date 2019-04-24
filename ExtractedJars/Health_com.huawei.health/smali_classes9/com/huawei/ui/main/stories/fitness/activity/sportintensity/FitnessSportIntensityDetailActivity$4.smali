.class Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;)V
    .locals 0

    .line 246
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 249
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/SportIntensityExplain;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;->startActivity(Landroid/content/Intent;)V

    .line 251
    return-void
.end method

.class Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)V
    .locals 0

    .line 168
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$2;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 171
    const-string v0, "SCUI_StepsShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareButton onClick mBitmap="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$2;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/graphics/Bitmap;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$2;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lo/cdz;->c(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 173
    if-eqz v5, :cond_1

    .line 174
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$2;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->c:Lo/dav;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dav;->d(Z)V

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$2;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->c:Lo/dav;

    invoke-virtual {v0, v5}, Lo/dav;->e(Landroid/graphics/Bitmap;)V

    .line 176
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$2;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->c:Lo/dav;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/dav;->a(I)V

    .line 178
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$2;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->c:Lo/dav;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$2;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)I

    move-result v1

    invoke-static {v1}, Lo/fiy;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dav;->d(Ljava/lang/String;)V

    .line 179
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$2;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$2;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->a(Landroid/content/Context;[Ljava/lang/String;)V

    goto :goto_0

    .line 182
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$2;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity$2;->b:Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;->c:Lo/dav;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 185
    :cond_1
    :goto_0
    return-void
.end method

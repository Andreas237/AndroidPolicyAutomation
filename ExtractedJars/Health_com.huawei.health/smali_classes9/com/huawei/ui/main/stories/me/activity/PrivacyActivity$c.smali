.class Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)V
    .locals 1

    .line 176
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 177
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$c;->c:Ljava/lang/ref/WeakReference;

    .line 178
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 183
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$c;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;

    .line 184
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 186
    const-string v0, "PrivacyActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyOnclickListener onClick() activity null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    return-void

    .line 189
    :cond_0
    const-string v0, "PrivacyActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyOnclickListener onClick()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    new-instance v5, Lo/fgm;

    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->a(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/os/Handler;

    move-result-object v0

    const-string v1, ""

    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->d(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)I

    move-result v2

    invoke-direct {v5, v4, v0, v1, v2}, Lo/fgm;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;I)V

    .line 191
    invoke-virtual {v5}, Lo/fgm;->a()V

    .line 192
    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->f(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 193
    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->g(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/graphics/drawable/AnimationDrawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 194
    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->i(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 195
    return-void
.end method

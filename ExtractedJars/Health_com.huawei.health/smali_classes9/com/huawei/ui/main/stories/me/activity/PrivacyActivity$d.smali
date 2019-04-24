.class Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$d;
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
    name = "d"
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

    .line 205
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 206
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$d;->c:Ljava/lang/ref/WeakReference;

    .line 207
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$d;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;

    .line 213
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 215
    const-string v0, "PrivacyActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyOKClickListener onClick() activity null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    return-void

    .line 218
    :cond_0
    const-string v0, "PrivacyActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyOKClickListener onClick()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->finish()V

    .line 220
    return-void
.end method

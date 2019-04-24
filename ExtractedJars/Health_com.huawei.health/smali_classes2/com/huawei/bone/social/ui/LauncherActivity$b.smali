.class Lcom/huawei/bone/social/ui/LauncherActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/bone/social/ui/LauncherActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/bone/social/ui/LauncherActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/bone/social/ui/LauncherActivity;)V
    .locals 1

    .line 157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 158
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity$b;->c:Ljava/lang/ref/WeakReference;

    .line 159
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 163
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity$b;->c:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 164
    invoke-static {}, Lcom/huawei/bone/social/ui/LauncherActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RankShareOnClickListener.onClick() mActivity(weak reference) == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    return-void

    .line 169
    :cond_0
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity$b;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/bone/social/ui/LauncherActivity;

    .line 170
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 171
    invoke-static {}, Lcom/huawei/bone/social/ui/LauncherActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RankShareOnClickListener.onClick() activity == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    return-void

    .line 174
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/bone/social/ui/LauncherActivity;->d()V

    .line 175
    return-void
.end method

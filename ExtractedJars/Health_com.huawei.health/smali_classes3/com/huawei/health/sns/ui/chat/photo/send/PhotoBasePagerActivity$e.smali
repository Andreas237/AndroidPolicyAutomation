.class public abstract Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$e;
.super Landroid/support/v4/view/PagerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "e"
.end annotation


# instance fields
.field protected a:Landroid/view/LayoutInflater;

.field final synthetic e:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;


# direct methods
.method protected constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$e;->e:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;

    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 1

    .line 166
    move-object v0, p3

    check-cast v0, Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 167
    return-void
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    .line 172
    if-ne p1, p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

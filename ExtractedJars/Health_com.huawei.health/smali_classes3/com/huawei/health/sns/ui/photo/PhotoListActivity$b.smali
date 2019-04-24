.class Lcom/huawei/health/sns/ui/photo/PhotoListActivity$b;
.super Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/photo/PhotoListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# static fields
.field static final synthetic c:Z


# instance fields
.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field final synthetic d:Lcom/huawei/health/sns/ui/photo/PhotoListActivity;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 444
    const-class v0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$b;->c:Z

    return-void
.end method

.method constructor <init>(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 449
    iput-object p1, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$b;->d:Lcom/huawei/health/sns/ui/photo/PhotoListActivity;

    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$e;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;)V

    .line 450
    iput-object p2, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$b;->b:Ljava/util/ArrayList;

    .line 451
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$b;->a:Landroid/view/LayoutInflater;

    .line 452
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 2

    .line 462
    const/4 v1, 0x0

    .line 463
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$b;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 465
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 467
    :cond_0
    return v1
.end method

.method public getItemPosition(Ljava/lang/Object;)I
    .locals 1

    .line 474
    const/4 v0, -0x2

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 6

    .line 480
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$b;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_photo_pager_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 481
    sget-boolean v0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$b;->c:Z

    if-nez v0, :cond_0

    if-nez v3, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 482
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->image:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/kv;

    .line 483
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$b;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p2, v0, :cond_1

    .line 485
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 486
    invoke-static {v4, v5}, Lo/bbn;->b(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 488
    :cond_1
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 489
    return-object v3
.end method

.method public restoreState(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 495
    return-void
.end method

.method public saveState()Landroid/os/Parcelable;
    .locals 1

    .line 500
    const/4 v0, 0x0

    return-object v0
.end method

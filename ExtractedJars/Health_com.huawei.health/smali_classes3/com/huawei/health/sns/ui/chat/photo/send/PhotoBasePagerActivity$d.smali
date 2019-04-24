.class public Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;
.super Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# static fields
.field static final synthetic b:Z


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 180
    const-class v0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;->b:Z

    return-void
.end method

.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 186
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;->c:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;

    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$e;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;)V

    .line 187
    iput-object p2, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;->d:Ljava/util/ArrayList;

    .line 188
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;->a:Landroid/view/LayoutInflater;

    .line 189
    return-void
.end method


# virtual methods
.method public a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 193
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;->d:Ljava/util/ArrayList;

    .line 194
    return-void
.end method

.method public bridge synthetic destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 180
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$e;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    return-void
.end method

.method public getCount()I
    .locals 2

    .line 199
    const/4 v1, 0x0

    .line 200
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 202
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 204
    :cond_0
    return v1
.end method

.method public getItemPosition(Ljava/lang/Object;)I
    .locals 1

    .line 211
    const/4 v0, -0x2

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 6

    .line 217
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_photo_pager_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 218
    sget-boolean v0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;->b:Z

    if-nez v0, :cond_0

    if-nez v3, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 219
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->image:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/kv;

    .line 220
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p2, v0, :cond_1

    .line 223
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$d;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 224
    invoke-static {v4, v5}, Lo/aux;->d(Landroid/widget/ImageView;I)V

    .line 226
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 227
    return-object v3
.end method

.method public bridge synthetic isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    .line 180
    invoke-super {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$e;->isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public restoreState(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 233
    return-void
.end method

.method public saveState()Landroid/os/Parcelable;
    .locals 1

    .line 238
    const/4 v0, 0x0

    return-object v0
.end method

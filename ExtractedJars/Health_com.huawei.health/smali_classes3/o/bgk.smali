.class public Lo/bgk;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field private b:[Landroid/graphics/drawable/Drawable;

.field d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;[Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bgk;->b:[Landroid/graphics/drawable/Drawable;

    .line 33
    iput-object p1, p0, Lo/bgk;->d:Landroid/content/Context;

    .line 34
    if-eqz p2, :cond_0

    .line 36
    invoke-virtual {p2}, [Landroid/graphics/drawable/Drawable;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lo/bgk;->b:[Landroid/graphics/drawable/Drawable;

    .line 38
    :cond_0
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 43
    iget-object v0, p0, Lo/bgk;->b:[Landroid/graphics/drawable/Drawable;

    array-length v0, v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/bgk;->b:[Landroid/graphics/drawable/Drawable;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 55
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .line 61
    if-nez p2, :cond_0

    .line 63
    iget-object v0, p0, Lo/bgk;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_chat_facegrid_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 66
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->faceImage:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/ImageView;

    .line 68
    move v4, p1

    .line 70
    iget-object v0, p0, Lo/bgk;->b:[Landroid/graphics/drawable/Drawable;

    aget-object v5, v0, v4

    .line 71
    if-nez v5, :cond_1

    .line 76
    :try_start_0
    invoke-static {}, Lo/bgh;->a()Lo/bgh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bgh;->e()V

    .line 78
    invoke-static {}, Lo/bgh;->a()Lo/bgh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bgh;->d()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lo/bgk;->b:[Landroid/graphics/drawable/Drawable;

    .line 80
    iget-object v0, p0, Lo/bgk;->b:[Landroid/graphics/drawable/Drawable;

    aget-object v0, v0, v4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-object v5, v0

    .line 89
    goto :goto_0

    .line 82
    :catch_0
    move-exception v6

    .line 84
    const-string v0, "FaceGridAdapter"

    const-string v1, "getView RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    goto :goto_0

    .line 86
    :catch_1
    move-exception v6

    .line 88
    const-string v0, "FaceGridAdapter"

    const-string v1, "getView Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    :cond_1
    :goto_0
    if-eqz v5, :cond_2

    .line 94
    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 97
    :cond_2
    return-object p2
.end method

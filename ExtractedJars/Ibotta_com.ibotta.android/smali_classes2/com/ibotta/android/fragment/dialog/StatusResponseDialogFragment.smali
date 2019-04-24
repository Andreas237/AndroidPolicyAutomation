.class public Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;
.super Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;
.source "StatusResponseDialogFragment.java"


# static fields
.field public static final KEY_ICON_ID:Ljava/lang/String; = "icon_id"

.field public static final KEY_POSITIVE:Ljava/lang/String; = "positive"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;-><init>()V

    return-void
.end method

.method public static newInstance(Z)Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;
    .locals 2

    const-wide/16 v0, 0x7d0

    .line 20
    invoke-static {p0, v0, v1}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;->newInstance(ZJ)Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;

    move-result-object p0

    return-object p0
.end method

.method public static newInstance(ZIJZ)Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;
    .locals 1

    .line 42
    new-instance v0, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;-><init>()V

    .line 44
    invoke-static {p2, p3, p4}, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->newArgs(JZ)Landroid/os/Bundle;

    move-result-object p2

    const-string p3, "positive"

    .line 45
    invoke-virtual {p2, p3, p0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p0, "icon_id"

    .line 46
    invoke-virtual {p2, p0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 47
    invoke-virtual {v0, p2}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static newInstance(ZJ)Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;
    .locals 1

    const/4 v0, 0x0

    .line 27
    invoke-static {p0, p1, p2, v0}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;->newInstance(ZJZ)Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;

    move-result-object p0

    return-object p0
.end method

.method public static newInstance(ZJZ)Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;
    .locals 1

    const/4 v0, -0x1

    .line 34
    invoke-static {p0, v0, p1, p2, p3}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;->newInstance(ZIJZ)Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 54
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/AbstractResponseDialogFragment;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x2

    const v0, 0x1030009

    .line 55
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;->setStyle(II)V

    return-void
.end method

.method public onCreateResponseView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const/4 p3, 0x0

    const v0, 0x7f0c00f3

    .line 60
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 62
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    const-string v0, "positive"

    invoke-virtual {p2, v0, p3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    .line 63
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p3

    const-string v0, "icon_id"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p3

    const v0, 0x7f090429

    .line 64
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/common/StatusResponseView;

    .line 66
    invoke-virtual {v0, p2}, Lcom/ibotta/android/view/common/StatusResponseView;->setIsPositive(Z)V

    if-eqz p2, :cond_0

    if-lez p3, :cond_1

    .line 69
    invoke-virtual {v0, p3}, Lcom/ibotta/android/view/common/StatusResponseView;->setPositiveIcon(I)V

    goto :goto_0

    :cond_0
    if-lez p3, :cond_1

    .line 73
    invoke-virtual {v0, p3}, Lcom/ibotta/android/view/common/StatusResponseView;->setNegativeIcon(I)V

    :cond_1
    :goto_0
    return-object p1
.end method

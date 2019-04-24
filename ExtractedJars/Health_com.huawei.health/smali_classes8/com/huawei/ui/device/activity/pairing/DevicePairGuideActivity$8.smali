.class Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/Html$ImageGetter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 0

    .line 1052
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$8;->a:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDrawable(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 6

    .line 1055
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 1056
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$8;->a:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->o(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 1057
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v5, v2, v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1058
    return-object v5
.end method

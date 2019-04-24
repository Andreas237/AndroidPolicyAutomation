.class Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[I

.field final synthetic d:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;[I)V
    .locals 0

    .line 187
    iput-object p1, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$2;->d:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;

    iput-object p2, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$2;->a:[I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 7

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$2;->d:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->e(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)Lo/egd;

    move-result-object v0

    invoke-virtual {v0}, Lo/egd;->getLineCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 190
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$2;->d:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/WindowManager;

    .line 191
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v5

    .line 192
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$2;->d:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->e(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)Lo/egd;

    move-result-object v0

    invoke-virtual {v0}, Lo/egd;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    .line 193
    iget v0, v6, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-ne v5, v0, :cond_0

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$2;->a:[I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$2;->a:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 195
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$2;->d:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->e(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)Lo/egd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$2;->a:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    int-to-float v1, v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/egd;->setTextSize(IF)V

    goto :goto_0

    .line 197
    :cond_0
    iput v5, v6, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$2;->d:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->e(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)Lo/egd;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/egd;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 200
    :goto_0
    goto :goto_1

    .line 201
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$2;->d:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->e(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)Lo/egd;

    move-result-object v0

    invoke-virtual {v0}, Lo/egd;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 203
    :goto_1
    const-string v0, "DoublePhoneActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "globalLayout..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    return-void
.end method

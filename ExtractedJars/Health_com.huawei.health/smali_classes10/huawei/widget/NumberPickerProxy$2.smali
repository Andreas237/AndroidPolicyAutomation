.class Lhuawei/widget/NumberPickerProxy$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhuawei/widget/NumberPickerProxy;->setStyle()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private isHandled:Z

.field final synthetic this$0:Lhuawei/widget/NumberPickerProxy;

.field y:F


# direct methods
.method constructor <init>(Lhuawei/widget/NumberPickerProxy;)V
    .locals 1

    .line 147
    iput-object p1, p0, Lhuawei/widget/NumberPickerProxy$2;->this$0:Lhuawei/widget/NumberPickerProxy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 148
    const/4 v0, 0x1

    iput-boolean v0, p0, Lhuawei/widget/NumberPickerProxy$2;->isHandled:Z

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 154
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 156
    :pswitch_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lhuawei/widget/NumberPickerProxy$2;->isHandled:Z

    .line 157
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lhuawei/widget/NumberPickerProxy$2;->y:F

    .line 160
    :pswitch_1
    iget-boolean v0, p0, Lhuawei/widget/NumberPickerProxy$2;->isHandled:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lhuawei/widget/NumberPickerProxy$2;->y:F

    iget-object v1, p0, Lhuawei/widget/NumberPickerProxy$2;->this$0:Lhuawei/widget/NumberPickerProxy;

    iget v1, v1, Lhuawei/widget/NumberPickerProxy;->mTopSelectionDividerTop:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget v0, p0, Lhuawei/widget/NumberPickerProxy$2;->y:F

    iget-object v1, p0, Lhuawei/widget/NumberPickerProxy$2;->this$0:Lhuawei/widget/NumberPickerProxy;

    iget v1, v1, Lhuawei/widget/NumberPickerProxy;->mBottomSelectionDividerBottom:I

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 162
    :pswitch_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lhuawei/widget/NumberPickerProxy$2;->isHandled:Z

    .line 163
    const/4 v0, 0x0

    return v0

    .line 165
    :goto_1
    const/4 v0, 0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

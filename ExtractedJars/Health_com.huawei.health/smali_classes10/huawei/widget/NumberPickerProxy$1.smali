.class Lhuawei/widget/NumberPickerProxy$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/NumberPicker$OnValueChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/widget/NumberPickerProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhuawei/widget/NumberPickerProxy;


# direct methods
.method constructor <init>(Lhuawei/widget/NumberPickerProxy;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lhuawei/widget/NumberPickerProxy$1;->this$0:Lhuawei/widget/NumberPickerProxy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onValueChange(Landroid/widget/NumberPicker;II)V
    .locals 1

    .line 46
    iget-object v0, p0, Lhuawei/widget/NumberPickerProxy$1;->this$0:Lhuawei/widget/NumberPickerProxy;

    invoke-virtual {v0, p1, p2, p3}, Lhuawei/widget/NumberPickerProxy;->onValueChangeInner(Landroid/widget/NumberPicker;II)V

    .line 48
    iget-object v0, p0, Lhuawei/widget/NumberPickerProxy$1;->this$0:Lhuawei/widget/NumberPickerProxy;

    iget-object v0, v0, Lhuawei/widget/NumberPickerProxy;->mOnValueChangeListener:Landroid/widget/NumberPicker$OnValueChangeListener;

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lhuawei/widget/NumberPickerProxy$1;->this$0:Lhuawei/widget/NumberPickerProxy;

    iget-object v0, v0, Lhuawei/widget/NumberPickerProxy;->mOnValueChangeListener:Landroid/widget/NumberPicker$OnValueChangeListener;

    invoke-interface {v0, p1, p2, p3}, Landroid/widget/NumberPicker$OnValueChangeListener;->onValueChange(Landroid/widget/NumberPicker;II)V

    .line 51
    :cond_0
    return-void
.end method

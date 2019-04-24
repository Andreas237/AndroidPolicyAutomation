.class Lhuawei/android/hwcolorpicker/HwColorPicker$ColorPickingTask;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/android/hwcolorpicker/HwColorPicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ColorPickingTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/ref/WeakReference<Lhuawei/android/hwcolorpicker/HwColorPicker$TaskParams;>;Ljava/lang/Integer;Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;>;"
    }
.end annotation


# instance fields
.field mCallBack:Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;


# direct methods
.method private constructor <init>(Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;)V
    .locals 0

    .line 761
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 762
    iput-object p1, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$ColorPickingTask;->mCallBack:Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;

    .line 763
    return-void
.end method

.method synthetic constructor <init>(Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;Lhuawei/android/hwcolorpicker/HwColorPicker$1;)V
    .locals 0

    .line 758
    invoke-direct {p0, p1}, Lhuawei/android/hwcolorpicker/HwColorPicker$ColorPickingTask;-><init>(Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;)V

    return-void
.end method


# virtual methods
.method protected final varargs doInBackground([Ljava/lang/ref/WeakReference;)Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Ljava/lang/ref/WeakReference<Lhuawei/android/hwcolorpicker/HwColorPicker$TaskParams;>;)Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 768
    const/4 v0, 0x0

    aget-object v3, p1, v0

    .line 769
    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lhuawei/android/hwcolorpicker/HwColorPicker$TaskParams;

    .line 770
    if-eqz v4, :cond_1

    .line 771
    iget-object v0, v4, Lhuawei/android/hwcolorpicker/HwColorPicker$TaskParams;->rect:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    .line 772
    iget-object v0, v4, Lhuawei/android/hwcolorpicker/HwColorPicker$TaskParams;->bitmap:Landroid/graphics/Bitmap;

    iget-object v1, v4, Lhuawei/android/hwcolorpicker/HwColorPicker$TaskParams;->clientType:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    invoke-static {v0, v1}, Lhuawei/android/hwcolorpicker/HwColorPicker;->processBitmap(Landroid/graphics/Bitmap;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    move-result-object v0

    return-object v0

    .line 774
    :cond_0
    iget-object v0, v4, Lhuawei/android/hwcolorpicker/HwColorPicker$TaskParams;->bitmap:Landroid/graphics/Bitmap;

    iget-object v1, v4, Lhuawei/android/hwcolorpicker/HwColorPicker$TaskParams;->rect:Landroid/graphics/Rect;

    iget-object v2, v4, Lhuawei/android/hwcolorpicker/HwColorPicker$TaskParams;->clientType:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    invoke-static {v0, v1, v2}, Lhuawei/android/hwcolorpicker/HwColorPicker;->processBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    move-result-object v0

    return-object v0

    .line 777
    :cond_1
    invoke-static {}, Lhuawei/android/hwcolorpicker/HwColorPicker;->access$400()Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 758
    move-object v0, p1

    check-cast v0, [Ljava/lang/ref/WeakReference;

    invoke-virtual {p0, v0}, Lhuawei/android/hwcolorpicker/HwColorPicker$ColorPickingTask;->doInBackground([Ljava/lang/ref/WeakReference;)Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    move-result-object v0

    return-object v0
.end method

.method protected onPostExecute(Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;)V
    .locals 1

    .line 782
    iget-object v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$ColorPickingTask;->mCallBack:Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;

    if-eqz v0, :cond_0

    .line 783
    iget-object v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$ColorPickingTask;->mCallBack:Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;

    invoke-interface {v0, p1}, Lhuawei/android/hwcolorpicker/HwColorPicker$AsyncProcessCallBack;->onColorPicked(Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;)V

    .line 785
    :cond_0
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 758
    move-object v0, p1

    check-cast v0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;

    invoke-virtual {p0, v0}, Lhuawei/android/hwcolorpicker/HwColorPicker$ColorPickingTask;->onPostExecute(Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;)V

    return-void
.end method

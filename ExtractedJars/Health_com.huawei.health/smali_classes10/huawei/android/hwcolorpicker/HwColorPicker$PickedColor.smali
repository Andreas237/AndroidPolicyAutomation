.class public Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/android/hwcolorpicker/HwColorPicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PickedColor"
.end annotation


# instance fields
.field private mClientType:I

.field private mColorPicked:[I

.field private mResultState:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 631
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 624
    const/4 v0, -0x1

    iput v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mClientType:I

    .line 628
    const/4 v0, -0x1

    iput v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mResultState:I

    .line 632
    return-void
.end method

.method synthetic constructor <init>(Lhuawei/android/hwcolorpicker/HwColorPicker$1;)V
    .locals 0

    .line 622
    invoke-direct {p0}, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;-><init>()V

    return-void
.end method

.method private constructor <init>([I)V
    .locals 5

    .line 634
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 624
    const/4 v0, -0x1

    iput v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mClientType:I

    .line 628
    const/4 v0, -0x1

    iput v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mResultState:I

    .line 635
    if-eqz p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 636
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Illegal result, colorResult is null or Empty!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 639
    :cond_1
    const/4 v0, 0x0

    aget v3, p1, v0

    .line 640
    const/high16 v0, -0x1000000

    and-int/2addr v0, v3

    shr-int/lit8 v0, v0, 0x18

    iput v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mClientType:I

    .line 641
    const/high16 v0, 0xff0000

    and-int/2addr v0, v3

    shr-int/lit8 v0, v0, 0x10

    iput v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mResultState:I

    .line 643
    iget v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mClientType:I

    invoke-static {v0}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->getRequestedColorNum(I)I

    move-result v4

    .line 645
    array-length v0, p1

    add-int/lit8 v1, v4, 0x1

    if-eq v0, v1, :cond_2

    .line 646
    const-string v0, "HwColorPicker"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "colorResult\'s length : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", requestedNum : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", mClientType : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mClientType:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", mResultState : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mResultState:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 648
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Illegal result, colorResult\'s length must be (requestedNum + 1)!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 651
    :cond_2
    new-array v0, v4, [I

    iput-object v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mColorPicked:[I

    .line 653
    iget-object v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mColorPicked:[I

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 654
    return-void
.end method

.method synthetic constructor <init>([ILhuawei/android/hwcolorpicker/HwColorPicker$1;)V
    .locals 0

    .line 622
    invoke-direct {p0, p1}, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;-><init>([I)V

    return-void
.end method


# virtual methods
.method public get(Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;)I
    .locals 3

    .line 705
    iget-object v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mColorPicked:[I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mColorPicked:[I

    array-length v0, v0

    if-gtz v0, :cond_1

    .line 706
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 709
    :cond_1
    invoke-static {p1}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->access$300(Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;)I

    move-result v0

    const v1, 0xffff

    and-int v2, v0, v1

    .line 711
    iget-object v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mColorPicked:[I

    array-length v0, v0

    if-lt v2, v0, :cond_2

    .line 712
    const/4 v0, 0x0

    return v0

    .line 715
    :cond_2
    iget-object v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mColorPicked:[I

    aget v0, v0, v2

    return v0
.end method

.method public getDomainColor()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 673
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Domain:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    invoke-virtual {p0, v0}, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->get(Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;)I

    move-result v0

    return v0
.end method

.method public getShadowColor()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 695
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Shadow:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    invoke-virtual {p0, v0}, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->get(Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;)I

    move-result v0

    return v0
.end method

.method public getState()I
    .locals 1

    .line 662
    iget v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mResultState:I

    return v0
.end method

.method public getWidgetColor()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 684
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Widget:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    invoke-virtual {p0, v0}, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->get(Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 724
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 725
    const-string v0, "PickedColor{"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mClientType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mResultState:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 727
    iget-object v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mColorPicked:[I

    if-eqz v0, :cond_1

    .line 728
    iget-object v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mColorPicked:[I

    array-length v5, v0

    .line 729
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    .line 730
    const-string v0, "0x%08x"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$PickedColor;->mColorPicked:[I

    aget v2, v2, v6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 731
    add-int/lit8 v0, v5, -0x1

    if-eq v6, v0, :cond_0

    .line 732
    const-string v0, ", "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 729
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 736
    :cond_1
    const-string v0, "]}"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 738
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

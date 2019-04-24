.class public Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;
.super Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;
.source "ReceiptBarcodeHelpFlyUpCreator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "BarcodeHelpViewHolder"
.end annotation


# instance fields
.field ivExample:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902a3
    .end annotation
.end field

.field tvMessage:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090548
    .end annotation
.end field

.field tvTitle:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090587
    .end annotation
.end field


# direct methods
.method protected constructor <init>()V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;-><init>()V

    return-void
.end method

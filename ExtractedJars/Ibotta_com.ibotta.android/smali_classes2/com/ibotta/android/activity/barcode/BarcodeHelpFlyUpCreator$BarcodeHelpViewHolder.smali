.class Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;
.super Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;
.source "BarcodeHelpFlyUpCreator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "BarcodeHelpViewHolder"
.end annotation


# instance fields
.field private bSubmit:Landroid/widget/Button;

.field private etBarcode:Landroid/widget/EditText;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 159
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$1;)V
    .locals 0

    .line 159
    invoke-direct {p0}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;)Landroid/widget/EditText;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;->etBarcode:Landroid/widget/EditText;

    return-object p0
.end method

.method static synthetic access$102(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;Landroid/widget/EditText;)Landroid/widget/EditText;
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;->etBarcode:Landroid/widget/EditText;

    return-object p1
.end method

.method static synthetic access$200(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;)Landroid/widget/Button;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;->bSubmit:Landroid/widget/Button;

    return-object p0
.end method

.method static synthetic access$202(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;Landroid/widget/Button;)Landroid/widget/Button;
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpViewHolder;->bSubmit:Landroid/widget/Button;

    return-object p1
.end method

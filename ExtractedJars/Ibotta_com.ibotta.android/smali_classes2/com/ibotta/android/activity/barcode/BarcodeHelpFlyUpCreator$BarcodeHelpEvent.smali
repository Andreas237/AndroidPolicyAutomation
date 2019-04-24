.class public Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpEvent;
.super Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;
.source "BarcodeHelpFlyUpCreator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BarcodeHelpEvent"
.end annotation


# instance fields
.field private barcode:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 150
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;-><init>()V

    .line 151
    iput-object p1, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpEvent;->barcode:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getBarcode()Ljava/lang/String;
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpEvent;->barcode:Ljava/lang/String;

    return-object v0
.end method

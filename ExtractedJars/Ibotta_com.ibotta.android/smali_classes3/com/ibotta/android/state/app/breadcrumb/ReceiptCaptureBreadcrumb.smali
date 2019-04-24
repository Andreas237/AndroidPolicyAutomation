.class public Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;
.super Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;
.source "ReceiptCaptureBreadcrumb.java"


# static fields
.field public static BREADCRUMB_RECEIPT_CAPTURE:Ljava/lang/String; = "receipt_capture"

.field private static KEY_PICTURE_COUNT:Ljava/lang/String; = "picture_count"

.field private static KEY_RETAILER_ID:Ljava/lang/String; = "retailer_id"

.field private static KEY_WINDFALL:Ljava/lang/String; = "windfall"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;-><init>()V

    .line 19
    sget-object v0, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->BREADCRUMB_RECEIPT_CAPTURE:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->setName(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getPictureCount()Ljava/lang/Integer;
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 44
    sget-object v0, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->KEY_PICTURE_COUNT:Ljava/lang/String;

    const-class v1, Ljava/lang/Integer;

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->getExtra(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 24
    sget-object v0, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->KEY_RETAILER_ID:Ljava/lang/String;

    const-class v1, Ljava/lang/Integer;

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->getExtra(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public isWindfall()Ljava/lang/Boolean;
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 34
    sget-object v0, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->KEY_WINDFALL:Ljava/lang/String;

    const-class v1, Ljava/lang/Boolean;

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->getExtra(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    return-object v0
.end method

.method public setPictureCount(I)V
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    .line 49
    sget-object v0, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->KEY_PICTURE_COUNT:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->putExtra(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setRetailerId(I)V
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    .line 29
    sget-object v0, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->KEY_RETAILER_ID:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->putExtra(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setWindfall(Z)V
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    .line 39
    sget-object v0, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->KEY_WINDFALL:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->putExtra(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

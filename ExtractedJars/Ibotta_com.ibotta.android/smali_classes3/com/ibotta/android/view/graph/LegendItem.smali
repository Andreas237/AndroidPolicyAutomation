.class public Lcom/ibotta/android/view/graph/LegendItem;
.super Ljava/lang/Object;
.source "LegendItem.java"


# instance fields
.field private colorId:I

.field private label:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getColorId()I
    .locals 1

    .line 11
    iget v0, p0, Lcom/ibotta/android/view/graph/LegendItem;->colorId:I

    return v0
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/view/graph/LegendItem;->label:Ljava/lang/String;

    return-object v0
.end method

.method public setColorId(I)V
    .locals 0

    .line 15
    iput p1, p0, Lcom/ibotta/android/view/graph/LegendItem;->colorId:I

    return-void
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/view/graph/LegendItem;->label:Ljava/lang/String;

    return-void
.end method

.class public Lcom/ibotta/android/view/graph/DataPoint;
.super Ljava/lang/Object;
.source "DataPoint.java"


# instance fields
.field private label:Ljava/lang/String;

.field private value:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getLabel()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/view/graph/DataPoint;->label:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()F
    .locals 1

    .line 13
    iget v0, p0, Lcom/ibotta/android/view/graph/DataPoint;->value:F

    return v0
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/view/graph/DataPoint;->label:Ljava/lang/String;

    return-void
.end method

.method public setValue(F)V
    .locals 0

    .line 17
    iput p1, p0, Lcom/ibotta/android/view/graph/DataPoint;->value:F

    return-void
.end method

.class public abstract Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;
.super Ljava/lang/Object;
.source "BitmapDimensions.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(II)Lcom/ibotta/android/util/pipeline/bitmap/BitmapDimensions;
    .locals 1

    .line 11
    new-instance v0, Lcom/ibotta/android/util/pipeline/bitmap/AutoValue_BitmapDimensions;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/util/pipeline/bitmap/AutoValue_BitmapDimensions;-><init>(II)V

    return-object v0
.end method


# virtual methods
.method public abstract getHeight()I
.end method

.method public abstract getWidth()I
.end method

.class public interface abstract Lcom/shopkick/app/logging/IUserEventListView;
.super Ljava/lang/Object;
.source "IUserEventListView.java"


# static fields
.field public static final HORIZONTAL:I = 0x1

.field public static final PERCENT_VISIBLE_FOR_IMPRESSION:F = 0.7f

.field public static final VERTICAL:I


# virtual methods
.method public abstract getChildAtDataIndex(I)Landroid/view/View;
.end method

.method public abstract getChildCount()I
.end method

.method public abstract getDirection()I
.end method

.method public abstract getDisplayPositionWithinParent()Ljava/lang/Integer;
.end method

.method public abstract getFirstVisiblePosition()I
.end method

.method public abstract getHeight()I
.end method

.method public abstract getWidth()I
.end method

.method public abstract isIndexActive(I)Z
.end method

.method public abstract resetActiveViewMarking()V
.end method

.method public abstract setDisableActiveViewMarking(Z)V
.end method

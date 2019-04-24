.class public Lcom/ibotta/android/mvp/ui/view/debug/feature/DebugFeatureVariantSpinnerAdapter$VariantViewHolder;
.super Lcom/ibotta/android/commons/view/list/ViewHolder;
.source "DebugFeatureVariantSpinnerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/debug/feature/DebugFeatureVariantSpinnerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "VariantViewHolder"
.end annotation


# instance fields
.field protected tvName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054d
    .end annotation
.end field


# direct methods
.method protected constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/ibotta/android/commons/view/list/ViewHolder;-><init>()V

    return-void
.end method

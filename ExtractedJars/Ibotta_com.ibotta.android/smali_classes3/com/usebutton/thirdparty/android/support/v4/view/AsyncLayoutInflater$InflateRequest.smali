.class Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;
.super Ljava/lang/Object;
.source "AsyncLayoutInflater.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "InflateRequest"
.end annotation


# instance fields
.field callback:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$OnInflateFinishedListener;

.field inflater:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;

.field parent:Landroid/view/ViewGroup;

.field resid:I

.field view:Landroid/view/View;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$1;)V
    .locals 0

    .line 112
    invoke-direct {p0}, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;-><init>()V

    return-void
.end method

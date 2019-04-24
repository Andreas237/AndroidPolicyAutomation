.class public abstract Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;
.super Ljava/lang/Object;
.source "EarningDetailParcel.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;
.end method

.method public abstract earningId(I)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;
.end method

.method public abstract earningType(I)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;
.end method

.class public abstract Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;
.super Ljava/lang/Object;
.source "EarningDetailParcel.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;,
        Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$EarningType;
    }
.end annotation


# static fields
.field public static final EMPTY:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 17
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->builder()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;

    move-result-object v0

    const/4 v1, -0x1

    .line 18
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;->earningId(I)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;

    move-result-object v0

    .line 19
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;->earningType(I)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;

    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;
    .locals 1

    .line 34
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel$Builder;-><init>()V

    return-object v0
.end method

.method public static fromBuyableGiftCardNotification(Lcom/ibotta/android/notification/model/Notification;)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;
    .locals 2

    if-nez p0, :cond_0

    .line 59
    sget-object p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    return-object p0

    .line 62
    :cond_0
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->builder()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 63
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;->earningType(I)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;

    move-result-object v0

    .line 64
    invoke-virtual {p0}, Lcom/ibotta/android/notification/model/Notification;->getDisplayId()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;->earningId(I)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;

    move-result-object p0

    .line 65
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    move-result-object p0

    return-object p0
.end method

.method public static fromEarning(Lcom/ibotta/api/model/earnings/Earning;)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;
    .locals 2

    if-nez p0, :cond_0

    .line 41
    sget-object p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    return-object p0

    .line 44
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/api/model/earnings/Earning;->getEarningTypeEnum()Lcom/ibotta/api/model/earnings/Earning$Type;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/earnings/Earning$Type;->RECEIPT:Lcom/ibotta/api/model/earnings/Earning$Type;

    if-ne v0, v1, :cond_1

    .line 45
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->builder()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;

    move-result-object v0

    const/4 v1, 0x1

    .line 46
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;->earningType(I)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;

    move-result-object v0

    .line 47
    invoke-virtual {p0}, Lcom/ibotta/api/model/earnings/Earning;->getId()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;->earningId(I)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;

    move-result-object p0

    .line 48
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    move-result-object p0

    return-object p0

    .line 50
    :cond_1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->builder()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 51
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;->earningType(I)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;

    move-result-object v0

    .line 52
    invoke-virtual {p0}, Lcom/ibotta/api/model/earnings/Earning;->getId()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;->earningId(I)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;

    move-result-object p0

    .line 53
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    move-result-object p0

    return-object p0
.end method

.method public static fromReceiptNotification(I)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;
    .locals 2

    .line 69
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->builder()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;

    move-result-object v0

    const/4 v1, 0x1

    .line 70
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;->earningType(I)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;

    move-result-object v0

    .line 71
    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;->earningId(I)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;

    move-result-object p0

    .line 72
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract getEarningId()I
.end method

.method public abstract getEarningType()I
.end method

.method public abstract toBuilder()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;
.end method

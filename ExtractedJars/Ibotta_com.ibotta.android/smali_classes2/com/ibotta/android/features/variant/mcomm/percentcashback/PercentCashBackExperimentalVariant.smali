.class public Lcom/ibotta/android/features/variant/mcomm/percentcashback/PercentCashBackExperimentalVariant;
.super Ljava/lang/Object;
.source "PercentCashBackExperimentalVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/ExperimentalVariant;
.implements Lcom/ibotta/android/features/variant/mcomm/percentcashback/PercentCashBackVariant;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCashBackText()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public shouldDisplayCashBack()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.class public Lcom/ibotta/android/mvp/ui/activity/im/ImDisclaimerHelper;
.super Ljava/lang/Object;
.source "ImDisclaimerHelper.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getDisclaimerText(Lcom/ibotta/android/util/AppHelper;ZLjava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p1, :cond_0

    const p1, 0x7f110373

    const/4 v0, 0x1

    .line 9
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-interface {p0, p1, v0}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string p0, ""

    :goto_0
    return-object p0
.end method

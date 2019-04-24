.class final enum Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType$1;
.super Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
.source "NavButtonType.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4010
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;IIZ)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    .line 23
    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;-><init>(Ljava/lang/String;IIZLcom/ibotta/android/mvp/ui/view/nav/NavButtonType$1;)V

    return-void
.end method


# virtual methods
.method public getIconResId(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/fragment/retailer/RetailerParcel;ZZ)I
    .locals 2

    const v0, 0x7f08029e

    if-eqz p2, :cond_3

    .line 33
    invoke-virtual {p2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v1

    invoke-static {p1, v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->access$100(Lcom/ibotta/android/state/app/config/AppConfig;I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 35
    :cond_0
    invoke-static {p2, p3}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->access$200(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    const v0, 0x7f080287

    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object p1

    sget-object p2, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-ne p1, p2, :cond_2

    const v0, 0x7f080241

    goto :goto_0

    :cond_2
    if-eqz p4, :cond_3

    const v0, 0x7f080224

    :cond_3
    :goto_0
    return v0
.end method

.method public getLabelResId(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/fragment/retailer/RetailerParcel;ZZ)I
    .locals 2

    const v0, 0x7f11043d

    if-nez p2, :cond_0

    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {p2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v1

    invoke-static {p1, v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->access$100(Lcom/ibotta/android/state/app/config/AppConfig;I)Z

    move-result p1

    if-eqz p1, :cond_1

    const v0, 0x7f110440

    goto :goto_0

    .line 60
    :cond_1
    invoke-static {p2, p3}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->access$200(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Z)Z

    move-result p1

    if-eqz p1, :cond_2

    const v0, 0x7f11043f

    goto :goto_0

    .line 62
    :cond_2
    invoke-virtual {p2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object p1

    sget-object p2, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-ne p1, p2, :cond_3

    const v0, 0x7f11043e

    goto :goto_0

    :cond_3
    if-eqz p4, :cond_4

    const v0, 0x7f110515

    :cond_4
    :goto_0
    return v0
.end method

.class public final enum Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;
.super Ljava/lang/Enum;
.source "VerifyWizardPageType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

.field public static final enum SCAN:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

.field public static final enum YES_NO:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 11
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    const-string v1, "YES_NO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;->YES_NO:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    .line 12
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    const-string v1, "SCAN"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;->SCAN:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    const/4 v0, 0x2

    .line 10
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;->YES_NO:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;->SCAN:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 22
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object p0, v0

    :goto_0
    if-nez p0, :cond_1

    move-object p0, v0

    :cond_1
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;
    .locals 1

    .line 10
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;
    .locals 1

    .line 10
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    return-object v0
.end method

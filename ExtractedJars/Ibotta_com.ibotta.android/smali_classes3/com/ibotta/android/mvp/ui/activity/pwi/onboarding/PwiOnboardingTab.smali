.class public final enum Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;
.super Ljava/lang/Enum;
.source "PwiOnboardingTab.java"

# interfaces
.implements Lcom/ibotta/android/view/common/TabSelectorView$TabOption;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;",
        ">;",
        "Lcom/ibotta/android/view/common/TabSelectorView$TabOption;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;

.field public static final enum GET_STARTED:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;

.field public static final enum HOW_IT_WORKS:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;

.field public static final enum INTRO:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 6
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;

    const-string v1, "INTRO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;->INTRO:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;

    .line 7
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;

    const-string v1, "HOW_IT_WORKS"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;->HOW_IT_WORKS:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;

    .line 8
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;

    const-string v1, "GET_STARTED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;->GET_STARTED:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;

    const/4 v0, 0x3

    .line 5
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;->INTRO:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;->HOW_IT_WORKS:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;->GET_STARTED:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 5
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;
    .locals 1

    .line 5
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;
    .locals 1

    .line 5
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingTab;

    return-object v0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.class public final enum Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;
.super Ljava/lang/Enum;
.source "PersonalStoreMode.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

.field public static final enum APP:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

.field public static final enum CPG:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;


# instance fields
.field private final buttonLabelResId:I

.field private final promptTextResId:I

.field private final titleTextResId:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 12
    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    const-string v1, "CPG"

    const/4 v2, 0x0

    const v3, 0x7f1104b6

    const v4, 0x7f1104b5

    const v5, 0x7f1104b4

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;-><init>(Ljava/lang/String;IIII)V

    sput-object v6, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->CPG:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    .line 16
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    const-string v8, "APP"

    const/4 v9, 0x1

    const v10, 0x7f1104b3

    const v11, 0x7f1104b2

    const v12, 0x7f1104b1

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->APP:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    const/4 v0, 0x2

    .line 11
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->CPG:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->APP:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 26
    iput p3, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->titleTextResId:I

    .line 27
    iput p4, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->promptTextResId:I

    .line 28
    iput p5, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->buttonLabelResId:I

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;
    .locals 0

    .line 59
    :try_start_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 61
    :catch_0
    sget-object p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->CPG:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;
    .locals 1

    .line 11
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;
    .locals 1

    .line 11
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    return-object v0
.end method


# virtual methods
.method public getButtonLabelResId()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->buttonLabelResId:I

    return v0
.end method

.method public getConfigForType(Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsV5Config;)Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;
    .locals 1

    .line 46
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->CPG:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    if-ne p0, v0, :cond_0

    .line 47
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsV5Config;->getStores()Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;

    move-result-object p1

    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsV5Config;->getMcomm()Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public getPromptTextResId()I
    .locals 1

    .line 36
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->promptTextResId:I

    return v0
.end method

.method public getTitleTextResId()I
    .locals 1

    .line 32
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->titleTextResId:I

    return v0
.end method

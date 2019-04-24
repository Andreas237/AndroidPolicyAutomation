.class final enum Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;
.super Ljava/lang/Enum;
.source "FirstUseGenderAndBirthdayScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "SelectedGender"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

.field public static final enum FEMALE:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

.field public static final enum MALE:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

.field public static final enum NOT_SELECTED:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

.field public static final enum NOT_SPECIFY:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 75
    new-instance v0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    const-string v1, "FEMALE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->FEMALE:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    .line 76
    new-instance v0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    const-string v1, "MALE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->MALE:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    .line 77
    new-instance v0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    const-string v1, "NOT_SPECIFY"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->NOT_SPECIFY:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    .line 78
    new-instance v0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    const-string v1, "NOT_SELECTED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->NOT_SELECTED:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    const/4 v0, 0x4

    .line 74
    new-array v0, v0, [Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    sget-object v1, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->FEMALE:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->MALE:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->NOT_SPECIFY:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->NOT_SELECTED:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    aput-object v1, v0, v5

    sput-object v0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->$VALUES:[Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 74
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;
    .locals 1

    .line 74
    const-class v0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;
    .locals 1

    .line 74
    sget-object v0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->$VALUES:[Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    invoke-virtual {v0}, [Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    return-object v0
.end method

.class synthetic Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$1;
.super Ljava/lang/Object;
.source "FirstUseGenderAndBirthdayScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$shopkick$app$launch$FirstUseGenderAndBirthdayScreen$SelectedGender:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 429
    invoke-static {}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->values()[Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$1;->$SwitchMap$com$shopkick$app$launch$FirstUseGenderAndBirthdayScreen$SelectedGender:[I

    :try_start_0
    sget-object v0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$1;->$SwitchMap$com$shopkick$app$launch$FirstUseGenderAndBirthdayScreen$SelectedGender:[I

    sget-object v1, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->MALE:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    invoke-virtual {v1}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$1;->$SwitchMap$com$shopkick$app$launch$FirstUseGenderAndBirthdayScreen$SelectedGender:[I

    sget-object v1, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->FEMALE:Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;

    invoke-virtual {v1}, Lcom/shopkick/app/launch/FirstUseGenderAndBirthdayScreen$SelectedGender;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method

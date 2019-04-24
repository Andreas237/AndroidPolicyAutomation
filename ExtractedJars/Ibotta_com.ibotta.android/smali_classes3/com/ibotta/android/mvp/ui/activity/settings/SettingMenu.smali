.class public final enum Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;
.super Ljava/lang/Enum;
.source "SettingMenu.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

.field public static final enum ABOUT:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

.field public static final enum ACCOUNT:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

.field public static final enum CONNECTED_ACCOUNTS:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

.field public static final enum DEBUG_MENU:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

.field public static final enum END_USER_LICENSE_AGREEMENT:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

.field public static final enum PREFERENCES:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

.field public static final enum PRIVACY_POLICY:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

.field public static final enum TERMS_OF_USE:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

.field public static final enum THIRD_PARTY_ACKNOWLEDGEMENTS:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

.field public static final enum UPDATE_PROFILE:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

.field public static final enum VERIFY_DEVICE:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;


# instance fields
.field private final nameResId:I


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 10
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    const-string v1, "ACCOUNT"

    const/4 v2, 0x0

    const v3, 0x7f1105d3

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->ACCOUNT:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    .line 11
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    const-string v1, "UPDATE_PROFILE"

    const/4 v3, 0x1

    const v4, 0x7f1105cf

    invoke-direct {v0, v1, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->UPDATE_PROFILE:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    .line 12
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    const-string v1, "CONNECTED_ACCOUNTS"

    const/4 v4, 0x2

    const v5, 0x7f1105c8

    invoke-direct {v0, v1, v4, v5}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->CONNECTED_ACCOUNTS:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    .line 13
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    const-string v1, "PREFERENCES"

    const/4 v5, 0x3

    const v6, 0x7f1105cb

    invoke-direct {v0, v1, v5, v6}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->PREFERENCES:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    .line 14
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    const-string v1, "VERIFY_DEVICE"

    const/4 v6, 0x4

    const v7, 0x7f1105d0

    invoke-direct {v0, v1, v6, v7}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->VERIFY_DEVICE:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    .line 15
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    const-string v1, "DEBUG_MENU"

    const/4 v7, 0x5

    const v8, 0x7f1105c9

    invoke-direct {v0, v1, v7, v8}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->DEBUG_MENU:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    .line 17
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    const-string v1, "ABOUT"

    const/4 v8, 0x6

    const v9, 0x7f1105d2

    invoke-direct {v0, v1, v8, v9}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->ABOUT:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    .line 18
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    const-string v1, "PRIVACY_POLICY"

    const/4 v9, 0x7

    const v10, 0x7f1105cc

    invoke-direct {v0, v1, v9, v10}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->PRIVACY_POLICY:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    .line 19
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    const-string v1, "TERMS_OF_USE"

    const/16 v10, 0x8

    const v11, 0x7f1105ce

    invoke-direct {v0, v1, v10, v11}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->TERMS_OF_USE:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    .line 20
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    const-string v1, "END_USER_LICENSE_AGREEMENT"

    const/16 v11, 0x9

    const v12, 0x7f1105ca

    invoke-direct {v0, v1, v11, v12}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->END_USER_LICENSE_AGREEMENT:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    .line 21
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    const-string v1, "THIRD_PARTY_ACKNOWLEDGEMENTS"

    const/16 v12, 0xa

    const v13, 0x7f1105cd

    invoke-direct {v0, v1, v12, v13}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->THIRD_PARTY_ACKNOWLEDGEMENTS:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    const/16 v0, 0xb

    .line 9
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->ACCOUNT:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->UPDATE_PROFILE:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->CONNECTED_ACCOUNTS:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->PREFERENCES:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->VERIFY_DEVICE:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->DEBUG_MENU:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->ABOUT:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->PRIVACY_POLICY:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->TERMS_OF_USE:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    aput-object v1, v0, v10

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->END_USER_LICENSE_AGREEMENT:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    aput-object v1, v0, v11

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->THIRD_PARTY_ACKNOWLEDGEMENTS:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    aput-object v1, v0, v12

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 26
    iput p3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->nameResId:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;
    .locals 1

    .line 9
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;
    .locals 1

    .line 9
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    return-object v0
.end method


# virtual methods
.method public getNameResId()I
    .locals 1

    .line 30
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->nameResId:I

    return v0
.end method

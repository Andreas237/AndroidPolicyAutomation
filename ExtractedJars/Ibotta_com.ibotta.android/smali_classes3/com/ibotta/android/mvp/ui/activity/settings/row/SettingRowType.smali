.class public final enum Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;
.super Ljava/lang/Enum;
.source "SettingRowType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

.field public static final enum FOOTER:Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

.field public static final enum HEADER:Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

.field public static final enum MENU:Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 8
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    const-string v1, "HEADER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;->HEADER:Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    .line 9
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    const-string v1, "MENU"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;->MENU:Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    .line 10
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    const-string v1, "FOOTER"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;->FOOTER:Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    const/4 v0, 0x3

    .line 7
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;->HEADER:Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;->MENU:Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;->FOOTER:Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;
    .locals 1

    .line 7
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;
    .locals 1

    .line 7
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/activity/settings/row/SettingRowType;

    return-object v0
.end method

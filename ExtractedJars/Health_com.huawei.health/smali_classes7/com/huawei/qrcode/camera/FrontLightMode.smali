.class public final enum Lcom/huawei/qrcode/camera/FrontLightMode;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/qrcode/camera/FrontLightMode;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/huawei/qrcode/camera/FrontLightMode;

.field public static final enum AUTO:Lcom/huawei/qrcode/camera/FrontLightMode;

.field public static final enum OFF:Lcom/huawei/qrcode/camera/FrontLightMode;

.field public static final enum ON:Lcom/huawei/qrcode/camera/FrontLightMode;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/huawei/qrcode/camera/FrontLightMode;

    const-string v1, "ON"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/qrcode/camera/FrontLightMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/qrcode/camera/FrontLightMode;->ON:Lcom/huawei/qrcode/camera/FrontLightMode;

    new-instance v0, Lcom/huawei/qrcode/camera/FrontLightMode;

    const-string v1, "AUTO"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/qrcode/camera/FrontLightMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/qrcode/camera/FrontLightMode;->AUTO:Lcom/huawei/qrcode/camera/FrontLightMode;

    new-instance v0, Lcom/huawei/qrcode/camera/FrontLightMode;

    const-string v1, "OFF"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/qrcode/camera/FrontLightMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/qrcode/camera/FrontLightMode;->OFF:Lcom/huawei/qrcode/camera/FrontLightMode;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/huawei/qrcode/camera/FrontLightMode;

    sget-object v1, Lcom/huawei/qrcode/camera/FrontLightMode;->ON:Lcom/huawei/qrcode/camera/FrontLightMode;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/qrcode/camera/FrontLightMode;->AUTO:Lcom/huawei/qrcode/camera/FrontLightMode;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/qrcode/camera/FrontLightMode;->OFF:Lcom/huawei/qrcode/camera/FrontLightMode;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/qrcode/camera/FrontLightMode;->$VALUES:[Lcom/huawei/qrcode/camera/FrontLightMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static parse(Ljava/lang/String;)Lcom/huawei/qrcode/camera/FrontLightMode;
    .locals 1

    if-nez p0, :cond_0

    sget-object v0, Lcom/huawei/qrcode/camera/FrontLightMode;->OFF:Lcom/huawei/qrcode/camera/FrontLightMode;

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/huawei/qrcode/camera/FrontLightMode;->valueOf(Ljava/lang/String;)Lcom/huawei/qrcode/camera/FrontLightMode;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static readPref(Landroid/content/SharedPreferences;)Lcom/huawei/qrcode/camera/FrontLightMode;
    .locals 2

    const-string v0, "preferences_front_light_mode"

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/qrcode/camera/FrontLightMode;->parse(Ljava/lang/String;)Lcom/huawei/qrcode/camera/FrontLightMode;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/qrcode/camera/FrontLightMode;
    .locals 1

    const-class v0, Lcom/huawei/qrcode/camera/FrontLightMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/qrcode/camera/FrontLightMode;

    return-object v0
.end method

.method public static values()[Lcom/huawei/qrcode/camera/FrontLightMode;
    .locals 1

    sget-object v0, Lcom/huawei/qrcode/camera/FrontLightMode;->$VALUES:[Lcom/huawei/qrcode/camera/FrontLightMode;

    invoke-virtual {v0}, [Lcom/huawei/qrcode/camera/FrontLightMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/qrcode/camera/FrontLightMode;

    return-object v0
.end method

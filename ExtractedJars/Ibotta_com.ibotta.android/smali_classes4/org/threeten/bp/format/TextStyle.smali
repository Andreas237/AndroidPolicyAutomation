.class public final enum Lorg/threeten/bp/format/TextStyle;
.super Ljava/lang/Enum;
.source "TextStyle.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/threeten/bp/format/TextStyle;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/threeten/bp/format/TextStyle;

.field public static final enum FULL:Lorg/threeten/bp/format/TextStyle;

.field public static final enum FULL_STANDALONE:Lorg/threeten/bp/format/TextStyle;

.field public static final enum NARROW:Lorg/threeten/bp/format/TextStyle;

.field public static final enum NARROW_STANDALONE:Lorg/threeten/bp/format/TextStyle;

.field public static final enum SHORT:Lorg/threeten/bp/format/TextStyle;

.field public static final enum SHORT_STANDALONE:Lorg/threeten/bp/format/TextStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 61
    new-instance v0, Lorg/threeten/bp/format/TextStyle;

    const-string v1, "FULL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/threeten/bp/format/TextStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/threeten/bp/format/TextStyle;->FULL:Lorg/threeten/bp/format/TextStyle;

    .line 66
    new-instance v0, Lorg/threeten/bp/format/TextStyle;

    const-string v1, "FULL_STANDALONE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lorg/threeten/bp/format/TextStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/threeten/bp/format/TextStyle;->FULL_STANDALONE:Lorg/threeten/bp/format/TextStyle;

    .line 71
    new-instance v0, Lorg/threeten/bp/format/TextStyle;

    const-string v1, "SHORT"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lorg/threeten/bp/format/TextStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/threeten/bp/format/TextStyle;->SHORT:Lorg/threeten/bp/format/TextStyle;

    .line 76
    new-instance v0, Lorg/threeten/bp/format/TextStyle;

    const-string v1, "SHORT_STANDALONE"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lorg/threeten/bp/format/TextStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/threeten/bp/format/TextStyle;->SHORT_STANDALONE:Lorg/threeten/bp/format/TextStyle;

    .line 81
    new-instance v0, Lorg/threeten/bp/format/TextStyle;

    const-string v1, "NARROW"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lorg/threeten/bp/format/TextStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/threeten/bp/format/TextStyle;->NARROW:Lorg/threeten/bp/format/TextStyle;

    .line 86
    new-instance v0, Lorg/threeten/bp/format/TextStyle;

    const-string v1, "NARROW_STANDALONE"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lorg/threeten/bp/format/TextStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/threeten/bp/format/TextStyle;->NARROW_STANDALONE:Lorg/threeten/bp/format/TextStyle;

    const/4 v0, 0x6

    .line 54
    new-array v0, v0, [Lorg/threeten/bp/format/TextStyle;

    sget-object v1, Lorg/threeten/bp/format/TextStyle;->FULL:Lorg/threeten/bp/format/TextStyle;

    aput-object v1, v0, v2

    sget-object v1, Lorg/threeten/bp/format/TextStyle;->FULL_STANDALONE:Lorg/threeten/bp/format/TextStyle;

    aput-object v1, v0, v3

    sget-object v1, Lorg/threeten/bp/format/TextStyle;->SHORT:Lorg/threeten/bp/format/TextStyle;

    aput-object v1, v0, v4

    sget-object v1, Lorg/threeten/bp/format/TextStyle;->SHORT_STANDALONE:Lorg/threeten/bp/format/TextStyle;

    aput-object v1, v0, v5

    sget-object v1, Lorg/threeten/bp/format/TextStyle;->NARROW:Lorg/threeten/bp/format/TextStyle;

    aput-object v1, v0, v6

    sget-object v1, Lorg/threeten/bp/format/TextStyle;->NARROW_STANDALONE:Lorg/threeten/bp/format/TextStyle;

    aput-object v1, v0, v7

    sput-object v0, Lorg/threeten/bp/format/TextStyle;->$VALUES:[Lorg/threeten/bp/format/TextStyle;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 54
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/threeten/bp/format/TextStyle;
    .locals 1

    .line 54
    const-class v0, Lorg/threeten/bp/format/TextStyle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/threeten/bp/format/TextStyle;

    return-object p0
.end method

.method public static values()[Lorg/threeten/bp/format/TextStyle;
    .locals 1

    .line 54
    sget-object v0, Lorg/threeten/bp/format/TextStyle;->$VALUES:[Lorg/threeten/bp/format/TextStyle;

    invoke-virtual {v0}, [Lorg/threeten/bp/format/TextStyle;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/threeten/bp/format/TextStyle;

    return-object v0
.end method

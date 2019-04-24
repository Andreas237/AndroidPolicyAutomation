.class public final enum Lorg/jdom2/output/Format$TextMode;
.super Ljava/lang/Enum;
.source "Format.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/output/Format;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TextMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/jdom2/output/Format$TextMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jdom2/output/Format$TextMode;

.field public static final enum NORMALIZE:Lorg/jdom2/output/Format$TextMode;

.field public static final enum PRESERVE:Lorg/jdom2/output/Format$TextMode;

.field public static final enum TRIM:Lorg/jdom2/output/Format$TextMode;

.field public static final enum TRIM_FULL_WHITE:Lorg/jdom2/output/Format$TextMode;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1020
    new-instance v0, Lorg/jdom2/output/Format$TextMode;

    const-string v1, "PRESERVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jdom2/output/Format$TextMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jdom2/output/Format$TextMode;->PRESERVE:Lorg/jdom2/output/Format$TextMode;

    .line 1025
    new-instance v0, Lorg/jdom2/output/Format$TextMode;

    const-string v1, "TRIM"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lorg/jdom2/output/Format$TextMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jdom2/output/Format$TextMode;->TRIM:Lorg/jdom2/output/Format$TextMode;

    .line 1032
    new-instance v0, Lorg/jdom2/output/Format$TextMode;

    const-string v1, "NORMALIZE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lorg/jdom2/output/Format$TextMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jdom2/output/Format$TextMode;->NORMALIZE:Lorg/jdom2/output/Format$TextMode;

    .line 1038
    new-instance v0, Lorg/jdom2/output/Format$TextMode;

    const-string v1, "TRIM_FULL_WHITE"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lorg/jdom2/output/Format$TextMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jdom2/output/Format$TextMode;->TRIM_FULL_WHITE:Lorg/jdom2/output/Format$TextMode;

    const/4 v0, 0x4

    .line 1016
    new-array v0, v0, [Lorg/jdom2/output/Format$TextMode;

    sget-object v1, Lorg/jdom2/output/Format$TextMode;->PRESERVE:Lorg/jdom2/output/Format$TextMode;

    aput-object v1, v0, v2

    sget-object v1, Lorg/jdom2/output/Format$TextMode;->TRIM:Lorg/jdom2/output/Format$TextMode;

    aput-object v1, v0, v3

    sget-object v1, Lorg/jdom2/output/Format$TextMode;->NORMALIZE:Lorg/jdom2/output/Format$TextMode;

    aput-object v1, v0, v4

    sget-object v1, Lorg/jdom2/output/Format$TextMode;->TRIM_FULL_WHITE:Lorg/jdom2/output/Format$TextMode;

    aput-object v1, v0, v5

    sput-object v0, Lorg/jdom2/output/Format$TextMode;->$VALUES:[Lorg/jdom2/output/Format$TextMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1016
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jdom2/output/Format$TextMode;
    .locals 1

    .line 1016
    const-class v0, Lorg/jdom2/output/Format$TextMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/jdom2/output/Format$TextMode;

    return-object p0
.end method

.method public static values()[Lorg/jdom2/output/Format$TextMode;
    .locals 1

    .line 1016
    sget-object v0, Lorg/jdom2/output/Format$TextMode;->$VALUES:[Lorg/jdom2/output/Format$TextMode;

    invoke-virtual {v0}, [Lorg/jdom2/output/Format$TextMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jdom2/output/Format$TextMode;

    return-object v0
.end method

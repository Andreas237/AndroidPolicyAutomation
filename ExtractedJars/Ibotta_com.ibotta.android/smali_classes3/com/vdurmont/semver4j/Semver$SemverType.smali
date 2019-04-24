.class public final enum Lcom/vdurmont/semver4j/Semver$SemverType;
.super Ljava/lang/Enum;
.source "Semver.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/vdurmont/semver4j/Semver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SemverType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/vdurmont/semver4j/Semver$SemverType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/vdurmont/semver4j/Semver$SemverType;

.field public static final enum COCOAPODS:Lcom/vdurmont/semver4j/Semver$SemverType;

.field public static final enum IVY:Lcom/vdurmont/semver4j/Semver$SemverType;

.field public static final enum LOOSE:Lcom/vdurmont/semver4j/Semver$SemverType;

.field public static final enum NPM:Lcom/vdurmont/semver4j/Semver$SemverType;

.field public static final enum STRICT:Lcom/vdurmont/semver4j/Semver$SemverType;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 590
    new-instance v0, Lcom/vdurmont/semver4j/Semver$SemverType;

    const-string v1, "STRICT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/vdurmont/semver4j/Semver$SemverType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/vdurmont/semver4j/Semver$SemverType;->STRICT:Lcom/vdurmont/semver4j/Semver$SemverType;

    .line 596
    new-instance v0, Lcom/vdurmont/semver4j/Semver$SemverType;

    const-string v1, "LOOSE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/vdurmont/semver4j/Semver$SemverType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/vdurmont/semver4j/Semver$SemverType;->LOOSE:Lcom/vdurmont/semver4j/Semver$SemverType;

    .line 603
    new-instance v0, Lcom/vdurmont/semver4j/Semver$SemverType;

    const-string v1, "NPM"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/vdurmont/semver4j/Semver$SemverType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/vdurmont/semver4j/Semver$SemverType;->NPM:Lcom/vdurmont/semver4j/Semver$SemverType;

    .line 610
    new-instance v0, Lcom/vdurmont/semver4j/Semver$SemverType;

    const-string v1, "COCOAPODS"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/vdurmont/semver4j/Semver$SemverType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/vdurmont/semver4j/Semver$SemverType;->COCOAPODS:Lcom/vdurmont/semver4j/Semver$SemverType;

    .line 617
    new-instance v0, Lcom/vdurmont/semver4j/Semver$SemverType;

    const-string v1, "IVY"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/vdurmont/semver4j/Semver$SemverType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/vdurmont/semver4j/Semver$SemverType;->IVY:Lcom/vdurmont/semver4j/Semver$SemverType;

    const/4 v0, 0x5

    .line 584
    new-array v0, v0, [Lcom/vdurmont/semver4j/Semver$SemverType;

    sget-object v1, Lcom/vdurmont/semver4j/Semver$SemverType;->STRICT:Lcom/vdurmont/semver4j/Semver$SemverType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/vdurmont/semver4j/Semver$SemverType;->LOOSE:Lcom/vdurmont/semver4j/Semver$SemverType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/vdurmont/semver4j/Semver$SemverType;->NPM:Lcom/vdurmont/semver4j/Semver$SemverType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/vdurmont/semver4j/Semver$SemverType;->COCOAPODS:Lcom/vdurmont/semver4j/Semver$SemverType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/vdurmont/semver4j/Semver$SemverType;->IVY:Lcom/vdurmont/semver4j/Semver$SemverType;

    aput-object v1, v0, v6

    sput-object v0, Lcom/vdurmont/semver4j/Semver$SemverType;->$VALUES:[Lcom/vdurmont/semver4j/Semver$SemverType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 584
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/vdurmont/semver4j/Semver$SemverType;
    .locals 1

    .line 584
    const-class v0, Lcom/vdurmont/semver4j/Semver$SemverType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/vdurmont/semver4j/Semver$SemverType;

    return-object p0
.end method

.method public static values()[Lcom/vdurmont/semver4j/Semver$SemverType;
    .locals 1

    .line 584
    sget-object v0, Lcom/vdurmont/semver4j/Semver$SemverType;->$VALUES:[Lcom/vdurmont/semver4j/Semver$SemverType;

    invoke-virtual {v0}, [Lcom/vdurmont/semver4j/Semver$SemverType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/vdurmont/semver4j/Semver$SemverType;

    return-object v0
.end method

.class public final enum Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;
.super Ljava/lang/Enum;
.source "GeoUtilities.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/utilities/GeoUtilities;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CircleRelationship"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

.field public static final enum AContainsB:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

.field public static final enum BContainsA:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

.field public static final enum Equal:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

.field public static final enum NoOverlap:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

.field public static final enum Overlap:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 25
    new-instance v0, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    const-string v1, "NoOverlap"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->NoOverlap:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    .line 27
    new-instance v0, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    const-string v1, "Overlap"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->Overlap:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    .line 29
    new-instance v0, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    const-string v1, "AContainsB"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->AContainsB:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    .line 31
    new-instance v0, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    const-string v1, "BContainsA"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->BContainsA:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    .line 33
    new-instance v0, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    const-string v1, "Equal"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->Equal:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    const/4 v0, 0x5

    .line 23
    new-array v0, v0, [Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    sget-object v1, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->NoOverlap:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->Overlap:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->AContainsB:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->BContainsA:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    aput-object v1, v0, v5

    sget-object v1, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->Equal:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    aput-object v1, v0, v6

    sput-object v0, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->$VALUES:[Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 23
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;
    .locals 1

    .line 23
    const-class v0, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;
    .locals 1

    .line 23
    sget-object v0, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->$VALUES:[Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    invoke-virtual {v0}, [Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    return-object v0
.end method

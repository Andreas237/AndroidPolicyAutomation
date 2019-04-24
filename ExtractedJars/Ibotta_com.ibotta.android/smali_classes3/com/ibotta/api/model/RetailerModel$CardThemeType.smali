.class public final enum Lcom/ibotta/api/model/RetailerModel$CardThemeType;
.super Ljava/lang/Enum;
.source "RetailerModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/RetailerModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CardThemeType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/RetailerModel$CardThemeType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/RetailerModel$CardThemeType;

.field public static final enum BLACK:Lcom/ibotta/api/model/RetailerModel$CardThemeType;

.field public static final enum WHITE:Lcom/ibotta/api/model/RetailerModel$CardThemeType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 68
    new-instance v0, Lcom/ibotta/api/model/RetailerModel$CardThemeType;

    const-string v1, "WHITE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/RetailerModel$CardThemeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/RetailerModel$CardThemeType;->WHITE:Lcom/ibotta/api/model/RetailerModel$CardThemeType;

    new-instance v0, Lcom/ibotta/api/model/RetailerModel$CardThemeType;

    const-string v1, "BLACK"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/RetailerModel$CardThemeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/RetailerModel$CardThemeType;->BLACK:Lcom/ibotta/api/model/RetailerModel$CardThemeType;

    const/4 v0, 0x2

    .line 67
    new-array v0, v0, [Lcom/ibotta/api/model/RetailerModel$CardThemeType;

    sget-object v1, Lcom/ibotta/api/model/RetailerModel$CardThemeType;->WHITE:Lcom/ibotta/api/model/RetailerModel$CardThemeType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/RetailerModel$CardThemeType;->BLACK:Lcom/ibotta/api/model/RetailerModel$CardThemeType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/api/model/RetailerModel$CardThemeType;->$VALUES:[Lcom/ibotta/api/model/RetailerModel$CardThemeType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 67
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$CardThemeType;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 77
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/RetailerModel$CardThemeType;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$CardThemeType;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$CardThemeType;
    .locals 1

    .line 67
    const-class v0, Lcom/ibotta/api/model/RetailerModel$CardThemeType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/RetailerModel$CardThemeType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/RetailerModel$CardThemeType;
    .locals 1

    .line 67
    sget-object v0, Lcom/ibotta/api/model/RetailerModel$CardThemeType;->$VALUES:[Lcom/ibotta/api/model/RetailerModel$CardThemeType;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/RetailerModel$CardThemeType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/RetailerModel$CardThemeType;

    return-object v0
.end method

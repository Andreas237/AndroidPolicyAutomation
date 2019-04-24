.class public final enum Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;
.super Ljava/lang/Enum;
.source "HorizontalSurveyTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SurveyState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

.field public static final enum COMPLETED:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

.field public static final enum ERROR:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

.field public static final enum PENDING:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

.field public static final enum READY:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 44
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    const-string v1, "READY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->READY:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    .line 45
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    const-string v1, "PENDING"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->PENDING:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    .line 46
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    const-string v1, "COMPLETED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->COMPLETED:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    .line 47
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    const-string v1, "ERROR"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->ERROR:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    const/4 v0, 0x4

    .line 43
    new-array v0, v0, [Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    sget-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->READY:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->PENDING:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->COMPLETED:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->ERROR:Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    aput-object v1, v0, v5

    sput-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->$VALUES:[Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 43
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;
    .locals 1

    .line 43
    const-class v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;
    .locals 1

    .line 43
    sget-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->$VALUES:[Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    invoke-virtual {v0}, [Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSurveyTileViewHolderConfigurator$SurveyState;

    return-object v0
.end method

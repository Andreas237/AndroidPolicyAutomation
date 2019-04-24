.class public final enum Lcom/ibotta/api/model/QuestModel$Type;
.super Ljava/lang/Enum;
.source "QuestModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/QuestModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/QuestModel$Type;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/QuestModel$Type;

.field public static final enum BONUS_DETAIL:Lcom/ibotta/api/model/QuestModel$Type;

.field public static final enum INVITE:Lcom/ibotta/api/model/QuestModel$Type;

.field public static final enum MCOMM:Lcom/ibotta/api/model/QuestModel$Type;

.field public static final enum NO_OP:Lcom/ibotta/api/model/QuestModel$Type;

.field public static final enum PENDING_WELCOME:Lcom/ibotta/api/model/QuestModel$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 10
    new-instance v0, Lcom/ibotta/api/model/QuestModel$Type;

    const-string v1, "INVITE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/QuestModel$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/QuestModel$Type;->INVITE:Lcom/ibotta/api/model/QuestModel$Type;

    .line 11
    new-instance v0, Lcom/ibotta/api/model/QuestModel$Type;

    const-string v1, "MCOMM"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/QuestModel$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/QuestModel$Type;->MCOMM:Lcom/ibotta/api/model/QuestModel$Type;

    .line 12
    new-instance v0, Lcom/ibotta/api/model/QuestModel$Type;

    const-string v1, "PENDING_WELCOME"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/QuestModel$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/QuestModel$Type;->PENDING_WELCOME:Lcom/ibotta/api/model/QuestModel$Type;

    .line 13
    new-instance v0, Lcom/ibotta/api/model/QuestModel$Type;

    const-string v1, "BONUS_DETAIL"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/api/model/QuestModel$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/QuestModel$Type;->BONUS_DETAIL:Lcom/ibotta/api/model/QuestModel$Type;

    .line 14
    new-instance v0, Lcom/ibotta/api/model/QuestModel$Type;

    const-string v1, "NO_OP"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/api/model/QuestModel$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/QuestModel$Type;->NO_OP:Lcom/ibotta/api/model/QuestModel$Type;

    const/4 v0, 0x5

    .line 9
    new-array v0, v0, [Lcom/ibotta/api/model/QuestModel$Type;

    sget-object v1, Lcom/ibotta/api/model/QuestModel$Type;->INVITE:Lcom/ibotta/api/model/QuestModel$Type;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/QuestModel$Type;->MCOMM:Lcom/ibotta/api/model/QuestModel$Type;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/QuestModel$Type;->PENDING_WELCOME:Lcom/ibotta/api/model/QuestModel$Type;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/QuestModel$Type;->BONUS_DETAIL:Lcom/ibotta/api/model/QuestModel$Type;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/model/QuestModel$Type;->NO_OP:Lcom/ibotta/api/model/QuestModel$Type;

    aput-object v1, v0, v6

    sput-object v0, Lcom/ibotta/api/model/QuestModel$Type;->$VALUES:[Lcom/ibotta/api/model/QuestModel$Type;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 9
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/QuestModel$Type;
    .locals 1

    .line 17
    sget-object v0, Lcom/ibotta/api/model/QuestModel$Type;->NO_OP:Lcom/ibotta/api/model/QuestModel$Type;

    .line 19
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/QuestModel$Type;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/QuestModel$Type;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/QuestModel$Type;
    .locals 1

    .line 9
    const-class v0, Lcom/ibotta/api/model/QuestModel$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/QuestModel$Type;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/QuestModel$Type;
    .locals 1

    .line 9
    sget-object v0, Lcom/ibotta/api/model/QuestModel$Type;->$VALUES:[Lcom/ibotta/api/model/QuestModel$Type;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/QuestModel$Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/QuestModel$Type;

    return-object v0
.end method

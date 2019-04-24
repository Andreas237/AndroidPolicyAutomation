.class public final enum Lcom/ibotta/api/model/QuestModel$State;
.super Ljava/lang/Enum;
.source "QuestModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/QuestModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/QuestModel$State;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/QuestModel$State;

.field public static final enum COMPLETED:Lcom/ibotta/api/model/QuestModel$State;

.field public static final enum CONFIRMED_PENDING:Lcom/ibotta/api/model/QuestModel$State;

.field public static final enum NO_OP:Lcom/ibotta/api/model/QuestModel$State;

.field public static final enum PENDING:Lcom/ibotta/api/model/QuestModel$State;

.field public static final enum STARTED:Lcom/ibotta/api/model/QuestModel$State;

.field public static final enum UNKNOWN:Lcom/ibotta/api/model/QuestModel$State;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 28
    new-instance v0, Lcom/ibotta/api/model/QuestModel$State;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/QuestModel$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/QuestModel$State;->UNKNOWN:Lcom/ibotta/api/model/QuestModel$State;

    .line 29
    new-instance v0, Lcom/ibotta/api/model/QuestModel$State;

    const-string v1, "STARTED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/QuestModel$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/QuestModel$State;->STARTED:Lcom/ibotta/api/model/QuestModel$State;

    .line 30
    new-instance v0, Lcom/ibotta/api/model/QuestModel$State;

    const-string v1, "PENDING"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/QuestModel$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/QuestModel$State;->PENDING:Lcom/ibotta/api/model/QuestModel$State;

    .line 31
    new-instance v0, Lcom/ibotta/api/model/QuestModel$State;

    const-string v1, "CONFIRMED_PENDING"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/api/model/QuestModel$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/QuestModel$State;->CONFIRMED_PENDING:Lcom/ibotta/api/model/QuestModel$State;

    .line 32
    new-instance v0, Lcom/ibotta/api/model/QuestModel$State;

    const-string v1, "COMPLETED"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/api/model/QuestModel$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/QuestModel$State;->COMPLETED:Lcom/ibotta/api/model/QuestModel$State;

    .line 33
    new-instance v0, Lcom/ibotta/api/model/QuestModel$State;

    const-string v1, "NO_OP"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/ibotta/api/model/QuestModel$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/QuestModel$State;->NO_OP:Lcom/ibotta/api/model/QuestModel$State;

    const/4 v0, 0x6

    .line 27
    new-array v0, v0, [Lcom/ibotta/api/model/QuestModel$State;

    sget-object v1, Lcom/ibotta/api/model/QuestModel$State;->UNKNOWN:Lcom/ibotta/api/model/QuestModel$State;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/QuestModel$State;->STARTED:Lcom/ibotta/api/model/QuestModel$State;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/QuestModel$State;->PENDING:Lcom/ibotta/api/model/QuestModel$State;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/QuestModel$State;->CONFIRMED_PENDING:Lcom/ibotta/api/model/QuestModel$State;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/model/QuestModel$State;->COMPLETED:Lcom/ibotta/api/model/QuestModel$State;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/api/model/QuestModel$State;->NO_OP:Lcom/ibotta/api/model/QuestModel$State;

    aput-object v1, v0, v7

    sput-object v0, Lcom/ibotta/api/model/QuestModel$State;->$VALUES:[Lcom/ibotta/api/model/QuestModel$State;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 27
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/QuestModel$State;
    .locals 1

    .line 36
    sget-object v0, Lcom/ibotta/api/model/QuestModel$State;->NO_OP:Lcom/ibotta/api/model/QuestModel$State;

    .line 38
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/QuestModel$State;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/QuestModel$State;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/QuestModel$State;
    .locals 1

    .line 27
    const-class v0, Lcom/ibotta/api/model/QuestModel$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/QuestModel$State;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/QuestModel$State;
    .locals 1

    .line 27
    sget-object v0, Lcom/ibotta/api/model/QuestModel$State;->$VALUES:[Lcom/ibotta/api/model/QuestModel$State;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/QuestModel$State;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/QuestModel$State;

    return-object v0
.end method
